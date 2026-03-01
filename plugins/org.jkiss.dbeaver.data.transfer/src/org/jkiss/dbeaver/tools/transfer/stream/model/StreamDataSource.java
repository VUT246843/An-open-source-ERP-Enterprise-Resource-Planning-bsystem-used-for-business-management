        return dialect;
 *
import org.jkiss.dbeaver.model.data.DBDValueHandler;
        this.dialect = new StreamDataSourceDialect();
    @Override
 * See the License for the specific language governing permissions and
    public DBSObject getChild(@NotNull DBRProgressMonitor monitor, @NotNull String childName) throws DBException {

    }
    @Override
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.sql.SQLDialect;
    @Override
 *
import org.jkiss.dbeaver.model.data.DBDValueHandlerProvider;

    public StreamExecutionContext openIsolatedContext(@NotNull DBRProgressMonitor monitor, @NotNull String purpose, @Nullable DBCExecutionContext initFrom) throws DBException {
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
/*
        return null;
    public StreamDataSource(@NotNull String inputName) {
    private final StreamDataSourceDialect dialect;
    }

 * limitations under the License.

 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.struct.DBSObject;

    }
    }
 * You may obtain a copy of the License at

 * Licensed under the Apache License, Version 2.0 (the "License");
    public SQLDialect getSQLDialect() {
    }
 * you may not use this file except in compliance with the License.
    @Override
    @Nullable

    // We need to implement value handler provider to pass default value handler for attribute bindings
    public void initialize(@NotNull DBRProgressMonitor monitor) throws DBException {
}
    public void cacheStructure(@NotNull DBRProgressMonitor monitor, int scope) throws DBException {

    @NotNull
        return new StreamExecutionContext(this, purpose);
    }

import org.jkiss.dbeaver.runtime.DBWorkbench;

 */
        super(container);
import org.jkiss.dbeaver.DBException;
    @NotNull
import org.jkiss.dbeaver.model.data.DBDFormatSettings;
/**
    @Override
        return new StreamDataSourceInfo();
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
        this(new StreamDataSourceContainer(inputName, DBWorkbench.getPlatform().getWorkspace().getActiveProject()));
        return DefaultValueHandler.INSTANCE;
package org.jkiss.dbeaver.tools.transfer.stream.model;
    }
    public Class<? extends DBSObject> getPrimaryChildType(@Nullable DBRProgressMonitor monitor) throws DBException {
        return DBSObject.class;
public class StreamDataSource extends AbstractSimpleDataSource<StreamExecutionContext> implements DBDValueHandlerProvider {
    @NotNull

 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
    }
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    }
import java.util.Collection;
import org.jkiss.code.Nullable;
    }
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.impl.AbstractSimpleDataSource;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;



    @Override



 */
import org.jkiss.dbeaver.model.DBPDataSourceInfo;

    @Override
        this.executionContext = new StreamExecutionContext(this, "Main");
    public Collection<? extends DBSObject> getChildren(@NotNull DBRProgressMonitor monitor) throws DBException {
 *
    public StreamDataSource(@NotNull StreamDataSourceContainer container) {
    public DBDValueHandler getValueHandler(DBPDataSource dataSource, DBDFormatSettings preferences, DBSTypedObject typedObject) {

    public DBPDataSourceInfo getInfo() {
import org.jkiss.dbeaver.model.DBPDataSource;
 * Stream data source. It is a fake client-side datasource to emulate database-like data producers.
        return null;
    @NotNull
import org.jkiss.dbeaver.model.impl.data.DefaultValueHandler;
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Nullable
