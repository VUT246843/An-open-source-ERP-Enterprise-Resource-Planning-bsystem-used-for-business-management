import org.eclipse.swt.graphics.Image;
            directoryText = new Text(generalSettings, SWT.BORDER);
import org.eclipse.swt.SWT;
        final int dsIndex = scriptsDataSources.getSelectionIndex();
            );
                "*.sql,*.txt"
 *
import org.eclipse.swt.widgets.Composite;
import org.jkiss.dbeaver.ui.editors.sql.scripts.ScriptsHandlerImpl;
        importRoot = activeProject.getNavigatorModel().getRoot().getProjectNode(activeProject);
                    updateState();
            importRoot instanceof DBNResource && ((DBNResource) importRoot).getResource() instanceof IFolder;
        scriptsNavigator.setLayoutData(new GridData(GridData.FILL_BOTH));


    private void updateState() {
            directoryText.addModifyListener(new ModifyListener() {

            for (DBPDataSourceContainer dataSourceDescriptor : DataSourceRegistry.getAllDataSources()) {
                new ConnectionLabelProvider()
 *
import org.jkiss.dbeaver.core.CoreMessages;
            if (scriptsDataSources.getItemCount() > 0) {
    @Override
        String externalDir = DBWorkbench.getPlatform().getPreferenceStore().getString(ScriptsExportWizardPage.PREF_SCRIPTS_EXPORT_OUT_DIR);
        scriptsNavigator.getViewer().addSelectionChangedListener(new ISelectionChangedListener() {
                generalSettings,
            !CommonUtils.isEmpty(directoryText.getText()) &&
 * You may obtain a copy of the License at
    private static class ConnectionLabelProvider extends LabelProvider implements IColorProvider {
            public boolean select(Viewer viewer, Object parentElement, Object element) {
            dataSourceContainer = (DBPDataSourceContainer) scriptsDataSources.getItem(dsIndex);
                return (element instanceof DBNResource dbnResource && dbnResource.getResource().equals(scriptFolder)) ||
            externalDir = RuntimeUtils.getUserHomeDir().getAbsolutePath();
                    DirectoryDialog dialog = new DirectoryDialog(getShell(), SWT.NONE);

import org.eclipse.swt.events.ModifyEvent;
import org.jkiss.dbeaver.ui.UIIcon;
        }
    private Text directoryText;
import org.jkiss.dbeaver.ui.DBeaverIcons;
import org.jkiss.dbeaver.ui.controls.CSmartCombo;
    @Override

                        directoryText.setText(directory);
 *
    private DBNNode importRoot = null;
                scriptsDataSources.select(0);
            directoryText.setText(externalDir);
    public ScriptsImportData getImportData() {
            directoryText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                @Override
        public Image getImage(Object element) {


import java.io.File;
        GridData gd = new GridData(GridData.BEGINNING);

            dataSourceContainer);
import org.eclipse.jface.wizard.WizardPage;
 * DBeaver - Universal Database Manager

 * distributed under the License is distributed on an "AS IS" BASIS,
                @Override
    private Text extensionsText;
import org.jkiss.dbeaver.ui.UIUtils;
    protected ScriptsImportWizardPage() {
        getContainer().updateButtons();
                } else {
            gd = new GridData(GridData.FILL_HORIZONTAL);
            .getResourceDefaultRoot(activeProject, ScriptsHandlerImpl.class, false);
package org.jkiss.dbeaver.tools.scripts;
class ScriptsImportWizardPage extends WizardPage {
import org.eclipse.swt.layout.GridLayout;
        final String outputDir = directoryText.getText();


            });
import org.jkiss.dbeaver.model.navigator.DBNResource;
        gd.horizontalSpan = 3;
        Composite placeholder = UIUtils.createPlaceholder(parent, 1);
            !CommonUtils.isEmpty(extensionsText.getText()) &&
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    dialog.setText(CoreMessages.dialog_scripts_import_wizard_dialog_choose_dir_text);
            public void selectionChanged(SelectionChangedEvent event) {

            });
    public void createControl(Composite parent) {
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.swt.events.ModifyListener;
            UIUtils.createControlLabel(generalSettings, CoreMessages.dialog_scripts_import_wizard_label_input_directory);
                        dialog.setFilterPath(directory);
        if (CommonUtils.isEmpty(externalDir)) {
                    directory = dialog.open();
    }
    }
        }
            return;
            }
            return null;
                    }
import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;
                }

                    if (directory != null) {

        updateState();

        public String getText(Object element) {
import org.eclipse.core.resources.IFolder;
    private Button overwriteCheck;
        {
        }
    }
            extensionsText = UIUtils.createLabelText(
 */

 * Copyright (C) 2010-2025 DBeaver Corp and others

        @Override
import org.jkiss.dbeaver.registry.DataSourceRegistry;
        Composite generalSettings = UIUtils.createPlaceholder(placeholder, 3);
    }
 * Unless required by applicable law or agreed to in writing, software

        return
        @Override
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
        }
        overwriteCheck.setLayoutData(gd);
        }


                updateState();
import org.jkiss.dbeaver.utils.RuntimeUtils;

        }
        });
            final DBNDatabaseNode node = DBWorkbench.getPlatform().getNavigatorModel().findNode((DataSourceDescriptor) element);
            Button openFolder = new Button(generalSettings, SWT.PUSH);
        );
        super(CoreMessages.dialog_scripts_import_wizard_name);
            return ((DataSourceDescriptor) element).getName();
                    importRoot = (DBNNode) sel.getFirstElement();
            }
import org.eclipse.swt.layout.GridData;
 *     http://www.apache.org/licenses/LICENSE-2.0
            gd.verticalIndent = 2;
            return element == null ? null : UIUtils.getConnectionColor(((DataSourceDescriptor) element).getConnectionConfiguration());
            UIUtils.createControlLabel(generalSettings, CoreMessages.dialog_scripts_import_wizard_label_default_connection);
import org.eclipse.swt.widgets.DirectoryDialog;
        @Override
        return new ScriptsImportData(
            scriptsDataSources.setLayoutData(gd);

                if (sel == null || sel.isEmpty()) {

        final DatabaseNavigatorTree scriptsNavigator = new DatabaseNavigatorTree(placeholder, importRoot, SWT.BORDER | SWT.SINGLE, false);
            openFolder.setImage(DBeaverIcons.getImage(UIIcon.OPEN));
            return node == null ? null : DBeaverIcons.getImage(node.getNodeIcon());
            false
    private CSmartCombo<DBPDataSourceContainer> scriptsDataSources;
import org.eclipse.swt.widgets.Text;
                generalSettings,
import org.eclipse.swt.events.SelectionEvent;
        setTitle(CoreMessages.dialog_scripts_import_wizard_title);
        generalSettings.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            @Override
 * you may not use this file except in compliance with the License.
            gd.horizontalSpan = 2;
                IStructuredSelection sel = (IStructuredSelection) event.getSelection();
                public void widgetSelected(SelectionEvent e) {
        IFolder scriptFolder = DBPPlatformDesktop.getInstance().getWorkspace()
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    }
        }
                    }
        scriptsNavigator.getViewer().addFilter(new ViewerFilter() {
            placeholder,
            scriptsDataSources = new CSmartCombo<>(
                SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY,
            @Override
        if (dsIndex >= 0) {
import org.eclipse.swt.graphics.Color;

import org.eclipse.swt.widgets.Button;
    }
import org.jkiss.dbeaver.runtime.DBWorkbench;

                    if (!CommonUtils.isEmpty(directory)) {
        UIUtils.createControlLabel(placeholder, CoreMessages.dialog_scripts_import_wizard_label_root_folder);
                    String directory = directoryText.getText();
            GridData gd = new GridData(GridData.FILL_HORIZONTAL);
            overwriteCheck.getSelection(),
                CoreMessages.dialog_scripts_import_wizard_label_file_mask,
        scriptsNavigator.getViewer().expandToLevel(2);
import org.eclipse.swt.events.SelectionAdapter;
            (DBNResource) importRoot,
                scriptsDataSources.addItem(dataSourceDescriptor);
        });
        setControl(placeholder);
import org.jkiss.utils.CommonUtils;
                    dialog.setMessage(CoreMessages.dialog_scripts_import_wizard_dialog_choose_dir_message);
                }
        public Color getBackground(Object element) {
 * limitations under the License.

            CoreMessages.dialog_project_export_wizard_page_checkbox_overwrite_files,

            extensionsText.getText(),
        DBPProject activeProject = DBWorkbench.getPlatform().getWorkspace().getActiveProject();
        placeholder.setLayout(new GridLayout(1, false));
                    importRoot = null;
    public boolean isPageComplete() {
            }
import org.jkiss.dbeaver.model.app.DBPProject;
import org.eclipse.jface.viewers.*;
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTree;
        setDescription(CoreMessages.dialog_scripts_import_wizard_description);
        DBWorkbench.getPlatform().getPreferenceStore().setValue(ScriptsExportWizardPage.PREF_SCRIPTS_EXPORT_OUT_DIR, outputDir);
        @Override
                public void modifyText(ModifyEvent e) {
 * See the License for the specific language governing permissions and
            new File(outputDir),
import org.jkiss.dbeaver.registry.DataSourceDescriptor;
        overwriteCheck = UIUtils.createCheckbox(
        }
            openFolder.addSelectionListener(new SelectionAdapter() {
                    (parentElement instanceof DBNResource parentDbnResource && parentDbnResource.getResource().equals(scriptFolder));

/*
            ); //$NON-NLS-2$
        DBPDataSourceContainer dataSourceContainer = null;
}
            }
        // Input settings
                }

            extensionsText.setLayoutData(gd);
import org.jkiss.dbeaver.model.navigator.DBNNode;
        if (activeProject == null || activeProject.getNavigatorModel() == null) {
            gd.horizontalSpan = 2;
        public Color getForeground(Object element) {
