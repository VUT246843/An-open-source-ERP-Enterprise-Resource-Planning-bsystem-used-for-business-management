/**
    CONNECT('c', true, PostgreDatabase.class),
    EXECUTE('X', true, PostgreProcedure.class),
    public boolean isValid() {
 */
            if (pt.getCode() == pCode) {

    PostgrePrivilegeType(char code, boolean valid, Class<?> ... targetType) {
 * limitations under the License.
        } catch (IllegalArgumentException e) {
    RULE('R', true, PostgreTableReal.class),
    REFERENCES('x', true, PostgreTableReal.class, PostgreTableColumn.class),
    UNKNOWN((char)0, false);
    CREATE('C', true, PostgreDatabase.class, PostgreSchema.class, PostgreTablespace.class),
    }

    private final boolean valid;
                return pt;
 * PostgrePrivilegeType
    TRIGGER('t', true, PostgreTableReal.class),
        for (Class<?> aClass : targetType) {
            return UNKNOWN;
            return valueOf(type);
        }
}
    DELETE('d', true, PostgreTableReal.class, PostgreTableColumn.class),
    ZONECONFIG('z', true, PostgreDatabase.class, PostgreTableReal.class),
        }

        return name();
public enum PostgrePrivilegeType implements DBAPrivilegeType {

 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
    SELECT('r', true, PostgreTableBase.class, PostgreTableColumn.class),

 * Licensed under the Apache License, Version 2.0 (the "License");
    ALL(' ', false, Object.class),
    TEMPORARY('T', true, PostgreDatabase.class),
 * @see <a href="https://www.postgresql.org/docs/current/ddl-priv.html#PRIVILEGE-ABBREVS-TABLE">5.1. ACL Privilege Abbreviations</a>

    }
        return valid;
    }

        return code;
    UPDATE('w', true, PostgreTableBase.class, PostgreTableColumn.class),
 * Copyright (C) 2010-2025 DBeaver Corp and others
        return targetType;
    INSERT('a', true, PostgreTableReal.class, PostgreTableColumn.class),
    public boolean supportsType(@NotNull Class<?> objectType) {
    @Override
            }


import org.jkiss.code.NotNull;

    public static PostgrePrivilegeType fromString(String type) {
    }
            }
    }
    // ALL privs

    public String getName() {
    TRUNCATE('D', true, PostgreTableReal.class),
 */
 *
/*
 * See the License for the specific language governing permissions and


        try {
    // Specific Cockroach types
        if (PostgreRole.class.isAssignableFrom(objectType)) {
        return UNKNOWN;
    USAGE('U', true, PostgreSequence.class, PostgreDataType.class, PostgreSchema.class),
        }
    }
    // TABLE privs
 *
            return true;

    @NotNull
    }
 *
    MAINTAIN('m', true, PostgreTable.class, PostgreMaterializedView.class),
import org.jkiss.dbeaver.model.access.DBAPrivilegeType;
        return false;
    }
package org.jkiss.dbeaver.ext.postgresql.model;
        this.valid = valid;
        }
    public Class<?>[] getTargetType() {

        for (PostgrePrivilegeType pt : values()) {
    @Override
    ALTER('A', true, PostgreDatabase.class, PostgreSchema.class, PostgreTableReal.class), // Redshift-specific

 * You may obtain a copy of the License at
        this.code = code;
    private final char code;
    public static PostgrePrivilegeType getByCode(char pCode) {
    public char getCode() {
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private final Class<?>[] targetType;
                return true;
            if (aClass.isAssignableFrom(objectType)) {
    @Override
        this.targetType = targetType;
    // Redshift-specific types
 * Unless required by applicable law or agreed to in writing, software
    GRANT('g', true, PostgreDatabase.class, PostgreSchema.class, PostgreTableReal.class, PostgreDataType.class),
