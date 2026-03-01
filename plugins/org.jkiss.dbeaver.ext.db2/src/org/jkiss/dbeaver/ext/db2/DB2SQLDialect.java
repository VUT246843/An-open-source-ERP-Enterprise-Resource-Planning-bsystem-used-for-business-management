 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                new SQLMultiWordRule(new String[]{"ROW", "BEGIN"}, keywordToken),

 */
    @Override
import java.util.EnumSet;
    public String getScriptDelimiterRedefiner() {

        addSQLKeywords(Arrays.asList(DB2Constants.ADVANCED_KEYWORDS));
import org.jkiss.dbeaver.model.impl.jdbc.JDBCSQLDialect;

        addFunctions(Arrays.asList(DB2Constants.ROUTINES));
    }
            return "SELECT * FROM TABLE (" + proc.getFullyQualifiedName(DBPEvaluationContext.DML);

    public void initDriverSettings(JDBCSession session, JDBCDataSource dataSource, JDBCDatabaseMetaData metaData) {
        }
    }
    private static final String[][] BEGIN_END_BLOCK = new String[][]{
        return super.getProcedureCallEndClause(procedure);
                        String routineName = dbResult.getString(1);
    public String getDualTableName() {
            if (procedure instanceof DB2Routine && ((DB2Routine) procedure).getFunctionType() == DB2Routine.FunctionType.T) {

    @Override
    public boolean supportsAliasInConditions() {
 * 
    @NotNull
        if (proc.getProcedureType() == DBSProcedureType.FUNCTION && proc instanceof DB2Routine && ((DB2Routine) proc).getFunctionType() == DB2Routine.FunctionType.T) {
}

    }
    public DBDBinaryFormatter getNativeBinaryFormatter() {
import org.jkiss.dbeaver.model.data.DBDBinaryFormatter;
 * you may not use this file except in compliance with the License.
    @Override

    }
import org.jkiss.dbeaver.model.sql.parser.rules.SQLMultiWordRule;
    @Nullable
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
import org.jkiss.utils.CommonUtils;
    @Override
                        if (CommonUtils.isEmpty(routineName) || !Character.isLetter(routineName.charAt(0))) {
 *

    }

        return EXEC_KEYWORDS;
            return new TPRule[] {
        }
    }
    }
                }
                    }
import java.sql.SQLException;
    public static final String[] EXEC_KEYWORDS = new String[]{"CALL"};
    @Override
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    @Override
    protected String getProcedureCallEndClause(DBSProcedure procedure) {
        new GlobalVariableInfo("CLIENT_IPADDR", DB2Messages.global_variable_client_ipaddr_description, DBPDataKind.STRING)
 * You may obtain a copy of the License at
            try (JDBCStatement stmt = session.createStatement()) {
        }

    @Override
    @Override

        return "SYSIBM.SYSDUMMY1";
        return new TPRule[0];
        );

import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
        super("Db2 for LUW", "db2_luw");
import java.util.Arrays;
import org.jkiss.dbeaver.Log;
        super.initDriverSettings(session, dataSource, metaData);
/**
    @NotNull
                    while (dbResult.next()) {
    }

import org.jkiss.dbeaver.model.text.parser.TPTokenDefault;
    }
    public boolean supportsAliasInSelect() {
    @NotNull
        return super.getStoredProcedureCallInitialClause(proc);
    }
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedure;
    @NotNull
 */


            }
 * DB2 SQL dialect
        return GLOBAL_VARIABLES;
                // Start is in getStoredProcedureCallInitialClause
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        return false;
    };
    }

 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
    public String[] getExecuteKeywords() {
    public EnumSet<ProjectionAliasVisibilityScope> getProjectionAliasVisibilityScope() {

import org.jkiss.dbeaver.model.text.parser.TPRuleProvider;
                log.debug("Error loading DB2 functions", e);
                            continue;
import org.jkiss.dbeaver.model.text.parser.TPRule;
import org.jkiss.dbeaver.DBException;
    public String[][] getBlockBoundStrings() {
        return BEGIN_END_BLOCK;
    @Override
    public MultiValueInsertMode getDefaultMultiValueInsertMode() {
    @Override
 * Unless required by applicable law or agreed to in writing, software
    public DB2SQLDialect() {
        }
import org.jkiss.dbeaver.model.sql.SQLConstants;
    @Override
    }
            // This part necessary for scalar functions
    protected void loadFunctions(JDBCSession session, JDBCDatabaseMetaData metaData, Set<String> allFunctions) throws DBException, SQLException {
        if (procedure.getProcedureType() == DBSProcedureType.FUNCTION) {
            return "FROM SYSIBM.SYSDUMMY1";
    }
    private static final boolean LOAD_ROUTINES_FROM_SYSCAT = false;
    @Override
import org.jkiss.dbeaver.ext.db2.model.DB2Routine;

import org.jkiss.dbeaver.model.sql.parser.tokens.SQLTokenType;
    public boolean needsDefaultDataTypes() {
 *     http://www.apache.org/licenses/LICENSE-2.0
        return "--#SET TERMINATOR";
 * limitations under the License.
                        }
    protected String getStoredProcedureCallInitialClause(DBSProcedure proc) {
            super.loadFunctions(session, metaData, allFunctions);
        return BinaryFormatterHexString.INSTANCE;
    }
        }
        if (position == RulePosition.KEYWORDS) {
    private static final GlobalVariableInfo[] GLOBAL_VARIABLES = {
import java.util.Set;
    @NotNull
            final TPTokenDefault keywordToken = new TPTokenDefault(SQLTokenType.T_KEYWORD);
 * Licensed under the Apache License, Version 2.0 (the "License");
 * @author Denis Forveille
                        allFunctions.add(routineName);
import org.jkiss.dbeaver.model.DBPDataKind;
                return ")";
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
        return true;
        turnFunctionIntoKeyword("TRUNCATE");
                new SQLMultiWordRule(new String[]{"ROW", "END"}, keywordToken) };


            // Only "Select function_name" doesn't work for user-defined DB2 functions. See #10059
    public GlobalVariableInfo[] getGlobalVariables() {
 *
import org.jkiss.dbeaver.model.DBPEvaluationContext;
            // Function call is special for table functions
    @Override
    public TPRule[] extendRules(@Nullable DBPDataSourceContainer dataSource, @NotNull RulePosition position) {
/*
        {SQLConstants.BLOCK_BEGIN, SQLConstants.BLOCK_END},
            ProjectionAliasVisibilityScope.ORDER_BY
 * See the License for the specific language governing permissions and
        {SQLConstants.KEYWORD_CASE, SQLConstants.BLOCK_END}
    }
    @Override
            }
 * DBeaver - Universal Database Manager

    }
        if (LOAD_ROUTINES_FROM_SYSCAT) {
        return MultiValueInsertMode.GROUP_ROWS;
 *
        if (allFunctions.isEmpty()) {
            } catch (Throwable e) {
import org.jkiss.code.NotNull;
    @Override
        return false;
                try (JDBCResultSet dbResult = stmt.executeQuery(
import org.jkiss.code.Nullable;

 *
public class DB2SQLDialect extends JDBCSQLDialect implements TPRuleProvider {
package org.jkiss.dbeaver.ext.db2;
        return EnumSet.of(
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    };
    @NotNull
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;



                    "SELECT DISTINCT ROUTINENAME FROM SYSCAT.ROUTINES")) {

import org.jkiss.dbeaver.model.impl.data.formatters.BinaryFormatterHexString;
    private static final Log log = Log.getLog(DB2SQLDialect.class);
 * distributed under the License is distributed on an "AS IS" BASIS,
