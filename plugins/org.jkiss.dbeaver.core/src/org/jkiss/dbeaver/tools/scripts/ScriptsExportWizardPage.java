        for (DBNResource resourceNode : selectedResources) {


import org.eclipse.swt.layout.GridData;
                selectedResources.add((DBNResource) obj);
            SWT.BORDER | SWT.CHECK
        updateState();
    private Button overwriteCheck;
    private void updateState() {
            }

        if (activeProject == null || activeProject.getNavigatorModel() == null) {
 * You may obtain a copy of the License at
        }
        scriptsNavigator.getViewer().addFilter(new ViewerFilter() {

/*
            });
        if (CommonUtils.isEmpty(outDir)) {
            result.add(resource);
            return;
 * See the License for the specific language governing permissions and
            gd = new GridData(GridData.BEGINNING);
            if (result.contains(parent)) {
        // Project list
        setTitle(CoreMessages.dialog_project_export_wizard_page_title);
            overwriteCheck.setLayoutData(gd);
    }
            Button openFolder = new Button(generalSettings, SWT.PUSH);
        GridData gd = new GridData(GridData.FILL_BOTH);
    private DatabaseNavigatorTree scriptsNavigator;
import org.jkiss.dbeaver.utils.RuntimeUtils;
            setMessage(CoreMessages.dialog_project_export_wizard_page_message_no_output_dir, IMessageProvider.ERROR);
import org.eclipse.swt.events.SelectionAdapter;
                public void modifyText(ModifyEvent e) {
                break;
        }
import org.eclipse.jface.dialogs.IMessageProvider;
        {
    public ScriptsExportData getExportData() {

import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;

        CheckboxTreeViewer viewer = (CheckboxTreeViewer) scriptsNavigator.getViewer();
import java.io.File;
                    directory = dialog.open();
        scriptsNavigator = new DatabaseNavigatorTree(
            directoryText.addModifyListener(new ModifyListener() {
                @Override
            placeholder,
                    if (directory != null) {
        return new ScriptsExportData(result, overwriteCheck.getSelection(), new File(outputDir));
        DBPProject activeProject = DBWorkbench.getPlatform().getWorkspace().getActiveProject();
 * Licensed under the Apache License, Version 2.0 (the "License");
}
                skip = true;
        }
        Set<IResource> result = new LinkedHashSet<>();
            setMessage(CoreMessages.dialog_project_export_wizard_page_message_configure_settings, IMessageProvider.NONE);
                addResourceToSet(result, resource);
 * DBeaver - Universal Database Manager
import org.jkiss.utils.CommonUtils;
                }
import org.jkiss.dbeaver.ui.editors.sql.scripts.ScriptsHandlerImpl;
import org.eclipse.swt.widgets.Button;
 *
 * you may not use this file except in compliance with the License.


                    dialog.setMessage(CoreMessages.dialog_project_export_wizard_page_dialog_choose_export_dir_message);
                        dialog.setFilterPath(directory);
        }
import org.eclipse.swt.widgets.DirectoryDialog;
                    }
import java.util.Set;
            @Override
 *
        scriptsNavigator.setLayoutData(gd);
        );
            openFolder.addSelectionListener(new SelectionAdapter() {
import org.jkiss.dbeaver.Log;
        setControl(placeholder);
        }
            );
            return true;
        final String outputDir = directoryText.getText();
            return false;
                @Override
import org.jkiss.dbeaver.ui.UIUtils;
    }
                    String directory = directoryText.getText();

import org.jkiss.dbeaver.ui.UIIcon;
            }
                }
class ScriptsExportWizardPage extends WizardPage {
                    if (!CommonUtils.isEmpty(directory)) {
        super(pageName);
        Composite generalSettings = UIUtils.createPlaceholder(placeholder, 3);
    @Override
    public boolean isPageComplete() {
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionEvent;

            }
                return (element instanceof DBNResource dbnResource && dbnResource.getResource().equals(scriptFolder)) ||
 * limitations under the License.
import org.jkiss.dbeaver.core.CoreMessages;
    @Override


    private static final Log log = Log.getLog(ScriptsExportWizardPage.class);
        }
import org.eclipse.jface.wizard.WizardPage;
                generalSettings,
            .getResourceDefaultRoot(activeProject, ScriptsHandlerImpl.class, false);
import org.eclipse.swt.events.ModifyEvent;
            overwriteCheck = UIUtils.createCheckbox(
        for (IResource parent = resource.getParent(); parent != null; parent = parent.getParent()) {
            return false;
        Composite placeholder = UIUtils.createPlaceholder(parent, 1);
 * Unless required by applicable law or agreed to in writing, software
        String outDir = DBWorkbench.getPlatform().getPreferenceStore().getString(PREF_SCRIPTS_EXPORT_OUT_DIR);
        for (Object obj : viewer.getCheckedElements()) {
    }
        placeholder.setLayout(new GridLayout(1, false));
    }

        }
        }
import org.jkiss.dbeaver.model.navigator.DBNResource;
        });
import org.eclipse.swt.events.ModifyListener;
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTree;
        }
        CheckboxTreeViewer viewer = scriptsNavigator.getCheckboxViewer();
import org.eclipse.swt.layout.GridLayout;
                false
 */
            final IResource resource = resourceNode.getResource();
            });
import java.util.List;
            directoryText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            if (obj instanceof DBNResource) {
        // Add files
            UIUtils.createControlLabel(generalSettings, CoreMessages.dialog_project_export_wizard_page_label_directory);
        IFolder scriptFolder = DBPPlatformDesktop.getInstance().getWorkspace()
import org.eclipse.swt.SWT;
        if (directoryText == null || directoryText.isDisposed() || scriptsNavigator == null || scriptsNavigator.isDisposed()) {
            if (resource instanceof IFolder) {
        if (CommonUtils.isEmpty(directoryText.getText())) {
    static final String PREF_SCRIPTS_EXPORT_OUT_DIR = "export.scripts.out.dir"; //$NON-NLS-1$
        if (!skip) {
import org.eclipse.core.resources.IFolder;
                public void widgetSelected(SelectionEvent e) {
import org.jkiss.dbeaver.model.app.DBPProject;

        DBWorkbench.getPlatform().getPreferenceStore().setValue(PREF_SCRIPTS_EXPORT_OUT_DIR, outputDir);
    }
            public boolean select(Viewer viewer, Object parentElement, Object element) {

 *     http://www.apache.org/licenses/LICENSE-2.0
    public void createControl(Composite parent) {
            outDir = RuntimeUtils.getUserHomeDir().getAbsolutePath();
 *
        boolean skip = false;


        // Add folders

            final IResource resource = resourceNode.getResource();
            directoryText.setText(outDir);
                CoreMessages.dialog_project_export_wizard_page_checkbox_overwrite_files,
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.eclipse.swt.widgets.Composite;
                        directoryText.setText(directory);
    protected ScriptsExportWizardPage(String pageName) {
            }
            addResourceToSet(result, resource);

        selectedResources.clear();
            }
        generalSettings.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            activeProject.getNavigatorModel().getRoot().getProjectNode(activeProject),
    private void addResourceToSet(Set<IResource> result, IResource resource) {
        viewer.addCheckStateListener(new ICheckStateListener() {
        } else {
        for (DBNResource resourceNode : selectedResources) {
            directoryText = new Text(generalSettings, SWT.BORDER);
    private final List<DBNResource> selectedResources = new ArrayList<>();
                    }
        if (selectedResources.isEmpty()) {

                    DirectoryDialog dialog = new DirectoryDialog(getShell(), SWT.NONE);
import org.jkiss.dbeaver.runtime.DBWorkbench;

            gd.horizontalSpan = 3;
                    (parentElement instanceof DBNResource parentDbnResource && parentDbnResource.getResource().equals(scriptFolder));
                    dialog.setText(CoreMessages.dialog_project_export_wizard_page_dialog_choose_export_dir_text);
import org.eclipse.jface.viewers.*;
        });
        // Output folder
            return false;
import java.util.LinkedHashSet;
                updateState();
    private Text directoryText;
        getContainer().updateButtons();

import org.jkiss.dbeaver.ui.DBeaverIcons;
        }
import java.util.ArrayList;
package org.jkiss.dbeaver.tools.scripts;
            public void checkStateChanged(CheckStateChangedEvent event) {
            openFolder.setImage(DBeaverIcons.getImage(UIIcon.OPEN));
        }
                    updateState();
import org.eclipse.core.resources.IResource;
            setMessage(CoreMessages.dialog_project_export_wizard_page_message_check_script, IMessageProvider.ERROR);
            @Override
