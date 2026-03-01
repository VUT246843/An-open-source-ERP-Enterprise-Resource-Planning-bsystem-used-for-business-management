        if (containerMapping.getMappingType() == DatabaseMappingType.existing) {
            } else if (MappingReplaceMechanism.CAMELCASE == mechanism
        @NotNull DBSObjectContainer schema,
        MappingNameCase nameCase = MappingNameCase.getCaseFromPreferences(dbpPreferenceStore, store);
                for (DatabaseMappingAttribute attr : containerMapping.getAttributeMappings(monitor)) {
            .append(" ADD ");
            for (Map.Entry<DBPPropertyDescriptor, Object> entry : changedProperties.entrySet()) {
        return tableFinalName;
        }
                && nameCase != MappingNameCase.UPPER // No need to transform upper case names
            log.debug("Null target container");
        List<DBEPersistAction> actions = new ArrayList<>();

            if (containerNode != null) {
                }
                        boolean hasAttr = false;
    }
                            idMapped = false;
        } catch (NumberFormatException ignore) {
     * Transform target mapping name by mapping rules (if we have them)
    public static void refreshDatabaseModel(DBRProgressMonitor monitor, DatabaseConsumerSettings consumerSettings, DatabaseMappingContainer containerMapping) throws DBException {
        } else {
                finalName = finalName.replaceAll(" ", "_");
            // Probably it is the task with saved properties map
        }
    @NotNull
            switch (containerMapping.getMappingType()) {
                    tableFinalName = table.getName();
     *

        }
    static DBEPersistAction generateTargetAttributeDDL(DBPDataSource dataSource, DatabaseMappingAttribute attribute) {
            Integer.parseInt(value);
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
            return;
 *
        }
        Map<String, Object> options = new HashMap<>();
     */
        }
        monitor.subTask("Refresh database model");
        DBSObjectContainer container = consumerSettings.getContainer();
                case create:
                if (attrClass == null) {
        } catch (DBException e) {
                }


            ((DBPNamedObject2) table).setName(tableFinalName);
        }
    private static String getTableFinalName(
                            String fullTargetTypeName = attributeMapping.getTargetType(executionContext.getDataSource(), true);
import java.util.*;
            return DATA_TYPE_BIGINT;
                        if (!typeModifiersSet) {
            return;
        if (table.getDataSource() == null) {
                if (newTarget == null) {
                    break;

            // So we should find the correct properties and bound them
        try {
        if (actions.length == 0) {
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
        }
            }
import org.jkiss.dbeaver.model.sql.SQLUtils;
                        }
            actions.addAll(
            Map<String, Object> rawChangedPropertiesMap = containerMapping.getRawChangedPropertiesMap();
        sql.append("ALTER TABLE ").append(DBUtils.getObjectFullName(attribute.getParent().getTarget(), DBPEvaluationContext.DDL))
            finalName = DBObjectNameCaseTransformer.transformName(dataSource, targetName);
                }
            return new DBEPersistAction[0];
                for (DatabaseMappingAttribute attributeMapping : containerMapping.getAttributeMappings(monitor)) {
    @NotNull

                }

    }
                    throw new DBException("Target table create or update was canceled");
    /**
     * @param changedProperties list of properties what feature table must have
        @Nullable DBRProgressMonitor monitor,
            Double.parseDouble(value);
     * This method returns object of the feature new created table and fill the table creating actions list
        // Commit DDL changes
            return null;
    /**
                }
        @NotNull DBSEntity table)
            }
                if (attr.getMappingType() == DatabaseMappingType.create) {
 * limitations under the License.

                                typedAttr.setScale(sourceAttr.getScale());
    private static final Pair<DBPDataKind, String> DATA_TYPE_NATIONAL_STRING = new Pair<>(DBPDataKind.STRING, "NVARCHAR");
            throw new DBException("Can't create or modify target table", e);
        {
                        getTransformedName(newAttribute.getDataSource(), attributeMapping.getTargetName(), false));
     * @param executionContext execution context for DDL generation
                    if (createCommand instanceof DBECommandAggregator) {
            throw new DBException("Internal error - target table not set");
            if (containerMapping.getSource() instanceof DBSEntity) {
        @NotNull List<DBEPersistAction> actions,
     * @return transformed target name (container or attribute)
                            hasAttr = true;
import org.jkiss.utils.CommonUtils;
     * @return DBSEntity table object that can be used as temporary to work with its properties, for example
                mappedAttrs.put(attr.getSource(), attr);
                table = (DBSEntity) containerMapping.getTarget();
        if (CommonUtils.isEmpty(value)) {
    public static void executeDDL(DBCSession session, DBEPersistAction[] actions) throws DBException {

        // Try plain SQL mode
                    throw new DBException("Table create not supported by " + executionContext.getDataSource().getContainer().getDriver().getName());
                    if (!(newAttribute instanceof DBPNamedObject2)) {
                if (CommonUtils.isNotEmpty(camelCaseName)) {
        DBPPreferenceStore store = DTActivator.getDefault().getPreferences();
        if (containerMapping == null) {
        }

                if (property != null) {
                String camelCaseName = CommonUtils.toCamelCase(finalName);
                if (attr.getMappingType() != DatabaseMappingType.create) {
 * Licensed under the Apache License, Version 2.0 (the "License");
            DBECommandContext commandContext = new TargetCommandContext(executionContext);
            } else {
                if (!CommonUtils.isEmpty(identifier)) {
                                typedAttr.setPrecision(sourceAttr.getPrecision());
            ) {
                    ((DBPNamedObject2) newAttribute).setName(
                // Make primary key
                    break;

        } else {

                appendAttributeClause(dataSource, sql, attr);
            {
        StringBuilder sql = new StringBuilder(500);
            options.put(SQLObjectEditor.OPTION_SKIP_CONFIGURATION, true);
        }
            return table;
            throw new DBException("Can not set name for target entity '" + targetEntity.getClass().getName() + "'");
 * you may not use this file except in compliance with the License.
                    null));
                    tableManager.deleteObject(commandContext, table, options);
        @NotNull DatabaseMappingContainer containerMapping,
    }
     */
     * @throws DBException on any DB error
            SQLObjectEditor<DBSEntityAttribute,?> attributeManager;
            }
        SQLObjectEditor<DBSEntity, ?> tableManager = editorsRegistry.getObjectManager(tableClass, SQLObjectEditor.class);
    private static final Pair<DBPDataKind, String> DATA_TYPE_BIGINT = new Pair<>(DBPDataKind.NUMERIC, "BIGINT");
                            if (sourceAttr != null) {
        if (containerMapping.getMappingType() == DatabaseMappingType.create) {
                    updateMappingAttributes = true;
import org.jkiss.dbeaver.model.*;
                tableFinalName = getTableFinalName(containerMapping.getTargetName(), tableClass, table, true);
     * @param schema table container
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.DBException;
        try {

        }
    public static void applyPropertyChanges(
            }
        } else {
                    finalName = camelCaseName.replaceAll(" ", "");
                        options);
            if (updateMappingAttributes || force) {
        @NotNull DBRProgressMonitor monitor,
        TargetCommandContext(DBCExecutionContext executionContext) {
            if (containerMapping.getMappingType() == DatabaseMappingType.create ||
                        } else {
                    tableFinalName = getTableFinalName(containerMapping.getTargetName(), tableClass, table, false);
        }
            }
            }
            for (Map.Entry<String, Object> entry : rawChangedPropertiesMap.entrySet()) {
        log.debug("Can't transform target attribute name");
                    continue;
                    // Set attribute properties
        try {
        @NotNull DatabaseMappingContainer containerMapping,
import org.jkiss.dbeaver.model.impl.edit.AbstractCommandContext;
            return DATA_TYPE_UNKNOWN;
public class DatabaseTransferUtils {
        }
            var containerNode = navigatorModel.getNodeByObject(monitor, container, false);
                    SQLObjectEditor.ObjectCreateCommand attrCreateCommand = attributeManager.makeCreateCommand(newAttribute, options);
    ) throws DBException {
                return actions.toArray(DBEPersistAction[]::new);
        @NotNull DBCExecutionContext executionContext,
    }
    }
        @NotNull Class<? extends DBSObject> tableClass,
                            break;
            ((DBPRefreshableObject) container).refreshObject(monitor);
        }
        if (mechanism != MappingReplaceMechanism.ABSENT && CommonUtils.isNotEmpty(finalName) && finalName.contains(" ")) {
    private static SQLObjectEditor<DBSEntity, ?> getTableManager(DBERegistry editorsRegistry, Class<? extends DBSObject> tableClass)
    }
                DBSObject newTarget = container.getChild(monitor, DBUtils.getUnQuotedIdentifier(container.getDataSource(), containerMapping.getTargetName()));
/*
    public static Pair<DBPDataKind, String> getDataType(@Nullable String value) {
                }
    @NotNull
        String attrName = getTransformedName(dataSource, attr.getTargetName(), false);
                    updateMappingTarget = false;
            sql.append("DROP TABLE ");

            Long.parseLong(value);
            }
                        ((DBECommandAggregator)createCommand).aggregateCommand(attrCreateCommand);
        ensureHasEditMetadataPermission(session.getDataSource().getContainer());
    private static final Pair<DBPDataKind, String> DATA_TYPE_INTEGER = new Pair<>(DBPDataKind.NUMERIC, "INTEGER");
        char firstChar = value.charAt(0);
 *
                createCommand = tableManager.makeCreateCommand(table, options);
            }
                }
            getTableFullName(schema, dataSource, sql, tableName);
                        commandContext,
        PropertySourceEditable propertySource = new PropertySourceEditable(commandContext, table, table);
        // Process actions
import org.jkiss.code.Nullable;
        if (CommonUtils.isEmpty(changedProperties) && containerMapping != null
                attrClass = null;
        final DBERegistry editorsRegistry = DBWorkbench.getPlatform().getEditorsRegistry();

    }
            for (DatabaseMappingAttribute attr : containerMapping.getAttributeMappings(monitor)) {
            return targetName;
import org.jkiss.dbeaver.model.navigator.DBNUtils;
    private static final Pair<DBPDataKind, String> DATA_TYPE_REAL = new Pair<>(DBPDataKind.NUMERIC, "REAL");
                    executionContext,
                    table = tableManager.createNewObject(
        monitor.subTask("Validate table structure table '" + containerMapping.getTargetName() + "'");

        return actions.toArray(new DBEPersistAction[0]);
    }
        @Nullable DBECommandContext commandContext,
                    }
                }
    public static DBEPersistAction[] generateTargetTableDDL(
                    "Do you want to create or update target object with auto-generated SQL script?"))

import org.jkiss.utils.BeanUtils;
                DBExecUtils.getActionsListFromCommandContext(
            return DATA_TYPE_REAL;
        if (!DBSEntity.class.isAssignableFrom(tableClass)) {
    /**

                attrClass = BeanUtils.findAssignableType(childTypes, DBSEntityAttribute.class);
                    boolean idMapped = true;
    private static Pair<DBPDataKind, String> tryClassifyNumber(@NotNull String value) {
import org.jkiss.code.NotNull;
    private static final Log log = Log.getLog(DatabaseTransferUtils.class);

        }
        commandContext.saveChanges(monitor, options);
            }
                            typeModifiersSet = fullTargetTypeName.contains("(");
        if (table instanceof DBPNamedObject2) {
            return new DBEPersistAction[0];
        }
    }
            throw new DBCException("New table creation in database [" + container.getName() + "] restricted by connection configuration");
            Class<? extends DBSEntityAttribute> attrClass;
                {
                    updateMappingTarget = true;
            DBECommand createCommand = null;

            } else {
        if (CommonUtils.isNotEmpty(finalName)) {
    }
            boolean updateMappingAttributes = false;
        if (container == null) {
            }
    private static void getTableFullName(@Nullable DBSObjectContainer schema, @NotNull DBPDataSource dataSource, @NotNull StringBuilder sql, @NotNull String tableName) {

                    break;
        DBPPreferenceStore dbpPreferenceStore = dataSource.getContainer().getPreferenceStore();
            Map<DBSAttributeBase, DatabaseMappingAttribute> mappedAttrs = new HashMap<>();
    private static void appendAttributeClause(DBPDataSource dataSource, StringBuilder sql, DatabaseMappingAttribute attr) {
        StringBuilder sql = new StringBuilder(500);
                generateStructTableDDL(monitor, executionContext, schema, containerMapping, actions, changedProperties);
            && !CommonUtils.isEmpty(containerMapping.getRawChangedPropertiesMap())) {

                    propertySource.addChangedProperties(property, entry.getValue());
     * @param schema feature table container
    }

    }
    private static final Pair<DBPDataKind, String> DATA_TYPE_STRING = new Pair<>(DBPDataKind.STRING, "VARCHAR");

                    if (idMapped) {
                if (!(tableManager instanceof DBEStructEditor)) {
                            sql.append(DBUtils.getQuotedIdentifier(dataSource, mappedAttr.getTargetName()));
        MappingReplaceMechanism mechanism = MappingReplaceMechanism.getCaseFromPreferences(dbpPreferenceStore, store);
            return DATA_TYPE_INTEGER;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                throw new DBException("Table create is not supported by driver " + schema.getDataSource().getContainer().getDriver().getName());
                    throw new DBCException("New table " + DBUtils.getObjectFullName(newTarget, DBPEvaluationContext.UI) + " doesn't support data manipulation");
            return DATA_TYPE_NATIONAL_STRING;

                attributeManager = null;
        if (navigatorModel != null) {
        return tableClass;
                sql.append("\t");
            actions.add(new SQLDatabasePersistAction("Table DDL", sql.toString()));
    }
        if (extraTransform) {
        if (CommonUtils.isEmpty(tableName)) {
        DBPDataSource dataSource = executionContext.getDataSource();
                && !(nameCase == MappingNameCase.DEFAULT && dataSource.getSQLDialect().storesUnquotedCase() == DBPIdentifierCase.UPPER)
        if (table == null) {
            sql.append(dataSource.getSQLDialect().getScriptDelimiters()[0]);
            boolean updateMappingTarget = false;
        } else if (container instanceof DBPRefreshableObject) {

            if (!tableManager.canCreateObject(schema)) {
        }
 * You may obtain a copy of the License at
    private static Class<? extends DBSObject> getTableClass(DBRProgressMonitor monitor, DBSObjectContainer schema) throws DBException {
        options.put(SQLObjectEditor.OPTION_SKIP_CONFIGURATION, true);
    public static DBSEntity generateStructTableDDL(
                        }
    public static String getTransformedName(@NotNull DBPDataSource dataSource, @NotNull String targetName, boolean skipCaseChanging) {
 *
    static void createTargetDynamicTable(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull DBSObjectContainer schema, @NotNull DatabaseMappingContainer containerMapping, boolean recreate) throws DBException {

            return;
        try {
                if (containerMapping.getMappingType() == DatabaseMappingType.create) {
            sql.append(DBUtils.getFullyQualifiedName(dataSource, schema.getName(), tableName));
            if (numeric != null) {
        sql.append(DBUtils.getQuotedIdentifier(dataSource, attrName)).append(" ").append(attr.getTargetType(dataSource, true));
            return DATA_TYPE_BOOLEAN;
                table = tableManager.createNewObject(monitor, commandContext, schema, null, options);
                    for (DBSEntityAttribute idAttr : identifier) {
import org.jkiss.utils.Pair;
            SQLObjectEditor<DBSEntity, ?> tableManager = getTableManager(editorsRegistry, tableClass);
        if (isNumericStart(firstChar)) {
                    }
 * DBeaver - Universal Database Manager
                default:
}
            // Add quotes for the result name if needed
            if (attributeManager != null) {
                    }
                            if (hasAttr) sql.append(",");
                propertySource.setPropertyValue(monitor, table, (ObjectPropertyDescriptor) entry.getKey(), entry.getValue());
        DBCTransactionManager txnManager = DBUtils.getTransactionManager(session.getExecutionContext());
import org.jkiss.dbeaver.model.navigator.DBNModel;
                    if (newAttribute instanceof DBSTypedObjectExt2) {
            for (DatabaseMappingAttribute attr : containerMapping.getAttributeMappings(monitor)) {
        // Check whether we have any changes in mappings
                        for (DBSEntityAttribute idAttr : identifier) {
import org.jkiss.dbeaver.runtime.properties.PropertySourceEditable;
    {
                    attr.getMappingType() != DatabaseMappingType.skip) {
            tableFinalName = getTransformedName(table.getDataSource(), targetName, false);
        @Nullable Map<DBPPropertyDescriptor, Object> changedProperties
            boolean hasChanges = false;
        if (!container.hasModifyPermission(DBPDataSourcePermission.PERMISSION_EDIT_METADATA)) {
                            typedAttr.setTypeName(targetAttrType);
        if (containerMapping.getMappingType() == DatabaseMappingType.skip) {
            Class<? extends DBSObject> tableClass = getTableClass(monitor, schema);
                applyPropertyChanges(monitor, changedProperties, commandContext, containerMapping, table);
            finalName = nameCase.getIdentifierCase().transform(targetName);
                if (table == null) {
            DBSEntity table;
     * @param containerMapping mapping container can not be null
        }
                        null,
*/
        }
            throw new DBException("Null target entity returned");
                    throw new DBException("Column manager not found for '" + tableClass.getName() + "'");
    @NotNull
                        }
            }
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
                if (!DBWorkbench.getPlatformUI().confirmAction(
    @NotNull
            commandContext.saveChanges(monitor, options);
import org.jkiss.dbeaver.Log;
        }
                    commandContext,

                    createCommand = tableManager.makeCreateCommand(table, options);
                        throw new DBException("Table column name cannot be set for " + attrClass.getName());
        }
    }
                    throw new DBException("Internal error - target table not set");
        }
    @NotNull
        containerMapping.setTargetName(tableName);
            sql.append(DBUtils.getQuotedIdentifier(dataSource, tableName));
            containerMapping.setTargetName(tableFinalName);
        return new SQLDatabasePersistAction(sql.toString());
     * @throws DBException on any DB error
            }
    }
            propertySource.collectProperties();
                containerMapping.setTarget((DBSDataManipulator) newTarget);
                    applyPropertyChanges(monitor, changedProperties, commandContext, containerMapping, table);
            if (attr.getSource().isRequired()) sql.append(" NOT NULL");

        if (!SQLUtils.isLatinLetter(firstChar)) {
 * See the License for the specific language governing permissions and
                                typedAttr.setRequired(sourceAttr.isRequired());
    static class TargetCommandContext extends AbstractCommandContext {
        }
     * Has old code inside with the simple table creations.
        }
    }

        if (containerMapping.getMappingType() == DatabaseMappingType.recreate && containerMapping.getTarget() != null) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
        if (schema instanceof DBSSchema || schema instanceof DBSCatalog) {
        }
            sql.append("CREATE TABLE ");
        // Reflect database changes in mappings
     *
            }
        DBNModel navigatorModel = DBNUtils.getNavigatorModel(container);
     * @param changedProperties list of properties what feature table must have
        if (tableManager == null) {
                return numeric;
                    actions.add(generateTargetAttributeDDL(dataSource, attr));
import org.jkiss.dbeaver.model.struct.*;
                Collection<? extends DBSEntityAttribute> identifier = DBUtils.getBestTableIdentifier(monitor, (DBSEntity) containerMapping.getSource());
        if (targetEntity == null) {
     * @param containerMapping mapping container
import org.jkiss.dbeaver.runtime.properties.ObjectPropertyDescriptor;
                    "Generate DDL automatically",
        }
                } else if (!(newTarget instanceof DBSDataManipulator)) {
                return new DBEPersistAction[0];
        return DATA_TYPE_STRING;

            super(executionContext, true);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        if (recreate && containerMapping.getTarget() != null) {
                    monitor,
                        }

        ensureHasEditMetadataPermission(executionContext.getDataSource().getContainer());
        if (USE_STRUCT_DDL) {
                        attr.updateMappingType(monitor, false, false);
        final DBERegistry editorsRegistry = DBWorkbench.getPlatform().getEditorsRegistry();
                    hasChanges = true;
        }
                    if (attributeMapping.getMappingType() != DatabaseMappingType.create) {
        boolean extraTransform
        }
     * @param actions will be filled by persist actions
        @Nullable DatabaseMappingContainer containerMapping,

        }
        }
import org.jkiss.dbeaver.model.struct.rdb.DBSSchema;
        } else {
    }
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
            throw new DBException("Wrong table container child type: " + tableClass.getName());
            if (updateMappingTarget || force) {
    private static final Pair<DBPDataKind, String> DATA_TYPE_UNKNOWN = new Pair<>(DBPDataKind.UNKNOWN, null);
            }

        } catch (NumberFormatException ignore) {
                    break;
    ) throws DBException {
                        if (!mappedAttrs.containsKey(idAttr)) {
        @Nullable Map<DBPPropertyDescriptor, Object> changedProperties) throws DBException
            } catch (DBException e) {
                    }
            try {
                    updateMappingAttributes = true;
        }
                            ((DBSTypedObjectExt3) typedAttr).setFullTypeName(fullTargetTypeName);
        if (txnManager != null && txnManager.isSupportsTransactions() && !txnManager.isAutoCommit()) {
            tableFinalName = DBObjectNameCaseTransformer.transformName(table.getDataSource(), targetName);
        if (nameCase != MappingNameCase.DEFAULT) {

                }
        if (containerMapping.hasNewTargetObject()) {
        }
        refreshDatabaseMappings(monitor, consumerSettings, containerMapping, false);
 *     http://www.apache.org/licenses/LICENSE-2.0
                if (containerMapping.getMappingType() == DatabaseMappingType.recreate) {
        String targetName,
            for (DatabaseMappingAttribute attr : containerMapping.getAttributeMappings(monitor)) {
            tableName = getTransformedName(dataSource, containerMapping.getTargetName(), false);
        DBSEntity table,
            String tableFinalName;
            sql.append("(\n");
                        sql.append(")\n");
                final List<DBEPersistAction> actions = new ArrayList<>();

        @Nullable Map<DBPPropertyDescriptor, Object> changedProperties,
                            DBSAttributeBase sourceAttr = attributeMapping.getSource();
                        if (typedAttr instanceof DBSTypedObjectExt3) {
        String tableFinalName;
            if (executionContext.getDataSource().getInfo().isDynamicMetadata()) {
    }

            return DBUtils.getQuotedIdentifier(dataSource, finalName);
package org.jkiss.dbeaver.tools.transfer.database;
            Pair<DBPDataKind, String> numeric = tryClassifyNumber(value);
                case existing:
            tableName = DBObjectNameCaseTransformer.transformName(dataSource, containerMapping.getTargetName());

                (containerMapping.getMappingType() == DatabaseMappingType.recreate
        return tableManager;
        throws DBException {

        @NotNull DBSObjectContainer schema,
        @NotNull DBCExecutionContext executionContext,
     * @param monitor progress monitor
                            log.debug("Can't find target attribute '" + attr.getTargetName() + "' in '" + containerMapping.getTargetName() + "'");
        }
                        }
            throw new DBException("Table name cannot be set for " + tableClass.getName());
     * Method generates array of actions for table creation for containers with correct mapping type.

        }
    private static final boolean USE_STRUCT_DDL = true;
            if (MappingReplaceMechanism.UNDERSCORES == mechanism) {
        String finalName = targetName;
                if (attr.getMappingType() != DatabaseMappingType.existing &&

     * @param monitor progress monitor
        DBExecUtils.executePersistActions(session, actions);
     */
import org.jkiss.dbeaver.model.exec.*;
            }
                        boolean typeModifiersSet = false;
import org.jkiss.dbeaver.model.edit.*;
            throw new DBException("Table manager not found for '" + tableClass.getName() + "'");
        if (value.equalsIgnoreCase("true") || value.equalsIgnoreCase("false")) {
     *
                attributeManager = editorsRegistry.getObjectManager(attrClass, SQLObjectEditor.class);
import org.jkiss.dbeaver.tools.transfer.internal.DTActivator;
                            String targetAttrType = attributeMapping.getTargetType(executionContext.getDataSource(), false);
                }
        String tableName;
                        sql.append(",\n\tPRIMARY KEY (");
        if (SQLUtils.getDialectFromDataSource(dataSource).supportsNullability()) {
                            }
                    DBSEntityAttribute newAttribute = attributeManager.createNewObject(monitor, commandContext, table, null, options);
        } else if (!skipCaseChanging && mechanism != MappingReplaceMechanism.CAMELCASE) {
    @Nullable
                DBPPropertyDescriptor property = propertySource.getProperty(entry.getKey());
                case recreate:
            ((DBPNamedObject2) targetEntity).setName(containerMapping.getTargetName());
    private static void ensureHasEditMetadataPermission(@NotNull DBPDataSourceContainer container) throws DBCException {
                monitor.subTask("Refresh database mappings");
                }
 */
     * @return array of persist actions table creation

* DatabaseTransferUtils

            txnManager.commit(session);
                    }
                }
        }
                } else {
            changedProperties = propertySource.getChangedPropertiesValues();
                Class<?>[] childTypes = ((DBEStructEditor<?>) tableManager).getChildTypes();

        Class<? extends DBSObject> tableClass = getTableClass(monitor, schema);
        }
        } else {

        // Struct doesn't work (no proper object managers?)
            if (!hasChanges) {
                        monitor,
        SQLObjectEditor tableManager = getTableManager(editorsRegistry, tableClass);
     * @param targetName name for transformation
     * @param executionContext not null execution context to get datasource etc.
                containerNode.refreshNode(monitor, containerMapping);
        if (!CommonUtils.isEmpty(changedProperties)) {
        return targetName;
        }
                DBWorkbench.getPlatformUI().showError("Can't create or update target table", null, e);
                    && containerMapping.getTarget() == null))
                }
        return Character.isDigit(c) || c == '+' || c == '-' || c == '.';
        Class<? extends DBSObject> tableClass = schema.getPrimaryChildType(monitor);
        } else {
    private static final Pair<DBPDataKind, String> DATA_TYPE_BOOLEAN = new Pair<>(DBPDataKind.BOOLEAN, "BOOLEAN");
            }
                    if (attr.getMappingType() == DatabaseMappingType.create || (attr.getMappingType().isValid() && force)) {
            log.debug("Null container mapping");
            sql.append(")");
        } catch (NumberFormatException ignore) {
                        continue;

                }
        }
                        table.getParentObject(),
                            DatabaseMappingAttribute mappedAttr = mappedAttrs.get(idAttr);
                    }
                    options,
            getTableFullName(schema, dataSource, sql, tableName);
        if (targetEntity instanceof DBPNamedObject2) {
                if (!mappedAttrs.isEmpty()) sql.append(",\n");
                    containerMapping.setMappingType(DatabaseMappingType.existing);
     * @param dataSource for preferences and dialect info
        DBSObjectContainer container = consumerSettings.getContainer();


            }
    private static boolean isNumericStart(char c) {
        DBECommandContext commandContext = new TargetCommandContext(executionContext);
                                typedAttr.setMaxLength(sourceAttr.getMaxLength());

    public static void refreshDatabaseMappings(@NotNull DBRProgressMonitor monitor, @NotNull DatabaseConsumerSettings consumerSettings, @Nullable DatabaseMappingContainer containerMapping, boolean force) throws DBException {
    }
            Map<String, Object> options = new HashMap<>();
            tableManager.deleteObject(commandContext, containerMapping.getTarget(), options);

                        DBSTypedObjectExt2 typedAttr = (DBSTypedObjectExt2) newAttribute;
        appendAttributeClause(dataSource, sql, attribute);
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
import org.jkiss.dbeaver.model.struct.rdb.DBSCatalog;

                    throw new DBCException("New table " + containerMapping.getTargetName() + " not found in container " + DBUtils.getObjectFullName(container, DBPEvaluationContext.UI));
        }
        DBSObject targetEntity = tableManager.createNewObject(monitor, commandContext, schema, null, options);
/**
        @NotNull DBRProgressMonitor monitor,
        }
     * @param skipCaseChanging true if we do not want to change name case of the original name
    {
                    }
                }
                        if (attr.getTarget() == null) {

            // But this map has only the id of ObjectPropertyDescriptor
 * Copyright (C) 2010-2025 DBeaver Corp and others
            }
 * Unless required by applicable law or agreed to in writing, software
