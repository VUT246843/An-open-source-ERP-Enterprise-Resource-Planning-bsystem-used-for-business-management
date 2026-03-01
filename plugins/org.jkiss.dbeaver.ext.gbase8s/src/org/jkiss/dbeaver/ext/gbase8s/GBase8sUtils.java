 * distributed under the License is distributed on an "AS IS" BASIS,
                + "join systriggers tr on tr.tabid = ta.tabid " + "join systrigbody tb on tb.trigid = tr.trigid "
import org.jkiss.dbeaver.ext.generic.model.GenericProcedure;
        String sqlTrigger = String.format("select tb.data " + "from systables ta "
        }
        for (String o : value) {
                        + "where datakey='T' and p.procname = '%s'" + "order by b.procid, b.seqno",
            // NOT APPLY .TRIM IN 'O' VARIABLE, PROBLEM TO RENDERIZE PROCEDURE BECAUSE LINE
 * Copyright (C) 2010-2024 DBeaver Corp and others
            throw new DBException("Can't read source code of '" + dbObjectName + "'", e);
            sbResult.append(o);
 * @author Chao Tian
    // Triggers
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
        String sqlProcedure = String.format(
public class GBase8sUtils {

            GenericDataSource datasource) throws DBException {
                            procBodyPart = "\n" + procBodyPart;
                    }
 * DBeaver - Universal Database Manager
        return listToString(getSource(monitor, sqlProcedure, procedure.getName(), procedure.getDataSource()), null);
    public static String getProcedureSource(DBRProgressMonitor monitor, GenericProcedure procedure) throws DBException {

        String sqlTrigger = String.format(
 * Licensed under the Apache License, Version 2.0 (the "License");
                return entry.getValue() != null ? entry.getValue().toString().trim() : null;
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
    public static String getViewDDL(DBRProgressMonitor monitor, GenericTableBase view) throws DBException {
    private static String getSqlModeValue(Map<String, ?> properties) {
                "select tb.data from systables ta " + "join systriggers tr on tr.tabid = ta.tabid "
                procedure.getName());
                        + "and tr.trigname = '%s'" + "order by tr.trigname, datakey desc, seqno ",
import org.jkiss.dbeaver.ext.generic.model.GenericTrigger;

import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    public static String listToString(List<String> value, String delimiter) {
 * You may obtain a copy of the License at
            if (GBase8sConstants.JDBC_SQL_MODE.equalsIgnoreCase(entry.getKey())) {
                        + "where ta.tabname = '%s' and ta.tabtype='T' " + "and tb.datakey IN ('A', 'D') "
 *
 * you may not use this file except in compliance with the License.
                        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                    boolean firstPart = true;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
 * See the License for the specific language governing permissions and
        // d = INSTEAD OF Delete, i = INSTEAD OF Insert,u = INSTEAD OF Update


                        + "join systrigbody tb on tb.trigid = tr.trigid "
        if (sqlMode != null) {
                return result;
                }
import java.util.Map;
    }
            return null;
    }
        // D = Delete trigger, I = Insert, U = Update trigger,S = Select,


    }
                        result.add(procBodyPart);
import org.jkiss.dbeaver.DBException;
                + "order by tr.trigname, datakey desc, seqno ", table.getName());
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
        if (properties == null || properties.isEmpty()) {

        return listToString(getSource(monitor, sqlView, view.getName(), view.getDataSource()), null);
 */
import org.jkiss.dbeaver.Log;
                    while (dbResult.nextRow()) {
                .equalsIgnoreCase(getSqlModeValue(container.getDriver().getConnectionProperties()));
    static final Log log = Log.getLog(GBase8sUtils.class);
            try (JDBCPreparedStatement dbStat = session.prepareStatement(sqlStatement)) {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
/*
                        firstPart = false;
import org.jkiss.dbeaver.model.DBUtils;
        }
    public static List<String> getSource(DBRProgressMonitor monitor, String sqlStatement, String dbObjectName,
        } catch (Exception e) {
 *
    }
        return null;
            return GBase8sConstants.JDBC_SQL_MODE_ORACLE.equalsIgnoreCase(sqlMode);
        for (Map.Entry<String, ?> entry : properties.entrySet()) {
 * limitations under the License.
                trigger.getTable().getName(), trigger.getName());
        return GBase8sConstants.JDBC_SQL_MODE_ORACLE
    }

        StringBuilder sbResult = new StringBuilder();
import java.util.List;
                + "where ta.tabname = '%s' and ta.tabtype='T' " + "and tb.datakey IN ('A', 'D') "
        assert trigger.getTable() != null;
                "select b.data " + "from sysprocbody b " + "join sysprocedures p on b.procid=p.procid "
        return sbResult.toString();
                sbResult.append(delimiter);
                + "join systables s on s.tabid = v.tabid " + "where s.tabname = '%s'", view.getName());
        }
    }
package org.jkiss.dbeaver.ext.gbase8s;
    }


        }
    public static String getTriggerDDL(DBRProgressMonitor monitor, GenericTrigger trigger) throws DBException {
            if (delimiter != null && !delimiter.isEmpty())
        // systriggers.event:
        return listToString(getSource(monitor, sqlTrigger, trigger.getName(), trigger.getDataSource()), "\n");
    public static boolean isOracleSqlMode(DBPDataSourceContainer container) {
 *     http://www.apache.org/licenses/LICENSE-2.0
}
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
    }
    public static String getTriggerDDL(DBRProgressMonitor monitor, GenericTableBase table) throws DBException {

/**
        String sqlView = String.format("select v.viewtext " + "from sysviews v "
        return listToString(getSource(monitor, sqlTrigger, table.getName(), table.getDataSource()), "\n");
        DBPConnectionConfiguration configuration = container.getConnectionConfiguration();
        }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        String sqlMode = getSqlModeValue(configuration.getProperties());
                        if (procBodyPart.startsWith("create") && !firstPart) {

import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
            }

            // DELIMITED CRLF and LF generate 'Syntax error'
 */
            }
        try (JDBCSession session = DBUtils.openMetaSession(monitor, datasource, "Load source code")) {
                        String procBodyPart = dbResult.getString(1);
                List<String> result = new ArrayList<>();
import java.util.ArrayList;
