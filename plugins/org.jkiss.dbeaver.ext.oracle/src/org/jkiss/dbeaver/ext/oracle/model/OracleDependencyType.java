 *
package org.jkiss.dbeaver.ext.oracle.model;

 * You may obtain a copy of the License at
    HARD("HARD"),
    public String getType() {
 * See the License for the specific language governing permissions and
    }
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
        if ("HARD".equals(type)) {

 * Unless required by applicable law or agreed to in writing, software
    }
        if ("REF".equals(type)) {
public enum OracleDependencyType {
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}

 * Copyright (C) 2010-2024 DBeaver Corp and others
        return null;
    REF("REF");
    }
            return HARD;
        this.type = type;
 *

 *     http://www.apache.org/licenses/LICENSE-2.0
    public static OracleDependencyType getByType(String type) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    OracleDependencyType(String type) {
    private final String type;

        return type;
 *
            return REF;
        }
        }
 * limitations under the License.
 */
 * you may not use this file except in compliance with the License.
