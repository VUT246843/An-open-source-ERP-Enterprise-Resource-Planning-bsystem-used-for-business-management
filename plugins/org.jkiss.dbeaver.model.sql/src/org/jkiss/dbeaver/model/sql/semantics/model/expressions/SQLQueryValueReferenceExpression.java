    }
                );
                        } else  {
 * Licensed under the Apache License, Version 2.0 (the "License");
    protected void resolveRowSourcesImpl(@NotNull SQLQueryRowsSourceContext context, @NotNull SQLQueryRecognitionContext statistics) {
        SQLQueryRowsDataContext columnContext;
                }
            }
                    forcedClass = null;
                } else {
                            type = SQLQueryExprType.forTypedObject(statistics.getMonitor(), typedObject, objClass);
                    if (restParts.isEmpty()) {
                        objectName = objectName.subList(0, objectName.size() - 1);
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
                    } else {
 * DBeaver - Universal Database Manager
                    // 1.4: no objects also, so failing back to default classification
                type = SQLQueryExprType.UNKNOWN;
            if (restParts.size() > 0) {
        } else {
                } else {
                        forcedClass = SQLQueryModelRecognizer.tryFallbackSymbolForStringLiteral(dialect, stringEntry, false);
        this.name = name;
                } else {
                }
    ) {
                if (type == null) {
                type = null;
                    this.name,
                    type = SQLQuerySemanticUtils.tryResolveMemberReference(
                tableRef = null;
                    forcedClass = null;
            if (restParts.size() >= 1 && type != SQLQueryExprType.UNKNOWN) {

                columnRefEntry = restParts.getFirst();
                    objectName = this.name.stringParts.subList(0, restParts.size());
                    objectName = null;
    @Nullable
            statistics.appendError(this.getSyntaxNode(), "Invalid column reference");
                    try {
                );
        boolean rowRefAllowed,
            DBSObject dbObject;
                    String rawString = stringEntry.getRawName();
                    SQLQuerySemanticUtils.setNamePartsDefinition(tableRef.key(), tableRef.target(), columnRefOrigin);
                        forcedClass = SQLQuerySymbolClass.STRING;
import java.util.Set;
                    columnContext = tableRef.target().source.getRowsDataContext();
        List<String> objectName;
            // 2: final classification applications based on findings
            // 1.1: resolve as prefixless column
            }
                    if (dbObjects.size() == 1) {
                this.name.parts.getFirst().getSymbol().setSymbolClass(forcedClass);
import org.jkiss.code.NotNull;
                    SQLQuerySymbolClass.OBJECT
                        restParts.get(i),
    @Override
                }
                        columnRefEntry.setOrigin(columnRefOrigin);
            ? null
                // TODO consider bringing DB objects like sequences to the autocompletion proposals
            // try on composite members

        super(syntaxNode);
                } else if (restParts.size() > 0) {
    private static final DBSObjectType ALLOWED_OBJECT_TYPE = RelationalObjectType.TYPE_SEQUENCE;
                                SQLQuerySymbolOrigin.DbObjectFilterMode.VALUE, SQLQuerySymbolClass.ERROR

                if (context.getConnection().isDummy()) {
/*

        @NotNull SQLQueryRecognitionContext statistics
                            type = SQLQueryExprType.UNKNOWN;
            if (type == null) {
                        } else {
                            type = SQLQueryExprType.UNKNOWN;
            } else {
                } else {
                    if (tableRef == null && (resultColumn != null || resultPseudoColumn != null)) {
    @Override


                        restParts = restParts.subList(1, restParts.size());
import org.jkiss.dbeaver.model.sql.semantics.context.*;
                        }
                    String typeName = SQLQuerySemanticUtils.getObjectTypeName(dbObject);
 *
                } else if (dbObject == null && this.name.parts.size() == 1 && this.name.invalidPartsCount == 0) {
                            type = resultPseudoColumn.type;
            if (forcedClass != null) {

                SQLQuerySymbolClass objClass;
    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, @NotNull T arg) {
                            statistics.appendError(this.name.syntaxNode, "Incomplete column reference");
                                typedObject,
                            );
                    context.getRowsSources(),
    private SQLQueryResultColumn column = null;
                            columnRefEntry.setDefinition(resultPseudoColumn);
        SQLQueryRowsSourceContext.SourceResolutionInfo tableRef;
                }
    }
                }
/**
public class SQLQueryValueReferenceExpression extends SQLQueryValueExpression {
            List<? extends DBSObject> dbObjects;

                            this.name.parts.getFirst().setOrigin(new SQLQuerySymbolOrigin.RowsDataRef(context));

                    while (dbObjects.isEmpty() && objectName.size() > 1) {
                }
                            this.name.endingPeriodNode.setOrigin(new SQLQuerySymbolOrigin.MemberOfType(type));
                        }
                    if (!restParts.isEmpty()) {
                        if (!this.name.parts.isEmpty() && this.name.parts.getFirst() != null && this.name.parts.getFirst().getOrigin() == null) {
            }
                    } else {
                            e
                        // do nothing more and don't generate errors on failed column resolutions while unresolved sources presented
            // 2.1: last-chance findings are the simplest
                        if (dbObject instanceof DBSTypedObject typedObject) {
            if (this.name.invalidPartsCount > 0) {
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
                if (dbObjects.size() > 1) {
                        if (resultPseudoColumn != null) {
                // 1.2: try to resolve rowset reference prefix and classify it if resolved
                    resultColumn = null;
                    );
    @Override
                if (tableRef != null) {
                    SQLQuerySymbolEntry stringEntry = this.name.parts.getFirst();
        return this.column;
import org.jkiss.code.Nullable;
                    this.name.parts.subList(0, objectName.size()), dbObject, objClass, new SQLQuerySymbolOrigin.RowsDataRef(context),
                    } else {
                if (resultPseudoColumn == null) {
    @Nullable
                columnRefEntry = null;
                                new SQLQuerySymbolByDbObjectDefinition(dbObject, objClass)
            } else if (dbObjects.size() > 1) {
    }
                    }
                }
                        statistics.appendError(this.name.syntaxNode, "Incomplete sequence reference, pseudoattribute required");
                        type = SQLQueryExprType.UNKNOWN;
                resultColumn = null;
                            .findRealObjects(statistics.getMonitor(), ALLOWED_OBJECT_TYPE, objectName);
    public SQLQuerySymbol getColumnNameIfTrivialExpression() {
                        restParts = restParts.subList(objectName.size(), restParts.size());
                        statistics.appendError(this.name.syntaxNode, "Illegal column reference");
                for (int i = 0; i < restParts.size() && type != null && restParts.get(i) != null; i++) {
            } else {
                    statistics,
 * Unless required by applicable law or agreed to in writing, software
    }
    @Nullable
package org.jkiss.dbeaver.model.sql.semantics.model.expressions;
            if ((resultColumn == null && resultPseudoColumn == null) || this.name.parts.size() > 1) {
 * Describes a certain value in the query value expression represented with a compound name
    // change to Map<DBSObjectType, Function<DBSObject, SQLQueryExprType>> in need of multiple allowed object types
                            type = ALLOWED_OBJECT_EXPR_TYPE;
                    SQLQuerySymbolOrigin.DbObjectFilterMode.VALUE
import java.util.function.Function;
    }
                    if (columnContext.getRowsSources().hasUnresolvedSource() && resultColumn == null && resultPseudoColumn == null) {
    @Nullable

                                context.getRowsSources(), statistics, this.name, columnRefOrigin,
                    // resolve rowset's column
                            resultPseudoColumn = columnContext.resolvePseudoColumn(columnRefEntry.getName());
                    objClass = SQLQuerySymbolClass.OBJECT;
            resultColumn = null;
    @Override
            }
        if (this.name != null) {
    private final SQLQueryComplexName name;
        return this.name == null || this.name.parts.isEmpty() || this.name.parts.getLast() == null ? null : this.name.parts.getLast();
                        }
            type = SQLQueryExprType.UNKNOWN;
                    if (tableRef != null) {

                    }
                dbObject = null;
                            type = resultColumn != null ? resultColumn.type : SQLQueryExprType.UNKNOWN;
                        columnRefEntry = restParts.getFirst();
                } else {
    private static final SQLQueryExprType ALLOWED_OBJECT_EXPR_TYPE = SQLQueryExprType.UNKNOWN;
    @Nullable
import org.jkiss.dbeaver.model.sql.SQLDialect;
                    }
                objectName = null;
                    }
                            type = rowType;
            if (resultColumn == null && resultPseudoColumn == null && tableRef == null) {
                            SQLQuerySemanticUtils.performPartialResolution(
                    objClass = SQLQuerySymbolClass.ERROR;
                    }
                if (resultPseudoColumn == null) {
                            type = SQLQueryExprType.forTypedObject(
        SQLQuerySymbolEntry columnRefEntry;
                SQLQuerySemanticUtils.setNamePartsDefinition(
                        restParts = restParts.subList(1, restParts.size());
                    dbObjects = context.getRowsSources().getConnectionInfo()
                    }
                }
    @Override
    }
                        columnRefEntry = null;
            } else {
import java.util.Collections;
 * See the License for the specific language governing permissions and
            SQLQuerySymbolOrigin columnRefOrigin = new SQLQuerySymbolOrigin.RowsDataRef(context);
            : this.name.parts.getLast().getSymbol();
                                statistics.getMonitor(),
                    } else {
        return this.name;
import org.jkiss.dbeaver.model.struct.rdb.DBSSequence;
                    SQLQuerySymbolOrigin.DbObjectFilterMode.VALUE,
 *
                    dbObjects = Collections.emptyList();
    public SQLQuerySymbolEntry getColumnName() {


                        }
                type = forcedClass == SQLQuerySymbolClass.STRING ? SQLQueryExprType.STRING : SQLQueryExprType.UNKNOWN;
            }
import org.jkiss.dbeaver.model.stm.STMTreeNode;
                        statistics.appendError(
                    resultPseudoColumn = context.resolvePseudoColumn(columnRefEntry.getName());
                            resultColumn = columnContext.resolveColumn(statistics.getMonitor(), columnRefEntry.getName());
                // 1.3: no columns and no rowsets, so try for db objects
        return "ValueReference[" + name + ":" + type + "]";
    protected SQLQueryExprType resolveValueTypeImpl(
                            columnRefEntry.setOrigin(columnRefOrigin);
                    statistics.appendError(this.name.syntaxNode, "Illegal database object reference " + typeName);
                        dbObjects = context.getRowsSources().getConnectionInfo()
    public SQLQueryComplexName getName() {
                        if (this.name.endingPeriodNode != null) {
                tableRef = context.getRowsSources().findReferencedSource(this.name);
                            if (tableRef.key().endingPeriodNode != null) {
                columnContext = context;
    public SQLQueryResultColumn getColumnIfTrivialExpression() {
                    }
 * distributed under the License is distributed on an "AS IS" BASIS,
                        type,
            } else if (dbObject != null) {

 */
            // 1: match for suitable reference target
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                dbObject = dbObjects.size() == 1 ? dbObjects.getFirst() : null;
    }
import org.jkiss.dbeaver.model.struct.*;
            SQLQuerySymbolClass forcedClass;
                            statistics.appendError(this.getSyntaxNode(), "Invalid column reference");
        return visitor.visitValueReferenceExpr(this, arg);

import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;

    private final boolean rowRefAllowed;
    }
                    resultColumn = context.resolveColumn(statistics.getMonitor(), columnRefEntry.getName());
    @Nullable
    @Override
    }
                if (ALLOWED_OBJECT_TYPE.getTypeClass().isAssignableFrom(dbObject.getClass())) {
                forcedClass = null;
                    context.getRowsSources(),
    public SQLQueryValueReferenceExpression(
            }
                            // TODO see the issue about postgre referencing tuples as composite types, maybe introduce a dialect parameter

                    type = SQLQueryExprType.UNKNOWN;
                        // 2.2: apply column classification
                        // while only sequence object references allowed, it should be followed with a pseudoattribute name
                            }
                        type = SQLQueryExprType.UNKNOWN;
                        } else if (tableRef == null && resultColumn == null) {
}
                    }

        @NotNull SQLQueryRowsDataContext context,

                        } else if (dbObject instanceof DBSTypedObjectEx2 typedObject) {
    ) {
        SQLQueryExprType type;
                SQLQuerySemanticUtils.performPartialResolution(
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.Log;
        SQLQueryResultColumn resultColumn;
    private static final Log log = Log.getLog(SQLQueryValueReferenceExpression.class);
                        );
                    resultColumn = null;
                restParts = this.name.parts.subList(1, restParts.size());
            List<SQLQuerySymbolEntry> restParts = this.name.parts;
                int invalidPartIndex = restParts.indexOf(null);
                    columnRefOrigin = new SQLQuerySymbolOrigin.ColumnRefFromReferencedContext(tableRef.target());
                    objectName = null;
                        }

                restParts = restParts.subList(0, invalidPartIndex);
import java.util.Map;
                            resultColumn = null; // not a real column, so we don't need to propagate its source and don't have real entity attribute
                            "Failed to resolve referenced object type info for " + dbObject.getName(),
                    restParts = this.name.parts.subList(tableRef.key().parts.size(), restParts.size());
                    dbObjects = Collections.emptyList();
                resultPseudoColumn = null;
        }
                    columnRefOrigin,
                columnContext = null;
    public SQLQuerySymbolClass getAssociatedSymbolClass() {
                        memberOrigin
import org.jkiss.dbeaver.model.sql.semantics.*;
        @Nullable SQLQueryComplexName name
                SQLQuerySymbolOrigin memberOrigin = new SQLQuerySymbolOrigin.MemberOfType(type);

        SQLQueryResultPseudoColumn resultPseudoColumn;
                resultPseudoColumn = context.getConnection().resolveGlobalPseudoColumn(columnRefEntry.getName());
                    }
                        if (this.name.endingPeriodNode == null && tableRef.key().endingPeriodNode == null) {
                    SQLDialect dialect = context.getConnection().dialect;
                        resultColumn = null;
        return SQLQuerySemanticUtils.getIdentifierSymbolClass(this.name);
                        }
                dbObjects = Collections.emptyList();
import org.jkiss.dbeaver.model.impl.struct.RelationalObjectType;
                    // 2.3: no column reference (if rowset-ref presented - it is already classified), so decide on column-related errors
                    // no real database - no point to treat any random name as object
        return type;
                        statistics,
    public String toString() {
                        SQLQueryExprType rowType = SQLQueryExprType.forReferencedRow(tableRef.key(), tableRef.target());
                            this.getName().syntaxNode,
        return this.name == null || this.name.parts.isEmpty() || this.name.parts.getLast() == null
        String name = this.name == null ? "<NULL>" : this.name.getNameString();
                    if (dialect.isQuotedString(rawString)) {
                        if (resultPseudoColumn == null) {
                        .findRealObjects(statistics.getMonitor(), ALLOWED_OBJECT_TYPE, objectName);
                        } else {


                            );
 * limitations under the License.
 * you may not use this file except in compliance with the License.
                if (columnRefEntry != null) {
                    } catch (DBException e) {
        String type = this.type == null ? "<NULL>" : this.type.toString();
                        }
            } else {
                        if (resultPseudoColumn == null) {
        this.column = resultColumn;
            }
 *
                        type = ALLOWED_OBJECT_EXPR_TYPE;
        @NotNull STMTreeNode syntaxNode,
                    memberOrigin = new SQLQuerySymbolOrigin.MemberOfType(type);


                    type = SQLQueryExprType.UNKNOWN;
    }
import java.util.List;
    @Nullable
    @NotNull
                            SQLQuerySemanticUtils.propagateColumnDefinition(columnRefEntry, resultColumn, statistics, columnRefOrigin);
                                tableRef.key().endingPeriodNode.setOrigin(new SQLQuerySymbolOrigin.MemberOfType(rowType));

import org.jkiss.dbeaver.DBException;
        this.rowRefAllowed = rowRefAllowed;
                }
