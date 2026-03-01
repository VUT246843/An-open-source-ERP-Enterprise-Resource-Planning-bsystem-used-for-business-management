 * Licensed under the Apache License, Version 2.0 (the "License");
public class SimpleDatabaseEditorContext implements DatabaseEditorContext {
    }
    public DBPDataSourceContainer getDataSourceContainer() {

 *
    public DBCExecutionContext getExecutionContext() {
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
 * You may obtain a copy of the License at
    private final DBPDataSourceContainer dataSourceContainer;
 * DBeaver - Universal Database Manager
        this.dataSourceContainer = dataSourceContainer;
 * See the License for the specific language governing permissions and
 *

import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.struct.DBSObject;
 * Copyright (C) 2010-2025 DBeaver Corp and others

    public SimpleDatabaseEditorContext(DBPDataSourceContainer dataSourceContainer) {
package org.jkiss.dbeaver.ui.editors;
    @Override
        return dataSourceContainer;

 * limitations under the License.
        return null;
 */
    @Override


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public DBSObject getSelectedObject() {
    }
}

 *     http://www.apache.org/licenses/LICENSE-2.0
    }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    }
        return null;
 * you may not use this file except in compliance with the License.
    @Nullable
 *
 * Unless required by applicable law or agreed to in writing, software
/*
