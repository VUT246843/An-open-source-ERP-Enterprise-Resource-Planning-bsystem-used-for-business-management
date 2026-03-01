    public boolean equals(@Nullable Object o) {

    }
    private final boolean isPredefined;
            USER_DEFINED_DESCRIPTOR_ID_PREFIX + label,
    public String getName() {
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return isPredefined == that.isPredefined && isVisible == that.isVisible && id.equals(that.id) && label.equals(that.label) && layersDefinition.equals(that.layersDefinition);
        return id;
        super(GISViewerActivator.PLUGIN_ID);
            true
import org.jkiss.code.Nullable;
    public LeafletTilesDescriptor withFlippedVisibility() {
        return Objects.hash(id, label, layersDefinition, isPredefined, isVisible);

    private final String id;
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
 */
    }
            true,
        return isPredefined;
/*
        return id;

 * limitations under the License.

 * you may not use this file except in compliance with the License.
            label,

 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.id = id.trim();
        );
    private LeafletTilesDescriptor(@NotNull String id, @NotNull String label, @NotNull String layersDefinition, boolean isPredefined, boolean isVisible) {
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
    public String getLayersDefinition() {
        return isVisible;
import org.jkiss.code.NotNull;
    private final String layersDefinition;
    }
            isVisible
        this.isPredefined = isPredefined;



        if (o == null || getClass() != o.getClass()) return false;
        this.layersDefinition = layersDefinition.trim();
            config.getAttribute(RegistryConstants.ATTR_LABEL),
    @Override
    public int hashCode() {
    private final String label;
        LeafletTilesDescriptor that = (LeafletTilesDescriptor) o;
    public boolean isVisible() {
        return label;
    @Override
 * DBeaver - Universal Database Manager
    }
    }
import java.util.Objects;
    }

import org.jkiss.dbeaver.registry.RegistryConstants;
 * Unless required by applicable law or agreed to in writing, software
        );
        this.label = label.trim();
            config.getAttribute(RegistryConstants.ATTR_ID),
    public String getId() {
package org.jkiss.dbeaver.ui.gis.registry;
    }

    }
        return new LeafletTilesDescriptor(id, label, layersDefinition, isPredefined, !isVisible);


        return layersDefinition;

            config.getAttribute("layersDefinition"),
        return new LeafletTilesDescriptor(
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.data.gis.leaflet.tiles"; //$NON-NLS-1$
 * See the License for the specific language governing permissions and
}
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
 *

public final class LeafletTilesDescriptor extends AbstractDescriptor implements DBPNamedObject  {
 *
    }
    private final boolean isVisible;
    static LeafletTilesDescriptor createPredefined(@NotNull IConfigurationElement config) {
        return new LeafletTilesDescriptor(
    }
import org.eclipse.core.runtime.IConfigurationElement;
    }
            false,
import org.jkiss.dbeaver.model.DBPNamedObject;
    public boolean isPredefined() {
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.isVisible = isVisible;
    public String getLabel() {
    @Override

        if (this == o) return true;
            layersDefinition,
import org.jkiss.dbeaver.ui.gis.internal.GISViewerActivator;
    private static final String USER_DEFINED_DESCRIPTOR_ID_PREFIX = EXTENSION_ID + ".userDefinedTiles.";
    public static LeafletTilesDescriptor createUserDefined(@NotNull String label, @NotNull String layersDefinition, boolean isVisible) {

