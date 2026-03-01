import org.jkiss.dbeaver.utils.GeneralUtils;
    private final String nodeName;
    public DBSObject getDatabaseObject()
import org.eclipse.swt.graphics.RGB;
import org.jkiss.dbeaver.model.navigator.DBNModel;
        return activePageId;
            return project.getDataSourceRegistry().getDataSource(dataSourceId);
        String inputClass,
    public DBECommandContext getCommandContext()
                if (instance instanceof DBSInstanceLazy && !((DBSInstanceLazy) instance).isInstanceConnected()) {
            && Objects.equals(dataSourceId, that.dataSourceId);
    private final String inputClass;
import org.eclipse.jface.resource.StringConverter;
    }
            if (connectionTimeout > 0 && connectionStart + connectionTimeout <= System.currentTimeMillis()) {
    DatabaseLazyEditorInput(
import org.eclipse.osgi.util.NLS;
            final DBNNode[] editorNodeResult = new DBNNode[1];
    public String getNodePath() {
        }
    public IPersistableElement getPersistable() {
            activePageId,
        try {
    {
    @Override
        );
        return Objects.hash(nodePath, activePageId, activeFolderId, dataSourceId);
            log.error("Corrupted memento"); //$NON-NLS-2$

    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.struct.DBSInstanceLazy;
                // Connection error
package org.jkiss.dbeaver.ui.editors;

        String nodePath,
    }
        if (!CommonUtils.isEmpty(activePageId)) memento.putString(DatabaseEditorInputFactory.TAG_ACTIVE_PAGE, activePageId);
        if (dataSourceId == null) {
        return Collections.emptyList();
            return null;
                DatabaseNodeEditorInput realInput = new DatabaseNodeEditorInput((DBNDatabaseNode) node);
import org.jkiss.dbeaver.DBException;
    private final Color connectionColor;
    @Override
    @Override

 * Copyright (C) 2010-2026 DBeaver Corp and others
        if (!canLoadImmediately && DBWorkbench.getPlatform().getPreferenceStore().getBoolean(DatabaseEditorPreferences.PROP_SAVE_EDITORS_STATE)) {
import org.jkiss.dbeaver.model.edit.DBECommandContext;
        return dataSourceContainer;
            int divPos = nodePath.lastIndexOf('/');
    }
            return dataSourceContainer;
    @Override
            log.error("Can not find data source '" + dataSourceId + "'"); //$NON-NLS-2$
        return nodePath;
    {
        return new DatabaseLazyEditorInput(
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override
            dataSourceId,
    }
        this.nodePath = nodePath;
 *
import org.jkiss.dbeaver.model.app.DBPProject;
{
            dataSourceContainer,
        this.nodeName = nodeName;
    @Nullable
        String activeFolderId,
    public String getFactoryId() {
        if (o == null || getClass() != o.getClass()) return false;
    @Nullable
                }.execute();
    {


        if (!CommonUtils.isEmpty(inputClass)) memento.putString(DatabaseEditorInputFactory.TAG_CLASS, inputClass);
        if (connectionColorRgb != null) {
        if (!CommonUtils.isEmpty(nodePath)) memento.putString(DatabaseEditorInputFactory.TAG_NODE, nodePath);
    public ImageDescriptor getImageDescriptor()
 * DBeaver - Universal Database Manager
            memento.putString(DatabaseEditorInputFactory.TAG_CONNECTION_COLOR, StringConverter.asString(connectionColor.getRGB()));
        if (!CommonUtils.isEmpty(nodeName)) memento.putString(DatabaseEditorInputFactory.TAG_NODE_NAME, nodeName);
import org.eclipse.ui.IMemento;
            return new ErrorEditorInput(GeneralUtils.makeExceptionStatus(e), navigatorModel.getNodeByObject(dataSourceContainer));
                    return unloadInput();
    }
                throw new DBException("Database node has bad type: " + node.getClass().getName());
            }
            }
            dataSourceContainer = project.getDataSourceRegistry().getDataSource(dataSourceId);
            try {
 * Lazy input. Use by entity editors which are created during DBeaver startup (from memo by factory).
        this.activePageId = activePageId;
        if (!CommonUtils.isEmpty(dataSourceId)) memento.putString(DatabaseEditorInputFactory.TAG_DATA_SOURCE, dataSourceId);
        boolean canLoadImmediately
import org.jkiss.dbeaver.Log;

                }
        return nodeName;
                    }
                final Integer result = new UITask<Integer>() {
    public DBPDataSourceContainer getDataSourceContainer() {
 *
    public String getDefaultPageId()
        return DBeaverIcons.getImageDescriptor(DBIcon.TYPE_OBJECT);
    @Override
                DBSInstance instance = DBUtils.getObjectOwnerInstance(object);
 * limitations under the License.
                    continue;

    }
    public String getToolTipText()

            connectionColor = null;
                return realInput;
public class DatabaseLazyEditorInput implements IDatabaseEditorInput, ILazyEditorInput, IPersistableElement, DBPDataSourceContainerProvider
    }
import org.eclipse.jface.resource.ImageDescriptor;

    }
        return null;
            && Objects.equals(activeFolderId, that.activeFolderId)
    public Color getConnectionColor() {
    @Override
            connectionColor = new Color(connectionColorRgb);
        }
        return project;
 * distributed under the License is distributed on an "AS IS" BASIS,
            final DBPDataSource dataSource = dataSourceContainer.getDataSource();
        if (!CommonUtils.isEmpty(activeFolderId)) memento.putString(DatabaseEditorInputFactory.TAG_ACTIVE_FOLDER, activeFolderId);
    {
    public DBCExecutionContext getExecutionContext() {
            project = dataSourceContainer.getRegistry().getProject();

            } else {
    public String getName()

    }

            if (dataSource == null) {

    private final String activeFolderId;
import org.jkiss.dbeaver.model.navigator.DBNNode;
            });
    // Initialized on demand
        if (nodePath == null || inputClass == null || dataSourceId == null) {
                dsNode.initializeNode(monitor, null);
    @Nullable
    private DBPDataSourceContainer dataSourceContainer;
        final DBNModel navigatorModel = DBWorkbench.getPlatform().getNavigatorModel();
            }
    public DBPProject getProject() {
    @NotNull
        if (this == o) return true;

/*
import org.eclipse.ui.IPersistableElement;

 */
        if (project != null) memento.putString(DatabaseEditorInputFactory.TAG_PROJECT, project.getName());

    @Nullable

        activePageId = memento.getString(DatabaseEditorInputFactory.TAG_ACTIVE_PAGE);
                            UIUtils.getActiveWorkbenchShell(),
    }
    {
            project,
        this.canLoadImmediately = canLoadImmediately;
/**
    @Override
        return Objects.equals(nodePath, that.nodePath)
        String nodeName = memento.getString(DatabaseEditorInputFactory.TAG_NODE_NAME);
        }
            }
        activeFolderId = memento.getString(DatabaseEditorInputFactory.TAG_ACTIVE_FOLDER);
                break;
    }
        if (nodeName == null && nodePath != null) {
    }
        return null;
                        return clDialog.open();
 *
        while (!dataSourceContainer.isConnected()) {
        String nodeName,
    private static final Log log = Log.getLog(DatabaseLazyEditorInput.class);

import org.jkiss.dbeaver.model.struct.DBSInstance;
                throw new DBException(NLS.bind(EditorsMessages.lazy_editor_input_cant_find_node, nodePath));
        return new PropertySourceCustom();
    public boolean exists()
        }
        @Nullable Color connectionColor,
    @Override
    @Override

import org.eclipse.swt.graphics.Color;
import org.jkiss.utils.CommonUtils;
    {
 */

        DatabaseLazyEditorInput that = (DatabaseLazyEditorInput) o;
    @Override
    private final boolean canLoadImmediately;
 * you may not use this file except in compliance with the License.
    ) {
    }
import org.jkiss.dbeaver.ui.dialogs.ConnectionLostDialog;
import org.jkiss.dbeaver.runtime.properties.PropertySourceCustom;
    @Override
    }
        this.canLoadImmediately = true;
    @Override
        if (connectionColor != null) {
import java.util.Collection;
    {
                }
            DBExecUtils.tryExecuteRecover(monitor, dataSource, param -> {

            && Objects.equals(activePageId, that.activePageId)
        String activePageId,
    }
            // Wait a few seconds to let in-progress connection initialize
        return nodeName;
                    throw new DBException("Datasource '" + this.dataSourceContainer.getName() + "' navigator node not found");

        }
    @Override
            } catch (final DBException e) {
        this.dataSourceContainer = dataSourceContainer;
                            IDialogConstants.ABORT_LABEL
        if (project == null) {
    @Override
import org.jkiss.code.Nullable;

    @Override
        }
import org.jkiss.dbeaver.model.preferences.DBPPropertySource;
    @Override
    @Override
    public DatabaseLazyEditorInput(IMemento memento) {
    }
        nodePath = memento.getString(DatabaseEditorInputFactory.TAG_NODE);

    @Nullable

import java.util.Objects;
        if (dataSourceContainer != null) {
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
            return null;
        this.inputClass = inputClass;
    @Override
        return connectionColor;
            false
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;

            return;
    @Override
        String dataSourceId,

                    connectionStart = System.currentTimeMillis();
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    private final String activePageId;
    public void saveState(IMemento memento) {
import org.jkiss.dbeaver.model.exec.DBExecUtils;
    }


        this.connectionColor = connectionColor;
    public Collection<String> getAttributeNames() {

import org.jkiss.dbeaver.model.navigator.DBNDataSource;
    @Nullable

                    monitor, project, nodePath);
                        );
        this.dataSourceId = dataSourceId;
        }
import org.jkiss.dbeaver.ModelPreferences;
                            e,
                        ConnectionLostDialog clDialog = new ConnectionLostDialog(
import org.jkiss.dbeaver.ui.DBeaverIcons;
    public <T> T getAdapter(Class<T> adapter)
                    protected Integer runTask() {
        this.project = project;
                DBNDataSource dsNode = (DBNDataSource) navigatorModel.getNodeByObject(monitor, this.dataSourceContainer, true);

            activeFolderId,
import org.jkiss.dbeaver.utils.RuntimeUtils;
    public boolean equals(Object o) {
        }
    }
                            dataSourceContainer,
import org.jkiss.dbeaver.model.*;
                    ((DBSInstanceLazy) instance).checkInstanceConnection(monitor);
    }
                if (dsNode == null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
                throw new DBException("Connection to '" + dataSourceContainer.getName() + "' canceled");
        @Nullable DBPProject project,
                editorNodeResult[0] = navigatorModel.getNodeByPath(
    public String getDefaultFolderId()
        return null;
        return null;
import org.jkiss.dbeaver.ui.UIUtils;
    }
        @Nullable DBPDataSourceContainer dataSourceContainer,

        RGB connectionColorRgb = StringConverter.asRGB(memento.getString(DatabaseEditorInputFactory.TAG_CONNECTION_COLOR), null);
    public DBNDatabaseNode getNavigatorNode() {
        project = CommonUtils.isEmpty(projectName) ? null : DBWorkbench.getPlatform().getWorkspace().getProject(projectName);

    {
    private DBPProject project;
        return false;
    }
            connectionColor,
        long connectionTimeout = dataSourceContainer.getPreferenceStore().getInt(ModelPreferences.CONNECTION_VALIDATION_TIMEOUT);
    }
        }
    }
            return this;
        }
    public DatabaseLazyEditorInput unloadInput() {
    public IDatabaseEditorInput initializeRealInput(@NotNull DBRProgressMonitor monitor) throws DBException
        return null;
                } else {
        inputClass = memento.getString(DatabaseEditorInputFactory.TAG_CLASS);
import org.eclipse.jface.dialogs.IDialogConstants;
        } else {
    @Override
    {
    {
    @Override
    public DBPPropertySource getPropertySource()
    }
    }
                realInput.setDefaultPageId(activePageId);
            if (node instanceof DBNDatabaseNode) {
    @Nullable
import java.util.Collections;
        return activeFolderId;
            if (node == null) {
import org.jkiss.code.NotNull;
    {

                realInput.setDefaultFolderId(activeFolderId);

        return null;
        } catch (DBException e) {
        this.nodeName = nodeName;
                dataSourceContainer.connect(monitor, true, true);
    }
                }
    @Override
            inputClass,
            nodeName = divPos == -1 ? nodePath : nodePath.substring(divPos + 1);
        // Get the node path.
                if (result == IDialogConstants.RETRY_ID) {
            nodeName,
                    // Unload editor
        dataSourceId = memento.getString(DatabaseEditorInputFactory.TAG_DATA_SOURCE);
        }
        if (dataSourceContainer == null) {
 * Unless required by applicable law or agreed to in writing, software
    public Object getAttribute(String name) {


 * See the License for the specific language governing permissions and
    private final String nodePath;
        }
        return canLoadImmediately;

                DBSObject object = ((DBNDatabaseNode) node).getObject();
    public Object setAttribute(String name, Object value) {
        return null;
    @Override
    public int hashCode() {
        if (project != null) {
    @Override
                // FIXME: DBNModel#getNodeByObject should ensure that the project is loaded, not the caller
            DBNNode node = editorNodeResult[0];
        if (!DBWorkbench.getPlatform().getPreferenceStore().getBoolean(DatabaseEditorPreferences.PROP_SAVE_EDITORS_STATE)) {
        if (project != null && project.isRegistryLoaded()) {
        }

                    @Override
import org.jkiss.dbeaver.ui.UITask;
            RuntimeUtils.pause(1000);
    @Override
        } else {
    }
                navigatorModel.ensureProjectLoaded(project);
 * You may obtain a copy of the License at
    }
            nodePath,
    public boolean canLoadImmediately() {
import org.jkiss.dbeaver.runtime.DBWorkbench;

        return DatabaseEditorInputFactory.ID_FACTORY;
    private final String dataSourceId;
}
        }
        String projectName = memento.getString(DatabaseEditorInputFactory.TAG_PROJECT);
import org.jkiss.dbeaver.ui.editors.internal.EditorsMessages;

    @Nullable
import org.jkiss.dbeaver.model.struct.DBSObject;
        long connectionStart = System.currentTimeMillis();
            return null;
        this.activeFolderId = activeFolderId;
