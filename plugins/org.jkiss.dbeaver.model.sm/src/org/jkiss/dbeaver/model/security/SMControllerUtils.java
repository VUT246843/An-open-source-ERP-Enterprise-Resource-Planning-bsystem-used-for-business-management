
/*
 */
        @NotNull DBPProject project,
package org.jkiss.dbeaver.model.security;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
import org.jkiss.code.NotNull;
 * limitations under the License.
 *
    @NotNull
        List<SMObjectSettings> settings = smController.getObjectSettings(project.getId(), null, null, null);
import java.util.Map;
        Map<SMObjectType, Map<String, Map<String, String>>> result = new LinkedHashMap<>();
 * Unless required by applicable law or agreed to in writing, software
        @NotNull SMController smController
    public static Map<SMObjectType, Map<String, Map<String, String>>> getObjectSettingsMap(
import org.jkiss.dbeaver.model.app.DBPProject;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            result.computeIfAbsent(os.objectType(), ot -> new LinkedHashMap<>())
 * Copyright (C) 2010-2025 DBeaver Corp and others
public class SMControllerUtils {
import java.util.List;
 *
import org.jkiss.dbeaver.DBException;
        for (SMObjectSettings os : settings) {
        }
        return result;
                .computeIfAbsent(os.objectId(), oid -> os.settings());
    ) throws DBException {
}
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0

 * you may not use this file except in compliance with the License.
import java.util.LinkedHashMap;
