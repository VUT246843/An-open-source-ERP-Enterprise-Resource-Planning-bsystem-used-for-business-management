                .append("\ta = 1;").append(lineBreak).append(lineBreak)
        //when
    }
 *
                "FROM" + lineBreak +
                .append("\ttable2.number").append(lineBreak)
    public void shouldDoDefaultFormatForCreateStatementWhenIndentSubstatementsInParenthesesOn() {
        //when
                .append("JOIN JT1 j1 ON").append(lineBreak)

            "\t'x' AS x, 'y' AS y, 'z' AS z FROM dual;"; //$NON-NLS-1$
        sql = SQLConstants.KEYWORD_SELECT + lineBreak + "\t--comment" + lineBreak + "\t\ta, b FROM a ;";
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        //then
            "\tCustomers" + lineBreak +

    SQLFormatterTokenized formatter = new SQLFormatterTokenized();
        String inputString = "CREATE TABLE Persons (PersonID int, LastName varchar(255), FirstName varchar(255), Address varchar(255), City varchar(255));";
    public void shouldDoDefaultFormatForSubSelectAndForValuesNestedInTheFunctionAndDoNotMakeALineBreakAfterTheCommaForThem() {
        assertEquals(
                "\tAddress varchar(255)," + lineBreak +


                .append("WHERE").append(lineBreak)

                .append("\t\ttable3").append(lineBreak)
                .append("\ta > 100").append(lineBreak)
        //when
        String format = format(inputString);
            "\t\tWHEN weight > 90 THEN 'over 90'" + lineBreak +
        String inputString = "-- test" + lineBreak + "SELECT * FROM mytable;";
        //then
    private String format(String sql) {
        assertEquals(
import org.mockito.Mock;
        Mockito.when(configuration.isFunction("SUBSTRING_INDEX")).thenReturn(true);
                "\tlname = 'Ivanov'" + lineBreak +

            "\tAlbum a" + lineBreak +


                .append("\t\t\tthetable").append(lineBreak)
        String formattedString = format(inputString);
                "\t\tOR (1 = 1" + lineBreak +
    }
    @Mock
                "\t\tOR fname = 'Alex'" + lineBreak +
    @Test
                "\tpay.check_id," + lineBreak +
            "SQLFormatterTokenized does not properly format query with a comment right before [NAME] without indent before the name",
    @Test
        Mockito.lenient().when(preferenceStore.getBoolean(Mockito.eq(ModelPreferences.SQL_FORMAT_LF_BEFORE_COMMA))).thenReturn(false);
                "\tEND AS IMAGENAME" + lineBreak +
    public void shouldCorrectlyHandleBackslashEscapedQuotesInStringLiterals() {
                .append("\tTABLE1").append(lineBreak)
            SQLConstants.KEYWORD_FROM + lineBreak + //$NON-NLS-1$

        String inputString = "SELECT" + lineBreak + "\t*" + lineBreak + "FROM" + lineBreak + "\ttable1;" + lineBreak +" -- SELECT * FROM mytable;";
                .append("SET").append(lineBreak)
        Mockito.lenient().when(configuration.isFunction("AVG")).thenReturn(true);
        String inputString = "SELECT * FROM TABLE1 t WHERE a > 100 AND b BETWEEN 12 AND 45;  SELECT t.*, j1.x, j2.y FROM TABLE1 t JOIN JT1 j1 ON j1.a = t.a LEFT OUTER JOIN JT2 j2 ON j2.a = t.a AND j2.b = j1.b WHERE t.xxx IS NOT NULL;  DELETE FROM TABLE1 WHERE a = 1;  UPDATE TABLE1 SET a = 2 WHERE a = 1;  SELECT table1.id, table2.number, SUM(table1.amount) FROM table1 INNER JOIN table2 ON table1.id = table2.table1_id WHERE table1.id IN ( SELECT table1_id FROM table3 WHERE table3.name = 'Foo Bar' AND table3.type = 'unknown_type') GROUP BY table1.id, table2.number ORDER BY table1.id;\n";
        String formattedString = format(inputString);
        );

                "SELECT" + lineBreak +

        //then

        //when
                .append("\ttable1.id = table2.table1_id").append(lineBreak)
            SQLConstants.KEYWORD_FROM + lineBreak +
                .append("\tj2.a = t.a").append(lineBreak)
            "SQLFormatterTokenized does not properly format query with multiple SELECT* (no space between keyword and asterisk)",
        assertEquals(expectedString, formattedString);
        Mockito.when(preferenceStore.getBoolean(Mockito.eq(ModelPreferences.SQL_FORMAT_BREAK_BEFORE_CLOSE_BRACKET))).thenReturn(false);
        String expectedString = "SELECT" + lineBreak + "\t*" + lineBreak + "FROM" + lineBreak + "\tmytable;";
                "\tto_date(CONCAT(YEAR('2019-12-31'), '-', lpad(CEIL(MONTH('2019-12-31')/ 3)* 3-2, 2, 0), '-01')) AS season_first_day";
        String formattedString = format(inputString);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            SQLConstants.KEYWORD_FROM + lineBreak +
            SQLConstants.KEYWORD_FROM + lineBreak + //$NON-NLS-1$
    public void shouldDoDefaultFormatForNestedCaseEndConditionWithWordBeforeCase() {

        Mockito.when(syntaxManager.getStructSeparator()).thenReturn('.');
            expected,
    }
        //given

import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;

        String inputString = "SELECT player_name, weight, CASE WHEN weight > 90 THEN 'over 90' WHEN weight > 70 THEN '71-90' ELSE '70 or under' END AS weight_group FROM football_players";

                ");";
        String formattedString = format(inputString);
    public void shouldDoDefaultFormatWhenThereAreCommentsInsideQuery() {
        //given
import org.jkiss.dbeaver.model.sql.format.SQLFormatterConfiguration;
        assertEquals(expectedString, formattedString);
            SQLConstants.KEYWORD_SELECT + lineBreak +
            "\t\tWHEN 5000 THEN 'High'" + lineBreak +
            SQLConstants.KEYWORD_FROM + lineBreak +

        //then
        //then
 * limitations under the License.
    }
        String formattedString = format(inputString);
import org.junit.Test;
                .append("\tTABLE1 t").append(lineBreak)
    @Test
                "LEFT JOIN oracle.ap_checks_all pay ON" + lineBreak +
    public void shouldDoDefaultFormatForCreateStatementWhenIndentSubstatementsInParenthesesOff() {
        String expString = SQLConstants.KEYWORD_SELECT + lineBreak +
    public void shouldReturnEmptyStringWhenThereIsOnlyOneSpace() {
 */
            "\tcustomers";
    private SQLDialect dialect = BasicSQLDialect.INSTANCE;
                .append("WHERE").append(lineBreak)
    }

            format(sql)
import org.jkiss.junit.DBeaverUnitTest;
 * See the License for the specific language governing permissions and
        Mockito.when(configuration.isFunction("REPLACE")).thenReturn(true);
        String formattedString = format(inputString);
    }
            SQLConstants.KEYWORD_SELECT + lineBreak +
                "\tCOALESCE(pay.base_amount, pay.amount) amount_ars," + lineBreak +
    private DBPPreferenceStore preferenceStore;
        String inputString = "SELECT CustomerName, City, Country FROM Customers ORDER BY (CASE WHEN City IS NULL THEN Country ELSE City END)";
        assertEquals(
            "\t(CASE" + lineBreak +
        //given

    private String getExpectedString() {
                "\tLastName varchar(255)," + lineBreak +
    @Test
        Mockito.when(preferenceStore.getBoolean(Mockito.eq(ModelPreferences.SQL_FORMAT_BREAK_BEFORE_CLOSE_BRACKET))).thenReturn(true);
            "\t1 = 1;"; //$NON-NLS-1$
                .append("FROM").append(lineBreak)
            "\tcust_last_name," + lineBreak +
    }
 *
        String expectedString = "CREATE TABLE Persons (PersonID int," + lineBreak + "LastName varchar(255)," + lineBreak + "FirstName varchar(255)," + lineBreak + "Address varchar(255)," + lineBreak + "City varchar(255));";
    }
    public void shouldMakeUpperCaseForKeywords() {
                .append("\t*").append(lineBreak)
    @Test
        assertEquals(inputString, formattedString);
                "\t" + SQLConstants.KEYWORD_CASE + lineBreak +
                .append("\tj1.x,").append(lineBreak)

            "\t\tWHEN weight > 70 THEN '71-90'" + lineBreak +

                "\t(" + lineBreak +

                .append("FROM").append(lineBreak)
        Mockito.when(syntaxManager.getDialect()).thenReturn(dialect);
        String inputString = "SELECT AVG(CASE WHEN e.salary > 2000 THEN e.salary ELSE 2000 END) Average_Salary FROM employees e";
                .append("DELETE").append(lineBreak)
            "\t\tELSE 'Medium'" + lineBreak +
        //then

            "SQLFormatterTokenized does not properly format query with a comment right before [NAME] with 2 indents before the name",
        Mockito.when(configuration.isFunction("AVG")).thenReturn(true);

                "\tpay.cleared_date," + lineBreak +
            format(sql)
                .append("\tj1.a = t.a").append(lineBreak)

        expected = SQLConstants.KEYWORD_SELECT + lineBreak + //$NON-NLS-1$
                "\tstatus int(10) unsigned NOT NULL" + lineBreak +
        String inputString = "SELECT my_field FROM my_table";
        String expectedString = getExpectedString();
            "\tEND)";
        String formattedString = format(inputString);
            "UNION ALL" + lineBreak + //$NON-NLS-1$
                .append("\ttable1.id,").append(lineBreak)
            "\t\tcredit_limit WHEN 100 THEN 'Low'" + lineBreak +
    public void shouldDoDefaultFormatForNestedCaseEndConditionWithFunctionsKeywords() {


        StringBuilder sb = new StringBuilder();
            "\t*" + lineBreak + //$NON-NLS-1$
        String inputString = " ";
        expected = SQLConstants.KEYWORD_SELECT + lineBreak +
    }
        String[] delimiters = new String[]{";"};
        Mockito.when(configuration.isFunction("generate_series")).thenReturn(true);
                .append("\t\ttable1_id").append(lineBreak)
        String expectedString = getExpectedStringWithLineBreakBeforeBraces();
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public void shouldRemoveSpacesBeforeCommentSymbol() {
        String formattedString = format(inputString);
        assertEquals("SQLFormatterTokenized does not properly format query with a comment between FROM and WHERE", expected, format(sql));
            "\tCASE" + lineBreak +
    }
            "\t--comment" + lineBreak + //$NON-NLS-1$
import static org.junit.Assert.assertEquals;
        String expectedString = "CREATE TABLE Persons (" + lineBreak +
    public void shouldDoDefaultFormatForAlterStatementWhenIndentSubstatementsInParenthesesOn() {
                "\tpay.check_date issued_date" + lineBreak +
                .append("\tAND j2.b = j1.b").append(lineBreak)
                "\t*" + lineBreak +
package org.jkiss.dbeaver.model.sql.format.tokenized;
                .append("WHERE").append(lineBreak)
        String expected = SQLConstants.KEYWORD_SELECT + lineBreak +
        assertEquals(expectedString, formattedString);
                .append("\t(").append(lineBreak)

        String formattedString = format(inputString);
                "\tAND cal.date <= (pay.future_pay_due_date::date + 30));";
            "\t*" + lineBreak + //$NON-NLS-1$
        //given
        String formattedString = format(inputString);


    @Test
import org.jkiss.dbeaver.model.sql.SQLConstants;

        assertEquals(expectedString, formattedString);
        String formattedString = format(inputString);
        //when

    }
        String expected = SQLConstants.KEYWORD_SELECT + lineBreak + //$NON-NLS-1$
        return sb.toString();
        //then
        //when
    @Test
 *     http://www.apache.org/licenses/LICENSE-2.0
        StringBuilder sb = new StringBuilder();
 * Licensed under the Apache License, Version 2.0 (the "License");
            "\t'y' AS y," + lineBreak + //$NON-NLS-1$
            expected,
    private SQLSyntaxManager syntaxManager;
            "\t--comment" + lineBreak +




            SQLConstants.KEYWORD_FROM + lineBreak +
        //given
        String sql = "SELECT* FROM Album a;"; //$NON-NLS-1$
        //then
                .append("\ttable1").append(lineBreak)

        String inputString = "SELECT to_date(CONCAT(YEAR('2019-12-31'),'-',lpad(CEIL(MONTH('2019-12-31')/3)*3-2, 2, 0),'-01')) AS season_first_day"; //#7509
        assertEquals(expString, formattedString);
        String expectedString = "ALTER TABLE `users` ADD COLUMN (" + lineBreak +
        sql = "SELECT* FROM Album a UNION ALL SELECT* FROM Album a;"; //$NON-NLS-1$
    @Test
                .append("\t)").append(lineBreak)
        assertEquals(expString, formattedString);
        //when


                .append("\ttable1.id;").append(lineBreak);
                "\tpay.future_pay_due_date due_date," + lineBreak +
        Mockito.lenient().when(preferenceStore.getBoolean(Mockito.eq(ModelPreferences.SQL_FORMAT_BREAK_BEFORE_CLOSE_BRACKET))).thenReturn(true);
        //then
        //when


        assertEquals(expString, formattedString);

        String expectedString = "";
            "\tdual" + lineBreak + //$NON-NLS-1$
        //then
        String inputString = "SELECT CASE REPLACE(SUBSTRING_INDEX(NAME, ']', 1), '[', '') WHEN 'IP' THEN '1' ELSE '3' END AS IMAGENAME FROM IMAGES";
        String expectedString = "SELECT" + lineBreak +
            "\ta," + lineBreak +
        String inputString = "CREATE VIEW bi_gaz_check_curve AS (SELECT cal.date, pay.check_id, COALESCE(pay.base_amount, pay.amount) amount_ars, pay.future_pay_due_date due_date, pay.cleared_date, pay.check_date issued_date FROM (SELECT generate_series('2010-01-01'::date, '2050-12-31'::date, INTERVAL '1 day') date, 1 payment_id) cal LEFT JOIN oracle.ap_checks_all pay ON cal.date >= pay.check_date AND cal.date <= (pay.future_pay_due_date::date + 30));"; //#9365
    @Test
    @Test

        Mockito.when(configuration.getSyntaxManager()).thenReturn(syntaxManager);
            "\t\tWHEN City IS NULL THEN Country" + lineBreak +
 * DBeaver - Universal Database Manager
        //when
            "\tAlbum a;";
        return formatter.format(sql, configuration);
        Mockito.when(preferenceStore.getBoolean(Mockito.eq(ModelPreferences.SQL_FORMAT_LF_BEFORE_COMMA))).thenReturn(false);
            "\tfootball_players";
                .append("\t\tFROM").append(lineBreak)
            "SQLFormatterTokenized does not properly format query with SELECT* (no space between keyword and asterisk)",
        assertEquals(expectedString, formattedString);
    public void shouldDoDefaultFormatWhenThereIsNoSpaceBetweenSelectKeywordAndAsterisk() {
                .append("GROUP BY").append(lineBreak)
        String formattedString = format(inputString);
            "\tb" + lineBreak +
        String expectedString =
        assertEquals(expectedString, formattedString);
    }
        expected = SQLConstants.KEYWORD_SELECT + lineBreak +
    @Test
            "WHERE 1 = 1;"; //$NON-NLS-1$
        Mockito.when(configuration.getIndentString()).thenReturn("\t");
import org.junit.Before;
        String expString = SQLConstants.KEYWORD_SELECT + lineBreak +
    @Before
/*


    public void shouldDoDefaultFormatForNestedCaseEndCondition() {

                .append("\ta = 2").append(lineBreak)
                .append("FROM").append(lineBreak)

    @Test
public class SQLFormatterTokenizedTest extends DBeaverUnitTest {
            "\t'z' AS z" + lineBreak + //$NON-NLS-1$
        sb.append("SELECT").append(lineBreak)
        assertEquals(expString, formattedString);
    public void shouldDoDefaultFormat() {
            "\tweight," + lineBreak +
        assertEquals(expectedString, formattedString);
                "\tPersonID int," + lineBreak +
                .append("\tSELECT").append(lineBreak)
        String expectedString = "SELECT"+lineBreak + "\tmy_field" + lineBreak + "FROM" + lineBreak + "\tmy_table";

        //then
        return sb.toString();

                "\tCity varchar(255)" + lineBreak +
    private SQLFormatterConfiguration configuration;
    @Test



        Mockito.when(configuration.isFunction("COALESCE")).thenReturn(true);
                .append("\t\ttable3.name = 'Foo Bar'").append(lineBreak)
            "\tdual;"; //$NON-NLS-1$
                "FROM" + lineBreak +



import org.jkiss.dbeaver.ModelPreferences;
                "\t\tREPLACE(SUBSTRING_INDEX(NAME, ']', 1), '[', '') WHEN 'IP' THEN '1'" + lineBreak +
            SQLConstants.KEYWORD_FROM + lineBreak +
        String expectedString = "CREATE VIEW bi_gaz_check_curve AS (" + lineBreak +

            "\t'x' AS x," + lineBreak + //$NON-NLS-1$
                .append("FROM").append(lineBreak)

        assertEquals(expectedString, formattedString);
        );
    @Test
        Mockito.when(syntaxManager.getEscapeChar()).thenReturn('\\');
        //then
        //then
                .append("\t\t\tthecol").append(lineBreak)
        //given
    }
                "\tcal.date," + lineBreak +
    }
            "\t'x' AS X" + lineBreak + //$NON-NLS-1$

        //given
 * You may obtain a copy of the License at
        //when

        //when

                .append("SELECT").append(lineBreak)

        String expectedString = "SELECT" + lineBreak +
        //given
        String formattedString = format(inputString);

                .append("LEFT OUTER JOIN JT2 j2 ON").append(lineBreak)
        //when
                .append("\t\tSELECT").append(lineBreak)
                .append("\ta = 1;").append(lineBreak).append(lineBreak)
            expected,
        //when
                "\t\tOR fname = 'Ted'" + lineBreak +

                ") AFTER `lastname`;";
        String inputString = "select * from mytable;";
        //given
                .append("\tAND b BETWEEN 12 AND 45;").append(lineBreak).append(lineBreak)
                .append("\tWHERE").append(lineBreak)
                .append("WHERE").append(lineBreak)

        //given

    public void shouldDoDefaultFormatForStatementWidthManyConditionsAndAddIndentForFirstConditionInExpressionInsideBrackets() {
        String formattedString = format(inputString);
                SQLConstants.KEYWORD_FROM + lineBreak +

        assertEquals(
        Mockito.when(configuration.isFunction("to_date")).thenReturn(true);
        //given

    }
    public void shouldAddIndentForName() {
    }
        //when
        //when
                .append("\t\tAND table3.type = 'unknown_type')").append(lineBreak)
    public void shouldDoDefaultFormatForNestedIntoFunctionCaseEndCondition() {
        String inputString = "'D d\\'D D'";

        sql = "SELECT 'x' AS X FROM dual" + lineBreak + //$NON-NLS-1$
                .append("FROM").append(lineBreak).append("\tdual");
                "\t\tELSE '3'" + lineBreak +
        //when
        Mockito.when(syntaxManager.getStatementDelimiters()).thenReturn(delimiters);

        //given
        );
                .append("\tSUM(table1.amount)").append(lineBreak)
        String inputString = "CREATE TABLE Persons (PersonID int, LastName varchar(255), FirstName varchar(255), Address varchar(255), City varchar(255));";

 *

        String expString = SQLConstants.KEYWORD_SELECT + lineBreak +
            "\tCustomerName," + lineBreak +
import org.jkiss.dbeaver.model.sql.SQLDialect;
                .append("\ttable1.id,").append(lineBreak)
            "\tCity," + lineBreak +

    @Mock
        String formattedString = format(inputString);
    @Test

    @Test
        //given
import org.jkiss.dbeaver.model.impl.sql.BasicSQLDialect;
        String expectedString = "SELECT" + lineBreak + "\t*" + lineBreak + "FROM" + lineBreak + "\ttable1;" + lineBreak + "-- SELECT * FROM mytable;";
                .append("\ttable1.id IN (").append(lineBreak)
                .append("UPDATE").append(lineBreak)
            "\tCASE" + lineBreak +
                .append("\tFROM").append(lineBreak)
    public void shouldAddLineBreakBeforeBraceBySpecialSetting() {
            "\tplayer_name," + lineBreak +
                "\tcal.date >= pay.check_date" + lineBreak +
    }
    public void shouldDoDefaultFormatForSimpleSelectAndCaseEndConditionInOrderBlock() {

        //given
    @Test

        //given

        //then
    public void shouldAddLineBreakAfterCommentInTheScript() {
        //when
            "\tAVG(CASE WHEN e.salary > 2000 THEN e.salary ELSE 2000 END) Average_Salary" + lineBreak +
            "\t--comment" + lineBreak + //$NON-NLS-1$
    }
}
            "\tAlbum a;"; //$NON-NLS-1$
        //when
            SQLConstants.KEYWORD_FROM + lineBreak +
        String expString = SQLConstants.KEYWORD_SELECT + lineBreak +
    }
    }

                "\tcount_copy SMALLINT(6) NOT NULL," + lineBreak +
    @Test
                .append("SELECT").append(lineBreak)
        //given
        String inputString = "SELECT (SELECT thecol FROM thetable) FROM dual";
    public void init() throws Exception {
        //given
    }

        String sql = SQLConstants.KEYWORD_SELECT + lineBreak + //$NON-NLS-1$
            "\t\tELSE City" + lineBreak +
        String formattedString = format(inputString);
        Mockito.when(syntaxManager.getCatalogSeparator()).thenReturn(".");
        String inputString = "SELECT cust_last_name, CASE credit_limit WHEN 100 THEN 'Low' WHEN 5000 THEN 'High' ELSE 'Medium' END FROM customers";
            format(sql)
        //then
            "\temployees e";

 * you may not use this file except in compliance with the License.
                .append("\tTABLE1").append(lineBreak)
        //then
            "\t\tELSE '70 or under'" + lineBreak +
        );
    }

        String formattedString = format(inputString);

        String formattedString = format(inputString);

    private final String lineBreak = System.lineSeparator();
        assertEquals(expectedString, formattedString);
                "\t\t\tAND 2 = 2));";
        //given

                "WHERE" + lineBreak +
        Mockito.doReturn(preferenceStore).when(configuration).getPreferenceStore();
                "\tSELECT" + lineBreak +
    private String getExpectedStringWithLineBreakBeforeBraces() {
                "\tFirstName varchar(255)," + lineBreak +

                .append("\tj2.y").append(lineBreak)
            SQLConstants.KEYWORD_FROM + lineBreak +
            "\ta ;";

        //then
                .append("\tt.*,").append(lineBreak)
                "\t\t1 payment_id) cal" + lineBreak +
            format(sql)
            "\tEND AS weight_group" + lineBreak +
        assertEquals("SQLFormatterTokenized does not properly format query with a comment between SELECT and FROM", expected, format(sql));
        assertEquals(expectedString, formattedString);
                .append("ORDER BY").append(lineBreak)
                .append("\ttable2.number,").append(lineBreak)
        String inputString = "SELECT * FROM table_name WHERE lname = 'Ivanov' AND (fname = 'Ivan' OR fname = 'Alex' OR fname = 'Ted' OR (1 = 1 AND 2 = 2));"; //#11063
                "\tIMAGES";
        assertEquals(expectedString, format);
        assertEquals(expectedString, formattedString);
import org.jkiss.dbeaver.model.DBPIdentifierCase;
                .append("\tTABLE1 t").append(lineBreak)
        Mockito.when(configuration.isFunction("lpad")).thenReturn(true);
            "\tEND" + lineBreak +

 * Unless required by applicable law or agreed to in writing, software
        assertEquals(expectedString, formattedString);
    }
        sb.append("SELECT").append(lineBreak)
            SQLConstants.KEYWORD_WHERE + lineBreak + //$NON-NLS-1$
            "\t*" + lineBreak + //$NON-NLS-1$
        Mockito.lenient().when(preferenceStore.getBoolean(Mockito.eq(ModelPreferences.SQL_FORMAT_LF_BEFORE_COMMA))).thenReturn(false);
                .append("\tt.xxx IS NOT NULL;").append(lineBreak).append(lineBreak)
        //when
    @Test

    @Test
                "\t\tgenerate_series('2010-01-01'::date, '2050-12-31'::date, INTERVAL '1 day') date," + lineBreak +
    public void shouldDoDefaultFormatForValuesNestedInTheFunctionAndDoNotMakeALineBreakAfterTheCommaForThem() {
import org.mockito.Mockito;
        assertEquals(expectedString, formattedString);
                "\ttable_name" + lineBreak +
            expected,
    }
        //given
            "\t--comment" + lineBreak + //$NON-NLS-1$


import org.jkiss.dbeaver.model.sql.SQLSyntaxManager;

                "\tAND (fname = 'Ivan'" + lineBreak +
                .append("WHERE").append(lineBreak)

            "\tCountry" + lineBreak +
            "--comment" + lineBreak + //$NON-NLS-1$
                .append("INNER JOIN table2 ON").append(lineBreak)
            "ORDER BY" + lineBreak +
    @Test

        //then
        Mockito.when(configuration.getKeywordCase()).thenReturn(DBPIdentifierCase.UPPER);
    @Mock
        sql = SQLConstants.KEYWORD_SELECT + lineBreak + "\t--comment" + lineBreak + "a, b FROM a ;";
        //then
        Mockito.when(preferenceStore.getBoolean(Mockito.eq(ModelPreferences.SQL_FORMAT_BREAK_BEFORE_CLOSE_BRACKET))).thenReturn(true);
        String inputString = "ALTER TABLE `users` ADD COLUMN (count_copy smallint(6) NOT NULL, status int(10) unsigned NOT NULL) AFTER `lastname`;";
        String expectedString = "-- test" + lineBreak + "SELECT" + lineBreak + "\t*" + lineBreak + "FROM" + lineBreak + "\tmytable;";
        Mockito.lenient().when(preferenceStore.getBoolean(Mockito.eq(ModelPreferences.SQL_FORMAT_BREAK_BEFORE_CLOSE_BRACKET))).thenReturn(true);
            SQLConstants.KEYWORD_FROM + lineBreak +
