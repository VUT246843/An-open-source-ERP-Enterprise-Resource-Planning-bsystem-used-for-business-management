            if (pt.getCode() == pCode) {
 * distributed under the License is distributed on an "AS IS" BASIS,

/*

    public String getTableTypeClause() {
 * Licensed under the Apache License, Version 2.0 (the "License");
    TEMPORARY('t', "TEMP TABLE"),
    UNLOGGED('u', "UNLOGGED TABLE"),
    }
 * limitations under the License.
    UNKNOWN('?', "?");
        this.code = code;
        return code != null && code.length() == 1 ? getByCode(code.charAt(0)) : UNKNOWN;
        return tableType;
    }
public enum PostgreTablePersistence {
 *

    }
 *
    public char getCode() {
 *
    }
}
                return pt;
        for (PostgreTablePersistence pt : values()) {
    public static PostgreTablePersistence getByCode(char pCode) {


    private final String tableType;
 * See the License for the specific language governing permissions and
    public static PostgreTablePersistence getByCode(String code) {
 * Unless required by applicable law or agreed to in writing, software
/**
 */
        return UNKNOWN;
    private final char code;
    PostgreTablePersistence(char code, String tableType) {
package org.jkiss.dbeaver.ext.postgresql.model;
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return code;


    PERMANENT('p', "TABLE"),
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager

        this.tableType = tableType;
 * Copyright (C) 2010-2024 DBeaver Corp and others
            }
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
    }
 * PostgreTablePersistence
 * you may not use this file except in compliance with the License.
