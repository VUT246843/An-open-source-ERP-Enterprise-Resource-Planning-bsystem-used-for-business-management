        int index,
}
 *
        @NotNull SQLQueryRowsSourceModel source,
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
    @Nullable
        this.symbol = symbol;

    public final SQLQuerySymbol symbol;
 * you may not use this file except in compliance with the License.
    public SQLQueryResultColumn withNewIndex(int index) {
    @NotNull

import org.jkiss.dbeaver.model.struct.DBSEntity;
 * Unless required by applicable law or agreed to in writing, software
 *
    public final int index;

 * You may obtain a copy of the License at
import org.jkiss.code.Nullable;
    @Nullable
import org.jkiss.dbeaver.model.sql.semantics.model.select.SQLQueryRowsSourceModel;
    public SQLQueryResultColumn(
        this.realSource = realSource;

import org.jkiss.code.NotNull;
        @Nullable DBSEntityAttribute realAttr,
public class SQLQueryResultColumn {
        this.index = index;
 * limitations under the License.
    public SQLQueryResultColumn withNewSource(SQLQueryRowsSourceModel source) {
        @NotNull SQLQueryExprType type
    }
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
    @NotNull
        return new SQLQueryResultColumn(this.index, this.symbol, source, this.realSource, this.realAttr, this.type);
    }
        return new SQLQueryResultColumn(index, this.symbol, this.source, this.realSource, this.realAttr, this.type);
    ) {
 * See the License for the specific language governing permissions and
        this.type = type;
 * DBeaver - Universal Database Manager

 * distributed under the License is distributed on an "AS IS" BASIS,
    }
package org.jkiss.dbeaver.model.sql.semantics.context;
import org.jkiss.dbeaver.model.sql.semantics.SQLQuerySymbol;
    public final DBSEntity realSource;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public final DBSEntityAttribute realAttr;
    public final SQLQueryExprType type;
        this.realAttr = realAttr;
 * Licensed under the Apache License, Version 2.0 (the "License");
    public final SQLQueryRowsSourceModel source;
    @NotNull
/*
        @Nullable DBSEntity realSource,
        @NotNull SQLQuerySymbol symbol,
        this.source = source;

