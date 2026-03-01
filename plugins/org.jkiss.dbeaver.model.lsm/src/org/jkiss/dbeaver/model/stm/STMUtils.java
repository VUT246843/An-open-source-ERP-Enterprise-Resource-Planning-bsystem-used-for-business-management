        int low = 0;
            if (node instanceof STMTreeTermNode term) {
            } else {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        List<STMTreeNode> result = new ArrayList<>();
import org.jkiss.code.Nullable;
            Tree first = node;
            } else {
            STMTreeNode node = stack.pop();
    }
            }
            Tree last = node;
            if (comparator.compare(key, lastKey) > 0) {
     *   }
            result = stmNode.getTextContent();
     *
            while (!(first instanceof TerminalNode) && first.getChildCount() > 0) {
        @NotNull Set<String> toCollect
            if (first instanceof TerminalNode a && last instanceof TerminalNode b) {
        @NotNull T value,
import org.jkiss.utils.CommonUtils;
            K midVal = keyGetter.apply(list.get(mid));
        @Nullable Set<String> toExpand,
 * distributed under the License is distributed on an "AS IS" BASIS,
     *     Note that this guarantees that the return value will be >= 0 if and only if the key is found.
                    stack.push((STMTreeNode) node.getChild(i));
        @NotNull Comparator<K> comparator
     *     // Not found:
     * A positive result gives the found position/index. A negative result gives the one's complement of the insert position.
    }
        }
            String nodeName = node.getNodeName();
        Stack<STMTreeNode> stack = new Stack<>();

        return CommonUtils.notEmpty(result);
        int high = list.size() - 1;
        } else {
            if (node instanceof STMTreeTermNode term) {
        stack.add(root);
    public static String getTextContent(Tree node) {
                    stack.push((STMTreeNode) node.getChild(i));
    @NotNull
            STMTreeNode node = stack.pop();
                result = b.getSymbol().getTokenSource().getInputStream().getText(textRange);
        stack.add(root);
 *     http://www.apache.org/licenses/LICENSE-2.0
        return -(low + 1);  // key not found

     * @param <T> - type of the element
public class STMUtils {
            if (toCollect.contains(nodeName)) {
            list = new ArrayList<>();
        List<STMTreeTermNode> result = new ArrayList<>();
            while (!(last instanceof TerminalNode) && last.getChildCount() > 0) {
                result.add(term);
                }

     * Returns text covered by the provided node
     *
                list.add(value);
                low = mid + 1;
import org.antlr.v4.runtime.tree.Tree;
        if (list.isEmpty()) {
     * @param key - key to search for
    /**
            int cmp = comparator.compare(midVal, key);
        if (list == null) {

            } else if (cmp > 0) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
            K lastKey = keyGetter.apply(list.get(list.size() - 1));
                if (index < 0) {

    ) {
     * </pre>
     */
    public static <T> List<T> combineLists(
            list.add(value);
    ) {
                first = first.getChild(0);
    @NotNull
        return result;
                }
            int mid = (low + high) >>> 1;
}
        @NotNull List<T> leftColumns,
        while (stack.size() > 0) {
 */
    ) {
     *     int insertPos = ~foundPos;
    public static <T, K> int binarySearchByKey(
            }
     * @param list - collection to insert to
        @NotNull List<T> list,
        }
    /**
    @NotNull
        }

        if (node instanceof STMTreeNode stmNode) {
        @NotNull Comparator<K> comparator
 *
                int index = binarySearchByKey(list, keyGetter, key, comparator);
        @NotNull Function<T, K> keyGetter,

     * @param value - value to insert
     *         or list.size() if all elements in the list are less than the specified key.
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
                last = last.getChild(last.getChildCount() - 1);
     *         the index of the first element greater than the key,
        @Nullable List<T> list,
     */
    }
import java.util.*;
            }
                list.add(index, value);
            
        Stack<STMTreeNode> stack = new Stack<>();

     * Provides a new list containing leftColumns list elements and then rightColumns list elements
            STMTreeNode node = stack.pop();
     * @param keyGetter - Function to apply to the element of the collection before comparison
                }
     * <br />
        return list;
    public static <T, K> List<T> orderedInsert(


                for (int i = node.getChildCount() - 1; i >= 0; i--) {


     * (see {@link Arrays#binarySearch(Object[], Object, Comparator) Arrays::binarySearch} and 
                return mid; // key found
 *
     * @param <K> - type of the return value of keyGetter
    public static List<STMTreeNode> expandSubtree(
     * @param comparator - elements comparator
    }
    }
        List<T> symbols = new ArrayList<>(leftColumns.size() + rightColumns.size());
                result.add(term.getText());
     * Return value follows standard convention of the binary search implementations 
     * @param <K> - type of the return value of keyGetter
 * You may obtain a copy of the License at
        while (!stack.isEmpty()) {
     */
        @NotNull Function<T, K> keyGetter,
     *
                }
        @NotNull List<T> rightColumns

        }

    }
import org.jkiss.code.NotNull;
                    stack.push((STMTreeNode) node.getChild(i));
import org.antlr.v4.runtime.tree.TerminalNode;
            } else {
        List<String> result = new ArrayList<>();
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
     *   int foundPos = Arrays.binarySearch(array, key);
        return result;
        while (stack.size() > 0) {
import org.antlr.v4.runtime.tree.ParseTree;
/*
            if (cmp < 0) {
    }
        Stack<STMTreeNode> stack = new Stack<>();
            }


     * Insert element to the sorted collection
        } else {
    /**
     * @return index of the element, if it is found or (-(insertion point) - 1).
                high = mid - 1;
     * @param keyGetter - Function to apply to the element of the collection before comparison
                for (int i = 0; i < node.getChildCount(); i++) {
            }
                for (int i = 0; i < node.getChildCount(); i++) {
        symbols.addAll(leftColumns);
        String result = null;
import java.util.function.Function;
     *     The insertion point is defined as the point at which the key would be inserted into the list:
        }
 *
            } else {
        }
                result.add(node);
                Interval textRange = Interval.of(a.getSymbol().getStartIndex(), b.getSymbol().getStopIndex());
            }
     * @param list - list to search in
        @NotNull K key,
        symbols.addAll(rightColumns);
    /**
     * <a href="https://stackoverflow.com/a/64748510">See also a nice note on the use case</a>:

    @NotNull
            } else if (toExpand == null || toExpand.contains(nodeName)) {
 * limitations under the License.
    public static List<String> expandTermStrings(@NotNull STMTreeNode root) {
package org.jkiss.dbeaver.model.stm;
        return symbols;
        return result;
import org.antlr.v4.runtime.misc.Interval;
     * Perform binary search by the key in the sorted collection.
    ) {

        stack.add(root);
        }
     * <pre>
    @NotNull
     *      {@link Collections#binarySearch(List, Object, Comparator) Collections::binarySearch} ).
     * @param comparator - elements comparator

 * you may not use this file except in compliance with the License.
     */
        while (low <= high) {
     * @return a list with inserted value
            }
    public static List<STMTreeTermNode> expandTerms(@NotNull STMTreeNode root) {
        @NotNull STMTreeNode root,
            K key = keyGetter.apply(value);
     * @param <T> - type of the element
 * See the License for the specific language governing permissions and
     *   if (foundPos < 0) {
                    index = ~index;
