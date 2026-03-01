            return procedure;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return table;
    public DBSObjectType[] getSupportedObjectTypes() {
                tableCatalog == null ? dataSource.getSchema(schemaName) : tableCatalog.getSchema(monitor, schemaName);
import java.util.List;
        ObjectsSearchParams params,

                }
            tableCatalog = dataSource.getCatalogs().getFirst();
                if (CommonUtils.isEmpty(schemaName)) {

                // Try to use catalog name as package name (Oracle)

        }
 */

                }
                }
        String tableNameMask,
        GenericCatalog catalog,
                schema == null ? null : JDBCUtils.escapeWildCards(session, schema.getName()),
        DBRProgressMonitor monitor,
        public DBSObject resolveObject(DBRProgressMonitor monitor) throws DBException {
                        getContainer()
        int maxResults,
                throw new DBException(
            GenericProcedure procedure = null;
import org.jkiss.dbeaver.model.struct.DBSObjectType;
    }
                }
        GenericSchema tableSchema = parentSchema != null ?
    private final GenericDataSource dataSource;
    ) throws SQLException {
    ) throws DBException, SQLException {
        GenericCatalog catalog,
        @NotNull GenericExecutionContext executionContext, @NotNull JDBCSession session,
        public GenericStructContainer getContainer() {

                        dataSource,
        String objectNameMask = params.getMask();
                    continue;
            CommonUtils.isEmpty(schemaName) ? null :
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                    "Can't find table '" + getName() + "' in '" + DBUtils.getFullQualifiedName(dataSource, getContainer()) + "'");
                if (objects.size() >= params.getMaxResults()) {
        ) {
                    break;
        objectNameMask = convertCase.transform(objectNameMask);
        return getSupportedObjectTypes();
            while (dbResult.next()) {

        final DBRProgressMonitor monitor = session.getProgressMonitor();
        }
            while (dbResult.next()) {
        String schemaName
                    procName,
    private void findProceduresByMask(
    private class SchemaReference extends ObjectReference {
        }
                }
        GenericSchema parentSchema,
    protected void findObjectsByMask(
        GenericCatalog tableCatalog = parentCatalog != null ? parentCatalog
        DBRProgressMonitor monitor = session.getProgressMonitor();
 *
        private TableReference(GenericStructContainer container, String tableName, String description) {
            }
        @NotNull DBSObjectType objectType, @NotNull ObjectsSearchParams params,
    @Override
                catalog == null ? null : catalog.getName(),

import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.ext.generic.GenericConstants;
                    GenericUtils.safeGetString(tableObject, dbResult, JDBCConstants.REMARKS)
            findProceduresByMask(session, catalog, schema, objectNameMask, params.getMaxResults(), references);
        JDBCSession session,
    }
            : dataSource.getSQLDialect().storesUnquotedCase();
            types.add(RelationalObjectType.TYPE_PROCEDURE);
        private SchemaReference(GenericStructContainer container, String schemaName, String description) {
            schema == null ? (globalSearch ? null : executionContext.getDefaultCatalog()) : schema.getCatalog();


                objects.add(new TableReference(
    @Override
        types.add(RelationalObjectType.TYPE_TABLE);
 * limitations under the License.

        boolean globalSearch = params.isGlobalSearch();


        } else if (objectType == RelationalObjectType.TYPE_PROCEDURE) {
        public DBSObject resolveObject(DBRProgressMonitor monitor) throws DBException {
        DBSObject parentObject = params.getParentObject();

                if (objects.size() >= maxResults) {
                    catalogName,
 * You may obtain a copy of the License at
                tableNameMask,
                    continue;

        @Override
        List<DBSObjectReference> objects
        }
        GenericCatalog parentCatalog,
        int maxResults,
                String uniqueName = GenericUtils.safeGetStringTrimmed(procObject, dbResult, JDBCConstants.SPECIFIC_NAME);
                }
                String catalogName = GenericUtils.safeGetStringTrimmed(tableObject, dbResult, JDBCConstants.TABLE_CAT);
            findSchemasByMask(session, catalog, params, references);
        }
    private class ProcedureReference extends ObjectReference {
 * DBeaver - Universal Database Manager
        final GenericMetaObject tableObject = getDataSource().getMetaObject(GenericConstants.OBJECT_TABLE);
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
            )
        GenericSchema schema = parentObject instanceof GenericSchema ? (GenericSchema) parentObject
        List<DBSObjectReference> objects
                        procedure = procPackage.getProcedure(monitor, uniqueName);
 * See the License for the specific language governing permissions and
            && dataSource.getCatalogs().size() == 1
    public DBSObjectType[] getHyperlinkObjectTypes() {
                    }
            }
    private void findSchemasByMask(
    GenericStructureAssistant(GenericDataSource dataSource) {
        }
import org.jkiss.dbeaver.model.DBUtils;
                ));
/*
    private class TableReference extends ObjectReference {
                procName = GenericUtils.normalizeProcedureName(procName);
        @Override
import java.util.ArrayList;
        ObjectReference(GenericStructContainer container, String name, String description, Class<?> objectClass, DBSObjectType type) {
    private void findTablesByMask(
import org.jkiss.dbeaver.model.impl.struct.RelationalObjectType;
                    tableName,
import org.jkiss.dbeaver.model.struct.DBStructUtils;
        private final String uniqueName;
            return schema;
                if (objects.size() >= maxResults) {
        try (
        }

        @Override
    private GenericStructContainer findContainer(
            : (params.isGlobalSearch() ? null : executionContext.getDefaultSchema());
import org.jkiss.dbeaver.model.struct.DBSObjectReference;
}
            return (GenericStructContainer) super.getContainer();
    }
                ));
        GenericCatalog catalog,
        final GenericMetaObject procObject = getDataSource().getMetaObject(GenericConstants.OBJECT_PROCEDURE);
        }
        } else if (objectType == RelationalObjectType.TYPE_SCHEMA) {
                }
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaObject;
            if (procedure == null) {
            JDBCResultSet dbResult = session.getMetaData().getTables(
                objects.add(new ProcedureReference(
                    break;
        if (dataSource.getInfo().supportsStoredCode()) {
            types.add(RelationalObjectType.TYPE_SCHEMA);

    }
    }
                String procName = GenericUtils.safeGetStringTrimmed(procObject, dbResult, JDBCConstants.PROCEDURE_NAME);
                    schemaName,
    }
            if (getContainer() instanceof GenericSchema) {
            while (dbResult.next()) {
        }
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
                    uniqueName
        private final String catalogName;
                    findContainer(session.getProgressMonitor(), catalog, schema, catalogName, schemaName),
    @NotNull

 *
                    break;
 */

                    GenericUtils.safeGetString(schemaObject, dbResult, JDBCConstants.REMARKS)
 * you may not use this file except in compliance with the License.
        if (tableCatalog == null && CommonUtils.isEmpty(catalogName) && !CommonUtils.isEmpty(dataSource.getCatalogs())
 *     http://www.apache.org/licenses/LICENSE-2.0
        final DBRProgressMonitor monitor = session.getProgressMonitor();
                String catalogName = GenericUtils.safeGetStringTrimmed(schemaObject, dbResult, JDBCConstants.TABLE_CAT);
    @Override
        if (DBStructUtils.isSchemasSupported(dataSource.getContainer())) {
            }
                throw new DBException(

 * GenericStructureAssistant
        }
                if (CommonUtils.isEmpty(tableName)) {
            }


import java.sql.SQLException;
                    if (procPackage != null) {

        JDBCSession session,
                if (monitor.isCanceled()) {


                    uniqueName = procName;
 * Unless required by applicable law or agreed to in writing, software
        List<DBSObjectType> types = new ArrayList<>();
        ) {
    @NotNull
                    break;
        this.dataSource = dataSource;
                procedure = getContainer().getProcedure(monitor, uniqueName);
                }
        return getSupportedObjectTypes();
                    break;
                throw new DBException(
/**
    }
                ));
                null
            parentSchema :
                }
    }
                if (CommonUtils.isEmpty(procName)) {
                // Some driver return specific name for regular name
            // there is only one catalog - let's use it (PostgreSQL)
                    ) + "'");
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            }
                objects.add(new SchemaReference(
public class GenericStructureAssistant extends JDBCStructureAssistant<GenericExecutionContext> {
        final GenericDataSource dataSource = getDataSource();
                    "Can't find procedure '" + getName() + "' (" + uniqueName + ")" + "' in '" + DBUtils.getFullQualifiedName(
            if (procedure == null) {
                String schemaName = GenericUtils.safeGetStringTrimmed(schemaObject, dbResult, JDBCConstants.TABLE_SCHEM);
    protected GenericDataSource getDataSource() {
            if (table == null) {
                if (monitor.isCanceled()) {
    }

                }
                procNameMask
    }
        }
    public DBSObjectType[] getAutoCompleteObjectTypes() {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                    continue;
        return tableSchema != null ? tableSchema : tableCatalog != null ? tableCatalog : dataSource;
            }
import org.jkiss.dbeaver.DBException;
    private abstract static class ObjectReference extends AbstractObjectReference<DBSObject> {
                    catalog != null ? catalog : CommonUtils.isEmpty(catalogName) ? null : dataSource.getCatalog(catalogName),
        if (objectType == RelationalObjectType.TYPE_TABLE) {
            this.catalogName = catalogName;

        List<DBSObjectReference> objects

            )
                    findContainer(session.getProgressMonitor(), catalog, schema, catalogName, schemaName),
                if (CommonUtils.isEmpty(uniqueName)) {
                    break;
            GenericTableBase table = getContainer().getTable(monitor, getName());
    @Override
                String tableName = GenericUtils.safeGetStringTrimmed(tableObject, dbResult, JDBCConstants.TABLE_NAME);
        @Override
        try (
        }
        DBPIdentifierCase convertCase = params.isCaseSensitive() ? dataSource.getSQLDialect().storesQuotedCase()
                schema == null ? null : schema.getName(),
            if (schema == null) {
            findTablesByMask(session, catalog, schema, objectNameMask, params.getMaxResults(), references);
            : CommonUtils.isEmpty(catalogName) ? null : dataSource.getCatalog(catalogName);
                    "Can't find schema '" + getName() + "' in '" + DBUtils.getFullQualifiedName(dataSource, getContainer()) + "'");
import org.jkiss.dbeaver.model.impl.jdbc.JDBCConstants;
        }
        return dataSource;
package org.jkiss.dbeaver.ext.generic.model;
                if (!CommonUtils.isEmpty(catalogName)) {
    }
        @NotNull JDBCSession session,
import org.jkiss.code.NotNull;
        GenericSchema schema,
import org.jkiss.dbeaver.model.struct.DBSObject;
        try (JDBCResultSet dbResult = session.getMetaData().getSchemas(catalog == null ? null : catalog.getName(), params.getMask())) {
        final GenericMetaObject schemaObject = getDataSource().getMetaObject(GenericConstants.OBJECT_SCHEMA);
                    GenericPackage procPackage = ((GenericSchema) getContainer()).getPackage(monitor, catalogName);
        GenericSchema schema,
        private ProcedureReference(GenericStructContainer container, String catalogName, String procedureName, String uniqueName) {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCStructureAssistant;
    )
                if (monitor.isCanceled()) {
    }
    }
    ) throws DBException {
        return types.toArray(new DBSObjectType[0]);

        GenericCatalog catalog = parentObject instanceof GenericCatalog ? (GenericCatalog) parentObject :
        ) {
            super(name, container, description, objectClass, type);
    }
            super(container, tableName, description, GenericTable.class, RelationalObjectType.TYPE_TABLE);
                String catalogName = GenericUtils.safeGetStringTrimmed(procObject, dbResult, JDBCConstants.PROCEDURE_CAT);
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
import org.jkiss.dbeaver.model.impl.struct.AbstractObjectReference;
                String schemaName = GenericUtils.safeGetStringTrimmed(tableObject, dbResult, JDBCConstants.TABLE_SCHEM);
            JDBCResultSet dbResult = session.getMetaData().getProcedures(
                String schemaName = GenericUtils.safeGetStringTrimmed(procObject, dbResult, JDBCConstants.PROCEDURE_SCHEM);
            }
    throws SQLException, DBException {
        String procNameMask,
            }
            super(container, procedureName, null, GenericProcedure.class, RelationalObjectType.TYPE_PROCEDURE);
                }
        public DBSObject resolveObject(DBRProgressMonitor monitor) throws DBException {
    ) throws SQLException, DBException {
        String catalogName,
import org.jkiss.dbeaver.model.DBPIdentifierCase;

                catalog == null ? null : catalog.getName(),
            this.uniqueName = uniqueName;
            super(container, schemaName, description, GenericTable.class, RelationalObjectType.TYPE_SCHEMA);
            GenericSchema schema = getContainer().getCatalog().getSchema(monitor, getName());
    @NotNull
 *
        @NotNull List<DBSObjectReference> references
