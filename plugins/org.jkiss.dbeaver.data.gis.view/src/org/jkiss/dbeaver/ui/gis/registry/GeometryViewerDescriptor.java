import org.jkiss.dbeaver.registry.RegistryConstants;
        return supportsInline;
 * you may not use this file except in compliance with the License.
        if (!supportedDataSources.isEmpty()) {
/*
    GeometryViewerDescriptor(IConfigurationElement config) {

            throw new DBException("Error instantiating geometry viewer", e);
        return id;
        }
    private static final Log log = Log.getLog(GeometryViewerDescriptor.class);

 * Unless required by applicable law or agreed to in writing, software
        return description;
        for (IConfigurationElement dsElement : config.getChildren("datasource")) {
        this.description = config.getAttribute(RegistryConstants.ATTR_DESCRIPTION);


}
 *
 *
import org.jkiss.dbeaver.model.DBPImage;
    }

    public String getDescription() {
    public boolean supportsInlineView() {
 *
package org.jkiss.dbeaver.ui.gis.registry;
 *     http://www.apache.org/licenses/LICENSE-2.0
    private final String id;
    private boolean supportsInline;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.supportsInline = CommonUtils.getBoolean(config.getAttribute("supportsInline"), false);
        this.type = new ObjectType(config.getAttribute(RegistryConstants.ATTR_CLASS));

    public IGeometryViewer createGeometryViewer(IValueController valueController) throws DBException {
                return false;
        this.label = config.getAttribute(RegistryConstants.ATTR_LABEL);

        return true;
        return label;
import java.util.List;

 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.Log;
 */
    public String getLabel() {

    public boolean supportedBy(DBPDataSource dataSource) {
            String dsId = dsElement.getAttribute("id");
 * You may obtain a copy of the License at
    private final ObjectType type;
        return icon;
 * limitations under the License.
        try {
 * See the License for the specific language governing permissions and
    }
    private final String description;
import org.jkiss.dbeaver.model.DBPDataSource;
    }
            return (IGeometryViewer) type.getImplClass().getConstructor(IValueController.class).newInstance(valueController);
            if (dataSource == null) {
        }
import java.util.ArrayList;
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.ui.gis.IGeometryViewer;
            }

import org.jkiss.utils.CommonUtils;
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.data.gis.geometryViewer"; //$NON-NLS-1$


import org.eclipse.core.runtime.IConfigurationElement;
    public String getId() {
    }

                supportedDataSources.add(dsId);
    private final List<String> supportedDataSources = new ArrayList<>();
            if (dsId != null) {
                return false;
        } catch (Throwable e) {
public class GeometryViewerDescriptor extends AbstractDescriptor {
        super(config);
    private final DBPImage icon;
            if (!supportedDataSources.contains(dataSource.getContainer().getDriver().getProviderId())) {
    }
        this.icon = iconToImage(config.getAttribute(RegistryConstants.ATTR_ICON));

    }
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
        }

    }
    public DBPImage getIcon() {
    }
import org.jkiss.dbeaver.ui.data.IValueController;
    private final String label;
        this.id = config.getAttribute(RegistryConstants.ATTR_ID);
            }
