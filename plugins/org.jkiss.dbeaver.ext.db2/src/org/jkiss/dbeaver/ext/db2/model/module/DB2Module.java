    @Association

    {
        variableCache.clearCache();
    // Properties
        return functionCache.getAllObjects(monitor, this);
        typeCache.clearCache();
        this.type = CommonUtils.valueOf(DB2ModuleType.class, JDBCUtils.safeGetString(dbResult, "MODULETYPE"));
        this.procedureCache = new JDBCObjectSimpleCache<>(DB2Routine.class, C_PRC, schema.getName(), name);
 * Unless required by applicable law or agreed to in writing, software

        return moduleId;
    private final DBSObjectCache<DB2Module, DB2DataType> typeCache;

    public DBSObjectCache<DB2Module, DB2Variable> getVariableCache()
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedure;
    }
    {
    public String getDialect()
 * Licensed under the Apache License, Version 2.0 (the "License");
    }

        this.createTime = JDBCUtils.safeGetTimestamp(dbResult, DB2Constants.SYSCOLUMN_CREATE_TIME);
    {
    public String getOwner()
    {
    @Override
    {
    @Association
    }

    {
    }
        return conditionCache.getAllObjects(monitor, this);
    // Association
    public Collection<DB2ModuleCondition> getConditions(DBRProgressMonitor monitor) throws DBException

    @Association
    }
    public String getName()
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;

    private final DBSObjectCache<DB2Module, DB2Routine> procedureCache;
    {
 * DB2 Module
    private final DBSObjectCache<DB2Module, DB2ModuleCondition> conditionCache;
    public Collection<DB2Variable> getVariables(DBRProgressMonitor monitor) throws DBException

        return createTime;
 */
    public Collection<DB2Routine> getFunctions(DBRProgressMonitor monitor) throws DBException
import java.sql.ResultSet;
    @Property(viewable = false, order = 15, category = DB2Constants.CAT_DATETIME)
    {
        functionCache.clearCache();
    }
    }
    public DBSObjectCache<DB2Module, DB2Routine> getFunctionCache()
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException
        return type;
    public DBSObjectCache<DB2Module, DB2Routine> getMethodCache()
        return dialect;
    // -----------------------
    // -----------------
    {
import org.jkiss.dbeaver.model.meta.Property;
    {
    // Standards Getters
    }
    private DB2ModuleType type;
    {
    public Collection<DB2Routine> getProcedures(DBRProgressMonitor monitor) throws DBException
    public Timestamp getCreateTime()
        return methodCache;

        this.typeCache = new JDBCObjectSimpleCache<>(DB2DataType.class, C_TYP, schema.getName(), name);


import org.jkiss.dbeaver.model.meta.Association;
    {
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
 * DBeaver - Universal Database Manager
    @NotNull
        return typeCache;
    @Property(viewable = false, length = PropertyLength.MULTILINE)
    private DB2OwnerType ownerType;
 * limitations under the License.
    // -------------------------
    {
    }
 */
    public Integer getModuleId()
    public DB2Schema getSchema()
    }
    }
    public DB2ModuleType getType()

public class DB2Module extends DB2SchemaObject implements DBSProcedureContainer, DBPRefreshableObject {

    }
    private static final String C_VAR = "SELECT * FROM SYSCAT.VARIABLES WHERE VARSCHEMA = ? AND VARMODULENAME = ? ORDER BY VARNAME WITH UR";
        return procedureCache;

    @Property(viewable = false, order = 14, category = DB2Constants.CAT_OWNER)
    @Property(viewable = true, order = 2)
import org.jkiss.dbeaver.ext.db2.model.dict.DB2OwnerType;
    @Property(viewable = true, order = 10)
        this.functionCache = new JDBCObjectSimpleCache<>(DB2Routine.class, C_FCT, schema.getName(), name);
    @Override
import org.jkiss.dbeaver.model.DBPRefreshableObject;
    public DBSObjectCache<DB2Module, DB2Routine> getProcedureCache()

    public String getDescription()
    // -------------------------
    }
        conditionCache.clearCache();
import org.jkiss.code.NotNull;
    }
    {
import java.util.Collection;
    private static final String C_MOD = "SELECT * FROM SYSCAT.ROUTINES WHERE ROUTINESCHEMA = ? AND ROUTINEMODULENAME = ? AND ROUTINETYPE = 'M' ORDER BY ROUTINENAME WITH UR";
    @Association
    }

        return procedureCache.getObject(monitor, this, uniqueName);
        return conditionCache;

        return owner;
 *
 * 
        this.ownerType = CommonUtils.valueOf(DB2OwnerType.class, JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_OWNER_TYPE));


import org.jkiss.dbeaver.model.struct.DBSObject;
        return functionCache;
    }
    // -----------------------
 * @author Denis Forveille
import java.sql.Timestamp;
    {
    {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectSimpleCache;
    private final DBSObjectCache<DB2Module, DB2Routine> functionCache;
    public DB2Module(DB2Schema schema, ResultSet dbResult)

        this.methodCache = new JDBCObjectSimpleCache<>(DB2Routine.class, C_MOD, schema.getName(), name);
    }
    private String owner;
    private static final String C_PRC = "SELECT * FROM SYSCAT.ROUTINES WHERE ROUTINESCHEMA = ? AND ROUTINEMODULENAME = ? AND ROUTINETYPE = 'P' ORDER BY ROUTINENAME WITH UR";
    public Collection<DB2DataType> getTypes(DBRProgressMonitor monitor) throws DBException
/**
    public DBSProcedure getProcedure(DBRProgressMonitor monitor, String uniqueName) throws DBException {
    public DB2DataType getType(DBRProgressMonitor monitor, String name) throws DBException
package org.jkiss.dbeaver.ext.db2.model.module;

            schema.getName(), name);
        this.moduleId = JDBCUtils.safeGetInteger(dbResult, "MODULEID");
import org.jkiss.utils.CommonUtils;
    public DBSObjectCache<DB2Module, DB2DataType> getTypeCache()

    }
        return typeCache.getAllObjects(monitor, this);

    private static final String C_CON = "SELECT * FROM SYSCAT.CONDITIONS WHERE CONDSCHEMA = ? AND CONDMODULENAME = ? ORDER BY CONDNAME WITH UR";
    }
    {
        this.variableCache = new JDBCObjectSimpleCache<>(DB2Variable.class, C_VAR, schema.getName(), name);
import org.jkiss.code.Nullable;

        return procedureCache.getAllObjects(monitor, this);
 *
    private Integer moduleId;

import org.jkiss.dbeaver.ext.db2.model.*;
    // -----------------------

/*
    private static final String C_TYP = "SELECT * FROM SYSCAT.DATATYPES WHERE TYPESCHEMA = ? AND TYPEMODULENAME = ? ORDER BY TYPENAME WITH UR";
        this.remarks = JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_REMARKS);
    @Nullable
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}
    @Property(viewable = true, order = 11)
 * distributed under the License is distributed on an "AS IS" BASIS,
    public DB2OwnerType getOwnerType()

    }
        return parent;
        this.conditionCache = new JDBCObjectSimpleCache<>(DB2ModuleCondition.class, C_CON,
    private static final String C_FCT = "SELECT * FROM SYSCAT.ROUTINES WHERE ROUTINESCHEMA = ? AND ROUTINEMODULENAME = ? AND ROUTINETYPE = 'F' ORDER BY ROUTINENAME WITH UR";
        return remarks;

    private final DBSObjectCache<DB2Module, DB2Routine> methodCache;
 * See the License for the specific language governing permissions and
    // -----------------

        return typeCache.getObject(monitor, this, name);

    // Constructors

    @Association
    {
    // -----------------------
import org.jkiss.dbeaver.ext.db2.DB2Constants;
        return this;
 *
    {
    public DBSObjectCache<DB2Module, DB2ModuleCondition> getConditionCache()
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureContainer;
        return super.getName();
    @Override
    {
        procedureCache.clearCache();
        return variableCache;


import org.jkiss.dbeaver.model.meta.PropertyLength;
    }
    {


    private final DBSObjectCache<DB2Module, DB2Variable> variableCache;
        this.owner = JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_OWNER);
        super(schema, JDBCUtils.safeGetStringTrimmed(dbResult, "MODULENAME"), true);
    private Timestamp createTime;
        this.dialect = JDBCUtils.safeGetString(dbResult, "DIALECT");
    {
    {

    @Override
 * you may not use this file except in compliance with the License.

    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        return ownerType;
    }
    @Property(viewable = true, order = 1)
        return variableCache.getAllObjects(monitor, this);
 * You may obtain a copy of the License at
    @Property(viewable = true, order = 12)
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
import org.jkiss.dbeaver.DBException;
    private String remarks;
    private String dialect;
    @Property(viewable = false, order = 13, category = DB2Constants.CAT_OWNER)
    }
