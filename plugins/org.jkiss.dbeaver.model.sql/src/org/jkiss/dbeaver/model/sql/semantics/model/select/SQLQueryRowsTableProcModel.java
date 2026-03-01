                                field.type()
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
    protected SQLQueryRowsDataContext resolveRowDataImpl(

    }
import org.jkiss.dbeaver.DBException;
    private final SQLQueryValueFunctionExpression callExpr;
        return this.getRowsSources().makeTuple(this, List.copyOf(resultColumns), Collections.emptyList());
package org.jkiss.dbeaver.model.sql.semantics.model.select;

    ) {
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;
 * you may not use this file except in compliance with the License.
        return visitor.visitRowsTableProc(this, arg);
public class SQLQueryRowsTableProcModel extends SQLQueryRowsSourceModel {

        this.callExpr.resolveValueRelations(context, statistics);
        if (procResult != SQLQueryExprType.UNKNOWN) {
    ) {
 *
                                new SQLQuerySymbol(field.name()),
 * DBeaver - Universal Database Manager
 * limitations under the License.
        super(callExpr.getSyntaxNode());
    public SQLQueryValueFunctionExpression getFunctionExpression() {
        this.callExpr.resolveRowSources(context, statistics);
                    statistics.appendError(
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.sql.semantics.SQLQuerySymbol;
                    );
import org.jkiss.code.NotNull;
                        );
                            )
 * Licensed under the Apache License, Version 2.0 (the "License");
        @NotNull SQLQueryRecognitionContext statistics
import org.jkiss.dbeaver.Log;
        return context.reset();
            } catch (DBException e) {
    }
        @NotNull SQLQueryRowsDataContext context,
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryExprType;
    private static final Log log = Log.getLog(SQLQueryRowsTableProcModel.class);
    @NotNull
                log.debug(message, e);
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsSourceContext;
        @NotNull SQLQueryRecognitionContext statistics
                }
                                field.attribute(),
                        this.getSyntaxNode(),
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
            }
        @NotNull SQLQueryRowsSourceContext context,
                } else {
                    }
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;
                        resultColumns.addLast(
/*
    @Override
    }

    @NotNull
                    for (SQLQueryExprType.SQLQueryExprTypeMemberInfo field : rowType.getNamedMembers(statistics.getMonitor())) {
        LinkedList<SQLQueryResultColumn> resultColumns = new LinkedList<>();
        this.callExpr = callExpr;
    public SQLQueryRowsTableProcModel(@NotNull SQLQueryValueFunctionExpression callExpr) {
                            new SQLQueryResultColumn(
 */
        SQLQueryExprType procResult = this.callExpr.getValueType();
 *

                statistics.appendError(this.getSyntaxNode(), message);
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryResultColumn;
    @Override
                        this.callExpr.getProcName().getNameString() + " is not a rowset-producing procedure"
                                this,
                String message = "Failed to resolve function result fields for " + this.callExpr.getProcName();
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
                if (rowType != null) {
    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, @NotNull T arg) {
                SQLQueryExprType rowType = procResult.findIndexedItemType(statistics.getMonitor(), 1, null);

}
    }
                                null,
    @Override
import java.util.Collections;
import org.jkiss.dbeaver.model.sql.semantics.SQLQueryRecognitionContext;
import org.jkiss.dbeaver.model.sql.semantics.model.expressions.SQLQueryValueFunctionExpression;
 * Unless required by applicable law or agreed to in writing, software
    }
import java.util.LinkedList;
import java.util.List;
            try {
                                resultColumns.size(),
    protected SQLQueryRowsSourceContext resolveRowSourcesImpl(
                this.getRowsSources().resetAsUnresolved().makeEmptyTuple();
        return this.callExpr;


