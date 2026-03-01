                                    resultModel.addColumnSpec(sublistNode, expr, asColumnName);
    @NotNull
    @NotNull
    }
        @Nullable SQLQueryLexicalScope tailScope
            };
                ? filtersContext
    }
    @NotNull
        if (fromScope != null) {
            @Nullable SQLQueryLexicalScope fromScope,
                }
            @NotNull SQLQuerySelectionResultModel result,
        SQLQueryRowsDataContext unresolvedResult = context.combine(this.fromSource.getRowsDataContext());
    @Override
        if (this.filterExprs.whereClause != null) {
    @NotNull
    @Nullable
        }


                                recognizer.registerScopeItem(tupleRefEntry);
                    switch (sublistNode.getNodeKindId()) { // selectSublist: (Asterisk|derivedColumn)? anyUnexpected??;
        // keyword itself should not be included to the scope
        if (this.filterExprs.orderByClause != null) {
        @NotNull SQLQueryRecognitionContext statistics
        }
                        // interval end points to the last keyword character
                    STMTreeNode filterNode = filterNodes[i];
        } else {
    @NotNull
                                STMTreeNode asClauseNode = sublistNode.findLastChildOfName(STMKnownRuleNames.asClause);
        );
    }
            if (selectKeywordNode == null) {
    @NotNull
        return resolvedResult;
import org.antlr.v4.runtime.misc.Interval;
                        case SQLStandardParser.RULE_derivedColumn -> {
                tableExpr.findFirstChildOfName(STMKnownRuleNames.groupByClause),
            SQLQueryLexicalScope tailScope = null;
        }
                        from = prevScopes[i].getInterval().b;
    private final SQLQueryRowsSourceModel fromSource; // from tableExpression
        if (selectListNode == null) {
        }
            selectKeywordNode = syntaxNode.findFirstChildOfName(STMKnownRuleNames.SELECT_TERM);


        private FiltersData(T where, T groupBy, T having, T orderBy) {

        STMTreeNode setQuantifierNode = syntaxNode.findFirstChildOfName(STMKnownRuleNames.setQuantifier);
                            prevScopes[scopeIndex] = scopes[prevScopeIndex];
 *
        @NotNull FiltersData<SQLQueryValueExpression> filterExprs,
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsSourceContext;
            this.filterExprs.orderByClause.resolveValueRelations(clauseCtx, statistics);
 */
    }

        return this.filterExprs.groupByClause;
public class SQLQueryRowsProjectionModel extends SQLQueryRowsSourceModel {

    private final FiltersData<SQLQueryValueExpression> filterExprs;
                    }
        @NotNull SQLQuerySelectionResultModel result,
                            nextScopeNodes[prevScopeIndex] = filterNode;
            selectListScope.setInterval(Interval.of(selectListScopeStart, tableExpr.getRealInterval().a - 1));

            selectListScope = selectListScopeHolder.lexicalScope;
    public static SQLQueryRowsSourceModel recognize(
import org.jkiss.dbeaver.model.stm.STMKnownRuleNames;

                    int scopeIndex = i + 1;
        int selectListScopeStart = (setQuantifierNode != null ? setQuantifierNode : selectKeywordNode).getRealInterval().b + 2;
                            filterExprs[i] = recognizer.collectValueExpression(filterNode, exprScope.lexicalScope);
            }
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryResultColumn;
                : unresolvedResult;
            int to = i.b;
                : unresolvedResult;
    public SQLQueryRowsProjectionModel(
                            SQLQueryValueExpression expr = exprNode == null
                                if (asClauseNode != null) {
 * Unless required by applicable law or agreed to in writing, software
            this.havingClause = having;
import org.jkiss.code.NotNull;
    public static SQLQueryRowsSourceModel recognize(
                resultModel, tailScope
            SQLQueryRowsDataContext clauseCtx = aliasVisibilities.contains(ProjectionAliasVisibilityScope.GROUP_BY)
        return visitor.visitRowsProjection(this, arg);
                return SQLQueryExpressionMapper.makeEmptyRowsModel(syntaxNode);

            }
        // so, move completion context to the place after the keyword and space
            return Interval.of(from, to);

import org.jkiss.dbeaver.model.lsm.sql.impl.syntax.SQLStandardParser;
        if (this.filterExprs.havingClause != null) {
        return fromSource;
    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, @NotNull T arg) {
                        }
                        }

 */
        if (it.hasNext() && it.next() instanceof STMTreeTermNode t1) {
import org.jkiss.code.Nullable;
            for (int i = 0; i < scopes.length; i++) {


                                } else {
    public SQLQueryRowsSourceModel getFromSource() {
        if (this.filterExprs.havingClause != null) {

                    tailScope = scope;
        SQLQueryRowsDataContext filtersContext = unresolvedResult.combine(resolvedResult);
                }

        SQLQueryRowsSourceModel source = sourceModels.isEmpty()
                    }
                STMTreeNode sublistNode = selectSublist.findFirstNonErrorChild();
                            }
            @NotNull SQLQueryRowsSourceModel fromSource,
        }
    @Nullable
                            } else {
        this.result = result;
            this.fromScope.setSymbolsOrigin(new SQLQuerySymbolOrigin.RowsSourceRef(context));
                tableExpr.findFirstChildOfName(STMKnownRuleNames.havingClause),
                        leadingNode = filterNodes[i - 1];
        public final T havingClause;
import java.util.EnumSet;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            this.filterExprs.orderByClause.resolveRowSources(resolvedContext, statistics);
import org.jkiss.dbeaver.model.sql.semantics.*;
            this.setTailOrigin(this.tailScope == this.fromScope ? this.fromSource.getTailOrigin() : this.tailScope.getSymbolsOrigin());
            for (STMTreeNode selectSublist : selectSublists) {
                            prevScopeIndex = scopeIndex;
            Interval i = t1.getRealInterval();
    @Nullable
        @NotNull STMTreeNode syntaxNode,
        Stream.of(filterScopes.whereClause, filterScopes.havingClause, filterScopes.groupByClause, filterScopes.orderByClause)
                    STMTreeNode leadingNode;
    private final SQLQueryLexicalScope tailScope;
        this.selectListScope = selectListScope;
        this.fromSource = fromSource;
            this.registerLexicalScope(fromScope);
        @NotNull SQLQueryRecognitionContext statistics
                            // derivedColumn: valueExpression (asClause)?; asClause: (AS)? columnName;
    @Nullable
    ) {
        private static final FiltersData<?> EMPTY = new FiltersData<>(null, null, null, null);
import org.jkiss.dbeaver.model.stm.STMTreeNode;
        }
                                    STMTreeNode columnNameNode = asClauseNode.findLastChildOfName(STMKnownRuleNames.columnName);
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryTupleRefEntry;
            this.filterScopes.havingClause.setSymbolsOrigin(new SQLQuerySymbolOrigin.RowsDataRef(clauseCtx));
            }
    private final FiltersData<SQLQueryLexicalScope> filterScopes;
    ) {
        return this.filterExprs.whereClause;
                        }
            @NotNull FiltersData<SQLQueryValueExpression> filterExprs,
            }
    protected SQLQueryRowsDataContext resolveRowDataImpl(
        STMTreeNode selectListNode = syntaxNode.findFirstChildOfName(STMKnownRuleNames.selectList);
            this.whereClause = where;
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;
                    } else {
import org.jkiss.dbeaver.model.sql.semantics.model.expressions.SQLQueryValueExpression;
                                    SQLQuerySymbolEntry asColumnName = columnNameNode == null
            {
    @NotNull
                            // error in query text, ignoring it
        this.tailScope = tailScope;
    }
        if (this.filterExprs.whereClause != null) {
        super(syntaxNode, fromSource, result, filterExprs.whereClause, filterExprs.havingClause, filterExprs.groupByClause, filterExprs.orderByClause);

        this.filterScopes = filterScopes;
            STMTreeNode limitNode = tableExpr.findFirstChildOfName(STMKnownRuleNames.limitClause);
        return this.filterExprs.orderByClause;
        return result;
        }
 * Copyright (C) 2010-2025 DBeaver Corp and others

                                SQLQueryTupleRefEntry tupleRefEntry = new SQLQueryTupleRefEntry(sublistNode);
    public SQLQueryValueExpression getHavingClause() {
    public SQLQueryValueExpression getOrderByClause() {
        @NotNull
                    int from;
package org.jkiss.dbeaver.model.sql.semantics.model.select;
                        leadingNode = tableExpr.findFirstNonErrorChild();
    private final SQLQueryLexicalScope fromScope;

            : sourceModels.get(0);
                tailScope = null;
    private static final Log log = Log.getLog(SQLQueryRowsProjectionModel.class);
                : unresolvedResult;

 * you may not use this file except in compliance with the License.
                ? filtersContext
    public interface ProjectionModelCtor {

                log.debug("SELECT keyword is missing in projection model");
                            if (STMKnownRuleNames.ASTERISK_TERM.equals(sublistNode.getNodeName())) {
            this.filterExprs.groupByClause.resolveValueRelations(clauseCtx, statistics);
        List<STMTreeNode> selectSublists = selectListNode.findChildrenOfName(STMKnownRuleNames.selectSublist);
            this.orderByClause = orderBy;
        SQLQueryRowsSourceModel apply(
                        leadingKeywordInterval = findLeadingKeywordsInterval(leadingNode);
    private static Interval findLeadingKeywordsInterval(@NotNull STMTreeNode node) {
                    }
    private final SQLQuerySelectionResultModel result; // selectList
            projectionModel = ctor.apply(

                            // TODO register these pieces in the lexical scope?
        if (this.fromScope != null) {

        // antlr give us interval end as the pos of the las symbol of the keyword
import org.jkiss.dbeaver.model.sql.SQLDialect.ProjectionAliasVisibilityScope;
            this.groupByClause = groupBy;

        }
        if (this.filterExprs.groupByClause != null) { // TODO consider dropping certain pseudocolumns
            );
        }
    }
        if (this.tailScope != null) {
            SQLQueryLexicalScope fromScope = new SQLQueryLexicalScope();
        }
        EnumSet<ProjectionAliasVisibilityScope> aliasVisibilities = this.getRowsSources().getDialect().getProjectionAliasVisibilityScope();
import java.util.List;
    }
    public static class FiltersData<T> {
        }
                        }
                            scopes[scopeIndex] = exprScope.lexicalScope;
            ? SQLQueryExpressionMapper.makeEmptyRowsModel(syntaxNode)
        @NotNull List<SQLQueryRowsSourceModel> sourceModels,
 * You may obtain a copy of the License at
    ) {
                                }
            @NotNull STMTreeNode syntaxNode,
        this.selectListScope.setSymbolsOrigin(new SQLQuerySymbolOrigin.RowsDataRef(unresolvedResult));
 * See the License for the specific language governing permissions and


        @NotNull List<SQLQueryRowsSourceModel> sourceModels,
            while (it.hasNext() && it.next() instanceof STMTreeTermNode t) {
                if (sublistNode != null) {
        } else {
 * DBeaver - Universal Database Manager
            .filter(s -> s.propagationPolicy.projected).toList();
        Iterator<STMTreeNode> it = node.getChildren().iterator();
            this.filterExprs.groupByClause.resolveRowSources(resolvedContext, statistics);
    }
                ? filtersContext
            @Nullable SQLQueryLexicalScope tailScope
            this.filterExprs.whereClause.resolveValueRelations(clauseCtx, statistics);
                    int to = nextScopeNodes[i] != null ? nextScopeNodes[i].getRealInterval().a : Integer.MAX_VALUE;
/*
                    if (leadingKeywordInterval != null) {
        @NotNull ProjectionModelCtor ctor


                            }
                    scope.setInterval(Interval.of(from, to));
        this.fromScope = fromScope;
        if (this.filterExprs.groupByClause != null) {
        try (SQLQueryModelRecognizer.LexicalScopeHolder selectListScopeHolder = recognizer.openScope()) {
}        public static <T> FiltersData<T> empty() {
            this.filterExprs.havingClause.resolveValueRelations(clauseCtx, statistics);
                    }
        return resolvedContext.reset();
    @Nullable
        @NotNull SQLQueryLexicalScope selectListScope,
        @NotNull FiltersData<SQLQueryLexicalScope> filterScopes,
            SQLQueryValueExpression[] filterExprs = new SQLQueryValueExpression[filterNodes.length];
        }
            SQLQueryRowsDataContext clauseCtx = aliasVisibilities.contains(ProjectionAliasVisibilityScope.HAVING)
            this.filterScopes.whereClause.setSymbolsOrigin(new SQLQuerySymbolOrigin.RowsDataRef(clauseCtx));
        @NotNull  SQLQueryModelRecognizer recognizer,
    ) {
            SQLQueryRowsDataContext clauseCtx = aliasVisibilities.contains(ProjectionAliasVisibilityScope.ORDER_BY)
                        default -> {
    }
                        try (SQLQueryModelRecognizer.LexicalScopeHolder exprScope = recognizer.openScope()) {
                        case SQLStandardParser.RULE_anyUnexpected -> {
    @Nullable
    }
import org.jkiss.dbeaver.Log;
                if (scope != null) {
            STMTreeNode[] filterNodes = new STMTreeNode[]{
            int from = i.a;
        @SuppressWarnings("unchecked")
                SQLQueryLexicalScope scope = scopes[i];
                                resultModel.addTupleSpec(sublistNode, tupleRef);
        SQLQuerySelectionResultModel resultModel = new SQLQuerySelectionResultModel(selectListNode, selectSublists.size());
        STMTreeNode tableExpr = syntaxNode.findFirstChildOfName(STMKnownRuleNames.tableExpression);
import java.util.stream.Stream;
                    }
                                        ? null
                for (int i = 0; i < filterNodes.length; i++) {

                                resultModel.addCompleteTupleSpec(sublistNode, tupleRefEntry);
        @NotNull STMTreeNode syntaxNode,
                    if (leadingNode != null) {
        }
            @NotNull SQLQueryLexicalScope selectListScope,
        if (tableExpr != null) {
                                    recognizer.registerScopeItem(tupleRef.getTupleRefEntry());
                tableExpr.findFirstChildOfName(STMKnownRuleNames.orderByClause)
                                        : recognizer.collectIdentifier(columnNameNode, null);
                                if (tupleRef.getTupleRefEntry() != null) {
            SQLQueryLexicalScope[] scopes = new SQLQueryLexicalScope[filterNodes.length + 1];
            return new FiltersData<T>(where, groupBy, having, orderBy);
 *
        this.filterExprs = filterExprs;
            selectListScope.setInterval(Interval.of(selectListScopeStart, syntaxNode.getRealInterval().b));
        @NotNull SQLQueryRowsSourceContext context,
        this.registerLexicalScope(selectListScope);
                                    resultModel.addColumnSpec(sublistNode, expr);
    }
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;
        @NotNull SQLQueryModelRecognizer recognizer

        }
                syntaxNode, selectListScope, source, fromScope,
    public SQLQueryValueExpression getWhereClause() {
 *     http://www.apache.org/licenses/LICENSE-2.0
                SQLQueryRowsProjectionModel.FiltersData.of(filterExprs[0], filterExprs[1], filterExprs[2], filterExprs[3]),
            this.filterExprs.whereClause.resolveRowSources(resolvedContext, statistics);

        public final T orderByClause;
    public SQLQuerySelectionResultModel getResult() {
                tableExpr.findFirstChildOfName(STMKnownRuleNames.whereClause),
                        // so we need to assume this last character and space after to find next position


            this.filterExprs.havingClause.resolveRowSources(resolvedContext, statistics);
                    if (filterNode != null) {


        return recognize(n, sourceModels, recognizer, SQLQueryRowsProjectionModel::new);
        @NotNull SQLQueryRowsSourceModel fromSource,
        SQLQueryRowsSourceModel projectionModel;

            return SQLQueryExpressionMapper.makeEmptyRowsModel(syntaxNode);
    protected SQLQueryRowsSourceContext resolveRowSourcesImpl(
    @Nullable
            );
                : unresolvedResult;
                    Interval leadingKeywordInterval = null;
 * Describes SELECT clause
            SQLQueryRowsDataContext clauseCtx = aliasVisibilities.contains(ProjectionAliasVisibilityScope.WHERE)
                        from = leadingKeywordInterval.b + 2;
            return null;
        }
    @FunctionalInterface

        public final T groupByClause;
            log.debug("Invalid querySpecification: missing selectList");
            if (limitNode != null) {
    @Override
        SQLQueryRowsSourceContext resolvedContext = this.fromSource.resolveRowSources(context, statistics).setCteSourcesFrom(context);
        STMTreeNode selectKeywordNode;

            return (FiltersData<T>) EMPTY;
import java.util.Objects;
        SQLQueryLexicalScope selectListScope;

        return this.filterExprs.havingClause;

    }
                scopes[0] = fromScope;
                                : recognizer.collectValueExpression(exprNode, selectListScope);
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryResultPseudoColumn;
                prevScopes[0] = selectListScope;
            STMTreeNode[] nextScopeNodes = new STMTreeNode[filterNodes.length + 1];
            this.filterScopes.groupByClause.setSymbolsOrigin(new SQLQuerySymbolOrigin.RowsDataRef(clauseCtx));
 * limitations under the License.
        @NotNull SQLQueryRowsDataContext context,
                ? filtersContext
                }
        @NotNull STMTreeNode n,

        List<SQLQueryResultPseudoColumn> resultPseudoColumns = unresolvedResult.getPseudoColumnsList().stream()
            this.filterScopes.orderByClause.setSymbolsOrigin(new SQLQuerySymbolOrigin.RowsDataRef(clauseCtx));
        SQLQueryRowsDataContext resolvedResult = this.getRowsSources().makeTuple(this, resultColumns, resultPseudoColumns);
    private final SQLQueryLexicalScope selectListScope;
        }
                            if (expr instanceof SQLQueryValueTupleReferenceExpression tupleRef) {
    @Override
        List<SQLQueryResultColumn> resultColumns = this.result.expandColumns(unresolvedResult, this, statistics);
            }
            projectionModel = ctor.apply(
 *
                to = t.getRealInterval().b;
                int prevScopeIndex = 0;
                                }
 * Licensed under the Apache License, Version 2.0 (the "License");
        public final T whereClause;

                SQLQueryRowsProjectionModel.FiltersData.of(scopes[1], scopes[2], scopes[3], scopes[4]),
        if (this.filterExprs.orderByClause != null) {
    
            SQLQueryLexicalScope[] prevScopes = new SQLQueryLexicalScope[filterNodes.length + 1];
        return projectionModel;
import org.jkiss.dbeaver.model.sql.semantics.model.expressions.SQLQueryValueTupleReferenceExpression;
        @Nullable SQLQueryLexicalScope fromScope,

    public SQLQueryValueExpression getGroupByClause() {
    ) {
            }
                                ? null

            .filter(Objects::nonNull).forEach(this::registerLexicalScope);
import java.util.Iterator;
    }
    }
                    if (i == 0) {
                            STMTreeNode exprNode = sublistNode.findFirstChildOfName(STMKnownRuleNames.valueExpression);
        }
                    } else {
            @NotNull FiltersData<SQLQueryLexicalScope> filterScopes,

    }
                syntaxNode, selectListScope, source, null, FiltersData.empty(), FiltersData.empty(), resultModel, selectListScope
        }
import org.jkiss.dbeaver.model.stm.STMTreeTermNode;
/**
        public static <T> FiltersData<T> of(T where, T groupBy, T having, T orderBy) {
    @NotNull
