    @Override
        final JDBCPreparedStatement dbStat = session.prepareStatement(sql);
        final JDBCPreparedStatement dbStat = session.prepareStatement(sql);
        dbStat.setString(1, container.getName());
        String description = JDBCUtils.safeGetString(dbResult, CubridConstants.COMMENT);
                    while (dbResult.next()) {
    @Nullable
        @NotNull JDBCSession session,
	            }
        return new CubridTrigger(cubridTable, name, description, dbResult);
        boolean supportMultiSchema = ((CubridDataSource) container.getDataSource()).getSupportMultiSchema();
    @NotNull
            @NotNull GenericStructContainer container,
            throws SQLException {
                + (supportMultiSchema ? "and t1.owner.name = t2.owner_name" : "");
                + "a.class_name = i.class_name AND a.attr_name = i.attr_name "
    @Override
    @NotNull
        Integer keyOrder = JDBCUtils.safeGetInteger(dbResult, "key_order") + 1;
        if (tableType != null && isView(tableType)) {
                        if (type.equalsIgnoreCase(CubridConstants.TERM_PROCEDURE)) {
 *     http://www.apache.org/licenses/LICENSE-2.0
    public JDBCStatement prepareSynonymsLoadStatement(
    @NotNull
                    CubridUser user = new CubridUser(dataSource, name, description);
                        }
        String fallbackDDL = "-- View definition not available";
            @NotNull JDBCSession session,
            @NotNull JDBCSession session,
                    String name = JDBCUtils.safeGetStringTrimmed(dbResult, CubridConstants.NAME);
        } catch (SQLException e) {
    @Override
        String name = JDBCUtils.safeGetStringTrimmed(dbResult, "synonym_name");
    @Override
                        String type = JDBCUtils.safeGetString(dbResult, "sp_type");
    public GenericSynonym createSynonymImpl(
 * limitations under the License.
    @NotNull
 * Copyright (C) 2010-2026 DBeaver Corp and others
        return session.getMetaData().getImportedKeys(null, null, this.getTableOrViewName(forTable)).getSourceStatement();
    }
                dbStat.setString(1, container.getName());
import org.jkiss.dbeaver.model.impl.jdbc.JDBCConstants;
        dbStat.setString(1, owner.getName());
        @NotNull JDBCResultSet dbResult)
    }

        dbStat.setString(2, table.getName());
            String sql = "select * from db_stored_procedure where owner = ?";
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
    @NotNull
                + "FROM db_attribute a LEFT JOIN (SELECT k.key_attr_name AS attr_name, "
                + "where t1.name = t2.trigger_name and t1.owner.name = ? and t2.target_class_name = ? \n"
            throws SQLException {

            @NotNull GenericStructContainer container,
    @NotNull
import org.jkiss.dbeaver.ext.cubrid.CubridConstants;
        dbStat.setString(2, owner.getName());
 *
                            ddlFragments.add(ddlFragment.trim());
                sql.append("AND a.owner_name = ? ");
import org.jkiss.code.NotNull;
 * DBeaver - Universal Database Manager
        try (JDBCPreparedStatement dbStat = session.prepareStatement(sql)) {
            sql.append("WHERE a.class_name = ? ");
import org.jkiss.dbeaver.ext.generic.model.*;
        dbStat.setString(1, container.getName());
    public boolean supportsDatabaseTriggers(@NotNull GenericDataSource dataSource) {
    @Override
                        viewName = JDBCUtils.safeGetStringTrimmed(dbResult, "View");
    }
    @Nullable
        }
    public JDBCStatement prepareForeignKeysLoadStatement(
    }
    @Override
            @Nullable String tableName,
        String tableName = JDBCUtils.safeGetString(dbResult, "target_class_name");
            @NotNull GenericStructContainer container)
        String name = JDBCUtils.safeGetString(dbResult, CubridConstants.NAME);

    public GenericSequence createSequenceImpl(
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        if (base != null) {
            @NotNull GenericStructContainer owner,
                + "FROM db_index i JOIN db_index_key k ON i.class_name = k.class_name "
        return true;
        }
        sql = ((CubridDataSource) container.getDataSource()).wrapShardQuery(sql);
            @NotNull JDBCSession session,
import org.jkiss.dbeaver.model.exec.DBCQueryTransformer;
            } else {
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
        }
    public CubridTrigger createContainerTriggerImpl(
    }
    @Nullable
        final JDBCPreparedStatement dbStat = session.prepareStatement(sql);
        @NotNull DBRProgressMonitor monitor,
                return ((CubridView) base).getUniqueName();
                        if (((CubridDataSource) container.getDataSource()).isSupportDbmsOutputPlCsql()) {
            dbStat.executeStatement();
    @Nullable
        String description = JDBCUtils.safeGetString(dbResult, CubridConstants.COMMENT);
        return null;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override

            @Nullable GenericTableBase forTable)
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
                    String description = JDBCUtils.safeGetStringTrimmed(dbResult, CubridConstants.COMMENT);
        @Nullable GenericCatalog catalog) throws DBException {
import org.jkiss.dbeaver.ext.cubrid.model.*;
                        if (CommonUtils.isNotEmpty(ddlFragment)) {
    @NotNull
        }
            log.error("Cannot load view ddl", e);
        return fallbackDDL;
import org.jkiss.utils.CommonUtils;
        sql = ((CubridDataSource) container.getDataSource()).wrapShardQuery(sql);
            @NotNull JDBCSession session,
                + (multiSchema ? "AND a.owner_name = i.owner_name " : ""));
        @Nullable GenericMetaObject pkObject,

        }

                        } else if (type.equalsIgnoreCase(CubridConstants.TERM_FUNCTION)) {
    public GenericTableBase createTableImpl(
    }
    @Override
    @Override
    }
            throws SQLException {
        return dbStat;
    @Nullable
            }
                            procedureType = DBSProcedureType.UNKNOWN;
import org.jkiss.dbeaver.DBException;

            String sql = String.format("show create view %s", object.getFullyQualifiedName(DBPEvaluationContext.DDL));
        dbStat.setString(1, table.getName());
            }
        return true;
    }

    public boolean isTableColumnCommentEditable() {
        @NotNull GenericDataSource dataSource,
    @Override
        sql.append("SELECT a.*, a.def_order + 1 AS ref_order, i.is_foreign_key "
    }
            if (multiSchema) {
                    while (dbResult.next()) {
        } catch (SQLException e) {
                    if (defaultUser.equalsIgnoreCase(user.getName())) {
                + (supportMultiSchema ? "and t1.owner.name = t2.owner_name" : "");
 *
        try (JDBCSession session = DBUtils.openMetaSession(monitor, object, "Load view ddl")) {
            sql = ((CubridDataSource) object.getDataSource()).wrapShardQuery(sql);
        }
            dbStat.setString(4, table.getSchema().getName());
    }
 * Unless required by applicable law or agreed to in writing, software
                    }
    }
            @Nullable GenericTableBase object,
        @NotNull JDBCSession session,
        @NotNull JDBCSession session,

        return true;
        return dbStat;
                        user.setVirtual(true);
        String sql = "select *, t1.index_name as PK_NAME from db_index t1 join db_index_key t2 \n"
                }
    @Nullable
        String tableType = JDBCUtils.safeGetStringTrimmed(dbResult, JDBCConstants.TABLE_TYPE);
        String sql = "select * from db_synonym where synonym_owner_name = ?";
    }
            @NotNull JDBCResultSet dbResult)
            @NotNull JDBCSession session,


    public JDBCStatement prepareContainerTriggersLoadStatement(
            throws DBException {
        String sql = "select t1.*, t2.*, t1.owner.name from db_trigger as t1, db_trig as t2 \n"
 * See the License for the specific language governing permissions and
        return new CubridQueryPlanner((CubridDataSource) dataSource);
        @NotNull GenericStructContainer owner,
            @NotNull JDBCSession session,
    public JDBCStatement prepareTableColumnLoadStatement(
    @NotNull
                + " where a.owner_name = ? and p.partition_class_name is null";
    public GenericTableConstraintColumn[] createConstraintColumnsImpl(
            return new CubridView(container, tableName, tableType, dbResult);
        return dbStat;
import org.jkiss.dbeaver.model.exec.DBCQueryTransformProvider;
    public DBCQueryPlanner getQueryPlanner(@NotNull GenericDataSource dataSource) {
            throws DBException {
        return null;
        StringBuilder sql = new StringBuilder();
            @NotNull JDBCSession session,
    }

        if (forTable != null) {
        String tableName = JDBCUtils.safeGetString(dbResult, JDBCConstants.TABLE_NAME);
            dbStat.setString(1, forTable.getName());
        sql = ((CubridDataSource) container.getDataSource()).wrapShardQuery(sql);
            @NotNull GenericStructContainer container,
        String isPrimary = JDBCUtils.safeGetString(dbResult, "is_primary_key");
                    String ddl = "create or replace view " + object.getFullyQualifiedName(DBPEvaluationContext.DDL) + " as " + String.join(" union all ", ddlFragments);
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        }
                    }
}

    @Override
        @NotNull GenericUniqueKey object,
        }
        GenericTableBase table = createTableOrViewImpl(owner, tableName, tableType, dbResult);
    public JDBCStatement prepareTableLoadStatement(
            return DBSEntityConstraintType.PRIMARY_KEY;

        String name = JDBCUtils.safeGetStringTrimmed(dbResult, "key_attr_name");
    public void loadProcedures(
import org.jkiss.dbeaver.model.exec.DBCQueryTransformType;
public class CubridMetaModel extends GenericMetaModel implements DBCQueryTransformProvider {
import java.util.Map;
                        }
    }
        return dbStat;
                + " when class_type = 'VCLASS' then 'VIEW' end as TABLE_TYPE,\r\n"
                + " left join db_partition p on a.class_name = p.partition_class_name\r\n"
        @NotNull JDBCResultSet dbResult) {
                        } else {
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
        return new CubridTrigger(table, name, description, dbResult);
                            code = JDBCUtils.safeGetString(dbResult, "code");
    }
    }
                    String defaultUser = ((CubridDataSource) dataSource).getCurrentUser();
    }
                        String description = JDBCUtils.safeGetString(dbResult, CubridConstants.COMMENT);
import org.jkiss.dbeaver.model.exec.plan.DBCQueryPlanner;
                dbStat.setString(2, owner.getName());
        CubridTable table = (CubridTable) forTable;
    }
        dbStat.setString(1, container.getName());
                while (dbResult.next()) {
        sql = ((CubridDataSource) container.getDataSource()).wrapShardQuery(sql);
    @Override
        @Nullable String triggerName,
                            procedureType = DBSProcedureType.FUNCTION;
package org.jkiss.dbeaver.ext.cubrid.model.meta;
                return ((CubridTable) base).getUniqueName();
        if (isPrimary.equals("YES")) {

                + (table.getDataSource().getSupportMultiSchema() ? "and t1.owner_name = ? and t2.owner_name = ?" : "");
    }
        return users;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    @Override
        String sql = "select * from db_user";
import org.jkiss.dbeaver.model.sql.format.SQLFormatUtils;
    public CubridTrigger createTableTriggerImpl(
                        }
            throws SQLException {
    @Override
 * you may not use this file except in compliance with the License.
            @Nullable String objectName)
/*
    @Nullable
    }
    @Override
            throws SQLException {
            @NotNull JDBCResultSet dbResult)
    @NotNull
                }
        return dbStat;

import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
        @NotNull JDBCResultSet dbResult)
        List<GenericSchema> users = new ArrayList<>();
                    String viewName = null;
    @NotNull
                            procedureType = DBSProcedureType.PROCEDURE;
    @NotNull
                + " group by class_name) b on a.class_name = b.class_name\r\n"
            return DBSEntityConstraintType.UNIQUE_KEY;
 * You may obtain a copy of the License at
    public boolean supportsTriggers(@NotNull GenericDataSource dataSource) {
        } else {
            return new QueryTransformerLimitCubrid();
            throws SQLException {
        }
        return true;
            @Nullable JDBCResultSet dbResult) {

        try (JDBCSession session = DBUtils.openMetaSession(monitor, container, "Load procedures")) {
            @Nullable GenericTableBase table)
        boolean multiSchema = forTable != null && ((CubridDataSource) forTable.getDataSource()).getSupportMultiSchema();
    @Override
                        String code = null;
            @NotNull DBRProgressMonitor monitor,
                        container.addProcedure(new CubridProcedure(container, procedureName, description, procedureType, code, returnType));
            @Nullable String tableType,
            @NotNull GenericStructContainer container)

    public JDBCStatement prepareSequencesLoadStatement(
                    }
            @NotNull GenericStructContainer container,
        @NotNull GenericMetaObject tableObject,
        String name = JDBCUtils.safeGetString(dbResult, CubridConstants.NAME);
        dbStat.setString(1, container.getName());
    @NotNull
        return new GenericTableConstraintColumn[] {
                    List<String> ddlFragments = new ArrayList<>();
import java.util.ArrayList;
            }
            log.error("Cannot load user", e);
                        return fallbackDDL;
            try (JDBCPreparedStatement dbStat = session.prepareStatement(sql)) {
    @NotNull
            @NotNull JDBCResultSet dbResult)
    public List<GenericSchema> loadSchemas(
        final JDBCPreparedStatement dbStat = session.prepareStatement(sql);
    @Override
    @Override
                    return SQLFormatUtils.formatSQL(object.getDataSource(), ddl);

            if (multiSchema) {

                    }
                + "i.class_name, i.is_foreign_key "
    @Override
            }
        String sql = "select a.*,a.class_name as TABLE_NAME, case when class_type = 'CLASS' then 'TABLE'\r\n"
            @NotNull JDBCSession session,
    }
        @NotNull GenericView object,
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaObject;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        sql.append("ORDER BY def_order");
                        DBSProcedureType procedureType;
        if (type == DBCQueryTransformType.RESULT_SET_LIMIT) {
    @NotNull
        return dbStat;
        DBRProgressMonitor monitor = dbResult.getSession().getProgressMonitor();
            @NotNull GenericStructContainer owner,
                        String procedureName = JDBCUtils.safeGetString(dbResult, "sp_name");
    @Override
    }
                + "on t1.index_name = t2.index_name where is_unique = 'YES' and t1.class_name = ? and t2.class_name = ? \n"
            try (JDBCResultSet dbResult = dbStat.getResultSet()) {

 * Licensed under the Apache License, Version 2.0 (the "License");
        ((CubridDataSource) owner.getDataSource()).wrapShardQuery(sql);
            @NotNull GenericStructContainer container,
        @NotNull GenericTableBase table,
            sql = ((CubridDataSource) container.getDataSource()).wrapShardQuery(sql);
        @NotNull GenericStructContainer container,


                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
    public JDBCStatement prepareTableTriggersLoadStatement(
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
import org.jkiss.code.Nullable;
        final JDBCPreparedStatement dbStat = session.prepareStatement(sql);
        String name = JDBCUtils.safeGetStringTrimmed(dbResult, CubridConstants.NAME);
 *
        GenericTableColumn tableColumn = parent.getAttribute(session.getProgressMonitor(), name);
            throws SQLException {
    @Override
        @NotNull JDBCSession session,
            @NotNull GenericStructContainer owner,
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
import java.util.List;
            throw new DBException("Load procedures failed", e);
                + " a.comment as REMARKS, b.current_val from db_class a LEFT JOIN\r\n"
            throws SQLException, DBException {
            throws DBException {
    public String getTableOrViewName(@Nullable GenericTableBase base) {
    @NotNull
            @Nullable GenericTableBase forTable)
        sql = ((CubridDataSource) owner.getDataSource()).wrapShardQuery(sql);
            @NotNull GenericStructContainer container)
    public String getViewDDL(
        return new CubridTable(container, tableName, tableType, dbResult);
        return true;
                + " (select class_name, current_val from db_serial where owner.name = ?\r\n"
        String sql = "select *, owner.name from db_serial where owner.name = ?";
        return new CubridSequence(container, name, dbResult);
 */

    @Override
        final JDBCPreparedStatement dbStat = session.prepareStatement(sql);
            if (base.isView()) {
            }
import org.jkiss.dbeaver.model.DBUtils;
                + "where t1.name = t2.trigger_name and t1.owner.name = ?\n"
    @Override
        String sql = "select t1.*, t2.*, t1.owner.name from db_trigger as t1, db_trig as t2 \n"
        final JDBCPreparedStatement dbStat = session.prepareStatement(sql.toString());
        sql = ((CubridDataSource) owner.getDataSource()).wrapShardQuery(sql);
            @NotNull JDBCSession session,

    @Nullable
    public JDBCStatement prepareUniqueConstraintsLoadStatement(
            @Nullable GenericTableBase forTable)
import org.jkiss.dbeaver.Log;
        @NotNull Map<String, Object> options) throws DBException {
        String owner = JDBCUtils.safeGetString(dbResult, "target_owner_name");
    }
    }
            }
            throws DBException {
    @Nullable
import java.sql.SQLException;
    public GenericTableBase createTableOrViewImpl(
            throws DBException {

              new GenericTableConstraintColumn(object, tableColumn, keyOrder) };
                        String ddlFragment = JDBCUtils.safeGetStringTrimmed(dbResult, "Create View");
                + "AND i.index_name = k.index_name WHERE i.is_foreign_key = 'YES') i ON "
    public DBCQueryTransformer createQueryTransformer(@NotNull DBCQueryTransformType type) {
            @NotNull JDBCSession session,
    public boolean supportsUniqueKeys() {
                        String returnType = JDBCUtils.safeGetString(dbResult, "return_type");
        String description = JDBCUtils.safeGetString(dbResult, CubridConstants.COMMENT);

        CubridTable cubridTable = (CubridTable) container.getDataSource().findTable(monitor, null, owner, tableName);

                + (multiSchema ? ", i.owner_name " : "")

        }
        boolean supportMultiSchema = ((CubridDataSource) table.getDataSource()).getSupportMultiSchema();
            try (JDBCPreparedStatement dbStat = session.prepareStatement(sql)) {
    @Override
    public boolean isTableCommentEditable() {
    }
        sql = ((CubridDataSource) dataSource).wrapShardQuery(sql);
        } catch (SQLException e) {
        if (table.getDataSource().getSupportMultiSchema()) {
            throws DBException {
    @Nullable
            dbStat.setString(3, table.getSchema().getName());
    public DBSEntityConstraintType getUniqueConstraintType(@NotNull JDBCResultSet dbResult) throws DBException {
            @NotNull GenericStructContainer owner,

        @NotNull GenericTableBase parent,
                    if (CommonUtils.isEmpty(viewName) || CommonUtils.isEmpty(ddlFragments)) {
        dbStat.setString(2, table.getName());
    private static final Log log = Log.getLog(CubridMetaModel.class);
        return new CubridSynonym(container, name, description, dbResult);
        return table;
        return dbStat;
            @NotNull GenericObjectContainer container)
    }
import org.jkiss.dbeaver.ext.cubrid.model.plan.CubridQueryPlanner;
        if (forTable != null) {
                    users.add(user);
