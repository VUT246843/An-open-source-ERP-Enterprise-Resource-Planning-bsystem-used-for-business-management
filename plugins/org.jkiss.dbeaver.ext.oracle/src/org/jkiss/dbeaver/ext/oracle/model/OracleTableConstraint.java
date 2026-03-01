                return OracleConstants.CONSTRAINT_SUPPLEMENTAL_LOGGING;
                return OracleConstants.CONSTRAINT_WITH_CHECK_OPTION;
                return OracleConstants.CONSTRAINT_WITH_READ_ONLY;
    public OracleTableConstraint(OracleTableBase oracleTable, String name, DBSEntityConstraintType constraintType, String searchCondition, OracleObjectStatus status)
    }
    private String searchCondition;
            default:
 *

 * You may obtain a copy of the License at
    private static final Log log = Log.getLog(OracleTableConstraint.class);
    public void setSearchCondition(String searchCondition) {

            this);
            case "F":
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
            case "O":

                return OracleConstants.CONSTRAINT_HASH_EXPRESSION;
        return DBUtils.getFullQualifiedName(getDataSource(),
import org.jkiss.dbeaver.Log;
    }

 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,

 *
                return DBSEntityConstraintType.CHECK;
            case "U":
 */
            case "R":
            case "C":
    {
    {
                OracleObjectStatus.ENABLED),
}
    @Override
    {
    {
            case "P":
            getTable().getContainer(),
import org.jkiss.utils.CommonUtils;
        switch (code) {
/**
import org.jkiss.code.NotNull;
                log.debug("Unsupported Oracle constraint type: " + code);
 * OracleTableConstraint
    @NotNull
public class OracleTableConstraint extends OracleTableConstraintBase {
 * limitations under the License.
/*
            table,
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.searchCondition = searchCondition;
 * Copyright (C) 2010-2025 DBeaver Corp and others

    }
        return searchCondition;
    }
    public OracleTableConstraint(OracleTableBase table, ResultSet dbResult)
        super(
package org.jkiss.dbeaver.ext.oracle.model;

        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

                CommonUtils.valueOf(OracleObjectStatus.class, JDBCUtils.safeGetStringTrimmed(dbResult, OracleConstants.COLUMN_STATUS)),
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
            JDBCUtils.safeGetString(dbResult, OracleConstants.COL_CONSTRAINT_NAME),

import org.jkiss.dbeaver.model.meta.Property;
 * DBeaver - Universal Database Manager
import java.sql.ResultSet;
                return DBSEntityConstraintType.CHECK;
 */
                return DBSEntityConstraintType.UNIQUE_KEY;
 * See the License for the specific language governing permissions and
            case "S":
 *
                return OracleConstants.CONSTRAINT_REF_COLUMN;
            getTable(),
    @Property(viewable = true, editable = true, order = 4)
                return DBSEntityConstraintType.FOREIGN_KEY;

 * Unless required by applicable law or agreed to in writing, software
    public String getSearchCondition()
            true);
            CommonUtils.notNull(
        super(oracleTable, name, constraintType, status, false);
import org.jkiss.dbeaver.model.DBPEvaluationContext;
            case "V":

            getConstraintType(JDBCUtils.safeGetString(dbResult, OracleConstants.COL_CONSTRAINT_TYPE)),
            case "H":
import org.jkiss.dbeaver.model.DBUtils;
    }
    {
        this.searchCondition = JDBCUtils.safeGetString(dbResult, "SEARCH_CONDITION");
    public static DBSEntityConstraintType getConstraintType(String code)
                return DBSEntityConstraintType.PRIMARY_KEY;
        this.searchCondition = searchCondition;
 * Licensed under the Apache License, Version 2.0 (the "License");
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context)
    }
