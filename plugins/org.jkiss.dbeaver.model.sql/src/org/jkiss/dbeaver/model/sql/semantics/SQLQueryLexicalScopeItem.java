
 *
    @NotNull

public abstract class SQLQueryLexicalScopeItem {
import org.jkiss.dbeaver.model.stm.STMTreeNode;
        return this.syntaxNode;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    }
    public abstract SQLQuerySymbolClass getSymbolClass();
    private SQLQuerySymbolOrigin origin = null;

package org.jkiss.dbeaver.model.sql.semantics;
        }
 *
    public void setOrigin(SQLQuerySymbolOrigin origin) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
    public SQLQueryLexicalScopeItem(@NotNull STMTreeNode syntaxNode) {

 * limitations under the License.
import org.jkiss.code.NotNull;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
/*
}
    public SQLQuerySymbolOrigin getOrigin() {
 * DBeaver - Universal Database Manager
    
 * See the License for the specific language governing permissions and

    @NotNull
        } else {
    @Nullable
    public STMTreeNode getSyntaxNode() {
    @Nullable

        this.syntaxNode = syntaxNode;
        return this.origin;
 */
 * Licensed under the Apache License, Version 2.0 (the "License");


    }
    }
            throw new UnsupportedOperationException("Symbol entry origin has already been set");
import org.jkiss.code.Nullable;
 * You may obtain a copy of the License at
        if (this.origin != null) {
            this.origin = origin;
 *
        super();
    protected final STMTreeNode syntaxNode;
    @Nullable
