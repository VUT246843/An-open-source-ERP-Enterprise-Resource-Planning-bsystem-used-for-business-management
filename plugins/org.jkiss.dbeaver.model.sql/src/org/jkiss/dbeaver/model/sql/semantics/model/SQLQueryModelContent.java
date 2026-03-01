 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
/**
    /**
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;
        @Nullable SQLQueryNodeModel ... subnodes
 */
        super(interval, syntaxNode, subnodes);
 * DBeaver - Universal Database Manager

    }
 * Describes sql query or query part
    /**
 * Unless required by applicable law or agreed to in writing, software
/*
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsSourceContext;
import org.jkiss.dbeaver.model.sql.semantics.SQLQueryRecognitionContext;
     */
public abstract class SQLQueryModelContent extends SQLQueryNodeModel {
        @NotNull SQLQueryRowsSourceContext context,

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
import org.jkiss.code.Nullable;
    );
        @NotNull STMTreeNode syntaxNode,
        @NotNull Interval interval,

     * Propagate information about available tables down the model and about actually referenced tables back up
import org.jkiss.code.NotNull;
}
    public abstract void resolveValueRelations(
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.stm.STMTreeNode;
 *
 * You may obtain a copy of the License at
    ) {
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,

        @NotNull SQLQueryRowsDataContext context,

    );
    public abstract void resolveObjectAndRowsReferences(
import org.antlr.v4.runtime.misc.Interval;
        @NotNull SQLQueryRecognitionContext statistics
package org.jkiss.dbeaver.model.sql.semantics.model;
     * Propagate information about values and row tuples across the query model
 */
 *
        @NotNull SQLQueryRecognitionContext statistics

    public SQLQueryModelContent(
     */
