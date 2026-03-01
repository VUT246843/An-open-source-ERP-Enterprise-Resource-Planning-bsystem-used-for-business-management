}
    public DBPDataSource getDataSource() {
    public Class<? extends DBSObject> getPrimaryChildType(@Nullable DBRProgressMonitor monitor) throws DBException
                    }
    public Collection<? extends DBSObject> getChildren(@NotNull DBRProgressMonitor monitor) throws DBException
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
            return new MySQLProcedure(owner.getCatalog(), dbResult);

            } catch (SQLException e) {
    @Property(viewable = true, order = 1)
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
        @NotNull
import org.jkiss.dbeaver.model.struct.DBSObject;
        return proceduresCache.getAllObjects(monitor, this);
    }
    private String name;
    public void setObjectDefinitionText(String sourceDeclaration)
package org.jkiss.dbeaver.ext.mysql.model;
        this.sourceDeclaration = sourceDeclaration;
        this.sourceDeclaration = null;
    @Property(viewable = true, order = 100)
    }
    @Association
    @Property(hidden = true, editable = true, updatable = true, order = -1)
    static class ProceduresCache extends JDBCObjectCache<MySQLPackage, MySQLProcedure> {
        if (sourceDeclaration == null && monitor != null) {
            dbStat.setString(1, owner.getCatalog().getName());
    {
                throw new DBCException(e, session.getExecutionContext());
        return proceduresCache.getObject(monitor, this, childName);
    @Property(hidden = true, editable = true, updatable = true, order = -1)
        return MySQLProcedure.class;

            try (JDBCPreparedStatement dbStat = session.prepareStatement("SHOW CREATE PACKAGE" + (isBody ? " BODY" : "") + " " + getFullyQualifiedName(DBPEvaluationContext.DML))) {
    @Override
    }
    }
    @NotNull
import org.jkiss.dbeaver.model.meta.Association;
        }
        }
import org.jkiss.code.Nullable;
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBCException
    private boolean persisted;
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public DBSObject getParentObject() {
 *
    @Override
    public boolean isPersisted() {
                "LEFT OUTER JOIN ALL_ARGUMENTS A ON A.OWNER=P.OWNER AND A.PACKAGE_NAME=P.OBJECT_NAME AND A.OBJECT_NAME=P.PROCEDURE_NAME AND A.ARGUMENT_NAME IS NULL AND A.DATA_LEVEL=0\n" +

    @NotNull
                        throw new DBCException("Package '" + getName() + "' not found");
    }
    }
/**
            throws SQLException, DBException
    public void cacheStructure(@NotNull DBRProgressMonitor monitor, int scope) throws DBException
        return DBUtils.getFullQualifiedName(getDataSource(),
    @Override
    @Override
    }

        return proceduresCache.getObject(monitor, this, uniqueName);
import org.jkiss.dbeaver.model.*;
    {

import org.jkiss.dbeaver.model.struct.rdb.DBSPackage;
    @Override
{
        return catalog;
        return this;
    {
    implements DBPScriptObject, DBPScriptObjectExt, DBSObjectContainer, DBPRefreshableObject, DBSProcedureContainer, DBSPackage, DBPQualifiedObject

            getCatalog(),
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        @Override

                    if (dbResult.next()) {
    {
                    } else {
    public String getName() {
    @NotNull
/*
    public MySQLPackage(MySQLCatalog catalog, String name)
    @NotNull
    {
            JDBCPreparedStatement dbStat = session.prepareStatement(
    {
        }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;


    @Override
    }
    }
            }
                }

    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
    }
                "WHERE P.OWNER=? AND P.OBJECT_NAME=?\n" +
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @Override
    {
    @NotNull
    private String sourceDefinition;
 */

        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull MySQLPackage owner)
    public DBSObject getChild(@NotNull DBRProgressMonitor monitor, @NotNull String childName) throws DBException
    @Override
        }
import java.util.Collection;
    private MySQLCatalog catalog;

    public MySQLPackage(
    {
    }
        this.description = JDBCUtils.safeGetString(dbResult, "comment");
    @Override
    public Collection<MySQLProcedure> getProcedures(DBRProgressMonitor monitor) throws DBException
    public String getExtendedDefinitionText(@NotNull DBRProgressMonitor monitor) throws DBException
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
 */
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
    }
import java.sql.ResultSet;
    }
    @Override
 *
public class MySQLPackage
    {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    }

 *
import java.sql.SQLException;
        return name;
        if (sourceDefinition == null && monitor != null) {
        this.name = name;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.meta.Property;
        this.sourceDefinition = null;
    private String description;
    }
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    {
            this);
 * GenericProcedure

        return catalog.getDataSource();
    }
        this.persisted = false;
    {
    public MySQLCatalog getCatalog() {

    }
        this.persisted = true;
 * You may obtain a copy of the License at
        this.name = JDBCUtils.safeGetString(dbResult, "name");
        return catalog;


        this.sourceDefinition = source;
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureContainer;
        return persisted;
        this.catalog = catalog;
    @Override
    }
    private final ProceduresCache proceduresCache = new ProceduresCache();
        {
 * limitations under the License.
    private String readSource(DBRProgressMonitor monitor, boolean isBody) throws DBCException {
    }
                "SELECT P.*,CASE WHEN A.DATA_TYPE IS NULL THEN 'PROCEDURE' ELSE 'FUNCTION' END as PROCEDURE_TYPE FROM ALL_PROCEDURES P\n" +

            dbStat.setString(2, owner.getName());

        return sourceDeclaration;
        this.proceduresCache.clearCache();
 * Unless required by applicable law or agreed to in writing, software
    @Override

        ResultSet dbResult)
        MySQLCatalog catalog,
    public MySQLProcedure getProcedure(DBRProgressMonitor monitor, String uniqueName) throws DBException {
    @Override


import org.jkiss.code.NotNull;
    public void setExtendedDefinitionText(String source)
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
            throws SQLException
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Read package declaration")) {
    private String sourceDeclaration;
            return dbStat;
 * you may not use this file except in compliance with the License.

        {
        this.catalog = catalog;
                "ORDER BY P.PROCEDURE_NAME");
                        return JDBCUtils.safeGetString(dbResult, (isBody ? "Create Package Body" : "Create Package"));
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException
import org.jkiss.dbeaver.DBException;
        return sourceDefinition;
        return description;
import java.util.Map;
        return proceduresCache.getAllObjects(monitor, this);


            sourceDefinition = readSource(monitor, true);
    public String getDescription() {

        protected MySQLProcedure fetchObject(@NotNull JDBCSession session, @NotNull MySQLPackage owner, @NotNull JDBCResultSet dbResult)
    @Override

import org.jkiss.dbeaver.model.exec.DBCException;

            sourceDeclaration = readSource(monitor, false);

        proceduresCache.getAllObjects(monitor, this);
    {
