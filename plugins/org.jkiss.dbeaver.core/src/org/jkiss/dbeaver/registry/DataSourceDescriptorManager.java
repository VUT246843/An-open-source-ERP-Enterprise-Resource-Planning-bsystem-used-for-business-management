                registry = ((DBPProject) container).getDataSourceRegistry();
 */
            registry.addDataSource(dataSource);
            } else {
            if (container instanceof DataSourceRegistry) {
/**
    public DBSObjectCache<? extends DBSObject, DataSourceDescriptor> getObjectsCache(DataSourceDescriptor object) {
    public boolean canCreateObject(@NotNull Object container) {
    }
        return true;
import org.jkiss.dbeaver.ui.actions.datasource.DataSourceHandler;
    public void deleteObject(@NotNull DBECommandContext commandContext, @NotNull final DataSourceDescriptor object, @NotNull Map<String, Object> options) {
            DataSourceDescriptor dataSource = registry.createDataSource(
 *
import java.util.Map;
import org.jkiss.dbeaver.ui.ConnectionFeatures;
 * You may obtain a copy of the License at
                folder = (DBPDataSourceFolder) container;
            } else if (dsTpl.getRegistry() == registry) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                dataSource.setFolder(folder);
        }

    @Override
    @Nullable
            DataSourceHandler.disconnectDataSource(object, remover);
            } else if (container instanceof DBPDataSourceFolder) {
    @Override
            DBPDataSourceFolder folder = null;
        }
                    break;
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    }
import org.jkiss.dbeaver.model.struct.DBSObject;
        Runnable remover = () -> object.getRegistry().removeDataSource(object);
import org.jkiss.dbeaver.model.edit.DBECommandContext;
            }
 * limitations under the License.
                new DBPConnectionConfiguration(dsTpl.getConnectionConfiguration())
import org.jkiss.dbeaver.model.edit.DBEObjectMaker;
import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;
    @Override
}public class DataSourceDescriptorManager extends AbstractObjectManager<DataSourceDescriptor> implements DBEObjectMaker<DataSourceDescriptor, DBPObject> {

        if (object.isConnected()) {
            return ((DBPProject) container).hasRealmPermission(RMConstants.PERMISSION_PROJECT_DATASOURCES_EDIT);
            if (folder != null) {
        } else {
            } else if (container instanceof DBPProject) {


    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
import org.jkiss.dbeaver.ui.dialogs.connection.NewConnectionDialog;
        return null;
 * distributed under the License is distributed on an "AS IS" BASIS,
                // Copy folder only if we copy in the same project
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
        if (container instanceof DBPProject) {
                DataSourceDescriptor.generateNewId(dsTpl.getDriver()),
 */
            }
    public boolean canDeleteObject(@NotNull DataSourceDescriptor object) {

import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
            dataSource.setName(newName);
 *
    @Override


            remover.run();
import org.jkiss.dbeaver.model.DBPDataSourceFolder;
import org.jkiss.code.Nullable;
    }
import org.jkiss.dbeaver.ui.UIUtils;
            DataSourceDescriptor dsTpl = (DataSourceDescriptor) copyFrom;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.DBPDataSource;
            // Generate new name
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
                registry = folder.getDataSourceRegistry();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        if (copyFrom != null) {
package org.jkiss.dbeaver.registry;
                newName = origName + " " + (i + 1);
            );
                dataSource.setFolder(dsTpl.getFolder());
            }
                dsTpl.getDriver(),
 * you may not use this file except in compliance with the License.
import org.jkiss.code.NotNull;
    }
            for (int i = 0; ; i++) {
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
 * DataSourceDescriptorManager
        } else {
        return 0;
import org.jkiss.dbeaver.model.app.DBPProject;
 * See the License for the specific language governing permissions and
        }
import org.jkiss.dbeaver.model.rm.RMConstants;
import org.jkiss.dbeaver.model.impl.edit.AbstractObjectManager;
import org.jkiss.dbeaver.model.DBPObject;
            UIUtils.asyncExec(() -> NewConnectionDialog.openNewConnectionDialog(UIUtils.getActiveWorkbenchWindow()));
        return null;
 *
            String origName = dsTpl.getName();
        ConnectionFeatures.CONNECTION_DELETE.use(Map.of("driver", object.getDriver().getPreconfiguredId()));

    public DataSourceDescriptor createNewObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext commandContext, @NotNull Object container, Object copyFrom, @NotNull Map<String, Object> options) throws DBException {
                }
                if (registry.findDataSourceByName(newName) == null) {

            String newName = origName;

    }
                registry = dsTpl.getRegistry();
import org.jkiss.dbeaver.DBException;
            dataSource.copyFrom(dsTpl);

            DBPDataSourceRegistry registry;
/*
                registry = (DBPDataSourceRegistry) container;
        return object.getProject().hasRealmPermission(RMConstants.PERMISSION_PROJECT_DATASOURCES_EDIT);
