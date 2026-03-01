
    }
 * Unless required by applicable law or agreed to in writing, software
    /**


}
public interface DBCStatement extends DBPObject, DBRBlockingObject, DBPCloseableObject, DBPAutoCloser {
 * Copyright (C) 2010-2025 DBeaver Corp and others
     */
     * @throws DBCException on error
    /**
 */
import org.jkiss.dbeaver.DBException;
    /**
    /**
     */
     * @return data container or null
     * @param source data source object
    default long[] executeStatementBatch() throws DBCException {
    }
     * Sets statement execution timeout (in seconds)
     */
     * @throws DBCException on error
    }
     */

    /**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    void setResultsFetchSize(int fetchSize) throws DBCException;

     * @param offset first row index
import org.jkiss.code.Nullable;
 *
    }
import org.jkiss.dbeaver.model.DBPObject;
     * Moves statement to the next result set if it presents.
 * distributed under the License is distributed on an "AS IS" BASIS,
    void setLimit(long offset, long limit) throws DBCException;
        throw new DBCFeatureNotSupportedException("Statement batches are not supported");

     * @param limit maximum number of rows
     * @throws DBCException on error
/**
     * @throws DBCException on error
     * In most cases it is some DBSDataContainer (e.g. table). Also it could be SQL editor.

     * @return number of row updated

     */
    @Nullable
    /**

import org.jkiss.dbeaver.model.DBPCloseableObject;
     * Statement's context
    void setStatementTimeout(int timeout) throws DBCException;
     *

     * Returns result set. Valid only on after {@link #executeStatement} invocation.
    @Nullable
    /**
     * Statement source.

    /**

     * Statement's query string.

import org.jkiss.dbeaver.model.DBPAutoCloser;
    /**
/*
     * Sets statement result set limitations
     * Returns number of rows updated by this statement executed.
        return false;
    @Nullable
 * See the License for the specific language governing permissions and
 * DBCStatement
 * limitations under the License.
    void close() throws DBException;
     * Also clears these warnings - immediate second invocation won't return any warnings.
     * Returns result set with generated key values. Valid only on after {@link #executeStatement} invocation.
        throw new DBCFeatureNotSupportedException("Generated keys reading not supported");
 * you may not use this file except in compliance with the License.
     * @return context
    default void addToBatch() throws DBCException {
 * You may obtain a copy of the License at
     * @return true if statement returned result set, false otherwise
     */
    /**
 *
     */
    String getQueryString();
    boolean executeStatement() throws DBCException;
     * Executes statement
     */
import org.jkiss.dbeaver.model.runtime.DBRBlockingObject;
     */
import org.jkiss.code.NotNull;
 * DBeaver - Universal Database Manager
     */

    DBCSession getSession();
        throw new DBCFeatureNotSupportedException("Statement batches are not supported");
     * Returns warnings if any.
     * @throws DBCException on error

     * @return result set or null
    @NotNull

    /**
     * @throws DBCException on error
    boolean nextResults() throws DBCException;

     */
    @Nullable
    /**
    long getUpdateRowCount() throws DBCException;

    DBCResultSet openResultSet() throws DBCException;
package org.jkiss.dbeaver.model.exec;
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
    DBCExecutionSource getStatementSource();
    default DBCResultSet openGeneratedKeysResultSet() throws DBCException {
    @Nullable
     * @return result set or null
    /**
     */
     * Executes batch of statements
     * @throws DBCException on error
    void setStatementSource(@Nullable DBCExecutionSource source);
    default boolean isStatementClosed() throws DBCException {
    /**
 *
     */

     * Sets statement data source
    Throwable[] getStatementWarnings() throws DBCException;

     */
     * Adds statement to execution batch (if supported)
     * Checks whether there are additional results (result set or update count).
     * @return query string
