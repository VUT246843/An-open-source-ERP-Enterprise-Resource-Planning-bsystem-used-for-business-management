            SQLQuerySymbolEntry columnRef = columnSpec.getColumnName();
        if (this.tableConstraintSpec != null) {
public class SQLQueryTableAlterActionSpec extends SQLQueryNodeModel {
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
                        SQLQuerySemanticUtils.propagateColumnDefinition(columnRef, rc, statistics, columnRefOrigin);
        if (this.columnName != null && this.columnName.isNotClassified()) {

    private final SQLQueryTableConstraintSpec tableConstraintSpec;
            // TODO validate if constraint is missing and produce a warning
    private final SQLQueryComplexName tableConstraintName;
                    } else {

                this.columnSpec.resolveRelations(dataContext, tableContext, statistics);
        this.columnName = columnName;
import org.jkiss.code.NotNull;
        this.tableConstraintSpec = tableConstraintSpec;
                } else {
                }
    ) {
    ) {
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;
        if (this.tableConstraintName != null) {
    /**
                SQLQueryResultColumn rc = tableContext.resolveColumn(statistics.getMonitor(), this.columnName.getName());
        this.actionKind = actionKind;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public SQLQueryTableConstraintSpec getTableConstraintSpec() {
    }
                    this.columnName.setOrigin(columnRefOrigin);
        @Nullable SQLQueryTableConstraintSpec tableConstraintSpec,
    @Nullable
    @Nullable
    @Nullable
                this.columnName.getSymbol().setSymbolClass(SQLQuerySymbolClass.COLUMN);

        @Nullable SQLQueryComplexName tableConstraintName
        }
        return this.columnSpec;
        @NotNull STMTreeNode syntaxNode,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    public void resolveRelations(
        this.tableConstraintName = tableConstraintName;
        @Nullable SQLQueryColumnSpec columnSpec,
    @NotNull
                if (columnRef.isNotClassified()) {
            }
        @Nullable SQLQueryRowsDataContext tableContext,

        }
                // a message that the table doesn't exist will appear, so no need additional warning here, I assume
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryResultColumn;
 * DBeaver - Universal Database Manager
        this.columnSpec = columnSpec;
    }
        @Nullable SQLQuerySymbolEntry columnName,
            }
        @NotNull SQLQueryRecognitionContext statistics
    @Override

                    if (tableContext != null) {
                        SQLQueryResultColumn rc = tableContext.resolveColumn(statistics.getMonitor(), columnName.getName());
     * Propagate semantics context and establish relations through the query model
                    }
                    statistics.appendWarning(this.columnName, "Column " + this.columnName.getName() + " not found");
                        columnRef.setOrigin(columnRefOrigin);
    @Nullable
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
    private final SQLQuerySymbolEntry columnName;

 *     http://www.apache.org/licenses/LICENSE-2.0
            } else {
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModel;
 */
    public SQLQueryColumnSpec getColumnSpec() {

    }

    protected SQLQueryTableAlterActionSpec(
                        columnName.setSymbolClass(SQLQuerySymbolClass.COLUMN);
        @NotNull SQLQueryRowsSourceContext dataContext,
                SQLQuerySymbol columnName = columnRef.getSymbol();
            if (columnRef != null) {
    @Nullable
                if (rc != null) {
    public SQLQueryTableAlterActionKind getActionKind() {
        @NotNull SQLQueryTableAlterActionKind actionKind,
    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, T arg) {
    }

        }
     */
import org.jkiss.code.Nullable;
        return visitor.visitAlterTableAction(this, arg);
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsSourceContext;
        if (this.columnSpec != null) {
import org.jkiss.dbeaver.model.sql.semantics.*;
    private final SQLQueryTableAlterActionKind actionKind;

                    SQLQuerySemanticUtils.propagateColumnDefinition(this.columnName, rc, statistics, columnRefOrigin);
/*
        }
        super(syntaxNode.getRealInterval(), syntaxNode, columnSpec, tableConstraintSpec);
}
                    this.columnName.getSymbol().setSymbolClass(SQLQuerySymbolClass.COLUMN);
            this.tableConstraintSpec.resolveRelations(dataContext, tableContext, statistics);
                        columnName.setDefinition(columnRef);
 * limitations under the License.
    private final SQLQueryColumnSpec columnSpec;
 * you may not use this file except in compliance with the License.
    @NotNull
        return this.actionKind;
        SQLQuerySymbolOrigin columnRefOrigin = tableContext == null ? null : new SQLQuerySymbolOrigin.ColumnNameFromRowsData(tableContext);
import org.jkiss.dbeaver.model.stm.STMTreeNode;

 * Unless required by applicable law or agreed to in writing, software
        return this.tableConstraintSpec;
    }
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;
    @Nullable
                }
 *
package org.jkiss.dbeaver.model.sql.semantics.model.ddl;
            if (tableContext != null) {

    }
import org.jkiss.dbeaver.model.sql.semantics.model.expressions.SQLQueryValueColumnReferenceExpression;
 *
