        ) {
        @NotNull SQLQueryExprType elementType
        }
import java.util.*;
        }
            return this.displayName;
        private final T complexType;
            return this.typedObject.getFullTypeName();
        private final SourceResolutionResult referencedSource;

            @NotNull DBSTypeDescriptor typeDesc
                SQLDialect dialect = this.dataSource.getSQLDialect();
                        (a, b) -> a)
                    Map<String, DBSEntityAttribute> attrsByName = attrs.stream().collect(Collectors.toMap(

            typedObj instanceof DBSObject dbObj ? new SQLQuerySymbolByDbObjectDefinition(dbObj, defSymbolClass) : null

        @NotNull
        @Nullable SQLQueryResultColumn column) {
        public SQLQueryExprType findNamedMemberType(@NotNull DBRProgressMonitor monitor, @NotNull String memberName) throws DBException {
    @Nullable
                        a -> SQLUtils.identifierToCanonicalForm(dialect, a.getName(), false, true),


        List<SQLQueryResultColumn> columns = source.getRowsDataContext().getColumnsList();
        @NotNull
     * Prepare type info based on the scalar subquery result
        private final SQLQueryExprType elementType;
                        null
            }
                b.getDataKind().isComplex() &&
                : forTypedObjectImpl(monitor, typeDesc.getUnderlyingType(), declaratorDefinition);
import org.jkiss.dbeaver.model.sql.SQLDialect;
        public String toString() {
    private static class SQLQueryExprSynthesizedComplexType extends SQLQueryExprType {
            super(declaratorDefinition, DBPDataKind.STRUCT);
     * The type based on the type descriptor and treated as atomic
import org.jkiss.code.Nullable;
            this.displayName = displayName;
    @NotNull
        public SQLQueryExprType findNamedMemberType(@NotNull DBRProgressMonitor monitor, @NotNull String memberName) throws DBException {
    }
        }
                SQLDialect dialect = dataSource == null ? BasicSQLDialect.INSTANCE : dataSource.getSQLDialect();
            SQLDialect dialect = this.complexType.getDataSource().getSQLDialect();
        }
        return new SQLQueryExprPredefinedType(typeRefString, DBPDataKind.UNKNOWN);
        @NotNull SQLQueryExprType type,
            DBSDataType itemType = type.getComponentType(monitor);
    }
            return "SynthesizedIndexableType[" + this.displayName + "]";
    }

            } else {
        }
    @Nullable
        @NotNull DBRProgressMonitor monitor,
                // both are complex of the exact same db type
import org.jkiss.dbeaver.model.sql.SQLUtils;
            @Nullable SQLQuerySymbolDefinition declaratorDefinition,
                ? null
    /**

    }
            }
        }

        
        public SQLQueryExprDummyType(@Nullable SQLQuerySymbolDefinition declaratorDefinition) {
                            .findFirst().map(Map.Entry::getValue).orElse(null);
        @NotNull
        private final DBSTypeDescriptor typeDesc;
        SQLQueryExprType type = forDescribedIfPresented(monitor, null, typeDesc, declaratorDefinition);
            return this.typeDesc.getTypeName();
            this.elementType = elementType;
        }
        return matches ? a : null;
            this.typeDesc = typeDesc;
 * Represents information about data type in the sql query semantic model
        @NotNull SQLQuerySymbolDefinition declaratorDefinition,
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        @NotNull DBSTypedObject typedObj,
                !b.getDataKind().isComplex() &&
    @NotNull
    }
        @Override
        public String toString() {
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Nullable
            @Nullable SQLQuerySymbolDefinition declaratorDefinition,
    }
    ) throws DBException {
        
        @Override
                a.getDataKind().equals(b.getDataKind())
        
    }
    private static SQLQueryExprType forTypedObjectImpl(
        ) {
        return this.declaratorDefinition;
        
                        attr = attrs.entrySet().stream()
            int depth,
        DBSTypeDescriptor typeDesc = typedObj.getTypeDescriptor(monitor);
        k -> k,
        this.declaratorDefinition = declaratorDefinition;

                return slicingSpec[slicingSpec.length - depth] ? this : this.prepareElementType(monitor);

        @Override
                }
        return null;
            return this.typeDesc.getTypeName();
            super(null, kind);
        boolean matches = (
        this.typedObject = typedObject;
        public List<SQLQueryExprTypeMemberInfo> getNamedMembers(@NotNull DBRProgressMonitor monitor) throws DBException {
        }
            this.typeDesc = typeDesc;
    private static class SQLQueryExprDummyType extends SQLQueryExprType {
        @NotNull
            return this.typedObject.getFullTypeName();
                attrType = this.attrs.get(unquoted);
 * Licensed under the Apache License, Version 2.0 (the "License");
    public static SQLQueryExprType forSynthesizedArray(
                            .filter(e -> e.getKey().equalsIgnoreCase(unquoted))
        public SQLQueryExprSynthesizedIndexableType(
        @Nullable
        @Override
        @NotNull
        public String getDisplayName() {
                a instanceof SQLQueryExprComplexType<?> x &&
                return result;
            }
        @NotNull
 * See the License for the specific language governing permissions and
            return "IndexableType[" + this.elementType.getFullTypeName() + "]";
                : new SQLQueryExprDescribedIndexableType(declaratorDefinition, typedObj, typeDesc);
        }
        }
            @NotNull DBSTypedObject typedObject,
                ? new SQLQueryExprDescribedCompositeType(declaratorDefinition, typeDesc)

        public String getDisplayName() {
            }
                DBPDataSource dataSource = complexType.getDataSource();
        }
 * Copyright (C) 2010-2025 DBeaver Corp and others
     * Prepare type info based on the metadata

                    ));
            return attrType;

    public static final SQLQueryExprType STRING = forPredefined(DBPDataKind.STRING);

            @NotNull SQLQuerySymbolDefinition declaratorDefinition,
            return "RowType[" + this.getDisplayName() + "]";
    ) {
                    }
                String unquoted = dialect.getUnquotedIdentifier(memberName);
            @NotNull DBRProgressMonitor monitor,
            @Nullable SQLQuerySymbolDefinition declaratorDefinition,
        ) {
import org.jkiss.dbeaver.model.sql.semantics.*;
        SQLQueryExprType result = PREDEFINED_TYPES.get(dataKind);
    public List<SQLQueryExprTypeMemberInfo> getNamedMembers(@NotNull DBRProgressMonitor monitor) throws DBException {
    public static final SQLQueryExprType DATETIME = forPredefined(DBPDataKind.DATETIME);
        if (typedObj instanceof DBSTypedObjectEx typedEx) {
            @NotNull Map<String, SQLQueryExprType> attrs
        }

            @NotNull Map<String, DBSEntityAttribute> attrs
import org.jkiss.dbeaver.model.struct.*;
            @NotNull String displayName,

    public static SQLQueryExprType forExplicitTypeRef(@NotNull String typeRefString) {
            super(declaratorDefinition, DBPDataKind.ARRAY);
            return b;
            super(declaratorDefinition, typedObject);
        

        this.dataKind = dataKind;
    public abstract String getDisplayName();
        @NotNull SQLQuerySymbolDefinition declaratorDefinition,


                }
    /**
        public String toString() {
        @NotNull DBRProgressMonitor monitor,
        public String getDisplayName() {
        private final String displayName;
                b instanceof SQLQueryExprIndexableType y2 &&
        @Override
            if (attrType == null) {
    ) throws DBException {
    
/*
import java.lang.invoke.TypeDescriptor;
                return new SQLQueryExprIndexableType(declaratorDefinition, typedObj, itemType);
        @NotNull DBSTypedObject typedObj,
            return null;
        @NotNull
        @Nullable DBSTypedObject typedObj,
    /**
            return "DummyType[]";
import org.jkiss.dbeaver.model.sql.semantics.model.select.SQLQueryRowsSourceModel;
            if (itemType != null) {
            return memberTypeDesc == null ? null : this.makeMemberType(monitor, memberTypeDesc);
    @Nullable
        }
    private static final SQLQueryExprType DUMMY_FIELD = new SQLQueryExprDummyType(() -> SQLQuerySymbolClass.COMPOSITE_FIELD);
        public String getDisplayName() {
    public static SQLQueryExprType forReferencedRow(
        private final DBPDataSource dataSource;
        }
            @Nullable boolean[] slicingSpec
        private final DBSTypeDescriptor typeDesc;

        return type != null ? type : new SQLQueryExprSimpleDescribedType(declaratorDefinition, typeDesc);
                : new SQLQueryExprDescribedCompositeType(declaratorDefinition, typedObj, typeDesc);
            }
        private final Map<String, SQLQueryExprType> attrs;
}
            this.reference = reference;
    public static final SQLQueryExprType UNKNOWN = forPredefined(DBPDataKind.UNKNOWN);
public abstract class SQLQueryExprType {
            super(declaratorDefinition, DBPDataKind.ANY);
        @NotNull String displayName,
                }
        }
            int depth,
            return null;
        return (
 *

    protected final DBSTypedObject typedObject;
                return Collections.emptyList();

        @NotNull
        public String getDisplayName() {
    }
            super(declaratorDefinition, typedObject);
        @NotNull SQLQueryComplexName reference,
                List<? extends DBSEntityAttribute> attrs = complexType.getAttributes(monitor);
    @NotNull
            this.attrs = attrs;
            @NotNull T complexType,
        return new SQLQueryExprSynthesizedComplexType(displayName, dataSource, declaratorDefinition, members);
    public static SQLQueryExprType forPredefined(DBPDataKind dataKind) {
        @Override
     * Find an indexed member by the specified indexes and return corresponding item type if exists
    }

        public SQLQueryExprIndexableType(
    }
    public SQLQueryExprType findIndexedItemType(
        @NotNull
        public String toString() {
            @NotNull String displayName,

    public SQLQueryExprType findNamedMemberType(@NotNull DBRProgressMonitor monitor, @NotNull String memberName) throws DBException {
        @NotNull
        @Override
        @Override
                for  (DBSTypeDescriptor.CompositeMemberInfo member : members) {

                return result;
                    if ((!isQuoted && dialect.storesUnquotedCase() == DBPIdentifierCase.MIXED) || dialect.useCaseInsensitiveNameLookup()) {
    }

        @Nullable
                SQLQueryExprType type = this.prepareElementType(monitor);
        }
        @NotNull
        public SQLQueryExprType findNamedMemberType(@NotNull DBRProgressMonitor monitor, @NotNull String memberName) {
            super(declaratorDefinition, DBPDataKind.STRUCT);
                }
        }
        @NotNull
        private SQLQueryExprType makeMemberType(@NotNull DBRProgressMonitor monitor, @NotNull DBSTypeDescriptor typeDesc) throws DBException {
        @NotNull
                if (attr == null) {

    private static class SQLQueryExprSimpleDescribedType extends SQLQueryExprType {
        }
                            .filter(e -> e.getKey().equalsIgnoreCase(unquoted))
            } else {
import org.jkiss.dbeaver.model.DBPDataSource;
            }
     */
                !a.getDataKind().isComplex() &&


                c -> new SQLQueryExprTypeMemberInfo(this, c.symbol.getName(), c.type, c.realAttr, c)

                monitor,

    /**
            return this.complexType.getFullTypeName();
            @Nullable SQLQuerySymbolDefinition declaratorDefinition,
                    }
    }
        @Override
     * Prepare type info based on the data type description, not covered by the database model
            this.referencedSource = referencedSource;
     */
        }
            );
        }
            @NotNull DBRProgressMonitor monitor,
        k -> new SQLQueryExprPredefinedType(k.name().toUpperCase(), k)
import org.jkiss.dbeaver.DBException;
        int depth,
    private SQLQueryExprType(@Nullable SQLQuerySymbolDefinition declaratorDefinition, @NotNull DBSTypedObject typedObject) {
                x3.typeDesc.equals(y3.typeDesc)
     */
        ) {
        }
    }
            return attr == null ? null : forTypedObject(monitor, attr, SQLQuerySymbolClass.COMPOSITE_FIELD);

                    return new SQLQueryExprComplexType<>(declaratorDefinition, (DBSEntity & DBSTypedObject) complexType, attrsByName);
            return "SynthesizedComplexType[" + this.displayName + "]";
            return "ComplexType[" + this.complexType.getFullTypeName() + "]";

    private static class SQLQueryExprPredefinedType extends SQLQueryExprType {
        if (b.getDataKind().equals(DBPDataKind.ANY)) {
        public SQLQueryExprSimpleDescribedType(
            return "SimpleType[" + this.typedObject.getFullTypeName() + "]";
        @Nullable SQLQuerySymbolDefinition declaratorDefinition
        public List<SQLQueryExprTypeMemberInfo> getNamedMembers(@NotNull DBRProgressMonitor monitor) throws DBException {
        }
            this.dataSource = dataSource;

        public SQLQueryExprDescribedCompositeType(
        this.dataKind = typedObject.getDataKind();
    }
        }
        @NotNull
 * you may not use this file except in compliance with the License.
    @NotNull
                attr = this.complexType.getAttribute(monitor, unquoted);
     * Prepare predefined type info based on the type name
        ) {
        public List<SQLQueryExprTypeMemberInfo> getNamedMembers(@NotNull DBRProgressMonitor monitor) throws DBException {
        }
        }
    }
                        a -> a,
            SQLQueryResultColumn column = this.referencedSource.source.getRowsDataContext().resolveColumn(monitor, memberName);



        @Override
        }
                b instanceof SQLQueryExprDescribedIndexableType y3 &&
    public final DBPDataKind getDataKind() {
        public String toString() {
    @Nullable
            ) || (
    private static boolean isDataTypeMatches(@NotNull DBSDataType a, @NotNull DBSDataType b) {
        }
            if (slicingSpec == null) { // TODO take a look at the SQL Standard
            return this.displayName;
            return a;
            DBSDataType type = typedEx.getDataType();
     * The composite type covered by the type descriptor
            );
        ) throws DBException {
        ) {
        @Override
        return this.typedObject;

                ? new SQLQuerySymbolByDbObjectDefinition(byObjDef.getDbObject(), SQLQuerySymbolClass.COMPOSITE_FIELD) : null;
                    boolean isQuoted = DBUtils.isQuotedIdentifier(this.dataSource, memberName);
            return "DescribedIndexableType[" + this.typeDesc.getTypeName() + "]";
            @NotNull DBSTypedObject typedObject,
        @NotNull
            return this.name;
        @NotNull DBRProgressMonitor monitor,
        @Override
    @NotNull
        public String toString() {
     */
    private static final Map<DBPDataKind, SQLQueryExprType>  PREDEFINED_TYPES = Arrays.stream(DBPDataKind.values()).collect(Collectors.toMap(
                List<SQLQueryExprTypeMemberInfo> result = new ArrayList<>(attrs.size());
        public String getDisplayName() {

        @Override
        @NotNull DBRProgressMonitor monitor,
                        null,
            case INDEXABLE -> typedObj == null
    }
            return DUMMY;
            this.complexType = complexType;
        return null;

            @NotNull DBSTypeDescriptor typeDesc
        return new SQLQueryExprSynthesizedIndexableType(displayName, declaratorDefinition, elementType);
            ) || (
                String unquoted = dialect.getUnquotedIdentifier(memberName);
        @Nullable
        @Nullable
        ) {
                this.getDeclaratorDefinition()
        @Nullable SQLQuerySymbolDefinition declaratorDefinition

 */
        @Nullable DBSEntityAttribute attribute,
        public SQLQueryExprComplexType(
            }
            super(declaratorDefinition, typedObject);
                // both are simple of the same kind

                List<SQLQueryExprTypeMemberInfo> result = new ArrayList<>(members.size());
        public SQLQueryExprDescribedCompositeType(
/**

        @Override
        if (typedObj instanceof DBSTypedObjectEx2 typedEx2) {
            if (type != null) {
        private final DBSDataType elementType;
        @NotNull
        public SQLQueryExprSimpleType(@Nullable SQLQuerySymbolDefinition declaratorDefinition, @NotNull DBSTypedObject typedObject) {
        }

                // both are complex of the exact same db type
        }
        public String toString() {
        @Override
    private static SQLQueryExprType forDescribedIfPresented(
        @NotNull
        @NotNull
            case UNKNOWN -> typeDesc.getUnderlyingType() == null
        }
    @Nullable
        
        @Override
            String tableObjectName = this.referencedSource.tableOrNull == null
            case COMPOSITE -> typedObj == null
            }
        
        public SQLQueryExprPredefinedType(@NotNull String name, @NotNull DBPDataKind kind) {
        return this.dataKind;
        public List<SQLQueryExprTypeMemberInfo> getNamedMembers(@NotNull DBRProgressMonitor monitor) throws DBException {
        }
            this.typeDesc = typeDesc;
            List<SQLQueryExprTypeMemberInfo> result = new ArrayList<>(this.attrs.size());
            SQLQueryExprType attrType = this.attrs.get(memberName);
        }
        public SQLQueryExprRowType(@NotNull SQLQueryComplexName reference, @NotNull SourceResolutionResult referencedSource) {
        }
            return SQLQueryExprType.forDescribedIfPresented(
        @NotNull SQLQueryExprType declaratorType,
    public static SQLQueryExprType forSynthesizedComposite(
        @NotNull
        public String getDisplayName() {
        ) {

    private SQLQueryExprType(@Nullable SQLQuerySymbolDefinition declaratorDefinition, @NotNull DBPDataKind dataKind) {
        @NotNull DBSTypedObjectEx2 typedObj,
        @NotNull
        private SQLQueryExprType prepareElementType(DBRProgressMonitor monitor) throws DBException {
     */
                ? new SQLQueryExprDescribedIndexableType(declaratorDefinition, typeDesc)
        @NotNull String displayName,


        }
        @Override
    }
    }
            int depth,
            @NotNull SQLQueryExprType elementType
        public String getDisplayName() {

    
    private static class SQLQueryExprSynthesizedIndexableType extends SQLQueryExprType {
    @NotNull
            ).toList();
            this.attrs = attrs;
import org.jkiss.dbeaver.model.DBPDataKind;
        if (a.getDataKind().equals(DBPDataKind.ANY)) {
        private final String name;
        @NotNull
        public SQLQueryExprType findIndexedItemType(
            @NotNull DBPDataSource dataSource,
    /**
            DBSAttributeBase attr = attrs.get(memberName);
                // both are simple of the same kind
        return forTypedObjectImpl(
    @NotNull
                isDataTypeMatches(x2.elementType, y2.elementType)
    public static final SQLQueryExprType BOOLEAN = forPredefined(DBPDataKind.BOOLEAN);
                return forTypedObjectImpl(monitor, type, declaratorDefinition);
 *
                a.getDataKind().isComplex() &&
            return this.typeDesc.getTypeName();
 *     http://www.apache.org/licenses/LICENSE-2.0
        ) {
            @Nullable boolean[] slicingSpec
        @Override
        }

            this.typeDesc = typeDesc;
        @Override
        private final String displayName;
            );
    private static class SQLQueryExprDescribedCompositeType extends SQLQueryExprType {
        }
            DBSTypeDescriptor memberTypeDesc = this.typeDesc.findCompositeMember(monitor, memberName);
                    );
            return DUMMY_FIELD;
                    boolean isQuoted = DBUtils.isQuotedIdentifier(this.complexType.getDataSource(), memberName);

        @Override
    @NotNull
        @NotNull Map<String, SQLQueryExprType> members
        return result;
    protected final DBPDataKind dataKind;
        @Nullable boolean[] slicingSpec
    @NotNull
     * Find a member with the specified name and return its type if exists
        public String getDisplayName() {
    @NotNull
        this.typedObject = null;
    }
    }
        }
                !b.getDataKind().isComplex() &&
    ) throws DBException {
        @Override
                for (DBSEntityAttribute attr : this.attrs.values()) {
        
        ) throws DBException {
        }
                        this,
        @NotNull DBPDataSource dataSource,
    }

        @Override
        @NotNull
        @Override
                        this.makeMemberType(monitor, member.type()),
            return "DescribedCompositeType[" + this.typeDesc.getTypeName() + "]";
    public final DBSTypedObject getTypedDbObject() {
        @Nullable
        @NotNull
        
    private static class SQLQueryExprRowType extends SQLQueryExprType {
import java.util.stream.Collectors;
            return SQLQueryExprType.forDescribed(monitor, typeDesc, def);
        @Override
        private final Map<String, DBSEntityAttribute> attrs;
            return SQLQueryExprType.forTypedObjectImpl(monitor, this.elementType, this.getDeclaratorDefinition());
        return new SQLQueryExprSimpleType(declaratorDefinition, typedObj);
     */
            super(declaratorDefinition, typedObject);
            ) || (
            super(declaratorDefinition, typeDesc.getDataKind() != null ? typeDesc.getDataKind() : DBPDataKind.UNKNOWN);

            this.name = name;

        return new SQLQueryExprRowType(reference, referencedSource);

        public String getDisplayName() {

        return switch (typeDesc.getKind()) {
        @NotNull
            @NotNull DBSTypeDescriptor typeDesc
            this.displayName = displayName;
        @Override
            @NotNull DBSTypeDescriptor typeDesc
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        ) throws DBException {
                return type;
        if (SQLQueryConnectionDummyContext.isDummyObject(typedObj)) {

            SQLQueryExprType type = forDescribedIfPresented(monitor, typedObj, typedEx2.getTypeDescriptor(monitor), declaratorDefinition);

 * DBeaver - Universal Database Manager
        public String toString() {
            @Nullable SQLQuerySymbolDefinition declaratorDefinition,
            if (type != null) {
    protected final SQLQuerySymbolDefinition declaratorDefinition;
                return depth == 1 ? type : type.findIndexedItemType(monitor, depth - 1, slicingSpec);
        @NotNull SourceResolutionResult referencedSource
                result.add(new SQLQueryExprTypeMemberInfo(this, attr.getKey(), attr.getValue(), null, null));
        public String getDisplayName() {
            @Nullable SQLQuerySymbolDefinition declaratorDefinition,
        return columns.isEmpty() ? SQLQueryExprType.UNKNOWN : columns.getFirst().type;
    public static final SQLQueryExprType DUMMY = new SQLQueryExprDummyType(null);
            super(declaratorDefinition, complexType);
        }

     */
        };
        @Override
import org.jkiss.dbeaver.model.DBUtils;
        @NotNull
        return Collections.emptyList();
                a instanceof SQLQueryExprDescribedIndexableType x3 &&

                a.equals(b)

        public SQLQueryExprType findIndexedItemType(
    @NotNull
        @NotNull

                ? null
    private static class SQLQueryExprComplexType<T extends DBSEntity & DBSTypedObject> extends SQLQueryExprType {

        }
        @NotNull DBRProgressMonitor monitor,
        }
                return Collections.emptyList();

        }
            SQLQuerySymbolDefinition def = this.declaratorDefinition instanceof SQLQuerySymbolByDbObjectDefinition byObjDef
package org.jkiss.dbeaver.model.sql.semantics.context;
    /**
            return column == null ? null : column.type;
            this.typeDesc = typeDesc;
    public static SQLQueryExprType forTypedObject(
    public record SQLQueryExprTypeMemberInfo(

        }
    }
    
    ) {
            @Nullable SQLQuerySymbolDefinition declaratorDefinition,
        assert result != null;
        }
            super(declaratorDefinition, DBPDataKind.ARRAY);

        @NotNull
    public static SQLQueryExprType forScalarSubquery(@NotNull SQLQueryRowsSourceModel source) {
    }
            @Nullable SQLQuerySymbolDefinition declaratorDefinition,
            case SIMPLE -> new SQLQueryExprSimpleDescribedType(declaratorDefinition, typeDesc);
    /**
    @Nullable
            } else if (typedObj instanceof DBSEntity complexType) {
    ));
            for (Map.Entry<String, SQLQueryExprType> attr : this.attrs.entrySet()) {
        @NotNull

    
        public SQLQueryExprType findNamedMemberType(@NotNull DBRProgressMonitor monitor, @NotNull String memberName) throws DBException {
            return tableObjectName != null ? tableObjectName : this.reference.getNameString();
                        attrType = attrs.entrySet().stream()
 * Unless required by applicable law or agreed to in writing, software
        @Override
 * You may obtain a copy of the License at
        public SQLQueryExprType findNamedMemberType(@NotNull DBRProgressMonitor monitor, @NotNull String memberName) throws DBException {
                b instanceof SQLQueryExprComplexType<?> y &&
    
    }
        @Override
 */
            return this.referencedSource.source.getRowsDataContext().getColumnsList().stream().map(
import org.jkiss.code.NotNull;
        public String toString() {
            Collection<DBSTypeDescriptor.CompositeMemberInfo> members = this.typeDesc.getCompositeMembers(monitor);
        @NotNull
        @NotNull SQLQuerySymbolClass defSymbolClass
                a instanceof SQLQueryExprIndexableType x2 &&
        @Nullable DBSTypeDescriptor typeDesc,
            this.elementType = elementType;
        }
        public SQLQueryExprDescribedIndexableType(
        if (typedObj instanceof DBSDataType type) {
    }
                        member.name(),
        }
                    result.add(new SQLQueryExprTypeMemberInfo(
            return "PredefinedType[" + this.name + "]";
    ) throws DBException {

import org.jkiss.dbeaver.model.impl.sql.BasicSQLDialect;
        @NotNull DBRProgressMonitor monitor,
            ) || (
        @NotNull
        @Nullable SQLQuerySymbolDefinition declaratorDefinition
        @Nullable
                !a.getDataKind().isComplex() &&
        public SQLQueryExprType findIndexedItemType(@NotNull DBRProgressMonitor monitor, int depth, @Nullable boolean[] slicingSpec) {
    
        public SQLQueryExprDescribedIndexableType(
            } else {
    public final SQLQuerySymbolDefinition getDeclaratorDefinition() {
        
            super(reference.parts.getLast().getDefinition(), DBPDataKind.ANY);
        }
    }
    public static SQLQueryExprType tryCombineIfMatches(@NotNull SQLQueryExprType a, @NotNull SQLQueryExprType b) {
    }
    ) {
            if (members == null || members.isEmpty()) {


                if (attrType == null) {
    private static SQLQueryExprType forDescribed(
                a.getDataKind().equals(b.getDataKind())
            @NotNull DBSTypeDescriptor typeDesc
        );
        @Override
 * limitations under the License.
                if (attrs != null) {
                : SQLQuerySemanticUtils.getObjectTypeName(this.referencedSource.tableOrNull);
        }
        @Override
        }

    private static class SQLQueryExprDescribedIndexableType extends SQLQueryExprType {
        @Nullable SQLQuerySymbolDefinition declaratorDefinition
     * Prepare type info based on the data type description
            monitor, typedObj,

        if (typeDesc == null) {
        }
        @Override
    ) throws DBException {
        public SQLQueryExprSynthesizedComplexType(

    public static final SQLQueryExprType NUMERIC = forPredefined(DBPDataKind.NUMERIC);
                    // "some" database plugins "intentionally" doesn't implement data type's attribute lookup, so try to mimic its logic
    }
import org.jkiss.dbeaver.model.DBPIdentifierCase;
                    result.add(new SQLQueryExprTypeMemberInfo(this, attr.getName(), forTypedObject(monitor, attr, SQLQuerySymbolClass.COMPOSITE_FIELD), attr, null));
        @Override
        @NotNull
                this.typedObject,
    /**
        @Override
    }

        public String toString() {
    @NotNull

            return DUMMY_FIELD;
        }
        @NotNull DBSTypeDescriptor typeDesc,
     */
    ) throws DBException {

            return result;
            @NotNull DBRProgressMonitor monitor,
        
        @NotNull
        }
        this.declaratorDefinition = declaratorDefinition;
        }
        @NotNull

    }

        public String toString() {
        return typeDesc == null ? UNKNOWN : forDescribed(monitor, typeDesc, declaratorDefinition);
            return "SimpleDescribedType[" + this.typeDesc.getTypeName() + "]";

                }

                    // "some" database plugins "intentionally" doesn't implement data type's attribute lookup, so try to mimic its logic

    }
        }
    private static class SQLQueryExprIndexableType extends SQLQueryExprType {
     */
        }
            @NotNull DBSDataType elementType
        private final SQLQueryComplexName reference;
    }
    private static class SQLQueryExprSimpleType extends SQLQueryExprType {
            return slicingSpec == null && depth == 1 ? this.elementType : null;
        private final DBSTypeDescriptor typeDesc;
        @NotNull

        }
        @Override
                this.typeDesc.getIndexableItemType(depth, slicingSpec),
            @Nullable boolean[] slicingSpec
            if (attrs != null) {
                            .findFirst().map(Map.Entry::getValue).orElse(null);

    public static SQLQueryExprType forTypedObject(
                    if ((!isQuoted && dialect.storesUnquotedCase() == DBPIdentifierCase.MIXED) || dialect.useCaseInsensitiveNameLookup()) {
            @NotNull DBSTypedObject typedObject,
            if (attr == null) {
    /**
        @NotNull String name,
        // TODO consider dialect-dependent coercions, consider generalizing coercion 
                x.complexType.equals(y.complexType)
            }
        public SQLQueryExprType findIndexedItemType(
        @Override
