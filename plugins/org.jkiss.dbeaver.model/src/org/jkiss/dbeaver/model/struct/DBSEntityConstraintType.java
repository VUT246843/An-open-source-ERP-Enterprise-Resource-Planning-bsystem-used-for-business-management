    public boolean isAssociation()
    public String getName() {
 * you may not use this file except in compliance with the License.

    }
    public String toString()
    private final boolean logical;
    {
        this.custom = custom;
 * limitations under the License.
    @NotNull
    private final boolean association;
    private final String name;
 *
 */
 * Unless required by applicable law or agreed to in writing, software
    public static final DBSEntityConstraintType NOT_NULL = new DBSEntityConstraintType("notnull", "NOT NULL", ModelMessages.model_struct_Not_NULL, false, false, false, false); //$NON-NLS-1$
        return logical;

    public static final DBSEntityConstraintType ASSOCIATION = new DBSEntityConstraintType("association", "Association", ModelMessages.model_struct_Association, true, false, false, false); //$NON-NLS-1$
        return localizedName;
 */
import org.jkiss.code.NotNull;
    private final String id;
public class DBSEntityConstraintType {
    {
        return id;
        return unique;
    public static final DBSEntityConstraintType CHECK = new DBSEntityConstraintType("check", "CHECK", ModelMessages.model_struct_Check, false, false, true, false); //$NON-NLS-1$

    /**
 * See the License for the specific language governing permissions and
        return custom;
    public static final DBSEntityConstraintType INHERITANCE = new DBSEntityConstraintType("inheritance", "Inheritance", ModelMessages.model_struct_Inheritance, true, false, false, false); //$NON-NLS-1$

    }
        this.name = name;



        this.id = id;

    }
        this.logical = logical;
    }
    {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
    private final boolean custom;

     * Custom constraint (like CHECK) has some associated SQL expression
    public DBSEntityConstraintType(String id, String name, String localizedName, boolean association, boolean unique, boolean custom, boolean logical)
} * distributed under the License is distributed on an "AS IS" BASIS,
    {
 *
    public static final DBSEntityConstraintType UNIQUE_KEY = new DBSEntityConstraintType("unique", "UNIQUE KEY", ModelMessages.model_struct_Unique_Key, false, true, false, false); //$NON-NLS-1$
    public static final DBSEntityConstraintType VIRTUAL_KEY = new DBSEntityConstraintType("vpk", "VIRTUAL PRIMARY KEY", ModelMessages.model_struct_Virtual_Key, false, true, false, true); //$NON-NLS-1$
    public String getId() {
 * DBSEntityConstraintType
    public static final DBSEntityConstraintType PSEUDO_KEY = new DBSEntityConstraintType("pseudo", "PSEUDO", ModelMessages.model_struct_Pseudo_Key, false, true, false, false); //$NON-NLS-1$

    public static final DBSEntityConstraintType PRIMARY_KEY = new DBSEntityConstraintType("pk", "PRIMARY KEY", ModelMessages.model_struct_Primary_Key, false, true, false, false); //$NON-NLS-1$

    }
/**
    }

    public static final DBSEntityConstraintType INDEX = new DBSEntityConstraintType("index", "Index", ModelMessages.model_struct_Index, false, false, false, false); //$NON-NLS-1$
        return association;
        return getName();
        this.unique = unique;
    public boolean isLogical() {
    public boolean isCustom() {
    public static final DBSEntityConstraintType FOREIGN_KEY = new DBSEntityConstraintType("fk", "FOREIGN KEY", ModelMessages.model_struct_Foreign_Key, true, false, false, false); //$NON-NLS-1$
        this.localizedName = localizedName == null ? name : localizedName;
 * DBeaver - Universal Database Manager
    public static final DBSEntityConstraintType VIRTUAL_FOREIGN_KEY = new DBSEntityConstraintType("vfk", "VIRTUAL FOREIGN KEY", ModelMessages.model_struct_Virtual_Foreign_Key, true, true, false, true); //$NON-NLS-1$
    {
 *
    public boolean isUnique()
import org.jkiss.dbeaver.model.messages.ModelMessages;
     */

    }
    public String getLocalizedName()
        return name;
package org.jkiss.dbeaver.model.struct;
        this.association = association;
    private final String localizedName;
    }
    }
    private final boolean unique;
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
