        UIUtils.createTableColumn(projectsTable, SWT.LEFT, CoreMessages.dialog_project_import_wizard_file_column_source_name);
import org.jkiss.dbeaver.ui.UIUtils;
    private void updateState()
import org.eclipse.core.resources.IProject;
            item.setForeground(1, null);
        fileNameText.addModifyListener(e -> {
            }
}
import org.eclipse.swt.layout.GridData;
        getContainer().updateButtons();

        importData.clearProjectNameMap();
                if (oldEditor != null) oldEditor.dispose();
                updateState();
            return false;
import org.jkiss.dbeaver.ui.UIIcon;

            @Override

        projectsTable.setLayoutData(gd);
/*
                });
    protected ProjectImportWizardPageFile(ProjectImportData importData)
            if (!validItem && item.getChecked()) {
                setMessage(CoreMessages.dialog_project_import_wizard_file_message_ready, IMessageProvider.INFORMATION);
                showEditor(item);
            if (CommonUtils.isEmpty(fileName)) {
                String selected = fd.open();
            }
                }
import org.jkiss.dbeaver.core.CoreMessages;
                fd.setFilterExtensions(filterExt);
        });
            if (item.getChecked()) {
        });
    private String curFolder;
                    importData.addProjectName(item.getText(0), item.getText(1));
                if (item.getChecked()) {
    }

                text.setText(item.getText(1));
        this.importData = importData;
                }
            3,
        if (!project.isAccessible()) {
        tableEditor.horizontalAlignment = SWT.LEFT;
                    curFolder = fd.getFilterPath();
    private boolean checkProjectItem(TableItem item)
import org.eclipse.jface.dialogs.IMessageProvider;
        return !failed;
package org.jkiss.dbeaver.tools.project;
            @Override
import org.jkiss.utils.CommonUtils;
    {
                updateProjectsSelection();
            {
    }
    {
    {
        return importData.isProjectsSelected(this);
        projectsTable.setHeaderVisible(true);
            return false;

import org.w3c.dom.Document;
                return true;
            CoreMessages.dialog_project_import_wizard_file_group_input,
        );
import org.eclipse.swt.graphics.Point;
        // Project list
    private final ProjectImportData importData;
                importData.setImportDriverLibraries(importDriverCheck.getSelection());

                        item.setImage(DBeaverIcons.getImage(DBIcon.PROJECT));
                    return true;
import java.io.File;
        });
                    projectsTable.removeAll();
import org.eclipse.swt.events.SelectionAdapter;
        setControl(placeholder);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return true;
        importDriverCheck.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent e)
        boolean failed = false;
    private void clearArchive()
        String projectName = item.getText(1);
            {
    public boolean isPageComplete()

                failed = true;
            for (TableItem item : projectsTable.getItems()) {
        projectsTable.removeAll();
            return false;
            clearArchive();
import org.eclipse.swt.events.MouseEvent;
        super(CoreMessages.dialog_project_import_wizard_file_name);
        Composite configGroup = UIUtils.createTitledComposite(
        projectsTable.addSelectionListener(new SelectionAdapter() {
            }

    }
            public void mouseUp(MouseEvent e)
        setTitle(CoreMessages.dialog_project_import_wizard_file_title);

    }
 * See the License for the specific language governing permissions and

 *
    private boolean updateProjectsSelection()
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.jface.wizard.WizardPage;
 * You may obtain a copy of the License at
                }
 * Licensed under the Apache License, Version 2.0 (the "License");
        IProject project = DBPPlatformDesktop.getInstance().getWorkspace().getEclipseWorkspace().getRoot().getProject(projectName);
import org.eclipse.swt.events.MouseAdapter;
                FileDialog fd = new FileDialog(getShell(), SWT.OPEN | SWT.SINGLE);
                fd.setText(CoreMessages.dialog_project_import_wizard_file_dialog_export_archive_text);
                loadArchive();
                disposeOldEditor();
            }
        setDescription(CoreMessages.dialog_project_import_wizard_file_description);
                    }
            placeholder,
class ProjectImportWizardPageFile extends WizardPage {
                // Identify the selected row
        UIUtils.packColumns(projectsTable);
                    updateState();
            }

    public void createControl(Composite parent)
        openFolder.addSelectionListener(new SelectionAdapter() {
            if (importData.getMetaTree() != null) {
        tableEditor.grabHorizontal = true;
            {
                    hasChecked = true;
            }
        Composite placeholder = UIUtils.createPlaceholder(parent, 1);
            boolean validItem = checkProjectItem(item);
            {
            public void widgetSelected(SelectionEvent e)

                setMessage(CoreMessages.dialog_project_import_wizard_file_message_choose_project, IMessageProvider.INFORMATION);
        gd = new GridData(GridData.FILL_BOTH);
                clearArchive();
                Control oldEditor = tableEditor.getEditor();
            GridData.FILL_HORIZONTAL
        });
        tableEditor.verticalAlignment = SWT.TOP;
            CoreMessages.dialog_project_import_wizard_file_group_projects,
            String fileName = fileNameText.getText();
            boolean hasChecked = false;
                }
 */
                // Clean up any previous editor control
        importDriverCheck.setLayoutData(gd);
        if (!failed) {
    private Table projectsTable;
        projectsTable = new Table(projectsGroup, SWT.MULTI | SWT.CHECK | SWT.BORDER | SWT.FULL_SELECTION);

    }

        gd.horizontalSpan = 3;
                        String projectName = projectElement.getAttribute(ExportConstants.ATTR_NAME);
                        item.setText(0, projectName);
            if (importData.loadArchiveMeta(this)) {
            }

import org.eclipse.osgi.util.NLS;

import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;
                    setMessage(CoreMessages.dialog_project_import_wizard_file_message_cannt_find_projects, IMessageProvider.ERROR);
        }
 *
                    UIUtils.packColumns(projectsTable);
    }
            }

            GridData.FILL_BOTH
                Text text = new Text(projectsTable, SWT.BORDER);
                importData.setImportFile(new File(fileName));
        Composite projectsGroup = UIUtils.createTitledComposite(
            } else {
                Document metaTree = importData.getMetaTree();
        Button openFolder = new Button(configGroup, SWT.PUSH);
        final Button importDriverCheck = UIUtils.createCheckbox(configGroup, CoreMessages.dialog_project_import_wizard_file_checkbox_import_libraries, true);
    {
import org.jkiss.dbeaver.model.DBIcon;
                if (projectsElement == null) {
        for (TableItem item : projectsTable.getItems()) {
        openFolder.setImage(DBeaverIcons.getImage(UIIcon.OPEN));
            if (hasChecked) {
                        item.setText(1, projectName);
        }
                    updateProjectsSelection();
                text.selectAll();
                importData.setImportFile(null);
                    return;
                } else {
    private boolean loadArchive()
    @Override
        projectsTable.setLinesVisible(true);
        } else {
                setMessage(NLS.bind(CoreMessages.dialog_project_import_wizard_file_message_project_exists, projectName), IMessageProvider.ERROR);
        projectsTable.addMouseListener(new MouseAdapter() {
            @Override
    {
import org.eclipse.swt.SWT;
                if (item == null) {
            updateState();
                    updateProjectsSelection();
        });
        UIUtils.createTableColumn(projectsTable, SWT.LEFT, CoreMessages.dialog_project_import_wizard_file_column_target_name);
            } else {
        }
            private void disposeOldEditor()
                text.addModifyListener(e -> {
    {
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.*;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.DBeaverIcons;
    {
import org.w3c.dom.Element;

            private void showEditor(final TableItem item) {
        }
            public void widgetSelected(SelectionEvent e)
 * Copyright (C) 2010-2026 DBeaver Corp and others
            }
    @Override
        GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
            {

 *     http://www.apache.org/licenses/LICENSE-2.0
        final Text fileNameText = UIUtils.createLabelText(configGroup, CoreMessages.dialog_project_import_wizard_file_label_file, null); //$NON-NLS-2$
                        TableItem item = new TableItem(projectsTable, SWT.NONE);
        final TableEditor tableEditor = new TableEditor(projectsTable);
            clearArchive();
    }

            }
                text.setFocus();
            @Override
                    fileNameText.setText(selected);
                TableItem item = projectsTable.getItem(new Point(e.x, e.y));
            }
                tableEditor.setEditor(text, item, 1);
    }
 * Unless required by applicable law or agreed to in writing, software
                String[] filterExt = {"*.dbp", "*"}; //$NON-NLS-1$ //$NON-NLS-2$
                fd.setFilterPath(curFolder);
 *


                    Text text1 = (Text) tableEditor.getEditor();
            }
            1,
 * limitations under the License.
                Element projectsElement = XMLUtils.getChildElement(metaTree.getDocumentElement(), ExportConstants.TAG_PROJECTS);
 * you may not use this file except in compliance with the License.
    {
                    item.setText(1, text1.getText());
import org.jkiss.utils.xml.XMLUtils;

        if (importData.isFileSpecified(this)) {
        );
        } else {
 * distributed under the License is distributed on an "AS IS" BASIS,
            placeholder,
            item.setForeground(1, projectsTable.getDisplay().getSystemColor(SWT.COLOR_RED));
                if (selected != null) {
                    for (Element projectElement : XMLUtils.getChildElementList(projectsElement, ExportConstants.TAG_PROJECT)) {
            }
