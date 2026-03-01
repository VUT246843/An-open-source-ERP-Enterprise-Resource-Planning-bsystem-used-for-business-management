        return isExpressionTrue(enabledWhen, this);
 * Copyright (C) 2010-2025 DBeaver Corp and others
        return icon;
import org.jkiss.dbeaver.Log;
    public DBDashboardProvider getInstance() {
/**
import org.jkiss.utils.CommonUtils;
    public DBPImage getIcon() {
    }
    private final String label;
        return instance;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }

        this.description = config.getAttribute("description");
    @NotNull
 * DBeaver - Universal Database Manager

 *
    public DashboardProviderDescriptor(IConfigurationElement config) {
import org.eclipse.core.expressions.Expression;
import org.jkiss.dbeaver.model.dashboard.DBDashboardProvider;

        return supportsCustomDashboards;
 * limitations under the License.
 *
    private final String id;
 */


import org.jkiss.dbeaver.model.impl.AbstractContextDescriptor;
            } catch (Exception e) {
package org.jkiss.dbeaver.model.dashboard.registry;
import org.jkiss.code.Nullable;

        return description;
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
        return getName();
    }
    public String getDefaultRenderer() {
    public String getId() {
        this.label = config.getAttribute("label");
        return databaseRequired;
        this.supportsCustomDashboards = CommonUtils.toBoolean(config.getAttribute("supportsCustomization"));
            DBDashboardDataType.class,

    public String getDescription() {
                throw new IllegalStateException("Cannot instantiate dashboard provider '" + id + "'", e);
        if (instance == null) {
    }
 *
        this.dataType = CommonUtils.valueOf(
import org.eclipse.core.runtime.IConfigurationElement;
    private final String defaultRenderer;
 * See the License for the specific language governing permissions and
            try {

        return dataType;
/*
        return implType;
    public String toString() {

    private final String description;
    public boolean isDatabaseRequired() {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.dbeaver.model.dashboard.DashboardConstants;
    }
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.DBPNamedObject;
        this.defaultRenderer = CommonUtils.toString(config.getAttribute("defaultRenderer"));
    private final Expression enabledWhen;
        this.databaseRequired = CommonUtils.toBoolean(config.getAttribute("databaseRequired"));
        );
        this.enabledWhen = getEnablementExpression(config);
        super(config);
public class DashboardProviderDescriptor extends AbstractContextDescriptor implements DBPNamedObject {
    public String getLabel() {
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
    private final boolean supportsFolders;
        return defaultRenderer;

    public ObjectType getImplType() {
        return getLabel();

    public boolean isSupportsCustomDashboards() {
    @Override
 * you may not use this file except in compliance with the License.
    }
    private static final Log log = Log.getLog(DashboardProviderDescriptor.class);
    private final ObjectType implType;
            config.getAttribute("dataType"),
    }
 * DashboardProviderDescriptor

    }


import org.jkiss.dbeaver.model.DBPImage;
        }
    }
    private DBDashboardProvider instance;
    public boolean isEnabled() {
        this.implType = new ObjectType(config.getAttribute("class"));
        this.icon = iconToImage(config.getAttribute("icon"));
    private final DBPImage icon;
                instance = implType.createInstance(DBDashboardProvider.class);
    private final boolean supportsCustomDashboards;
            DashboardConstants.DEF_DASHBOARD_DATA_TYPE
    public String getName() {
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.DBPObject;

    private final boolean databaseRequired;
    }
    }
        return supportsFolders;
        return label;
    }
    public DBDashboardDataType getDataType() {

import org.jkiss.dbeaver.model.dashboard.DBDashboardDataType;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,

}
        return id;
    @Override
        this.supportsFolders = CommonUtils.toBoolean(config.getAttribute("supportsFolders"));
    @Override
    }
    }

        this.id = config.getAttribute("id");
        return object instanceof DBPDataSourceContainer ds && getInstance().appliesTo(ds) && isExpressionTrue(enabledWhen, object);
    private final DBDashboardDataType dataType;
            }
    public boolean isSupportsFolders() {
    @NotNull

    public boolean appliesTo(@NotNull DBPObject object, @Nullable Object context) {
