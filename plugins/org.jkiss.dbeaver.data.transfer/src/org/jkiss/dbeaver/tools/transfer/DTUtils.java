    }
     * For regular resultsets it is the same as getAttributeBindings, for complex types it returns only leaf attributes.
            final DBCExecutionContext context = container instanceof DBPContextProvider
    ) throws DBCException {
 * Unless required by applicable law or agreed to in writing, software
                if (docEntity != null) {
        Map<String, Object> location = new LinkedHashMap<>();


    public static void addSummary(StringBuilder summary, String option, boolean value) {
     * @param defaultValue the value to return if the table name cannot be determined.
 * See the License for the specific language governing permissions and
        List<? extends DBCAttributeMetaData> attributes = resultSet.getMeta().getAttributes();
        } else {
                if (catalog != null) {
        }
        DBTTask task,
    @NotNull
     * @param queryContainer container which contains a query
        String nameFromQuery = DTUtils.getTableNameFromQuery(dataSource, queryContainer, true);
            return file;
     * and you do not want to see all statement for query with JOINs etc. instead of clear table name.
        @NotNull DBPDataSource dataSource,
                session.getProgressMonitor().subTask("Read sample rows");
    public static void addSummary(StringBuilder summary, DataTransferProcessorDescriptor processor, Map<?, ?> props) {
            DBExecUtils.tryExecuteRecover(monitor, context.getDataSource(), monitor1 -> {
    }
    private static String transformName(@NotNull SQLDialect dialect, @Nullable String name) {
                String catalog = transformName(dialect, singleSource.getCatalogName());
                try (DBCSession session = context.openSession(monitor1, DBCExecutionPurpose.META, "Read query meta data")) {
                if (queryContainer != null) {
        if (query instanceof SQLQuery) {
    }
    }
        if (serializer == null) {
        final List<T> attributes = new ArrayList<>();
                DBSEntity docEntity = DBUtils.getEntityFromMetaData(session.getProgressMonitor(), session.getExecutionContext(), attributeMeta.getEntityMetaData());
     */
                        container,
        DTObjectSerializer<OBJECT_CONTEXT, OBJECT_TYPE> serializer = SerializerRegistry.getInstance().createSerializer(object);
                    if (!CommonUtils.isEmpty(entityAttrs)) {
                addLeafBindings(result, nested);
        }
        DBRRunnableContext runnableContext,
        Map<String, Object> state = new LinkedHashMap<>();
        public void fetchRow(@NotNull DBCSession session, @NotNull DBCResultSet resultSet) {
    @Nullable
                    }
        state.put("location", location);
        content.release();
        if (query instanceof SQLQuery) {
        DBTTaskInfoCollector.TaskInformation information
import org.jkiss.dbeaver.model.*;
                    throw new InvocationTargetException(new DBCException("Query does not contain any attributes"));
    private static final int MAX_SAMPLE_ROWS = 1000;
        return null;
        if (CommonUtils.isEmpty(nestedBindings)) {
                            metaColumns.add(new DBDAttributeBindingType(docBinding, ea, metaColumns.size()));
     * @param dataSource   the data source associated with the object.
            String tableName = null;
import org.jkiss.dbeaver.model.sql.SQLScriptElement;
                        DBUtils.getObjectFullName(dataContainer, DBPEvaluationContext.UI);
import org.jkiss.dbeaver.model.sql.SQLQueryContainer;
    }
            log.error("Document attribute '" + docBinding.getName() + "' binding error", e);
    }
                    attributes.add((T) attr);
            return null;
import org.jkiss.utils.CommonUtils;

        DBPIdentifierCase identifierCase = dialect.storesUnquotedCase();
                sampleRows = rssp.getSampleRows(session, MAX_SAMPLE_ROWS);
                addSummary(summary, prop.getDisplayName(), propValue);
            }
                String entity = transformName(dialect, singleSource.getEntityName());
import org.jkiss.dbeaver.model.impl.AbstractExecutionSource;
        for (DBDAttributeBinding binding : metaColumns) {
        public void fetchStart(@NotNull DBCSession session, @NotNull DBCResultSet resultSet, long offset, long maxRows) throws DBCException {
                    resultSet,

    public static <OBJECT_CONTEXT, OBJECT_TYPE> Map<String, Object> serializeObject(
            bindDocumentAttribute(session, dataContainer, resultSet, attributes, metaColumns);
     * Methods returns default value in this case.
import org.jkiss.dbeaver.model.sql.SQLQuery;
    private static void bindDocumentAttribute(
                    dataContainer instanceof DBSEntity entity ? entity : null,
        OBJECT_CONTEXT context,
            if (source instanceof SQLQueryContainer queryContainer) {
            return useShortName ?

                        }
    }
            } catch (Exception e) {
        return state;
        if (!isDocumentAttribute) {
        @NotNull Map<String, Object> objectConfig
        List<DBDAttributeBinding> nested = docBinding.getNestedBindings();
        boolean useShortName
                        continue;
                    container.readData(executionSource, session, receiver, null, 0, 1, DBSDataContainer.FLAG_NONE, 1);
    @NotNull
        }
    }

    public static Path findProjectFile(@NotNull DBPProject project, @NotNull String filePath) {
                tableName = getTableNameFromQuery(dataSource, queryContainer, useShortName);
            useShortName ?
    ) {
                }
     */
    @NotNull
            }
            throw new RuntimeException(e);
 * limitations under the License.
        summary.append("\t").append(option).append(": ").append(value).append("\n");

                StringBuilder nameBuilder = new StringBuilder();
                }
        SQLScriptElement query = queryContainer.getQuery();
        if (dataSource == null) {
    public static <OBJECT_CONTEXT, OBJECT_TYPE> Object deserializeObject(

        @NotNull Object controller
            return tableName == null ? defaultValue : tableName;
            DBCEntityMetaData singleSource = ((SQLQuery) query).getEntityMetadata(true);
        }
                    Collection<? extends DBSEntityAttribute> entityAttrs = docEntity.getAttributes(session.getProgressMonitor());
                }
                return names.toString();
        DBDAttributeBindingMeta docBinding = DBUtils.getAttributeBinding(dataContainer, session, attributeMeta);
        summary.append("\t").append(option).append(": ").append(value ? "Yes" : "No").append("\n");
            session.getProgressMonitor().subTask("Discover attribute structure");
            if (propValue != null) {
import java.nio.file.Path;
     * Use this method for the export cases. E.g. if "table" used as a pattern
import org.jkiss.dbeaver.model.data.*;
        List<DBDAttributeBinding> nestedBindings = binding.getNestedBindings();
                if (shortName) {
            }
    public static String getTableNameFromQueryContainer(DBPDataSource dataSource, @NotNull SQLQueryContainer queryContainer) {
                    AbstractExecutionSource executionSource = new AbstractExecutionSource(
 *
import org.jkiss.dbeaver.tools.transfer.internal.DTMessages;
        @NotNull DBCSession session,
                log.debug("Error getting attributes from document entity", e);
/*

            // For documents we do binding earlier
 * you may not use this file except in compliance with the License.
            return;
            if (context == null) {
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
            }

            dataContainer,
     */
 * You may obtain a copy of the License at
     * @param useShortName whether to return the short (quoted) name or the full name of the table.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                }
            addLeafBindings(result, binding);
                DBDAttributeBindingMeta columnBinding = DBUtils.getAttributeBinding(dataContainer, session, attribute);
        if (serializer == null) {
        List<DBDAttributeBinding> metaColumns = new ArrayList<>();
     * @return the table name, or {@code defaultValue} if it cannot be resolved.
     *
/**
    public static void collectTaskInfo(
     * @param source       the object to retrieve the table name from (e.g., {@link DBSEntity}, {@link SQLQueryContainer}).
            }
            if (singleSource != null) {
import org.jkiss.dbeaver.model.task.DBTTask;
    /**
    )  throws DBException {
    private static void addLeafBindings(List<DBDAttributeBinding> result, DBDAttributeBinding binding) {
                String structSeparator = String.valueOf(dialect.getStructSeparator());
                String schema = transformName(dialect, singleSource.getSchemaName());
import org.jkiss.dbeaver.model.task.DBTTaskInfoCollector;
                SQLQueryContainer queryContainer = adaptable.getAdapter(SQLQueryContainer.class);
        }
            // No nested bindings. Try to get entity attributes
                DBUtils.getQuotedIdentifier((DBSObject) source) :
        } catch (DBException e) {
    ) {
    /**
     * @return the table name, or a default value if it cannot be resolved.
        if (metaColumns.isEmpty()) {
        Map<String, Object> objectConfig,
        return attributes;
    @NotNull
                if (receiver.attributes == null) {


                : DBUtils.getDefaultContext(container, false);
        }
    }
        @Override
        }
                        for (DBSEntityAttribute ea : entityAttrs) {
            }

import org.jkiss.code.Nullable;
        if (resultSet.getFeature(DBCResultSet.FEATURE_NAME_LOCAL) != null) {
        if (CommonUtils.isEmpty(nameFromQuery)) {
        Map<String, Object> location = JSONUtils.getObject(objectConfig, "location");
    public static void addSummary(StringBuilder summary, String option, Object value) {
            docBinding.lateBinding(session, sampleRows);
                nameBuilder.append(entity);
        }
        List<DBDAttributeBinding> result = new ArrayList<>(metaColumns.size());
 */
        if (Files.exists(file) && Files.isRegularFile(file)) {
                DBExecUtils.bindAttributes(
    }
import org.jkiss.dbeaver.model.sql.SQLDialect;
     * @param source       the object to retrieve the table name from (e.g., {@link DBSEntity}, {@link SQLQueryContainer}).
        public void close() {


     * @param dataSource   the data source associated with the object.
        @NotNull DBPNamedObject source,
import org.jkiss.dbeaver.tools.transfer.serialize.SerializerRegistry;
                }
        String typeID = CommonUtils.toString(objectConfig.get("type"));
    }
        List<DBDAttributeBinding> metaColumns
     *

                final MetadataReceiver receiver = new MetadataReceiver(container);
     * Retrieves the name of a table or equivalent object based on the provided source.
            }
                SQLDialect dialect = dataSource.getSQLDialect();
 */

        boolean useShortName,
        return null;
        } else {
import org.jkiss.dbeaver.tools.transfer.serialize.SerializerContext;
            for (DBSEntityAttribute attr : CommonUtils.safeList(((DBSEntity) container).getAttributes(monitor))) {
        if (name == null) {
                }
                attributes.add((T) attr);
    }
        return getTableName(dataSource, source, useShortName,
import org.eclipse.osgi.util.NLS;
        @NotNull DBSDataContainer dataContainer,
import org.jkiss.dbeaver.model.app.DBPProject;
        @NotNull DBRRunnableContext runnableContext,
                return nameBuilder.toString();
                }
                metaColumns.add(columnBinding);
        summary.append(NLS.bind(DTMessages.data_transfer_summary_title, processor.getName())).append(":\n");
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
        SQLScriptElement query = queryContainer.getQuery();

 *
    /**
        if (source instanceof DBSEntity) {
            if (!CommonUtils.isEmpty(selectEntitiesNames)) {
 * DBeaver - Universal Database Manager
                }
        }
        }
        }
                for (DBDAttributeBinding attr : receiver.attributes) {
        return DBUtils.injectAndFilterAttributeBindings(
    }
            session.getDataSource(),
     */
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        public void fetchEnd(@NotNull DBCSession session, @NotNull DBCResultSet resultSet) {
import org.eclipse.core.runtime.IAdaptable;
 *
            try {
        @NotNull DBPNamedObject source,

            return null;
                    }
            if (tableName == null && source instanceof IAdaptable adaptable) {

        for (DBPPropertyDescriptor prop : processor.getProperties()) {

                DBSDataContainer dataContainer = adaptable.getAdapter(DBSDataContainer.class);
                if (DBUtils.isHiddenObject(attr)) {
        SerializerContext serializeContext,
                    session,
    }
    @Nullable
import org.jkiss.dbeaver.model.struct.*;
                DBUtils.getObjectFullName(source, DBPEvaluationContext.DML));
    private static final Log log = Log.getLog(DTUtils.class);
import java.nio.file.Files;
            result.add(binding);
 *     http://www.apache.org/licenses/LICENSE-2.0
            for (DBCAttributeMetaData attribute : attributes) {
     * @param useShortName whether to return the short (quoted) name or the full name of the table.
     * Return merged source entities names as one big target name for the export goals.
                        controller
                ? ((DBPContextProvider) container).getExecutionContext()
        serializer.serializeObject(runnableContext, context, object, location);

        } catch (Exception e) {
     * Returns "bottom" level attributes out of resultset.
            true);
            try {
    /**
                        session.getExecutionContext(),

            // Seems to be a dynamic query. Execute it to get metadata
            }
                }
            } catch (Exception e) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        @NotNull DBCResultSet resultSet,
    }
     * @param dataSource dataSource
        }
            }

        } else {
    ) throws DBException {
import org.jkiss.code.NotNull;
        }
        }

    private static class MetadataReceiver implements DBDDataReceiver {
     * Retrieves the name of a table or equivalent object with a default fallback.
                DBUtils.getObjectFullName(source, DBPEvaluationContext.UI);
            return null;
        try {
            result.toArray(new DBDAttributeBinding[0]),
        }
                propValue = prop.getDefaultValue();
        }
    @SuppressWarnings("unchecked")
        @NotNull DBRProgressMonitor monitor,
        }
            return serializer.deserializeObject(runnableContext, serializeContext, objectContext, location);
        @Override
        } else {
                    tableName = useShortName ?
import java.util.*;
    public static String getTargetContainersNameFromQuery(@NotNull SQLQueryContainer queryContainer) {
        }
                DBUtils.getQuotedIdentifier(dataSource, source.getName()) :
                throw new DBCException("No execution context");
        @Override
    }
 * Data transfer utils
        private final DBSDataContainer container;
                    nameBuilder.append(schema).append(structSeparator);
        if (isDocumentAttribute) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
                    tableName = getTableNameFromQuery(dataSource, queryContainer, useShortName);
        }
import org.jkiss.dbeaver.Log;

        OBJECT_CONTEXT objectContext,
        @NotNull DBPDataSource dataSource,
        try {
public class DTUtils {
        private DBDAttributeBinding[] attributes;
    public static String getTableName(
            attributes = makeLeafAttributeBindings(session, container, resultSet);
    public static <T extends DBSAttributeBase & DBSObject> List<T> getAttributes(
        return identifierCase.transform(name);
            }
                if (dataContainer instanceof DBSEntity) {

     * @param queryContainer not nullable query container

        state.put("type", SerializerRegistry.getInstance().getObjectType(object));
        }
            });
     */
                }
    ) {
            }
        boolean isDocumentAttribute = attributes.size() == 1 && attributes.get(0).getDataKind() == DBPDataKind.DOCUMENT;
        DBCAttributeMetaData attributeMeta = attributes.get(0);
            Object propValue = props.get(prop.getId());
            }
        }
            if (resultSet instanceof DBCResultSetSampleProvider rssp) {

            // Use default pattern name for this case, not the all statement
import java.lang.reflect.InvocationTargetException;
                if (schema != null) {
            metaColumns.addAll(nested);
        if (dialect.isQuotedIdentifier(name)) {
                StringJoiner names = new StringJoiner("_");
import org.jkiss.dbeaver.tools.transfer.serialize.DTObjectSerializer;
            for (DBDAttributeBinding nested : nestedBindings) {
    @Nullable
        @Override
}
import org.jkiss.dbeaver.DBException;


        List<? extends DBCAttributeMetaData> attributes,
    }
    }
        @NotNull DBSDataContainer container,
     *

                    );
        }
                    if (DBUtils.isHiddenObject(attr)) {
    public static String getTableName(
                selectEntitiesNames.forEach(names::add);
                        DBUtils.getQuotedIdentifier(dataContainer) :
        DTObjectSerializer<OBJECT_CONTEXT, OBJECT_TYPE> serializer = SerializerRegistry.getInstance().createSerializerByType(typeID);

        }
        if (container instanceof DBSEntity && !(container instanceof DBSDocumentContainer)) {
     *
            return null;
        }
            return name;
        }
            this.container = container;
            } else if (source instanceof IAdaptable adaptable) {
import org.jkiss.dbeaver.model.exec.*;
                    metaColumns.toArray(new DBDAttributeBinding[0]), null);
 * distributed under the License is distributed on an "AS IS" BASIS,
    public static void closeContents(@NotNull DBCResultSet resultSet, @NotNull DBDContent content) {

        public MetadataReceiver(DBSDataContainer container) {
        return nameFromQuery;
                    nameBuilder.append(catalog).append(structSeparator);
    public static DBDAttributeBinding[] makeLeafAttributeBindings(@NotNull DBCSession session, @NotNull DBSDataContainer dataContainer, @NotNull DBCResultSet resultSet) throws DBCException {
package org.jkiss.dbeaver.tools.transfer;
                    continue;
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferProcessorDescriptor;

                log.debug("Error binding attributes", e);
     * @return string representation of entities names
     * @return table name founded in the query or {@code null}
        return null;

        Path file = project.getAbsolutePath().resolve(filePath);
            return null;
    }
        @NotNull String defaultValue
            List<String> selectEntitiesNames = ((SQLQuery) query).getAllSelectEntitiesNames();
        }
            List<Object[]> sampleRows = Collections.emptyList();
    /**
    ) {
                    return entity;
            }
        if (!CommonUtils.isEmpty(nested)) {
import org.jkiss.dbeaver.model.data.json.JSONUtils;
        @NotNull OBJECT_TYPE object
            if (propValue == null) {
    public static String getTableNameFromQuery(DBPDataSource dataSource, SQLQueryContainer queryContainer, boolean shortName) {

