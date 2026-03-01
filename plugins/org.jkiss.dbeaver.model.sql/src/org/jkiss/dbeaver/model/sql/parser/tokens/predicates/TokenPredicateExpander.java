    @NotNull
import org.jkiss.code.NotNull;
        return node == null
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.model.sql.parser.tokens.predicates;
/**
    public ListNode<ListNode<SQLTokenEntry>> visitAlternative(@NotNull AlternativeTokenPredicateNode alternative, @NotNull ListNode<SQLTokenEntry> head) {
    @Override
 * Implements token predicate tree expansion into the list of all possible token entry sequences matching the predicate

 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.List;
        return results;
    }
 *

        return ListNode.of(ListNode.push(head, token));
    public ListNode<ListNode<SQLTokenEntry>> visitSequence(@NotNull SequenceTokenPredicateNode sequence, @NotNull ListNode<SQLTokenEntry> head) {
    private static final TokenPredicateExpander INSTANCE = new TokenPredicateExpander();

import org.jkiss.dbeaver.model.sql.parser.TokenEntry;
    @NotNull
    private TokenPredicateExpander() {
import java.util.Collections;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.

    @NotNull
            }
 * Unless required by applicable law or agreed to in writing, software
 */
class TokenPredicateExpander implements TokenPredicateNodeVisitor<ListNode<SQLTokenEntry>, ListNode<ListNode<SQLTokenEntry>>> {
import org.jkiss.code.Nullable;
                    step = ListNode.push(step, childPath);
    @NotNull
    }
import java.util.stream.Collectors;
    @Override
        for (TokenPredicateNode child: alternative.childs) {
 *
                }
        ListNode<ListNode<SQLTokenEntry>> results = ListNode.of(head);
    public ListNode<ListNode<SQLTokenEntry>> visitTokenEntry(@NotNull SQLTokenEntry token, @NotNull ListNode<SQLTokenEntry> head) {
                .collect(Collectors.toList());
            }
            for (ListNode<SQLTokenEntry> prefix: results) {
 * distributed under the License is distributed on an "AS IS" BASIS,
                    // expanding traverse walks in the left-to-right order, so we've got the rightmost entry  as head of the list

    @NotNull
/*

                })
import org.jkiss.dbeaver.utils.ListNode;
    @Override
 *
            ListNode<ListNode<SQLTokenEntry>> step = null;
        return ListNode.push(optional.child.apply(this, head), head);
    }
 * DBeaver - Universal Database Manager
                    return list;
        @NotNull CaptureTokenPredicateNode captureToken,
                    List<TokenEntry> list = StreamSupport.stream(path.spliterator(), false).collect(Collectors.toList());
        return ListNode.of(ListNode.push(head, captureToken));
}
        }
import java.util.stream.StreamSupport;
                .map(path -> {
 * See the License for the specific language governing permissions and
                for (ListNode<SQLTokenEntry> childPath: child.apply(this, prefix)) {
    @Override
    }

                    Collections.reverse(list); //can be removed if collect token entries in reverse order (right-to-left)
        ListNode<ListNode<SQLTokenEntry>> results = null;
    @Override
    }
    public static List<List<TokenEntry>> expand(@Nullable TokenPredicateNode node) {
            results = step;
        return results;
                ? Collections.emptyList()
        @NotNull ListNode<SQLTokenEntry> head

    public ListNode<ListNode<SQLTokenEntry>> visitOptional(@NotNull OptionalTokenPredicateNode optional, @NotNull ListNode<SQLTokenEntry> head) {
                : StreamSupport.stream(node.apply(INSTANCE, null).spliterator(), false)
    @NotNull
    }
            for (ListNode<SQLTokenEntry> childPath: child.apply(this, head)) {
 * You may obtain a copy of the License at

    public ListNode<ListNode<SQLTokenEntry>> visitCapture(
    ) {

 * you may not use this file except in compliance with the License.
        for (TokenPredicateNode child: sequence.childs) {
                .filter(p -> p != null)
        }
                results = ListNode.push(results, childPath);
 */

