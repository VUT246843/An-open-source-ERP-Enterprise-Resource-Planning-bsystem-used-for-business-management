    public void checkPrivilege(MySQLPrivilege privilege, boolean grant)
    }
                        boolean withGrantOption = false;

    private static class MySQLObjectPrivilege {
        tableViewer = new TableViewer(privsGroup, SWT.BORDER | SWT.UNDERLINE_SINGLE | SWT.V_SCROLL | SWT.H_SCROLL | SWT.FULL_SELECTION);
        private boolean enabled;
            }
                if (element instanceof MySQLObjectPrivilege) {
import org.eclipse.swt.layout.GridData;
        UIUtils.createPushButton(buttonsPanel, MySQLUIMessages.controls_privilege_table_push_button_clear_all, null, new SelectionAdapter() {
                return true;
            }

        private final MySQLPrivilege privilege;
        columnsController.addColumn(MySQLUIMessages.controls_privilege_table_column_privilege_name, MySQLUIMessages.controls_privilege_table_column_privilege_name_tip, SWT.LEFT, true, true, new CellLabelProvider() {
                dataSource,
                }
            @Override
        drawColumns(currentPrivileges);
    }
        }
        columnsController.addBooleanColumn(MySQLUIMessages.controls_privilege_table_column_privilege_status, MySQLUIMessages.controls_privilege_table_column_privilege_status_tip, SWT.CENTER, true, true, item -> {

        for (MySQLPrivilege privilege : privileges) {
 * DBeaver - Universal Database Manager
        super.notifyListeners(SWT.Modify, event);

                        notifyPrivilegeCheck(userPrivilege.privilege, false, false);

 *

import org.eclipse.swt.widgets.Event;
        for (MySQLObjectPrivilege basePrivilege : currentPrivileges) {
        UIUtils.createPushButton(buttonsPanel, MySQLUIMessages.controls_privilege_table_push_button_check_all, null, new SelectionAdapter() {
                        // WITH GRANT OPTION is enabled only in this case
        privTable.setLayoutData(gd);

        if (CommonUtils.isEmpty(privileges)) {
 * Privilege table control
        boolean hasGrantOption = false;
        gl.horizontalSpacing = 0;
        event.detail = withGrantOption ? 2 : checked ? 1 : 0;
            public void update(ViewerCell cell) {
    }
        buttonsPanel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                }
            }
                "To give to other users those privileges you possess",
            }
public class PrivilegeTableControl extends Composite {
            }

            }
            }

        gl.marginHeight = 0;
            protected CellEditor getCellEditor(Object element) {
                        userPrivilege.enabled = true;
    public void fillPrivileges(@NotNull List<MySQLPrivilege> privs) {
        }
                    if (elementPriv.enabled != Boolean.TRUE.equals(value)) { // handle double click on the box cell
import org.eclipse.swt.SWT;

            protected void setValue(Object element, Object value) {
        tableViewer.setContentProvider(new ListContentProvider());
                hasGrantOption = true;
        Composite buttonsPanel = UIUtils.createComposite(privsGroup, 3);
                Object element = cell.getElement();
 * limitations under the License.
                    break;
    }
            for (MySQLGrant grant : grants) {
                drawColumns(currentPrivileges);
            }
        gd = new GridData(GridData.FILL_BOTH);
                break;
        drawColumns(currentPrivileges);
        });
            this.privilege = privilege;
 * Copyright (C) 2010-2026 DBeaver Corp and others
            public void update(ViewerCell cell) {
        }
        }
    public PrivilegeTableControl(Composite parent, String title, boolean isStatic)
        event.widget = this;
        });
        if (CommonUtils.isEmpty(grants)) {
    private final TableViewer tableViewer;
            if (privilege.getName().equalsIgnoreCase(MySQLConstants.PRIVILEGE_GRANT_OPTION_NAME)) {
/*
                        notifyPrivilegeCheck(userPrivilege.privilege, true, false);
import org.jkiss.code.NotNull;
 * See the License for the specific language governing permissions and
                for (MySQLObjectPrivilege userPrivilege : CommonUtils.safeCollection(currentPrivileges)) {
        });
                    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
                currentPrivileges.add(new MySQLObjectPrivilege(privilege, false));
        }, new EditingSupport(tableViewer) {
                Object element = cell.getElement();
import org.eclipse.swt.widgets.Table;

 * Unless required by applicable law or agreed to in writing, software

            @Override

        if (!hasGrantOption) {
            @Override
import java.util.List;
                } else if (grant.isAllPrivileges() || ArrayUtils.contains(grant.getPrivileges(), privilege)) {

    private List<MySQLPrivilege> privileges;
                        break;
import org.eclipse.swt.layout.GridLayout;
import org.jkiss.dbeaver.ext.mysql.MySQLConstants;
        this.isStatic = isStatic;
            {
            this.enabled = enabled;
            }
            // Add "With Grant Option" manually. We will use this option to expand grant statements on the "WITH GRANT STATEMENT" string
        GridLayout gl = new GridLayout(1, false);
    private void notifyPrivilegeCheck(MySQLPrivilege privilege, boolean checked, boolean withGrantOption) {
        });
                    if (!userPrivilege.enabled) {
    }
            protected Object getValue(Object element) {
                MySQLConstants.PRIVILEGE_GRANT_OPTION_NAME,
package org.jkiss.dbeaver.ext.mysql.ui.controls;
            @Override
                        }
import org.jkiss.dbeaver.ext.mysql.model.MySQLDataSource;
 *

import org.jkiss.dbeaver.ui.controls.ViewerColumnController;
            if (!CommonUtils.isEmpty(privileges)) {
import org.jkiss.utils.ArrayUtils;
                    cell.setText(((MySQLObjectPrivilege) element).privilege.getName());

 */
            privileges.add(new MySQLPrivilege(
                    return ((MySQLObjectPrivilege) element).enabled;
    private final boolean isStatic;
                }

}
            drawColumns(currentPrivileges);

    {
            if (item instanceof MySQLObjectPrivilege) {
    }
        // Other Privileges table must be disabled if table is in focus

            {
            MySQLDataSource dataSource = null;
                    if (userPrivilege.enabled) {
 * You may obtain a copy of the License at
                if (element instanceof MySQLObjectPrivilege) {
                return ((MySQLObjectPrivilege) item).enabled;
                    cell.setText(((MySQLObjectPrivilege) element).privilege.getDescription());

        columnsController.createColumns(false);


                }
        currentPrivileges = new ArrayList<>();
import org.eclipse.jface.viewers.*;
        gd.horizontalSpan = 2;
                if (privilege.getName().equalsIgnoreCase(MySQLConstants.PRIVILEGE_GRANT_OPTION_NAME)) {
    private final Table privTable;
        privTable.setHeaderVisible(true);
            @Override
                        userPrivilege.enabled = false;
                if (isStatic && !grant.isStatic()) {
                        if (elementPriv.enabled && elementPriv.privilege.getName().equals(MySQLConstants.PRIVILEGE_GRANT_OPTION_NAME)) {
                }
    }
        }
        columnsController = new ViewerColumnController<>("MySQLPrivilegesEditor", tableViewer); //$NON-NLS-1$
            protected boolean canEdit(Object element) {
                    }
                    privilegeEnabled = true;
            return false;
                    if (grant.isGrantOption()) {
                "Databases,Tables,Functions,Procedures",
                for (MySQLObjectPrivilege userPrivilege : CommonUtils.safeCollection(currentPrivileges)) {
                }
            }
        MySQLObjectPrivilege(MySQLPrivilege privilege, boolean enabled) {
            if (basePrivilege.privilege == privilege) {

import org.jkiss.dbeaver.ext.mysql.ui.internal.MySQLUIMessages;
                        notifyPrivilegeCheck(elementPriv.privilege, elementPriv.enabled, withGrantOption);
            @Override
                    }
        GridData gd = (GridData) privsGroup.getLayoutData();
            @Override
import org.jkiss.dbeaver.ext.mysql.model.MySQLPrivilege;
import org.jkiss.dbeaver.ui.controls.CustomCheckboxCellEditor;
            privilegeEnabled = false;
import java.util.ArrayList;
            for (MySQLPrivilege privilege : privileges) {
        gd.minimumWidth = 300;

                        elementPriv.enabled = Boolean.TRUE.equals(value);
import org.jkiss.dbeaver.ui.UIUtils;
                currentPrivileges.add(new MySQLObjectPrivilege(privilege, true));
            public void widgetSelected(SelectionEvent e)
            } else {
import org.jkiss.dbeaver.ui.controls.ListContentProvider;
            public void widgetSelected(SelectionEvent e)
        gl.marginWidth = 0;
                }
                }
                currentPrivileges.add(new MySQLObjectPrivilege(privilege, false));
            }
        privTable.setEnabled(editable);
            }
        gl.verticalSpacing = 0;
        super(parent, SWT.NONE);
        tableViewer.setInput(objects);
 *     http://www.apache.org/licenses/LICENSE-2.0
            return;
        fillGrants(grants);
                            withGrantOption = true;

    private void drawColumns(List<?> objects) {

import org.eclipse.swt.events.SelectionEvent;
        columnsController.addColumn(MySQLUIMessages.controls_privilege_table_column_privilege_description, MySQLUIMessages.controls_privilege_table_column_privilege_description_tip, SWT.LEFT, true, true, new CellLabelProvider() {
        tableViewer.refresh();
 * distributed under the License is distributed on an "AS IS" BASIS,
                basePrivilege.enabled = grant;
        setLayout(gl);

            }
    public void fillGrants(List<MySQLGrant> grants) {
                if (element instanceof MySQLObjectPrivilege) {
        boolean privilegeEnabled;
    {

        Composite privsGroup = UIUtils.createTitledComposite(this, title, 1, GridData.FILL_BOTH);
 * you may not use this file except in compliance with the License.
/**
            // Create simple privileges list
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return;
        });

                        privilegeEnabled = true;
                    continue;
        privTable = tableViewer.getTable();
import org.jkiss.dbeaver.ext.mysql.model.MySQLGrant;
        columnsController.repackColumns();
    }
            @Override
    private final ViewerColumnController<Object, Object> columnsController;
import org.eclipse.swt.events.SelectionAdapter;

                dataSource = (MySQLDataSource) privileges.getFirst().getDataSource();
        event.data = privilege;
        }
        privileges.removeIf(p -> p.getName().equals(MySQLConstants.PRIVILEGE_USAGE_NAME));
            }
                if (element instanceof MySQLObjectPrivilege elementPriv) {
            }
                drawColumns(currentPrivileges);
import org.jkiss.utils.CommonUtils;
                return new CustomCheckboxCellEditor(tableViewer.getTable(), true);
                return false;


    private List<MySQLObjectPrivilege> currentPrivileges = new ArrayList<>();
                MySQLPrivilege.Kind.DDL));

        for (MySQLPrivilege privilege : privileges) {
 */
        privTable.setLinesVisible(true);
        // Remove the "Usage" privilege - it has no real privileges.

            if (privilegeEnabled) {
        Event event = new Event();
    public void fillGrants(List<MySQLGrant> grants, boolean editable) {

import org.eclipse.swt.widgets.Composite;
        }
        this.privileges = new ArrayList<>(privs);
                    }
