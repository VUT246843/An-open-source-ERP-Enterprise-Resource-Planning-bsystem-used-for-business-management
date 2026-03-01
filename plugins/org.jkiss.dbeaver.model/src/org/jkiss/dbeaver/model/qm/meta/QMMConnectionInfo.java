        DBCTransactionManager txnManager = DBUtils.getTransactionManager(context);

        }
        return projectInfo.getId();
                    return this.transaction.getSavepoint(savepoint);
            this.closeTime = closeTime;
    }
                if (this.transaction != null) {
            this.openTime = openTime;
        private QMMStatementExecuteInfo executionStack;
                return stat;
    {
        // start new transaction
    {
    public String toString()
                this.executionStack,
        private String instanceId;
    }

            return this;

    }

            this.connectionUserName = connectionUserName;
    private boolean transactional;

        statementStack = builder.statementStack;
        } else {
    {
    {
        this.connectionUserName = connectionConfiguration.getUserName();
        if (this.transaction != null) {
    public QMMStatementExecuteInfo getExecutionStack() {
    private String connectionUrl;
 * you may not use this file except in compliance with the License.
    }
    {


    }
import org.jkiss.dbeaver.model.exec.*;
            exec.beginFetch();
        QMMProjectInfo projectInfo,
        projectInfo = builder.projectInfo;
    {
            return this;
        return exec;
    @Override
    public static final class Builder {
        return exec;
    }
                log.warn(e);
        private String contextName;
                stat.close();
                log.warn("Statement " + stat.getObjectId() + " (" + stat + ") is not closed (" + stat.getConnection().connectionUrl + ")");
    public QMMStatementExecuteInfo getExecution(DBCStatement statement) {
                autoCommit = txnManager.isAutoCommit();

    public QMMStatementInfo openStatement(DBCStatement statement)
        driverId = builder.driverId;
        public Builder setInstanceId(String instanceId) {
        return containerId;
            return this;
        }

    {
    public QMMConnectionInfo(
 *

import org.jkiss.code.Nullable;
        return new Builder();
    public static Builder builder() {
        }
                DBCCachedContextDefaults cachedDefault = contextDefaults.getCachedDefault();
        }
 *
        this.contextName = context.getContextName();
    }
        this.transactional = transactional;
            return this;
            var sqlDialect = statement.getSession().getDataSource().getSQLDialect();
        transaction = builder.transaction;
    public String getConnectionUrl() {
            if (!stat.isClosed()) {

            this.connectionUrl = url;
        if (stat != null) {
        public Builder setCloseTime(long closeTime) {
            transaction.rollback(null);
            this.transaction.commit();
        this.driverId = context.getDataSource().getContainer().getDriver().getFullId();
        public Builder setDriverId(String driverId) {

    }

    public String getContextName() {
    public QMMStatementInfo getStatement(DBCStatement statement)
            return this;
        public Builder setConnectionUserName(String connectionUserName) {
    public QMMProjectInfo getProjectInfo() {

    {
            return new QMMConnectionInfo(this);
        statementStack = null;
public class QMMConnectionInfo extends QMMObject implements QMMDataSourceInfo {
        if (exec != null) {
        }

        String contextName,
        public Builder setStatementStack(QMMStatementInfo statementStack) {
            );
        if (this.transactional == transactional) {
    public QMMObject rollback(DBCSavepoint savepoint)
        public Builder setContextName(String contextName) {
    }
    }
            return this.transaction.getPrevious();
        return this.transaction.getPrevious();
    @Override
    private String containerName;
    }
    public String getText() {

    }
 *
        this.containerId = containerId;

 * Data source information
        public Builder setContainerId(String containerId) {


            if (stat.getReference() == statement) {
        this.containerName = containerName;
        super.reopen();
    }
        this.projectInfo = new QMMProjectInfo(context.getDataSource().getContainer().getProject());
    }
    public QMMStatementExecuteInfo beginFetch(DBCResultSet resultSet)

import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
        connectionUrl = builder.connectionUrl;
        this.driverId = driverId;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
            return null;
        }

        return connectionUrl;
        }
    public QMMStatementExecuteInfo endFetch(DBCResultSet resultSet, long rowCount)
    public String getProjectId() {
 * limitations under the License.
        super.close();
    public QMMStatementExecuteInfo beginExecution(DBCStatement statement)
                stat.close();
 * See the License for the specific language governing permissions and
        QMMStatementExecuteInfo execution = getExecution(statement);
        }
        }
        initFromContext(context, !autoCommit);
        }

    private String contextName;
            this.executionStack = executionStack;
        }
        containerId = builder.containerId;
    public QMMStatementInfo getStatementStack() {
            this.projectInfo = projectInfo;
            } catch (DBCException e) {
        private String connectionUserName;
        public Builder setTransactional(boolean transactional) {
        private String containerId;
        if (!(obj instanceof QMMConnectionInfo)) {
        log.warn("Statement " + statement + " meta info not found");
            exec.close(rowCount, error);
                this.transaction.commit();

        public QMMConnectionInfo build() {
        public Builder setTransaction(QMMTransactionInfo transaction) {
            }
    }
        if (transactional) {
    private transient volatile QMMTransactionInfo transaction;

        transactional = builder.transactional;
        changeTransactional(transactional);
    private String instanceId;
        containerName = builder.containerName;
                return stat;
        }
    }
        return connectionUserName;
    public void close()
        if (this.transactional) {
                catalog = cachedDefault.catalogName();
    public QMMConnectionInfo(DBCExecutionContext context, boolean transactional) {
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    private void initFromContext(DBCExecutionContext context, boolean transactional) {
    public QMMTransactionInfo getTransaction() {
            this.contextName = contextName;
        }
    }
            if (this.transaction != null) {
            if (contextDefaults != null) {

        return instanceId;
    {
        String containerId,
            this.transaction = transaction;
        }
    }
        if (exec == null) {
import org.jkiss.dbeaver.model.DBUtils;
        }
            if (savepoint == null) {
            this.transaction = new QMMTransactionInfo(this, null);
        }
            this.transactional = transactional;
        var connectionConfiguration = context.getDataSource().getContainer().getConnectionConfiguration();
        for (QMMStatementInfo stat = this.statementStack; stat != null; stat = stat.getPrevious()) {
    public String getConnectionUserName() {
        return driverId;
        long closeTime,

    @Override
        this.containerName = context.getDataSource().getContainer().getName();
        public Builder setConnectionUrl(String url) {
        if (execution != null && execution.getUpdateRowCount() < 0) {
            if (exec.getStatement().getReference() == statement) {

    private transient volatile QMMStatementExecuteInfo executionStack;

    public String getContainerId() {
        this.instanceId = instanceID;

    }


        executionStack = builder.executionStack;

    @Override

    }
        this.instanceId = context.getOwnerInstance().getName();
        }
        String containerName,
    private String connectionUserName;
 * Copyright (C) 2010-2026 DBeaver Corp and others
        connectionUserName = builder.connectionUserName;
    private final QMMProjectInfo projectInfo;
        return transaction;
    }
            return this;
    {
    @Override
                savepoint,
 * Licensed under the Apache License, Version 2.0 (the "License");
        return exec;
        return transactional;
        if (transaction != null) {
    }

        private String driverId;
        public Builder setProjectInfo(QMMProjectInfo projectInfo) {
        }
            String catalog = null;
        return containerName;
                ((DBCParameterizedStatement) statement).getFormattedQuery() : statement.getQueryString();
    @NotNull
                schema = cachedDefault.schemaName();
                this.transaction.rollback(savepoint);
    private final String driverId;
        for (QMMStatementInfo stat = this.statementStack; stat != null; stat = stat.getPrevious()) {



        return projectInfo;
        this.containerId = context.getDataSource().getContainer().getId();
        DBPConnectionConfiguration connectionConfiguration,
            this.containerId = containerId;
            return false;
    private transient volatile QMMStatementInfo statementStack;

        }
                isTransactional() && getTransaction() != null ?
            }
        private QMMTransactionInfo transaction;


    @Nullable
import org.jkiss.utils.CommonUtils;
            execution.close(rows, null);
    public void reopen(DBCExecutionContext context) {
                schema,
            return this;
            this.statementStack = statementStack;
        return null;
        QMMConnectionInfo si = (QMMConnectionInfo) obj;
            }
        }
            return this;
        private QMMStatementInfo statementStack;

    public QMMTransactionInfo changeTransactional(boolean transactional) {
    }
            log.warn("Closed statement " + statement + " meta info not found");
        public Builder setExecutionStack(QMMStatementExecuteInfo executionStack) {
        this.transactional = transactional;
    }
    public String getContainerName() {
    @Override
            this.containerName = containerName;
        return null;
            this.driverId = driverId;
        }
    //private Throwable stack;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {
            }

        this.transaction = new QMMTransactionInfo(this, this.transaction);
            }
    }
        }
            }
            final QMMTransactionSavepointInfo savepoint =
                return this.transaction.getPrevious();
        contextName = builder.contextName;
        }
        return "SESSION " + containerName + " [" + contextName + "]";


            try {
        for (QMMStatementInfo stat = statementStack; stat != null; stat = stat.getPrevious()) {
            return this;
        this.connectionUserName = connectionConfiguration.getUserName();
 * Unless required by applicable law or agreed to in writing, software
            // Commit current transaction
            String queryString = statement instanceof DBCParameterizedStatement ?
        }
        private QMMProjectInfo projectInfo;
    public boolean isTransactional() {
            return this.executionStack = new QMMStatementExecuteInfo(
                }
                queryString,
            if (stat.getReference() == statement) {
                this.transaction = new QMMTransactionInfo(this, this.transaction);
        private long closeTime;
            return this;
    public boolean equals(Object obj) {
    @Include
        return statementStack;
            transaction = null;
                return exec;
 */
    public QMMStatementExecuteInfo endExecution(DBCStatement statement, long rowCount, Throwable error)
        initFromContext(context, transactional);
        this.connectionUrl = connectionConfiguration.getUrl();



        this.projectInfo = projectInfo;
        long openTime,
        return null;

        super(QMMetaObjectType.CONNECTION_INFO);

    @NotNull


        if (exec != null) {
    }
        return contextName;
        this.transactional = transactional;
                catalog
        private String connectionUrl;
    @Include
        instanceId = builder.instanceId;
    }

                    getTransaction().getCurrentSavepoint() : null;
            }
        public Builder setContainerName(String containerName) {
    }

        boolean transactional)
 */
        super(QMMetaObjectType.CONNECTION_INFO, builder.openTime, builder.closeTime);
        }
            return this;
    public void setTransactional(boolean transactional) {
        return null;
        if (statementStack != null) {
        }
    public QMMTransactionInfo commit()
        }
        this.connectionUrl = connectionConfiguration.getUrl();
        String driverId,
        QMMStatementInfo stat = getStatement(statement);
        QMMStatementExecuteInfo exec = getExecution(resultSet.getSourceStatement());
        for (QMMStatementExecuteInfo exec = this.executionStack; exec != null; exec = exec.getPrevious()) {
            this.transaction = new QMMTransactionInfo(this, this.transaction);
    @Override
            } else {
                sqlDialect,
        private String containerName;
        boolean autoCommit = true;
    }
        return null;
        private boolean transactional;
        if (exec != null) {
    }
    }
        this.contextName = contextName;
    @NotNull
            String schema = null;
                stat,
            DBCExecutionContextDefaults contextDefaults = statement.getSession().getExecutionContext().getContextDefaults();

    @Include
 * You may obtain a copy of the License at
            this.instanceId = instanceId;
/*

        QMMStatementExecuteInfo exec = getExecution(statement);
            return this;
    public QMMConnectionInfo getConnection() {
    }
    @Override
            if (this.transaction != null) {
    public String getInstanceId() {
            return this;
            }
        }
    public String getDriverId() {
    @Nullable

        }

        if (txnManager != null) {
        if (this.transactional) {
        public Builder() {
    }

        }
    private QMMConnectionInfo(Builder builder) {
        }
        return executionStack;

import org.jkiss.code.NotNull;
        }
            CommonUtils.equalObjects(contextName, si.contextName);
        public Builder setOpenTime(long openTime) {
            exec.endFetch(rowCount);
        }
        return this.containerName + " - " + contextName;
    @Override
            return this;
        private long openTime;
    }
        return
    @Override
            return null;
            exec = beginExecution(resultSet.getSourceStatement());
        super(QMMetaObjectType.CONNECTION_INFO, openTime, closeTime);
        QMMStatementExecuteInfo exec = getExecution(resultSet.getSourceStatement());
package org.jkiss.dbeaver.model.qm.meta;
            }
        return this;
        }
    }
 * DBeaver - Universal Database Manager
        }
    public QMMStatementInfo closeStatement(DBCStatement statement, long rows) {
    @Include
    private final String containerId;
/**
}
        return this.statementStack = new QMMStatementInfo(this, statement, this.statementStack);
            CommonUtils.equalObjects(containerId, si.containerId) &&
        String instanceID,
