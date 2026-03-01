import org.jkiss.code.Nullable;
}        super();
        }

import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                "SELECT T1.trigname \n" +
 * limitations under the License.
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
import org.jkiss.dbeaver.DBDatabaseException;
                }
                        "WHERE T2.tabid = T1.tabid " + (table != null ? "AND T2.tabname = ?" : "");
 * Unless required by applicable law or agreed to in writing, software
/**
                        result.add(trigger);
    public String getTriggerDDL(@NotNull DBRProgressMonitor monitor, @NotNull GenericTrigger trigger) throws DBException {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        // Some old drivers can return object names with spaces around. And we can't create names with spaces. So let's trim them.
        }
        return null;
 */
        return dbStat;

    }
                            continue;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    @NotNull

            return null;
    }
    public boolean isTrimObjectNames() {
    @Override
    @Override
        return true;
        JDBCPreparedStatement dbStat = session.prepareStatement(query);
                        if (name == null) {
                dbStat.setString(1, table.getName());
            String query =
import org.jkiss.dbeaver.model.DBUtils;
            triggerName = JDBCUtils.safeGetString(resultSet, "TRIGGER_NAME");
        return new InformixTrigger(genericTableBase, triggerName, resultSet);
    	// Triggers, Serials
    @NotNull
    @Override
import org.jkiss.dbeaver.ext.generic.model.*;
            throw new DBDatabaseException(e, container.getDataSource());

        @NotNull GenericTableBase sourceObject,
    }
                        name = name.trim();
import org.jkiss.dbeaver.DBException;
    }
 * You may obtain a copy of the License at
        }
        if (triggerName == null) {
    }
    public GenericTableTrigger createTableTriggerImpl(@NotNull JDBCSession session, @NotNull GenericStructContainer container, @NotNull GenericTableBase genericTableBase, String triggerName, @NotNull JDBCResultSet resultSet) {
        @NotNull DBRProgressMonitor monitor,
        @NotNull Map<String, Object> options) throws DBException {
            try (JDBCPreparedStatement dbStat = session.prepareStatement(query)) {
    public boolean supportNestedForeignKeys() {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * distributed under the License is distributed on an "AS IS" BASIS,

 *
    
 *
        return InformixUtils.getViewSource(monitor, sourceObject);
    }
import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyModifyRule;
    @Override
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;


        triggerName = triggerName.trim();
import org.jkiss.dbeaver.ext.informix.InformixUtils;
 * Licensed under the Apache License, Version 2.0 (the "License");
    	return tableDDL + InformixUtils.getTriggerDDL(monitor, sourceObject);

        }
    }
        if (table != null) {
public class InformixMetaModel extends GenericMetaModel

    }
import org.jkiss.code.NotNull;

        return true;

        return InformixUtils.getProcedureSource(monitor, sourceObject);

    public String generateOnUpdateFK(@NotNull DBSForeignKeyModifyRule updateRule) {
    	String tableDDL = super.getTableDDL(monitor, sourceObject, options);
    }
package org.jkiss.dbeaver.ext.informix.model;
 * you may not use this file except in compliance with the License.

    public List<InformixTrigger> loadTriggers(@NotNull DBRProgressMonitor monitor, @NotNull GenericStructContainer container, @Nullable GenericTableBase table) throws DBException {
{
    }
    }
 *
    public boolean supportsTriggers(@NotNull GenericDataSource dataSource) {

    }
import java.util.Map;
import org.jkiss.utils.CommonUtils;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
                    while (dbResult.next()) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
                List<InformixTrigger> result = new ArrayList<>();
import java.sql.SQLException;
                        String name = JDBCUtils.safeGetString(dbResult, 1);
        return true;
    public String generateOnDeleteFK(@NotNull DBSForeignKeyModifyRule deleteRule) {
            return "ON DELETE CASCADE";
        @NotNull DBRProgressMonitor monitor,
/*
            }
    }
                "WHERE T2.tabid = T1.tabid AND T2.tabname = ?";
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {

    @Override
        } catch (SQLException e) {
                        InformixTrigger trigger = new InformixTrigger(table, name, dbResult);
        assert table != null;
    private static final Log log = Log.getLog(InformixMetaModel.class);
        return InformixUtils.getTriggerDDL(monitor, trigger);
                    }
    public String getProcedureDDL(@NotNull DBRProgressMonitor monitor, @NotNull GenericProcedure sourceObject) throws DBException {
    @Override

        return false;
import java.util.List;
        if (deleteRule != null && deleteRule.getId().equals("CASCADE")) {
    @Override
        }
                "FROM informix.systriggers AS T1, informix.systables AS T2 \n" +
            dbStat.setString(1, table.getName());
 */
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.Log;

        return false;

    	// 
    }
    @Override
        String query = "SELECT T1.trigname as TRIGGER_NAME, T1.*, T2.tabname AS OWNER FROM informix.systriggers AS T1, informix.systables AS T2 \n" +
    public InformixMetaModel() {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
                return result;
 * InformixDataSource
        @NotNull Map<String, Object> options) throws DBException {
    @Override
 * DBeaver - Universal Database Manager
    @Override
        return false;
    public boolean supportsTableDDLSplit(@NotNull GenericTableBase sourceObject) {
    public JDBCStatement prepareTableTriggersLoadStatement(@NotNull JDBCSession session, @NotNull GenericStructContainer container, @Nullable GenericTableBase table) throws SQLException {
        return null;
                        }
    @Override
    @Override

    }

        if (CommonUtils.isEmpty(triggerName)) {
    @Override
    public String getTableDDL(
        @NotNull GenericView sourceObject,
    public boolean hasFunctionSupport() {
    public boolean isFKConstraintWordDuplicated() {
    @Override

        try (JDBCSession session = DBUtils.openMetaSession(monitor, container, "Read triggers")) {

import java.util.ArrayList;
    public String getViewDDL(
