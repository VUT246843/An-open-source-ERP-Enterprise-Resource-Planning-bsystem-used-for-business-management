                }
                + "LEFT OUTER JOIN pg_catalog.pg_description d ON d.objoid=n.oid AND d.objsubid=0 AND d.classoid='pg_namespace'::regclass\n");
        return new GaussDBSchema(owner, name, resultSet);
        checkPackageSupport(monitor);

            } catch (SQLException e) {

    }
        @NotNull

 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.meta.Property;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    public void checkPackageSupport(DBRProgressMonitor monitor) {

import org.jkiss.dbeaver.ext.postgresql.model.PostgreTablespace;
    @Property(viewable = true, order = 7)
        return isPackageSupported;
    @Property(viewable = true, order = 6)
     *            is package supported
        @Override
            String name = JDBCUtils.safeGetString(resultSet, "nspname");
 * DBeaver - Universal Database Manager
        init(dbResult);
        return this.characterType;
    protected GaussDBDatabase(DBRProgressMonitor monitor, GaussDBDataSource dataSource, String databaseName) throws DBException {
 *
    private String characterType;
    }
        try (JDBCSession session = getMetaContext().openSession(monitor, DBCExecutionPurpose.META, "Load database info")) {

import org.jkiss.dbeaver.ext.postgresql.model.PostgreRole;
    }
 *
package org.jkiss.dbeaver.ext.gaussdb.model;
    protected GaussDBDatabase(DBRProgressMonitor monitor, GaussDBDataSource dataSource, ResultSet dbResult) throws DBException {

        super(monitor, dataSource, databaseName);
     * 
import org.jkiss.dbeaver.ext.postgresql.model.PostgreCharset;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectLookupCache;
                return null;

    public GaussDBSchema createSchemaImpl(@NotNull PostgreDatabase owner, @NotNull String name,
        setPackageSupported("Oracle".equalsIgnoreCase(DBCompatibilityEnum.queryTextByValue(this.databaseCompatibleMode)));
                    if (dbResult.nextRow()) {
            return owner.createSchemaImpl(owner, name, resultSet);

        }
        this.databaseCompatibleMode = JDBCUtils.safeGetString(dbResult, "datcompatibility");

        return super.getObjectId();
 *     http://www.apache.org/licenses/LICENSE-2.0
    private String databaseCompatibleMode;
    /**
            @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
        this.monitor = monitor;
 * Unless required by applicable law or agreed to in writing, software
     */
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;
    }
        this.monitor = monitor;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    }
     * @return is package supported
 * You may obtain a copy of the License at
    }
                    }
    /**
public class GaussDBDatabase extends PostgreDatabase {
    }
     * 

    public GaussDBSchema createSchemaImpl(@NotNull PostgreDatabase owner, @NotNull String name, @Nullable PostgreRole postgreRole) {

     */
    private void init(ResultSet dbResult) {
     * set package supported

        this.monitor = monitor;
     */
     * @param isPackageSupported
    public String getDatabaseCompatibleMode() {
    }
            return dbStat;

        this.databaseCompatibleMode = databaseCompatibleMode;
    public void readDatabaseInfo(DBRProgressMonitor monitor) throws DBCException {
    

 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
        String templateName, PostgreTablespace tablespace, PostgreCharset encoding) throws DBException {
    public static class SchemaCache extends JDBCObjectLookupCache<PostgreDatabase, PostgreSchema> {
        return new GaussDBSchema(owner, name, postgreRole);

import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;
    public long getObjectId() {
    /**
    public DBRProgressMonitor getMonitor() {
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
        super(monitor, dataSource, dbResult);
        checkPackageSupport(monitor);
     * is package supported
    @Property(viewable = true, order = 1)
    public void setPackageSupported(boolean isPackageSupported) {
    @Override
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.DBException;
            JDBCPreparedStatement dbStat = session.prepareStatement(catalogQuery.toString());
import java.sql.ResultSet;
    }
    @Override
    }
        }


        checkInstanceConnection(monitor);
    @Override
}
     */
        protected PostgreSchema fetchObject(@NotNull JDBCSession session, @NotNull PostgreDatabase owner,
            }
 *
                dbStat.setString(1, super.getName());
    }
     * Character Type
    @NotNull
        public JDBCStatement prepareLookupStatement(@NotNull JDBCSession session, @NotNull PostgreDatabase database,
    }

            StringBuilder catalogQuery = new StringBuilder("SELECT n.oid,n.*,d.description FROM pg_catalog.pg_namespace n\n"
        return monitor;
            catalogQuery.append(" ORDER BY nspname");
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSchema;
    @Override
        @NotNull JDBCResultSet resultSet) throws SQLException {
import org.jkiss.code.Nullable;
    public GaussDBDataSource getDataSource() {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            @Nullable PostgreSchema object, @Nullable String objectName) throws SQLException {
        return (GaussDBDataSource) dataSource;
    }
    private boolean isPackageSupported;
                        init(dbResult);
        @Override
                .prepareStatement("SELECT db.oid,db.* FROM pg_catalog.pg_database db WHERE datname=?")) {
                throw new DBCException(e, session.getExecutionContext());
 * limitations under the License.
    public boolean isPackageSupported() {
    public void setDatabaseCompatibleMode(String databaseCompatibleMode) {


            try (JDBCPreparedStatement dbStat = session
    }
import org.jkiss.dbeaver.model.exec.DBCException;
    /**
            if (name == null) {
        this.characterType = JDBCUtils.safeGetString(dbResult, "datctype");
import org.jkiss.code.NotNull;
        readDatabaseInfo(monitor);
    protected GaussDBDatabase(DBRProgressMonitor monitor, GaussDBDataSource dataSource, String name, PostgreRole owner,
/*
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;


    public String getCharacterType() {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
            }
import java.sql.SQLException;
 */
 * Licensed under the Apache License, Version 2.0 (the "License");

        this.isPackageSupported = isPackageSupported;
        return this.databaseCompatibleMode;
    private DBRProgressMonitor monitor;
        }
     * dataBase Compatibility Mode
        super(monitor, dataSource, name, owner, templateName, tablespace, encoding);

