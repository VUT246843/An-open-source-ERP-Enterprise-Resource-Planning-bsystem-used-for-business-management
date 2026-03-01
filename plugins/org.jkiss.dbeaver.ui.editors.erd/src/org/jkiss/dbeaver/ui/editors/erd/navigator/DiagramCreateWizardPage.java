import org.eclipse.swt.events.ModifyListener;
import org.jkiss.dbeaver.model.navigator.DBNDataSource;
import org.jkiss.dbeaver.runtime.DBWorkbench;
 *
        setTitle(ERDUIMessages.wizard_page_diagram_create_title);
                    }
                    DBSObject object = ((DBNDatabaseNode) element).getObject();
import org.eclipse.swt.SWT;
            {
            }
        viewer.setCheckStateProvider(new ICheckStateProvider() {
            GridData.FILL_BOTH
 * Licensed under the Apache License, Version 2.0 (the "License");
                updateState();
    private void updateState()
    }
			return false;


/*
        if (entitySelection != null) {
 * Unless required by applicable law or agreed to in writing, software
    }
            }
    {
import org.jkiss.dbeaver.ui.UIUtils;
    }
import java.util.Collection;
            public void modifyText(ModifyEvent e)
}
        boolean hasName = !CommonUtils.isEmpty(diagram.getName());
        this.diagram = diagram;
        this.entitySelection = entitySelection;

            @Override
import org.jkiss.dbeaver.model.rm.RMConstants;
import java.util.ArrayList;
        gd.heightHint = 400;

        contentLabel.setLayoutData(gd);
            placeholder,
            ERDUIMessages.wizard_page_diagram_create_group_settings,
import java.util.Collections;
import org.eclipse.jface.wizard.WizardPage;
        Composite configGroup = UIUtils.createTitledComposite(

    private DBPProject project;
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
import org.eclipse.jface.viewers.IStructuredSelection;
class DiagramCreateWizardPage extends WizardPage {

    @Override
		}
    	if (getErrorMessage() != null) {
            setErrorMessage("The user needs more permissions to create a new diagram.");
    }

        contentTree.setLayoutData(gd);
import org.eclipse.jface.viewers.CheckboxTreeViewer;
            public boolean isGrayed(Object element)
            }
        Composite placeholder = UIUtils.createPlaceholder(parent, 1);
    @Override

        return hasName;
        gd = new GridData(GridData.FILL_BOTH);
        }
        CheckboxTreeViewer viewer = (CheckboxTreeViewer) contentTree.getViewer();
			return Collections.emptyList();

import org.jkiss.code.Nullable;
        }
 * DBeaver - Universal Database Manager
import java.util.List;


import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
        final DBNProject rootNode = DBWorkbench.getPlatform().getNavigatorModel().getRoot().getProjectNode(project);
			return;
        final Text projectNameText = UIUtils.createLabelText(configGroup, "Name", null); //$NON-NLS-1$
    private EntityDiagram diagram;
    @Nullable
        List<DBNNode> nodes = new ArrayList<>();

        for (Object obj : contentTree.getCheckboxViewer().getCheckedElements()) {
import org.eclipse.swt.events.ModifyEvent;
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.eclipse.swt.layout.GridData;
        });
            public boolean isChecked(Object element)
        }
                if (element instanceof DBNDatabaseNode && !(element instanceof DBNDataSource)) {
    private IStructuredSelection entitySelection;
    {
            setErrorMessage("Set diagram name");
import org.eclipse.swt.widgets.Label;

 * distributed under the License is distributed on an "AS IS" BASIS,
        contentTree = new DatabaseNavigatorTree(configGroup, rootNode.getDatabases(), SWT.SINGLE | SWT.CHECK);
                return false;
        gd.horizontalSpan = 2;
 *     http://www.apache.org/licenses/LICENSE-2.0
        
        }
        super(ERDUIMessages.wizard_page_diagram_create_name);
import org.jkiss.dbeaver.ui.editors.erd.model.EntityDiagram;
    private DatabaseNavigatorTree contentTree;

            nodes.add(node);
        } else {
		}
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTree;
        if (project == null || !project.hasRealmPermission(RMConstants.PERMISSION_PROJECT_RESOURCE_EDIT)) {
            return false;
            setControl(placeholder);
    protected DiagramCreateWizardPage(EntityDiagram diagram, IStructuredSelection entitySelection, @Nullable DBPProject project)

import org.jkiss.dbeaver.model.app.DBPProject;
import org.jkiss.dbeaver.model.navigator.DBNProject;
    {
 * Copyright (C) 2010-2026 DBeaver Corp and others
        this.project = project;

        );
import org.jkiss.utils.CommonUtils;
            DBNNode node = (DBNNode)obj;
 * you may not use this file except in compliance with the License.
            {
                diagram.setName(projectNameText.getText());
import org.eclipse.swt.widgets.Text;
import org.eclipse.jface.viewers.ICheckStateProvider;
    }
                return true;
            {
 *
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;
package org.jkiss.dbeaver.ui.editors.erd.navigator;
    public void createControl(Composite parent)
            setErrorMessage(null);
 */
        GridData gd = new GridData(GridData.BEGINNING);
        if (!hasName) {
                    if (object instanceof DBSTable) {
    Collection<DBNNode> getInitialContent()
            viewer.setCheckedElements(entitySelection.toArray());
 * You may obtain a copy of the License at

    	if (contentTree == null) {
        if (rootNode == null) {
                        return false;
 * See the License for the specific language governing permissions and
            @Override
import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIMessages;
import org.eclipse.swt.widgets.Composite;
        return nodes;
		}

    public boolean isPageComplete()
            @Override
        getContainer().updateButtons();
            viewer.setSelection(entitySelection, true);
    {
        gd.horizontalSpan = 2;
    {
            2,
import org.jkiss.dbeaver.model.navigator.DBNNode;
        projectNameText.addModifyListener(new ModifyListener() {
                }
        });
        setDescription(ERDUIMessages.wizard_page_diagram_create_description);
        setControl(placeholder);
        Label contentLabel = UIUtils.createControlLabel(configGroup, ERDUIMessages.wizard_page_diagram_create_label_init_content);
