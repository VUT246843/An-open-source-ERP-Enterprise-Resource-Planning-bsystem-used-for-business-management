    }
    }
                        };
                                if (!table.isDisposed()) {
            GridData gd1 = new GridData(SWT.BEGINNING, SWT.CENTER, true, false);
            gd.heightHint = 150;
import org.jkiss.dbeaver.ui.editors.DatabaseEditorUtils;
    }

            if (CommonUtils.isNotEmpty(loginedUser)) {
import org.eclipse.core.runtime.IStatus;
            protected IStatus run(@NotNull DBRProgressMonitor monitor) {
            Text t = UIUtils.createLabelText(container, "Password ", "", SWT.BORDER | SWT.PASSWORD);
import org.jkiss.dbeaver.DBException;
    private Text name;
                                    editor.loadGroups();

                    cubridUsers = user.getDataSource().getCubridPrivilages(monitor);
 * you may not use this file except in compliance with the License.
            gd1.heightHint = 3 * t.getLineHeight();
    @Override
                                command.setNewValue(values);
                                        item.setText(0, privilage.getName());
    @Override
 * See the License for the specific language governing permissions and
    private boolean loaded;
import org.jkiss.dbeaver.ui.DBeaverIcons;

import org.eclipse.swt.widgets.TableItem;
    private List<String> groups = new ArrayList<>();
            ControlPropertyCommandListener.create(this, t, CubridPrivilageHandler.DESCRIPTION);
 *
                    });

import org.eclipse.swt.widgets.Text;
    protected class UserPageControl extends ObjectEditorPageControl
                                editor.updateChangeCommand(command, commandReflector);
import java.util.ArrayList;
                try {
            this.editor = editor;
                                if (!table.isDisposed()) {
        }.schedule();
                t.setEditable(allowEditPassword);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            table.setEnabled(false);
    }
                        } else {
import org.jkiss.dbeaver.ext.cubrid.model.CubridPrivilage;
        }
    }
public class CubridPrivilageEditor extends AbstractDatabaseObjectEditor<CubridPrivilage>
            GridData gd1 = new GridData();
                            }
    private CubridPrivilage user;
    }
                                }
        pageControl.createProgressPanel();
                                    values = new ArrayList<String>(oldValue);
                return Status.OK_STATUS;

                            }


                                values.removeIf(value -> value == item.getText());
            contributionManager.add(new Separator());
            gd1.widthHint = 400;
    public void setFocus() {
                                        if (user.getRoles().contains(privilage.getName())) {

    public boolean isSaveAsAllowed() {
        final private Table widget;
import org.jkiss.dbeaver.ext.cubrid.ui.config.CubridPrivilageHandler;
                    // TODO Auto-generated catch block
                            }

 * You may obtain a copy of the License at
                DatabaseEditorUtils.contributeStandardEditorActions(workbenchSite, contributionManager);
            addEventListener();
                            public void undoCommand(@NotNull DBECommandProperty<CubridPrivilage> cp) {
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
                                editor.removeChangeCommand(command);
    @Override
        public TableCommandListener(CubridPrivilageEditor editor, Table widget, CubridPrivilageHandler handler, List<String> oldValue) {
import org.eclipse.swt.layout.GridData;
                            if (item.getChecked()) {
                                            groups.add(privilage.getName());
        {
                                        }
    {
            GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        }
    public void createPartControl(Composite parent) {
        }
}            loadGroups();
import org.jkiss.dbeaver.ui.UIUtils;
            GridData gd1 = new GridData();
                                command = null;
            t.setLayoutData(gd1);
 * Copyright (C) 2010-2025 DBeaver Corp and others
        }
            this.widget = widget;
                        if (values == null) {
import org.jkiss.dbeaver.model.DBIcon;
        if (getDatabaseObject().isPersisted()) {
            }
        }
            gd.widthHint = 390;
            table = new Table(container, SWT.BORDER | SWT.CHECK);
 *

                                        item.setImage(DBeaverIcons.getImage(DBIcon.TREE_USER_GROUP));
        }
import org.eclipse.jface.action.Separator;
    private void loadGroups() {
                                        TableItem item = new TableItem(table, SWT.BREAK);
                    UIUtils.syncExec(

            }
        private List<String> values;
                        }
/*

        }
import org.jkiss.dbeaver.ui.editors.AbstractDatabaseObjectEditor;
import org.eclipse.swt.widgets.Table;
            GridData gd = new GridData();
        }
                        {
                            }
    private Table table;
            name.setEditable(false);
import org.eclipse.swt.SWT;
                boolean allowEditPassword = user.getDataSource().isDBAGroup();
            new TableCommandListener(this, table, CubridPrivilageHandler.GROUPS, groups);
                                for (CubridPrivilage privilage : cubridUsers) {
        new AbstractJob("Load groups")
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                                }
            Text t = UIUtils.createLabelText(container, "Description", user.getDescription(), SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL);
                        if (command == null) {
        }
    public void activatePart() {
import java.util.List;
        if (loaded) {
            name = UIUtils.createLabelText(container, "Name ", user.getName(), SWT.BORDER, new GridData(GridData.FILL_HORIZONTAL));
                                    }
import org.jkiss.dbeaver.model.navigator.DBNEvent;
            gd1.widthHint = 400;
            UIUtils.createControlLabel(container, "Groups", 1);
{
    private class TableCommandListener
        this.user = this.getDatabaseObject();
import org.eclipse.core.runtime.Status;
        final private CubridPrivilageHandler handler;
                            () -> {
                } catch (DBException e) {
                                command = new DBECommandProperty<CubridPrivilage>(editor.getDatabaseObject(), handler, oldValue, values);
        container.setLayoutData(gds);
import org.jkiss.dbeaver.ui.editors.ControlPropertyCommandListener;

        {
 * DBeaver - Universal Database Manager
    UserPageControl pageControl;
        Composite container = UIUtils.createPlaceholder(pageControl, 2, 10);

            gd.heightHint = 30;
            loaded = false;

                                    editor.loadGroups();
        if (pageControl != null) {
import org.jkiss.code.NotNull;
        return true;
        pageControl = new UserPageControl(parent, this);
        GridData gds = new GridData(GridData.FILL_BOTH);
                        }
            widget.addListener(
            this.pageControl.setFocus();
        private DBECommandProperty<CubridPrivilage> command;
        private List<String> oldValue;
                        TableItem item = (TableItem) event.item;
                                editor.addChangeCommand(command, commandReflector);

            table.setLayoutData(gd);
            ControlPropertyCommandListener.create(this, name, CubridPrivilageHandler.NAME);
import org.jkiss.utils.CommonUtils;
                            @Override
import org.jkiss.dbeaver.model.edit.DBECommandReflector;
package org.jkiss.dbeaver.ext.cubrid.ui.editors;

 * Unless required by applicable law or agreed to in writing, software
                    e.printStackTrace();
            String loginedUser = user.getDataSource().getContainer().getConnectionConfiguration().getUserName();
import org.jkiss.dbeaver.ui.controls.ObjectEditorPageControl;
                            if (CommonUtils.equalObjects(values, oldValue)) {
        private void addEventListener() {
import org.eclipse.swt.widgets.Composite;
                List<CubridPrivilage> cubridUsers;
            }
            IWorkbenchSite workbenchSite = getSite();
 * Licensed under the Apache License, Version 2.0 (the "License");
            gd1.widthHint = 400;
                }
                            @Override
            ControlPropertyCommandListener.create(this, t, CubridPrivilageHandler.PASSWORD);
                    SWT.Selection,
                                table.removeAll();
 * limitations under the License.
                            public void redoCommand(@NotNull DBECommandProperty<CubridPrivilage> command) {

                                values.add(item.getText());

    }
                                            item.setChecked(true);
                        }
        @Override
        public void fillCustomActions(IContributionManager contributionManager) {
            return RefreshResult.REFRESHED;
            super.fillCustomActions(contributionManager);
                                groups.clear();
 *
                            });

            this.oldValue = oldValue;
            @Override
import org.eclipse.jface.action.IContributionManager;
    }

                                    if (privilage.isPersisted() && !privilage.getName().equals(user.getName())) {
        if (force || !loaded || (source instanceof DBNEvent && ((DBNEvent) source).getAction() == DBNEvent.Action.UPDATE)) {

 * distributed under the License is distributed on an "AS IS" BASIS,
        return RefreshResult.IGNORED;
        loaded = true;
        activatePart();
        }
                            values = new ArrayList<>(oldValue);
            return;
import org.eclipse.ui.IWorkbenchSite;
        {
    public RefreshResult refreshPart(Object source, boolean force) {
            this.handler = handler;
                            } else {
            if (workbenchSite != null) {
            super(parent, SWT.NONE, object);
    @Override
            t.setLayoutData(gd1);

        }
import org.jkiss.dbeaver.model.runtime.AbstractJob;
        {
            activatePart();

    {
        final private CubridPrivilageEditor editor;
        public UserPageControl(Composite parent, CubridPrivilageEditor object) {
import org.jkiss.dbeaver.model.edit.prop.DBECommandProperty;
            name.setLayoutData(gd1);
                            if (!CommonUtils.equalObjects(values, oldValue)) {
                                }
    @Override
                                    values = new ArrayList<String>(oldValue);
                            }
        {
        loaded = true;
                    event -> {


            @NotNull
                        DBECommandReflector<CubridPrivilage, DBECommandProperty<CubridPrivilage>> commandReflector = new DBECommandReflector<CubridPrivilage, DBECommandProperty<CubridPrivilage>>()
                            } else {
                        if (item != null) {
