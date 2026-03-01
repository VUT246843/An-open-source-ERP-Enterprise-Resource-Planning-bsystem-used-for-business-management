        if (GenericTable.class.isAssignableFrom(theClass) || VerticaView.class.isAssignableFrom(theClass)) {
        this.typeName = type;
    VerticaObjectType(String type, String description, Class<? extends DBSObject> theClass, DBPImage icon) {
        if (schema == null) {
    VIEW("View", "Vertica View", VerticaView.class, DBIcon.TREE_VIEW),

/*
        GenericDataSource dataSource = schema.getDataSource();
import org.jkiss.dbeaver.Log;
        }
        }



    }
    @Override

    public DBPImage getImage() {

    @Override
    private final Class<? extends DBSObject> theClass;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.DBIcon;
/**
    }
        if (dataSource instanceof VerticaDataSource && VerticaNode.class.isAssignableFrom(theClass)) {
        if (schema instanceof VerticaSchema && VerticaProjection.class.isAssignableFrom(theClass)) {
package org.jkiss.dbeaver.ext.vertica.model;
        return icon;
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.model.struct.DBSObjectType;
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
        return typeName;
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
    TABLE("Table", "Vertica table", VerticaTable.class, DBIcon.TREE_TABLE),
 *
            return null;
    SYSTEM_TABLE("System table", "Vertica system table", VerticaSystemTable.class, DBIcon.TREE_TABLE),
 * Unless required by applicable law or agreed to in writing, software

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
    public String getTypeName() {
            log.debug("Null schema in table " + objectName + " search (" + objectName + ")");
    public Class<? extends DBSObject> getTypeClass() {
 */
    }

    private final String typeName;

    NODE("Node", "Vertica Node", VerticaNode.class, DBIcon.TREE_SERVERS),
import org.jkiss.dbeaver.DBException;
        return theClass;
            return (((VerticaDataSource) dataSource).getClusterNode(monitor, objectName));
 * you may not use this file except in compliance with the License.
        return null;
            return ((VerticaSchema) schema).getProjection(monitor, objectName);

 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ext.generic.model.GenericTable;
 */
        log.debug("Unsupported object for Vertica search: " + name());
    private final String description;
        }
        this.description = description;
    public DBSObject findObject(DBRProgressMonitor monitor, GenericObjectContainer schema, String objectName) throws DBException {
 * DBeaver - Universal Database Manager

        this.theClass = theClass;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ext.generic.model.GenericObjectContainer;
        this.icon = icon;
    public String getDescription() {
 *
            return schema.getChild(monitor, objectName);
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
 * VerticaObjectType
    }
    private static final Log log = Log.getLog(VerticaObjectType.class);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
}        return description;
    @Override
    }
    PROJECTION("Projection", "Vertica Projection", VerticaProjection.class, DBIcon.TREE_TABLE_INDEX),
public enum VerticaObjectType implements DBSObjectType {
    private final DBPImage icon;

    }
    @Override
import org.jkiss.dbeaver.model.DBPImage;
    SEQUENCE("Sequence", "Vertica Sequence", VerticaSequence.class, DBIcon.TREE_SEQUENCE);
 * limitations under the License.
