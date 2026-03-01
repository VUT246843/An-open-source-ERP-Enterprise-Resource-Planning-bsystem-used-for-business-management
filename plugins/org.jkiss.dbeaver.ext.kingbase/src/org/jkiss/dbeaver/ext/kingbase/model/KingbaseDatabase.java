 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
                @NotNull JDBCResultSet dbResult) throws SQLException, DBException {
    }


                @NotNull PostgreDatabase owner, 
            String name = JDBCUtils.safeGetString(resultSet, "nspname");
            String templateName, 
            KingbaseDataSource dataSource, 
        checkInstanceConnection(monitor);

        @Override
            try (JDBCPreparedStatement dbStat = session
        }
        readDatabaseInfo(monitor);
    

    @Override
            KingbaseDataSource dataSource, 
            return dbStat;
                .prepareStatement("SELECT db.oid,db.* FROM sys_catalog.sys_database db WHERE datname=?")) {

    }

        return monitor;
        @Override
            catalogQuery.append(" ORDER BY nspname");
            String name, 

        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, 
    
            JDBCPreparedStatement dbStat = session.prepareStatement(catalogQuery.toString());

        protected PostgreLanguage fetchObject(@NotNull JDBCSession session, 

import org.jkiss.dbeaver.ext.postgresql.model.PostgreRole;
        return (KingbaseDataSource) dataSource;
import org.jkiss.dbeaver.model.meta.Property;
        checkInstanceConnection(monitor);
               @NotNull PostgreDatabase owner) throws SQLException {
                @NotNull JDBCResultSet resultSet) throws SQLException, DBException {


        return languageCache.getAllObjects(monitor, this);
        languageCache.clearCache();
import org.jkiss.dbeaver.model.struct.DBSObject;
        this.monitor = monitor;
    @Override
            }
                + "d.objsubid=0 AND d.classoid='sys_namespace'::regclass\n");
public class KingbaseDatabase extends PostgreDatabase {
 * Licensed under the Apache License, Version 2.0 (the "License");
            String databaseName) throws DBException {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
}
        @NotNull

    public Collection<PostgreLanguage> getLanguages(DBRProgressMonitor monitor) throws DBException {
        this.databaseCompatibleMode = databaseCompatibleMode;
import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectLookupCache;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.ext.kingbase.model;
        this.monitor = monitor;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    private String characterType;
    
    }
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
                @Nullable PostgreSchema object, 
    protected KingbaseDatabase(DBRProgressMonitor monitor, 
    }
    public static class LanguageCache extends PostgreDatabaseJDBCObjectCache<PostgreLanguage> {
        super(monitor, dataSource, name, owner, templateName, tablespace, encoding);
    @Property(viewable = true, order = 1)
    @Override
    @Property(viewable = true, order = 7)
 * limitations under the License.
                @NotNull PostgreDatabase owner, 
            @Nullable PostgreRole postgreRole) {
            } catch (SQLException e) {
    private String databaseCompatibleMode;
                }
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSchema;
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {

                    if (dbResult.nextRow()) {
                dbStat.setString(1, super.getName());
            return new PostgreLanguage(owner, dbResult);
                + "LEFT OUTER JOIN sys_catalog.sys_description d ON d.objoid=n.oid AND " 
        return new KingbaseSchema(owner, name, postgreRole);
        try (JDBCSession session = getMetaContext().openSession(monitor, DBCExecutionPurpose.META, "Load database info")) {

            PostgreTablespace tablespace, 
    private DBRProgressMonitor monitor;

    
 *
        public JDBCStatement prepareLookupStatement(@NotNull JDBCSession session, 
 * See the License for the specific language governing permissions and

import org.jkiss.dbeaver.model.exec.DBCException;
        @NotNull
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;
        return super.getObjectId();
import java.sql.ResultSet;
        return this;

            KingbaseDataSource dataSource, 
    public KingbaseDataSource getDataSource() {

            return owner.createSchemaImpl(owner, name, resultSet);
            StringBuilder catalogQuery = new StringBuilder("SELECT n.oid,n.*,d.description FROM sys_catalog.sys_namespace n\n"
 * Unless required by applicable law or agreed to in writing, software
    @Override
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTablespace;
    
            PostgreCharset encoding) throws DBException {
                throw new DBCException(e, session.getExecutionContext());

    }
import org.jkiss.dbeaver.ext.postgresql.model.PostgreCharset;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        
        return this.characterType;
 *
    }
            @NotNull String name, 
    }
import org.jkiss.dbeaver.ext.postgresql.model.PostgreLanguage;
import org.jkiss.dbeaver.DBException;
        return new KingbaseSchema(owner, name, resultSet);
        this.characterType = JDBCUtils.safeGetString(dbResult, "datctype");
                "SELECT l.oid,l.* FROM sys_catalog.sys_language l " +
                return null;
    @Property(viewable = true, order = 6)
        @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
        @Override
                @Nullable String objectName) throws SQLException {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    protected KingbaseDatabase(DBRProgressMonitor monitor, 
        this.monitor = monitor;

        protected PostgreSchema fetchObject(@NotNull JDBCSession session, 
    
            );
    @NotNull
     
        super(monitor, dataSource, databaseName);
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
        @NotNull JDBCResultSet resultSet) throws SQLException {

/*
    public String getCharacterType() {
import java.sql.SQLException;
    public KingbaseSchema createSchemaImpl(@NotNull PostgreDatabase owner, 
    }
    }

        return this.databaseCompatibleMode;
    public KingbaseSchema createSchemaImpl(@NotNull PostgreDatabase owner, @NotNull String name,
    }
 *
        }
        }
    }
    private void init(ResultSet dbResult) {
            PostgreRole owner, 
    public String getDatabaseCompatibleMode() {
        super(monitor, dataSource, dbResult);

        super.refreshObject(monitor);
import org.jkiss.code.Nullable;
    public DBRProgressMonitor getMonitor() {
    }
import java.util.Collection;
    }
                    "\nORDER BY l.oid"
    }
 */
                        init(dbResult);
    public void readDatabaseInfo(DBRProgressMonitor monitor) throws DBCException {
            if (name == null) {
    public void setDatabaseCompatibleMode(String databaseCompatibleMode) {
        this.databaseCompatibleMode = JDBCUtils.safeGetString(dbResult, "datcompatibility");
                @NotNull PostgreDatabase database, 
 * You may obtain a copy of the License at
            ResultSet dbResult) throws DBException {
 * you may not use this file except in compliance with the License.
    @Override
    public long getObjectId() {

    public static class SchemaCache extends JDBCObjectLookupCache<PostgreDatabase, PostgreSchema> {
            return session.prepareStatement(
    final LanguageCache languageCache = new LanguageCache();
            }
    protected KingbaseDatabase(DBRProgressMonitor monitor, 
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        init(dbResult);
                    }
