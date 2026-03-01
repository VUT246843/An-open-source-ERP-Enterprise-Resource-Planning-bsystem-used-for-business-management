


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public abstract class DBSLogicalObject<TYPE extends DBSObject> {
        return (flags & FLAG_EXCLUDE) != 0;
 * See the License for the specific language governing permissions and
    private String objectPattern;
package org.jkiss.dbeaver.model.logical;
}
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
/*
    private byte flags;
 * Unless required by applicable law or agreed to in writing, software
    public boolean isExclude() {

 * Logical entity
 * you may not use this file except in compliance with the License.
        return true;
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
 *

 * You may obtain a copy of the License at
    public static final byte FLAG_CASE_SENSITIVE = 1;
 *
 * limitations under the License.
    public boolean isObjectIncluded(TYPE object) {

 * DBeaver - Universal Database Manager
    public static final byte FLAG_EXCLUDE = 1;

    }
import org.jkiss.dbeaver.model.struct.DBSObject;

