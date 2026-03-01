    private static SQLQuerySymbol prepareColumnSymbol(@NotNull SQLDialect dialect, @NotNull DBSEntityAttribute attr) {

                SQLQuerySymbolEntry part = name.parts.get(i);
                        );
    public static Pair<List<SQLQueryResultColumn>, List<SQLQueryResultPseudoColumn>> prepareResultColumnsList(

    @NotNull
        @NotNull SQLQueryComplexName name,
            return;
        @NotNull SQLQueryComplexName name,
        }
        @NotNull SQLQuerySymbolOrigin origin,
     */
                for (; i >= 0 && j >= 0; i--, j--) {
    @Nullable
    private SQLQuerySemanticUtils() {
                    false,
 * Unless required by applicable law or agreed to in writing, software
        setNamePartsDefinition(context, name.parts, realObject, entityNameClass, origin, filterMode);
    }
 * limitations under the License.
            if (type != null) {
        }
        @NotNull SQLQuerySymbolOrigin origin,
            return null;
    @NotNull
import org.jkiss.dbeaver.model.sql.semantics.model.select.SQLQueryRowsTableDataModel;
        @NotNull STMTreeNode reason,
        RelationalObjectType.TYPE_SYNONYM
        return o instanceof DBPUniqueObject uo ? uo.getUniqueName() : o.getName();
            for (int i = name.parts.size() - 1; i >= 0; i--) {
        @NotNull SQLQuerySymbolClass entityNameClass,
import org.jkiss.code.Nullable;

 * See the License for the specific language governing permissions and
            }
        }
import org.jkiss.dbeaver.model.struct.rdb.*;
        @NotNull SQLQueryComplexName name,
        return pseudoAttributes.map(a -> new SQLQueryResultPseudoColumn(

        @NotNull List<SQLQuerySymbolEntry> parts,
import java.util.stream.Stream;
            new SQLQuerySymbol(SQLUtils.identifierToCanonicalForm(dialect, a.getName(), false, false)),
                    }
            statistics.appendError(reason, "Failed to resolve column type for column " + attr.getName(), e);
    private static final Log log = Log.getLog(SQLQuerySemanticUtils.class);
        @NotNull SQLQuerySymbolOrigin.DbObjectFilterMode filterMode,
        @NotNull SQLQueryRecognitionContext statistics,
            SQLQuerySymbolEntry part = name.parts.getFirst();
        } else {
            }
                }
    }
        SQLQueryExprType type;
                                    objOrigin.getRowsContext(),
                                : lastDefSymbolEntry.getOrigin()
            );
        @Nullable DBSEntity table,
        RelationalObjectType.TYPE_TRIGGER,
        @NotNull SQLQueryRowsSourceContext context,
                statistics.appendWarning(ambiguousEntry, "Ambiguous identifier: " + String.join(" vs ", names));
    /**
        return knownObjectTypes.stream()
            } else if (objs.size() > 1) {
        RelationalObjectType.TYPE_DATA_TYPE,
    private static String inferObjectTypeName(@NotNull DBSObject object) {
        } catch (DBException e) {
                    DBDPseudoAttribute.PropagationPolicy.TABLE_LOCAL,
    public static void propagateColumnDefinition(
    ) {
    }
    ) {
        RelationalObjectType.TYPE_PROCEDURE,
                    if (part.getOrigin() == null) {
            lastPart.setOrigin(origin);
    }
        @NotNull SQLQueryComplexName name,
        @NotNull SQLQuerySymbolOrigin.DbObjectFilterMode filterMode
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    i--;
                SQLQuerySymbolEntry nameEntry = parts.get(scopeNameIndex);
                    "Failed to resolve member reference " + identifier.getName() + " for " + valueType.getDisplayName()
        @NotNull SQLQueryRecognitionContext statistics,
    );
                    }
import org.jkiss.dbeaver.model.sql.SQLUtils;
                    identifier,
        } catch (DBException e) {
        @NotNull SQLQuerySymbolOrigin origin,
     * Returns row tuple columns based on the attributes obtained from the table referenced in the query
        RelationalObjectType.TYPE_CONSTRAINT,
        if (!statistics.useRealMetadata() || context.getConnectionInfo().isDummy()) {
        for (int len = namePartsCount; len > 0 && object == null; len--) {
    ) {
                    SQLQuerySymbolEntry part = name.parts.get(i);
    /**
                    obtainColumnType(cause, statistics, attr),
    }
        @NotNull DBSObject realObject,
        return Pair.of(columns, pseudoColumns);
            }
                    name.endingPeriodNode.setOrigin(lastPartOrigin);
        try {
        @Nullable DBSEntity table,
 * Copyright (C) 2010-2025 DBeaver Corp and others

                columns.add(new SQLQueryResultColumn(
    @Nullable
import java.util.*;
        }

        if (name == null) {
        identifier.setOrigin(memberOrigin);
        @Nullable SQLQuerySymbolOrigin columnNameOrigin

     * Propagate semantics context and establish relations through the query model for column definition
     */
                .findRealObjects(statistics.getMonitor(), RelationalObjectType.TYPE_UNKNOWN, fragmentStrings);
    @Nullable
        symbol.setDefinition(new SQLQuerySymbolByDbObjectDefinition(attr, SQLQuerySymbolClass.COLUMN));
/*
        @NotNull SQLQuerySymbolOrigin origin
    private static final Set<DBSObjectType> knownObjectTypes = Set.of(
                Set<String> names = objs.stream().map(SQLQuerySemanticUtils::getObjectUniqueName).collect(Collectors.toSet());
                int i = name.parts.size() - 1;
import org.jkiss.dbeaver.Log;
                    prepareColumnSymbol(dialect, attr),
        @NotNull SQLQuerySymbolOrigin origin,
                SQLQuerySymbolEntry ambiguousEntry = name.parts.get(len - 1);
    }
            }
import org.jkiss.dbeaver.model.DBIcon;
            objectNameClass = SQLQuerySymbolClass.TABLE;
        @NotNull SQLQuerySymbolOrigin memberOrigin
        @NotNull SQLDialect dialect,
            statistics.appendError(
        } else if (name.parts.size() == 1) {

                typeName = inferObjectTypeName(object);
        @NotNull SQLQuerySymbolClass entityNameClass
        @NotNull SQLQueryRecognitionContext statistics,
                }
    public static List<SQLQueryResultPseudoColumn> prepareResultPseudoColumnsList(
                                    SQLQuerySymbolOrigin.DbObjectFilterMode.VALUE)
        RelationalObjectType.TYPE_INDEX,
    ) {
                            lastDefSymbolEntry.getOrigin() instanceof SQLQuerySymbolOrigin.DbObjectFromDbObject objOrigin
                identifier,
        } else {
 * distributed under the License is distributed on an "AS IS" BASIS,
                SQLQuerySymbolEntry lastDefSymbolEntry = tableName.parts.getLast();
            if (name.parts.size() > nameFragment.size()) {
            type = SQLQueryExprType.UNKNOWN;
        SQLQuerySymbol symbol = new SQLQuerySymbol(name);
            List<? extends DBSObject> objs = context.getConnectionInfo()
        SQLQueryExprType type;
                    rowsSourceModel, table, attr,
    }
        }
        RelationalObjectType.TYPE_PACKAGE,
 * you may not use this file except in compliance with the License.
            return null;

        @NotNull SourceResolutionResult rr,
        if (!parts.isEmpty()) {
                int j = tableName.parts.size() - 1;
            name.parts.getFirst().setDefinition(rr.aliasOrNull.getDefinition());
        if (rr.aliasOrNull != null && name.parts.size() == 1) {
            typeName = inferObjectTypeName(object);
                object = object.getParentObject();
            statistics.appendError(columnName, "Column " + columnName.getName() + " not found");
import org.jkiss.dbeaver.DBException;
                e
                ));
    public static void setNamePartsDefinition(
        @NotNull DBSAttributeBase attr
                SQLQuerySymbolOrigin lastPartOrigin = new SQLQuerySymbolOrigin.DbObjectFromDbObject(object, context, filterMode);
        return typeName;
        if (name.parts.getLast() != null && name.parts.getLast().isNotClassified()) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                );
        @NotNull SQLQueryRowsSourceContext context,
        }
    }
            objectNameClass = SQLQuerySymbolClass.CATALOG;

                    columns.size(),
        setNamePartsDefinition(context, name,  realObject, entityNameClass, origin, filterMode);
import org.jkiss.dbeaver.model.sql.SQLDialect;
public class SQLQuerySemanticUtils {
        @NotNull Stream<DBDPseudoAttribute> pseudoAttributes
                    table,
import org.jkiss.code.NotNull;
    }
                }
            .map(DBSObjectType::getTypeName)
}
        @NotNull DBSObject realObject,
        @NotNull SQLQueryRowsSourceModel rowsSourceModel,
    public static SQLQuerySymbolClass getIdentifierSymbolClass(@Nullable SQLQueryComplexName name) {
import org.jkiss.dbeaver.model.DBPEvaluationContext;
            log.debug(e);
        } else {

        @NotNull DBSObject realObject,
            type = null;
    public static void performPartialResolution(
        @NotNull SQLQueryRowsSourceContext context,
import java.lang.reflect.AccessFlag;
                pseudoColumns.add(new SQLQueryResultPseudoColumn(

        RelationalObjectType.TYPE_TABLE,
    @NotNull
        @NotNull SQLQuerySymbolEntry columnName,
        @NotNull SQLQuerySymbolOrigin.DbObjectFilterMode filterMode

        @NotNull SQLQueryRowsSourceContext context,
    public static SQLQuerySymbolClass inferSymbolClass(@NotNull DBSObject object) {
                identifier.setDefinition(type.getDeclaratorDefinition());
            }
            setNamePartsDefinition(context, nameFragment, object, inferSymbolClass(object), origin, filterMode);
            source, table, SQLQueryExprType.UNKNOWN, a.getPropagationPolicy(), a.getDescription()

        RelationalObjectType.TYPE_VIEW,
import org.jkiss.dbeaver.model.struct.*;
    ) {
import org.jkiss.dbeaver.model.DBPUniqueObject;
        for (DBSEntityAttribute attr : attributes) {
    }
        String typeName;
    }
                    prepareColumnSymbol(dialect, attr),
        } else if (rr.source instanceof SQLQueryRowsTableDataModel tableModel) {
        } else {
                    lastPart = nameEntry;
import org.jkiss.dbeaver.model.data.DBDPseudoAttribute;
    ) {
 *

        columnName.setOrigin(columnNameOrigin);
            type = valueType.findNamedMemberType(statistics.getMonitor(), identifier.getName());
        RelationalObjectType.TYPE_SEQUENCE,
                ));
                    part.setDefinition(lastDefSymbolEntry = tableName.parts.get(j));
                SQLQuerySymbolEntry part = name.parts.get(nameFragment.size());
        @NotNull SQLQueryRecognitionContext statistics,
        SQLQuerySymbolClass objectNameClass;
 * DBeaver - Universal Database Manager
        if (object != null && !fragmentStrings.isEmpty()) {
                while (i >= 0) {
        RelationalObjectType.TYPE_SCHEMA,
                object = objs.getFirst();
import org.jkiss.utils.Pair;


            if (DBUtils.isHiddenObject(attr)) {
    public static String getObjectTypeName(@NotNull DBSObject object) {
        return objectNameClass;
            type = SQLQueryExprType.forTypedObject(statistics.getMonitor(), attr, SQLQuerySymbolClass.COLUMN);
    ) {
        } else {
    @Nullable
                    attr.getDescription()
            while (object != null && scopeNameIndex >= 0) {
        try {
    }
            }
                    lastPart.setOrigin(new SQLQuerySymbolOrigin.DbObjectFromDbObject(object, context, filterMode));
        }
            SQLQuerySymbolEntry lastPart = parts.getLast();

     * Resolve object and origin from name parts
            .orElse(null);
        return entry == null ? null : entry.getSymbolClass();
            name.parts.getFirst().setOrigin(origin);
            } else {
            objectNameClass = SQLQuerySymbolClass.UNKNOWN; // TODO consider OBJECT is not necessarily TABLE
        DBSObject object = null;
        SQLQuerySymbolClass entityNameClass  = inferSymbolClass(realObject);
    }
        return type;
            typeName = DBUtils.getObjectTypeName(object);
            name.parts.getLast().getSymbol().setSymbolClass(entityNameClass);

                                ? new SQLQuerySymbolOrigin.DbObjectFromDbObject(
    }
 *
        )).collect(Collectors.toList());
    public static String getObjectUniqueName(@NotNull DBSObject o) {

                                    objOrigin.getObject(),
            log.debug(e);
import org.jkiss.dbeaver.model.DBUtils;
                    true

            columnName.setDefinition(resultColumn.symbol.getDefinition());
    /**
            if (tableName != null) {

                    SQLQuerySymbolEntry part = name.parts.get(i);

package org.jkiss.dbeaver.model.sql.semantics;
        @NotNull SQLQuerySymbolEntry identifier,
                    nameEntry.setDefinition(new SQLQuerySymbolByDbObjectDefinition(object, objectNameClass));
                    object.getDataSource().getSQLDialect(),
            columnName.getSymbol().setSymbolClass(SQLQuerySymbolClass.ERROR);
import org.jkiss.dbeaver.model.stm.STMTreeNode;
        @NotNull List<? extends DBSEntityAttribute> attributes
                if (objectName.equalsIgnoreCase(nameEntry.getName())) {

                }

                        part.setOrigin(
        List<SQLQueryResultPseudoColumn> pseudoColumns = new ArrayList<>(attributes.size());
     */
    }
        RelationalObjectType.TYPE_TABLE_COLUMN,
                );
        return symbol == null ? null : symbol.getSymbolClass();
 */
    }

                    scopeNameIndex--;
    public static SQLQuerySymbolClass getIdentifierSymbolClass(@Nullable SQLQuerySymbol symbol) {
            SQLQueryComplexName tableName = tableModel.getName();
    public static void setNamePartsDefinition(
            .filter(t -> t.getTypeClass().isAssignableFrom(object.getClass())).findFirst()
            return part == null ? null : part.getSymbolClass();
        return type;
                    return part.getSymbolClass();
        int namePartsCount = name.invalidPartsCount == 0 ? name.parts.size() : name.parts.indexOf(null);
            objectNameClass = SQLQuerySymbolClass.SCHEMA;
        }

                    rowsSourceModel,
    ) {
            } else {
import org.jkiss.dbeaver.model.sql.semantics.model.select.SQLQueryRowsSourceModel;

import org.jkiss.dbeaver.model.sql.semantics.context.*;
                if (part != null) {

        // TODO consider ambiguity
 *
 * You may obtain a copy of the License at
        } else if (object instanceof DBSSchema) {
                        part.setDefinition(lastDefSymbolEntry);
        }
        @NotNull SQLQuerySymbolClass entityNameClass,
            return null;
        if (SQLQueryConnectionDummyContext.isDummyObject(object)) {
    public static void setNamePartsDefinition(
                }
                String objectName = SQLUtils.identifierToCanonicalForm(
                    obtainColumnType(cause, statistics, attr)
            lastPart.setDefinition(new SQLQuerySymbolByDbObjectDefinition(realObject, entityNameClass));
    @Nullable
        RelationalObjectType.TYPE_CATALOG,
        @Nullable SQLQueryRowsSourceModel source,
                ambiguousEntry.getSymbol().setSymbolClass(SQLQuerySymbolClass.ERROR);
                    DBUtils.getQuotedIdentifier(object),
    public static SQLQueryExprType tryResolveMemberReference(
    @NotNull
import java.util.stream.Collectors;
    public static SQLQuerySymbolClass getIdentifierSymbolClass(@Nullable SQLQuerySymbolEntry entry) {
            fragmentStrings = name.stringParts.subList(0, len);

        } else if (object instanceof DBSCatalog) {
        } else if (name.parts.isEmpty()) {
        List<SQLQueryResultColumn> columns = new ArrayList<>(attributes.size());
    }
            }
            throw new IllegalStateException("Failed to propagate entity reference definition for " + name.getNameString());
                statistics.appendError(
    @NotNull
        @NotNull STMTreeNode cause,
    }
            int scopeNameIndex = parts.size() - 2;
        }
            if (typeName.equalsIgnoreCase("Object")) {
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
                    part.setOrigin(lastPartOrigin);
            if (objs.size() == 1) {
        } else if (!name.parts.isEmpty()) {
        @NotNull SQLQueryExprType valueType,
                    if (part.getOrigin() == null) {
    ) {
                } else if (name.parts.size() == nameFragment.size() + 1 && name.endingPeriodNode != null) {
                "Failed to resolve member reference " + identifier.getName() + " for " + valueType.getDisplayName(),
        @NotNull SQLQueryRecognitionContext statistics,
            }
                    SQLQuerySymbolClass objectNameClass = inferSymbolClass(object);
        String name = SQLUtils.identifierToCanonicalForm(dialect, attr.getName(), false, true);
            List<SQLQuerySymbolEntry> nameFragment = name.parts.subList(0, fragmentStrings.size());
        @Nullable SQLQueryResultColumn resultColumn,
        }
    }
            DBSObject object = realObject.getParentObject();
        name.parts.getFirst().setOrigin(origin);
    @Nullable
    public static void setNamePartsDefinition(
                if (part != null) {
        if (resultColumn != null) {
                identifier.getSymbol().setSymbolClass(SQLQuerySymbolClass.ERROR);
        @NotNull SQLDialect dialect,
    ) {

        return symbol;
import org.jkiss.dbeaver.model.impl.struct.RelationalObjectType;
        @NotNull SQLQuerySymbolOrigin.DbObjectFilterMode filterMode
        if (object instanceof DBSTable || object instanceof DBSView) {
    private static SQLQueryExprType obtainColumnType(
        List<String> fragmentStrings = null;
        }
