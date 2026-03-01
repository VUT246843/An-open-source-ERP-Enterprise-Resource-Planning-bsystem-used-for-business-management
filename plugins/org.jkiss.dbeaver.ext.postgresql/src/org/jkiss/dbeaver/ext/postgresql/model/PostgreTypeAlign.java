
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
 * DBeaver - Universal Database Manager

/*
 * PostgreTypeAlign
 *
    public String getName() {
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
        return desc;


 * limitations under the License.
 *
 *
{
    }
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 */
    s("short", 2),
/**
    i("int", 4),
}

    PostgreTypeAlign(String desc, int bytes) {
        this.desc = desc;
    }
        return bytes;
import org.jkiss.code.NotNull;

    private final String desc;
public enum PostgreTypeAlign implements DBPNamedObject
    c("char", 1),
package org.jkiss.dbeaver.ext.postgresql.model;
 *     http://www.apache.org/licenses/LICENSE-2.0
    d("double", 8);
    }
    private final int bytes;
 */
import org.jkiss.dbeaver.model.DBPNamedObject;
        this.bytes = bytes;
    public int getBytes() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull
