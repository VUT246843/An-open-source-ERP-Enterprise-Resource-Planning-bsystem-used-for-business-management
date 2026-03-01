import org.jkiss.dbeaver.model.struct.rdb.DBSProcedure;
}
                        .append(" as ").append(typeName).append(")");
                        sql.append("?");
import org.jkiss.dbeaver.runtime.DBWorkbench;
    }
        }
 */
                if (isStoredProcedureCallIncludesOutParameters()) {
 * limitations under the License.
import java.util.List;
                    sql.append("cast(").append(namedParameterPrefix).append(CommonUtils.escapeIdentifier(parameter.getName()))
        if (parameters != null) {
            {
                continue;
import org.jkiss.utils.CommonUtils;
        } else {
        }
        } else {
                break;
        DBPPreferenceStore prefStore;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
            case INOUT:

            default:
        DBPDataSource dataSource = proc.getDataSource();
import org.jkiss.dbeaver.ModelPreferences;
        String namedParameterPrefix) {
            switch (parameter.getParameterKind())
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDialect;
                    }
    @Override
package org.jkiss.dbeaver.ext.gaussdb.model;
 * DBeaver - Universal Database Manager
            case IN:
            inParameters.addAll(parameters);
            prefStore = DBWorkbench.getPlatform().getPreferenceStore();
        }
    }
                if (!first) {
        if (!useBrackets) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
        Collection<? extends DBSProcedureParameter> parameters, boolean castParams) {
                }

                if (castParams) {
                }
                    sql.append(namedParameterPrefix).append(CommonUtils.escapeIdentifier(parameter.getName()));
            case RETURN:
import java.util.Collection;
                    } else {
 *
        for (DBSProcedureParameter parameter : inParameters) {
 * Unless required by applicable law or agreed to in writing, software

            String typeName = parameter.getParameterType().getFullTypeName();
            sql.append(" ").append(callEndClause);
                    }

 * Licensed under the Apache License, Version 2.0 (the "License");
        String namedParameterPrefix = prefStore.getString(ModelPreferences.SQL_NAMED_PARAMETERS_PREFIX);

        if (useBrackets)
    public boolean isDelimiterAfterBlock() {

            sql.append(";");
        sql.append(")");
        }
                    sql.append(", ");
        String callEndClause = getProcedureCallEndClause(proc);
                    if (!first) {
            sql.append("{ ");
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
        List<DBSProcedureParameter> inParameters = new ArrayList<>();
            prefStore = dataSource.getContainer().getPreferenceStore();
                    if (castParams) {
 *
        }
                } else {
            }
 * you may not use this file except in compliance with the License.
                        sql.append("cast(?").append(" as ").append(typeName).append(")");
 * See the License for the specific language governing permissions and

/*
                        sql.append(", ");
        }
                }
 * distributed under the License is distributed on an "AS IS" BASIS,
        boolean useBrackets = useBracketsForExec(proc);
            first = false;
        if (!inParameters.isEmpty()) {
        if (!CommonUtils.isEmpty(callEndClause)) {
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureParameter;
public class GaussDBDialect extends PostgreDialect {
        sql.append(getStoredProcedureCallInitialClause(proc)).append("(");
        sql.append("\n\n");
    private void inParametersProc(StringBuilder sql, boolean castParams, List<DBSProcedureParameter> inParameters,
    public void generateStoredProcedureCall(StringBuilder sql, DBSProcedure proc,
            sql.append(" }");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        boolean first = true;
import java.util.ArrayList;
            inParametersProc(sql, castParams, inParameters, namedParameterPrefix);
        if (dataSource != null) {
 * You may obtain a copy of the License at
        return true;
                break;
    }
