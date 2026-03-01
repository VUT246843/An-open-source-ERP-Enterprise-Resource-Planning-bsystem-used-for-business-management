            return sb.toString();
    public Severity getSeverity() {
    private final SQLQuerySymbolEntry symbol;
 */
    private final DBException exception;
        } else {
    @NotNull

        WARNING(1); // IMarker.SEVERITY_WARNING
 * See the License for the specific language governing permissions and
    }
        if (ex != null) {
        }
 * limitations under the License.
    public Interval getInterval() {
                ex = ex.getCause();
    ) {
        @Nullable SQLQuerySymbolEntry symbol,
        return super.toString() + "[" + sb.toString() + "]";
        if (this.symbol != null) {
    }
 *
 *     http://www.apache.org/licenses/LICENSE-2.0

        return this.severity;
        @NotNull Severity severity,



    @Nullable
import org.jkiss.code.Nullable;
            sb.append(": ").append(this.exception.toString());
            }
                sb.append(ex.getMessage()).append("\n");

        return this.message;
 * distributed under the License is distributed on an "AS IS" BASIS,
        sb.append(this.message);
    @NotNull
    private final String message;
        }
}
    }
 *
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
    private final STMTreeNode syntaxNode;
        return this.syntaxNode.getRealInterval();
            return null;
    @Nullable
    }

    public static final int PER_QUERY_LIMIT = 50;
        } else {
            sb.append(this.syntaxNode.getTextContent()).append(": ");
        ERROR(2), // IMarker.SEVERITY_ERROR
        }
public class SQLQueryRecognitionProblemInfo {

    @NotNull
    @NotNull
    public String getMessage() {

        }
        if (this.exception != null) {
        this.syntaxNode = syntaxNode;
        Severity(int markerSeverity) {
            StringBuilder sb = new StringBuilder();
        this.exception = exception;
 * Unless required by applicable law or agreed to in writing, software
    @Override
    @NotNull
            sb.append(this.symbol.getName()).append(": ");
    public SQLQueryRecognitionProblemInfo(
        sb.append(this.syntaxNode.getRealInterval().toString()).append(": ");
            this.markerSeverity = markerSeverity;
        @NotNull String message,
import org.jkiss.dbeaver.model.stm.STMTreeNode;
    private final Severity severity;
        Throwable ex = this.exception;

    }
        @NotNull STMTreeNode syntaxNode,
 * You may obtain a copy of the License at
    public String getExceptionMessage() {
import org.antlr.v4.runtime.misc.Interval;
    }
    }


    @NotNull
        public final int markerSeverity;
 * Copyright (C) 2010-2024 DBeaver Corp and others

    public String toString() {
        @Nullable DBException exception
/*
package org.jkiss.dbeaver.model.sql.semantics;
 *
            while (ex != null) {
        StringBuilder sb = new StringBuilder();
        this.message = message;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.DBException;
        this.severity = severity;
    public enum Severity {
import org.jkiss.code.NotNull;
 * you may not use this file except in compliance with the License.
        this.symbol = symbol;
