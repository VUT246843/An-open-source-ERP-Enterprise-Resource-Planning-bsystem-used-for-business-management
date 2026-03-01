import org.jkiss.dbeaver.model.*;
    /**
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    public static class IoTDBDatabase {
     * Load databases and tables
                                    databases.add(newDatabase);
 * Licensed under the Apache License, Version 2.0 (the "License");
            this.name = name;
        try {
    }
    public void loadDatabases(DBRProgressMonitor monitor) throws DBException {
                                }
            }
    }

                loadDatabases(monitor);
 * distributed under the License is distributed on an "AS IS" BASIS,
     *
    /**
 * You may obtain a copy of the License at
/*
        databases = new ArrayList<>();
import java.util.Map;
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load Databases and Tables Info")) {
                                    }
        }
import java.util.HashMap;
     * Get the list of databases
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        String currentTableName = rs.getString("Device").substring(prefixLength);
                        databases.add(newDatabase);

     * @throws DBException if an error occurs
            log.error("Error loading databases and tables", e);
    public void loadTreeDatabasesAndDevices(@NotNull DBRProgressMonitor monitor) throws DBException {
    }
 * limitations under the License.

                    for (Map.Entry<String, List<String>> entry : databaseDevicesMap.entrySet()) {
            try (JDBCStatement stmt = session.createStatement()) {
                                    IoTDBDatabase newDatabase = new IoTDBDatabase(currentDatabase, currentTables);
                    }
                               String userName,
 * See the License for the specific language governing permissions and

 * Unless required by applicable law or agreed to in writing, software
        }
    public IoTDBRelationalUser(IoTDBDataSource dataSource,

     * Load devices with a single query
        } catch (DBException e) {
import org.jkiss.dbeaver.DBException;
            if (dataSource.isTable()) {
                loadTreeDatabasesAndDevices(monitor);


        }
                        int prefixLength = currentDatabase.length() + 1;
import org.jkiss.dbeaver.DBDatabaseException;
     */

import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                        while (rs.next()) {
                try (JDBCResultSet rs = stmt.executeQuery("show devices root.** with database")) {
                        databaseDevicesMap.computeIfAbsent(currentDatabase, ignored -> new ArrayList<>()).add(currentTableName);
        }
            tables.add("(ALL)");
                }
        public IoTDBDatabase(String name, List<String> tables) {

            }
    private static final Log log = Log.getLog(IoTDBRelationalUser.class);
 *
                                        while (rs2.next()) {

        } catch (Exception e) {
        public final String name;
                        }

import org.jkiss.dbeaver.Log;

            log.error("Error loading databases and tables", e);
            String sql = "show databases"; // use this instead of select * from information_schema to prevent permission issues
                    }
        super(dataSource, userName);
 * you may not use this file except in compliance with the License.
            allDatabase = new IoTDBDatabase("(ALL)", tables);
     */
        return allDatabase;
            try (JDBCStatement stmt = session.createStatement()) {
     *
            List<String> tables = new ArrayList<>();
 *     http://www.apache.org/licenses/LICENSE-2.0
                            try (JDBCStatement stmt2 = session.createStatement()) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
    }
    public IoTDBDatabase getDatabaseAll() {
                               DBRProgressMonitor monitor) throws DBException {
import java.util.List;
import java.util.ArrayList;
        if (allDatabase == null) {
 * DBeaver - Universal Database Manager
            log.error("Error loading databases and tables in tree model", e);
                    if (rs != null) {
import org.jkiss.code.NotNull;

                                        }
                        String currentDatabase = rs.getString("Database");
            throw new DBDatabaseException(e, this.getDataSource());
    /**
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                            }

                                    if (rs2 != null) {
                        IoTDBDatabase newDatabase = new IoTDBDatabase(entry.getKey(), entry.getValue());
                                try (JDBCResultSet rs2 = stmt2.executeQuery(sql)) {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load Databases and Tables Info")) {
            }

        databases = new ArrayList<>();
        return databases;
     * @throws DBException if an error occurs
     * @return List of IoTDBDatabase
    private IoTDBDatabase allDatabase;
                }
                            sql = "show tables in " + DBUtils.getQuotedIdentifier(dataSource, currentDatabase, true, true);

                try (JDBCResultSet rs = stmt.executeQuery(sql)) {
        } catch (Exception e) {
 *
package org.jkiss.dbeaver.ext.iotdb.model;
            } else {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        Map<String, List<String>> databaseDevicesMap = new HashMap<>();
    private List<IoTDBDatabase> databases;      // All databases and tables with permissions
                            List<String> currentTables = new ArrayList<>();
        public final List<String> tables;
        }
    public List<IoTDBDatabase> getDatabases() {
    }
                                            currentTables.add(rs2.getString("TableName"));
 */
            this.tables = tables;
                    }
     */
public class IoTDBRelationalUser extends IoTDBAbstractUser {
                            String currentDatabase = rs.getString("Database");

                    while (rs.next()) {
    }
 *
}
     *
