        }
    public String toString() {
    public String getFdwId() {
 * See the License for the specific language governing permissions and
    @NotNull
    }
        return name;
    @NotNull
    {
 */
import org.eclipse.core.runtime.IConfigurationElement;

        return id;
 * FDWConfigDescriptor

            if (!dbId.isEmpty() && dataSource.getDriver().getId().contains(dbId)) {
 * You may obtain a copy of the License at
    private final String name;
    public String getName() {

import org.jkiss.dbeaver.Log;
/*
        this.fdwId = config.getAttribute("fdwId");
 */
    public boolean matches(DBPDataSourceContainer dataSource) {
            }
    }
    @NotNull
}
 *
        this.name = config.getAttribute("label");

 * limitations under the License.

 * you may not use this file except in compliance with the License.
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.utils.CommonUtils;
    @NotNull
    private final String[] foreignDatabases;
    public String getDescription() {
 * DBeaver - Universal Database Manager
                return true;
    private static final Log log = Log.getLog(FDWConfigDescriptor.class);
    public FDWConfigDescriptor(IConfigurationElement config)
    }
    }
        for (String dbId : foreignDatabases) {
        return false;
        this.foreignDatabases = CommonUtils.notEmpty(config.getAttribute("databases")).split(",");
    @NotNull

    private final String description;
    }

    }
        return id;
        return foreignDatabases;
public class FDWConfigDescriptor extends AbstractDescriptor
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
    private final String fdwId;
        super(config);
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;


    private final String id;
package org.jkiss.dbeaver.ext.postgresql.model.fdw;
    private final DBPPropertyDescriptor[] properties;
        this.properties = PropertyDescriptor.extractPropertyGroups(config);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
import org.jkiss.dbeaver.model.impl.PropertyDescriptor;
        this.id = config.getAttribute("id");

    @NotNull

 *
        this.description = config.getAttribute("description");
 * Unless required by applicable law or agreed to in writing, software
/**
    public String[] getForeignDatabases() {
    }
        return properties;

    public String getId() {
    }
import org.jkiss.code.NotNull;

{
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
    public DBPPropertyDescriptor[] getProperties() {
        return description;

        return fdwId;

