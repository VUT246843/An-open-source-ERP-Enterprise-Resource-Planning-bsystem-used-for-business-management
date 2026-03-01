                    DBSEntityContainer.class.isAssignableFrom(childrenClass) ||
                }
    }

 * Unless required by applicable law or agreed to in writing, software
        DBNModel navigatorModel = project.getNavigatorModel();
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
            @Override
        this.runnableContext = runnableContext;
        return dialogArea;
                    }
        selectorPanel = new DatabaseObjectsSelectorPanel(
                return obj instanceof DBSStructContainer || obj instanceof DBSEntityContainer || obj instanceof DBSEntity;
                DBNDatabaseNode catalogNode = navigatorModel.getNodeByObject(new VoidProgressMonitor(), defaultCatalog, false);
    @Override
            @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
}
    private DatabaseObjectsSelectorPanel selectorPanel;
    public ScopeSelectorDialog(
            }
        super.okPressed();
    protected IDialogSettings getDialogBoundsSettings() {
import org.jkiss.dbeaver.model.struct.*;
    private final DBCExecutionContext executionContext;
        // Default root node is datasource
    protected Composite createDialogArea(@NotNull Composite parent) {
                        object instanceof DBSEntityContainer ||
                    DBSStructContainer.class.isAssignableFrom(childrenClass);

                return DBSEntity.class.isAssignableFrom(childrenClass) ||
                    ) {

import org.jkiss.dbeaver.ui.ai.internal.AIUIActivator;
        this.dataSourceContainer = container;
            this.runnableContext,
                if (catalogNode != null) {
 */
            }
                Class<? extends DBSObject> childrenClass = folder.getChildrenClass();
            DBSCatalog defaultCatalog = contextDefaults.getDefaultCatalog();
        @NotNull DBRRunnableContext runnableContext,
    protected void okPressed() {
import org.jkiss.code.NotNull;
                return true;
        // But if the datasource consists of databases which are isolated instance (e.g. PostgreSQL) then
    @Override

        DBNDatabaseNode finalRootNode = rootNode;
            protected DBPProject getSelectedProject() {
 *     http://www.apache.org/licenses/LICENSE-2.0
                    rootNode = catalogNode;

    }

            SWT.SINGLE | SWT.BORDER | SWT.CHECK,
        DBPProject project = dataSourceContainer.getProject();
import java.util.List;
        // too node is the default database (cross database queries are not supported in this cases)
        return UIUtils.getSettingsSection(AIUIActivator.getDefault().getDialogSettings(), DIALOG_ID);
        super(parentShell, "Select objects to include in completion scope", null);

                        return false;

 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
            @Override
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private final DBPDataSourceContainer dataSourceContainer;
                    return false;
        Composite dialogArea = super.createDialogArea(parent);
            protected boolean isDatabaseObjectVisible(DBSObject obj) {
            if (defaultCatalog instanceof DBSInstance) {
    public List<? extends DBNNode> getSelectedNodes() {
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
import org.jkiss.dbeaver.ui.navigator.database.DatabaseObjectsSelectorPanel;
import org.jkiss.dbeaver.model.navigator.DBNNode;
                    if (object instanceof DBSEntity ||
        };
        selectedNodes.removeIf(n -> selectedNodes.contains(n.getParentNode()));

 *
import org.jkiss.dbeaver.model.app.DBPProject;
        selectorPanel.setSelection(selectedNodes);
import org.jkiss.dbeaver.model.exec.DBCExecutionContextDefaults;
        UIUtils.createInfoLabel(dialogArea, "Define database metadata to send to AI");
        DBCExecutionContextDefaults<?,?> contextDefaults = executionContext.getContextDefaults();
 *
 * Copyright (C) 2010-2026 DBeaver Corp and others


        @NotNull List<? extends DBNNode> selectedNodes
        this.executionContext = executionContext;
        selectorPanel.checkNodes(selectedNodes, true);
import org.eclipse.swt.widgets.Shell;
            true
        return selectedNodes;
                    DBSObject object = dbn.getObject();
        }

 * distributed under the License is distributed on an "AS IS" BASIS,
            @Override

import org.eclipse.swt.widgets.Composite;
        this.selectedNodes = selectedNodes;
            }
        selectedNodes.removeIf(n -> {
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
package org.jkiss.dbeaver.ui.ai.controls;
import org.jkiss.dbeaver.model.navigator.DBNDatabaseFolder;

        selectorPanel.getCheckboxTreeManager().setAutoCheckNested(false);
            });
    private final DBRRunnableContext runnableContext;
    }

/*
                }
        @NotNull Shell parentShell,

import org.eclipse.jface.dialogs.IDialogSettings;
        DBNDatabaseNode rootNode = navigatorModel.getNodeByObject(dataSourceContainer);
import org.jkiss.dbeaver.ui.UIUtils;
        @NotNull DBCExecutionContext executionContext,

import org.jkiss.dbeaver.model.struct.rdb.DBSCatalog;
            dialogArea,
    }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    @Override
        ) {
    private static final String DIALOG_ID = "DBeaver.AIScopeSelectorDialog";//$NON-NLS-1$
    private List<? extends DBNNode> selectedNodes;
                return project;

import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
 * you may not use this file except in compliance with the License.
 *
 * limitations under the License.
 * DBeaver - Universal Database Manager
        selectorPanel.getNavigatorTree().getViewer().expandToLevel(2);
        @NotNull DBPDataSourceContainer container,
        if (contextDefaults != null && false) {
import org.jkiss.dbeaver.model.navigator.DBNModel;
import org.eclipse.swt.SWT;
    ) {

public class ScopeSelectorDialog extends BaseDialog {
                if (n instanceof DBNDatabaseNode dbn) {
        selectedNodes = selectorPanel.getCheckedNodes();
            }
                }
                if (childrenClass == null) {

            protected boolean isDatabaseFolderVisible(DBNDatabaseFolder folder) {
 * See the License for the specific language governing permissions and
                        object instanceof DBSStructContainer
                return finalRootNode;
            }
            protected DBNNode getRootNode() {
    @NotNull
