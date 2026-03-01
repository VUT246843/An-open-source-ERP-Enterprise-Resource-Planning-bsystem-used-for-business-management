    public String getDescription() {
        return priority;
        String providerId = dataSource.getContainer().getDriver().getProviderId();
        this.id = config.getAttribute("id");
        }
        }
 */
 * you may not use this file except in compliance with the License.
                String dsId = dsElement.getAttribute("id");
        this.label = config.getAttribute("label");
        super(config);
    public SQLPlanViewProvider createInstance() throws DBException {
    }
import org.jkiss.dbeaver.DBException;

                }
        for (String dsId : supportedDataSources) {

        String driverId = dataSource.getContainer().getDriver().getId();
            if (dsId.equals(driverId) || dsId.equals(providerId)) {
                if (!CommonUtils.isEmpty(dsId)) {
        this.implClass = new ObjectType(config.getAttribute("class"));
        this.priority = CommonUtils.toInt(config.getAttribute("priority"));


 */
            return true;
        this.supportedDataSources = getSupportedDataSources(config);
import java.util.ArrayList;
 * You may obtain a copy of the License at
                return true;
        }
import org.jkiss.utils.CommonUtils;
    public boolean isDataSourceSpecific() {

import org.eclipse.core.runtime.IConfigurationElement;
/**
    }
    }
            for (IConfigurationElement dsElement : children) {
    }
        return id;
    }
 * DBeaver - Universal Database Manager
        return description;
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.ui.editors.sql.plan.registry;
        return false;


        return implClass.createInstance(SQLPlanViewProvider.class);
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.code.Nullable;
    private List<String> supportedDataSources = new ArrayList<>();
    private final String id;

        return icon;
        List<String> result = new ArrayList<>();
    private final int priority;
import org.jkiss.dbeaver.model.DBPDataSource;
        if (children != null) {
 * See the License for the specific language governing permissions and

 * Unless required by applicable law or agreed to in writing, software
    private final ObjectType implClass;
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
        return !supportedDataSources.isEmpty();


    }
import org.jkiss.dbeaver.model.DBPImage;
    public String toString() {

import org.jkiss.dbeaver.model.impl.AbstractContextDescriptor;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");

    public DBPImage getIcon() {
    }
        this.description = config.getAttribute("description");

    public String getLabel() {
        this.icon = iconToImage(config.getAttribute("icon"));

    @Override
            }

        return id;
    }
    private final DBPImage icon;
import org.jkiss.dbeaver.ui.editors.sql.SQLPlanViewProvider;
    private final String label;


 *
                    result.add(dsId);
    public int getPriority() {
    }


 * SQLPlanViewDescriptor
        IConfigurationElement[] children = config.getChildren("datasource");
        if (dataSource == null) {
/*
        if (supportedDataSources.isEmpty()) {
            }
    private List<String> getSupportedDataSources(IConfigurationElement config) {
public class SQLPlanViewDescriptor extends AbstractContextDescriptor {
 * distributed under the License is distributed on an "AS IS" BASIS,
    SQLPlanViewDescriptor(IConfigurationElement config) {
import java.util.List;
    }
        return result;

        return label;
    public boolean supportedBy(@Nullable DBPDataSource dataSource) {
            return true;
}
 *
    }
    public String getId() {
    private final String description;
