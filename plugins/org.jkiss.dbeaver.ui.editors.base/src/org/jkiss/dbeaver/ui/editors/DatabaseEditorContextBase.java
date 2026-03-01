 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
    @Nullable
    public DBSObject getSelectedObject() {

 *     http://www.apache.org/licenses/LICENSE-2.0
    @Nullable
package org.jkiss.dbeaver.ui.editors;
    }
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
        return object;
 * You may obtain a copy of the License at
    }
    public DBCExecutionContext getExecutionContext() {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    @Override
import org.jkiss.code.NotNull;



}
import org.jkiss.dbeaver.model.struct.DBSObject;
        return container;
public final class DatabaseEditorContextBase implements DatabaseEditorContext {
 */
    private final DBSObject object;
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
/*
    public DatabaseEditorContextBase(@NotNull DBPDataSourceContainer container, @Nullable DBSObject object) {

import org.jkiss.code.Nullable;
    private final DBPDataSourceContainer container;
        this.container = container;
        return null;
 *
    @Override
 *

import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
 * DBeaver - Universal Database Manager
    @Override
        this.object = object;
    public DBPDataSourceContainer getDataSourceContainer() {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
