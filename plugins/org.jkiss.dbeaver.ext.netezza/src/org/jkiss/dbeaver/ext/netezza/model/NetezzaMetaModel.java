        return true;

    protected boolean supportsCatalogChange() {

                        log.debug("Can't set default catalog.", e);

 * you may not use this file except in compliance with the License.
        } catch (SQLException e) {
    @Override
                }
            throw new DBDatabaseException(e, dataSource);
        try (JDBCSession session = DBUtils.openMetaSession(monitor, sourceObject, "Read Netezza procedure source")) {
                    "WHERE v.VIEWNAME=?" + (schema != null ? " AND v.SCHEMA=?" : "");
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
 *
                    return "-- Netezza procedure source not found";
import org.jkiss.dbeaver.ext.generic.model.*;
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.DBUtils;
                    }

    public GenericDataSource createDataSourceImpl(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container) throws DBException {
        }
                    } catch (Exception e) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        GenericDataSource dataSource = sourceObject.getDataSource();
{
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
    }
            String sql = "SELECT v.definition " +
import org.jkiss.dbeaver.DBException;
 *     http://www.apache.org/licenses/LICENSE-2.0
        try (JDBCSession session = DBUtils.openMetaSession(monitor, sourceObject, "Read Netezza view source")) {
        GenericSchema schema = sourceObject.getSchema();
            throw new DBDatabaseException(e, dataSource);
    public NetezzaMetaModel() {
    }
            }

import org.jkiss.utils.CommonUtils;
        } catch (SQLException e) {
                    "FROM " + DBUtils.getQuotedIdentifier(sourceObject.getCatalog()) + ".DEFINITION_SCHEMA._V_PROCEDURE p " +
    @Override
                    if (dbResult.nextRow()) {
 * NetezzaMetaModel
                session.setCatalog(catalog.getName());
                            "CREATE OR REPLACE PROCEDURE " + dbResult.getString(1) + " RETURNS " + dbResult.getString(2) +
                if (schema != null) {
    @Override
package org.jkiss.dbeaver.ext.netezza.model;
    @NotNull
            }
                if (curSessionCatalog != null) {
                    if (dbResult.nextRow()) {
 */
                    dbStat.setString(2, schema.getName());
            {
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
        GenericDataSource dataSource = sourceObject.getDataSource();
 * You may obtain a copy of the License at
                        session.setCatalog(curSessionCatalog);
                if (schema != null) {
        super();
public class NetezzaMetaModel extends GenericMetaModel
                        return
        }
 * limitations under the License.

            String curSessionCatalog = session.getCatalog();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.Map;
            try (JDBCPreparedStatement dbStat = session.prepareStatement(sql))
            } finally {
        GenericCatalog catalog = sourceObject.getCatalog();

import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
                }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                dbStat.setString(1, sourceObject.getName());
            }
import org.jkiss.dbeaver.DBDatabaseException;
                            dbResult.getString(1);
                    try {
    }
                            "CREATE OR REPLACE VIEW " + sourceObject.getName() + " AS\n" +
                    return "-- Netezza view definition not found";

            // Set session catalog. View definition can't be accessed in cross-database mode
                    "FROM " + DBUtils.getQuotedIdentifier(catalog) + ".DEFINITION_SCHEMA._V_VIEW v " +
 * Licensed under the Apache License, Version 2.0 (the "License");
/**
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
                    }
                        return
    private static final Log log = Log.getLog(NetezzaMetaModel.class);
            String sql = "SELECT p.proceduresignature,p.returns,p.proceduresource " +
        return new NetezzaDataSource(monitor, container, this);
                }
 * See the License for the specific language governing permissions and
                    dbStat.setString(2, schema.getName());
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

                    "WHERE p.procedure=?" + (schema != null ? " AND p.SCHEMA=?" : "");
                dbStat.setString(1, sourceObject.getName());
            {
 * Copyright (C) 2010-2025 DBeaver Corp and others
                curSessionCatalog = null;
    }
 *
        GenericSchema schema = sourceObject.getSchema();
/*
    }
                            " LANGUAGE NZPLSQL AS BEGIN_PROC\n" + dbResult.getString(3).trim() + "\nEND_PROC;";
                    }
    public String getViewDDL(@NotNull DBRProgressMonitor monitor, @NotNull GenericView sourceObject, @NotNull Map<String, Object> options) throws DBException {
import java.sql.SQLException;
}
import org.jkiss.dbeaver.Log;
 * Unless required by applicable law or agreed to in writing, software
 */
    public String getProcedureDDL(@NotNull DBRProgressMonitor monitor, @NotNull GenericProcedure sourceObject) throws DBException {
            } else {
                }
            if (catalog.getName() != null && !CommonUtils.equalObjects(curSessionCatalog, catalog.getName())) {
            try (JDBCPreparedStatement dbStat = session.prepareStatement(sql))
 * DBeaver - Universal Database Manager
