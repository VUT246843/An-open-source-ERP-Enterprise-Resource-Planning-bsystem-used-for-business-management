
 * Unless required by applicable law or agreed to in writing, software
     */

     * @param prefix project prefix char
 * limitations under the License.
 *
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
/*

                return id.substring(2);
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
    }

    /**
    public static String getPlainProjectId(DBPProject project) {
 * Copyright (C) 2010-2024 DBeaver Corp and others

import org.jkiss.code.NotNull;
            char typeC = id.charAt(0);
        if (id.length() > 2 && id.charAt(1) == '_') {
        return USER;
package org.jkiss.dbeaver.model.rm;
 */
     * Helps to find RMProjectType by prefix
            if (value.getPrefix().equals(prefix)) {
                return value;
    private final String prefix;
    RMProjectType(String prefix) {
     * @return RMProjectType by prefix
            }
}
            if (typeC == 'g' || typeC == 's' || typeC == 'u') {
        }
        for (RMProjectType value : values()) {
public enum RMProjectType {
        return id;
 * Licensed under the Apache License, Version 2.0 (the "License");
    SHARED("s"),
        }
 *
import org.jkiss.dbeaver.model.app.DBPProject;
 * you may not use this file except in compliance with the License.
    }
 *

    GLOBAL("g"),
    public static RMProjectType getByPrefix(@NotNull String prefix) {

     *
    public String getPrefix() {
        this.prefix = prefix;

    }
    USER("u");
 * You may obtain a copy of the License at
        String id = project.getId();
        // Default value
        return prefix;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
