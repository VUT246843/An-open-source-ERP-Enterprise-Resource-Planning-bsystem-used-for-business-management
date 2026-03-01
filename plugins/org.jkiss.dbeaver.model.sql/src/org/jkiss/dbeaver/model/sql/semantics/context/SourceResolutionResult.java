        @Nullable DBSEntity tableOrNull,
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.NotNull;
import org.jkiss.code.Nullable;
    @Nullable


        @NotNull SQLQueryRowsSourceModel source,
 *
 * DBeaver - Universal Database Manager
        this.isCteSubquery = source instanceof SQLQueryRowsCteSubqueryModel;
        this.tableOrNull = tableOrNull;
 * Unless required by applicable law or agreed to in writing, software
    public SourceResolutionResult(
    public final SQLQueryComplexName referenceName;
    @Nullable
 * Copyright (C) 2010-2025 DBeaver Corp and others
 */
import org.jkiss.dbeaver.model.sql.semantics.model.select.SQLQueryRowsCteSubqueryModel;
import org.jkiss.dbeaver.model.sql.semantics.SQLQueryComplexName;
public class SourceResolutionResult {
        this.aliasOrNull = aliasOrNull;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.struct.DBSEntity;
 * you may not use this file except in compliance with the License.
    }
        @Nullable SQLQueryComplexName referenceName,
 * See the License for the specific language governing permissions and
 * limitations under the License.
package org.jkiss.dbeaver.model.sql.semantics.context;
 * distributed under the License is distributed on an "AS IS" BASIS,
}
import org.jkiss.dbeaver.model.sql.semantics.model.select.SQLQueryRowsSourceModel;
 *
 * Describes the result of the query source resolution
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.sql.semantics.SQLQuerySymbol;
    @NotNull
        this.referenceName = referenceName;
 */
    ) {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
/*
    public final SQLQuerySymbol aliasOrNull;
    public final SQLQueryRowsSourceModel source;
        @Nullable SQLQuerySymbol aliasOrNull
    public final DBSEntity tableOrNull;
/**
    public final boolean isCteSubquery;

    @Nullable
        this.source = source;
