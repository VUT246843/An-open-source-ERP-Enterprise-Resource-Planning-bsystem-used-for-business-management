            script.append(expectedCommandsText.get(i)).append("\n");
        List<String> inputParamNames = List.of("aBc", "PrE#%&@T", "a@c=");
            actualParamNames.add(sqlQueryParameter.getName());
    @Test
        Assert.assertTrue(sqlScriptElement instanceof SQLControlCommand);
            SQLParserContext context = createParserContext(hanaDialect, query);
import org.jkiss.dbeaver.runtime.DBWorkbench;
                "RETURNS VARCHAR\n" +
            throw new DBException("Can't initialize identifier quote string for dialect " + name, e);
import java.util.stream.Collectors;
            Assert.assertEquals("DO BEGIN\n" + "SELECT * FROM dummy;\n" + "END", element.getText());
            } else {
            if (i + 1 < expected.length && expected[i + 1] == null) {

    @Mock
                + "LANGUAGE SQL AS\n"
        return new SQLParserContext(dataSource, syntaxManager, ruleManager, new Document(query));
                    "CREATE_BY VARCHAR2(32),\n" +
        int end;
        SQLParserContext context = createParserContext(setDialect("snowflake"), script.toString());
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
        SQLParserContext context = createParserContext(setDialect("snowflake"), modifiedQuery);
    }
        Mockito.when(dataSourceContainer.getDriver()).thenReturn(driver);
    }
        }
                "$$;",

            null,
        SQLDialect hanaDialect = setDialect("sap_hana");
                    "DEMAND_TYPE VARCHAR2(50),\n" +
        List<SQLScriptElement> elements = SQLScriptParser.parseScript(context.getDataSource(), script.toString());
    }
    private SQLParserContext createParserContext(SQLDialect dialect, String query) {
}
            SQLParserContext context = createParserContext(hanaDialect, query);
                "    return seq;\n" +
        Mockito.lenient().when(dataSourceContainer.getActualConnectionConfiguration()).thenReturn(connectionConfiguration);
                + "    , SCRIPT VARCHAR NOT NULL\n"
            "use Yan;\n",
            Assert.assertEquals(varNames.get(i), text.substring(0, end).trim());
 *     http://www.apache.org/licenses/LICENSE-2.0
                "    END IF;\n" +
        for (SQLQueryParameter sqlQueryParameter : params) {
            Mockito.when(databaseMetaData.getIdentifierQuoteString()).thenReturn("\"");

                expectedParts.add(expected[i].replaceAll("[\\;]+$", ""));
    }
        for (SQLQueryParameter sqlQueryParameter : params) {
        assertParse("snowflake", query);
        for (SQLQueryParameter sqlQueryParameter : params) {
                    "STATUS INT,\n" +
                    "SELECT v_error_message, v_sqlstate, v_error_schema, v_error_table, v_err_nbr;\n" +
        Assert.assertEquals(1, elements.size());
        StringJoiner joiner = new StringJoiner(", ", "select ", " from dual");
        List<SQLQueryParameter> params = SQLScriptParser.parseParametersAndVariables(context, 0, query.length());
        };
        ((JDBCSQLDialect) dialect).initDriverSettings(session, dataSource, databaseMetaData);
        }
        {
                "        RETURN 'one';\n" +
 * you may not use this file except in compliance with the License.
 *
            "select 10 ; /* Comments */",
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.junit.Assert;
        String query = joiner.toString();
            String query = "/* Issue */\n" + "DO BEGIN\n" + "SELECT * FROM dummy;\n" + "END;";
import org.jkiss.dbeaver.model.sql.*;
    private JDBCSession session;
        SQLDialect dialect = registry.getDialect(name).createInstance();
            @@set myVar=the first line
        List<SQLScriptElement> elements = SQLScriptParser.extractScriptQueries(context, 0, docLen, false, false, false);
            works@@""";
            null,
import java.sql.SQLException;

        }
                    "GET DIAGNOSTICS CONDITION 1\n" +
            SQLScriptElement element = SQLScriptParser.parseQuery(context, 0, query.length(), 0, false, false);
    private void assertParse(String dialectName, String query, String[] expected) throws DBException {

import org.jkiss.dbeaver.model.sql.parser.rules.ScriptParameterRule;
        List<SQLQueryParameter> params = SQLScriptParser.parseParametersAndVariables(context, 0, query.length());

        Mockito.lenient().when(dataSourceContainer.getConnectionConfiguration()).thenReturn(connectionConfiguration);
    private SQLDialect setDialect(String name) throws DBException {
    }
            actualParamNames.add(sqlQueryParameter.getName());
        }
            String query = "/* Issue */\n\n" + "DO BEGIN\n" + "SELECT * FROM dummy;\n" + "END;";
        Assert.assertEquals(List.of("aBc", "PrET", "ac"), actualParamNames);
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        assert context.getDataSource() != null;
            String query = "/* Issue */\n" + "DO BEGIN\n" + "SELECT * FROM dummy;\n" + "END;";
    }
/*
        String modifiedQuery = modifiedQueryAndPositions.keySet().iterator().next();
                + "    , HASHDIFF BINARY(16)\n"
                    ");\n",
        Assert.assertTrue(hanaDialect.isStripCommentsBeforeBlocks());
            "FROM Yan.Album;\n",
                "END;",
        DBPPreferenceStore preferenceStore = DBWorkbench.getPlatform().getPreferenceStore();
        ruleManager.loadRules(dataSource, false);
            "select 10 ; -- Comments\n",
        Mockito.when(dataSource.getMetaModel()).thenReturn(metaModel);
        String query = joiner.toString();
                "    end if;\n" +
        SQLParserContext context = createParserContext(setDialect("snowflake"), commandText);
            null,
import org.jkiss.util.SQLEditorTestUtil;
                    "SET v_updt_row_count = 1;\n" +
    }
        List<String> expectedParts = new ArrayList<>(expected.length);
                + "    i int;\n"
                "    IF (FLAG = 1) THEN\n" +
            null,
        {
            null,
        String query = """
    @Test
        String query = joiner.toString();
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
                + "    END IF;\n"
    public void parseParameterFromSetCommand() throws DBException {
        StringJoiner joiner = new StringJoiner(", ", "select ", " from dual");
        List<String> inputParamNames = List.of("aBc", "PrET", "ac");
                    "v_error_message = MESSAGE_TEXT, v_sqlstate = RETURNED_SQLSTATE, v_error_schema = SCHEMA_NAME, v_error_TABLE = TABLE_NAME, v_err_nbr = MYSQL_ERRNO;\n" +
        }
                + "    , TYPE VARCHAR NOT NULL\n"
import java.util.List;
        List<String> actualParamNames = new ArrayList<String>();
                "BEGIN\n" +
        List<String> invalidParamNames = List.of("&6^34", "%#2", "\"\"\"\"");
            "COMMENT ON COLUMN T_PARK_REQUIREMENT_APPLICATION.ID IS '主键';\n",
                    "END;\n",

            SQLScriptElement element = SQLScriptParser.parseQuery(context, 0, query.length(), 0, false, false);
        }
                i++;
        SQLRuleManager ruleManager = new SQLRuleManager(syntaxManager);
    public void parseVariablesInComment() throws DBException {
import org.jkiss.dbeaver.DBException;
        SQLDialectMetadataRegistry registry = DBWorkbench.getPlatform().getSQLDialectRegistry();
    }
            SQLScriptElement element = SQLScriptParser.parseQuery(context, 0, query.length(), 0, false, false);

import org.jkiss.dbeaver.model.DBPDataSourceContainer;

        List<SQLQueryParameter> params = SQLScriptParser.parseParametersAndVariables(context, 0, query.length());
            SQLDialect oracle = setDialect("oracle");
                + "    , MODEL VARCHAR NOT NULL\n"
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
        List<SQLQueryParameter> params = SQLScriptParser.parseParametersAndVariables(context, 0, query.length());

    public void parseVariables() throws DBException {
    @Mock
        Mockito.when(dataSource.getContainer()).thenReturn(dataSourceContainer);
            null,
        }
import java.util.StringJoiner;
    private GenericDataSource dataSource;
    @Test
            null,
    @Test
                "seq integer;\n" +
                    "CONTACT_PHONE VARCHAR2(100),\n" +
    @Mock
    private DBPDataSourceContainer dataSourceContainer;
    }
        SQLScriptElement sqlScriptElement = elements.get(0);
        List<SQLScriptElement> elements = SQLScriptParser.parseScript(context.getDataSource(), commandText);

        SQLParserContext context = createParserContext(setDialect("snowflake"), query);
                + "IF EXISTS dim_test;",
                + "$$\n"
            "DROP TABLE\r\n"
        var modifiedQueryAndPositions = SQLEditorTestUtil.getCursorPositions(query);
    public void parseSnowflakeIfExistsStatements() throws DBException {
            null,
            Assert.assertEquals(expected[index], elements.get(index).getText());
        assertParse(dialectName, source, expectedParts.toArray(new String[0]));
        SQLSyntaxManager syntaxManager = new SQLSyntaxManager();
            "COMMENT ON TABLE T_PARK_REQUIREMENT_APPLICATION IS '园区需求申请';\n",

        );
            }
        SQLParserContext context = createParserContext(setDialect("snowflake"), query);
            "FROM DBeaver.NewTable;\n",
        List<String> inputParamNames = List.of("1", "\"SYs_B_1\"", "\"MyVar8\"", "AbC", "\"#d2\"");
 *
        String[] query = new String[]{
                + "    IF (i=2) THEN\n"
 *
            actualParamNames.add(sqlQueryParameter.getName());

 * You may obtain a copy of the License at

 * DBeaver - Universal Database Manager
            null,
        Assert.assertEquals(List.of("1", "\"SYs_B_1\"", "\"MyVar8\"", "AbC", "\"#d2\""), actualParamNames);
            if (sqlScriptElement instanceof SQLControlCommand cmd) {
    public void checkSmartBlankLineIsAStatementDelimiterMode() throws DBException {
    @Test
        for (int i = 0; i < expected.length; i++) {
        return dialect;
        int docLen = context.getDocument().getLength();
                + "    i:=1;\n"
            begi<-|n transaction;<-|
                "if (customer_number = 1) then seq := 1;\n" +
    private JDBCDatabaseMetaData databaseMetaData;
            null
    public void init() {
            Assert.assertEquals("DO BEGIN\n" + "SELECT * FROM dummy;\n" + "END", element.getText());
                    "REPORT_CONTENT VARCHAR2(4000),\n" +
        }
            Assert.assertFalse(oracle.isStripCommentsBeforeBlocks());
    private void assertParse(String dialectName, String[] expected) throws DBException {
 */
                + "IF\n"
            SQLParserContext context = createParserContext(setDialect("snowflake"), query);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    "UPDATE_BY VARCHAR2(32),\n" +

import java.util.Arrays;
            "select 2;\n",
            expectedCommandsText.add("@set " + varNames.get(i) + " = 1");
        };
            "begin transaction;\nselect 1 from dual;",
 * limitations under the License.
            """;
        }
        assertParse("snowflake",
            "ALTER PROCEDURE IF EXISTS procedure1(FLOAT) RENAME TO procedure2;",
            "SELECT Column1\n" +
            "CREATE or replace PROCEDURE example_if(flag INTEGER)\n" +
        SQLControlCommand cmd = (SQLControlCommand) sqlScriptElement;
 * Unless required by applicable law or agreed to in writing, software
        }
            String query = "/* Issue */\n" + "DO BEGIN\n" + "SELECT * FROM dummy;\n" + "END;";

        DBPConnectionConfiguration connectionConfiguration = new DBPConnectionConfiguration();
                + "    , EXECUTION_DATE TIMESTAMP_LTZ NOT NULL DEFAULT CURRENT_TIMESTAMP\n"
            null,
    private GenericMetaModel metaModel;
    public void parseMultilineParametersFromSetCommand() throws DBException {
            select 1 from dual;
                "declare \n" +

            SQLScriptElement element = SQLScriptParser.parseQuery(context, 0, query.length(), 0, false, false);
        SQLScriptElement element;
        inputParamNames.stream().forEach(p -> joiner.add(":" + p));
        String query = joiner.toString();
        }
                + "    END IF;\n"
import org.junit.Before;
            null,
    }
import org.jkiss.junit.DBeaverUnitTest;
            "DECLARE EXIT HANDLER FOR SQLEXCEPTION\n" +
        SQLParserContext context = createParserContext(setDialect("snowflake"), query);
            Assert.assertEquals("/* Issue */\n" + "DO BEGIN\n" + "SELECT * FROM dummy;\n" + "END", element.getText());

                + "      i:=3;\n"

        for (int index = 0; index < expected.length; index++) {
        ArrayList<String> expectedCommandsText = new ArrayList<>();
        } catch (SQLException e) {
            "CREATE OR REPLACE PROCEDURE testproc()\n"
    @Test
    @Mock
            SQLParserContext context = createParserContext(hanaDialect, query);
            }
            null,
            Assert.assertEquals("/* Issue */\n" + "DO BEGIN\n" + "SELECT * FROM dummy;\n" + "END;", element.getText());
                    "UPDATE_TIME DATE,\n" +
        SQLParserContext context = createParserContext(setDialect("snowflake"), query);
            "CREATE TABLE IF NOT EXISTS MART_FLSEDW_CI.DEPLOYMENT_SCRIPTS\n"
            "select 1;\n",
            "COMMENT ON COLUMN T_PARK_REQUIREMENT_APPLICATION.APPLICANT_NAME IS '申请人';\n",
    @Test
        StringJoiner joiner = new StringJoiner(", ", "-- ", " ");
        inputParamNames.stream().forEach(p -> joiner.add("'${" + p + "}'"));
        List<String> varNames = List.of("aBc", "\"aBc\"", "\"a@c=\"");
        String text;
        }
            Assert.assertEquals("begin transaction", element.getText());
            "FROM Elizabeth.Elis;\n",
 * Copyright (C) 2010-2025 DBeaver Corp and others
        inputParamNames.stream().forEach(p -> joiner.add("${" + p + "}"));
        Assert.assertEquals(List.of("aBc", "PrET", "ac"), actualParamNames);
import org.jkiss.dbeaver.model.connection.DBPDriver;
        List<String> actualCommandsText = new ArrayList<>();
    private DBPDriver driver;
            text = commands.get(i).getParameter();
    }
                    "APPLICANT_NAME VARCHAR2(200),\n" +
    public void parseNamedParameters() throws DBException {
        {
                "    as \n" +
                commands.add(cmd);
            null,
        List<SQLControlCommand> commands = new ArrayList<>();
            Assert.assertEquals("DO BEGIN\n" + "SELECT * FROM dummy;\n" + "END", element.getText());
            "SELECT Column1, name\n" +
        Assert.assertEquals(List.of("aBc", "PrE#%&@T", "a@c="), actualParamNames);
        };
        Mockito.lenient().when(executionContext.getDataSource()).thenReturn(dataSource);
                    "COMPANY_NAME VARCHAR2(500),\n" +
        Mockito.when(dataSourceContainer.getPreferenceStore()).thenReturn(preferenceStore);
                "    returns integer not null\n" +
import org.mockito.Mock;
                "    ELSE\n" +
        SQLParserContext context = createParserContext(setDialect(dialectName), query);
        List<String> actualParamNames = new ArrayList<String>();
import org.junit.Test;
                + "  END\n"
    public void parseFromCursorPositionBeginTransaction() throws DBException {
        Assert.assertEquals(expected.length, elements.size());
                "AS\n" +
                + "(\r\n"
        Mockito.when(driver.getDriverParameter(Mockito.anyString())).thenReturn(null);
        Mockito.when(metaModel.supportsUpsertStatement()).thenReturn(false);
package org.jkiss.dbeaver.model.sql.parser;
            null,
                + "    IF (i=1) THEN\n"
                "        RETURN 'Unexpected input.';\n" +

            null,
            null,
            null,
        try {

            String query = "/* Issue */" + "DO BEGIN\n" + "SELECT * FROM dummy;\n" + "END;";
                actualCommandsText.add(cmd.getText());
            null
                "\n" +
        int end = ScriptParameterRule.tryConsumeParameterName(context.getDialect(), cmd.getParameter(), 0);
        }
            and the second line
        }
        }
    }
    @Test
            Assert.assertEquals("DO BEGIN\n" + "SELECT * FROM dummy;\n" + "END", element.getText());
        syntaxManager.init(dialect, dataSourceContainer.getPreferenceStore());
    }
                expectedParts.add(expected[i]);
        Assert.assertEquals("myVar", cmd.getParameter().substring(0, end).trim());
    public void parseBeginTransaction() throws DBException {
        for (SQLQueryParameter sqlQueryParameter : params) {
            SQLParserContext context = createParserContext(oracle, query);
            element = SQLScriptParser.parseQuery(context, 0, modifiedQuery.length(), pos, false, false);

                + "    DEPLOYMENT_SCRIPTS_ID INTEGER IDENTITY(1,1) NOT NULL\n"
    public void parseVariablesInStrings() throws DBException {
                "    ELSEIF (FLAG = 2) THEN\n" +
import org.mockito.Mockito;
        inputParamNames.stream().forEach(p -> joiner.add("${" + p + "}"));
        invalidParamNames.stream().forEach(p -> joiner.add(":" + p));
        {
            actualParamNames.add(sqlQueryParameter.getName());
            SQLScriptElement element = SQLScriptParser.parseQuery(context, 0, query.length(), 0, false, false);
                + "  BEGIN\n"
import org.eclipse.jface.text.Document;
            "DROP TABLE\n"
    }
        String[] query = new String[]{
                "end if;\n" +
        StringJoiner joiner = new StringJoiner(", ", "select ", " from dual");

        assertParse("snowflake", query);
                    "BEGIN\n" +
            "use DBeaver;\n",
        List<String> inputParamNames = List.of("aBc", "PrET", "ac");
            "create or replace procedure test (customer_number integer)\n" +

                "begin seq := 0;\n" +
public class SQLScriptParserGenericsTest extends DBeaverUnitTest {
    @Mock
        for (int i = 0; i < varNames.size(); i++) {

                "    language sql\n" +
        for (SQLScriptElement sqlScriptElement : elements) {
                + "EXISTS dim_appt;",
        StringBuilder script = new StringBuilder();
                    "CREATE_TIME DATE,\n" +
        }
    @Test
                    "DATE_RAISED DATE,\n" +
                    "PRIMARY KEY (ID)\n" +
        {
            "COMMENT ON COLUMN T_PARK_REQUIREMENT_APPLICATION.COMPANY_NAME IS '公司名称';\n",
                + "$$"
                "LANGUAGE SQL\n" +
        Assert.assertEquals(expectedCommandsText, actualCommandsText);
    }
        List<String> actualParamNames = new ArrayList<String>();
        int[] positions = modifiedQueryAndPositions.get(modifiedQuery);
            SQLParserContext context = createParserContext(hanaDialect, query);
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.impl.jdbc.JDBCSQLDialect;
    @Mock
        {
        String source = Arrays.stream(expected).filter(e -> e != null).collect(Collectors.joining());
        }
            end = ScriptParameterRule.tryConsumeParameterName(context.getDialect(), text, 0);
        List<String> actualParamNames = new ArrayList<String>();
            "CREATE TABLE T_PARK_REQUIREMENT_APPLICATION(\n" +
    private DBCExecutionContext executionContext;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            String query = "DO BEGIN\n" + "SELECT * FROM dummy;\n" + "END;";
            "SELECT AlbumId, Title, ArtistId, Column1\n" +
                "        RETURN 'two';\n" +
        assertParse("snowflake", query);
    @Test
            new String[]{"begin transaction", "select 1 from dual"}
        assert context.getDataSource() != null;
 * distributed under the License is distributed on an "AS IS" BASIS,
    public void parseSnowflakeCreateProcedureWithIfStatements() throws DBException {
import java.util.ArrayList;
                + "  DECLARE\n"
        for (int i = 0; i < varNames.size(); i++) {
            SQLScriptElement element = SQLScriptParser.parseQuery(context, 0, query.length(), 0, false, false);
                    "REPORT_TYPE VARCHAR2(50),\n" +
        String[] query = new String[]{
        Mockito.when(dataSource.getSQLDialect()).thenReturn(dialect);
    @Before
            "use Elizabeth;\n",
    }
                + "RETURNS varchar\n"
                    "ID VARCHAR2(32) DEFAULT SYS_GUID() NOT NULL,\n" +
                + "      i:=2;\n"
        String commandText = """
                "end;\n" +
            null,
    @Mock
    @Test
            null,
        Assert.assertEquals(commandText, cmd.getText());
    }
                "    else if (customer_number = 0) then seq := seq + 10;\n" +
                + ");",
    public void parseQueryBeforeBlockDeclaration() throws DBException {
                "$$\n" +
        for (int pos : positions) {
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
