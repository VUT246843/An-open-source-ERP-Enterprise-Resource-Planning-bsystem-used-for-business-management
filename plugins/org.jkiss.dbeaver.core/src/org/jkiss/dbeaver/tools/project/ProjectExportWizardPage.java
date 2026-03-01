            return false;
            directoryText = new Text(generalSettings, SWT.BORDER);

import org.jkiss.dbeaver.model.app.DBPProject;
        // Project list
    }
        fileNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

            {
            }
            for (Object element : ss) {
import org.jkiss.dbeaver.ui.UIIcon;
        projectsTable.setLayoutData(gd);

import org.eclipse.jface.viewers.ISelection;
    @Override
                if (!CommonUtils.equalObjects(fileNameText.getText(), getArchiveFileName(getProjectsToExport()))) {
                        dialog.setFilterPath(directory);
import org.jkiss.dbeaver.model.rcp.RCPProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.swt.events.SelectionEvent;
    {
import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;
            }
 * distributed under the License is distributed on an "AS IS" BASIS,
    private boolean fileNameEdited = false;
            item.setImage(DBeaverIcons.getImage(DBIcon.PROJECT));
        }

import org.eclipse.jface.viewers.IStructuredSelection;
        exportDriverCheck.setLayoutData(gd);
                        directoryText.setText(directory);
                    if (!CommonUtils.isEmpty(directory)) {
    @Override

        for (DBPProject project : DBWorkbench.getPlatform().getWorkspace().getProjects()) {
        gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
        }
import org.jkiss.utils.CommonUtils;
            if (activeProject != null) {
import org.jkiss.dbeaver.ui.DBeaverIcons;
    private Table projectsTable;
 * You may obtain a copy of the License at
        placeholder.setLayout(new GridLayout(1, false));
            UIUtils.createControlLabel(generalSettings, CoreMessages.dialog_project_export_wizard_start_label_directory);
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.dbeaver.utils.RuntimeUtils;
        }
    }

    public boolean isPageComplete()
            getProjectsToExport(),
import java.io.File;
    {

                {
    private static final String PREF_PROJECTS_EXPORT_OUT_DIR = "export.projects.out.dir"; //NON-NLS-1 //$NON-NLS-1$
    			projectList.add(activeProject);
                @Override
import org.eclipse.jface.wizard.WizardPage;
            openFolder.setImage(DBeaverIcons.getImage(UIIcon.OPEN));
        if (!fileNameEdited) {
            });
 * Unless required by applicable law or agreed to in writing, software
                public void modifyText(ModifyEvent e)
import org.jkiss.dbeaver.core.CoreMessages;
    {
 *
        }
import org.eclipse.swt.widgets.*;

import org.eclipse.swt.events.ModifyListener;
                public void widgetSelected(SelectionEvent e)
            openFolder.addSelectionListener(new SelectionAdapter() {
            }
        projectsTable.addSelectionListener(new SelectionAdapter() {

        }
    {
            }
        if (projectList.isEmpty()) {
        GridData gd = new GridData(GridData.FILL_BOTH);
        //archiveName += ExportConstants.ARCHIVE_FILE_EXT;
        if (directoryText == null || directoryText.isDisposed() || projectsTable == null || projectsTable.isDisposed()) {
                @Override
                }
import java.util.ArrayList;
    {
 *
        getContainer().updateButtons();
                    projectList.add(DBPPlatformDesktop.getInstance().getWorkspace().getProject(resource.getProject()));
                    String directory = directoryText.getText();
        fileNameGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
import org.jkiss.dbeaver.model.DBIcon;
        });
import org.eclipse.swt.events.ModifyEvent;
            final TableItem item = new TableItem(projectsTable, SWT.NONE);
        if (CommonUtils.isEmpty(directoryText.getText())) {
}
    private List<RCPProject> getProjectsToExport()
package org.jkiss.dbeaver.tools.project;
            Button openFolder = new Button(generalSettings, SWT.PUSH);
import java.util.Set;
    {
            archiveName = projects.get(0).getName();
            if (projectList.contains(project)) {
        projectsTable = new Table(placeholder, SWT.MULTI | SWT.CHECK | SWT.BORDER);
            exportDriverCheck.getSelection(),
        }
                if (resource != null) {
            directoryText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        updateState();
        }
                {
import org.eclipse.swt.layout.GridLayout;

        final ISelection selection = UIUtils.getActiveWorkbenchWindow().getActivePage().getSelection();
 * you may not use this file except in compliance with the License.
import org.eclipse.swt.events.SelectionAdapter;

            {
        String archiveName = CoreMessages.dialog_project_export_wizard_start_archive_name_prefix;
        if (CommonUtils.isEmpty(outDir)) {
        super(pageName);
                return true;
        return false;
    ProjectExportData getExportData()
        }
        if (projects.size() == 1) {
            fileNameText.getText());
                }
 *

        final String outputDir = directoryText.getText();
        return new ProjectExportData(

            fileNameText.setText(archiveFileName);

            item.setData(project);
            }
                setMessage(CoreMessages.dialog_project_export_wizard_start_message_configure_settings, IMessageProvider.NONE);
import java.util.List;
                    updateState();
    public void createControl(Composite parent)
 * limitations under the License.
            });
import java.util.LinkedHashSet;
import org.eclipse.swt.layout.GridData;
        });
    }
            item.setText(project.getName());

			}
import org.eclipse.swt.SWT;
    }
    }
            @Override
                    }
                updateState();
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
            outDir = RuntimeUtils.getUserHomeDir().getAbsolutePath();
                    }
                IResource resource = RuntimeUtils.getObjectAdapter(element, IResource.class);
            if (item.getChecked()) {
        List<RCPProject> result = new ArrayList<>();

            setMessage(CoreMessages.dialog_project_export_wizard_start_message_empty_output_directory, IMessageProvider.ERROR);
                    directory = dialog.open();
 * Licensed under the Apache License, Version 2.0 (the "License");
        // Output folder
                result.add((RCPProject) item.getData());
            DBPProject activeProject = DBWorkbench.getPlatform().getWorkspace().getActiveProject();
        Composite placeholder = UIUtils.createPlaceholder(parent, 1);
    {
        exportDriverCheck = UIUtils.createCheckbox(placeholder, CoreMessages.dialog_project_export_wizard_start_checkbox_libraries, false);
                    if (directory != null) {
    private Button exportDriverCheck;
import org.jkiss.dbeaver.ui.UIUtils;

        }
    }
        setMessage(CoreMessages.dialog_project_export_wizard_start_message_choose_project, IMessageProvider.ERROR);

            @Override
            public void modifyText(ModifyEvent e)
        fileNameText = UIUtils.createLabelText(fileNameGroup, CoreMessages.dialog_project_export_wizard_start_label_output_file, null); //$NON-NLS-2$
        String outDir = DBWorkbench.getPlatform().getPreferenceStore().getString(PREF_PROJECTS_EXPORT_OUT_DIR);
        Composite generalSettings = UIUtils.createPlaceholder(placeholder, 3);
    private void updateState()

        {
class ProjectExportWizardPage extends WizardPage {
 * See the License for the specific language governing permissions and
            public void widgetSelected(SelectionEvent e)
        final Composite fileNameGroup = UIUtils.createPlaceholder(placeholder, 2);
    protected ProjectExportWizardPage(String pageName)
        fileNameText.addModifyListener(new ModifyListener() {
        setControl(placeholder);

        Set<DBPProject> projectList = new LinkedHashSet<>();
            new File(outputDir),
            return false;
        setTitle(CoreMessages.dialog_project_export_wizard_start_title);
            if (item.getChecked()) {
    private Text directoryText;
                    dialog.setMessage(CoreMessages.dialog_project_export_wizard_start_dialog_directory_message);
        return archiveName;
                    dialog.setText(CoreMessages.dialog_project_export_wizard_start_dialog_directory_text);

/*
 */
        return result;
        }
                }
import org.eclipse.jface.dialogs.IMessageProvider;

            final String archiveFileName = getArchiveFileName(getProjectsToExport());
        gd.horizontalSpan = 3;
        for (TableItem item : projectsTable.getItems()) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                item.setChecked(true);
            }
        }
        archiveName += "-" + RuntimeUtils.getCurrentDate(); //$NON-NLS-1$
 * DBeaver - Universal Database Manager
        for (TableItem item : projectsTable.getItems()) {
    static String getArchiveFileName(List<RCPProject> projects)
                    DirectoryDialog dialog = new DirectoryDialog(getShell(), SWT.NONE);

        DBWorkbench.getPlatform().getPreferenceStore().setValue(PREF_PROJECTS_EXPORT_OUT_DIR, outputDir);
                    fileNameEdited = true;
            directoryText.setText(outDir);
                }
        generalSettings.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            directoryText.addModifyListener(new ModifyListener() {
        if (selection != null && !selection.isEmpty() && selection instanceof IStructuredSelection ss) {
 *     http://www.apache.org/licenses/LICENSE-2.0
    private Text fileNameText;
