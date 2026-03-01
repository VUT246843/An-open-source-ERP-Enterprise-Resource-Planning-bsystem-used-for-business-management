import org.jkiss.dbeaver.model.sql.SQLDialect;
 * limitations under the License.
import java.util.Deque;
        @Nullable SQLQuerySymbolEntry symbol,

    public void reset() {
    }
        return new SQLQueryRecognitionProblemInfo(severity, syntaxNode, symbol, message, exception);
    @Nullable
import org.jkiss.dbeaver.model.sql.SQLSyntaxManager;
        this.dialect = dialect;
        this.errorsAsWarnings = errorsAsWarnings;
        return this.syntaxManager;
/*
    private final boolean useRealMetadata;
/**
import org.jkiss.dbeaver.DBException;
    }
    @Nullable

        this.registerProblem(this.makeWarning(symbol.getSyntaxNode(), symbol, error, null));
 * You may obtain a copy of the License at
        return this.validateFunctions;
    private final SQLSyntaxManager syntaxManager;
    }

    public List<SQLQueryRecognitionProblemInfo> getProblems() {
    @NotNull

        return this.errorsAsWarnings;

    }
        SQLQueryRecognitionProblemInfo.Severity severity = this.errorsAsWarnings
    @NotNull
    @NotNull
        this.monitor = monitor;


        this.validateFunctions = validateFunctions;
        this.useRealMetadata = useRealMetadata;
        @NotNull SQLSyntaxManager syntaxManager,
 * Accumulates the statistics about recognition process
        return this.dialect;


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.executionContext = executionContext;
    }
    }
            this.problems.addLast(problemInfo);
    private final DBRProgressMonitor monitor;
        @Nullable DBException exception
        return this.monitor;
    ) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
package org.jkiss.dbeaver.model.sql.semantics;


    private final Deque<SQLQueryRecognitionProblemInfo> problems = new LinkedList<>();
            ? SQLQueryRecognitionProblemInfo.Severity.WARNING
    public boolean isTreatErrorsAsWarnings() {
 *
    }
            : SQLQueryRecognitionProblemInfo.Severity.ERROR;
    }
        this.problems.clear();
    private boolean errorsAsWarnings = false;


    SQLDialect getDialect() {
    private void registerProblem(SQLQueryRecognitionProblemInfo problemInfo) {
    private SQLQueryRecognitionProblemInfo makeWarning(
        return new SQLQueryRecognitionProblemInfo(SQLQueryRecognitionProblemInfo.Severity.WARNING, syntaxNode, symbol, message, exception);
import org.jkiss.code.NotNull;

    public boolean validateFunctions() {
    }
    }
    private SQLQueryRecognitionProblemInfo makeError(
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    }
    @NotNull
    @NotNull
    public void appendWarning(@NotNull SQLQuerySymbolEntry symbol, @NotNull String error) {


 */
    }
        @Nullable SQLQuerySymbolEntry symbol,
    public void setTreatErrorAsWarnings(boolean errorsAsWarnings) {
        @NotNull STMTreeNode syntaxNode,
        return this.useRealMetadata;
 * See the License for the specific language governing permissions and
    public void appendWarning(@NotNull STMTreeNode treeNode, @NotNull String error) {
    private final boolean validateFunctions;

        this.registerProblem(this.makeError(treeNode, null, error, ex));
 * Unless required by applicable law or agreed to in writing, software
import java.util.List;
 * distributed under the License is distributed on an "AS IS" BASIS,

 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    public DBRProgressMonitor getMonitor() {
 *
        @NotNull String message,

        this.registerProblem(this.makeError(symbol.getSyntaxNode(), symbol, error, null));
    SQLSyntaxManager getSyntaxManager() {
import java.util.LinkedList;
        return new ArrayList<>(this.problems);
    private final SQLDialect dialect;
        @NotNull DBRProgressMonitor monitor,

        @NotNull SQLDialect dialect
        this.syntaxManager = syntaxManager;
    }
    }
    }
        boolean validateFunctions,
    }
        boolean useRealMetadata,
        if (this.problems.size() < SQLQueryRecognitionProblemInfo.PER_QUERY_LIMIT) {
        @NotNull STMTreeNode syntaxNode,
        this.registerProblem(this.makeError(treeNode, null, error, null));
import java.util.ArrayList;

 * DBeaver - Universal Database Manager
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
    @NotNull
import org.jkiss.dbeaver.model.stm.STMTreeNode;
    @NotNull

    public void appendError(@NotNull STMTreeNode treeNode, @NotNull String error) {
public class SQLQueryRecognitionContext {

        @Nullable DBCExecutionContext executionContext,
    }
import org.jkiss.code.Nullable;

        return this.executionContext;
    }
    ) {
    ) {


 *

        }
        this.registerProblem(this.makeWarning(treeNode, null, error, null));

        this.registerProblem(this.makeError(symbol.getSyntaxNode(), symbol, error, ex));

    public void appendError(@NotNull SQLQuerySymbolEntry symbol, @NotNull String error) {
        @Nullable DBException exception

    public void appendError(@NotNull STMTreeNode treeNode, @NotNull String error, @NotNull DBException ex) {
    public void appendError(@NotNull SQLQuerySymbolEntry symbol, @NotNull String error, @NotNull DBException ex) {

}
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others
    private final DBCExecutionContext executionContext;
    public DBCExecutionContext getExecutionContext() {
    public boolean useRealMetadata() {
    }
    @NotNull

    public SQLQueryRecognitionContext(
        @NotNull String message,
