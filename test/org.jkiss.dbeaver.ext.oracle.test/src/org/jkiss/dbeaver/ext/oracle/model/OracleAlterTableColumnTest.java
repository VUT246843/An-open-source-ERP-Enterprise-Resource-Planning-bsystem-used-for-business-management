        String expectedDDL =
import org.junit.Before;
        Assert.assertEquals(script, expectedDDL);
        List<DBEPersistAction> actions = DBExecUtils.getActionsListFromCommandContext(monitor, commandContext, executionContext, Collections.emptyMap(), null);
            Collections.emptyMap(),
            monitor,
        Assert.assertEquals(script, expectedDDL);
            commandContext,

    @Test


import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        pse.setPropertyValue(monitor, "required", false);

import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        Assert.assertEquals(script, expectedDDL);
        testColumnNumber.setPersisted(true);
        pse.collectProperties();
    @Test
        pse.collectProperties();
        String expectedDDL = "COMMENT ON COLUMN TEST_SCHEMA.TEST_TABLE.COLUMN1 IS 'Test comment';" + lineBreak;
    private DBEObjectMaker<OracleTableColumn, OracleTableBase> objectMaker;
        objectMaker.deleteObject(commandContext, testColumnVarchar, Collections.emptyMap());

 */

        TestCommandContext commandContext = new TestCommandContext(executionContext, false);
        pse.setPropertyValue(monitor, "maxLength", 33);
import org.jkiss.dbeaver.model.sql.SQLUtils;
 *
    public void generateAlterTableAlterNumericColumnChangePrecisionStatement() throws Exception {

    @Test

        testColumnVarchar.setDefaultValue("'Test value'");
        List<DBEPersistAction> actions = DBExecUtils.getActionsListFromCommandContext(monitor, commandContext, executionContext, Collections.emptyMap(), null);



        List<DBEPersistAction> actions = DBExecUtils.getActionsListFromCommandContext(monitor, commandContext, executionContext, Collections.emptyMap(), null);
        String script = SQLUtils.generateScript(testDataSource, actions.toArray(new DBEPersistAction[0]), false);
import org.junit.Test;
import org.jkiss.dbeaver.model.edit.DBEObjectMaker;
        String expectedDDL =
        );
public class OracleAlterTableColumnTest extends DBeaverUnitTest {
        List<DBEPersistAction> actions = DBExecUtils.getActionsListFromCommandContext(monitor, commandContext, executionContext, Collections.emptyMap(), null);
        String expectedDDL =
        OracleSchema testSchema = new OracleSchema(testDataSource, -1, "TEST_SCHEMA");
        TestCommandContext commandContext = new TestCommandContext(executionContext, false);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void setUp() throws DBException {
import org.mockito.Mock;
        pse.setPropertyValue(monitor, "defaultValue", "42");
        Assert.assertEquals(script, expectedDDL);

        PropertySourceEditable pse = new PropertySourceEditable(commandContext, testColumnNumber, testColumnNumber);
    }
    public void generateAlterTableSetNullConditionStatement() throws Exception {
        List<DBEPersistAction> actions = DBExecUtils.getActionsListFromCommandContext(
        testDataSource = new OracleDataSource(dataSourceContainer);
    private JDBCRemoteInstance mockRemoteInstance;

    @Test
 * you may not use this file except in compliance with the License.
        pse.collectProperties();
        String script = SQLUtils.generateScript(testDataSource, actions.toArray(new DBEPersistAction[0]), false);


        }


        List<DBEPersistAction> actions = DBExecUtils.getActionsListFromCommandContext(monitor, commandContext, executionContext, Collections.emptyMap(), null);
import java.sql.Types;

        List<DBEPersistAction> actions = DBExecUtils.getActionsListFromCommandContext(monitor, commandContext, executionContext, Collections.emptyMap(), null);
        PropertySourceEditable pse = new PropertySourceEditable(commandContext, testColumnVarchar, testColumnVarchar);
    @Test
        pse.setPropertyValue(monitor, "comment", "Test comment");
    private OracleTableColumn testColumnVarchar;
        oracleTableBase = new OracleTable(testSchema, "TEST_TABLE");

    public void generateAlterTableAlterNumericColumnWithDefaultValueChangeScaleStatement() throws Exception {
        String expectedDDL = "ALTER TABLE TEST_SCHEMA.TEST_TABLE MODIFY COLUMN2 NUMBER(22,0);" + lineBreak;

        String expectedDDL = "ALTER TABLE TEST_SCHEMA.TEST_TABLE RENAME COLUMN COLUMN3 TO COLUMN33;" + lineBreak;

    }

    }
            ((OracleTableColumnManager) objectMaker).renameObject(commandContext, testColumnChar, Collections.emptyMap(), "COLUMN33");
import org.mockito.Mockito;
        TestCommandContext commandContext = new TestCommandContext(executionContext, false);



        String script = SQLUtils.generateScript(testDataSource, actions.toArray(new DBEPersistAction[0]), false);

        PropertySourceEditable pse = new PropertySourceEditable(commandContext, testColumnVarchar, testColumnVarchar);
    @Test
        Assert.assertEquals(script, expectedDDL);
package org.jkiss.dbeaver.ext.oracle.model;
    private OracleTableBase oracleTableBase;
import org.jkiss.dbeaver.runtime.properties.PropertySourceEditable;
 *     http://www.apache.org/licenses/LICENSE-2.0

        Assert.assertEquals(script, expectedDDL);
 * Licensed under the Apache License, Version 2.0 (the "License");
        List<DBEPersistAction> actions = DBExecUtils.getActionsListFromCommandContext(monitor, commandContext, executionContext, Collections.emptyMap(), null);
            monitor,
        Assert.assertEquals(script, expectedDDL);
 * Copyright (C) 2010-2025 DBeaver Corp and others

        testColumnVarchar.setPersisted(true);
import org.jkiss.dbeaver.ext.oracle.edit.OracleTableColumnManager;

    }
    @Mock

        pse.setPropertyValue(monitor, "maxLength", 50);
    }
        pse.setPropertyValue(monitor, "required", true);
        PropertySourceEditable pse = new PropertySourceEditable(commandContext, testColumnVarchar, testColumnVarchar);


        String expectedDDL = "ALTER TABLE TEST_SCHEMA.TEST_TABLE ADD COLUMN4 INTEGER NULL;" + lineBreak;
            oracleTableBase,
        PropertySourceEditable pse = new PropertySourceEditable(commandContext, testColumnChar, testColumnChar);
            "ALTER TABLE TEST_SCHEMA.TEST_TABLE MODIFY COLUMN1 VARCHAR(100) DEFAULT 'Test value';" + lineBreak;


        List<DBEPersistAction> actions = DBExecUtils.getActionsListFromCommandContext(monitor, commandContext, executionContext, Collections.emptyMap(), null);

    public void generateAlterTableRenameColumnStatement() throws Exception {

        List<DBEPersistAction> actions = DBExecUtils.getActionsListFromCommandContext(monitor, commandContext, executionContext, Collections.emptyMap(), null);
        pse.setPropertyValue(monitor, "precision", 22);
    @Test
        testColumnChar = OracleTestUtils.addColumn(oracleTableBase, "COLUMN3", "CHAR", 3);
        testColumnNumber.setPrecision(38);

    public void generateAlterTableSetColumnCommentStatement() throws Exception {

        String expectedDDL = "ALTER TABLE TEST_SCHEMA.TEST_TABLE MODIFY COLUMN1 VARCHAR(100) NULL;" + lineBreak;
        testColumnChar.setPersisted(true);
            executionContext,

        Assert.assertEquals(script, expectedDDL);
        TestCommandContext commandContext = new TestCommandContext(executionContext, false);
        testColumnVarchar.setMaxLength(100);
 * limitations under the License.
        executionContext = new OracleExecutionContext(mockRemoteInstance, "Test");

    public void generateAlterTableChangeMaxLengthByColumnWithoutDefaultValueStatement() throws Exception {


        pse.collectProperties();
    }

        String script = SQLUtils.generateScript(testDataSource, actions.toArray(new DBEPersistAction[0]), false);
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.impl.edit.TestCommandContext;
    }


    }
    public void generateAlterTableChangeMaxLengthByColumnWithDefaultValueStatement() throws Exception {
            "ALTER TABLE TEST_SCHEMA.TEST_TABLE MODIFY COLUMN2 NUMBER(38,0) DEFAULT 42;" + lineBreak;
        testColumnNumber = OracleTestUtils.addColumn(oracleTableBase, "COLUMN2", "NUMBER", 2);


        testColumnVarchar = OracleTestUtils.addColumn(oracleTableBase, "COLUMN1", "VARCHAR", 1);
import java.util.Collections;
        Assert.assertEquals(script, expectedDDL);
    private OracleTableColumn testColumnChar;

    private OracleTableColumn testColumnNumber;
import org.jkiss.junit.DBeaverUnitTest;

        OracleTableColumn newColumn = objectMaker.createNewObject(

        Assert.assertEquals(script, expectedDDL);

        TestCommandContext commandContext = new TestCommandContext(executionContext, false);

        String script = SQLUtils.generateScript(testDataSource, actions.toArray(new DBEPersistAction[0]), false);
        pse.collectProperties();


        TestCommandContext commandContext = new TestCommandContext(executionContext, false);
        DBPDataSourceContainer dataSourceContainer = configureTestContainer("oracle");
        String expectedDDL =
    }
        pse.setPropertyValue(monitor, "scale", 17);
        List<DBEPersistAction> actions = DBExecUtils.getActionsListFromCommandContext(monitor, commandContext, executionContext, Collections.emptyMap(), null);

 *
    private OracleExecutionContext executionContext;
        Assert.assertEquals(script, expectedDDL);
        String expectedDDL = "ALTER TABLE TEST_SCHEMA.TEST_TABLE MODIFY COLUMN3 CHAR(33);" + lineBreak;
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software

        String script = SQLUtils.generateScript(testDataSource, actions.toArray(new DBEPersistAction[0]), false);

        String expectedDDL = "ALTER TABLE TEST_SCHEMA.TEST_TABLE MODIFY COLUMN1 VARCHAR(100) NOT NULL;" + lineBreak;
        String script = SQLUtils.generateScript(testDataSource, actions.toArray(new DBEPersistAction[0]), false);
    public void generateAlterTableSetNumericDefaultValueStatement() throws Exception {
        PropertySourceEditable pse = new PropertySourceEditable(commandContext, testColumnNumber, testColumnNumber);
        List<DBEPersistAction> actions = DBExecUtils.getActionsListFromCommandContext(monitor, commandContext, executionContext, Collections.emptyMap(), null);
    @Test
        pse.collectProperties();
} * You may obtain a copy of the License at
        PropertySourceEditable pse = new PropertySourceEditable(commandContext, testColumnVarchar, testColumnVarchar);
        newColumn.setValueType(Types.INTEGER);
        testColumnNumber.setScale(0);
import java.util.List;
        String script = SQLUtils.generateScript(testDataSource, actions.toArray(new DBEPersistAction[0]), false);
            null,
    public void generateAlterTableAddColumnStatement() throws Exception {

        String script = SQLUtils.generateScript(testDataSource, actions.toArray(new DBEPersistAction[0]), false);
        Assert.assertEquals(script, expectedDDL);
    public void generateAlterTableDropColumnStatement() throws Exception {
        String script = SQLUtils.generateScript(testDataSource, actions.toArray(new DBEPersistAction[0]), false);

    private OracleDataSource testDataSource;
    @Before

    @Test

            null);
        TestCommandContext commandContext = new TestCommandContext(executionContext, false);
    }

        TestCommandContext commandContext = new TestCommandContext(executionContext, false);
        String script = SQLUtils.generateScript(testDataSource, actions.toArray(new DBEPersistAction[0]), false);

        TestCommandContext commandContext = new TestCommandContext(executionContext, false);
import org.jkiss.dbeaver.DBException;
    @Test
            commandContext,

        if (objectMaker instanceof OracleTableColumnManager) {
    }
 *
    @Test

        String script = SQLUtils.generateScript(testDataSource, actions.toArray(new DBEPersistAction[0]), false);
import org.junit.Assert;
        String expectedDDL = "ALTER TABLE TEST_SCHEMA.TEST_TABLE DROP COLUMN COLUMN1;" + lineBreak;
        Mockito.when(mockRemoteInstance.getDataSource()).thenReturn(testDataSource);

    public void generateAlterTableSetNotNullConditionStatement() throws Exception {

        objectMaker = OracleTestUtils.getManagerForClass(OracleTableColumn.class);
            "ALTER TABLE TEST_SCHEMA.TEST_TABLE MODIFY COLUMN2 NUMBER(38,17) DEFAULT 42;" + lineBreak;
        TestCommandContext commandContext = new TestCommandContext(executionContext, false);
        testColumnNumber.setDefaultValue("42");
    }

        newColumn.setTypeName("INTEGER");
    @Test
    public void generateAlterTableSetStringDefaultValueStatement() throws Exception {
 * See the License for the specific language governing permissions and
        pse.setPropertyValue(monitor, "defaultValue", "'Test value'");
            "ALTER TABLE TEST_SCHEMA.TEST_TABLE MODIFY COLUMN1 VARCHAR(50) DEFAULT 'Test value';" + lineBreak;

        pse.collectProperties();
        TestCommandContext commandContext = new TestCommandContext(executionContext, false);
        PropertySourceEditable pse = new PropertySourceEditable(commandContext, testColumnVarchar, testColumnVarchar);
import org.jkiss.dbeaver.model.exec.DBExecUtils;
    }

        pse.collectProperties();
/*
        testColumnVarchar.setRequired(true);
import org.jkiss.dbeaver.model.impl.jdbc.JDBCRemoteInstance;
        TestCommandContext commandContext = new TestCommandContext(executionContext, false);
        PropertySourceEditable pse = new PropertySourceEditable(commandContext, testColumnNumber, testColumnNumber);
        pse.collectProperties();
            Collections.emptyMap()
