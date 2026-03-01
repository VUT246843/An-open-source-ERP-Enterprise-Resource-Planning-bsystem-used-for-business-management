        String columnType,
    public void generateCreatePersistedTableWith2ColumnsDDL() throws Exception {
            monitor,
    }
        // We do not have generic driver, so use SQLite one.
            lineBreak +
    @Test

        tableColumn1.setPrecision(38);
import org.jkiss.junit.DBeaverUnitTest;
 * distributed under the License is distributed on an "AS IS" BASIS,

            "SCHEMA_GENERIC");

            ((GenericTableColumn) newColumn).setRequired(true);
import org.jkiss.dbeaver.model.exec.DBExecUtils;
        if (newColumn instanceof GenericTableColumn) {
            "\tCOLUMN3 CHAR(13)" + lineBreak +
        String expectedDDL = "CREATE TABLE CATALOG_GENERIC.SCHEMA_GENERIC.NewTable (" + lineBreak +
    private GenericDataSource dataSource;
            Collections.emptyMap(), 
    public void generateCreatePersistedTableWith3RequiredColumnsDDL() throws Exception {
        String script = SQLUtils.generateScript(dataSource, actions.toArray(new DBEPersistAction[0]), false);
            "\tCOLUMN2 BIGINT" + lineBreak +
        return column;
        TestCommandContext commandContext = new TestCommandContext(executionContext, false);
        GenericTable genericTable3 = new GenericTable(

            null,
import org.jkiss.dbeaver.DBException;
        tableColumn.setMaxLength(100);
        Assert.assertEquals(script, expectedDDL);
            dataSource,

            "\tColumn2 INTEGER" + lineBreak +
 * See the License for the specific language governing permissions and
            monitor,
            "-- DROP TABLE CATALOG_GENERIC.TABLE_GENERIC3;" + lineBreak +

        String script = SQLUtils.generateScript(dataSource, actions.toArray(new DBEPersistAction[0]), false);
    public void generateCreatePersistedTableWith3ColumnsDDL() throws Exception {
        objectManager.createNewObject(monitor, commandContext, table, null, Collections.emptyMap());
            "COMMENT ON COLUMN CATALOG_GENERIC.SCHEMA_GENERIC.NewTable.Column1 IS 'Test comment 1';" + lineBreak +
        Assert.assertEquals(script, expectedDDL);
import org.junit.Before;
            ");" + lineBreak;
    public void generateCreateNewTableWithTwoColumnsWithCommentStatement() throws Exception {


            genericSchema,
            lineBreak +

            executionContext, 
            "CATALOG_GENERIC",
        String tableDDL = genericTable3.getObjectDefinitionText(monitor, Collections.emptyMap());
/*

    private DBEObjectMaker<GenericTableBase, GenericStructContainer> objectMaker;
package org.jkiss.dbeaver.ext.generic.test;
            commandContext,
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            null);
        GenericTableColumn column = new GenericTableColumn(table);
import org.jkiss.dbeaver.model.sql.SQLUtils;

import org.junit.Assert;
        String expectedDDL = "DROP TABLE CATALOG_GENERIC.TABLE_GENERIC;" + lineBreak;
            ");" + lineBreak;
    }
    private GenericTableColumn addColumn(
    private GenericExecutionContext executionContext;
            "\tCOLUMN2 NUMBER," + lineBreak +
            null,
            null,
        DBEObjectMaker<GenericUniqueKey, GenericTableBase> constraintManager = getManagerForClass(GenericUniqueKey.class);
        TestCommandContext commandContext = new TestCommandContext(executionContext, false);
            "COMMENT ON COLUMN CATALOG_GENERIC.SCHEMA_GENERIC.NewTable.Column2 IS 'Test comment 2';" + lineBreak;
    private GenericSchema genericSchema;
    }
            Collections.emptyMap());
            commandContext,
            "\tCOLUMN1 VARCHAR(42)," + lineBreak +
        final DBSObject newColumn =
            objectManager.createNewObject(monitor, commandContext, table, null, Collections.emptyMap());
            executionContext,
        Assert.assertEquals(tableDDL, expectedDDL);
            commandContext,
            ");" + lineBreak;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
        GenericTableColumn tableColumn2 = addColumn(genericTable, "COLUMN3", "CHAR", 3);
        GenericTableColumn tableColumn1 = addColumn(genericTable2, "COLUMN2", "BIGINT", 2);
        String script = SQLUtils.generateScript(
        GenericTableConstraintColumn constraintColumn = new GenericTableConstraintColumn(constraint, column1, 1);
        GenericTableBase table = objectMaker.createNewObject(

            "\tColumn1 INTEGER," + lineBreak +
        int ordinalPosition

    public void generateCreateNewTableWithTwoColumnsAndPrimaryKeyStatement() throws Exception {
 * limitations under the License.
            commandContext,
        List<GenericTableColumn> cachedAttributes = (List<GenericTableColumn>) table.getCachedAttributes();
            commandContext,
    @Test
            Collections.emptyMap());
    }
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.dbeaver.ext.generic.model.*;
        TestCommandContext commandContext = new TestCommandContext(executionContext, false);

            "CREATE TABLE CATALOG_GENERIC.TABLE_GENERIC3 (" + lineBreak +
        column1.setDescription("Test comment 1");
        GenericTableColumn column1 = objectManager.createNewObject(
            monitor,
            executionContext,

            lineBreak +

            null);
            null,
        genericSchema = new GenericSchema(dataSource, catalog, "SCHEMA_GENERIC");

            genericSchema,


        GenericTableBase table,
            Collections.emptyMap(),
            "CATALOG_GENERIC",

        GenericUniqueKey constraint = constraintManager.createNewObject(
        GenericTableBase table = objectMaker.createNewObject(
            Collections.emptyMap(),
        String expectedDDL = "CREATE TABLE CATALOG_GENERIC.SCHEMA_GENERIC.NewTable (" + lineBreak +
import org.mockito.Mock;
import org.jkiss.dbeaver.model.struct.DBSObject;
    @Test
import org.jkiss.dbeaver.model.impl.jdbc.JDBCRemoteInstance;

            Collections.emptyMap());
        List<DBEPersistAction> actions = DBExecUtils.getActionsListFromCommandContext(
            "\tColumn1 INTEGER," + lineBreak +
        column.setTypeName(columnType);


        tableColumn1.setRequired(true);
    private GenericTable genericTable;
        objectMaker = getManagerForClass(GenericTable.class);
            genericSchema,
            "\tCOLUMN1 VARCHAR(100)," + lineBreak +



            monitor,
            table,
    public void generateCreateNewTableWithTwoColumnsOneNullableStatement() throws Exception {
            commandContext, 
    @Test

import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
            null);
 *     http://www.apache.org/licenses/LICENSE-2.0
        tableColumn.setRequired(true);

            monitor,
        List<DBEPersistAction> actions = DBExecUtils.getActionsListFromCommandContext(
            Collections.emptyMap(),
            "SCHEMA_GENERIC");
 * Licensed under the Apache License, Version 2.0 (the "License");
            "\tColumn2 INTEGER NOT NULL" + lineBreak +
 * you may not use this file except in compliance with the License.
            "TABLE_GENERIC",
            Collections.emptyMap());
            lineBreak +
        GenericTableColumn tableColumn = addColumn(genericTable3, "COLUMN1", "DATE", 1);
        tableColumn1.setPrecision(4);
            executionContext,
            false);
        TestCommandContext commandContext = new TestCommandContext(executionContext, false);
        String tableDDL = genericTable.getObjectDefinitionText(monitor, Collections.emptyMap());
        column.setOrdinalPosition(ordinalPosition);
            Collections.emptyMap(),
            monitor,
            executionContext,
            lineBreak +
        genericTable = new GenericTable(
            ");" + lineBreak;
            "-- DROP TABLE CATALOG_GENERIC.TABLE_GENERIC2;" + lineBreak +
        Assert.assertEquals(tableDDL, expectedDDL);
        Assert.assertEquals(tableDDL, expectedDDL);
        objectMaker.deleteObject(commandContext, genericTable, Collections.emptyMap());


            genericSchema,
 * Copyright (C) 2010-2025 DBeaver Corp and others
        executionContext = new GenericExecutionContext(mockRemoteInstance, "Test");
        dataSource = new GenericDataSource(monitor, new GenericMetaModel(), mockDataSourceContainer, new GenericSQLDialect());
    ) throws DBException {
    public void setUp() throws DBException {

import java.util.List;
        DBEObjectMaker<GenericTableColumn, GenericTableBase> objectManager = getManagerForClass(GenericTableColumn.class);
import org.jkiss.dbeaver.model.edit.DBEObjectMaker;
            commandContext,
            commandContext,
            "CREATE TABLE CATALOG_GENERIC.TABLE_GENERIC (" + lineBreak +
        objectManager.createNewObject(monitor, commandContext, table, null, Collections.emptyMap());

        constraint.setConstraintType(DBSEntityConstraintType.PRIMARY_KEY);
            null,
        GenericTableColumn tableColumn1 = addColumn(genericTable, "COLUMN2", "NUMBER", 2);
import org.jkiss.dbeaver.model.impl.edit.TestCommandContext;
        DBEObjectMaker<GenericTableColumn, GenericTableBase> objectManager = getManagerForClass(GenericTableColumn.class);
            "CREATE TABLE CATALOG_GENERIC.TABLE_GENERIC2 (" + lineBreak +
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        String script = SQLUtils.generateScript(dataSource, actions.toArray(new DBEPersistAction[0]), false);
        GenericTableColumn column2 = objectManager.createNewObject(
        return DBWorkbench.getPlatform().getEditorsRegistry().getObjectManager(objectClass, DBEObjectMaker.class);
    public void generateCreateNewTableWithTwoColumnsStatement() throws Exception {

        constraint.setAttributeReferences(Collections.singletonList(constraintColumn));
            null,
        String expectedDDL = "-- Drop table" + lineBreak +
        GenericTableColumn tableColumn1 = addColumn(genericTable3, "COLUMN2", "BOOLEAN", 2);
        column.setName(columnName);
}
        String columnName,

            null,
            "\tColumn2 INTEGER" + lineBreak +
        constraint.setName("NEWTABLE_PK");
            "\tColumn1 INTEGER," + lineBreak +
            actions.toArray(new DBEPersistAction[0]),
            monitor,
            commandContext, 
            "\tCOLUMN1 DATE NOT NULL," + lineBreak +
        String expectedDDL = "-- Drop table" + lineBreak +
            "\tColumn2 INTEGER," + lineBreak +

            Collections.emptyMap());
        GenericTableBase table = objectMaker.createNewObject(
            table,
        List<DBEPersistAction> actions = DBExecUtils.getActionsListFromCommandContext(
            table,
    }
        GenericTableColumn tableColumn = addColumn(genericTable2, "COLUMN1", "VARCHAR", 1);
            monitor,
        GenericTableColumn tableColumn2 = addColumn(genericTable3, "COLUMN3", "BLOB", 3);
    private DBEObjectMaker getManagerForClass(Class<?> objectClass) {
            Collections.emptyMap());

        DBEObjectMaker<GenericTableColumn, GenericTableBase> objectManager = getManagerForClass(GenericTableColumn.class);
            "TABLE_GENERIC2",

            monitor,
        Assert.assertEquals(script, expectedDDL);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            "SCHEMA_GENERIC");
        GenericTableColumn tableColumn = addColumn(genericTable, "COLUMN1", "VARCHAR", 1);
import java.util.Collections;
 * You may obtain a copy of the License at
        Assert.assertEquals(script, expectedDDL);
            table,
    public void generateDropTableStatement() throws Exception {
            null);
    @Test
            Collections.emptyMap());
        GenericTableBase table = objectMaker.createNewObject(
            "\tColumn1 INTEGER," + lineBreak +
            lineBreak +
            "\tCOLUMN3 BLOB NOT NULL" + lineBreak +

            commandContext,
        objectManager.createNewObject(monitor, commandContext, table, null, Collections.emptyMap());
public class GenericBaseTableDDLTest extends DBeaverUnitTest {
            "-- DROP TABLE CATALOG_GENERIC.TABLE_GENERIC;" + lineBreak +
            monitor,
            "\tCONSTRAINT NEWTABLE_PK PRIMARY KEY (Column1)" + lineBreak +
        DBPDataSourceContainer mockDataSourceContainer = configureTestContainer("sqlite_jdbc");
    }
            Collections.emptyMap());
    @Test
    }
            monitor,
import org.junit.Test;
            null);
    }
 *
    }
        tableColumn2.setRequired(true);
    @Test
            genericSchema,
 *
        objectManager.createNewObject(monitor, commandContext, table, null, Collections.emptyMap());
        tableColumn.setMaxLength(42);

 *
        GenericTable genericTable2 = new GenericTable(
        DBEObjectMaker objectManager = getManagerForClass(GenericTableColumn.class);

            commandContext,
            monitor,
        tableColumn2.setMaxLength(13);
            "\tCOLUMN2 BOOLEAN NOT NULL," + lineBreak +
        column2.setDescription("Test comment 2");
    @Before
            ");" + lineBreak;
        String script = SQLUtils.generateScript(dataSource, actions.toArray(new DBEPersistAction[0]), false);
        String expectedDDL = "CREATE TABLE CATALOG_GENERIC.SCHEMA_GENERIC.NewTable (" + lineBreak +
import org.mockito.Mockito;

    private JDBCRemoteInstance mockRemoteInstance;
        Assert.assertEquals(script, expectedDDL);
        String expectedDDL = "-- Drop table" + lineBreak +
            genericSchema, 
        GenericCatalog catalog = new GenericCatalog(dataSource, "CATALOG_GENERIC");
            commandContext,
        GenericTableColumn column1 = objectManager.createNewObject(
            "CATALOG_GENERIC",
            genericSchema,
 * Unless required by applicable law or agreed to in writing, software
            commandContext,
        cachedAttributes.add(column);
            monitor,
        String tableDDL = genericTable2.getObjectDefinitionText(monitor, Collections.emptyMap());
            null, 
    @Test
    }
    @Mock
        List<DBEPersistAction> actions = DBExecUtils.getActionsListFromCommandContext(
 */
        TestCommandContext commandContext = new TestCommandContext(executionContext, false);
        String expectedDDL = "CREATE TABLE CATALOG_GENERIC.SCHEMA_GENERIC.NewTable (" + lineBreak +
            ");" + lineBreak +

    }
        }

            ");" + lineBreak;
            "TABLE_GENERIC3",

        List<DBEPersistAction> actions = DBExecUtils.getActionsListFromCommandContext(
        Mockito.when(mockRemoteInstance.getDataSource()).thenReturn(dataSource);
