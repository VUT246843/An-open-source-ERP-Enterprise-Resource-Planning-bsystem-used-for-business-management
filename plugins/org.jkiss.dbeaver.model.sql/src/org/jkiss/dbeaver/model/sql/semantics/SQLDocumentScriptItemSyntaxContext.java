    private static final Log log = Log.getLog(SQLDocumentScriptItemSyntaxContext.class);
                entry = it.getCurrValue();
    }
    }
        int initialPosition,


 *
    private final String originalText;
    }
    private final SQLQueryModel queryModel;
    public int getInitialPosition() {
}        @NotNull SQLQueryModel queryModel,
    public SQLDocumentScriptItemSyntaxContext(
        this.originalText = originalText;
    }
        }
 */
    @NotNull
        }

        return this.length;
            if (entry != null && entryOffset <= offset && entryOffset + entry.getInterval().length() > offset) {
 * See the License for the specific language governing permissions and
        }

            }
    public void setProblems(@Nullable List<SQLQueryRecognitionProblemInfo> problems) {
    @NotNull

    }

            entries.put(offset, token);
    public int length() {
import org.jkiss.dbeaver.model.sql.semantics.OffsetKeyedTreeMap.NodesIterator;
    }
    }
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.Nullable;
    public SQLTokenEntryAtOffset findToken(int offset) {

        @NotNull String originalText,
        synchronized (this.lock) {

/*
            NodesIterator<SQLQuerySymbolEntry> it = entries.nodesIteratorAt(offset);
            }
            } else {
        return this.originalText;
    @NotNull
            this.isDirty = true;

    public void registerToken(int offset, @NotNull SQLQuerySymbolEntry token) {
 *     http://www.apache.org/licenses/LICENSE-2.0
    ) {
 * you may not use this file except in compliance with the License.
    public void setHasContextBoundaryAtLength(boolean hasContextBoundaryAtLength) {
    public void clear() {
            }
    @Nullable
    public boolean hasContextBoundaryAtLength() {

        synchronized (this.lock) {
            this.isDirty = false;
        this.problems = problems;
import org.jkiss.code.NotNull;
 * DBeaver - Universal Database Manager
            if (entry == null && it.prev()) {
    public SQLQueryModel getQueryModel() {
        return this.queryModel;
    private final OffsetKeyedTreeMap<SQLQuerySymbolEntry> entries = new OffsetKeyedTreeMap<>();
            this.entries.clear();

import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryModel;
 *
    private int length;
            } else { // simple insertion
    public void refreshCompleted() {
            int entryOffset = it.getCurrOffset();
        return this.hasContextBoundaryAtLength;
    @Nullable
        }
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    private final Object lock = new Object();
                throw new UnsupportedOperationException();
    @NotNull
                // TODO remove the affected fragment and apply offset for the rest
    private final int initialPosition;
    }
        synchronized (this.lock) {
 * You may obtain a copy of the License at
        synchronized (this.lock) {
    public String getOriginalText() {
        int length
            return this.isDirty;
        this.queryModel = queryModel;
    @Nullable

    }
        this.length = length;

import org.jkiss.dbeaver.Log;
    @NotNull
        this.initialPosition = initialPosition;
        synchronized (this.lock) {
            SQLQuerySymbolEntry entry = it.getCurrValue();
        return problems;
            this.length += newLength - oldLength;
        synchronized (this.lock) {
                entryOffset = it.getCurrOffset();
            this.isDirty = true;
    }
 * limitations under the License.
    
import java.util.List;
        this.hasContextBoundaryAtLength = hasContextBoundaryAtLength;

            if (oldLength > 0) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2024 DBeaver Corp and others
                return new SQLTokenEntryAtOffset(entryOffset, entry);
    private boolean isDirty = false;
    private List<SQLQueryRecognitionProblemInfo> problems = null;
 *
    }
                this.entries.applyOffset(offset, newLength);
    }
        return this.initialPosition;
    public void applyDelta(int offset, int oldLength, int newLength) {
                return null;

    @NotNull
package org.jkiss.dbeaver.model.sql.semantics;
    public boolean isDirty() {
    }

    private boolean hasContextBoundaryAtLength = true;
    }
    public List<SQLQueryRecognitionProblemInfo> getProblems() {
public class SQLDocumentScriptItemSyntaxContext {
        }

