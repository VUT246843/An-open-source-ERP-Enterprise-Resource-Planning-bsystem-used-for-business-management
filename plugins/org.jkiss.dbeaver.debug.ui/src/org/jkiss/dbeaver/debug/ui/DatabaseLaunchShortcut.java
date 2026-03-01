        ILaunchManager launchManager = DebugPlugin.getDefault().getLaunchManager();

    }
        }
        String message = DebugUIMessages.DatabaseLaunchShortcut_e_selection_empty;

                launch(launchable, mode);
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
            }

    }
    }
                candidateConfigs.add(config);

        ISelection selection = editorSite.getSelectionProvider().getSelection();
    public void launch(IEditorPart editor, String mode) {
}
        }
        List<ILaunchConfiguration> configs = getCandidates(launchable, getConfigurationType(), databaseContext);
        IEditorSite editorSite = editor.getEditorSite();
        }
        String message = DebugUIMessages.DatabaseLaunchShortcut_select_title;
    }
 */
        }
        return NLS.bind(message, launchObjectName);
 *
        return workbenchPartSite;
 *
    public ILaunchConfiguration[] getLaunchConfigurations(IEditorPart editorpart) {

    @Override
            int count = configs.size();
        if (window != null) {
public abstract class DatabaseLaunchShortcut implements ILaunchShortcut2 {
                }
 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)
        if (result == Window.OK) {
                Object[] array = new Object[] { databaseObject };
        return GeneralUtils.adapt(adaptable, IResource.class);
            IStructuredSelection ss = (IStructuredSelection) selection;
    protected abstract ILaunchConfiguration createConfiguration(DBSObject launchable, Map<String, Object> databaseContext) throws CoreException;
    protected String getEditorEmptyMessage() {
                    IWorkbenchPart activePart = activePage.getActivePart();
import org.jkiss.dbeaver.model.struct.DBSObject;
            launchable = extracted.get(0);
    }

            launchable = selectLaunchable(getShell(), extracted, mode);
        ILabelProvider renderer = getLaunchableSelectionRenderer();
                if (activePage != null) {
    public IResource getLaunchableResource(IEditorPart editorpart) {
                        workbenchPartSite = activePart.getSite();
                DebugUITools.launch(config, mode);
            } else if (count > 1) {
            searchAndLaunch(array, mode, getEditorEmptyMessage());
        String message = DebugUIMessages.DatabaseLaunchShortcut_e_editor_empty;
            searchAndLaunch(array, mode, getSelectionEmptyMessage());

        IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
        }
        ElementListSelectionDialog dialog = new ElementListSelectionDialog(shell, renderer);
 * you may not use this file except in compliance with the License.
        return null;
            MessageDialog.openError(getShell(), DebugUIMessages.DatabaseLaunchShortcut_e_launch, emptyMessage);
/*
        dialog.setMessage(message);
import org.eclipse.jface.dialogs.IDialogConstants;
        DBSObject launchable = null;
import org.eclipse.debug.ui.IDebugModelPresentation;
 *     http://www.apache.org/licenses/LICENSE-2.0
        for (Map.Entry<String, Object> entry : databaseContext.entrySet()) {
    }
 * You may obtain a copy of the License at
        workbenchPartSite = editorSite;
        }
    @Override
                config = configs.get(0);
import org.eclipse.debug.core.*;


    }
        List<ILaunchConfiguration> candidateConfigs = new ArrayList<>();
                    return;
    
import org.jkiss.dbeaver.utils.GeneralUtils;
 * DBeaver - Universal Database Manager
        ElementListSelectionDialog dialog = new ElementListSelectionDialog(getShell(), labelProvider);
    }
        String message = getLaunchableSelectionMessage(mode);
import org.jkiss.dbeaver.debug.ui.internal.DebugUIMessages;
        dialog.setMultipleSelection(false);


        return NLS.bind(message, launchObjectName);
        this.configurationTypeId = typeId;
            return null;

                config = createConfiguration(launchable, databaseContext);
    protected ILaunchConfigurationType getConfigurationType() {
        return null;
        if (!config.exists()) {
    protected IWorkbenchPartSite getWorkbenchPartSite() {
    protected ILabelProvider getLaunchableSelectionRenderer() {
        } else {
import org.jkiss.dbeaver.Log;

        if (selection instanceof IStructuredSelection) {
        String title = getLaunchableSelectionTitle(mode);
 * See the License for the specific language governing permissions and
    }
                config = chooseConfiguration(configs, mode);
import org.jkiss.dbeaver.runtime.DBWorkbench;

        String configurationTypeId = getConfigurationTypeId();
    protected Shell getShell() {
            if (count == 1) {

        dialog.setMultipleSelection(false);
                }
import org.eclipse.core.resources.IResource;
        return NLS.bind(message, launchObjectName);
    @Override

    }
    public IResource getLaunchableResource(ISelection selection) {
            Object[] array = ((IStructuredSelection) selection).toArray();
        for (ILaunchConfiguration config : configs) {
            return window.getShell();
    }

import org.jkiss.dbeaver.debug.core.DebugUtils;
                    return getLaunchableResource((IAdaptable) element);
    private static final Log log = Log.getLog(DatabaseLaunchShortcut.class);
        return null;
                }
            return false;
    }
        ILaunchManager lm = DebugPlugin.getDefault().getLaunchManager();
                if (config instanceof ILaunchConfigurationWorkingCopy) {
                }
        Map<String, Object> databaseContext = DebugUtils.resolveDatabaseContext(launchable);
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    }
                }
        if (extracted.size() == 0) {

 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.debug.ui.DebugUITools;
    protected String getLaunchObjectName() {

            if (databaseObject != null) {
    protected String getConfigurationTypeId() {
        if (selection instanceof IStructuredSelection && !selection.isEmpty()) {
        IDebugModelPresentation labelProvider = DebugUITools.newDebugModelPresentation();
        String message = DebugUIMessages.DatabaseLaunchShortcut_select_message;

    protected String getSelectionEmptyMessage() {
                if (config == null) {

import org.eclipse.jface.viewers.IStructuredSelection;
            if (!CommonUtils.equalObjects(config.getAttribute(entry.getKey(), (String) null), entry.getValue())) {
        }

        ILaunchConfiguration[] configs = launchManager.getLaunchConfigurations(configType);
    @Override
        return getLaunchableResource(editorpart.getEditorInput());

    protected boolean isCandidate(ILaunchConfiguration config, DBSObject launchable, Map<String, Object> databaseContext) throws CoreException {
        return WorkbenchLabelProvider.getDecoratingWorkbenchLabelProvider();
        }
    protected void searchAndLaunch(Object[] scope, String mode, String emptyMessage) {
            }
                    }
import org.eclipse.jface.viewers.ILabelProvider;
 * Unless required by applicable law or agreed to in writing, software
import java.util.ArrayList;
            Object[] array = ((IStructuredSelection) selection).toArray();
            if (isCandidate(config, launchable, databaseContext)) {
        return true;
        return configurationTypeId;
        }
        dialog.setTitle(DebugUIMessages.DatabaseLaunchShortcut_select_configuration_title);
        dialog.setMessage(DebugUIMessages.DatabaseLaunchShortcut_select_configuration_message);
    private IWorkbenchPartSite workbenchPartSite;
    private final String configurationTypeId;
 * limitations under the License.
            return (ILaunchConfiguration) dialog.getFirstResult();
import org.eclipse.jface.dialogs.MessageDialog;
                    if (activePart != null) {
    protected String getLaunchableSelectionTitle(String mode) {
        List<DBSObject> extracted = DebugUtils.extractLaunchable(scope);
        dialog.setElements(configList.toArray());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    protected void launch(DBSObject launchable, String mode) throws CoreException {
    }
    protected ILaunchConfiguration chooseConfiguration(List<ILaunchConfiguration> configList, String mode) {
        if (configs != null) {

        if (dialog.open() != Window.OK) {
                    ((ILaunchConfigurationWorkingCopy) config).doSave();
            if (config != null) {

    protected IResource getLaunchableResource(IAdaptable adaptable) {
        return null;
        } else {
        int result = dialog.open();
        return launchObjectName;
import org.eclipse.core.runtime.IAdaptable;
    }

        this.launchObjectName = objectName;
    }
            }
        return lm.getLaunchConfigurationType(configurationTypeId);

    }
    protected List<ILaunchConfiguration> getCandidates(DBSObject launchable, ILaunchConfigurationType configType, Map<String, Object> databaseContext) throws CoreException {
        }
        }

            }
    }
        return (DBSObject) dialog.getFirstResult();
    }
    private final String launchObjectName;
    
        if (launchable != null) {
            try {
            }
import org.jkiss.dbeaver.ui.UIUtils;

                DBWorkbench.getPlatformUI().showError(DebugUIMessages.DatabaseLaunchShortcut_e_launch, "Cannot launch debug", e.getStatus());
import org.eclipse.osgi.util.NLS;
        } else if (extracted.size() > 1) {
    @Override
            }
            DBSObject databaseObject = DebugUI.extractDatabaseObject(editor);

import org.jkiss.utils.CommonUtils;
            }
import java.util.Map;
            }
                if (DebugUITools.openLaunchConfigurationPropertiesDialog(UIUtils.getActiveWorkbenchShell(), config, DebugUI.DEBUG_LAUNCH_GROUP_ID) != IDialogConstants.OK_ID) {
import org.eclipse.jface.window.Window;
import org.eclipse.ui.*;
package org.jkiss.dbeaver.debug.ui;

import org.eclipse.ui.model.WorkbenchLabelProvider;
        dialog.setElements(launchables.toArray());
        labelProvider.dispose();
                searchAndLaunch(array, mode, getEditorEmptyMessage());
            } catch (CoreException e) {
            }
                if (element instanceof IAdaptable) {
            ILaunchConfiguration config = null;
                return false;
        return candidateConfigs;
 *
        if (selection instanceof IStructuredSelection) {
import java.util.List;
    protected String getLaunchableSelectionMessage(String mode) {

        // let the framework resolve configurations based on resource mapping

    public DatabaseLaunchShortcut(String typeId, String objectName) {
            if (config == null) {
        }
    public void launch(ISelection selection, String mode) {
                Object element = ss.getFirstElement();
                    return;
        // let the framework resolve configurations based on resource mapping
    }

                IWorkbenchPage activePage = activeWindow.getActivePage();
            if (ss.size() == 1) {
        dialog.setTitle(title);
        return null;
import org.eclipse.core.runtime.CoreException;
    
    public ILaunchConfiguration[] getLaunchConfigurations(ISelection selection) {

import org.eclipse.swt.widgets.Shell;
            IWorkbenchWindow activeWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
    }
    protected DBSObject selectLaunchable(Shell shell, List<DBSObject> launchables, String mode) {
import org.eclipse.debug.ui.ILaunchShortcut2;
    @Override
    }
            if (activeWindow != null) {
        return NLS.bind(message, launchObjectName);
 * distributed under the License is distributed on an "AS IS" BASIS,
