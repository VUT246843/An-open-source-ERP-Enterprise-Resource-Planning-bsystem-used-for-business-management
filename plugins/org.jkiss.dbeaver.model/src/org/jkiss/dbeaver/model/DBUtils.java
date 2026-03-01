    @NotNull
    public static boolean isQuotedIdentifier(@NotNull DBPDataSource dataSource, @NotNull String str) {
    @SuppressWarnings("unchecked")
    }
            if (cell1 instanceof Number) {
        @NotNull Class<? extends CHILD> type,
    public static String getObjectFullName(@NotNull DBPNamedObject object, DBPEvaluationContext context) {
    @Nullable
            return null;
        if (vEntity != null) {
        } else if (parent instanceof DBPDataSourceContainer) {
        if (context == null) {
    @Nullable
                        limitTransformer = transformProvider.createQueryTransformer(DBCQueryTransformType.RESULT_SET_LIMIT);
     */
        if (container != null) {
                        Object countValue = null;
            if (dbStatement.executeStatement()) {
            if (!CommonUtils.isEmpty(customAttributes)) {
    @NotNull
        } else if (cell1 instanceof Comparable cmp1 && cell1.getClass() == cell2.getClass()) {
        return dbStat;
                            return pa;
    public static DBPDataSourceRegistry getObjectRegistry(@NotNull DBSObject object) {
    }
    }
        final DBPDataSourceContainer container = getContainer(object);

                DBCExecutionPurpose.USER,
        if (parent == null) {

            }
                if (children != null) {
        Object curValue = row[index];
    @Deprecated
     * <pre>{@code
import org.jkiss.dbeaver.utils.GeneralUtils;
                if (num1 instanceof Number) {
    }
            if (dataSourceContainer != null) {
    /**
        final DBSEntity refEntity = association.getAssociatedEntity();
            if (valueHandler != null) {
                    return -1;
                                }
            return object;
                        dataSource,
     * Fire event that the object was selected or unselected
        boolean retrieveDeepestCollectionElement
    public static <T extends DBPNamedObject> void orderObjects(@NotNull List<T> objects) {
     * @param container  data source container
                if (hasLimits) {
                }
        final DBSObjectContainer objectContainer = getAdapter(DBSObjectContainer.class, executionContext.getDataSource());
                monitor,

        }
    @Nullable
    /**
                }
                return valueHandler;

    public static DBSObject getActiveInstanceObject(@NotNull DBCExecutionContext executionContext) {
                continue;
        @NotNull DBCSession session,
                        return index;
            if (namePart == null) {
        if (dataSource instanceof DBPDataTypeProvider dtp) {
     * @param rootSC           container
        if (value instanceof DBDValue dbdv) {
        }
        if (defaultContext == null) {
                            throw new InvocationTargetException(e);
                return null;
            boolean hasPrimaryKey = false;
            return "Entity";
            DBServiceConnections serviceConnections = DBWorkbench.getService(DBServiceConnections.class);
                    if (trigger != null) {
            }
     * Finds object by its name (case insensitive)
        if (object instanceof DBDAttributeBinding binding) {
    }
        // Get handler provider from datasource
    @NotNull
            if (dataSource instanceof DBSObjectContainer) {
        if (sc != null) {
        @NotNull DBRProgressMonitor monitor,
        return true;
    public static Comparator<? super DBPObjectWithOrdinalPosition> orderComparator() {
        throws DBException {
     */
            }
        }

    /**
    public static int compareDataValues(@Nullable Object cell1, @Nullable Object cell2) {
    public static boolean initDataSource(
        dbStat.setStatementSource(executionSource);
     */

     * @param objectName object name
     */

                                    break;
     */
    public static List<String> convertArrayStringToList(@NotNull String value) {
     * Assumes that columns in both constraints are in the same order.
            return new DBSObject[0];
        @NotNull DBPNamedObject object,

            }
        boolean filterAttributes
        for (DBSObjectType ot : objectTypes) {
    public interface ChildExtractor<PARENT, CHILD> {
            }
    public static DBDAttributeBinding findBinding(@NotNull Collection<DBDAttributeBinding> bindings, @NotNull DBSAttributeBase attribute) {
        @NotNull DBRProgressMonitor monitor,
        DBCExecutionContext defaultContext = getOrOpenDefaultContext(object, true);
                onFinish.onTaskFinished(Status.OK_STATUS);
    }
                return DBVUtils.executeExpression(((DBDAttributeBindingCustom) attribute).getEntityAttribute(), allAttributes, row);
                } catch (DBException e) {
                : object.getName();
        return path;
            obj = getPublicObjectContainer(obj);
        }
        }
                valueHandler = handlerProvider.getValueHandler(dataSource, preferences, column);

    }
            } else if (cell2 instanceof Number) {
        }
        }
    public static boolean isAtomicParameter(Object o) {
    }
            if ((mods[i] = mods[i].trim()).isEmpty()) {
                Object num1 = GeneralUtils.convertString(String.valueOf(cell1), cell2.getClass());
        }
                        return refIterator.next().getAttribute();
        }
                if (num2 instanceof Number) {
    @NotNull
                queryText = fetchAllTransformer.transformQueryString(sqlQuery);
     * @return full name of the object
            final Iterator<? extends DBSEntityAttributeRef> refIterator = refAttrs.iterator();
        return null;
            statementType = DBCStatementType.EXEC;
    public static DBSEntity getEntityFromMetaData(
                } else if (id instanceof DBSTableIndex tableIndex && tableIndex.isUnique()) {
        DBSEntity entity = attribute.getParentObject();
            while (curValue instanceof DBDCollection collection) {
        } catch (Exception e) {
                }
    @NotNull
                entity = getEntityFromMetaData(monitor, executionContext, objectContainer, entityMeta, true);
import org.jkiss.dbeaver.model.sql.SQLQuery;
        }
        @Nullable DBCExecutionContext executionContext,
        int remainingAttributes = depth;
        // or some DML. For DML statements we mustn't set limits
            } catch (DBException e) {
            return false;
        // because it sets update rows limit [SQL Server]
        if (value instanceof DBDContent dbdc) {
            event.setOptions(options);
        return null;
    @NotNull
                    remainingIndices -= 1;
            return owt.getObjectType().getTypeName();
        long[] result = new long[1];
    public static DBSObject[] getSelectedObjects(@Nullable DBCExecutionContext context) {
        DBPDataSourceContainer container;
            if (!Character.isWhitespace(name.charAt(i))) {
        }

                }
                }
            }

    }
    @Nullable
                for (DBSTableIndex index : indexes) {
        if (object instanceof DBSObjectWithType owt) {
            DBPEvent event = new DBPEvent(DBPEvent.Action.OBJECT_UPDATE, object, data);

     * Fire event to unselecting the oldDefaultObject and selecting the newDefaultObject
        }

    @Nullable

            if (namePart == null) {
                }
    }
            log.debug(e);
        DBPDataSource dataSource = object.getDataSource();
     *
                    Collection<? extends DBSEntityAttribute> attributes = realEntity.getAttributes(monitor);
                        !CommonUtils.equalObjects(schemaName, selectedObject.getName())
        @NotNull DBCResultSetMetaData metaData
            if (!DBStructUtils.isConnectedContainer(sc)) {
    }
            }
    }
                return name;
    }
            }
            }
            if (curValue == null) {
        long maxRows)
    /**
                    for (DBPObject object : context.getEditedObjects()) {
        @Nullable DBCExecutionSource executionSource,

                } else {
    public static String getUnQuotedIdentifier(@NotNull String str, @NotNull String[][] quoteStrings) {
    @NotNull
            }
                // Probably on this step we found a catalog, but not a schema.
            return adaptable.getAdapter(adapterType);
            return Collections.emptyList();
        }
            }
                return defaultSchema;

        }
                Collection<? extends DBSTableIndex> indices = table.getIndexes(monitor);
        if (!CommonUtils.isEmpty(constraints)) {
        } else {
        }
                : Collections.<DBSTableColumn>emptyList();
            final String name = Objects.requireNonNull(DBObjectNameCaseTransformer.transformName(parent.getDataSource(), NLS.bind(template, suffix)));
        @NotNull DBCExecutionContextDefaults<?,?> contextDefaults,
    }
                return dataType.getSupportedOperators(attribute);

        long offset,
        @Nullable DBRProgressListener onFinish
        if (constraint.getConstraintType().isUnique()) {
        return parts[parts.length - 1];
                                if (ma.getName().toLowerCase(Locale.ENGLISH).contains("count")) {
                }
     * @param context execution context contains info about default table containers
            // We have both both - just search both
            if (dataType != null) {
            }
        @Nullable DBSObject newDefaultObject,
    @Nullable
                    return false;
                    ) {
        while (st.hasMoreTokens()) {
            List<DBDAttributeBinding> nestedBindings = binding.getNestedBindings();
    @Nullable
        }
    @Nullable

                DBDPseudoAttribute[] pseudoAttributes = pac.getPseudoAttributes();
                }
            }
        }

        }
                }
        if (name == null || name.isEmpty()) {

        return new DBDAttributeBindingMeta(dataContainer, session, attributeMeta);
            }
        if (SQLUtils.isExecQuery(dialect, query)) {
        return switch (object) {
            try {
            return new DBSObject[]{defaultCatalog};
                    throw new DBCException("Out of indexes for collections");
        if (objectContainer instanceof DBPDataTypeProvider dtp) {
     * @param purpose    if null, purpose will not be included
            }
        return false;
                if (constraint instanceof DBSEntityReferrer referrer && referrerMatches(monitor, referrer, attributes)) {
            return cba.formatMemberReference(false, null, DBPAttributeReferencePurpose.UNSPECIFIED);

     * @param objectName object name
                    return object;
    /**
    }
        return makeStatement(
            DBSObject sc = rootSC.getChild(monitor, containerName);
            String token = st.nextToken().trim();
    @NotNull
        return null;
        }
            if (limitTransformer == null) {
                return null;
        if (entity instanceof DBDPseudoAttributeContainer pac) {
        if (object instanceof DBPDataSourceContainer dsc) {
    public static DBSDataType findBestDataType(@NotNull Collection<? extends DBSDataType> allTypes, @NotNull String... typeNames) {

        if (object instanceof DBPDataSource ds) {
     * @param object to get identifier of

                    DBDPseudoAttributeType.ROWID);
        }
        } else if (object instanceof DBSEntity) {
                return null;
     * @param container data source container

                                countValue = singleValue;

    @Nullable
                    }
            for (DBSEntityAttributeRef constraintColumn : columns) {
                    return false;
            return ds.getContainer();
    @SuppressWarnings("unchecked")
    public static String getFullyQualifiedName(@NotNull DBPDataSource dataSource, @NotNull String... names) {
    @NotNull
        if (columns != null) {
            throw new DBException("Type '" + type + "' has malformed modifiers");
        }
            if (hasLimits && limitTransformer != null) {
                    DBSDataContainer.FLAG_NONE);
     * @return object or null
                DBUtils.fireObjectSelect(oldDefaultObject, false, context);
            if (monitor.isCanceled()) {
        for (DBSTableIndexColumn col : attrs) {
        if (CommonUtils.isEmpty(entity.getAttributes(monitor))) {
        if (filterAttributes && dataContainer instanceof DBDAttributeFilter attributeFilter) {
            case DBSWrapper dbsWrapper -> dbsWrapper.getObject();
                    if (isIdentifierConstraint(monitor, constraint)) {
    }
            }
    }
        }
        if (limitTransformer instanceof DBCQueryTransformerExt lQT && !lQT.isApplicableTo(sqlQuery)) {

        final DBPDataSourceContainer container = getContainer(object);
                List<? extends DBSTrigger> triggers = table.getTriggers(monitor);
        // Use default handler
            }
                            }
    @NotNull
            && !DBWorkbench.getPlatform().getApplication().isHeadlessMode()))) {
        DBPDataSource dataSource = dataSourceContainer.getDataSource();
            DBSCatalog defaultCatalog = contextDefaults.getDefaultCatalog();
 * You may obtain a copy of the License at
    }
        if (ArrayUtils.isEmpty(quoteStrings)) {
        return name.toString();
        }
                        customAttributes.get(i),
        return findValueHandler(dataSource, dataSource.getContainer(), column);
            if (!CommonUtils.isEmpty(indexes)) {
    public static boolean isPseudoAttribute(DBSAttributeBase attr) {
        return o == null || o instanceof CharSequence || o instanceof Number || o instanceof java.util.Date || o instanceof Boolean;
        @NotNull String fullTypeName)
    public static String getUnQuotedIdentifier(@NotNull DBPDataSource dataSource, @NotNull String str) {
                        identifiers.add(constraint);
    public static boolean isView(@NotNull DBSEntity table) {

        } else if (fetchAllTransformer != null) {
                    return object;
        }

    ) throws DBException, InterruptedException {
        @Nullable DBCExecutionContext context,
            log.error("Error when closing object '" + object + "'", e);
        }
                    DBSObject child = catalog.getChild(monitor, schemaName);
            throw new DBException("Type name is missing");
    public static boolean referrerMatches(@NotNull DBRProgressMonitor monitor, @NotNull DBSEntityReferrer referrer, @NotNull Collection<? extends DBSEntityAttribute> attributes) throws DBException {
                if (!CommonUtils.isEmpty(containers)) {
    public static DBCStatement makeStatement(
        boolean quoteAlways
     * Update execution context default schema and catalog
        } else if (dataKind == DBPDataKind.NUMERIC || dataKind == DBPDataKind.DATETIME || dataKind == DBPDataKind.STRING) {
        }
                            if (singleValue instanceof Number) {
    public static boolean isRowIdAttribute(DBSEntityAttribute attr) {
        DBPDataTypeProvider dataTypeProvider = getAdapter(DBPDataTypeProvider.class, dataSource);
                    for (DBSEntityAttribute attr : ownAttrs) {
                }
 * DBUtils
            if (attribute != null) {
                break;
import org.jkiss.dbeaver.model.sql.SQLDialect;
        } catch (Exception e) {
        fireObjectSelect(object, true, null);
     * Checks that object has valid object name.
                catalogName = null;
            }
     * optionally version and current connection purpose
    public static DBCStatement makeStatement(
            if (p instanceof DBSInstance) {
    /**
        } else if (parent instanceof DBNDatabaseFolder) {
                }
 * you may not use this file except in compliance with the License.
            Class<? extends DBSObject> childType = rootSC.getPrimaryChildType(monitor);
            log.debug("Bad attribute '" + attribute.getName() + "' index: " + index + " is out of row values' bounds (" + row.length + ")");
                if (triggers != null) {
        if (object instanceof DBSContextBoundAttribute cba) {
    public static <T> T getAdapter(@NotNull Class<T> adapterType, @Nullable Object object) {
                        }
                if (!name.isEmpty()) {
        }
                ? getQuotedIdentifier(dbo.getDataSource(), object.getName())

        DBSObjectContainer root,
            ((object instanceof DBSTablePartition part) && part.needFullPath() && part.isSubPartition()) ? part.getPartitionParent() :
    @Nullable
import org.jkiss.dbeaver.DBException;
        @NotNull DBRProgressMonitor monitor,
        for (int i = 0; i < name.length(); i++) {
            operators.add(DBCLogicalOperator.GREATER);
            }
     *
        if (typedObject instanceof DBSDataType dt) {
                      + "' has bad top-level parent: '" + attribute.getTopParent().getName() + "'");
        DBPDataSource dataSource = structObject == null ? null : structObject.getDataSource();
                        return index;
    public static String getQuotedIdentifier(@NotNull DBPNamedObject object) {
                break;
                if (!name.isEmpty()) {
        }
    }
                        }
     *
        for (DBDAttributeBinding binding : bindings) {
            return dt;
    public static <T extends DBSTypedObject> T getMoreCommonType(@NotNull T t1, @NotNull T t2) {
                    result.addAll(containers);
        @Nullable Object elementValue
        }
    public static Object getAttributeValue(
                log.warn("Can't get pseudo attributes for '" + entity.getName() + "'", e);
        if (refs != null && !refs.isEmpty() && attributes.size() == refs.size()) {

        @NotNull SQLQuery query
        boolean scrollable) throws DBCException {
        }
        @NotNull String str,
        for (DBSObject obj : path) {

        List<? extends DBSTableIndexColumn> attrs = index.getAttributeReferences(monitor);
     * @return pair of extracted type name and array of modifiers
                    ((hasPrimaryKey && constraint.getConstraintType() == DBSEntityConstraintType.PRIMARY_KEY) ||
        Collection<? extends DBSEntityConstraint> constraints = entity.getConstraints(monitor);
            } catch (DBException e) {
            return str.substring(quote1.length(), str.length() - quote2.length());

     * @param name object name
        if (executionContext != null && executionContext.isConnected()) {
            );
        long offset,
                return binding;
                long rowCount = dataContainer.countData(
        final DBPDataSource dataSource = objectContainer.getDataSource();
                    return dataType;
        }
        SQLDialect dialect = SQLUtils.getDialectFromObject(session.getDataSource());
        }
                + "' has bad top-level parent: '" + attribute.getTopParent().getName() + "'");
            }
     */
                        CommonUtils.isEmpty(catalogName) &&
            if (onFinish != null) {
                    return constraintColumn;
                context = DBUtils.getDefaultContext(object, meta);
            }
            return getQuotedIdentifier(dataSource, object.getName());
        } else if (entityObject instanceof DBSEntity entity) {
        }
        return valueHandler.getValueFromObject(session, type, null, false, false);
    /**
            return CommonUtils.compareNumbers((Number) cell1, (Number) cell2);
                try {
        @NotNull DBPAttributeReferencePurpose purpose) {
            if (nestedBindings != null) {
        try (DBCStatement dbStatement = makeStatement(source, session, DBCStatementType.SCRIPT, query, 0, 0)) {
        return false;
    ) throws DBException {
        }
                    }
        }
            return dtp.getDefaultDataTypeName(dataKind);
                }
            return getQuotedIdentifier(object.getDataSource(), object.getName());
                // This is datasource or database probably
            }
        @NotNull DBPDataSource dataSource,
        } else {

            }
        int remainingIndices = nestedIndexes != null ? nestedIndexes.length : 0;
        }

    @Nullable
        }
        if (CommonUtils.isEmpty(typeName)) {
        return name.toString();
                if (subBinding != null) {
    ) throws DBException {
                for (DBSTableIndex index : indexes) {

                List<DBSDataContainer> containers = getAllDataContainersFromParentContainer(monitor, dbsObject);
                    // Do not use schema name in FQ name
        return object instanceof DBPSystemObject so && so.isSystem();
            return getQuotedIdentifier(object.getDataSource(), object.getName());
        return purpose == null ? productTitle : productTitle + " - " + purpose;

                    }
                // This is schema or catalog with tables
                    if (index != null) {
            log.debug("Top-level attribute '" + attribute.getName()
            offset,

        if (dataKind == DBPDataKind.STRING) {
        final String name = (type.substring(0, modStartIndex) + type.substring(modEndIndex + 1)).trim();
            return null;
            }
                    } else if (selectedObject instanceof DBSObjectContainer objectContainer) {
            return null;
                }

                if (object.getName().equals(objectName)) {
                            log.warn("Catalog name should be at the start of full-qualified name!");

                        if (CommonUtils.isEmpty(attrId)) {
                        if (countValue instanceof Number number) {
                DBDAttributeBinding parent = Objects.requireNonNull(attribute.getParent(remainingAttributes));
        return session.prepareStatement(
                } catch (DBException e) {
     * @param parent  Parent object: schema, catalog, datasource, DBNDatabaseFolder, even table
        if (!dataSource.isConnected()) {
        @Nullable DBRProgressMonitor monitor,
                limitTransformer.setParameters(offset, maxRows);
            statementType = DBCStatementType.EXEC;
        }
        }
        if (!dataSourceContainer.isConnected()) {
                    }, "Initiate instance connection",
    public static DBCExecutionContext getOrOpenDefaultContext(DBSObject object, boolean meta) throws DBCException {
            }

                }
    }

            name.append(namePart);

        }
    }
    }
     *
            }
 *
                    throw new DBCException("Error extracting nested value", e);
        }
        @NotNull DBRProgressMonitor monitor,
            Class<? extends DBSObject> typeClass = ot.getTypeClass();
            return null;
        } else {
                }
    @Nullable
    public static String getFullTypeName(@NotNull DBSTypedObject typedObject) {
        @NotNull DBSEntityAttribute tableColumn,
import org.jkiss.dbeaver.model.navigator.DBNDatabaseFolder;

            || (instance.getDataSource() != null && (instance.getDataSource().isConnectionRefreshing()
     * Get object name in quotes if they are needed.
    }
    }
     * Return reference column of referrer association (FK).
            }
            if (finalEntity instanceof DBSTable table) {
import org.jkiss.dbeaver.model.impl.data.DefaultValueHandler;
                return false;
        try {
                    // Set explicit limit - it is safe because we pretty sure that this is a plain SELECT query
    public static <T extends DBCSession> T openMetaSession(@NotNull DBRProgressMonitor monitor, @NotNull DBSObject object, @NotNull String task) throws DBCException {
                    result.addAll(containers);
        if (dataTypeProvider == null) {
        for (DBSObject p = object; p != null; p = p.getParentObject()) {
        if (modStartIndex < 0 ^ modEndIndex < 0) {
                log.debug("Child object '" + objectName + "' not found in container " + DBUtils.getObjectFullName(sc, DBPEvaluationContext.UI));

    ) throws DBCException {

     * @return array of the default table containers. First - default catalog, second - default schema. If they exist.
            }
    public static DBDPseudoAttribute getPseudoAttribute(DBSEntity entity, String attrName) {
            for (DBSEntityConstraint constraint : constraints) {
            maxRows);
                    throw new DBCException("Timeout while opening database connection");
                    if (ownAttr instanceof DBSTableForeignKeyColumn fkc && fkc.getReferencedColumn() == tableColumn) {
        @NotNull String template,
            return null;
    public static <T extends DBPNamedObject> T findObject(@Nullable Collection<T> theList, String objectName, boolean caseInsensitive) {
    @NotNull
                if (isShouldSetLimit) {
        return value instanceof DBDValueError;
    public static DBCLogicalOperator[] getAttributeOperators(DBSTypedObject attribute) {
                            identifiers.add(index);
            return false;
        @Nullable DBCExecutionContext context
        @NotNull DBCExecutionSource source,
        if (dataSource == null) {
     * @return full name of the object
            return theClass.cast(selectedObject);
        return adapter == object ? null : adapter;
        String queryText;

                DBDAttributeBinding subBinding = findBinding(nestedBindings, attribute);
            return uniqueId instanceof DBSEntityReferrer referrer ?
        }
            name.append(DBUtils.getQuotedIdentifier(dataSource, namePart));
    public static String getSimpleQualifiedName(@NotNull Object... names) {
                }
        }
                }

                // Non-referrer constraint. It must identify rows somehow else. We don't care actually.
    /**
        String objectName = names[names.length - 1];


            return "<" + ModelMessages.dbutils_type_name_unknown + ">";
                DBSObject selectedObject = getSelectedObject(executionContext);
        return rowIdAttribute != null && rowIdAttribute.getName().equals(attr.getName());
        if (depth == 0 && attribute != attribute.getTopParent()) {
        if (handlerProvider != null) {
        } else {
            catalogName = DBObjectNameCaseTransformer.transformName(dataSource, catalogName);
            // So try to get adapter from real datasource object
            Collection<? extends DBSTableIndex> indexes = ((DBSTable) entity).getIndexes(monitor);
    public static void fireObjectUpdate(DBSObject object, @Nullable Object data) {
    @Nullable

        if (object instanceof DBPDataSourceContainer dsc) {
    }
            if (forceLoad || (project.isOpen() && project.isRegistryLoaded())) {
            // Not connected - try to connect
    public static DBDValueHandler findValueHandler(@Nullable DBPDataSource dataSource, @Nullable DBDFormatSettings preferences, @NotNull DBSTypedObject column) {

            }
                            result.add((DBSDataContainer) child);
    }
        return null;
     * Find object (case-sensitive)
                        try {
        @NotNull DBSEntity entity
                name.append('.');
            schemaName = DBObjectNameCaseTransformer.transformName(dataSource, schemaName);

    public static <TYPE extends DBPNamedObject> Comparator<TYPE> nameComparator() {
                }
                ownerValue = curValue;
        @NotNull DBPDataSourceContainer container,
            // It is not SQL identifier, let's just make it simple then
                if (namePart instanceof DBSCatalog && ((sqlDialect.getCatalogUsage() & SQLDialect.USAGE_DML) == 0)) {
        return operators.toArray(new DBCLogicalOperator[0]);
        DBCQueryTransformer limitTransformer = null, fetchAllTransformer = null;
                }
            if (newDefaultObject != null) {
        DBSObject activeObject = defaultContext == null ? null : getActiveInstanceObject(defaultContext);
        // Check that transformers are applicable
                if (constraint.getConstraintType() == DBSEntityConstraintType.PRIMARY_KEY) {
                remainingAttributes -= 1;
            return object.getName();
                    dbStat.setLimit(offset, maxRows);
        } else if (object instanceof DBPQualifiedObject qo) {

    }
    }
    public static Pair<String, String[]> getTypeModifiers(@NotNull String type) throws DBException {
    }
        }
        Collection<? extends DBSEntityAssociation> associations = includeVirtual ? DBVUtils.getAllAssociations(monitor, entity) : entity.getAssociations(monitor);
        // Normalize query

    }
    public static boolean isDynamicAttribute(DBSAttributeBase attr) {
        }
        }
                if (num2 == null) {
                // Not found - try to find in selected object
import org.jkiss.dbeaver.model.exec.*;
            obj = getPublicObjectContainer(obj);
    ) {
     */
        DBSInstance instance = getObjectOwnerInstance(object);
        // Select with true parameter is the same as refresh
        if (!CommonUtils.isEmpty(catalogName) && !CommonUtils.isEmpty(schemaName)) {

        }
            }
                }
                Object num2 = GeneralUtils.convertString(String.valueOf(cell2), cell1.getClass());
                for (DBSEntityConstraint constraint : uniqueKeys) {
                            included = false;
    @NotNull
        @Nullable String schemaName,
    public static String getObjectTypeName(@NotNull DBSObject object) {
        // Create intermediate values if needed
                }
            return "Schema";
                return new DBDValueError(e);
import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;
        if (contextDefaults != null) {
    }
        return attr instanceof DBSAttributeDynamic da && da.isDynamicAttribute();
    @SuppressWarnings("unchecked")
    }

        }

                    throw new DBCException("Item index out of range " + itemIndex + ">=" + collection.getItemCount());
                if (transformProvider instanceof DBCQueryTransformProviderExt qtp) {
            queryText = sqlQuery.getText();
                        }
    }
                } else if (id.getConstraintType().isUnique()) {
                        if (!constraint.getDataSource().getInfo().supportsNullableUniqueConstraints()) {
        @NotNull PARENT parent,

        }
        return object instanceof DBPInheritedObject io && io.isInherited();
     * @param context    evaluation context
        for (DBDAttributeBinding binding : bindings) {

                            instanceLazy.checkInstanceConnection(monitor);
        @NotNull DBRProgressMonitor monitor,
    public static DBPDataSourceContainer findDataSource(@Nullable String projectName, @NotNull String dataSourceId) {
        if (dataSource == null) {
        }

    private static final Log log = Log.getLog(DBUtils.class);
            return object.getDataSource();
            DBCQueryTransformProvider transformProvider = DBUtils.getAdapter(DBCQueryTransformProvider.class, session.getDataSource());
        return (T) defaultContext.openSession(monitor, DBCExecutionPurpose.META, task);
                    log.debug("Child object '" + name + "' is not a container or entity");
        if (attribute instanceof DBSAttributeBase && !((DBSAttributeBase) attribute).isRequired()) {
    @NotNull
                DBDAttributeBinding[] customBindings = new DBDAttributeBinding[customAttributes.size()];
            Collection<DBSObject> dbsObjects = ((DBNDatabaseFolder) parent).getChildrenObjects(monitor);
            return result;
            return -1;

        if ((object instanceof DBSTablePartition part) && part.needFullPath()) {
    public static DBCStatement makeStatement(
        if (entityObject instanceof DBSAlias alias && !(entityObject instanceof DBSEntity)) {
                project.ensureOpen();
                List<DBSDataContainer> containers = getAllDataContainersFromParentContainer(monitor, dataSource);
        // Parent of leaf value is the owner value
        }
import org.jkiss.dbeaver.model.app.DBPWorkspace;
        return object instanceof DBPVirtualObject vo && vo.isVirtual();
            // NoSuchElementException data type provider
            }
            for (DBSObject dbsObject : dbsObjects) {
            DBSObject object = sc.getChild(monitor, objectName);
            case DBDComposite composite -> composite.setAttributeValue(attribute, elementValue);
            if (!name.isEmpty()) name.append(dialect.getStructSeparator());
        T adapter = getAdapter(i, parent);
                bindings = combinedAttrs;
            return attributeFilter.filterAttributeBindings(bindings);
                }
        objects.sort(Comparator.comparing(DBPNamedObject::getName));
    ) {
        }
            if (typeClass != null && typeClass != DBSObject.class && typeClass.isInstance(object)) {
                    curValue = parent.extractNestedValue(curValue, 0);
        boolean addVersion
     */
            String containerName = !CommonUtils.isEmpty(catalogName) ? catalogName : schemaName;
    }
            } else {
                return curValue;
     * Sometimes it is all info that we know about datasource - default catalog or default schema. This method returns an array of them.
        @NotNull DBPDataSource dataSource,
        @NotNull DBRProgressMonitor monitor,
            return getAdapter(DBCTransactionManager.class, executionContext);
import org.jkiss.dbeaver.model.impl.data.DBDValueError;
            List<DBDAttributeBinding> nestedBindings = binding.getNestedBindings();
            if (nestedBindings != null) {
     */
    public static DBSObject getPublicObject(@Nullable DBSObject object) {
    }
        return null;
                if (remainingIndices <= 0) {

     *
        @NotNull DBRProgressMonitor monitor,
        final int depth = attribute.getLevel();
    @Nullable
            if (defaultCatalog != null) {
            query,
    @NotNull
                }
        for (DBSObject object = child; object != null; object = object.getParentObject()) {
/**
    public static void closeSafely(@NotNull AutoCloseable object) {
                    continue;
    }
            entityName = DBObjectNameCaseTransformer.transformName(dataSource, entityName);
            return dsc;
        return dataSource.getDefaultInstance();
import org.jkiss.dbeaver.model.impl.sql.BasicSQLDialect;
import org.jkiss.dbeaver.runtime.DBServiceConnections;

                if (!CommonUtils.isEmpty(indexes)) {
    public static <T extends DBPNamedObject> T findObject(@Nullable T[] theList, String objectName) {
                    pac.getPseudoAttributes(),
            qo.getFullyQualifiedName(DBPEvaluationContext.DDL) : DBUtils.getQuotedIdentifier(object);
     */

            if (!(schema instanceof DBSObjectContainer schemaOC)) {
            return ((DBDValue) value).getRawValue();
    public static DBDAttributeBinding findBinding(@NotNull DBDAttributeBinding[] bindings, @Nullable DBSAttributeBase attribute) {
        for (DBSEntityAttributeRef ref : CommonUtils.safeCollection(eref.getAttributeReferences(monitor))) {
                            for (int i = 0; i < resultAttrs.size(); i++) {
        }
            }
                        return trigger;
        @NotNull DBCAttributeMetaData attributeMeta
        if (objectContainer != null) {
        return injectAndFilterAttributeBindings(session.getDataSource(), dataContainer, bindings, false);
        int columnsCount = metaAttributes.size();
    ) {
                    if (col.getAttribute() == null || !col.getAttribute().isRequired()) {
                            // Do not use constraints with NULL columns (because they are not actually unique: #424)
    public static <PARENT extends DBSObject, CHILD extends DBSObject> String makeNewObjectName(
        }

        fireObjectUpdate(object, null, data);
                dataSourceContainer.connect(monitor, true, true);
        }
        return result;
                }
        if (dataSourceContainer == null) {
            if (!pathStr.isEmpty()) {
     * @param context   execution context
            for (T object : theList) {
        return false;
            // Try to use selected object
                    if (session.getDataSource().getContainer().getPreferenceStore().getBoolean(ModelPreferences.RESULT_SET_MAX_ROWS_USE_SQL) ||
        return (T) dataSource.getDefaultInstance().getDefaultContext(monitor, true).openSession(monitor, DBCExecutionPurpose.META, task);
    @NotNull
        @NotNull SQLQuery sqlQuery,
        @NotNull String query,
            //operators.add(DBCLogicalOperator.GREATER_EQUALS);
        } else {
                        if (partition != null) {
                    break;
                        (!hasPrimaryKey && constraint.getConstraintType().isUnique()))) {
                int itemIndex = nestedIndexes[nestedIndexes.length - remainingIndices];
                        }
        }
    public static void fireObjectUpdate(@NotNull DBSObject object) {
                }
    @Nullable
 * distributed under the License is distributed on an "AS IS" BASIS,
            // Table container not found
        return new Pair<>(name, mods);
     * Identifying association is an association which associated entity's attributes are included into owner entity primary key. I.e. they
        @Nullable DBSDataContainer dataContainer,
                return true;
    /**
    }
    }
            return new DBSObject[]{defaultCatalog, defaultSchema};
    @Nullable
        if (association instanceof DBSEntityReferrer eRef && refConstr instanceof DBSEntityReferrer rRef) {
        @Nullable String objectName)
        @NotNull DBRProgressMonitor monitor,
    }


        DBPProject project = null;
        } else if (isNullValue(cell2)) {

        @NotNull DBPDataSource dataSource,
            return str1.compareTo(str2);
        }
    public static DBSInstance getObjectOwnerInstance(DBSObject object) {
                    fetchAllTransformer = transformProvider.createQueryTransformer(DBCQueryTransformType.FETCH_ALL_TABLE);
     */
            query = dialect.formatStoredProcedureCall(session.getDataSource(), query);
    ) throws DBException {
                return ot.getTypeName();
        final String mod = type.substring(modStartIndex + 1, modEndIndex).trim();

        } else {
                boolean exists = extractor.extract(parent, monitor, name) != null;
                throw new DBException("Type has empty modifiers");
        if (childType == DBSCatalog.class && contextDefaults.supportsCatalogChange()) {
            return null;
            }
        for (String namePart : names) {
                    return refIterator.next().getAttribute();
                    dataFilter,
            } catch (DBException e) {
        }
     * Note: this function searches only inside DBSObjectContainer objects.
    }
    }
    /**
                if (remainingAttributes == 0) {
    public static boolean isInheritedObject(Object object) {
     * Get the full name of the object.
            dbdv.release();
        } else if (defaultCatalog != null) {
    @NotNull
                break;
            }
                    return attributes == null ? Collections.emptyList() : new ArrayList<>(attributes);
    }
        @NotNull DBDAttributeBinding[] bindings,
                curValue = collection.get(itemIndex);
            // Find PK or unique key
    public static <T extends DBCSession> T openUtilSession(@NotNull DBRProgressMonitor monitor, @NotNull DBSObject object, @NotNull String task) throws DBCException {
        }
    }
                    return name;

        final DBSEntity ownerEntity = association.getParentObject();
        } else {
    public static boolean isValidObjectName(@Nullable String name) {
    @Nullable
    /**
                        (transformProvider instanceof DBCQueryTransformProviderExt qtp && qtp.isForceTransform(session, sqlQuery))) {
        }
import java.util.*;
            // For a parent table
            if (curValue == null) {
    ) throws DBException {
                    return false;
        }
            }
    public static DBSObject getDefaultOrActiveObject(@NotNull DBSInstance object) {
    }
     * Find data source in all available registries.
        } else {

                if (!CommonUtils.isEmpty(children)) {
    }
            suffix += 1;
                DBSObject child = sc.getChild(monitor, name);
                        if (countValue instanceof Map<?, ?> map && map.size() == 1) {
            for (DBSEntityConstraint constraint : constraints) {
                    ownerValue = curValue;
                        }
        @NotNull DBPDataSource dataSource,
            case DBSObject dbsObject -> dbsObject;
        }
                if (object.getName().equalsIgnoreCase(objectName)) {
        }
        @NotNull DBRProgressMonitor monitor,
    }
        return null;
        if (attribute.isCustom()) {
        if (object == null) {

        @NotNull DBSAttributeBase attribute
        if (dataSource == null || dataSource.isConnectionRefreshing()) {
            if (tableIndex.isUnique() && indexAttributes.equals(attributes)) {
        }
    }
    }
                if (!attrIterator.hasNext()) {
            return null;
            return contextDefaults.getDefaultCatalog();

        if (!(association instanceof DBSEntityReferrer referrer)) {
        throws DBException {
     * @return found object or null
    }
    public static boolean isReadOnly(@Nullable DBSObject object) {
    }
    public static boolean isErrorValue(@Nullable Object value) {
                throw new DBException("Error connecting to datasource '" + dataSourceContainer.getName() + "'", e);
            if (DBSSchema.class.isAssignableFrom(childType) || DBSEntity.class.isAssignableFrom(childType)) {
    }
        @NotNull DBCEntityMetaData entityMeta,
    @Nullable
        // We need at least one symbol that is not whitespace
    /**
    @NotNull
        final DBPDataSourceContainer container = getContainer(object);
        }
            // Actual data type for the same column may differ (e.g. partially read from server, partially added on client side)
            false,
    @NotNull

    }
                    }
                return true;
        @NotNull DBPNamedObject object,
                if (attrs == null || attrs.isEmpty()) {

            || (instance instanceof DBSInstanceLazy instanceLazy && !instanceLazy.isInstanceConnected())
    public static DBSObject[] getObjectPath(@NotNull DBSObject object, boolean includeSelf) {
        }
            return false;
    }
        @NotNull DBCSession session,
                "Read total row count")) {
            return root;
        }
        StringBuilder name = new StringBuilder(20 * path.length);
                if (child instanceof DBSObjectContainer oc) {
     *
        Collections.addAll(ordered, objects);
        String typeModifiers = SQLUtils.getColumnTypeModifiers(dataSource, typedObject, typeName, typedObject.getDataKind());
     * <p>
            // One container name
        if (CommonUtils.isEmpty(entityName)) {
        @NotNull String query,

    public static String getObjectFullName(

                }
     * @throws DBException if connection is lost or something is going wrong during children loading
                    continue;
        if (offset > 0 || hasLimits || (possiblySelect && maxRows > 0 && !limitAffectsDML)) {
                    for (DBSTableIndex index : indexes) {
        final int modStartIndex = type.indexOf('(');
                name.append(namePart.getName());
        }
        return getDefaultOperators(attribute);
        return getObjectFullName(dataSource, object, context, DBPAttributeReferencePurpose.UNSPECIFIED);
        } else {
                if (child == null) {
                    if (child instanceof DBSSchema) {
        for (DBSObject obj = root; obj != null; obj = obj.getParentObject()) {
                    }
        DBDAttributeBinding[] bindings = new DBDAttributeBinding[columnsCount];
            }
public final class DBUtils {
                break;
        }
        if (identifiers.isEmpty()) {
                sc = null;
            }
                }
    }
            container.fireEvent(new DBPEvent(DBPEvent.Action.OBJECT_UPDATE, object, enabled));
            if (obj instanceof DBPDataSourceContainer ds) {
        DBPDataSource dataSource = object.getDataSource();


     * Extracts modifiers from a given type.
                return type.cast(parent);
        }
            strValue = String.valueOf(object);
            if (constraint instanceof DBSEntityReferrer referrer) {
        }
    }
            if (ref.getAttribute() != null && !ref.getAttribute().isRequired()) {
            return null;
        List<DBSEntityConstraint> identifiers = new ArrayList<>();
     * final Pair<String, String[]> modifiers = DBUtils.getTypeModifiers(NUMBER(5, 10)");
            Iterator<? extends DBSEntityAttribute> attrIterator = attributes.iterator();
                if (ref.getAttribute() == null ||
            }
 *
    }
        return dataTypeProvider.getLocalDataType(fullTypeName);
            return object;
        return CommonUtils.getOption(options, DBPScriptObject.OPTION_FULLY_QUALIFIED_NAMES, true)
        int suffix = 1;
        @NotNull DBDValue rootValue,
                            return false;

    public static void fireObjectUpdate(DBSObject object, @Nullable Map<String, Object> options, @Nullable Object data) {
        DBSObject structObject = getFromObject(typedObject);
        if (refEntity == ownerEntity) {
        return table instanceof DBSView || table instanceof DBSTable dbsTab && dbsTab.isView();
        return null;
    @NotNull


    public static long countDataFromQuery(
    /**
import org.jkiss.dbeaver.model.edit.DBECommandContext;

    @NotNull
        }
        return attributes;
                result.add(registry);
     * The method returns true if index based by source attributes is UNIQUE
                        Collection<? extends DBSObject> grandChildren = ((DBSObjectContainer) child).getChildren(monitor);
    }
import org.jkiss.dbeaver.model.impl.AbstractExecutionSource;
                }
        return (o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName());
        }

    public static DBSObject getObjectByPath(
    public static DBPDataSourceContainer findDataSource(@NotNull String dataSourceId) {
    public static void fireObjectRefresh(DBSObject object) {
    }
            return object instanceof DBSObject dbo
import org.jkiss.utils.CommonUtils;
        List<DBSEntityAttribute> ownAttrs = getEntityAttributes(monitor, referrer);
                }
        if (associations != null) {
     */
        }
            Collection<? extends DBSTableIndex> indexes = table.getIndexes(monitor);
        if (object instanceof DBSContextBoundAttribute cba) {
    public static DBPDataSourceContainer findDataSourceByObjectId(@NotNull DBPProject project, @NotNull String objectId) {
            });
        return Comparator.comparingInt(DBPObjectWithOrdinalPosition::getOrdinalPosition);
        @NotNull Object[] row,
    }
        DBDValueHandlerProvider handlerProvider = getAdapter(DBDValueHandlerProvider.class, dataSource);
import org.jkiss.dbeaver.model.virtual.DBVUtils;
        @NotNull DBRProgressMonitor monitor,
        return getQuotedIdentifier(dataSource, str, true, false);
        }
            if (token.startsWith("\"") && token.endsWith("\"")) {
        // Find owner value. Iterate thru all attr and col indexes to find leaf value.
        final DBPDataSource dataSource = object.getDataSource();
        }
    @NotNull
        String entityName = entityMeta.getEntityName();
    public static boolean isSystemObject(Object object) {

        @NotNull DBCEntityMetaData entityMeta
     * Finds catalog, schema or table within specified object container
                    for (DBSObject child : children) {
        return null;
                }
        // In some cases parent's adapter is object itself (e.g. DS maybe DS adapter of container)
    @Nullable
                    }*/
            }
            }
    @NotNull
        if (constraintColumns == null) {
                    if (included) {
    /**
        final DBSEntityConstraint refConstr = association.getReferencedConstraint();
            return new DBSObject[0];
     * Refresh object in UI
import org.jkiss.utils.Pair;
        String[] names = objectId.split("/");
     * @param catalogName      catalog name (optional)
        }
    }
            depth++;
            rootSC = (DBSObjectContainer) sc;
        }
        DBSObjectContainer sc = DBUtils.getAdapter(DBSObjectContainer.class, dataSource);
                    result.add(object);
                return DBDPseudoAttribute.getAttribute(
                                if (dbsObject instanceof DBSDataContainer dataContainer) {
    }
            }
    @NotNull
                System.arraycopy(customBindings, 0, combinedAttrs, bindings.length, customBindings.length);

                    }
        StringTokenizer st = new StringTokenizer(arrayString, ",", false);

                }
                        name.append(sqlDialect.getCatalogSeparator());
        StringBuilder pathStr = new StringBuilder();

        return false;
import org.eclipse.core.runtime.IAdaptable;
     * @param purpose    to use object name to
                } else {

            String appName = CommonUtils.notEmpty(
                    }
    public static void fireObjectSelectionChange(
    public static void fireObjectUpdate(DBSObject object, boolean enabled) {
            final Collection<? extends DBSEntityAttributeRef> refAttrs = rRef.getAttributeReferences(monitor);
            }

    public static DBSEntityAttributeRef getConstraintAttribute(@NotNull DBRProgressMonitor monitor, @NotNull DBSEntityReferrer constraint, @NotNull DBSEntityAttribute tableColumn) throws DBException {
                            attrId = pa.getName();
    public static DBPDataSourceContainer getContainer(@Nullable DBSObject object) {
    public static String getObjectShortName(Object object) {
        if (dataKind == DBPDataKind.BOOLEAN || dataKind == DBPDataKind.ROWID || dataKind == DBPDataKind.OBJECT || dataKind == DBPDataKind.BINARY) {
        List<T> ordered = new ArrayList<>(objects);
    public static String getObjectFullId(@NotNull DBSObject object) {
    }
                    break;
        if (object == null) {
        DBPDataSourceContainer dataSourceContainer = project.getDataSourceRegistry().getDataSource(names[0]);
            if (binding.matches(attribute, true)) {
            return true;
        if (container != null) {
        } else if (!CommonUtils.isEmpty(catalogName) || !CommonUtils.isEmpty(schemaName)) {
            rootSC = catalogOC;
        }

            for (DBSEntityConstraint id : identifiers) {
                } else if (child instanceof DBSEntity entity && i == names.length - 2) {

            DBSEntityAttribute attribute = finalEntity.getAttribute(monitor, objectName);
            for (DBPNamedObject namePart : path) {
    }
        } else {
        if (container != null) {
        DBCStatementType statementType = DBCStatementType.SCRIPT;
        final DBSObject root = includeSelf ? object :
            case null -> null;
            log.debug("Error transforming SQL query", e);
                "Don't know how to update complex value '" + ownerValue + "' (" + ownerValue.getClass().getSimpleName() + ")");
    @NotNull
        return dataSource.getSQLDialect().getUnquotedIdentifier(str);
        @NotNull DBCExecutionContext executionContext,
     */
                }
                }
        if (!t1.equals(t2) && t1.getDataKind().getCommonality() < t2.getDataKind().getCommonality()) {
            }
    @Nullable
     *
            }
        if (value instanceof DBDValue) {
        @NotNull DBSObjectContainer rootSC,



        }
     * Find object by unique ID.
    @Nullable
        if (sc != null) {
            false);
        for (DBSTableIndex tableIndex : tableIndexes) {
        Class<? extends DBSObject> childType
                if (!exists) {

    public static DBSEntityConstraint getConstraint(
    public static DBSObjectContainer getChangeableObjectContainer(
    }
                }
                case DBConstants.VAR_CONTEXT_NAME -> context == null ? null : context.getContextName();
                if (remainingAttributes == 0) {

    @NotNull
        String arrayString = value;
    public static String getEntityScriptName(@NotNull DBSObject object, @NotNull Map<String, Object> options) {
                return true;
                    } else {
        if (transformName) {

        }
    }
    public static Object getAttributeValue(
            return false;
            }
    public static boolean isIdentifyingAssociation(@NotNull DBRProgressMonitor monitor, @NotNull DBSEntityAssociation association) throws DBException {
        return null;
            return null;

    public static void updateAttributeValue(
        }
            List<DBSEntityAttribute> indexAttributes = DBUtils.getEntityAttributes(monitor, tableIndex);

import org.jkiss.utils.ArrayUtils;
                DBUtils.fireObjectSelect(newDefaultObject, true, context);
     * @return the client application name built according to passed arguments
     * @return object identifier
        query = SQLUtils.makeUnifiedLineFeeds(session.getDataSource(), query);
        } else if (object instanceof DBSCatalog) {
        return dataSource == null ||
                log.error("Invalid internal state of referrer association");
    @NotNull
            items.add(token);
    public static DBDValueHandler findValueHandler(@NotNull DBCSession session, @NotNull DBSTypedObject column) {
            }
            final Collection<? extends DBSEntityAttributeRef> ownAttrs = eRef.getAttributeReferences(monitor);
                    continue;
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
        }
        } else {

            }
        int remainingIndices = nestedIndexes != null ? nestedIndexes.length : 0;
            } catch (DBException e) {
        if (entity instanceof DBDPseudoAttributeContainer pac) {

                    }
        return context;
        }
        @NotNull String query,
        StringBuilder name = new StringBuilder(names.length * 16);
    }
        @NotNull DBPEvaluationContext context) {
            if (transformProvider != null) {
 * See the License for the specific language governing permissions and
                    for (DBSObject child : children) {
        DBCExecutionContext defaultContext = getDefaultContext(object, true);

                    }
        }
     *
                        bindings.length + i);
        }
    }
    /**
 */
                            // In some databases (Influx?) SELECT count(*) produces multiple columns. Try to find first one with 'count' in its name.
        // Check indexes
    }
    @NotNull
//                return getEntityAttributes(monitor, (DBSEntityReferrer)nonIdentifyingConstraints.get(0));
    @NotNull
            DBPEvent event = new DBPEvent(DBPEvent.Action.OBJECT_ADD, object);
            for (int i = 1; i < names.length - 1; i++) {
        // Check constraints only if no unique indexes found
            session,
                parent = namePart;
                log.warn("Can't get pseudo attributes for '" + entity.getName() + "'", e);
            if (uniqueKeys != null) {
        return instance.getDefaultContext(new VoidProgressMonitor(), meta);
     * <h3>Example:</h3>
     * Returns DBPDataSourceContainer from DBPDataSource or object itself otherwise
        }
    public static DBSObject getSelectedObject(@NotNull DBCExecutionContext context) {
    /**
        if (entity instanceof DBSTable table) {
        @NotNull Object controller
    }
                            // For document-based DBs
                log.debug(e);
import org.jkiss.dbeaver.model.sql.SQLQueryType;
            quoteStrings = BasicSQLDialect.DEFAULT_IDENTIFIER_QUOTES;

    @NotNull

                        } else {
        if (dataSource != null) {

        }
            container.fireEvent(new DBPEvent(DBPEvent.Action.OBJECT_REMOVE, object));
            }
            return project.getDataSourceRegistry().getDataSource(dataSourceId);
            if (referrer instanceof DBVEntityConstraint ec && ec.isUseAllColumns()) {
            return refs;
        }
        }
                    hasPrimaryKey = true;
     * @param dataSource container

    /**
                remainingAttributes--;
                }
        }
                Collection<? extends DBSObject> children = container.getChildren(monitor);
        if (attribute == null) {
                if (subBinding != null) {
        } else if (finalEntity != null) {
    public static String getDefaultDataTypeName(@NotNull DBSObject objectContainer, DBPDataKind dataKind) {
        var registry = getObjectRegistry(object);
    public static <T extends DBPNamedObject> T findObject(@Nullable Collection<T> theList, String objectName) {
                    }
        return registry == null ? null : registry.getProject();
        CHILD extract(@NotNull PARENT parent, @NotNull DBRProgressMonitor monitor, @NotNull String name) throws DBException;
        return findValueHandler(session.getDataSource(), session, column);
            container.fireEvent(event);
        @NotNull DBECommandContext context) {
                continue;
            DBPDataSourceContainer dataSourceContainer = dataSourceRegistry.getDataSource(dataSourceId);
            return 0;
                    if (!CommonUtils.isEmpty(partitions)) {
                        }
            if (serviceConnections != null) {

               && object instanceof DBPQualifiedObject qo ?
    }
    ) {
            return true;
        }
                        name.append(sqlDialect.getStructSeparator());
    @Nullable
    }
            if (preferences == null) {
    public static String getObjectUniqueName(@NotNull DBSObject object) {
import org.jkiss.dbeaver.model.virtual.DBVEntityConstraint;
            DBSSchema defaultSchema = contextDefaults.getDefaultSchema();
        } else {
        @NotNull DBPEvaluationContext context,
            return null;
                    return constraintColumn;
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
                        } else {
                        if (isIdentifierIndex(monitor, index)) {

        }
    public static String getFullTypeName(DBPDataSource dataSource, @NotNull DBSTypedObject typedObject) {
            }
            statementType,
            // find composite index that presented as a compositions of columns (source attributes)

                    new AbstractExecutionSource(dataContainer, executionContext, controller),
        String strValue;
    @NotNull
            return dataSourceContainer;
            try {
        if (theList != null && !theList.isEmpty()) {
            dbdc.resetContents();
        if (object == null) {

                    }
            handlerProvider = DBWorkbench.getPlatform().getValueHandlerRegistry().getValueHandlerProvider(
                        }
import org.jkiss.dbeaver.model.app.DBPProject;
        return pathStr.toString();

            query,
        return null;
            final SQLDialect sqlDialect = dataSource.getSQLDialect();
        return session.prepareStatement(
        } else {
                pathStr.append(ds.getId());
//            if (nonIdentifyingConstraints != null) {
    }
        if (object instanceof DBPDataSourceContainer) {
     * @param objectName       table name (optional)
                    return CommonUtils.compareNumbers((Number) num1, (Number) cell2);
    @NotNull
                        }
        }
    }
                List<? extends DBSEntityAttributeRef> attrs = referrer.getAttributeReferences(monitor);
            // Unsupported data kind
    ) {
    }
            project = DBWorkbench.getPlatform().getWorkspace().getProject(projectName);
        }
                    itemIndex = nestedIndexes[nestedIndexes.length - remainingIndices];
            if (contextDefaults.refreshDefaults(monitor, false)) {
                token = token.substring(1, token.length() - 1);
        for (DBSObject parent = object.getParentObject(); parent != null; parent = parent.getParentObject()) {
    public static DBCTransactionManager getTransactionManager(@Nullable DBCExecutionContext executionContext) {

                    return 1;
     * Finds object by its name (case insensitive)
     * Deprecated. Triggering all projects open may cause issues (especially when they are secured)
            }

        @NotNull DBRProgressMonitor monitor,
                    sc = null;
        } catch (Exception e) {
                // Just check a side case - then we have catalog with schema inside with equal names.
        if (attribute instanceof DBSTypedObjectEx typedObjectEx) {
                        if (type.isInstance(object) && ((DBSObject) object).getParentObject() == parent && name.equalsIgnoreCase(((DBSObject) object).getName())) {
                Collection<? extends DBSTableIndex> indexes = table.getIndexes(monitor);
    public static String getUnQuotedIdentifier(@NotNull String str, @NotNull String quote1, @NotNull String quote2) {
    }
            }
        try {
                    if (parent instanceof DBSCatalog) {
            while (ownIterator.hasNext()) {
        @Nullable String catalogName,
            case null -> throw new DBCException("Cannot determine owner value for update");
            return adapterType.cast(object);
            }
            } catch (DBException e) {
    ) {
            if (object == null) {
    }
            return GeneralUtils.replaceVariables(appName, name -> switch (name) {
        List<String> items = new ArrayList<>();
                    return DBDVoid.INSTANCE;
                            }
            depth++;
        DBSEntity entity = entityAttribute.getParentObject();
        } else {
    public static DBSDataType getLocalDataType(
     */
                        }
                try {
                        if (child instanceof DBSDataContainer) {
    // FIXME: use real parser (nested arrays, quotes escape, etc)
                Collection<? extends DBSObject> children = container.getChildren(monitor);
                DBPDataSourceRegistry registry = project.getDataSourceRegistry();
    }
    @NotNull
        if (executionContext == null || dataContainer == null) {
        return project.getDataSourceRegistry().getDataSource(objectId.split("/")[0]);
     * @param theList    object list
        @NotNull DBDAttributeBinding attribute,
                return attribute;
    }
            strValue = no.getName();
            fetchAllTransformer = null;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

        if (entity instanceof DBSTable table && table.isView()) {
    @NotNull
    }
        }

        DBPDataKind dataKind = attribute.getDataKind();
        }

import org.jkiss.code.NotNull;
            throw new DBCException("Top-level attribute '" + attribute.getName()
            }
                if (finalEntity instanceof DBSPartitionContainer partitionContainer) {
                attributes.add(attribute);
                continue;
    }
                        return index;
    public static DBCLogicalOperator[] getDefaultOperators(DBSTypedObject attribute) {
        if (object instanceof DBSSchema) {
import org.jkiss.dbeaver.model.messages.ModelMessages;
    @Nullable
    public static void fireObjectSelect(@Nullable DBSObject object, boolean select, @Nullable DBCExecutionContext context) {
        return getUnQuotedIdentifier(str, quote, quote);
        if (object instanceof DBPUniqueObject uo) {
                    name.append('.');


                DBSEntity realEntity = ec.getEntity().getRealEntity(monitor);
        return null;
        } else {
     * Assert.assertArrayEquals(new String[]{"5", "10"}, modifiers.getSecond());
            }
    public static void fireObjectRemove(DBSObject object) {
    @NotNull
            bindings[i] = DBUtils.getAttributeBinding(dataContainer, session, metaAttributes.get(i));
        } else {
        if (!CommonUtils.isEmpty(catalogName)) {
            }
            operators.add(DBCLogicalOperator.EQUALS);
            log.error("Error discovering virtual constraint attributes", e);
                        if (!constAttrs.contains(attr)) {
        }
        };
                }
            List<DBSEntityReferrer> refs = new ArrayList<>();
    }
            }
                }
        }
            return object;
        DBSObject entityObject = getObjectByPath(monitor, executionContext, objectContainer, catalogName, schemaName, entityName);
        if (index >= row.length) {
                    isShouldSetLimit = qtp.isLimitApplicableTo(sqlQuery);
            return cmp1.compareTo(cell2);
import org.jkiss.code.Nullable;
        }
        boolean possiblySelect = sqlQuery.getType() == SQLQueryType.SELECT || sqlQuery.getType() == SQLQueryType.UNKNOWN;
            }
        return (value == null || (value instanceof DBDValue dbv && dbv.isNull()));
            return object;
                        if (grandChildren != null) {
                }
            return "Catalog";
    /**
        DBCExecutionContext defaultContext = getOrOpenDefaultContext(object, true);
        }
            if (parent == null) {
                ((DBSEntityReferrer) constraint),
                return true;
                valueHandler = DefaultValueHandler.INSTANCE;
        }
        @NotNull DBCExecutionContext executionContext,
            operators.add(DBCLogicalOperator.LESS);
        StringBuilder name = new StringBuilder(names.length * 16);

            return null;
        while (remainingAttributes > 0 || remainingIndices > 0 || retrieveDeepestCollectionElement) {
            Class<? extends DBSObject> primaryChildType = container.getPrimaryChildType(monitor);
                                    countValue = rs.getAttributeValue(i);
        }
                if (constraint instanceof DBSEntityReferrer eref &&
        } else if (object instanceof DBSObject dbso && dbso.getDataSource() != null) {
                                }
    public static Object getRawValue(Object value) {

        }
    @NotNull
            final DBSEntityAttribute attribute = column.getAttribute();

        }
        return ordered;
     * @throws DBException if value is malformed and cannot be parsed
    public static void refreshContextDefaultsAndReflect(
    }
    public static <T> T getParentOfType(@NotNull Class<T> type, DBSObject object) {
    public static DBSEntityConstraint findEntityConstraint(@NotNull DBRProgressMonitor monitor, @NotNull DBSEntity entity, @NotNull Collection<? extends DBSEntityAttribute> attributes)
        } else {

        return null;
        }
        if (object == null) {
                getEntityAttributes(monitor, referrer)
    @NotNull

            return dataType;
        return valueHandler;
                    for (DBDPseudoAttribute pa : pseudoAttributes) {
            try (DBCSession session = executionContext.openSession(
    public static DBSObject getPublicObjectContainer(@NotNull DBSObject object) {
            for (T object : theList) {
            if (!(curValue instanceof DBDCollection)) {
                            break;
    @NotNull
    }
    /**
                log.warn("Error reading reference attributes", e);
        return null;
        @NotNull DBDAttributeBinding attribute,
     * @param dataSource container
        return false;
                    refs.add((DBSEntityReferrer) fk);
        @NotNull DBPDataSource dataSource,
    public static DBSObject findObjectById(
            return dtp.getLocalDataType(typedObject.getFullTypeName());
                    curValue = parent.extractNestedValue(curValue, 0);
        @NotNull List<DBSEntityAttribute> attributes,
                            return partition;
        throws DBException {

            if (!CommonUtils.isEmpty(indexes)) {

                        sc = child;
    }

     * Returns client application identifier that contains application name, version and current connection purpose
    public static String getFullQualifiedName(@Nullable DBPDataSource dataSource, @NotNull DBPNamedObject... path) {
     * @param context    execution context
    }
            DBSEntityAttributeRef constraintAttribute = getConstraintAttribute(
    public static DBSEntityAttribute getReferenceAttribute(
        final List<? extends DBSEntityAttributeRef> refs = referrer.getAttributeReferences(monitor);
                return null;

                return root;
            for (DBPNamedObject namePart : path) {
     */
            if (DBSDataContainer.class.isAssignableFrom(primaryChildType)) {
        @NotNull DBDAttributeBinding[] allAttributes,
    ) throws DBException {
            } catch (DBException e) {
    public static DBDPseudoAttribute getRowIdAttribute(DBSEntity entity) {
        }
        Collection<? extends DBSEntityAttributeRef> columns = constraint.getAttributeReferences(monitor);
                    return null;
            DBPDataSourceRegistry dataSourceRegistry = project.getDataSourceRegistry();
            }
                if (remainingIndices > 0) {
        for (String[] quoteString : quoteStrings) {
            return rootSC;
    /**
        DBVEntity vEntity = DBVUtils.getVirtualEntity(dataContainer, false);
    public static DBSTableIndex findAttributeIndex(DBRProgressMonitor monitor, DBSEntityAttribute attribute) throws DBException {
     * @return object identifier
    public static boolean isIdentifierIndex(DBRProgressMonitor monitor, DBSTableIndex index) throws DBException {
        @NotNull String fullTypeName) {
            false,
                    if (getConstraintAttribute(monitor, index, attribute) != null) {
    public static long readRowCount(
    }
                return true;
    public static String getQuotedIdentifier(
     * Also checks DBValue for nullability
            }
    }
    @NotNull
            return null;
                    List<DBSEntityAttribute> constAttrs = getEntityAttributes(monitor, eref);
        DBCStatementType statementType = DBCStatementType.QUERY;
    }
    public static boolean isHiddenObject(Object object) {
        if (attrs == null || attrs.isEmpty()) {
                }
                result[0] = rowCount;
        final String[] mods = mod.split(",");
import org.jkiss.dbeaver.runtime.IVariableResolver;
}
            container.fireEvent(new DBPEvent(DBPEvent.Action.OBJECT_SELECT, object, select, context));
                    if (selectedObject instanceof DBSSchema && selectedObject.getParentObject() instanceof DBSCatalog &&
        if (names.length == 1) {
        object.getParentObject();
    public static String getQuotedIdentifier(@NotNull DBSObject object, @NotNull DBPAttributeReferencePurpose purpose) {
        if (selectQuery) {
            return new Pair<>(type, new String[0]);
            return uo.getUniqueName();

        return activeObject == null ? object.getDataSource() : activeObject;

            } else {
            return bindings;
        }
     * @param object     object to get name of
        try {
        return dataTypeProvider.resolveDataType(monitor, fullTypeName);
            path[depth-- - 1] = obj;
            return null;
    public static <TYPE extends DBPNamedObject> Comparator<TYPE> nameComparatorIgnoreCase() {
        return getFullTypeName(dataSource, typedObject);
    @Nullable
     * @param context    evaluation context
            }
     * @return true or false
            return new DBSObject[]{defaultSchema};
     *
        if (depth == 0 && attribute != attribute.getTopParent()) {
            if (ownAttrs == null || refAttrs == null || ownAttrs.size() != refAttrs.size()) {
    @Nullable
            // No answer from the driver side
    }
    }
     */

            }
                }
        boolean reference) throws DBException {
        @Nullable int[] nestedIndexes,
        List<DBSDataContainer> result = new ArrayList<>();
                        }
                    DBSTrigger trigger = DBUtils.findObject(triggers, objectName);
        }
    }
            String str2 = String.valueOf(cell2);
    @Nullable
     *
            case DBDCollection collection -> collection.setItem(nestedIndexes[nestedIndexes.length - 1], elementValue);
                // Datasource supports only schemas. Do not use catalog
        return name.toString();

    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        } else {
     *
        }
        Collection<? extends DBSTableIndex> tableIndexes = ((DBSTable) entity).getIndexes(monitor);
    @Nullable
            entityObject = alias.getTargetObject(monitor);
        if (!identifiers.isEmpty()) {
                            return number.longValue();
        DBSEntity finalEntity = null;
            object.close();

                return oc.getChild(monitor, objectName);
        @NotNull DBSEntity dbsEntity,
    @NotNull
        if (mod.isEmpty()) {
        } else {
    }
            } else {
    /**
                if (namePart instanceof DBSSchema && ((sqlDialect.getSchemaUsage() & SQLDialect.USAGE_DML) == 0)) {

                pathStr.append('/');
            parent = DBUtils.getPublicObject(parent);
                                    result.add(dataContainer);
                if (num1 == null) {
        return null;
        @NotNull DBCSession session,
        orderObjects(ordered);
        }
    public static Object makeNullValue(
    @Nullable
            }
                pathStr.append(obj.getName());
    }
                    continue;
        return dataSource == null ? null : dataSource.getContainer();
    @NotNull
                return binding;
        } else {
    public static String getClientApplicationName(
                }
    public static boolean isUniqueIndexForAttributes(
                        // Get schema in catalog
        if (cell1 == cell2 || (isNullValue(cell1) && isNullValue(cell2))) {
            }
            DBSObject selectedObject = DBUtils.getSelectedObject(executionContext);
                        nonIdentifyingConstraints.add(constraint);

                            countValue = rs.getAttributeValue(0);
        for (DBPProject project : workspace.getProjects()) {
    public static String getObjectFullName(
            List<T> result = new ArrayList<>();
            scrollable && session.getDataSource().getInfo().supportsResultSetScroll(),
        fireObjectUpdate(object, null, null);
        DBSObjectType[] objectTypes = object.getDataSource().getInfo().getSupportedObjectTypes();
        boolean isShouldSetLimit = true;
        boolean limitAffectsDML = Boolean.TRUE.equals(session.getDataSource().getDataSourceFeature(DBPDataSource.FEATURE_LIMIT_AFFECTS_DML));
            throw new DBException(ModelMessages.error_not_connected_to_database);
        }
                queryText = limitTransformer.transformQueryString(sqlQuery);
                if (selectedObject instanceof DBSObjectContainer) {

        }
                if (namePart == null || isVirtualObject(namePart)) {
        if (str.length() >= quote1.length() + quote2.length() && str.startsWith(quote1) && str.endsWith(quote2)) {
     * @param monitor can not be null
        return attr instanceof DBDAttributeBinding ab && ab.isPseudoAttribute();
                if (!(sc instanceof DBSObjectContainer)) {
                    }
                limitTransformer.transformStatement(dbStat, 0);
    }
                log.warn(e);
    @Nullable

                    session,
                    itemIndex = 0;
        }
            return Collections.emptyList();
    }
            if ((obj instanceof DBSTablePartition part) && part.needFullPath()) {
                default -> varResolver.get(name);
                System.arraycopy(bindings, 0, combinedAttrs, 0, bindings.length);
                }
    ) throws DBCException {
        return typeModifiers == null ? typeName : (typeName + typeModifiers);
            dataSource.getInfo().isReadOnlyMetaData();
                monitor,
                return defaultCatalog;
     * Returns client application identifier that contains application name and
        return null;
            try {
            DBSCatalog defaultCatalog = contextDefaults.getDefaultCatalog();
                    if (index.isUnique() && referrerMatches(monitor, index, attributes)) {
        @Nullable String purpose
        @Nullable DBCExecutionSource executionSource,
                }

                    customBindings[i] = new DBDAttributeBindingCustom(
            }
        }
    }
                        sc = selectedObject;
        if (name.isEmpty()) {
        if (contextDefaults == null) {
                    }
            if (selectedObject instanceof DBSObjectContainer oc) {
        @NotNull DBDAttributeBinding[] allAttributes,
        return "Object";

                        }

        @NotNull String objectId
        }
    ) throws DBException {
        final DBSObject object = rootSC.getChild(monitor, objectName);
     * Main difference with regular compare is that all numbers are compared as doubles (i.e. data type doesn't matter).
        DBSCatalog defaultCatalog = contextDefaults.getDefaultCatalog();
    }
            return cba.formatMemberReference(false, null, DBPAttributeReferencePurpose.UNSPECIFIED);
        }
            }
    }
        for (DBSEntityConstraint constraint : CommonUtils.safeCollection(dbsEntity.getConstraints(monitor))) {
        @Nullable DBCExecutionContext context
        @NotNull DBDAttributeBinding attribute,
    /**
                }
        if (value.startsWith("[") && value.endsWith("]")) {
            }
     */
        @NotNull DBCStatementType statementType,
        if (!index.isUnique()) {
                    return new DBDValueError(e);
     * Get object name in quotes if they are needed.
            event.setOptions(options);
                constraintColumns = referrer.getAttributeReferences(monitor);
                        if (resultAttrs.size() == 1) {
        @Nullable String purpose,
    ) {
     * Returns list of all underlying data containers from different kind of parent nodes (usually from the navigator tree)
                    finalEntity = entity;
                }
                for (DBSEntityAttributeRef col : attrs) {
                    }
                    return CommonUtils.compareNumbers((Number) cell1, (Number) num2);
                return constraint;
            value = value.substring(1, value.length() - 1);
 * DBeaver - Universal Database Manager
            } else {
        int depth = 0;
            while (curValue instanceof DBDCollection collection) {
            // Child is not an entity. May be catalog/schema names was omitted.
        return null;
                DBDAttributeBinding[] combinedAttrs = new DBDAttributeBinding[bindings.length + customBindings.length];
        if (context == null || context.getContextDefaults() == null) {
    public static String getClientApplicationName(
            operators.add(DBCLogicalOperator.LIKE);
        }
                }
        if (referrer != null) {
            return binding.getFullyQualifiedName(context, purpose);
        @NotNull DBSDataContainer dataContainer,
        while (remainingAttributes + remainingIndices > 0) {
            DBPDataSource dataSource = object.getDataSource();
        return dataSource.getSQLDialect().getQuotedIdentifier(str, caseSensitiveNames, quoteAlways);
                    throw new DBCException("Cannot update complex attribute: out of nested attributes");
        } else {
        }
            return null;
        return str;
            try {
        }
    }
        @NotNull DBCSession session,
            return false;

    }
        if (object == null) {

    }
    }
    @NotNull
        @NotNull DBCSession session,
                    log.debug("Can't find child container " + name + " in container " + DBUtils.getObjectFullName(sc, DBPEvaluationContext.UI));
                    DBSTableIndex index = DBUtils.findObject(indices, objectName);
        Collection<? extends DBSEntityConstraint> constraints = ownerEntity.getConstraints(monitor);

                        if (nonIdentifyingConstraints == null) nonIdentifyingConstraints = new ArrayList<>();

                if (!CommonUtils.isEmpty(containers)) {
        // Check constraints
    }
        if (container != null) {
        for (int i = 0; i < mods.length; i++) {
    }

        }
        }
        @NotNull DBPDataSourceContainer container,
                    }/* else {

                return (DBSInstance) p;
        if (object instanceof DBPQualifiedObject qo) {

        DBSObject[] path = getObjectPath(object, true);
    public static String getQuotedIdentifier(@NotNull DBPDataSource dataSource, @NotNull String str) {
        }
        while (true) {
        if (constraints != null) {
import java.lang.reflect.InvocationTargetException;

        String schemaName = entityMeta.getSchemaName();
    public static List<DBSEntityReferrer> getAttributeReferrers(@NotNull DBRProgressMonitor monitor, @NotNull DBSEntityAttribute entityAttribute, boolean includeVirtual)
        if (defaultCatalog != null && defaultSchema != null) {
                }
        }
            if (oldDefaultObject != null) {
            } else if (fetchAllTransformer != null) {
                // Do not use indexes with NULL columns (because they are not actually unique: #424)
        if (dataType != null) {
        DBDValueHandler valueHandler = null;
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
    }
    }
        if (columns != null) {
        return result[0];
                    uniqueId = id;
            try {
            return 1;
            if (!name.isEmpty() && name.charAt(name.length() - 1) != '.') {
        }
     */
        return null;
            scrollable && session.getDataSource().getInfo().supportsResultSetScroll(),
    /**
 * Licensed under the Apache License, Version 2.0 (the "License");
                }
        DBExecUtils.tryExecuteRecover(monitor, executionContext.getDataSource(), param -> {
            return Collections.emptyList();
            }
        SQLQuery sqlQuery = new SQLQuery(session.getDataSource(), query);
     * Usually it works only for entities and entity containers (schemas, catalogs).
        return Collections.emptyList();
 *
     */
    public static DBSEntityAttributeRef getConstraintAttribute(@NotNull DBRProgressMonitor monitor, @NotNull DBSEntityReferrer constraint, @NotNull String columnName) throws DBException {
                        null,
    ) {
        return dataSource.isConnected();
                Class<? extends DBSObject> childType = catalog.getPrimaryChildType(monitor);
                return null;
    public static List<? extends DBSEntityAttribute> getBestTableIdentifier(@NotNull DBRProgressMonitor monitor, @NotNull DBSEntity entity)
     */
    public static DBCExecutionContext getDefaultContext(@Nullable DBSObject object, boolean meta) {

     * @param object  to get identifier of
                        // We search for schema and active object is schema. Let's search our schema in catalog
        return getAttributeValue(attribute, allAttributes, row, null, false);
        @NotNull DBCSession session,
        } catch (DBException e) {
            executionSource,
    }
            DBSSchema defaultSchema = contextDefaults.getDefaultSchema();
        return null;
                        return true;
    }
     * @return object path

        return curValue;
                    !CommonUtils.equalObjects(ref.getAttribute().getName(), attrIterator.next().getName())) {
    public static <T extends DBPNamedObject> List<T> findObjects(@Nullable Collection<T> theList, @Nullable String objectName) {

        @Nullable DBDDataFilter dataFilter,
            if (ownerInstance instanceof DBSInstanceLazy instanceLazy && !instanceLazy.isInstanceConnected()) {
                        }
        });
            operators.add(DBCLogicalOperator.IN);
            final Iterator<? extends DBSEntityAttributeRef> ownIterator = ownAttrs.iterator();
                if (dataType.getName().equalsIgnoreCase(testType)) {
    }
     */
        @Nullable int[] nestedIndexes,
                        sc = objectContainer.getChild(monitor, containerName);
            }

            container = dsc;
            return DBUtils.findDataSource(dataSourceId);
    @Nullable
            if (retrieveDeepestCollectionElement && remainingAttributes == 0) {
        }
                if (realEntity != null) {
        return null;
        @NotNull DBPProject project,
        }
        @Nullable
            throw new DBException("Type with zero modifiers is not allowed");
        List<DBSEntityAttribute> attributes = new ArrayList<>(constraintColumns.size());
            } else if (CommonUtils.isEmpty(catalogName) && !CommonUtils.isEmpty(schemaName) && sc instanceof DBSCatalog catalog) {
                refIterator.next();
    }
        @Nullable DBSObject oldDefaultObject,

                    }
                        selectedObject = selectedObject.getParentObject();
                    if (selectedObject instanceof DBSSchema && CommonUtils.equalObjects(schemaName, selectedObject.getName()) ||
     */
        }
        if (defaultContext == null) {
    }

        @NotNull DBDValueHandler valueHandler,
                    uniqueId = id;
        } else if (parent instanceof DBSObjectContainer container) {

        // This is a flag for any potential SELECT query
        Object curValue = rootValue;
        DBCExecutionContextDefaults<?,?> contextDefaults = context.getContextDefaults();
        final DBPDataSourceContainer container = getContainer(object);

            }
                        // Selected object is a catalog or schema which is also specified as catalogName/schemaName -
        } else {
    public static void fireObjectAdd(DBSObject object, Map<String, Object> options) {
            DBSDataType dataType = typedObjectEx.getDataType();

            DBSObject catalog = rootSC.getChild(monitor, catalogName);
    @NotNull
                if (constraintColumn.getAttribute() == tableColumn) {
    ) throws DBException {
                    boolean included = true;
                log.debug("Object '" + objectName + "' not found in entity " + DBUtils.getObjectFullName(finalEntity, DBPEvaluationContext.UI));

            }
    public static DBDAttributeBindingMeta getAttributeBinding(
            statementType,
            }
        } else {
                            Object singleValue = map.values().iterator().next();
        SQLDialect dialect = SQLUtils.getDialectFromDataSource(dataSource);
            return null;
        int remainingAttributes = depth;
package org.jkiss.dbeaver.model;
     * identifies entity.
     * @return the client application name built according to passed arguments
                }
            log.debug("Unsupported table class: " + entityObject.getClass().getName());
                        List<? extends DBCAttributeMetaData> resultAttrs = rs.getMeta().getAttributes();
                } else {
    public static <T> T getSelectedObject(@NotNull DBCExecutionContext context, @NotNull Class<T> theClass) {
 * Unless required by applicable law or agreed to in writing, software
                if (itemIndex >= collection.getItemCount()) {
    }
                attribute.getName()
            return object.getName();
            return null;
                DBSEntityAttributeRef ownAttr = ownIterator.next();
            }
     * }</pre>
            if (dataSource == null) {
                                DBCAttributeMetaData ma = resultAttrs.get(i);
            }
        }
                    Collection<? extends DBSTablePartition> partitions = partitionContainer.getPartitions(monitor);
            return entity;
                path[depth-- - 1] = part.getParentTable();
            }
                    return getEntityAttributes(monitor, referrer);
import org.eclipse.core.runtime.Status;
        DBSSchema defaultSchema = contextDefaults.getDefaultSchema();
    public static DBSDataType resolveDataType(
        List<DBCLogicalOperator> operators = new ArrayList<>();
        DBPDataTypeProvider dataTypeProvider = getAdapter(DBPDataTypeProvider.class, dataSource);

     *
        if (childType == DBSSchema.class && contextDefaults.supportsSchemaChange()) {
                throw new DBException("Child object '" + objectName + "' not found in container " + DBUtils.getObjectFullName(sc, DBPEvaluationContext.UI));
            } else {
        return (T) getOrOpenDefaultContext(object, false).openSession(monitor, DBCExecutionPurpose.UTIL, task);
     * Compares two values read from database.
     * Assert.assertEquals("NUMBER", modifiers.getFirst());

        if (modStartIndex < 0) {
    /**
            createStatement(session, queryText, doScrollable) :
            container = dataSource.getContainer();
        } else if (cell1 instanceof Number && cell2 instanceof Number) {
    public static DBSEntity getEntityFromMetaData(
import org.jkiss.dbeaver.model.struct.rdb.*;
    /**
        return str;
            statementType,
            throw new DBCException("Default context not found");
        @NotNull DBCSession session,
    }
        if (theList != null) {
            return dte.getDataType();
        return strValue;
                    return null;
            limitTransformer = null;
    }
    public static DBPProject getObjectOwnerProject(@NotNull DBSObject object) {
        return items;
            // Can't migrate into itself
        DBDPseudoAttribute rowIdAttribute = getRowIdAttribute(attr.getParentObject());
        }
        DBCExecutionContextDefaults<?,?> contextDefaults,
            }
                if (indices != null) {
        return container.getRegistry();
                    return subBinding;

            return Collections.emptyList();
            }
                            for (DBSObject dbsObject : grandChildren) {
                remainingIndices--;
    @NotNull
        for (int i = 0; i < columnsCount; i++) {
        }
    @NotNull
                }
        if (object instanceof DBSEntity) {
    @NotNull
            rootSC = schemaOC;
        if (container.getPreferenceStore().getBoolean(ModelPreferences.META_CLIENT_NAME_OVERRIDE)) {
        if (theList != null && !theList.isEmpty()) {
        if (container != null) {
        }
        DBCExecutionContextDefaults<?, ?> contextDefaults = context.getContextDefaults();
        @NotNull DBCExecutionContext executionContext,
            operators.add(DBCLogicalOperator.IS_NULL);
        boolean transformName
        DBSDataType dataType = getDataType(typedObject);
            return object;
        if (entityObject == null) {
    @Nullable
        for (DBSObject obj = root; obj != null; obj = obj.getParentObject()) {
            try {
    }
        }
import org.jkiss.dbeaver.ModelPreferences;
    }
            } else if (DBSObjectContainer.class.isAssignableFrom(primaryChildType)) {
     * Optional association is the one which can be set to NULL
                dataSource, column);
                for (int i = 0; i < customAttributes.size(); i++) {
                if (!RuntimeUtils.runTask(monitor -> {
        throws DBException {
            DBSObject schema = rootSC.getChild(monitor, schemaName);
        }
                }
    }
    public static DBDAttributeBinding[] getAttributeBindings(
        final boolean hasLimits = (offset > 0 || selectQuery) && maxRows > 0;
            if (binding.matches(attribute, true)) {
            return null;
            }
import org.jkiss.dbeaver.model.sql.SQLUtils;
                        }
        List<T> ordered = new ArrayList<>();
        }

        @NotNull DBSDataContainer dataContainer,
        // Add custom attributes
            return null;

            default -> RuntimeUtils.getObjectAdapter(object, DBSObject.class);
        return null;
            if (defaultSchema != null) {
            }
            } else if (parent instanceof DBPDataSource || parent instanceof DBPDataSourceContainer) {

                }
                fireObjectSelectionChange(defaultCatalog, contextDefaults.getDefaultCatalog(), context);
        Collection<? extends DBSEntityAttributeRef> columns = constraint.getAttributeReferences(monitor);
        return null;
                container.getPreferenceStore().getString(ModelPreferences.META_CLIENT_NAME_VALUE));
        //List<DBSEntityConstraint> nonIdentifyingConstraints = null;
            obj = getPublicObjectContainer(obj);
    }
                    return DBDVoid.INSTANCE;
                if (DBSSchema.class.isAssignableFrom(childType)) {
            // Root object's parent is data source container (not datasource)
            return qo.getFullyQualifiedName(context);
    ) throws DBException {
        DBSObject[] path = new DBSObject[depth];
    }
                curValue = collection.get(itemIndex);
    ) {
            return null;
            return getObjectFullName(dbso.getDataSource(), object, context, DBPAttributeReferencePurpose.UNSPECIFIED);
        }
            Collection<? extends DBSEntityConstraint> uniqueKeys = entity.getConstraints(monitor);
        @NotNull DBSObjectContainer objectContainer,

        DBSObject selectedObject = getSelectedObject(context);
        throws DBCException {
        }
            if (handlerProvider != null) {
    public static DBSDataType getDataType(@NotNull DBSTypedObject typedObject) {
 */
import org.jkiss.dbeaver.runtime.DBWorkbench;
                            }
            return false;
        @NotNull DBSEntityAssociation association,

        if (object instanceof DBPDataSourceContainer ds) {
        }
            valueHandler = handlerProvider.getValueHandler(dataSource, preferences, column);
                    }

        for (DBPProject project : DBWorkbench.getPlatform().getWorkspace().getProjects()) {
                }
        Collection<? extends DBSEntityAttributeRef> constraintColumns = null;
                }
                    sc = oc;
        }
        if (SQLUtils.isExecQuery(SQLUtils.getDialectFromObject(session.getDataSource()), query)) {
        return getSelectedObject(executionContext);
                    return subBinding;
            }
                }
                if (pseudoAttributes != null) {
//            }
            for (DBSEntityAttributeRef constraintColumn : columns) {
    public static <T extends DBPNamedObject> List<T> makeOrderedObjectList(@NotNull Collection<T> objects) {
                        String attrId = pa.getAlias();
            for (DBSDataType dataType : allTypes) {
 * limitations under the License.
            operators.add(DBCLogicalOperator.EQUALS);
import org.jkiss.dbeaver.model.virtual.DBVEntity;
                    object.getDataSource().getContainer().getPreferenceStore().getInt(ModelPreferences.CONNECTION_OPEN_TIMEOUT))) {
        final int index = attribute.getTopParent().getOrdinalPosition();
    public static DBSDataType getDataType(@Nullable DBPDataSource dataSource, @NotNull DBSTypedObject typedObject) {
                final DBSEntityAttribute attribute = constraintColumn.getAttribute();
    @NotNull
            container.fireEvent(event);
        @NotNull DBPDataSourceContainer dataSource,
        // Transform query
    @NotNull
    }
     * @return object or null
                        if (attrId.equals(attrName)) {
     * @param object object
                if (caseInsensitive ? object.getName().equalsIgnoreCase(objectName) : object.getName().equals(objectName)) {

            fetchAllTransformer.transformStatement(dbStat, 0);
            } catch (Exception e) {
        // We need to detect whether it is a plain select statement
                    return curValue;
        }
                DBDAttributeBinding parent = Objects.requireNonNull(attribute.getParent(remainingAttributes));
     * @param purpose of identifier usage
                        selectedObject instanceof DBSCatalog && CommonUtils.equalObjects(catalogName, selectedObject.getName())) {
                throw new DBCException("Row count query didn't return any value");
    }
            }
        DBPWorkspace workspace = DBWorkbench.getPlatform().getWorkspace();

    public static String getUnQuotedIdentifier(@NotNull String str, @NotNull String quote) {
        List<? extends DBCAttributeMetaData> metaAttributes = metaData.getAttributes();
                        }

                    }
            false);
                    }
                }
                }
    public static List<DBPDataSourceRegistry> getAllRegistries(boolean forceLoad) {
    @NotNull
            if (entity == null) {
            DBPDataSource dataSource = parent.getDataSource();
    }
                if (fk instanceof DBSEntityReferrer referrer && DBUtils.getConstraintAttribute(monitor, referrer, entityAttribute) != null) {
        @NotNull DBCSession session,
                            exists = true;
            if (constraintAttribute != null && constraintAttribute.getAttribute() == attribute) {
    }

            str = getUnQuotedIdentifier(str, quoteString[0], quoteString[1]);
    }
        switch (ownerValue) {
        } else if (typedObject instanceof DBSTypedObjectEx dte) {
            }
        if (valueHandler == null) {
    }
        final DBPDataSourceContainer container = getContainer(object);
        for (String testType : typeNames) {
    @NotNull

        @NotNull DBSDataContainer dataContainer,
            if (isVirtualObject(obj)) {
    /**
        throws DBException {
            }
                    if (rs.nextRow()) {

     * @param object     object to get name of
                break;
        query = SQLUtils.makeUnifiedLineFeeds(session.getDataSource(), query);
            IVariableResolver varResolver = container.getVariablesResolver(false);
            }
                    return constraint;
            return null;
        }
            try {
     * @param theList    object list

                            break;
    @Nullable
            return entity;
        final int depth = attribute.getLevel();

        }
    }
        return null;
     * @param purpose   if null, purpose will not be included
    }
        } else if (isNullValue(cell1)) {
            //DBSEntityConstraint uniqueIndex = null;
        }
        return findObject(theList, objectName, false);
    /**
        boolean doScrollable = (offset > 0);
        if (oldDefaultObject != newDefaultObject) {
    @Nullable

import org.jkiss.dbeaver.model.runtime.DBRProgressListener;
        for (Object namePart : names) {
        final int modEndIndex = type.indexOf(')');
    }
        return ordered;
import org.jkiss.dbeaver.model.virtual.DBVEntityAttribute;

    }
        String catalogName = entityMeta.getCatalogName();
        for (DBSEntityAttributeRef column : constraintColumns) {
            if (!(sc instanceof DBSObjectContainer)) {
            }
     * Search for virtual entity descriptor
                }
                if (!isValidObjectName(namePart.getName())) {
     * @param addVersion if false version will not be included
    public static <T extends DBPNamedObject> List<T> makeOrderedObjectList(@NotNull T[] objects) {

                        DBSTablePartition partition = DBUtils.findObject(partitions, objectName);
     */
    }
        }
                }
     */
    public static boolean isVirtualObject(Object object) {
        }
        // Get handler provider from registry
    @NotNull
                }
                // Check for valid object name
    public static boolean isIdentifierConstraint(DBRProgressMonitor monitor, DBSEntityConstraint constraint) throws DBException {
            for (T object : theList) {
        boolean scrollable) throws DBCException {
                return true;
     *
        }
        } else if (object instanceof IAdaptable adaptable) {
                doScrollable = false;
                fireObjectSelectionChange(defaultSchema, contextDefaults.getDefaultSchema(), context);
        @NotNull DBSTypedObject type
import org.jkiss.dbeaver.Log;
                } else if (retrieveDeepestCollectionElement) {

     * @param schemaName       schema name (optional)
        if (theClass.isInstance(selectedObject)) {
    public static String getObjectNameFromId(@NotNull String objectId) {
            log.debug("Null datasource in container " + dataSourceContainer.getId());
            sqlQuery,
                    }
        // Note: datasource CAN be null. For example when we import data from local files (csv)
            List<DBVEntityAttribute> customAttributes = DBVUtils.getCustomAttributes(vEntity);
        long maxRows) throws DBCException {
        if (!CommonUtils.isEmpty(projectName)) {
        if (adapterType.isAssignableFrom(object.getClass())) {
                if (!exists) {
        if (!(association instanceof DBSEntityReferrer eref)) {
            for (DBSEntityAttributeRef ref : refs) {
import org.jkiss.dbeaver.utils.RuntimeUtils;
        String[] parts = objectId.split("/");
            object = ds.getDataSource();
        @NotNull ChildExtractor<PARENT, CHILD> extractor,
        return false;
        }
            DBPNamedObject parent = null;
        if (fetchAllTransformer instanceof DBCQueryTransformerExt faQT && !faQT.isApplicableTo(sqlQuery)) {
        }
            if (attribute != null) {
                    return null;
        DBCExecutionContext context = DBUtils.getDefaultContext(object, meta);
            return cba.formatMemberReference(false, null, purpose);
                name.append(DBUtils.getQuotedIdentifier(dataSource, namePart.getName()));
        }
                int itemIndex;
     *
        return Comparator.comparing(DBPNamedObject::getName);
        return dataSource.getSQLDialect().isQuotedIdentifier(str);
            }
            return value;
        @NotNull DBCStatementType statementType,
        if (project != null) {
        }
        }
                queryText = sqlQuery.getText();
            }


            }
                case DBConstants.VAR_CONTEXT_ID -> context == null ? null : String.valueOf(context.getContextId());
     * @param type string containing type with modifiers to retrieve them from

     */
                try (DBCResultSet rs = dbStatement.openResultSet()) {
                if (itemIndex >= collection.getItemCount()) {
    }
        return result;
            return null;
    public static <T extends DBCSession> T openMetaSession(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSource dataSource, @NotNull String task) throws DBCException {
                }
        }
        if (object == null) {
            return null;
    }
            result.add(container);

                }
                        throw new DBCException("Row count result is empty");
            for (DBSEntityConstraint constraint : constraints) {
    public static boolean isNullValue(@Nullable Object value) {
        if (entity instanceof DBSTable table) {
    public static List<DBSEntityAttribute> getEntityAttributes(@NotNull DBRProgressMonitor monitor, @Nullable DBSEntityReferrer referrer) {
    }
        final String productTitle = addVersion ? GeneralUtils.getProductTitle() : GeneralUtils.getProductName();
            log.debug("Can't find datasource '" + names[0] + "' in project " + project.getName());
    public static <T> T getParentAdapter(@NotNull Class<T> i, DBSObject object) {
                    }
                        } catch (DBException e) {
    public static DBDValueHandler findValueHandler(@NotNull DBPDataSource dataSource, @NotNull DBSTypedObject column) {
            operators.add(DBCLogicalOperator.NOT_EQUALS);
    ) {
            operators.add(DBCLogicalOperator.IS_NOT_NULL);
                    } else {
    public static void releaseValue(@Nullable Object value) {
            if (type.isInstance(parent)) {
    @Nullable
    }
            operators.add(DBCLogicalOperator.NOT_EQUALS);
            DBSInstance ownerInstance = DBUtils.getObjectOwnerInstance(object);
     */

        // Migrating association is: if all referenced attributes are included in some unique key
            }
            //operators.add(DBCLogicalOperator.LESS_EQUALS);
        return false;
        return getClientApplicationName(container, context, purpose, true);
            if (parent.equals(object)) {
        if (objectName == null) {
        }
    public static List<DBSDataContainer> getAllDataContainersFromParentContainer(
    }
                return dataSourceContainer;
        return object instanceof DBPHiddenObject ho && ho.isHidden();
        if (object instanceof DBSContextBoundAttribute cba) {
        }
        boolean selectQuery = sqlQuery.getType() == SQLQueryType.SELECT && sqlQuery.isPlainSelect();
            return qo.getFullyQualifiedName(context);
    ) {
                String name = names[i];
        String typeName = typedObject.getTypeName();
        return t1;
                if (attribute != null && attribute.getName().equals(columnName)) {
        if (object instanceof DBPNamedObject no) {

    }
            }

            }
        }
                        dataContainer,
import org.jkiss.dbeaver.model.data.*;
        if (dataTypeProvider == null) {
        if (entity instanceof DBSTable) {
    }
            makeStatement(session, queryText, doScrollable);
        return null;
            if (!(catalog instanceof DBSObjectContainer catalogOC)) {
        if (instance == null
    }
        Object ownerValue = null;
            for (DBSEntityAssociation fk : associations) {
                if (id instanceof DBSEntityReferrer referrer && id.getConstraintType() == DBSEntityConstraintType.PRIMARY_KEY) {
        @NotNull Object[] row
        }
        }
        }

    }
        DBSObject parent = object.getParentObject();
    public static void resetValue(@Nullable Object value) {
        @Nullable DBCExecutionContext context,
        }
     * @return List of data containers (tables, views etc.) from the parent container (schema, catalog, datasource etc.)
    }
    public static DBDAttributeBinding[] injectAndFilterAttributeBindings(

    }
            throw new DBCException("Default context not found");
                            throw new DBCException("Unexpected row count value: " + countValue);
                if (reference) {
        } else if (defaultSchema != null) {
    public static boolean isOptionalAssociation(@NotNull DBRProgressMonitor monitor, @NotNull DBSEntityAssociation association) throws DBException {
 * Copyright (C) 2010-2026 DBeaver Corp and others
            String str1 = String.valueOf(cell1);
        @NotNull DBSObject parent
    @Nullable
                valueHandler = preferences.getDefaultValueHandler();
        boolean caseSensitiveNames,
                } else if (ownAttr.getAttribute() == tableColumn) {
                if (isVirtualObject(namePart)) {
        DBCStatement dbStat = statementType == DBCStatementType.SCRIPT ?
        orderObjects(ordered);
        @NotNull DBRProgressMonitor monitor,
            }
/*
    @Nullable
                        if (!sqlDialect.isCatalogAtStart()) {

                    // Do not use catalog name in FQ name
        if (object == null) {
        }
    @NotNull
            } else {
    @Nullable
    public static boolean isParentOf(@NotNull DBSObject child, @NotNull DBSObject parent) {
                    continue;
            !dataSource.getContainer().hasModifyPermission(DBPDataSourcePermission.PERMISSION_EDIT_METADATA) ||
            DBSEntityConstraint uniqueId = null;
                DBDAttributeBinding subBinding = findBinding(nestedBindings, attribute);
        }
    public static DBCStatement createStatement(
        List<DBPDataSourceRegistry> result = new ArrayList<>();
            if (col.getTableColumn() == null || !col.getTableColumn().isRequired()) {
            default -> throw new DBCException(

            DBSEntity entity = getEntityFromMetaData(monitor, executionContext, objectContainer, entityMeta, false);
                serviceConnections.initConnection(monitor, dataSource, onFinish);

            return "?";
            }
        }
            if (!(curValue instanceof DBDCollection)) {
    public static DBSObject getFromObject(Object object) {
import org.jkiss.dbeaver.model.struct.*;
            } else {
        if (parent instanceof DBSDataContainer container) {
        }
import org.eclipse.osgi.util.NLS;
    }
    public static String getQuotedIdentifier(@NotNull DBSObject object) {
        try {
     */
    }

        }

                }
        @NotNull DBPDataSource dataSource,
            }
    }
        }
     * @param monitor          progress monitor
            }
            return t2;
     * Get the full name of the object.
    }
