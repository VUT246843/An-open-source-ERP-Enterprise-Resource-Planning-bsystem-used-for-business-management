
            monitor,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            container,
        column2.setDefaultValue("42");
            Collections.emptyMap(),
        DBEObjectMaker objectManager = getManagerForClass(SQLiteTableColumn.class);
        DBEObjectMaker<SQLiteTableColumn, SQLiteTable> objectManager = getManagerForClass(SQLiteTableColumn.class);
            monitor,
            container,
        GenericUniqueKey constraint = constraintManager.createNewObject(
            Collections.emptyMap());
                null,
        DBEObjectMaker<SQLiteTableColumn, SQLiteTable> objectManager = getManagerForClass(SQLiteTableColumn.class);
        objectManager.createNewObject(monitor, commandContext, table, null, Collections.emptyMap());
        objectManager.deleteObject(commandContext, column1, Collections.emptyMap());
                table,
        String expectedDDL = "CREATE TABLE NewTable (" + lineBreak +
        objectManager.createNewObject(monitor, commandContext, table, null, Collections.emptyMap());
        GenericTableBase table = objectMaker.createNewObject(
            monitor,

            "\tColumn2 INTEGER," + lineBreak +


            null,
    @Test
import org.jkiss.junit.DBeaverUnitTest;
            commandContext,
        constraint.setName("NewTable_PK");
            executionContext,
 * limitations under the License.
        SQLiteTableColumn newColumn2 = objectManager.createNewObject(monitor, commandContext, table, null, Collections.emptyMap());
 *     http://www.apache.org/licenses/LICENSE-2.0
            monitor,
            Collections.emptyMap());
        newColumn.setRequired(true);
            commandContext,


        TestCommandContext commandContext = new TestCommandContext(executionContext, false);
            dataSource,
import org.junit.Assert;
        TestCommandContext commandContext = new TestCommandContext(executionContext, false);

    public void generateCreateNewTableWithTwoColumnsThenDropColumn() throws Exception {
import org.junit.Before;
    private GenericExecutionContext executionContext;
    }
        TestCommandContext commandContext = new TestCommandContext(executionContext, false);
        List<DBEPersistAction> actions = DBExecUtils.getActionsListFromCommandContext(
            monitor,
    @Test
            monitor,


import org.jkiss.dbeaver.model.sql.SQLUtils;
 * You may obtain a copy of the License at
 *
            container,
    @Test

import org.jkiss.dbeaver.DBException;
        objectMaker = getManagerForClass(SQLiteTable.class);
            null);
        String script = SQLUtils.generateScript(
            monitor,
        SQLiteTableColumn column1 = objectManager.createNewObject(
        List<DBEPersistAction> actions = DBExecUtils.getActionsListFromCommandContext(
    public void generateCreateNewTableWithTwoColumnsAndPrimaryKeyStatement() throws Exception {
            false);
            null,
            table,
    public void setUp() throws DBException {
        container = new GenericDataSourceObjectContainer(dataSource);
        List<DBEPersistAction> actions = DBExecUtils.getActionsListFromCommandContext(
        SQLiteTableColumn column1 = objectManager.createNewObject(
 */
            Collections.emptyMap(),

    public void generateDropTableStatement() throws Exception {
            "\tColumn1 INTEGER," + lineBreak +

    private GenericDataSource dataSource;

import org.mockito.Mockito;
    }
            Collections.emptyMap());
    
        String expectedDDL = "CREATE TABLE NewTable (" + lineBreak +
            ");" + lineBreak;
            commandContext,
        newColumn2.setRequired(true);
        Assert.assertEquals(script, expectedDDL);
            null,
            "\tColumn2 INTEGER DEFAULT (42)" + lineBreak +
/*
    private JDBCRemoteInstance mockRemoteInstance;
            "\t\"Column1_?>|(!_bas_symbols\" INTEGER PRIMARY KEY AUTOINCREMENT," + lineBreak +
            commandContext,
        objectMaker.deleteObject(commandContext, table, Collections.emptyMap());
import java.util.List;
            commandContext,
        String expectedDDL = "CREATE TABLE \"Table_SQLite_&#@*_bad_symbols\" (" + lineBreak +


            "TABLE",
import org.jkiss.dbeaver.model.impl.edit.TestCommandContext;
                "\tColumn2 INTEGER" + lineBreak +
            false);
            commandContext,
        DBEObjectMaker<GenericUniqueKey, SQLiteTable> constraintManager = getManagerForClass(GenericUniqueKey.class);
            null);
            null,
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
            monitor,
            Collections.emptyMap());

            Collections.emptyMap(),
        objectManager.createNewObject(monitor, commandContext, table, null, Collections.emptyMap());
    private GenericDataSourceObjectContainer container;

            objectManager.createNewObject(monitor, commandContext, table, null, Collections.emptyMap());

        TestCommandContext commandContext = new TestCommandContext(executionContext, false);
            null,
        newColumn.setAutoIncrement(true);
            executionContext,
import org.jkiss.dbeaver.model.exec.DBExecUtils;
            dataSource,

            Collections.emptyMap(),
        String script = SQLUtils.generateScript(dataSource, actions.toArray(new DBEPersistAction[0]), false);
            null,
import org.jkiss.dbeaver.runtime.DBWorkbench;
    }
            monitor,
import org.junit.Test;
 * Copyright (C) 2010-2025 DBeaver Corp and others
            null);
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            container,
        String expectedDDL = "CREATE TABLE NewTable (" + lineBreak +
import org.jkiss.dbeaver.model.impl.jdbc.JDBCRemoteInstance;

            commandContext,
            executionContext,
        return DBWorkbench.getPlatform().getEditorsRegistry().getObjectManager(objectClass, DBEObjectMaker.class);
            monitor,
    private SQLiteTable table;
            Collections.emptyMap());
                Collections.emptyMap());
        String expectedDDL = "CREATE TABLE NewTable (" + lineBreak +
        DBEObjectMaker<SQLiteTableColumn, SQLiteTable> objectManager = getManagerForClass(SQLiteTableColumn.class);
            commandContext,
    @Test

            executionContext,
            Collections.emptyMap(),
            null);
            Collections.emptyMap());
            "Table_SQLite",
        newColumn.setName("Column1_?>|(!_bas_symbols");
            null);
    public void generateCreateNewTableWithTwoColumnsStatement() throws Exception {

        SQLiteTableColumn column2 = objectManager.createNewObject(
        String expectedDDL = "DROP TABLE Table_SQLite;" + lineBreak;
        Assert.assertEquals(script, expectedDDL);
import org.jkiss.dbeaver.ext.generic.model.*;
        TestCommandContext commandContext = new TestCommandContext(executionContext, false);
 *
        column1.setRequired(true);

        final SQLiteTableColumn newColumn =
    }
        table = new SQLiteTable(
            commandContext,
        Assert.assertEquals(script, expectedDDL);
            null,
        column1.setFullTypeName("TEXT");
            commandContext,


import java.util.Collections;
        List<DBEPersistAction> actions = DBExecUtils.getActionsListFromCommandContext(
        GenericTableBase table = objectMaker.createNewObject(
    private DBEObjectMaker<GenericTableBase, GenericStructContainer> objectMaker;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
            ");" + lineBreak;
            monitor,
            monitor,
            monitor,
            "\t\"Column2_#$%^_bas_symbols\" INTEGER NOT NULL" + lineBreak +
            null,
        constraint.setAttributeReferences(Collections.singletonList(constraintColumn));

            null);
        Assert.assertEquals(script, expectedDDL);
        executionContext = new GenericExecutionContext(mockRemoteInstance, "Test");
            commandContext,
 *
        constraint.setConstraintType(DBSEntityConstraintType.PRIMARY_KEY);
        String script = SQLUtils.generateScript(dataSource, actions.toArray(new DBEPersistAction[0]), false);
            "\tCONSTRAINT NewTable_PK PRIMARY KEY (Column1)" + lineBreak +
            commandContext,
        Assert.assertEquals(script, expectedDDL);
            table,
    @Test
            null,
    @Test
        String script = SQLUtils.generateScript(dataSource, actions.toArray(new DBEPersistAction[0]), false);
            ");" + lineBreak;
            monitor,
            "\tColumn2 INTEGER" + lineBreak +
public class SQLiteBaseTableDDLTest extends DBeaverUnitTest {
        String script = SQLUtils.generateScript(dataSource, actions.toArray(new DBEPersistAction[0]), false);

            null);
        objectManager.createNewObject(monitor, commandContext, table, null, Collections.emptyMap());
 * DBeaver - Universal Database Manager
            ");" + lineBreak;
            executionContext,
            Collections.emptyMap());

            table,
        SQLiteTableColumn newColumn = objectManager.createNewObject(monitor, commandContext, table, null, Collections.emptyMap());
                commandContext,

        column1.setDefaultValue("'Default Value'");
        DBPDataSourceContainer mockDataSourceContainer = configureTestContainer("sqlite_jdbc");
    }
            executionContext,
    @Before
    }
            "\tColumn2 INTEGER NOT NULL" + lineBreak +
        GenericTableBase table = objectMaker.createNewObject(
            container,
        Mockito.when(mockRemoteInstance.getDataSource()).thenReturn(dataSource);
            "\tColumn1 TEXT DEFAULT ('Default Value')," + lineBreak +
        SQLiteTableColumn column1 = objectManager.createNewObject(

    public void generateCreateNewTableWithTwoColumnsOneNotNullOneNullableStatement() throws Exception {
        GenericTableBase table = objectMaker.createNewObject(
            commandContext,
        List<DBEPersistAction> actions = DBExecUtils.getActionsListFromCommandContext(
        String expectedDDL = "CREATE TABLE NewTable (" + lineBreak +
 * Licensed under the Apache License, Version 2.0 (the "License");
            monitor,
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
    private DBEObjectMaker getManagerForClass(Class<?> objectClass) {
            monitor,
        TestCommandContext commandContext = new TestCommandContext(executionContext, false);
            commandContext,

        Assert.assertEquals(script, expectedDDL);
            actions.toArray(new DBEPersistAction[0]),
        List<DBEPersistAction> actions = DBExecUtils.getActionsListFromCommandContext(
            Collections.emptyMap());
            commandContext,
    @Test

            null);
        DBEObjectMaker<SQLiteTableColumn, SQLiteTable> objectManager = getManagerForClass(SQLiteTableColumn.class);
    }
        table.setName("Table_SQLite_&#@*_bad_symbols");
        GenericTableBase table = objectMaker.createNewObject(

    }
            commandContext,
        newColumn2.setName("Column2_#$%^_bas_symbols");
        GenericTableBase table = objectMaker.createNewObject(
            container,
            Collections.emptyMap(),
        TestCommandContext commandContext = new TestCommandContext(executionContext, false);
 * Unless required by applicable law or agreed to in writing, software
            Collections.emptyMap());
            executionContext,
            commandContext,
        dataSource = new GenericDataSource(monitor, new SQLiteMetaModel(), mockDataSourceContainer, new SQLiteSQLDialect());
import org.jkiss.dbeaver.model.edit.DBEObjectMaker;

            null,
            container,
            "\tColumn1 INTEGER NOT NULL," + lineBreak +
            actions.toArray(new DBEPersistAction[0]),
            "\tColumn1 INTEGER," + lineBreak +
        List<DBEPersistAction> actions = DBExecUtils.getActionsListFromCommandContext(
                ");" + lineBreak;
        Assert.assertEquals(script, expectedDDL);
}
        objectManager.createNewObject(monitor, commandContext, table, null, Collections.emptyMap());
import org.mockito.Mock;
    @Mock



    public void generateStatementCreateNewTableWithTwoColumnsOneAutoIncrementAllQuoted() throws Exception {
package org.jkiss.dbeaver.ext.sqlite.model;
 * See the License for the specific language governing permissions and
            monitor,
            ");" + lineBreak;
        DBEObjectMaker<SQLiteTableColumn, SQLiteTable> objectManager = getManagerForClass(SQLiteTableColumn.class);
 * you may not use this file except in compliance with the License.
        String script = SQLUtils.generateScript(
            table,
        GenericTableConstraintColumn constraintColumn = new GenericTableConstraintColumn(constraint, column1, 1);
            Collections.emptyMap());
    public void generateCreateNewTableWithTwoColumnsWithDefaultValuesStatement() throws Exception {

            monitor,
        String script = SQLUtils.generateScript(dataSource, actions.toArray(new DBEPersistAction[0]), false);
            Collections.emptyMap(),
