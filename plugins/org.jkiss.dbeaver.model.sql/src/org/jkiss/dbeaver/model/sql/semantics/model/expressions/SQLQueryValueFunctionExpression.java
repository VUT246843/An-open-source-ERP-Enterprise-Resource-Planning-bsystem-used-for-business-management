        @NotNull SQLQueryRowsDataContext context,
        } else {
            arguments = null;

 * you may not use this file except in compliance with the License.
                    resultType = SQLQueryExprType.forTypedObject(
    public SQLQueryValueFunctionExpression(
                        );

        }
    private boolean forRows;
                this.procName,
            SQLQuerySemanticUtils.performPartialResolution(


            return SQLQueryExprType.UNKNOWN;
        this.operands = operands;
        }
        } else {
                }
    @NotNull
                        origin,
                    procs.add(prepareFunctionApplication(this, candidate, p, statistics));
        @NotNull SQLQueryRecognitionContext statistics
        List<? extends DBSObject> candidates = context.getConnection().findRealObjects(
                                fields
        @NotNull SQLQueryRecognitionContext statistics
        Collection<? extends DBSProcedureParameter> params = procedure.getParameters(statistics.getMonitor());
                DBSTypedObject tgtType = arguments.get(i).getParameterType();
import org.jkiss.dbeaver.DBException;
                            SQLQueryExprType fieldType = SQLQueryExprType.forTypedObject(
                name.setOrigin(origin);
            for (int i = 0; i < arguments.size() && i < callExpr.operands.size(); i++) {
                        }

            );
    ) {
    }
            checked = false;
    }
    @Override
    @Nullable
                SQLQuerySymbolOrigin.DbObjectFilterMode.FUNCTION,
            if (arguments.size() != callExpr.operands.size()) {
                switch (param.getParameterKind()) {
            checked,
    ) throws DBException {
import org.jkiss.code.Nullable;
            SQLQuerySymbolEntry name = this.procName.parts.getFirst();
                                declarator,
    private static List<Runnable> noteError(
            SQLQuerySemanticUtils.performPartialResolution(
 * Licensed under the Apache License, Version 2.0 (the "License");
        );
            SQLQuerySymbolClass tableSymbolClass = statistics.isTreatErrorsAsWarnings()
                        );
            }


            arguments,
                        arguments.add(param);
        DBSProcedure procedure,
                if (resultType == null && proc.returnType != null) {
                proc.referenceTarget,
        return this.operands;
 * distributed under the License is distributed on an "AS IS" BASIS,
                        break;

 * limitations under the License.
                SQLQuerySymbolOrigin.DbObjectFilterMode.FUNCTION,
    }
            checked = true;
        }
            return resultType;
            if (candidates.isEmpty()) {
                tableSymbolClass
        CandidateProcedure proc;
        this.forRows = forRows;
                errors = noteError(
                        context.getRowsSources(),
                SQLQuerySymbolClass.ERROR
    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, @NotNull T arg) {

                }
                context.getRowsSources(),
        }
        if (this.procName.invalidPartsCount > 0) {
            : new SQLQuerySymbol("?");
                if (this.procName.parts.size() > 1) {
                    if (proc.results.size() == 1) {
            SQLQueryExprType resultType = null;
    }

                if (firstMatch != null && totalOkMatches == 1) {
        @NotNull
    @Override
        @Nullable List<Runnable> validationErrors,
            return SQLQueryExprType.UNKNOWN;
                context.getRowsSources(),
                            this.procName.getNameString() + ":resultTable",
            errors
    @Nullable
                origin,
                            SQLQuerySymbolClass.FUNCTION
            statistics.appendError(this.procName.syntaxNode, "Failed to obtain function information", ex);
                            declarator,
                SQLQuerySymbolOrigin.DbObjectFilterMode.FUNCTION,
                );
        return visitor.visitValueFunctionExpr(this, arg);
        } else {
                    proc = null; // cannot decide, so ignore them all
        @NotNull List<SQLQueryValueExpression> operands,

            returnType,
                            );
                        break;
                ? SQLQuerySymbolClass.FUNCTION

            try {
                context.getRowsSources(),

            results,
                    tgt == DBPDataKind.UNKNOWN || tgt == DBPDataKind.ANY
    @Override
                context.getRowsSources(),
import org.jkiss.dbeaver.model.DBPDataKind;
        }
                this.procName,
        }
            if (procs.stream().allMatch(CandidateProcedure::checked)) {

        this.procedure = proc == null ? null : proc.procedure;
                name.getSymbol().setSymbolClass(SQLQuerySymbolClass.FUNCTION);
        @Nullable SQLQueryComplexName procName,
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsSourceContext;
        List<DBSProcedureParameter> results;

                        SQLQuerySymbolClass.FUNCTION
                SQLQuerySymbolClass.FUNCTION
        @Nullable
    private static CandidateProcedure prepareFunctionApplication(
    }
            }
                    case IN:
                origin,
            proc = null;
        }
import org.jkiss.dbeaver.model.struct.rdb.*;
    public List<SQLQueryValueExpression> getOperands() {
            } finally {
            }
                    );
                statistics.appendError(this.procName.syntaxNode, "Function " + this.procName.getNameString() + " not found");
            CandidateProcedure firstMatch = procs.stream().filter(p -> CommonUtils.isEmpty(p.validationErrors)).findFirst().orElse(null);
        );
    }
                DBSObject targetObj = SQLQueryConnectionContext.expandAliases(statistics.getMonitor(), candidate);
            ? this.procName.parts.getLast().getSymbol()

        @Nullable
            ? new SQLQuerySymbolOrigin.RowsSourceRef(context.getRowsSources())
            }
                    errors, callExpr.getSyntaxNode(),
            } catch (DBException e) {
                DBPDataKind tgt = tgtType.getDataKind();
                } else {
    ) {
            results = null;
        if (arguments != null) {
        }
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
import org.jkiss.dbeaver.model.struct.DBSObject;
            long totalOkMatches = procs.stream().filter(p -> CommonUtils.isEmpty(p.validationErrors)).count();
                            fields.put(ret.getName(), fieldType);
                    );
                    errors = noteError(
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryExprType;
        DBSTypedObject returnType,
                        proc.returnType,
        } else {
                SQLQuerySymbolOrigin.DbObjectFilterMode.FUNCTION
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
                        SQLQuerySymbolOrigin.DbObjectFilterMode.FUNCTION,
                SQLQueryExprType srcType = callExpr.operands.get(i).type;
        if (context.getConnection().isDummy()) {
        boolean checked,
                    SQLQuerySemanticUtils.performPartialResolution(
                    case RETURN:
                        statistics.getMonitor(),
    }

import org.jkiss.dbeaver.model.impl.struct.RelationalObjectType;
        @Nullable
                }
        @NotNull SQLQueryRecognitionContext statistics
                        resultType = SQLQueryExprType.forSynthesizedArray(
                        );
                        errors, callExpr.operands.get(i).getSyntaxNode(),
        } else if (procs.size() == 1) {

 * Unless required by applicable law or agreed to in writing, software
                statistics.appendError(this.procName.syntaxNode, this.procName.getNameString() + " failed to obtain function info", e);
                }
        List<CandidateProcedure> procs = new ArrayList<>(candidates.size());

                boolean comparable = !(
                    "Illegal amount of arguments: given " + callExpr.operands.size() + " while expected " + arguments.size(),

                            + srcType.getDisplayName(),
    @NotNull
        if (this.procName.parts.size() == 1) {
                            SQLQueryExprType.forSynthesizedComposite(
        @NotNull DBSObject referenceTarget,
import org.jkiss.dbeaver.model.sql.semantics.*;
                        SQLQuerySymbolDefinition declarator = new SQLQuerySymbolByDbObjectDefinition(
            for (DBSProcedureParameter param : params) {
                this.procName.parts.getLast().getSymbol().setSymbolClass(SQLQuerySymbolClass.FUNCTION);
    @Nullable
    private final SQLQueryComplexName procName;
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryConnectionContext;
        boolean checked;
        if (params != null) {

        for (SQLQueryValueExpression expr : this.operands) {
            return SQLQueryExprType.UNKNOWN;
 *
        if (!statistics.validateFunctions()) {
                        resultType = SQLQueryExprType.forTypedObject(
            }
            referenceTarget,
        List<Runnable> errors = null;
    @Override
                        for (DBSProcedureParameter ret : proc.results) {
                            )
                    resultType = SQLQueryExprType.UNKNOWN;
                if (comparable && !DBPDataKind.canConsume(src, tgt)) {
 */

                }
                    case TABLE:
            return SQLQueryExprType.UNKNOWN;
    private final List<SQLQueryValueExpression> operands;
                statistics,
            }
                statistics,
            statistics.appendError(this.getSyntaxNode(), "Invalid function reference");
 * DBeaver - Universal Database Manager
    @NotNull
        List<DBSProcedureParameter> arguments;
            RelationalObjectType.TYPE_PROCEDURE,
        validationErrors.add(() -> statistics.appendError(syntaxNode, message));

            : new SQLQuerySymbolOrigin.RowsDataRef(context);
                proc = null;
        @Nullable
                                ret.getParameterType(),
        this.procName =  procName;
    }
                DBPDataKind src = srcType.getDataKind();
    }
                            SQLQuerySymbolClass.FUNCTION
            );
                }
            statistics.appendError(this.getSyntaxNode(), "Invalid function reference");
        }
        }
    ) {
    public SQLQuerySymbol getColumnNameIfTrivialExpression() {
            }
                            proc.results.getFirst().getParameterType(),
        return this.procName;
        return SQLQuerySemanticUtils.getIdentifierSymbolClass(this.procName);

    @NotNull

                SQLQuerySymbolClass.FUNCTION,
                    case INOUT:
                origin,
        SQLQuerySymbolOrigin origin = this.forRows
            SQLQuerySemanticUtils.setNamePartsDefinition(
/*
            this.procName.stringParts
            procedure,
        @NotNull
                        Map<String, SQLQueryExprType> fields = new HashMap<>(proc.results.size());
 *
    @Nullable
public class SQLQueryValueFunctionExpression extends SQLQueryValueExpression {
                            statistics.getMonitor(),


                    }
        boolean forRows
    protected SQLQueryExprType resolveValueTypeImpl(
                                statistics.getMonitor(),
    protected void resolveRowSourcesImpl(@NotNull SQLQueryRowsSourceContext context, @NotNull SQLQueryRecognitionContext statistics) {
 * You may obtain a copy of the License at
                this.procName,
            validationErrors = new ArrayList<>();
        return new CandidateProcedure(
                    statistics
        } catch (DBException ex) {
                        SQLQuerySymbolClass.FUNCTION
        DBSTypedObject returnType = procedure.getReturnType(statistics.getMonitor());
                }
            statistics.getMonitor(),
                    src == DBPDataKind.UNKNOWN || src == DBPDataKind.ANY ||

                : SQLQuerySymbolClass.ERROR;

    private DBSProcedure procedure = null;
            for (DBSObject candidate : candidates) {
                        statistics

        super(syntaxNode, operands.toArray(SQLQueryValueExpression[]::new));
        try {
                statistics,
                this.procName,
import org.jkiss.utils.CommonUtils;
            }
    @Override
        if (this.procedure != null) {
        if (this.procName == null) {
            expr.resolveRowSources(context, statistics);
            if (proc.validationErrors != null) {
        @NotNull SQLQueryValueFunctionExpression callExpr,

        @NotNull String message,
    @Nullable
            }
                    } else if (proc.results.size() > 1 && proc.results.getFirst().getParameterKind() == DBSProcedureParameterKind.TABLE) {
    private record CandidateProcedure(
                                SQLQuerySymbolClass.COMPOSITE_FIELD
                if (resultType == null) {
                    );
                return SQLQueryExprType.UNKNOWN;
                        this.procName.trimEnd(),
        return validationErrors;
                    proc = firstMatch; // only one overload with no errors, take it
        List<DBSProcedureParameter> arguments,
 * See the License for the specific language governing permissions and
                                this.procName.getNameString() + ":resultRow",
            this.procName.parts.forEach(p -> p.getSymbol().setSymbolClass(SQLQuerySymbolClass.FUNCTION));
        if (validationErrors == null) {
                    case RESULTSET:
                    case OUT:
                    default:
            );
 * Copyright (C) 2010-2025 DBeaver Corp and others
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            if (proc == null) {
                        results.add(param);

import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;
            } else {
                origin,
        }
            results = new ArrayList<>(params.size());
    }
package org.jkiss.dbeaver.model.sql.semantics.model.expressions;
                                this.procedure.getDataSource(),
            return SQLQueryExprType.UNKNOWN;
                }
        @NotNull DBSProcedure procedure,
            }
    @NotNull
            proc = procs.getFirst();
                            this.procedure,
                return SQLQueryExprType.UNKNOWN;
        List<DBSProcedureParameter> results,
            arguments = new ArrayList<>(params.size());
        }
            SQLQuerySemanticUtils.performPartialResolution(
import org.jkiss.dbeaver.model.stm.STMTreeNode;
    ) {
            return SQLQueryExprType.UNKNOWN;
                if (targetObj instanceof DBSProcedure p) {
                );
    public SQLQueryComplexName getProcName() {

                        "Inconsistent parameter type: expected " + tgtType.getFullTypeName() + " while given "
                proc.validationErrors.forEach(Runnable::run);
        List<Runnable> validationErrors

import java.util.*;
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;
        return this.procName != null && this.procName.parts.getLast() != null
            );
        DBSObject referenceTarget,
        @NotNull STMTreeNode syntaxNode,
                if (proc.results != null) {

            if (context.getConnection().dialect.getFunctions().contains(name.getName())) {
                        statistics,
        @NotNull STMTreeNode syntaxNode,
import org.jkiss.code.NotNull;
        if (procs.isEmpty()) {
    }
    public SQLQuerySymbolClass getAssociatedSymbolClass() {
