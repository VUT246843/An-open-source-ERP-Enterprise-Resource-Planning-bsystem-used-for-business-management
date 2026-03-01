 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.ext.greenplum.model.GreenplumDataSource;
 * DBeaver - Universal Database Manager

 */
    @Mock

import org.junit.Before;
 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                greenplumExternalTableManager.createDeleteAction(greenplumExternalTable, Collections.emptyMap());
        Mockito.when(mockResults.getString("fmtopts")).thenReturn("\n");
 *     http://www.apache.org/licenses/LICENSE-2.0
        SQLDatabasePersistAction regularTableDropTableQuery =
        greenplumExternalTableManager = new GreenplumExternalTableManager();
 *
    public void createDeleteAction_whenObjectIsAnExternalTable_thenExternalTableDropActionIsReturned() throws SQLException {
                        Collections.singletonMap("deleteCascade", true));
 * See the License for the specific language governing permissions and

/*



    @Test
        SQLDatabasePersistAction sqlDatabasePersistAction =
    private GreenplumExternalTable newGreenplumExternalTableFixture() throws SQLException {
import org.jkiss.dbeaver.ext.greenplum.model.PostgreServerGreenplum;
        Mockito.when(mockResults.getString("relname")).thenReturn("bar");
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 * You may obtain a copy of the License at
    @Mock
public class GreenplumExternalTableManager2Test extends DBeaverUnitTest {
import java.sql.SQLException;
        return new GreenplumExternalTable(mockSchema, mockResults);
        Mockito.when(mockDataSource.isServerVersionAtLeast(ArgumentMatchers.anyInt(), ArgumentMatchers.anyInt())).thenReturn(false);
        Mockito.when(mockDataSource.getServerType()).thenReturn(mockServerGreenplum);
    @Before


import org.mockito.Mockito;

    private ResultSet mockResults;
        Mockito.when(mockSchema.getDataSource()).thenReturn(mockDataSource);
        Mockito.when(mockSchema.getName()).thenReturn("foo");
import org.jkiss.junit.DBeaverUnitTest;

                new SQLDatabasePersistAction("Drop table", "DROP EXTERNAL TABLE foo.bar");
        Assert.assertEquals(regularTableDropTableQuery.getScript(), sqlDatabasePersistAction.getScript());
    private PostgreDatabase mockDatabase;
    public void createDeleteAction_whenCascadeOptionIsProvided_thenExternalTableDropActionIsReturnedWithCascadeOption()
    }
import java.sql.ResultSet;
                greenplumExternalTableManager.createDeleteAction(greenplumExternalTable,
        Mockito.when(mockResults.getString("urilocation")).thenReturn("some_location");
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
 * Unless required by applicable law or agreed to in writing, software
import org.junit.Assert;
 *
    private GreenplumSchema mockSchema;


    @Mock
import org.mockito.Mock;
import org.jkiss.dbeaver.ext.greenplum.model.GreenplumExternalTable;
        Mockito.when(mockDataSource.getSQLDialect()).thenReturn(new PostgreDialect());
}

        Mockito.when(mockSchema.getName()).thenReturn("foo");

        Mockito.when(mockResults.getString("encoding")).thenReturn("UTF8");
        SQLDatabasePersistAction sqlDatabasePersistAction =
            throws SQLException {
        GreenplumExternalTable greenplumExternalTable = newGreenplumExternalTableFixture();


        Mockito.when(mockResults.getString("relname")).thenReturn("bar");
        GreenplumExternalTable greenplumExternalTable = newGreenplumExternalTableFixture();
    }
        Mockito.when(mockResults.getString("execlocation")).thenReturn("some_location");

import java.util.Collections;


                new SQLDatabasePersistAction("Drop table", "DROP EXTERNAL TABLE foo.bar CASCADE");
        Mockito.when(mockResults.getString("fmttype")).thenReturn("b");
    private GreenplumExternalTableManager greenplumExternalTableManager;
        Mockito.when(mockSchema.getDatabase()).thenReturn(mockDatabase);
        SQLDatabasePersistAction regularTableDropTableQuery =
import org.jkiss.dbeaver.ext.greenplum.model.GreenplumSchema;
        Assert.assertEquals(regularTableDropTableQuery.getScript(), sqlDatabasePersistAction.getScript());
    @Test
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.mockito.ArgumentMatchers;
    @Mock
import org.junit.Test;

package org.jkiss.dbeaver.ext.greenplum.edit;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDialect;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;
    public void setUp() {
    private GreenplumDataSource mockDataSource;
    private PostgreServerGreenplum mockServerGreenplum;
 *

    @Mock

