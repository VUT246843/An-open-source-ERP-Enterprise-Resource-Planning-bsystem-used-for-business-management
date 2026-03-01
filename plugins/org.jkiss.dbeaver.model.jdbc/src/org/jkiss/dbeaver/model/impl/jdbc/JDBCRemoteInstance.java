            return this.metaContext;
    public JDBCDataSource getDataSource() {
    protected JDBCExecutionContext executionContext;
        }
            return this.executionContext;
        synchronized (allContexts) {
    }
                context.connect(monitor1, null, null, (JDBCExecutionContext) initFrom, true)));
package org.jkiss.dbeaver.model.impl.jdbc;
    @NotNull
 * See the License for the specific language governing permissions and
        this.dataSource = dataSource;
    @NotNull
            }
    }
        return dataSource;
        if (metaContext != null && (meta || executionContext == null)) {

        if (executionContext == null) {
    private static final Log log = Log.getLog(JDBCRemoteInstance.class);
    @Nullable
        return isolatedContext;
        }


        if (sharedInstance != null) {
    @Override
    public DBSObject getParentObject() {
        }
        
    @Override
        );
        if (sharedInstance != null) {
            log.debug("No execution context within database instance");
            return this.metaContext;
        if (executionContext == null) {


        throws DBException {
            }
     *
        }
    }
    protected final JDBCDataSource dataSource;
    @Override
    }

        if (initContext) {
    @Nullable
    @NotNull
    @NotNull
            return DBExecUtils.tryOpenContext(this.metaContext, (context) ->
import org.jkiss.dbeaver.ModelPreferences.SeparateConnectionBehavior;
import java.util.ArrayList;
import org.jkiss.dbeaver.Log;
 * distributed under the License is distributed on an "AS IS" BASIS,
/**
    }
            case ALWAYS -> true;
        return null;
                log.debug("Duplicate execution context add");

            }
        return dataSource.getName();
import java.util.List;
import org.jkiss.code.Nullable;
    @Override
    @NotNull
    private final List<JDBCExecutionContext> allContexts = new ArrayList<>();
        };
        synchronized (allContexts) {
    /**
    protected JDBCExecutionContext metaContext;
    protected String getMainContextName() {
    @Override
    }
                allContexts.add(context);
        @NotNull String purpose,
 *
            } else {
            DBExecUtils.tryOpenContext(this.executionContext, (context) ->
            String mainContextName = dataSource.getContainer().getClientApplicationName();
        }
        for (JDBCExecutionContext context : ctxCopy) {
    }

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
            return sharedInstance.getAllContexts();
            if (context == metaContext) {
        }
                context.connect(monitor, null, null, null, true));

        @Nullable DBCExecutionContext initFrom
            container.getPreferenceStore().getString(ModelPreferences.META_SEPARATE_CONNECTION)
    public JDBCExecutionContext[] getAllContexts() {
            }
    }
        }
        shutdown(monitor, false);
import org.jkiss.dbeaver.model.impl.SimpleExclusiveLock;
    @Override

import org.jkiss.dbeaver.model.struct.DBSObject;
        if (sharedInstance != null) {
 */
            this.metaContext = dataSource.createExecutionContext(this, getMetadataContextName());
            this.executionContext = dataSource.createExecutionContext(this, mainContextName);
     * @param keepMeta do not close meta context
        if (this.metaContext != null) {
                executionContext = null;
    }

 */
    }

import org.jkiss.dbeaver.model.DBPExclusiveResource;
            if (allContexts.contains(context)) {
            context.close();
            if (context == executionContext) {
        return true;
        // [JDBC] Need sync here because real connection close could take some time
 *
    protected JDBCRemoteInstance(@NotNull JDBCDataSource dataSource) {
        }
        throws DBException {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.DBException;
        }
            }
        return dataSource;
        List<JDBCExecutionContext> ctxCopy;
    protected JDBCRemoteInstance(@NotNull DBRProgressMonitor monitor, @NotNull JDBCDataSource dataSource, boolean initContext)
        synchronized (allContexts) {
    @Override
        return exclusiveLock;
    @NotNull
        }

        }

        } else {
    }
    ) throws DBException {
            default -> !container.getDriver().isEmbedded() && !container.isForceUseSingleConnection();
    public JDBCExecutionContext getDefaultContext(boolean meta) {

    public void shutdown(DBRProgressMonitor monitor, boolean keepMeta) {
        if (sharedInstance != null) {
        if (sharedInstance != null) {
    }
    @Override
    @NotNull

    @Nullable
    protected void initializeMainContext(@NotNull DBRProgressMonitor monitor) throws DBException {
     * Closes all instance contexts
    @NotNull
    @NotNull
/*
                metaContext = null;
        JDBCExecutionContext isolatedContext = dataSource.createExecutionContext(this, purpose);
        }
        boolean isMetaConnectionSeparate = switch (behavior) {
                continue;
        synchronized (allContexts) {
     */
            return allContexts.toArray(new JDBCExecutionContext[0]);
        if (sharedInstance != null) {

        }
        return JDBCExecutionContext.TYPE_METADATA;
}

            monitor.subTask("Close context '" + context.getContextName() + "'");
import org.jkiss.code.NotNull;
 *
            if (keepMeta && context == metaContext) {
            return sharedInstance.initializeMetaContext(monitor);
    public void shutdown(DBRProgressMonitor monitor) {
    }
            DBExecUtils.tryOpenContext(isolatedContext, (context) ->
            return;
        SeparateConnectionBehavior behavior = SeparateConnectionBehavior.parse(
import org.jkiss.dbeaver.ModelPreferences;
        }
        DBPDataSourceContainer container = dataSource.getContainer();
        }
            return;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                mainContextName = getMainContextName();
    }
    }
 * You may obtain a copy of the License at
 * JDBC data source
    }

    public String getDescription() {
    public JDBCExecutionContext initializeMetaContext(@NotNull DBRProgressMonitor monitor)
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Unless required by applicable law or agreed to in writing, software
            return sharedInstance.openIsolatedContext(monitor, purpose, initFrom);
public class JDBCRemoteInstance implements DBSInstance {
    boolean removeContext(JDBCExecutionContext context) {
            monitor.worked(1);
    public DBCExecutionContext openIsolatedContext(
import org.jkiss.dbeaver.model.struct.DBSInstance;

 * you may not use this file except in compliance with the License.
    @Override
        return executionContext;
        if (sharedInstance != null) {
 * Copyright (C) 2010-2026 DBeaver Corp and others

        }
    protected JDBCRemoteInstance sharedInstance;
    private final DBPExclusiveResource exclusiveLock = new SimpleExclusiveLock();
        DBExecUtils.tryExecuteRecover(monitor, getDataSource(), monitor1 ->
    public JDBCExecutionContext getDefaultContext(@NotNull DBRProgressMonitor monitor, boolean meta) {
            case NEVER -> false;

import org.jkiss.dbeaver.model.exec.DBExecUtils;
        // while UI may invoke callbacks to operate with connection
            return sharedInstance.getDefaultContext(meta);

    public boolean isPersisted() {
    protected String getMetadataContextName() {
    @NotNull
    public String getName() {

    @NotNull
    }
        if (isMetaConnectionSeparate) {
    }
        }

    public DBPExclusiveResource getExclusiveLock() {
 * DBeaver - Universal Database Manager
            if (mainContextName == null) {
    void addContext(JDBCExecutionContext context) {
 * limitations under the License.
            return sharedInstance.getDefaultContext(monitor, meta);
            ctxCopy = new ArrayList<>(allContexts);
        return getDefaultContext(meta);
            initializeMainContext(monitor);
        this.dataSource = dataSource;

    }
        }
        return JDBCExecutionContext.TYPE_MAIN;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
     * @param monitor  progress monitor
            return null;
        @NotNull DBRProgressMonitor monitor,
                context.connect(monitor, true, null, null, true));
            return allContexts.remove(context);
