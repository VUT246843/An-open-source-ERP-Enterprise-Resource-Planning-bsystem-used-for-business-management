    }

 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2025 DBeaver Corp and others
    protected <T, R> R applyImpl(@NotNull TokenPredicateNodeVisitor<T, R> visitor, @NotNull T arg) {

 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 * You may obtain a copy of the License at
 *
/**
 * See the License for the specific language governing permissions and
/*
 * Represents node of token predicate describing one possible of alternatives of token subsequences
        return visitor.visitAlternative(this, arg);
import org.jkiss.code.NotNull;
 * you may not use this file except in compliance with the License.

public class AlternativeTokenPredicateNode extends GroupTokenPredicatesNode {
 *     http://www.apache.org/licenses/LICENSE-2.0
    public AlternativeTokenPredicateNode(TokenPredicateNode... childs) {
 * DBeaver - Universal Database Manager
 */
}
    @NotNull
 */
package org.jkiss.dbeaver.model.sql.parser.tokens.predicates;
        super(childs);
 *
 * Unless required by applicable law or agreed to in writing, software
 *
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
