        Mockito.when(mockSession.createStatement()).thenReturn(mockStatement);
        Assert.assertEquals("\nDISTRIBUTED REPLICATED", ddl.toString());
        Mockito.when(mockDataSource.isServerVersionAtLeast(Mockito.anyInt(), Mockito.anyInt())).thenReturn(false);
        Mockito.when(mockDataSource.isServerVersionAtLeast(Mockito.anyInt(), Mockito.anyInt())).thenReturn(true);


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        Mockito.when(mockResults.getString("relname")).thenReturn(exampleTableName);
        Mockito.when(mockDCResults.getObject(1)).thenReturn(new int[]{1, 2});

        Mockito.when(mockSchema.getTableCache()).thenReturn(mockTableCache);
 * You may obtain a copy of the License at
import java.sql.SQLException;
 *
        Assert.assertEquals("\nDISTRIBUTED RANDOMLY", ddl.toString());
import org.mockito.Mock;
        Mockito.when(mockDCResults.next()).thenReturn(false);

        Mockito.when(mockDatabase.getDefaultContext(Mockito.any(), Mockito.anyBoolean())).thenReturn(mockContext);


        Mockito.when(mockResults.getString("relpersistence")).thenReturn("x");

        table.appendTableModifiers(mockMonitor, ddl);
        Mockito.when(mockContext.openSession(Mockito.eq(monitor), Mockito.eq(DBCExecutionPurpose.META),

        StringBuilder ddl = new StringBuilder();
    public void appendTableModifiers_whenServerVersion9_andIsReplicated_resultsInReplicated() throws Exception {
        Mockito.when(mockSchema.getDataSource()).thenReturn(mockDataSource);
    PostgreDatabase mockDatabase;
    }
                    Mockito.when(mockColumn.getOrdinalPosition()).thenReturn(i + 1);
    private final String exampleDatabaseName = "sampleDatabase";
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.List;


    @Mock
        List<PostgreTableColumn> mockColumns = createMockColumns("Column_1", "Column_2");
import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;


import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;
import org.jkiss.dbeaver.ext.postgresql.model.*;
    @Mock
        JDBCResultSet mockDCResults = mockResults(mockMonitor);
    PostgreSchema.TableCache mockTableCache;

import java.util.Collections;

 * Copyright (C) 2010-2024 DBeaver Corp and others
        table.appendTableModifiers(mockMonitor, ddl);

                    Mockito.when(mockColumn.getDataSource()).thenReturn(mockDataSource);

    private final String exampleTableName = "sampleTable";
        Mockito.when(mockDataSource.getServerType()).thenReturn(mockServerGreenplum);
        return mockDCResults;
                }).collect(Collectors.toList());

import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;

    @Mock
 * limitations under the License.
package org.jkiss.dbeaver.ext.greenplum.model;
        Mockito.when(mockSchema.getConstraintCache()).thenReturn(mockConstraintCache);



    @Test
        return IntStream.range(0, columns.length)
    public void appendTableModifiers_whenServerVersion8_andSingleColumnSetForDistribution_resultsInDistributedByThatColumn() throws Exception {

    }
        Mockito.when(mockDatabase.isInstanceConnected()).thenReturn(true);
        Assert.assertEquals("\nDISTRIBUTED RANDOMLY", ddl.toString());
        JDBCSession mockSession = Mockito.mock(JDBCSession.class);
                .thenReturn(mockColumns);
public class GreenplumTableTest extends DBeaverUnitTest {

    }


    DBRProgressMonitor mockMonitor;
 *

        Mockito.when(mockSchema.getName()).thenReturn(exampleSchemaName);
        JDBCResultSet mockDCResults = mockResults(mockMonitor);
    @Mock

                Mockito.anyString())).thenReturn(mockSession);
    private PostgreServerGreenplum mockServerGreenplum;

        JDBCResultSet mockDCResults = mockResults(mockMonitor);
        table = new GreenplumTable(mockSchema, mockResults);
        table = new GreenplumTable(mockSchema, mockResults);
                    PostgreTableColumn mockColumn = Mockito.mock(PostgreTableColumn.class);

import java.util.stream.IntStream;
                .thenReturn(mockColumns);
        List<PostgreTableConstraint> constraints = Collections.emptyList();
    public void appendTableModifiers_whenServerVersion8_andNoColumnSetForDistribution_resultsInRandom() throws Exception {
    GreenplumDataSource mockDataSource;
        StringBuilder ddl = new StringBuilder();
 */
        Mockito.when(mockDataSource.getDefaultInstance()).thenReturn(mockDatabase);
        Mockito.when(mockDataSource.getSQLDialect()).thenReturn(new PostgreDialect());
    @Test

    JDBCExecutionContext mockContext;
        StringBuilder ddl = new StringBuilder();
        Mockito.when(mockTableCache.getChildren(mockMonitor, mockSchema, table))

    @Mock
        Mockito.when(mockDCResults.next()).thenReturn(false, true);
    private final String exampleSchemaName = "sampleSchema";
        table.appendTableModifiers(mockMonitor, ddl);

        Mockito.when(mockConstraintCache.getTypedObjects(mockMonitor, mockSchema, table, PostgreTableConstraint.class))

        JDBCStatement mockStatement = Mockito.mock(JDBCStatement.class);
        Mockito.when(mockSchema.getTableCache()).thenReturn(mockTableCache);
        Mockito.when(mockDCResults.getString(1)).thenReturn("x");



    private GreenplumTable table;
        List<PostgreTableColumn> mockColumns = createMockColumns("Column_Name");
        JDBCResultSet mockDCResults = mockResults(mockMonitor);
    @Before
    PostgreSchema.ConstraintCache mockConstraintCache;
    @Mock
        Mockito.when(mockSchema.getTableCache()).thenReturn(mockTableCache);
import org.junit.Before;
        Assert.assertEquals("\nDISTRIBUTED BY (\"Column_1\", \"Column_2\")", ddl.toString());
    }
/*
    }
        Mockito.when(mockStatement.executeQuery(Mockito.anyString())).thenReturn(mockDCResults);
    @Mock
                .mapToObj(i -> {
                    Mockito.when(mockColumn.getName()).thenReturn(columnName);
import java.util.stream.Collectors;
 * distributed under the License is distributed on an "AS IS" BASIS,

 * you may not use this file except in compliance with the License.

 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }

        Assert.assertEquals("\nDISTRIBUTED BY (\"Column_Name\")", ddl.toString());
 *     http://www.apache.org/licenses/LICENSE-2.0


}    }

        Mockito.when(mockDCResults.getObject(1)).thenReturn(new int[]{1});
    @Test


    }

import org.junit.Assert;
        Mockito.when(mockSchema.getSchema()).thenReturn(mockSchema);
                .thenReturn(constraints);
 * See the License for the specific language governing permissions and
    public void setUp() throws Exception {
import org.mockito.Mockito;
    @Mock

        Mockito.when(mockTableCache.getChildren(mockMonitor, mockSchema, table))
        Mockito.when(mockDCResults.getString(1)).thenReturn("r");
    PostgreSchema mockSchema;
    public void appendTableModifiers_whenServerVersion9_andNotReplicated_andNoColumnSetForDistribution_resultsInRandom() throws Exception {
        Mockito.when(mockDCResults.next()).thenReturn(true);
import org.jkiss.junit.DBeaverUnitTest;
        StringBuilder ddl = new StringBuilder();

    private List<PostgreTableColumn> createMockColumns(String... columns) {

        Mockito.when(mockDCResults.next()).thenReturn(false, true);
        Mockito.when(mockSchema.getDatabase()).thenReturn(mockDatabase);
        table.appendTableModifiers(mockMonitor, ddl);


    private JDBCResultSet mockResults(DBRProgressMonitor monitor) throws SQLException {
        StringBuilder ddl = new StringBuilder();
        table = new GreenplumTable(mockSchema, mockResults);
import org.junit.Test;
                    String columnName = columns[i];

import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;


        table = new GreenplumTable(mockSchema, mockResults);
    public void appendTableModifiers_whenServerVersion8_andMultipleSingleColumnSetForDistribution_resultsInDistributedByThoseColumns() throws Exception {
        Mockito.when(mockDCResults.next()).thenReturn(true);
        table = new GreenplumTable(mockSchema, mockResults);


    @Test
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    @Test
 * DBeaver - Universal Database Manager
    JDBCResultSet mockResults;
        JDBCResultSet mockDCResults = mockResults(mockMonitor);
        table.appendTableModifiers(mockMonitor, ddl);
        JDBCResultSet mockDCResults = Mockito.mock(JDBCResultSet.class);
                    return mockColumn;
    @Mock


        Mockito.when(mockDataSource.isServerVersionAtLeast(Mockito.anyInt(), Mockito.anyInt())).thenReturn(true);
 * Unless required by applicable law or agreed to in writing, software
