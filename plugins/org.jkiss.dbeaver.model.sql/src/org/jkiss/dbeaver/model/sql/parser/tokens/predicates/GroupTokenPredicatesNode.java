 */
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
abstract class GroupTokenPredicatesNode extends TokenPredicateNode {
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.Collections;

 * Represents any node of token predicate tree carrying a number of children nodes
package org.jkiss.dbeaver.model.sql.parser.tokens.predicates;

 * you may not use this file except in compliance with the License.
 *
 *
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2024 DBeaver Corp and others

}
import java.util.List;
 * See the License for the specific language governing permissions and
/*
    protected GroupTokenPredicatesNode(@NotNull TokenPredicateNode... childs) {
import org.jkiss.code.NotNull;
/**
 *
        this.childs = Collections.unmodifiableList(List.of(childs));
 */
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");

 * limitations under the License.
    public final List<TokenPredicateNode> childs;
