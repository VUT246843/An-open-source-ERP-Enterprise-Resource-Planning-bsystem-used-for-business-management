
    @Override
                node instanceof GroupTokenPredicatesNode
            sb.append(")");

    public static String format(@Nullable TokenPredicateNode node) {
    }
        }
    }
 *

    @NotNull
        return sb;
    private StringBuilder visitUnary(@NotNull UnaryTokenPredicateNode unary, @NotNull StringBuilder sb) {
        return token.format(sb);
package org.jkiss.dbeaver.model.sql.parser.tokens.predicates;
 * (mainly for a debugging visualization purposes)
 * You may obtain a copy of the License at
    @NotNull
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
    private static final TokenPredicateFormatter INSTANCE = new TokenPredicateFormatter();
 * Licensed under the Apache License, Version 2.0 (the "License");
        Iterator<TokenPredicateNode> it = group.childs.iterator();
    public StringBuilder visitTokenEntry(@NotNull SQLTokenEntry token, @NotNull StringBuilder sb) {
    private StringBuilder visitGroup(@NotNull GroupTokenPredicatesNode group, @NotNull StringBuilder sb, @NotNull String separator) {

    }
                parent.getClass() != node.getClass()
        return sb;
        ) || (
    @NotNull

import java.util.Iterator;
                parent instanceof GroupTokenPredicatesNode &&
    }
            sb.append("(");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }

    public StringBuilder visitSequence(@NotNull SequenceTokenPredicateNode sequence, @NotNull StringBuilder sb) {
    @NotNull

    @NotNull
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
/*
            this.visit(group, it.next(), sb);
        boolean needsWrapping = (
    @NotNull
    @NotNull

        node.apply(this, sb);

 *
    @NotNull
        }
                sb.append(separator);
    }
    }
 * Implements token predicate tree formatter responsible for collecting its string representation
        if (needsWrapping) {
    }

        if (it.hasNext()) {
 * Unless required by applicable law or agreed to in writing, software


/**
    public StringBuilder visitCapture(@NotNull CaptureTokenPredicateNode captureToken, @NotNull StringBuilder sb) {
 */
 * limitations under the License.
    @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0
                this.visit(group, it.next(), sb);
    @Override
        return this.visit(unary, unary.child, sb);
    public StringBuilder visitAlternative(@NotNull AlternativeTokenPredicateNode alternative, @NotNull StringBuilder sb) {
    }

    }
        return this.visitGroup(alternative, sb, "|");
        );
                parent instanceof UnaryTokenPredicateNode &&
    private StringBuilder visit(@NotNull TokenPredicateNode parent, @NotNull TokenPredicateNode node, @NotNull StringBuilder sb) {
    @Override
        return captureToken.format(sb);
class TokenPredicateFormatter implements TokenPredicateNodeVisitor<StringBuilder, StringBuilder> {
 * you may not use this file except in compliance with the License.


        return this.visitUnary(optional, sb).append("?");

 * DBeaver - Universal Database Manager

    }
 */
import org.jkiss.code.Nullable;
 * See the License for the specific language governing permissions and
    public StringBuilder visitOptional(@NotNull OptionalTokenPredicateNode optional, @NotNull StringBuilder sb) {
        return this.visitGroup(sequence, sb, " ");
import org.jkiss.code.NotNull;
    @Override
        if (needsWrapping) {
            }
    private TokenPredicateFormatter() {

            while (it.hasNext()) {

        return node == null ? "<NULL>" : node.apply(INSTANCE, new StringBuilder()).toString();
}
                node instanceof GroupTokenPredicatesNode &&
