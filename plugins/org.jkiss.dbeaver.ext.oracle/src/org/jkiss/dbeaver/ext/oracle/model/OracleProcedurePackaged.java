import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    }
            JDBCUtils.safeGetString(dbResult, "PROCEDURE_NAME"),

{
    public OracleSchema getSchema()
    public void setOverload(int overload)
    }
        return overload == null || overload <= 1 ? getName() : getName() + "#" + overload;
            getSchema(),
    {
 */
 * You may obtain a copy of the License at
    {
 *     http://www.apache.org/licenses/LICENSE-2.0
public class OracleProcedurePackaged extends OracleProcedureBase<OraclePackage> implements DBPUniqueObject
    private Integer overload;
import java.sql.ResultSet;
 *
            getParentObject(),
 */
    @NotNull

    {
        return getParentObject().getSchema();
 *
    @NotNull
}
import org.jkiss.dbeaver.model.DBUtils;
 * GenericProcedure
    }

    {
    @Override
/**
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context)
    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.DBPEvaluationContext;

    public OracleProcedurePackaged(
 * you may not use this file except in compliance with the License.

 * distributed under the License is distributed on an "AS IS" BASIS,
            this);
 * See the License for the specific language governing permissions and
    public String getUniqueName()
import org.jkiss.code.NotNull;

    {
    @Override

        this.overload = overload;
            0l,
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
        OraclePackage ownerPackage,
 * limitations under the License.
    }
    {

/*

 *

 * Unless required by applicable law or agreed to in writing, software
            DBSProcedureType.valueOf(JDBCUtils.safeGetString(dbResult, "PROCEDURE_TYPE")));
    }
    @Override
import org.jkiss.dbeaver.model.DBPUniqueObject;
        return DBUtils.getFullQualifiedName(getDataSource(),
        ResultSet dbResult)
        super(ownerPackage,
        return overload;
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.ext.oracle.model;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public Integer getOverloadNumber()
 * DBeaver - Universal Database Manager
    }
