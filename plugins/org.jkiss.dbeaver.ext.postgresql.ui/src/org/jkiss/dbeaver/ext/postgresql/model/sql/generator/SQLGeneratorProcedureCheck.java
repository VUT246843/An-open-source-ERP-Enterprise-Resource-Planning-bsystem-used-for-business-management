    }
        sql.append(getLineSeparator()).append(" /* performance_warnings => false, */ /* performance related warnings like "
                + "implicit casts in where clause (can be reason why index is not used), .. */");
                    sql.append(",");
 * See the License for the specific language governing permissions and
        sql.append(getLineSeparator()).append(" /* oldtable => NULL */");
                String typeName = parameter.getParameterType().getFullTypeName();

        sql.append(getLineSeparator()).append(" /* fatal_errors => true, */ /* stop on first error */");
 * you may not use this file except in compliance with the License.
        sql.append(getLineSeparator()).append(" /* anyelementtype => 'int', */ /* a real type used instead anyelement type */");
        sql.append(getLineSeparator()).append(" /* relid => 0, */ /* oid of relation assigned with trigger function. "
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ext.postgresql.model.sql.generator;
                if (!first) {
        boolean first = true;
public class SQLGeneratorProcedureCheck extends SQLGeneratorProcedure {
                + "like SQL injection vulnerability detection */");
}
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
        sql.append(getLineSeparator()).append(" /* anyenumtype => '-', */ /* a real type used instead anyenum type */");
import org.jkiss.dbeaver.model.DBPEvaluationContext;

    
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
        sql.append(getLineSeparator()).append(" /* all_warnings => false, */ /* enable all warnings */");
 * limitations under the License.
 *
        sql.append(getLineSeparator()).append(" /* without_warnings => false, */ /* disable all warnings */");
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureParameterKind;
        sql.append("select * from plpgsql_check_function('" + proc.getFullyQualifiedName(DBPEvaluationContext.DML) + "(");
/*
        sql.append("/*, */").append(getLineSeparator());
        for (DBSProcedureParameter parameter : CommonUtils.safeCollection(proc.getParameters(monitor))) {
                + "shadowed variables, dead code, never read (unused) function's parameter, "
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        sql.append(getLineSeparator()).append(" /* other_warnings => true, */ /* show warnings like different attributes number "
        sql.append("/* Optional parameters are commented below - they may differ (or be absent) depending on plpgsql_check version */");
                + "anycompatible range type */");
    @Override
        sql.append(getLineSeparator()).append(")");
                + "in assignmenet on left and right side, variable overlaps function's parameter, "
        sql.append(getLineSeparator()).append(" /* security_warnings => false, */ /* security related checks "
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureParameter;
        sql.append(getLineSeparator()).append(" /* extra_warnings => true, */ /* show warnings like missing RETURN, "
                + "unmodified variables, modified auto variables, .. */");
 * Licensed under the Apache License, Version 2.0 (the "License");
                first = false;
                + "It is necessary for check of any trigger function */");
     * Generate PostgreSQL procedure check SQL - via https://github.com/okbob/plpgsql_check
        sql.append(getLineSeparator()).append(" /* anyrangetype => 'int4range', */ /* a real type used instead anyrange type */");
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedure;
import org.jkiss.utils.CommonUtils;

    protected void generateSQL(DBRProgressMonitor monitor, StringBuilder sql, DBSProcedure proc) throws DBException {
            }            
import org.jkiss.dbeaver.DBException;
        sql.append(getLineSeparator()).append(" /* anycompatibletype => 'int', */ /* a real type used instead anycompatible type */");
                + "These parameters are required when transitive tables are used */");
import org.jkiss.dbeaver.model.sql.generator.SQLGeneratorProcedure;
        }
        sql.append(getLineSeparator()).append(" /* anycompatiblerangetype => 'int4range', */ /* a real type used instead "
    /**
                + "declared type with type modificator, casting, "
        sql.append(")'").append(getLineSeparator());
        sql.append(";").append(getLineSeparator()).append(getLineSeparator());
            if (parameter.getParameterKind() == DBSProcedureParameterKind.IN) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        sql.append(getLineSeparator()).append(" /* newtable => NULL, */ /* the names of NEW or OLD transitive tables. "
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
                }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     */
                sql.append(typeName);
                + "unused variables, unwanted casting, .. */");
