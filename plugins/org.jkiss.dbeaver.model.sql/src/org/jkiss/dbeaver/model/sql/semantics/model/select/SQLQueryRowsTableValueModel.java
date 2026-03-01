        @NotNull SQLQueryRowsDataContext context,
 * Licensed under the Apache License, Version 2.0 (the "License");
                        )
    @NotNull
}                if (rowIndex == 0) {
        super(syntaxNode);
import org.jkiss.dbeaver.model.sql.semantics.SQLQuerySymbol;

        int rowIndex = 0;
    }
 * you may not use this file except in compliance with the License.
        return this.rows.isEmpty() ? Collections.emptyList() : this.rows.getFirst();
    private final List<List<SQLQueryValueExpression>> rows;
 * You may obtain a copy of the License at
/**
                    resultColumns.addLast(
 *
import org.jkiss.dbeaver.model.stm.STMTreeNode;
        @NotNull List<List<SQLQueryValueExpression>> rows,
        LinkedList<SQLQueryResultColumn> resultColumns = new LinkedList<>();
    protected SQLQueryRowsDataContext resolveRowDataImpl(

 * Describes a table constructed by VALUES clause
        boolean isIncomplete
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;
    public List<SQLQueryValueExpression> getValues() {
        return this.isIncomplete ? context.resetAsUnresolved() : context.reset();
    ) {
        @NotNull SQLQueryRowsSourceContext context,
        @NotNull STMTreeNode syntaxNode,
    }

    ) {
import java.util.List;
    @NotNull
 * See the License for the specific language governing permissions and

        @NotNull SQLQueryRecognitionContext statistics
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;
import org.jkiss.dbeaver.model.sql.semantics.model.expressions.SQLQueryValueExpression;
public class SQLQueryRowsTableValueModel extends SQLQueryRowsSourceModel {
        @NotNull SQLQueryRecognitionContext statistics
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsSourceContext;
                            null,
import org.jkiss.code.NotNull;
 */
        SQLQueryRowsDataContext emptyTuple = this.getRowsSources().makeEmptyTuple();
            }
                            this,
        this.isIncomplete = isIncomplete;
                            resultColumns.size(),
    
            rowIndex++;

 *
                        new SQLQueryResultColumn(

        this.rows = rows;
    protected SQLQueryRowsSourceContext resolveRowSourcesImpl(
                            new SQLQuerySymbol("?"),
 * DBeaver - Universal Database Manager
        }
import org.jkiss.dbeaver.model.sql.semantics.SQLQueryRecognitionContext;
        for (List<SQLQueryValueExpression> row : this.rows) {
            for (SQLQueryValueExpression value : row) {
                            null,
    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, @NotNull T arg) {
    private final boolean isIncomplete;
                            SQLQueryExprType.UNKNOWN
 */
    @Override
import java.util.LinkedList;
import java.util.Collections;
        return this.getRowsSources().makeTuple(this, List.copyOf(resultColumns), Collections.emptyList());
    public SQLQueryRowsTableValueModel(
 * limitations under the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others
                value.resolveValueRelations(emptyTuple, statistics);
    }
        return visitor.visitRowsTableValue(this, arg);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    @Override
                }
 *
/*

    }
package org.jkiss.dbeaver.model.sql.semantics.model.select;
                    );
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryResultColumn;
                value.resolveRowSources(this.getRowsSources(), statistics);
    }
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryExprType;
    ) {
 * Unless required by applicable law or agreed to in writing, software

