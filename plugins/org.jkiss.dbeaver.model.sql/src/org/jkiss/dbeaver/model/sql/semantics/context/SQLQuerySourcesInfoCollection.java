     */
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
     * Returns a set of aliases used in the query
 * See the License for the specific language governing permissions and
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.model.sql.semantics.context;
 * Unless required by applicable law or agreed to in writing, software
    Set<DBSEntity> getReferencedTables();
    @NotNull

 * limitations under the License.
    Set<String> getAliasesInUse();
     */
 */
import org.jkiss.dbeaver.model.struct.DBSEntity;

import org.jkiss.dbeaver.model.sql.semantics.model.select.SQLQueryRowsSourceModel;
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others

 * Provides information about resolved sources with ability to separately provide tables and aliases used in the query
     */
import java.util.Set;

import org.jkiss.code.NotNull;
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 */
    /**
     * Returns all resolved query sources
 *
public interface SQLQuerySourcesInfoCollection {
import java.util.Map;
    Map<SQLQueryRowsSourceModel, SourceResolutionResult> getResolutionResults();
    /**
 * distributed under the License is distributed on an "AS IS" BASIS,

/**
     * Returns a set of tables used in the query
    @NotNull
 *
    @NotNull

    /**
 * DBeaver - Universal Database Manager
}
