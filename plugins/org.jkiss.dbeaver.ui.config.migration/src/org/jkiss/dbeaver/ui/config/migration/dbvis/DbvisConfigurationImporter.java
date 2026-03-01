 *
    static {
    ) {
        }
import org.jkiss.dbeaver.DBException;
 * See the License for the specific language governing permissions and
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            DbvisConfigurationCreator dbvisConfigurationCreator = configuration.getValue();
        @NotNull ImportData data,
import org.jkiss.code.NotNull;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.io.File;
        version2creator.put(DbvisConfigurationCreatorv7.VERSION, new DbvisConfigurationCreatorv7());
            if (configurationAsset != null && configurationAsset.exists()) {

import java.util.Map.Entry;
    }
        for (Entry<String, DbvisConfigurationCreator> configuration : version2creator.entrySet()) {
                } catch (DBException e) {
    private static final Map<String, DbvisConfigurationCreator> version2creator = new LinkedHashMap<>();
 *
package org.jkiss.dbeaver.ui.config.migration.dbvis;
 *
/*
import org.jkiss.dbeaver.ui.config.migration.wizards.ImportData;
        return data;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public ImportData importConfiguration(
    private static final Log log = Log.getLog(DbvisConfigurationImporter.class);
import java.util.LinkedHashMap;
            File configurationAsset = dbvisConfigurationCreator.getConfigurationAsset(folder);
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
                }
 * limitations under the License.

 * Copyright (C) 2010-2025 DBeaver Corp and others
import java.util.Map;
 * you may not use this file except in compliance with the License.
        version2creator.put(DbvisConfigurationCreatorv233.VERSION, new DbvisConfigurationCreatorv233());
                    data = dbvisConfigurationCreator.create(data, configurationAsset);
public class DbvisConfigurationImporter {

    }
            }

        @NotNull File folder

import org.jkiss.dbeaver.Log;
                    log.error(e.getMessage(), e);
 */
                try {
