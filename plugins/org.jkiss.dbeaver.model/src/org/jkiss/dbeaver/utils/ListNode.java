                } else {
        return new ListNode<T>(node, data);
            }

 * limitations under the License.

    @NotNull
import java.util.Iterator;
}
    @NotNull
                    node = node.next;
 * Represents node of single-linked-list without any unwanted computational cost.
        return new Iterator<T>() {
    }
        return list != null;

    }
    }
        return nodes;
        return list != null && list.next != null;
     *
 * you may not use this file except in compliance with the License.
    }
    }
    
    public static <T> boolean hasOne(@Nullable ListNode<T> list) {
        this.data = data;
                if (node != null) {
import org.jkiss.code.Nullable;
    @NotNull
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public final ListNode<T> next;
 * DBeaver - Universal Database Manager
/**
    public Iterator<T> iterator() {

     * Join of two linked lists
 * See the License for the specific language governing permissions and
            public boolean hasNext() {
 * You may obtain a copy of the License at
            @Override
                    T result = node.data;
            }
 * Unless required by applicable law or agreed to in writing, software
    public static <T> boolean hasAny(@Nullable ListNode<T> list) {
            private ListNode<T> node = ListNode.this;
 *
            @Override
    }
    public static <T> boolean hasMany(@Nullable ListNode<T> list) {
 * distributed under the License is distributed on an "AS IS" BASIS,
public class ListNode<T> implements Iterable<T> {
package org.jkiss.dbeaver.utils;

        this.next = next;
    }
        }
    
    public static <T> ListNode<T> of(@Nullable T data) {
     */

        return new ListNode<T>(new ListNode<T>(null, data1), data2);
                    throw new NoSuchElementException();

    public static <T> ListNode<T> push(@Nullable ListNode<T> node, @Nullable T data) {

                    return result;
        Iterator<T> itr = joinList.iterator();
        };
    private ListNode(@Nullable ListNode<T> next, T data) {
        return list != null && list.next == null;
    }
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
 * @param <T>

    public final T data;
    @NotNull
    public static <T> ListNode<T> of(@NotNull T data1, @NotNull T data2) {
            nodes = ListNode.push(nodes, itr.next());
 * Takes 0 resources to represent empty list with NULL value.
    /**
/*
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
        while (itr.hasNext()) {
import org.jkiss.code.NotNull;

     * @return - result of join
                return node != null;
            public T next() {
                }
    public static <T> ListNode<T> join(@Nullable ListNode<T> nodes, @NotNull ListNode<T> joinList) {
            @NotNull

import java.util.NoSuchElementException;

 */
 */
        return new ListNode<T>(null, data);
