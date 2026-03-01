    }
    @Test
        );
 * Copyright (C) 2010-2025 DBeaver Corp and others
        SQLUtils.addMultiStatementDDL(ORACLE_SQL_DIALECT, sb, ddl);
import org.jkiss.junit.DBeaverUnitTest;
    public void extractProcedureParameterTypes_whenWhitespaceAndCase_thenCanonicalUpper() {
import org.junit.Assert;
    @Test
    public void addMultiStatementDDL_whenHasEmptyLines_thenSkipThem() {

 * you may not use this file except in compliance with the License.

                "GRANT \"ROLE1\" TO \"TEST_USER_DECL\";\n" +
        Assert.assertEquals(source, SQLUtils.makeGlobFromSqlLikePattern(source));
    public void extractProcedureParameterTypes_whenNoOuterParens_thenSingleType() {
        SQLUtils.addMultiStatementDDL(ORACLE_SQL_DIALECT, sb, null);
            "GRANT \"ROLE2\" TO \"TEST_USER_DECL\"\n" +
    public void extractProcedureParameterTypes_whenNamesPresent_thenRemoved() {

            sb.toString()
 * Unless required by applicable law or agreed to in writing, software
                + "-- AND ResourceId  = 1\n\r"
    @Test
        Assert.assertEquals("()", SQLUtils.extractProcedureParameterTypes("(   )"));
        Assert.assertEquals(
    public void extractTypesOnly_whenNestedProcedureParameterTypes_thenKeepInnerParens() {
            sb.toString()
        Assert.assertEquals(
            "SELECT LastName -- x\r\n"
            "(ARRAY, OBJECT)",

        StringBuilder sb = new StringBuilder();
            SQLUtils.extractProcedureParameterTypes("(  a   number  ,   b   varchar  )")
        StringBuilder sb = new StringBuilder();
 * See the License for the specific language governing permissions and
            "CREATE TABLE A(id INT);\n" +

import org.jkiss.dbeaver.ext.oracle.model.OracleSQLDialect;
        Assert.assertEquals("()", SQLUtils.extractProcedureParameterTypes(""));
public class SQLUtilsTest extends DBeaverUnitTest {

    }
    private static final OracleSQLDialect ORACLE_SQL_DIALECT = new OracleSQLDialect();
        StringBuilder sb = new StringBuilder();
    }
        );
            SQLUtils.extractProcedureParameterTypes("(price DECIMAL(10,2), tags ARRAY(VARCHAR))")
    }
                "GRANT \"ROLE3\" TO \"TEST_USER_DECL\";\n\n",
            "GRANT \"ROLE3\" TO \"TEST_USER_DECL\";\n";
    @Test
            "(NUMBER(38,0), VARCHAR)",
        Assert.assertEquals("()", SQLUtils.extractProcedureParameterTypes("   "));
        Assert.assertEquals("ABC$", SQLUtils.makeRegexFromLike("%ABC"));

        Assert.assertEquals(
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
    public void addMultiStatementDDL_whenAlreadyDelimited_thenDoNotDuplicateDelimiter() {
        Assert.assertEquals("ABC", SQLUtils.makeRegexFromLike("%ABC%"));
                + "FROM Persons drai where PersonID  = 1\r\n"
        );
        String ddl = "CREATE TABLE A(id INT)\nCREATE INDEX I ON A(id)";
            "(DECIMAL(10,2), ARRAY(VARCHAR))",
    @Test
    public void addMultiStatementDDL_whenNullOrEmpty_thenNoChange() {

        String ddl = "\n\n  \nCREATE TABLE A(id INT)\n   \nCREATE INDEX I ON A(id)  \n\n";
    public void makeRegexFromLikeTest() {
    }
    }
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 *     http://www.apache.org/licenses/LICENSE-2.0
    public void addMultiStatementDDL_whenNoDelimiters_thenAppendDelimiterPerLineAndTrailingLF() {
            SQLUtils.extractProcedureParameterTypes("arr ARRAY(VARCHAR)")
        SQLUtils.addMultiStatementDDL(ORACLE_SQL_DIALECT, sb, ddl);
            SQLUtils.extractProcedureParameterTypes("id NUMBER")
        Assert.assertEquals(
                + "ORDER BY PersonID ;",

        Assert.assertEquals(

import org.jkiss.dbeaver.model.sql.SQLUtils;
        Assert.assertEquals("A.C", SQLUtils.makeRegexFromLike("%A_C%"));

        );
 * You may obtain a copy of the License at
        String source = "key1234";
 * DBeaver - Universal Database Manager
    @Test
    @Test
                "CREATE INDEX I ON A(id);\n\n",

            "CREATE TABLE A(id INT);\n" +
    @Test
            "(ARRAY, OBJECT, VARIANT)",
                "CREATE INDEX I ON A(id);\n\n",
            SQLUtils.extractProcedureParameterTypes("(a DECIMAL(38,0), b ARRAY(DECIMAL(10,2)), c OBJECT)")
 */
        Assert.assertEquals("", sb.toString());
        SQLUtils.addMultiStatementDDL(ORACLE_SQL_DIALECT, sb, ddl);
    }
    @Test
    }
            "(ARRAY(OBJECT), VARIANT)",
            SQLUtils.extractProcedureParameterTypes("( arr  array , obj   object , v   variant )")
        Assert.assertEquals("^A.C$", SQLUtils.makeRegexFromLike("A_C"));
    }
    @Test
 *
    public void fixLineFeedsTest() {
        );

        Assert.assertEquals(

        Assert.assertEquals(
    }
        String ddl =
        Assert.assertEquals(
        );
    public void makeGlobFromSqlLikePattern_whenWithSpecialSymbols_thenSuccess() {
        StringBuilder sb = new StringBuilder();
import org.junit.Test;
    }
    public void extractProcedureParameterTypes_whenComplexSignature_thenCorrectSplit() {
        );
            SQLUtils.extractProcedureParameterTypes("(a NUMBER(38,0), b VARCHAR)")
        );
    @Test
        );
        );

                + "-- AND ResourceId  = 1\n\r"
            "CREATE TABLE A(id INT);\n" +
            "(ARRAY(VARCHAR))",
            SQLUtils.fixLineFeeds("SELECT LastName -- x\r"
        Assert.assertEquals(
            SQLUtils.extractProcedureParameterTypes("(x ARRAY, y OBJECT)")
        Assert.assertEquals(
    public void addMultiStatementDDL_oracleUserAndGrants_examples() {
        );
                "GRANT CREATE SESSION TO \"TEST_USER_DECL\";\n" +
        Assert.assertEquals("^ABC", SQLUtils.makeRegexFromLike("ABC%"));
    @Test
    }
        Assert.assertEquals("()", SQLUtils.extractProcedureParameterTypes("()"));
            "GRANT CREATE TABLE TO \"TEST_USER_DECL\";\n" +
                "CREATE INDEX I ON A(id);\n\n",
    }
            "GRANT CREATE SESSION TO \"TEST_USER_DECL\"\n" +
        );
        Assert.assertEquals("^ABC$", SQLUtils.makeRegexFromLike("ABC"));
        Assert.assertEquals("^A.*C$", SQLUtils.makeRegexFromLike("A%C"));
        Assert.assertEquals(
        Assert.assertEquals("", sb.toString());
            sb.toString()
 *
        Assert.assertEquals("key?*\\?*\\", SQLUtils.makeGlobFromSqlLikePattern("key_%?*\\"));
    public void extractProcedureParameterTypes_whenNullOrEmpty_thenParens() {
                + "ORDER BY PersonID ;")
            "GRANT \"ROLE1\" TO \"TEST_USER_DECL\"\n" +


            "GRANT CREATE TABLE TO \"TEST_USER_DECL\"\n" +
        String ddl = "CREATE TABLE A(id INT);\nCREATE INDEX I ON A(id);";

            "(DECIMAL(38,0), ARRAY(DECIMAL(10,2)), OBJECT)",
            SQLUtils.extractProcedureParameterTypes("(p ARRAY(OBJECT), v VARIANT)")
        );
    public void makeGlobFromSqlLikePattern_whenWithNoSpecialSymbols_thenSuccess() {
                "GRANT \"ROLE2\" TO \"TEST_USER_DECL\";\n" +
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Test
        );
    @Test
            "(NUMBER)",
    }
package org.jkiss.dbeaver.model;
        Assert.assertEquals(

            "(NUMBER, VARCHAR)",
            sb.toString()

        SQLUtils.addMultiStatementDDL(ORACLE_SQL_DIALECT, sb, "   ");
}
        SQLUtils.addMultiStatementDDL(ORACLE_SQL_DIALECT, sb, ddl);
 * limitations under the License.
/*
        Assert.assertEquals(
        Assert.assertEquals(
                + "FROM Persons drai where PersonID  = 1\r\n"
        Assert.assertEquals("()", SQLUtils.extractProcedureParameterTypes(null));
        StringBuilder sb = new StringBuilder();
    @Test
