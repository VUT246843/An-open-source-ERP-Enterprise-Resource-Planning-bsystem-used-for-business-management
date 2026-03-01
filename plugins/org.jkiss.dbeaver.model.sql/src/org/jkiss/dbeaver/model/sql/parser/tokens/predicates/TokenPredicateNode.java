 * Unless required by applicable law or agreed to in writing, software
/**
    public List<List<TokenEntry>> expand() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * Expands the tree into the list of all possible token entry sequences matching the predicate
    }
 * Represents node of token predicate tree
public abstract class TokenPredicateNode {

 *
    @NotNull

 * You may obtain a copy of the License at
    public final String toString() {
    protected TokenPredicateNode() {
    @Override
    @NotNull
}
    /**
        List<List<TokenEntry>> result = TokenPredicateExpander.expand(this);
        return TokenPredicateFormatter.format(this);
 * limitations under the License.

 * you may not use this file except in compliance with the License.
        return this.applyImpl(visitor, arg);


    @NotNull
 * See the License for the specific language governing permissions and
/*
        return result.isEmpty() ? List.of(Collections.emptyList()) : result;
    protected abstract <T, R> R applyImpl(@NotNull TokenPredicateNodeVisitor<T, R> visitor, @NotNull T arg);
    public final <T, R> R apply(@NotNull TokenPredicateNodeVisitor<T, R> visitor, @NotNull T arg) {
 *
 */
 * Copyright (C) 2010-2025 DBeaver Corp and others
 */

     */
 *     http://www.apache.org/licenses/LICENSE-2.0

package org.jkiss.dbeaver.model.sql.parser.tokens.predicates;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }


import org.jkiss.dbeaver.model.sql.parser.TokenEntry;
import java.util.Collections;
import java.util.List;
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
 * DBeaver - Universal Database Manager

import org.jkiss.code.NotNull;
    }
 *
