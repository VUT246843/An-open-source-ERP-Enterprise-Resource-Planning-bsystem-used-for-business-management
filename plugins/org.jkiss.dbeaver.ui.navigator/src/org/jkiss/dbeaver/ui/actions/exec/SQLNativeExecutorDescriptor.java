        return dataSourceId;

        this.dataSourceId = config.getAttribute("datasource");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * Returns native executor implementation
/*
    public SQLNativeExecutorDescriptor(IConfigurationElement config) {
    private static final Log log = Log.getLog(SQLNativeExecutorDescriptor.class);
 * you may not use this file except in compliance with the License.
        return instance;

    private final ObjectType implClass;
 * You may obtain a copy of the License at
 */
            instance = implClass.createInstance(SQLScriptExecutor.class);

import org.jkiss.dbeaver.DBException;
    /**
 * limitations under the License.

public class SQLNativeExecutorDescriptor extends AbstractContextDescriptor {
 * Unless required by applicable law or agreed to in writing, software
}
        this.implClass = new ObjectType(config.getAttribute("class"));
    }
    @NotNull
package org.jkiss.dbeaver.ui.actions.exec;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.eclipse.core.runtime.IConfigurationElement;
        }
 * Copyright (C) 2010-2024 DBeaver Corp and others

    public SQLScriptExecutor<? extends DBSObject> getNativeExecutor() throws DBException {
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * See the License for the specific language governing permissions and
    private final String dataSourceId;
import org.jkiss.dbeaver.model.struct.DBSObject;
    public String getDataSourceId() {
import org.jkiss.code.NotNull;
 *
        super(config);
        if (instance == null) {
    private SQLScriptExecutor<? extends DBSObject> instance = null;

 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.impl.AbstractContextDescriptor;
import org.jkiss.dbeaver.Log;
    }
import org.jkiss.code.Nullable;
    @Nullable
     */
