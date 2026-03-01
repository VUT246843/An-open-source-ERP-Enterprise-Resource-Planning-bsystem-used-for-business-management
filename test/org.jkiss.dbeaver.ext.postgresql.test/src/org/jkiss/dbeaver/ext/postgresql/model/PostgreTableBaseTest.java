        String script = SQLUtils.generateScript(testDataSource, actions.toArray(new DBEPersistAction[0]), false);
                return false;


                "\tcolumn1 int4 NULL," + lineBreak +
    // Other tests
 * distributed under the License is distributed on an "AS IS" BASIS,
        postgreExtension.setName("extName");

    }
 * you may not use this file except in compliance with the License.
    public void generateBaseTableCommentStatement() throws Exception {
        pse.collectProperties();
//        Mockito.when(mockResults.getString("relname")).thenReturn("sampleTable");
import org.jkiss.dbeaver.model.impl.edit.TestCommandContext;
                                "CREATE EXTENSION extName" + lineBreak + "\t" +
            public boolean isServerVersionAtLeast(int major, int minor) {
    public void generateExtensionDDL_whenExtensionHasPublicSchemaAndNoVersion_returnDDLForExtensionWithPublicSchemaAndWithoutVersion() throws Exception {

        String actualDDL = postgreExtension.getObjectDefinitionText(monitor, Collections.emptyMap());
        testView = new PostgreView(testSchema);
        String tableDDL = tableRegular.getObjectDefinitionText(monitor, Collections.emptyMap());
        pse.setPropertyValue(monitor, DBConstants.PROP_ID_DESCRIPTION, "Test comment");
        testView.setPersisted(true);
    }
        List<DBEPersistAction> actions = DBExecUtils.getActionsListFromCommandContext(monitor, commandContext, postgreExecutionContext, Collections.emptyMap(), null);
    public void setUp() throws Exception {

 * See the License for the specific language governing permissions and
//        long sampleId = 111111;

    }
        testTableRegular.setPersisted(true);
                "\tcolumn1 int4 NULL" + lineBreak +
import org.junit.Before;
                ");" + lineBreak;
        List<DBEPersistAction> actions = DBExecUtils.getActionsListFromCommandContext(monitor, commandContext, postgreExecutionContext, Collections.emptyMap(), null);
        tableRegular.setPartition(false);
                                "VERSION null";
        String expectedDDL = "COMMENT ON FOREIGN TABLE test_schema.\"testForeignTable\" IS 'Test comment';" + lineBreak;
    }

    @Test

        Assert.assertEquals(expectedDDL, script);
            }
        tableForeign.setPersisted(true);

    public void generateMaterializedViewCommentStatement() throws Exception {
            public boolean isTablespaceSpecified() {
    // Generation table/view comment statement tests
                return major <= 10;


    private PostgreDatabase testDatabase;
        testDatabase = testDataSource.createDatabaseImpl(monitor, "testdb", testUser, null, null, null);
    }
import org.jkiss.dbeaver.model.DBConstants;
    @Test


        PropertySourceEditable pse = new PropertySourceEditable(commandContext, testMView, testMView);
        pse.collectProperties();

 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
import java.util.HashMap;
 *
import java.util.List;
        tableRegular.setPartition(false);
            @Nullable
        pse.setPropertyValue(monitor, DBConstants.PROP_ID_DESCRIPTION, "Test comment");
            @Override
        pse.collectProperties();
        postgreExecutionContext = new PostgreExecutionContext(testDatabase, "Test");
        testTableRegular.setPartition(false);

        testSchema = new PostgreSchema(testDatabase, "test_schema", testUser);

        String expectedDDL =
            testView.generateChangeOwnerQuery("someOwner", new HashMap<>()));
        Assert.assertEquals(expectedDDL, script);
        tableRegular.setName("test_table");
        TestCommandContext commandContext = new TestCommandContext(postgreExecutionContext, false);
 *
    private PostgreView testView;
        PostgreMaterializedView testMView = new PostgreMaterializedView(testSchema);


 *
        PostgreRole testUser = new PostgreRole(null, "tester", "test", true);


                return false;

public class PostgreTableBaseTest extends DBeaverUnitTest {
        testTableRegular = new PostgreTableRegular(testSchema) {
        // Test View
    public void generateTableDDL_whenTableHasTwoColumns_returnDDLForTableWithTwoColumns() throws Exception {
    @Test
                return super.getLocalDataType(typeName);
    }
    }
        testDataSource = new PostgreDataSource(dataSourceContainer, "PG Test", "postgres") {
        PostgreTableRegular tableRegular = new PostgreTableRegular(testSchema) {

/*

                                "SCHEMA \"public\"" + lineBreak + "\t" +
    private PostgreTableRegular testTableRegular;
                "CREATE TABLE test_schema.test_table (" + lineBreak +
        String script = SQLUtils.generateScript(testDataSource, actions.toArray(new DBEPersistAction[0]), false);
        List<DBEPersistAction> actions = DBExecUtils.getActionsListFromCommandContext(monitor, commandContext, postgreExecutionContext, Collections.emptyMap(), null);


        };
        testMView.setPersisted(true);
        String script = SQLUtils.generateScript(testDataSource, actions.toArray(new DBEPersistAction[0]), false);

 * Copyright (C) 2010-2025 DBeaver Corp and others



    public void generateChangeOwnerQuery_whenProvidedView_thenShouldGenerateQuerySuccessfully() {
//        Mockito.when(mockResults.getLong("oid")).thenReturn(sampleId);
import org.jkiss.dbeaver.model.sql.SQLUtils;
import org.jkiss.dbeaver.model.exec.DBExecUtils;
        String tableDDL = tableRegular.getObjectDefinitionText(monitor, Collections.emptyMap());
        PostgreExtension postgreExtension = new PostgreExtension(testDatabase);
import org.junit.Test;
            @Override
            }
        String expectedDDL = "COMMENT ON TABLE test_schema.test_table_regular IS 'Test comment';" + lineBreak;
    }

 * limitations under the License.
        Assert.assertEquals("ALTER TABLE " + testSchema.getName() + ".\"" + testView.getName() + "\" OWNER TO someOwner",
        PropertySourceEditable pse = new PropertySourceEditable(commandContext, testTableRegular, testTableRegular);
        Assert.assertEquals(expectedDDL, script);
        tableRegular.setName("test_table");

        pse.collectProperties();
        PostgreTableForeign tableForeign = new PostgreTableForeign(testSchema);
        PostgreTableRegular tableRegular = new PostgreTableRegular(testSchema) {
        String expectedDDL = "COMMENT ON MATERIALIZED VIEW test_schema.\"testMView\" IS 'Test comment';" + lineBreak;

                ");" + lineBreak;
        Assert.assertEquals(expectedDDL, actualDDL);


            }
                return false;
            public PostgreDataType getLocalDataType(String typeName) {
    public void generateViewCommentStatement() throws Exception {
        testMView.setName("testMView");
            @Override
            }

    private PostgreSchema testSchema;
        PostgreTestUtils.addColumn(testTableRegular, "column1", "int4", 1);

        TestCommandContext commandContext = new TestCommandContext(postgreExecutionContext, false);
        TestCommandContext commandContext = new TestCommandContext(postgreExecutionContext, false);

        Assert.assertEquals(expectedDDL, tableDDL);
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.junit.Assert;
        Assert.assertEquals(expectedDDL, script);
    @Before
import java.util.Collections;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;

                                "-- DROP EXTENSION extName;" + lineBreak + lineBreak +
        testView.setName("testView");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.junit.DBeaverUnitTest;
    @Test

        DBPDataSourceContainer dataSourceContainer = configureTestContainer("postgresql");
 */
        PropertySourceEditable pse = new PropertySourceEditable(commandContext, tableForeign, tableForeign);
        List<DBEPersistAction> actions = DBExecUtils.getActionsListFromCommandContext(monitor, commandContext, postgreExecutionContext, Collections.emptyMap(), null);
            public boolean isTablespaceSpecified() {
        };

        PostgreTestUtils.addColumn(tableRegular, "column1", "int4", 1);
                "CREATE TABLE test_schema.test_table (" + lineBreak +
//        Mockito.when(mockResults.getLong("relowner")).thenReturn(sampleId);

            public boolean isTablespaceSpecified() {
        pse.setPropertyValue(monitor, DBConstants.PROP_ID_DESCRIPTION, "Test comment");
    // Tables DDL tests
 * Licensed under the Apache License, Version 2.0 (the "License");

import org.jkiss.code.Nullable;
    private PostgreDataSource testDataSource;
        testTableRegular.setName("test_table_regular");
    public void generateForeignTableCommentStatement() throws Exception {
        PostgreTestUtils.addColumn(tableRegular, "column1", "int4", 1);
 * You may obtain a copy of the License at
        PropertySourceEditable pse = new PropertySourceEditable(commandContext, testView, testView);

        String expectedDDL = "-- Extension: extName" + lineBreak + lineBreak +
        String expectedDDL =
            @Override
        TestCommandContext commandContext = new TestCommandContext(postgreExecutionContext, false);
        };
    private PostgreExecutionContext postgreExecutionContext;


    @Test
}        Assert.assertEquals(expectedDDL, tableDDL);
    @Test
import org.jkiss.dbeaver.runtime.properties.PropertySourceEditable;
            @Override
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        PostgreTestUtils.addColumn(tableRegular, "column2", "varchar", 2);
            }
        String expectedDDL = "COMMENT ON VIEW test_schema.\"testView\" IS 'Test comment';" + lineBreak;
                "\tcolumn2 varchar NULL" + lineBreak +
        pse.setPropertyValue(monitor, DBConstants.PROP_ID_DESCRIPTION, "Test comment");

    public void generateTableDDL_whenTableHasOneColumn_returnDDLForASingleColumn() throws Exception {
package org.jkiss.dbeaver.ext.postgresql.model;
        };
    }
        // Test Regular table
        String script = SQLUtils.generateScript(testDataSource, actions.toArray(new DBEPersistAction[0]), false);
    @Test
        tableForeign.setName("testForeignTable");

    @Test

import org.jkiss.dbeaver.ext.postgresql.PostgreTestUtils;
