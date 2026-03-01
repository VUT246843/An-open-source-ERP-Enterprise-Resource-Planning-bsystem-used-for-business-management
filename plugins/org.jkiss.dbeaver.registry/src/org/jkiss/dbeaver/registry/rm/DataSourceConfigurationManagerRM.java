
    public DataSourceConfigurationManagerRM(@NotNull DBPProject project, @NotNull RMController client) {
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
        throw new DBException("This method should not be called");
    }
    @NotNull
    private final DBPProject project;
                projectId,
    @Override
    @Override
        } catch (DBException e) {

        }
/**

import org.jkiss.code.Nullable;
            return new ByteArrayInputStream(dsContent.getBytes(StandardCharsets.UTF_8));
package org.jkiss.dbeaver.registry.rm;
        }
    public boolean isSecure() {
    public InputStream readConfiguration(@NotNull String name, @Nullable Collection<String> dataSourceIds) throws DBException, IOException {
            }
}
        }
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
import java.util.List;
        return true;
        return false;
import org.jkiss.dbeaver.DBException;
 * Configuration files manager on FS
public class DataSourceConfigurationManagerRM implements DataSourceConfigurationManager {

    public boolean isReadOnly() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (!name.equals(project.getName())) {
import org.jkiss.dbeaver.model.DBPDataSourceConfigurationStorage;
import java.util.Collection;

    public List<DBPDataSourceConfigurationStorage> getConfigurationStorages() {
/*
            throw new DBException("Wrong storage name: " + name);
import java.io.ByteArrayInputStream;
                return null;

    }
            String dsContent = rmController.getProjectsDataSources(
        this.project = project;
    @Override

import org.jkiss.dbeaver.model.app.DBPProject;
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.io.InputStream;
 * DBeaver - Universal Database Manager
import org.jkiss.code.NotNull;
 *

 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
        if (name.startsWith(DataSourceRegistry.CREDENTIALS_CONFIG_FILE_PREFIX)) {
import java.nio.charset.StandardCharsets;
    public void writeConfiguration(@NotNull String name, @Nullable byte[] data) throws DBException {
 *
import org.jkiss.dbeaver.registry.DataSourceRegistry;
        try {
import org.jkiss.dbeaver.registry.DataSourceConfigurationManager;

            throw new DBException("Could not load project datasources:\n" + e.getMessage(), e);
 * Licensed under the Apache License, Version 2.0 (the "License");

    @Override
import org.jkiss.dbeaver.model.rm.RMController;
    private final RMController rmController;
    private static final Log log = Log.getLog(DataSourceConfigurationManagerRM.class);
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    }
import java.io.IOException;
        String projectId = project.getId();
    @Override

import org.jkiss.dbeaver.Log;
        this.rmController = client;
import java.util.Collections;
            if (dsContent == null) {
                dataSourceIds == null ? null : dataSourceIds.toArray(new String[0]));
    }
            // Credentials storage is not supported
 * You may obtain a copy of the License at
    }
            return null;
 */
        return Collections.singletonList(new DataSourceRMStorage(project));
