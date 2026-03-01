
                    this.tableName,
        @NotNull STMTreeNode syntaxNode,
        return this.tableName;
                    SQLQuerySymbolOrigin.DbObjectFilterMode.VALUE,
/**
    protected void resolveRowSourcesImpl(@NotNull SQLQueryRowsSourceContext context, @NotNull SQLQueryRecognitionContext statistics) {
import org.jkiss.code.Nullable;
        String name = this.tableName.getNameString();
 * You may obtain a copy of the License at
        this.tupleRefEntry = tupleRefEntry;
import org.jkiss.dbeaver.model.sql.semantics.*;
    }
                        this.tupleRefEntry.setOrigin(
 * limitations under the License.
                    SQLQuerySymbolClass.ERROR
                    this.tableName.parts.forEach(p -> p.getSymbol().setSymbolClass(SQLQuerySymbolClass.ERROR));
    @Nullable
                statistics.appendError(this.getSyntaxNode(), "Invalid tuple reference");
                SourceResolutionResult rr = context.getRowsSources().findReferencedSourceExact(this.tableName);
        @NotNull SQLQueryComplexName tableName,
 * Describes several columns from the table
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (this.tableName.isNotClassified()) {
    public SQLQuerySymbolClass getAssociatedSymbolClass() {

    @Nullable
        String type = this.type == null ? "<NULL>" : this.type.toString();


    public SQLQueryRowsSourceModel getTupleSource() {
                    tableNameOrigin,

import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryMemberAccessEntry;
    public SQLQueryValueTupleReferenceExpression(
 * Copyright (C) 2010-2025 DBeaver Corp and others
        return visitor.visitValueTupleRefExpr(this, arg);
import org.jkiss.dbeaver.model.sql.semantics.context.*;
                if (rr != null) {
}        return "TupleReference[" + name + ":" + type + "]";
            result = this.type;
    
            } else {
            SQLQuerySymbolOrigin tableNameOrigin = new SQLQuerySymbolOrigin.RowsDataRef(context);
    private SQLQueryRowsSourceModel tupleSource = null;
        return result;

    ) {
        return this.tupleRefEntry;
                );
                    if (this.tupleRefEntry != null) {
                        this.tableName.syntaxNode,
import org.jkiss.dbeaver.model.stm.STMTreeNode;
 *
 */
    @Nullable
    protected SQLQueryExprType resolveValueTypeImpl(
        this.memberAccessEntry = memberAccessEntry;
    }
            }
 * you may not use this file except in compliance with the License.
    
    }
        this.tableName = tableName;
 * Unless required by applicable law or agreed to in writing, software

        SQLQueryExprType result;
        @Nullable SQLQueryMemberAccessEntry memberAccessEntry,
    @Override

                        this.memberAccessEntry.setOrigin(new SQLQuerySymbolOrigin.ColumnRefFromReferencedContext(rr));
    }
    }

    }
                    }
import java.util.Set;
    @Override
import org.jkiss.dbeaver.model.impl.struct.RelationalObjectType;
                    }

    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
                result = SQLQueryExprType.UNKNOWN;
    @Override
    }
        return SQLQuerySemanticUtils.getIdentifierSymbolClass(this.tableName);
        super(syntaxNode);
public class SQLQueryValueTupleReferenceExpression extends SQLQueryValueExpression {
    private final SQLQueryComplexName tableName;
                }
                    statistics,
    private final SQLQueryTupleRefEntry tupleRefEntry;

    @NotNull 
    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, @NotNull T arg) {
    @Nullable
 * DBeaver - Universal Database Manager
    @NotNull
    @Nullable
    ) {
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
                    result = SQLQueryExprType.forReferencedRow(this.tableName, rr);
 */
                    this.tupleSource = rr.source;
    public String toString() {
                            new SQLQuerySymbolOrigin.ExpandableRowsTupleRef(this.getSyntaxNode(), context, rr)

    private final SQLQueryMemberAccessEntry memberAccessEntry;
    public SQLQueryComplexName getTableName() {
                } else {
        @Nullable SQLQueryTupleRefEntry tupleRefEntry
                    );
                    SQLQuerySemanticUtils.setNamePartsDefinition(this.tableName, rr, tableNameOrigin);
                    context.getRowsSources(),
        }
        return this.tupleSource;
    @Nullable
        @NotNull SQLQueryRecognitionContext statistics
        @NotNull SQLQueryRowsDataContext context,
    @Override
package org.jkiss.dbeaver.model.sql.semantics.model.expressions;
 *
                        );
    @Override
            if (this.tableName.invalidPartsCount == 0) {

 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.sql.semantics.model.select.SQLQueryRowsSourceModel;
                    result = SQLQueryExprType.UNKNOWN;
                    if (this.memberAccessEntry != null) {
    public SQLQueryTupleRefEntry getTupleRefEntry() {
        } else {
                SQLQuerySemanticUtils.performPartialResolution(
    @NotNull 
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryTupleRefEntry;

                        "Table or subquery " + this.tableName.getNameString() + " not found"
                    statistics.appendError(
