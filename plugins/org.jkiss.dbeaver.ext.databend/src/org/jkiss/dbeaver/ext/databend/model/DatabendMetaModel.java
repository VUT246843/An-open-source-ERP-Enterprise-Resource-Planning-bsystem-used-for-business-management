import org.jkiss.dbeaver.model.DBPEvaluationContext;
    public DBPErrorAssistant.ErrorPosition getErrorPosition(@NotNull Throwable error) {
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.exec.DBCQueryTransformProvider;
            (schema != null && schema.getName().equals("system"))
import org.jkiss.code.Nullable;
                pos.line = Integer.parseInt(matcher.group(1)) - 1;
    public boolean isSchemasOptional() {
import org.jkiss.dbeaver.ext.generic.model.GenericSchema;
                    StringBuilder sql = new StringBuilder();
                return pos;
        }

import org.jkiss.dbeaver.model.DBUtils;
 */
    }

public class DatabendMetaModel extends GenericMetaModel implements DBCQueryTransformProvider {
        return getTableDDL(monitor, sourceObject, options);
}
                    while (dbResult.nextRow()) {
            Matcher matcher = ERROR_POSITION_PATTERN.matcher(message);

 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.DBDatabaseException;

                pos.position = Integer.parseInt(matcher.group(2)) - 1;
import org.jkiss.dbeaver.model.DBPErrorAssistant;
        String message = error.getMessage();
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return new QueryTransformerLimit(false);
        if (type == DBCQueryTransformType.RESULT_SET_LIMIT) {
        }
import org.jkiss.code.NotNull;
        return false;
    public boolean supportsTableDDLSplit(@NotNull GenericTableBase sourceObject) {

    public String getTableDDL(@NotNull DBRProgressMonitor monitor, @NotNull GenericTableBase sourceObject, @NotNull Map<String, Object> options) throws DBException {
    @Override

    public String getViewDDL(@NotNull DBRProgressMonitor monitor, @NotNull GenericView sourceObject, @NotNull Map<String, Object> options) throws DBException {
    }
 *
    @Override
        }
    }
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
import java.util.Map;
    @Override
        return null;

        ) {
                    }
    }
        } catch (SQLException e) {
    }
        return false;  // driver does not return correct information
    public boolean hasProcedureSupport() {
        return null;
    }
                }
import org.jkiss.dbeaver.model.impl.sql.QueryTransformerLimit;
    @Nullable
        return false;
 * You may obtain a copy of the License at
 *
package org.jkiss.dbeaver.ext.databend.model;
/**
 * Unless required by applicable law or agreed to in writing, software
    private Pattern ERROR_POSITION_PATTERN = Pattern.compile(" SQL([0-9]+)\\:([0-9]+)");
    public boolean hasFunctionSupport() {
    public DBCQueryTransformer createQueryTransformer(@NotNull DBCQueryTransformType type) {

        if (
            || (catalog != null && catalog.getName().equals("system"))
import org.jkiss.dbeaver.model.exec.DBCQueryTransformer;
 * distributed under the License is distributed on an "AS IS" BASIS,


 *
    public DatabendMetaModel() {
import java.sql.SQLException;
 * Databend meta model
        GenericSchema schema =  sourceObject.getSchema();
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
                    TABLE_DDL + " " + sourceObject.getFullyQualifiedName(DBPEvaluationContext.DDL))) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
                        sql.append(dbResult.getString(2)).append("\n");
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.regex.Pattern;
import org.jkiss.dbeaver.ext.generic.model.GenericView;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
import org.jkiss.dbeaver.ext.generic.model.GenericCatalog;
    private static final String TABLE_DDL = "SHOW CREATE TABLE ";
                DBPErrorAssistant.ErrorPosition pos = new DBPErrorAssistant.ErrorPosition();
        }


    @Override
 */
                    return sql.toString();
import org.jkiss.utils.CommonUtils;
        try (JDBCSession session = DBUtils.openMetaSession(monitor, sourceObject, "Read Databend object DDL")) {
    }
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
/*
        if (!CommonUtils.isEmpty(message)) {
 * limitations under the License.
    @Override
            throw new DBDatabaseException(e, sourceObject.getDataSource());
    @Nullable
        return false;  // driver does not return correct information
        GenericCatalog catalog =  sourceObject.getCatalog();

import java.util.regex.Matcher;
            }
            if (matcher.find()) {
 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.
            return super.getTableDDL(monitor, sourceObject, options);
            }
import org.jkiss.dbeaver.model.exec.DBCQueryTransformType;
    @Override
