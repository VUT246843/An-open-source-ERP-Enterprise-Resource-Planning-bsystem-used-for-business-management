 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.ui.app.devtools.tools;
 */
/*

 * you may not use this file except in compliance with the License.
//        final String url = "jdbc:oracle:thin:@127.0.0.1:1521:ORCL";
                for (int i = 0; i < 20000000; i++) {
                }
//        final Properties props = new Properties();
    }
                        "CREATE TABLE test.BigTable (table_key integer, some_string varchar(64), create_time timestamp, primary key(table_key))"))
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
            }
public class HugeTableGenerator {
import java.sql.*;


 * distributed under the License is distributed on an "AS IS" BASIS,
}
                        System.out.println(i + " records");
    public static void main(String[] args) throws SQLException {
        props.setProperty("user", "root");
                    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
        final Properties props = new Properties();

                    stmt.setString(2, "Row " + i);
 *
        props.setProperty("password", "");
            }
 * Unless required by applicable law or agreed to in writing, software
            {
            try (PreparedStatement stmt = conn.prepareStatement(
                    if (i % 100000 == 0) {
 *
                stmt.execute();
        try (Connection conn = DriverManager.getConnection(url, props)) {
import java.util.Properties;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    "INSERT INTO test.BigTable(table_key, some_string, create_time) values(?,?,?)")) {
                    stmt.setTimestamp(3, new Timestamp(System.currentTimeMillis()));
                conn.commit();
        final String url = "jdbc:mysql://localhost:3306/test";
            // 10kk records

//        props.setProperty("password", "");
 *
                        conn.commit();

 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at
                    stmt.setInt(1, i);

                    stmt.execute();
        }
 * limitations under the License.
            conn.setAutoCommit(false);
//        props.setProperty("user", "sys as sysdba");
            conn.setAutoCommit(true);
            try (PreparedStatement stmt = conn.prepareStatement(

