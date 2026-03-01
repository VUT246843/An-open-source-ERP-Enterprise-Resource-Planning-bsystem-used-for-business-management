                .filter(r -> allowPartialMatch
        } catch (Exception e) {
        }
    }
    public Map<String, String> getTableAliasesFromQuery() {
 *
import org.jkiss.dbeaver.model.sql.completion.SQLCompletionRequest;
            this.prepareTableReferences();
 */
            }
            query,
        return tableReferences;
                TableReferencesRules.expandRulesToTableName,
import org.jkiss.utils.CommonUtils;
package org.jkiss.dbeaver.model.sql.analyzer;
            TableReferencesRules.extractRulesToTableRef);
public class TableReferencesAnalyzerImpl implements TableReferencesAnalyzer {
            result = tableReferences;
    }
import java.util.Collections;
            String tableName = null;
/*
        } else {
import org.jkiss.dbeaver.model.lsm.LSMAnalyzerParameters;
    private final SQLCompletionRequest request;
                    alias = part.getText();
    
            STMTreeRuleNode tree = analyzer.parseSqlQueryTree(querySource, new STMSkippingErrorListener());
            STMSource querySource = STMSource.fromReader(new StringReader(this.request.getActiveQuery().getText()));

 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.lsm.sql.dialect.LSMDialectRegistry;
            if (activeQuery == null) {
        for (STMTreeNode tableRef : tableExpandedReferences) {
            TableReferencesRules.expandRulesToTableRef,

                tableRef,
            String alias = null;
    public TableReferencesAnalyzerImpl(@NotNull SQLCompletionRequest request) {
 *     http://www.apache.org/licenses/LICENSE-2.0
    private static final Log log = Log.getLog(TableReferencesAnalyzerImpl.class);
 *
 * You may obtain a copy of the License at
        }

 * Licensed under the Apache License, Version 2.0 (the "License");
        if (!this.prepareTableReferencesIfNeeded()) {
import org.jkiss.dbeaver.model.sql.SQLScriptElement;
 * Copyright (C) 2010-2024 DBeaver Corp and others
            for (STMTreeNode part : names) {
        try {

import java.io.StringReader;
                } else if (nodeName.equals(STMKnownRuleNames.correlationName)) {
                return Collections.emptyMap();
 *
                    ? r.getValue() != null && CommonUtils.startsWithIgnoreCase(r.getValue(), tableAlias)
    }
            LSMAnalyzer analyzer = LSMDialectRegistry.getInstance().getAnalyzerFactoryForDialect(dialect)
            log.debug("Failed to extract table names from query", e);

        return true;
                }
    /**
    }
                String nodeName = part.getNodeName();
    }
            result = tableReferences.entrySet().stream()

 * you may not use this file except in compliance with the License.
    public Map<String, String> getFilteredTableReferences(@NotNull String tableAlias, boolean allowPartialMatch) {
    @NotNull
                if (nodeName.equals(STMKnownRuleNames.tableName)) {
    @NotNull
        return result;
            final SQLScriptElement activeQuery = request.getActiveQuery();
            SQLDialect dialect = request.getContext().getDataSource().getSQLDialect();
        }
    }
 */
            log.error(e.getMessage(), e);

                TableReferencesRules.extractRulesToTableName);
     */

        List<STMTreeNode> tableExpandedReferences = STMUtils.expandSubtree(
            List<STMTreeNode> names = STMUtils.expandSubtree(
                    tableName = part.getText();
import org.jkiss.dbeaver.model.lsm.LSMAnalyzer;
        if (tableReferences == null || tableReferences.isEmpty()) {
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
                    : r.getValue() != null && r.getValue().equalsIgnoreCase(tableAlias))
    @NotNull
    @Override
            return Collections.emptyMap();
     * The method designed to get table and aliases from source query
import java.util.stream.Collectors;
        }
    private boolean prepareTableReferencesIfNeeded() {
        Map<String, String> result;
        }
                 .createAnalyzer(LSMAnalyzerParameters.forDialect(dialect, request.getContext().getSyntaxManager()));
import java.util.Map;
 * Internal implementation of references analyzer
        if (CommonUtils.isNotEmpty(tableAlias) && !tableReferences.isEmpty()) {
            if (!this.prepareTableReferencesIfNeeded()) {
    private Map<String, String> tableReferences;
 * distributed under the License is distributed on an "AS IS" BASIS,
                result.put(tableName, alias);
            if (tableName != null) {

            }
            }
    private void prepareTableReferences() {
        return result;

 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
            tableReferences = Collections.emptyMap();
        } catch (Exception e) {
        try {
import org.jkiss.dbeaver.model.sql.SQLDialect;
import java.util.List;
        Map<String, String> result = new TreeMap<>();
        this.request = request;
            }
            tableReferences = getTableAndAliasFromSources(tree);

import org.jkiss.code.NotNull;
                return false;
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.model.stm.*;
        }
}
    @Override
/**
    public Map<String, String> getTableAndAliasFromSources(@NotNull STMTreeRuleNode query) {
import java.util.TreeMap;
 * See the License for the specific language governing permissions and
