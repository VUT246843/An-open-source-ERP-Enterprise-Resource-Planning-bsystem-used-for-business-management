
     * Visit several columns from the table of a selection result
     * Visit value expressions tree
    R visitTableStatementUpdate(@NotNull SQLQueryUpdateModel updateStatement, T arg);
    R visitSelectColumnSpec(@NotNull SQLQuerySelectionResultColumnSpec columnSpec, T arg);
     */
    /**
    @Nullable
    @Nullable
     */

    @Nullable
     * Visit natral join
    R visitCommand(@NotNull SQLCommandModel command, T arg);
/**


     * Visit a table constructed by VALUES clause
    @Nullable
    @Nullable

    /**
     * Visit value expressions tree
    R visitRowsSetCorrespondingOp(@NotNull SQLQueryRowsSetCorrespondingOperationModel correspondingOp, T arg);
     */
    @Nullable
     * Visit constant expression
 * Query model visitor. Each new model class of a top-level of the query abstraction should have the corresponding method here.
    /**

 *
    R visitCommandVariable(@NotNull SQLCommandModel.VariableNode variable, T arg);
    R visitRowsTableProc(@NotNull SQLQueryRowsTableProcModel tableProc, T arg);
     * Visit subquery expression
    R visitTableStatementDelete(@NotNull SQLQueryDeleteModel deleteStatement, T arg);
    /**

    /**
    @Nullable
     * Visit one column of a selection result
    @Nullable
import org.jkiss.code.Nullable;
    @Nullable
    /**
     */
     * Visit column or its member reference
    R visitObjectStatementDrop(@NotNull SQLQueryObjectDropModel dropStatement, T arg);

import org.jkiss.code.NotNull;
     */

     * Visit array element(s) access
    R visitRowsTableValue(@NotNull SQLQueryRowsTableValueModel tableValue, T arg);
 *
     * Visit select clause
     * Visit all columns of the table of a selection result
    @Nullable
 * Copyright (C) 2010-2025 DBeaver Corp and others
     * Visit select clause result
     */
     * Visit cross join clause
     */
     * Visit Common table expression (CTE) subquery

 * See the License for the specific language governing permissions and
    /**
    R visitValueSubqueryExpr(@NotNull SQLQueryValueSubqueryExpression subqueryExpr, T arg);
    @Nullable
    R visitValueFlatExpr(@NotNull SQLQueryValueFlattenedExpression flattenedExpr, T arg);
    R visitTableStatementDrop(@NotNull SQLQueryTableDropModel dropStatement, T arg);
     * Visit INSERT statement
    /**

     * Visit set operation kind

    @Nullable



    /**
    /**
    @Nullable

    R visitRowsNaturalJoin(@NotNull SQLQueryRowsNaturalJoinModel naturalJoin, T arg);
     */
     * Visit SET clause of a UPDATE statement

    R visitValueColumnRefExpr(SQLQueryValueColumnReferenceExpression columnRefExpr, T arg);

    R visitObjectReference(SQLQueryObjectDataModel objectReference, T arg);
    @Nullable
     */
    R visitSelectionModel(@NotNull SQLQueryModel selection, T arg);
public interface SQLQueryNodeModelVisitor<T, R> {

    R visitRowsCte(@NotNull SQLQueryRowsCteModel cte, T arg);
    /**
    /**
     */

     */
    R visitValueConstantExpr(@NotNull SQLQueryValueConstantExpression constExpr, T arg);

     * Visit script variable
    R visitSelectCompleteTupleSpec(@NotNull SQLQuerySelectionResultCompleteTupleSpec completeTupleSpec, T arg);

 *     http://www.apache.org/licenses/LICENSE-2.0
    R visitTableStatementUpdateSetClause(@NotNull SQLQueryUpdateSetClauseModel setClause, T arg);
     * Visit DBeaver variable used in the DBeaver control command
    R visitValueIndexingExpr(@NotNull SQLQueryValueIndexingExpression indexingExpr, T arg);
     */
    R visitRowsProjectionIntoTargetsList(SQLQuerySelectIntoModel.SQLQuerySelectIntoTargetsList targetsList, T arg);
    @Nullable

    R visitRowsCrossJoin(@NotNull SQLQueryRowsCrossJoinModel crossJoin, T arg);
    @Nullable

import org.jkiss.dbeaver.model.sql.semantics.model.ddl.*;
    @Nullable
    R visitValueTypeCastExpr(@NotNull SQLQueryValueTypeCastExpression typeCastExpr, T arg);
     * Visit Common Table Expressiion (CTE)
    /**
    /**
    /**
    /**
    @Nullable
import org.jkiss.dbeaver.model.sql.semantics.model.select.*;
    @Nullable

    /**

    R visitSelectTupleSpec(@NotNull SQLQuerySelectionResultTupleSpec tupleSpec, T arg);
    /**


     * Visit table definition
    /**
    R visitTableConstraintSpec(SQLQueryTableConstraintSpec tableConstraintSpec, T arg);
     */
     */
    R visitSelectionResult(@NotNull SQLQuerySelectionResultModel selectionResult, T arg);
    R visitAlterTable(SQLQueryTableAlterModel alterTable, T arg);
/*
    @Nullable
    /**
    @Nullable
     * Visit a subquery source that have an alias and optionally columns list
     * Visit column reference
    @Nullable
 * Unless required by applicable law or agreed to in writing, software
    @Nullable
    @Nullable
    R visitRowsProjection(@NotNull SQLQueryRowsProjectionModel projection, T arg);

     */
     */
    R visitValueVariableExpr(@NotNull SQLQueryValueVariableExpression varExpr, T arg);

}
 * you may not use this file except in compliance with the License.
 *
     */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    R visitCallStatement(@NotNull SQLQueryCallModel callStatement, T arg);
    /**

 * DBeaver - Universal Database Manager
    /**
     */
    /**

     * Visit UPDATE statement


    R visitValueMemberReferenceExpr(@NotNull SQLQueryValueMemberExpression memberRefExpr, T arg);
    R visitValueFunctionExpr(@NotNull SQLQueryValueFunctionExpression funcExpr, T arg);
    /**
     */

     */
    /**
    @Nullable
import org.jkiss.dbeaver.model.sql.semantics.model.dml.*;
    /**
 * distributed under the License is distributed on an "AS IS" BASIS,

     * Visit reference to the tuple of columns of the table
    @Nullable
    R visitRowsCorrelatedSource(@NotNull SQLQueryRowsCorrelatedSourceModel correlated, T arg);
    /**
     * Visit query
     */
    @Nullable
import org.jkiss.dbeaver.model.sql.semantics.model.expressions.*;
    @Nullable



    /**
package org.jkiss.dbeaver.model.sql.semantics.model;
     */
     */
    R visitTableStatementInsert(@NotNull SQLQueryInsertModel insertStatement, T arg);
     */
    @Nullable

    R visitRowsCteSubquery(@NotNull SQLQueryRowsCteSubqueryModel cteSubquery, T arg);
    R visitRowsTableData(@NotNull SQLQueryRowsTableDataModel tableData, T arg);
     * Visit a member access to the element of the composite type
    /**
    R visitValueTupleRefExpr(@NotNull SQLQueryValueTupleReferenceExpression tupleRefExpr, T arg);
 * limitations under the License.
     */
     * Visit DBeaver control command (like @echo, @set, @export and so on)

    R visitAlterTableAction(SQLQueryTableAlterActionSpec actionSpec, T arg);
    @Nullable
    R visitColumnSpec(SQLQueryColumnSpec columnSpec, T arg);

 */
    /**
    /**
     */

     */
    /**
 */


    R visitValueReferenceExpr(@NotNull SQLQueryValueReferenceExpression valueRefExpr, T arg);
    R visitCreateTable(SQLQueryTableCreateModel createTable, T arg);
    /**
     * Visit a rows-producing procedure call
     * Visit CALL, EXEC, EXECUTE queries
     */
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Nullable
     * Visit DELETE statement
     * Visit type cast expression
    @Nullable
    R visitRowsProjectionInto(SQLQuerySelectIntoModel selectIntoStatement, T arg);
    R visitColumnConstraintSpec(SQLQueryColumnConstraintSpec columnConstraintSpec, T arg);
     */
     */
     */

 * You may obtain a copy of the License at
     */
    @Nullable
     */
    @Nullable
