    public void addObjectDeleteActions_whenObjectIsATableWithCascadeOption_thenTableDropActionWithCascadeOptionIsReturned() throws SQLException {


                new SQLDatabasePersistAction("Drop table", "DROP TABLE foo.bar");
import org.mockito.Mockito;
    @Mock
                greenplumTableManager.createDeleteAction(greenplumTable, Collections.emptyMap());
    private PostgreServerGreenplum mockServerGreenplum;
    }
    private PostgreDatabase mockDatabase;
        SQLDatabasePersistAction regularTableDropTableQuery =
 * you may not use this file except in compliance with the License.
    private GreenplumTableManager greenplumTableManager;
        greenplumTableManager = new GreenplumTableManager();
 *     http://www.apache.org/licenses/LICENSE-2.0
        SQLDatabasePersistAction sqlDatabasePersistAction =
import java.util.Collections;
                greenplumTableManager.createDeleteAction(greenplumTable,
    private GreenplumSchema mockSchema;

    @Before


import java.sql.ResultSet;
        Assert.assertEquals(regularTableDropTableQuery.getScript(), sqlDatabasePersistAction.getScript());
 *
    @Mock
import org.junit.Before;
public class GreenplumTableManagerTest extends DBeaverUnitTest {
 * See the License for the specific language governing permissions and
    @Mock
        SQLDatabasePersistAction sqlDatabasePersistAction =
    }
import org.junit.Test;
                new SQLDatabasePersistAction("Drop table", "DROP TABLE foo.bar CASCADE");
import org.jkiss.dbeaver.ext.greenplum.model.PostgreServerGreenplum;
        GreenplumTable greenplumTable = new GreenplumTable(mockSchema, mockResults);
        Mockito.when(mockResults.getString("relname")).thenReturn("bar");
    private ResultSet mockResults;
        Mockito.when(mockDataSource.getSQLDialect()).thenReturn(new PostgreDialect());

        SQLDatabasePersistAction regularTableDropTableQuery =
    public void addObjectDeleteActions_whenObjectIsAForeignTable_thenForeignTableDropActionIsReturned() throws SQLException {
    @Test
    public void addObjectDeleteActions_whenObjectIsARegularTable_thenRegularTableDropActionIsReturned() throws SQLException {
 */
package org.jkiss.dbeaver.ext.greenplum.edit;
        Mockito.when(mockDataSource.isServerVersionAtLeast(ArgumentMatchers.anyInt(), ArgumentMatchers.anyInt())).thenReturn(false);
    @Test
 * DBeaver - Universal Database Manager

 * You may obtain a copy of the License at
        SQLDatabasePersistAction regularTableDropTableQuery =
        Mockito.when(mockSchema.getDatabase()).thenReturn(mockDatabase);
                greenplumTableManager.createDeleteAction(postgreForeignTable, Collections.emptyMap());
 * Unless required by applicable law or agreed to in writing, software
    public void setUp() {
import org.jkiss.dbeaver.ext.greenplum.model.GreenplumTable;
        Mockito.when(mockSchema.getName()).thenReturn("foo");
    }
        PostgreTableForeign postgreForeignTable = new PostgreTableForeign(mockSchema, mockResults);
import org.jkiss.junit.DBeaverUnitTest;


import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import org.jkiss.dbeaver.ext.greenplum.model.GreenplumDataSource;

        Mockito.when(mockResults.getString("relname")).thenReturn("bar");

import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableForeign;
        SQLDatabasePersistAction sqlDatabasePersistAction =
 *

        Assert.assertEquals(regularTableDropTableQuery.getScript(), sqlDatabasePersistAction.getScript());
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.mockito.Mock;
        Mockito.when(mockSchema.getDataSource()).thenReturn(mockDataSource);
    @Mock
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
 * distributed under the License is distributed on an "AS IS" BASIS,

} * Licensed under the Apache License, Version 2.0 (the "License");
    }



import org.junit.Assert;



 *
        GreenplumTable greenplumTable = new GreenplumTable(mockSchema, mockResults);
 * limitations under the License.

    @Mock
import java.sql.SQLException;
import org.jkiss.dbeaver.ext.greenplum.model.GreenplumSchema;
        Mockito.when(mockSchema.getName()).thenReturn("foo");
        Mockito.when(mockSchema.getName()).thenReturn("foo");
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDialect;
                new SQLDatabasePersistAction("Drop table", "DROP FOREIGN TABLE foo.bar");
    @Test

import org.mockito.ArgumentMatchers;
        Assert.assertEquals(regularTableDropTableQuery.getScript(), sqlDatabasePersistAction.getScript());
    private GreenplumDataSource mockDataSource;
        Mockito.when(mockResults.getString("relname")).thenReturn("bar");
/*
        Mockito.when(mockDataSource.getServerType()).thenReturn(mockServerGreenplum);
                        Collections.singletonMap("deleteCascade", true));


