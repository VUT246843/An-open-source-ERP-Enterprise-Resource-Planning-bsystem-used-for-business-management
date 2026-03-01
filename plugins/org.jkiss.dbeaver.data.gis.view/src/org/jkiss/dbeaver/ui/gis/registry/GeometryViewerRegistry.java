 *
import org.jkiss.dbeaver.utils.GeneralUtils;
    public List<LeafletTilesDescriptor> getPredefinedLeafletTiles() {
                autoAssignDefaultLeafletTiles();
                instance.autoAssignDefaultLeafletTiles();
            log.error("Error reading " + GeometryViewerRegistry.class.getName() + " configuration", e);
                    return null;
import org.eclipse.core.runtime.IConfigurationElement;
            String preference = defaultLeafletTiles == null ? "" : defaultLeafletTiles.getId();
package org.jkiss.dbeaver.ui.gis.registry;
                .saveConfigurationFile(GEOMETRY_REGISTRY_CONFIG_XML, out.getBuffer().toString());
import java.io.IOException;
        try {
    public List<LeafletTilesDescriptor> getUserDefinedLeafletTiles() {

        try {
                            break;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
        }
    private final Object tilesLock = new Object();
import org.jkiss.utils.xml.SAXListener;
        }
                            final String layersDefinitionText = getDefinitionText();
    @Nullable
/*
        @NotNull Collection<LeafletTilesDescriptor> userDefinedTiles
                    }
                    .filter(tile -> tile.getId().equals(defTilesId))
            }

import org.eclipse.core.runtime.IExtensionRegistry;
                        // Read from CDATA
}
            userDefinedTiles.addAll(userDefinedDescriptors);
                            lastId = attributes.getValue(KEY_ID);
                        return buffer.toString();
                        case KEY_USER_DEFINED_TILES:
                        }
                            continue;
                                CommonUtils.getBoolean(lastVisibility, true)
import java.io.StringWriter;

            return defaultLeafletTiles;
                    }
        }
                }
                            if (CommonUtils.isNotEmpty(lastId)) {
                @Nullable
                defaultLeafletTiles = Stream.concat(predefinedTiles.stream(), userDefinedTiles.stream())
        }
 * Licensed under the Apache License, Version 2.0 (the "License");

        }
                }

import org.jkiss.utils.CommonUtils;
    }
            if (!CommonUtils.isEmpty(defTilesId)) {
import org.jkiss.utils.xml.XMLBuilder;
 * You may obtain a copy of the License at
                        case KEY_NON_VISIBLE_PREDEFINED_TILES:
 * you may not use this file except in compliance with the License.
                            // ignore
                        }
            return Collections.unmodifiableList(predefinedTiles);
                                log.debug("Malformed user-defined tiles descriptor, skipping");
            log.warn("The user has no permission to save geometry tiles configuration");
        if (instance == null) {
    ) throws DBException {
                    if (lastDefinition != null) {
    private static final String KEY_NON_VISIBLE_PREDEFINED_TILES = "notVisiblePredefinedTiles";
            xmlBuilder.flush();
    private static void populateFromConfig(
        synchronized (tilesLock) {
            Collection<String> notVisiblePredefinedTilesIds = new HashSet<>();
import org.jkiss.code.Nullable;


                            xmlBuilder.addAttribute(KEY_ID, descriptor.getId());
    }


            for (IConfigurationElement ext : extElements) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            log.error("Error saving " + GeometryViewerRegistry.class.getName() + " configuration");
                    .orElse(null);
import org.jkiss.dbeaver.DBException;
    @Nullable

    @NotNull
        synchronized (tilesLock) {
                }
                    for (LeafletTilesDescriptor descriptor : userDefinedTiles) {
                            if (CommonUtils.isEmpty(lastId) || CommonUtils.isEmpty(lastLabel) || CommonUtils.isEmpty(layersDefinitionText)) {
    public LeafletTilesDescriptor getDefaultLeafletTiles() {
                        default:

                            lastDefinition = attributes.getValue(KEY_LAYERS_DEF);
                        }

        } catch (Throwable e) {
    private static final String KEY_ROOT = "config";
                                lastLabel.trim(),
            GISViewerActivator.getDefault().getPreferences().save();
                            lastVisibility = attributes.getValue(KEY_IS_VISIBLE);
            
    }
        }
                .findFirst();
    public void updateTiles(@NotNull Collection<LeafletTilesDescriptor> predefinedDescriptors, @NotNull Collection<LeafletTilesDescriptor> userDefinedDescriptors) {
                    }
                            xmlBuilder.addAttribute(KEY_LABEL, descriptor.getLabel());
            }
                private String lastDefinition;
 *
import org.jkiss.dbeaver.ui.gis.GeometryViewerConstants;
                                notVisiblePredefinedTilesIds.add(lastId.trim());
import org.jkiss.code.NotNull;
                private String getDefinitionText() {

                    if (buffer.length() > 0) {
import org.eclipse.core.runtime.Platform;
                            xmlBuilder.addAttribute(KEY_IS_VISIBLE, descriptor.isVisible());
    }
                            lastLabel = attributes.getValue(KEY_LABEL);

 * distributed under the License is distributed on an "AS IS" BASIS,
    private static final Log log = Log.getLog(GeometryViewerRegistry.class);
    }
        } catch (Throwable e) {
    private void setDefaultLeafletTilesNonSynchronized(@Nullable LeafletTilesDescriptor defaultLeafletTiles) {
                predefinedTiles.add(descriptor);
                .filter(LeafletTilesDescriptor::isVisible)
                public void saxEndElement(@NotNull SAXReader reader, @Nullable String namespaceURI, @NotNull String localName) {
                                return;
                            ));
import java.io.StringReader;
            log.error(e);

 * See the License for the specific language governing permissions and
                        return lastDefinition;
            populateFromConfig(notVisiblePredefinedTilesIds, userDefinedTiles);
                GeometryViewerDescriptor type = new GeometryViewerDescriptor(ext);
                            }
    @NotNull
    private final Map<String, GeometryViewerDescriptor> viewers = new HashMap<>();

            setDefaultLeafletTilesNonSynchronized(defaultLeafletTiles);
import org.jkiss.dbeaver.model.rm.RMConstants;
    }
            }
import java.util.stream.Collectors;

                            xmlBuilder.addAttribute(KEY_ID, descriptor.getId());
    public static synchronized GeometryViewerRegistry getInstance() {
                @Override
        if (!DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_CONFIGURATION_MANAGER)) {
    private static final String KEY_LABEL = "label";
            }
    private void flushConfig() {
    }
            for (IConfigurationElement ext : extElements) {
        }
                private String lastLabel;
                                layersDefinitionText,
            }
import java.util.*;
    }

            return Collections.unmodifiableList(userDefinedTiles);
    public void setDefaultLeafletTiles(@Nullable LeafletTilesDescriptor defaultLeafletTiles) {
            try (var ignored = xmlBuilder.startElement(KEY_ROOT)) {
                    switch (localName) {

            String defTilesId = GISViewerActivator.getDefault().getPreferences().getString(GeometryViewerConstants.PREF_DEFAULT_LEAFLET_TILES);
                        try (XMLBuilder.Element ignored2 = xmlBuilder.startElement(KEY_NON_VISIBLE_PREDEFINED_TILES)) {
        }
    private static final String KEY_USER_DEFINED_TILES = "userDefinedTiles";
                    buffer.append(data);
    }
            }
            out.flush();
                            break;
        Optional<LeafletTilesDescriptor> opt = Stream.concat(predefinedTiles.stream(), userDefinedTiles.stream())
                private String lastVisibility;
            IConfigurationElement[] extElements = registry.getConfigurationElementsFor(GeometryViewerDescriptor.EXTENSION_ID);
            SAXReader saxReader = new SAXReader(in);
                private String lastId;
            XMLBuilder xmlBuilder = new XMLBuilder(out, GeneralUtils.UTF8_ENCODING);
    @Nullable
            this.defaultLeafletTiles = defaultLeafletTiles;
    private static final String KEY_ID = "id";
        if (CommonUtils.isEmpty(content)) {
                private final StringBuilder buffer = new StringBuilder();
                            break;
        try (StringReader in = new StringReader(content)) {
        @NotNull Collection<String> notVisiblePredefinedTilesIds,

            if (defaultLeafletTiles == null || (!predefinedTiles.contains(defaultLeafletTiles) && !userDefinedTiles.contains(defaultLeafletTiles))) {
                            xmlBuilder.addTextData(descriptor.getLayersDefinition());
public class GeometryViewerRegistry {
                            userDefinedTiles.add(LeafletTilesDescriptor.createUserDefined(

            saxReader.parse(new SAXListener.BaseListener() {
                        // Backward compatibility
                LeafletTilesDescriptor descriptor = LeafletTilesDescriptor.createPredefined(ext);
                            break;
            predefinedTiles.addAll(predefinedDescriptors);
        }
    public GeometryViewerDescriptor getViewer(@Nullable String id) {
                try (XMLBuilder.Element ignored1 = xmlBuilder.startElement("notVisiblePredefinedTilesList")) {
                    }
                @Override
        try (StringWriter out = new StringWriter()) {
    @NotNull
    private GeometryViewerRegistry(@NotNull IExtensionRegistry registry) {
                @Override
import org.jkiss.dbeaver.Log;

    }
            });
                    descriptor = descriptor.withFlippedVisibility();
 * limitations under the License.
        } catch (IOException e) {
        return instance;
 */
                    buffer.setLength(0);
    private final List<LeafletTilesDescriptor> predefinedTiles = new ArrayList<>();
        }
                    switch (localName) {

                            break;
        } catch (XMLException | IOException e) {
                    }
            xmlBuilder.setBeautify(true);
import org.jkiss.dbeaver.ui.gis.internal.GISViewerActivator;
    private static final String KEY_LAYERS_DEF = "layersDefinition";
        String content = DBWorkbench.getPlatform().getProductConfigurationController().loadConfigurationFile(GEOMETRY_REGISTRY_CONFIG_XML);
    public List<GeometryViewerDescriptor> getSupportedViewers(@NotNull DBPDataSource dataSource) {

            log.error("Error initializing registry", e);
            DBWorkbench.getPlatform().getProductConfigurationController()
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
    }
import java.util.stream.Stream;
            flushConfig();
            userDefinedTiles.clear();
            return;
        setDefaultLeafletTilesNonSynchronized(opt.orElse(null));
            return;
                }
                            break;
        }
            predefinedTiles.clear();
                        case KEY_NON_VISIBLE_PREDEFINED_TILES:
                viewers.put(type.getId(), type);
                    .findAny()
                    }
                        if (descriptor.isVisible()) {
        return viewers.values().stream().filter(v -> v.supportedBy(dataSource)).collect(Collectors.toList());
import org.jkiss.utils.xml.XMLException;
                if (notVisiblePredefinedTilesIds.contains(descriptor.getId())) {
    private LeafletTilesDescriptor defaultLeafletTiles;
        synchronized (tilesLock) {
 * DBeaver - Universal Database Manager
                }
        synchronized (tilesLock) {
                            // ignore

    //viewers are read only, so it's ok to not synchronize access
                            }
    private static GeometryViewerRegistry instance;
                            lastId = attributes.getValue(KEY_ID);
    private static final String GEOMETRY_REGISTRY_CONFIG_XML = "geometry_registry_config.xml";
                }

    }
                try (var ignored1 = xmlBuilder.startElement("userDefinedTilesDefinitions")) {
                        case KEY_USER_DEFINED_TILES:
                        try (XMLBuilder.Element ignored2 = xmlBuilder.startElement(KEY_USER_DEFINED_TILES)) {
            if (instance.defaultLeafletTiles == null) {
        }
                public void saxText(@NotNull SAXReader reader, @NotNull String data) {
import org.jkiss.utils.xml.SAXReader;

            extElements = registry.getConfigurationElementsFor(LeafletTilesDescriptor.EXTENSION_ID);

        synchronized (tilesLock) {
import org.xml.sax.Attributes;
        return viewers.get(id);
                        default:
    }

    private void autoAssignDefaultLeafletTiles() {
import org.jkiss.dbeaver.model.DBPDataSource;
                }
    private static final String KEY_IS_VISIBLE = "isVisible";
import org.jkiss.dbeaver.runtime.DBWorkbench;
                public void saxStartElement(@NotNull SAXReader reader, @Nullable String namespaceURI, @NotNull String localName, @NotNull Attributes attributes) {
                    for (LeafletTilesDescriptor descriptor : predefinedTiles) {
            instance = new GeometryViewerRegistry(Platform.getExtensionRegistry());
            GISViewerActivator.getDefault().getPreferences().setValue(GeometryViewerConstants.PREF_DEFAULT_LEAFLET_TILES, preference);
    private final List<LeafletTilesDescriptor> userDefinedTiles = new ArrayList<>();
