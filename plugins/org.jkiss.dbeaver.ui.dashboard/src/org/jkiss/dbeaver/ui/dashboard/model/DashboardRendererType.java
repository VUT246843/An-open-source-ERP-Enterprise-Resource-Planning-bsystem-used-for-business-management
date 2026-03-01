

 * See the License for the specific language governing permissions and
 */
/*
}
package org.jkiss.dbeaver.ui.dashboard.model;


import org.jkiss.dbeaver.model.dashboard.registry.DashboardItemConfiguration;
import org.jkiss.dbeaver.ui.IObjectPropertyConfigurator;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,

 * Dashboard renderer type.
    DashboardItemRenderer createRenderer() throws DBException;
 * DBeaver - Universal Database Manager
 *
    IObjectPropertyConfigurator<?, DashboardItemConfiguration> createItemConfigurationEditor() throws DBException;
public interface DashboardRendererType {

 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.DBPImage;

    IObjectPropertyConfigurator<?, DashboardItemViewSettings> createItemViewSettingsEditor() throws DBException;
 *

/**
import org.jkiss.dbeaver.DBException;
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
import org.jkiss.dbeaver.model.dashboard.DBDashboardDataType;
    DBPImage getIcon();
 *
 * Unless required by applicable law or agreed to in writing, software
    DBDashboardDataType[] getSupportedTypes();
    String getId();
    String getDescription();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.

    String getTitle();
 * You may obtain a copy of the License at


