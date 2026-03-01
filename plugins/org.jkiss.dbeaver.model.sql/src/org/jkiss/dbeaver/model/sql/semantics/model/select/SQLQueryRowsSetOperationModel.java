
import org.jkiss.code.NotNull;
    public SQLQueryRowsSetOperationModel(
        @NotNull STMTreeNode syntaxNode,
    public SQLQueryRowsSourceModel getLeft() {

        this.left = left;
import org.jkiss.code.Nullable;

import org.jkiss.dbeaver.model.sql.semantics.SQLQueryModelRecognizer;
    public SQLQueryRowsSourceModel getRight() {
        @NotNull Interval range,
import org.jkiss.dbeaver.model.stm.STMTreeNode;
    @Nullable
    @NotNull
 */
        @NotNull SQLQueryRowsSourceModel left,
    @Nullable
 */
package org.jkiss.dbeaver.model.sql.semantics.model.select;

 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
        super(range, syntaxNode, left, right);
 * Describes set operations (for example, join or corresponding subquery)
    ) {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.antlr.v4.runtime.misc.Interval;
 *
    @NotNull
    protected final SQLQueryRowsSourceModel left;
    }
 * See the License for the specific language governing permissions and
/*

 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
}
 *
        @Nullable SQLQueryRowsSourceModel right
 *
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * limitations under the License.
    protected final SQLQueryRowsSourceModel right;
        return left;
    }
        this.right = right;
 * DBeaver - Universal Database Manager
        return right;
/**
public abstract class SQLQueryRowsSetOperationModel extends SQLQueryRowsSourceModel {
