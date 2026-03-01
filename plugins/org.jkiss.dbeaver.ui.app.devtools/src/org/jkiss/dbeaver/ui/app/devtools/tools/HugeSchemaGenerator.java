        }
import java.util.Properties;

                }
        props.setProperty("password", "");
                        "CREATE TABLE HUGE_SCHEMA.TEST_TABLE" + i + "(ID INTEGER NOT NULL, VAL VARCHAR(64))")) {

            }
 * limitations under the License.
                    stmt.execute();
 * Unless required by applicable law or agreed to in writing, software
            conn.setAutoCommit(true);

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class HugeSchemaGenerator {

import java.sql.PreparedStatement;
/*
        props.setProperty("user", "");
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
import java.sql.Connection;

 * Copyright (C) 2010-2025 DBeaver Corp and others
        try (Connection conn = DriverManager.getConnection(url, props)) {
    public static void main(String[] args) throws SQLException {
 * Licensed under the Apache License, Version 2.0 (the "License");
                        System.out.println(i + " tables");
                stmt.execute();
 * you may not use this file except in compliance with the License.

 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
import java.sql.SQLException;
package org.jkiss.dbeaver.ui.app.devtools.tools;
import java.sql.DriverManager;
        final Properties props = new Properties();
                try (PreparedStatement stmt = conn.prepareStatement(
        final String url = "jdbc:postgresql://localhost/postgres";
}
 *
 * See the License for the specific language governing permissions and

 *
 *
                    }
                        "CREATE SCHEMA HUGE_SCHEMA"))
            try (PreparedStatement stmt = conn.prepareStatement(
    }
            for (int i = 0; i < 10000; i++) {
            }
            {
                    if (i % 100 == 0) {
 *     http://www.apache.org/licenses/LICENSE-2.0

