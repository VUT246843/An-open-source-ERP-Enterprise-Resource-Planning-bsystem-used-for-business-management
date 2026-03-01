 */
     * at the moment of invocation of this function.

    /**
     */
    /**
     * Indicates whether the connection is currently refreshing.
    /**
     * This method returns a default value of {@code false}, meaning that the connection is not refreshing
     */
    default boolean isConnectionRefreshing() {
 * Usually represents a database server.
     * Datasource information/options
    /**
 * Data Source.
import org.jkiss.dbeaver.model.struct.DBSInstanceContainer;
    Object getDataSourceFeature(String featureId);
public interface DBPDataSource extends DBSInstanceContainer, DBPContextWithAttributes
 * Root object of all database structure and data objects.

     * @return datasource info.
/*
 */
     * unless explicitly overridden by an implementing class.
     * Row limit (setMaxSize) affects DML (UPDATE, INSERT, etc) statements.
 * See the License for the specific language governing permissions and
     * null means "unknown", -1 means any length (i.e. explicit length is not needed)
/**
import org.jkiss.dbeaver.model.sql.SQLDialect;
     * Max string length. Used by data transfer/compare/migration tools.

     * @throws DBException on any DB error
 * distributed under the License is distributed on an "AS IS" BASIS,
    String FEATURE_DOCUMENT_DATA_SOURCE = "datasource.document-data-source";
    /**
    /**
     * Data source feature
    @NotNull
        return false;
    }
     */
import org.jkiss.code.NotNull;
     * Datasource container
 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
{
     */
     */
     */
 * Copyright (C) 2010-2025 DBeaver Corp and others
    String FEATURE_LIMIT_AFFECTS_DML = "datasource.limit-affects-dml";
 *
     * @param monitor progress monitor
    DBPDataSourceInfo getInfo();

 *     http://www.apache.org/licenses/LICENSE-2.0
    @NotNull
    SQLDialect getSQLDialect();
 * from DBSObject or DBPContextProvider interfaces.
     * SQL dialect
    String FEATURE_LOB_REQUIRE_TRANSACTIONS = "datasource.lob-require-transactions";


 * you may not use this file except in compliance with the License.

     */
    /**
 *
 * Note: do not store direct references on datasource objects in any GUI components -
    DBPDataSourceContainer getContainer();
     * Document data source result set representation.
     *
 *
     * Reads base metadata from remote database or do any necessarily initialization routines.
     * @return container implementation
package org.jkiss.dbeaver.model;
    @NotNull
     * @return {@code true} if the connection is being refreshed; otherwise {@code false}.
     * LOB value operations require enabled transactions. I.e. LOB locator life time is 1 transaction.
    /**
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

}
     */
    void initialize(@NotNull DBRProgressMonitor monitor) throws DBException;
     * Info SHOULD be read at datasource initialization stage and should be cached and available
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.DBException;
    /**
     */
 * datasource instance may be refreshed at any moment. Obtain references on datasource only
     */
    /**

 *
 * DBeaver - Universal Database Manager
    String FEATURE_MAX_STRING_LENGTH = "datasource.max-string-type-length";
 * limitations under the License.

