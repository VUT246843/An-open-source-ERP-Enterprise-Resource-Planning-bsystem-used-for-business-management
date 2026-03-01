        @Nullable DBSEntity realSource,
        @Nullable SQLQueryRowsSourceModel source,
import org.jkiss.dbeaver.model.sql.semantics.model.select.SQLQueryRowsSourceModel;
import org.jkiss.code.Nullable;
package org.jkiss.dbeaver.model.sql.semantics.context;
import org.jkiss.dbeaver.model.sql.semantics.SQLQuerySymbol;
    public final SQLQuerySymbol symbol;
    @NotNull
        @Nullable String description
    @Nullable
    @NotNull
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
import org.jkiss.dbeaver.model.struct.DBSEntity;
 */
        this.description = description;

    public final DBSEntity realSource;
    @Override
        return SQLQuerySymbolClass.COLUMN;
    public final String description;
 * You may obtain a copy of the License at
        @NotNull DBDPseudoAttribute.PropagationPolicy propagationPolicy,
    public SQLQuerySymbolClass getSymbolClass() {
    public final SQLQueryRowsSourceModel source;
        @NotNull SQLQuerySymbol symbol,

import org.jkiss.dbeaver.model.data.DBDPseudoAttribute;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.source = source;
    ) {

 * limitations under the License.
        this.propagationPolicy = propagationPolicy;
    @NotNull
    @Nullable
    @NotNull
        this.realSource = realSource;
import org.jkiss.code.NotNull;
public class SQLQueryResultPseudoColumn implements SQLQuerySymbolDefinition {
import org.jkiss.dbeaver.model.sql.semantics.SQLQuerySymbolClass;
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        this.symbol = symbol;
 * Licensed under the Apache License, Version 2.0 (the "License");
}
 *
    public final SQLQueryExprType type;
 * See the License for the specific language governing permissions and

 * you may not use this file except in compliance with the License.
    public SQLQueryResultPseudoColumn(
import org.jkiss.dbeaver.model.sql.semantics.SQLQuerySymbolDefinition;
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
/*
    @Nullable
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
        this.type = type;
 *
    public final DBDPseudoAttribute.PropagationPolicy propagationPolicy;
        @NotNull SQLQueryExprType type,

