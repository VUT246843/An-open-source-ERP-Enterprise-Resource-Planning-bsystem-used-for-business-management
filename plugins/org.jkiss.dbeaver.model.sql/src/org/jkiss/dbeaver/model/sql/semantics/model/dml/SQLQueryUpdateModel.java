        } else {
        if (this.whereClause != null) {
                targetsScopeInterval.b = firstConditionNode.getRealInterval().a - 1;
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Nullable
        this.tailScope = tailScope;
                    for (SQLQueryValueExpression valueExpression : updateSetClauseModel.targets) {
                    List<SQLQueryValueExpression> targets = setTargetNode == null
    }
        
    @Nullable
            STMTreeNode lastConditionKwNode =  (whereClauseNode != null ? whereClauseNode : orderByClauseNode).findFirstNonErrorChild();
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryModelContent;
                }
        }
                        valueExpression.resolveValueRelations(targetContext, statistics);

        this.targetRows = targetRows;
    }
        @Nullable SQLQueryRowsSourceModel targetRows,
        if (this.targetRows != null) {
            if (this.setClauseList != null) {
 * you may not use this file except in compliance with the License.

        if (this.conditionsScope != null) {
        }
            for (SQLQueryUpdateSetClauseModel setClauseModel : this.setClauseList) {
                        .collect(Collectors.toList());
            context = targetContext.combine(sourceContext);
 *     http://www.apache.org/licenses/LICENSE-2.0

                    valueExpression.resolveValueRelations(context, statistics);
import org.jkiss.dbeaver.model.lsm.sql.impl.syntax.SQLStandardParser;
        }
                            }
 */
            }
                    }
                for (SQLQueryUpdateSetClauseModel updateSetClauseModel : this.setClauseList) {

        }
        SQLQueryRowsDataContext targetContext;
    public void resolveObjectAndRowsReferences(@NotNull SQLQueryRowsSourceContext context, @NotNull SQLQueryRecognitionContext statistics) {
            this.setTailOrigin(this.tailScope.getSymbolsOrigin());

            this.orderByClause.resolveValueRelations(context, statistics);
            targetContext = context;
            : Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
                            );
        @Nullable SQLQueryLexicalScope conditionsScope,
    @Nullable
        if (targetsScope != null) {
            ? this.sourceRows.resolveRowSources(context, statistics)
        SQLQueryRowsSourceContext sourceContext = this.sourceRows != null
        return new SQLQueryUpdateModel(node, targetSet, setClauseList, sourceSet, whereClauseExpr, orderByExpr, targetsScope, conditionsScope, tailScope);
    @Override
                    valueExpression.resolveRowSources(context, statistics);
        if (this.sourceRows != null) {
    private final SQLQueryValueExpression whereClause;
            // leave target column names as unresolved
        if (conditionsScope != null) {
    @Nullable
    }
        // updateStatement: UPDATE anyWordsWithProperty?? tableReference? (SET setClauseList? fromClause? whereClause? orderByClause? limitClause? anyWordsWithProperty??)?;

        this.whereClause = whereClause;
import org.jkiss.dbeaver.model.stm.STMKnownRuleNames;
        STMTreeNode setTermNode = node.findFirstChildOfName(STMKnownRuleNames.SET_TERM);


        } else {
            int from = lastConditionKwNode != null ? lastConditionKwNode.getRealInterval().b + 2 : whereClauseNode.getRealInterval().a;

        }
    @Nullable
        }
                tailScope = null;
            this.targetRows.resolveValueRelations(context, statistics);
 * DBeaver - Universal Database Manager
            targetsScope.setInterval(targetsScopeInterval);
        }
                        .filter(Objects::nonNull)
        return sourceRows;
        STMTreeNode whereClauseNode = node.findFirstChildOfName(STMKnownRuleNames.whereClause);
            this.sourceRows.resolveValueRelations(context, statistics);
    private final SQLQueryRowsSourceModel sourceRows;
                            case SQLStandardParser.RULE_anyUnexpected ->
                orderByExpr = orderByClauseNode == null ? null : recognizer.collectValueExpression(orderByClauseNode, conditionsScope);
                                ).stream().map(cn -> recognizer.collectValueExpression(cn, targetsScope)).collect(Collectors.toList());
    private final SQLQueryLexicalScope tailScope;
        }

        if (setClauseListNode != null) {
        this.conditionsScope = conditionsScope;

        if (targetsScope != null) {
            this.whereClause.resolveRowSources(context, statistics);
                                yield List.of(new SQLQueryValueColumnReferenceExpression(setTargetNode, targetName));
        SQLQueryRowsSourceModel targetSet = targetTableNode == null ? null : recognizer.collectQueryExpression(targetTableNode);
            if (this.targetsScope != null) {
    }
        if (this.orderByClause != null) {
import org.jkiss.dbeaver.model.sql.semantics.*;
    @Nullable
                                SQLQuerySymbolEntry targetName = targetNameNode == null ? null : recognizer.collectIdentifier(targetNameNode, null);
        if (this.setClauseList != null) {
            targetContext = this.targetRows.getRowsDataContext();
import org.jkiss.dbeaver.model.sql.semantics.model.select.SQLQueryRowsSourceModel;
 * limitations under the License.
    private final SQLQueryValueExpression orderByClause;
                }
        if (this.targetRows != null) {
                        .map(cn -> recognizer.collectValueExpression(cn, targetsScope))
/*
                    );
        if (targetContext != context || sourceContext != context) {
    @Nullable
            whereClauseExpr = null;

            }
        }
    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, @NotNull T arg) {
        STMTreeNode setClauseListNode = node.findFirstChildOfName(STMKnownRuleNames.setClauseList);
        } else {
            } else {
 *
        STMTreeNode targetTableNode = node.findFirstChildOfName(STMKnownRuleNames.tableReference);
        @NotNull STMTreeNode syntaxNode,
        super(syntaxNode.getRealInterval(), syntaxNode);
import java.util.*;
                targetsScope = holder.lexicalScope;
            }
public class SQLQueryUpdateModel extends SQLQueryModelContent {
                    }
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;
            orderByExpr = null;

        }
        this.orderByClause = orderByClause;
                        : switch (setTargetNode.getNodeKindId()) {
            targetsScope = null;

                            default -> throw new UnsupportedOperationException(
            if (firstConditionNode != null) {
            sourceContext = context;
                whereClauseExpr = whereClauseNode == null ? null : recognizer.collectValueExpression(whereClauseNode, conditionsScope);
    @Nullable
            conditionsScope = null;
        }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
            for (SQLQueryUpdateSetClauseModel setClauseModel : this.setClauseList) {
            }
                                    Set.of(STMKnownRuleNames.setTargetList),
                        ? Collections.emptyList()
        SQLQueryLexicalScope tailScope;
    @Nullable
                                STMUtils.expandSubtree(
            conditionsScope.setInterval(Interval.of(from, to));
            }

        STMTreeNode fromClauseNode = node.findFirstChildOfName(STMKnownRuleNames.fromClause);
                    List<SQLQueryValueExpression> sources = updateSourceNode == null
        if (targetContext != context || sourceContext != context) {
                for (SQLQueryValueExpression valueExpression : setClauseModel.sources) {
    public SQLQueryRowsSourceModel getTargetRows() {
/**
            this.registerLexicalScope(targetsScope);
            try (SQLQueryModelRecognizer.LexicalScopeHolder holder = recognizer.openScope()) {
                for (SQLQueryValueExpression valueExpression : setClauseModel.sources) {
                        new SQLQueryUpdateSetClauseModel(


        }
    private final SQLQueryLexicalScope conditionsScope;
            if (limitClauseNode != null) {
        @Nullable SQLQueryRowsSourceModel sourceRows,
        Interval targetsScopeInterval = Interval.of(setTermNode != null
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;
            this.registerLexicalScope(conditionsScope);
        this.sourceRows = sourceRows;
        return targetRows;
                        )
    @Nullable
            }
import org.jkiss.dbeaver.model.stm.STMTreeNode;
        SQLQueryRowsSourceModel sourceSet = fromClauseNode == null ? null : recognizer.collectQueryExpression(fromClauseNode);
 * Licensed under the Apache License, Version 2.0 (the "License");
                            case SQLStandardParser.RULE_setTargetList ->
import org.jkiss.code.Nullable;
                    // resolve target columns against target set
        @Nullable SQLQueryLexicalScope targetsScope,
    public SQLQueryValueExpression getOrderByClause() {
        if (this.whereClause != null) {
                : orderByClauseNode != null ? orderByClauseNode : limitClauseNode != null ? limitClauseNode : null;
            if (this.setClauseList != null) {
                        : STMUtils.expandSubtree(
        @Nullable SQLQueryValueExpression orderByClause,
    public void resolveValueRelations(@NotNull SQLQueryRowsDataContext context, @NotNull SQLQueryRecognitionContext statistics) {

 * Describes UPDATE statement
        }
import org.jkiss.dbeaver.model.sql.semantics.model.expressions.SQLQueryValueColumnReferenceExpression;
        SQLQueryLexicalScope targetsScope;
                tailScope = conditionsScope;
    private final List<SQLQueryUpdateSetClauseModel> setClauseList;
                    for (SQLQueryValueExpression valueExpression : updateSetClauseModel.targets) {
        return setClauseList;

        @Nullable SQLQueryValueExpression whereClause,
    @NotNull
    }
        if (this.tailScope != null) {
    @Nullable
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
                ? whereClauseNode
        SQLQueryLexicalScope conditionsScope;
                to = Integer.MAX_VALUE;
                    STMTreeNode setTargetNode = setClauseNode.findFirstNonErrorChild();

        this.targetsScope = targetsScope;
                }
            tailScope = limitClauseNode == null ? targetsScope : null;

            this.whereClause.resolveValueRelations(context, statistics);

    public SQLQueryUpdateModel(
 *
        if (this.setClauseList != null) {

                // resolve source value expressions against combined participating sets
 */
                conditionsScope = holder.lexicalScope;
 * You may obtain a copy of the License at
        return orderByClause;
                this.targetsScope.setSymbolsOrigin(new SQLQuerySymbolOrigin.SyntaxBasedFromRowsData(targetContext));
        STMTreeNode orderByClauseNode = node.findFirstChildOfName(STMKnownRuleNames.orderByClause);
                            updateSourceNode,
    }
            context = targetContext.combine(sourceContext);
                to = limitClauseNode.getRealInterval().a;
        
    public static SQLQueryModelContent recognize(@NotNull SQLQueryModelRecognizer recognizer, @NotNull STMTreeNode node) {
                            setClauseNode,
        
import org.jkiss.dbeaver.model.sql.semantics.model.expressions.SQLQueryValueExpression;
        return visitor.visitTableStatementUpdate(this, arg);

    @Override
import org.jkiss.dbeaver.model.stm.STMUtils;
        }
            targetContext = context;
        SQLQueryValueExpression orderByExpr;
        } else {
        }
                            sources,
            try (SQLQueryModelRecognizer.LexicalScopeHolder holder = recognizer.openScope()) {
    private final SQLQueryLexicalScope targetsScope;
import org.jkiss.code.NotNull;
                }
        SQLQueryRowsDataContext sourceContext;
                }
                    // resolve target columns against target set
                        ).stream()
        this.setClauseList = setClauseList;
            : context;
        @Nullable List<SQLQueryUpdateSetClauseModel> setClauseList,
        return whereClause;
        SQLQueryRowsSourceContext targetContext;
    }
package org.jkiss.dbeaver.model.sql.semantics.model.dml;
                for (SQLQueryUpdateSetClauseModel updateSetClauseModel : this.setClauseList) {
 * Unless required by applicable law or agreed to in writing, software
            int to;
        STMTreeNode limitClauseNode = node.findFirstChildOfName(STMKnownRuleNames.limitClause);
                // resolve source value expressions against combined participating sets

    public SQLQueryRowsSourceModel getSourceRows() {
        List<SQLQueryUpdateSetClauseModel> setClauseList = new ArrayList<>();
            ? setTermNode.getRealInterval().b + 2
            sourceContext = this.sourceRows.getRowsDataContext();
        }

}
 *
                    setClauseList.add(
        } else {
            // leave target column names as unresolved
    private final SQLQueryRowsSourceModel targetRows;

                        };
                            case SQLStandardParser.RULE_setTarget -> {
            }
                        valueExpression.resolveRowSources(targetContext, statistics);
        if (this.orderByClause != null) {
                                Collections.emptyList();
 * See the License for the specific language governing permissions and

                                    setTargetNode,
                            setClauseNode.getTextContent()
                                // error in query text, ignoring it
                    STMTreeNode updateSourceNode = setClauseNode.findFirstChildOfName(STMKnownRuleNames.updateSource);
        @Nullable SQLQueryLexicalScope tailScope
    @Nullable
    public SQLQueryValueExpression getWhereClause() {
        SQLQueryValueExpression whereClauseExpr;

                        ? Collections.emptyList()
                                "Set target list expected while facing with " + setTargetNode.getNodeName()
            STMTreeNode firstConditionNode = whereClauseNode != null

        }
                        .map(STMTreeNode::findFirstNonErrorChild)
            this.orderByClause.resolveRowSources(context, statistics);
    }
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsSourceContext;

    ) {
            this.conditionsScope.setSymbolsOrigin(new SQLQuerySymbolOrigin.RowsDataRef(context));
    public List<SQLQueryUpdateSetClauseModel> getSetClauseList() {
                for (STMTreeNode setClauseNode : setClauseListNode.findChildrenOfName(STMKnownRuleNames.setClause)) {
    @Nullable
import java.util.stream.Collectors;
                                    Set.of(STMKnownRuleNames.valueReference)
                            Set.of(STMKnownRuleNames.updateSource),
            }
import org.antlr.v4.runtime.misc.Interval;
                            targets,
    }
                            Set.of(STMKnownRuleNames.updateValue)
                                STMTreeNode targetNameNode = setTargetNode.findFirstNonErrorChild();
        if (whereClauseNode != null || orderByClauseNode != null) {
            targetContext = this.targetRows.resolveRowSources(context, statistics);
