                server.createRelationOfClass(mockSchema, PostgreClass.RelKind.r, mockResults).getClass());
        Assert.assertEquals(GreenplumTable.class,
    @Test

import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    PostgreSchema mockSchema;
            throws DBException {
    }
        PostgreDialect dialect = new PostgreDialect();
package org.jkiss.dbeaver.ext.greenplum.model;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDialect;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSchema;
        Mockito.when(mockResults.getString("urilocation")).thenReturn("gpfdist://filehost:8081/*.txt");
        Assert.assertTrue(!dialect.getMatchedKeywords("READABLE").isEmpty());
    @InjectMocks
    @Test
    PostgreServerGreenplum server;
    @Mock
        Assert.assertTrue(!dialect.getMatchedKeywords("ERRORS").isEmpty());
 * distributed under the License is distributed on an "AS IS" BASIS,
    public void setup() throws SQLException {

    }

        Assert.assertEquals(GreenplumExternalTable.class,
        Mockito.when(mockResults.getBoolean("is_ext_table")).thenReturn(true);

    @Before
            throws DBException {
import java.sql.SQLException;
 *     http://www.apache.org/licenses/LICENSE-2.0
        Mockito.when(mockDataSource.isServerVersionAtLeast(ArgumentMatchers.anyInt(), ArgumentMatchers.anyInt())).thenReturn(false);
 *
import org.jkiss.dbeaver.ext.postgresql.model.PostgreClass;
 * You may obtain a copy of the License at
    }
                server.createRelationOfClass(mockSchema, PostgreClass.RelKind.r, mockResults).getClass());

    public void configureDialect_shouldContainGreenplumSpecificKeywords() {
        Assert.assertTrue(!dialect.getMatchedKeywords("REJECT").isEmpty());
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.junit.Test;
    @Mock

                server.createRelationOfClass(mockSchema, PostgreClass.RelKind.p, mockResults).getClass());
import org.junit.Assert;
import org.mockito.Mockito;
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
        Assert.assertTrue(!dialect.getMatchedKeywords("WEB").isEmpty());
            throws SQLException {
    JDBCResultSet mockResults;
 * See the License for the specific language governing permissions and

    }


import org.junit.Before;
import org.mockito.Mock;
        Assert.assertTrue(!dialect.getMatchedKeywords("WRITABLE").isEmpty());
import org.mockito.InjectMocks;
        Mockito.when(mockSchema.getDataSource()).thenReturn(mockDataSource);
import org.jkiss.junit.DBeaverUnitTest;
        Mockito.when(mockResults.getString("fmttype")).thenReturn("c");
        server.configureDialect(dialect);
import org.mockito.ArgumentMatchers;
        GreenplumExternalTable table = Mockito.mock(GreenplumExternalTable.class);
    @Mock


    }

 * limitations under the License.
    DBRProgressMonitor monitor;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        Mockito.verify(table).generateDDL(monitor);
        Assert.assertEquals(GreenplumTable.class,
public class PostgreServerGreenplumTest extends DBeaverUnitTest {
        Mockito.when(mockDataSource.getServerType()).thenReturn(server);
    }
 * DBeaver - Universal Database Manager

 */
    public void createRelationOfClass_whenTableIsNotAGreenplumTable_returnsInstanceOfPostgresTableBase() {
    @Test
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            throws SQLException {
        String expectedDelegatedResultFromParentClass = null;
        Assert.assertTrue(!dialect.getMatchedKeywords("DISTRIBUTED").isEmpty());
import org.jkiss.dbeaver.DBException;
        Assert.assertTrue(!dialect.getMatchedKeywords("LOG").isEmpty());
}    public void readTableDDL_whenTableIsAnInstanceOfGreenplumExternalTable_delegatesToGpGenerateDDL()
        server.readTableDDL(monitor, table);
    @Test
    public void readTableDDL_whenTableIsNotAnInstanceOfGreenplumExternalTable_delegatesDDLcreationToParentClass()
        Mockito.when(mockResults.getBoolean("is_ext_table")).thenReturn(false);
    GreenplumDataSource mockDataSource;

        Assert.assertTrue(!dialect.getMatchedKeywords("SEGMENT").isEmpty());
    }
 *
    public void createRelationOfClass_whenTableTypeIsRegularAndTableIsANonExternalGreenplumTable_returnsInstanceOfGreenplumTable()
 *
        Assert.assertEquals(expectedDelegatedResultFromParentClass, server.readTableDDL(monitor, table));
    @Test
    @Mock
    public void createRelationOfClass_whenTableTypeIsRegularAndTableIsAnExternalGreenplumTable_returnsInstanceOfGreenplumExternalTable()
    @Test

        Assert.assertTrue(!dialect.getMatchedKeywords("FORMAT").isEmpty());
/*
        Assert.assertTrue(!dialect.getMatchedKeywords("MASTER").isEmpty());
        GreenplumTable table = Mockito.mock(GreenplumTable.class);
