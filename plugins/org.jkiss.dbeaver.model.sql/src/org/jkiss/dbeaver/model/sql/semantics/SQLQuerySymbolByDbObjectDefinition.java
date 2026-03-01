import org.jkiss.code.NotNull;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
        this.symbolClass = symbolClass;
        return this.dbObject;
public class SQLQuerySymbolByDbObjectDefinition implements SQLQuerySymbolDefinition {
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.dbObject = dbObject;
 * You may obtain a copy of the License at

 * Unless required by applicable law or agreed to in writing, software
    @Override
    }
    @NotNull
 * A database entity responsible for the meaning of the symbol
 * you may not use this file except in compliance with the License.

 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");


 *
    public SQLQuerySymbolByDbObjectDefinition(@NotNull DBSObject dbObject, @NotNull SQLQuerySymbolClass symbolClass) {

 */
    public SQLQuerySymbolClass getSymbolClass() {
        return this.symbolClass;
    private final DBSObject dbObject;
import org.jkiss.dbeaver.model.struct.DBSObject;
package org.jkiss.dbeaver.model.sql.semantics;
 * limitations under the License.
    private final SQLQuerySymbolClass symbolClass;
    public DBSObject getDbObject() {
    @NotNull
 */
 *
/**
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2024 DBeaver Corp and others
/*
}
