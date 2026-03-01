    }
import org.jkiss.dbeaver.model.DBPDataSource;
 *     http://www.apache.org/licenses/LICENSE-2.0
    @NotNull
    }
 * Unless required by applicable law or agreed to in writing, software
 * Parser context
    void endScriptEvaluation() {

        this.syntaxManager = syntaxManager;
                if (dataSource != null) {
    private TPRuleBasedScanner scanner;
    @Nullable
 *
        }

            return dataSource.getSQLDialect();

    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Nullable
    public SQLDialect getDialect() {
 */
    }
 * you may not use this file except in compliance with the License.
    public void setPreferenceStore(@Nullable DBPPreferenceStore preferenceStore) {

 * limitations under the License.
        } else {
        if (dataSource != null) {
    public SQLRuleManager getRuleManager() {
        if (dataSourceContainer != null) {
            this.dataSource = null;
        return syntaxManager;
            this.dataSourceContainer = dataSource.getContainer();

            scanner = new TPRuleBasedScanner();

            dataSource.getContainer().getPreferenceStore();
import org.jkiss.dbeaver.model.text.parser.TPRuleBasedScanner;
            this.dataSourceContainer = null;
                    cachedSqlDialect = dataSourceContainer.getScriptDialect().createInstance();
import org.jkiss.dbeaver.model.sql.SQLDialect;
        this.dataSourceContainer = dataSourceContainer;
        } else {
        this.preferenceStore = preferenceStore;
        }

            } catch (Exception e) {
    private DBPPreferenceStore preferenceStore;
import org.jkiss.dbeaver.Log;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.impl.sql.BasicSQLDialect;
        if (preferenceStore != null) {
    @Nullable

    public DBPPreferenceStore getPreferenceStore() {
    @Nullable
        getScanner().endEval();

 *
                }
                }
    @NotNull
        this.dataSource = dataSource;
 * Copyright (C) 2010-2024 DBeaver Corp and others

        this.ruleManager = ruleManager;
    public SQLSyntaxManager getSyntaxManager() {
    }
        }
            DBWorkbench.getPlatform().getPreferenceStore() :
                log.warn(String.format("Can't get dialect from dataSourceContainerId: %s", dataSourceContainer.getId()));
        if (scanner == null) {

 * DBeaver - Universal Database Manager

        if (dataSource != null) {
    @Nullable
        return BasicSQLDialect.INSTANCE;
    public DBPDataSource getDataSource() {
        return dataSource;
    @NotNull
    private final DBPDataSource dataSource;
    }
    }
            try {
        DBPDataSource dataSource = getDataSource();
package org.jkiss.dbeaver.model.sql.parser;
        this.syntaxManager = syntaxManager;

            scanner.setRules(ruleManager.getAllRules());
        return scanner;

    }
        return document;
        }
    public IDocument getDocument() {
    @NotNull
    public TPRuleBasedScanner getScanner() {
            }

/*

import org.eclipse.jface.text.IDocument;

    }
                if (cachedSqlDialect == null) {
    }
    private final SQLSyntaxManager syntaxManager;
                    return dataSource.getSQLDialect();

    public SQLParserContext(@Nullable DBPDataSourceContainer dataSourceContainer, @NotNull SQLSyntaxManager syntaxManager, @NotNull SQLRuleManager ruleManager, @NotNull IDocument document) {
import org.jkiss.code.Nullable;
                DBPDataSource dataSource = dataSourceContainer.getDataSource();
        return dataSource == null ?
        this.document = document;
 *
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
}
 */
        if (dataSourceContainer != null) {
        getScanner().startEval();
import org.jkiss.code.NotNull;
        this.ruleManager = ruleManager;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    public SQLParserContext(@Nullable DBPDataSource dataSource, @NotNull SQLSyntaxManager syntaxManager, @NotNull SQLRuleManager ruleManager, @NotNull IDocument document) {
import org.jkiss.dbeaver.model.sql.SQLSyntaxManager;
        return ruleManager;
        this.document = document;
    void startScriptEvaluation() {
import org.jkiss.dbeaver.runtime.DBWorkbench;
        }
    }
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    private final DBPDataSourceContainer dataSourceContainer;
    private final SQLRuleManager ruleManager;

    }
            this.dataSource = dataSourceContainer.getDataSource();


            return preferenceStore;
    private static final Log log = Log.getLog(SQLParserContext.class);
                return cachedSqlDialect;
public class SQLParserContext {
    @NotNull

 * You may obtain a copy of the License at

    private SQLDialect cachedSqlDialect = null;
/**
    private final IDocument document;
