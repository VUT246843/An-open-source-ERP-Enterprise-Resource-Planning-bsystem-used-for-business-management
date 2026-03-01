    public static final String EXTENSION_ID = "org.jkiss.dbeaver.dataSourceHandler"; //$NON-NLS-1$
 *
        this.id = config.getAttribute("id");
 *
        }
    }
        return instance;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 */
/**
import org.jkiss.dbeaver.model.impl.AbstractContextDescriptor;
    private static final Log log = Log.getLog(DataSourceHandlerDescriptor.class);
    }
 * Unless required by applicable law or agreed to in writing, software
    }
import org.jkiss.dbeaver.model.DBPDataSourceHandler;

import org.jkiss.dbeaver.DBException;
        return id;
import org.jkiss.dbeaver.Log;
    public String toString() {
 * limitations under the License.
        if (instance == null) {
 */
    public String getId() {

 * You may obtain a copy of the License at
    private DBPDataSourceHandler instance;
 * See the License for the specific language governing permissions and
        return DataSourceHandlerDescriptor.class.getSimpleName() + ":" + id;
    public DataSourceHandlerDescriptor(IConfigurationElement config) {

}
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
            instance = impl.createInstance(DBPDataSourceHandler.class);

 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.registry;
    }


    private final String id;
    private final ObjectType impl;
 * DataSourceHandlerDescriptor

    public synchronized DBPDataSourceHandler getInstance() throws DBException {
 *
 * you may not use this file except in compliance with the License.
        this.impl = new ObjectType(config, "class");
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.core.runtime.IConfigurationElement;
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others

        super(config);

public class DataSourceHandlerDescriptor extends AbstractContextDescriptor {
