    @Override
        super(trigger.getDataSource(), DBSEntityType.TRIGGER);
    protected Control createPageContents(Composite parent) {
 */
    }
import org.jkiss.dbeaver.ext.postgresql.model.PostgreProcedure;
                    if (node instanceof DBNDatabaseNode
                }
    public void addExtraCombo(Composite parent) {
    }
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
                        selectedFunction = (PostgreProcedure) ((DBNDatabaseNode) node).getObject();
        UIUtils.asyncExec(functionCombo::layout);
                    return ((PostgreProcedure) element).getFullQualifiedSignature();
                        : navigatorModel.getNodeByObject(selectedFunction);
                        new Class[]{ PostgreProcedure.class }, null);
import org.eclipse.jface.viewers.LabelProvider;
                public String getText(Object element) {
        // On macOS, the combo's down arrow is not shown unless you manually resize the page. The solution is to call layout()
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.dbeaver.ui.controls.CSmartSelector;

            }
 * You may obtain a copy of the License at
                    DBNNode node = DBWorkbench.getPlatformUI().selectObject(parent.getShell(),
                }
        addExtraCombo(pageContents);
 * limitations under the License.
        return trigger;
                        updatePageState();

 *     http://www.apache.org/licenses/LICENSE-2.0
        UIUtils.createControlLabel(pageContents, PostgreMessages.dialog_trigger_edit_page_label_trigger_function);
import org.jkiss.dbeaver.model.struct.DBSInstance;
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        @Override
    private final PostgreTriggerBase trigger;
        private final Composite parent;
        // Do nothing
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
/*
 *

    PostgreTriggerEditPage(PostgreTriggerBase trigger) {
 * Licensed under the Apache License, Version 2.0 (the "License");

 *
import org.jkiss.dbeaver.model.navigator.DBNModel;
    public DBSObject getObject() {
}
        PostgreProcedureSelector(Composite pageContents, Composite parent) {
                    return DBeaverIcons.getImage(DBIcon.TREE_PROCEDURE);

                        functionCombo.removeAll();
import org.eclipse.swt.widgets.Control;
    }
                if (dsNode != null) {
                    }
                    if (element == null) {
    }
import org.jkiss.dbeaver.model.struct.DBSObject;
    private class PostgreProcedureSelector extends CSmartSelector<PostgreProcedure> {

                        functionCombo.addItem(selectedFunction);
            if (drop) {
import org.eclipse.swt.layout.GridData;
                    }

 *
    }
public class PostgreTriggerEditPage extends EntityEditPage {

import org.eclipse.swt.widgets.Composite;
import org.jkiss.dbeaver.model.navigator.DBNNode;
                public Image getImage(Object element) {
    private CSmartSelector<PostgreProcedure> functionCombo;
import org.jkiss.dbeaver.ui.editors.object.struct.EntityEditPage;
                }
                @Override

                    DBNNode curNode = selectedFunction == null ? null
        Composite pageContents = (Composite) super.createPageContents(parent);
import org.jkiss.dbeaver.model.struct.DBSEntityType;
        return pageContents;

                        && ((DBNDatabaseNode) node).getObject() instanceof PostgreProcedure) {
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.ui.DBeaverIcons;
                        PostgreMessages.dialog_trigger_edit_page_select_function_title, dsNode, curNode,

        }
                @Override
import org.jkiss.dbeaver.model.DBIcon;
            this.parent = parent;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTriggerBase;
        functionCombo = new PostgreProcedureSelector(pageContents, parent);
        this.trigger = trigger;
 * you may not use this file except in compliance with the License.
import org.eclipse.swt.graphics.Image;
        gd.widthHint = UIUtils.getFontHeight(functionCombo) * 30;
    @Override
        // https://github.com/dbeaver/dbeaver/issues/12651
        functionCombo.setLayoutData(gd);
                        new Class[]{ DBSInstance.class, DBSObjectContainer.class, PostgreProcedure.class },
                        functionCombo.select(selectedFunction);
package org.jkiss.dbeaver.ext.postgresql.ui.config;
    }
        protected void dropDown(boolean drop) {
            });

 * See the License for the specific language governing permissions and
    PostgreProcedure selectedFunction;
 * DBeaver - Universal Database Manager
                DBNModel navigatorModel = DBWorkbench.getPlatform().getNavigatorModel();
    @Override
        return super.isPageComplete() && selectedFunction != null;
import org.jkiss.dbeaver.ext.postgresql.PostgreMessages;


                        return "N/A";
            super(pageContents, SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY, new LabelProvider() {
    public boolean isPageComplete() {
                DBNDatabaseNode dsNode = navigatorModel.getNodeByObject(trigger.getDatabase());
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.swt.SWT;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
