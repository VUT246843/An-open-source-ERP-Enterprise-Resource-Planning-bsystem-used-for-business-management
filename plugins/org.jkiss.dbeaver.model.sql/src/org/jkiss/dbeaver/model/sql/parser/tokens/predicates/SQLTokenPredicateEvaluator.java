                // accumulating reduced subset of the next to look at conditions according to the token being consumed

                        if (matchedByPrefix.getMaxSuffixLength() == 0) {
        // if we can associate condition objects with each suffix key token sequence to match.

                Set<SQLTokenPredicate> currentlyMatchedHeads = node.data.getValues();
            ListNode<TrieNode<TokenEntry, SQLTokenPredicate>> accumulator = null;
     * Completely replaced on each step of analysis while there are any token entry specified to look at (see {@link #captureToken(TokenEntry)}).
     * performs incremental part of the work on its recognition by the dialect-specific feature conditions
/*
     */
 * See the License for the specific language governing permissions and
     * Drops the accumulated state of the predicate evaluator to prepare it for the next SQL statement analysis.
    @Nullable
            SQLTokenPredicate matchedByPrefix = plausiblePrefixOnlyConditions.iterator().next();
            this.lastMatchedPredicate = matchedBySuffix;
                        this.prefixCaptures.put(capture.key, entry);
    }
        if (statementPrefixTokens.size() <= predicatesSet.getMaxPrefixLength()) {
    private final Deque<TokenEntry> statementSuffixTokens;
        this.statementPrefixPredicates = ListNode.of(predicatesSet.getPrefixTreeRoot());
        Map<String, String> result = new HashMap<>(this.prefixCaptures.size());
     * A number of nodes describing the prefix conditions under consideration for a next token to judge about.
                accumulator = node.data.accumulateSubnodesByTerm(entry, accumulator);
            }
    public SQLTokenPredicateEvaluator(@NotNull SQLTokenPredicateSet predicatesSet) {
                        }
    }
        // fading out of range of analyzable suffix under conditions


        }
     * If sets of conditions being met are not disjoint, then some conditions are actually matched by both the prefix and suffix.
    @NotNull
        // accumulating statement prefix until there is no more prefix conditions to judge on at this position
        this.statementSuffixTokens = new ArrayDeque<>(predicatesSet.getMaxSuffixLength());
    /**
            statementPrefixPredicates = accumulator;
    private ListNode<TrieNode<TokenEntry, SQLTokenPredicate>> statementPrefixPredicates;

                    }
    @Nullable
    private SQLTokenPredicate lastMatchedPredicate = null;
 * Tries to distribute the work across the parsing process in a way to reduce the amount of data for analysis on each step.
     * Complete set of conditions under considerations
     */
            for (var node = statementPrefixPredicates; node != null; node = node.next) {
 */
    public void captureToken(@NotNull TokenEntry entry) {
package org.jkiss.dbeaver.model.sql.parser.tokens.predicates;
    /**
                    for (SQLTokenPredicate matchedByPrefix : currentlyMatchedHeads) {
            if (statementPrefixTokens.size() < predicatesSet.getMaxPrefixLength()) {

    public SQLTokenPredicate getLastMatchedPredicate() {
     */
     */
            this.lastMatchedPredicate = matchedByPrefix;
    private final Set<SQLTokenPredicate> plausiblePrefixOnlyConditions = new HashSet<>();
        Set<SQLTokenPredicate> tailConditionsMatched = plausibleConditions.size() > 0 ? predicatesSet.matchSuffix(statementSuffixTokens) : Collections.emptySet();
                    if (node.data.getTerm() instanceof CaptureTokenPredicateNode capture) {
                        } else {
 * Unless required by applicable law or agreed to in writing, software

    private final Set<SQLTokenPredicate> plausibleConditions = new HashSet<>();
import org.jkiss.dbeaver.Log;
public class SQLTokenPredicateEvaluator {
 * DBeaver - Universal Database Manager
    }
     */
        } else if (!tailConditionsMatched.isEmpty()) {
    /**
        this.prefixCaptures.clear();
    private final Deque<TokenEntry> statementPrefixTokens;
                statementPrefixTokens.add(entry);
            return matchedBySuffix.getActionKind();
     * Checks for a presence of conditions matching accumulated prefix and suffix.
        this.lastMatchedPredicate = null;
 * Licensed under the Apache License, Version 2.0 (the "License");
     */
        // accumulating statement suffix dropping the unnecessary part of token's sequence
            }
 * Incremental token predicate evaluator responsible for efficient answering for the question,


            }
    }
                    }
        // check out the intersection of conditions matched by the prefix and suffix
 * Copyright (C) 2010-2025 DBeaver Corp and others
     * Statement suffix still should be analyzed to be sure if any of them really matched (see {@link #evaluatePredicates()}).
        statementPrefixPredicates = ListNode.of(predicatesSet.getPrefixTreeRoot());
        // We are inspecting the whole set of suffix predicates here by matching them using trie, so no simple brute force at all.
     * A number of tokens representing suffix of the SQL statement under analysis
        // It can also be optimized even further by using Aho–Corasick algorithm (which is actually an evolution of trie),

            if (statementSuffixTokens.size() >= predicatesSet.getMaxSuffixLength()) {

            result.put(kv.getKey(), kv.getValue().getString());
        }
     */
        if (predicatesSet.getMaxSuffixLength() > 0) {
    private final HashMap<String, TokenEntry> prefixCaptures = new HashMap<>();
                statementSuffixTokens.removeFirst();
 */
import org.jkiss.code.NotNull;
        this.predicatesSet = predicatesSet;

        plausiblePrefixOnlyConditions.clear();
                }
                            plausiblePrefixOnlyConditions.add(matchedByPrefix);
     */

     * Suffix is already incrementally matched during its accumulation, so here we're just matching the suffix predicates.
            if (this.predicatesSet.hasCaptures()) {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
    public Map<String, String> obtainPrefixCaptures() {
 *
                for (var node = statementPrefixPredicates; node != null; node = node.next) {
 *
            // incrementally reducing total set of plausibly matching conditions according to the token being consumed
import java.util.*;
        return this.lastMatchedPredicate;
     * Effectively reduces the amount of conditions to check during each step of analysis by accumulating only the prefix-matched conditions in the {@link #plausibleConditions}
import org.jkiss.dbeaver.model.sql.parser.*;
        for (Map.Entry<String, TokenEntry> kv : this.prefixCaptures.entrySet()) {
    public SQLParserActionKind evaluatePredicates() {
                    // longer prefixes would be discovered only during the next token analysis among the reduced set of conditions
     * A number of conditions considered matching according to the judgement based on the accumulated statement prefix (see {@link #statementPrefixPredicates});
        return result;
    /**
                if (currentlyMatchedHeads.size() > 0) {
    /**
 * whether any of presented dialect-specific conditions met during parsing of the sequence of tokens.

        this.statementPrefixTokens = new ArrayDeque<>(predicatesSet.getMaxPrefixLength());
        statementSuffixTokens.clear();
     * A number of tokens representing prefix of the SQL statement under analysis
        tailConditionsMatched.retainAll(plausibleConditions);
/**
 * You may obtain a copy of the License at
        return null;

            return matchedByPrefix.getActionKind();
    public void reset() {
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
            plausiblePrefixOnlyConditions.clear();
            SQLTokenPredicate matchedBySuffix = tailConditionsMatched.iterator().next();
            statementSuffixTokens.add(entry);
        }
    static protected final Log log = Log.getLog(SQLTokenPredicateEvaluator.class);
            log.warn("Ambiguous token predicates match");
                            plausibleConditions.add(matchedByPrefix);
                }
        } else if (!plausiblePrefixOnlyConditions.isEmpty()) {
    private final SQLTokenPredicateSet predicatesSet;
}
            }
    }
import org.jkiss.code.Nullable;
 * you may not use this file except in compliance with the License.
     * Captures given token entry accumulating information about the SQL statement under analysis and
        statementPrefixTokens.clear();

    /**
 *
    /**
        plausibleConditions.clear();
        if (tailConditionsMatched.size() + plausiblePrefixOnlyConditions.size() > 1) {
     * Returns key-value pairs of the capture token predicate keys and captured values
import org.jkiss.dbeaver.utils.ListNode;
        }
                    // accumulating conditions considered matched according to the already captured part of the statement prefix
     */
    /**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    /**
