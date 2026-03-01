
        this.structSeparator = sqlDialect.getStructSeparator();
 * limitations under the License.
import org.jkiss.dbeaver.runtime.DBWorkbench;
        Set<String> paramsPrefixes = new LinkedHashSet<>();
 *     http://www.apache.org/licenses/LICENSE-2.0
    @NotNull
        }
        namedParameterPrefixes = paramsPrefixes.toArray(new String[0]);

            // Database specific
    @NotNull
    {
        Collections.addAll(paramsPrefixes, dialect.getParametersPrefixes());
    private String catalogSeparator = String.valueOf(SQLConstants.STRUCT_SEPARATOR);

    }
    public DBPPreferenceStore getPreferenceStore() {
        this.sqlDialect = dialect;
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public String getControlCommandPrefix() {

    }
    private boolean anonymousParametersEnabled;
    public boolean isParametersEnabled() {
    private boolean parametersEnabled;
    }
    public boolean isAnonymousParametersEnabled() {
 * Unless required by applicable law or agreed to in writing, software
    @NotNull
        return statementDelimiterMode;

            paramsPrefixes.add(paramPrefixString);
import java.util.Collections;
    }
        final String caseName = preferenceStore.getString(ModelPreferences.SQL_FORMAT_KEYWORD_CASE);
    public char getEscapeChar() {
    }
    @Nullable
        return anonymousParametersEnabled;
        return statementDelimiters;
            }
    {
package org.jkiss.dbeaver.model.sql;
    public void init(@NotNull SQLDialect dialect, @NotNull DBPPreferenceStore preferenceStore)
    @Nullable
        }

 * you may not use this file except in compliance with the License.
 * SQLSyntaxManager.
        }
        return namedParameterPrefixes;
import org.jkiss.code.Nullable;
    }
        this.preferenceStore = preferenceStore;
    private DBPPreferenceStore preferenceStore = DBWorkbench.getPlatform().getPreferenceStore();
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    private boolean variablesEnabled;
/**

    @NotNull

        this.catalogSeparator = sqlDialect.getCatalogSeparator();
        if (!CommonUtils.isEmpty(paramPrefixString)) {
/*
        String markString = preferenceStore.getString(ModelPreferences.SQL_ANONYMOUS_PARAMETERS_MARK);
        if (CommonUtils.isEmpty(this.controlCommandPrefix)) {
 * Contains information about some concrete datasource underlying database syntax.
        return parametersEnabled;
            }
    }
    }
            String delim = st.nextToken();

        this.statementDelimiterMode = statementDelimiterMode;
        String extraDelimiters = CommonUtils.toString(preferenceStore.getString(ModelPreferences.SCRIPT_STATEMENT_DELIMITER), SQLConstants.DEFAULT_STATEMENT_DELIMITER);
    @NotNull
        this.identifierQuoteStrings = sqlDialect.getIdentifierQuoteStrings();
        } else {
 */


    private String[] namedParameterPrefixes;
 * <p/>
        return identifierQuoteStrings;
 * You may obtain a copy of the License at
        return catalogSeparator;
    private String[] statementDelimiters = new String[0];


 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.LinkedHashSet;
 *
import java.util.Set;

                this.statementDelimiters[i] = scriptDelimiters[i].toLowerCase();
import org.jkiss.dbeaver.ModelPreferences;
        } else {
 *
        return controlCommandPrefix;

            return CommonUtils.valueOf(DBPIdentifierCase.class, caseName.toUpperCase(), DBPIdentifierCase.MIXED);
    public SQLScriptStatementDelimiterMode getStatementDelimiterMode() {
        this.variablesEnabled = preferenceStore.getBoolean(ModelPreferences.SQL_VARIABLES_ENABLED);
    public String[] getStatementDelimiters()
    private String controlCommandPrefix;
            if (!ArrayUtils.contains(this.statementDelimiters, delim)) {
        return stringQuoteStrings;
        return escapeChar;

import org.jkiss.dbeaver.model.impl.sql.BasicSQLDialect;
        this.stringQuoteStrings = sqlDialect.getStringQuoteStrings();
            String[] scriptDelimiters = sqlDialect.getScriptDelimiters();
 * Support runtime change of datasource (reloads syntax information)
    @NotNull
        }
    private char anonymousParameterMark;
        this.anonymousParametersEnabled = preferenceStore.getBoolean(ModelPreferences.SQL_ANONYMOUS_PARAMETERS_ENABLED);
    }
 */
    {
        this.parametersEnabled = preferenceStore.getBoolean(ModelPreferences.SQL_PARAMETERS_ENABLED);
        this.controlCommandPrefix = preferenceStore.getString(ModelPreferences.SQL_CONTROL_COMMAND_PREFIX);
    private char escapeChar;
        this.escapeChar = dialect.getStringEscapeCharacter();

        if (CommonUtils.isEmpty(markString)) {
            for (int i = 0; i < scriptDelimiters.length; i++) {
import org.jkiss.utils.CommonUtils;
import java.util.StringTokenizer;

    }

        return variablesEnabled;
            this.statementDelimiters = new String[scriptDelimiters.length];
    }
            return sqlDialect.storesUnquotedCase();
import org.jkiss.dbeaver.model.DBPIdentifierCase;
    }
        String paramPrefixString = preferenceStore.getString(ModelPreferences.SQL_NAMED_PARAMETERS_PREFIX);
    {
    @NotNull

public class SQLSyntaxManager {
        StringTokenizer st = new StringTokenizer(extraDelimiters, " \t,");
    @NotNull
    public boolean isVariablesEnabled() {
            this.controlCommandPrefix = SQLConstants.DEFAULT_CONTROL_COMMAND_PREFIX;
    public String[][] getIdentifierQuoteStrings() {
import org.jkiss.code.NotNull;
            this.anonymousParameterMark = SQLConstants.DEFAULT_PARAMETER_MARK;

        if (!preferenceStore.getBoolean(ModelPreferences.SCRIPT_IGNORE_NATIVE_DELIMITER)) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void setStatementDelimiterMode(SQLScriptStatementDelimiterMode statementDelimiterMode) {
            this.anonymousParameterMark = markString.charAt(0);
    private SQLDialect sqlDialect = BasicSQLDialect.INSTANCE;
import org.jkiss.utils.ArrayUtils;
    public String getCatalogSeparator()

                this.statementDelimiters = ArrayUtils.add(String.class, this.statementDelimiters, delim);

        if (CommonUtils.isEmpty(caseName)) {

    public char getStructSeparator()
    }
        return preferenceStore;
        while (st.hasMoreTokens()) {

    }
    private char structSeparator;
    public SQLDialect getDialect() {
        return anonymousParameterMark;
    }
 *
        return structSeparator;
    {
    private String[][] stringQuoteStrings;
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ModelPreferences.SQLScriptStatementDelimiterMode;


    public SQLSyntaxManager()
        return sqlDialect;
}
    }
    public String[][] getStringQuoteStrings() {
        }
    @NotNull
    public DBPIdentifierCase getKeywordCase() {
    public String[] getNamedParameterPrefixes() {
    public char getAnonymousParameterMark() {
    private SQLScriptStatementDelimiterMode statementDelimiterMode;
    private String[][] identifierQuoteStrings;
    }
        this.statementDelimiterMode = SQLScriptStatementDelimiterMode.fromPreferences(preferenceStore);

        this.statementDelimiters = new String[0];
    }
 * See the License for the specific language governing permissions and
