
    /**
     * Retrieves whether this database supports referential integrity (foreign keys and checks).
 *     http://www.apache.org/licenses/LICENSE-2.0
    DBSObjectType[] getSupportedObjectTypes();
 */
    boolean supportsReferentialIntegrity();
     */
     * method <code>commit</code> is a noop.
     *
     * @return <code>true</code> if transactions are supported;
    boolean isReadOnlyData();
     */

 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
     * Retrieves the database vendor's preferred term for "procedure".
     *
import org.jkiss.dbeaver.model.struct.DBSObjectType;
 * DBeaver - Universal Database Manager


     * Checks whether this data source supports multiple results for a single statement
     */
    /**
     * @return <code>true</code> if savepoints are supported;
     * @return the vendor term for "procedure"
     * @return database product name
    Version getDatabaseVersion();

     * @return <code>true</code> if so; <code>false</code> otherwise
     */

     */
 * distributed under the License is distributed on an "AS IS" BASIS,
     * @return <code>true</code> if so; <code>false</code> otherwise
     * Retrieves whether this database is in read-only mode.

    boolean supportsTransactionsForDDL();

 */
    boolean supportsStoredCode();
 * See the License for the specific language governing permissions and
    /**
    boolean needsTableMetaForColumnResolution();

     *
    /**
     * Retrieves whether this database supports savepoints.
     * Retrieves whether this database supports transactions. If not, invoking the
     * Retrieves whether this database supports indexes.

    /**
    String getSchemaTerm();
     * @return database version number

/**
     * @return true or false
     */
     *
    Map<String, Object> getDatabaseProductDetails();
 * DBPDataSourceInfo
    boolean isReadOnlyMetaData();
    /**
    String getDriverVersion();
 *
     * DDL commands will use transaction mode from the session rather than using
    boolean isDynamicMetadata();
    String getCatalogTerm();
     * Database server version
     * Retrieves list of supported transaction isolation levels
}
    boolean supportsIndexes();
     * transactions on their own.
    /**
     */
     *
import java.util.Map;
     * Retrieves the version number of this driver as a <code>String</code>.

    Collection<DBPTransactionIsolation> getSupportedTransactionsIsolation();
     *

     */
    boolean supportsSavepoints();
    /**
    String getDatabaseProductName();
     * Detailed server information.
    /**
     *
     * Retrieves whether this database is in read-only mode.
     * Retrieves whether this database supports transactions for DDLs. If not, then
    boolean supportsResultSetLimit();
    boolean supportsStatementBinding();
 *
     * @return driver name
    boolean supportsBatchUpdates();
     *
    String getDriverName();

    /**

     */
 * You may obtain a copy of the License at
    /**
    String getProcedureTerm();
     *
     */
     * Workaround for broken drivers (#2792)



 * Licensed under the Apache License, Version 2.0 (the "License");
     */
{


     *
     * Retrieves the name of this driver.
     */
    boolean supportsTransactions();

 * Copyright (C) 2010-2025 DBeaver Corp and others
     */
     * Retrieves the version number of this database product.

     * @return list of supported transaction isolation levels

     * @return server version details or null
    boolean supportsResultSetScroll();


    /**
     *         <code>false</code> otherwise
    /**
    /**

     * @return {@code true} if the transactions inside DDLs are supported, {@code false} otherwise

     */
     * Retrieves the database vendor's preferred term for "catalog".
    boolean supportsResultSetOrdering();
     */
    String getDatabaseProductVersion();
     * @return the vendor term for "schema"

 *
    boolean isMultipleResultsFetchBroken();
     *
public interface DBPDataSourceInfo
     * @return true or false
     */
     * Dynamic metadata means that each execution of the same query may produce different results.
    boolean supportsMultipleResults();

     * @return the vendor term for "catalog"
     */

    /**

     */
     *
     * Retrieves whether this database supports stored code (procedures, functions, packages, etc).


     * @return true or false
     * Retrieves the name of this database product.
     */
     *         <code>false</code> otherwise
    /**
    /**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * @return driver version
 * limitations under the License.
     * Retrieves the database vendor's preferred term for "schema".
    /**
import java.util.Collection;
    boolean supportsNullableUniqueConstraints();

     */
    /**

     */
    /**
    boolean isMultipleResultsFailsOnMaxRows();
/*
import org.osgi.framework.Version;
package org.jkiss.dbeaver.model;
     * @return server version
    /**
