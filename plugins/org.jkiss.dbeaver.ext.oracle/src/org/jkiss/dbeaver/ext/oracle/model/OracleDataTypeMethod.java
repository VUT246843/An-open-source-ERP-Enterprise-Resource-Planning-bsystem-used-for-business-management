    private boolean flagOverriding;
        return flagInstantiable;
 */
        @Override
    @Property(id = "dataType", viewable = true, order = 6)
    public OracleDataType getResultType()
 * you may not use this file except in compliance with the License.
    {
 *
import org.jkiss.dbeaver.model.struct.DBSEntityMethod;
    private String methodType;
 * limitations under the License.

                session.getProgressMonitor(),
            } else {

    }

    {
    }
        this.number = JDBCUtils.safeGetInt(dbResult, "METHOD_NO");
import java.util.Collection;
            return new OracleDataTypeMethodParameter(

            dbStat.setInt(4, getNumber());
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.flagFinal = JDBCUtils.safeGetBoolean(dbResult, "FINAL", OracleConstants.YES);
 * Unless required by applicable law or agreed to in writing, software

        }
                "SELECT PARAM_NAME,PARAM_NO,PARAM_MODE,PARAM_TYPE_OWNER,PARAM_TYPE_NAME,PARAM_TYPE_MOD " +
    @Nullable
    {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
}
    private OracleDataTypeModifier resultTypeMod;
        super(dataType);
        return methodType;
        return flagOverriding;

                dbStat.setNull(1, Types.VARCHAR);
    {

        {
                monitor,
    public OracleDataTypeModifier getResultTypeMod()
    private boolean flagFinal;
        return resultType;
import org.jkiss.code.Nullable;
    private class ParameterCache extends JDBCObjectCache<OracleDataTypeMethod, OracleDataTypeMethodParameter> {
        super(dataType, dbResult);
                JDBCUtils.safeGetString(dbResult, "RESULT_TYPE_OWNER"),

    }

    }
    {
            OracleDataType dataType = getOwnerType();
    public OracleDataTypeMethod(OracleDataType dataType)
import java.sql.SQLException;
            }

        this.name = JDBCUtils.safeGetString(dbResult, "METHOD_NAME");

import org.jkiss.code.NotNull;
 * See the License for the specific language governing permissions and
 * Oracle data type attribute
        throws DBException
        }
        this.flagOverriding = JDBCUtils.safeGetBoolean(dbResult, "OVERRIDING", OracleConstants.YES);
    }
    {
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull OracleDataTypeMethod owner) throws SQLException
            if (dataType.getSchema() == null) {
import org.jkiss.dbeaver.DBException;
        protected OracleDataTypeMethodParameter fetchObject(@NotNull JDBCSession session, @NotNull OracleDataTypeMethod owner, @NotNull JDBCResultSet resultSet) throws SQLException, DBException
        this.parameterCache = new ParameterCache();


        @NotNull
 * Copyright (C) 2010-2024 DBeaver Corp and others

 *

    public boolean isOverriding()
        return parameterCache == null ? null : parameterCache.getAllObjects(monitor, this);
/*
                "WHERE OWNER=? AND TYPE_NAME=? AND METHOD_NAME=? AND METHOD_NO=?");
 */

 *
    }
    @Property(viewable = true, order = 8)
            return dbStat;
            dbStat.setString(2, dataType.getName());
        this.methodType = JDBCUtils.safeGetString(dbResult, "METHOD_TYPE");
import java.sql.Types;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        if (!CommonUtils.isEmpty(resultTypeName)) {
        String resultTypeName = JDBCUtils.safeGetString(dbResult, "RESULT_TYPE_NAME");
                "FROM ALL_METHOD_PARAMS " +
                resultTypeName);
    private boolean flagInstantiable;
    @Association
import org.jkiss.dbeaver.model.struct.DBSParametrizedObject;
    }
    }
    @Property(viewable = true, editable = true, order = 5)
 * You may obtain a copy of the License at

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
            this.resultType = OracleDataType.resolveDataType(
    private final ParameterCache parameterCache;

    public Collection<OracleDataTypeMethodParameter> getParameters(@NotNull DBRProgressMonitor monitor)
    {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        this.flagInstantiable = JDBCUtils.safeGetBoolean(dbResult, "INSTANTIABLE", OracleConstants.YES);
import org.jkiss.dbeaver.model.meta.Association;
                OracleDataTypeMethod.this,
                JDBCUtils.safeGetString(dbResult, "RESULT_TYPE_MOD"));
 * DBeaver - Universal Database Manager
    @Property(id = "dataTypeMod", viewable = true, order = 7)
import org.jkiss.dbeaver.model.meta.Property;
    public OracleDataTypeMethod(DBRProgressMonitor monitor, OracleDataType dataType, ResultSet dbResult)
        }
public class OracleDataTypeMethod extends OracleDataTypeMember implements DBSEntityMethod, DBSParametrizedObject {
        boolean hasParameters = JDBCUtils.safeGetInt(dbResult, "PARAMETERS") > 0;
        this.parameterCache = hasParameters ? new ParameterCache() : null;

    public String getMethodType()

    {
            dbStat.setString(3, getName());
    {
        return flagFinal;
import java.sql.ResultSet;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private OracleDataType resultType;
 * Licensed under the Apache License, Version 2.0 (the "License");
        return resultTypeMod;
                resultSet);
 * distributed under the License is distributed on an "AS IS" BASIS,
        {
    @Property(viewable = true, order = 10)
    public boolean isFinal()
                getDataSource(),

        @Override
            final JDBCPreparedStatement dbStat = session.prepareStatement(
                dbStat.setString(1, dataType.getSchema().getName());
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
package org.jkiss.dbeaver.ext.oracle.model;
            this.resultTypeMod = OracleDataTypeModifier.resolveTypeModifier(
    public boolean isInstantiable()
    @Property(viewable = true, order = 9)
    }
/**
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
    }
