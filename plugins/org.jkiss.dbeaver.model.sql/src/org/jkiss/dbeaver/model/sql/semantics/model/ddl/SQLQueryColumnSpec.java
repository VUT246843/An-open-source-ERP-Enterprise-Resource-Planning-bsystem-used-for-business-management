 */
                .map(recognizer::collectQualifiedName)
        STMKnownRuleNames.columnConstraintNotNull, SQLQueryColumnConstraintKind.NOT_NULL,
    }
        STMKnownRuleNames.referencesSpecification, SQLQueryColumnConstraintKind.REFERENCES,
        }
        STMKnownRuleNames.columnConstraintUnique, SQLQueryColumnConstraintKind.UNIQUE,
            SQLQueryValueExpression checkExpression = null;

        return this.typeName;
     * Propagate semantics context and establish relations through the query model
    @Nullable
    private final String typeName;
                        STMTreeNode refNode = constraintNode.findFirstChildOfName(STMKnownRuleNames.referencedTableAndColumns);
    }
        for (STMTreeNode subnode : node.findChildrenOfName(STMKnownRuleNames.columnConstraintDefinition)) {
        if (this.defaultValueExpression != null && tableDataContext != null) {
                subnode.findFirstChildOfName(STMKnownRuleNames.constraintNameDefinition)
 * You may obtain a copy of the License at
    }
                        if (refNode != null) {
import org.jkiss.dbeaver.model.sql.semantics.model.select.SQLQueryRowsTableDataModel;
    private final List<SQLQueryColumnConstraintSpec> constraints;
            } else {
    @Nullable

            .map(STMTreeNode::getTextContent).orElse(null);
     */
import org.jkiss.code.NotNull;
        @Nullable SQLQuerySymbolEntry columnName,
 * See the License for the specific language governing permissions and
        this.constraints.forEach(this::registerSubnode);
        @Nullable SQLQueryValueExpression defaultValueExpression,
import java.util.Optional;
    @Override
            SQLQueryRowsTableDataModel referencedTable = null;
    @Nullable
        return this.defaultValueExpression;
    @Nullable
    public List<SQLQueryColumnConstraintSpec> getConstraints() {

            }
 * Copyright (C) 2010-2025 DBeaver Corp and others
            this.defaultValueExpression.resolveValueRelations(tableDataContext, statistics);
    public SQLQueryColumnSpec(
    @Nullable
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.stm.STMTreeNode;

 *
                            referencedColumns = recognizer.collectColumnNameList(refNode);
    public static SQLQueryColumnSpec recognize(SQLQueryModelRecognizer recognizer, STMTreeNode node) {
        return visitor.visitColumnSpec(this, arg);
        STMKnownRuleNames.checkConstraintDefinition, SQLQueryColumnConstraintKind.CHECK
 * Licensed under the Apache License, Version 2.0 (the "License");

                .orElse(null);
                switch (constraintKind) {
 * DBeaver - Universal Database Manager
    @Nullable
            constraintSpec.resolveRelations(rowsContext, tableDataContext, statistics);
            SQLQueryComplexName constraintName = Optional.ofNullable(
            List<SQLQuerySymbolEntry> referencedColumns = null;
    }
import java.util.LinkedList;
            ? null
        this.defaultValueExpression = defaultValueExpression;
        @NotNull STMTreeNode syntaxNode,
    private final SQLQueryValueExpression defaultValueExpression;

    }
 *
import org.jkiss.dbeaver.model.sql.semantics.*;
        return this.constraints;

 * limitations under the License.
import java.util.Map;
    public SQLQueryValueExpression getDefaultValueExpression() {
    }
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsSourceContext;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            SQLQueryColumnConstraintKind constraintKind;

        super(syntaxNode.getRealInterval(), syntaxNode, defaultValueExpression);
        STMTreeNode defaultValueNode = node.findFirstChildOfName(STMKnownRuleNames.defaultClause);
            ).map(n -> n.findFirstChildOfName(STMKnownRuleNames.constraintName))
                }
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryExprType;
            STMTreeNode constraintNode = Optional.ofNullable(subnode.findFirstChildOfName(STMKnownRuleNames.columnConstraint))
    }
import org.jkiss.dbeaver.model.sql.semantics.model.expressions.SQLQueryValueExpression;
 *
                        checkExpression = recognizer.collectValueExpression(constraintNode, null);

                constraintKind = SQLQueryColumnConstraintKind.UNKNOWN;
        String typeName = Optional.ofNullable(node.findFirstChildOfName(STMKnownRuleNames.dataType))

    public SQLQuerySymbolEntry getColumnName() {
 * Unless required by applicable law or agreed to in writing, software
    private static final Map<String, SQLQueryColumnConstraintKind> constraintKindByNodeName = Map.of(
    }

/*
                        }
                    }
        }
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;
 * distributed under the License is distributed on an "AS IS" BASIS,
    /**
        for (SQLQueryColumnConstraintSpec constraintSpec : this.constraints) {


    @NotNull
        this.typeName = typeName;
            this.defaultValueExpression.resolveRowSources(tableDataContext.getRowsSources(), statistics);
        STMKnownRuleNames.columnConstraintPrimaryKey, SQLQueryColumnConstraintKind.PRIMARY_KEY,
                .map(STMTreeNode::findFirstNonErrorChild).orElse(null);
import java.util.List;
 * you may not use this file except in compliance with the License.
        @NotNull SQLQueryRowsSourceContext rowsContext,
                constraintKind = constraintKindByNodeName.get(constraintNode.getNodeName());

        LinkedList<SQLQueryColumnConstraintSpec> constraints = new LinkedList<>();
    private final SQLQuerySymbolEntry columnName;
    public String getTypeName() {
            .map(n -> recognizer.collectIdentifier(n, null))
            : recognizer.collectValueExpression(defaultValueNode, null);
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull SQLQueryRecognitionContext statistics
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;

public class SQLQueryColumnSpec extends SQLQueryNodeModel {
    @NotNull
        return this.typeName != null ? SQLQueryExprType.forExplicitTypeRef(this.typeName) : SQLQueryExprType.UNKNOWN;

        return this.columnName;
        return new SQLQueryColumnSpec(node, columnName, typeName, defaultValueExpr, constraints);
        @NotNull List<SQLQueryColumnConstraintSpec> constraints
    }
        @Nullable String typeName,
                    case CHECK ->
        SQLQuerySymbolEntry columnName = Optional.ofNullable(node.findFirstChildOfName(STMKnownRuleNames.columnName))
                    case REFERENCES -> {
    );
    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, T arg) {

                            referencedTable = recognizer.collectTableReference(refNode, true);
            if (constraintNode != null) {
        SQLQueryValueExpression defaultValueExpr = defaultValueNode == null
import org.jkiss.dbeaver.model.stm.STMKnownRuleNames;
        this.columnName = columnName;
}        this.constraints = List.copyOf(constraints);
    ) {
package org.jkiss.dbeaver.model.sql.semantics.model.ddl;
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModel;
        @Nullable SQLQueryRowsDataContext tableDataContext,
    ) {

    public SQLQueryExprType getDeclaredColumnType() {
            constraints.addLast(new SQLQueryColumnConstraintSpec(subnode, constraintName, constraintKind, referencedTable, referencedColumns, checkExpression));
    public void resolveRelations(

        }
            .orElse(null);

