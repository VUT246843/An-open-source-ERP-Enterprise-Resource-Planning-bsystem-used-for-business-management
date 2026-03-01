 *
                    StringBuilder sql = new StringBuilder();
import java.sql.SQLException;


    @Override
 *
    public DenodoMetaModel() {


package org.jkiss.dbeaver.ext.denodo.model;
 * See the License for the specific language governing permissions and
/*
        } catch (SQLException e) {
            }
    public boolean supportsTableDDLSplit(@NotNull GenericTableBase sourceObject) {
import java.util.Map;
        try (JDBCSession session = DBUtils.openMetaSession(monitor, sourceObject, "Read Denodo object DDL")) {
    public boolean isTableColumnCommentEditable() {
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
import org.jkiss.dbeaver.model.DBUtils;
 * Licensed under the Apache License, Version 2.0 (the "License");
{
            }
import org.jkiss.code.NotNull;

            throw new DBDatabaseException(e, dataSource);
                    }
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
 *
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
    @Override
    }
import org.jkiss.dbeaver.DBException;
                    String result = sql.toString().trim();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *     http://www.apache.org/licenses/LICENSE-2.0
                        sql.append(dbResult.getString(1));
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;

 * limitations under the License.
    }

    }
import org.jkiss.dbeaver.Log;
    @Override
                    "DESC VQL VIEW " + sourceObject.getFullyQualifiedName(DBPEvaluationContext.DDL) + vqlDescriptionParameter))
        }
    }
            {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        try (JDBCSession session = DBUtils.openMetaSession(monitor, sourceObject, "Read Denodo object DDL")) {
                }
    private static final Log log = Log.getLog(DenodoMetaModel.class);
 * DBeaver - Universal Database Manager
 * DenodoMetaModel
 * you may not use this file except in compliance with the License.
 */
        return new DenodoDataSource(monitor, container, this);
        return false;
    }

        GenericDataSource dataSource = sourceObject.getDataSource();
        super();
 * You may obtain a copy of the License at
    @Override

 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.DBDatabaseException;
    public boolean isTableCommentEditable() {
        } catch (SQLException e) {
                }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ext.generic.model.GenericView;
    public String getViewDDL(@NotNull DBRProgressMonitor monitor, @NotNull GenericView sourceObject, @NotNull Map<String, Object> options) throws DBException {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            {
            " ('includeDependencies' = 'no', 'dropElements' = 'no')";
                    while (dbResult.nextRow()) {
                    }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        return false;
                    StringBuilder sql = new StringBuilder();
                        sql.append(dbResult.getString(1));
                    }
    @Override
                    while (result.endsWith(";")) {
/**
    }
        GenericDataSource dataSource = sourceObject.getDataSource();
                    return result;
 */
}

import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
 * distributed under the License is distributed on an "AS IS" BASIS,
        return false;
                        result = result.substring(0, result.length() - 1);
    @Override

    @NotNull
import org.jkiss.dbeaver.ext.generic.model.GenericProcedure;
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
    public String getProcedureDDL(@NotNull DBRProgressMonitor monitor, @NotNull GenericProcedure sourceObject) throws DBException {

        }
                    return sql.toString();

    public GenericDataSource createDataSourceImpl(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container) throws DBException {
            throw new DBDatabaseException(e, dataSource);
                    while (dbResult.nextRow()) {
    private static final String vqlDescriptionParameter =

public class DenodoMetaModel extends GenericMetaModel
                    "DESC VQL PROCEDURE " + sourceObject.getFullyQualifiedName(DBPEvaluationContext.DDL) + vqlDescriptionParameter))
    }
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
 * Copyright (C) 2010-2025 DBeaver Corp and others
