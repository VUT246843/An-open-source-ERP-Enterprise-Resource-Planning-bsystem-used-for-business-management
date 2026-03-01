            this.name.parts.forEach(p -> p.getSymbol().setSymbolClass(SQLQuerySymbolClass.ERROR));
 */
 *

            SQLQuerySemanticUtils.performPartialResolution(
            }
            );
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;
                statistics,
    private Set<DBSObjectType> objectContainerTypes;
import org.jkiss.dbeaver.model.sql.semantics.model.select.SQLQueryRowsSourceModel;
            this.object = candidates.getFirst();
        } else {
        return this.getRowsSources().makeEmptyTuple();
                );
 * limitations under the License.

                    SQLQuerySemanticUtils.getObjectTypeName(this.object) + " found while expecting " + this.objectType.getTypeName()
            ? SQLQuerySymbolClass.TABLE
import org.jkiss.dbeaver.model.sql.semantics.*;
 * DBeaver - Universal Database Manager
    @NotNull
    }
        return objectType;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.Nullable;
    }
                statistics.appendError(
    private final SQLQueryComplexName name;
/**
    ) {
/*
            return context.reset();



        }
    ) {
            SQLQuerySemanticUtils.setNamePartsDefinition(

        this.name = name;
                this.name,
                SQLQuerySymbolOrigin.DbObjectFilterMode.OBJECT
    public SQLQuerySymbolClass getSymbolClass() {
    private SQLQuerySymbolOrigin objectNameOrigin = null;
    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, @NotNull T arg) {
        @NotNull SQLQueryRecognitionContext statistics

 * Unless required by applicable law or agreed to in writing, software
    private DBSObject object = null;
    private DBSObjectType objectType;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public SQLQueryComplexName getName() {
    }
import org.jkiss.dbeaver.model.stm.STMTreeNode;

    @Override
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
            if (!this.objectType.getTypeClass().isAssignableFrom(this.object.getClass())) {
import java.util.HashSet;
import java.util.Set;
import java.util.List;
            );
 *      (see something like {@code SELECT * FROM proc()}  )
package org.jkiss.dbeaver.model.sql.semantics.model.ddl;
 * See the License for the specific language governing permissions and
 * Describes object reference
                SQLQuerySymbolClass.ERROR
    @NotNull
    @Nullable
        return this.object instanceof DBSTable || this.object instanceof DBSView
    }
            statistics.appendError(this.getSyntaxNode(), "Object " + this.name.getNameString() + " not found in the database");
        Set<DBSObjectType> scopeMemberTypes = new HashSet<>();
    }
        return object;
    ) {
    @NotNull

import org.jkiss.dbeaver.model.struct.rdb.DBSTable;
 * you may not use this file except in compliance with the License.
public class SQLQueryObjectDataModel extends SQLQueryRowsSourceModel implements SQLQuerySymbolDefinition {
                SQLQuerySymbolOrigin.DbObjectFilterMode.OBJECT,

                this.object,
        scopeMemberTypes.add(this.objectType);
        if (candidates.isEmpty()) {
 *
            : this.object != null ? SQLQuerySymbolClass.OBJECT : SQLQuerySymbolClass.ERROR;
    public SQLQuerySymbolOrigin getObjectNameOrigin() {
import org.jkiss.code.NotNull;
        @NotNull SQLQueryRowsSourceContext context,
 * TODO remove objectType and treat this as non-table rows source like table-producing procedures, no matter builtin or not
        @NotNull DBSObjectType objectTypes,
    }
        @NotNull SQLQueryComplexName name,
    public SQLQueryObjectDataModel(
                this.name,
    }
 * You may obtain a copy of the License at
            return context.resetAsUnresolved();

                context,
    @Nullable
        this.objectContainerTypes = objectContainerTypes;
import org.jkiss.dbeaver.model.struct.DBSObjectType;
import org.jkiss.dbeaver.model.struct.rdb.DBSView;
}    public DBSObjectType getObjectType() {
        List<? extends DBSObject> candidates = context.getConnectionInfo().findRealObjects(statistics.getMonitor(), objectType, this.name.stringParts);
                    this.getSyntaxNode(),
    }
    @NotNull
        @NotNull Set<DBSObjectType> objectContainerTypes

        return visitor.visitObjectReference(this, arg);
        return this.objectNameOrigin;
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsSourceContext;
    public DBSObject getObject() {
    protected SQLQueryRowsDataContext resolveRowDataImpl(
    @NotNull
            return context.resetAsUnresolved();

    @Override
            statistics.appendError(this.name.syntaxNode, "Object name " + this.name.getNameString() + " is ambiguous");
                this.objectNameOrigin,
        @NotNull STMTreeNode syntaxNode,
    protected SQLQueryRowsSourceContext resolveRowSourcesImpl(
 *
                context,

import org.jkiss.dbeaver.model.struct.DBSObject;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
        return this.name;
        this.objectType = objectTypes;
        scopeMemberTypes.addAll(this.objectContainerTypes);
        } else if (candidates.size() > 1) {
import org.jkiss.dbeaver.Log;
 * @apiNote

        @NotNull SQLQueryRecognitionContext statistics
 */
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;
    private static final Log log = Log.getLog(SQLQueryObjectDataModel.class);
                this.objectNameOrigin,
        this.objectNameOrigin = new SQLQuerySymbolOrigin.DbObjectRef(context, scopeMemberTypes, false);
 * Copyright (C) 2010-2025 DBeaver Corp and others
        @NotNull SQLQueryRowsDataContext context,
    @Nullable

    @Override

    }
        super(syntaxNode);
