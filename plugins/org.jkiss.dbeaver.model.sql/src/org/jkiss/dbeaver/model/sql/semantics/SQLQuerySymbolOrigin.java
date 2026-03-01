
        public ColumnNameFromRowsData(@NotNull SQLQueryRowsDataContext dataContext) {
        }

        public DbObjectFromDbObject(

        @NotNull
 * Unless required by applicable law or agreed to in writing, software
            visitor.visitColumnNameFromRowsData(this);
        public void apply(Visitor visitor) {

    }

        private final SQLQueryRowsDataContext rowsDataContext;
    /**
            @NotNull DbObjectFilterMode filterMode
            return this.objectTypes;
        public DbObjectRef(

        }
        @NotNull
        @Override
            this.filterMode = filterMode;
    }
            return syntaxInspectionResult.expectingTableReference();
        }
        }
        @Override
    public enum DbObjectFilterMode {

        public SQLQueryRowsDataContext getRowsDataContext() {
        }
        public boolean isIncludingRowsets() {

 * Copyright (C) 2010-2025 DBeaver Corp and others
        }
            @NotNull Set<DBSObjectType> objectTypes,
            this.referencedSource = referencedSource;
        @Override
        private final DbObjectFilterMode  filterMode;
     */
        @Override
        }
            boolean includingRowsets
        @Override

            visitor.visitColumnRefFromReferencedContext(this);
package org.jkiss.dbeaver.model.sql.semantics;

    }
            this.object = object;
        DEFAULT,

        @NotNull
            @NotNull STMTreeNode placeholder,
    public static class ExpandableRowsTupleRef extends RowsDataRef {

        public boolean isApplicable(@NotNull LSMInspections.SyntaxInspectionResult syntaxInspectionResult) {
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
            this(rowsSourceContext, Set.of(objectType), false);
        
        @Nullable

        }

        }
            super(rowsSourceContext);
        public boolean isChained() {

            super(dataContext);

     */
        private final SourceResolutionResult referencedSource;
        @NotNull
 *
    }
        @NotNull
        @NotNull
        @Override
        ROWSET,
        @Override
        public SQLQueryRowsSourceContext getRowsSourceContext() {
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsSourceContext;
            return this.placeholder;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            visitor.visitRowsDataRef(this);
        public final SQLQueryExprType getType() {
            return this.includingRowsets;
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;
    }


     * Explicitly referenced source is a scope for column name provided by the underlying rowset query node
        ) {
     */

            this.rowsContext = rowsContext;

        public SourceResolutionResult getRowsSource() {


     * Context is a scope for strictly simple separate column name
        @NotNull
    /**
        public void apply(Visitor visitor) {
        @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.sql.semantics.context.SourceResolutionResult;

        }

        public void apply(Visitor visitor) {
            return true;
/*
        public boolean isChained() {
            return true;
        }

        }
    /**
        }

import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryExprType;
            return true;
     * Context is a scope for DB object name

        public STMTreeNode getPlaceholder() {
    /**
        }
            @NotNull SQLQueryRowsSourceContext rowsSourceContext,
        private final SQLQueryRowsSourceContext rowsContext;
        void visitExpandableRowsTupleRef(ExpandableRowsTupleRef tupleRef);
            return this.rowsDataContext;
            return this.rowsSourceContext;
    public abstract void apply(Visitor visitor);

        void visitRowsSourceRef(RowsSourceRef rowsSourceRef);
        }
            return true;
        public boolean isApplicable(@NotNull LSMInspections.SyntaxInspectionResult syntaxInspectionResult) {
        @Override
 * DBeaver - Universal Database Manager
    /**
        }
        public boolean isApplicable(@NotNull LSMInspections.SyntaxInspectionResult syntaxInspectionResult) {



        @NotNull
            this.objectTypes = Collections.emptySet();
     * DB object is a scope for its child name
        }
import java.util.Set;
        }

        void visitMemberOfType(MemberOfType origin);
    public static class ColumnNameFromRowsData extends RowsDataRef {
        @Override
        public RowsDataRef(@NotNull SQLQueryRowsDataContext rowsDataContext) {
        private final SQLQueryRowsSourceContext rowsSourceContext;
        @NotNull

        }
        }
        public DBSObject getObject() {
        private final SQLQueryExprType type;
            @NotNull SQLQueryRowsSourceContext rowsContext,
            return false;

        FUNCTION,


     * (like a column provided by the table or subquery through the corresponding alias, or through the fully-qualified table name)
import java.util.Collections;
import org.jkiss.dbeaver.model.impl.struct.RelationalObjectType;
 */
        }
import org.jkiss.dbeaver.model.struct.DBSObjectType;
    public static class RowsSourceRef extends SQLQuerySymbolOrigin {

        @NotNull
        void visitDbObjectFromDbObject(DbObjectFromDbObject origin);

     */
            return this.objectTypes;

        private final SourceResolutionResult referencedSource;
            visitor.visitMemberOfType(this);
        @NotNull
        @Override
            return this.filterMode;
    }
        public boolean isChained() {
        public void apply(Visitor visitor) {

        public boolean isChained() {
        @Override
}
            return syntaxInspectionResult.expectingColumnReference();
        void visitRowsDataRef(RowsDataRef rowsDataRef);
        }
            visitor.visitDbObjectFromDbObject(this);
 *     http://www.apache.org/licenses/LICENSE-2.0
        public void apply(Visitor visitor) {

            super(dataContext);
        public boolean isChained() {
            this.rowsDataContext = rowsDataContext;
 * Licensed under the Apache License, Version 2.0 (the "License");
        @Override

        @Override
import org.jkiss.dbeaver.model.stm.LSMInspections;
        public boolean isApplicable(@NotNull LSMInspections.SyntaxInspectionResult syntaxInspectionResult) {
        public boolean isChained() {

        @Override
        }


        public SyntaxBasedFromRowsData(@NotNull SQLQueryRowsDataContext dataContext) {
            this.objectTypes = objectTypes;
        }
        @Override
    /**

        private final DBSObject object;
        @NotNull

        public Set<DBSObjectType> getObjectTypes() {
        }

        @NotNull
        @Nullable
    public static class MemberOfType extends SQLQuerySymbolOrigin {
 * The origin providing symbols occurring as identifiers in a query text (actually faced with or potential)
        ) {
        @NotNull
        void visitColumnNameFromRowsData(ColumnNameFromRowsData origin);
        }
        }
        }
        void visitDbObjectRef(DbObjectRef origin);
            return true;
/**
        public DbObjectFilterMode getFilterMode() {
 */
 *

    public abstract boolean isChained();
        @NotNull
        }
            @NotNull DBSObjectType objectType
        return true;
        }
        ) {

            return syntaxInspectionResult.expectingColumnName();

        }
    public static class ColumnRefFromReferencedContext extends SQLQuerySymbolOrigin {
            return this.rowsContext;
        }
            this.type = type;
            return this.referencedSource;

import org.jkiss.code.Nullable;
    /**
            visitor.visitSyntaxBasedFromRowsData(this);
 *
            this.rowsSourceContext = rowsSourceContext;

        public SQLQueryRowsSourceContext getRowsContext() {
        @NotNull
    public boolean isApplicable(@NotNull LSMInspections.SyntaxInspectionResult syntaxInspectionResult) {
        private final Set<DBSObjectType> objectTypes;

    public static class DbObjectFromDbObject extends SQLQuerySymbolOrigin {
        }
    }
        public DbObjectRef(
    }
    public static class DbObjectRef extends RowsSourceRef {

     * Purpose of the objects produced by the origin in the corresponding lexical context

        @NotNull
 * you may not use this file except in compliance with the License.
        private final Set<DBSObjectType> objectTypes;
        public MemberOfType(@NotNull SQLQueryExprType type) {
    public static class RowsDataRef extends SQLQuerySymbolOrigin {
        public Set<DBSObjectType> getMemberTypes() {

            return this.referencedSource;
 * limitations under the License.
        public void apply(Visitor visitor) {
    public interface Visitor {

        public ExpandableRowsTupleRef(
    }

            @NotNull SQLQueryRowsDataContext dataContext,
            this.referencedSource = referencedSource;
        }

        public RowsSourceRef(@NotNull SQLQueryRowsSourceContext rowsSourceContext) {
    }
        }
    }
import org.jkiss.code.NotNull;
        }

     */
        private final STMTreeNode placeholder;
            @Nullable SourceResolutionResult referencedSource
     */
        }
            return false;
            @NotNull DBSObject object,
        OBJECT
     * Type is a scope for its member name
        @Override


            return this.object;


        }
     * Context is a scope for strictly simple separate column name
        public ColumnRefFromReferencedContext(SourceResolutionResult referencedSource) {
            visitor.visitRowsSourceRef(this);
            return true;
        }
        }
        VALUE,
    /**
import org.jkiss.dbeaver.model.struct.DBSObject;


        public SourceResolutionResult getReferencedSource() {
        @Override
            this.includingRowsets = includingRowsets;
            visitor.visitExpandableRowsTupleRef(this);
     * Placeholder is a reference to a columns subset provided by the referencedSource or to all columns of the rows data
import org.jkiss.dbeaver.model.stm.STMTreeNode;
        TABLE,
        public void apply(Visitor visitor) {
            @NotNull SQLQueryRowsSourceContext rowsSourceContext,
            super(dataContext);

     */


            this.placeholder = placeholder;
     */
        public void apply(Visitor visitor) {
    public static class SyntaxBasedFromRowsData extends RowsDataRef {
            return this.type;

        void visitSyntaxBasedFromRowsData(SyntaxBasedFromRowsData origin);
        public void apply(Visitor visitor) {
        ) {
    }

        public boolean isApplicable(@NotNull LSMInspections.SyntaxInspectionResult syntaxInspectionResult) {
        private final boolean includingRowsets;
        void visitColumnRefFromReferencedContext(ColumnRefFromReferencedContext origin);
        @NotNull
            visitor.visitDbObjectRef(this);
public abstract class SQLQuerySymbolOrigin {

        }

        }


