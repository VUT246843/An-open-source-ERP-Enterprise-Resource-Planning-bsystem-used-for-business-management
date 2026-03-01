 * you may not use this file except in compliance with the License.

        for (SQLQueryLexicalScopeItem item : this.items) {
    public SQLQueryLexicalScopeItem findItem(int position) {
    public void setInterval(@NotNull Interval interval) {
    @Nullable
     */
    public Interval getInterval() {
        }

    public void setSymbolsOrigin(@NotNull SQLQuerySymbolOrigin symbolsOrigin) {
    }
    }
/*
    }

        }
    }
    @NotNull
 *
        if (rc != 0) {
    private static final Comparator<Pair<SQLQueryLexicalScopeItem, Interval>> scopeItemsComparator = (a , b) -> {
    private final List<STMTreeNode> syntaxNodes;
        return this.symbolsOrigin;
                syntaxNodes.stream().map(x -> x.getRealInterval().a)
        return this.interval;
        if (rc != 0) {

    }

    }
    public void registerSyntaxNode(@NotNull STMTreeNode syntaxNode) {
    @NotNull
        if (this.interval == null) {
        } else {
import org.jkiss.code.NotNull;
            int b = Stream.concat(
           .orElse(null);

                syntaxNodes.stream().map(x -> { Interval r = x.getRealInterval(); return r.b + r.length(); })
 *
import java.util.stream.Stream;
        } else if (item instanceof SQLQuerySymbolEntry) {

            return rc;

 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.stm.STMTreeNode;
    }
 *

            this.interval = Interval.of(a, b);
        if (rc != 0) {
    private final List<SQLQueryLexicalScopeItem> items;
        this.items = new ArrayList<>();
    private SQLQuerySymbolOrigin symbolsOrigin = null;
    @NotNull
        }
                items.stream().map(x -> { Interval r = x.getSyntaxNode().getRealInterval(); return r.b + r.length(); }),

            return 1;
    }
        ArrayList<Pair<SQLQueryLexicalScopeItem, Interval>> candidates = new ArrayList<>(this.items.size());
     * Find lexical scope item in the provided position in the source text
            return Integer.MAX_VALUE;
 *     http://www.apache.org/licenses/LICENSE-2.0
     */
     * Returns a text interval for this lexical scope
    private Interval interval = null;
    }
        if (candidates.isEmpty()) {
            }
        return 0;
        if (item instanceof SQLQueryMemberAccessEntry) {
    /**

    public SQLQueryLexicalScopeItem findNearestItem(int position) {
        int rc = Integer.compare(a.getSecond().length(), b.getSecond().length());
            return rc;
        this.syntaxNodes.add(syntaxNode);

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
            int a = Stream.concat(
        this.interval = interval;
    @Nullable
import java.util.*;
 * distributed under the License is distributed on an "AS IS" BASIS,
     * Returns lexical scope context. If it is not set, then use context of the model node, from which the scope was obtained.
        this.syntaxNodes = new ArrayList<>();
        this.syntaxNodes = new ArrayList<>(capacity);
    /**
import org.jkiss.code.Nullable;
     */
     * Register item in the lexical scope
        }
     */
    public SQLQueryLexicalScope(int capacity) {
            return -rc;
            Interval interval = item.getSyntaxNode().getRealInterval();
    };
    private static int getLexicalItemPriority(@NotNull SQLQueryLexicalScopeItem item) {
    /**
            ).mapToInt(x -> x).min().orElse(0);
 * DBeaver - Universal Database Manager
import org.antlr.v4.runtime.misc.Interval;
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others
        this.items.add(item);

    
 * You may obtain a copy of the License at
           .filter(t -> t.getSyntaxNode().getRealInterval().properlyContains(Interval.of(position, position)))
        }
        rc = Integer.compare(a.getSecond().a, b.getSecond().a);
     * Register syntax node in the lexical scope
        
    }
           .min(Comparator.comparingInt(t -> t.getSyntaxNode().getRealInterval().a))

 * See the License for the specific language governing permissions and
    
    @Nullable
        } else {
public class SQLQueryLexicalScope {
        return this.items.stream()
     */
            if (interval.a < position && interval.b + 1 >= position) {
    @Nullable

    /**

    @Nullable
        this.items = new ArrayList<>(capacity);
    }
}            return candidates.get(0).getFirst();
        this.symbolsOrigin = symbolsOrigin;
            candidates.sort(scopeItemsComparator);
            ).mapToInt(x -> x).max().orElse(Integer.MAX_VALUE);
    /**
    public SQLQueryLexicalScope() {
    public SQLQuerySymbolOrigin getSymbolsOrigin() {

            return 0;
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryMemberAccessEntry;
        }
                items.stream().map(x -> x.getSyntaxNode().getRealInterval().a),
import org.jkiss.utils.Pair;
package org.jkiss.dbeaver.model.sql.semantics;
                candidates.add(Pair.of(item, interval));
            return null;
    public void registerItem(@NotNull SQLQueryLexicalScopeItem item) {
        }
        rc = Integer.compare(getLexicalItemPriority(a.getFirst()), getLexicalItemPriority(b.getFirst()));
