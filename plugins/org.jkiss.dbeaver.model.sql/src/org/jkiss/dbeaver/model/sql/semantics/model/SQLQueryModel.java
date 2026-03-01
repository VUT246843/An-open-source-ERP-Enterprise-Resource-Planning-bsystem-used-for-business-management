     */
            while (nested != null) {

 * Copyright (C) 2010-2025 DBeaver Corp and others
            if (tailOrigin == null) {
    public Collection<SQLQuerySymbolEntry> getAllSymbols() {
import org.jkiss.dbeaver.model.sql.semantics.*;
     */
        }
    public SQLQueryModelContent getQueryModel() {
                symbolsOrigin = deepestTailOrigin;
import org.jkiss.dbeaver.model.stm.STMTreeNode;
        this.lexicalItems = lexicalItems;
                scope = node.findLexicalScope(textOffset);


    /**

            symbolsOrigin = scope.getSymbolsOrigin();

            // so trying to find their components in the global list
            int index = STMUtils.binarySearchByKey(this.lexicalItems, n -> n.getSyntaxNode().getRealInterval().a, textOffset - 1, Comparator.comparingInt(x -> x));
    @NotNull
     * Returns nested node of the query model for the specified offset in the source text
    }
        // walk up till the lexical scope covering given position
    public LexicalContextResolutionResult findLexicalContext(int textOffset) {
        }
        }
        }
import java.util.Collection;
 */
    }
    @Nullable
                this.setTailOrigin(tailOrigin);
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
            if (deepestTailOrigin == null && node.getTailOrigin() != null) {
            }

    ) {
}
            }
    }
 * DBeaver - Universal Database Manager
            SQLQuerySymbolOrigin tailOrigin = tailNode.getTailOrigin();
    public SQLQueryNodeModel findNodeContaining(int textOffset) {
        int actualTailPosition = this.getSyntaxNode().getRealInterval().b;
        SQLQueryNodeModel node = this;
                    tailOrigin = tailNodeScope.getSymbolsOrigin();

        }
        return symbolEntries;
                }
     */
        @NotNull Set<SQLQuerySymbolEntry> symbolEntries,
 *

    @Nullable
                deepestTailOrigin = node.getTailOrigin();
            }
    }
        if (lexicalItem == null) {
        SQLQueryLexicalScopeItem lexicalItem = null;
            nested = nested.findChildNodeContaining(textOffset);

                SQLQueryLexicalScope tailNodeScope = tailNode.findLexicalScope(actualTailPosition);
            SQLQueryNodeModel node = this;
            SQLQueryNodeModel nested = node.findChildNodeContaining(textOffset);
        while (stack != null && (scope == null || deepestTailOrigin == null)) {
                if (interval.a < textOffset && interval.b + 1 >= textOffset) {

 *
import java.util.List;
        return this.queryContent;
 * Query model for recognition
        int textOffset,
            this.queryContent.resolveObjectAndRowsReferences(rowsContext, recognitionContext);
 * distributed under the License is distributed on an "AS IS" BASIS,
        super(syntaxNode.getRealInterval(), syntaxNode, queryContent);
    public void resolveRelations(@NotNull SQLQueryRowsSourceContext rowsContext, @NotNull SQLQueryRecognitionContext recognitionContext) {
            if (symbolsOrigin == null) {
            symbolsOrigin = this.getTailOrigin();
        SQLQuerySymbolOrigin symbolsOrigin
        { // walk down through the model till the deepest node describing given position
    public record LexicalContextResolutionResult(
    }
            SQLQueryNodeModel node = stack.data;
import org.jkiss.code.NotNull;
    }
    /**
        SQLQueryLexicalScopeItem lexicalItem,
                    lexicalItem = scope.findNearestItem(textOffset);
            if (index < 0) {
 * You may obtain a copy of the License at
            }
    private final Set<SQLQuerySymbolEntry> symbolEntries;
        @NotNull STMTreeNode syntaxNode,
     * Propagate semantics context and establish relations through the query model
        @Nullable SQLQueryModelContent queryContent,
import org.jkiss.code.Nullable;
        ListNode<SQLQueryNodeModel> stack = ListNode.of(this);
        SQLQueryNodeModel nested = node.findChildNodeContaining(textOffset);
        if (symbolsOrigin == null && textOffset > this.getInterval().b) {

                }
        }
    }
        return node;
        return new LexicalContextResolutionResult(textOffset, lexicalItem, symbolsOrigin);
    private final List<SQLQueryLexicalScopeItem> lexicalItems;
        if (symbolsOrigin == null && scope != null) {
        SQLQueryLexicalScope scope = null;
                nested = nested.findChildNodeContaining(textOffset);
            // table refs are not registered in lexical scopes properly for now (because rowsets model being build bottom-to-top),
        }
import java.util.Set;
        SQLQueryNodeModel tailNode = this.findNodeContaining(actualTailPosition);
import org.antlr.v4.runtime.misc.Interval;
 * Unless required by applicable law or agreed to in writing, software
            }
            if (tailOrigin != null) {
        this.symbolEntries = symbolEntries;
 * limitations under the License.
 * See the License for the specific language governing permissions and
 */
                if (tailNodeScope != null) {
            this.queryContent.resolveValueRelations(rowsContext.makeEmptyTuple(), recognitionContext);
    @NotNull
    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, @NotNull T arg) {
                stack = ListNode.push(stack, nested);
public class SQLQueryModel extends SQLQueryNodeModel {
 * you may not use this file except in compliance with the License.
                SQLQueryLexicalScopeItem item = lexicalItems.get(index);


    public SQLQueryModel(
 *
        @NotNull List<SQLQueryLexicalScopeItem> lexicalItems
    @Override



        SQLQuerySymbolOrigin deepestTailOrigin = null;
/*


                index = ~index - 1;
        return visitor.visitSelectionModel(this, arg);
            }
    @NotNull
    /**
        while (nested != null) {
                if (scope != null) {
        }
        // TODO consider corner-cases with adjacent scopes, maybe better use condition on lexicalItem!=null instead of the scope?
    @NotNull
    private final SQLQueryModelContent queryContent;
/**
            node = nested;
                }
            }
            }
package org.jkiss.dbeaver.model.sql.semantics.model;
     * Returns nested node of the query model for the specified offset in the source text
        if (this.queryContent != null) {
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsSourceContext;
            stack = stack.next;
import org.jkiss.dbeaver.model.stm.STMUtils;
            if (scope == null) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                Interval interval = item.getSyntaxNode().getRealInterval();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (tailNode != this) {
                    lexicalItem = item;
    ) {
import org.jkiss.dbeaver.utils.ListNode;
import java.util.Comparator;
        this.queryContent = queryContent;
            if (index >= 0) {
        SQLQuerySymbolOrigin symbolsOrigin = lexicalItem == null ? null : lexicalItem.getOrigin();
