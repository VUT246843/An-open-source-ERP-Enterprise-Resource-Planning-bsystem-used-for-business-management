        }
        return KNOWN_ANY_RULES.contains(node.getNodeKindId());
                        nameNodes.addFirst(item.term);
        return anyWordPattern.matcher(str).matches();
    @NotNull
        ATNState initialState = atn.states.get(atn.ruleToStartState[SQLStandardParser.RULE_sqlQueries].stateNumber);
            if (immItem != null && immItem.term.getRealInterval().properlyContains(Interval.of(position - 1, position - 1))) {
                                }
        boolean expectingColumnReference,
                case Transition.PREDICATE:
                    : this.allNonErrorTerms.get(index);

    private static boolean isAnySomethingNode(@NotNull STMTreeNode node) {
                    // use previous node, its rule end state
 * you may not use this file except in compliance with the License.
        int positionToInspect = position;
                                } else {
            for (int v = a; v <= b; v++) {

        return false;
                            }
            expectingColumnReference,
import org.jkiss.dbeaver.utils.ListNode;
        SQLStandardLexer.Semicolon,
            if (position > range.b + 1) {
import org.antlr.v4.runtime.TokenSource;
            }
                    throw new UnsupportedOperationException("Unrecognized ATN transition type.");
    }

            ListNode<Integer> stack = pair.getSecond();
    private static final Set<String> knownReservedWords = new HashSet<>(BasicSQLDialect.INSTANCE.getReservedWords());
                }
                String word = SQLStandardParser.VOCABULARY.getDisplayName(v);
                case Transition.WILDCARD:

                            initialState = atn.states.get(node.getAtnState()).getTransitions()[0].target;
    private static IntervalSet getTransitionTokens(@NotNull Collection<Transition> transitions) {
        SQLStandardParser.RULE_tableHintKeywords
        ))
                    TermItem item = allTerms.get(i);
            }
    private static SyntaxInspectionResult inspectAbstractSyntaxAtTreeState(@NotNull STMTreeNode node, @NotNull ATNState initialState) {
        }
import org.antlr.v4.runtime.misc.IntervalSet;
                    case Transition.RULE, Transition.EPSILON, Transition.PREDICATE, Transition.ACTION, Transition.PRECEDENCE -> {

    private static SyntaxInspectionResult prepareOffquerySyntaxInspectionInternal() {
        reachabilityTestRules.forEach(n -> reachabilityTests.put(n, false));
                    if (subpathNode.equals(stackItem.data)) {
    @NotNull
/*
        boolean expectingColumnIntroduction,
                }
                for (int i = node.getChildCount() - 1; i >= 0; i--) {
    public record NameInspectionResult(
                if (nodeRange != null && nodeRange.a <= position) {
                    return SyntaxInspectionResult.EMPTY;
                            case ATNState.RULE_STOP -> {
                    case Transition.ATOM, Transition.RANGE, Transition.SET, Transition.NOT_SET, Transition.WILDCARD ->
        SQLStandardParser.RULE_identifier,
                    } else {
        );
package org.jkiss.dbeaver.model.stm;
            STMTreeTermNode node;
        SQLStandardParser.RULE_joinCondition
                                    continue;
                    if (parent != null) {

                                }
 * Copyright (C) 2010-2025 DBeaver Corp and others
                        }
                node instanceof STMTreeTermNode term && term.getSymbol().getType() == SQLStandardLexer.ON
    private static TermNodeKind classifyTermNode(@NotNull STMTreeNode term, boolean isAnySomething) {
        Map.entry(SQLStandardParser.RULE_columnReference, List.of(
    @NotNull
    private final STMTreeNode root;
                .collect(Collectors.toMap(e -> SQLStandardParser.ruleNames[e.getKey()], Map.Entry::getValue));
    }
            }
            List.of(SQLStandardParser.RULE_anyUnexpected, SQLStandardParser.RULE_selectSublist)
        SQLStandardLexer.PlusSign,
        SQLStandardParser.RULE_tableName,
                    }

                        STMTreeTermNode prevNode = index <= 0 ? null : this.allNonErrorTerms.get(index - 1);
                case Transition.SET:

    }
 * You may obtain a copy of the License at
        performSubtreeTests(presenceTests, stateStack);
        } else {
    private static boolean isAnySomething(STMTreeNode node) {
            stack = stack.next;
 *
                    initialState = atn.states.get(node.getAtnState()).getTransitions()[0].target;
        boolean expectingIdentifier,
        SQLStandardParser.RULE_anyWord,
                if (anyWordPattern.matcher(immItem.term.getTextContent()).matches()) {
     */

                    tokens.addAll(((SetTransition) transition).set);
        boolean expectingColumnReference = reachabilityTests.get(SQLStandardParser.RULE_columnReference) || presenceTests.get(SQLStandardParser.RULE_columnReference);
                case Transition.RANGE: {
    ){
        }
        TermItem currentTerm = null;
        if (index < 0) {

        this.allNonErrorTerms = termLists.getSecond();
            ATNState state = pair.getFirst();
        @NotNull ATNState initialState

            false,
                    hasPeriod = true;
    private static String collectStack(ListNode<Integer> stack) {
                    if (node == null) {
                case Transition.RULE: 
 * See the License for the specific language governing permissions and
                    initialState = atn.states.get(node.getAtnState()).getTransitions()[0].target;
        NodesStackItem stack = new NodesStackItem(root, false, null);
        HashSet<Transition> results = new HashSet<>();
            false,
                path.addFirst(rn);

import org.jkiss.utils.Pair;
        SQLStandardLexer.Solidus,
                        // otherwise position is after its end, so we need its end state
        STMTreeNode term,
            || (term.getParentNode() != null && term.getParentNode().getNodeKindId() == SQLStandardParser.RULE_nonReserved)

                    predictedWords.add(word);
    }
    @NotNull
                        }
        SQLStandardLexer.Percent,
    private final List<STMTreeTermNode> allNonErrorTerms;
        SQLStandardParser.RULE_columnName,
        }
                                performSubtreeTests(reachabilityTests, transitionStack);
                    tokens.add(t.from, t.to);
    private static Collection<Transition> collectFollowingTerms(

        @Nullable STMTreeNode node,
    private static final Set<Integer> KNOWN_IDENTIFIER_PART_TOKENS = Set.of(
                            case ATNState.RULE_START -> {
        Map.entry(SQLStandardParser.RULE_tableName, List.of(
        return Pair.of(allTerms, allNonErrorTerms);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    STMTreeNode childNode = node.getChildNode(i);
        SQLStandardLexer.LeftParen,
        Collection<Transition> tt = collectFollowingTerms(stack, initialState, knownReservedWordsExcludeRules, reachabilityTests);
                            }

        HashSet<Pair<ATNState, ListNode<Integer>>> visited = new HashSet<>();
    }
        SQLStandardParser.RULE_nonjoinedTableReference,
            int b = interval.b;
                if (index < 0) {
        Set<Integer> predictedTokenIds = new HashSet<>();
    }
        ListNode<Integer> emptyStack = ListNode.of(null);
        boolean expectingValue,
        STMTreeNode currentTerm,
            presenceTests.computeIfPresent(s, (k, v) -> true);
                        initialState = atn.states.get(parent.getAtnState());
        }
        {
        int positionToInspect
                    node = this.allNonErrorTerms.get(index - 1);
            }
        }            
            false,
        boolean hasPeriod,
            false,
        SQLStandardLexer.RightBracket,
        @NotNull Set<Integer> predictedTokenIds,
                    }
            return null;
    private static Set<Integer> KNOWN_ANY_RULES = Set.of(
        SQLStandardParser.RULE_columnReference,

                            // we need its start state
        Map<Integer, Boolean> presenceTests = performPresenceTests(stack);
    );
        IDENTIFIER,
        List<TermItem> allTerms = new ArrayList<>();
            expectingColumnName,
                        if (prevNode != null && isAnySomething(node) && !isAnySomething(prevNode)) {

 *
            .map(ss -> ss == null ? "<NULL>" : SQLStandardParser.ruleNames[ss])
import org.jkiss.dbeaver.model.impl.sql.BasicSQLDialect;
                                if (exceptRules.contains(state.ruleIndex)) {
        SQLStandardParser.RULE_tableName,
        return new NameInspectionResult(nameNodes, hasPeriod, currentTerm != null ? currentTerm.term : null, positionToInspect);
                }
                if (node.getRealInterval().a >= 0 && node.getRealInterval().b >= 0) {
        SQLStandardParser.RULE_columnReference,
                    STMTreeNode parent = node.getParentNode();
            || isAnySomething
        public static final SyntaxInspectionResult EMPTY = new SyntaxInspectionResult(
        Map<Integer, Boolean> reachabilityTests = new HashMap<>(reachabilityTestRules.size());
            for (STMTreeNode n = node.getParentNode(); n instanceof RuleNode rn; n = n.getParentNode()) {
        SQLStandardParser.RULE_tableName,
            return inspectAbstractSyntaxAtState(node, stack, initialState);
    public LSMInspections(@NotNull SQLDialect dialect, @NotNull STMTreeNode root) {
        }
            return TermNodeKind.PERIOD;
                    // matches "anything" so don't consider them
                Interval nodeRange = node == null ? null : node.getRealInterval();
    @Nullable
            }
    }
    }
            var path = new LinkedList<RuleNode>();
                }
        boolean expectingColumnName = reachabilityTests.get(SQLStandardParser.RULE_columnName);
    @NotNull
                        } else {
            presenceTests.get(SQLStandardParser.RULE_joinCondition) && (
        SQLStandardParser.RULE_anyUnexpected,
        @NotNull ListNode<Integer> stack,
        @NotNull
                }
        this.allTerms = termLists.getFirst();
        while (stack != null) {
    public static Pair<List<TermItem>, List<STMTreeTermNode>> prepareTerms(@NotNull STMTreeNode root) {

import org.jkiss.dbeaver.model.lsm.sql.impl.syntax.SQLStandardParser;
            index = ~index - 1;
        SQLStandardLexer.NotEqualsOperator,
        @NotNull Map<Integer, Boolean> reachabilityTests,
        SQLStandardLexer.RightBrace,
        boolean expectingTableReference,


    public static final Set<Integer> KNOWN_SEPARATOR_TOKENS = Set.of(
    @NotNull
                ListNode<Integer> stackItem = stack;
        return presenceTests;
    private static Map<Integer, Boolean> performPresenceTests(ListNode<Integer> stateStack) {

        this.root = root;
    public NameInspectionResult collectNameNodes(int position) {
            } else if (node instanceof STMTreeTermErrorNode err) {
    public static SyntaxInspectionResult prepareOffquerySyntaxInspection() {
    private static final Pattern anyWordHeadPattern = Pattern.compile("^\\w+");
                        ListNode<Integer> transitionStack;
            }
 * limitations under the License.
        if (term instanceof STMTreeTermNode t && t.symbol.getType() == SQLStandardLexer.Period) {

        }
            if (node instanceof STMTreeTermNode term) {
    @NotNull
        SQLStandardParser.RULE_anyValue,
import org.jkiss.code.Nullable;
                    immItem = allTerms.get(index - 1);
import org.jkiss.dbeaver.model.sql.SQLDialect;
                case Transition.ACTION:
        for (Transition transition : transitions) {
                    break;

        SQLStandardParser.RULE_anyUnexpected
            return TermNodeKind.OTHER;
                switch (transition.getSerializationType()) {
     */
        SQLStandardLexer.Ampersand,
         */
        SQLStandardParser.RULE_columnName,
import org.jkiss.dbeaver.model.lsm.sql.impl.syntax.SQLStandardLexer;
        SQLStandardLexer.LeftBracket,
                    allTerms.add(new TermItem(err, classifyTermNode(err, nodeItem.isAnySomething())));
    private static final Map<Integer, List<List<Integer>>> subtreeTests = Map.ofEntries(
        presenceTestRules.forEach(n -> presenceTests.put(n, false));

                break;
            Collections.emptyMap(),
                        if (i < 0 || allTerms.get(i).kind == TermNodeKind.PERIOD) {
                reachabilityTest.computeIfPresent(subtreeTest.getKey(), (k, v) -> true);

    public static boolean matchesAnyWord(String str) {
        for (Interval interval : transitionTokens.getIntervals()) {
                        i--;

        boolean expectingColumnName,
    }
            return this.reachabilityTests.entrySet().stream()
                    if (node == null) {
            Collections.emptySet(),
                        }

 * DBeaver - Universal Database Manager
        if (index >= 0) {
        @NotNull
        OTHER
            reachabilityTests,
                    index--; // skip identifier separator immediately before the cursor
                            q.addLast(nextState);
                    tokens.add(((AtomTransition) transition).label);
        }
            false
            predictedTokenIds,

        SQLStandardLexer.Colon,

    private static final Set<Integer> reachabilityTestRules = Set.of(
        boolean expectingJoinCondition
                        return SyntaxInspectionResult.EMPTY;
            expectingTableName,
            return TermNodeKind.IDENTIFIER;
                    stack = new NodesStackItem(childNode, isAnySomething, stack);
     * Returns information about the syntax tree state in the specified position, providing info about expected tokens
        for (STMTreeNode n = node; n != null; n = n.getParentNode()) {
        SQLStandardParser.RULE_aggregateExprParam,
                }
            }
            TermItem immItem = allTerms.get(index);
                }
    public static Interval matchAnyWordHead(String str) {
        SQLStandardLexer.LessThanOperator,
    }
        Interval range = this.root.getRealInterval();
        }
        SQLStandardLexer.MinusSign,
                                reachabilityTests.computeIfPresent(state.ruleIndex, (k, v) -> true);
            || (term instanceof STMTreeTermErrorNode e && anyWordPattern.matcher(e.getText()).matches())
            }
                        continue subtreeTests;
                    allNonErrorTerms.add(term);
        )),
import java.util.*;

            expectingTableName && (reachabilityTests.get(SQLStandardParser.RULE_nonjoinedTableReference) ||
                    if (item.kind == TermNodeKind.IDENTIFIER) {

        SQLStandardParser.RULE_pattern
    @NotNull
    }
                if (immItem.kind == TermNodeKind.PERIOD) {
                        results.add(transition);
    public SyntaxInspectionResult prepareAbstractSyntaxInspection(int position) {

        SQLStandardParser.RULE_identifier,
                return true;
    private static void performSubtreeTests(@NotNull Map<Integer, Boolean> reachabilityTest, ListNode<Integer> stack) {
            reachabilityTests.get(SQLStandardParser.RULE_identifier) || presenceTests.get(SQLStandardParser.RULE_identifier),
        Matcher m = anyWordHeadPattern.matcher(str);
                    }
                case Transition.NOT_SET: 
                for (Integer subpathNode : subpath) {
        return tokens;
import java.util.stream.Collectors;
        SQLStandardParser.RULE_columnReference,

        return offqueryInspectionResult;
import org.antlr.v4.runtime.tree.RuleNode;
        return inspectAbstractSyntaxAtState(null, emptyStack, initialState);
    }
        Pair<List<TermItem>, List<STMTreeTermNode>> termLists = this.prepareTerms(root);
        SQLStandardParser.RULE_anyWord,
            )
        SQLStandardLexer.Identifier,
    }

            } else {
            // position is actually considered to be right _after_ the term of interest,
            .collect(Collectors.joining(", "));

                            node = this.allNonErrorTerms.get(index - 1);
import org.antlr.v4.runtime.tree.TerminalNode;
                    boolean isAnySomething = nodeItem.isAnySomething || isAnySomethingNode(childNode);
        return new SyntaxInspectionResult(
         * to cover situations when we have ambiguous terms like '(' and so all the possible terms are not visible
                // TODO consider when to take previous term to get correct inspected keywords
    /**
                                transitionStack = ListNode.push(stack, state.ruleIndex);
    }
 */
                }
                        index = this.allNonErrorTerms.size() - 1;

                    } else {
        SQLStandardLexer.QuestionMark,
        SQLStandardLexer.Tilda
                    break;
        public Map<String, Boolean> getReachabilityByName() {
        SQLStandardParser.RULE_anyProperty,
    );
        SQLStandardLexer.RightParen,
        SQLStandardLexer.Asterisk,
        SQLStandardParser.RULE_anyWordsWithProperty,
    private static final Set<Integer> presenceTestRules = Set.of(
                            initialState = atn.states.get(node.getAtnState());
}
                    positionToInspect = immItem.term.getRealInterval().a;
                    ? null
    private final List<TermItem> allTerms;
    @NotNull
                    // doesn't describe matching in terms of tokens, so ignore them
        for (Integer s : stateStack) {
        SQLStandardLexer.Comma,
            subtreeTests:
        SQLStandardParser.RULE_correlationName,

    private final SQLDialect dialect;
                } else {
                        }
                        if (visited.add(nextState)) {

        SQLStandardLexer.GreaterThanOrEqualsOperator,
                if (this.allNonErrorTerms.size() > 0) {
    );
    }
        LinkedList<Pair<ATNState, ListNode<Integer>>> q = new LinkedList<>();
                node = this.allNonErrorTerms.isEmpty() || index >= this.allNonErrorTerms.size()
                                ) {

        List<STMTreeTermNode> allNonErrorTerms = new ArrayList<>();
    );

        record NodesStackItem(STMTreeNode node, boolean isAnySomething, NodesStackItem next) { }
                }
                        // containing term found
                index = STMUtils.binarySearchByKey(this.allNonErrorTerms, t -> t.getRealInterval().a, position, Comparator.comparingInt(k -> k));
         * from the given initial state, because there may be more valid states for an ambiguous term
            for (List<Integer> subpath : subtreeTest.getValue()) {
                }

        Map<Integer, Boolean> presenceTests = new HashMap<>(presenceTestRules.size());
 * Licensed under the Apache License, Version 2.0 (the "License");
                        stackItem = stackItem.next;
                presenceTests.get(SQLStandardParser.RULE_nonjoinedTableReference)),
    ) {
import org.jkiss.code.NotNull;
        }

                stack = ListNode.push(stack, rn.getRuleContext().getRuleIndex());
    );
                if (word != null && knownReservedWords.contains(word)) {
        return results;
            List.of(SQLStandardParser.RULE_anyUnexpected, SQLStandardParser.RULE_tableReference)
                                    continue;

            false,


                    index = this.allNonErrorTerms.size() - 1;
                } else  {
 *
            for (Transition transition : state.getTransitions()) {
        int index = STMUtils.binarySearchByKey(this.allTerms, t -> t.term.getRealInterval().a, position, Comparator.comparingInt(k -> k));
                        switch (state.getStateType()) {
                    }
        int atnStateIndex = node.getAtnState();
    );
    private static final Pattern anyWordPattern = Pattern.compile("^\\w+$");
                } else {
                case Transition.PRECEDENCE:
            expectingColumnReference && reachabilityTests.get(SQLStandardParser.RULE_derivedColumn),
        @NotNull Map<Integer, Boolean> reachabilityTests
        PERIOD,
                    break;
                        } else if (KNOWN_SEPARATOR_TOKENS.contains(node.symbol.getType()) || (nodeRange.a == position && index > 0)) {
        SQLStandardParser.RULE_nonjoinedTableReference,
        this.dialect = dialect;
        SQLStandardLexer.GreaterThanOperator,
            predictedWords,
import java.util.regex.Matcher;
        /* TODO roll back through the prepending terms until only one forward branch available for a given sequence of terms
    }
    }

        SQLStandardLexer.LeftBrace,
                    immItem = null;
    );
            if (KNOWN_ANY_RULES.contains(n.getNodeKindId())) {
    private static SyntaxInspectionResult inspectAbstractSyntaxAtState(
        @NotNull
    }
        ) {
    @NotNull
        SQLStandardLexer.VerticalBar,
            false,
        SQLStandardParser.RULE_derivedColumn,
            int a = interval.a;
import org.antlr.v4.runtime.misc.Interval;
            return inspectAbstractSyntaxAtTreeState(node, initialState);
            for (RuleNode rn : path) {
                if (index > 0) {
                            // we need target state of the previous term
    @NotNull
                case Transition.ATOM:  {
        while (q.size() > 0) {
                    RangeTransition t = (RangeTransition) transition;
        Set<String> predictedWords = new HashSet<>();

            }
                                    transitionStack = stack.next; // pop

                if (dialect.getReservedWords().contains(immItem.term.getTextContent().toUpperCase())) {
    }
        } else {

            reachabilityTests.get(SQLStandardParser.RULE_pattern),
        boolean expectingTableName = reachabilityTests.get(SQLStandardParser.RULE_tableName) || presenceTests.get(SQLStandardParser.RULE_tableName);
        } else {
                for (int i = index; i >= 0; i--) {
            int index;
        SQLStandardParser.RULE_identifier,
        ListNode<Integer> stack = ListNode.of(null);
    }
        IntervalSet transitionTokens = getTransitionTokens(tt);
            if (immItem.term.getRealInterval().a >= position) {
    ) {
        SQLStandardLexer.TypeCast,
                    } else {
        IntervalSet tokens = new IntervalSet();
            switch (transition.getSerializationType()) {
        return m.find() ? new Interval(m.start(), m.end() - 1) : null;



                    index = ~index - 1;
            }
    }
        SQLStandardLexer.DoublePeriod,
         * in the given context outside of the specific tree
                    } else {
                            default -> transitionStack = stack;
                }
        }
    @NotNull
        SQLStandardLexer.Quotted
                case Transition.EPSILON:
    @NotNull
    private enum TermNodeKind {
                        break; // not an identifier part
                } else if (index > 0) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        @NotNull ATNState initialState, Set<Integer> exceptRules,
        );
    }

import java.util.regex.Pattern;
        SQLStandardLexer.LessThanOrEqualsOperator,
        for (Map.Entry<Integer, List<List<Integer>>> subtreeTest : subtreeTests.entrySet()) {
                    index--;
        ATN atn = SQLStandardParser._ATN;
            Collections.emptySet(),

            STMTreeNode node = nodeItem.node();
import java.util.stream.StreamSupport;

                                    && transition.target.ruleIndex == stack.next.data
                    }
        q.addLast(Pair.of(initialState, stateStack));
            List.of(SQLStandardParser.RULE_anyUnexpected, SQLStandardParser.RULE_searchCondition),
        return StreamSupport.stream(stack.spliterator(), false)
    private record TermItem(
                }
    ) {
            false,
                            node = prevNode;
            Pair<ATNState, ListNode<Integer>> pair = q.removeLast();

 *     http://www.apache.org/licenses/LICENSE-2.0
                        Pair<ATNState, ListNode<Integer>> nextState = Pair.of(transition.target, transitionStack);
            } else {
                if (node.getRealInterval().a >= 0 && node.getRealInterval().b >= 0) {
                    break;
            }
        SQLStandardLexer.EqualsOperator,
                }
                            initialState =  atn.states.get(node.getAtnState()).getTransitions()[0].target;
import org.antlr.v4.runtime.Token;
        boolean hasPeriod = false;
        } else if (term instanceof STMTreeTermNode t && KNOWN_IDENTIFIER_PART_TOKENS.contains(t.symbol.getType())
                    if (nodeRange.b + 1 >= position) {
                    default -> throw new UnsupportedOperationException("Unrecognized ATN transition type.");

                    currentTerm = immItem;
            NodesStackItem nodeItem = stack;
                }
        boolean expectingTableSourceIntroduction,

     * Returns the information about the location of the first found match of any word in the provided string

        SQLStandardParser.RULE_nonReserved,
    private static final Set<Integer> knownReservedWordsExcludeRules = Set.of(
    /**
        @NotNull ListNode<Integer> stateStack,
            ATNState initialState;

                }
 * Unless required by applicable law or agreed to in writing, software
                            break; // not followed by an identifier separator part
                    allTerms.add(new TermItem(term, classifyTermNode(term, nodeItem.isAnySomething())));
        }
                        initialState = atn.states.get(node.getAtnState()).getTransitions()[0].target;

            return SyntaxInspectionResult.EMPTY; // TODO error node met, consider using previous valid node
public class LSMInspections {
                                if (stack != null && stack.data != null && stack.next != null && stack.next.data != null
                        return SyntaxInspectionResult.EMPTY;
                }

                    // subroot itself contains given position, use its rule start state

    ) {
        }
        SQLStandardLexer.DelimitedIdentifier,
                    // is not responsible for matching, so ignore them
import org.antlr.v4.runtime.atn.*;
        TermNodeKind kind
        ArrayDeque<STMTreeNode> nameNodes = new ArrayDeque<>();
    public record SyntaxInspectionResult(
    @NotNull
                    }
    @NotNull
        @NotNull Set<String> predictedWords,
                    }

    private static final SyntaxInspectionResult offqueryInspectionResult = prepareOffquerySyntaxInspectionInternal();
        ATN atn = SQLStandardParser._ATN;

                    predictedTokenIds.add(v);
        SQLStandardParser.RULE_anyWordWithAnyValue,
                    node = this.allNonErrorTerms.get(index);

            // so use we the previous one on the exact match
                default:
        if (position < range.a || this.allNonErrorTerms.isEmpty()) {
        SQLStandardLexer.ConcatenationOperator,
        ArrayDeque<STMTreeNode> nameNodes,
        if (atnStateIndex < 0) {
