                }
                    return -1;
        }
                .map(p -> t.collectValuesOnPath(p.iterator()))
                List.of("5", "1", "2", "4"),
        t.add(List.of("5", "1", "3", "4"), 3);
    public void trieNonEmptyRootLookup() {
            return term != null && term.length() > 0 && term.length() < 3;
    }

     *    "3"   "4"6)   "4"3)  "4"2)
        @Override
                Set.of(3, 5),
                } else {
        }
                Set.of(5),

     * Build-up a trie of the following structure:
                    return getComparablePart(first).compareToIgnoreCase(getComparablePart(second));
                List.of("6"),
        return List.of(
     */
                if (second == null) {
                    return 0;

            }
        rootValues.forEach(v -> t.add(List.of(), v));
        private String key;
     * <pre>

    @Test
        @Override
            }
        return t;
                Set.of(),
        private String getComparablePart(String value) {
            this.key = key;

        }
                List.of("5", "2", "3", "4"),
                Set.of(1, 4, 5, 13),
 *     http://www.apache.org/licenses/LICENSE-2.0
        t.add(List.of("5", "1ze", "2"), 11);
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
        // make a set of queries each resulting with a set of values
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

                    return 1;
        var expected = makeExpectedResults();
        t.add(Arrays.asList("5", "1", "2", "", "4"), 13);
     * </pre>
    private List<Set<Integer>> makeExpectedResults() {
     * "4"1)

        // expected results are the same as in {@link #trieLookup()} test, but all of them will include root extra values now
            return number;

        var expected = makeExpectedResults().stream()
        public int compare(String first, String second) {
     *              /  \
                Set.of(4, 5, 6),
        // some extra values to augment trie' root with
            this.number = number;

        List<Set<Integer>> results = makeQueries().stream()
                return getComparablePart(key).equalsIgnoreCase(getComparablePart(term));

     *       "2"4)   "3"    "3"
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.sql.parser.tokens.predicates.Trie;
                List.of("5", "2", "3", "10", "11")
        public boolean isPartiallyComparable(String term) {
        t.add(List.of("5", "1xa", "2"), 7);
    }
        Trie<String, Integer> t = new Trie<>(String::compareToIgnoreCase, new TestLookupComparator());

     *          /   \      \
                Set.of(2),
        t.add(List.of("5", "1", "2", "4"), 6);
        );
    class TestLookupComparator implements TrieLookupComparator<String>, Comparator<String> {
                } else {
        }
                Set.of()
     * Also augmented with some extra nodes at the level of "1"5) considered partially comparable

            return value.substring(0, Math.min(value.length(), 2));
    private Trie<String, Integer> makeTrie() {
/*
 */
    }
    }
            if (key == null || term == null || key.length() == 0 || term.length() == 0) {
        }
        // build a trie
                Set.of(4, 5),
import org.junit.Assert;
 * Licensed under the Apache License, Version 2.0 (the "License");
     *       / \       \      \
        }
        Set<Integer> rootValues = Set.of(-1, -2);
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
package org.jkiss.dbeaver.model.sql.parser;
 *
        t.add(List.of("5", "1yd", "2"), 10);

            return term != null && term.length() > 0;
                if (second == null) {
                List.of("5", "1", "2"),

        t.add(List.of("5", "2", "3", "4"), 2);
        }
        public boolean match(String key, String term) {
                Set.of(4, 5, 6, 7, 8, 9, 10, 11, 12),
import org.junit.Test;
        t.add(List.of("5", "1", "2", "3", "4"), 1);
    }
        t.add(List.of("5", "1y"), 12);
        t.add(List.of("5", "1"), 5);
    public void trieLookup() {

                .map(p -> t.collectValuesOnPath(p.iterator()))
     *   /
            return key;


                Set.of(8, 9, 10, 12),
                .collect(Collectors.toList());
        }
    class TestToken {
                List.of("5", "1", "2", "3", "4"),
        Trie<String, Integer> t = makeTrie();
        public String getKey() {

                Arrays.asList(new String[0]),
        return List.of(

            this.key = key;
    }
 *

import java.util.*;
        List<Set<Integer>> results = makeQueries().stream()

                List.of("5", "1y", "2"),
            } else {
    /**
                .map(s -> new HashSet<>(s))
     * @return
     *         /     \      \
}
        private Number number;
public class TrieTest extends DBeaverUnitTest {
        @Override
        t.add(List.of("5", "1yb", "2"), 8);
     *      /   \       \      \
     *               "5"
        }
        // augment its root with some extra values (trie root corresponds to the path of zero length)
            if (first == null) {
        Trie<String, Integer> t = makeTrie();
import org.jkiss.junit.DBeaverUnitTest;
        t.add(List.of("5", "1yc", "2"), 9);
        @Override
                List.of("5", "1", "3", "4"),

                }
        Assert.assertEquals(expected, results);
import java.util.stream.Collectors;
        Assert.assertEquals(expected, results);
                Arrays.asList("5", "", "2", "4"),
 * limitations under the License.
            this.number = number;

                return true;
 *
     *             /    \
 * DBeaver - Universal Database Manager
    @Test
        }

        // check out the expected query results for each corresponding query
import org.jkiss.dbeaver.model.sql.parser.tokens.predicates.TrieLookupComparator;
            } else {
    private List<List<String>> makeQueries() {
        expected.forEach(s -> s.addAll(rootValues));
        // build a trie
        public boolean isStronglyComparable(String term) {
     *    /
        public Number getNumber() {
                .collect(Collectors.toList());


        public void setKey(String key) {
        );
                List.of("5", "1"),
        public TestToken(String key, Number number) {
                .collect(Collectors.toList());

        t.add(List.of("5", "1", "2"), 4);
     *           "1"5)  "2"
 * you may not use this file except in compliance with the License.
        public void setNumber(Number number) {

 * See the License for the specific language governing permissions and

        // make a set of queries each resulting with a set of values
                Set.of(),
