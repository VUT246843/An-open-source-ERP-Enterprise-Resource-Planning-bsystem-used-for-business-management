 * you may not use this file except in compliance with the License.

} * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
            return BEFORE;
        return getName();
public class DBSActionTiming implements DBPNamedObject
    public String getName() {
 * distributed under the License is distributed on an "AS IS" BASIS,
    {
{
        }
    public String toString()

/**
            return AFTER;
 */
    }


 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
    {
        this.name = name;
 * You may obtain a copy of the License at

    }
 * DBeaver - Universal Database Manager
    {

 * See the License for the specific language governing permissions and
    }
            return UNKNOWN;
import org.jkiss.code.NotNull;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
    @NotNull
    public static DBSActionTiming getByName(String name)
 *     http://www.apache.org/licenses/LICENSE-2.0
    public static final DBSActionTiming BEFORE = new DBSActionTiming("BEFORE");
import org.jkiss.dbeaver.model.DBPNamedObject;
 *
        return name;
        } else if (name.toUpperCase(Locale.ENGLISH).equals(AFTER.getName())) {
 * DBSEntityConstraintType

    private final String name;
package org.jkiss.dbeaver.model.struct;
    public static final DBSActionTiming INSTEAD = new DBSActionTiming("INSTEAD");
    protected DBSActionTiming(String name)
        if (name.toUpperCase(Locale.ENGLISH).equals(BEFORE.getName())) {
    }
 */

    public static final DBSActionTiming AFTER = new DBSActionTiming("AFTER");
    public static final DBSActionTiming UNKNOWN = new DBSActionTiming("UNKNOWN");
        } else {

import java.util.Locale;
 *
