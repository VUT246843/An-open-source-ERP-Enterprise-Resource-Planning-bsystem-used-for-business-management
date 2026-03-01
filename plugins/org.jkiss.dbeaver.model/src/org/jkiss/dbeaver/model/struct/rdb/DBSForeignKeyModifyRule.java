 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
/**
    }
    }
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.DBPNamedObject;

 * DBeaver - Universal Database Manager
    private final String name;
    {
    @Override
    {
    @Override
 */

    private final String clause;
        return id;

        return name;

 * Unless required by applicable law or agreed to in writing, software
    {
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    public static final DBSForeignKeyModifyRule SET_DEFAULT = new DBSForeignKeyModifyRule("SET_DEFAULT", ModelMessages.model_struct_Set_Default, "SET DEFAULT"); //$NON-NLS-1$ //$NON-NLS-3$

        return clause;
    public DBSForeignKeyModifyRule(String id, String name, String clause)
}
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.messages.ModelMessages;
 * See the License for the specific language governing permissions and
 *
    }
 * DBSForeignKeyModifyRule
        this.clause = clause;

    @NotNull
 */
{
    public String getClause()
public class DBSForeignKeyModifyRule implements DBPNamedObject
        return id;
    public static final DBSForeignKeyModifyRule SET_NULL = new DBSForeignKeyModifyRule("SET_NULL", ModelMessages.model_struct_Set_NULL, "SET NULL"); //$NON-NLS-1$ //$NON-NLS-3$
    private final String id;
    public static final DBSForeignKeyModifyRule NO_ACTION = new DBSForeignKeyModifyRule("NO_ACTION", ModelMessages.model_struct_No_Action, null); //$NON-NLS-1$
    public static final DBSForeignKeyModifyRule RESTRICT = new DBSForeignKeyModifyRule("RESTRICT", ModelMessages.model_struct_Restrict, "RESTRICT"); //$NON-NLS-1$ //$NON-NLS-3$
    {
    public String getId()
    public String getName()

 *
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.id = id;
package org.jkiss.dbeaver.model.struct.rdb;
    public static final DBSForeignKeyModifyRule CASCADE = new DBSForeignKeyModifyRule("CASCADE", ModelMessages.model_struct_Cascade, "CASCADE"); //$NON-NLS-1$ //$NON-NLS-3$
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others

    public static final DBSForeignKeyModifyRule UNKNOWN = new DBSForeignKeyModifyRule("UNKNOWN", "?", null); //$NON-NLS-1$ //$NON-NLS-2$
    }
        this.name = name;
/*
    public String toString()
    {
 * limitations under the License.
