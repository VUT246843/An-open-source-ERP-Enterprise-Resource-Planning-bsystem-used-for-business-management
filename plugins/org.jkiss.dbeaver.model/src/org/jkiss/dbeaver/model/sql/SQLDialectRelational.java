    default String getLikeEscapeClause(@NotNull String escapeChar) {
 *     http://www.apache.org/licenses/LICENSE-2.0
     * Standard SQL (SQL2003)
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Nullable

    boolean supportsOrderBy();
 * you may not use this file except in compliance with the License.

import org.jkiss.code.Nullable;

 * See the License for the specific language governing permissions and
    }
}
 * You may obtain a copy of the License at
 *
package org.jkiss.dbeaver.model.sql;
 * Unless required by applicable law or agreed to in writing, software
 *
 */
/**
 *


 */
    boolean isAmbiguousCountBroken();
    /**
public interface SQLDialectRelational extends SQLDialect {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    boolean supportsGroupBy();
/*
import org.jkiss.code.NotNull;
        return null;
     */
 * DBeaver - Universal Database Manager
     * @return true if `select count(*) from (select 1,1) z` fails because of duplicate column name
 * Relational SQL Dialect

    /**
 * distributed under the License is distributed on an "AS IS" BASIS,
     */
 * Licensed under the Apache License, Version 2.0 (the "License");
    boolean isStandardSQL();
