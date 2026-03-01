    }
package org.jkiss.dbeaver.model.sql.semantics.model.dml;

    protected <R, T> R applyImpl(
        this.contents = contents;
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
    public final List<SQLQueryValueExpression> targets;
    @Override
        @NotNull T arg
 * Unless required by applicable law or agreed to in writing, software
        );
            syntaxNode,
 */

        return visitor.visitTableStatementUpdateSetClause(this, arg);
 */
 * See the License for the specific language governing permissions and
    ) {
/**
 *
        this.sources = sources;
        @NotNull String contents

import org.jkiss.code.NotNull;

public class SQLQueryUpdateSetClauseModel extends SQLQueryNodeModel {
    public final String contents;
            STMUtils.combineLists(targets, sources).toArray(SQLQueryValueExpression[]::new)
        super(
            syntaxNode.getRealInterval(),
    @NotNull
    public SQLQueryUpdateSetClauseModel(
    public final List<SQLQueryValueExpression> sources;
    @NotNull
        @NotNull STMTreeNode syntaxNode,
 * Licensed under the Apache License, Version 2.0 (the "License");
}
        @NotNull SQLQueryNodeModelVisitor<T, R> visitor,
    }
 * Describes SET clause of the UPDATE statement
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.stm.STMUtils;
import org.jkiss.dbeaver.model.stm.STMTreeNode;
import java.util.List;
/*
    @NotNull
 * limitations under the License.
    ) {
 *
 * you may not use this file except in compliance with the License.
        @NotNull List<SQLQueryValueExpression> targets,

import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;
        @NotNull List<SQLQueryValueExpression> sources,

import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModel;
        this.targets = targets;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.sql.semantics.model.expressions.SQLQueryValueExpression;
