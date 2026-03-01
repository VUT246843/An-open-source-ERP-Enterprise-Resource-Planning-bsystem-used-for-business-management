    private static final String VIEW_DDL = "SHOW CREATE VIEW ";

    }
 *
        return null;

        return false;
        return false;
        } catch (SQLException e) {
            }
    @Override


            if (matcher.find()) {
    public String getViewDDL(@NotNull DBRProgressMonitor monitor, @NotNull GenericView sourceObject, @NotNull Map<String, Object> options) throws DBException {
                return pos;
    @Override
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
    @Nullable
                    }
                pos.line = Integer.parseInt(matcher.group(1)) - 1;


        if (type == DBCQueryTransformType.RESULT_SET_LIMIT) {

/**

    public boolean supportsTableDDLSplit(@NotNull GenericTableBase sourceObject) {
import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.dbeaver.model.impl.sql.QueryTransformerLimit;
 * DBeaver - Universal Database Manager
    }
        }

 * Athena meta model
    }
import org.jkiss.dbeaver.model.exec.DBCQueryTransformer;
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
        try (JDBCSession session = DBUtils.openMetaSession(monitor, sourceObject, "Read Athena object DDL")) {
    private String getObjectDDL(DBRProgressMonitor monitor, GenericTableBase sourceObject, Map<String, Object> options, String ddlStatement) throws DBException {
    }
import org.jkiss.dbeaver.DBDatabaseException;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    public String getTableDDL(@NotNull DBRProgressMonitor monitor, @NotNull GenericTableBase sourceObject, @NotNull Map<String, Object> options) throws DBException {
        return null;
    public boolean isSchemasOptional() {
            throw new DBDatabaseException(e, sourceObject.getDataSource());
                    StringBuilder sql = new StringBuilder();
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 *
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
                DBPErrorAssistant.ErrorPosition pos = new DBPErrorAssistant.ErrorPosition();
import java.util.regex.Pattern;
    }
import org.jkiss.dbeaver.model.DBPErrorAssistant;
import org.jkiss.code.NotNull;
    @Override
                pos.position = Integer.parseInt(matcher.group(2)) - 1;
        }
import org.jkiss.dbeaver.model.exec.DBCQueryTransformType;
 *
    @Override
                ddlStatement + " " + sourceObject.getFullyQualifiedName(DBPEvaluationContext.DDL))) {
            return new QueryTransformerLimit(false);
 */
import org.jkiss.dbeaver.DBException;

 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.Nullable;
 */
    private static final String TABLE_DDL = "SHOW CREATE TABLE ";
 * You may obtain a copy of the License at
        return getObjectDDL(monitor, sourceObject, options, TABLE_DDL);
        if (!CommonUtils.isEmpty(message)) {
    @Nullable
        String message = error.getMessage();
                    while (dbResult.nextRow()) {
 * See the License for the specific language governing permissions and
    }
}
    @Override
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
                    return sql.toString();
import java.util.regex.Matcher;
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.exec.DBCQueryTransformProvider;

import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
package org.jkiss.dbeaver.ext.athena.model;
    public DBPErrorAssistant.ErrorPosition getErrorPosition(@NotNull Throwable error) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.Map;

            Matcher matcher = ERROR_POSITION_PATTERN.matcher(message);
    }
import org.jkiss.dbeaver.ext.generic.model.GenericView;
    private Pattern ERROR_POSITION_PATTERN = Pattern.compile(" line ([0-9]+)\\:([0-9]+)");
    }
/*
                        sql.append(dbResult.getString(1)).append("\n");
    public AthenaMetaModel() {
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
public class AthenaMetaModel extends GenericMetaModel implements DBCQueryTransformProvider {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import java.sql.SQLException;
import org.jkiss.dbeaver.model.DBUtils;
        return getObjectDDL(monitor, sourceObject, options, VIEW_DDL);
    public DBCQueryTransformer createQueryTransformer(@NotNull DBCQueryTransformType type) {
            }
                }
 * limitations under the License.
        }
 * you may not use this file except in compliance with the License.
