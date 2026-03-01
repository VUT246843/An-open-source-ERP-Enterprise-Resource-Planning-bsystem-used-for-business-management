    }
}

        properties.put(name, value);
    }
    }
    }
        this.sourceEncoding = sourceEncoding;
 *
    public void setSourceEncoding(@NotNull String sourceEncoding) {
import java.util.HashMap;
    public Object getProperty(String name) {
        SQLDialect dialect = syntaxManager.getDialect();
    public void setIndentString(String indentString) {
    public DBPIdentifierCase getKeywordCase() {

    public SQLFormatterConfiguration(DBPDataSource dataSource, SQLSyntaxManager syntaxManager) {
import org.jkiss.code.NotNull;
        boolean isQuoted = dialect.isQuotedIdentifier(name);
        this.syntaxManager = syntaxManager;
    public SQLFormatterConfiguration(DBPDataSource dataSource, SQLSyntaxManager syntaxManager, String formatterId) {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }

    }
        this.properties = properties;
 */
import java.util.stream.Stream;

        this(dataSource, syntaxManager, CommonUtils.notEmpty(syntaxManager.getPreferenceStore().getString(SQLModelPreferences.SQL_FORMAT_FORMATTER)).toUpperCase(Locale.ENGLISH));
    public void setKeywordCase(@NotNull DBPIdentifierCase keyword) {


    }

            SQLModelPreferences.SQL_FORMAT_FORMATTER, formatterId.toUpperCase(Locale.ENGLISH));
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
    public String getIndentString() {
    private DBPDataSource dataSource;

import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        return name.chars().allMatch(c -> dialect.validIdentifierPart((char) c, isQuoted));
 * Unless required by applicable law or agreed to in writing, software

        return syntaxManager.getPreferenceStore();
/**
    public SQLSyntaxManager getSyntaxManager() {


import org.jkiss.dbeaver.model.sql.SQLDialect;
import org.jkiss.dbeaver.model.DBPDataSource;
 * you may not use this file except in compliance with the License.

 * DBeaver - Universal Database Manager
    }
    public String getSourceEncoding() {
    @NotNull
/*
    public void setProperty(String name, Object value) {
 * SQLFormatterConfiguration
        syntaxManager.getPreferenceStore().setValue(
    public boolean isFunction(String name) {

     */
    public DBPPreferenceStore getPreferenceStore() {
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.Map;
        return keywordCase;
    }
import org.jkiss.dbeaver.model.sql.SQLModelPreferences;
    public void loadSettings() {
    }


        return properties.get(name);
 *
    public DBPDataSource getDataSource() {
    private String indentString = "    ";

    private String sourceEncoding = GeneralUtils.DEFAULT_ENCODING;

    }
    public void saveSettings() {

    public void setFormatterId(String formatterId) {
        return formatterId;

    }
    /**

    }
    private SQLSyntaxManager syntaxManager;
 * You may obtain a copy of the License at
    private String formatterId;
import java.util.Locale;
    }
 *

        this.dataSource = dataSource;

import org.jkiss.dbeaver.utils.GeneralUtils;
    }
     * Create formatter config with default (set in properties) formatter

        return syntaxManager;
    @NotNull
import org.jkiss.utils.CommonUtils;
    public String getFormatterId() {
 */
    private Map<String, Object> properties = new HashMap<>();
        return sourceEncoding;
        return dataSource;
 * See the License for the specific language governing permissions and

        this.indentString = indentString;
package org.jkiss.dbeaver.model.sql.format;
 * Copyright (C) 2010-2024 DBeaver Corp and others


        this.formatterId = formatterId;
    }

public class SQLFormatterConfiguration {
        this.keywordCase = syntaxManager.getKeywordCase();
import org.jkiss.dbeaver.model.DBPIdentifierCase;
import org.jkiss.dbeaver.model.sql.SQLSyntaxManager;
        this.keywordCase = keyword;
    @NotNull
    }

        return indentString;

        this.formatterId = formatterId;
    private DBPIdentifierCase keywordCase;
    @NotNull
    }
        return syntaxManager.getDialect().getFunctions().contains(name.toUpperCase(Locale.ENGLISH));
    public void setProperties(Map<String, Object> properties) {
    }
    public boolean isIdentifier(@NotNull String name) {
 * limitations under the License.

