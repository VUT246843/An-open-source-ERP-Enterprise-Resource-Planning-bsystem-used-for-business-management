    public MySQLProcedure(
        String procType = getProcedureType().name();
        this.deterministic = false;
                                clientBody = "";
    {
            }
    public Collection<MySQLProcedureParameter> getParameters(@NotNull DBRProgressMonitor monitor)
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context)
        if (divPos != -1) {
                            if (dbResult.next()) {
    private DBSProcedureType procedureType;
    {
        int divPos = createDDL.indexOf(procType + " `");
    private static final Log log = Log.getLog(MySQLProcedure.class);
        setDescription(JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_ROUTINE_COMMENT));
        this.charset = JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_CHARACTER_SET_CLIENT);
    {

            log.debug("Unsupported procedure type: " + procType);
    {
    public String getDeclaration(DBRProgressMonitor monitor)
    {
 * See the License for the specific language governing permissions and
            return createDDL.substring(0, divPos) + procType +
        return createDDL;
    public String getResultType()
                    "CREATE " + getProcedureType().name() + " " + getFullyQualifiedName(DBPEvaluationContext.DDL) + "()" + GeneralUtils.getDefaultLineSeparator() +
                            }
        }

                    "END";
        this.resultType = JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_DTD_IDENTIFIER);
    }
                                }
    {
            } else {

        throws DBException
 * DBeaver - Universal Database Manager
    }
    @NotNull
import org.jkiss.dbeaver.DBDatabaseException;
import org.jkiss.dbeaver.model.DBPRefreshableObject;
    @Override
    }
        setDeclaration(sourceText);
    @Property(order = 2)
                this.clientBody =
        return getContainer().getProceduresCache().getChildren(monitor, getContainer(), this);
                    throw new DBDatabaseException(e, getDataSource());
    {
}
        } catch (IllegalArgumentException e) {
    private void loadInfo(ResultSet dbResult)
    public String toString() {
            cb.append('(').append(column.getMaxLength()).append(')');
        return getContainer().getProceduresCache().refreshObject(monitor, getContainer(), this);
    {
    }
                " `" + getContainer().getName() + "`." +
                        try (JDBCResultSet dbResult = dbStat.executeQuery()) {
    public void setObjectDefinitionText(String sourceText) throws DBException

    }
        return charset;
import java.util.Map;
        super(catalog, false);
    {
                    }
        return clientBody;
        this.procedureType = DBSProcedureType.PROCEDURE;

    }

    @Nullable
 * you may not use this file except in compliance with the License.
        ResultSet dbResult)
            this.procedureType = procType == null ? DBSProcedureType.PROCEDURE : DBSProcedureType.valueOf(procType.toUpperCase(Locale.ENGLISH));
    {
 *
    private transient String clientBody;
        return procedureType.name() + " " + getName();
{
    {
public class MySQLProcedure extends AbstractProcedure<MySQLDataSource, MySQLCatalog> implements MySQLSourceObject, DBPRefreshableObject
                        (procedureType == DBSProcedureType.FUNCTION ? "RETURNS INT" + GeneralUtils.getDefaultLineSeparator() : "") +

        this.description = JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_ROUTINE_COMMENT);
        throws DBException
    private static void appendParameterType(StringBuilder cb, MySQLProcedureParameter column)
            getContainer(),
 * limitations under the License.
        this.deterministic = deterministic;
 */
    }
 * Unless required by applicable law or agreed to in writing, software
    public String getCharset()
    public void setDeterministic(boolean deterministic)

 * distributed under the License is distributed on an "AS IS" BASIS,
                    clientBody = e.getMessage();

    @Override
        this.bodyType = JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_ROUTINE_BODY);
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
                    try (JDBCPreparedStatement dbStat = session.prepareStatement("SHOW CREATE " + getProcedureType().name() + " " + getFullyQualifiedName(DBPEvaluationContext.DDL))) {
import org.jkiss.code.Nullable;
    }
    @NotNull
    public void setProcedureType(DBSProcedureType procedureType)
import org.jkiss.dbeaver.utils.GeneralUtils;
                createDDL.substring(divPos + procType.length() + 1);
                }
    }

            if (!persisted) {
        return clientBody;
                                clientBody = JDBCUtils.safeGetString(dbResult, (getProcedureType() == DBSProcedureType.PROCEDURE ? "Create Procedure" : "Create Function"));
import org.jkiss.code.NotNull;
    @Property(editable = true, updatable = true, order = 3)
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    public void setDeclaration(String clientBody)

    public String getDeclaration()
                            } else {
        }
                                    clientBody = "";
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    //@Property(name = "Client Charset", order = 4)
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException
        }

    }
    public MySQLProcedure(MySQLCatalog catalog)
    @Override
        return deterministic;
    {
    }
    }
    public DBSProcedureType getProcedureType()
    }
    @Override
    @Property(hidden = true, editable = true, updatable = true, order = -1)
        this.procedureType = procedureType;

        try {
    }
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {
import org.jkiss.dbeaver.DBException;
            this.procedureType = DBSProcedureType.PROCEDURE;

        return bodyType;
    }
import org.jkiss.dbeaver.model.struct.DBSObject;

    @Override
import org.jkiss.dbeaver.model.meta.Property;

                } catch (SQLException e) {
            this);
 * MySQLProcedure
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
    }
        return procedureType ;

 * Licensed under the Apache License, Version 2.0 (the "License");
                                if (clientBody == null) {
 *
    @Property(hidden = true, editable = true, updatable = true, order = -1)
        if (column.getDataKind() == DBPDataKind.STRING && column.getMaxLength() > 0) {
        return DBUtils.getFullQualifiedName(getDataSource(),
import java.sql.ResultSet;
    @Property(order = 2)
        return resultType;
    }

        return getDeclaration(monitor);
    }
    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    private boolean deterministic;
import java.util.Collection;
/**
    {
    }
import org.jkiss.dbeaver.model.DBUtils;
                                    clientBody = normalizeCreateStatement(clientBody);

        setName(JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_ROUTINE_NAME));
 */

    public boolean isDeterministic()
    }
                    "BEGIN" + GeneralUtils.getDefaultLineSeparator() +

        this.resultType = "";
        String procType = JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_ROUTINE_TYPE);
        this.deterministic = JDBCUtils.safeGetBoolean(dbResult, MySQLConstants.COL_IS_DETERMINISTIC, "YES");
        MySQLCatalog catalog,
 *     http://www.apache.org/licenses/LICENSE-2.0
 *

 * You may obtain a copy of the License at
    {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    {
import org.jkiss.dbeaver.model.impl.struct.AbstractProcedure;
                try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Read procedure declaration")) {
import org.jkiss.dbeaver.ext.mysql.MySQLConstants;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    private String bodyType;
import java.util.Locale;
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
        if (clientBody == null) {
    private String normalizeCreateStatement(String createDDL) {
                                } else {
package org.jkiss.dbeaver.ext.mysql.model;
        this.bodyType = "SQL";
        loadInfo(dbResult);
        super(catalog, true);
    private String charset;
import org.jkiss.dbeaver.model.DBPDataKind;
    private String resultType;
import java.sql.SQLException;
        }
    {
        cb.append(column.getTypeName());

                        }
        this.clientBody = clientBody;
    public String getBodyType()
    @Property(order = 3)

/*

    @Override
    {
