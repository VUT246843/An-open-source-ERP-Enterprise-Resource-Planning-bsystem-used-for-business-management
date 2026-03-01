
public class InformixUtils {
 * See the License for the specific language governing permissions and
                        String procBodyPart = dbResult.getString(1);
 * you may not use this file except in compliance with the License.

        String sqlTrigger = String
 * Licensed under the Apache License, Version 2.0 (the "License");
        return listToString(
 */
                trigger.getTable().getName(),
                    + "and tb.datakey IN ('A', 'D') "
 * Informix utils

                    + "and tr.trigname = '%s'"
                    while (dbResult.nextRow()) {
            + "where datakey='T' and p.procname = '%s'"
                        result.add(procBodyPart);
    public static String listToString(List<String> value, String delimiter) {
        }
                    + "where ta.tabname = '%s' and ta.tabtype='T' "
    }
                                       GenericTableBase table) throws DBException {
                view.getDataSource()), null);
                        if (procBodyPart.startsWith("create") && !firstPart) {
        // D = Delete trigger, I = Insert, U = Update trigger,S = Select,
package org.jkiss.dbeaver.ext.informix;
        StringBuilder sbResult = new StringBuilder();
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
            //NOT APPLY .TRIM IN 'O' VARIABLE, PROBLEM TO RENDERIZE PROCEDURE BECAUSE LINE DELIMITED CRLF and LF generate  'Syntax error'
/**
            try (JDBCPreparedStatement dbStat = session.prepareStatement(sqlStatement)) {
    static final Log log = Log.getLog(InformixUtils.class);
                    }
        // d = INSTEAD OF Delete, i = INSTEAD OF Insert,u = INSTEAD OF Update
    }
                    + "join systriggers tr on tr.tabid = ta.tabid "
/*
                procedure.getDataSource()), null);
    }
 * limitations under the License.
 *
        }
import org.jkiss.dbeaver.model.DBUtils;
                        }
        for (String o : value) {
                    boolean firstPart = true;
                    + "order by tr.trigname, datakey desc, seqno ",
            getSource(monitor, sqlTrigger, table.getName(),
            .format("select tb.data " + "from systables ta "
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
            + "join sysprocedures p on b.procid=p.procid "
                }
            getSource(monitor, sqlTrigger, trigger.getName(), trigger.getDataSource()), "\n");
                List<String> result = new ArrayList<>();

 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.List;
    // Triggers, Sequences?
    public static List<String> getSource(DBRProgressMonitor monitor,
        return listToString(
    public static String getTriggerDDL(DBRProgressMonitor monitor, GenericTrigger trigger) throws DBException {
 */
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
import java.util.ArrayList;
        String sqlView = String.format("select v.viewtext "
                trigger.getName());
                table.getDataSource()), "\n");

        String sqlProcedure = String.format("select b.data "
 *
            + "from sysprocbody b "
 * distributed under the License is distributed on an "AS IS" BASIS,
        return listToString(
            getSource(monitor, sqlView, view.getName(),
    public static String getViewSource(DBRProgressMonitor monitor,

                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
                    + "join systrigbody tb on tb.trigid = tr.trigid "
 *
            + "from informix.sysviews v "
            + "join systables s on s.tabid = v.tabid "
 * Unless required by applicable law or agreed to in writing, software
            + "where s.tabname = '%s'", view.getName());
}
import org.jkiss.dbeaver.Log;
                    + "join systrigbody tb on tb.trigid = tr.trigid "
            .format("select tb.data from systables ta "
        } catch (Exception e) {
import org.jkiss.dbeaver.ext.generic.model.GenericProcedure;
import org.jkiss.dbeaver.DBException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                                       GenericTableBase view) throws DBException {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                                          GenericDataSource datasource) throws DBException {

                    + "order by tr.trigname, datakey desc, seqno ",
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
            }
                sbResult.append(delimiter);
        return listToString(
        String sqlTrigger = String
                return result;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        // systriggers.event:
                table.getName());
                            procBodyPart = "\n" + procBodyPart;

            throw new DBException("Can't read source code of '" + dbObjectName + "'", e);
        return sbResult.toString();
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
        try (JDBCSession session = DBUtils.openMetaSession(monitor, datasource, "Load source code")) {
                    + "join systriggers tr on tr.tabid = ta.tabid "
                        firstPart = false;
                                          String sqlStatement, String dbObjectName,

            getSource(monitor, sqlProcedure, procedure.getName(),
                    + "where ta.tabname = '%s' and ta.tabtype='T' "
            if (delimiter != null && !delimiter.isEmpty())
    public static String getProcedureSource(DBRProgressMonitor monitor, GenericProcedure procedure) throws DBException {
import org.jkiss.dbeaver.ext.generic.model.GenericTrigger;
 * DBeaver - Universal Database Manager
    }
            + "order by b.procid, b.seqno", procedure.getName());
        assert trigger.getTable() != null;
            sbResult.append(o);
    }
                    + "and tb.datakey IN ('A', 'D') "


    public static String getTriggerDDL(DBRProgressMonitor monitor,

