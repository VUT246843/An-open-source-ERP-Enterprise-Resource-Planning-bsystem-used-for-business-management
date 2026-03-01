
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;

        }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    
        }
        @NotNull
        super(database, name, owner);
        protected GaussDBPackage fetchObject(@NotNull JDBCSession session, @NotNull GaussDBSchema owner,
                + " as arg_defaults,d.description\n" + "FROM pg_catalog." + serverType.getProceduresSystemTable() + " p\n"
    @Override
    }
    public GaussDBSchema(PostgreDatabase owner, String name, JDBCResultSet resultSet) throws SQLException {
        this.packageCache = new PackageCache();
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session,


    public boolean isUtility() {
        return this.proceduresCache;
import java.sql.SQLException;
    @Association
public class GaussDBSchema extends PostgreSchema {
 *
            dbStat.setLong(1, owner.getObjectId());
    class PackageCache extends JDBCObjectCache<GaussDBSchema, GaussDBPackage> {
            .filter(e -> e.getPropackageid() == 0 && e.getKind() == PostgreProcedureKind.p).collect(Collectors.toList());
 * Licensed under the Apache License, Version 2.0 (the "License");
                + (session.getDataSource().isServerVersionAtLeast(7, 2) ? " AND d.objsubid = 0" : "") + // no links to columns
        @Override
    public ProceduresCache getGaussDBProceduresCache() {
 * DBeaver - Universal Database Manager
    }
        return this.oid < 16384 && !this.name.toLowerCase(Locale.ENGLISH).contains("public");
        public ProceduresCache() {
        @Override
                "\nWHERE p.pronamespace=?" + (object == null ? "" : " AND p." + oidColumn + "=?") + "\nORDER BY p.proname");
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSchema;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        return list;

    public static class FunctionsCache extends JDBCObjectLookupCache<GaussDBSchema, GaussDBFunction> {
        public JDBCStatement prepareLookupStatement(@NotNull JDBCSession session, @NotNull GaussDBSchema owner,
            PostgreServerExtension serverType = owner.getDataSource().getServerType();
                "\nWHERE p.pronamespace=?" + (object == null ? "" : " AND p." + oidColumn + "=?") + "\nORDER BY p.proname");
    public static class ProceduresCache extends JDBCObjectLookupCache<GaussDBSchema, GaussDBProcedure> {
import org.jkiss.code.NotNull;
        return packageCache.getAllObjects(monitor, this);
            super();
            .filter(e -> e.getPropackageid() == 0 && e.getKind() == PostgreProcedureKind.f).collect(Collectors.toList());


        List<GaussDBProcedure> list = getGaussDBProceduresCache().getAllObjects(monitor, this).stream()
    }

    public GaussDBSchema(PostgreDatabase database, String name, PostgreRole owner) {
        this.functionsCache = new FunctionsCache();
    public List<GaussDBPackage> getPackages(DBRProgressMonitor monitor) throws DBException {
import java.util.stream.Collectors;
        @Override
    private final FunctionsCache functionsCache;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
    public List<GaussDBProcedure> getGaussDBProcedures(DBRProgressMonitor monitor) throws DBException {
 * you may not use this file except in compliance with the License.
        }
 * limitations under the License.
                + "LEFT OUTER JOIN pg_catalog.pg_description d ON d.objoid=p." + oidColumn
    }
        return false;
        protected GaussDBProcedure fetchObject(@NotNull JDBCSession session, @NotNull GaussDBSchema owner,
            return dbStat;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            String oidColumn = serverType.getProceduresOidColumn(); // Hack for Redshift SP support


            return new GaussDBProcedure(session.getProgressMonitor(), owner, dbResult);
            if (object != null) {

        @NotNull
    }
            if (object != null) {
        this.proceduresCache = new ProceduresCache();
/*
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;
    }
        return false;
            @NotNull JDBCResultSet dbResult) throws SQLException, DBException {
            JDBCPreparedStatement dbStat = session.prepareStatement("SELECT p." + oidColumn + " as poid,p.*,"
import org.jkiss.dbeaver.model.meta.Association;
            }
        }
        @Override
    @Association
            super();
                .prepareStatement("select g.oid, g.pkgnamespace, g.pkgname as name from gs_package g where g.pkgnamespace = ?");
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.Nullable;
 * See the License for the specific language governing permissions and
}
        @Override
package org.jkiss.dbeaver.ext.gaussdb.model;
    }
    }

        public FunctionsCache() {
            JDBCPreparedStatement dbStat = session.prepareStatement("SELECT p." + oidColumn + " as poid,p.*,"
                + (session.getDataSource().isServerVersionAtLeast(8, 4) ? "pg_catalog.pg_get_expr(p.proargdefaults, 0)" : "NULL")
                + " as arg_defaults,d.description\n" + "FROM pg_catalog." + serverType.getProceduresSystemTable() + " p\n"
            PostgreServerExtension serverType = owner.getDataSource().getServerType();
            @NotNull GaussDBSchema owner) throws SQLException {
 *
        this.packageCache = new PackageCache();
    }
            }
        public JDBCStatement prepareLookupStatement(@NotNull JDBCSession session, @NotNull GaussDBSchema owner,
        }
                + (session.getDataSource().isServerVersionAtLeast(7, 2) ? " AND d.objsubid = 0" : "") + // no links to columns
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public FunctionsCache getGaussDBFunctionsCache() {
                + "LEFT OUTER JOIN pg_catalog.pg_description d ON d.objoid=p." + oidColumn



            @Nullable GaussDBProcedure object, @Nullable String objectName) throws SQLException {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectLookupCache;
        @NotNull
    public static boolean isUtilitySchema(String schema) {
            return new GaussDBFunction(session.getProgressMonitor(), owner, dbResult);
                dbStat.setLong(2, object.getObjectId());

        return this.functionsCache;
import org.jkiss.dbeaver.DBException;
            return dbStat;
            @NotNull JDBCResultSet dbResult) throws SQLException, DBException {
    private final ProceduresCache proceduresCache;
    @Association
    public List<GaussDBFunction> getGaussDBFunctions(DBRProgressMonitor monitor) throws DBException {
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    public final PackageCache packageCache;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
        @Override

        this.proceduresCache = new ProceduresCache();
        }
        }
    public boolean isSystem() {
        return list;
            return dbStat;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreRole;
    }

            return new GaussDBPackage(session, owner, dbResult);
import org.jkiss.dbeaver.ext.postgresql.model.PostgreProcedureKind;
        protected GaussDBFunction fetchObject(@NotNull JDBCSession session, @NotNull GaussDBSchema owner,
    }


            String oidColumn = serverType.getProceduresOidColumn(); // Hack for Redshift SP support
                + (session.getDataSource().isServerVersionAtLeast(8, 4) ? "pg_catalog.pg_get_expr(p.proargdefaults, 0)" : "NULL")
            dbStat.setLong(1, GaussDBSchema.this.getObjectId());
import org.jkiss.dbeaver.ext.postgresql.model.PostgreServerExtension;
            dbStat.setLong(1, owner.getObjectId());
 */
            @NotNull JDBCResultSet dbResult) throws SQLException, DBException {
        super(owner, name, resultSet);
        this.functionsCache = new FunctionsCache();


        List<GaussDBFunction> list = getGaussDBFunctionsCache().getAllObjects(monitor, this).stream()
            @Nullable GaussDBFunction object, @Nullable String objectName) throws SQLException {
 *

            final JDBCPreparedStatement dbStat = session



import java.util.List;
        }
                dbStat.setLong(2, object.getObjectId());
import java.util.Locale;
