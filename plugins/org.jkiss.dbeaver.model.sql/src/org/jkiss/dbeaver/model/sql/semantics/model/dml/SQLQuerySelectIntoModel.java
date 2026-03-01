        }
                int selectedColumns = sourceContext.getColumnsList().size();
 * See the License for the specific language governing permissions and

public class SQLQuerySelectIntoModel extends SQLQueryRowsProjectionModel {
            @Override
        @Override
import org.jkiss.dbeaver.model.sql.semantics.model.select.SQLQueryRowsTableDataModel;
    protected SQLQueryRowsSourceContext resolveRowSourcesImpl(
            (node, selectListScope, sourceModel, fromScope, filterExprs, filtersScope, resultModel, tailScope) ->
        @NotNull SQLQueryRowsDataContext context,
        @NotNull SQLQueryModelRecognizer recognizer
        }
    public SQLQuerySelectIntoModel(
        @NotNull
            return this.targets.stream().map(SelectionTarget::getNode).filter(Objects::nonNull).toList();
    @Override

        public List<SelectionTarget> getTargets() {
        return sourceContext;
    private final STMTreeNode intoKeywordSyntaxNode;

import org.jkiss.dbeaver.model.sql.semantics.model.expressions.SQLQueryValueExpression;
                                default -> new ValueSelectionTarget(recognizer.collectValueExpression(targetItemNode, null));
                        targets.add(

            this.targetScope = targetScope;
import org.jkiss.dbeaver.model.sql.semantics.model.select.SQLQueryRowsProjectionModel;
import org.jkiss.code.NotNull;
        STMTreeNode selectTargetList = syntaxNode.findLastChildOfName(STMKnownRuleNames.selectTargetList);
                SQLQueryRowsDataContext targetContext = target.table.getRowsDataContext();
                target.expression.resolveRowSources(context, statistics);
        SQLQuerySelectIntoTargetsList targetsList;
        }
                int expectedColumns = targetContext.getColumnsList().size();
    }
        @NotNull List<SQLQueryRowsSourceModel> sourceModels,
        void visitRowsetTarget(RowsetSelectionTarget target);
        }


import org.jkiss.dbeaver.model.sql.semantics.SQLQuerySymbolOrigin;
import org.jkiss.dbeaver.model.sql.semantics.SQLQueryModelRecognizer;
        public void apply(SelectionTargetVisitor visitor) {
import java.util.Objects;
        return SQLQueryRowsProjectionModel.recognize(
                    );
}

                new SQLQuerySelectIntoModel(node, intoKeywordNode, selectListScope, targetsList, sourceModel, fromScope, filterExprs, filtersScope, resultModel, tailScope)
        }

        if (this.targets != null) {
            syntaxNode,
    @Override
        }
import org.jkiss.dbeaver.model.sql.semantics.model.select.SQLQueryRowsSourceModel;
        }
                        );
        }
        @NotNull STMTreeNode syntaxNode,
        void apply(SelectionTargetVisitor visitor);
        }

            public void visitRowsetTarget(RowsetSelectionTarget target) {
            public void visitExpressionTarget(ValueSelectionTarget target) {
 *
import java.util.List;
            SQLQueryLexicalScope targetScope = targetScopeHolder.lexicalScope;
            }
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.lsm.sql.impl.syntax.SQLStandardParser;
 * limitations under the License.
                    }
        @Override
    }
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;
        @NotNull
                targetScope.registerSyntaxNode(selectTargetList);
                targetsList = new SQLQuerySelectIntoTargetsList(selectTargetList, targets, targetScope);
    @Nullable
 * distributed under the License is distributed on an "AS IS" BASIS,

                targetScope.registerSyntaxNode(intoKeywordNode);
    ) {
        @NotNull SQLQueryRecognitionContext statistics
        }
            }
        @Nullable STMTreeNode intoKeywordSyntaxNode,
        public SQLQuerySelectIntoTargetsList(
            @Override
import org.jkiss.dbeaver.model.sql.semantics.SQLQueryLexicalScope;
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;
    }
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsSourceContext;
        STMTreeNode intoKeywordNode = syntaxNode.findFirstChildOfName(STMKnownRuleNames.INTO_TERM);
    protected SQLQueryRowsDataContext resolveRowDataImpl(
 *     http://www.apache.org/licenses/LICENSE-2.0
        void visitExpressionTarget(ValueSelectionTarget target);
 * you may not use this file except in compliance with the License.
        this.intoKeywordSyntaxNode = intoKeywordSyntaxNode;
            }


    }

            if (statistics.useRealMetadata() && targets.size() == 1 && targets.get(0) instanceof RowsetSelectionTarget target) {
                }
                                case SQLStandardParser.RULE_tableName ->
import org.jkiss.code.Nullable;
                List<SelectionTarget> targets = new LinkedList<>();
            targets.stream().map(SelectionTarget::getNode).filter(Objects::nonNull).forEach(this::registerSubnode);
                }
            this.targets = targets;
            @NotNull List<SelectionTarget> targets,

        @Override
                        Objects.requireNonNullElse(this.intoKeywordSyntaxNode, this.getSyntaxNode()),
            return visitor.visitRowsProjectionIntoTargetsList(this, arg);
        SelectionTargetVisitor propagator = new SelectionTargetVisitor() {
        @Override
    public record RowsetSelectionTarget(SQLQueryRowsTableDataModel table) implements SelectionTarget {
                                    new RowsetSelectionTarget(recognizer.collectTableReference(targetItemNode, false));
            visitor.visitExpressionTarget(this);
    }
        return sourceContext;
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModel;


        ) {
    @Override
    }
 * Unless required by applicable law or agreed to in writing, software
            if (selectTargetList != null) {
    public SQLQuerySelectIntoTargetsList getTargets() {
            List<SQLQuerySelectIntoModel.SelectionTarget> targets = this.targets.getTargets();
                }
    public static SQLQueryRowsSourceModel recognize(

                target.table.resolveValueRelations(context, statistics);
            sourceModels,
                for (STMTreeNode targetNode : selectTargetList.findChildrenOfName(STMKnownRuleNames.selectTargetItem)) {
        @Nullable SQLQueryLexicalScope tailScope
        );
            this.registerLexicalScope(targetScope);
        return visitor.visitRowsProjectionInto(this, arg);
                if (target.getNode() != null) {
    ) {
        super(syntaxNode, selectListScope, fromSource, fromScope, filterExprs, filterScopes, result, tailScope);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return this.targets;

 * Copyright (C) 2010-2025 DBeaver Corp and others
        @NotNull SQLQueryRecognitionContext statistics
            this.targets.getTargetScope().setSymbolsOrigin(new SQLQuerySymbolOrigin.RowsSourceRef(context));
    public record ValueSelectionTarget(SQLQueryValueExpression expression) implements SelectionTarget {

        };
    ) {
        @Nullable SQLQueryLexicalScope fromScope,
import org.jkiss.dbeaver.model.stm.STMTreeNode;

            @NotNull STMTreeNode syntaxNode,

 * You may obtain a copy of the License at
            return this.targetScope;
    }
        if (this.targets != null) {
            @Override
        @NotNull FiltersData<SQLQueryValueExpression> filterExprs,
            if (intoKeywordNode != null) {
        try (SQLQueryModelRecognizer.LexicalScopeHolder targetScopeHolder = recognizer.openScope()) {
        SQLQueryRowsSourceContext sourceContext = super.resolveRowSourcesImpl(context, statistics);
        }

    }


                    statistics.appendWarning(

            @NotNull SQLQueryLexicalScope targetScope
        @Nullable SQLQuerySelectIntoTargetsList targets,
 *
    }
    @Nullable
                    if (targetItemNode != null) {
        public List<SQLQueryNodeModel> getTargetNodes() {
                if (selectedColumns != expectedColumns && expectedColumns != 0) {
        return this.targets;
        public SQLQueryNodeModel getNode() {
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.stm.STMKnownRuleNames;
                targetsList = null;
            public void visitExpressionTarget(ValueSelectionTarget target) {
                if (target.getNode() != null) {
        @Override
            for (SelectionTarget target : targets) {
    ) {
package org.jkiss.dbeaver.model.sql.semantics.model.dml;


 *
                target.expression.resolveValueRelations(context, statistics);
        public SQLQueryNodeModel getNode() {
            return this.expression;
        };
/*


    public static class SQLQuerySelectIntoTargetsList extends SQLQueryNodeModel {
            recognizer,

            for (SelectionTarget target : targets) {


        private final List<SelectionTarget> targets;
    private final SQLQuerySelectIntoTargetsList targets;
                        "Selected result set has " + selectedColumns + " columns while target expected " + expectedColumns + " columns."
            public void visitRowsetTarget(RowsetSelectionTarget target) {
        @NotNull SQLQueryRowsSourceContext context,
            } else {
            }
        }
            visitor.visitRowsetTarget(this);
                    target.apply(propagator);
        @NotNull
                            switch (targetItemNode.getNodeKindId()) {
        SQLQueryNodeModel getNode();
 */
        private final SQLQueryLexicalScope targetScope;

                target.table.resolveRowSources(context, statistics);
                }
import org.jkiss.dbeaver.model.sql.semantics.SQLQueryRecognitionContext;
        @NotNull STMTreeNode syntaxNode,
                            }
        @NotNull FiltersData<SQLQueryLexicalScope> filterScopes,
    }

        this.targets = targets;

            List<SQLQuerySelectIntoModel.SelectionTarget> targets = this.targets.getTargets();
        public void apply(SelectionTargetVisitor visitor) {

            }

    public interface SelectionTarget {
            }
        public SQLQueryLexicalScope getTargetScope() {
    public interface SelectionTargetVisitor {
            }
        @NotNull


import org.jkiss.dbeaver.model.sql.semantics.model.select.SQLQuerySelectionResultModel;
import java.util.LinkedList;
        @NotNull SQLQueryRowsSourceModel fromSource,
        SQLQueryRowsDataContext sourceContext = super.resolveRowDataImpl(context, statistics);
    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, @NotNull T arg) {
    }
            }
                    STMTreeNode targetItemNode = targetNode.findFirstNonErrorChild();
            return this.table;
        SelectionTargetVisitor propagator = new SelectionTargetVisitor() {
        protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, T arg) {
        @NotNull SQLQuerySelectionResultModel result,
        @NotNull SQLQueryLexicalScope selectListScope,
                    target.apply(propagator);
            }

            super(syntaxNode.getRealInterval(), syntaxNode);

            @Override
    @Nullable
