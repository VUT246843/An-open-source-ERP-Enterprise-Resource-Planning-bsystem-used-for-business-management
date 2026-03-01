    }

 * Licensed under the Apache License, Version 2.0 (the "License");
        }
    @Override
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.dashboard.ui";

import org.jkiss.dbeaver.model.impl.AbstractContextDescriptor;
 * you may not use this file except in compliance with the License.
    @Override
        String[] dataTypeNames = CommonUtils.notEmpty(config.getAttribute("dataTypes")).split(",");
    DashboardRendererDescriptor(

 *
        return id;
    @NotNull
    }
        this.description = config.getAttribute("description");
 * You may obtain a copy of the License at
{
    private final String id;

    @Override

import org.jkiss.dbeaver.model.DBPImage;
        this.implType = new ObjectType(config.getAttribute("renderer"));
import org.jkiss.dbeaver.ui.IObjectPropertyConfigurator;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    private final ObjectType itemViewSettingsEditor;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.NotNull;

 *
    }
    {

        for (int i = 0; i < dataTypeNames.length; i++) {
    public IObjectPropertyConfigurator<DashboardItemConfiguration, DashboardItemConfiguration> createItemConfigurationEditor() throws DBException {
    private final boolean nativeRenderer;
        return description;
import org.jkiss.utils.CommonUtils;

import org.jkiss.dbeaver.ui.dashboard.model.DashboardRendererType;
import org.jkiss.dbeaver.model.dashboard.DBDashboardDataType;
        this.label = config.getAttribute("label");
        return implType.createInstance(DashboardItemRenderer.class);
        this.icon = iconToImage(config.getAttribute("icon"));
}
    }
    public DBPImage getIcon() {
    @NotNull

package org.jkiss.dbeaver.ui.dashboard.registry;
    {
        return label;
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return itemConfigurationEditor.createInstance(IObjectPropertyConfigurator.class);

 */
        return nativeRenderer;
 */
    public String getDescription()

public class DashboardRendererDescriptor extends AbstractContextDescriptor implements DashboardRendererType
        return id;
    }
    }
    private final ObjectType implType;
    @Override
        IConfigurationElement config)
    @Override
    }
            this.supportedDataTypes[i] = CommonUtils.valueOf(DBDashboardDataType.class, dataTypeNames[i], DBDashboardDataType.timeseries);
        super(config);
    }
    @Override
import org.eclipse.core.runtime.IConfigurationElement;
        this.id = config.getAttribute("id");
    public DashboardItemRenderer createRenderer() throws DBException {

    }
    public boolean isNativeRenderer() {
    private final DBPImage icon;
 *

    @Override
import org.jkiss.dbeaver.DBException;
        return itemViewSettingsEditor.createInstance(IObjectPropertyConfigurator.class);
        this.supportedDataTypes = new DBDashboardDataType[dataTypeNames.length];
    }
        return supportedDataTypes;
    public DBDashboardDataType[] getSupportedTypes() {
    private final ObjectType itemConfigurationEditor;
/**
    public IObjectPropertyConfigurator<DashboardItemViewSettings, DashboardItemViewSettings> createItemViewSettingsEditor() throws DBException {
        this.itemConfigurationEditor = new ObjectType(config.getAttribute("configurationEditor"));
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.itemViewSettingsEditor = new ObjectType(config.getAttribute("viewSettingsEditor"));
/*
    private final DBDashboardDataType[] supportedDataTypes;
import org.jkiss.dbeaver.ui.dashboard.model.DashboardItemRenderer;
import org.jkiss.dbeaver.model.dashboard.registry.DashboardItemConfiguration;
    public String getId() {

        return icon;
    public String toString() {
 * limitations under the License.

    private final String label;
    @Override
    {
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.dashboard.model.DashboardItemViewSettings;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DashboardDescriptor

 * See the License for the specific language governing permissions and
    private final String description;
    public String getTitle()
        this.nativeRenderer = CommonUtils.toBoolean(config.getAttribute("native"));
