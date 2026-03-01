        this.id = id;
    }

    public static final DBSEntityType ASSOCIATION = new DBSEntityType("association", "Association", DBIcon.TREE_ASSOCIATION, false); //$NON-NLS-1$
    }
 * Entity type
    public static final DBSEntityType VIRTUAL_ENTITY = new DBSEntityType("virtual_entity", "Virtual Entity", DBIcon.TREE_TABLE, true); //$NON-NLS-1$
    public String getId() {

 * See the License for the specific language governing permissions and
    {
    public String toString()

    private final String name;
    public static final DBSEntityType PACKAGE = new DBSEntityType("package", "Package", DBIcon.TREE_PACKAGE, true);
import org.jkiss.dbeaver.model.DBIcon;
    public DBSEntityType(String id, String name, DBPImage icon, boolean physical)
/**
 * DBeaver - Universal Database Manager
        return icon;
        this.name = name;
    private final DBPImage icon;
{
import org.jkiss.dbeaver.model.DBPImage;
        this.icon = icon;
    public static final DBSEntityType VIRTUAL_ASSOCIATION = new DBSEntityType("virtual_association", "Virtual Association", DBIcon.TREE_ASSOCIATION, false); //$NON-NLS-1$
    public static final DBSEntityType SEQUENCE = new DBSEntityType("sequence", "Sequence", DBIcon.TREE_SEQUENCE, true);
 * Licensed under the Apache License, Version 2.0 (the "License");

    public static final DBSEntityType EVENT = new DBSEntityType("event", "Event", DBIcon.TREE_EVENT, true);
    public DBPImage getIcon()
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        this.physical = physical;
    }
 * you may not use this file except in compliance with the License.
        return getName();
    public static final DBSEntityType VIEW = new DBSEntityType("view", "View", DBIcon.TREE_VIEW, true); //$NON-NLS-1$

    public static final DBSEntityType TABLE = new DBSEntityType("table", "Table", DBIcon.TREE_TABLE, true); //$NON-NLS-1$
    }
    public static final DBSEntityType TYPE = new DBSEntityType("type", "Type", DBIcon.TREE_DATA_TYPE, true); //$NON-NLS-1$
 * distributed under the License is distributed on an "AS IS" BASIS,
} * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * Unless required by applicable law or agreed to in writing, software
        return id;
 */
    {
 * Copyright (C) 2010-2024 DBeaver Corp and others

    }
    public static final DBSEntityType CLASS = new DBSEntityType("class", "Class", DBIcon.TREE_CLASS, false); //$NON-NLS-1$
 */
 * limitations under the License.
/*
    {


    public static final DBSEntityType TRIGGER = new DBSEntityType("trigger", "Trigger", DBIcon.TREE_TRIGGER, true); //$NON-NLS-1$
        return physical;
    {
    public String getName() {

package org.jkiss.dbeaver.model.struct;
 * You may obtain a copy of the License at
    private final boolean physical;
        return name;
 *

    public boolean isPhysical()
public class DBSEntityType
    private final String id;
