    }
                symbol.registerEntry(this);
     * Returns symbol associated with this symbol entry
/*
    public SQLQuerySymbolClass getSymbolClass() {
        } else {
    private final String rawName;
        return this.memberAccessEntry;
    @NotNull

    public String getRawName() {
                this.definition = definition;
     */
    }
     */
                symbol.registerEntry(other);


        return name;
        if (symbol == null) {

 * Unless required by applicable law or agreed to in writing, software
    @Override
    }
            if (this.symbol != null && this.symbol.getDefinition() != null) {
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            if (this.symbol == null && other.symbol == null) {
    public String getName() {
                this.symbol = symbol;
            } else {
        this.memberAccessEntry = memberAccessEntry;
    }
            }
}
    }
        super(syntaxNode);
    }
                symbol = this.symbol;


/**
import org.jkiss.code.Nullable;
                this.symbol = symbol;
    public SQLQueryMemberAccessEntry getMemberAccess() {
            // TODO: illegal operation?
 *

        if (this.definition != null) {
        }
        }

    /**
 */
     */
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryMemberAccessEntry;
    @Nullable
    }
 *
                symbol = other.symbol;
    @NotNull
        }
    // private operation for symbol merging
     * Set symbol definition to the token
            this.memberAccessEntry.setOrigin(origin);


        if (this.symbol != null) {
                other.symbol = symbol;
            this.symbol.registerEntry(this);
 */
        this.name = name;
    private final String name;

    /**
    private SQLQuerySymbol symbol = null;
                other.symbol = symbol;
 * Symbol entry in the text
        } else {
 * you may not use this file except in compliance with the License.
        return symbol;
    /**
    @NotNull
                this.getSymbol().setDefinition(definition);
            throw new UnsupportedOperationException("Symbol entry definition has already been set");
    }
    }
    private final SQLQueryMemberAccessEntry memberAccessEntry;
    @Nullable
    @NotNull
        super.setOrigin(origin);
    }
        SQLQuerySymbol symbol;
        if (this.symbol != null && other.symbol != null) {
    public SQLQuerySymbol getSymbol() {

    public SQLQuerySymbol merge(@NotNull SQLQuerySymbolEntry other) {
    @NotNull
        return this.syntaxNode.getRealInterval();
    public SQLQuerySymbolEntry(@NotNull STMTreeNode syntaxNode, @NotNull String name, @NotNull String rawName, @Nullable SQLQueryMemberAccessEntry memberAccessEntry) {
        return this.symbol == null || this.symbol.getSymbolClass() == SQLQuerySymbolClass.UNKNOWN;
    @NotNull
 * DBeaver - Universal Database Manager
    /**
        return this.getSymbol().getSymbolClass();
    @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
        entry.symbol = newSymbol;
        } else {
        return this.definition != null ? this.definition 
            symbol.registerEntry(this);
        return rawName;
    public void setOrigin(SQLQuerySymbolOrigin origin) {
    }
    }
    @Override
    }
        if (this.memberAccessEntry != null) {
import org.jkiss.dbeaver.model.stm.STMTreeNode;
                symbol.registerEntry(other);
            this.symbol = symbol;
        }
    public void setDefinition(@Nullable SQLQuerySymbolDefinition definition) {
    public boolean isNotClassified() {
     * Merge the other symbol with this one
     * Merge the other symbol with this one and returns a new symbol
            symbol = new SQLQuerySymbol(name);
    
     */
                symbol.registerEntry(this);
            symbol = this.symbol.merge(other.symbol);
 * limitations under the License.

            }

        return symbol;

    @Nullable
    public SQLQuerySymbolDefinition getDefinition() {
import org.jkiss.code.NotNull;

    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
    public void merge(@NotNull SQLQuerySymbol symbol) {
    static void updateSymbol(@NotNull SQLQuerySymbolEntry entry, @NotNull SQLQuerySymbol newSymbol) {
            } else {
    }
public class SQLQuerySymbolEntry extends SQLQueryLexicalScopeItem implements SQLQuerySymbolDefinition {

    }
    public String toString() {
                symbol = new SQLQuerySymbol(this.name);
import org.antlr.v4.runtime.misc.Interval;
        return this.name + " (" + this.getSymbolClass() + ")";
        this.rawName = rawName;
    private SQLQuerySymbolDefinition definition = null;
 * You may obtain a copy of the License at
                : (this.symbol != null ? this.symbol.getDefinition() : null);
    public Interval getInterval() {
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.model.sql.semantics;

    @Nullable
            } else if (this.symbol != null) {
 *
