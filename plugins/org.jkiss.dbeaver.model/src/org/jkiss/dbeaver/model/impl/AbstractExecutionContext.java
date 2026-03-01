public abstract class AbstractExecutionContext<DATASOURCE extends DBPDataSource, INSTANCE extends DBSInstance>

}
    }
import org.jkiss.dbeaver.DBException;
 */
    @SuppressWarnings("unchecked")
 * It provides bootstrap init functions and QM notifications.
 * Licensed under the Apache License, Version 2.0 (the "License");

 * limitations under the License.
    @Override
     */
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.qm.QMUtils;
        return new LinkedHashMap<>(contextAttributes);
    /**
        this.instance = instance;
        log.debug("Execution context opened (" + dataSource.getName() + "; " + purpose + "; " + this.id +  ")");
import java.util.List;

                        if (bootstrap.isIgnoreErrors()) {
        return false;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
    {
    @Override
                    } catch (Exception e) {

    protected final long id;
    @NotNull
    }

        return null;
    implements DBCExecutionContext {

                        }
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.model.struct.DBSInstance;
    private static final Log log = Log.getLog(AbstractExecutionContext.class);

                        try (DBCStatement dbStat = session.prepareStatement(DBCStatementType.SCRIPT, query, false, false, false)) {
        return idSequence++;


    public void removeContextAttribute(@NotNull String attributeName) {
 * Abstract execution context.


        if (!CommonUtils.isEmpty(initQueries)) {
                }
        contextAttributes.remove(attributeName);
import org.jkiss.dbeaver.Log;
                    }

        return (T) contextAttributes.get(attributeName);

 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
    }
    public AbstractExecutionContext(@NotNull INSTANCE instance, String purpose) {
     * Executes bootstrap queries and other init functions.
        this.dataSource = (DATASOURCE) instance.getDataSource();
    }
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.utils.GeneralUtils;

import org.jkiss.code.NotNull;
import org.jkiss.code.Nullable;
    public <T> T getContextAttribute(@NotNull String attributeName) {
import org.jkiss.utils.CommonUtils;

            }
    public DATASOURCE getDataSource() {

    public long getContextId() {
        QMUtils.getDefaultHandler().handleContextClose(this);
 *
        List<String> initQueries = bootstrap.getInitQueries();
    @Nullable
                            throw new DBCException(message, e, this);
 *
 * DBeaver - Universal Database Manager
                        String message = "Error executing bootstrap query: " + query;
    @NotNull
        return this.id;
    protected void closeContext()
    @NotNull
    @Override
                        } else {
    }
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.model.impl;
import java.util.LinkedHashMap;
    private final Map<String, Object> contextAttributes = new LinkedHashMap<>();
    }
            return true;

/*
            monitor.subTask("Run bootstrap queries");
    public <T> void setContextAttribute(@NotNull String attributeName, @Nullable T attributeValue) {
        QMUtils.getDefaultHandler().handleContextOpen(this, false);

    }

                        }
    }
    protected final String purpose;
    protected boolean initContextBootstrap(@NotNull DBRProgressMonitor monitor, boolean autoCommit) throws DBException {
    @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        log.debug("Execution context closed (" + dataSource.getName() + ", " + this.id +  ")");

    private static long idSequence = 0;
/**
    public String toString() {
    @NotNull
            try (DBCSession session = openSession(monitor, DBCExecutionPurpose.UTIL, "Run bootstrap queries")) {
        contextAttributes.put(attributeName, attributeValue);
    protected final DATASOURCE dataSource;
    @NotNull
        return getDataSource().getContainer().getActualConnectionConfiguration().getBootstrap();
 * Unless required by applicable law or agreed to in writing, software
    @NotNull
import org.jkiss.dbeaver.model.exec.*;

    }
                    // Replace variables
    @Override
        return dataSource;

        }
 *
                            log.warn(message);
        return instance;
        return purpose;
    }
    }
    public DBCExecutionContextDefaults getContextDefaults() {
    @Override
                    query = GeneralUtils.replaceVariables(query, getDataSource().getContainer().getVariablesResolver(true));
    public Map<String, ?> getContextAttributes() {
 * You may obtain a copy of the License at
        QMUtils.getDefaultHandler().handleContextUpdate(this, !autoCommit);
    }
    protected DBPConnectionBootstrap getBootstrapSettings() {
    protected INSTANCE instance;
    @Override
    }
        // Notify QM
        this.instance = instance;
        // Execute bootstrap queries
    }
                for (String query : initQueries) {
        this.purpose = purpose;
    @Override
 */


                            dbStat.executeStatement();
        DBPConnectionBootstrap bootstrap = getBootstrapSettings();
 * All regular DBCExecutionContext implementations should extend this class.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * Context boot procedure.
    }
    protected void setOwnerInstance(@NotNull INSTANCE instance) {
        this.id = generateContextId();
    }
    public INSTANCE getOwnerInstance() {
    public String getContextName() {

import org.jkiss.dbeaver.model.connection.DBPConnectionBootstrap;
                    try {
        return dataSource.getName() + " - " + purpose;

     * This function must be called by all implementations.
import java.util.Map;
    @Override
    public static synchronized long generateContextId() {
