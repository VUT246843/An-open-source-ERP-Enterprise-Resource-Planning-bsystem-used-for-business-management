
            Composite tablesGroup = UIUtils.createTitledComposite(sashForm, "Tables", 2, GridData.FILL_BOTH);
            fdwCombo.setText(fdwInfo.getId());

            PropertySourceCustom propertySource = getWizard().getFdwPropertySource();
        }

import org.jkiss.dbeaver.DBException;
    {
        if (CommonUtils.isEmpty(fdwServerText.getText())) {
            if (fdwConfig != null) {
    @Override
        } catch (InterruptedException e) {
        {
            fdwCombo.add(fdwName);
        refreshFDWProperties();

    {

                getWizard().setSelectedSchema(publicSchema);
            }
            propsEditor.setNamesEditable(true);
    private List<PostgreFDWConfigWizard.FDWInfo> fdwList;

        schemaCombo.removeAll();
                }
 * Copyright (C) 2010-2026 DBeaver Corp and others
            propsEditor.getControl().setLayoutData(gd);
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
    private void loadSettings() {
    private static final Log log = Log.getLog(PostgreFDWConfigWizardPageConfig.class);
    public void createControl(Composite parent)
    }
                    schemaList.addAll(getWizard().getDatabase().getSchemas(monitor));
import org.jkiss.dbeaver.Log;
            propsEditor = new PropertyTreeViewer(settingsGroup, SWT.BORDER);
        }

        propsEditor.repackColumns();
            targetDataSourceText = UIUtils.createLabelText(tablesGroup, "Data source", "", SWT.BORDER | SWT.READ_ONLY);
                        fdwList.add(fdwInfo);
                }
        setControl(composite);
                @Override
            fdwServerText.setText(fdwServerId);
            return;
                        boolean found = false;
                }
import org.jkiss.dbeaver.ui.DBeaverIcons;
            gd.horizontalSpan = 2;
            });
        if (!activated) {

    private Combo schemaCombo;
                        if (!found) {
            propsEditor.setNewPropertiesAllowed(true);
                            if (fdwInfo.getId().equals(fdw.getFdwId())) {
    private PropertyTreeViewer propsEditor;
 * See the License for the specific language governing permissions and
    private Table entityTable;
            entityTable.setLayoutData(gd);
            Composite fdwGroup = UIUtils.createComposite(composite, 2);
            !CommonUtils.isEmpty(wizard.getFdwServerId()) &&
}
    public void deactivatePage() {
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSchema;
        if (fdwInfo == null) {
 *
        UIUtils.packColumns(entityTable, false);
    private Text targetDriverText;
    public boolean isPageComplete()
        if (selectedSchema != null) {
import org.eclipse.swt.custom.SashForm;
                propertySource.addProperty(new PropertyDescriptor(null, "host", "host", "Remote database host", false, String.class, "${host}", null));
        PostgreFDWConfigWizard.FDWInfo fdwInfo = getWizard().getSelectedFDW();
                    throw new InvocationTargetException(e);

                fdwName += " (" + fdw.getDescription() + ")";
    }
                    }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    fdwList = new ArrayList<>();
        }

            return;
        // Fill entities
        targetDataSourceText.setText(targetDataSource.getName());
            getWizard().setFdwServerId(fdwServerId);
        }
            // Fill options
            entityTable = new Table(tablesGroup, SWT.SINGLE | SWT.FULL_SELECTION | SWT.BORDER);
        }
import org.eclipse.swt.events.SelectionAdapter;
import org.jkiss.dbeaver.ui.dialogs.ActiveWizardPage;
        }
                    schemaList = new ArrayList<>();

            targetDriverText = UIUtils.createLabelText(tablesGroup, "Driver", "", SWT.BORDER | SWT.READ_ONLY);
 *     http://www.apache.org/licenses/LICENSE-2.0
                schemaCombo.setText(publicSchema.getName());
        for (PostgreSchema schema : schemaList) {
            schemaCombo.addSelectionListener(new SelectionAdapter() {
        setErrorMessage(null);
import org.jkiss.dbeaver.ui.UIUtils;
    }
    private Text fdwServerText;


 * you may not use this file except in compliance with the License.
            setErrorMessage("No target data source");
            fdwCombo = UIUtils.createLabelCombo(fdwGroup, "Wrapper", SWT.DROP_DOWN | SWT.READ_ONLY);
        Composite composite = UIUtils.createComposite(parent, 1);
                    // Fill from both installed FDW and pre-configured FDW
        propsEditor.saveEditorValues();

            getWizard().getRunnableContext().run(false, true, monitor -> {
        sashForm.setLayoutData(new GridData(GridData.FILL_BOTH));
            DBPDataSourceContainer targetDataSource = getWizard().getSelectedDataSource();
import org.jkiss.dbeaver.ext.postgresql.model.fdw.FDWConfigDescriptor;
import org.jkiss.dbeaver.runtime.properties.PropertySourceCustom;

                                found = true;
        fdwCombo.removeAll();
            TableItem item = new TableItem(entityTable, SWT.NONE);
import java.lang.reflect.InvocationTargetException;
 *
                    updatePageCompletion();
        {
import org.jkiss.utils.CommonUtils;
            fdwServerText.addModifyListener(e -> getWizard().setFdwServerId(fdwServerText.getText()));
                    updatePageCompletion();
            return;
            item.setText(0, entityNode.getNodeFullName());
import org.jkiss.dbeaver.model.DBUtils;
        loadSettings();
            PostgreSchema publicSchema = DBUtils.findObject(schemaList, PostgreConstants.PUBLIC_SCHEMA_NAME);
    @Override
    }
            GridData gd = new GridData(GridData.FILL_BOTH);

 * limitations under the License.
            item.setImage(0, DBeaverIcons.getImage(entityNode.getNodeIconDefault()));
 * Licensed under the Apache License, Version 2.0 (the "License");
                    }
            }
                public void widgetSelected(SelectionEvent e) {
            getWizard().setSelectedFDW(fdwInfo);
        setDescription("Choose foreign wrapper and set option");
            UIUtils.createInfoLabel(fdwGroup, "If you don't see right data wrapper in the list, install it on the server first.");
        {
        entityTable.removeAll();
            PostgreFDWConfigWizard.FDWInfo selectedFDW = getWizard().getSelectedFDW();
                        fdwInfo.installedFDW = fdw;
            });
            String fdwServerId = (fdwInfo == null ? targetDataSource.getDriver().getId() : fdwInfo.getId()) + "_srv";
            if (publicSchema != null) {
            log.debug(e.getTargetException());
class PostgreFDWConfigWizardPageConfig extends ActiveWizardPage<PostgreFDWConfigWizard> {
                        }
        PostgreSchema selectedSchema = getWizard().getSelectedSchema();
    {
                    getWizard().setSelectedSchema(schemaList.get(schemaCombo.getSelectionIndex()));
        targetDriverText.setText(targetDataSource.getDriver().getName());
                    for (FDWConfigDescriptor fdw : FDWConfigRegistry.getInstance().getConfigDescriptors()) {
import java.util.List;

            }

                }
        } else {
import org.jkiss.dbeaver.model.impl.PropertyDescriptor;
            gd.horizontalSpan = 2;
        super.deactivatePage();
            FDWConfigDescriptor fdwConfig = FDWConfigRegistry.getInstance().findFirstMatch(targetDataSource);
    @Override
        // Fill FDW list

            setErrorMessage(e.getTargetException().getMessage());
        } catch (InvocationTargetException e) {
        setTitle("Configure foreign data wrappers");
                        PostgreFDWConfigWizard.FDWInfo fdwInfo = new PostgreFDWConfigWizard.FDWInfo();

            String fdwName = fdw.getId();
import org.jkiss.dbeaver.ui.properties.PropertyTreeViewer;
    private Text targetDataSourceText;
        for (PostgreFDWConfigWizard.FDWInfo fdw : fdwList) {

    protected PostgreFDWConfigWizardPageConfig(PostgreFDWConfigWizard wizard)
        DBPDataSourceContainer targetDataSource = getWizard().getSelectedDataSource();
            wizard.getSelectedFDW() != null &&
                        break;
                    if (fdw.fdwDescriptor == fdwConfig) {
                            PostgreFDWConfigWizard.FDWInfo fdwInfo = new PostgreFDWConfigWizard.FDWInfo();
        if (fdwInfo != null) {
            propertySource.removeAll();
            fdwCombo.addSelectionListener(new SelectionAdapter() {
                // Add some default props
            schemaCombo.add(schema.getName());
import org.eclipse.swt.layout.GridData;
import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;
    public void activatePage() {
                                fdwInfo.fdwDescriptor = fdw;
            UIUtils.createTableColumn(entityTable, SWT.LEFT, "Table");
    private void refreshFDWProperties() {
        SashForm sashForm = new SashForm(composite, SWT.HORIZONTAL);
        if (targetDataSource == null) {
            } else if (selectedFDW != null) {

        updatePageCompletion();
        }
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.SWT;
            schemaCombo.setText(selectedSchema.getName());
            fdwGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                propertySource.addProperties(selectedFDW.fdwDescriptor.getProperties());
 */
                        fdwInfo = fdw;
            entityTable.setHeaderVisible(true);
            //UIUtils.createControlLabel(settingsGroup, "Options", 2);
    }
 *

 * DBeaver - Universal Database Manager
import java.util.ArrayList;
                                break;
        }

 * Unless required by applicable law or agreed to in writing, software
                    refreshFDWProperties();
            propertySource.setDefValueResolver(targetDataSource.getVariablesResolver(false));
        super("Configuration");
                @Override
            Composite settingsGroup = UIUtils.createTitledComposite(sashForm, "Settings", 2, GridData.FILL_BOTH);

        {
        }
            propsEditor.loadProperties(propertySource);
        setWizard(wizard);
    private List<PostgreSchema> schemaList;
        try {
        for (DBNDatabaseNode entityNode : getWizard().getSelectedEntities()) {

        super.activatePage();
            //UIUtils.createTableColumn(entityTable, SWT.LEFT, "Data source");
            if (!CommonUtils.isEmpty(fdw.getDescription())) {


                for (PostgreFDWConfigWizard.FDWInfo fdw : fdwList) {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ext.postgresql.model.PostgreForeignDataWrapper;
    }
                    for (PostgreForeignDataWrapper fdw : CommonUtils.safeCollection(getWizard().getDatabase().getForeignDataWrappers(monitor))) {
 * You may obtain a copy of the License at
            fdwServerText = UIUtils.createLabelText(settingsGroup, "Server ID", "", SWT.BORDER);
            !wizard.getSelectedEntities().isEmpty();
        }
    @Override
                propertySource.addProperty(new PropertyDescriptor(null, "port", "port", "Remote database port", false, String.class, "${port}", null));

        }
                } catch (DBException e) {
                            fdwList.add(fdwInfo);
        PostgreFDWConfigWizard wizard = getWizard();
        }
import org.eclipse.swt.events.SelectionEvent;
            //UIUtils.createTableColumn(entityTable, SWT.LEFT, "Driver");

        }
/*
            wizard.getSelectedSchema() != null &&
    private Combo fdwCombo;
        // Detect FDW from target container
            });
            if (selectedFDW != null && selectedFDW.fdwDescriptor != null) {
                        }
                    }
                try {

            UIUtils.createEmptyLabel(fdwGroup, 1, 1);
                            }
                    getWizard().setSelectedFDW(fdwList.get(fdwCombo.getSelectionIndex()));
        return activated &&
                public void widgetSelected(SelectionEvent e) {
            activated = true;
    }
import org.jkiss.dbeaver.ext.postgresql.model.fdw.FDWConfigRegistry;
            GridData gd = new GridData(GridData.FILL_BOTH);
            }
                propertySource.addProperty(new PropertyDescriptor(null, "dbname", "dbname", "Remote database name", false, String.class, "${database}", null));
        }



    private boolean activated;
                        for (PostgreFDWConfigWizard.FDWInfo fdwInfo : fdwList) {
            schemaCombo = UIUtils.createLabelCombo(settingsGroup, "Target schema", SWT.DROP_DOWN | SWT.READ_ONLY);
package org.jkiss.dbeaver.ext.postgresql.tools.fdw;
                            fdwInfo.fdwDescriptor = fdw;
