
 *
 * See the License for the specific language governing permissions and
    public SequenceTokenPredicateNode(TokenPredicateNode... childs) {
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.

    @NotNull
 * Represents node of token predicate describing a sequence of some tokens
    }
 * you may not use this file except in compliance with the License.
public class SequenceTokenPredicateNode extends GroupTokenPredicatesNode {
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
    protected <T, R> R applyImpl(@NotNull TokenPredicateNodeVisitor<T, R> visitor, @NotNull T arg) {
/**
    @Override
        super(childs);
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * DBeaver - Universal Database Manager
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
}
import org.jkiss.code.NotNull;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * Licensed under the Apache License, Version 2.0 (the "License");
 *
        return visitor.visitSequence(this, arg);
package org.jkiss.dbeaver.model.sql.parser.tokens.predicates;
 */
 */
    }
 * You may obtain a copy of the License at
