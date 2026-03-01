
        return readOnly || readOnlyMetaData;
    public void setSupportsStoredCode(boolean supportsStoredCode) {
        }
    }
            RelationalObjectType.TYPE_TRIGGER,
        } catch (Throwable e) {
            this.driverVersion = metaData.getDriverVersion();
            supportsTransactions = metaData.supportsTransactions();

        try {
    private boolean supportsViews = true;
        }
        this.schemaTerm = TERM_SCHEMA;
    public boolean supportsViews() {
        return supportsTransactions;

    public boolean supportsBatchUpdates() {
        this.readOnly = false;
    }

        return databaseProductVersion;
            }
        supportedIsolations = new ArrayList<>();
        } catch (Throwable e) {
        }
    @Override
    }
        } catch (Throwable e) {
    @Override
        }
    public String getSchemaTerm() {
            this.driverVersion = "?"; //$NON-NLS-1$
        supportsScroll = true;

    public boolean supportsMultipleResults() {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            debugError(e);
        return supportedIsolations;
    }
        return dataSource == null ? null : dataSource.getDatabaseServerVersion();
            this.schemaTerm = makeTermString(metaData.getSchemaTerm(), TERM_SCHEMA);
 * JDBCDataSourceInfo
import org.jkiss.dbeaver.model.DBPTransactionIsolation;
    private String procedureTerm;
    private boolean supportsReferences = true;
        }
        }
    public DBSObjectType[] getSupportedObjectTypes() {


    public boolean supportsIndexes() {
    private static final Log log = Log.getLog(JDBCDataSourceInfo.class);
            debugError(e);

        return supportsIndexes;
        return readOnly || readOnlyData;
        try {

    }
    @Override
            supportsBatchUpdates = metaData.supportsBatchUpdates();
    }
        } catch (Throwable e) {
        this.supportsStoredCode = supportsStoredCode;

                debugError(e);
            String name = metaData.getDriverName();
    }

            RelationalObjectType.TYPE_VIEW,
    }
                supportedIsolations.add(0, JDBCTransactionIsolation.NONE);

    public void setSupportsViews(boolean supportsViews) {
    }
        this.supportsScroll = true;

    }
    }
 *     http://www.apache.org/licenses/LICENSE-2.0


    @Override
    }
        return supportsScroll;
    public String getCatalogTerm() {
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
        this.supportsViews = supportsViews;
    @Override
    protected void setReadOnlyMetaData(boolean readOnlyMetaData) {
    }
            this.databaseProductName = "?"; //$NON-NLS-1$


    public Collection<DBPTransactionIsolation> getSupportedTransactionsIsolation() {
 *
            }
        }
            } catch (Throwable e) {
    }
    @Override
    private final JDBCDataSource dataSource;
    public boolean supportsTransactions() {
    @Override
                debugError(e);
    public String getDatabaseProductName() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
        try {
        } catch (Throwable e) {
    @Override
    }
    public String getDriverVersion() {
        this.databaseProductVersion = ""; //$NON-NLS-1$
    private final List<DBPTransactionIsolation> supportedIsolations;
        if (supportsTransactions) {
    public static final String TERM_SCHEMA = ModelMessages.model_jdbc_Schema;
import java.util.Collection;

    }
    private String schemaTerm;


    }
        this.driverVersion = "?"; //$NON-NLS-1$
            supportsTransactions = true;
            addCustomTransactionIsolationLevels(supportedIsolations);
        // to be overrided in implementors
 * DBeaver - Universal Database Manager
        return supportsReferences;
            }
            RelationalObjectType.TYPE_CONSTRAINT,
            try {
            this.schemaTerm = TERM_SCHEMA;
import java.util.List;
        return supportsStoredCode;
    private String driverVersion;


        try {
            RelationalObjectType.TYPE_INDEX,
        }
 * limitations under the License.
                return databaseVersion.toString();
    @Override
                this.readOnly = metaData.isReadOnly();
    @Override

        return schemaTerm;
            debugError(e);
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
        }
 * Copyright (C) 2010-2025 DBeaver Corp and others

    protected void addCustomTransactionIsolationLevels(List<DBPTransactionIsolation> isolations) {
    private boolean supportsIndexes = true;
        if (!isIgnoreReadOnlyFlag()) {

    public boolean supportsSavepoints() {
        this.dataSource = metaData.getDataSource();
    }
    public boolean isDynamicMetadata() {

    }
    }


            }
    public String getDriverName() {
            RelationalObjectType.TYPE_VIEW_COLUMN,
                        supportedIsolations.add(txi);
    private String databaseProductVersion;
    public Version getDatabaseVersion() {
import org.jkiss.dbeaver.model.impl.AbstractDataSourceInfo;
        this.supportsIndexes = supportsIndexes;
        this.supportsTransactions = false;
            log.debug(e.getClass().getName() + ": " + e.getMessage());
    public boolean isReadOnlyData() {
    }
            debugError(e);
    private boolean readOnlyData;
    private boolean supportsBatchUpdates = false;
        try {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
    public boolean supportsResultSetScroll() {
            debugError(e);
    private boolean supportsTransactions;
/**

 */
    @Override
    }

        return CommonUtils.isEmpty(term) ? defTerm : CommonUtils.capitalizeWord(term.toLowerCase());
        try {
        }
                for (JDBCTransactionIsolation txi : JDBCTransactionIsolation.values()) {

        return supportsViews;
    }
        if (CommonUtils.isEmpty(databaseProductVersion)) {
        } catch (Throwable e) {
        return new DBSObjectType[] {
                    }
package org.jkiss.dbeaver.model.impl.jdbc;
    @Override
    @Override


                this.readOnly = false;
    }
    public JDBCDataSourceInfo(DBPDataSourceContainer container) {
    }
        return true;
            this.readOnly = false;
            debugError(e);
    @Override
            } catch (Throwable e) {
        return supportsBatchUpdates;
        };
    protected void setReadOnlyData(boolean readOnly) {
    private boolean readOnlyMetaData;
        return false;
        } catch (Throwable e) {

            RelationalObjectType.TYPE_SEQUENCE,
            try {
    }
    public static final String TERM_PROCEDURE = ModelMessages.model_jdbc_Procedure;
    }
            if (name != null) {

    }
        }
        this.supportsReferences = supportsReferences;
        return catalogTerm;
            RelationalObjectType.TYPE_TABLE_COLUMN,
            if (!supportedIsolations.contains(JDBCTransactionIsolation.NONE)) {

            this.procedureTerm = TERM_PROCEDURE;
 * You may obtain a copy of the License at
            if (databaseVersion != null) {
        } else {
import java.util.ArrayList;
    }
 *
        this.driverName = container.getDriver().getName(); //$NON-NLS-1$
import org.osgi.framework.Version;
    @Override

        this.procedureTerm = TERM_PROCEDURE;
    }
    private boolean readOnly;
            }
            log.debug(e.getClass().getName());
    private String databaseProductName;
                }
import org.jkiss.utils.CommonUtils;
            RelationalObjectType.TYPE_PROCEDURE,
    private String makeTermString(String term, String defTerm) {


    public String getProcedureTerm() {
    protected boolean isIgnoreReadOnlyFlag() {
 * you may not use this file except in compliance with the License.
    public static final String TERM_CATALOG = ModelMessages.model_jdbc_Database;
    @Override
 * Unless required by applicable law or agreed to in writing, software
        this.readOnlyMetaData = readOnlyMetaData;
    }
    private boolean supportsStoredCode = true;
        } else {
        this.databaseProductName = "?"; //$NON-NLS-1$
        this.supportsScroll = supportsScroll;
    @Override
    public boolean supportsStoredCode() {
            debugError(e);


            this.driverName = "?"; //$NON-NLS-1$

            RelationalObjectType.TYPE_TABLE,
        return false;
            this.databaseProductVersion = metaData.getDatabaseProductVersion();
    // Says to ignore DatabaseMetaData.isReadonly() results. It is broken in some drivers (always true), e.g. in Redshift.

    public void setSupportsResultSetScroll(boolean supportsScroll) {
public class JDBCDataSourceInfo extends AbstractDataSourceInfo {
    public JDBCDataSourceInfo(JDBCDatabaseMetaData metaData) {

        try {
            debugError(e);
/*
    public String getDatabaseProductVersion() {
    @Override
import org.jkiss.dbeaver.Log;
        return driverName;
            RelationalObjectType.TYPE_DATA_TYPE
    }
    }
            this.catalogTerm = TERM_CATALOG;
    @Override
    public boolean supportsReferentialIntegrity() {
        }
        return false;

    @Override
import org.jkiss.dbeaver.model.struct.DBSObjectType;

    public void setSupportsReferences(boolean supportsReferences) {
        this.supportedIsolations.add(0, JDBCTransactionIsolation.NONE);
        this.catalogTerm = TERM_CATALOG;
        } catch (Throwable e) {
    public boolean supportsStatementBinding() {
            this.procedureTerm = makeTermString(metaData.getProcedureTerm(), TERM_PROCEDURE);
    }
 */
    private String driverName;
    public boolean isMultipleResultsFetchBroken() {
            Version databaseVersion = getDatabaseVersion();
    }
    private String catalogTerm;
    private static void debugError(Throwable e) {
        return databaseProductName;

        this.dataSource = (JDBCDataSource) container.getDataSource();
    }
    @Override
        return true;
    }

 *
        return driverVersion;
    private boolean supportsScroll;
        this.readOnlyData = readOnly;
                    if (metaData.supportsTransactionIsolationLevel(txi.getCode())) {
        return procedureTerm;
            this.catalogTerm = makeTermString(metaData.getCatalogTerm(), TERM_CATALOG);
 * See the License for the specific language governing permissions and
        this.supportsBatchUpdates = false;
        return false;

        try {
import org.jkiss.dbeaver.model.impl.struct.RelationalObjectType;
}
        } catch (Throwable e) {

    public boolean supportsResultSetLimit() {
    }
    public void setSupportsIndexes(boolean supportsIndexes) {
        if (e.getMessage() == null) {
import org.jkiss.dbeaver.model.messages.ModelMessages;
        this.supportedIsolations = new ArrayList<>();
    public boolean isReadOnlyMetaData() {

                this.driverName = name;
        return true;
            this.databaseProductName = metaData.getDatabaseProductName();
            debugError(e);

        try {
