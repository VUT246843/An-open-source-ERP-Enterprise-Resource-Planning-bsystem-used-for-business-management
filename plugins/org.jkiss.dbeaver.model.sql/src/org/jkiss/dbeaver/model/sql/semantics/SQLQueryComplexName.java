 * Unless required by applicable law or agreed to in writing, software
    public boolean isNotClassified() {
    @Override
import org.jkiss.code.Nullable;
        return Objects.deepEquals(this.stringParts, name.stringParts);

    public final List<SQLQuerySymbolEntry> parts;
    public String getNameString() {
        }
        if (this.invalidPartsCount == 0) {
        this.endingPeriodNode = endingPeriodNode;
 * Licensed under the Apache License, Version 2.0 (the "License");

        @NotNull STMTreeNode syntaxNode,
 */
        this.invalidPartsCount = invalidPartsCount;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull
        this.parts = parts;
 * Copyright (C) 2010-2025 DBeaver Corp and others

 *
        this.parts = parts;
    @Override
/*
        return this.parts.size() < 2 ? null : new SQLQueryComplexName(
import org.jkiss.dbeaver.model.stm.STMUtils;
        return new SQLQueryComplexName(
 *
    public String toString() {
            return this.parts.stream().filter(Objects::nonNull).allMatch(SQLQuerySymbolEntry::isNotClassified);
        @NotNull List<SQLQuerySymbolEntry> parts,
 * DBeaver - Universal Database Manager
            this.parts.subList(1, this.parts.size()),
        return this.parts.size() < 2 ? null : new SQLQueryComplexName(

 * limitations under the License.
        this.syntaxNode = syntaxNode;
            this.invalidPartsCount,
        return "SQLQueryComplexName[" + String.join(Character.toString(SQLConstants.STRUCT_SEPARATOR), this.stringParts) + "]";
        @NotNull List<String> stringParts,
    }
    public SQLQueryComplexName trimEnd() {
    }
    public SQLQueryComplexName prepend(SQLQuerySymbolEntry entry) {
 * you may not use this file except in compliance with the License.
            STMUtils.combineLists(List.of(entry), this.parts),
    @Nullable
        );
        @Nullable SQLQueryMemberAccessEntry endingPeriodNode
        this.stringParts = stringParts;
    public final SQLQueryMemberAccessEntry endingPeriodNode;
    @Nullable
        if (!(o instanceof SQLQueryComplexName name)) {
import java.util.Objects;
 * You may obtain a copy of the License at
    public SQLQueryComplexName trimStart() {
        int invalidPartsCount,
            return this.parts.getLast().isNotClassified();
    @Override
import org.jkiss.dbeaver.model.stm.STMTreeNode;
        }
        if (this == o) {
            this.syntaxNode,
        return String.join("", STMUtils.expandTermStrings(this.syntaxNode).reversed());
    public int hashCode() {
            return false;
    }

        this.invalidPartsCount = invalidPartsCount;
    @NotNull
        );
    ) {

public class SQLQueryComplexName {

            this.parts.subList(0, this.parts.size() - 1),
        this.stringParts = parts.stream().map(e -> e == null ? null : e.getName()).toList();


    @NotNull
        }
    public final List<String> stringParts;
    public final int invalidPartsCount;
import org.jkiss.utils.CommonUtils;

        int invalidPartsCount,

    }
        } else {
}
            return true;
package org.jkiss.dbeaver.model.sql.semantics;
    }
        @NotNull List<SQLQuerySymbolEntry> parts,
    @NotNull
import org.jkiss.code.NotNull;

 * Describes qualified or compound name of the database entity
            this.endingPeriodNode
            this.invalidPartsCount,
            this.parts.getLast() != null ? this.parts.getLast().getMemberAccess() : this.endingPeriodNode
    ) {

            STMUtils.combineLists(List.of(entry.getName()), this.stringParts),
    private SQLQueryComplexName(

    }
    }
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull STMTreeNode syntaxNode,
        @Nullable SQLQueryMemberAccessEntry endingPeriodNode
    public SQLQueryComplexName(
            this.stringParts.subList(1, this.parts.size()),
            this.stringParts.subList(0, this.parts.size() - 1),
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryMemberAccessEntry;
    }
    }

    }

import java.util.List;
        return Objects.hashCode(this.stringParts);

            this.syntaxNode,
 *
    public boolean equals(Object o) {
        );
 * distributed under the License is distributed on an "AS IS" BASIS,
    public final STMTreeNode syntaxNode;

            this.endingPeriodNode
        this.syntaxNode = syntaxNode;
import org.jkiss.dbeaver.model.sql.SQLConstants;
            this.invalidPartsCount,
            this.syntaxNode,
    @Nullable
/**
        this.endingPeriodNode = endingPeriodNode;
