    @NotNull
            this.isRelated = isRelated;
    @NotNull

        protected <R> R applyImpl(@NotNull SQLQueryCompletionItemVisitor<R> visitor) {


        }
        int score,
    }
            @NotNull DBSProcedure object


    ) {
        SQLCompositeFieldCompletionItem(

            super(score, filterKey);
    }
     * Completion item that describes field of the composite entity, which is not backed by the database metadata

        @NotNull SQLQueryExprType.SQLQueryExprTypeMemberInfo memberInfo
    @NotNull
        @NotNull
        SQLRowsSourceAliasCompletionItem(
        @NotNull
    }
    }
            int score,
            }
            super(score, filterKey, resolvedContext, table);
    private SQLQueryCompletionItem(int score, @NotNull SQLQueryWordEntry filterKey) {
        }
        for (DBSObject o = object.getParentObject(); o != knownSubroot; o = o.getParentObject()) {
        @Override
        @Override
    }
                throw new IllegalArgumentException("columnInfo should not be null");
    @Nullable
            int score,
public abstract class SQLQueryCompletionItem {

        @NotNull
    }
        @Override
            this.absolute = absolute;
        int score,
            this.description = description;
        }

 * you may not use this file except in compliance with the License.
    }

    }
    }
                ? SQLQueryCompletionItemKind.DERIVED_COLUMN_NAME

            }
        @Override
     */
            @NotNull SQLQueryWordEntry filterKey,
        @NotNull SQLQueryWordEntry filterKey,
        int score,
            @NotNull SQLQuerySymbol symbol,
        @NotNull DBSObject object
            int score,
    }
        parts.addFirst(DBUtils.getQuotedIdentifier(object));
    public static class SQLCompositeFieldCompletionItem extends SQLDbObjectCompletionItem<DBSEntityAttribute>  {
            this.memberInfo = memberInfo;
        return new SQLJoinConditionCompletionItem(score, filterKey, first, second);
        @NotNull DBSProcedure object
        int score,
        }
            super(score, filterKey);

        }
     */
    public static class SQLSpecialTextCompletionItem extends SQLQueryCompletionItem {
        // TODO consider removing this flag in favor of refactoring for explicit formatting mechanism

    /**
    public static class SQLTableNameCompletionItem extends SQLDbObjectCompletionItem<DBSEntity> {
        }
        @NotNull
        }
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedure;
import java.util.LinkedList;
        @NotNull
        int score,
    public static SQLQueryCompletionItem forSpecialCompositeField(
    public static SQLQueryCompletionItem forRowsSourceAlias(
        ) {
        public SQLQueryCompletionItemKind getKind() {
        }
        public SQLQueryCompletionItemKind getKind() {
        }
    @NotNull
    
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
        @NotNull DBSEntityAttribute attribute,
    /**
        return this.filterKey;
                : this.isUsed ? SQLQueryCompletionItemKind.USED_TABLE_NAME
        @Nullable ContextObjectInfo resolvedContext,
            this.object = object;
    public static SQLQueryCompletionItem forDbCatalogObject(
        public final T object;

        @Override
            @NotNull SQLQueryWordEntry filterKey,

    public static List<String> prepareQualifiedNameParts(@NotNull DBSObject object, @Nullable DBSObject knownSubroot) {
        @Override

        @Nullable SourceResolutionResult sourceInfo,

        }
            return this.itemKind;
        return new SQLSpecialCompositeFieldCompletionItem(score, filterKey, memberInfo);
        public final String description;
    }
        }

        public final SQLQueryExprType.SQLQueryExprTypeMemberInfo memberInfo;
        @NotNull SQLColumnNameCompletionItem first,
        this.filterKey = filterKey;
        private final SQLQueryCompletionItemKind itemKind;
    
        public SQLProcedureCompletionItem(
        @Nullable String description

    @NotNull
        @Nullable
 * Unless required by applicable law or agreed to in writing, software

            if (columnInfo == null) {
        @Override

        SQLColumnNameCompletionItem(

package org.jkiss.dbeaver.model.sql.semantics.completion;
    @NotNull
    }
                parts.addFirst(DBUtils.getQuotedIdentifier(o));
            return this.isRelated ? SQLQueryCompletionItemKind.RELATED_SUBQUERY_ALIAS : SQLQueryCompletionItemKind.SUBQUERY_ALIAS;
        protected <R> R applyImpl(SQLQueryCompletionItemVisitor<R> visitor) {
            return SQLQueryCompletionItemKind.COMPOSITE_FIELD_NAME;
        }

        @Nullable ContextObjectInfo resolvedContext,
            @NotNull SourceResolutionResult sourceInfo,
    public static class SQLJoinConditionCompletionItem extends SQLQueryCompletionItem {
            int score,
        @Override
            return SQLQueryCompletionItemKind.JOIN_CONDITION;

        @NotNull SQLQuerySymbol aliasSymbol,
        @Override
        return new SQLProcedureCompletionItem(score, filterKey, resolvedContext, object);
            @NotNull DBSEntityAttribute attribute,
        @NotNull SQLQueryExprType.SQLQueryExprTypeMemberInfo memberInfo
            @NotNull SQLColumnNameCompletionItem right
            return visitor.visitBuiltinFunction(this);

            return visitor.visitSpecialText(this);
            @NotNull SQLQueryWordEntry filterKey,
        @NotNull
        private SQLBuiltinFunctionCompletionItem(int score, @NotNull SQLQueryWordEntry filterKey, @NotNull String name) {
        }
            super(score, filterKey, resolvedContext, object);
        public final SQLColumnNameCompletionItem right;

        public final SQLColumnNameCompletionItem left;
            this.columnInfo = columnInfo;
        @NotNull SQLQueryWordEntry filterKey,
     * Prepare completion item for reserved word
    @NotNull
            return this.isRelated ? SQLQueryCompletionItemKind.RELATED_TABLE_NAME
    }

        ) {
     */
    ) {
            return visitor.visitSpecialCompositeField(this);
    ) {
 * distributed under the License is distributed on an "AS IS" BASIS,

    public static SQLQueryCompletionItem forRealTable(
 *

    }
        public final SQLQuerySymbol symbol;
            return this.columnInfo.realAttr;
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryResultColumn;
            return this.object;
    }
        LinkedList<String> parts = new LinkedList<>();
    }

    public static SQLQueryCompletionItem forProcedureObject(
        public SQLQueryCompletionItemKind getKind() {
        this.score = score;
        @NotNull String name

        @Override
    ) {
        }
        @NotNull

            if (o instanceof DBSStructContainer) {
        @Override
        @Override
        public final SQLQueryExprType.SQLQueryExprTypeMemberInfo memberInfo;
            this.isRelated = isRelated;
        public final boolean isRelated;
        public final SQLQueryResultColumn columnInfo;
        int score,
 * See the License for the specific language governing permissions and
        ) {
        protected <R> R applyImpl(SQLQueryCompletionItemVisitor<R> visitor) {
            super(score, filterKey);
        public final String name;
    }
        }
 * You may obtain a copy of the License at
 *
        @Override
     * Returns completion item that describes database user-created functions
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.struct.DBSStructContainer;
import org.jkiss.code.NotNull;
        protected <R> R applyImpl(SQLQueryCompletionItemVisitor<R> visitor) {
        }
        public SQLQueryCompletionItemKind getKind() {
    public DBSObject getObject() {
        public final ContextObjectInfo resolvedContext;
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.sql.semantics.SQLQuerySymbolClass;
        ) {
        }

        int score,
        }
    @NotNull
        }
        @NotNull SQLQueryWordEntry filterKey,
        @NotNull String text,
            return visitor.visitReservedWord(this);
import org.jkiss.dbeaver.model.sql.semantics.SQLQuerySymbol;
        }

            @NotNull SQLQueryWordEntry filterKey,
    public abstract static class SQLDbObjectCompletionItem<T extends DBSObject> extends SQLQueryCompletionItem {

        return new SQLCompositeFieldCompletionItem(score, filterKey, attribute, memberInfo);
        return new SQLSpecialTextCompletionItem(score, filterKey, text, description);
        @NotNull
    }
    public final <R> R apply(SQLQueryCompletionItemVisitor<R> visitor) {
        }
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryExprType;
        protected <R> R applyImpl(@NotNull SQLQueryCompletionItemVisitor<R> visitor) {
        }


    /**
            @Nullable String description
     * Returns completion item that describes field of the composite entity, which is not backed by the database metadata
        @Nullable ContextObjectInfo resolvedContext,
        @NotNull SQLQueryWordEntry filterKey,

            @NotNull DBSEntity table,
            this.symbol = symbol;
        }
            this.itemKind = itemKind;
        @Override
        return this.score;
            return visitor.visitSubqueryAlias(this);


        }
            boolean absolute
    }
        // should be null only for columns provided by the root projection (SELECT clause), because it doesn't serve as a source

            int score,

import org.jkiss.dbeaver.model.struct.DBSObject;
    public static class SQLBuiltinFunctionCompletionItem extends SQLQueryCompletionItem {
        @Override
        int score,
    public record ContextObjectInfo(@NotNull String string, @NotNull DBSObject object, boolean preventFullName) {
        return new SQLRowsSourceAliasCompletionItem(score, filterKey, aliasSymbol, source, isRelated);
        }
            @NotNull SQLQueryWordEntry filterKey,
        }
        public T getObject() {
        protected <R> R applyImpl(SQLQueryCompletionItemVisitor<R> visitor) {
        @NotNull SQLQueryWordEntry filterKey,
            int score,
        public SQLQueryCompletionItemKind getKind() {
            super(score, filterKey);
            @NotNull SQLQueryExprType.SQLQueryExprTypeMemberInfo memberInfo
        
        return new SQLReservedWordCompletionItem(score, filterKey, text);

            return visitor.visitColumnName(this);

    ) {
import org.jkiss.dbeaver.model.sql.semantics.context.SourceResolutionResult;

        public final String text;
        SQLSpecialTextCompletionItem(
 */
            @NotNull DBSObject object,
        @NotNull
        @NotNull SQLQueryWordEntry filterKey,
            this.sourceInfo = sourceInfo;
            boolean isUsed,
        @NotNull
        protected <R> R applyImpl(SQLQueryCompletionItemVisitor<R> visitor) {
    public static SQLQueryCompletionItem forSpecialText(
     */
    }
            @NotNull SQLQueryExprType.SQLQueryExprTypeMemberInfo memberInfo
            return SQLQueryCompletionItemKind.COMPOSITE_FIELD_NAME;
        public SQLQueryCompletionItemKind getKind() {
    public static SQLQueryCompletionItem forBuiltinFunction(
        @Override


        }

        @NotNull SQLQueryWordEntry filterKey,
        }
        }
    public static SQLColumnNameCompletionItem forSubsetColumn(
    public SQLQueryWordEntry getFilterInfo() {
        SQLTableNameCompletionItem(

    }
        return new SQLTableNameCompletionItem(score, filterKey, resolvedContext, table, isUsed, isRelated);
            this.resolvedContext = resolvedContext;
            @NotNull SQLQueryCompletionItemKind itemKind
    public static class SQLProcedureCompletionItem extends SQLDbObjectCompletionItem<DBSProcedure> {

    public static class SQLReservedWordCompletionItem extends SQLQueryCompletionItem {
        public SQLQueryCompletionItemKind getKind() {
            super(score, filterKey);
        boolean isRelated

        return new SQLDbNamedObjectCompletionItem(score, filterKey, resolvedContext, object, SQLQueryCompletionItemKind.UNKNOWN);
     * Build completion item for columns expansion

        }
import org.jkiss.dbeaver.model.DBUtils;
            @Nullable SourceResolutionResult sourceInfo,
        @NotNull SourceResolutionResult source,
            @Nullable ContextObjectInfo resolvedContext,

        return new SQLDbNamedObjectCompletionItem(score, filterKey, resolvedContext, object, SQLQueryCompletionItemKind.SCHEMA);
            return visitor.visitCompositeField(this);
    ) {
        ) {
        int score,
        return null;
            this.text = text;
            super(score, filterKey, null, attribute);
        }
            return visitor.visitTableName(this);
        protected <R> R applyImpl(SQLQueryCompletionItemVisitor<R> visitor) {

        int score,

            this.name = name;
        @NotNull SQLQueryWordEntry filterKey,
}    }
        @NotNull SQLQueryWordEntry filterKey,
        }
    @NotNull
            @NotNull SQLQueryWordEntry filterKey,
            super(score, filterKey);
            int score,
    public static class SQLRowsSourceAliasCompletionItem extends SQLQueryCompletionItem {
        SQLReservedWordCompletionItem(int score, @NotNull SQLQueryWordEntry filterKey, @NotNull String text) {
            @Nullable ContextObjectInfo resolvedContext,
            int score,
import org.jkiss.dbeaver.model.struct.DBSEntity;
    /**
            int score,
    ) {
    /**
        public SQLQueryCompletionItemKind getKind() {
        @NotNull
        }
            super(score, filterKey);
    public static SQLQueryCompletionItem forDbSchemaObject(
            this.right = right;
        @NotNull
        return new SQLDbNamedObjectCompletionItem(score, filterKey, resolvedContext, object, SQLQueryCompletionItemKind.CATALOG);
        return new SQLBuiltinFunctionCompletionItem(score, filterKey, name);
            this.memberInfo = memberInfo;

            this.text = text;
            this.sourceInfo = sourceInfo;
            return SQLQueryCompletionItemKind.RESERVED;
        @NotNull


import java.util.List;
        @NotNull DBSObject object
        ) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @Override
    }
        @Override
    public abstract SQLQueryCompletionItemKind getKind();
            boolean isRelated
            @NotNull SQLQueryWordEntry filterKey,
    ) {
            boolean isRelated
            return SQLQueryCompletionItemKind.PROCEDURE;
            return visitor.visitNamedObject(this);
        @NotNull DBSObject object
    ) {
        @NotNull
            super(score, filterKey);
    public static class SQLColumnNameCompletionItem extends SQLQueryCompletionItem {
        public final SourceResolutionResult sourceInfo;
            @NotNull T object) {


        int score,
            this.isUsed = isUsed;
            int score,
        @NotNull SQLQueryWordEntry filterKey,
            @NotNull SQLQueryWordEntry filterKey,
 * Copyright (C) 2010-2025 DBeaver Corp and others
            @Nullable ContextObjectInfo resolvedContext,
 * DBeaver - Universal Database Manager
    }
        
        @NotNull
        return parts;
    }
            @NotNull SQLQueryWordEntry filterKey,
        SQLDbObjectCompletionItem(
    private final SQLQueryWordEntry filterKey;
    public static SQLQueryCompletionItem forDbObject(
    }
        @Override
            return visitor.visitProcedure(this);
        @NotNull
        SQLSpecialCompositeFieldCompletionItem(
    /**
            return this.columnInfo.symbol.getSymbolClass() == SQLQuerySymbolClass.COLUMN_DERIVED 

        @NotNull DBSEntity table, boolean isUsed, boolean isRelated
        public final String text;
            return SQLQueryCompletionItemKind.PROCEDURE;
                : SQLQueryCompletionItemKind.TABLE_COLUMN_NAME;
        @Override
        public final boolean absolute;
        @NotNull SQLQueryResultColumn columnInfo,
        }
        SQLDbNamedObjectCompletionItem(
    @NotNull
    public static class SQLSpecialCompositeFieldCompletionItem extends SQLQueryCompletionItem {
        @NotNull

    }
     * Returns completion item that describes functions that comes from the dialect
            super(score, filterKey, resolvedContext, object);

        @NotNull

    }
    }
 *
        ) {
            @NotNull String text,
        @NotNull SQLQueryWordEntry filterKey,
    
        ) {
            @NotNull SQLColumnNameCompletionItem left,
     */
    public static SQLQueryCompletionItem forCompositeField(
    public static class SQLDbNamedObjectCompletionItem extends SQLDbObjectCompletionItem<DBSObject>  {
        ) {

            this.left = left;
        @Override

        protected <R> R applyImpl(SQLQueryCompletionItemVisitor<R> visitor) {
    public static SQLQueryCompletionItem forReservedWord(int score, @NotNull SQLQueryWordEntry filterKey, @NotNull String text) {
        @NotNull SQLColumnNameCompletionItem second) {
    ) {


        @Nullable
        public DBSObject getObject() {
        protected <R> R applyImpl(@NotNull SQLQueryCompletionItemVisitor<R> visitor) {
        public final boolean isRelated;
            return visitor.visitJoinCondition(this);
    }
        @Override
        return new SQLColumnNameCompletionItem(score, filterKey, columnInfo, sourceInfo, absolute);
            @Nullable ContextObjectInfo resolvedContext,
    protected abstract <R> R applyImpl(SQLQueryCompletionItemVisitor<R> visitor);
    }
        @Override

 * limitations under the License.
        int score,
    }
        @NotNull
/*
            return SQLQueryCompletionItemKind.UNKNOWN;
        public SQLQueryCompletionItemKind getKind() {
            @NotNull SQLQueryResultColumn columnInfo,
        }
        return this.applyImpl(visitor);
        @Nullable ContextObjectInfo resolvedContext,
    public static SQLQueryCompletionItem forJoinCondition(
        @Override
    @NotNull
        public final boolean isUsed;
        public SQLQueryCompletionItemKind getKind() {
     */

        @NotNull SQLQueryWordEntry filterKey,
    @NotNull
    ) {
    @NotNull
        @NotNull
            @NotNull SQLQueryWordEntry filterKey,
        boolean absolute

        }

 * Licensed under the Apache License, Version 2.0 (the "License");
        protected <R> R applyImpl(SQLQueryCompletionItemVisitor<R> visitor) {
        public final SourceResolutionResult sourceInfo;
        public SQLQueryCompletionItemKind getKind() {

        }
        @NotNull
    private final int score;
    

        SQLJoinConditionCompletionItem(
        @Nullable
    public int getScore() {
                : SQLQueryCompletionItemKind.NEW_TABLE_NAME;
        @Nullable ContextObjectInfo resolvedContext,

