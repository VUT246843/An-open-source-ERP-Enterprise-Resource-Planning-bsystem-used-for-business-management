    }),
        public DB2Tablespace findObject(DBRProgressMonitor monitor, DB2DataSource db2DataSource, String objectName)
 * Copyright (C) 2010-2024 DBeaver Corp and others
        @Override
    }),
    SCHEMA(DBIcon.TREE_SCHEMA, DB2Schema.class, null),
    static {
            return finder.findObject(monitor, db2Table, objectName);
        {
    ALIAS(DBIcon.TREE_SYNONYM, DB2Alias.class, new ObjectFinder() {
    VIEW(DBIcon.TREE_VIEW, DB2View.class, new ObjectFinder() {
        }
 * DB2 Object type used by Search, Content Assist and object dependency resolution
    }
        {

        String objectOwner, String objectName) throws DBException
        }

        @Override
                routine = module.getFunctionCache().getObject(monitor, module, tokens[1]);
        {
        public DB2TableColumn findObject(DBRProgressMonitor monitor, DB2Table db2Table, String objectName) throws DBException
 * You may obtain a copy of the License at
        public DB2Nickname findObject(DBRProgressMonitor monitor, DB2Schema schema, String objectName) throws DBException

            LOG.debug("Unrecognized object type: " + objectTypeName);
        public DB2Sequence findObject(DBRProgressMonitor monitor, DB2Schema schema, String objectName) throws DBException
        return finder != null;
                procedure = module.getProcedureCache().getObject(monitor, module, tokens[1]);
        } else {
            } else {
    }
        }
                    }
        @Override
            return schema.getTableCache().getObject(monitor, schema, objectName);
        if (!objectType.isBrowsable()) {
        {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.DBPImage;
    }),
            return schema.getPackageCache().getObject(monitor, schema, objectName);
    }
import java.util.Map;
        {
        return typeClass;

        public DB2Routine findObject(DBRProgressMonitor monitor, DB2Schema schema, String objectName) throws DBException
        @Override
 * limitations under the License.
        public DB2Variable findObject(DBRProgressMonitor monitor, DB2Schema schema, String objectName) throws DBException
        }

    // Init
/**
        }
        public DB2TableUniqueKey findObject(DBRProgressMonitor monitor, DB2Schema schema, String objectName) throws DBException
        @Override
        public DB2XMLSchema findObject(DBRProgressMonitor monitor, DB2Schema schema, String objectName) throws DBException

        return null;
                    }
    PROCEDURE(DBIcon.TREE_PROCEDURE, DB2Routine.class, new ObjectFinder() {
    }

    private final static String SPLIT_DOT = "\\.";
import org.jkiss.dbeaver.model.struct.DBSObjectType;
        @Override
        }

import org.jkiss.dbeaver.Log;
        {
                        routine = module.getMethodCache().getObject(monitor, module, tokens[1]);
        }
        final DBSObject object = objectType.findObject(monitor, schema, objectName);
        }

            return finder.findObject(monitor, schema, objectName);

    public String getTypeName()
                variable = db2DataSource.getVariableCache().getObject(monitor, db2DataSource, tokens[0]);
            String[] tokens = objectName.split(SPLIT_DOT);
        } else {
 * you may not use this file except in compliance with the License.
    private static Map<String, DB2ObjectType> typeMap = new HashMap<>();
        {
        }
    }
            return db2View.getAttribute(monitor, objectName);

        @Override
        }
        }
        }
            return db2Table.getAttribute(monitor, objectName);
        DBSObject findObject(DBRProgressMonitor monitor, DB2Table db2Table, String objectName) throws DBException
        }
    INDEX(DBIcon.TREE_INDEX, DB2Index.class, new ObjectFinder() {

        }
 *

            String[] tokens = objectName.split(SPLIT_DOT);
        return typeMap.get(typeName);
    {
        {
        public DB2Index findObject(DBRProgressMonitor monitor, DB2Schema schema, String objectName) throws DBException
        if (finder != null) {

        public DB2Trigger findObject(DBRProgressMonitor monitor, DB2Schema schema, String objectName) throws DBException
        }
            return objectName;
    {
        {
        }
    }),
                }
    {
            }
        }
 * Unless required by applicable law or agreed to in writing, software
    public Class<? extends DBSObject> getTypeClass()

    }),
    NICKNAME(DBIcon.TREE_SYNONYM, DB2View.class, new ObjectFinder() {
    XML_SCHEMA(DBIcon.TREE_DATA_TYPE, DB2XMLSchema.class, new ObjectFinder() {
        }

                    routine = module.getProcedureCache().getObject(monitor, module, tokens[1]);
            // Function may be global or from a Module
        }

                if (routine == null) {


        DB2ObjectType objectType = DB2ObjectType.getByType(objectTypeName);

                return module.getTypeCache().getObject(monitor, module, tokens[1]);
            throws DBException
    ROUTINE(DBIcon.TREE_PROCEDURE, DB2Routine.class, new ObjectFinder() {
            return db2DataSource.getTablespace(monitor, objectName);
        }

 * Licensed under the Apache License, Version 2.0 (the "License");
    {
            return schema.getReferenceCache().getObject(monitor, schema, objectName);
        {
            DB2Routine procedure;
    // ----------------
        public DB2Alias findObject(DBRProgressMonitor monitor, DB2Schema schema, String objectName) throws DBException
        DBSObject findObject(DBRProgressMonitor monitor, DB2View db2View, String objectName) throws DBException
    }),
        public DB2Package findObject(DBRProgressMonitor monitor, DB2Schema schema, String objectName) throws DBException
    private final ObjectFinder finder;
        public DB2Module findObject(DBRProgressMonitor monitor, DB2Schema schema, String objectName) throws DBException
                variable = module.getVariableCache().getObject(monitor, module, tokens[1]);
        @Override
        @Override
    TABLESPACE(DBIcon.TREE_TABLESPACE, DB2Tablespace.class, new ObjectFinder() {
            return null;
 *
 * 
    CHECK(DBIcon.TREE_CONSTRAINT, DB2TableCheckConstraint.class, new ObjectFinder() {
            return null;
import org.jkiss.dbeaver.model.struct.DBSObject;
            if (tokens.length == 1) {
            return schema.getTriggerCache().getObject(monitor, schema, objectName);
        if (objectType == null) {
        {
        }

    MQT(DBIcon.TREE_TABLE, DB2MaterializedQueryTable.class, new ObjectFinder() {
    }),
import org.jkiss.dbeaver.ext.db2.model.module.DB2Module;
        this.finder = finder;
            String[] tokens = objectName.split(SPLIT_DOT);
            return null;
            }
 * DBeaver - Universal Database Manager
        public DB2TableForeignKey findObject(DBRProgressMonitor monitor, DB2Schema schema, String objectName) throws DBException
        if (finder != null) {
    @Override
        @Override
        }
            return finder.findObject(monitor, db2DataSource, objectName);
        }
                routine = schema.getUdfCache().getObject(monitor, schema, tokens[0]);
        } else {
        public DB2Routine findObject(DBRProgressMonitor monitor, DB2Schema schema, String objectName) throws DBException
    // TODO DF: to be factorised
            if (tokens.length == 1) {
    {
        @Override
    // Helpers
            DB2DataSource db2DataSource = schema.getDataSource();
            return procedure;

    }
import org.jkiss.dbeaver.ext.db2.model.fed.DB2Nickname;


    TRIGGER(DBIcon.TREE_TABLE, DB2Trigger.class, new ObjectFinder() {
        public DB2TableCheckConstraint findObject(DBRProgressMonitor monitor, DB2Schema schema, String objectName)
    public DBPImage getImage()
        {
        public DB2DataType findObject(DBRProgressMonitor monitor, DB2Schema schema, String objectName) throws DBException
    // ----------------
        }
        return object;
            return variable;
        this.typeClass = typeClass;
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
    public DBSObject findObject(DBRProgressMonitor monitor, DB2Table db2Table, String objectName) throws DBException
package org.jkiss.dbeaver.ext.db2.editors;
}
        @Override
    UDF(DBIcon.TREE_PROCEDURE, DB2Routine.class, new ObjectFinder() {
    VARIABLE(DBIcon.TREE_ATTRIBUTE, DB2Variable.class, new ObjectFinder() {
    }),

    }
    UNIQUE_KEY(DBIcon.TREE_UNIQUE_KEY, DB2TableUniqueKey.class, new ObjectFinder() {
                udf = module.getFunctionCache().getObject(monitor, module, tokens[1]);

    {
    public DBSObject findObject(DBRProgressMonitor monitor, DB2DataSource db2DataSource, String objectName) throws DBException
            return schema.getNicknameCache().getObject(monitor, schema, objectName, DB2Nickname.class);
                        routine = schema.getMethodCache().getObject(monitor, schema, tokens[0]);
        {
        @Override
    COLUMN(DBIcon.TREE_COLUMN, DB2TableColumn.class, new ObjectFinder() {
    // Standard Getters
        public DB2TableColumn findObject(DBRProgressMonitor monitor, DB2View db2View, String objectName) throws DBException
    {

                }
 * distributed under the License is distributed on an "AS IS" BASIS,
    {


    }
            DB2Routine routine;
        }
                    if (routine == null) {
    }),
    // ----------------
            return schema.getXmlSchemaCache().getObject(monitor, schema, objectName);
            return finder.findObject(monitor, db2View, objectName);

        if (schema == null) {
        {
    UDT(DBIcon.TREE_DATA_TYPE, DB2DataType.class, new ObjectFinder() {
    }),
            // Type may be global or from a Module
    REFERENCE(DBIcon.TREE_REFERENCE, DB2TableReference.class, new ObjectFinder() {
    public static Object resolveObject(DBRProgressMonitor monitor, DB2DataSource dataSource, String objectTypeName,
            // Routines may be an UDF, a Method or a Procedure
            return routine;
            return objectName;
                    if (routine == null) {
            return null;
        {
    // ---
        @Override
    }),
        @Override
        @Override
    MODULE(DBIcon.TREE_PACKAGE, DB2Module.class, new ObjectFinder() {
        {
            }
    private final static Log LOG = Log.getLog(DB2ObjectType.class);
        {
    }),
    public String getDescription()
            } else {
        {
            throws DBException
    }),
    private final DBPImage image;
import org.jkiss.dbeaver.ext.db2.model.*;
    // Constructor

import java.util.HashMap;
                DB2Module module = schema.getModuleCache().getObject(monitor, schema, tokens[0]);
            return udf;

            }


                procedure = schema.getProcedureCache().getObject(monitor, schema, tokens[0]);
        this.image = image;
        return image;
    {
            typeMap.put(type.getTypeName(), type);
        return this.name();
 * See the License for the specific language governing permissions and
        if (finder != null) {
            } else {
        }
        {

/*
            return schema.getMaterializedQueryTableCache().getObject(monitor, schema, objectName);
        public DB2MaterializedQueryTable findObject(DBRProgressMonitor monitor, DB2Schema schema, String objectName)
    }),
 * @author Denis Forveille
        for (DB2ObjectType type : values()) {
        }


                DB2Module module = schema.getModuleCache().getObject(monitor, schema, tokens[0]);
            // Routines may be global or from a Module
            return null;
            DB2Variable variable;

            LOG.debug("Unsupported object type: " + objectTypeName);

            return schema.getViewCache().getObject(monitor, schema, objectName, DB2View.class);
    }
            throws DBException
            return schema.getConstraintCache().getObject(monitor, schema, objectName);
    }),
    private final Class<? extends DBSObject> typeClass;

        public DB2Table findObject(DBRProgressMonitor monitor, DB2Schema schema, String objectName) throws DBException
        {
    TABLE(DBIcon.TREE_TABLE, DB2Table.class, new ObjectFinder() {
    // -----------
            return schema.getModuleCache().getObject(monitor, schema, objectName);
    {
            return schema.getCheckCache().getObject(monitor, schema, objectName);
import org.jkiss.dbeaver.model.DBIcon;
    @Override

    // ----------------
public enum DB2ObjectType implements DBSObjectType {
            if (tokens.length == 1) {
    SEQUENCE(DBIcon.TREE_SEQUENCE, DB2Sequence.class, new ObjectFinder() {
        if (finder != null) {
        {
import org.jkiss.dbeaver.DBException;
        }
            return null;
            if (tokens.length == 1) {
 */
            return null;
                return schema.getUdtCache().getObject(monitor, schema, tokens[0]);
    }
        }
    {
    @Override
        @Override
            LOG.debug(objectTypeName + " '" + objectName + "' not found in '" + schema.getName() + "'");
            // Procedure may be global or from a Module
        {
        }
        @Override
        DBSObject findObject(DBRProgressMonitor monitor, DB2Schema schema, String objectName) throws DBException
                DB2Module module = schema.getModuleCache().getObject(monitor, schema, tokens[0]);
    }
        }
        if (object == null) {
    private static class ObjectFinder {
    FOREIGN_KEY(DBIcon.TREE_FOREIGN_KEY, DB2TableForeignKey.class, new ObjectFinder() {


    }),
        DBSObject findObject(DBRProgressMonitor monitor, DB2DataSource db2DataSource, String objectName) throws DBException
                    routine = schema.getProcedureCache().getObject(monitor, schema, tokens[0]);

    public DBSObject findObject(DBRProgressMonitor monitor, DB2Schema schema, String objectName) throws DBException
    }),

            String[] tokens = objectName.split(SPLIT_DOT);
        public DB2TableReference findObject(DBRProgressMonitor monitor, DB2Schema schema, String objectName) throws DBException
            return schema.getSequenceCache().getObject(monitor, schema, objectName);
    }),
    {


                udf = schema.getUdfCache().getObject(monitor, schema, tokens[0]);
            // Variable may be global or from a Module
            } else {
            }
    PACKAGE(DBIcon.TREE_PACKAGE, DB2Package.class, new ObjectFinder() {
    }
 */
        }

        {
        @Override
                DB2Module module = schema.getModuleCache().getObject(monitor, schema, tokens[0]);

            } else {
        @Override
            DB2Routine udf;
        @Override
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        public DB2Routine findObject(DBRProgressMonitor monitor, DB2Schema schema, String objectName) throws DBException
    public DBSObject findObject(DBRProgressMonitor monitor, DB2View db2View, String objectName) throws DBException
            LOG.debug("Schema '" + objectOwner + "' not found");
            return null;

        }
        public DB2View findObject(DBRProgressMonitor monitor, DB2Schema schema, String objectName) throws DBException
        {
            return schema.getAssociationCache().getObject(monitor, schema, objectName);
        }
            if (tokens.length == 1) {
    public boolean isBrowsable()
 *
        @Override
            return schema.getAliasCache().getObject(monitor, schema, objectName);
    }),
            return schema.getIndexCache().getObject(monitor, schema, objectName);
        final DB2Schema schema = dataSource.getSchema(monitor, objectOwner);
    }),
    });
                if (routine == null) {
                DB2Module module = schema.getModuleCache().getObject(monitor, schema, tokens[0]);
        } else {
        }
    public static DB2ObjectType getByType(String typeName)
        @Override

            return objectName;
        {
        {
            String[] tokens = objectName.split(SPLIT_DOT);
 *     http://www.apache.org/licenses/LICENSE-2.0
    // ---
    }
    <OBJECT_TYPE extends DBSObject> DB2ObjectType(DBPImage image, Class<OBJECT_TYPE> typeClass, ObjectFinder finder)
        {
        }
    // -----------

    }),
    @Override

            return objectName;
