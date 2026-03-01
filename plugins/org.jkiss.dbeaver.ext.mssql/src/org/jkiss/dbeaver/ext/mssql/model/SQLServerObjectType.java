     */

     * @param monitor    the progress monitor for tracking progress of the operation.

	PG ("PG", null, null, "Plan guide"),
    }
        if (SQLServerSchema.class.isAssignableFrom(theClass)) {
import org.jkiss.dbeaver.model.DBPImage;
	TR ("TR", SQLServerTableTrigger.class, DBIcon.TREE_TRIGGER, "SQL DML trigger"),
    }
     * Finds and retrieves an object by name from the given SQL Server schema based on its type.

    @Override
	TA ("TA", null, DBIcon.TREE_TRIGGER, "Assembly (CLR) DML trigger"),
    SQLServerObjectType(String type, Class<? extends DBSObject> theClass, DBPImage icon, String description, boolean isRealType) {
        return theClass;

     * @param schema     the schema to search in, can be {@code null}.

import java.util.List;
        } else if (SQLServerSynonym.class.isAssignableFrom(theClass)) {

    SCHEMA("SCHEMA", SQLServerSchema.class, DBIcon.TREE_SCHEMA, "Schema", false);
            return schema;
            SQLServerSynonym synonym = schema.getSynonym(monitor, objectName);
     * @param objectName the name of the object to find.
	PC ("PC", SQLServerProcedure.class, DBIcon.TREE_PROCEDURE, "Assembly (CLR) stored-procedure"),
public enum SQLServerObjectType implements DBSObjectType {
            log.debug("Null schema in table " + objectName + " search (" + name() + ")");
        }
        return type;
    SQLServerObjectType(String type, Class<? extends DBSObject> theClass, DBPImage icon, String description) {
/*
        List<SQLServerObjectType> result = new ArrayList<>();
    }
    public Class<? extends DBSObject> getTypeClass() {
        } else if (SQLServerTableBase.class.isAssignableFrom(theClass)) {
	F ("F", SQLServerTableForeignKey.class, DBIcon.TREE_CONSTRAINT, "FOREIGN KEY constraint"),

        return result;
        return isRealType;
        this.isRealType = isRealType;
    private final Class<? extends DBSObject> theClass;
	S ("S", SQLServerTable.class, DBIcon.TREE_TABLE, "System base table"),

	FS ("FS", SQLServerProcedure.class, DBIcon.TREE_FUNCTION, "Assembly (CLR) scalar-function"),
        return description;

 *
	SN ("SN", SQLServerSynonym.class, DBIcon.TREE_SYNONYM, "Synonym"),
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
 * limitations under the License.
/**
    private final DBPImage icon;
 * You may obtain a copy of the License at
	PK ("PK", SQLServerTableUniqueKey.class, DBIcon.TREE_UNIQUE_KEY, "PRIMARY KEY constraint"),
    public boolean isRealType() {
 * Unless required by applicable law or agreed to in writing, software
    }
	P ("P", SQLServerProcedure.class, DBIcon.TREE_PROCEDURE, "SQL Stored Procedure"),
        }
	SQ ("SQ", null, null, "Service queue"),
	RF ("RF", null, DBIcon.TREE_PROCEDURE, "Replication-filter-procedure"),
    }

        } else {
    }
     *
    @Override
	TT ("TT", null, DBIcon.TREE_DATA_TYPE, "Table type"),
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.type = type;
    X("X", SQLServerProcedure.class, DBIcon.TREE_PROCEDURE, "Extended stored procedure"),
 * Object type
    public DBSObject findObject(DBRProgressMonitor monitor, SQLServerSchema schema, String objectName) throws DBException {
import org.jkiss.dbeaver.model.struct.DBSObject;
	FT ("FT", SQLServerProcedure.class, DBIcon.TREE_FUNCTION, "Assembly (CLR) table-valued function"),
	V ("V", SQLServerView.class, DBIcon.TREE_VIEW, "View"),
 *
    }
        } else if (SQLServerProcedure.class.isAssignableFrom(theClass)) {
import java.util.ArrayList;
import org.jkiss.dbeaver.model.DBIcon;
    @Override

        this.description = description;
	AF ("AF", null, DBIcon.TREE_FUNCTION, "Aggregate function (CLR)"),
        if (schema == null) {
        return type;
        this(type, theClass, icon, description, true);
    private final boolean isRealType;
        this.icon = icon;
    public String getTypeName() {
    }
    private static final Log log = Log.getLog(SQLServerObjectType.class);
import org.jkiss.dbeaver.DBException;
                result.add(ot);
    @Override
    public String toString() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public String getDescription() {
    /**
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
            return schema.getChild(monitor, objectName);
        for (SQLServerObjectType ot : SQLServerObjectType.values()) {
	IF ("IF", SQLServerProcedure.class, DBIcon.TREE_FUNCTION, "SQL inline table-valued function"),



}
            return null;
	C ("C", SQLServerTableCheckConstraint.class, DBIcon.TREE_CONSTRAINT, "CHECK constraint"),
    private final String type;

 * DBeaver - Universal Database Manager
    }
 * See the License for the specific language governing permissions and
     * @return the found object, or {@code null} if not found or unsupported.
 */
 *
        this.theClass = theClass;
    private final String description;
	UQ ("UQ", SQLServerTableUniqueKey.class, DBIcon.TREE_CONSTRAINT, "UNIQUE constraint"),


	IT ("IT", SQLServerTable.class, DBIcon.TREE_TABLE_SYSTEM, "Internal table"),
	D ("D", null, DBIcon.TREE_CONSTRAINT, "DEFAULT (constraint or stand-alone)"),
import org.jkiss.dbeaver.model.struct.DBSObjectType;
    public String getTypeID() {
     * If the object type is unsupported or the schema is null, returns {@code null} and logs a debug message.
 * you may not use this file except in compliance with the License.
    public DBPImage getImage() {
            if (ot.theClass == theClass) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
     * @throws DBException if an error occurs during the search.
import org.jkiss.dbeaver.Log;
        return icon;
 * Licensed under the Apache License, Version 2.0 (the "License");
	FN ("FN", SQLServerProcedure.class, DBIcon.TREE_FUNCTION, "SQL scalar function"),
package org.jkiss.dbeaver.ext.mssql.model;

	U ("U", SQLServerTable.class, DBIcon.TREE_TABLE, "Table"),
        }
        return description;
            return schema.getProcedure(monitor, objectName);
    }
	TF ("TF", SQLServerProcedure.class, DBIcon.TREE_FUNCTION, "SQL table-valued-function"),
            }
    public static List<SQLServerObjectType> getTypesForClass(Class<?> theClass) {

    @Override
	R ("R", null, null, "Rule (old-style, stand-alone)"),
            log.debug("Unsupported object for SQL Server search: " + name());
            return null;
            return synonym;
