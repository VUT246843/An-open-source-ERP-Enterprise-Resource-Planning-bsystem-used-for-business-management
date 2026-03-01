            log.error("Error persisting rm data folder move", e);
            lastError = e;
        }

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        try {

import org.jkiss.dbeaver.registry.DataSourceDescriptor;
            rmController.moveProjectDataSourceFolder(getRemoteProjectId(), oldPath, newPath);
            lastError = e;
    }
            lastError = null;
        DataSourceConfigurationManagerBuffer buffer = new DataSourceConfigurationManagerBuffer();
            rmController.updateProjectDataSources(
            lastError = e;
            lastError = e;
import org.jkiss.dbeaver.registry.DataSourceConfigurationManagerBuffer;
        saveConfigurationToManager(monitor, buffer, null);
    @NotNull

        try {

                getRemoteProjectId(), new String(buffer.getData(), StandardCharsets.UTF_8), List.of(container.getId()));
 * Copyright (C) 2010-2025 DBeaver Corp and others
        if (getProject().isInMemory()) {
import org.jkiss.dbeaver.registry.DataSourceRegistry;
    @NotNull
            log.error("Error persisting rm data folder delete", e);
        try {
}
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
        if (getProject().isInMemory()) {
        saveConfigurationToManager(new VoidProgressMonitor(), buffer, dsc -> dsc.equals(container));
            log.error("Error persisting rm data source update", e);
            return;

import org.jkiss.dbeaver.registry.DataSourceFolder;

    }
    }
            lastError = null;

            return createFolder(parent, name);
import org.jkiss.dbeaver.model.DBPDataSourceFolder;
        if (getProject().isInMemory()) {
        } catch (DBException e) {
    @Override
 * See the License for the specific language governing permissions and
    }
    @Override
            lastError = e;
        }
        if (getProject().isInMemory()) {
    @NotNull
    public DataSourceFolder addFolder(@Nullable DBPDataSourceFolder parent, @NotNull String name) {
public class DataSourceRegistryRM<T extends DataSourceDescriptor> extends DataSourceRegistry<T> {
    }

            lastError = e;

        }
            return;
import org.jkiss.code.Nullable;

            rmController.createProjectDataSourceFolder(getRemoteProjectId(), parent == null ? name : parent.getFolderPath() + "/" + name);
import org.jkiss.code.NotNull;
            log.error("Error saving data source configuration", e);
        try {
        @NotNull DBPProject project,
 *     http://www.apache.org/licenses/LICENSE-2.0
            log.error("Error persisting rm data source update", e);
            return;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    @Override

        }


        }
    protected void persistDataSourceDelete(@NotNull DBPDataSourceContainer container) {
        if (getProject().isInMemory()) {
    public DataSourceRegistryRM(
        @NotNull DBPPreferenceStore preferenceStore
        }
 * DBeaver - Universal Database Manager
        saveConfigurationToManager(new VoidProgressMonitor(), buffer, dsc -> dsc.equals(container));
        } catch (DBException e) {
        return createFolder(parent, name);
    @Override
            lastError = e;
 * distributed under the License is distributed on an "AS IS" BASIS,
            return;
        try {
import org.jkiss.dbeaver.model.rm.RMController;
            lastError = null;
            rmController.createProjectDataSources(
            rmController.deleteProjectDataSources(getRemoteProjectId(), new String[]{container.getId()});
import java.nio.charset.StandardCharsets;
        }
        try {

 * You may obtain a copy of the License at
        DataSourceConfigurationManagerBuffer buffer = new DataSourceConfigurationManagerBuffer();
            return;
    @Override
            log.error("Error persisting rm data source update", e);
        } catch (DBException e) {
 * Unless required by applicable law or agreed to in writing, software
            lastError = null;

        } catch (DBException e) {
        }
 *
                getRemoteProjectId(), new String(buffer.getData(), StandardCharsets.UTF_8), List.of(container.getId()));
        }
import org.jkiss.dbeaver.DBException;

        } catch (DBException e) {
/*
            lastError = null;
        try {
            return;
import org.jkiss.dbeaver.Log;
        return getProject().getId();
    protected void persistDataFolderDelete(@NotNull String folderPath, boolean dropContents) {
        DataSourceConfigurationManagerBuffer buffer = new DataSourceConfigurationManagerBuffer();
 */
    private static final Log log = Log.getLog(DataSourceRegistryRM.class);
    protected void saveDataSources(DBRProgressMonitor monitor) {
        } catch (DBException e) {
        } catch (DBException e) {
        }
    }
 * limitations under the License.
    public void moveFolder(@NotNull String oldPath, @NotNull String newPath) throws DBException {
        super.moveFolder(oldPath, newPath);
    }
        }
    private String getRemoteProjectId() {
            rmController.updateProjectDataSources(
    }
 *
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.List;
            lastError = null;
        if (getProject().isInMemory()) {
        super(project, new DataSourceConfigurationManagerRM(project, rmController), preferenceStore);
package org.jkiss.dbeaver.registry.rm;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    @Override
 * you may not use this file except in compliance with the License.
                getRemoteProjectId(), new String(buffer.getData(), StandardCharsets.UTF_8), List.of());
import org.jkiss.dbeaver.model.app.DBPProject;
    }
    ) {

    protected void persistDataSourceCreate(@NotNull DBPDataSourceContainer container) {
        @NotNull RMController rmController,
    @Override
        if (getProject().isInMemory()) {
            super.moveFolder(oldPath, newPath);
            rmController.deleteProjectDataSourceFolders(getRemoteProjectId(), new String[]{folderPath}, dropContents);
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            lastError = null;
            throw new DBRuntimeException("Error persisting rm data folder create", e);
 *
        }
            return;
        }
    private final RMController rmController;
        this.rmController = rmController;
    protected void persistDataSourceUpdate(@NotNull DBPDataSourceContainer container) {
import org.jkiss.dbeaver.DBRuntimeException;
