 *
            new String[][]{

                {"host", "localhost"},
 */
            });
import org.jkiss.code.NotNull;
        }
                {"host", "localhost"},
                {"host", "localhost"}
    @Test

 * See the License for the specific language governing permissions and

import org.junit.Test;
}
                {"database", "orcl"}
            "jdbc:sqlite:C:\\Users\\%USERNAME%\\Documents\\Chinook.db",
            "jdbc:teradata://{host}/DATABASE={database},DBS_PORT={port}",
            new String[][]{
        final Matcher matcher = DatabaseURL.getPattern(sampleUrl).matcher(targetUrl);
            "jdbc:sqlite:{file}",
            "jdbc:teradata://localhost/DATABASE=test,DBS_PORT=1234",
        assertMatches(
    }
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
 *

                {"port", "4497"},
            "jdbc:oracle:thin:@localhost/orcl",
                {"port", "1234"}

                {"file", "C:\\Users\\%USERNAME%\\Documents\\Chinook.db"}

        assertMatches(
        assertMatches(
 * limitations under the License.
            "jdbc:sqlserver://{host}[:{port}][;databaseName={database}]",
                {"port", "1433"},
                {"host", "localhost"},
        assertMatches(
        Assert.assertTrue(sampleUrl, matcher.find());
import org.jkiss.junit.DBeaverUnitTest;
    public void testMatchPattern() {

            new String[][]{
        Assert.assertTrue(sampleUrl, matcher.matches());
        final Matcher matcher = DatabaseURL.getPattern(sampleUrl).matcher(targetUrl);
    private void assertMatches(@NotNull String sampleUrl, @NotNull String targetUrl, @NotNull String[][] properties) {
        assertMatches(
        assertMatches(
            new String[][]{
package org.jkiss.dbeaver.model.impl.jdbc;
import org.jkiss.dbeaver.model.DatabaseURL;
            "jdbc:sqlserver://localhost",
            Assert.assertEquals(sampleUrl, property[1], matcher.group(property[0]));
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
                {"port", "5432"},
            });
                {"host", "mysql-rfam-public.ebi.ac.uk"},
import java.util.regex.Matcher;
            new String[][]{
 *
                {"database", "master"}
    }
    }
public class DatabaseURLTest extends DBeaverUnitTest {
            "jdbc:postgresql://{host}[:{port}]/[{database}]",
 * You may obtain a copy of the License at
            "jdbc:oracle:thin:@{host}[:{port}]/{database}",
            "jdbc:mysql://{host}[:{port}]/[{database}]",
import org.junit.Assert;

/*
            new String[][]{
            Assert.assertEquals(sampleUrl, property[1], matcher.group(property[0]));
            });
            "jdbc:sqlserver://{host}[:{port}][;databaseName={database}]",
            });
    private void assertFind(@NotNull String sampleUrl, @NotNull String targetUrl, @NotNull String[][] properties) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            "jdbc:mysql://mysql-rfam-public.ebi.ac.uk:4497/Rfam?useSSL=false&serverTimezone=UTC",
            "jdbc:postgresql://localhost:5432/dvdrental",
            new String[][]{
            });
        }
        for (String[] property : properties) {

                {"database", "test"},
 *     http://www.apache.org/licenses/LICENSE-2.0
        for (String[] property : properties) {
 * DBeaver - Universal Database Manager
            });
                {"database", "dvdrental"}
                {"database", "Rfam"}
                {"host", "localhost"},
            "jdbc:sqlserver://localhost:1433;databaseName=master",


            });
        assertFind(
