    }
import org.jkiss.dbeaver.model.exec.DBCException;
    @Override
        return checkConstraintCache.getAllObjects(monitor, this);

        totalBytes = -1;

        if (SQLServerUtils.isDriverBabelfish(getDataSource().getContainer().getDriver())) {
                this,
        super(schema);
        usedBytes = dbResult.getLong("usedSize") * 1024;
    }
    public Collection<SQLServerTableForeignKey> getAssociations(@NotNull DBRProgressMonitor monitor)
import org.jkiss.dbeaver.model.meta.Property;
    }
            return;
    public void enableReferentialIntegrity(@NotNull DBRProgressMonitor monitor, boolean enable) throws DBException {
    private transient volatile long totalBytes = -1;
        try {
                        long schemaId = JDBCUtils.safeGetLong(dbResult, "schema_id");
    public long getTotalBytes(DBRProgressMonitor monitor) throws DBCException {
    public String getChangeReferentialIntegrityStatement(@NotNull DBRProgressMonitor monitor, boolean enable) throws DBException {
        // Nope
            return ENABLE_REFERENTIAL_INTEGRITY_STATEMENT;
                                if (object instanceof SQLServerTableForeignKey) {
import java.sql.ResultSet;
                getDatabase(),
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
                    }
        return DBStructUtils.generateTableDDL(monitor, this, options, false);
    /**
    }
     */
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                        }
                        fetchTableStats(dbResult);
        return super.getRowCount(monitor);
                        SQLServerSchema schema = getDatabase().getSchema(monitor, schemaId);

    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
    }
    private transient volatile long usedBytes = -1;
    @Override

    }
    }
        }
        throws DBException
                getDataSource(),
    }
    @Override
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull SQLServerTable table) throws SQLException {

 *
    @Override
 *
        totalBytes = 0;
        references = null;
    @Association
        }
        getContainer().getIndexCache().clearObjectCache(this);
                    "FROM " +
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
    public boolean supportsChangingReferentialIntegrity(@NotNull DBRProgressMonitor monitor) {
    @Property(viewable = true, category = DBConstants.CAT_STATISTICS, order = 32)

/*
                        if (schema != null) {

            setDefaultTableStats();
    {
        if (enable) {
        return totalBytes;
import org.jkiss.dbeaver.ext.mssql.SQLServerUtils;
    }
                    "WHERE t.object_id = fk.parent_object_id AND tr.object_id=fk.referenced_object_id AND fk.referenced_object_id=?\n" +
/**
    private static final String ENABLE_REFERENTIAL_INTEGRITY_STATEMENT = "ALTER TABLE ? WITH CHECK CHECK CONSTRAINT ALL";
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
                            SQLServerTableBase table = schema.getTable(monitor, tableName);
        }
                    while (dbResult.next()) {
            return dbStat;


    void setDefaultTableStats() {
            throw new DBException("Unable to change referential integrity", e);
            return;
import java.util.Map;
        return true;
            || OPTION_DDL_SKIP_FOREIGN_KEYS.equals(option)
    public long getStatObjectSize() {


                    SQLServerUtils.getSystemTableName(getDatabase(), "foreign_keys") + " fk, " +
import org.jkiss.dbeaver.model.*;
 *
        implements DBPObjectStatistics, DBSCheckConstraintContainer, DBPReferentialIntegrityController, DBSEntityConstrainable {
    @Override
import org.jkiss.dbeaver.model.struct.*;
        throws DBException
            return new SQLServerTableCheckConstraint(table, resultSet);
    public boolean hasStatistics() {
        return true;
    @Nullable
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
        @NotNull
    {
import org.jkiss.dbeaver.model.meta.Association;
    @Override
        totalBytes = dbResult.getLong("totalSize") * 1024;
    @Override
        sql = sql.replace("?", getFullyQualifiedName(DBPEvaluationContext.DDL));
        return getSchema().getForeignKeyCache().getObjects(monitor, getSchema(), this);
        usedBytes = -1;
                session,
                    if (dbResult.next()) {
        }
        @Override
 * SQLServerTable
    public boolean isView()
                            }
                "SELECT t.schema_id as schema_id,t.name as table_name,fk.name as key_name\n" +
        );
        return OPTION_DDL_ONLY_FOREIGN_KEYS.equals(option)
        getContainer().getForeignKeyCache().clearObjectCache(this);
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.Log;

        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load table statistics")) {
    {
            || OPTION_INCLUDE_NESTED_OBJECTS.equals(option);
        if (references != null || monitor == null) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
            return references;
                    this.references = result;
        return usedBytes;
        }
    private transient volatile List<SQLServerTableForeignKey> references;
    @Override
        return totalBytes != -1;
import org.jkiss.dbeaver.model.struct.rdb.DBSCheckConstraintContainer;
        } catch (SQLException e) {
    public synchronized Collection<SQLServerTableCheckConstraint> getCheckConstraints(@NotNull DBRProgressMonitor monitor)
    @Nullable
                true)) {
    @Override
        }
        @Override
    {
        return List.of(





 * Licensed under the Apache License, Version 2.0 (the "License");
    public SQLServerTable(SQLServerSchema schema) {
    @Override
public class SQLServerTable extends SQLServerTableBase
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this,  "Read table references")) {

    @Association
                getSchema().getObjectId(),

    }
    }
        protected SQLServerTableCheckConstraint fetchObject(@NotNull JDBCSession session, @NotNull SQLServerTable table, @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
import org.jkiss.code.Nullable;
    private void readTableStats(DBRProgressMonitor monitor) throws DBCException {
    public List<SQLServerTableForeignKey> getReferences(@NotNull DBRProgressMonitor monitor)
            JDBCPreparedStatement dbStat = session.prepareStatement("SELECT c.* FROM " + SQLServerUtils.getSystemTableName(table.getDatabase(), "check_constraints") + " c WHERE c.parent_object_id=?");
    }

import java.util.Collection;
    static class CheckConstraintCache extends JDBCObjectCache<SQLServerTable, SQLServerTableCheckConstraint> {
            JDBCUtils.executeInMetaSession(monitor, this, "Changing referential integrity", sql);

    private static final Log log = Log.getLog(SQLServerTable.class);
        return DISABLE_REFERENTIAL_INTEGRITY_STATEMENT;
                    "ORDER BY 1,2,3")) {


import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
                                DBSEntityAssociation object = DBUtils.findObject(table.getAssociations(monitor), fkName);
                                    result.add((SQLServerTableForeignKey) object);
 * limitations under the License.
    @Override
    @Property(viewable = true, category = DBConstants.CAT_STATISTICS, order = 31)
    }
 * See the License for the specific language governing permissions and
    public long getUsedBytes(DBRProgressMonitor monitor) throws DBCException {
            }
                        setDefaultTableStats();
                }
    @Override
    void fetchTableStats(JDBCResultSet dbResult) throws SQLException {
        getSchema().resetTableStatistics();
    }

            // DBSEntityConstraintInfo.of(DBSEntityConstraintType.CHECK, SQLServerTableCheckConstraint.class) only as a separate key class
        readTableStats(monitor);

    }
                throw new DBCException(e, session.getExecutionContext());
 * You may obtain a copy of the License at

            } catch (SQLException e) {
        String sql = getChangeReferentialIntegrityStatement(monitor, enable);
        getContainer().getUniqueConstraintCache().clearObjectCache(this);

    @Override
        rowCount = dbResult.getLong("rows");
            DBSEntityConstraintInfo.of(DBSEntityConstraintType.PRIMARY_KEY, SQLServerTableUniqueKey.class),
        throws DBException
                dbStat.setLong(1, getObjectId());
        }
    }
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
                    return result;
                    }
        readTableStats(monitor);
        super(catalog, dbResult, name);
                        String fkName = JDBCUtils.safeGetString(dbResult, "key_name");
    @NotNull
                }
        return getContainer().getUniqueConstraintCache().getObjects(monitor, getSchema(), this);
    @Association
                    List<SQLServerTableForeignKey> result = new ArrayList<>();
                    SQLServerUtils.getSystemTableName(getDatabase(), "tables") + " t, " +
        return false;

    boolean supportsTriggers() {
    public SQLServerTable(@NotNull SQLServerSchema catalog, @NotNull ResultSet dbResult, @NotNull String name) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return super.refreshObject(monitor);
                        String tableName = JDBCUtils.safeGetString(dbResult, "table_name");
    public Collection<SQLServerTableUniqueKey> getConstraints(@NotNull DBRProgressMonitor monitor)
        }
            try (JDBCPreparedStatement dbStat = SQLServerUtils.prepareTableStatisticLoadStatement(
    public List<DBSEntityConstraintInfo> getSupportedConstraints() {
    @Override
package org.jkiss.dbeaver.ext.mssql.model;
import org.jkiss.dbeaver.DBException;

     * Constraint cache implementation
    @NotNull
    {
    @Override
    public CheckConstraintCache getCheckConstraintCache() {
    @NotNull
    private static final String DISABLE_REFERENTIAL_INTEGRITY_STATEMENT = "ALTER TABLE ? NOCHECK CONSTRAINT ALL";
 * Unless required by applicable law or agreed to in writing, software
 */

    }
}
 */
            DBSEntityConstraintInfo.of(DBSEntityConstraintType.UNIQUE_KEY, SQLServerTableUniqueKey.class)

    public Long getRowCount(DBRProgressMonitor monitor) throws DBCException {
    @Property(category = DBConstants.CAT_STATISTICS, viewable = false, expensive = true, order = 30)
        usedBytes = 0;

    }
    }
    }
import java.util.List;
    }

    }
    private final CheckConstraintCache checkConstraintCache = new CheckConstraintCache();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Copyright (C) 2010-2026 DBeaver Corp and others
        }
    public boolean supportsObjectDefinitionOption(@NotNull String option) {

import java.sql.SQLException;


            }
 * you may not use this file except in compliance with the License.
        return checkConstraintCache;
                    SQLServerUtils.getSystemTableName(getDatabase(), "tables") + " tr\n" +
        throws DBException
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
        } catch (SQLException e) {
                            if (table != null) {
    public void setObjectDefinitionText(String source) {
        return totalBytes;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
            throw new DBCException("Error reading table statistics", e);
import java.util.ArrayList;

 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
    }
                                }
        if (hasStatistics()) {
    }
        readTableStats(monitor);
                    } else {
            dbStat.setLong(1, table.getObjectId());

