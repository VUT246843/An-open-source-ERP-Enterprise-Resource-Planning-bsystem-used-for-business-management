                IoTDBUiMessages.controls_privilege_table_column_privilege_grant_tip,
    private List<IoTDBPrivilege> privileges;
 * Unless required by applicable law or agreed to in writing, software
            @Override
     * Fill grants to Privileges Tables
        if (CommonUtils.isEmpty(grants)) {
        columnsController = new ViewerColumnController<>("IoTDBPrivilegesEditor", tableViewer); //$NON-NLS-1$
public class PrivilegeTableControl extends Composite {
                    if (elementPriv.withGrantOption != Boolean.TRUE.equals(value)) {
    private void addPrivilegeEnabledColumn() {
        }, new EditingSupport(tableViewer) {


                    notifyPrivilegeCheck(userPrivilege.privilege, true, true, true);
     * 0 0 --> 1 0, 1 1
                Object element = cell.getElement();
                if (element instanceof IoTDBObjectPrivilege) {
        gd.horizontalSpan = 2;
                    notifyPrivilegeCheck(elementPriv.privilege, prevC, prevC, newG);
            }
     * Fill privileges to class variable
            @Override

import org.eclipse.swt.widgets.Composite;
        });
                drawColumns(currentPrivileges);
                if (element instanceof IoTDBObjectPrivilege) {
            for (IoTDBGrant grant : grants) {
                return false;
        private IoTDBPrivilege privilege;
                for (IoTDBObjectPrivilege userPrivilege : CommonUtils.safeCollection(currentPrivileges)) {

import org.jkiss.dbeaver.ui.UIUtils;

            }
            return false;
            }
                if (element instanceof IoTDBObjectPrivilege) {
        addPrivilegeEnabledColumn();
import org.jkiss.dbeaver.ui.controls.CustomCheckboxCellEditor;
                    userPrivilege.enabled = true;
package org.jkiss.dbeaver.ext.iotdb.ui.controls;
                if (ArrayUtils.contains(grant.getPrivileges(), privilege)) {


            @Override
            protected Object getValue(Object element) {
import java.util.ArrayList;
     *


 */
                return true;
                    }
        tableViewer.setContentProvider(new ListContentProvider());

            this.enabled = enabled;
            @Override
        columnsController.addColumn(
                    cell.setText(((IoTDBObjectPrivilege) element).privilege.getName());
import org.eclipse.swt.widgets.Table;
            }
            public void widgetSelected(SelectionEvent e) {
        event.widget = this;
        super(parent, SWT.NONE);
        initColumns();
    }
 * you may not use this file except in compliance with the License.

     */
    private static class IoTDBObjectPrivilege {
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
    }
     * 0 0 --> 1 1, 1 0 --> 1 1 grant with option [2]
        gl.verticalSpacing = 0;
    public void fillGrants(List<IoTDBGrant> grants) {
import org.jkiss.dbeaver.ui.controls.ViewerColumnController;
                }
                return new CustomCheckboxCellEditor(tableViewer.getTable(), true);
    }

            }
    }
        }
                if (element instanceof IoTDBObjectPrivilege) {
            }
                return false;
    private List<IoTDBObjectPrivilege> currentPrivileges = new ArrayList<>();
     * 1 1 --> 1 0 revoke grant [0]
                    }
import org.eclipse.swt.events.SelectionAdapter;
    }
     *
            }
        Composite privsGroup = UIUtils.createTitledComposite(this, title, 1, GridData.FILL_BOTH);
    }
            @Override
        addPrivilegeNameColumn();

        currentPrivileges = new ArrayList<>();
    }

        setLayout(gl);
                }
        });
                    }
        super.notifyListeners(SWT.Modify, event);
        addPrivilegeGrantColumn();
 * See the License for the specific language governing permissions and
        Event event = new Event();
    private void addPrivilegeGrantColumn() {
            }
        tableViewer.refresh();
     * --------------------
                IoTDBUiMessages.controls_privilege_table_column_privilege_name_tip,
     * @param withGrantOption boolean
    private ViewerColumnController<Object, Object> columnsController;
        });
                    return ((IoTDBObjectPrivilege) element).enabled;

        } else if (!checked && !withGrantOption) {
                SWT.LEFT, true, true, new CellLabelProvider() {
            public void update(ViewerCell cell) {
import org.jkiss.dbeaver.ui.controls.ListContentProvider;
            }
                    userPrivilege.enabled = false;
                            elementPriv.withGrantOption = false;
            }
                if (element instanceof IoTDBObjectPrivilege) {
                    IoTDBObjectPrivilege elementPriv = (IoTDBObjectPrivilege) element;
        privTable.setHeaderVisible(true);
     * @param privilege IoTDBPrivilege

            return;
import org.jkiss.dbeaver.ext.iotdb.ui.internal.IoTDBUiMessages;
        this.privileges = new ArrayList<>(tempPrivileges);
/*

     * Notify privilege check
            @Override
import org.eclipse.jface.viewers.*;
 *
            @Override
 * limitations under the License.
        columnsController.addBooleanColumn(
import org.eclipse.swt.layout.GridData;
        boolean privilegeEnabled;
import org.eclipse.swt.events.SelectionEvent;
                IoTDBUiMessages.controls_privilege_table_column_privilege_status,
                    boolean newC = elementPriv.enabled;
        createCheckAllButton(buttonsPanel);
            this.withGrantOption = withGrantOption;
    /**
    /**
        IoTDBObjectPrivilege(IoTDBPrivilege privilege, boolean enabled, boolean withGrantOption) {

            @Override
        drawColumns(currentPrivileges);
                drawColumns(currentPrivileges);
            if (basePrivilege.privilege == privilege) {
                        privilegeGranted = true;
                    return ((IoTDBObjectPrivilege) element).enabled;
                        elementPriv.enabled = Boolean.TRUE.equals(value);
                IoTDBUiMessages.controls_privilege_table_column_privilege_status_tip,
        }
import org.jkiss.dbeaver.ext.iotdb.model.IoTDBPrivilege;
                    userPrivilege.withGrantOption = false;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.SWT;
        UIUtils.createPushButton(buttonsPanel,
        GridLayout gl = new GridLayout(1, false);
        columnsController.addBooleanColumn(
        UIUtils.createPushButton(buttonsPanel,
        }, new EditingSupport(tableViewer) {
                }
            }
        } else event.detail = 1;

     * 1 1 --> 0 0, 1 0
                }
import org.jkiss.code.NotNull;
        for (IoTDBObjectPrivilege basePrivilege : currentPrivileges) {
            protected Object getValue(Object element) {
        gd.minimumWidth = 300;
        columnsController.createColumns(false);
            return;
    private Table privTable;
        gd = new GridData(GridData.FILL_BOTH);

        boolean privilegeGranted;
            @Override
                    boolean prevC = elementPriv.enabled;
                SWT.CENTER, true, true, item -> {

                    return ((IoTDBObjectPrivilege) element).withGrantOption;
    private void addPrivilegeNameColumn() {
     * grant withGrantOption --> grant withGrantOption

}
                basePrivilege.enabled = grant;
            privilegeEnabled = false;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,

                    if (grant.isGranted()) {
        private boolean withGrantOption;
    private TableViewer tableViewer;
                    userPrivilege.withGrantOption = true;

    private void notifyPrivilegeCheck(IoTDBPrivilege privilege, boolean prevC, boolean checked, boolean withGrantOption) {
                        }
        Composite buttonsPanel = UIUtils.createComposite(privsGroup, 3);
     * @param checked boolean
            privilegeGranted = false;

        event.data = privilege;
        drawColumns(currentPrivileges);

                }
import org.jkiss.utils.CommonUtils;
            protected CellEditor getCellEditor(Object element) {
import org.jkiss.utils.ArrayUtils;

            event.detail = 2;
            return false;
        if (CommonUtils.isEmpty(privileges)) {
        tableViewer.setInput(objects);
                }
            for (IoTDBPrivilege privilege : privileges) {
 * Copyright (C) 2010-2026 DBeaver Corp and others
        gl.marginHeight = 0;
                    notifyPrivilegeCheck(userPrivilege.privilege, true, false, false);

                }
            event.detail = 0;
 *
            protected boolean canEdit(Object element) {
            if (item instanceof IoTDBObjectPrivilege) {

            public void widgetSelected(SelectionEvent e) {

            if (item instanceof IoTDBObjectPrivilege) {
            protected boolean canEdit(Object element) {


            }

            this.privilege = privilege;
                        elementPriv.withGrantOption = Boolean.TRUE.equals(value);
                    boolean newG = elementPriv.withGrantOption;

                }
 * DBeaver - Universal Database Manager
            protected CellEditor getCellEditor(Object element) {
    public void fillGrants(List<IoTDBGrant> grants, boolean editable) {
    private void createCheckAllButton(Composite buttonsPanel) {
    }
                    notifyPrivilegeCheck(elementPriv.privilege, prevC, newC, newG);
                IoTDBUiMessages.controls_privilege_table_push_button_check_all, null, new SelectionAdapter() {
        gl.marginWidth = 0;
        tableViewer = new TableViewer(privsGroup, SWT.BORDER | SWT.UNDERLINE_SINGLE | SWT.V_SCROLL | SWT.H_SCROLL | SWT.FULL_SELECTION);
    /**

        });
    private void createClearAllButton(Composite buttonsPanel) {
        });
    private void initColumns() {
    }
    }
import org.jkiss.dbeaver.ext.iotdb.model.IoTDBGrant;
    }
                    IoTDBObjectPrivilege elementPriv = (IoTDBObjectPrivilege) element;
        }
            drawColumns(currentPrivileges);
        columnsController.repackColumns();
                return new CustomCheckboxCellEditor(tableViewer.getTable(), true);
import java.util.List;
     * 1 0 --> 0 0, 1 1 --> 0 0 revoke [3]
            currentPrivileges.add(new IoTDBObjectPrivilege(privilege, privilegeEnabled, privilegeGranted));
                return ((IoTDBObjectPrivilege) item).withGrantOption;
        for (IoTDBPrivilege privilege : privileges) {
                IoTDBUiMessages.controls_privilege_table_column_privilege_name,
                for (IoTDBObjectPrivilege userPrivilege : CommonUtils.safeCollection(currentPrivileges)) {
                    privilegeEnabled = true;
     * 0 0 --> 1 0 grant [1]
                return ((IoTDBObjectPrivilege) item).enabled;
        createClearAllButton(buttonsPanel);
        }
        gl.horizontalSpacing = 0;
        if (checked && withGrantOption) {
                    boolean prevC = elementPriv.enabled;
     * 1 0 --> 0 0, 1 1
     */
            @Override
        private boolean enabled;
    }
                    if (elementPriv.enabled != Boolean.TRUE.equals(value)) { // handle double click on the box cell
    }

            protected void setValue(Object element, Object value) {
    public PrivilegeTableControl(Composite parent, String title) {
import org.eclipse.swt.widgets.Event;
        GridData gd = (GridData) privsGroup.getLayoutData();
    }
    public void checkPrivilege(IoTDBPrivilege privilege, boolean grant) {
        privTable.setEnabled(editable);
                    boolean newG = elementPriv.withGrantOption;
        fillGrants(grants);
        } else if (prevC) {

                }
        privTable.setLinesVisible(true);
     * @param grants List of IoTDBGrant
            }
    public void fillPrivileges(@NotNull List<IoTDBPrivilege> tempPrivileges) {
            }

     */
                if (element instanceof IoTDBObjectPrivilege) {
                IoTDBUiMessages.controls_privilege_table_push_button_clear_all, null, new SelectionAdapter() {
        privTable = tableViewer.getTable();
    private void drawColumns(List<?> objects) {
                SWT.CENTER, true, true, item -> {
            @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
            protected void setValue(Object element, Object value) {
     * 0 1 invalid
            }
                currentPrivileges.add(new IoTDBObjectPrivilege(privilege, false, false));
     * @param tempPrivileges List of IoTDBPrivilege
                IoTDBUiMessages.controls_privilege_table_column_privilege_grant,
        buttonsPanel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        }
                return false;
        privTable.setLayoutData(gd);
 * You may obtain a copy of the License at
                        if (!elementPriv.enabled) { // disabled privilege should not have grant option
 *
     *
            event.detail = 3;
