
            "\t  )\n" +
        assertParse(
            }
import org.jkiss.util.SQLEditorTestUtil;
    @Mock
import org.mockito.Mock;
                    assertEquals("show search_path", element.getText());
            "    DBMS_OUTPUT.PUT_LINE('Employee Name: ' || v_name);\n" +
                "        dbms_output.put_line(text);\n" +
            "    FUNCTION hire (last_name VARCHAR2, job_id VARCHAR2, \n" +

     * See #19319

            "CREATE OR REPLACE PACKAGE MIG2 AUTHID CURRENT_USER AS\n" +
                "BEGIN\n" +
            "          dbms_output.put_line('Run Date: ' || to_char(p_run_date, 'MM/DD/YYYY'));      \n" +
        String modifiedQuery = modifiedQueryAndPositions.keySet().iterator().next();
            SQLScriptElement element = SQLScriptParser.parseQuery(
        SQLParserContext context = createParserContext(setDialect(ORACLE_DIALECT_NAME), query);
    private JDBCDataSource dataSource;
            "    RETURN NUMBER\n" +
    @Mock
            "    v_name VARCHAR2(100) DEFAULT 'Unknown';\n" +
            @set col1 = '1'<-|
        SQLParserContext context = createParserContext(setDialect(ORACLE_DIALECT_NAME), modifiedQuery);
            "RETURN NUMBER IS \n" +
            "    INTO\n" +
                "    NULL;\n" +
                "    RETURN\n" +
                "    IS\n" +
            "    p_id IN NUMBER\n" +
            "        RETURN NUMBER; \n" +
        }
        SQLParserContext context = createParserContext(setDialect(ORACLE_DIALECT_NAME), modifiedQuery);
            "  BEGIN\n" +
            FROM foo
            "      p_customer_id NUMBER,\n" +
        }
            "\tINSERT INTO tbl_Students VALUES (1,'Anvesh');\n" +
                "END;",
        }
        assertEquals(SQLTokenType.T_DELIMITER, scanner.nextToken().getData());
    private DBCExecutionContext executionContext;
            "\n" +
            "    FROM employees\n" +
            "END;" +
                FROM foo
                "        i := i + 1;\n" +
    public void parsePostgresDoubleDollar() throws DBException {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            "    ln_net_value NUMBER \n" +
        var modifiedQueryAndPositions = SQLEditorTestUtil.getCursorPositions(query);
            "IS\n" +


            "        UPDATE employees SET salary = salary + salary * 0.10\n" +
            null,
            "q'>All the king's horses>';",
            "END;\n" +
            );
                "    i int;\n" +
            " WHERE  rownum = 1;",

        for (String dialect : dialects) {
    public void parseFromCursorPositionBeginTransaction() throws DBException {
            "        RETURN value_char_out;\n" +
                "    text VARCHAR(10);\n" +
                "    FUNCTION create_dept(department_id NUMBER, location_id NUMBER) \n" +
    }
                "    PROCEDURE remove_dept(department_id NUMBER) IS BEGIN NULL; END;\n" +


            false,
            ")\n" +
            .collect(Collectors.joining());
                "    END;\n" +
            "    TYPE EmpRecTyp IS RECORD (\n" +
        SQLScriptElement element;
 *
                fro<-|m film_actor<-|
 *     http://www.apache.org/licenses/LICENSE-2.0

            "DECLARE\n" +

    }
            "\t ),\n" +
                "    PROCEDURE increase_sal(employee_id NUMBER, salary_incr NUMBER) IS BEGIN NULL; END;\n" +
            "q'<All the king's horses>;'",
                sel<-|ect *

            "END synchronize_my_data;"
            "    INTO\n" +
            "CREATE OR REPLACE PACKAGE BODY synchronize_my_data \n" +
            "  JOIN dept_count dc ON e.deptno = dc.deptno;",
        assertParse(ORACLE_DIALECT_NAME, statements);
                "    text VARCHAR(10);\n" +
            SELECT 'test2' FROM dual;
                expectedParts.add(segment);
                "  name VARCHAR2(64) NOT NULL := '[anonymous]');\n" +
    public void parseOracleProcedureFunctionAs() throws DBException {
            "  END;\n" +
            "        SELECT to_char(value_in_v) INTO value_char_out FROM dual;\n" +
                """,
            begi<-|n transaction;<-|
        DBPPreferenceStore preferenceStore = DBWorkbench.getPlatform().getPreferenceStore();
            "    BEGIN\n" +
            assertEquals(qstring.length() - 1, scanner.getTokenLength());
                "    END;\n" +
            "    BEGIN\n" +
            "        varchar2\n" +
            "    END;\n" +
                "        RETURN NUMBER; \n" +

        SQLScriptElement element = SQLScriptParser.parseQuery(
            "  END get_net_value_by_customer;\n" +
            "  EXCEPTION\n" +
            int[] positions = modifiedQueryAndPositions.get(modifiedQuery);
                "        commission_pct NUMBER, department_id NUMBER) \n" +
    public static final String ORACLE_DIALECT_NAME = "oracle";
            "        commission_pct NUMBER, department_id NUMBER) \n" +
            "END;"

import java.util.*;

            "END;\n" +
                "    END; \n" +
                "CREATE TRIGGER TRI_CODE_SYSTEM\n" +

            "   GROUP BY deptno)\n" +
        String[] queriesWithMarkers = {
                "\tINSERT INTO tbl_Students VALUES (1,'Anvesh');\n" +
        String[] dialects = new String[] {POSTGRESQL_DIALECT_NAME};
        assertParse(ORACLE_DIALECT_NAME, withStatements);
                WHERE 1=1""", element.getText()
    public void parseFromCursorPositionSmartModeNoDelimiterAndSpaceInside() throws DBException {
import org.jkiss.dbeaver.model.sql.SQLDialectMetadataRegistry;
            "    IS\n" +
        return dialect;
import org.jkiss.dbeaver.model.text.parser.TPRuleBasedScanner;
                "    NULL;\n" +

            """
                "        greet(text);\n" +
                    element = SQLScriptParser.parseQuery(
                    """
            "        i := i + 1;\n" +
        assertEquals("-- Comments\nselect 10 ", element.getText());

        SQLScriptElement element;
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
                "        UPDATE employees SET salary = salary + salary * 0.10\n" +
                "IF TRUE THEN\n" +
            assertParse(
import org.junit.Test;
                "END;",


            """
                "END;",
            "WITH\n" +

            Mockito.when(driver.getSampleURL()).thenReturn("jdbc:sqlserver://localhost;user=MyUserName;password=*****;");
import org.jkiss.dbeaver.model.impl.jdbc.JDBCSQLDialect;
                "END IF;\n" +
                "BEGIN  \n" +
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
                element = SQLScriptParser.parseQuery(context, 0, modifiedQuery.length(), pos, false, false);
        SQLDialectMetadataRegistry registry = DBWorkbench.getPlatform().getSQLDialectRegistry();
            "    dbms_output.put_line(test_v||chr(9)||test_f(test_v));\n" +
        String modifiedQuery = modifiedQueryAndPositions.keySet().iterator().next();
            "    DBMS_OUTPUT.PUT_LINE( SQLERRM );\n" +
            "  IS\n" +

        SQLScriptElement element;
                i += 2;
    /**
            "        RETURN NUMBER; \n" +
                "    PROCEDURE increase_comm(employee_id NUMBER, comm_incr NUMBER) IS BEGIN NULL; END;\n" +
    public void parseFromCursorPositionSelectWithWhereAndDelimiterBeforeSecondCondition() throws DBException {
                element = SQLScriptParser.parseQuery(
            TPRuleBasedScanner scanner = context.getScanner();
                "BEGIN\n" +
            "CREATE OR REPLACE FUNCTION TEST_1.FUNC_1 \n" +
        };
            for (String dialect : dialects) {
                new String[] {"begin transaction", "select 1 from dual"}
    }
            "DECLARE\n" +
        for (int i = 0; i < expected.length; ) {
            "Q'('Hello,' said the child, who didn't like goodbyes.)';",
    }
     */
                "BEGIN\n" +
        String modifiedQuery = modifiedQueryAndPositions.keySet().iterator().next();
            "        emp_id     NUMBER(6),\n" +
        int[] positions = modifiedQueryAndPositions.get(modifiedQuery);
            "    PROCEDURE greet(text IN VARCHAR2)\n" +

     * Issue 26843
    }

                "    FUNCTION test_f(value_in_v IN number)\n" +
    @Test
            "  IS\n" +
            "\n" +
                "        dbms_output.put_line(text);\n" +
        var modifiedQueryAndPositions = SQLEditorTestUtil.getCursorPositions(query);
                "CREATE OR REPLACE PACKAGE emp_mgmt AS \n" +
                "REFERENCING NEW AS NEWROW FOR EACH ROW\n" +
            "  WHEN no_data_found THEN\n" +
            assertEquals(expected[index], elements.get(index).getText());
            "DECLARE\n" +
            "WITH dept_count AS (\n" +
            "  -- get net value of a order\n" +
 * limitations under the License.
        int[] positions = modifiedQueryAndPositions.get(modifiedQuery);
                    assertEquals("begin transaction", element.getText());
            "END IF;\n" +
 * DBeaver - Universal Database Manager
            "  WHEN no_data_found THEN\n" +

            "    no_sal EXCEPTION; \n" +

                "    IS\n" +
            "BEGIN\n" +
            }
            for (int pos : positions) {
        };
            "BEGIN\n" +
    @Test

            "END;\n" +
    @Mock
            WHERE 1=1;
        String query = "select * from q;";
            assertNotEquals(SQLTokenType.T_STRING, scanner.nextToken().getData());
            "    no_comm EXCEPTION; \n" +
            "    text VARCHAR(10);\n" +
    @Test
            <-|@@set<-| var1<-| = 'I have a<-| long text for


                "END;",
        DBPConnectionConfiguration connectionConfiguration = new DBPConnectionConfiguration();
        );
        assertEquals(1, scanner.getTokenLength());
            "  END;\n" +
    private SQLParserContext createParserContext(SQLDialect dialect, String query) {
    @Test
            "      PROCEDURE process_deletes(p_run_date IN date) IS\n" +
            
            "    PROCEDURE greet(text IN VARCHAR2)\n" +
            .filter(Objects::nonNull)
        SQLParserContext context;
            null,
                "    BEGIN\n" +
            "      order_items\n" +
            "  PROCEDURE process_deletes(p_run_date IN date) \n" +
            "\n" +

            "    RETURN\n" +
        final List<String> badQstrings = List.of(
            UPDATE o<-|rders
            false,
            @set col3 = '3'
    @Before
            "CREATE OR REPLACE NONEDITIONABLE PACKAGE BODY order_mgmt\n" +
    public void parseCurrentControlCommandsCursorHead() throws DBException {
 * See the License for the specific language governing permissions and


        assertEquals(1, scanner.getTokenLength());
            
    }
            "    dbms_output.put_line('End');\n" +
            "        WHERE employee_id = emp_info.emp_id;\n" +
            "    PROCEDURE increase_sal(employee_id NUMBER, salary_incr NUMBER) IS BEGIN NULL; END;\n" +
            "SELECT *\n" +
                "END;",
            "SIGNAL SQLSTATE '45000';\n" +
                fro<-|m film_actor;<-|
                if (pos < modifiedQuery.indexOf("show search_path")) {
                   \s
            "END emp_mgmt;",
import org.mockito.Mockito;
                "    BEGIN\n" +
     */
    @Test
    public void parseOracleNamedByQTable() throws DBException {
            int[] positions = entry.getValue();
            "BEGIN\n" +
    public static final String POSTGRESQL_DIALECT_NAME = "postgresql";
            "    FROM\n" +
        syntaxManager.init(dialect, dataSourceContainer.getPreferenceStore());
            }
import org.jkiss.dbeaver.model.sql.SQLScriptElement;
                "        emp_sal    NUMBER(8,2)\n" +

        String[] statements = new String[] {
            "\n" +
            "DECLARE\n" +
            "        emp_sal    NUMBER(8,2)\n" +
            "    BEGIN\n" +
            "    process_deletes(p_run_date);\n" +
                dialect,
            "CREATE FUNCTION sales_tax(subtotal real) RETURNS real AS $$\n" +
        List<String> expectedParts = new ArrayList<>();
        var modifiedQueryAndPositions = SQLEditorTestUtil.getCursorPositions(query);
            """;
            "BEGIN\n" +
            "    WHERE  employee_id = p_id;\n" +


    @Test
            
     * Check that QStringRule doesn't interfere in this case
                "END;",
    @Test
    }
                """
    @Test
            "q'{'Hello,' said the child, who didn't like goodbyes.}';",
    public void parseFromCursorPositionDelimitersAndMultilineComments() throws DBException {
            "    );\n" +
        assertEquals(SQLTokenType.T_OTHER, scanner.nextToken().getData());
        SQLParserContext context = createParserContext(setDialect(dialectName), query);
            "END order_mgmt;",
    public void init() {
            "    FROM\n" +
            "BEGIN\n" +
                "BEGIN\n" +
            "    greet(text);\n" +
    @Mock
            "q'!What's a quote among friends?!';",
            "       dc.dept_count AS emp_dept_count\n" +
            SELECT 'test1' FROM dual;
            "    SELECT SUM(dept_total)/COUNT(*) avg\n" +
        };
            
        }
            from (values(<-|random())
            @set col2 = '2'
     */
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
                "SIGNAL SQLSTATE '45000';\n" +
                "    END raise_salary;\n" +
    public void parseFromCursorPositionUpdateWithWhereAndBlankLineInBetween() throws DBException {
        }
import org.jkiss.dbeaver.model.connection.DBPDriver;
            "    RETURN subtotal * 0.06;\n" +
    private DBPDriver driver;

            "      dbms_output.put_line('Run Date: ' || to_char(p_run_date, 'MM/DD/YYYY'));      \n" +
        return new SQLParserContext(dataSource, syntaxManager, ruleManager, document);

            "  BEGIN\n" +
            "  BEGIN\n" +
            " WHERE  dept_total > (SELECT avg FROM avg_cost)\n" +
                "    i := 0;\n" +
            scanner.nextToken();
            """;
            "CREATE TRIGGER TRI_CODE_SYSTEM\n" +
            "  IS\n" +
            for (int pos : positions) {
        var modifiedQueryAndPositions = SQLEditorTestUtil.getCursorPositions(query);
            "  END;\n" +
            "    FROM emp\n" +
            sel<-|ect 10 ; -- Comments
                "    PROCEDURE LOG(SEVERITY VARCHAR2, MSG CLOB);\n" +
            "BEGIN\n" +
import static org.junit.Assert.assertNotEquals;
                "CREATE OR REPLACE FUNCTION fn_TestDelimiter()\n" +
     */
                "    greet(text);\n" +
    }
            "IF TRUE THEN\n" +
        ruleManager.loadRules(dataSource, false);
        assertParse(ORACLE_DIALECT_NAME, packageBodyStatements);
        String query = """
            "    AND status                      = gc_shipped_status;\n" +

            "    DECLARE\n" +
                "DECLARE\n" +

                "        varchar2\n" +
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
            "  TYPE rec1_t IS RECORD (field1 VARCHAR2(16), field2 NUMBER, field3 DATE);\n" +
        }
            "q'#That's a really funny 'joke'.$';",
                "    BEGIN\n" +
            """;
            "    RETURN p_id;\n" +
            "    END;\n" +
            "DECLARE\n" +
    /**
                "CREATE FUNCTION sales_tax(subtotal real) RETURNS real AS $$\n" +
            "END;\n" +
            "$$\n" +
            "  FROM dept_costs\n" +
            "  rec1.field3 := TRUNC(SYSDATE-1);\n" +
        if (!context.getSyntaxManager().getStatementDelimiterMode().useSmart) {
            "    END;\n" +
            "      extract(YEAR FROM order_date) = p_year\n" +
            "q'>All the king's horses<';",
            "  FROM emp e\n" +
                context = createParserContext(setDialect(dialect), modifiedQuery);

        Mockito.lenient().when(dataSourceContainer.getConnectionConfiguration()).thenReturn(connectionConfiguration);
            "BEGIN ATOMIC\n" +
            0,
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
                "begin transaction;\nselect 1 from dual;",
                    );
    @Test
            "    FUNCTION create_dept(department_id NUMBER, location_id NUMBER) \n" +
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        String modifiedQuery = modifiedQueryAndPositions.keySet().iterator().next();
        var modifiedQueryAndPositions = SQLEditorTestUtil.getCursorPositions(query);
            "      ln_net_value\n" +
        SQLScriptElement element = SQLScriptParser.parseQuery(context, 0, modifiedQuery.length(), positions[0], false, false);
                "    PROCEDURE greet(text IN VARCHAR2)\n" +
            "\n" +
            "q'[What's a quote among friends?]';",

        String[] dialects = new String[] {POSTGRESQL_DIALECT_NAME, SQLSERVER_DIALECT_NAME};


                "    test_v NUMBER:=0;\n" +
            );
            "REFERENCING NEW AS NEWROW FOR EACH ROW\n" +
    }
            "        greet(text);\n" +

    public static final String SQLSERVER_DIALECT_NAME = "sqlserver";
    @Test
    public void parseOracleQStringRule() throws DBException {
            "END;\n" +
                element = SQLScriptParser.parseQuery(context, 0, modifiedQuery.length(), pos, false, false);
    private void assertParse(String dialectName, String[] expected) throws DBException {
            "$$\n" +
        );
                "  rec2 rec2_t;\n" +
            "  FUNCTION get_net_value_by_customer(\n" +
            "q''All the king's horses'';",
            "SELECT e.ename AS employee_name,\n" +
                "  rec1.field3 := TRUNC(SYSDATE-1);\n" +
        SQLParserContext context;
            "    PROCEDURE raise_salary (emp_info EmpRecTyp) IS\n" +
        for (String dialect : dialects) {
                sho<-|w search_path;<-|
            }
            "CREATE OR REPLACE EDITIONABLE PACKAGE BODY synchronize_my_data \n" +
            "    text := 'hello';\n" +
                "LANGUAGE plpgsql",
        String query = """
        for (var entry : modifiedQueryAndPositions.entrySet()) {
                "    dbms_output.put_line('Start');\n" +
                "    IF i < 5 THEN\n" +
        TPRuleBasedScanner scanner = context.getScanner();
            "  FUNCTION with_function(p_id IN NUMBER) RETURN NUMBER IS\n" +
                for (int pos : positions) {
            "    RETURN p_id;\n" +
                sho<-|w search_path;<-|
            "END;\n" +
    public void parseOraclePackageBodyBlock() throws DBException {
                "BEGIN\n" +
                }
                "\tRETURN TRUE; \n" +
            assertEquals(SQLTokenType.T_STRING, scanner.nextToken().getData());
            "      SUM(quantity * unit_price)\n" +
            @set col2 = '2'
            "  PROCEDURE with_procedure(p_id IN NUMBER) IS\n" +
                ) as s(v)

            new String[] {
            "    RETURN NUMBER\n" +
 * You may obtain a copy of the License at

        for (int index = 0; index < expected.length; index++) {
                "    TYPE EmpRecTyp IS RECORD (\n" +
     * Issue 34731
            context = createParserContext(setDialect(POSTGRESQL_DIALECT_NAME), modifiedQuery);
            AND bar=1
    @Test
            "      SUM(unit_price * quantity)\n" +
        var modifiedQueryAndPositions = SQLEditorTestUtil.getCursorPositions(query);
            @set col5 = '5'<-|
        String query = """
            "RETURN n;\n" +
    public void parseOracleDeclareBlock() throws DBException {
                assertEquals(modifiedQuery, element.getText());
                "  TYPE rec1_t IS RECORD (field1 VARCHAR2(16), field2 NUMBER, field3 DATE);\n" +
                assertEquals(
        String modifiedQuery = modifiedQueryAndPositions.keySet().iterator().next();
            "      FROM dept_costs\n" +
                "    PROCEDURE raise_salary (emp_info EmpRecTyp) IS\n" +

 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.DBException;
                "  rec3 employees%ROWTYPE;\n" +
        for (String badQstring : badQstrings) {
            "    i int;\n" +
            SQLParserContext context = createParserContext(setDialect(ORACLE_DIALECT_NAME), qstring);
            TPRuleBasedScanner scanner = context.getScanner();
            "    BEGIN\n" +
package org.jkiss.dbeaver.model.sql.parser;
    private JDBCSession session;
                "DECLARE\n" +
        }
            WHERE id in (1,23)
            "    NULL;\n" +
            assertEquals(expected, element.getText());
            }

                "END;",
        assertEquals("@set col5 = '5'", element.getText());
     * Issue 34815
            SELEC<-|T var1 FROM dual;""";
    @Test
            "SELECT id\n" +
            ORACLE_DIALECT_NAME,
        }
            "  END get_net_value;\n" +
        }
                "  TYPE rec2_t IS RECORD (id INTEGER NOT NULL := -1, \n" +
                "        WHERE employee_id = emp_info.emp_id;\n" +
                "BEFORE INSERT ON CODE_SYSTEM\n" +
import org.eclipse.jface.text.Document;
            "  END;\n" +
            "BEGIN\n" +
        SQLParserContext context = createParserContext(setDialect(ORACLE_DIALECT_NAME), modifiedQuery);
            "    PROCEDURE increase_comm(employee_id NUMBER, comm_incr NUMBER) IS BEGIN NULL; END;\n" +
                expectedParts.add(segment.replaceAll(";+$", ""));
                "  rec1.field2 := 65;\n" +
        SQLSyntaxManager syntaxManager = new SQLSyntaxManager();
                    continue;
            "\n" +
        SQLScriptElement element = SQLScriptParser.parseQuery(context, 0, query.length(), 8, false, false);
            "    PROCEDURE remove_dept(department_id NUMBER) IS BEGIN NULL; END;\n" +
            @set col3 = '3'
        String modifiedQuery = modifiedQueryAndPositions.keySet().iterator().next();
 */
            "BEGIN\n" +
            "  DBMS_OUTPUT.PUT_LINE(rec2.name);\n" +
                "CREATE OR REPLACE PACKAGE MIG2 AUTHID CURRENT_USER AS\n" +

 * Copyright (C) 2010-2025 DBeaver Corp and others
            "  rec1.field1 := 'Yesterday';\n" +

                        UPDATE orders
            "    INNER JOIN orders USING (order_id)\n" +

            context.getDocument().getLength(),
            "\n" +
            "        dbms_output.put_line(text);\n" +
                            select *
                "    BEGIN\n" +
                "        SELECT to_char(value_in_v) INTO value_char_out FROM dual;\n" +
    private SQLDialect setDialect(String name) throws DBException {
            String segment = expected[i];
            wh<-|ere s.v is not null
import org.jkiss.junit.DBeaverUnitTest;
}            "  SELECT deptno, COUNT(*) AS dept_count\n" +
            "     WHERE  e.deptno = d.deptno\n" +
        SQLScriptElement element;
                sel<-|ect *
            "  PROCEDURE synchronize_data(p_run_date IN date) \n" +
    }
            

            "                         last_name employees.last_name%TYPE, \n" +
    public void parseBeginTransaction() throws DBException {

                "    END IF;\n" +
            null,
            multiple lines'@@""";
    }
     */
            "q'<'Hello,' said the child, who didn't like goodbyes.>';"
            " WHERE  rownum = 1;",
                }
        String query = """

            "DECLARE\n" +
                "DECLARE\n" +

            "  name VARCHAR2(64) NOT NULL := '[anonymous]');\n" +
        final List<String> qstrings = List.of(
        SQLParserContext context = createParserContext(setDialect(POSTGRESQL_DIALECT_NAME), modifiedQuery);
            SET is_<-|deleted = true
            "    i := 0;\n" +
        for (String queryWithMarkers : queriesWithMarkers) {
            "  TYPE rec2_t IS RECORD (id INTEGER NOT NULL := -1, \n" +
    private JDBCDatabaseMetaData databaseMetaData;
            "q'abcd'"
            SELECT *
        );
            selec<-|t 10 ; /* Comments */
import org.jkiss.dbeaver.model.sql.parser.tokens.SQLTokenType;
            "  dept_costs AS (\n" +
            "    RETURN ln_net_value;\n" +
            "  BEGIN\n" +
            @@set var1 = 'I have a long text for
            "    IF i < 5 THEN\n" +
            new String[] {
            "q'<All the king's horses<;",
            """
            "    SELECT\n" +
        Mockito.when(dataSource.getContainer()).thenReturn(dataSourceContainer);
            "    PROCEDURE LOG(SEVERITY VARCHAR2, MSG CLOB);\n" +
        );
            "    text VARCHAR(10);\n" +
            context = createParserContext(setDialect(dialect), modifiedQuery);
        SQLRuleManager ruleManager = new SQLRuleManager(syntaxManager);
                "    PROCEDURE remove_emp(employee_id NUMBER) IS BEGIN NULL; END;\n" +
    private DBPDataSourceContainer dataSourceContainer;
            "  BEGIN\n" +
                "BEGIN\n" +
                "    dbms_output.put_line(test_v||chr(9)||test_f(test_v));\n" +
                "END;\n" +
    }
            "    ln_net_value NUMBER \n" +
    @Test
            "    test_v NUMBER:=0;\n" +
                "    );\n" +
            "  FUNCTION get_net_value(\n" +
                "DECLARE\n" +
    }
import java.util.stream.Collectors;
            "SELECT 1 INTO n from dual;\n" +
            """;
        );
    public void parseMultilineCommandFromCursorPosition() throws DBException {

            } else {
            "  END process_deletes;\n" +
                "        value_char_out VARCHAR2(10);\n" +

        assertParse(dialectName, source, expectedParts.toArray(String[]::new));

        assertEquals("@set col1 = '1'", element.getText());
            "END;\n" +
        for (String qstring : qstrings) {
            "        text := 'hello';\n" +

            
                "  rec1 rec1_t;\n" +
                "DECLARE\n" +
                "DECLARE\n" +
        SQLParserContext context = createParserContext(setDialect(POSTGRESQL_DIALECT_NAME), modifiedQuery);
import org.junit.Before;

    @Mock
            "  rec3 employees%ROWTYPE;\n" +
        int[] positions = modifiedQueryAndPositions.get(modifiedQuery);
            "  FROM   t1\n" +
    /**

    }
        assertEquals(
    }

        for (var pos : positions) {

            "  BEGIN\n" +
            " ORDER BY dname;",
            "BEGIN\n" +
 * Licensed under the Apache License, Version 2.0 (the "License");
            @set col1 = '1'
            "    DBMS_OUTPUT.PUT_LINE( SQLERRM );\n" +
            "SELECT with_function(id)\n" +
            "    process_deletes(p_run_date);\n" +
                "END;",
    public void parseFromCursorPositionSmartModeShowStatement() throws DBException {
            String modifiedQuery = modifiedQueryAndPositions.keySet().iterator().next();
            "BEFORE INSERT ON CODE_SYSTEM\n" +
                    assertEquals(
        String[] packageBodyStatements = new String[] {
                } else {
            "CREATE OR REPLACE PACKAGE emp_mgmt AS \n" +
        assertEquals(expected.length, elements.size());
     * Issue 37925
            "    NULL;\n" +
     */
                "$$ LANGUAGE plpgsql",
        );
            "      order_id = p_order_id;\n" +
        var modifiedQueryAndPositions = SQLEditorTestUtil.getCursorPositions(query);
            "    dbms_output.put_line('Start');\n" +
            "      FROM   emp e, dept d\n" +
            """;
            "DECLARE\n" +
            "q'<All the king's horses<';",
    @Test
            for (int pos : positions) {
            "END;",
                "$$\n" +
            null,
                "END emp_mgmt;"
                "    FUNCTION hire (last_name VARCHAR2, job_id VARCHAR2, \n" +
                "DECLARE\n" +
                "    BEGIN\n" +

            String modifiedQuery = entry.getKey();
    @Test
        Mockito.when(dataSource.getSQLDialect()).thenReturn(dialect);
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            "    END IF;\n" +
            assertNotEquals(badQstring.length() - 1, scanner.getTokenLength());
                "END;",
            if (i + 1 < expected.length && expected[i + 1] == null) {
            Mockito.when(dataSource.isServerVersionAtLeast(12, 1)).thenReturn(true);

            "      END;\n" +
        );
            "      order_items\n" +
        int[] positions = modifiedQueryAndPositions.get(modifiedQuery);
                        SET is_deleted = true""", element.getText()
            "  rec1 rec1_t;\n" +

            "q'(That's a really funny 'joke'.)';",
        }
            "BEGIN  \n" +
            "CREATE OR REPLACE FUNCTION fn_TestDelimiter()\n" +
                    context, 0, modifiedQuery.length(), pos, false, false
    /**
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
            context,
            "  BEGIN\n" +
            "LANGUAGE plpgsql; \n\n" +
                "  rec1.field1 := 'Yesterday';\n" +
                "BEGIN\n" +
        int[] positions = modifiedQueryAndPositions.get(modifiedQuery);
            "$$ LANGUAGE plpgsql;",
            "    RETURN p_order_id;\n" +

            "RETURNS BOOLEAN AS\n" +
            select 1 from dual;
        );
    /**
        SQLParserContext context;
        assertParse(
            "WITH\n" +
            "    WHERE\n" +
        if (name.equals(ORACLE_DIALECT_NAME)) {
            "WITH\n" +

            "      p_order_id NUMBER)\n" +
        Mockito.when(dataSourceContainer.getPreferenceStore()).thenReturn(preferenceStore);
            false
import static org.junit.Assert.assertEquals;
            "      ln_net_value\n" +
            "    WHERE\n" +
            SELECT 'test2' FROM dual;
                context, 0, modifiedQuery.length(), pos, false, false
            "  IS\n" +
    }
                "END;\n" +

            SELECT 'test1' FROM dual;
     */
    }
            "END;",
        Mockito.lenient().when(executionContext.getDataSource()).thenReturn(dataSource);
        element = SQLScriptParser.parseQuery(context, 0, modifiedQuery.length(), positions[1], false, false);
            }

            "  avg_cost AS (\n" +
            "        DBMS_OUTPUT.PUT_LINE ('This is: '||i);\n" +
    }
            "    END; \n" +
                "        text := 'hello';\n" +
            "q'#That's a really funny 'joke'.#';",
    /**
            "\n" +
        }
                "        RETURN NUMBER; \n" +
            "q'(That''s a really funny ''joke''.(';",
    @Test
public class SQLScriptParserTest extends DBeaverUnitTest {
                "        RETURN value_char_out;\n" +
                if (pos >= modifiedQuery.length()) {
        Mockito.when(dataSourceContainer.getActualConnectionConfiguration()).thenReturn(connectionConfiguration);
                "        manager_id NUMBER, salary NUMBER, \n" +
            "END;\n" +
            "-- Get net value by customer\n" +
     * Issue 22489
            "q'['Hello,' said the child, who didn't like goodbyes.]';",
import org.jkiss.dbeaver.runtime.DBWorkbench;
                "  DBMS_OUTPUT.PUT_LINE(rec2.name);\n" +
            "  EXCEPTION\n" +

            "    SELECT\n" +
            SQLParserContext context = createParserContext(setDialect(ORACLE_DIALECT_NAME), badQstring);
                "    no_comm EXCEPTION; \n" +
            "  FROM   t1\n" +
                "BEGIN ATOMIC\n" +
            "                         rating NUMBER);\n" +
                "                         rating NUMBER);\n" +
    public void parseCurrentControlCommandsCursorTail() throws DBException {
            "    SELECT dname, SUM(sal) dept_total\n" +
            "    SELECT name INTO v_name\n" +
                "RETURNS BOOLEAN AS\n" +
                "        emp_id     NUMBER(6),\n" +
        ((JDBCSQLDialect) dialect).initDriverSettings(session, dataSource, databaseMetaData);
                "    text := 'hello';\n" +
                "  rec4 rec4_t;\n" +
 * you may not use this file except in compliance with the License.
        String query = """
                "    END;\n" +
            "      p_year        NUMBER)\n" +
            context, 0, modifiedQuery.length(), positions[0], false, false
                            from film_actor""", element.getText()
                "    PROCEDURE greet(text IN VARCHAR2)\n" +
                "                         last_name employees.last_name%TYPE, \n" +
                SELECT *
            scanner.setRange(context.getDocument(), 0, badQstring.length());

            "IS\n" +
            
            "        value_char_out VARCHAR2(10);\n" +
            POSTGRESQL_DIALECT_NAME,
            scanner.setRange(context.getDocument(), 0, qstring.length());
        SQLParserContext context = createParserContext(setDialect(POSTGRESQL_DIALECT_NAME), query);
                "    IS\n" +
        assertEquals("select 10 ", element.getText());
            "    DBMS_OUTPUT.put_line('p_id=' || p_id);\n" +

     * Issue 26416
            "BEGIN\n" +
            "  rec4 rec4_t;\n" +
        String[] withStatements = new String[] {
    }
            "    BEGIN\n" +
        String query = """
                "BEGIN\n" +

    }
/*
        String query = """
        String[] dialects = new String[] {POSTGRESQL_DIALECT_NAME, SQLSERVER_DIALECT_NAME};
                "    RETURN subtotal * 0.06;\n" +
import org.jkiss.dbeaver.model.sql.SQLDialect;
    }
            "        manager_id NUMBER, salary NUMBER, \n" +
    private void assertParse(String dialectName, String query, String[] expected) throws DBException {
                );
                i++;
                "        DBMS_OUTPUT.PUT_LINE ('This is: '||i);\n" +
    }
            select *\s
                        context, 0, modifiedQuery.length(), pos, false, false
            "n NUMBER := 0;\n" +
        };
        Mockito.when(dataSourceContainer.getDriver()).thenReturn(driver);
        int[] positions = modifiedQueryAndPositions.get(modifiedQuery);
        scanner.setRange(context.getDocument(), 14, query.length());
            "  END synchronize_data;\n" +
            "        dbms_output.put_line(text);\n" +
            "AS\n" +
            "  BEGIN\n" +
                "    dbms_output.put_line('End');\n" +
                        """
            """;
        }
        Document document = new Document(query);

        List<SQLScriptElement> elements = SQLScriptParser.extractScriptQueries(
    public void parseOracleWithBlock() throws DBException {
        String source = Arrays.stream(expected)
            Map<String, int[]> modifiedQueryAndPositions = SQLEditorTestUtil.getCursorPositions(queryWithMarkers);
                "$$\n" +
            "      BEGIN\n" +
            "    IS\n" +
            @set col5 = '5'
        if (name.equals(SQLSERVER_DIALECT_NAME)) {
 *
                "    no_sal EXCEPTION; \n" +
            "    IS\n" +
    @Test
            "     GROUP BY dname\n" +

            "    FUNCTION test_f(value_in_v IN number)\n" +
            "AS\n" +
        String expected = """
            "    END raise_salary;\n" +

            "  PROCEDURE synchronize_data(p_run_date IN date) IS\n" +
        SQLScriptElement element = SQLScriptParser.parseQuery(
            @set col4 = '4'
            @set col4 = '4'
    /**
    @Mock
        String query = """
            }
            "  rec1.field2 := 65;\n" +
            "\tRETURN TRUE; \n" +
        SQLDialect dialect = registry.getDialect(name).createInstance();
                "    DECLARE\n" +

            context, 0, modifiedQuery.length(), positions[0], false, false
            "    PROCEDURE remove_emp(employee_id NUMBER) IS BEGIN NULL; END;\n" +
            "END;\n" +
            "  rec2 rec2_t;\n" +
                    );
            "END;\n" +
                );
            "  FUNCTION with_function2(p_id IN NUMBER) RETURN NUMBER IS\n" +
            "  TYPE rec4_t IS RECORD (first_name employees.first_name%TYPE, \n" +
            "CREATE OR REPLACE PROCEDURE my_procedure (\n" +
                }
                "  TYPE rec4_t IS RECORD (first_name employees.first_name%TYPE, \n" +
            mul<-|tiple<-| lines'@@
            "    AND customer_id                 = p_customer_id\n" +
import org.jkiss.dbeaver.model.sql.SQLSyntaxManager;
            """;
