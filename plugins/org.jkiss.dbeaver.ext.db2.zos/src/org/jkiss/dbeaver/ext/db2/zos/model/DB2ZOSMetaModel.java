import org.jkiss.code.NotNull;
/**
        if (sourceObject instanceof GenericView view) {
                "WHERE CREATOR = ? AND NAME = ?\n" +
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.DBUtils;
    }

import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
    @Override
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
                "SELECT STATEMENT FROM SYSIBM.SYSVIEWS\n" +
                            }
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ext.generic.model.GenericView;
                                log.debug("Error freeing CLOB: " + e.getMessage());

        }
/*
        super();
        GenericDataSource dataSource = sourceObject.getDataSource();
    @Override
                                ddlStmt.free();
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
    @Override
    public DB2ZOSMetaModel() {
 *

                        } finally {
            return getViewDDL(monitor, view, options);
        try (JDBCSession session = DBUtils.openMetaSession(monitor, sourceObject, "Read DB2 z/OS view source")) {

    }
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
public class DB2ZOSMetaModel extends GenericMetaModel
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
    public boolean supportsTableDDLSplit(@NotNull GenericTableBase sourceObject) {

import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
import java.sql.SQLException;
            return super.getTableDDL(monitor, sourceObject, options);
    public String getViewDDL(@NotNull DBRProgressMonitor monitor, @NotNull GenericView sourceObject, @NotNull Map<String, Object> options) throws DBException {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import org.jkiss.dbeaver.DBDatabaseException;

                            } catch (Throwable e) {
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
                    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
import org.jkiss.dbeaver.Log;
        } else {
 * DB2ZOSMetaModel
    }
    public boolean isTrimObjectNames() {
}

    private static final Log log = Log.getLog(DB2ZOSMetaModel.class);
                        return "-- View definition not found in system catalog";

                dbStat.setString(1, sourceObject.getSchema().getName());
        return true;
 * You may obtain a copy of the License at
                        }
 *
    public String getTableDDL(@NotNull DBRProgressMonitor monitor, @NotNull GenericTableBase sourceObject, @NotNull Map<String, Object> options) throws DBException {
    @Override
    }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.Map;
 *
                        Clob ddlStmt = dbResult.getClob(1);
    @NotNull
                            try {
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
                        try {
                    if (dbResult.next()) {


    }
 */
    }
                "WITH UR"))
                    } else {
    public GenericDataSource createDataSourceImpl(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container) throws DBException {
        }
            {
 * See the License for the specific language governing permissions and
 * limitations under the License.
package org.jkiss.dbeaver.ext.db2.zos.model;
            }
import java.sql.Clob;
        } catch (SQLException e) {
                            return ddlStmt.getSubString(1, (int) ddlStmt.length());
                }
        return new DB2ZOSDataSource(monitor, container, this);
        return false;
            throw new DBDatabaseException(e, dataSource);
                dbStat.setString(2, sourceObject.getName());
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 *     http://www.apache.org/licenses/LICENSE-2.0
{
