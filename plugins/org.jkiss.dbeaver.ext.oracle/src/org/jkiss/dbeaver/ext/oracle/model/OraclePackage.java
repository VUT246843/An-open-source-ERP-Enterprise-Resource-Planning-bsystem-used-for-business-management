    public Date getLastDDLTime() {
    public Class<? extends DBSObject> getPrimaryChildType(@Nullable DBRProgressMonitor monitor) throws DBException

        }
 */
        /*if (!CommonUtils.isEmpty(sourceDeclaration)) */{
                    // Skip procedures with empty names
    }
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.model.meta.Property;
    public OraclePackage(OracleSchema schema, ResultSet dbResult) {
    }
    }
                    overloads.put(proc.getName(), proc);
    }
    {
            if (!CommonUtils.isEmpty(getExtendedDefinitionText(monitor))) {
            .stream()
    @Override

        this.sourceDefinition = null;
    public String getExtendedDefinitionText(@NotNull DBRProgressMonitor monitor) throws DBException
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        return actions.toArray(new DBEPersistAction[0]);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        if (sourceDefinition == null && monitor != null) {
{
    @Override
 * You may obtain a copy of the License at
/**
import org.jkiss.utils.CommonUtils;
import org.jkiss.code.Nullable;
    @NotNull
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull OraclePackage owner)

        return sourceDeclaration;
        return OracleSourceType.PACKAGE;

    public DBSObject getChild(@NotNull DBRProgressMonitor monitor, @NotNull String childName) throws DBException
        return proceduresCache.getAllObjects(monitor, this);
    }
    @Override
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;

    private String sourceDeclaration;
 *     http://www.apache.org/licenses/LICENSE-2.0
        super(schema, JDBCUtils.safeGetString(dbResult, OracleConstants.COLUMN_OBJECT_NAME), true);

import java.sql.ResultSet;
    {

        this.valid = OracleConstants.RESULT_STATUS_VALID.equals(JDBCUtils.safeGetString(dbResult, OracleConstants.COLUMN_STATUS));
 * Unless required by applicable law or agreed to in writing, software
            actions.add(
        return valid;
    {
        @Override
    }
                            "ALTER PACKAGE " + getFullyQualifiedName(DBPEvaluationContext.DDL) + " COMPILE BODY"
    @Property(viewable = true, order = 5)
/*
    }
                            OracleObjectType.PACKAGE_BODY,
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        if (sourceDeclaration == null && monitor != null) {
        }
            .collect(Collectors.toList());
    public OracleProcedurePackaged getProcedure(DBRProgressMonitor monitor, String uniqueName) throws DBException {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import java.util.*;

        this.created = JDBCUtils.safeGetTimestamp(dbResult, OracleConstants.COLUMN_CREATED);
    @Property(viewable = true, order = 6)
                    proc.setOverload(overload.getOverloadNumber() + 1);
    public void cacheStructure(@NotNull DBRProgressMonitor monitor, int scope) throws DBException
        return proceduresCache.getObject(monitor, this, uniqueName);
        return getProcedures(monitor)
 *

package org.jkiss.dbeaver.ext.oracle.model;
            .collect(Collectors.toList());
        		OracleUtils.getObjectStatus(monitor, this, OracleObjectType.PACKAGE_BODY);

import org.jkiss.dbeaver.DBException;

    @Property(hidden = true, editable = true, updatable = true, order = -1)
            }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
        {
            sourceDefinition = OracleUtils.getSource(monitor, this, true, true);

        return valid ? DBSObjectState.NORMAL : DBSObjectState.INVALID;
    @Property(viewable = true, order = 4)
                            "Compile package body",
import org.jkiss.dbeaver.model.DBPRefreshableObject;
            .filter(proc -> proc.getProcedureType() == DBSProcedureType.FUNCTION)
    {

    public OracleSourceType getSourceType()
            throws SQLException
                if (overload == null) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        return sourceDefinition;

    {
        proceduresCache.getAllObjects(monitor, this);
                    }
    @Association
import org.jkiss.dbeaver.Log;
        {
    public boolean isValid()
    }
    {
    }
                    objectIter.remove();
import org.jkiss.dbeaver.ext.oracle.model.source.OracleSourceObject;
    {
            .stream()
                "ORDER BY P.PROCEDURE_NAME");
    public Collection<? extends DBSObject> getChildren(@NotNull DBRProgressMonitor monitor) throws DBException
    }
            return new OracleProcedurePackaged(owner, dbResult);
 * GenericProcedure
import java.util.stream.Collectors;
        this.valid = OracleUtils.getObjectStatus(monitor, this, OracleObjectType.PACKAGE) &&
    }
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBCException
    {
    private String sourceDefinition;
        try {
        this.sourceDeclaration = null;
    @Override
            }

    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException
    @NotNull
    public void refreshObjectState(@NotNull DBRProgressMonitor monitor) throws DBCException
    @Override

                "LEFT OUTER JOIN ALL_ARGUMENTS A ON A.OWNER=P.OWNER AND A.PACKAGE_NAME=P.OBJECT_NAME AND A.OBJECT_NAME=P.PROCEDURE_NAME AND A.ARGUMENT_NAME IS NULL AND A.DATA_LEVEL=0\n" +
 * DBeaver - Universal Database Manager

    }
    }
        this.proceduresCache.clearCache();
            sourceDeclaration = OracleUtils.getSource(monitor, this, false, true);
            dbStat.setString(2, owner.getName());

 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    @Property(hidden = true, editable = true, updatable = true, order = -1)
 * See the License for the specific language governing permissions and
    public void setObjectDefinitionText(String sourceDeclaration)
    }
                    "ALTER PACKAGE " + getFullyQualifiedName(DBPEvaluationContext.DDL) + " COMPILE"
    @Association
                        overload.setOverload(1);
        }
        @NotNull
 */
 * you may not use this file except in compliance with the License.
    @Override
        }
                    continue;
        return getProcedures(monitor)
    private Date created;
        }
    @Override
                new OracleObjectPersistAction(
    {
    }
        return OracleProcedurePackaged.class;
                }
            while (objectIter.hasNext()) {
        List<DBEPersistAction> actions = new ArrayList<>();

                final OracleProcedurePackaged proc = objectIter.next();
        }
                ));
    {
}
                }
    }
    public Collection<OracleProcedurePackaged> getFunctionsOnly(DBRProgressMonitor monitor) throws DBException {
    @Override

        return OracleDependencyGroup.of(this);
        }
    public OraclePackage(OracleSchema schema, String name)
import java.sql.SQLException;
        @Override
                actions.add(
        super(schema, name, false);
        protected void invalidateObjects(DBRProgressMonitor monitor, OraclePackage owner, Iterator<OracleProcedurePackaged> objectIter)

import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureContainer;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.dbeaver.model.DBPScriptObjectExt;
            throws SQLException, DBException
    @Override

                final OracleProcedurePackaged overload = overloads.get(proc.getName());
                    // Oracle 11+ has dummy procedure with subprogram_id=0 and empty name


    }
 * limitations under the License.
    }
            JDBCPreparedStatement dbStat = session.prepareStatement(
            Map<String, OracleProcedurePackaged> overloads = new HashMap<>();
    {
                    "Compile package",
    }

 * Copyright (C) 2010-2025 DBeaver Corp and others
    public Collection<OracleDependencyGroup> getDependencies(DBRProgressMonitor monitor) {
        return proceduresCache.getAllObjects(monitor, this);
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
                } else {
    {
    private boolean temporary;
 *

    private boolean valid;
    }
            .filter(proc -> proc.getProcedureType() == DBSProcedureType.PROCEDURE)
    @NotNull
    private final ProceduresCache proceduresCache = new ProceduresCache();
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.meta.Association;

                "SELECT P.*,CASE WHEN A.DATA_TYPE IS NULL THEN 'PROCEDURE' ELSE 'FUNCTION' END as PROCEDURE_TYPE FROM ALL_PROCEDURES P\n" +
    public DBEPersistAction[] getCompileActions(DBRProgressMonitor monitor)
            return dbStat;
    public void setExtendedDefinitionText(String source)
            dbStat.setString(1, owner.getSchema().getName());
 *
import org.jkiss.dbeaver.model.exec.DBCException;

    @NotNull
                    if (overload.getOverloadNumber() == null) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    implements OracleSourceObject, DBPScriptObjectExt, DBSObjectContainer, DBSPackage, DBPRefreshableObject, DBSProcedureContainer
    @Property(viewable = true, order = 3)

        return temporary;

        return lastDDLTime;
    @Override
        @Override
                    OracleObjectType.PACKAGE,
import org.jkiss.dbeaver.model.struct.rdb.DBSPackage;
        this.lastDDLTime = JDBCUtils.safeGetTimestamp(dbResult, OracleConstants.COLUMN_LAST_DDL_TIME);
            log.warn("Unable to retrieve package body, not compiling it", e);
    }
    @Association
    public DBSObjectState getObjectState()
    public Collection<OracleProcedurePackaged> getProceduresOnly(DBRProgressMonitor monitor) throws DBException {
        return proceduresCache.getObject(monitor, this, childName);
    }

    public boolean isTemporary() {
    }
        this.sourceDeclaration = sourceDeclaration;
    public Collection<OracleProcedurePackaged> getProcedures(DBRProgressMonitor monitor) throws DBException {
                            ));
        {
                    overloads.put(proc.getName(), proc);
        protected OracleProcedurePackaged fetchObject(@NotNull JDBCSession session, @NotNull OraclePackage owner, @NotNull JDBCResultSet dbResult)
        } catch (DBException e) {
    @Association
    public Date getCreated() {
        return this;
                "WHERE P.OWNER=? AND P.OBJECT_NAME=?\n" +
                if (CommonUtils.isEmpty(proc.getName())) {


        return created;
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
    private static final Log log = Log.getLog(OraclePackage.class);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.temporary = JDBCUtils.safeGetBoolean(dbResult, OracleConstants.COLUMN_TEMPORARY, OracleConstants.RESULT_YES_VALUE);
    {
public class OraclePackage extends OracleSchemaObject
import org.jkiss.dbeaver.model.struct.DBSObjectState;
    @Override
                        new OracleObjectPersistAction(
    static class ProceduresCache extends JDBCObjectCache<OraclePackage, OracleProcedurePackaged> {
    private Date lastDDLTime;
    {

    }
    @Override
        this.sourceDefinition = source;
    {
