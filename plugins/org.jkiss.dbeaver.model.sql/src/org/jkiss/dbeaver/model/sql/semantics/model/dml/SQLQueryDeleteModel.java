        super(syntaxNode, tableModel);
    protected void resolveRowsReferencesImpl(@NotNull SQLQueryRowsSourceContext context, @NotNull SQLQueryRecognitionContext statistics) {
import org.jkiss.dbeaver.model.stm.STMKnownRuleNames;

 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.model.sql.semantics.model.dml;
            this.whereClause.resolveRowSources(context, statistics);
    @Nullable 

 *
    @NotNull
    }
import org.jkiss.dbeaver.model.sql.semantics.model.select.SQLQueryRowsTableDataModel;
            this.aliasedTableModel = new SQLQueryRowsCorrelatedSourceModel(syntaxNode, tableModel, alias, Collections.emptyList());

import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryModelContent;
import org.jkiss.dbeaver.model.sql.semantics.model.expressions.SQLQueryValueExpression;
        @Nullable SQLQuerySymbolEntry alias,

    private SQLQueryDeleteModel(
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager

        STMTreeNode whereClauseNode = node.findFirstChildOfName(STMKnownRuleNames.whereClause);
        return this.aliasedTableModel;
import org.jkiss.code.Nullable;
/*
 * Unless required by applicable law or agreed to in writing, software
    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, @NotNull T arg) {
    @Override
import org.jkiss.code.NotNull;
        return this.whereClause;
        }
    @Nullable

        
    public SQLQueryRowsCorrelatedSourceModel getAliasedTableModel() {
 * Licensed under the Apache License, Version 2.0 (the "License");

    @Override
/**
import org.antlr.v4.runtime.misc.Interval;
 *
        }
        this.whereClause = whereClause;

        return new SQLQueryDeleteModel(node, tableModel, alias, whereClauseExpr);
 * you may not use this file except in compliance with the License.
    @Nullable
 */
        if (this.whereClause != null) {
import org.jkiss.dbeaver.model.sql.semantics.SQLQuerySymbolEntry;
    @Nullable
    ) {
import org.jkiss.dbeaver.model.stm.STMTreeNode;
    private final SQLQueryRowsCorrelatedSourceModel aliasedTableModel;
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;

    public void resolveValueRelations(@NotNull SQLQueryRowsDataContext context, @NotNull SQLQueryRecognitionContext statistics) {
    }
 */
        if (this.aliasedTableModel != null) {
        SQLQueryRowsTableDataModel tableModel = tableNameNode == null ? null : recognizer.collectTableReference(tableNameNode, false);
    @Override
 *

        if (this.whereClause != null) {
 * You may obtain a copy of the License at

 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        }
        }
    
 * Describes DELETE statement
import org.jkiss.dbeaver.model.sql.semantics.SQLQueryModelRecognizer;
    }
        STMTreeNode aliasNode = node.findFirstChildOfName(STMKnownRuleNames.correlationName);
    public SQLQueryValueExpression getCondition() {
    }
import java.util.Collections;

            Interval correlatedRegion = Interval.of(tableModel.getInterval().a, alias.getInterval().b);
        @Nullable SQLQueryRowsTableDataModel tableModel,
            context = this.aliasedTableModel.resolveRowSources(context, statistics);
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsSourceContext;
    @Nullable
        STMTreeNode tableNameNode = node.findFirstChildOfName(STMKnownRuleNames.tableName);
 * Copyright (C) 2010-2025 DBeaver Corp and others
}
        @Nullable SQLQueryValueExpression whereClause
        @NotNull STMTreeNode syntaxNode,
        SQLQuerySymbolEntry alias = aliasNode == null ? null : recognizer.collectIdentifier(aliasNode, null);
import org.jkiss.dbeaver.model.sql.semantics.model.select.SQLQueryRowsCorrelatedSourceModel;
        SQLQueryValueExpression whereClauseExpr = whereClauseNode == null ? null : recognizer.collectValueExpression(whereClauseNode, null);
    public static SQLQueryModelContent recognize(@NotNull SQLQueryModelRecognizer recognizer, @NotNull STMTreeNode node) {
    private final SQLQueryValueExpression whereClause;
        if (this.aliasedTableModel != null) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            this.whereClause.resolveValueRelations(context, statistics);
        } else {
    }
    }
 * limitations under the License.
        }
import org.jkiss.dbeaver.model.sql.semantics.SQLQueryRecognitionContext;

            this.aliasedTableModel  = null;
public class SQLQueryDeleteModel extends SQLQueryDMLStatementModel {
        return visitor.visitTableStatementDelete(this, arg);
            this.aliasedTableModel.resolveValueRelations(context, statistics);
        if (alias != null && tableModel != null) {
