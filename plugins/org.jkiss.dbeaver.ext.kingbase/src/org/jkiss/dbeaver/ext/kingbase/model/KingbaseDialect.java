    @Override
            prefStore = DBWorkbench.getPlatform().getPreferenceStore();
        String callEndClause = getProcedureCallEndClause(proc);
        if (!CommonUtils.isEmpty(callEndClause)) {
package org.jkiss.dbeaver.ext.kingbase.model;
        sql.append(getStoredProcedureCallInitialClause(proc)).append("(");
import org.jkiss.utils.CommonUtils;
            inParameters.addAll(parameters);
}
                            sql.append(", ");

                    }
        DBPPreferenceStore prefStore;
                        } else {
                    if (!first) {
 * limitations under the License.
import java.util.List;
            inParametersProc(sql, castParams, inParameters, namedParameterPrefix);
 * You may obtain a copy of the License at

 *
                            sql.append("?");
                default:
                case RETURN:
    }
                    break;
        if (!inParameters.isEmpty()) {
                            .append(" as ").append(typeName).append(")");
import org.jkiss.dbeaver.runtime.DBWorkbench;
 *
        }
        for (DBSProcedureParameter parameter : inParameters) {

                        sql.append(", ");
                    break;
        sql.append("\n\n");
 * distributed under the License is distributed on an "AS IS" BASIS,
                        sql.append(namedParameterPrefix).append(CommonUtils.escapeIdentifier(parameter.getName()));
                        if (castParams) {
        }
        if (dataSource != null) {
                        if (!first) {
                            sql.append("cast(?").append(" as ").append(typeName).append(")");
 * See the License for the specific language governing permissions and
            
        }
 * DBeaver - Universal Database Manager
                case IN:
                    }
            sql.append("{ ");
 *
        String namedParameterPrefix = prefStore.getString(ModelPreferences.SQL_NAMED_PARAMETERS_PREFIX);
 * you may not use this file except in compliance with the License.
            sql.append(" ").append(callEndClause);
            sql.append(";");
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.ArrayList;
                    if (castParams) {
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedure;

import org.jkiss.dbeaver.ModelPreferences;
                        }
    private void inParametersProc(StringBuilder sql, boolean castParams, List<DBSProcedureParameter> inParameters,
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDialect;
            switch (parameter.getParameterKind()) {
        if (!useBrackets) {

                    continue;
            String typeName = parameter.getParameterType().getFullTypeName();
            first = false;
        sql.append(")");
        boolean first = true;
import org.jkiss.dbeaver.model.DBPDataSource;
import java.util.Collection;
        List<DBSProcedureParameter> inParameters = new ArrayList<>();
/*
            }
                    } else {
                        }
                        sql.append("cast(").append(namedParameterPrefix).append(CommonUtils.escapeIdentifier(parameter.getName()))
        boolean useBrackets = useBracketsForExec(proc);
    @Override
        if (parameters != null) {
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureParameter;
        }
    }
    public boolean isDelimiterAfterBlock() {
        } else {
 * Unless required by applicable law or agreed to in writing, software
    public void generateStoredProcedureCall(StringBuilder sql, DBSProcedure proc,
public class KingbaseDialect extends PostgreDialect {
            prefStore = dataSource.getContainer().getPreferenceStore();
        if (useBrackets) {
        }
        DBPDataSource dataSource = proc.getDataSource();
        String namedParameterPrefix) {
        Collection<? extends DBSProcedureParameter> parameters, boolean castParams) {

                    }

        } else {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                case INOUT:
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
        }
        return true;
                    if (isStoredProcedureCallIncludesOutParameters()) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
            sql.append(" }");
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        }
