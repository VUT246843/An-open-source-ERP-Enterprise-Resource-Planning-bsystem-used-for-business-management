import org.eclipse.swt.events.SelectionEvent;
                    return super.isDatabaseObjectVisible(obj);
import java.util.ArrayList;
                        if (dataSources.contains(ds.getDataSourceContainer())) {
    protected void updateState()
                    return getWizard().getAvailableDataSources().contains(dataSource.getDataSourceContainer());
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
                    return false;

        }
    @Override
 * DBeaver - Universal Database Manager
                getWizard().collectAvailableDataSources(monitor);

import org.jkiss.dbeaver.model.navigator.*;
                }
                @Override
    public boolean isPageComplete() {
        Composite composite = UIUtils.createComposite(parent, 1);


                getWizard().getRunnableContext()) {
 *
import org.eclipse.swt.widgets.Composite;
    public void createControl(Composite parent)
                public void widgetSelected(SelectionEvent e) {
import org.jkiss.dbeaver.ui.UIUtils;
                selectedEntities.add((DBNDatabaseNode) node);
            setErrorMessage(null);
            UIUtils.asyncExec(() -> {
import org.jkiss.dbeaver.model.struct.DBSObject;
 */
        DBPDataSourceContainer dsContainer = null;
                    DBNDatabaseNode node = DBNUtils.getNodeByObject(monitor, entity, false);
import org.eclipse.swt.layout.GridData;

            selectorPanel = new DatabaseObjectsSelectorPanel(

        } catch (InterruptedException e) {
        {

                }
            activated = true;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
}
            selectorPanel.addSelectionListener(event -> {
        selectorPanel.checkNodes(selection, true);
 * you may not use this file except in compliance with the License.
                }
            Composite buttonsPanel = UIUtils.createComposite(databasesGroup, 2);
    private boolean activated;
            getWizard().getRunnableContext().run(true, true, monitor -> {
        setControl(composite);
        return !getWizard().getSelectedEntities().isEmpty();
import org.jkiss.dbeaver.ui.navigator.database.DatabaseObjectsSelectorPanel;
    protected PostgreFDWConfigWizardPageInput(PostgreFDWConfigWizard wizard)
 * You may obtain a copy of the License at
                databasesGroup,

 * Unless required by applicable law or agreed to in writing, software
    {

                    List<DBPDataSourceContainer> dataSources = getWizard().getAvailableDataSources();
import org.eclipse.jface.dialogs.IDialogConstants;
                protected boolean isFolderVisible(DBNLocalFolder folder) {
                    SelectDataSourceDialog dialog = new SelectDataSourceDialog(getShell(), selectorPanel.getProject(), null);
        setDescription("Choose which databases/tables you need to configure");
import org.jkiss.dbeaver.model.struct.DBSEntity;
            };
                    setErrorMessage("You can't select tables from different data sources");
                        selection.add(node);
                refreshDataSources();
                        getWizard().removeAvailableDataSource(((DBNDatabaseNode) selectedNode).getDataSourceContainer());

                }
        } catch (InvocationTargetException e) {
        }
import org.jkiss.dbeaver.ui.dialogs.ActiveWizardPage;
        getWizard().setSelectedEntities(selectedEntities);
                @Override
                delButton.setEnabled(selectedNode instanceof DBNDatabaseNode);

                }

                List<DBSEntity> proposedEntities = getWizard().getProposedEntities();
                protected void onSelectionChange(Object element) {
            if (node instanceof DBNDatabaseNode && ((DBNDatabaseNode) node).getObject() instanceof DBSEntity) {
package org.jkiss.dbeaver.ext.postgresql.tools.fdw;
 * See the License for the specific language governing permissions and
    }
        }
                    if (selectedNode instanceof DBNDatabaseNode) {
                    if (node != null) {
class PostgreFDWConfigWizardPageInput extends ActiveWizardPage<PostgreFDWConfigWizard> {
    @Override
                    DBNNode selectedNode = NavigatorUtils.getSelectedNode(selectorPanel.getSelection());

    @Override
    {
                    }
                protected boolean isDataSourceVisible(DBNDataSource dataSource) {
                        refreshDataSources();
import org.eclipse.swt.events.SelectionAdapter;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
                    updateState();
            });
                    selectedEntities.clear();
 *
        }
            }
                true,
                protected boolean isDatabaseObjectVisible(DBSObject obj) {
        getContainer().updateButtons();
    }

        setTitle("Configure foreign data wrappers");
        try {
            });
                dsContainer = nodeContainer;
            });
                for (DBSEntity entity : proposedEntities) {
                            refreshDataSources();
    public void activatePage() {
                @Override
                    }
/*
import org.eclipse.swt.widgets.Button;
            Button delButton = UIUtils.createDialogButton(buttonsPanel, "Remove database", new SelectionAdapter() {
 * distributed under the License is distributed on an "AS IS" BASIS,
        List<DBNDatabaseNode> selectedEntities = new ArrayList<>();
                if (dsContainer != null && dsContainer != nodeContainer) {
                @Override
            delButton.setEnabled(false);
                @Override
    private void refreshDataSources() {
    }

                    }
            DBWorkbench.getPlatformUI().showError("Collect data sources", "Error collecting available data sources", e);
                }
                    for (DBNDataSource ds : folder.getNestedDataSources()) {
                @Override
                            getWizard().addAvailableDataSource(dataSource);
                        DBPDataSourceContainer dataSource = dialog.getDataSource();
                DBNNode selectedNode = NavigatorUtils.getSelectedNode(event.getSelection());
                public void widgetSelected(SelectionEvent e) {
                        }
                            return true;
        updateState();
            UIUtils.createDialogButton(buttonsPanel, "Add database", new SelectionAdapter() {
    {
    private DatabaseObjectsSelectorPanel selectorPanel;

                        }
        super.activatePage();
        setWizard(wizard);
 * Copyright (C) 2010-2026 DBeaver Corp and others
 * limitations under the License.
        if (!selectedEntities.isEmpty()) {
    }
        selectorPanel.refreshNodes();
                }
                DBPDataSourceContainer nodeContainer = ((DBNDatabaseNode) node).getDataSourceContainer();
        if (!activated) {
                }

import java.util.List;
        super("Settings");
import java.lang.reflect.InvocationTargetException;


    }
                    }
                    if (dialog.open() == IDialogConstants.OK_ID) {
            // ignore
        }


            });
                        if (dataSource != null) {
import org.jkiss.dbeaver.ui.navigator.dialogs.SelectDataSourceDialog;
                    break;
        selectorPanel.setSelection(selection);
            Composite databasesGroup = UIUtils.createTitledComposite(composite, "Foreign databases", 1, GridData.FILL_BOTH);
        for (DBNNode node : selectorPanel.getCheckedNodes()) {
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.runtime.DBWorkbench;
        List<DBNNode> selection = new ArrayList<>();
            });
