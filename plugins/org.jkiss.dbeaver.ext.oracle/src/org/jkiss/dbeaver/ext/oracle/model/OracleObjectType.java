    }),

        }
        }
    ) {
        for (OracleObjectType type : values()) {
        public OracleSequence findObject(DBRProgressMonitor monitor, OracleSchema schema, String objectName) throws DBException
    <OBJECT_TYPE extends DBSObject> OracleObjectType(String objectType,
            return objectName;
        }
    private final DBPImage image;

            return schema.tableCache.getObject(monitor, schema, objectName, OracleView.class);
    }),
    public String toString()
        public OracleSynonym findObject(DBRProgressMonitor monitor, OracleSchema schema, String objectName) throws DBException
                                                     Class<OBJECT_TYPE> typeClass,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        public OracleTrigger findObject(DBRProgressMonitor monitor, OracleSchema schema, String objectName) throws DBException
    static {
	JAVA_CLASS("JAVA CLASS", DBIcon.TREE_JAVA_CLASS, OracleJavaClass.class, new ObjectFinder() {
        }
    {
                return trigger;
    
    public DBSObject findObject(DBRProgressMonitor monitor, OracleSchema schema, String objectName) throws DBException
    {
    }),
            return schema.javaCache.getObject(monitor, schema, objectName);
            log.debug("Unrecognized Oracle object type: " + objectTypeName);
        @Override
        @Override
            return schema.proceduresCache.getObject(monitor, schema, objectName);
    }),
	SCHEDULE("SCHEDULE", null, DBSObject.class, null),
                                                     ObjectFinder finder,
 */

        OracleDataSource dataSource,
	WINDOW("WINDOW", null, DBSObject.class, null),
    {
	MATERIALIZED_VIEW("MATERIALIZED VIEW", DBIcon.TREE_VIEW, DBSObject.class, null),
	TABLE("TABLE", DBIcon.TREE_TABLE, OracleTable.class, new ObjectFinder() {
        {
public enum OracleObjectType implements DBSObjectType {
    @Override
        }
        {
 *
            log.debug("Unsupported Oracle object type: " + objectTypeName);
    XML_SCHEMA("XML SCHEMA", null, DBSObject.class, null),
 * Unless required by applicable law or agreed to in writing, software
        this.image = image;
 *
        return objectType;
        if (object == null) {
        this.typeClass = typeClass;
        return null;
	RULE_SET("RULE SET", null, DBSObject.class, null),
        return finder != null;
	CLUSTER("CLUSTER", null, DBSObject.class, null),
	DIRECTORY("DIRECTORY", null, DBSObject.class, null),
    private final String objectType;
    }),
	PACKAGE_BODY("PACKAGE BODY", DBIcon.TREE_PACKAGE, OraclePackage.class, new ObjectFinder() {
        } else {
        return typeMap.get(typeName);
        @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return isRealType;
            return schema.indexCache.getObject(monitor, schema, objectName);
    }),
    private final boolean isRealType;
        {
        public OracleProcedureStandalone findObject(DBRProgressMonitor monitor, OracleSchema schema, String objectName) throws DBException
    }
                                                     DBPImage image,
        this(objectType, image, typeClass, finder, true);
    ) {
            return schema.proceduresCache.getObject(monitor, schema, objectName);
        DBSObject findObject(DBRProgressMonitor monitor, OracleSchema schema, String objectName) throws DBException;
        DBRProgressMonitor monitor,
package org.jkiss.dbeaver.ext.oracle.model;
        this.isRealType = isRealType;
    public boolean isBrowsable()
    }

	LIBRARY("LIBRARY", null, DBSObject.class, null),
        public OracleProcedureStandalone findObject(DBRProgressMonitor monitor, OracleSchema schema, String objectName) throws DBException
        {
    FOREIGN_KEY ("FOREIGN KEY", DBIcon.TREE_FOREIGN_KEY, OracleTableForeignKey.class, null), // fake object
}

 * You may obtain a copy of the License at
        }
	JOB_CLASS("JOB CLASS", null, DBSObject.class, null),
    SCHEMA("SCHEMA", DBIcon.TREE_SCHEMA, OracleSchema.class, (monitor, schema, objectName) -> schema, false);
        public OracleQueue findObject(DBRProgressMonitor monitor, OracleSchema schema, String objectName) throws DBException
        }
import org.jkiss.dbeaver.model.struct.DBSObject;
    }),

 * DBeaver - Universal Database Manager
	RULE("RULE", null, DBSObject.class, null),
    QUEUE("QUEUE", null, OracleQueue.class, new ObjectFinder() {
	VIEW("VIEW", DBIcon.TREE_VIEW, OracleView.class, new ObjectFinder() {
        public OracleJavaClass findObject(DBRProgressMonitor monitor, OracleSchema schema, String objectName) throws DBException
        {
    }
    {
    public static Object resolveObject(
        @Override
	JOB("JOB", null, DBSObject.class, null),
	FUNCTION("FUNCTION", DBIcon.TREE_PROCEDURE, OracleProcedureStandalone.class, new ObjectFinder() {
        if (finder != null) {
    @Override

        @Override
	SEQUENCE("SEQUENCE", DBIcon.TREE_SEQUENCE, OracleSequence.class, new ObjectFinder() {
            return schema.queueCache.getObject(monitor, schema, objectName);
	EVALUATION_CONTEXT("EVALUATION CONTEXT", null, DBSObject.class, null),
                                                     boolean isRealType
    }
    }
        return object;
        }
            if (trigger != null) {
        }
    {
    {
	TYPE("TYPE", DBIcon.TREE_DATA_TYPE, OracleDataType.class, new ObjectFinder() {
    }
    private static final Log log = Log.getLog(OracleObjectType.class);
    }

        OracleObjectType objectType = OracleObjectType.getByType(objectTypeName);
 * limitations under the License.

    }),
	PROGRAM("PROGRAM", null, DBSObject.class, null),
        @Override
	TABLE_PARTITION("TABLE PARTITION", null, DBSObject.class, null),
import org.jkiss.dbeaver.model.DBPImage;

import java.util.HashMap;
    @Override
        }
        public OracleDataType findObject(DBRProgressMonitor monitor, OracleSchema schema, String objectName) throws DBException
        {
        @Override
            return objectName;
import org.jkiss.dbeaver.Log;
    {
        return image;
                                                     DBPImage image,
    }),
 *     http://www.apache.org/licenses/LICENSE-2.0
    }

        }
        String dbLink,
        return typeClass;
            log.debug(objectTypeName + " '" + objectName + "' not found in '" + schema.getName() + "'");
        {
    public static OracleObjectType getByType(String typeName)
 * Copyright (C) 2010-2024 DBeaver Corp and others
        public OraclePackage findObject(DBRProgressMonitor monitor, OracleSchema schema, String objectName) throws DBException
    
    public String getDescription()
    }
import java.util.Map;
        String objectName) throws DBException
	PACKAGE("PACKAGE", DBIcon.TREE_PACKAGE, OraclePackage.class, new ObjectFinder() {
            log.debug("Schema '" + objectOwner + "' not found");
 * Licensed under the Apache License, Version 2.0 (the "License");
    }),
        if (schema == null) {
    }
    {
	PROCEDURE("PROCEDURE", DBIcon.TREE_PROCEDURE, OracleProcedureStandalone.class, new ObjectFinder() {
    private static Map<String, OracleObjectType> typeMap = new HashMap<>();
        }
        }
        if (dbLink != null) {
        }
        }
        this.finder = finder;
        }
    }
    private final ObjectFinder finder;
    }),
            return objectName;
        return objectType;
/*
 * you may not use this file except in compliance with the License.
        @Override
            return schema.synonymCache.getObject(monitor, schema, objectName);
	JAVA_DATA("JAVA DATA", null, DBSObject.class, null),
        @Override
	JAVA_RESOURCE("JAVA RESOURCE", null, DBSObject.class, null),
        }
    private final Class<? extends DBSObject> typeClass;
        {
    }
            return schema.packageCache.getObject(monitor, schema, objectName);
	OPERATOR("OPERATOR", null, DBSObject.class, null),
 *
/**
 * Object type
        @Override
        }
            OracleTableTrigger trigger = schema.tableTriggerCache.getObject(monitor, schema, objectName);
        public OracleView findObject(DBRProgressMonitor monitor, OracleSchema schema, String objectName) throws DBException

        {
	SYNONYM("SYNONYM", DBIcon.TREE_SYNONYM, OracleSynonym.class, new ObjectFinder() {
        public OracleDataType findObject(DBRProgressMonitor monitor, OracleSchema schema, String objectName) throws DBException
import org.jkiss.dbeaver.DBException;

            return schema.dataTypeCache.getObject(monitor, schema, objectName);
        }
        {
            return schema.packageCache.getObject(monitor, schema, objectName);
    private static interface ObjectFinder {
	CONSUMER_GROUP("CONSUMER GROUP", null, DBSObject.class, null),
 * distributed under the License is distributed on an "AS IS" BASIS,
        String objectTypeName,
            // First we will try to find a trigger at the tables level
        String objectOwner,
            return schema.tableCache.getObject(monitor, schema, objectName);
            return finder.findObject(monitor, schema, objectName);
    <OBJECT_TYPE extends DBSObject> OracleObjectType(String objectType,
import org.jkiss.dbeaver.model.DBIcon;
	TRIGGER("TRIGGER", DBIcon.TREE_TRIGGER, OracleTrigger.class, new ObjectFinder() {
    CONSTRAINT ("CONSTRAINT", DBIcon.TREE_CONSTRAINT, OracleTableConstraint.class, null), // fake object
        {

    }
        public OraclePackage findObject(DBRProgressMonitor monitor, OracleSchema schema, String objectName) throws DBException

        @Override
        if (objectType == null) {
	WINDOW_GROUP("WINDOW GROUP", null, DBSObject.class, null),
    }),
                                                     Class<OBJECT_TYPE> typeClass,
        final DBSObject object = objectType.findObject(monitor, schema, objectName);
	INDEX_PARTITION("INDEX PARTITION", null, DBSObject.class, null),
    @Override
    public boolean isRealType() {
            return objectName;
            return schema.dataTypeCache.getObject(monitor, schema, objectName);

 * See the License for the specific language governing permissions and
        public OracleTableBase findObject(DBRProgressMonitor monitor, OracleSchema schema, String objectName) throws DBException
                                                     ObjectFinder finder

        final OracleSchema schema = dataSource.getSchema(monitor, objectOwner);
	INDEXTYPE("INDEXTYPE", null, DBSObject.class, null),
    {
	INDEX("INDEX", DBIcon.TREE_INDEX, OracleTableIndex.class, new ObjectFinder() {
        }
	TYPE_BODY("TYPE BODY", DBIcon.TREE_DATA_TYPE, OracleDataType.class, new ObjectFinder() {
	LOB("CONTENT", null, DBSObject.class, null),
            return null;
        public OracleTableIndex findObject(DBRProgressMonitor monitor, OracleSchema schema, String objectName) throws DBException

    }),


 */

        this.objectType = objectType;
        @Override
        @Override
            }
            return objectName;
        @Override
    public String getTypeName()
    }),
        {
    }
        {
	CONTEXT("CONTEXT", null, DBSObject.class, null),
import org.jkiss.dbeaver.model.struct.DBSObjectType;
        {
    public Class<? extends DBSObject> getTypeClass()
            return schema.sequenceCache.getObject(monitor, schema, objectName);
    public DBPImage getImage()
            typeMap.put(type.getTypeName(), type);
        if (!objectType.isBrowsable()) {
        }
            return schema.triggerCache.getObject(monitor, schema, objectName);
            // Nope. Now we will try to find a trigger at the schemas level
    @Override
