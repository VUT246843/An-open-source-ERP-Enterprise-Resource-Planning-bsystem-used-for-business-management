
        column2.setValueType(Types.INTEGER);
        pse.collectProperties();
    }

        constraint.setAttributeReferences(Collections.singletonList(constraintColumn));


        String expectedDDL = "CREATE TABLE TEST_SCHEMA.NEWTABLE (" + lineBreak +
        List<DBEPersistAction> actions = DBExecUtils.getActionsListFromCommandContext(monitor, commandContext, executionContext, Collections.emptyMap(), null);
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
import java.sql.Types;
        column1.setValueType(Types.INTEGER);
    }
        column1.setTypeName("INTEGER");
        );
            "\tCONSTRAINT NEWTABLE_PK PRIMARY KEY (COLUMN1)" + lineBreak +
        column2.setValueType(Types.INTEGER);
            monitor, commandContext, newObject, null, Collections.emptyMap());
            commandContext,
    }

        Assert.assertEquals(script, expectedDDL);
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
            = OracleTestUtils.getManagerForClass(OracleTableConstraint.class);
    public void generateDropTableStatement() throws Exception {

        oracleTable.setPersisted(true);
        String script = SQLUtils.generateScript(testDataSource, actions.toArray(new DBEPersistAction[0]), false);
package org.jkiss.dbeaver.ext.oracle.model;
import org.junit.Assert;

        TestCommandContext commandContext = new TestCommandContext(executionContext, false);
 *
            null,
    @Before

        column1.setValueType(Types.INTEGER);
            executionContext,
        executionContext = new OracleExecutionContext(mockRemoteInstance, "Test");
            null
        column1.setTypeName("INTEGER");
import java.util.Collections;
            commandContext,

        List<DBEPersistAction> actions = DBExecUtils.getActionsListFromCommandContext(
import org.jkiss.dbeaver.model.exec.DBExecUtils;
/*
        String expectedDDL = "CREATE TABLE TEST_SCHEMA.NEWTABLE (" + lineBreak +
    public void generateTableCommentStatement() throws Exception {
        String expectedDDL = "COMMENT ON TABLE TEST_SCHEMA.TEST_TABLE IS 'Test comment';" + lineBreak;
        TestCommandContext commandContext = new TestCommandContext(executionContext, false);
    private DBRProgressMonitor monitor;

            "\tCOLUMN2 INTEGER NULL," + lineBreak +
        if (newColumn instanceof OracleTableColumn oracleTableColumn) {

        String expectedDDL = "DROP TABLE TEST_SCHEMA.TEST_TABLE;" + lineBreak;

        Assert.assertEquals(script, expectedDDL);
        );
    public void generateCreateTableWithTwoColumnsOneNullableStatement() throws Exception {
        DBEObjectMaker<OracleTableConstraint, OracleTableBase> constraintManager
        );
        OracleTableColumn tableColumn = OracleTestUtils.addColumn(oracleTable, "COLUMN1", "VARCHAR", 1);
        OracleTableColumn column2 = (OracleTableColumn) objectManager.createNewObject(
        }
        String script = SQLUtils.generateScript(
 *
        );
            executionContext,
        OracleTable newObject = objectMaker.createNewObject(
        String script = SQLUtils.generateScript(testDataSource, actions.toArray(new DBEPersistAction[0]), false);
    public void generateCreateTableWithTwoColumnsWithCommentStatement() throws Exception {
        testSchema = new OracleSchema(testDataSource, -1, "TEST_SCHEMA");

        OracleTableColumn column1 = (OracleTableColumn) objectManager.createNewObject(

        if (objectMaker instanceof OracleTableManager) {

        String expectedDDL = "ALTER TABLE TEST_SCHEMA.TEST_TABLE RENAME TO NEW_TEST_TABLE;" + lineBreak;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCRemoteInstance;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Test
    public void generateCreateTableWithTwoColumnsAndPrimaryKeyStatement() throws Exception {
        Assert.assertEquals(script, expectedDDL);
            actions.toArray(new DBEPersistAction[0]),
        DBEObjectMaker objectManager = OracleTestUtils.getManagerForClass(OracleTableColumn.class);
            testSchema,
 * You may obtain a copy of the License at
        List<DBEPersistAction> actions = DBExecUtils.getActionsListFromCommandContext(monitor, commandContext, executionContext, Collections.emptyMap(), null);

        Assert.assertEquals(script, expectedDDL);
        column1.setValueType(Types.INTEGER);
 *     http://www.apache.org/licenses/LICENSE-2.0
    private OracleTable oracleTable;

        column1.setComment("Test comment 1");

public class OracleBaseTableTest extends DBeaverUnitTest {
            Collections.emptyMap()
            "\tCOLUMN1 INTEGER NULL," + lineBreak +

 * See the License for the specific language governing permissions and
        OracleTableColumn tableColumn2 = OracleTestUtils.addColumn(oracleTable, "COLUMN3", "CHAR", 3);
        OracleTable newObject = objectMaker.createNewObject(monitor, commandContext, testSchema, null, Collections.emptyMap());
 * Unless required by applicable law or agreed to in writing, software
            ");" + lineBreak;
        oracleTable = new OracleTable(testSchema, "TEST_TABLE");


        String script = SQLUtils.generateScript(testDataSource, actions.toArray(new DBEPersistAction[0]), false);
        DBEObjectMaker<OracleTableColumn, OracleTableBase> objectManager = OracleTestUtils.getManagerForClass(OracleTableColumn.class);
        TestCommandContext commandContext = new TestCommandContext(executionContext, false);
        Assert.assertEquals(script, expectedDDL);
            oracleTableColumn.setValueType(Types.INTEGER);

 * limitations under the License.

    @Mock

            Collections.emptyMap(),
        OracleTableColumn tableColumn1 = OracleTestUtils.addColumn(oracleTable, "COLUMN2", "NUMBER", 2);
                ");" + lineBreak +
        final DBSObject newColumn = objectManager.createNewObject(

        List<DBEPersistAction> actions = DBExecUtils.getActionsListFromCommandContext(
        List<DBEPersistAction> actions = DBExecUtils.getActionsListFromCommandContext(monitor, commandContext, executionContext, Collections.emptyMap(), null);

            "\tCOLUMN1 INTEGER NULL," + lineBreak +
        OracleTable newObject = objectMaker.createNewObject(monitor, commandContext, testSchema, null, Collections.emptyMap());
        tableColumn1.setScale(4);
        column1.setValueType(Types.INTEGER);
            commandContext,
        String expectedDDL = "CREATE TABLE TEST_SCHEMA.NEWTABLE (" + lineBreak +
    }
        );
    @Test
            newObject,
    }
        PropertySourceEditable pse = new PropertySourceEditable(commandContext, oracleTable, oracleTable);
            ((OracleTableManager) objectMaker).renameObject(commandContext, oracleTable, Collections.emptyMap(), "NEW_TEST_TABLE");

 * you may not use this file except in compliance with the License.

        column2.setValueType(Types.INTEGER);
        String script = SQLUtils.generateScript(testDataSource, actions.toArray(new DBEPersistAction[0]), false);
    public void setUp() throws DBException {
        OracleTable newObject = objectMaker.createNewObject(monitor, commandContext, testSchema, null, Collections.emptyMap());
    }
            Collections.emptyMap()
            monitor, commandContext, newObject, null, Collections.emptyMap());

import org.jkiss.dbeaver.model.edit.DBEObjectMaker;
        DBPDataSourceContainer mockDataSourceContainer = configureTestContainer("oracle");
        String expectedDDL = "CREATE TABLE TEST_SCHEMA.NEWTABLE (" + lineBreak +
        DBEObjectMaker<OracleTableColumn, OracleTableBase> objectManager = OracleTestUtils.getManagerForClass(OracleTableColumn.class);

            Collections.emptyMap(),
import org.mockito.Mock;
    }

            commandContext,
                "\tCOLUMN1 INTEGER NULL," + lineBreak +

import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.impl.edit.TestCommandContext;
        String script = SQLUtils.generateScript(testDataSource, actions.toArray(new DBEPersistAction[0]), false);
    @Test
    public void generateAlterTableRenameStatement() throws Exception {
            "\tCOLUMN2 INTEGER NULL" + lineBreak +
            null,
            monitor,
        column2.setTypeName("INTEGER");
    private DBEObjectMaker<OracleTable, OracleSchema> objectMaker;
    private OracleDataSource testDataSource;
 */
        TestCommandContext commandContext = new TestCommandContext(executionContext, false);
        Assert.assertEquals(script, expectedDDL);
            "\tCOLUMN2 INTEGER NOT NULL" + lineBreak +
        OracleTableConstraintColumn constraintColumn = new OracleTableConstraintColumn(constraint, column1, 1);
            newObject,
        column2.setComment("Test comment 2");
            null
            null,
        OracleTableColumn column2 = objectManager.createNewObject(monitor, commandContext, newObject, null, Collections.emptyMap());
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
        OracleTableColumn column2 = objectManager.createNewObject(monitor, commandContext, newObject, null, Collections.emptyMap());
                "COMMENT ON COLUMN TEST_SCHEMA.NEWTABLE.COLUMN1 IS 'Test comment 1';" + lineBreak +
        );
        List<DBEPersistAction> actions = DBExecUtils.getActionsListFromCommandContext(monitor, commandContext, executionContext, Collections.emptyMap(), null);
import org.junit.Before;
    @Mock
            monitor,
            monitor,
        objectMaker.deleteObject(commandContext, oracleTable, Collections.emptyMap());
import org.jkiss.dbeaver.ext.oracle.edit.OracleTableManager;
            Collections.emptyMap()
        column2.setTypeName("INTEGER");

            monitor,
        OracleTableColumn column1 = (OracleTableColumn) objectManager.createNewObject(
        TestCommandContext commandContext = new TestCommandContext(executionContext, false);

import org.jkiss.dbeaver.model.struct.DBSObject;


            null,
        column1.setTypeName("INTEGER");
        OracleTableColumn column1 = objectManager.createNewObject(monitor, commandContext, newObject, null, Collections.emptyMap());
        );
            Collections.emptyMap(),
            executionContext,
            monitor,
    @Test
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


        Mockito.when(mockRemoteInstance.getDataSource()).thenReturn(testDataSource);
            commandContext,
            monitor,
 *
        pse.setPropertyValue(monitor, "comment", "Test comment");
        TestCommandContext commandContext = new TestCommandContext(executionContext, false);

import org.jkiss.dbeaver.runtime.properties.PropertySourceEditable;
        List<DBEPersistAction> actions = DBExecUtils.getActionsListFromCommandContext(

        tableColumn1.setPrecision(38);
        testDataSource = new OracleDataSource(mockDataSourceContainer);
    @Test
        column2.setTypeName("INTEGER");
        tableColumn.setMaxLength(100);
 * Copyright (C) 2010-2025 DBeaver Corp and others
            Collections.emptyMap()


    }


import org.jkiss.dbeaver.model.sql.SQLUtils;
        OracleTableColumn column1 = objectManager.createNewObject(monitor, commandContext, newObject, null, Collections.emptyMap());
            testDataSource,
        );
 * distributed under the License is distributed on an "AS IS" BASIS,
    public void generateCreateTableWithTwoColumnsStatement() throws Exception {
            commandContext,
}
            ");" + lineBreak;
import java.util.List;
import org.mockito.Mockito;

            ");" + lineBreak;
    @Test
import org.junit.Test;
                "COMMENT ON COLUMN TEST_SCHEMA.NEWTABLE.COLUMN2 IS 'Test comment 2';" + lineBreak;
        TestCommandContext commandContext = new TestCommandContext(executionContext, false);
                "\tCOLUMN2 INTEGER NULL" + lineBreak +
import org.jkiss.junit.DBeaverUnitTest;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            "\tCOLUMN1 INTEGER NULL," + lineBreak +

        column1.setTypeName("INTEGER");
            monitor,

            oracleTableColumn.setRequired(true);
    @Test
            false
        }

        objectMaker = OracleTestUtils.getManagerForClass(OracleTable.class);
            null

        tableColumn2.setMaxLength(13);
        String script = SQLUtils.generateScript(testDataSource, actions.toArray(new DBEPersistAction[0]), false);
            oracleTableColumn.setTypeName("INTEGER");

        Assert.assertEquals(script, expectedDDL);
            newObject,
    private OracleExecutionContext executionContext;
        constraint.setConstraintType(DBSEntityConstraintType.PRIMARY_KEY);
    private OracleSchema testSchema;
        DBEObjectMaker objectManager = OracleTestUtils.getManagerForClass(OracleTableColumn.class);
        constraint.setName("NEWTABLE_PK");
    private JDBCRemoteInstance mockRemoteInstance;
        OracleTableConstraint constraint = constraintManager.createNewObject(
            commandContext,
