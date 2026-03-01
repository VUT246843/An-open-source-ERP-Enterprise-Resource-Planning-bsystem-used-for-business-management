        STMKnownRuleNames.selectStatementSingleRow, (n, cc, r) -> {

                    SQLQueryRowsSetCorrespondingOperationKind opKind = switch (childNode.getNodeKindId()) {
 */
import org.jkiss.code.NotNull;
                        rows.addLast(Collections.emptyList());
                return source;
    public SQLQueryExpressionMapper(@NotNull SQLQueryModelRecognizer recognizer) {
                                subquerySource,

        }
            return source;
                                                ))
            // TODO column reference at PARTITION clause
import org.jkiss.dbeaver.model.lsm.sql.impl.syntax.SQLStandardParser;
                                        yield new SQLQueryRowsNaturalJoinModel(
import java.util.*;
        STMKnownRuleNames.explicitTable, (n, cc, r) -> r.collectTableReference(n, false),
                                    subqueryTailScope = new SQLQueryLexicalScope();
                    resultQuery = makeEmptyRowsModel(n.findLastNonErrorChild());
            return SQLQuerySelectIntoModel.recognize(n, cc, r);
        STMTreeNode parent = current.getParentNode();
                SQLQueryRowsSourceModel resultQuery = cc.get(cc.size() - 1);
/*
                                "Unexpected child node kind at queryExpression: " + childNode.getNodeName());
                    rows.addLast(values);
                            STMTreeNode subqueryNameNode = cteSubqueryNode.findFirstChildOfName(STMKnownRuleNames.queryName);
                    }
                }
                                cteSubqueryNode,
                } else {
            List<List<SQLQueryValueExpression>> rows = new LinkedList<>();
        return new SQLQueryRowsTableValueModel(n, Collections.emptyList(), true);
                    } else {
                                            nextSource,
                                    }
        STMKnownRuleNames.directSqlDataStatement, (n, cc, r) -> {

                                            int condScopeEnd = columnsSpecNode
                        Interval range = Interval.of(n.getRealInterval().a, childNode.getRealInterval().b);
        private final Map<STMTreeNode, SQLQueryRowsSourceModel> subsourceByNode;
                                Optional<STMTreeNode> joinSpecificationNode = Optional.ofNullable(childNode.findFirstChildOfName(STMKnownRuleNames.joinSpecification));
    );
        STMKnownRuleNames.queryTerm,
                        source = switch (childNode.getNodeKindId()) {
import org.jkiss.dbeaver.model.stm.STMTreeNode;
                STMTreeNode firstTermChild = n.findFirstNonErrorChild() instanceof STMTreeTermNode t ? t : null; // FROM term
                    return new SQLQueryRowsCteModel(n, cteSubqueries, resultQuery);
import org.jkiss.dbeaver.model.stm.STMTreeTermNode;
    }

    @NotNull
                List<SQLQueryRowsSourceModel> subqueries = cc.subList(0, cc.size() - 1);
            STMTreeNode correlationSpecNode = n.findLastChildOfName(STMKnownRuleNames.correlationSpecification);
                    };
    /**
                                                .ifPresent(kw -> condScope.lexicalScope.setInterval(Interval.of(kw.getRealInterval().b + 2, Integer.MAX_VALUE)));
                source = makeEmptyRowsModel(n);
                        STMTreeNode lastTermChild = nextSource != null ? null : STMUtils.expandTerms(childNode).getLast();
                source = new SQLQueryRowsTableProcModel(r.collectFunctionCall(callNode, null, true));
            // can they both be missing?
                    source = new SQLQueryRowsSetCorrespondingOperationModel(range, childNode, source, nextSource, corresponding, opKind);
                        }
            SQLQueryRowsSourceModel source;
import org.jkiss.dbeaver.model.sql.semantics.model.expressions.SQLQueryValueFlattenedExpression;
                }
                                        ? r.collectValueExpression(vn, null)
                SQLQueryRowsSourceModel source = subsources.getOrEmpty(childNodes.get(0));

    }
            current = parent;
                            if (subqueryNode != null){
                    STMTreeNode cteListNode = withNode.findLastChildOfName(STMKnownRuleNames.cteList);
                return makeEmptyRowsModel(n);
                    Interval range = Interval.of(n.getRealInterval().a, childNode.getRealInterval().b);
import org.jkiss.dbeaver.model.sql.semantics.model.expressions.SQLQueryValueExpression;
import org.jkiss.dbeaver.model.sql.semantics.model.expressions.SQLQueryValueTupleReferenceExpression;
                                                ));
                                        );
 * See the License for the specific language governing permissions and
        STMKnownRuleNames.fromClause, (n, cc, r) -> {
                                    );
            if (cc.isEmpty()) {

            }
                source = cc.getFirst();
                    } else {
            if (cc.isEmpty()) {
            if (correlationSpecNode != null) {
                        Interval range = Interval.of(n.getRealInterval().a, childNode.getRealInterval().b);
                            cteSubqueries.add(new SQLQueryRowsCteSubqueryModel(
                            throw new UnsupportedOperationException("Unexpected child node kind at queryExpression: " + childNode.getNodeName());

                                }
import org.jkiss.code.Nullable;
                                            (List<SQLQuerySymbolEntry>) null,
                    } else if (cc.isEmpty()) {
                    List<SQLQuerySymbolEntry> corresponding = r.collectColumnNameList(childNode);
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        STMKnownRuleNames.nonJoinQueryExpression,
                                        if (joinConditionNode.isPresent()) {
                                STMTreeNode subqueryTrailingNode = subqueryNode.findLastChildOfName(STMKnownRuleNames.RIGHT_PAREN_TERM);

 * Licensed under the Apache License, Version 2.0 (the "License");
                    SQLQueryRowsSetCorrespondingOperationKind opKind = switch (childNode.getNodeKindId()) {
                        default ->
        STMKnownRuleNames.naturalJoinTerm,
                for (STMTreeNode childNode : childNodes.subList(1, childNodes.size())) {
                List<STMTreeNode> restChilds = n.findChildrenOfName(STMKnownRuleNames.fromClauseTerm);
                    SQLQueryLexicalScope aliasesScope = new SQLQueryLexicalScope(correlationColumNames.size() + 1);
                return makeEmptyRowsModel(n);
        @Nullable
                    SQLQueryRowsSourceModel nextSource = subsources.getOrEmpty(childNode);
            List<STMTreeNode> rowNodes = n.findChildrenOfName(STMKnownRuleNames.rowValueConstructor);
                List<STMTreeNode> childNodes = n.findNonErrorChildren();
                                    if (joinSpecificationNode.isPresent()) {
        STMKnownRuleNames.exceptTerm,
                            }
        STMKnownRuleNames.nonjoinedTableReference, (n, cc, r) -> {
                                    STMTreeNode vn = en.findFirstNonErrorChild();
            }
                        final SQLQueryRowsSourceModel currSource = source;
            } else {
    private static final Map<String, TreeMapperCallback<SQLQueryRowsSourceModel, SQLQueryModelRecognizer>> translations = Map.of(
        STMKnownRuleNames.withClause,
                                            isLateral,
            this.subsourceByNode = new HashMap<>(subqueries.size());
                        case SQLStandardParser.RULE_exceptTerm -> SQLQueryRowsSetCorrespondingOperationKind.EXCEPT;
                        };
                source = makeEmptyRowsModel(subrootsChild);
        STMKnownRuleNames.querySpecification, (n, cc, r) -> {
                return null;
        STMKnownRuleNames.derivedTable,
            }
                                                .orElseGet(() -> new SQLQueryRowsNaturalJoinModel(
                                                .map(cn -> cn.getRealInterval().a)
 * DBeaver - Universal Database Manager
                return cc.get(0);
            for (SQLQueryRowsSourceModel subquery : subqueries) {
                        // TODO subquery as table-value rows source

            return SQLQueryRowsProjectionModel.recognize(n, cc, r);
            }
        STMKnownRuleNames.fromClauseTerm,
                    aliasesScope.registerItem(correlationName);
                                                .map(cn -> r.collectValueExpression(cn, condScope.lexicalScope))
                                try (SQLQueryModelRecognizer.LexicalScopeHolder condScope = r.openScope()) {
            } else {
            } else if (callNode != null) {
import org.jkiss.dbeaver.model.stm.STMKnownRuleNames;
    private static STMTreeNode findImmediateChild(STMTreeNode subroot, STMTreeNode deeperChild) {
                            STMTreeNode columnListNode = cteSubqueryNode.findFirstChildOfName(STMKnownRuleNames.columnNameList);
            if (cc.isEmpty()) {
                                                .filter(cn -> cn instanceof STMTreeTermNode) // after the whitespace following the inclusive end position
                SQLQueryRowsSourceModel source = subsources.getOrEmpty(childNodes.get(0));
                        : List.of(r.collectValueExpression(actualValueNode, null));
                            SQLQueryRowsSetCorrespondingOperationKind.INTERSECT;
        STMKnownRuleNames.explicitTable
                }
import org.jkiss.dbeaver.Log;
                                                .map(cn -> cn.findLastChildOfName(STMKnownRuleNames.RIGHT_PAREN_TERM))
                    List<SQLQueryValueExpression> values = actualValueNode == null
            if (!cc.isEmpty()) {
        }


            if (cc.isEmpty()) {
                                            yield joinConditionNode.map(cn -> cn.findFirstChildOfName(STMKnownRuleNames.searchCondition))

                                                .map(e -> new SQLQueryRowsNaturalJoinModel(
        STMKnownRuleNames.simpleTable,
                    List<SQLQueryRowsCteSubqueryModel> cteSubqueries = new ArrayList<>();
}
 *
                    SQLQueryRowsSourceModel nextSource = subsources.getOrEmpty(childNode);
     * Prepare fake table rows source used to represent invalid query fragments when the adequate semantic model item cannot be constructed
                    correlationColumNames.forEach(aliasesScope::registerItem);
                                        : new SQLQueryValueFlattenedExpression(en, Collections.emptyList());

    private static final Set<String> queryExpressionSubtreeNodeNames = Set.of(

                            List<SQLQuerySymbolEntry> columnList = columnListNode == null
                SubsourcesMap subsources = new SubsourcesMap(cc, n);

                        if (lastTermChild != null) {
        STMKnownRuleNames.unionTerm,
                    }
                                new SQLQueryRowsCrossJoinModel(range, childNode, currSource, nextSource, rightTableScope, isLateral);
            return this.subsourceByNode.get(subrootsChild);
                for (STMTreeNode childNode : childNodes.subList(1, childNodes.size())) {
        }
        },
                                columnList,
                    source.registerLexicalScope(aliasesScope);
                if (valueNode != null) {
        },
                                .map(en -> {
                SQLQueryRowsSourceModel source = subsources.getOrEmpty(firstChild);
        public SubsourcesMap(@NotNull List<SQLQueryRowsSourceModel> subqueries, @NotNull STMTreeNode subroot) {
                    rightTableScope.setInterval(Interval.of(firstTermChild.getRealInterval().b + 1, Integer.MAX_VALUE));
        STMKnownRuleNames.joinedTable,
            if (cc.isEmpty()) {
                    hasErrors |= rowNode.hasErrorChildren() || valueNode.hasErrorChildren();
        STMKnownRuleNames.tableReference,

        },
            } else {
                }
                SQLQueryRowsSourceModel source = subsources.getOrEmpty(childNodes.get(0));
                if (correlationName != null) {
                            STMKnownRuleNames.rowValueConstructorElement).stream()
            STMTreeNode tableNode = n.findFirstChildOfName(STMKnownRuleNames.tableName);
                            case SQLStandardParser.RULE_naturalJoinTerm -> {
        return current;
                            ));
                for (STMTreeNode childNode : childNodes.subList(1, childNodes.size())) {
 * Unless required by applicable law or agreed to in writing, software
                                            columnsSpecNode
                            SQLQuerySymbolEntry subqueryName = subqueryNameNode == null ? null : r.collectIdentifier(subqueryNameNode, null);
        STMKnownRuleNames.selectStatementSingleRow,
                    source = new SQLQueryRowsCorrelatedSourceModel(n, source, correlationName, correlationColumNames);
                source = r.collectTableReference(tableNode, false);
                            }
                            SQLQueryRowsSourceModel subquerySource = subsources.getOrEmpty(cteSubqueryNode);
                                                    (SQLQueryValueExpression) null, condScope.lexicalScope
                }
            parent = current.getParentNode();
                                            currSource,
                        hasErrors |= rowNode.hasErrorChildren() || rowValuesNode.hasErrorChildren();
            } else {
                                        Interval.of(subquerySource.getInterval().b + 1, subqueryTrailingNode.getRealInterval().a - 1)
        STMKnownRuleNames.nonJoinQueryTerm,
        STMKnownRuleNames.fromClause,
                                    } else {
                SubsourcesMap subsources = new SubsourcesMap(cc, n);

            return new SQLQueryRowsTableValueModel(n, rows, hasErrors);
                        case SQLStandardParser.RULE_intersectTerm ->
        STMKnownRuleNames.sqlQuery,
        STMKnownRuleNames.queryPrimary,
                        List<SQLQueryValueExpression> values = rowValuesNode.findChildrenOfName(
                return makeEmptyRowsModel(n);
import org.jkiss.dbeaver.model.sql.semantics.model.dml.SQLQuerySelectIntoModel;
                this.subsourceByNode.put(subrootChild, subquery);
        STMKnownRuleNames.tableExpression,
            for (STMTreeNode rowNode : rowNodes) {
                    if (!(childNode instanceof STMTreeTermNode)) {


                                subqueryName,
            STMTreeNode callNode = n.findFirstChildOfName(STMKnownRuleNames.functionCallExpression);
package org.jkiss.dbeaver.model.sql.semantics;
        public SQLQueryRowsSourceModel getOrEmpty(STMTreeNode subrootsChild) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.sql.semantics.model.select.*;
                    Interval range = Interval.of(n.getRealInterval().a, childNode.getRealInterval().b);
        STMKnownRuleNames.with_list_element,
                }
            if (source == null) {
public class SQLQueryExpressionMapper extends SQLQueryTreeMapper<SQLQueryRowsSourceModel, SQLQueryModelRecognizer> {
                } else {
import org.antlr.v4.runtime.misc.Interval;
                                : r.collectColumnNameList(columnListNode);
                                            childNode,
            } else {
                STMTreeNode firstChild = n.findFirstChildOfName(STMKnownRuleNames.tableReference);
                                            Optional<STMTreeNode> columnsSpecNode = joinSpecificationNode
                        // certain tableReference subtree was not recognized correctly, consider error message
import org.jkiss.dbeaver.model.stm.STMUtils;
                                            );
                return source;
        STMKnownRuleNames.nonJoinQueryTerm, (n, cc, r) -> {
                if (withNode != null) {
        },
 * distributed under the License is distributed on an "AS IS" BASIS,
                    if (rowValuesNode != null) {
                        rows.addLast(values);
                                        }
                    if (cteListNode != null) {
        super(SQLQueryRowsSourceModel.class, queryExpressionSubtreeNodeNames, translations, recognizer);
                            SQLQueryLexicalScope subqueryTailScope = null;
                                            yield new SQLQueryRowsNaturalJoinModel(
            } else if (cc.size() == 1) {
        STMKnownRuleNames.subquery,
                                if (subqueryTrailingNode != null) {
        STMKnownRuleNames.cteList,
                List<STMTreeNode> childNodes = n.findNonErrorChildren();
 *     http://www.apache.org/licenses/LICENSE-2.0
                    // TODO use r.openScope() instead?
                    List<SQLQuerySymbolEntry> corresponding = r.collectColumnNameList(childNode);
                    }
                        SQLQueryLexicalScope rightTableScope = lastTermChild == null ? null : new SQLQueryLexicalScope();
        STMKnownRuleNames.nonJoinQueryPrimary,
                                    subqueryTailScope.setInterval(
                    };
                            default -> throw new UnsupportedOperationException(
    public static SQLQueryRowsSourceModel makeEmptyRowsModel(STMTreeNode n) {
                SQLQueryLexicalScope rightTableScope = firstTermChild != null ? new SQLQueryLexicalScope() : null;
        STMKnownRuleNames.joinedTable, (n, cc, r) -> {
                STMTreeNode correlationNameNode = correlationSpecNode.findFirstChildOfName(STMKnownRuleNames.correlationName);
                                            joinSpecificationNode.map(cn -> cn.findFirstNonErrorChild())
                }

                                ? Collections.emptyList()
        STMKnownRuleNames.crossJoinTerm,
                List<STMTreeNode> childNodes = n.findNonErrorChildren();
        },
                    List<SQLQuerySymbolEntry> correlationColumNames = r.collectColumnNameList(correlationSpecNode);
            }
                            STMTreeNode subqueryNode = cteSubqueryNode.findLastChildOfName(STMKnownRuleNames.subquery);
            }
     */
                if (findImmediateChild(n, resultQuery.getSyntaxNode()) != n.findLastNonErrorChild()) {
                            rightTableScope.setInterval(Interval.of(lastTermChild.getRealInterval().b + 1, Integer.MAX_VALUE));
            SQLQueryRowsSourceModel source = this.subsourceByNode.get(subrootsChild);
                                }

            }
        }
                                                .ifPresent(cn -> condScope.lexicalScope.setInterval(Interval.of(cn.getRealInterval().b + 1, condScopeEnd)));
                            throw new UnsupportedOperationException("Unexpected child node kind at nonJoinQueryTerm: " + childNode.getNodeName());
            }
        STMKnownRuleNames.queryExpression, (n, cc, r) -> {
                                            rightTableScope,
                SQLQuerySymbolEntry correlationName = correlationNameNode == null ? null : r.collectIdentifier(correlationNameNode, null);
                    }
                                        } else {
                                    return vn != null
        STMKnownRuleNames.selectStatement,
                return source;
 * you may not use this file except in compliance with the License.
                                                    e, condScope.lexicalScope
        STMKnownRuleNames.nonjoinedTableReference,

            // joinedTable: (nonjoinedTableReference|(LeftParen joinedTable RightParen)) (naturalJoinTerm|crossJoinTerm)+;
        STMKnownRuleNames.queryExpression,
                        case SQLStandardParser.RULE_unionTerm -> SQLQueryRowsSetCorrespondingOperationKind.UNION;
    }
    }
        },
                SubsourcesMap subsources = new SubsourcesMap(cc, n);
                SubsourcesMap subsources = new SubsourcesMap(cc, n);
 *
                    if (nextSource != null) {
    @NotNull
                return source;
                                            range,
                                                range, childNode, currSource, nextSource, rightTableScope, isLateral,
                }
                        final SQLQueryRowsSourceModel nextSource = subsources.getOrNull(childNode);
            return source;
    private static class SubsourcesMap {
                    source = new SQLQueryRowsSetCorrespondingOperationModel(range, childNode, source, nextSource, corresponding, opKind);
                                                    range, childNode, currSource, nextSource, rightTableScope, isLateral,
                                                .map(cn -> cn.findFirstNonErrorChild()) // condition scope starts after the ON keyword when present
                STMTreeNode subrootChild = findImmediateChild(subroot, subquery.getSyntaxNode());
                STMTreeNode withNode = n.findFirstChildOfName(STMKnownRuleNames.withClause);
            } else if (tableNode != null) {
                    STMTreeNode actualValueNode = valueNode.findFirstNonErrorChild();
            }
        },
        }
                                                .orElse(Integer.MAX_VALUE);
                                Optional<STMTreeNode> joinConditionNode = joinSpecificationNode.map(cn -> cn.findFirstChildOfName(STMKnownRuleNames.joinCondition));
                                            condScope.lexicalScope
            } else {
                        boolean isLateral = childNode.findFirstChildOfName(STMKnownRuleNames.LATERAL_TERM) != null;
                        default ->
                                subqueryTailScope
                    SQLQueryRowsSourceModel nextSource = subsources.getOrEmpty(childNode);
                        SubsourcesMap subsources = new SubsourcesMap(subqueries, cteListNode);
        STMKnownRuleNames.tableSubquery,
                            case SQLStandardParser.RULE_crossJoinTerm ->
                                                .map(cn -> cn.findFirstChildOfName(STMKnownRuleNames.LEFT_PAREN_TERM))
        },
    private static final Log log = Log.getLog(SQLQueryExpressionMapper.class);
            }
        STMTreeNode current = deeperChild;
                        ? Collections.emptyList()
                        source = new SQLQueryRowsCrossJoinModel(range, childNode, source, nextSource, rightTableScope, isLateral);
                if (firstTermChild != null) {
                        boolean isLateral = childNode.findFirstChildOfName(STMKnownRuleNames.LATERAL_TERM) != null;
        STMKnownRuleNames.directSqlDataStatement,
            boolean hasErrors = false;
        STMKnownRuleNames.querySpecification,
 * You may obtain a copy of the License at
                STMTreeNode valueNode = rowNode.findFirstChildOfName(STMKnownRuleNames.rowValueConstructorElement);

        @NotNull
        STMKnownRuleNames.intersectTerm,
                for (STMTreeNode childNode : restChilds) {
                                                .map(cn -> cn.findFirstNonErrorChild());
                        }
                                }).toList();
                return makeEmptyRowsModel(n);
        public SQLQueryRowsSourceModel getOrNull(@NotNull STMTreeNode subrootsChild) {
                    STMTreeNode rowValuesNode = rowNode.findFirstChildOfName(STMKnownRuleNames.rowValueConstructorList);
 *
        while (parent != subroot && parent != null) {
        STMKnownRuleNames.tableValueConstructor, (n, cc, r) -> {
                                                    range, childNode, currSource, nextSource, rightTableScope, isLateral,
    );
                    return new SQLQueryRowsCteModel(n, Collections.emptyList(), resultQuery);
                        for (STMTreeNode cteSubqueryNode : cteListNode.findChildrenOfName(STMKnownRuleNames.with_list_element)) {
                                                r.collectColumnNameList(childNode), condScope.lexicalScope
                }
                        // TODO see second case of the first source if parens are correctly ignored here
