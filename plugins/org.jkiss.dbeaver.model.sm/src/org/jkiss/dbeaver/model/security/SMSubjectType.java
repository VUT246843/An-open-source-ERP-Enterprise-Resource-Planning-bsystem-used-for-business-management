/*
    team("R");
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.code = code;

 * Copyright (C) 2010-2024 DBeaver Corp and others
    SMSubjectType(String code) {
 * distributed under the License is distributed on an "AS IS" BASIS,
            if (st.code.equals(code)) {
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
        }
        for (SMSubjectType st : values()) {
 * You may obtain a copy of the License at
    }
public enum SMSubjectType {
        return code;
 * limitations under the License.
}
    public static SMSubjectType fromCode(String code) {
                return st;
    private final String code;


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 *
    }
        throw new IllegalArgumentException("Bad subject type code: " + code);

 * See the License for the specific language governing permissions and
    public String getCode() {
 *
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.model.security;
 * you may not use this file except in compliance with the License.
            }
    user("U"),
    }
