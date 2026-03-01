public abstract class AbstractFileDatabaseHandler extends AbstractFileHandler {
        }
                    throw new DBException("Cannot determine target node for " + dsContainer.getName());
            return;
import java.nio.file.Path;
            }
/**
                    openNode = DBNUtils.getDefaultDatabaseNodeToOpen(monitor, dataSource);
 * limitations under the License.
import org.jkiss.api.CompositeObjectId;
    @Override
 * See the License for the specific language governing permissions and
    }
 *

        if (isSingleDatabaseConnection()) {
                    // Ensure the node is created
    protected abstract String createConnectionName(@NotNull List<Path> fileList);
    @Override

 * Unless required by applicable law or agreed to in writing, software
        }
    public Set<FileTypeAction> supportedActions() {

import org.jkiss.dbeaver.model.app.DBPProject;
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
            throw new DBException("No active project - cannot open file");
                    RuntimeUtils.pause(100);
        DBPProject project = DBWorkbench.getPlatform().getWorkspace().getActiveProject();
                for (int i = 0; i < 10 && openNode == null; i++) {
    private void createDatabaseConnection(
            }

import java.util.List;


import java.util.Collections;
            String connectionName = createConnectionName(fileList);
        DBPDriver driver = DBWorkbench.getPlatform().getDataSourceProviderRegistry().findDriver(getDriverReference());
                    UIUtils.syncExec(() -> NavigatorHandlerObjectOpen.openEntityEditor(
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
            return null;
            createDatabaseConnection(connectionName, databaseName, project, driver);
            if (dsContainer.isConnected() || dsContainer.connect(monitor, true, true)) {
import org.jkiss.dbeaver.model.connection.DBPDriver;

 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.file.FileTypeAction;
                // Try multiple times with a small delay in case the node is still not available
    ) throws DBException {
    protected abstract String getDatabaseTerm();
                }


import org.jkiss.code.Nullable;

import org.jkiss.dbeaver.utils.RuntimeUtils;
import org.jkiss.code.NotNull;
 * Database file handler
                        false));
            for (Path dbFile : fileList) {
            super.openFiles(fileList, dataSource, action);
                    registry.flushDataSourceEvents();
import java.util.Set;
        if (project == null) {
 */
                DBPDataSource dataSource = dsContainer.getDataSource();

                        null,
                DBNDatabaseNode openNode = DBNUtils.getDefaultDatabaseNodeToOpen(monitor, dataSource);
        configuration.setDatabaseName(databaseName);
 * distributed under the License is distributed on an "AS IS" BASIS,
                    DBNDatabaseNode openNode1 = openNode;
    protected abstract String createDatabaseName(@NotNull List<Path> fileList);
        @NotNull FileTypeAction action
import org.jkiss.dbeaver.DBException;
                if (dsContainer.getRegistry() instanceof DataSourceRegistry<?> registry) {
import org.jkiss.dbeaver.model.DBPDataSource;
 *
            String databaseName = createDatabaseName(fileList);
    public void openFiles(
        }
/*
import org.jkiss.dbeaver.ui.UIUtils;

    }
 * Copyright (C) 2010-2026 DBeaver Corp and others
                        null,
                        UIUtils.getActiveWorkbenchWindow(),
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        if (driver == null) {
        return true;

    @NotNull
import org.jkiss.dbeaver.registry.DataSourceRegistry;
        }
        } else {

                String connectionName = createConnectionName(Collections.singletonList(dbFile));
import org.jkiss.dbeaver.ui.editors.file.AbstractFileHandler;
 * Licensed under the Apache License, Version 2.0 (the "License");
        UIUtils.runWithMonitor(monitor -> {
                } else {
 */
 *
        @NotNull DBPDriver driver
                createDatabaseConnection(connectionName, databaseName, project, driver);
        if (dsContainer == null) {


import org.jkiss.dbeaver.model.navigator.DBNUtils;
        @NotNull String connectionName,
 * you may not use this file except in compliance with the License.
                String databaseName = createDatabaseName(Collections.singletonList(dbFile));
import org.jkiss.dbeaver.ui.navigator.actions.NavigatorHandlerObjectOpen;
                }
package org.jkiss.dbeaver.ui.actions;
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
        });
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.runtime.DBWorkbench;
                if (openNode == null) {
        DBPDataSourceContainer dsContainer = DBFUtils.createTemporaryDataSourceContainer(connectionName, project, driver, configuration);
        return Set.of(FileTypeAction.DATABASE, FileTypeAction.INTERNAL_EDITOR, FileTypeAction.EXTERNAL_EDITOR);
    ) throws DBException {
            return;
        DBPConnectionConfiguration configuration = new DBPConnectionConfiguration();
    protected abstract CompositeObjectId getDriverReference();
import org.jkiss.dbeaver.model.fs.DBFUtils;
        if (action != FileTypeAction.DATABASE) {

                        null,
        @NotNull DBPProject project,
        @Nullable DBPDataSourceContainer dataSource,
}
                        openNode1,
 * You may obtain a copy of the License at
                }
        }
            throw new DBException("Driver '" + getDriverReference() + "' not found");
        @NotNull List<Path> fileList,
        @NotNull String databaseName,
    protected boolean isSingleDatabaseConnection() {
                        true,
