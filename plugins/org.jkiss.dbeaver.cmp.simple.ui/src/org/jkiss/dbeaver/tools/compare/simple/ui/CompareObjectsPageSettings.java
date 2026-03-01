                {
            compareScriptProperties = UIUtils.createCheckbox(compareSettings, CompareUIMessages.compare_objects_page_settings_checkbox_scripts, settings.isCompareScripts());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            });
    @Override
        }
            UIUtils.createTableColumn(nodesTable, SWT.LEFT, CompareUIMessages.compare_objects_page_settings_nodes_column_type);
                @Override
        Composite composite = new Composite(parent, SWT.NULL);
            compareScriptProperties.addSelectionListener(new SelectionAdapter() {
                {
            gl = new GridLayout(1, false);
            });
            for (DBNDatabaseNode node : settings.getNodes()) {
            compareOnlyStructure.addSelectionListener(new SelectionAdapter() {
import org.eclipse.swt.widgets.*;
    public void deactivatePage()
    public void activatePage() {
 * you may not use this file except in compliance with the License.
            UIUtils.createTableColumn(nodesTable, SWT.LEFT, CompareUIMessages.compare_objects_page_settings_nodes_column_name);
    }
class CompareObjectsPageSettings extends ActiveWizardPage<CompareObjectsWizard> {
            nodesTable = new Table(sourceSettings, SWT.SINGLE | SWT.FULL_SELECTION | SWT.BORDER);

        UIUtils.packColumns(nodesTable, true);
 * You may obtain a copy of the License at
            compareOnlyStructure = UIUtils.createCheckbox(compareSettings, CompareUIMessages.compare_objects_page_settings_checkbox_compare_structure, settings.isCompareOnlyStructure());

                }
        setPageComplete(false);
 *
        GridLayout gl = new GridLayout();
            compareLazyProperties = UIUtils.createCheckbox(compareSettings, CompareUIMessages.compare_objects_page_settings_checkbox_compare_properties, settings.isCompareLazyProperties());
            sourceSettings.setLayout(gl);
}            sourceSettings.setLayoutData(new GridData(GridData.FILL_BOTH));
                item.setText(2, node.getNodeFullName());
                item.setText(0, node.getNodeDisplayName());
                public void widgetSelected(SelectionEvent e)
    public void createControl(Composite parent) {
                @Override
            skipSystemObjects.addSelectionListener(new SelectionAdapter() {
                    settings.setCompareScripts(compareScriptProperties.getSelection());
 * See the License for the specific language governing permissions and

                @Override
import org.eclipse.swt.events.SelectionEvent;
    CompareObjectsPageSettings() {


 * Unless required by applicable law or agreed to in writing, software
        gl.marginHeight = 0;
                item.setImage(DBeaverIcons.getImage(node.getNodeIconDefault()));

    private Button compareScriptProperties;
        }
    private Button compareLazyProperties;
            nodesTable.setHeaderVisible(true);
 *
                }
            }
            nodesTable.setLayoutData(new GridData(GridData.FILL_BOTH));
    {
            });
/*
    @Override
    private Button skipSystemObjects;
            compareSettings.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        {
                @Override
    }

 *
                    settings.setCompareLazyProperties(compareLazyProperties.getSelection());
    }
        composite.setLayout(gl);
 * Licensed under the Apache License, Version 2.0 (the "License");
                {
import org.jkiss.dbeaver.tools.compare.simple.ui.internal.CompareUIMessages;
        composite.setLayoutData(new GridData(GridData.FILL_BOTH));

    private Button compareOnlyStructure;
        

        return true;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.dialogs.ActiveWizardPage;
import org.eclipse.swt.layout.GridData;
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
    }
            });
    @Override
                    settings.setCompareOnlyStructure(compareOnlyStructure.getSelection());
        super.deactivatePage();
            sourceSettings.setText(CompareUIMessages.compare_objects_page_settings_group_objects);
 * Copyright (C) 2010-2024 DBeaver Corp and others
                public void widgetSelected(SelectionEvent e)
        initializeDialogUnits(parent);
package org.jkiss.dbeaver.tools.compare.simple.ui;
                    settings.setSkipSystemObjects(skipSystemObjects.getSelection());

                }
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ui.DBeaverIcons;
        setDescription(CompareUIMessages.compare_objects_page_settings_description);
            compareSettings.setLayout(new GridLayout(1, false));

        updatePageCompletion();
            Group compareSettings = new Group(composite, SWT.NONE);
            compareLazyProperties.addSelectionListener(new SelectionAdapter() {
    {
            UIUtils.createTableColumn(nodesTable, SWT.LEFT, CompareUIMessages.compare_objects_page_settings_nodes_column_full_name);
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.swt.layout.GridLayout;
 * limitations under the License.
                {
 */
        setControl(composite);
    protected boolean determinePageCompletion()
        {
                public void widgetSelected(SelectionEvent e)
        super(CompareUIMessages.compare_objects_page_settings_page);
import org.jkiss.dbeaver.ui.UIUtils;
                TableItem item = new TableItem(nodesTable, SWT.NONE);
import org.eclipse.swt.SWT;
    @Override
            skipSystemObjects = UIUtils.createCheckbox(compareSettings, CompareUIMessages.compare_objects_page_settings_checkbox_skip_objects, settings.isSkipSystemObjects());
                }

import org.eclipse.swt.events.SelectionAdapter;
                item.setText(1, node.getNodeTypeLabel());
        gl.marginWidth = 0;
            compareSettings.setText(CompareUIMessages.compare_objects_page_settings_group_settings);
        final CompareObjectsSettings settings = getWizard().getSettings();
            Group sourceSettings = new Group(composite, SWT.NONE);
import org.jkiss.dbeaver.tools.compare.simple.CompareObjectsSettings;
    private Table nodesTable;
    }

                public void widgetSelected(SelectionEvent e)
        setTitle(CompareUIMessages.compare_objects_page_settings_title);
