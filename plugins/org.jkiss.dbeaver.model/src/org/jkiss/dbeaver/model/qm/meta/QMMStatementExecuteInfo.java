        this.fetchBeginTime = getTimeStamp();
        long fetchBeginTime,
        this.fetchBeginTime = fetchBeginTime;
    ) {
        this.fetchRowCount = rowCount;
        return queryString;
            this.errorMessage = error.getMessage();
        this.schema = schema;
        if (sqlDialect != null && queryString != null) {
    }
        this.statementId = statementId;
    }
 *
    {

    void beginFetch()
 *
    private int errorCode;
        return savepoint;

    void close(long rowCount, Throwable error)
        return '"' + queryString + '"';
        this.errorMessage = errorMessage;
        }
    {
import java.sql.SQLException;
    {
        return queryString;
    private Long statementId;
    }
    }
        }

        return errorCode != 0 || errorMessage != null;
        if (savepoint != null) {
    @Override
    public String getText() {
    {
        if (error != null) {
    QMMStatementExecuteInfo(
    }
    public void setStatementId(long statementId) {
import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;
    {
            }
 * you may not use this file except in compliance with the License.
    public QMMStatementExecuteInfo(
        @Nullable String schema,
}
        long closeTime,
            this.transactional = statement.getPurpose() != DBCExecutionPurpose.META && sqlDialect.isTransactionModifyingQuery(queryString);

package org.jkiss.dbeaver.model.qm.meta;
        this.schema = schema;
    }
    public QMMStatementInfo getStatement()
        boolean transactional,
    }
        this.catalog = catalog;
        long openTime,

 * You may obtain a copy of the License at
    public long getFetchBeginTime()
            // SQL error makes ANY statement transactional (PG specific?)
    private long fetchEndTime;
    }
    public String getQueryString()
    @Nullable
    private long updateRowCount = -1;
        return transactional || updateRowCount > 0;
        return statementId;


    private long fetchRowCount;
        String queryString,
        return fetchRowCount;

 *
    @Nullable
 * DBeaver - Universal Database Manager

            this.transactional = false;
    private boolean transactional;
    }
    }
        this.queryString = queryString;
 * See the License for the specific language governing permissions and
        }
    public long getUpdateRowCount()
    }
    public Long getStatementId() {
        return errorMessage;
        super.close();
        String errorMessage,
    private final String schema;

            savepoint.setLastExecute(this);
    public long getFetchEndTime()
    }
        String queryString,
        int errorCode,
    public QMMTransactionSavepointInfo getSavepoint()

        long rowCount,



        if (!isClosed()) {
    @Override

        return execTime + fetchTime;
        return statement.getConnection();
    @Nullable
        }
    }
        if (!transactional) {

        this.errorCode = errorCode;
*/
            this.transactional = true;
    }
        this.transactional = transactional;
    @Nullable
        this.fetchEndTime = fetchEndTime;
    @Nullable
 * Copyright (C) 2010-2026 DBeaver Corp and others
        this.savepoint = savepoint;
    {
            return -1;
        return fetchEndTime;

    {
        super(QMMetaObjectType.STATEMENT_EXECUTE_INFO);
        this.fetchRowCount = rowCount;

 * Licensed under the Apache License, Version 2.0 (the "License");

* Statement execute info
import org.jkiss.dbeaver.model.sql.SQLDialect;
        @Nullable String catalog
        this.fetchEndTime = getTimeStamp();
        @Nullable String catalog)
    public QMMStatementExecuteInfo getPrevious()
    }


    private final String catalog;
        @Nullable String schema,

 * Unless required by applicable law or agreed to in writing, software


    }
    public String toString() {
        return errorCode;
    }
        long execTime = getCloseTime() - getOpenTime();
        QMMStatementExecuteInfo previous,

    }
    {
import org.jkiss.code.Nullable;
    {
public class QMMStatementExecuteInfo extends QMMObject {
        return schema;
        return previous;
    private QMMTransactionSavepointInfo savepoint;
    {
    public int getErrorCode()
 * limitations under the License.
        }
/*
        this.previous = previous;
        return catalog;
    {


    public long getFetchRowCount() {
    @Override
        } else {
    private String errorMessage;
        QMMStatementInfo stmt,
        return fetchBeginTime > 0 && fetchEndTime == 0;
        long fetchEndTime,
        return updateRowCount;
        this.catalog = catalog;
    private final String queryString;
    private long fetchBeginTime;
    @Nullable

        SQLDialect sqlDialect,
    {
    public boolean isFetching()
    public boolean isTransactional() {
                this.errorCode = ((SQLException)error).getErrorCode();
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        this.queryString = queryString;
    @Override
    }
    private transient QMMStatementExecuteInfo previous;
 */
        return statement;
    }
/**
    {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.updateRowCount = rowCount;
    public QMMConnectionInfo getConnection() {

    }
    {
    }
    // Statement id in database
    public String getErrorMessage()

    public long getDuration() {
    public boolean hasError()
    void endFetch(long rowCount)
 * distributed under the License is distributed on an "AS IS" BASIS,
    }



    {
        this.statement = stmt;

    }
            this.transactional = this.updateRowCount >= 0;
    }
        this.statement = statement;
            if (error instanceof SQLException) {
    public String getSchema() {


        long fetchTime = isFetching() ? 0 : getFetchEndTime() - getFetchBeginTime();
    public String getCatalog() {

        QMMTransactionSavepointInfo savepoint,
        QMMStatementInfo statement,

        return fetchBeginTime;
    private final QMMStatementInfo statement;
        super(QMMetaObjectType.STATEMENT_EXECUTE_INFO, openTime, closeTime);
