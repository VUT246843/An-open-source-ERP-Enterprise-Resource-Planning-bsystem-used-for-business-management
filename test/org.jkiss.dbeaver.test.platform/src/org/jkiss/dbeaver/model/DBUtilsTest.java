        DBSObject dbsObject = DBUtils.getObjectByPath(
    public void testExtractTypeModifiers() throws DBException {

    @Test
        Mockito.lenient().<Class<?>>when(mockDataSourceTable.getPrimaryChildType(monitor)).thenReturn(DBSTable.class);
    }

        Mockito.when(mockDataSource.getSQLDialect()).thenReturn(sqlDialect);
    private DBSSchema mockSchemaDBO;
        Mockito.lenient().<Class<?>>when(mockSchema.getPrimaryChildType(monitor)).thenReturn(DBSTable.class);
        Mockito.when(mockDataSource.getContainer()).thenReturn(dataSourceContainer);
            monitor,
        Assert.assertEquals(dbsObject, mockDataSource);
        Assert.assertEquals(dbsObject, mockEntity);
    private JDBCExecutionContext executionContextTable;
        DBSObject dbsObject = DBUtils.getObjectByPath(
            mockDataSourceCatalogSchema,
*/
    @Test
    @Mock
import org.jkiss.dbeaver.model.struct.rdb.DBSCatalog;
        // Datasource 3. Datasource-table structure (like SQLite)
        Mockito.lenient().<Class<?>>when(mockCatalog.getPrimaryChildType(monitor)).thenReturn(DBSSchema.class);
            mockDataSourceTable,


    public void testGetCatalogWithEntityByPathWithSchemaNameOnly() throws DBException {
        Mockito.lenient().when(mockSchemaDBO.getChild(monitor, "table_test")).thenReturn(mockEntityDBO);

        Mockito.when(mockDataSourceCatalogSchema.getContainer()).thenReturn(dataSourceContainer);
        Assert.assertThrows(DBException.class, () -> DBUtils.getTypeModifiers("NUMBER(5, 10"));
    }
        Assert.assertThrows(DBException.class, () -> DBUtils.getTypeModifiers("NUMBER("));
import org.jkiss.dbeaver.model.struct.rdb.DBSSchema;

            "catalog_name",

        @Override
        Mockito.lenient().when(mockDataSourceCatalogSchema.getChild(monitor, "DBO")).thenReturn(mockCatalogDBO);
            null,
    private JDBCRemoteInstance mockRemoteInstanceTable;
        executionContextCatalogSchema = new JDBCExecutionContext(mockRemoteInstanceCatalogSchema, true);
    }
            "DBO",
            executionContext,
            mockDataSourceCatalogSchema,

    }
    @Mock
        Mockito.lenient().when(mockCatalogDBO.getChild(monitor, "DBO")).thenReturn(mockSchemaDBO);
            "table_test");
        Mockito.lenient().when(mockCatalog.getChild(monitor, "schema_test")).thenReturn(mockSchema);
        Assert.assertEquals(dbsObject, mockEntity);
    public void testGetSchemaWithEntityByPathIgnoreCatalogName() throws DBException {
            monitor,
        Mockito.lenient().<Class<?>>when(mockDataSource.getPrimaryChildType(monitor)).thenReturn(DBSCatalog.class);
    public void testGetEntityByPathFromDatasource() throws DBException {
            null,
 * distributed under the License is distributed on an "AS IS" BASIS,
    public void testGetSchemaWithEntityByPath() throws DBException {
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;

public class DBUtilsTest extends DBeaverUnitTest {
            "table_test");
    @Before
        Assert.assertThrows(DBException.class, () -> DBUtils.getTypeModifiers("NUMBER()"));

    @Test
        Assert.assertEquals(DBUtils.getQuotedIdentifier(mockDataSource, "table name"), "\"table name\"");
        Mockito.lenient().when(mockRemoteInstanceTable.getDataSource()).thenReturn(mockDataSourceTable);
        Mockito.lenient().<Class<?>>when(mockDataSourceCatalogSchema.getPrimaryChildType(monitor)).thenReturn(DBSCatalog.class);
    private JDBCDataSource mockDataSourceCatalogSchema;
    private JDBCRemoteInstance mockRemoteInstanceCatalogSchema;

import org.junit.Before;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *
    private DBRProgressMonitor monitor;
    private JDBCDataSource mockDataSourceSchemaTable;
import org.junit.Test;
    @Test
    @Mock
            mockDataSourceSchemaTable,
        @NotNull
        Assert.assertEquals(dbsObject, mockEntityDBO);
/*
    }
        Mockito.lenient().<Class<?>>when(mockDataSourceSchemaTable.getPrimaryChildType(monitor)).thenReturn(DBSSchema.class);
        @Override

import org.jkiss.dbeaver.model.impl.sql.BasicSQLDialect;
            executionContext,
            "table_test");
            monitor,
    @Test
        public DBPIdentifierCase storesQuotedCase() {
            mockDataSource,
    private DBSEntity mockEntity;
            "schema_test",
    private DBSSchema mockSchema;
        Mockito.lenient().when(mockDataSourceSchemaTable.getChild(monitor, "schema_test")).thenReturn(mockSchema);
            "catalog_test",
        }
        // Datasource 2. Schema-table structure
    }
    }
    @Mock

        DBSObject dbsObject = DBUtils.getObjectByPath(
        DBSObject dbsObject = DBUtils.getObjectByPath(
    public void testGetEntityByPathWithEqualDatabaseAndSchemaNames() throws DBException {
        Assert.assertEquals(dbsObject, mockEntity);

    @Test
    private JDBCExecutionContext executionContextSchema;
        Mockito.lenient().when(mockCatalog.getChild(monitor, "table_test")).thenReturn(mockEntity);
            mockDataSourceSchemaTable,
        }
 *
import org.jkiss.utils.Pair;
}    public void testGetCatalogWithEntityByPath() throws DBException {
        // Datasource 4. Catalog-schema-table structure
    private DBSCatalog mockCatalogDBO;
            "DBO",
        Assert.assertEquals(DBUtils.getQuotedIdentifier(mockDataSource, "TableName"), "\"TableName\"");
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        Assert.assertThrows(DBException.class, () -> DBUtils.getTypeModifiers("()"));
        Mockito.lenient().when(mockDataSource.getName()).thenReturn("test_name");
    @Mock
            null,
    public void testReturnDatasourceIfNoNamesWithSearchByPath() throws DBException {
 *     http://www.apache.org/licenses/LICENSE-2.0

    BasicSQLDialect sqlDialect = new BasicSQLDialect() {
        // Datasource 1. Catalog-table structure
            executionContextSchema,
 * limitations under the License.
        DBPDataSourceContainer dataSourceContainer = configureTestContainer("sqlite_jdbc");
        Mockito.lenient().when(mockRemoteInstance.getDataSource()).thenReturn(mockDataSource);
        executionContextSchema = new JDBCExecutionContext(mockRemoteInstanceSchema, true);
package org.jkiss.dbeaver.model;

        Assert.assertEquals(dbsObject, mockEntity);
        Assert.assertThrows(DBException.class, () -> DBUtils.getTypeModifiers("(5, 10)"));
        org.eclipse.equinox.launcher.Main.main(new String[] {
 * You may obtain a copy of the License at
            monitor,
            null,
            null,
        Mockito.lenient().when(mockDataSourceCatalogSchema.getChild(monitor, "catalog_test")).thenReturn(mockCatalog);
import org.junit.Assert;
            monitor,

        @NotNull
    @Test
            null,
            monitor,

    JDBCDataSource mockDataSource;
        DBSObject dbsObject = DBUtils.getObjectByPath(
            return DBPIdentifierCase.LOWER;
            executionContextSchema,
        Assert.assertNotEquals(dbsObject, mockEntity);
            executionContextCatalogSchema,
import org.jkiss.dbeaver.model.impl.jdbc.JDBCRemoteInstance;
        Mockito.lenient().when(mockDataSourceTable.getChild(monitor, "table_test")).thenReturn(mockEntity);
            executionContext,
    @Mock
            "table_test");
        Assert.assertEquals(DBUtils.getQuotedIdentifier(mockDataSource, "table_name"), "table_name");
    private JDBCExecutionContext executionContext;
        Mockito.lenient().when(mockSchema.getChild(monitor, "table_test")).thenReturn(mockEntity);
            null);
    public void setUp() throws Exception {
        executionContext = new JDBCExecutionContext(mockRemoteInstance, true);
            "catalog_name",
            "table_test");
    public void testMainServices() {
import org.mockito.Mockito;
    @Mock
        Mockito.lenient().when(mockRemoteInstanceCatalogSchema.getDataSource()).thenReturn(mockDataSourceCatalogSchema);
        @NotNull
    private DBSEntity mockEntityDBO;
    private DBSCatalog mockCatalog;
    @Test
import org.jkiss.dbeaver.model.struct.DBSObject;
    @Mock
        Assert.assertEquals(new Pair<>("NUMBER", new String[]{"10", "5", "TEST"}), DBUtils.getTypeModifiers("NUMBER (10, 5, TEST)"));
        Assert.assertEquals(new Pair<>("NUMBER", new String[]{"10", "5"}), DBUtils.getTypeModifiers("NUMBER(10,   5)"));
    }
            return DBPIdentifierCase.MIXED;
    public void checkIdentifiersQuote() throws Exception {
 *
        public DBPIdentifierCase storesUnquotedCase() {
import org.jkiss.dbeaver.model.struct.DBSEntity;
            "table_test");
        @Override
            mockDataSource,
            monitor,
 * DBeaver - Universal Database Manager
        mockDataSource = Mockito.mock(JDBCDataSource.class);//new GenericDataSource(monitor, dataSourceContainer, new GenericMetaModel(), sqlDialect);
            "-product", "org.jkiss.dbeaver.product"}
        DBSObject dbsObject = DBUtils.getObjectByPath(
    private JDBCRemoteInstance mockRemoteInstanceSchema;
    public void testGetEntityByPathIgnoreCatalogName() throws DBException {
            executionContextTable,
        Assert.assertThrows(DBException.class, () -> DBUtils.getTypeModifiers("NUMBER)"));

    @Test
        DBSObject dbsObject = DBUtils.getObjectByPath(
import org.jkiss.dbeaver.DBException;
        Assert.assertEquals(dbsObject, mockEntity);
import org.jkiss.code.NotNull;
        Mockito.lenient().when(mockDataSource.getChild(monitor, "catalog_test")).thenReturn(mockCatalog);
    };
    }
    }
        Mockito.lenient().when(mockRemoteInstanceSchema.getDataSource()).thenReturn(mockDataSourceSchemaTable);
        }
    public void testGetEntityByPathWithAllNames() throws DBException {

        DBSObject dbsObject = DBUtils.getObjectByPath(
            monitor,
    @Mock
    @Mock
            monitor,
    private JDBCExecutionContext executionContextCatalogSchema;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            "catalog_test",

        System.out.println("OSGI started");
        Mockito.when(mockDataSourceTable.getContainer()).thenReturn(dataSourceContainer);

            "table_test");

    @Test
            "schema_test",
    @Test
 * See the License for the specific language governing permissions and
        DBSObject dbsObject = DBUtils.getObjectByPath(
    @Mock
    @Test

            null,
 * you may not use this file except in compliance with the License.
        Assert.assertEquals(dbsObject, mockEntity);
            "table_test");
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
    }

/*
            return new String[][] { { "\"", "\""} };
    }
 */
    private JDBCRemoteInstance mockRemoteInstance;
        Assert.assertEquals(dbsObject, mockEntity);
import org.mockito.Mock;
        Mockito.when(mockDataSourceSchemaTable.getContainer()).thenReturn(dataSourceContainer);
    @Mock
        Mockito.lenient().<Class<?>>when(mockCatalog.getPrimaryChildType(monitor)).thenReturn(DBSTable.class);
            null,
    @Mock
            executionContextCatalogSchema,
        Mockito.lenient().when(mockDataSourceTable.getName()).thenReturn("test_name");
        Mockito.lenient().when(mockDataSourceSchemaTable.getName()).thenReturn("test_name");
            mockDataSource,
        Mockito.lenient().when(mockSchema.getChild(monitor, "table_test")).thenReturn(mockEntity);
 * Unless required by applicable law or agreed to in writing, software
            "schema_test",
            "catalog_test",
        public String[][] getIdentifierQuoteStrings() {
import org.jkiss.junit.DBeaverUnitTest;
        executionContextTable = new JDBCExecutionContext(mockRemoteInstanceTable, true);
            mockDataSourceTable,
            executionContextTable,
    @Mock
        Mockito.lenient().when(mockDataSourceCatalogSchema.getName()).thenReturn("test_name");
        );
    private JDBCDataSource mockDataSourceTable;
        Assert.assertEquals(new Pair<>("NUMBER", new String[]{"5"}), DBUtils.getTypeModifiers("NUMBER(5)"));
        Assert.assertEquals(new Pair<>("NUMBER", new String[0]), DBUtils.getTypeModifiers("NUMBER"));
