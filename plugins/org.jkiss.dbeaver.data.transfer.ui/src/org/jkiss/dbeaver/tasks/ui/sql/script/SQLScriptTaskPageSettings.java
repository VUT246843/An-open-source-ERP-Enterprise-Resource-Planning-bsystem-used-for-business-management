import org.jkiss.dbeaver.ui.dialogs.ActiveWizardPage;

                        int selectionIndex = dsTable.getSelectionIndex();
        dataSourceViewer.refresh(true, true);
    public void saveSettings() {
            return false;
            } catch (InvocationTargetException e) {
                            }
                                if (!selectedDataSources.contains(ds)) {
            Composite settingsGroup = UIUtils.createTitledComposite(
    }
                UIIcon.ROW_DELETE,

                GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_BEGINNING
                            if (selected != null) {
                            refreshDataSources();
        SashForm mainGroup = new SashForm(composite, SWT.NONE);
                            }
            SQLScriptTaskScriptSelectorDialog.createScriptColumns(scriptsViewer);
                setErrorMessage("Error loading settings: " + e.getTargetException().getMessage());
                Collection<DBPDataSourceContainer> resDS = res.getAssociatedDataSources();
                        }
                    }

                            refreshScripts();
            settings.setDumpQueryResultsToLog(dumpQueryCheck.getSelection());
                        if (selectionIndex < dsTable.getItemCount() - 1) {


            );
                        if (resource != null) {
    private Button dumpQueryCheck;
            UIUtils.createToolItem(
                            UIUtils.syncExec(() -> setErrorMessage("Cannot find navigator node for path " + filePath));
            }
                if (IOUtils.isLocalFile(filePath)) {

                DTMessages.sql_script_task_page_settings_option_auto_commit,
                    }
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;
                if (resource != null) {

import org.eclipse.swt.graphics.Image;
        getWizard().createVariablesEditButton(composite);

                        }
                        selectedDataSources.add(dsNode);
                        Path workspaceFile;
                }
            List<DBNDataSource> checkedDataSources = new ArrayList<>();

import org.jkiss.dbeaver.ui.DBeaverIcons;
                        loadSettings(new DefaultProgressMonitor(monitor));
                SelectionListener.widgetSelectedAdapter(e -> {
        for (DBPDataSourceContainer dataSource : settings.getDataSources()) {


                DTUIMessages.sql_script_task_page_settings_tool_item_text_add_script,
        scriptsViewer.refresh(true, true);
                ));
                                false,
                        }
                deleteItem.setEnabled(selectionIndex >= 0);
            final Table scriptTable = scriptsViewer.getTable();
import org.jkiss.dbeaver.model.navigator.DBNDataSource;
            dataSourceViewer.setContentProvider(new ListContentProvider());
                @Override
                DTUIMessages.sql_script_task_page_settings_tool_item_text_move_data_source_down,
                UIIcon.ARROW_UP,
                    }
                        if (!selection.isEmpty() && selection instanceof IStructuredSelection) {
import org.jkiss.dbeaver.model.rm.RMControllerProvider;
import org.jkiss.dbeaver.ui.UIUtils;
                DTMessages.sql_script_task_page_settings_option_auto_commit_tip,
                moveDownItem.setEnabled(selectionIndex < dsTable.getItemCount() - 1);
        for (DBNNode resource : selectedScripts) {
                }
                            selectedDataSources.set(selectionIndex + 1, selectedDataSources.get(selectionIndex));
                                }
                                }
        if (selectedScripts.isEmpty()) {
                    } else {

                SelectionListener.widgetSelectedAdapter(e -> {
                            continue;
            if (resource instanceof DBNPathBase pn) {
    @Override
                UIIcon.ROW_ADD,
                    }

                            log.error("Cannot find navigator node for path " + filePath);

        }
            );
    @Override
            dataSourceViewer.addSelectionChangedListener(event -> {
            }
        DBPProject project = getWizard().getProject();
                getWizard().getContainer().run(true, true, monitor -> {
                mainGroup,
                                if (element instanceof DBNDataSource) {
}import org.jkiss.dbeaver.tools.transfer.DTUtils;
            }
                        }
        updatePageCompletion();
import org.jkiss.dbeaver.ui.internal.UIMessages;
                buttonsToolbar,
            buttonsToolbar.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));

            for (DBPDataSourceContainer ds : dataSources) {
import org.eclipse.swt.widgets.*;
            ToolItem deleteItem = UIUtils.createToolItem(
                                }
                    if (fsNode != null) {
                public String getText(Object element) {
    private void refreshScripts() {
        refreshDataSources();
                    }
            settings.setAutoCommit(autoCommitCheck.getSelection());


                UIUtils.createToolItem(
                            } else {
                    } catch (DBException e) {
                                    selectedDataSources.remove(element);
                3,
                }
                }
import org.jkiss.dbeaver.Log;
            for (String filePath : scriptFiles) {
        setDescription(DTMessages.sql_script_task_page_settings_description);
                                refreshScripts();
                    DBNNode node = (DBNNode) element;
            settings.setScriptFiles(scriptPaths);
            determinePageCompletion();
import org.eclipse.swt.custom.SashForm;
                        if (workspaceFile != null) {

                    if (resource == null) {
                if (res instanceof IFile && getWizard().getProject() instanceof RCPProject rcpProject) {
                // ignore
import org.jkiss.dbeaver.model.navigator.DBNResource;
                ));
    }
            setErrorMessage(DTUIMessages.sql_script_task_page_settings_error_message_you_must_select_script_execute);
            if (!checkedDataSources.isEmpty()) {
                DBNDataSource dsNode = projectNode.getDatabases().getDataSource(ds);
                    }
                    DBPResourceHandler handler = DBPPlatformDesktop.getInstance().getWorkspace().getResourceHandler(resource);
        SQLScriptExecuteSettings dtSettings = getWizard().getSettings();
        }
                        throw new InvocationTargetException(e);
import org.jkiss.dbeaver.model.navigator.DBNProject;
    private void refreshDataSources() {
            return false;

 *
        mainGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
package org.jkiss.dbeaver.tasks.ui.sql.script;
            gd.heightHint = 300;
        if (!dataSources.isEmpty()) {
            final Table dsTable = dataSourceViewer.getTable();
                    }
                ));
                            refreshScripts();
            dumpQueryCheck = UIUtils.createCheckbox(settingsGroup, DTMessages.sql_script_task_page_settings_option_dump_results, "", dtSettings.isDumpQueryResultsToLog(), 1);
    }
                ));
                moveDownItem.setEnabled(selectionIndex < scriptTable.getItemCount() - 1);
                            selectedScripts.set(selectionIndex + 1, selectedScripts.get(selectionIndex));
                    return DBeaverIcons.getImage(icon);
                buttonsToolbar,
    }

import java.lang.reflect.InvocationTargetException;
        {
 * Copyright (C) 2010-2026 DBeaver Corp and others
                    checkedDataSources.add(dsNode);
            }
                } else {
                                if (element instanceof DBNNode node && node.getAdapter(IResource.class) != null) {
        mainGroup.setWeights(600, 400);
            if (dsNode != null) {
        for (DBNDataSource dsNode : selectedDataSources) {
                DTUIMessages.sql_script_task_page_settings_tool_item_text_remove_data_source,
import org.jkiss.dbeaver.model.navigator.fs.DBNPathBase;
 * Unless required by applicable law or agreed to in writing, software
                    DBPImage icon;
            if (element instanceof DBNResource res) {
        }
                        SQLScriptTaskScriptSelectorDialog dialog = new SQLScriptTaskScriptSelectorDialog(getShell(), projectNode);
                            DBNNode nextScript = selectionIndex < 0 || selectionIndex >= selectedScripts.size() ?
                    if (node instanceof DBNPathBase) {
    private final List<DBNNode> selectedScripts = new ArrayList<>();

        updateSelectedScripts();
                        icon = DBIcon.TREE_SCRIPT;
                    selectedScripts.add(resource);
                        if (selectionIndex > 0) {
                    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                            updatePageCompletion();
        }
                            return rcpProject.getResourcePath(resource);
        }
        Set<DBPDataSourceContainer> dataSources = new LinkedHashSet<>();
            setErrorMessage(DTUIMessages.sql_script_task_page_settings_error_message_you_must_select_connection);
import org.jkiss.dbeaver.ui.UIIcon;
    private TableViewer scriptsViewer;
            }
        });
            });
                buttonsToolbar,
import org.eclipse.core.resources.IResource;
            gd.widthHint = 400;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import java.util.List;
                    UIMessages.text_with_open_dialog_browse_remote,
                            handler.openResource(resource);
                DTUIMessages.sql_script_task_page_settings_tool_item_text_move_script_up,
                        return DBFUtils.convertPathToString(pathNode.getPath());
        initializeDialogUnits(parent);
                deleteItem.setEnabled(selectionIndex >= 0);
        return true;
                }
                if (!CommonUtils.isEmpty(resDS)) {
    private Button autoCommitCheck;
    }

        mainGroup.setSashWidth(5);
            settings.setIgnoreErrors(ignoreErrorsCheck.getSelection());
import org.eclipse.swt.SWT;
import org.eclipse.core.resources.IFile;
            dsTable.setLayoutData(new GridData(GridData.FILL_BOTH));
    public void createControl(Composite parent) {
                            updatePageCompletion();
import org.jkiss.dbeaver.ui.controls.ListContentProvider;
 * SQL task settings page
 *
                });
                buttonsToolbar,
                            refreshDataSources();
            });
        {
                    DBNNode node = (DBNNode) element;
                            refreshScripts();

            UIUtils.createToolBarSeparator(buttonsToolbar, SWT.HORIZONTAL);
                    }
        DBNProject projectNode = project.getNavigatorModel().getRoot().getProjectNode(project);
                UIIcon.ARROW_UP,
    protected boolean determinePageCompletion() {
                DTUIMessages.sql_script_task_page_settings_tool_item_text_remove_script,
                DTUIMessages.sql_script_task_page_settings_tool_item_text_add_data_source,
        List<String> scriptPaths = new ArrayList<>();
            dataSourceViewer.getTable().setLayoutData(gd);
                ));
    private static final Log log = Log.getLog(SQLScriptTaskPageSettings.class);
            List<String> scriptFiles = settings.getScriptFiles();
import org.jkiss.dbeaver.tools.transfer.ui.internal.DTUIMessages;
                        if (dialog.open() == IDialogConstants.OK_ID) {
                buttonsToolbar,
        DBPProject project = sqlWizard.getProject();
                    }
                                SWT.OPEN,
                ));
                            }
                        DBNPathBase pathNode = fsNode.findNodeByPath(monitor, filePath);
                                }
            ToolItem moveDownItem = UIUtils.createToolItem(
                IResource resource = ((DBNNode) selection.getFirstElement()).getAdapter(IResource.class);
                            selectedScripts.add(pathNode);
                        int selectionIndex = scriptTable.getSelectionIndex();
        }
                UIIcon.ARROW_DOWN,

        DBNProject projectNode = project.getNavigatorModel().getRoot().getProjectNode(project);
                for (DBNDataSource dsNode : checkedDataSources) {
            deleteItem.setEnabled(false);

                SelectionListener.widgetSelectedAdapter(e -> {
            settings.setDataSources(dsList);
 *
                        try {

                            for (Object element : ((IStructuredSelection) selection).toArray()) {
                        }
        }
                            log.error(e);
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    private void updateSelectedScripts() {
            UIUtils.createControlLabel(connectionsGroup, DTMessages.sql_script_task_page_settings_group_connections, 2);
            }
                            int selectionIndex = scriptTable.getSelectionIndex();
                        }
            Composite filesGroup = UIUtils.createComposite(mainGroup, 2);
import org.eclipse.swt.events.SelectionListener;
        this.sqlWizard = wizard;
        if (!CommonUtils.isEmpty(scriptPaths)) {
                                UIMessages.text_with_open_dialog_browse_remote,
        }
        if (sqlWizard == null) {
                    if (handler != null) {
                                if (!selectedScripts.contains(selected)) {
                SelectionListener.widgetSelectedAdapter(e -> {
                                false,
                        if (!selection.isEmpty() && selection instanceof IStructuredSelection) {
                            refreshDataSources();
import org.jkiss.dbeaver.model.DBUtils;
                public String getText(Object element) {
import org.eclipse.jface.viewers.*;
                }
                    ));

                            selectedScripts.set(selectionIndex, prevScript);
    public void loadSettings(DBRProgressMonitor monitor) throws DBException {
        for (DBNNode element : selectedScripts) {
    }
                }
        UIUtils.syncExec(() -> {
                UIIcon.ROW_ADD,
                            for (DBNDataSource ds : dialog.getSelectedDataSources()) {
    }
            DBNDataSource dsNode = projectNode.getDatabases().getDataSource(dataSource);
        List<DBPDataSourceContainer> dsList = new ArrayList<>();
                            selectedDataSources.set(selectionIndex - 1, selectedDataSources.get(selectionIndex));
                SelectionListener.widgetSelectedAdapter(e -> {
                            DBNDataSource nextScript = selectedDataSources.get(selectionIndex + 1);
    @Override

                SelectionListener.widgetSelectedAdapter(e -> {
        });
        }
    SQLScriptTaskPageSettings(SQLScriptTaskConfigurationWizard wizard) {
import org.eclipse.jface.dialogs.IDialogConstants;
                        }
                        if (selectionIndex > 0) {
                            }
                    return DBeaverIcons.getImage(((DBNDataSource)element).getNodeIcon());
        }
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.dbeaver.model.rcp.RCPProject;
import java.util.*;
import org.jkiss.dbeaver.model.DBPImage;
            deleteItem.setEnabled(false);
        UIUtils.asyncExec(() -> {
                    }
        Composite composite = UIUtils.createComposite(parent, 2);
        DBNProject projectNode = project.getNavigatorModel().getRoot().getProjectNode(project);
                        try {
                SelectionListener.widgetSelectedAdapter(e -> {
                    SelectionListener.widgetSelectedAdapter(e -> {
                            DBWorkbench.getPlatformUI().showError("Error opening resource", "Failed to open resource " + resource, e);

                                    selectedScripts.add(selected);
        }
                    }
        if (ignoreErrorsCheck != null) {

            dsList.add(dsNode.getDataSourceContainer());
            });
                    UIIcon.OPEN_EXTERNAL,
            ToolBar buttonsToolbar = new ToolBar(filesGroup, SWT.VERTICAL);
                ));
            ToolItem moveUpItem = UIUtils.createToolItem(
            dataSourceViewer.setLabelProvider(new ColumnLabelProvider() {
                                new String[]{"*.sql", "*"},
            scriptsViewer.setInput(selectedScripts);
            scriptTable.setLayoutData(new GridData(GridData.FILL_BOTH));
                        RMControllerProvider rmControllerProvider = DBUtils.getAdapter(RMControllerProvider.class, project);
                int selectionIndex = scriptTable.getSelectionIndex();
                                nextScript instanceof DBNPathBase sp ? DBFUtils.convertPathToString(sp.getPath()) : null);
        DBPProject project = sqlWizard.getProject();
import org.eclipse.swt.layout.GridData;
                2);
                        }
            connectionsGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
import java.nio.file.Path;
                            DBNNode prevScript = selectedScripts.get(selectionIndex - 1);
                                }
                scriptPaths.add(DBFUtils.getUriFromPath(pn.getPath()).toString());
    }
import org.jkiss.utils.IOUtils;
                    dataSources.addAll(resDS);
    }
                        }
                    buttonsToolbar,
                    try {
                            for (Object element : ((IStructuredSelection) selection).toArray()) {
                1
                                    selectedScripts.remove(element);
            ignoreErrorsCheck = UIUtils.createCheckbox(settingsGroup, DTMessages.sql_script_task_page_settings_option_ignore_errors, "", dtSettings.isIgnoreErrors(), 1);
            dataSourceViewer = new TableViewer(connectionsGroup, SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION);
    private final List<DBNDataSource> selectedDataSources = new ArrayList<>();


        if (selectedDataSources.isEmpty()) {
            ToolBar buttonsToolbar = new ToolBar(connectionsGroup, SWT.VERTICAL);
                SelectionListener.widgetSelectedAdapter(e -> {
 * DBeaver - Universal Database Manager
                    if (element instanceof DBNPathBase pathNode) {
                @Override
                        if (dialog.open() == IDialogConstants.OK_ID) {
            dataSourceViewer.setInput(selectedDataSources);
            UIUtils.createToolItem(
            scriptsViewer.addSelectionChangedListener(event -> {
                            selectedScripts.set(selectionIndex, nextScript);
    private Button ignoreErrorsCheck;
import org.jkiss.utils.CommonUtils;
            filesGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
        if (dumpQueryCheck != null) {
                }
                        }
    private TableViewer dataSourceViewer;
                            selectedScripts.set(selectionIndex - 1, selectedScripts.get(selectionIndex));
                                workspaceFile = DTUtils.findProjectFile(project, filePath);
        if (!CommonUtils.isEmpty(dsList)) {
            autoCommitCheck = UIUtils.createCheckbox(
        if (autoCommitCheck != null) {
            scriptsViewer.getTable().setHeaderVisible(true);
                buttonsToolbar,
            scriptsViewer.addDoubleClickListener(event -> {
                    if (ownerProject instanceof RCPProject rcpProject) {

        setTitle(DTMessages.sql_script_task_page_settings_title);
                int selectionIndex = dsTable.getSelectionIndex();
                    }
                selectedDataSources.add(dsNode);
                                if (!selectedScripts.contains(script)) {
                composite,
                DTUIMessages.sql_script_task_page_settings_tool_item_text_move_script_down,
                        int selectionIndex = scriptTable.getSelectionIndex();
            });
        updatePageCompletion();
                    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
                    }
import org.jkiss.dbeaver.model.DBIcon;
        super(DTMessages.sql_script_task_title);
                            DBNNode nextScript = selectedScripts.get(selectionIndex + 1);
            }
/*
            scriptsViewer = new TableViewer(filesGroup, SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION);
            buttonsToolbar.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
                UIIcon.ROW_DELETE,
                    return ((DBNDataSource) element).getNodeDisplayName();
        composite.setLayoutData(new GridData(GridData.FILL_BOTH));
        setControl(composite);
    public void activatePage() {
        }
                        } catch (Exception e) {
 * you may not use this file except in compliance with the License.
                            for (DBNNode script : dialog.getSelectedScripts()) {
            //dataSourceViewer.getTable().setHeaderVisible(true);
            ToolItem moveUpItem = UIUtils.createToolItem(
                DTMessages.sql_script_task_page_settings_group_script,
                            }
            UIUtils.createToolBarSeparator(buttonsToolbar, SWT.HORIZONTAL);
                                    selectedDataSources.add(ds);
                            selectedDataSources.set(selectionIndex, prevScript);
                IResource res = resource.getAdapter(IResource.class);
                    return "";
            } catch (InterruptedException e) {
                if (dsNode != null) {
                        int selectionIndex = dsTable.getSelectionIndex();
import org.jkiss.dbeaver.model.app.DBPProject;
            scriptsViewer.setLabelProvider(new ColumnLabelProvider() {
                    }
            if (DBFUtils.supportsMultiFileSystems(project)) {
                        ISelection selection = dataSourceViewer.getSelection();
    }
                        }
                        continue;


                }
                moveUpItem.setEnabled(selectionIndex > 0);
                        if (selectionIndex < scriptTable.getItemCount() - 1) {
                                (selectedScripts.isEmpty() ? null : selectedScripts.getFirst()) : selectedScripts.get(selectionIndex);
                buttonsToolbar,
                        }
            ToolItem moveDownItem = UIUtils.createToolItem(
import org.jkiss.dbeaver.model.app.DBPResourceHandler;
                }
        setErrorMessage(null);
import org.jkiss.dbeaver.model.navigator.DBNNode;
                @Override
                            refreshScripts();
            GridData gd = new GridData(GridData.FILL_BOTH);
/**
import org.jkiss.dbeaver.model.fs.DBFUtils;
import org.jkiss.dbeaver.DBException;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.navigator.fs.DBNFileSystems;
                StructuredSelection selection = (StructuredSelection) event.getSelection();

                                workspaceFile = project.getAbsolutePath().resolve(filePath);
                    }
        }
    @Override
                            }
                            if (rmControllerProvider != null) {
                    scriptPaths.add(rcpProject.getResourcePath(res));
                    DBNFileSystems fsNode = projectNode.getExtraNode(DBNFileSystems.class);
                DTUIMessages.sql_script_task_page_settings_tool_item_text_move_data_source_up,
                moveUpItem.setEnabled(selectionIndex > 0);
 * limitations under the License.
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.runtime.DefaultProgressMonitor;
                @Override
import org.jkiss.dbeaver.tools.sql.SQLScriptExecuteSettings;
class SQLScriptTaskPageSettings extends ActiveWizardPage<SQLScriptTaskConfigurationWizard> {
            }
                public Image getImage(Object element) {
                        }
                public Image getImage(Object element) {
            ToolItem deleteItem = UIUtils.createToolItem(
                    DBNNode resource = projectNode.findNodeByRelativePath(monitor, filePath);
        SQLScriptExecuteSettings settings = sqlWizard.getSettings();
import org.jkiss.dbeaver.tools.transfer.internal.DTMessages;

        {
                        if (pathNode != null) {


            scriptsViewer.setContentProvider(new ListContentProvider());
                            DBNPathBase selected = DBWorkbench.getPlatformUI().openFileSystemSelector(
                            selectedDataSources.set(selectionIndex, nextScript);
                    DBPProject ownerProject = node.getOwnerProject();
            } else {
                        ISelection selection = scriptsViewer.getSelection();
                            resource = projectNode.findResource(monitor, workspaceFile);
        SQLScriptExecuteSettings settings = sqlWizard.getSettings();
                    if (!selectedDataSources.contains(dsNode)) {
                settingsGroup,
                            DBNDataSource prevScript = selectedDataSources.get(selectionIndex - 1);
                        log.error("Script file '" + filePath + "' not found");
            Composite connectionsGroup = UIUtils.createComposite(
                        } catch (Exception e) {

    private final SQLScriptTaskConfigurationWizard sqlWizard;
                        UIUtils.syncExec(() -> setMessage("Script file '" + filePath + "' not found", WARNING));
                            refreshScripts();
        }
 */
                        } else {
                        SQLScriptTaskDataSourceSelectorDialog dialog = new SQLScriptTaskDataSourceSelectorDialog(getShell(), projectNode);
        if (projectNode != null) {
                    if (resource == null) {
            });
        }
            try {
                        }
                        icon = node.getNodeIconDefault();
    public void deactivatePage() {
                UIIcon.ARROW_DOWN,
                dtSettings.isAutoCommit(),
                        IResource resource = node.getAdapter(IResource.class);
                refreshDataSources();
                buttonsToolbar,
            return;
            UIUtils.createControlLabel(filesGroup, DTMessages.sql_script_task_page_settings_group_files, 2);
        }

                                    selectedScripts.add(script);
                ));
