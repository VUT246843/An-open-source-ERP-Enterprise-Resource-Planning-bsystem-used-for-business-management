
    @Override
    private final String commandText;
 * See the License for the specific language governing permissions and

import java.util.ArrayList;
    public String getCommandText() {
        @Override

    public VariableNode[] getVariables() {
    }
    }

            this.name = symbol;
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;

    @Override
    public static class VariableNode extends SQLQueryNodeModel {
    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, T arg) {
 * DBeaver - Universal Database Manager
        public final SQLQuerySymbolEntry name;
            super(symbol.getSyntaxNode().getRealInterval(), symbol.getSyntaxNode());
    public void addVariable(SQLQuerySymbolEntry symbol, String value) {
 *
        }
import org.jkiss.dbeaver.model.stm.STMTreeNode;
 *

        return this.variables.toArray(VariableNode[]::new);
            this.value = value;
/*

        public final String value;

        // do nothing
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    @NotNull
 * Unless required by applicable law or agreed to in writing, software

    @Override
            return visitor.visitCommandVariable(this, arg);

        super(fakeTree.getRealInterval(), fakeTree);

 *
import org.jkiss.code.NotNull;
        this.variables.add(new VariableNode(symbol, value));
        // do nothing
 * You may obtain a copy of the License at
    public SQLCommandModel(@NotNull STMTreeNode fakeTree, @NotNull String commandText) {
import org.jkiss.dbeaver.model.sql.semantics.SQLQuerySymbolEntry;
        return this.commandText;
    }
package org.jkiss.dbeaver.model.sql.semantics.model;
    public void resolveValueRelations(@NotNull SQLQueryRowsDataContext context, @NotNull SQLQueryRecognitionContext statistics) {
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
    private final List<VariableNode> variables = new ArrayList<>();
    }

        public VariableNode(SQLQuerySymbolEntry symbol, String value) {
        }
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public void resolveObjectAndRowsReferences(@NotNull SQLQueryRowsSourceContext context, @NotNull SQLQueryRecognitionContext statistics) {
 * limitations under the License.

        this.commandText = commandText;
        return visitor.visitCommand(this, arg);
import java.util.List;
    @NotNull
    @NotNull

}
import org.jkiss.dbeaver.model.sql.semantics.SQLQueryRecognitionContext;
        protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, T arg) {
    }
 * you may not use this file except in compliance with the License.
    }

import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsSourceContext;
public class SQLCommandModel extends SQLQueryModelContent {
