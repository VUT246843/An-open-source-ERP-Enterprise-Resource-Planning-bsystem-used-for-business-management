    }
import org.jkiss.dbeaver.model.struct.DBSObjectType;
            log.debug("Unsupported object for SQL Server search: " + name());
        }

import org.jkiss.dbeaver.ext.generic.model.GenericObjectContainer;
    public String toString() {

    }
 * Unless required by applicable law or agreed to in writing, software

        return icon;

 * See the License for the specific language governing permissions and
            return schema.getChild(monitor, objectName);

import org.jkiss.dbeaver.ext.generic.model.GenericTable;
 *
        return type;
    @Override
    TABLE("TABLE", "HANA table", GenericTable.class, DBIcon.TREE_TABLE),
    @Override

 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return description;

    @Override
            return schema.getProcedure(monitor, objectName);
        } else if (HANASynonym.class.isAssignableFrom(theClass)) {
        } else if (HANAProcedure.class.isAssignableFrom(theClass)) {
        if (schema == null) {
    }
            log.debug("Null schema in table " + objectName + " search (" + objectName + ")");
 *
 * DBeaver - Universal Database Manager
        if (GenericTable.class.isAssignableFrom(theClass) || HANAView.class.isAssignableFrom(theClass)) {
package org.jkiss.dbeaver.ext.hana.model;

    public DBSObject findObject(DBRProgressMonitor monitor, GenericObjectContainer schema, String objectName) throws DBException {
    private final String type;
    SYNONYM("SYNONYM", "HANA synonym", HANASynonym.class, DBIcon.TREE_SYNONYM),
import org.jkiss.dbeaver.model.DBIcon;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
    HANAObjectType(String type, String description, Class<? extends DBSObject> theClass, DBPImage icon) {
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
 *
        this.theClass = theClass;
    private static final Log log = Log.getLog(HANAObjectType.class);

        return theClass;
            return null;
    }
    }
    private final DBPImage icon;

import org.jkiss.dbeaver.model.struct.DBSObject;
public enum HANAObjectType implements DBSObjectType {
    }
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
import org.jkiss.dbeaver.Log;
    public Class<? extends DBSObject> getTypeClass() {
    VIEW("VIEW", "HANA view", HANAView.class, DBIcon.TREE_VIEW),
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.DBException;
    public DBPImage getImage() {

        this.type = type;
        this.icon = icon;
        }
    @Override
            return null;
        this.description = description;
import org.jkiss.dbeaver.model.DBPImage;
    SCHEMA("SCHEMA", "HANA schema", HANASchema.class, DBIcon.TREE_SCHEMA);
    private final String description;

 * limitations under the License.
    private final Class<? extends DBSObject> theClass;
        return type;
    public String getTypeName() {

    PROCEDURE("PROCEDURE", "HANA procedure", HANAProcedure.class, DBIcon.TREE_PROCEDURE),
        } else {
    }
            return schema.getSynonym(monitor, objectName);
    public String getDescription() {
}
