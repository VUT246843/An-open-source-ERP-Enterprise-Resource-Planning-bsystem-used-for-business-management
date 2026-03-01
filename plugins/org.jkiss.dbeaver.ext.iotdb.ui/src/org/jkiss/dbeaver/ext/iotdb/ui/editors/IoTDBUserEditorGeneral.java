                    if (user == null) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                final int type = event.detail;

        GridData gd = new GridData(GridData.FILL_BOTH);
        }

    }
        {
        container.setLayoutData(gd);
            pageControl.createLoadVisualizer()
import org.jkiss.dbeaver.model.navigator.DBNEvent;
                    IoTDBUiMessages.editors_user_editor_general_group_login, 2, GridData.FILL_HORIZONTAL);
import org.jkiss.dbeaver.ext.iotdb.model.IoTDBRelationalUser;
                public void completeLoading(List<IoTDBPrivilege> privileges) {

            privilegesTable = new PrivilegeTableControl(container, IoTDBUiMessages.editors_user_editor_general_control_dba_privileges);
                        @Override
                        return null;
    @Override
            },
            return RefreshResult.REFRESHED;
        pageControl = new PageControl(parent);
                        }
    protected void processGrants(List<IoTDBGrant> grants) {
        }
            super(parent);
import org.jkiss.dbeaver.ext.iotdb.ui.controls.PrivilegeTableControl;
public class IoTDBUserEditorGeneral extends IoTDBUserEditorAbstract {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                            // no-op
import org.eclipse.swt.widgets.Composite;
                executionContext
 *
    @Override
                    });

            return new ProgressVisualizer<List<IoTDBPrivilege>>() {


package org.jkiss.dbeaver.ext.iotdb.ui.editors;
import org.eclipse.swt.layout.GridData;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
 *
                    return user.getDataSource().getPrivilegesByKind(true).stream().toList();

    }
        Composite container = UIUtils.createPlaceholder(pageControl, 2, 5);

                @Override
                        public void redoCommand(@NotNull IoTDBCommandGrantPrivilege command) {
        }
    public RefreshResult refreshPart(Object source, boolean force) {

/*
                final IoTDBPrivilege privilege = (IoTDBPrivilege) event.data;
    @Override
    private PageControl pageControl;
                }
import org.jkiss.dbeaver.ext.iotdb.model.IoTDBPrivilege;
            return;
            Composite loginGroup = UIUtils.createTitledComposite(container,
import org.jkiss.dbeaver.ext.iotdb.ui.config.IoTDBCommandGrantPrivilege;
        {
                    super.completeLoading(privileges);
                    IoTDBUiMessages.editors_user_editor_general_label_user_name, getDatabaseObject().getName());
                IoTDBUiMessages.editors_user_editor_general_service_load_catalog_privileges,
import org.jkiss.dbeaver.ui.UIUtils;
        public ProgressVisualizer<List<IoTDBPrivilege>> createLoadVisualizer() {
                    new IoTDBCommandGrantPrivilege(getDatabaseObject(), type, "", "", privilege),

        privilegesTable.fillGrants(grants);
        pageControl.createProgressPanel();
import org.jkiss.dbeaver.ext.iotdb.model.IoTDBGrant;
                @Override
                    IoTDBRelationalUser user = getDatabaseObject();
    }
    private PrivilegeTableControl privilegesTable;

        // DBA Privileges
 * See the License for the specific language governing permissions and
    private boolean isLoaded;

                            // no-op
        if (isLoaded) {
 */
                        public void undoCommand(@NotNull IoTDBCommandGrantPrivilege command) {

        }
                    privilegesTable.fillPrivileges(privileges);
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.swt.widgets.Text;
        // Login -> User Name
            };

 *     http://www.apache.org/licenses/LICENSE-2.0
            activatePart();
    @Override
            ) {


        public PageControl(Composite parent) {

import org.jkiss.dbeaver.model.exec.DBCExecutionContext;

    public void createPartControl(Composite parent) {
            isLoaded = false;
            gd = new GridData(GridData.FILL_BOTH);
            privilegesTable.addListener(SWT.Modify, event -> {
}
 * you may not use this file except in compliance with the License.
            return;
import org.jkiss.dbeaver.model.edit.DBECommandReflector;
import java.lang.reflect.InvocationTargetException;
 * DBeaver - Universal Database Manager
                }
                public List<IoTDBPrivilege> evaluate(@NotNull DBRProgressMonitor monitor) throws InvocationTargetException {
import java.util.List;
        if (executionContext == null) {
                        @Override
        LoadingJob.createService(
        DBCExecutionContext executionContext = getExecutionContext();
        return pageControl;
        }
        }
                addChangeCommand(
            });
 *
 * You may obtain a copy of the License at
        isLoaded = true;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        }
                        isLoaded = false;
            Text userNameText = UIUtils.createLabelText(loginGroup,
    public void activatePart() {
            new DatabaseLoadService<>(
        return RefreshResult.IGNORED;
        ).schedule();
    }
import org.jkiss.dbeaver.ext.iotdb.ui.internal.IoTDBUiMessages;
import org.jkiss.dbeaver.ui.LoadingJob;
    }
                        }
            userNameText.setEditable(false);
                    loadGrants();
 * limitations under the License.
                    }
            privilegesTable.setLayoutData(gd);

import org.jkiss.code.NotNull;
    protected PageControl getPageControl() {
            gd.horizontalSpan = 2;
import org.eclipse.swt.SWT;
        if (force || (source instanceof DBNEvent && ((DBNEvent) source).getSource() == DBNEvent.UPDATE_ON_SAVE) || !isLoaded) {
 * Copyright (C) 2010-2026 DBeaver Corp and others
    }
    private class PageControl extends UserPageControl {
import org.jkiss.dbeaver.model.runtime.load.DatabaseLoadService;
                    new DBECommandReflector<IoTDBRelationalUser, IoTDBCommandGrantPrivilege>() {
