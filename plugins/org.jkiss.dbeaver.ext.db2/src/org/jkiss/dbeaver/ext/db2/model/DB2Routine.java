        this.type = CommonUtils.valueOf(DB2RoutineType.class, JDBCUtils.safeGetString(dbResult, "ROUTINETYPE"));
 */

 * DB2 Routine Base Object (Procedures, Function)
import org.jkiss.dbeaver.DBException;
    {
    @Property(viewable = false, length = PropertyLength.MULTILINE)
    }
        this.origin = CommonUtils.valueOf(DB2RoutineOrigin.class, JDBCUtils.safeGetString(dbResult, "ORIGIN"));
    }
        this.jarId = JDBCUtils.safeGetString(dbResult, "JAR_ID");
        C("Column or aggregate"),
        this.alterTime = JDBCUtils.safeGetTimestamp(dbResult, DB2Constants.SYSCOLUMN_ALTER_TIME);
    {


 * @author Denis Forveille
        return lastRegenTime;
    @Override
import org.jkiss.utils.CommonUtils;
    {
 *

    @Override
        R("Row"),
        DB2DataSource db2DataSource = (DB2DataSource) owner.getDataSource();

    }
    }
    public DB2Routine(DBSObject owner, ResultSet dbResult) {
        this.language = CommonUtils.valueOf(DB2RoutineLanguage.class, JDBCUtils.safeGetStringTrimmed(dbResult, "LANGUAGE"));
import org.jkiss.dbeaver.ext.db2.DB2Utils;
    }
        this.deterministic = JDBCUtils.safeGetBoolean(dbResult, "DETERMINISTIC", DB2YesNo.Y.name());

    @Property(viewable = false, order = 12, category = DB2Constants.CAT_CODE)
    public String getJarSignature()
    // Children
    {
    }
            this.dialect = JDBCUtils.safeGetString(dbResult, "DIALECT");
    @Property(viewable = true, order = 5, category = DB2Constants.CAT_DATETIME)
    @Property(viewable = false, order = 24, category = DB2Constants.CAT_CODE)

    {
        return specificName;
    public FunctionType getFunctionType() {
import java.sql.ResultSet;
import org.jkiss.dbeaver.model.struct.DBSObject;
    }
    private String                     owner;
    // Source
    @Override
    @Property(viewable = false, order = 10)
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context)
package org.jkiss.dbeaver.ext.db2.model;
        return javaClass;

import org.jkiss.dbeaver.model.exec.DBCException;
            db2Schema = (DB2Schema) owner;

 * You may obtain a copy of the License at

    public String getSpecificName() {
 * 
    public Timestamp getLastRegenTime()
    public Collection<DB2RoutineParm> getParameters(@NotNull DBRProgressMonitor monitor) throws DBException
    public DBSObjectContainer getContainer()
    private Integer                    routineId;

    // -----------------
/**
        this.externalName = JDBCUtils.safeGetString(dbResult, "IMPLEMENTATION");

    {

        return parmsCache.getAllObjects(monitor, this);
    private Timestamp                  lastRegenTime;
    // -----------------------

    private FunctionType functionType;

    }
    // -----------------
    // -----------------
 * Unless required by applicable law or agreed to in writing, software
        if (type == DB2RoutineType.F) {
 * See the License for the specific language governing permissions and
        return jarSchema;

        } else {
        return deterministic;
        return remarks;
    {
        this.createTime = JDBCUtils.safeGetTimestamp(dbResult, DB2Constants.SYSCOLUMN_CREATE_TIME);
    {
    }

    public Boolean getDeterministic()
    // -----------------------
    public DB2OwnerType getOwnerType()

    {
import org.jkiss.dbeaver.model.*;
    public enum FunctionType {
        this.jarSignature = JDBCUtils.safeGetString(dbResult, "JAR_SIGNATURE");
    private String                     text;
    public DB2RoutineOrigin getOrigin()
 *
    public DB2RoutineValidType getValid()
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException
        if (parent instanceof DBSObjectContainer) {

        if ((language != null) && (language.equals(DB2RoutineLanguage.SQL))) {
 * Copyright (C) 2010-2025 DBeaver Corp and others

    @Property(viewable = true, order = 7)

        return createTime;
    private DB2RoutineValidType        valid;
    {

        }
    public DBSObjectState getObjectState()
        this.lastRegenTime = JDBCUtils.safeGetTimestamp(dbResult, "LAST_REGEN_TIME");
        return dialect;
    }

    @Override

        this.resultSets = JDBCUtils.safeGetInteger(dbResult, "RESULT_SETS");
    }
    @Property(viewable = false, order = 11, category = DB2Constants.CAT_CODE)
            return DBIcon.TREE_PROCEDURE;
    public Integer getRoutineId()

    // Properties
import org.jkiss.code.NotNull;
    @Property(viewable = false, category = DB2Constants.CAT_DATETIME)
    // -----------------------
            if (DB2DDLFormat.getCurrentFormat(getDataSource()).needsFormatting()) {

    @Property(viewable = false, order = 23, category = DB2Constants.CAT_CODE)
        this.parameterStyle = JDBCUtils.safeGetString(dbResult, "PARAMETER_STYLE");
    public String getJarSchema()
        return this;
    }
        }
    @Override
import java.sql.Timestamp;
    @Property(viewable = true, order = 6)
    @Property(viewable = true, order = 2)
            if (type == DB2RoutineType.F) {
    public DBPImage getObjectImage() {
        return fullyQualifiedName;
    }
    private String                     jarSignature;
        S("Scalar"),
            }
        return debugMode;
            }
/*
    {
    @Property(viewable = false, category = DB2Constants.CAT_OWNER)
    {
    {
    }
    public String getDebugMode()
    {
import org.jkiss.dbeaver.ext.db2.editors.DB2SourceObject;
    }
        return functionType;
    // -----------------------
    }
        }
    {

            } else {
    }
        return language;
    }

    {
        if (db2DataSource.isAtLeastV9_7()) {
import org.jkiss.dbeaver.ext.db2.editors.DB2DDLFormat;
    @Nullable
    {
    @Property(viewable = false, order = 21, category = DB2Constants.CAT_CODE)
 *
import org.jkiss.dbeaver.ext.db2.model.module.DB2Module;
        return owner;
        fullyQualifiedName = DBUtils.getFullQualifiedName(db2DataSource, owner, this);
    private String                     specificName;
        return externalName;

    }
    public String getDescription()
    public String getDialect()


    @Override
    public DBSProcedureType getProcedureType()
    @Property(viewable = false, order = 15, category = DB2Constants.CAT_CODE)
    private String                     externalName;
        return origin;
    private String                     dialect;
    @Property(viewable = false, order = 22, category = DB2Constants.CAT_CODE)
    @Nullable
        if (owner instanceof DB2Schema) {
    }
 * limitations under the License.
        } else {
        this.javaClass = JDBCUtils.safeGetString(dbResult, "CLASS");
    public Timestamp getAlterTime()
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedure;
            return DBIcon.TREE_FUNCTION;
        return valid == DB2RoutineValidType.Y ? DBSObjectState.NORMAL : DBSObjectState.UNKNOWN;
    private DB2Schema                  db2Schema;
public class DB2Routine extends DB2Object<DBSObject>

    }
    @NotNull

    }
        return valid;
import org.jkiss.dbeaver.model.struct.DBSObjectState;
    public void refreshObjectState(@NotNull DBRProgressMonitor monitor) throws DBCException
    // Business Contract
    }
        return ownerType;
        this.jarSchema = JDBCUtils.safeGetString(dbResult, "JARSCHEMA");
        this.owner = JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_OWNER);
    @Property(viewable = false, order = 20, category = DB2Constants.CAT_CODE)
 *     http://www.apache.org/licenses/LICENSE-2.0
                return DB2Utils.formatSQLProcedureDDL(getDataSource(), text);
    private String                     javaClass;
        FunctionType(String type) {
    @Nullable
    @Property(viewable = false, category = DB2Constants.CAT_OWNER)
        this.valid = CommonUtils.valueOf(DB2RoutineValidType.class, JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_VALID));

            return (DBSObjectContainer) parent;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                this.functionType = CommonUtils.valueOf(FunctionType.class, JDBCUtils.safeGetString(dbResult, "FUNCTIONTYPE"));
    {
                return text;
    }
    // Constructors
import java.util.Collection;


import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
    private DB2OwnerType               ownerType;
    @Nullable
        parmsCache.clearCache();

import org.jkiss.dbeaver.ext.db2.DB2Constants;

        return type;
    @Property(viewable = false, category = DB2Constants.CAT_DATETIME)
    public Timestamp getCreateTime()
    public Integer getResultSets()
    }
    private final DB2RoutineParmsCache parmsCache = new DB2RoutineParmsCache();
    {
        }
        this.routineId = JDBCUtils.safeGetInteger(dbResult, "ROUTINEID");

import org.jkiss.dbeaver.model.meta.PropertyLength;
    @Override
        this.text = JDBCUtils.safeGetString(dbResult, "TEXT");

    {
    @Property(viewable = false, category = DB2Constants.CAT_DATETIME)
        return routineId;
    @Override
        return db2Schema;


    {
    public DB2Schema getSchema()
            this.ownerType = CommonUtils.valueOf(DB2OwnerType.class, JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_OWNER_TYPE));

    {
    implements DBSProcedure, DB2SourceObject, DBPRefreshableObject, DBPImageProvider {
    {
    @Property(viewable = false, order = 14, category = DB2Constants.CAT_CODE)
    private Timestamp                  createTime;
    }
    {


        return jarId;
    public String getJavaClass()
    @Property(viewable = false, order = 25, category = DB2Constants.CAT_CODE)
    }
    @Property(viewable = false, order = 13, category = DB2Constants.CAT_CODE)
        this.remarks = JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_REMARKS);

import org.jkiss.dbeaver.ext.db2.model.dict.*;
    public String getExternalName()
    private String                     jarId;
        return resultSets;
    public String getOwner()
    @Override
        } else {

    private Boolean                    deterministic;
        // Compute this once for all
    private Integer                    resultSets;
    // -----------------
        return db2Schema;

 * DBeaver - Universal Database Manager
    private String                     jarSchema;
    public DB2RoutineLanguage getLanguage()

import org.jkiss.dbeaver.ext.db2.model.cache.DB2RoutineParmsCache;
    // -----------------
    private Timestamp                  alterTime;
 */

 * distributed under the License is distributed on an "AS IS" BASIS,
    private String                     parameterStyle;

    @Nullable
 * you may not use this file except in compliance with the License.

    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException

    private String                     remarks;
    }
    }
        T("Table");
        return type.getProcedureType();
    {

    }
    @Override
    public String getParameterStyle()
        }
import org.jkiss.dbeaver.model.meta.Property;
        return parameterStyle;
        super(owner, JDBCUtils.safeGetString(dbResult, "ROUTINENAME"), true);
            return DB2Messages.no_ddl_for_nonsql_routines;
    // -----------------
    public DB2RoutineType getType()
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }

        }
    }
    {
    {
    {
        this.debugMode = JDBCUtils.safeGetString(dbResult, "DEBUG_MODE");
    }
    private DB2RoutineOrigin           origin;

    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ext.db2.DB2Messages;
    @NotNull
        if (db2DataSource.isAtLeastV9_5()) {
import java.util.Map;

    {
}

        return alterTime;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

            db2Schema = ((DB2Module) owner).getSchema();
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
    }
    @Property(viewable = true, order = 3)
    }
    private String                     debugMode;
        }
    {
import org.jkiss.code.Nullable;
        return jarSignature;
    private DB2RoutineLanguage         language;
    private DB2RoutineType             type;
    private String                     fullyQualifiedName;
    public String getJarId()
        this.specificName = JDBCUtils.safeGetString(dbResult, "SPECIFICNAME");
