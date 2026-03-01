
     */
    public String toString() {
 * limitations under the License.
            throw new IllegalStateException("Cannot treat symbols '" + entry.getName() + "' as an instance of '" + this.name + "'");
        return this.name;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private SQLQuerySymbolDefinition definition = null;
    private SQLQuerySymbolClass symbolClass = SQLQuerySymbolClass.UNKNOWN;
import java.util.HashSet;
 * See the License for the specific language governing permissions and
    @NotNull
 *
    @Nullable
            throw new UnsupportedOperationException("Cannot treat different symbols as one ('" + this.name + "' and '" + other.name + "')");
        return result;
     */
    }
        
    /**
        
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager

        } else {
    public void registerEntry(@NotNull SQLQuerySymbolEntry entry) {
        return this.symbolClass;
import org.jkiss.code.NotNull;
 * Copyright (C) 2010-2025 DBeaver Corp and others
public class SQLQuerySymbol {

        if (!other.name.equals(this.name)) {
 * You may obtain a copy of the License at

            this.setSymbolClass(definition.getSymbolClass());
    }
/*
     * Throws IllegalStateException, if symbol has already been registered
    @NotNull
    }
 *
        }
    public SQLQuerySymbolClass getSymbolClass() {
    /**
        }

    @NotNull
     * Set symbol class to this symbol.
        }
    
     * Register symbol entry.
        result.entries.addAll(other.entries);
        } else if (definition != null) {
package org.jkiss.dbeaver.model.sql.semantics;
    public SQLQuerySymbolDefinition getDefinition() {
            this.symbolClass = symbolClass;
     */
    }
    }
import org.jkiss.code.Nullable;
        result.entries.addAll(this.entries);
import java.util.Collection;
    
     */
    public SQLQuerySymbol merge(@NotNull SQLQuerySymbol other) { // TODO merge multiple definitions and check for symbolClass
            throw new IllegalStateException("Symbol already classified: " + this.symbolClass);
        this.name = name;
        return super.toString() + "[" + this.name + "]";
    }
        return this.entries;
        result.entries.forEach(e -> SQLQuerySymbolEntry.updateSymbol(e, result));
    /**

 * distributed under the License is distributed on an "AS IS" BASIS,
}
            throw new IllegalStateException("Symbol definition has already been set");
 *
    @NotNull
    public SQLQuerySymbol(@NotNull String name) {

 *     http://www.apache.org/licenses/LICENSE-2.0
    }

 * Licensed under the Apache License, Version 2.0 (the "License");


    public void setSymbolClass(@NotNull SQLQuerySymbolClass symbolClass) {
import java.util.Set;
        SQLQuerySymbol result = new SQLQuerySymbol(this.name);
    }
     * Set symbol definition to this symbol.

        if (this.definition != null) {
 */
        return this.definition;
    }
    public void setDefinition(@Nullable SQLQuerySymbolDefinition definition) {
            this.definition = definition;
        this.entries.add(entry);
    public String getName() {
        if (!entry.getName().equals(this.name)) {
     * Merge this symbol with the other one
        }
    private final Set<SQLQuerySymbolEntry> entries = new HashSet<>();
     * Throws IllegalStateException, if symbol has been already classified
    }
    public Collection<SQLQuerySymbolEntry> getEntries() {
    /**
     * Throws IllegalStateException, if symbol definition has already been set
 * Unless required by applicable law or agreed to in writing, software
    private final String name;
        if (this.symbolClass != SQLQuerySymbolClass.UNKNOWN) {

    @Override
