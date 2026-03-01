/**
/*
            .toArray(PostgreAttributeStorage[]::new);
 * distributed under the License is distributed on an "AS IS" BASIS,
    public String getCode() {
 */
 *
    MAIN("m"),
    }

            }
import java.util.Arrays;
    }
 * limitations under the License.

 *
package org.jkiss.dbeaver.ext.postgresql.model;

    }
        return Arrays.stream(values())
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * PostgreAttributeStorage
            .filter(e -> e.isSupported(dataSource))

}
 * DBeaver - Universal Database Manager
    }
    PLAIN("p"),
public enum PostgreAttributeStorage {
        return code;
    private final String code;
        this.code = code;
 * Unless required by applicable law or agreed to in writing, software
 */


    EXTERNAL("e"),
 * Copyright (C) 2010-2024 DBeaver Corp and others
        for (PostgreAttributeStorage as : values()) {
    public static PostgreAttributeStorage[] getValues(PostgreDataSource dataSource) {
 * See the License for the specific language governing permissions and
    EXTENDED("x");
 * you may not use this file except in compliance with the License.
    DEFAULT("?"),
                return as;
    } 
    public static PostgreAttributeStorage getByCode(String code) {
        return (! this.code.equals("?")) || dataSource.isServerVersionAtLeast(16, 0);

        return DEFAULT;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    PostgreAttributeStorage(String code) {
            if (as.getCode().equals(code)) {
 * You may obtain a copy of the License at
    protected boolean isSupported(PostgreDataSource dataSource) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
