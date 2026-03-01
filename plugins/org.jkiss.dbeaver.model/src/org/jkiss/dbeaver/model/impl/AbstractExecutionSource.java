    @NotNull
 * limitations under the License.
    }

 * you may not use this file except in compliance with the License.
    private DBCScriptContext scriptContext;

 * DBeaver - Universal Database Manager
    @Override
        this.dataContainer = dataContainer;
 */
import org.jkiss.dbeaver.model.exec.DBCScriptContext;
 *
/**
 * AbstractExecutionSource
    private final Object descriptor;
public class AbstractExecutionSource implements DBCExecutionSource {
    public DBCScriptContext getScriptContext() {
 * See the License for the specific language governing permissions and
import org.jkiss.code.NotNull;
    @Override
    private final DBCExecutionContext executionContext;
    }
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
    public DBSDataContainer getDataContainer() {
    private final DBSDataContainer dataContainer;
    @Override
        return dataContainer;

    }
        this.controller = controller;
        this.scriptContext = scriptContext;



import org.jkiss.code.Nullable;

    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");

 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
    public void setScriptContext(DBCScriptContext scriptContext) {
 * You may obtain a copy of the License at
    public AbstractExecutionSource(DBSDataContainer dataContainer, DBCExecutionContext executionContext, Object controller, Object descriptor) {
 */
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        return scriptContext;

package org.jkiss.dbeaver.model.impl;
 * Unless required by applicable law or agreed to in writing, software
    public AbstractExecutionSource(DBSDataContainer dataContainer, DBCExecutionContext executionContext, Object controller) {
import org.jkiss.dbeaver.model.exec.DBCExecutionSource;
    @Nullable
/*
    }
    private final transient Object controller;
        this.executionContext = executionContext;
        this.descriptor = descriptor;

    @Nullable
    }
        this(dataContainer, executionContext, controller, null);
    }
    public Object getExecutionController() {
    @Nullable
}
    }
        return descriptor;
    public Object getSourceDescriptor() {
 *
        return controller;
 *
