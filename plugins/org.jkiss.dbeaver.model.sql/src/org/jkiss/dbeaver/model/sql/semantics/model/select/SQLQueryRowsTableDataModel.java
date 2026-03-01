    }
            RelationalObjectType.TYPE_UNKNOWN,
                                .filter(a -> a.getPropagationPolicy().providedByTable)
        if (this.name.invalidPartsCount > 0) {
    @Override
import java.util.List;
                result = this.getRowsSources().makeEmptyTuple();
                new SQLQuerySymbolOrigin.RowsSourceRef(nameContext),
                List<SQLQueryResultColumn> resultColumns = referencedData.getColumnsList().stream()
import org.jkiss.dbeaver.model.struct.DBSObject;
        this.table = obj instanceof DBSEntity e && (obj instanceof DBSTable || obj instanceof DBSView) ? e : null;
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;
    }
                    result = this.getRowsSources().makeEmptyTuple();
                    if (referenceName != null) {

            this.immediateTargetObject = refTarget;
        return resultContext;
                    "Failed to resolve columns of the table " + this.name.getNameString(),
        if (this.table != null && this.name != null) {
    ) {

            SQLQueryRowsSourceContext nameContext = originalContext.resetAsUnresolved();
        return SQLQuerySemanticUtils.prepareResultColumnsList(cause, this, this.table, dialect, statistics, attributes);
    @Nullable
            SQLQueryRowsSourceContext nameContext = originalContext.reset();
        this.forDdl = forDdl;
        @NotNull SQLDialect dialect,
    }
    protected SQLQueryRowsSourceContext resolveRowSourcesImpl(
import org.jkiss.dbeaver.DBException;
}
            statistics.appendError(this.getSyntaxNode(), "Invalid table reference");
                            this.table,
        } else if (this.referencedSource != null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        } else {
                ? SQLQuerySymbolClass.TABLE
        return SQLQuerySemanticUtils.getIdentifierSymbolClass(this.name);
                return originalContext.reset();
                    this.name.syntaxNode,

        return result;
                    );
 *
                    SQLQueryComplexName referenceName = dynamicSource.referenceName;
        @NotNull SQLQueryRecognitionContext statistics
                statistics.appendError(this.name.syntaxNode, "Table " + this.name.getNameString() + " not found");

            }
                List<? extends DBSEntityAttribute> attributes = this.table.getAttributes(statistics.getMonitor());
        }
import org.jkiss.dbeaver.Log;
        this.name = name;
    implements SQLQuerySymbolDefinition, SQLQueryNodeModel.NodeSubtreeTraverseControl<SQLQueryRowsSourceModel, SQLQueryRowsDataContext> {
import org.jkiss.code.Nullable;
                        : Collections.emptyList();
                statistics.appendError(this.name.syntaxNode, "Circular dependency detected at " + this.name.getNameString());
                        columns.getSecond(), inferredPseudoColumns
    @Override
                statistics,
            } else {

                    .toList();
        }
    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, @NotNull T arg) {
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
            if (this.name.stringParts.getLast().equalsIgnoreCase(originalContext.getDialect().getDualTableName())) {
    @Nullable
 * limitations under the License.
            SQLQuerySymbolClass tableSymbolClass = statistics.isTreatErrorsAsWarnings()
    protected SQLQueryRowsSourceModel referencedSource = null;

            resultContext = nameContext;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private final boolean forDdl;
        SQLQueryRowsDataContext result;
                this.name,

    @Nullable
import org.jkiss.dbeaver.model.stm.STMTreeNode;
    @Override
                : SQLQuerySymbolClass.ERROR;

 * Licensed under the Apache License, Version 2.0 (the "License");

                    result = this.getRowsSources().makeTuple(this, columns.getFirst(), pseudoColumns);
    public SQLQueryRowsTableDataModel(@NotNull STMTreeNode syntaxNode, @Nullable SQLQueryComplexName name, boolean forDdl) {
                        ? SQLQuerySemanticUtils.prepareResultPseudoColumnsList(

            if (candidates.isEmpty() || candidates.size() == 1) {
                if (dynamicSource != null) {

 * you may not use this file except in compliance with the License.
            statistics.getMonitor(),
    }
            this.name.stringParts
import java.util.stream.Collectors;
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModel;
    }
        }
    @Override


    }
                result = this.getRowsSources().makeTuple(this, resultColumns, Collections.emptyList());
 * Unless required by applicable law or agreed to in writing, software
                new SQLQuerySymbolOrigin.RowsSourceRef(nameContext),
        @NotNull STMTreeNode cause,
    public DBSEntity getTable() {
                    List<SQLQueryResultPseudoColumn> inferredPseudoColumns = table instanceof DBDPseudoAttributeContainer pac
                        this.name.parts.getFirst().setDefinition(referenceName.parts.getLast());
        @NotNull SQLQueryRecognitionContext statistics,
    public SQLQuerySymbolClass getAssociatedSymbolClass() {

    }
                    ).flatMap(Collection::stream).collect(Collectors.toList());
    }
                tableSymbolClass
 * You may obtain a copy of the License at
        return this.table;
        return this.table != null ? SQLQuerySymbolClass.TABLE : SQLQuerySymbolClass.ERROR;
                nameContext,
        return this.immediateTargetObject;
        } else {
                        )
                if (attributes != null) {
 *
 * See the License for the specific language governing permissions and
            }
    private static final Log log = Log.getLog(SQLQueryRowsTableDataModel.class);
    private final SQLQueryComplexName name;

        super(syntaxNode);
                }
            try {
    }

                SQLQuerySymbolClass.ERROR
            }

                );

            result = this.getRowsSources().makeEmptyTuple();
import org.jkiss.dbeaver.model.sql.semantics.context.*;
    private DBSObject immediateTargetObject = null;
import org.jkiss.dbeaver.model.data.DBDPseudoAttributeContainer;
                    }
    @Nullable
                    SQLQueryRowsSourceContext nameContext = originalContext.reset();
            );
 * Describes table definition
    @Nullable
                nameContext, this.name, refTarget, SQLQuerySymbolClass.TABLE,
            return nameContext;
                statistics.appendError(
    protected Pair<List<SQLQueryResultColumn>, List<SQLQueryResultPseudoColumn>> prepareResultColumnsList(

                            this,
                SQLQuerySymbolOrigin.DbObjectFilterMode.ROWSET,
            );
    public DBSObject getImmediateTargetObject() {
                } else {
        if (this.name == null) {
            );
        return this.referencedSource == null ? null : List.of(this.referencedSource);
    protected SQLQueryRowsDataContext resolveRowDataImpl(
                this.name,
    ) {
        DBSObject obj = forDdl ? refTarget : SQLQueryConnectionContext.expandAliases(statistics.getMonitor(), refTarget);
import org.jkiss.dbeaver.model.sql.semantics.*;
        List<? extends DBSObject> candidates = originalContext.getConnectionInfo().findRealObjects(
            statistics.appendError(this.getSyntaxNode(), "Invalid table reference");
    public SQLQueryComplexName getName() {
    @Nullable
        SQLQueryRowsSourceContext resultContext;
    public List<SQLQueryNodeModel> getChildren() {
                    Pair<List<SQLQueryResultColumn>, List<SQLQueryResultPseudoColumn>> columns = prepareResultColumnsList(
                new SQLQuerySymbolOrigin.RowsSourceRef(nameContext),
            return originalContext.resetAsUnresolved();
    ) {
    public SQLQuerySymbolClass getSymbolClass() {
import org.jkiss.utils.Pair;

                        attributes
            } catch (DBException ex) {
 *
                    this.referencedSource = dynamicSource.source;
import java.util.Collection;
                        this.name.parts.getFirst().setOrigin(new SQLQuerySymbolOrigin.RowsSourceRef(nameContext));
                            this.getRowsSources().getDialect(),
            } else {
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;
    @Override
package org.jkiss.dbeaver.model.sql.semantics.model.select;
import org.jkiss.dbeaver.model.sql.SQLDialect;
        @NotNull SQLQueryRecognitionContext statistics
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public SQLQueryRowsSourceModel getReferencedSource() {
                        statistics,
            }
                this.name.parts.getLast().getSymbol().setSymbolClass(SQLQuerySymbolClass.TABLE);
                        this.getRowsSources().getDialect(),
                SQLQuerySymbolOrigin.DbObjectFilterMode.ROWSET
                SQLQueryRowsDataContext referencedData = this.referencedSource.getRowsDataContext();
    @Override
import java.util.Collections;
/*
                        this.name.syntaxNode,

                    ex

import org.jkiss.dbeaver.model.struct.rdb.DBSView;
                    List<SQLQueryResultPseudoColumn> pseudoColumns = Stream.of(
        }
        }
            resultContext = nameContext.appendSource(this, name, this.table);
                }
        DBSObject refTarget = candidates.size() == 1 ? candidates.getFirst() : null;
        return this.name;
                SourceResolutionResult dynamicSource = originalContext.findDynamicRowsSource(this.name.parts.getFirst());
            SQLQuerySemanticUtils.setNamePartsDefinition(
                statistics,
                SQLQuerySymbolOrigin.DbObjectFilterMode.ROWSET,
        return visitor.visitRowsTableData(this, arg);
    @Nullable
                    return nameContext.appendSource(this, name, null);
    }
import org.jkiss.dbeaver.model.struct.DBSEntity;
            SQLQuerySemanticUtils.performPartialResolution(
 */
    @NotNull
        @NotNull SQLQueryRowsDataContext context,
            if (this.referencedSource.isResolved()) {
    private DBSEntity table = null;
        if (this.name.parts.size() == 1) {
        @NotNull List<? extends DBSEntityAttribute> attributes
            SQLQueryRowsSourceContext nameContext = originalContext.resetAsUnresolved();
import org.jkiss.dbeaver.model.impl.struct.RelationalObjectType;
        return this.referencedSource;


public class SQLQueryRowsTableDataModel extends SQLQueryRowsSourceModel
    @Nullable
import java.util.stream.Stream;
                nameContext,
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
                result = this.getRowsSources().makeTuple(this, Collections.emptyList(), Collections.emptyList());
                            Stream.of(pac.getAllPseudoAttributes(statistics.getMonitor()))
    @Nullable
/**
import org.jkiss.code.NotNull;
    @NotNull
    @Nullable
        );
    }
                    .map(c -> c.withNewSource(this))
 */
        if (this.table != null) {
        @NotNull SQLQueryRowsSourceContext originalContext,
            SQLQuerySemanticUtils.performPartialResolution(
