 * Unless required by applicable law or agreed to in writing, software
public class SQLServerTableTemp extends SQLServerTable {
        @NotNull String originalName
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
}
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0

 * Copyright (C) 2010-2025 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.sql.ResultSet;
        @NotNull SQLServerSchema catalog,

    public SQLServerTableTemp(
    }
 * DBeaver - Universal Database Manager
        @NotNull String tempName,
    }
     */
        @NotNull ResultSet dbResult,
 */
package org.jkiss.dbeaver.ext.mssql.model;
 *
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.originalName = originalName;
/**
import org.jkiss.dbeaver.ext.mssql.SQLServerUtils;
 *
     * @see SQLServerUtils#stripTempdbTableName(String)
 * limitations under the License.
        return originalName;

 *

        super(catalog, dbResult, tempName);
 * you may not use this file except in compliance with the License.
     * Returns the original, stripped name of this temporary table.
    private final String originalName;
    ) {
    /**
 */
 * Represents a user-created temporary table that resides in the {@code tempdb} database.

     *
/*
    public String getOriginalName() {
import org.jkiss.code.NotNull;
