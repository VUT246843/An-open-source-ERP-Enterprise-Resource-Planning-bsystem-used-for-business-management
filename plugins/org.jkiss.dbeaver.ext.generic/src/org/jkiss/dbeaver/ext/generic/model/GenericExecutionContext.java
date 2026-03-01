                session.setSchema(schemaName);
                String changeQuery = dataSource.getQuerySetActiveDB().replaceFirst("\\?", Matcher.quoteReplacement(schemaName));
                                    selectedEntityName = selectedEntityName.substring(divPos + 1);
        }
    private String selectedEntityName;
        }
            }
                    } else {
        } catch (SQLException e) {
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.runtime.LocalCacheProgressMonitor;
                } catch (Throwable e) {
        return null;
                        autoCommit = txnManager.isAutoCommit();
            if (dataSource.hasSchemas()) {
        return false;
        try {
 * You may obtain a copy of the License at
                if (CommonUtils.isNotEmpty(schemaName)) {
                }
                try {
                                if (divPos != -1) {
import java.sql.SQLException;
                String selectedObjectType = null;
        if (CommonUtils.isEmpty(selectedEntityName)) {
                    }
            && getDefaultObject() instanceof GenericSchema schema
 */

        DBUtils.fireObjectSelect(catalog, true, this);
                    dataSource.setSelectedEntityType(selectedObjectType);
                    return dataSource.getSchema(selectedEntityName);
            entityName = defaultCatalog.getName();
                dataSource.setSelectedEntityType(GenericConstants.ENTITY_TYPE_SCHEMA);
            final DBSObject newDefaultObject = getDefaultObject();
                    txnManager = DBUtils.getTransactionManager(this);
                if (dataSource.hasSchemas()) {
                    log.debug("Catalog change is disabled for legacy drivers");
                    String changeQuery = dataSource.getQuerySetActiveDB().replaceFirst("\\?", Matcher.quoteReplacement(entityName));
    public GenericDataSource getDataSource() {
                    if (CommonUtils.isEmpty(dataSource.getQuerySetActiveDB())) {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return this;

                }
                    }
                    if (catalogs.size() == 1) {

                return !dataSource.getContainer().getDriver().isInternalDriver();
            if (needToSetAutocommit && !autoCommit) {
                    autoCommit = txnManager.isAutoCommit();
                                int divPos = selectedEntityName.lastIndexOf(',');
                return dataSource.hasCatalogs() && info.supportsCatalogSelection();
                if (CommonUtils.isNotEmpty(selectedObjectType)) {
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
            if (CommonUtils.isEmpty(dataSource.getSelectedEntityType())) {
    @Override
    @Override
                            selectedEntityName = JDBCUtils.safeGetStringTrimmed(resultSet, 1);
                        txnManager.setAutoCommit(monitor, true);
                try (JDBCPreparedStatement dbStat = session.prepareStatement(changeQuery)) {
            }
                // Some drivers (eg. Clickhouse) provide both default catalog and schema (the same value)
        GenericDataSource dataSource = getDataSource();
    public void initDefaultsFrom(
                needToSetAutocommit = txnManager != null && isSupportsTransactions() && !dataSource.supportsCatalogChangeInTransaction();
            } else {
        selectedEntityName = catalog.getName();
            }
        if (GenericConstants.ENTITY_TYPE_CATALOG.equals(getDataSource().getSelectedEntityType())
                } else {


                        }
                    try (JDBCPreparedStatement dbStat = session.prepareStatement(dataSource.getQueryGetActiveDB())) {
import org.jkiss.code.NotNull;
import java.util.regex.Matcher;
        }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
            && getDefaultObject() instanceof GenericCatalog catalog
    }
        } else {
                if (dataSource.isSelectedEntityFromAPI()) {

        }
            }
 * limitations under the License.
            }
 * Copyright (C) 2010-2026 DBeaver Corp and others
 * See the License for the specific language governing permissions and
            } else {
import org.jkiss.dbeaver.model.DBUtils;
                    List<GenericCatalog> catalogs = dataSource.getCatalogs();
        GenericDataSource dataSource = this.getDataSource();
 * you may not use this file except in compliance with the License.
                if (CommonUtils.isEmpty(dataSource.getQuerySetActiveDB())) {
                        if (context.supportsCatalogChange()) {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
                if (dataSource.getSelectedEntityType() == null ||
        super(instance, purpose);
            if (CommonUtils.isEmpty(dataSource.getSelectedEntityType())) {
        }
        }
    private void setDefaultSchema(@NotNull DBRProgressMonitor monitor, @NotNull String schemaName) throws DBCException {
    @Override
                    catalogName = null; // Seems to be not supported
        }
        }
                                // [PostgreSQL]
                    needToSetAutocommit = txnManager != null && isSupportsTransactions() && !dataSource.supportsCatalogChangeInTransaction();
                        try {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        if (dataSource.isSelectedEntityFromAPI() || !CommonUtils.isEmpty(dataSource.getQuerySetActiveDB())) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
        }
                    session.setCatalog(catalog.getName());
            if (newDefaultObject != null) {
            }
                    selectedEntityName = schemaName;
        GenericDataSource dataSource = getDataSource();
        return null;
                return CommonUtils.isNotEmpty(dataSource.getQuerySetActiveDB());
                    }
    @Nullable
                } else {
                return !dataSource.hasCatalogs() && dataSource.hasSchemas() && info.supportsSchemaSelection();
                    return selectedEntityName;
                                new LocalCacheProgressMonitor(new VoidProgressMonitor()), selectedEntityName);
        }
        if (oldSelectedSchema != null) {
                /*if (selectedEntityType == null || selectedEntityType.equals(GenericConstants.ENTITY_TYPE_SCHEMA)) */{
        if (GenericConstants.ENTITY_TYPE_SCHEMA.equals(getDataSource().getSelectedEntityType())
                }
            throw new DBCException(e, this);


                    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
        return getDataSource().getDefaultCatalog();
        if (oldSelectedCatalog != null) {
                try {
        @Nullable GenericSchema schema
                        }
    public GenericObjectContainer getDefaultObject() {
                        try (JDBCResultSet resultSet = dbStat.executeQuery()) {
                    }
        GenericSchema oldSelectedSchema = getDefaultSchema();

                    schemaName = session.getSchema();
            if (dataSource.hasCatalogs()) {
            if (defaultSchema != null) {
        return null;
    public String getDefaultCatalogCached() {
        String oldEntityName = selectedEntityName;
            GenericDataSource dataSource = getDataSource();
                    !dataSource.hasSchemas()) {
            }
        if (defaultCatalog != null && context.supportsCatalogChange()) {
                return true;
                String schemaName;
    @Nullable
                return (GenericConstants.ENTITY_TYPE_CATALOG.equals(dataSource.getSelectedEntityType()) || !dataSource.hasSchemas()) && info.supportsCatalogSelection();
    public void setDefaultSchema(@NotNull DBRProgressMonitor monitor, @Nullable GenericSchema schema) throws DBCException {
            return catalog;

        DBSObject oldDefaultObject = getDefaultObject();
 *

            if (!dataSource.hasCatalogs() && dataSource.hasSchemas()) {
        } else if (context.supportsSchemaChange()) {
            }

                        } catch (DBException e) {
                    throw new DBCException("Active catalog can't be changed for this kind of datasource!");
        }
        }
import org.jkiss.dbeaver.model.struct.DBSObject;
            } finally {
                txnManager.setAutoCommit(monitor, false);
            // Note: both catalog and schema might exist. And the active object must be the most concrete one (schema if exists)
        selectedEntityName = schemaName;
            } else if (GenericConstants.ENTITY_TYPE_SCHEMA.equals(dataSource.getSelectedEntityType())) {
            }
                            session.setCatalog(entityName);

                }
                if (needToSetAutocommit) {
                        // Use JDBC API to change entity
                }
    public DBCCachedContextDefaults getCachedDefault() {
    }
                String changeQuery = dataSource.getQuerySetActiveDB().replaceFirst("\\?", Matcher.quoteReplacement(catalog.getName()));
        try (JDBCSession session = openSession(monitor, DBCExecutionPurpose.UTIL, TASK_TITLE_SET_SCHEMA)) {
            }
                }
                }
        }
    }
                if (needToSetAutocommit && !autoCommit) {
            if (dataSource.isSelectedEntityFromAPI()) {
            DBUtils.fireObjectSelect(oldSelectedSchema, false, this);
                if (!dataSource.getContainer().getDriver().isInternalDriver()) {
                    !dataSource.hasCatalogs()) {
                    try (JDBCPreparedStatement dbStat = session.prepareStatement(changeQuery)) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull DBRProgressMonitor monitor,
    private static final Log log = Log.getLog(GenericExecutionContext.class);

        try (JDBCSession session = openSession(monitor, DBCExecutionPurpose.META, "Determine default catalog/schema")) {
                try (JDBCPreparedStatement dbStat = session.prepareStatement(changeQuery)) {

                    txnManager.setAutoCommit(monitor, false);
    @Nullable
                setDefaultSchema(monitor, bootstrap.getDefaultSchemaName());
            GenericDataSource dataSource = getDataSource();
        @NotNull GenericCatalog catalog,
    }
                    selectedEntityName = null;
    public boolean refreshDefaults(@NotNull DBRProgressMonitor monitor, boolean useBootstrapSettings) throws DBException {
        DBCTransactionManager txnManager = null;
    public GenericSchema getDefaultSchema() {
        String entityName = null;
                    log.debug(e);
            }
                return !dataSource.getContainer().getDriver().isInternalDriver();
        if (!CommonUtils.isEmpty(selectedEntityName)) {
    @Nullable
    ) throws DBCException {
        DBUtils.fireObjectSelect(schema, true, this);

                selectedEntityName = dataSource.getSchemas().getFirst().getName();

import org.jkiss.dbeaver.model.impl.jdbc.JDBCRemoteInstance;
import org.jkiss.dbeaver.model.exec.*;
                        dbStat.execute();
            } else {
    @Nullable
                        log.debug("Catalog/schema switch is disabled for legacy drivers");
    }
        return false;
        if (!CommonUtils.isEmpty(selectedEntityName)) {
        dataSource.setSelectedEntityType(GenericConstants.ENTITY_TYPE_CATALOG);
                        throw new DBCException("Active database can't be changed for this kind of datasource!");
            GenericDataSource dataSource = getDataSource();
            if (CommonUtils.isEmpty(dataSource.getQueryGetActiveDB())) {
            DBPConnectionBootstrap bootstrap = getBootstrapSettings();
        return false;
                if (dataSource.getSelectedEntityType() == null ||
    }
            } else {
            if (!CommonUtils.isEmpty(bootstrap.getDefaultSchemaName()) && this.supportsSchemaChange()) {
        GenericDataSource dataSource = getDataSource();
                    dataSource.setSelectedEntityFromAPI(true);
                    catalogName = session.getCatalog();
            DBCTransactionManager txnManager = null;
        }
                            }


            log.debug("Error detecting active object", e);
            GenericSchema defaultSchema = context.getDefaultSchema();
        GenericCatalog defaultCatalog = context.getDefaultCatalog();
            return schema;
        if (useBootstrapSettings) {
            if (dataSource.isSelectedEntityFromAPI()) {
 *
                }
        if (entityName != null) {
import org.jkiss.code.Nullable;
    }
                if (CommonUtils.isEmpty(dataSource.getQuerySetActiveDB())) {
    public GenericCatalog getDefaultCatalog() {
            if (dataSource.hasCatalogs() && dataSource.getCatalogs().size() == 1) {
    @Override
    }
public class GenericExecutionContext extends JDBCExecutionContext implements DBCExecutionContextDefaults<GenericCatalog, GenericSchema> {

    }
                DBUtils.fireObjectSelectionChange(oldDefaultObject, newDefaultObject, this);
                }
    public DBCExecutionContextDefaults<?,?> getContextDefaults() {
import org.jkiss.utils.CommonUtils;
                }
            DBUtils.fireObjectSelect(oldSelectedCatalog, false, this);
        ) {
        }
        selectedEntityName = null;
        }
                    if (!dataSource.getContainer().getDriver().isInternalDriver()) {
            if (dataSource.isSelectedEntityFromAPI()) {
    }
        }
            }
        if (!CommonUtils.equalObjects(oldEntityName, selectedEntityName)) {
import java.util.List;
            }
                entityName = defaultSchema.getName();
                return (GenericConstants.ENTITY_TYPE_SCHEMA.equals(dataSource.getSelectedEntityType()) || !dataSource.hasCatalogs()) && info.supportsSchemaSelection();
    @Override
                }
        try (JDBCSession session = openSession(monitor, DBCExecutionPurpose.UTIL, "Set active catalog")) {
    void determineSelectedEntity(@NotNull DBRProgressMonitor monitor) {
                } else if (dataSource.hasCatalogs()) {
 *
    }
            if (dataSource.isSelectedEntityFromAPI()) {
                            session.setSchema(entityName);

    public GenericExecutionContext(@NotNull JDBCRemoteInstance instance, @NotNull String purpose) {
    @Override
                    dataSource.getSelectedEntityType().equals(GenericConstants.ENTITY_TYPE_CATALOG) ||
                throw new DBCException(e, this);
                } catch (Throwable e) {
                            log.debug("Error reading schema in the first catalog: " + e.getMessage());
        boolean autoCommit = true;
                selectedEntityName = entityName;
    }
        } catch (Throwable e) {
        }
                        if (!autoCommit) {
            boolean autoCommit = true;
        GenericCatalog oldSelectedCatalog = getDefaultCatalog();
        ) {
            log.debug("Null current schema");
        if (schema == null) {
        return getDataSource().getDefaultSchema();
 * DBeaver - Universal Database Manager
                try {
    @Override
                    dataSource.getSelectedEntityType().equals(GenericConstants.ENTITY_TYPE_SCHEMA) ||
                }
                    }
        @NotNull DBRProgressMonitor monitor,
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ext.generic.GenericConstants;
 * Licensed under the Apache License, Version 2.0 (the "License");

        // Get selected entity (catalog or schema)
            try (JDBCSession session = openSession(monitor, DBCExecutionPurpose.UTIL, "Set active catalog")) {
            return false;
                txnManager = DBUtils.getTransactionManager(this);
                    schemaName = null; // Seems to be not supported
                    return dataSource.getCatalog(selectedEntityName);
                    selectedObjectType = GenericConstants.ENTITY_TYPE_SCHEMA;
                    throw new DBCException("Active schema can't be changed for this kind of datasource!");
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                        }
        if (!CommonUtils.isEmpty(selectedEntityName)) {
    }
 * GenericExecutionContext
                            if (!CommonUtils.isEmpty(selectedEntityName)) {
                return CommonUtils.isNotEmpty(dataSource.getQuerySetActiveDB());
                    return selectedEntityName;
    public void setDefaultCatalog(
/**
        setDefaultSchema(monitor, schema.getName());
    public String getDefaultSchemaCached() {
                                }
            determineSelectedEntity(monitor);
                }
            if (dataSource.hasCatalogs()) {
                    selectedEntityName = catalogName;
    public boolean supportsSchemaChange() {

                    if (!autoCommit) {

        dataSource.setSelectedEntityType(GenericConstants.ENTITY_TYPE_SCHEMA);
        if (!(dataSource.getInfo() instanceof GenericDataSourceInfo info)) {
import org.jkiss.dbeaver.Log;
            throw new DBCException(e, this);
            selectedEntityName = context.selectedEntityName;
import org.jkiss.dbeaver.model.connection.DBPConnectionBootstrap;
    ) throws DBCException {
                String catalogName;
                            txnManager.setAutoCommit(monitor, true);
        if (!(dataSource.getInfo() instanceof GenericDataSourceInfo info)) {
            if (dataSource.hasCatalogs() && GenericConstants.ENTITY_TYPE_CATALOG.equals(dataSource.getSelectedEntityType())) {
                }
                if (CommonUtils.isNotEmpty(catalogName)) {
    @Override
                return dataSource.getCatalog(selectedEntityName);
        } catch (SQLException e) {
            }
/*
            } else {
                        }
            } catch (SQLException e) {
package org.jkiss.dbeaver.ext.generic.model;
        if (dataSource.isSelectedEntityFromAPI() || !CommonUtils.isEmpty(dataSource.getQuerySetActiveDB())) {
                    dbStat.execute();
        } finally {

        @NotNull GenericExecutionContext context

            } else if (dataSource.hasSchemas() && dataSource.getSchemas().size() == 1) {
                selectedEntityName = dataSource.getCatalogs().getFirst().getName();
                if (dataSource.getSelectedEntityType() == null || dataSource.getSelectedEntityType().equals(GenericConstants.ENTITY_TYPE_CATALOG)) {

                    // FIXME: Do not call setCatalog/Schema on legacy ODBC driver
    }
        }
    @NotNull
            }
                    }
                }
                            resultSet.next();
        return new DBCCachedContextDefaults(getDefaultCatalogCached(), getDefaultSchemaCached());
            // If we have only one catalog then it is our selected entity
                    if (needToSetAutocommit) {
                // So when reading schema do not check entity type
    @Nullable
                } catch (SQLException e) {

            } else if (dataSource.hasSchemas()) {
            }
            }
                    return dataSource.getSchema(selectedEntityName);

                }
            }
                    selectedObjectType = GenericConstants.ENTITY_TYPE_CATALOG;
                    log.debug(e);
                            return catalogs.getFirst().getSchema(
            return;
        boolean needToSetAutocommit = false;

                }
}
            }
    }
        }
    }
                dataSource.setSelectedEntityType(GenericConstants.ENTITY_TYPE_CATALOG);
            boolean needToSetAutocommit = false;

                    dbStat.execute();
 */
        }

        GenericDataSource dataSource = getDataSource();
    @NotNull
                    log.debug(e);
    @Override
    public boolean supportsCatalogChange() {
                }
                }
        return (GenericDataSource) super.getDataSource();
            if (dataSource.hasCatalogs()) {
            GenericDataSource dataSource = getDataSource();
                        } else {
