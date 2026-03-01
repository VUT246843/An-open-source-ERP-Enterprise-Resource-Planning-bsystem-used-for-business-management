
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    @Override

        return sourceDefinition;
        @Override
        return true;

    protected long ownerId;

                this.sourceDefinition = JDBCUtils.safeGetString(dbResult, "src");
 * Copyright (C) 2010-2025 DBeaver Corp and others
            @NotNull JDBCResultSet dbResult) throws SQLException, DBException {
 * You may obtain a copy of the License at
        return schema;
 * you may not use this file except in compliance with the License.
    public GaussDBSchema getSchema() {
    }
    public String getPkgName() {
    public boolean isPersisted() {
        if (oid != 0) {
        try {
import org.jkiss.dbeaver.model.meta.Association;
    public GaussDBPackage(@NotNull JDBCSession session, @NotNull GaussDBSchema schema, @NotNull JDBCResultSet dbResult) {
    @Association
            prepareStatement.setLong(1, objectId);
    }
        this.schema = schema;
            log.error(e);

    public GaussDBDatabase getDatabase() {
import java.util.List;
                                                                                                        // columns

    @Override
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    private String name;

            PostgreServerExtension serverType = owner.getDataSource().getServerType();
            if (dbResult.nextRow()) {
    @NotNull
    }
        this.name = name;
        return this.name;
        if (oid != 0) {
                + " as arg_defaults,d.description\n" + "FROM pg_catalog." + serverType.getProceduresSystemTable() + " p\n"
    public long getObjectId() {
    @NotNull
    @Property(viewable = true, order = 2)
    @Override
            JDBCResultSet dbResult = prepareStatement.executeQuery();
                "\nWHERE p.pronamespace=?" + (object == null ? "" : " AND p." + oidColumn + "=?") + "\nORDER BY p.proname");
        return list;
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    }
            list = getGaussDBProceduresCache().getAllObjects(monitor, this.schema).stream()
 * See the License for the specific language governing permissions and
    }
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectLookupCache;
        } catch (SQLException | DBCException e) {

    private static final Log log = Log.getLog(GaussDBPackage.class);
    private GaussDBSchema schema;
    @Override
    @NotNull
import java.sql.SQLException;
        protected GaussDBProcedure fetchObject(@NotNull JDBCSession session, @NotNull PostgreSchema owner,
            return sourceDeclaration;
        List<GaussDBProcedure> list = new ArrayList<>();

    public GaussDBPackage(GaussDBSchema schema, DBRProgressMonitor unusedMnitor, String name) {
        return this.name;
import org.jkiss.code.NotNull;

    }

    }
        this.proceduresCache = new ProceduresCache();
        JDBCPreparedStatement prepareStatement;
                + (session.getDataSource().isServerVersionAtLeast(7, 2) ? " AND d.objsubid = 0" : "") + // no links to
        }
        this.name = name;
    @Property(hidden = true, editable = true, updatable = true, order = -1)
    }
        }
    @Override
    private void initialize(JDBCSession session, long objectId) {
                .filter(e -> e.getPropackageid() == oid && e.getKind() == PostgreProcedureKind.f).collect(Collectors.toList());
            dbResult = prepareStatement.executeQuery();
        }

 * DBeaver - Universal Database Manager
    public void setName(String name) {

    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
import org.jkiss.dbeaver.model.struct.DBSObject;

    @Override
    public static class ProceduresCache extends JDBCObjectLookupCache<PostgreSchema, GaussDBProcedure> {
    }

        return (GaussDBDataSource) schema.getDataSource();
 * limitations under the License.
public class GaussDBPackage implements PostgreObject, PostgreScriptObject, DBPSystemInfoObject {
    public String getExtendedDefinitionText() {
            }
    public void setObjectDefinitionText(String sourceText) {
/*
    }
    }
    @Override
import org.jkiss.dbeaver.Log;
    }
    }
    }
            prepareStatement.setString(2, "package body");
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    public void setExtendedDefinitionText(String source) {
    }

import org.jkiss.utils.CommonUtils;
        return sourceDeclaration;
    private long oid;
    @Property(viewable = true, order = 1)
    }
            if (object != null) {

        sourceDeclaration = sourceText;
    public DBSObject getParentObject() {
        if (CommonUtils.isEmpty(sourceDefinition)) {
        this.schema = schema;
        }

    @Property(hidden = true, editable = true, updatable = true, order = -1)

        List<GaussDBProcedure> list = new ArrayList<>();
    @Association
        this.sourceDefinition = source;
            }
        @NotNull
        this.oid = JDBCUtils.safeGetLong(dbResult, "oid");
    }
        return this.description;
package org.jkiss.dbeaver.ext.gaussdb.model;
import org.jkiss.dbeaver.model.meta.Property;

        this.description = description;

        return this.oid;
        public JDBCStatement prepareLookupStatement(@NotNull JDBCSession session, @NotNull PostgreSchema owner,
 * distributed under the License is distributed on an "AS IS" BASIS,
        public ProceduresCache() {

        return null;
    public String getDescription() {
            @Nullable GaussDBProcedure object, @Nullable String objectName) throws SQLException {

                dbStat.setLong(2, object.getObjectId());
            dbStat.setLong(1, owner.getObjectId());

            return new GaussDBProcedure(session.getProgressMonitor(), owner, dbResult);
    public String getName() {
            String oidColumn = serverType.getProceduresOidColumn(); // Hack for Redshift SP support
import org.jkiss.dbeaver.ext.postgresql.model.*;
import org.jkiss.dbeaver.model.DBPSystemInfoObject;
            prepareStatement.setString(2, "package");
 */
                .filter(e -> e.getPropackageid() == oid && e.getKind() == PostgreProcedureKind.p).collect(Collectors.toList());
            return dbStat;
        @Override
    }
    @Override

    public GaussDBDataSource getDataSource() {
    public String getObjectDefinitionText() {
    public void setDescription(String description) {
                this.sourceDeclaration = JDBCUtils.safeGetString(dbResult, "src");
                + (session.getDataSource().isServerVersionAtLeast(8, 4) ? "pg_catalog.pg_get_expr(p.proargdefaults, 0)" : "NULL")
        this.name = JDBCUtils.safeGetString(dbResult, "name");
    private String sourceDeclaration = "";
 *
            }
        }
    public List<GaussDBProcedure> getPackageFunctions(DBRProgressMonitor monitor) throws DBException {
                + "LEFT OUTER JOIN pg_catalog.pg_description d ON d.objoid=p." + oidColumn
        }

            prepareStatement = session
            JDBCPreparedStatement dbStat = session.prepareStatement("SELECT p." + oidColumn + " as poid,p.*,"


import java.util.Map;
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
 *
        initialize(session, oid);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
        return this.proceduresCache;
import org.jkiss.dbeaver.model.exec.DBCException;
    @NotNull

        return list;
                .prepareStatement("select pkg.src from DBE_PLDEVELOPER.gs_source pkg where pkg.id = ? and type = ?");
            if (dbResult.nextRow()) {
    @Override


    private final ProceduresCache proceduresCache;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private String sourceDefinition = "";
    private String description;
        }

        this.proceduresCache = new ProceduresCache();
            list = getGaussDBProceduresCache().getAllObjects(monitor, this.schema).stream()
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    }
}
    public List<GaussDBProcedure> getPackageProcedures(DBRProgressMonitor monitor) throws DBException {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.DBException;
        return sourceDeclaration.trim() + "\n" + sourceDefinition;
import java.util.ArrayList;
import java.util.stream.Collectors;
    public ProceduresCache getGaussDBProceduresCache() {
        return (GaussDBDatabase) schema.getDatabase();
            super();
