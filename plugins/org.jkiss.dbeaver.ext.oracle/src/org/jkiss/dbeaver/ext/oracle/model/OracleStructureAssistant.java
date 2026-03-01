                            }
                            }
                    addObjectReference(objects, tableName, objectSchema, oracleObjectType, tableType, owner, session);
        try (JDBCPreparedStatement dbStat = session.prepareStatement(query.toString())) {
        OracleDataSource dataSource = (OracleDataSource) session.getDataSource();
import org.jkiss.dbeaver.DBDatabaseException;
        String mask = params.getMask();
                                throw new DBException("Constraint '" + constrName + "' not found in table '" + table.getFullyQualifiedName(DBPEvaluationContext.DDL) + "'");
                                constraint = table.getForeignKey(monitor, constrName);
                    return o1.getName().compareTo(o2.getName());
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

    private void searchAllObjects(final JDBCSession session, final OracleSchema schema, @NotNull ObjectsSearchParams params,
                    String tableType = JDBCUtils.safeGetString(resultSet, "TABLE_TYPE");
        }
            sql.append("UPPER(atc.COMMENTS) ");
            try (JDBCResultSet resultSet = preparedStatement.executeQuery()) {
            OracleObjectType.TRIGGER,
            if (Set.of(params.getObjectTypes()).contains(OracleObjectType.SCHEMA)) {
    private void findConstraintsByMask(JDBCSession session, final OracleSchema schema, @NotNull ObjectsSearchParams params,
                query.append("UPPER(v.\"TEXT_VC\")");

/*
            OracleObjectType.SYNONYM
                }
                // Search all objects
    }
            query.append(OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), dataSource, "SOURCE"));
    }
    public DBSObjectType[] getSearchObjectTypes() {
        }
                searchInTableComments(session, schema, params, objects);
                }
    @NotNull
import org.jkiss.dbeaver.model.DBConstants;
    public List<DBSObjectReference> findObjectsByMask(@NotNull DBRProgressMonitor monitor, @NotNull OracleExecutionContext executionContext,
                query.append("text ");
                    });
            OracleObjectType.PROCEDURE,
                    searchAllObjects(session, schema, params, objects);
                while (!session.getProgressMonitor().isCanceled() && objects.size() < params.getMaxResults() && resultSet.next()) {
    {
                                constraint = table.getConstraint(monitor, constrName);
            if (params.isCaseSensitive()) {
    public DBSObjectType[] getHyperlinkObjectTypes()
                            log.trace("Schema '" + schemaName + "' not found. Probably was filtered");
        query.append(")\nORDER BY OBJECT_NAME");
public class OracleStructureAssistant implements DBSStructureAssistant<OracleExecutionContext> {
            .append(!params.isCaseSensitive() ? "UPPER(OBJECT_NAME)" : "OBJECT_NAME").append(" LIKE ? ")
            OracleObjectType.SEQUENCE,
 */
    }
        String ownerClause = schema != null ? " AND OWNER = ?" : "";
                            }
                    if (oracleObjectType == null || !oracleObjectType.isBrowsable() || tableName == null) {

import java.util.*;
                @Override
                        @Override
import org.jkiss.code.NotNull;
    public OracleStructureAssistant(OracleDataSource dataSource)
                oracleObjectTypes.add(OracleObjectType.FUNCTION);
            OracleObjectType.SCHEMA
                if (o1.getContainer() == null || o1.getContainer() == activeSchema) {
            .append(ownerClause);
            query.append(" LIKE ?");
                    return object;
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {
            if (ArrayUtils.containsAny(params.getObjectTypes(), OracleObjectType.CONSTRAINT, OracleObjectType.FOREIGN_KEY)) {
    }
            query.append(OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), dataSource, "VIEWS"));

 * limitations under the License.
            } else if (DBSProcedure.class.isAssignableFrom(objectType.getTypeClass())) {
                    }
import org.jkiss.dbeaver.model.impl.struct.AbstractObjectReference;
        };
                return o1.getContainer().getName().compareTo(o2.getContainer().getName());
            }
            };
                    OracleSchema objectSchema = dataSource.getSchema(session.getProgressMonitor(), owner);
        for (DBSObjectType objectType : objectTypes) {
            dbStat.setString(1, params.isCaseSensitive() ? params.getMask() : params.getMask().toUpperCase());
    public DBSObjectType[] getSupportedObjectTypes()
                        log.trace("Schema '" + owner + "' not found. Probably was filtered");
                if (CommonUtils.equalObjects(o1.getContainer(), o2.getContainer())) {
        try (JDBCPreparedStatement dbStat = session.prepareStatement(
        references.add(
            OracleObjectType.PACKAGE,
        if (schema != null) {
            if (!params.isCaseSensitive()) {
                    OracleSchema tableSchema = getContainer();
    }
                    final String objectName = JDBCUtils.safeGetString(dbResult, OracleConstants.COLUMN_OBJECT_NAME);
        catch (SQLException ex) {
    {
            }
        }
                } else if (objectType == OracleObjectType.TABLE) {
                }
            }
                    final String objectTypeName = JDBCUtils.safeGetString(dbResult, OracleConstants.COLUMN_OBJECT_TYPE);

                return false;
            if (schema != null) {
        StringBuilder sql = new StringBuilder("SELECT atc.OWNER, atc.TABLE_NAME, atc.TABLE_TYPE FROM ALL_TAB_COMMENTS atc WHERE ");
        StringBuilder query = new StringBuilder();
                if (!ownerClause.isEmpty()) {
        }
    }
            OracleObjectType.CONSTRAINT,
    {
            query.append(ownerClause);
    }
        }
                    if (objectSchema == null) {
                dbStat.setString(2, schema.getName());
        try (JDBCPreparedStatement preparedStatement = session.prepareStatement(sql.toString())) {
            if (params.isSearchInDefinitions()) {
    @NotNull
                        type == DBSEntityConstraintType.FOREIGN_KEY ? OracleObjectType.FOREIGN_KEY : OracleObjectType.CONSTRAINT) {
 * DBeaver - Universal Database Manager
            query.append("UNION ALL\nSELECT ").append(OracleUtils.getSysCatalogHint(dataSource)).append(" O.OWNER,O.OBJECT_NAME,O.OBJECT_TYPE\n")
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *

        return true;
    @NotNull
            new AbstractObjectReference<>(objectName, objectSchema, null, objectType.getTypeClass(), objectType) {
 *
                query.append("v.\"TEXT_VC\"");
            if (searchInSynonyms()) {

import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedure;
                }
        if (params.isSearchInDefinitions()) {
                    objects.add(new AbstractObjectReference<>(
        for (DBSObjectType objectType : params.getObjectTypes()) {
    @NotNull
                public DBSObject resolveObject(DBRProgressMonitor monitor) throws DBException {
            OracleObjectType.TABLE,
                                throw new DBException("Constraint schema '" + schemaName + "' not found");
                    }
                .append("FROM ").append(OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), dataSource, "SYNONYMS")).append(" S,").append(OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), dataSource, "OBJECTS")).append(" O\n")
            OracleObjectType.TABLE,
        }
        // Seek for objects (join with public synonyms)
        boolean searchViewsByDefinition = false;
                while (!session.getProgressMonitor().isCanceled() && objects.size() < params.getMaxResults() && dbResult.next()) {
        StringJoiner objectTypeClause = new StringJoiner(",");
            return objects;
                            OracleTable table = tableSchema.getTable(monitor, tableName);
/**
            query.append("LIKE ?");
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {
            }
                query.append("UPPER(text) ");
import org.jkiss.dbeaver.Log;
                }
        query.append("SELECT ")
        }
        // Load tables
                    oracleObjectTypes.add(OracleObjectType.VIEW);
                }
                                  List<DBSObjectReference> objects) throws SQLException, DBException {

            .append(OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), dataSource, "OBJECTS"))
            dbStat.setFetchSize(DBConstants.METADATA_FETCH_SIZE);
            OracleObjectType.PROCEDURE,
                            }
                            if (constraint == null) {
        }
                            OracleSchema tableSchema = schema != null ? schema : dataSource.getSchema(monitor, schemaName);
                    OracleObjectType objectType = OracleObjectType.getByType(objectTypeName);
                        addObjectReference(objects, objectName, objectSchema, objectType, objectTypeName, schemaName, session);
        sql.append("LIKE ? ");
            query.append(ownerClause);
                            DBSObject constraint = null;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
                idx++;
                } else if (objectType == OracleObjectType.PACKAGE) {
        this.dataSource = dataSource;
                    if (objectType == OracleObjectType.PACKAGE_BODY) {
                    searchViewsByDefinition = params.isSearchInDefinitions();
                    dbStat.setString(idx, schema.getName());
                        continue;
                preparedStatement.setString(2, schema.getName());
                    final String constrType = JDBCUtils.safeGetString(dbResult, OracleConstants.COL_CONSTRAINT_TYPE);
            }
            OracleObjectType.TABLE,
            // Sort objects. Put ones in the current schema first
import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        if (objectTypeClause.length() == 0) {
                    return -1;
 * Unless required by applicable law or agreed to in writing, software
        }
                }
            OracleObjectType.PACKAGE,
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                    final String schemaName = JDBCUtils.safeGetString(dbResult, OracleConstants.COL_OWNER);
    @Override

                    DBSObject object = objectType.findObject(session.getProgressMonitor(), tableSchema, objectName);
            sql.append("atc.COMMENTS ");
            if (params.isCaseSensitive()) {
            OracleObjectType.MATERIALIZED_VIEW,
                                       List<DBSObjectReference> objects) throws SQLException, DBException {
    private void searchInTableComments(@NotNull JDBCSession session, @Nullable OracleSchema schema, @NotNull ObjectsSearchParams params,
        try (JDBCSession session = executionContext.openSession(monitor, DBCExecutionPurpose.META, "Find objects by name")) {

            throw new DBDatabaseException(ex, dataSource);
import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;
            if (!(objectType == OracleObjectType.CONSTRAINT || objectType == OracleObjectType.FOREIGN_KEY)) {
        String property = dataSource.getContainer().getConnectionConfiguration().getProviderProperty(OracleConstants.PROP_SEARCH_METADATA_IN_SYNONYMS);
        final boolean hasConstraints = objectTypesList.contains(OracleObjectType.CONSTRAINT);
                            if (hasFK && type == DBSEntityConstraintType.FOREIGN_KEY) {
                            return constraint;

            .append(" WHERE ").append("OBJECT_TYPE IN (").append(objectTypeClause).append(") AND ")
                @NotNull
        List<DBSObjectType> objectTypesList = Arrays.asList(params.getObjectTypes());
                "FROM " + OracleUtils.getAdminAllViewPrefix(monitor, (OracleDataSource) session.getDataSource(), "CONSTRAINTS") + "\n" +
                        dataSource.getSchema(session.getProgressMonitor(), schemaName),
                if (o2.getContainer() == null || o2.getContainer() == activeSchema) {
                while (!monitor.isCanceled() && dbResult.next() && objects.size() < params.getMaxResults()) {

                }
        if (searchViewsByDefinition) {

            } else {
                        constrName,
 */
            OracleObjectType.INDEX,
                    final String constrName = JDBCUtils.safeGetString(dbResult, OracleConstants.COL_CONSTRAINT_NAME);
    private void addObjectReference(@NotNull Collection<DBSObjectReference> references, String objectName, @NotNull OracleSchema objectSchema,
            }
                findConstraintsByMask(session, schema, params, objects);
                idx++;
        return true;

    private boolean searchInSynonyms() {
            int idx = 2;
            };
                .append("WHERE O.OWNER=S.TABLE_OWNER AND O.OBJECT_NAME=S.TABLE_NAME AND O.OBJECT_TYPE<>'JAVA CLASS' AND ").append(!params.isCaseSensitive() ? "UPPER(S.SYNONYM_NAME)" : "S.SYNONYM_NAME").append("  LIKE ?");
        return new DBSObjectType[] {
            sql.append("AND atc.OWNER = ? ");
            }
            OracleObjectType.SEQUENCE,
package org.jkiss.dbeaver.ext.oracle.model;
                "WHERE" + (params.isCaseSensitive() ? " CONSTRAINT_NAME " : " UPPER(CONSTRAINT_NAME) ") +
            if (params.isSearchInComments()) {
            objectTypeClause.add("'" + objectType.getTypeName() + "'");
    @Override
        final List<DBSObjectType> oracleObjectTypes = new ArrayList<>(params.getObjectTypes().length + 2);
    public boolean supportsSearchInCommentsFor(@NotNull DBSObjectType objectType) {
    }

                                       @NotNull List<DBSObjectReference> objects) throws SQLException, DBException {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        type == DBSEntityConstraintType.FOREIGN_KEY ? OracleTableForeignKey.class : OracleTableConstraint.class,
            query.append(" UNION ALL\nSELECT USERNAME as OWNER, USERNAME as OBJECT_NAME, 'SCHEMA' as OBJECT_TYPE\n")
            }
            }
    private boolean containsOnlyConstraintOrFK(DBSObjectType[] objectTypes) {



                    }
    @Override
                            if (table == null) {
                .append("FROM ").append(OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), dataSource, "USERS"))
            OracleObjectType.PACKAGE,
            }
                    dbStat.setString(idx, schema.getName());
                if (!ownerClause.isEmpty()) {
                    }
        return new DBSObjectType[] {
                        objectType = OracleObjectType.PACKAGE;
        DBRProgressMonitor monitor = session.getProgressMonitor();
                @Override
                        throw new DBException(objectTypeName + " '" + objectName + "' not found in schema '" + tableSchema.getName() + "'");
                        OracleSchema objectSchema = this.dataSource.getSchema(session.getProgressMonitor(), schemaName);
                    idx++;

            } else {
            "SELECT " + OracleUtils.getSysCatalogHint((OracleDataSource) session.getDataSource()) + " OWNER, TABLE_NAME, CONSTRAINT_NAME, CONSTRAINT_TYPE\n" +
                idx++;
        String mask = params.getMask();
                // Search constraints
                                    @NotNull OracleObjectType objectType, String objectTypeName, String schemaName, @NotNull JDBCSession session) {
    private static final Log log = Log.getLog(OracleStructureAssistant.class);
            } else {
        for (DBSObjectType objectType : oracleObjectTypes) {
            List<DBSObjectReference> objects = new ArrayList<>();
            dbStat.setString(1, mask);
                }
                oracleObjectTypes.add(objectType);
        if (Set.of(params.getObjectTypes()).contains(OracleObjectType.SCHEMA)) {
                        }

    private final OracleDataSource dataSource;
        }
        }
 * You may obtain a copy of the License at
                    if (objectType == OracleObjectType.SYNONYM && OracleConstants.USER_PUBLIC.equals(schemaName)) {
    }
                if (!containsOnlyConstraintOrFK(params.getObjectTypes())) {
        };

    }
            query.append(" WHERE ");
                                throw new DBException("Constraint table '" + tableName + "' not found in catalog '" + tableSchema.getName() + "'");
                                                      @NotNull ObjectsSearchParams params) throws DBException {
    @Override
                oracleObjectTypes.add(OracleObjectType.PROCEDURE);
        return new DBSObjectType[] {
            }
            });
import org.jkiss.dbeaver.model.DBUtils;
        OracleSchema schema = params.getParentObject() instanceof OracleSchema ? (OracleSchema) params.getParentObject() : null;
        return new DBSObjectType[] {
                            if (hasConstraints && type != DBSEntityConstraintType.FOREIGN_KEY) {
            return;
                }
            preparedStatement.setString(1, mask);
            OracleObjectType.PROCEDURE,

    {
import org.jkiss.code.Nullable;
            }
                    return 1;
            query.append(" v WHERE ");
import org.jkiss.utils.CommonUtils;
                        return DBUtils.getQuotedIdentifier(dataSource, objectName);
                dbStat.setString(idx, schema.getName());
    public boolean supportsSearchInDefinitionsFor(@NotNull DBSObjectType objectType) {
    @Override
                    oracleObjectTypes.add(OracleObjectType.FUNCTION);

            OracleObjectType.FOREIGN_KEY,
        }
            if (!ownerClause.isEmpty()) {
            OracleObjectType.PACKAGE,
 *
 *     http://www.apache.org/licenses/LICENSE-2.0

import java.sql.SQLException;
        if (searchInSynonyms()) {
                        }
 * Licensed under the Apache License, Version 2.0 (the "License");
                "LIKE ?" + (!hasFK ? " AND CONSTRAINT_TYPE<>'R'" : "") + (schema != null ? " AND OWNER=?" : ""))) {
                idx++;
                if (objectType == OracleObjectType.PROCEDURE) {
    @Override
                        if (objectSchema == null) {

            final OracleSchema activeSchema = executionContext.getContextDefaults().getDefaultSchema();
                .append(" WHERE ").append(!params.isCaseSensitive() ? "UPPER(USERNAME)" : "USERNAME").append(" LIKE ?");
                dbStat.setString(idx++, mask);
        return objectType == OracleObjectType.TABLE;
                    final String tableName = JDBCUtils.safeGetString(dbResult, OracleConstants.COL_TABLE_NAME);
    }
                    return super.getFullyQualifiedName(context);
                        continue;
 * distributed under the License is distributed on an "AS IS" BASIS,
            OracleObjectType.PROCEDURE,
            .append(OracleUtils.getSysCatalogHint(dataSource)).append(" DISTINCT OWNER,OBJECT_NAME,OBJECT_TYPE FROM (")
                dbStat.setString(idx, mask);
            }
        if (params.isCaseSensitive()) {
        return CommonUtils.getBoolean(property);
                }
            .append("\nSELECT OWNER,OBJECT_NAME,OBJECT_TYPE FROM ")
                        // We do not store bodies as separate objects
 * you may not use this file except in compliance with the License.
 * OracleStructureAssistant
            }
            query.append(" UNION ALL SELECT OWNER, VIEW_NAME, 'VIEW' AS OBJECT_TYPE FROM ");
                public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
            if (objectType instanceof OracleObjectType) {
    }
        }
                mask = mask.toUpperCase();
            }
    @NotNull
}
                    String owner = JDBCUtils.safeGetString(resultSet, "OWNER");
        );
            OracleObjectType.INDEX,
                    if (object == null) {
                dbStat.setString(idx, mask);
            }
        } else {
    }
                            }
                dbStat.setString(idx, mask);

            return;
            objects.sort((o1, o2) -> {
                            if (tableSchema == null) {
    }
                    }

                }
                            continue;
    @Override
            OracleObjectType.VIEW,
import org.jkiss.dbeaver.model.struct.*;
            query.append(" UNION ALL SELECT DISTINCT owner, name, type FROM ");
                    oracleObjectTypes.add(OracleObjectType.PACKAGE_BODY);
        sql.append("ORDER BY atc.TABLE_NAME");
            OracleObjectType.TABLE,

                    String tableName = JDBCUtils.safeGetString(resultSet, "TABLE_NAME");
                    final DBSEntityConstraintType type = OracleTableConstraint.getConstraintType(constrType);
                    final String schemaName = JDBCUtils.safeGetString(dbResult, OracleConstants.COL_OWNER);
                searchAllObjects(session, schema, params, objects);
        }
import org.jkiss.utils.ArrayUtils;
                    }
        final boolean hasFK = objectTypesList.contains(OracleObjectType.FOREIGN_KEY);
            }
    public DBSObjectType[] getAutoCompleteObjectTypes()
                    OracleObjectType oracleObjectType = OracleObjectType.getByType(tableType);
            mask = mask.toUpperCase();
            if (searchViewsByDefinition) {
                        public DBSObject resolveObject(DBRProgressMonitor monitor) throws DBException {
            }
        if (objects.size() >= params.getMaxResults() || !ArrayUtils.contains(params.getObjectTypes(), OracleObjectType.TABLE)) {
                        null,
            if (schema != null) {
        }
 * See the License for the specific language governing permissions and
                    if (objectType != null && objectType.isBrowsable() && oracleObjectTypes.contains(objectType)) {
        }
 * Copyright (C) 2010-2025 DBeaver Corp and others
