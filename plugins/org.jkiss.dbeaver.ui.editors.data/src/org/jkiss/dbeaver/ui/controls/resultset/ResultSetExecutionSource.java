        @Nullable Object descriptor
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others

        }
    public DBDDataFilter getDataFilter() {
    ) {
}
    @NotNull
            return dataFilter;
    private final Object descriptor;
package org.jkiss.dbeaver.ui.controls.resultset;
    @Nullable
    public ResultSetViewer getExecutionController() {
    public  ResultSetExecutionSource(
    private final ResultSetViewer controller;
import org.jkiss.code.Nullable;
        @Nullable DBDDataFilter dataFilter
import org.jkiss.dbeaver.model.exec.DBCScriptContext;
 * Licensed under the Apache License, Version 2.0 (the "License");
    private final DBDDataFilter dataFilter;
 *
    @Nullable
        } else if (getDataContainer() == getExecutionController().getDataContainer()) {
 *
            return getExecutionController().getDataFilter();

    public DBDDataFilter getUseDataFilter() {

import org.jkiss.dbeaver.model.struct.DBSDataContainer;
        this.controller = controller;
    @Override
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.data.DBDDataFilter;
/*
    @Nullable
 * distributed under the License is distributed on an "AS IS" BASIS,

    }

        this.descriptor = descriptor;
    @Override
    }
        @NotNull DBSDataContainer container,
        return container;
        @NotNull ResultSetViewer controller,
    public Object getSourceDescriptor() {
 * DBeaver - Universal Database Manager
        return controller;
            return null;

    @NotNull
    }
import org.jkiss.dbeaver.model.exec.DBCExecutionSource;
        return null;
 * Unless required by applicable law or agreed to in writing, software

        @NotNull ResultSetViewer controller,

    private final DBSDataContainer container;
        return dataFilter;
    ) {
        if (dataFilter != null) {
    public ResultSetExecutionSource(
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
    }
        @Nullable Object descriptor,
import org.jkiss.code.NotNull;
    public DBCScriptContext getScriptContext() {
 */
    public DBSDataContainer getDataContainer() {

    }
        return descriptor;
 * you may not use this file except in compliance with the License.
 *
 * limitations under the License.
        this(container, controller, descriptor, null);
        this.container = container;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Nullable

    }
    }
public class ResultSetExecutionSource implements DBCExecutionSource {
        this.dataFilter = dataFilter;
        } else {
        @NotNull DBSDataContainer container,
    @Override
