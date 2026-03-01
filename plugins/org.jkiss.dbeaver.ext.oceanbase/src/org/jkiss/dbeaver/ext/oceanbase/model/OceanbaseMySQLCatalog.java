import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureParameterKind;
    @Override
import java.util.List;
        OceanbaseTableCache() {
import org.jkiss.code.Nullable;
        @Override
            }

        }
                // And OceanBase doesn't support procedures overriding.
                    (procedure != null ? " and name=?" : "");
            @NotNull JDBCSession session,
 *
                String returnString = JDBCUtils.safeGetString(dbResult, "returns");
        ) throws SQLException, DBException {
import org.jkiss.dbeaver.model.DBUtils;
        }
                    "RETURN",

        OceanbaseProceduresCache() {
            if (parent.getProcedureType().equals(DBSProcedureType.PROCEDURE)) {
                    = owner.getProceduresCache().getChildrenCache(parent);
 * limitations under the License.
                // For some reason OceanBase information_schema.ROUTINES can store duplicates names.
import org.jkiss.dbeaver.model.struct.DBSDataType;

    private static final Log log = Log.getLog(OceanbaseMySQLCatalog.class);
        }
            @NotNull MySQLCatalog owner,
            @NotNull MySQLTableBase table,
            String routineName = JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_ROUTINE_NAME);
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

import org.jkiss.dbeaver.ext.mysql.MySQLConstants;
                    null,
                                typeSize != null ? typeSize : 42,
                                DBSProcedureParameterKind.IN.getTitle(),
 * Unless required by applicable law or agreed to in writing, software
                }
    public OceanbaseMySQLCatalog(MySQLDataSource dataSource, ResultSet dbResult) {
public class OceanbaseMySQLCatalog extends MySQLCatalog {
    @NotNull
                DBSObjectCache<MySQLProcedure, MySQLProcedureParameter> paramCache
        return super.refreshObject(monitor);
            if (forTable instanceof MySQLView) {
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;

                return null;
        }
    class OceanbaseProceduresCache extends ProceduresCache {
                if (returnString == null) {
            @NotNull MySQLCatalog owner,
                    for (int i = 0; i < strings.length; i++) {
        // Oceanbase does not support caching of attributes
import org.jkiss.dbeaver.ext.mysql.model.*;

    }
                                true,
    }
                }
                    null,
    private final OceanbaseTableCache oceanbaseTableCache = new OceanbaseTableCache();
                if (CommonUtils.isNotEmpty(paramListString)) {
    public OceanbaseProceduresCache getProceduresCache() {
                return super.fetchChild(session, owner, parent, dbResult);
 *
    public MySQLDataSource getDataSource() {
import org.jkiss.code.NotNull;

}
                                parent,
                    DBSProcedureParameterKind.RETURN);
                            DBSDataType type;
                paramCache.cacheObject(parameter);
        @Override

        proceduresNames.clear();
            if (table instanceof MySQLView) {
                return statement;
        this.dataSource = dataSource;
            }
import org.jkiss.utils.CommonUtils;
            return super.fetchObject(session, owner, dbResult);
            if (procedure != null && procedure.getProcedureType().equals(DBSProcedureType.PROCEDURE)) {
            return super.prepareChildrenStatement(session, owner, forTable);
            @NotNull JDBCSession session,

                    parent,
                    List<MySQLProcedureParameter> funcParams = new ArrayList<>();
            @NotNull JDBCSession session,
                        JDBCUtils.escapeWildCards(session, procedure.getName()), "%").getSourceStatement();
            } else {

        return dataSource;
                                type = getDataSource().getLocalDataType(dataType);
        oceanbaseTableCache.setCaseSensitive(false);
            @NotNull JDBCSession session,
                                DBSProcedureParameterKind.IN));
                                type == null ? Types.INTEGER : type.getTypeID(),
 * DBeaver - Universal Database Manager
        ) throws SQLException {
        @Override
            @Nullable MySQLTableBase forTable

            @NotNull MySQLProcedure parent,

                return null;
    }
                String paramListString = JDBCUtils.safeGetString(dbResult, "param_list");
            @NotNull JDBCResultSet dbResult
        ) throws SQLException, DBException {
                return parameter;
                            funcParams.add(new MySQLProcedureParameter(
                                DBUtils.getUnQuotedIdentifier(getDataSource(), argName),
            @NotNull MySQLCatalog owner,

                                i,
                            Integer typeSize = null;
    @Override
                int columnSize = Integer.parseInt(returnParamsList[1].split("\\)")[0]);
        protected MySQLTableColumn fetchChild(
                    true,
                log.debug("Skipped duplicate routine name " + routineName);
                MySQLProcedureParameter parameter = new MySQLProcedureParameter(
import java.sql.SQLException;
        protected MySQLProcedureParameter fetchChild(

            @NotNull JDBCResultSet dbResult
                    STRUCT_ATTRIBUTES,
    static class OceanbaseTableCache extends TableCache {
    @Override
            if (CommonUtils.isEmpty(routineName)) {
            } else {
import java.sql.Types;
                String queryFunctionString = "select * from mysql.proc where db=? and type='FUNCTION'" +
package org.jkiss.dbeaver.ext.oceanbase.model;
            return super.fetchChild(session, owner, table, dbResult);
    private final MySQLDataSource dataSource;
                proceduresNames.add(routineName);

import org.jkiss.dbeaver.Log;
                return session.prepareStatement("desc " + owner.getName() + "." + forTable.getName());
    }
import java.sql.ResultSet;
                String[] returnParamsList = returnString.split("\\(");
        }
                    0,
                            if (CommonUtils.isNotEmpty(dataType) && dataType.contains("(") && dataType.contains(")")) {



 * See the License for the specific language governing permissions and
    public synchronized DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
    }
        super.cacheStructure(monitor, scope & ~STRUCT_ATTRIBUTES);

import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 * Licensed under the Apache License, Version 2.0 (the "License");

import org.jkiss.dbeaver.DBException;
                                typeSize = CommonUtils.toInt(typeLength, -1);
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        @Override
                                null,
    public synchronized void cacheStructure(@NotNull DBRProgressMonitor monitor, int scope) throws DBException {
        return this.oceanbaseTableCache;
            super();
            }
                        }
 * You may obtain a copy of the License at
            } else {
            @NotNull MySQLCatalog owner,
                JDBCPreparedStatement statement = session.prepareStatement(queryFunctionString);
    public OceanbaseTableCache getTableCache() {
        super(dataSource, dbResult);
            }
        protected JDBCStatement prepareChildrenStatement(
                // So let's avoid duplicates.
            @Nullable MySQLProcedure procedure
        protected JDBCStatement prepareChildrenStatement(
                                null,
                                type = getDataSource().getLocalDataType(typeName);
            @NotNull JDBCSession session,

                }
                        paramCache.cacheObject(param);
import org.jkiss.dbeaver.model.struct.DBSObject;
                            }
                if (procedure != null) {
    }

 *     http://www.apache.org/licenses/LICENSE-2.0
            }
                            } else {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        protected MySQLProcedure fetchObject(
    private List<String> proceduresNames = new ArrayList<>();
 * Copyright (C) 2010-2025 DBeaver Corp and others
            }
    private final OceanbaseProceduresCache oceanbaseProceduresCache = new OceanbaseProceduresCache();
                log.debug("Can't read routine name.");
 */
    }
                            String dataType = argPart[1];
            @NotNull JDBCResultSet dbResult

                    String[] strings = paramListString.split(",");

        ) throws SQLException, DBException {
                statement.setString(1, owner.getName());
                return new OceanbaseMySQLViewColumn(table, dbResult);
import java.util.ArrayList;
 *
                                String typeLength = dataType.substring(dataType.indexOf("(") + 1, dataType.indexOf(")"));
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    }
        }
                    }
        ) throws SQLException {
                        if (argPart.length > 1) {
                                String typeName = dataType.substring(0, dataType.indexOf("("));
            super();
/*

import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
                    columnSize,
                            String argName = argPart[0];
            if (proceduresNames.contains(routineName)) {
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
                    for (MySQLProcedureParameter param : funcParams) {
                    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    statement.setString(2, procedure.getName());
            @NotNull MySQLCatalog owner,
        @Override

        return oceanbaseProceduresCache;
                return session.getMetaData().getProcedureColumns(owner.getName(), null,
        }
                    returnParamsList[0],
                    return null;
                        String[] argPart = strings[i].trim().split(" ");

