        if (forParent != null) {
/**
        dbStat = session.prepareStatement("SELECT CONS.*, cons.CONSTRAINTNAME AS PK_NAME, CG.DESCRIPTOR, t.TABLENAME AS TABLE_NAME, s.SCHEMANAME\n" +
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;

import org.jkiss.utils.BeanUtils;

    @Override
        } catch (Throwable e) {
                    List<? extends GenericTableColumn> attributes = parent.getAttributes(dbResult.getSession().getProgressMonitor());
            if (descriptor != null) {
                        "AND SCHEMANAME=?" + (forParent != null ? " AND TABLENAME=?" : ""));
                        "FROM SYS.SYSKEYS KEYS, SYS.SYSCONGLOMERATES CG, SYS.SYSCONSTRAINTS CONS \n" +
                int[] columnPositions = (int []) baseColumnPositions;
            }
                for (int pos : columnPositions) {
    public boolean supportsSequences(@NotNull GenericDataSource dataSource) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public DBPErrorAssistant.ErrorPosition getErrorPosition(@NotNull Throwable error) {
                                derbyConstraintColumns.add(constraintColumn);
    @Override
            return null;
    @Override

 * you may not use this file except in compliance with the License.
        return dbStat;
                return DBSEntityConstraintType.PRIMARY_KEY;
        return dbStat;

            Object descriptor = JDBCUtils.safeGetObject(dbResult, "DESCRIPTOR");
import org.jkiss.utils.CommonUtils;
    @Override
    @Override
        String className = procMethodName.substring(0, divPos);
                        " ON CONS.TABLEID = t.TABLEID\n" +
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
package org.jkiss.dbeaver.ext.derby.model;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
        String sequenceName = JDBCUtils.safeGetString(dbResult, 1);

    @Override
    private static final Log log = Log.getLog(DerbyMetaModel.class);
    }
        }
            return DBSEntityConstraintType.UNIQUE_KEY;

 * distributed under the License is distributed on an "AS IS" BASIS,
        return "-- Source of " + className + "." + methodName;
    public GenericSequence createSequenceImpl(@NotNull JDBCSession session, @NotNull GenericStructContainer container, @NotNull JDBCResultSet dbResult) throws DBException {
    public String getAutoIncrementClause(GenericTableColumn column) {

                    if (!CommonUtils.isEmpty(attributes)) {
import org.jkiss.utils.ArrayUtils;
            JDBCUtils.safeGetLong(dbResult, 4),
                    }
            "SELECT seq.SEQUENCENAME,seq.CURRENTVALUE,seq.MINIMUMVALUE,seq.MAXIMUMVALUE,seq.INCREMENT\n" +
                        "JOIN sys.SYSTABLES t\n" +
 *
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        if (type != null) {
            JDBCUtils.safeGetLong(dbResult, 3),
                pos.position = Integer.parseInt(matcher.group(2)) - 1;

        return "GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1)";
import org.jkiss.dbeaver.ext.generic.model.*;
 * DerbyMetaModel
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
                DBPErrorAssistant.ErrorPosition pos = new DBPErrorAssistant.ErrorPosition();
            JDBCUtils.safeGetLong(dbResult, 2),
                Object baseColumnPositions = BeanUtils.invokeObjectMethod(descriptor, "baseColumnPositions");
    @Override
            sequenceName,
        try {
    @Nullable
import java.util.regex.Matcher;
                            }
            throw new DBException("Bad Java method reference: " + procMethodName);
    }


        }
        String procMethodName = sourceObject.getDescription();
/*
                        for (GenericTableColumn genericTableColumn : attributes) {
            }
 *
    @Override

            throw new DBDatabaseException(e, sourceObject.getDataSource());
            dbStat.setString(1, owner.getName());
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        return null;
                "WHERE seq.SCHEMAID=s.SCHEMAID AND s.SCHEMANAME=?");
        return true;
{
    }
 * You may obtain a copy of the License at
                return pos;
    @Override
    @Override
    }
        if (!CommonUtils.isEmpty(message)) {
    public GenericDataSource createDataSourceImpl(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container) throws DBException {
        }
            if ("P".equals(type)) {
//        JavaDecompiler decompiler = new JavaDecompiler();
                        " JOIN sys.SYSSCHEMAS s\n" +
    @Override
                        " ON s.SCHEMAID = CONS.SCHEMAID\n" +
 * Licensed under the Apache License, Version 2.0 (the "License");
        } catch (SQLException e) {
        return super.createConstraintColumnsImpl(session, parent, object, pkObject, dbResult);
    private Pattern ERROR_POSITION_PATTERN = Pattern.compile(" at line ([0-9]+), column ([0-9]+)\\.");
                pos.line = Integer.parseInt(matcher.group(1)) - 1;
 * See the License for the specific language governing permissions and
 */
                                GenericTableConstraintColumn constraintColumn = new GenericTableConstraintColumn(object, genericTableColumn, pos);
 *
    }
    public String getProcedureDDL(@NotNull DBRProgressMonitor monitor, @NotNull GenericProcedure sourceObject) throws DBException {
import java.util.List;
        return true;
import java.util.Map;
        return super.getUniqueConstraintType(dbResult);
 * limitations under the License.
            dbStat.setString(1, forParent.getSchema().getName());
    @NotNull
    }
        } else {
    }

//        return decompiler.decompileJavaMethod(className, methodName);
    public DBSEntityConstraintType getUniqueConstraintType(@NotNull JDBCResultSet dbResult) throws DBException, SQLException {
import org.jkiss.dbeaver.model.DBPErrorAssistant;
 */
                "FROM sys.SYSSEQUENCES seq,sys.SYSSCHEMAS s\n" +
            if (matcher.find()) {
    }
    }
            log.debug("Can't get Derby constraint", e);
import java.util.ArrayList;
        }
        return decompileJavaMethod(className, methodName);
        if (divPos == -1) {

            Matcher matcher = ERROR_POSITION_PATTERN.matcher(message);
    private String decompileJavaMethod(String className, String methodName) throws DBException {
                return ArrayUtils.toArray(GenericTableConstraintColumn.class, derbyConstraintColumns);
            return JDBCUtils.queryString(session, "SELECT v.VIEWDEFINITION from SYS.SYSVIEWS v,SYS.SYSTABLES t,SYS.SYSSCHEMAS s\n" +
            "",
    public DerbyMetaModel() {
    GenericUniqueKey object, GenericMetaObject pkObject, JDBCResultSet dbResult) throws DBException {
 * Unless required by applicable law or agreed to in writing, software
        dbStat.setString(1, container.getName());

        }
import org.jkiss.dbeaver.DBException;
    public GenericTableConstraintColumn[] createConstraintColumnsImpl(@NotNull JDBCSession session, @NotNull GenericTableBase parent, @NotNull
import java.sql.SQLException;
        return new DerbyDataSource(monitor, container, this);
    @Override
        return new GenericSequence(
import org.jkiss.dbeaver.model.DBUtils;
    }
        JDBCPreparedStatement dbStat = session.prepareStatement(

                "WHERE v.TABLEID=t.TABLEID AND t.SCHEMAID=s.SCHEMAID AND s.SCHEMANAME=? AND t.TABLENAME=?", sourceObject.getContainer().getName(), sourceObject.getName());
    public GenericUniqueKey createConstraintImpl(@NotNull GenericTableBase table, String constraintName, DBSEntityConstraintType constraintType, JDBCResultSet dbResult, boolean persisted) {
    }
        int divPos = procMethodName.lastIndexOf('.');
    }
    }
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaObject;

}
                        }
            }
    @NotNull
        return new GenericUniqueKey(table, constraintName, null, constraintType, persisted);
public class DerbyMetaModel extends GenericMetaModel
    public String getViewDDL(@NotNull DBRProgressMonitor monitor, @NotNull GenericView sourceObject, @NotNull Map<String, Object> options) throws DBException {
        String type = JDBCUtils.safeGetString(dbResult, "TYPE");
            container,
        String message = error.getMessage();
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;

                }
import org.jkiss.code.NotNull;
        JDBCPreparedStatement dbStat;
            dbStat.setString(2, forParent.getName());
    public boolean supportsUniqueKeys() {
    @Nullable
import java.util.regex.Pattern;
    public JDBCStatement prepareSequencesLoadStatement(@NotNull JDBCSession session, @NotNull GenericStructContainer container) throws SQLException {
            JDBCUtils.safeGetLong(dbResult, 5));
        }
    }
    }
import org.jkiss.dbeaver.DBDatabaseException;
                            if (genericTableColumn.getOrdinalPosition() == pos) {

            List<GenericTableConstraintColumn> derbyConstraintColumns = new ArrayList<>();
import org.jkiss.dbeaver.Log;
        }
 * Copyright (C) 2010-2025 DBeaver Corp and others
        String methodName = procMethodName.substring(divPos + 1);
        super();
                        "WHERE KEYS.CONSTRAINTID = CONS.CONSTRAINTID AND CG.CONGLOMERATEID=KEYS.CONGLOMERATEID\n" +
        try (JDBCSession session = DBUtils.openMetaSession(monitor, sourceObject, "Read view definition")) {
        if (CommonUtils.isEmpty(sequenceName)) {
    public JDBCStatement prepareUniqueConstraintsLoadStatement(@NotNull JDBCSession session, @NotNull GenericStructContainer owner, @Nullable GenericTableBase forParent) throws SQLException, DBException {
 * DBeaver - Universal Database Manager
