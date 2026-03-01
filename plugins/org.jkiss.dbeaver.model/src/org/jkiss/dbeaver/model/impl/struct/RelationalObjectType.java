    public static final DBSObjectType TYPE_SEQUENCE = new RelationalObjectType("Sequence", "Sequence", DBIcon.TREE_SEQUENCE, DBSSequence.class);
import org.jkiss.dbeaver.model.DBPImage;
 * You may obtain a copy of the License at
/*
 * Relational database object type.
    public static final DBSObjectType TYPE_MATERIALIZED_VIEW = new RelationalObjectType("Materialized view", "Materialized view", DBIcon.TREE_VIEW, DBSView.class);
 * Licensed under the Apache License, Version 2.0 (the "License");
    public static final DBSObjectType TYPE_VIEW_COLUMN = new RelationalObjectType("View column", "View column", DBIcon.TREE_COLUMN, DBSTableColumn.class);
import org.jkiss.dbeaver.model.struct.DBSDataType;

 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.model.impl.struct;
 *
 *
    public static final DBSObjectType TYPE_SCHEMA = new RelationalObjectType("Schema", "Schema", DBIcon.TREE_SCHEMA, DBSSchema.class);
    public static final DBSObjectType TYPE_VIEW = new RelationalObjectType("View", "View", DBIcon.TREE_VIEW, DBSView.class);
    public static final DBSObjectType TYPE_PROCEDURE = new RelationalObjectType("Procedure", "Procedure or function", DBIcon.TREE_PROCEDURE, DBSProcedure.class);
    public static final DBSObjectType TYPE_PACKAGE = new RelationalObjectType("Package", "Package", DBIcon.TREE_PACKAGE, DBSPackage.class);
    private RelationalObjectType(String typeName, String description, DBPImage image, Class<? extends DBSObject> objectClass) {
    public static final DBSObjectType TYPE_TABLE = new RelationalObjectType("Table", "Table", DBIcon.TREE_TABLE, DBSTable.class);
 * Used by structure assistants

import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.model.struct.DBSAlias;
 * limitations under the License.
 */
 */
    public static final DBSObjectType TYPE_TRIGGER = new RelationalObjectType("Trigger", "Trigger", DBIcon.TREE_TRIGGER, DBSTrigger.class);
 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.model.struct.DBSObjectType;
    public static final DBSObjectType TYPE_CATALOG = new RelationalObjectType("Catalog", "Catalog", DBIcon.TREE_DATABASE, DBSCatalog.class);
    public static final DBSObjectType TYPE_SYNONYM = new RelationalObjectType("Synonym", "Synonym", DBIcon.TREE_SYNONYM, DBSAlias.class);

    public static final DBSObjectType TYPE_TABLE_COLUMN = new RelationalObjectType("Table column", "Table column", DBIcon.TREE_COLUMN, DBSTableColumn.class);
    public static final DBSObjectType TYPE_INDEX = new RelationalObjectType("Index", "Index", DBIcon.TREE_INDEX, DBSTableIndex.class);
/**
    public static final DBSObjectType TYPE_UNKNOWN = new RelationalObjectType("Unknown", "Unknown object type", DBIcon.TYPE_OBJECT, DBSObject.class);
}
import org.jkiss.dbeaver.model.struct.rdb.*;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
    public static final DBSObjectType TYPE_DATA_TYPE = new RelationalObjectType("Data type", "Data type", DBIcon.TREE_DATA_TYPE, DBSDataType.class);
    }
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.DBIcon;

        super(typeName, description, image, objectClass);
public class RelationalObjectType extends AbstractObjectType {
    public static final DBSObjectType TYPE_CONSTRAINT = new RelationalObjectType("Constraint", "Table constraint", DBIcon.TREE_CONSTRAINT, DBSTableConstraint.class);
 *
