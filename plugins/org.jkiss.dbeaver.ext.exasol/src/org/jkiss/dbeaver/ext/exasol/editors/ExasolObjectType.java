    }


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return finder.findObject(monitor, exasolTable, objectName);
    SCHEMA(DBIcon.TREE_SCHEMA, ExasolSchema.class, null),
        return image;
    // ---
import org.jkiss.dbeaver.model.struct.DBSObjectType;
    @Override

        DBSObject findObject(DBRProgressMonitor monitor, ExasolTable exasolTable, String objectName) throws DBException {
        if (finder != null) {
    }
import java.util.HashMap;
        return typeClass;
public enum ExasolObjectType implements DBSObjectType {
    // Helpers
    // Constructor
    }


    public DBSObject findObject(DBRProgressMonitor monitor, ExasolSchema schema, String objectName) throws DBException {
    VIEW(DBIcon.TREE_VIEW, ExasolView.class, null),
import org.jkiss.dbeaver.model.struct.DBSObject;

    }
            typeMap.put(type.getTypeName(), type);
        }
    // Init
    static {
    // -----------
        }

            return null;

            return finder.findObject(monitor, schema, objectName);
    }),
    // ---
    @Override
import org.jkiss.dbeaver.ext.exasol.model.*;
        if (finder != null) {


        }
 * You may obtain a copy of the License at
    // ----------------
package org.jkiss.dbeaver.ext.exasol.editors;
    private static Map<String, ExasolObjectType> typeMap = new HashMap<>();
 * DBeaver - Universal Database Manager
            return schema.getTableCache().getObject(monitor, schema, objectname);

    }
        DBSObject findObject(DBRProgressMonitor monitor, ExasolDataSource exasolDataSource, String objectName) throws DBException {
        } else {
        }
    public boolean isBrowsable() {

    public Class<? extends DBSObject> getTypeClass() {
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    private final DBPImage image;
        }
    // Standard Getters
        }
    <OBJECT_TYPE extends DBSObject> ExasolObjectType(DBPImage image, Class<OBJECT_TYPE> typeClass, ObjectFinder finder) {
        return finder != null;
 * you may not use this file except in compliance with the License.
        this.image = image;
            return exasolTable.getAttribute(monitor, objectName);

        if (finder != null) {
    TABLE(DBIcon.TREE_TABLE, ExasolTable.class, new ObjectFinder() {
    // ----------------
        } else {
            return null;
        }
        return typeMap.get(typename);
 * See the License for the specific language governing permissions and

 * Copyright (C) 2016-2016 Karl Griesser (fullref@gmail.com)
 * distributed under the License is distributed on an "AS IS" BASIS,
    private final ObjectFinder finder;

            return null;
    public DBSObject findObject(DBRProgressMonitor monitor, ExasolTable exasolTable, String objectName) throws DBException {
    ;
    // ----------------
    }

 * Unless required by applicable law or agreed to in writing, software

    }
    // ----------------
import org.jkiss.dbeaver.model.DBPImage;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return null;
            return finder.findObject(monitor, exasolDataSource, objectName);
 *     http://www.apache.org/licenses/LICENSE-2.0
        } else {
        @Override
import org.jkiss.dbeaver.DBException;
        public ExasolTableColumn findObject(DBRProgressMonitor monitor, ExasolTable exasolTable, String objectName) throws DBException {

 *
    private final Class<? extends DBSObject> typeClass;

 *
    public String getDescription() {
        this.finder = finder;
import java.util.Map;

    }
    private static class ObjectFinder {
    public static ExasolObjectType getByType(String typename) {
    }
    public DBSObject findObject(DBRProgressMonitor monitor, ExasolDataSource exasolDataSource, String objectName) throws DBException {
    @Override
    PRIMARYKEY(DBIcon.TREE_UNIQUE_KEY, ExasolTableUniqueKey.class, null)
        for (ExasolObjectType type : values()) {
        public ExasolTable findObject(DBRProgressMonitor monitor, ExasolSchema schema, String objectname) throws DBException {
            return null;
        this.typeClass = typeClass;
/*
    SCRIPT(DBIcon.TREE_PROCEDURE, ExasolScript.class, null), 
        DBSObject findObject(DBRProgressMonitor monitor, ExasolSchema schema, String objectName) throws DBException {
    public DBPImage getImage() {
        }
        }

    }),
    @Override

        @Override
    // -----------
}
    }
    COLUMN(DBIcon.TREE_COLUMN, ExasolTableColumn.class, new ObjectFinder() {
    }
        return this.name();

            return null;
 *


 */
    public String getTypeName() {
    FOREIGNKEY(DBIcon.TREE_FOREIGN_KEY, ExasolTableForeignKey.class, null),
            return null;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.DBIcon;


 * limitations under the License.


