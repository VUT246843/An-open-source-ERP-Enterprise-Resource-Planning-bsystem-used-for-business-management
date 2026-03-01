 * Copyright (C) 2010-2025 DBeaver Corp and others
 * You may obtain a copy of the License at
            return UPDATE;
    {

/*
            return DELETE;

        } else if (name.toUpperCase(Locale.ENGLISH).equals(DELETE.getName())) {
    public static final DBSManipulationType INSERT = new DBSManipulationType("INSERT");
package org.jkiss.dbeaver.model.struct.rdb;
}import java.util.Locale;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
import org.jkiss.dbeaver.model.DBPNamedObject;
        }
 * DBeaver - Universal Database Manager


    public static DBSManipulationType getByName(String name)
        return getName();
 *
{
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
    public static final DBSManipulationType UNKNOWN = new DBSManipulationType("UNKNOWN");
 *
    public static final DBSManipulationType DELETE = new DBSManipulationType("DELETE");
 *
        return name;
public class DBSManipulationType implements DBPNamedObject
        } else {
    }
    }
 */
 * DBSManipulationType
    }
    public static final DBSManipulationType UPDATE = new DBSManipulationType("UPDATE");

    @NotNull
/**
 * Unless required by applicable law or agreed to in writing, software

 */
    public String getName() {
 * limitations under the License.
    {
        this.name = name;



    public String toString()
    protected DBSManipulationType(String name)
        } if (name.toUpperCase(Locale.ENGLISH).equals(UPDATE.getName())) {
            return UNKNOWN;
            return INSERT;
    {
        if (name.toUpperCase(Locale.ENGLISH).equals(INSERT.getName())) {
import org.jkiss.code.NotNull;
 * you may not use this file except in compliance with the License.
    public static final DBSManipulationType TRUNCATE = new DBSManipulationType("TRUNCATE");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private final String name;
