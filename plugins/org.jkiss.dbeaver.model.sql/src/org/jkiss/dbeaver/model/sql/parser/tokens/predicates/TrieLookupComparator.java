 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * @param term used as a path item key during trie lookup operations

 *
    /**

 * Complete ordering could be established with another strong comparer on strongly comparable items.
/**
    /**
     * @return true if the term contains enough information to be sure that it can be ordered relatively to the any other terms
     * Checks if given term corresponds to the key according to the information being carried by them.
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
public interface TrieLookupComparator<T> extends Comparator<T> {
 * Describes a way to compare trie keys and terms during lookup operations.
     * @param key
 * Unless required by applicable law or agreed to in writing, software
 */
    /**
     * @return true if the term contains enough information to be sure that it can be ordered relatively to the other terms containing not less amount of information
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
 * @param <T> type of the items to compare
    boolean match(@NotNull T key, @NotNull T term);
 *
}
     * @param other
package org.jkiss.dbeaver.model.sql.parser.tokens.predicates;


     * @param term
 * DBeaver - Universal Database Manager
 */
    boolean isPartiallyComparable(@NotNull T term);
     * @return true if entries could  describe the same concrete token
     */
     */
     */
/*
import java.util.Comparator;
     */
    /**
 * limitations under the License.

 *
    boolean isStronglyComparable(@NotNull T term);
     * @return
import org.jkiss.code.NotNull;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at

 * See the License for the specific language governing permissions and
 * Establishes partial ordering on partially comparable items.
     * @param term used as a path item key during trie lookup operations

