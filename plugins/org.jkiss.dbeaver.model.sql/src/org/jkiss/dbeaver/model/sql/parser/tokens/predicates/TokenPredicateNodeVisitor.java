 * @param <T> - argument type

    /**
    R visitTokenEntry(@NotNull SQLTokenEntry token, T arg);
 * Unless required by applicable law or agreed to in writing, software
/**
package org.jkiss.dbeaver.model.sql.parser.tokens.predicates;
import org.jkiss.code.NotNull;
    R visitSequence(@NotNull SequenceTokenPredicateNode sequence, T arg);

/*
     */
 *
     */
    /**
 *     http://www.apache.org/licenses/LICENSE-2.0
 * A simple predicate tokens tree visitor
    R visitAlternative(@NotNull AlternativeTokenPredicateNode alternative, T arg);
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
 * limitations under the License.
     */
 *
     * Invoked for a node of token predicate capable of capturing matching text parts
    R visitCapture(@NotNull CaptureTokenPredicateNode captureToken, T arg);
}
 * distributed under the License is distributed on an "AS IS" BASIS,
    /**

 * @param <R> - return type
 *
     * Invoked for a node of token predicate describing a sequence of some tokens
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


     * Invoked for a node representing SQL token in the text
    /**
 * Copyright (C) 2010-2025 DBeaver Corp and others
 */

    /**
    R visitOptional(@NotNull OptionalTokenPredicateNode optional, T arg);
     * Invoked for a node of token predicate describing optional token subsequence
     * Invoked for a node of token predicate describing one possible of alternatives of token subsequences
     */
 * Licensed under the Apache License, Version 2.0 (the "License");

     */
public interface TokenPredicateNodeVisitor<T, R> {
 *

