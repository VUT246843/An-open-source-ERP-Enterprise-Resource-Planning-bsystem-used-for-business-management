        return getName();
 * limitations under the License.
import org.jkiss.dbeaver.model.DBPNamedObject;

/**
 * DBeaver - Universal Database Manager

/*
 *
    public static final PostgreTriggerType STATEMENT = new PostgreTriggerType("STATEMENT");

    {

 * See the License for the specific language governing permissions and

    }
 * Unless required by applicable law or agreed to in writing, software
    @NotNull
 *
} */
        this.name = name;
    protected PostgreTriggerType(String name)
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    public static final PostgreTriggerType ROW = new PostgreTriggerType("ROW");
 * Licensed under the Apache License, Version 2.0 (the "License");

{
package org.jkiss.dbeaver.ext.postgresql.model;

 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public String getName() {
    {
    }
        return name;
 */
    private final String name;

    public String toString()
 * you may not use this file except in compliance with the License.
public class PostgreTriggerType implements DBPNamedObject
 * You may obtain a copy of the License at
 * PostgreTriggerType
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.NotNull;
