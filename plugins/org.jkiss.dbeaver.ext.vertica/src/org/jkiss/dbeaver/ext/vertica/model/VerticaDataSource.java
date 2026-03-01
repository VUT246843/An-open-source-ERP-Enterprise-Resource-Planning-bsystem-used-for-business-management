    }

import org.jkiss.dbeaver.model.DBUtils;
import java.sql.SQLException;
    @Override
    protected void initializeRemoteInstance(@NotNull DBRProgressMonitor monitor) throws DBException {
import org.jkiss.dbeaver.model.meta.Association;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        @NotNull String purpose

            case "binary":
            }
                NLS.bind(VerticaMessages.vertica_password_will_expire_warn_description, warning.getMessage())
 */
     */
                    VerticaMessages.data_source_prompt_to_change_pass_message)
                 warning = warning.getNextWarning()
    @Override
import org.jkiss.dbeaver.model.impl.auth.AuthModelDatabaseNative;
import org.jkiss.dbeaver.model.access.DBAuthUtils;
    }
                 warning != null && !isPasswordExpireWarningShown;
            case "bytea":
 *


            getContainer().getConnectionConfiguration().getProviderProperty(VerticaConstants.PROP_DISABLE_COMMENTS_READING));
            case "float":
import java.util.Locale;

        }
    }
     *
                DBAuthUtils.promptAndChangePasswordForCurrentUser(monitor, getContainer(), manager);

        }
            case "smallint":
            }
        @NotNull DBRProgressMonitor monitor,
        {
                return false;
    boolean avoidCommentsReading() {
    private boolean checkForPasswordWillExpireWarning(@NotNull SQLWarning warning) {
        // [Vertica][VJDBC](100069) The password for user dbeaver_test3 will expire soon.  Please consider changing it.
        return false;

import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
 * Unless required by applicable law or agreed to in writing, software
public class VerticaDataSource extends GenericDataSource {
            case "time with timezone":
                }
        protected VerticaNode fetchObject(@NotNull JDBCSession session, @NotNull VerticaDataSource dataSource, @NotNull JDBCResultSet dbResult) throws SQLException, DBException
        return nodeCache.getAllObjects(monitor, this);
            case "date":

                VerticaMessages.vertica_password_will_expire_warn_name,
import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;
            case "number":
            case "real":
            return true;
        return super.getAdapter(adapter);
 * distributed under the License is distributed on an "AS IS" BASIS,
            return new VerticaNode(dataSource, dbResult);
            case "money":
    }
                return DBPDataKind.NUMERIC;
 * limitations under the License.
            case "float8":
        return true;
                    VerticaMessages.data_source_prompt_to_change_pass_title,
import org.jkiss.utils.CommonUtils;
            }
            case "time":
        if (CommonUtils.isNotEmpty(warning.getSQLState()) && VERTICA_GENERAL_WARNING_CODE.equals(warning.getSQLState())
                return DBPDataKind.BOOLEAN;
        throws DBException
    private NodeCache nodeCache = new NodeCache();
            case "datetime":
        }
                }


                DBWorkbench.getPlatformUI().confirmAction(
}
                "SELECT * FROM v_catalog.nodes ORDER BY nodE_name");
            case "tinyint":
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;

import org.jkiss.dbeaver.ext.vertica.internal.VerticaMessages;

        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull VerticaDataSource mySQLTable) throws SQLException
            case "timestamp with timezone":
            default:
        }
                        dbStat.execute();
            case "varchar":

/*
    public DBPDataKind resolveDataKind(@NotNull String typeName, int valueType)
    private static final String VERTICA_GENERAL_WARNING_CODE = "01000";
import org.jkiss.dbeaver.model.exec.DBCException;
            case "long varbinary":

import org.jkiss.code.Nullable;
            case "smalldatetime":

        return CommonUtils.toBoolean(

            case "varbinary":
            case "int":
            case "timestamp": case "timestamptz":
        super.initializeRemoteInstance(monitor);
    }
        }
import org.jkiss.code.NotNull;
        if (childObjectColumnAvailable == null) {
        } else if (adapter == DBSStructureAssistant.class) {
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
            ) {
    protected Connection openConnection(
        {
 * you may not use this file except in compliance with the License.
import java.util.Collection;
    class NodeCache extends JDBCObjectCache<VerticaDataSource, VerticaNode> {
    }

     * v_catalog.comments dramatically reduces data loading speed. User can disable metadata objects comments reading to avoid it.
            try {

    private Boolean childObjectColumnAvailable;
                return DBPDataKind.STRING;
                        childObjectColumnAvailable = true;
    {

        {
        super(monitor, container, metaModel, new VerticaSQLDialect());

            && CommonUtils.isNotEmpty(warning.getMessage()) && warning.getMessage().contains("(" + VERTICA_EXPIRED_PASSWORD_CODE + ")"))
import java.sql.Connection;
        if (adapter == DBAUserPasswordManager.class) {
 * You may obtain a copy of the License at
    @Association
 * DBeaver - Universal Database Manager

                childObjectColumnAvailable = false;

import org.jkiss.dbeaver.ext.vertica.VerticaConstants;
                childObjectColumnAvailable = false;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        typeName = typeName.trim().toLowerCase(Locale.ENGLISH);
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        return nodeCache.getObject(monitor, this, name);
        }

            AuthModelDatabaseNative.ID.equals(getContainer().getActualConnectionConfiguration().getAuthModelId())
    private static final Log log = Log.getLog(VerticaDataSource.class);
        // Example of the message is:

    }
        }
package org.jkiss.dbeaver.ext.vertica.model;
            case "boolean":

            DBWorkbench.getPlatformUI().showWarningMessageBox(
    @Override
            case "long varchar":
import org.jkiss.dbeaver.DBException;
            return adapter.cast(new VerticaChangeUserPasswordManager(this));
import org.jkiss.dbeaver.model.DBPDataKind;
    protected boolean isPopulateClientAppName() {
    public boolean isOmitCatalog() {
            DBAUserPasswordManager manager = getAdapter(DBAUserPasswordManager.class);
    {
        if (divPos != -1) {
    ) throws DBCException {
    }
                try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Check child comment column existence")) {
            );
    }
        } catch (SQLException e) {
            case "char":
            if (manager != null &&
            case "decimal":
    public <T> T getAdapter(@NotNull Class<T> adapter) {
                    try (final JDBCPreparedStatement dbStat = session.prepareStatement(
            case "interval":
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
            if (avoidCommentsReading()) {


            case "int8":
    }
        @Nullable JDBCExecutionContext context,
        switch (typeName) {
            log.debug("Can't get connection warnings", e);
import org.jkiss.dbeaver.Log;
                return DBPDataKind.BINARY;
 *
import org.jkiss.dbeaver.runtime.DBWorkbench;
                return DBPDataKind.DATETIME;
            }
            return session.prepareStatement(
    /**
 * Copyright (C) 2010-2025 DBeaver Corp and others
        return connection;
        int divPos = typeName.indexOf('(');
        @NotNull
    @Override
            } catch (Exception e) {
                    isPasswordExpireWarningShown = true;
        @Override
            typeName = typeName.substring(0, divPos);
            return adapter.cast(new VerticaStructureAssistant(this));
    }
        }
    public boolean isChildCommentColumnAvailable(@NotNull DBRProgressMonitor monitor) {
                isPasswordChangingDialogShown = true;
        }
            case "bigint":
    private static final String VERTICA_EXPIRED_PASSWORD_CODE = "100069";
        return false;
            case "interval day":
    public VerticaDataSource(DBRProgressMonitor monitor, DBPDataSourceContainer container, GenericMetaModel metaModel)
            case "double precision":
 *     http://www.apache.org/licenses/LICENSE-2.0
            case "numeric":
import org.jkiss.dbeaver.model.access.DBAUserPasswordManager;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
        try {
 *
    private boolean isPasswordExpireWarningShown;
            ) {
import org.eclipse.osgi.util.NLS;
        // child_object is very helpful column in v_catalog.comments table, but it's not childObjectColumnAvailable in Vertica versions < 9.3 and in some other cases
            case "raw":
                    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        Connection connection = super.openConnection(monitor, context, purpose);
                        dbStat.setFetchSize(1);
import java.sql.SQLWarning;
    public Collection<VerticaNode> getClusterNodes(DBRProgressMonitor monitor) throws DBException {
    @Override
                if (checkForPasswordWillExpireWarning(warning)) {
            case "timetz":
            case "integer":
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
import org.jkiss.dbeaver.model.struct.DBSStructureAssistant;
    }
    @NotNull
    }
        return childObjectColumnAvailable;
    private boolean isPasswordChangingDialogShown;
        if (isPasswordExpireWarningShown && !isPasswordChangingDialogShown &&
        @Override
            for (SQLWarning warning = connection.getWarnings();
    public VerticaNode getClusterNode(DBRProgressMonitor monitor, String name) throws DBException {
        ) {
                return DBPDataKind.OBJECT;


                        "SELECT child_object FROM v_catalog.comments WHERE 1<>1")) {
