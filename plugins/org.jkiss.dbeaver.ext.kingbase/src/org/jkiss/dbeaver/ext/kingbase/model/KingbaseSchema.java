 *
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
                dbStat.setLong(2, object.getObjectId());
 *
        public ProceduresCache() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public boolean isSystem() {

        }

    @Association
            @Nullable KingbaseProcedure object, @Nullable String objectName) throws SQLException {
 * Unless required by applicable law or agreed to in writing, software
                tableName = serverType.getProceduresSystemTable();
            JDBCPreparedStatement dbStat = session.prepareStatement("SELECT p." + oidColumn + " as poid,p.*,"
            PostgreServerExtension serverType = owner.getDataSource().getServerType();
            dbStat.setLong(1, owner.getObjectId());
            return dbStat;
            .filter(e -> e.getPropackageid() == 0 && e.getKind() == PostgreProcedureKind.p).collect(Collectors.toList());
import org.jkiss.dbeaver.ext.postgresql.model.PostgreProcedureKind;
            }
        @NotNull
        public JDBCStatement prepareLookupStatement(@NotNull JDBCSession session, @NotNull KingbaseSchema owner,
            return dbStat;
            super();
        protected KingbaseFunction fetchObject(@NotNull JDBCSession session, @NotNull KingbaseSchema owner,
        this.proceduresCache = new ProceduresCache();
        return this.oid < systemOid && !this.name.toLowerCase(Locale.ENGLISH).contains("public");
        }
    }
 * limitations under the License.
                + " AND d.objsubid = 0" + // no links to columns
    private final ProceduresCache proceduresCache;
            super();
 
            String tableName;

public class KingbaseSchema extends PostgreSchema {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.NotNull;
        @NotNull
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
/*
import org.jkiss.dbeaver.Log;
        this.proceduresCache = new ProceduresCache();


    public FunctionsCache getKingbaseFunctionsCache() {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                + "LEFT OUTER JOIN sys_catalog.sys_description d ON d.objoid=p." + oidColumn
        public JDBCStatement prepareLookupStatement(@NotNull JDBCSession session, @NotNull KingbaseSchema owner,
    public KingbaseSchema(PostgreDatabase owner, String name, JDBCResultSet resultSet) throws SQLException {
    public static boolean isUtilitySchema(String schema) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
            return new KingbaseProcedure(session.getProgressMonitor(), owner, dbResult);
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectLookupCache;
import java.util.Locale;
    }
            if (object != null) {
            if (serverType.getProceduresSystemTable().contains("pg_")) {
    private final FunctionsCache functionsCache;
            .filter(e -> e.getPropackageid() == 0 && e.getKind() == PostgreProcedureKind.f).collect(Collectors.toList());

import org.jkiss.code.Nullable;
    public boolean isUtility() {
package org.jkiss.dbeaver.ext.kingbase.model;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;
        return this.functionsCache;
    }
            @NotNull JDBCResultSet dbResult) throws SQLException, DBException {
    }
            }
import java.util.stream.Collectors;
        protected KingbaseProcedure fetchObject(@NotNull JDBCSession session, @NotNull KingbaseSchema owner,
                + " AND d.objsubid = 0" + // no links to columns
        @Override
            if (object != null) {
        this.functionsCache = new FunctionsCache();
                + " as arg_defaults,d.description\n" + "FROM sys_catalog." + tableName + " p\n"
    public static class ProceduresCache extends JDBCObjectLookupCache<KingbaseSchema, KingbaseProcedure> {
            PostgreServerExtension serverType = owner.getDataSource().getServerType();
        super(owner, name, resultSet);
    
        return list;
    }
    @Override
            String tableName;
        }
            }
                tableName = serverType.getProceduresSystemTable().replaceAll("pg_", "sys_");
    }
            String oidColumn = serverType.getProceduresOidColumn(); // Hack for Redshift SP support
 *     http://www.apache.org/licenses/LICENSE-2.0
                tableName = serverType.getProceduresSystemTable().replaceAll("pg_", "sys_");

 * you may not use this file except in compliance with the License.
                dbStat.setLong(2, object.getObjectId());
            String oidColumn = serverType.getProceduresOidColumn(); // Hack for Redshift SP support
    }
 */
    public KingbaseSchema(PostgreDatabase database, String name, PostgreRole owner) {
        List<KingbaseProcedure> list = getKingbaseProceduresCache().getAllObjects(monitor, this).stream()
import java.sql.SQLException;

        }

        return false;
    public List<KingbaseProcedure> getKingbaseProcedures(DBRProgressMonitor monitor) throws DBException {
    }
            
import org.jkiss.dbeaver.ext.postgresql.model.PostgreRole;

        @Override
        }

        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return false;
        super(database, name, owner);
        return list;
        List<KingbaseFunction> list = getKingbaseFunctionsCache().getAllObjects(monitor, this).stream()
    }
            @NotNull JDBCResultSet dbResult) throws SQLException, DBException {


 * See the License for the specific language governing permissions and
            JDBCPreparedStatement dbStat = session.prepareStatement("SELECT p." + oidColumn + " as poid,p.*,"
    public long systemOid = 16384;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSchema;
            }
            return new KingbaseFunction(session.getProgressMonitor(), owner, dbResult);
            if (serverType.getProceduresSystemTable().contains("pg_")) {
    


        this.functionsCache = new FunctionsCache();
    @Association
            } else {
            } else {
                + "sys_catalog.sys_get_expr(p.proargdefaults, 0)"
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
import org.jkiss.dbeaver.DBException;
 * Licensed under the Apache License, Version 2.0 (the "License");

    public List<KingbaseFunction> getKingbaseFunctions(DBRProgressMonitor monitor) throws DBException {
import java.util.List;
        @Override
    }
 *


                + " as arg_defaults,d.description\n" + "FROM sys_catalog." + tableName + " p\n"
            @Nullable KingbaseFunction object, @Nullable String objectName) throws SQLException {
        @Override
                + "LEFT OUTER JOIN sys_catalog.sys_description d ON d.objoid=p." + oidColumn
}
            dbStat.setLong(1, owner.getObjectId());
import org.jkiss.dbeaver.ext.postgresql.model.PostgreServerExtension;
                + "sys_catalog.sys_get_expr(p.proargdefaults, 0)"
                "\nWHERE p.pronamespace=?" + (object == null ? "" : " AND p." + oidColumn + "=?") + "\nORDER BY p.proname");
        public FunctionsCache() {

 * DBeaver - Universal Database Manager

    public ProceduresCache getKingbaseProceduresCache() {
                "\nWHERE p.pronamespace=?" + (object == null ? "" : " AND p." + oidColumn + "=?") + "\nORDER BY p.proname");
    public static class FunctionsCache extends JDBCObjectLookupCache<KingbaseSchema, KingbaseFunction> {
    }
import org.jkiss.dbeaver.model.meta.Association;
 * You may obtain a copy of the License at
                tableName = serverType.getProceduresSystemTable();

    
        return this.proceduresCache;
