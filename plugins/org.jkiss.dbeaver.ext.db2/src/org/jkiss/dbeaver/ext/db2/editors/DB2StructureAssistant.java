                                int nbResults, boolean searchInDefinitions) throws SQLException, DBException {
        sb.append("SELECT TABSCHEMA,TABNAME,COLNAME");
    {
                while (dbResult.next()) {
                listChars.add(DB2TableType.S.name().charAt(0));
        Boolean notFirst = false;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,

                    if (nbResults++ >= maxResults) {

                if (schema != null) {
                listChars.add(DB2TableType.W.name().charAt(0));
        int nbResults = 0;

        }
            }

    private void searchColumns(JDBCSession session, DB2Schema schema, String searchObjectNameMask, List<DB2ObjectType> objectTypes,
                DB2View db2View = (DB2View) container;
                //dbStat.setString(n++, DB2Constants.SYSTEM_CATALOG_SCHEMA);
            }
            searchColumns(session, schema, searchObjectNameMask, db2ObjectTypes, maxResults, objects, nbResults);
/**
import org.jkiss.dbeaver.model.DBPNamedObject;
            super(objectName, db2View, null, DB2View.class, objectType);
                        return;
                return objects;
                return schema;
    }
                        break;
                    if (db2Schema == null) {
                sb.append(",");
    @Override
                    throw new DBException(db2ObjectType + " '" + objectName + "' not found in datasource '" + dataSource.getName() + "'");
            String objectName;
                dbStat.setString(n++, schema.getName());
                listChars.add(DB2TableType.A.name().charAt(0));
                        db2View = db2Schema.getView(session.getProgressMonitor(), tableOrViewName);
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        this.dataSource = dataSource;
        StringBuilder sb = new StringBuilder(1024);
                    tableType = CommonUtils.valueOf(DB2TableType.class, typeObjectFromResultSet);
                        break;


        }
        String sql = buildTableSQL(baseSQL.toString(), db2ObjectTypes);
            DB2Schema db2Schema;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            DB2Schema db2Schema;
    private List<DBSObjectReference> searchAllObjects(final JDBCSession session, final DB2Schema schema, List<DB2ObjectType> db2ObjectTypes,
import org.jkiss.dbeaver.model.impl.struct.AbstractObjectReference;
                "WHERE TABSCHEMA =? AND TABNAME LIKE ? AND TYPE IN (%s)";

        }
public class DB2StructureAssistant implements DBSStructureAssistant<DB2ExecutionContext> {
import org.jkiss.dbeaver.model.DBPDataSource;
        {
package org.jkiss.dbeaver.ext.db2.editors;
        public DBSObject resolveObject(DBRProgressMonitor monitor) throws DBException
        StringBuilder baseSQL = new StringBuilder("SELECT ROUTINESCHEMA, ROUTINENAME" + LF + "FROM SYSCAT.ROUTINES" + LF +

            if (dbsObjectType instanceof DB2ObjectType) {
    {
                }
            } else if (dbsObjectType == RelationalObjectType.TYPE_PROCEDURE) {
                if (object == null) {
    public DBSObjectType[] getAutoCompleteObjectTypes()
    }


                DB2Schema schema = dataSource.getSchema(monitor, objectName);
 * Licensed under the Apache License, Version 2.0 (the "License");
    private static boolean isTable(@Nullable DB2ObjectType objectType) {
        }
            }
            searchRoutines(session, schema, searchObjectNameMask, db2ObjectTypes, maxResults, objects, nbResults, params.isSearchInDefinitions());
                    }
        if (!(objectType instanceof DB2ObjectType)) {
    @NotNull
    public DBSObjectType[] getSupportedObjectTypes()
                                                      @NotNull ObjectsSearchParams params) throws DBException {
        }
import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;
                dbStat.setString(n, mask);

            try (JDBCResultSet dbResult = dbStat.executeQuery()) {
                    schemaName = JDBCUtils.safeGetStringTrimmed(dbResult, "ROUTINESCHEMA");
            DB2Schema db2Schema;

        return AUTOC_OBJ_TYPES;
import java.util.List;
    @NotNull
        sb.append(" WHERE TABSCHEMA = ?");
            dbStat.setString(n++, searchObjectNameMask);
    // Constructors
        if (schema != null) {
            || objectType == DB2ObjectType.VIEW
    }
    {
    @NotNull
            if (schema != null) {
                    throw new DBException(db2ObjectType + " '" + objectName + "' not found in view '" + db2View.getName() + "'");
                db2ObjectTypes.add((DB2ObjectType) dbsObjectType);
                "SELECT SCHEMANAME AS TABSCHEMA, NULL AS TABNAME, 'SCHEMA' AS TYPE FROM SYSCAT.SCHEMATA\n" +
            if (objectType.equals(DB2ObjectType.VIEW)) {
            baseSQL.append("ROUTINESCHEMA = ? AND ");
            searchObjectNameMask = searchObjectNameMask.toUpperCase();
        DB2ObjectType.MQT, DB2ObjectType.NICKNAME, DB2ObjectType.ROUTINE, };
            if (objectType.equals(DB2ObjectType.MQT)) {
 * You may obtain a copy of the License at
        } else {
                    if (session.getProgressMonitor().isCanceled()) {
            if (objectType.equals(DB2ObjectType.NICKNAME)) {
        }
            sql += buildTableSQL(query.toString(), db2ObjectTypes);
                    throw new DBException(db2ObjectType + " '" + objectName + "' not found in table '" + db2Table.getName() + "'");
        sb.append("SELECT TABSCHEMA,TABNAME,COLNAME");
                dbStat.setString(n++, schema.getName());

            }
                while (dbResult.next()) {
        }
            String schemaName;
 * See the License for the specific language governing permissions and

                    // Try with table, then view
 *     http://www.apache.org/licenses/LICENSE-2.0
                listChars.add(DB2TableType.N.name().charAt(0));
        if (schema != null) {
            searchTablesAndSchemas(session, schema, searchObjectNameMask, db2ObjectTypes, maxResults, objects, nbResults,
    // -----------------
                    schemaName = JDBCUtils.safeGetStringTrimmed(dbResult, "TABSCHEMA");

                    db2Table = db2Schema.getTable(session.getProgressMonitor(), tableOrViewName);
            sql =
                    }
 *
                    typeObjectFromResultSet = JDBCUtils.safeGetString(dbResult, "TYPE");
        }
        if (db2ObjectTypes.stream().anyMatch(x -> isTable(x) || x == DB2ObjectType.SCHEMA)) {
        sb.append(" WHERE COLNAME LIKE ?");
                    }
import org.jkiss.dbeaver.ext.db2.model.dict.DB2TableType;
        }
    {
        }
        if (searchInDefinitions) {

            String objectName;
                listChars.add(DB2TableType.L.name().charAt(0));

                return objects;
                "WHERE SCHEMANAME LIKE ?";
import org.jkiss.dbeaver.DBDatabaseException;


            }

            baseSQL.append("(TEXT LIKE ? OR ");

                    }
        if (schema == null && !params.isGlobalSearch()) {
import org.jkiss.dbeaver.Log;
                while (dbResult.next()) {
        for (Character letter : listChars) {
            super(objectName, dataSource, null, DB2Schema.class, objectType);
        }
    @Override

                    }
                if (schema == null) {
        return SUPP_OBJ_TYPES;
                DB2Schema db2Schema = (DB2Schema) container;
            if (notFirst) {
        }
 * @author Denis Forveille
import org.jkiss.dbeaver.ext.db2.model.*;

        return HYPER_LINKS_TYPES;
            if (isNeedSearchSchemas) {
        }
                    db2Schema = dataSource.getSchema(session.getProgressMonitor(), schemaName);

        StringBuilder sb = new StringBuilder(64);
    // -----------------
                        break;
            DB2TableType tableType;
            }
        }
        DB2ObjectType.MQT, DB2ObjectType.NICKNAME, DB2ObjectType.COLUMN, DB2ObjectType.ROUTINE, DB2ObjectType.SCHEMA };
    private static final DBSObjectType[] HYPER_LINKS_TYPES = { DB2ObjectType.ALIAS, DB2ObjectType.TABLE, DB2ObjectType.VIEW,
            return null;
        }

 *
                    objectName = JDBCUtils.safeGetString(dbResult, "TABNAME");
            }
    }

        }
    public boolean supportsSearchInDefinitionsFor(@NotNull DBSObjectType objectType) {
                        objects.add(new DB2ObjectReference(columnName, db2Table, DB2ObjectType.COLUMN));
        if (db2ObjectTypes.contains(DB2ObjectType.ROUTINE)) {
    // -----------------
    }
            sb.append("'");
                }
            super(objectName, db2Table, null, DB2Table.class, objectType);
import org.jkiss.dbeaver.model.struct.DBSStructureAssistant;
                            objects.add(new DB2ObjectReference(columnName, db2View, DB2ObjectType.COLUMN));
                    db2Schema = dataSource.getSchema(session.getProgressMonitor(), schemaName);
                notFirst = true;
            if (container instanceof DB2Schema) {
                    objects.add(new DB2ObjectReference(objectName, db2Schema, objectType));
        try (JDBCPreparedStatement dbStat = session.prepareStatement(sql)) {
        }
    public List<DBSObjectReference> findObjectsByMask(@NotNull DBRProgressMonitor monitor, @NotNull DB2ExecutionContext executionContext,
                return object;

            sb.append("'");
            if (schema != null) {
    private final DB2DataSource dataSource;
    @Override


            }

                    tableOrViewName = JDBCUtils.safeGetString(dbResult, "TABNAME");
        } else {

                    if (db2Table != null) {


/*
            }
        sql += LF + WITH_UR;
 * DBeaver - Universal Database Manager
    @Override

                listChars.add(DB2TableType.V.name().charAt(0));
import org.jkiss.dbeaver.model.struct.DBSObject;
                if (object == null) {
                DB2Table db2Table = (DB2Table) container;


                dbStat.setString(n++, mask);
            dbStat.setFetchSize(DBConstants.METADATA_FETCH_SIZE);

                    columnName = JDBCUtils.safeGetString(dbResult, "COLNAME");
        SQL_COLS_ALL = sb.toString();

        int maxResults, List<DBSObjectReference> objects, int nbResults) throws SQLException, DBException
    private static final DBSObjectType[] SUPP_OBJ_TYPES = { DB2ObjectType.ALIAS, DB2ObjectType.TABLE, DB2ObjectType.VIEW,
            }
        return String.format(baseStatement, sb.toString());
            return false;
                    }
            }
 * limitations under the License.
        {
        if (schema != null) {
        sb.append("  FROM SYSCAT.COLUMNS");
            if (container instanceof DB2Table) {
        DB2Schema schema = params.getParentObject() instanceof DB2Schema ? (DB2Schema) params.getParentObject() : null;
import java.sql.SQLException;
            String tableSchemaName;
                        break;
    }
            DBSObject container = getContainer();
                if (object == null) {
            throw new DBDatabaseException(ex, dataSource);
    }
            if (container instanceof DB2DataSource) {
            }
            DB2ObjectType objectType;

                    } else {
                query.append("\n\tAND TABSCHEMA = ?");
import org.jkiss.dbeaver.model.sql.SQLConstants;
        private DB2ObjectReference(String objectName, DB2Table db2Table, DB2ObjectType objectType)
                listChars.add(DB2TableType.T.name().charAt(0));
            String columnName;
        List<Character> listChars = new ArrayList<>(objectTypes.size());
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {
            }
import org.jkiss.dbeaver.model.DBConstants;
                                        @NotNull Collection<? super DBSObjectReference> objects,

                    if (nbResults++ >= maxResults) {
    private static final String WITH_UR = "WITH UR";
            }
            dbStat.setString(n++, mask);
                    if (session.getProgressMonitor().isCanceled()) {
            if (container instanceof DB2View) {
        // fixme to refactor code below to single query is better, probably
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        }
                        continue;
                        continue;


import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        String searchObjectNameMask = params.getMask();
        private DB2ObjectReference(String objectName, DB2View db2View, DB2ObjectType objectType)
                DBSObject object = db2ObjectType.findObject(monitor, db2Table, objectName);
            || objectType == DB2ObjectType.NICKNAME
        // Columns
                DBSObject object = db2ObjectType.findObject(monitor, db2Schema, objectName);
        baseSQL.append(LF + WITH_UR);
import org.jkiss.dbeaver.model.struct.DBSObjectType;
            }
        return db2ObjectType == DB2ObjectType.ROUTINE || isTable(db2ObjectType);
    // --------------

    {
                    dbStat.setString(n++, schema.getName());
                        }
    private static final String SQL_COLS_ALL;
    @Override

            StringBuilder query = new StringBuilder("\nUNION ALL\nSELECT\n\tt.TABSCHEMA,\n\tt.TABNAME,\n\tt.\"TYPE\"\nFROM\n\t\"SYSIBM\".SYSVIEWS v\n" +
    }
 * you may not use this file except in compliance with the License.
                    objects.add(new DB2ObjectReference(objectName, db2Schema, DB2ObjectType.ROUTINE));
    }
            String tableOrViewName;
    @NotNull

    }
    private static final Log LOG = Log.getLog(DB2StructureAssistant.class);
        if (!params.isCaseSensitive()) {
                        continue;
        return objectType == DB2ObjectType.ALIAS
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
        int n = 1;

                "INNER JOIN SYSCAT.TABLES t ON\n\tv.NAME = t.TABNAME\nWHERE\n\tv.TEXT LIKE ?\n\tAND TYPE IN (%s)");
 */

                    if (session.getProgressMonitor().isCanceled()) {
    private void searchRoutines(@NotNull JDBCSession session, @Nullable DBPNamedObject schema, @NotNull String mask,
                return object;
                }

            dbStat.setString(n++, mask);

            schema = executionContext.getContextDefaults().getDefaultSchema();
            sql =
    static {


                }
        SQL_COLS_SCHEMA = sb.toString();
        String sql;
            return searchAllObjects(session, schema, db2ObjectTypes, params);
        if (isNeedSearchSchemas) {
                    tableSchemaName = JDBCUtils.safeGetStringTrimmed(dbResult, "TABSCHEMA");
                    if (DB2ObjectType.SCHEMA.toString().equals(typeObjectFromResultSet)) {
        String sql;
    // Helper Classes
        private DB2ObjectReference(String objectName, DB2Schema db2Schema, DB2ObjectType objectType)
            DB2ObjectType db2ObjectType = (DB2ObjectType) getObjectType();
 * Unless required by applicable law or agreed to in writing, software
                                        @NotNull List<DB2ObjectType> db2ObjectTypes, int maxResults,

        baseSQL.append("ROUTINENAME LIKE ?");
        sb.setLength(0);
                                @NotNull List<DB2ObjectType> db2ObjectTypes, int maxResults, Collection<? super DBSObjectReference> objects,
 * Copyright (C) 2010-2024 DBeaver Corp and others
        {
            String schemaName;

            }
            dbStat.setFetchSize(DBConstants.METADATA_FETCH_SIZE);
                    db2Schema = dataSource.getSchema(session.getProgressMonitor(), tableSchemaName);
                listChars.add(DB2TableType.H.name().charAt(0));
import org.jkiss.utils.CommonUtils;
        }
        sb.append(" WITH UR");
 *
    {
        }
    // --------------
                        objects.add(new DB2ObjectReference(schemaName, dataSource, DB2ObjectType.SCHEMA));
import org.jkiss.code.NotNull;
        int n = 1;
            }
            }



        // Routines
import org.jkiss.dbeaver.model.impl.struct.RelationalObjectType;
            || objectType == DB2ObjectType.MQT;
        }

            baseSQL.append(")");
 * DB2 Structure Assistant
import org.jkiss.code.Nullable;
            dbStat.setFetchSize(DBConstants.METADATA_FETCH_SIZE);
    // Method Interface
    }
                    }
            }
 */
        sb.append(" WITH UR");

            if (nbResults >= maxResults) {
                        break;
                listChars.add(DB2TableType.U.name().charAt(0));
                        if (db2View != null) {
                return object;

    private class DB2ObjectReference extends AbstractObjectReference<DBSObject> {
        DB2ObjectType.MQT, DB2ObjectType.NICKNAME, DB2ObjectType.ROUTINE, };
        boolean isNeedSearchSchemas = db2ObjectTypes.contains(DB2ObjectType.SCHEMA);
}
        for (DB2ObjectType objectType : objectTypes) {
    private void searchTablesAndSchemas(@NotNull JDBCSession session, @Nullable DBPNamedObject schema, @NotNull String mask,
                    if (nbResults++ >= maxResults) {
                listChars.add(DB2TableType.G.name().charAt(0));
            }
        }
                    objectName = JDBCUtils.safeGetString(dbResult, "ROUTINENAME");
import java.util.ArrayList;
                        continue;
            sb.append(letter);
        private DB2ObjectReference(String objectName, DBPDataSource dataSource, DB2ObjectType objectType) {
    private static final DBSObjectType[] AUTOC_OBJ_TYPES = { DB2ObjectType.ALIAS, DB2ObjectType.TABLE, DB2ObjectType.VIEW,
    public DBSObjectType[] getSearchObjectTypes() {

                }
                "SELECT TABSCHEMA,TABNAME,TYPE FROM SYSCAT.TABLES\n" +
        // Tables, Alias, Views, Nicknames, MQT
    // -----------------
            if (schema != null) {
            sql = SQL_COLS_ALL;
            if (searchInDefinitions) {
        }
    }
                    if (db2Schema == null) {
            DB2Table db2Table;
        if (searchInDefinitions) {

        try (JDBCPreparedStatement dbStat = session.prepareStatement(sql)) {
        try (JDBCPreparedStatement dbStat = session.prepareStatement(sql)) {
    public DB2StructureAssistant(DB2DataSource dataSource)

            || objectType == DB2ObjectType.TABLE
                DBSObject object = db2ObjectType.findObject(monitor, db2View, objectName);
        return objects;
        {
        List<DB2ObjectType> db2ObjectTypes = new ArrayList<>(params.getObjectTypes().length);
            String typeObjectFromResultSet;
        }
            }



    private static final String SQL_COLS_SCHEMA;

        for (DBSObjectType dbsObjectType : params.getObjectTypes()) {
                    }
                    objectType = tableType.getDb2ObjectType();
    private String buildTableSQL(String baseStatement, List<DB2ObjectType> objectTypes)
                params.isSearchInDefinitions());
    }
                db2ObjectTypes.add(DB2ObjectType.ROUTINE);
import org.jkiss.dbeaver.model.struct.DBSObjectReference;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        sb.append("  FROM SYSCAT.COLUMNS");
                                                      @NotNull ObjectsSearchParams params) throws SQLException, DBException {
                        LOG.trace("Schema '" + tableSchemaName + "' not found. Probably was filtered");
    // -----------------

        int n = 1;


import java.util.Collection;
            if (objectType.equals(DB2ObjectType.TABLE)) {
                dbStat.setString(n, mask);
        }
                "SELECT TABSCHEMA,TABNAME,TYPE FROM SYSCAT.TABLES\n" +
            if (searchInDefinitions) {


        sb.append("   AND COLNAME LIKE ?");
                    throw new DBException(db2ObjectType + " '" + objectName + "' not found in schema '" + db2Schema.getName() + "'");
 * 
    // Helpers
        return getSupportedObjectTypes();
                    }

        @Override

    // TODO DF: Work in progess
                dbStat.setString(n++, schema.getName());
                        LOG.trace("Schema '" + schemaName + "' not found. Probably was filtered");
            String objectName = getName();
            }
            if (objectType.equals(DB2ObjectType.ALIAS)) {
        DB2ObjectType db2ObjectType = (DB2ObjectType) objectType;

            DB2View db2View;
    // -----------------
            super(objectName, db2Schema, null, DB2Schema.class, objectType);
                                        int nbResults, boolean searchInDefinitions) throws SQLException, DBException {
            if (schema != null) {
            if (nbResults >= maxResults) {
    private static final String LF = "\n";
    }
    public DBSObjectType[] getHyperlinkObjectTypes()
            sql += "\nUNION ALL " +

            SQLConstants.KEYWORD_WHERE + LF);
    @NotNull
    }
        List<DBSObjectReference> objects = new ArrayList<>();
import org.jkiss.dbeaver.DBException;

                }
        if (searchInDefinitions) {
                    if (db2Schema == null) {
            }

                    }

            try (JDBCResultSet dbResult = dbStat.executeQuery()) {

        if (db2ObjectTypes.contains(DB2ObjectType.COLUMN)) {
        sql = buildTableSQL(sql, db2ObjectTypes);
    @Override
                }
                "WHERE TABNAME LIKE ? AND TYPE IN (%s)";
                        LOG.trace("Schema '" + schemaName + "' not found. Probably was filtered");

        try (JDBCSession session = executionContext.openSession(monitor, DBCExecutionPurpose.META, "Find objects by name")) {
            sql = SQL_COLS_SCHEMA;
            } else {
                    }
        } catch (SQLException ex) {
        int maxResults = params.getMaxResults();
                }
