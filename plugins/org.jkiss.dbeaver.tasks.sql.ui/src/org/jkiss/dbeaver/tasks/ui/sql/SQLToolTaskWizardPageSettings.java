
import org.jkiss.dbeaver.model.navigator.DBNProject;
    }

        }
        if (taskOptionsViewer.getTree().getItemCount() == 0) {
                public void widgetSelected(SelectionEvent e) {

            setErrorMessage("You must select object(s)");
        setControl(composite);
                moveButtons[0].setEnabled(selectionIndex > 0);
import org.jkiss.dbeaver.ui.controls.ListContentProvider;
        }
        if (taskOptionsViewer != null) {
            moveButtons[1].setEnabled(false);
        return true;
            gd.widthHint = 200;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            moveButtons[0].setEnabled(false);
                    return DBeaverIcons.getImage(DBValueFormatting.getObjectImage((DBPObject) element));
 *     http://www.apache.org/licenses/LICENSE-2.0
            settingsPanel.setMaximizedControl(objectsPanel);
/**
 * you may not use this file except in compliance with the License.
                            }
                public void widgetSelected(SelectionEvent e) {
import org.eclipse.jface.viewers.IStructuredSelection;

        }
                }
                    this,
                        TasksSQLUIMessages.sql_tool_task_wizard_page_settings_message_sql_preview_panel, e);
class SQLToolTaskWizardPageSettings extends ActiveWizardPage<SQLToolTaskWizard> implements DBPContextProvider {
                settingsPanel,
        if (selectedObjects.isEmpty()) {
import org.eclipse.swt.layout.FillLayout;
    }
                    UIUtils.setClipboardContents(getShell().getDisplay(), TextTransfer.getInstance(), text);
                    previewPanel,
                public void widgetSelected(SelectionEvent e) {
import org.eclipse.swt.widgets.ToolItem;
        setErrorMessage(null);
        SQLToolExecuteHandler taskHandler = sqlWizard.getTaskHandler();
            UIUtils.createToolBarSeparator(buttonsToolbar, SWT.HORIZONTAL);
                @Override
                }
        super(NLS.bind(TasksSQLUIMessages.sql_tool_task_wizard_page_settings_name, wizard.getTaskType().getName()));
        }
            serviceSQL.setSQLPanelText(sqlPreviewPanel, sqlText);
    @Override

        saveSettings();
        this.setPageComplete(false);
                        for (DBSObject object : objectListDialog.getSelectedObjects()) {
        previewPanel.setLayout(new FillLayout());
        setTitle(NLS.bind(TasksSQLUIMessages.sql_tool_task_wizard_page_settings_title, wizard.getTaskType().getName()));
import org.jkiss.dbeaver.ui.DBeaverIcons;
        return null;
            deleteItem.setEnabled(false);

import org.jkiss.dbeaver.model.struct.DBSObject;
                        selectedObjects.set(selectionIndex, prevScript);
            });
    SQLToolTaskWizardPageSettings(SQLToolTaskWizard wizard) {
        previewSplitter.setLayoutData(new GridData(GridData.FILL_BOTH));
                    DBNProject projectNode = DBWorkbench.getPlatform().getNavigatorModel().getRoot().getProjectNode(sqlWizard.getProject());
        String sqlText = generateScriptText();
            return;

            });
        composite.setLayoutData(new GridData(GridData.FILL_BOTH));
                        selectedObjects.set(selectionIndex + 1, selectedObjects.get(selectionIndex));
            buttonsToolbar.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
import org.jkiss.dbeaver.registry.task.TaskTypeDescriptor;
                        refreshObjects();
    private PropertyTreeViewer taskOptionsViewer;
            objectsViewer = new TableViewer(objectsPanel, SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION);
            moveButtons[0] = UIUtils.createToolItem(buttonsToolbar, TasksSQLUIMessages.sql_tool_task_wizard_page_settings_tool_item_text_move_script_up, UIIcon.ARROW_UP, new SelectionAdapter() {
                }
    @Override
            }
import org.eclipse.swt.layout.GridData;

            taskOptionsViewer.loadProperties(propertyCollector);
                TasksSQLUIMessages.sql_tool_task_wizard_page_settings_group_label_objects,
        Composite composite = UIUtils.createComposite(parent, 1);
import org.jkiss.dbeaver.ui.properties.PropertyTreeViewer;
                2,
import org.eclipse.swt.dnd.TextTransfer;
                    moveButtons[1].setEnabled(selectionIndex < objectTable.getItemCount() - 2);
    @Override
        {
                GridData.FILL_BOTH
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 * You may obtain a copy of the License at
import org.jkiss.utils.CommonUtils;

        updateScriptPreview();
        Composite controlsPanel = UIUtils.createComposite(composite, 2);
                }
                        for (Object element : ((IStructuredSelection) selection).toArray()) {

        if (serviceSQL != null) {
            ToolItem[] moveButtons = new ToolItem[2];
                    "");

            PropertySourceEditable propertyCollector = new PropertySourceEditable(sqlWizard.getSettings(), sqlWizard.getSettings());
                    }
            });
                                selectedObjects.remove(element);

import java.util.List;
                @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
                        }
                @Override
                    if (objectListDialog.open() == IDialogConstants.OK_ID) {
                        selectedObjects.set(selectionIndex - 1, selectedObjects.get(selectionIndex));
        SQLToolExecuteSettings<DBSObject> settings = sqlWizard.getSettings();
        }
    public DBCExecutionContext getExecutionContext() {

import org.eclipse.jface.viewers.TableViewer;
            GridData gd = new GridData(GridData.FILL_BOTH);
                        refreshObjects();
/*
                        updatePageCompletion();
                TasksSQLUIMessages.sql_tool_task_wizard_page_settings_group_label_settings,
            final Table objectTable = objectsViewer.getTable();
        UIUtils.createDialogButton(controlsPanel, TasksSQLUIMessages.sql_tool_task_wizard_page_settings_dialog_button_label_copy, new SelectionAdapter() {
    private UIServiceSQL serviceSQL;
    public void activatePage() {
                                selectedObjects.add(object);
            propertyCollector.collectProperties();
 * Unless required by applicable law or agreed to in writing, software
        }
                }
        {
    }
            UIUtils.createToolItem(buttonsToolbar, TasksSQLUIMessages.sql_tool_task_wizard_page_settings_tool_item_text_add_string, UIIcon.ROW_ADD, new SelectionAdapter() {
        }
                @Override

    }
        initializeDialogUnits(parent);

import org.jkiss.dbeaver.model.sql.task.SQLToolExecuteHandler;
                        selectedObjects.set(selectionIndex, nextScript);
    private final SQLToolTaskWizard sqlWizard;
                @Override
            );
    @Nullable
            ToolBar buttonsToolbar = new ToolBar(objectsPanel, SWT.VERTICAL);
            selectedObjects.addAll(settings.getObjectList());
            } catch (DBException e) {
    }
                settingsPanel,
            taskOptionsViewer.repackColumns();
    private void updateScriptPreview() {
            ToolItem deleteItem = UIUtils.createToolItem(buttonsToolbar, TasksSQLUIMessages.sql_tool_task_wizard_page_settings_tool_item_text_remove_string, UIIcon.ROW_DELETE, new SelectionAdapter() {
            taskOptionsViewer.addPropertyChangeListener(event -> updateScriptPreview());
                DBWorkbench.getPlatformUI().showError(TasksSQLUIMessages.sql_tool_task_wizard_page_settings_title_sql_preview_error,
        SQLToolExecuteSettings<DBSObject> settings = sqlWizard.getSettings();
            settings.setObjectList(selectedObjects);
                    UIUtils.getActiveWorkbenchWindow().getActivePage().getActivePart().getSite(),
            gd.heightHint = 150;
            log.error(e);
                    }
        Composite objectsPanel;
            return DBUtils.getDefaultContext(settings.getObjectList().getFirst(), false);
            });
                }
            objectsViewer.setLabelProvider(new ColumnLabelProvider() {
            objectsViewer.addSelectionChangedListener(event -> {
            objectTable.setLayoutData(gd);
                    }
                    }
            objectsPanel = UIUtils.createTitledComposite(

                deleteItem.setEnabled(selectionIndex >= 0);
                if (!CommonUtils.isEmpty(text)) {
            return taskHandler.generateScript(new VoidProgressMonitor(), sqlWizard.getSettings());
import org.jkiss.dbeaver.runtime.ui.UIServiceSQL;
    public void createControl(Composite parent) {
                        projectNode,
                    true,
    }
            // Load options
                            if (!selectedObjects.contains(object)) {
                public void widgetSelected(SelectionEvent e) {

                sqlPreviewPanel = serviceSQL.createSQLPanel(
            Composite optionsPanel = UIUtils.createTitledComposite(
                            if (element instanceof DBSObject) {

import org.eclipse.osgi.util.NLS;
 * limitations under the License.
import org.jkiss.dbeaver.ui.dialogs.ActiveWizardPage;
    @Override
            SQLToolExecuteSettings<DBSObject> settings = sqlWizard.getSettings();
                        getShell(),
        }
            public void widgetSelected(SelectionEvent e) {
import org.eclipse.swt.graphics.Image;
            });
        SashForm previewSplitter = new SashForm(composite, SWT.VERTICAL);
            return "-- Error: " + e.getMessage();
    private void loadSettings() {
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
        });
                        }
import org.eclipse.swt.widgets.ToolBar;
            });

                1,
                int selectionIndex = objectTable.getSelectionIndex();
import org.jkiss.dbeaver.model.sql.task.SQLToolExecuteSettings;
                        DBSObject nextScript = selectedObjects.get(selectionIndex + 1);
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;

        setDescription(NLS.bind(TasksSQLUIMessages.sql_tool_task_wizard_page_settings_description, wizard.getTaskType().getName()));
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.swt.widgets.Composite;
                        (TaskTypeDescriptor) sqlWizard.getTaskType());
    }

                GridData.FILL_BOTH
 * See the License for the specific language governing permissions and
                    int selectionIndex = objectTable.getSelectionIndex();
        }
                String text = serviceSQL.getSQLPanelText(sqlPreviewPanel);
import org.jkiss.code.Nullable;
                    int selectionIndex = objectTable.getSelectionIndex();
import org.eclipse.swt.custom.SashForm;
                    if (!selection.isEmpty() && selection instanceof IStructuredSelection) {
                    moveButtons[0].setEnabled(selectionIndex > 1);
            return false;
        {

                    SQLToolTaskObjectSelectorDialog objectListDialog = new SQLToolTaskObjectSelectorDialog(
import org.jkiss.dbeaver.Log;
import org.eclipse.swt.SWT;
    private final List<DBSObject> selectedObjects = new ArrayList<>();

        if (sqlWizard == null) {
    private TableViewer objectsViewer;



        updatePageCompletion();
                public String getText(Object element) {
        if (serviceSQL != null) {
                    if (selectionIndex < objectTable.getItemCount() - 1) {
 *


import org.jkiss.dbeaver.tasks.ui.sql.internal.TasksSQLUIMessages;
                public Image getImage(Object element) {
 * SQL task settings page


 *
        objectsViewer.refresh(true, true);
import org.jkiss.dbeaver.ui.UIUtils;
                    return DBUtils.getObjectFullName((DBPNamedObject) element, DBPEvaluationContext.UI);
            taskOptionsViewer.saveEditorValues();
    private static final Log log = Log.getLog(SQLToolTaskWizardPageSettings.class);

                moveButtons[1].setEnabled(selectionIndex < objectTable.getItemCount() - 1);
                        updatePageCompletion();
    void saveSettings() {
        }
            // Load objects
import org.jkiss.dbeaver.model.*;
                    moveButtons[1].setEnabled(selectionIndex < objectTable.getItemCount() - 1);
                            }
            @Override
import org.eclipse.swt.widgets.Table;
        updateScriptPreview();
        serviceSQL = DBWorkbench.getService(UIServiceSQL.class);
    private String generateScriptText() {
            objectsViewer.setContentProvider(new ListContentProvider());
                    if (selectionIndex > 0) {
        } catch (Exception e) {
import java.util.ArrayList;
        loadSettings();
 *
                    moveButtons[0].setEnabled(selectionIndex > 0);
            taskOptionsViewer = new PropertyTreeViewer(optionsPanel, SWT.BORDER);
                    TasksSQLUIMessages.sql_tool_task_wizard_page_settings_sql_panel_name,
    private void refreshObjects() {
 * Copyright (C) 2010-2026 DBeaver Corp and others
        try {
 */

import org.jkiss.dbeaver.ui.UIIcon;
            }
        Composite previewPanel = UIUtils.createComposite(previewSplitter, 1);
import org.jkiss.dbeaver.runtime.properties.PropertySourceEditable;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.jface.viewers.ISelection;
            );
                        refreshObjects();
    private Object sqlPreviewPanel;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.jkiss.dbeaver.DBException;
                        refreshObjects();
                        DBSObject prevScript = selectedObjects.get(selectionIndex - 1);
    }

        }
        if (settings != null && !settings.getObjectList().isEmpty()) {
                }

        this.sqlWizard = wizard;
                @Override
        }
 * DBeaver - Universal Database Manager
        SashForm settingsPanel = new SashForm(previewSplitter, SWT.HORIZONTAL);
        {
}
package org.jkiss.dbeaver.tasks.ui.sql;
            try {
    }
                    ISelection selection = objectsViewer.getSelection();
            objectsViewer.setInput(selectedObjects);
 */
import org.eclipse.swt.events.SelectionAdapter;
            selectedObjects.clear();
import org.jkiss.dbeaver.runtime.DBWorkbench;
    protected boolean determinePageCompletion() {
            moveButtons[1] = UIUtils.createToolItem(buttonsToolbar, TasksSQLUIMessages.sql_tool_task_wizard_page_settings_tool_item_text_move_script_down, UIIcon.ARROW_DOWN, new SelectionAdapter() {
