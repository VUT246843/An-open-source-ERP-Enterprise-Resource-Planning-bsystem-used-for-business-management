public abstract class OracleProcedureBase<PARENT extends DBSObjectContainer> extends OracleObject<PARENT> implements DBSProcedure
 * Copyright (C) 2010-2024 DBeaver Corp and others
                final int curDataLevel = argument.getDataLevel();
/**
                dbStat.setString(paramNum++, procedure.getContainer().getName());

 * See the License for the specific language governing permissions and
    }
        this.procedureType = procedureType;
    {

                (procedure.getOverloadNumber() != null ? "AND OVERLOAD=? " : "AND OVERLOAD IS NULL ") +
            IntKeyMap<OracleProcedureArgument> argStack = new IntKeyMap<>();
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
        PARENT parent,
        {
                    } else {
                dbStat.setInt(paramNum, procedure.getOverloadNumber());

    public Collection<OracleDependencyGroup> getDependencies(DBRProgressMonitor monitor) {
                "\nORDER BY SEQUENCE");
                if (curDataLevel > 0) {
{
import java.util.Collection;
                dbStat.setString(paramNum++, procedure.getName());
    @Property(viewable = true, editable = true, order = 3)
    }
import org.jkiss.dbeaver.model.DBPEvaluationContext;
                    if (parentArgument == null) {
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull OracleProcedureBase procedure) throws SQLException
import org.jkiss.code.NotNull;

 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
            while (objectIter.hasNext()) {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
        @Override
                        log.error("Broken arguments structure for '" + argument.getParentObject().getFullyQualifiedName(DBPEvaluationContext.DDL) + "' - no parent argument for argument " + argument.getSequence());
    public OracleProcedureBase(
    {

        }
/*
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public void setProcedureType(DBSProcedureType procedureType) {

                argStack.put(curDataLevel, argument);
    public abstract OracleSchema getSchema();
    }
    @Override
            JDBCPreparedStatement dbStat = session.prepareStatement(
                dbStat.setString(paramNum++, procedure.getSchema().getName());
        }
 */
 * Unless required by applicable law or agreed to in writing, software
        {

import org.jkiss.dbeaver.model.meta.Association;
}
import java.util.Iterator;
    static class ArgumentsCache extends JDBCObjectCache<OracleProcedureBase, OracleProcedureArgument> {
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.procedureType = procedureType;
    public DBSObjectContainer getContainer()
        return getParentObject();
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        return argumentsCache.getAllObjects(monitor, this);
    @Override
 */

 *
    {
 * You may obtain a copy of the License at

        }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
    public Collection<OracleProcedureArgument> getParameters(@NotNull DBRProgressMonitor monitor) throws DBException
                    objectIter.remove();
    }
import org.jkiss.dbeaver.model.meta.Property;
    @Override

 * limitations under the License.
        @Override
import org.jkiss.utils.IntKeyMap;
 * DBeaver - Universal Database Manager
        return procedureType ;
                }
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
    private final ArgumentsCache argumentsCache = new ArgumentsCache();
        return OracleDependencyGroup.of(this);

        {
    static final Log log = Log.getLog(OracleProcedureBase.class);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                OracleProcedureArgument argument = objectIter.next();
        String name,
            return new OracleProcedureArgument(session.getProgressMonitor(), procedure, resultSet);
 *
                        parentArgument.addAttribute(argument);
            if (procedure.getOverloadNumber() != null) {
        @NotNull
            }
import org.jkiss.dbeaver.Log;
package org.jkiss.dbeaver.ext.oracle.model;
    public abstract Integer getOverloadNumber();
import java.sql.SQLException;
        @Override
            } else {
            if (procedure.getObjectId() <= 0) {
        super(parent, name, objectId, true);
import org.jkiss.code.Nullable;
        DBSProcedureType procedureType)
        long objectId,


        protected void invalidateObjects(DBRProgressMonitor monitor, OracleProcedureBase owner, Iterator<OracleProcedureArgument> objectIter)

    {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedure;
import org.jkiss.dbeaver.DBException;
    private DBSProcedureType procedureType;
                dbStat.setLong(paramNum++, procedure.getObjectId());

                "SELECT * FROM "+ OracleUtils.getSysSchemaPrefix(procedure.getDataSource()) + "ALL_ARGUMENTS " +
 *
            }
                    }
            int paramNum = 1;
    }

            return dbStat;
        protected OracleProcedureArgument fetchObject(@NotNull JDBCSession session, @NotNull OracleProcedureBase procedure, @NotNull JDBCResultSet resultSet) throws SQLException, DBException

    @Nullable
            }
                "WHERE " +
    }
 * GenericProcedure
    }
                    OracleProcedureArgument parentArgument = argStack.get(curDataLevel - 1);
                (procedure.getObjectId() <= 0  ? "OWNER=? AND OBJECT_NAME=? AND PACKAGE_NAME=? " : "OBJECT_ID=? ") +
    @Association
    public DBSProcedureType getProcedureType()
