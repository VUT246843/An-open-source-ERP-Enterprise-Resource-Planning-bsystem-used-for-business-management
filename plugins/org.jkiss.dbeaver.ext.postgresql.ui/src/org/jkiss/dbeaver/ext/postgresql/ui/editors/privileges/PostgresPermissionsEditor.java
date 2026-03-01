    }
                privilege,
        }

import org.eclipse.swt.widgets.Composite;

            }
            databaseObject.getSchema().getName(),
            UIUtils.enableWithChildren(permEditPanel, false);
            null
        selectedObjectNames = new Text(
        table.addSelectionListener(new SelectionAdapter() {
import org.jkiss.dbeaver.ui.editors.DatabaseEditorUtils;
                    } else if (getObjectPermissions(object) != null) {
            public void widgetSelected(SelectionEvent e) {
            parent,
        } else {
    }
    ) {
        PostgrePrivilegeType[] privilegesToRevoke = Arrays.stream(permissionTable.getItems())
    protected abstract boolean doesSupportObject(DBSObject object);
                }
abstract class PostgresPermissionsEditor<T extends DBSObject>
                        throw new InvocationTargetException(e);
    }


 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.DBPEvaluationContext;

    }
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorLabelProvider;
    }
                    action,
                    } finally {
                    monitor.beginTask("Load privileges from database..", 1);
        PostgrePrivilegeType[] privilegeTypes
                        monitor.done();
                            return role.supportsRoutinesPermissions();
    );
                public void undoCommand(@NotNull PostgreCommandGrantPrivilege cmd) {
        return new PostgrePrivilegeGrant(
        addButtons(permEditPanel);
            }
                    revokeAllCurrentPrivileges();
import org.jkiss.dbeaver.ext.postgresql.model.*;
                if (element instanceof DBNNode && !(element instanceof DBNDatabaseNode)) {
    private void revokeAllCurrentPrivileges() {
    private Table addPermissionTable(Composite composite) {
        return RefreshResult.IGNORED;
        permissionTable = addPermissionTable(permEditPanel);
            public Font getFont(Object element) {
    );

                        String schemaPrefix = DBUtils.getQuotedIdentifier(object) + ".";
 * DBeaver - Universal Database Manager
            privilegeTypes,
            new SelectionAdapter() {
                if (element instanceof DBNDatabaseNode) {
import org.eclipse.swt.widgets.TableItem;
        Set<String> objectNames


        }
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedure;
    @Override
    @NotNull
import org.eclipse.jface.action.Separator;
    @Override
                public void widgetSelected(SelectionEvent e) {


            .findAny();
    }
        UIUtils.createPushButton(
        }
                    selectedObject,
                    final Class<?> childType = meta.getSource().getObjectClass(meta.getType());

                }
        PostgreRoleReference currentUserReference = new PostgreRoleReference(
import org.jkiss.dbeaver.ui.controls.ProgressPageControl;
    private Composite addPermissionsPanel(Composite parent) {
            PostgreMessages.dialog_create_push_button_grant_all,
        UIUtils.createTableColumn(table, SWT.CENTER, PostgreMessages.dialog_create_table_column_name_with_garant);
        permEditPanel = new Composite(parent, SWT.NONE);
        @Override
                );
            },
                    }
            databaseObject.getName(),
            isLoaded = false;
    }
import org.eclipse.swt.widgets.Table;
                    PostgrePrivilegeType[] privilegeTypes = {(PostgrePrivilegeType) tableItem.getData()};
                            if (tableName.startsWith(schemaPrefix)) {
            privilegeTypes,
            public void mouseDown(MouseEvent e) {
    }
        boolean onSave = source instanceof DBNEvent &&
        });
        Composite buttonPanel = new Composite(parent, SWT.NONE);
    ) {

 *
            } else {

                    } else {
                        PostgreSequence.class.isAssignableFrom(childType) ||
                }
    private PostgrePrivilege getObjectPermissions(DBSObject object) {
                return parentNodeName + "." + PostgrePrivilegeGrant.Kind.TABLE;
        }
                if (e.item instanceof TableItem tableItem && e.detail == SWT.CHECK) {
        treeViewer.addFilter(new ViewerFilter() {
        UIUtils.asyncExec(() -> UIUtils.packColumns(permissionTable, false));
                }
        if (objects.isEmpty() || illegalObject.isPresent()) {
    }
    }
        table.addMouseListener(new MouseAdapter() {
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
        refreshPermissionsPanel(
        });
            tableItem.setData(privilegeType);
            databaseObject.getDatabase().getName(),
            public boolean select(Viewer viewer, Object parentElement, Object element) {
import org.eclipse.jface.action.IContributionManager;
import org.jkiss.dbeaver.DBException;
        );
 * Licensed under the Apache License, Version 2.0 (the "License");

    protected abstract PostgrePrivilege revokePrivilege(
        SashForm composite = UIUtils.createPartDivider(getSite().getPart(), pageControl, SWT.HORIZONTAL);
            .getUserName();
        selectedObjects = objects.toArray(new DBSObject[0]);
        PostgrePrivilegeType[] privilegeTypes,
            .getContainer()
    @NotNull
        addChangeCommand(
            @Override

        BiFunction<PostgrePrivilegeType, T, PostgrePrivilege> privilegeProvider,

            if (DBSSequence.class.isAssignableFrom(childrenClass)) {
                public void completeLoading(PermissionInfo privs) {
                action == Action.GRANT,
        buttonPanel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
import org.eclipse.swt.custom.SashForm;

            return;
        Action action
                @Override
            PostgreMessages.dialog_create_push_button_revoke_all,


            PostgrePrivilege privilege = null;
                }

    }
            return;
    }
                        return laodPermissionInfo(monitor);
import org.jkiss.dbeaver.model.DBUtils;
                        return true;
import java.util.stream.Collectors;
            }
    private Text selectedObjectNames;
    private Composite permEditPanel;
            SWT.BORDER | SWT.READ_ONLY | SWT.MULTI | SWT.WRAP | SWT.V_SCROLL

        roleOrObjectTable = new DatabaseNavigatorTree(
                return true;
import org.jkiss.dbeaver.ext.postgresql.PostgreMessages;
    private DatabaseNavigatorTree addSelectableObjectsTree(Composite composite) {
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeFolder;
        DatabaseNavigatorTree objectTree,
        for (DBSObject selectedObject : selectedObjects) {
package org.jkiss.dbeaver.ext.postgresql.ui.editors.privileges;
        PostgrePrivilege privilege,
        table.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

import org.jkiss.dbeaver.ui.UIUtils;
        return table;
            if (objectPermissions != null) {
                }

    }

 * Copyright (C) 2010-2025 DBeaver Corp and others
    private void handleSelectionChange() {

    }
import org.jkiss.dbeaver.model.runtime.load.DatabaseLoadService;
                    }
    private void grantAllCurrentPrivileges() {
            false
            .toArray(PostgrePrivilegeType[]::new);

 * distributed under the License is distributed on an "AS IS" BASIS,
                            }
            this::revokePrivilege,
                @Override

                        PostgrePrivilegeOwner owner = getDatabaseObject();

    protected String getObjectName(DBSObject object) {
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.model.navigator.DBNNode;
 *
import org.jkiss.code.NotNull;
        applyToSelectedObjects(
    }
    protected Table permissionTable;
    protected abstract PostgrePrivilegeType[] getSupportedPrivilegeTypes(DBSObject object);
                    }
                privilegeTypes
        UIUtils.createPushButton(

        treeViewer.setLabelProvider(new DatabaseNavigatorLabelProvider(objectTree) {
import org.eclipse.swt.layout.RowLayout;

import org.eclipse.swt.layout.GridData;
                    }
            @Override
import java.util.*;
        grantPrivilegeToSelectedObjects(privilegesToGrant);
import org.jkiss.dbeaver.model.navigator.DBNEvent;
            new DBECommandReflector<PostgrePrivilegeOwner, PostgreCommandGrantPrivilege>() {
    ) {

                    handleSelectionChange();
            ),
    @Nullable
    @Override
                privilege.getOwner(),
                        return BaseThemeSettings.instance.treeAndTableFontBold;
import org.eclipse.jface.viewers.TreeViewer;

        if (roleOrObjectTable != null) {
                    privilegeTypes
            .filter(Predicate.not(TableItem::getChecked))
        }
            roleOrObjectTable.getViewer().getControl().setFocus();
    private class PageControl extends ProgressPageControl {
            String parentNodeName = folder.getParentNode().getNodeDisplayName();
            // Important! activation of page control fills action toolbar
    protected DBSObject[] selectedObjects = new DBSObject[0];

import org.eclipse.swt.layout.GridLayout;
            return DBUtils.getQuotedIdentifier(procedure.getSchema()) + "." + procedure.getOverloadedName();
            this::grantPrivilege,
                return parentNodeName + "." + PostgrePrivilegeGrant.Kind.FUNCTION;
        permissionTable.removeAll();
 * Unless required by applicable law or agreed to in writing, software

        @NotNull PostgrePrivilegeOwner databaseObject,
                    return false;
        buttonPanel.setLayout(new RowLayout());
        @NotNull PostgreRole role,
            ((DBNEvent) source).getSource() == DBNEvent.UPDATE_ON_SAVE;
                tableItem.setText(2, (permission & PostgrePrivilege.WITH_HIERARCHY) != 0 ? "X" : "");
    protected PostgrePrivilegeGrant createGrant(
            Action.REVOKE
        PostgrePrivilege objectPermissions = getObjectPermissions(selectedObjects[0]);
        Optional<DBSObject> illegalObject = objects.stream()
            NavigatorUtils.getSelectedObjects(roleOrObjectTable.getViewer().getSelection())
            currentUserReference,
            .map(x -> (PostgrePrivilegeType) x.getData())
        TreeViewer treeViewer = objectTree.getViewer();
                    objectToPrivileges.clear();
import java.lang.reflect.InvocationTargetException;
import org.jkiss.dbeaver.ext.postgresql.edit.PostgreCommandGrantPrivilege;
import org.eclipse.jface.viewers.ViewerFilter;
    }
                    }
            .toArray(PostgrePrivilegeType[]::new);
                public PermissionInfo evaluate(@NotNull DBRProgressMonitor monitor) throws InvocationTargetException {
            return DBUtils.getObjectFullName(object, DBPEvaluationContext.DDL);
            }
                        return false;
        permEditPanel.setLayout(new GridLayout(1, true));
            .collect(Collectors.joining(", "));
import org.jkiss.code.Nullable;
        );
                DatabaseEditorUtils.contributeStandardEditorActions(workbenchSite, contributionManager);
            if (workbenchSite != null) {
        } else if (object instanceof DBNDatabaseFolder folder) {
import org.jkiss.dbeaver.model.edit.DBECommandReflector;
                @Override
                        }
            .filter(TableItem::getChecked)
            .filter(Predicate.not(this::doesSupportObject))
        for (PostgrePrivilegeType privilegeType : supportedPrivilegeTypes) {
    private DatabaseNavigatorTree roleOrObjectTable;
        PostgrePrivilegeType[] supportedPrivilegeTypes = getSupportedPrivilegeTypes(objects.getFirst());
                    if (object instanceof PostgreSchema) {
    protected abstract DatabaseNavigatorTreeFilter navigatorTreeFilter();
            SWT.MULTI | SWT.FULL_SELECTION,
        addSelectableObjectsTree(composite);
        );
import org.eclipse.swt.events.MouseEvent;
            super(parent, SWT.SHEET);
    private void addButtons(Composite parent) {
        UIUtils.packColumns(permissionTable, false);
                    // Load navigator tree
            Action.GRANT
        isLoaded = true;
            type,
    private void revokeFromSelectedObjects(

        REVOKE
    @Nullable
 * limitations under the License.
            new SelectionAdapter() {
                return parentNodeName + "." + PostgrePrivilegeGrant.Kind.SEQUENCE;
            activatePart();
            tableItem.setText(0, privilegeType.name());
                object,
            pageControl.createLoadVisualizer()).schedule();
    private void setupTreeViewer(
        if (this.pageControl != null) {
    ) {
                return null;
        );

/*
            role.getRoleReference(),
                    }
        @NotNull PostgrePrivilegeType type
}
            Class<? extends DBSObject> childrenClass = folder.getChildrenClass();
                        for (String tableName : objectNames) {
    private void addText(Composite parent) {
                @Override
import org.jkiss.dbeaver.ui.LoadingJob;

                    privilege,
                    }
            buttonPanel,
 */


                    if (privs == null) {
        }
        );
    public synchronized void activatePart() {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
                    super.completeLoading(privs);
        PostgrePrivilegeType[] privilegesToGrant = Arrays.stream(permissionTable.getItems())
            IWorkbenchSite workbenchSite = getSite();
import org.jkiss.dbeaver.model.struct.rdb.DBSSequence;
                    try {
                        revokeFromSelectedObjects(privilegeTypes);
        if (isLoaded) {
        if (object instanceof PostgreProcedure procedure) {
        T selectedObject
        setupTreeViewer(roleOrObjectTable, objectToPrivileges.keySet());
        PostgrePrivilegeType privilegeType,
        PostgrePrivilegeType[] privilegeTypes

            }
        }
import org.eclipse.swt.events.SelectionAdapter;

                    roleOrObjectTable.getViewer().expandToLevel(2);
import org.jkiss.dbeaver.ui.BaseThemeSettings;
            }
                    final DBXTreeFolder meta = dbFolder.getMeta();
        }

                @Override
import org.eclipse.swt.events.SelectionEvent;

            NavigatorUtils.getSelectedProject().getNavigatorModel().getRoot(),
                public void widgetSelected(SelectionEvent e) {
        table.setHeaderVisible(true);

            new PostgreCommandGrantPrivilege(
        public void fillCustomActions(IContributionManager contributionManager) {
import java.util.function.Predicate;
    }
                    if (childType == null) {
import org.jkiss.dbeaver.ui.editors.AbstractDatabaseObjectEditor;
                    roleOrObjectTable.reloadTree(privs.objectRootNode());
        @NotNull DBSObject object,
        selectedObjectNames.setLayoutData(new GridData(GridData.FILL_BOTH));
                @Override
        roleOrObjectTable.setLayoutData(new GridData(GridData.FILL_BOTH));
        PostgrePrivilegeType[] privilegeTypes
                    for (PostgrePrivilege perm : privs.privileges()) {
            false,
    protected final Map<String, PostgrePrivilege> objectToPrivileges = new HashMap<>();
        T object
                    } catch (Exception e) {
        LoadingJob.createService(
import org.eclipse.swt.events.MouseAdapter;
    protected abstract PostgrePrivilege grantPrivilege(
    }
        Action action,
            });
    }
            } else if (DBSProcedure.class.isAssignableFrom(childrenClass)) {
            @Override

        UIUtils.enableWithChildren(permEditPanel, true);
    private enum Action {
                        PostgreProcedure.class.isAssignableFrom(childType) ||

        String currentUserName = databaseObject.getDataSource()
                if (element instanceof DBNDatabaseFolder dbFolder) {

            composite,
        );
import java.util.function.BiFunction;
    private void grantPrivilegeToSelectedObjects(
        revokeFromSelectedObjects(privilegesToRevoke);
        );
                    grantAllCurrentPrivileges();
                        if (owner instanceof PostgreRole role) {
    private void refreshPermissionsPanel(@NotNull List<DBSObject> objects) {
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTreeFilter;
        composite.setLayoutData(new GridData(GridData.FILL_BOTH));
        addPermissionsPanel(composite);
    public RefreshResult refreshPart(Object source, boolean force) {
                    if (PostgreProcedure.class.isAssignableFrom(childType)) {
        ProgressVisualizer<PermissionInfo> createLoadVisualizer() {
            @Override
        return permEditPanel;
        pageControl.createOrSubstituteProgressPanel(getSite());
    }
        );
                        grantPrivilegeToSelectedObjects(privilegeTypes);
            currentUserName,
        permissionTable.getParent().layout(true);
import org.eclipse.swt.graphics.Font;
            buttonPanel,
 *     http://www.apache.org/licenses/LICENSE-2.0
    public void createPartControl(Composite parent) {
                        objectToPrivileges.put(perm.getName(), perm);
            if (privilege != null) {
        selectedObjectNames.setText(objectNames);
    private PageControl pageControl;
            .map(it -> DBUtils.getObjectFullName(it.getDataSource(), it, DBPEvaluationContext.DML))
            super.fillCustomActions(contributionManager);
        }
            null,
                tableItem.setText(1, (permission & PostgrePrivilege.WITH_GRANT_OPTION) != 0 ? "X" : "");
        });
        PostgrePrivilegeType privilegeType,
 * You may obtain a copy of the License at
            contributionManager.add(new Separator());
        applyToSelectedObjects(

        PageControl(Composite parent) {
        GRANT,
            .peek(x -> x.setChecked(false))
                }

import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTree;

                        monitor.subTask("Load " + getDatabaseObject().getName() + " privileges");
            this.pageControl.activate(true);
                    DBSObject object = ((DBNDatabaseNode) element).getObject();
                }
        });
            databaseObject.getDatabase(),
            false,
    ) {

    extends AbstractDatabaseObjectEditor<PostgrePrivilegeOwner> {
            return RefreshResult.REFRESHED;
            .getActualConnectionConfiguration()
            }
    protected abstract PermissionInfo laodPermissionInfo(DBRProgressMonitor monitor) throws DBException;
        pageControl = new PageControl(parent);
import org.jkiss.dbeaver.model.navigator.DBNDatabaseFolder;

        UIUtils.createTableColumn(table, SWT.LEFT, PostgreMessages.dialog_create_table_column_name_permission);
                    if (tableItem.getChecked()) {
        }
            for (PostgrePrivilegeType privilegeType : privilegeTypes) {
        }
    }

import org.eclipse.swt.SWT;
            new DatabaseLoadService<>("Load permissions", getExecutionContext()) {
            navigatorTreeFilter()
            }
    public void setFocus() {

import org.eclipse.jface.viewers.Viewer;
        UIUtils.createTableColumn(table, SWT.CENTER, PostgreMessages.dialog_create_table_column_name_with_hierarchy);
            null,
                short permission = objectPermissions.getPermission(privilegeType);
        table.setLinesVisible(true);
                        }
            .peek(x -> x.setChecked(true))
    ) {
            }
            };
                privilege = privilegeProvider.apply(privilegeType, (T) selectedObject);
            TableItem tableItem = new TableItem(permissionTable, SWT.LEFT);
            UIUtils.syncExec(() -> refreshPermissionsPanel(List.of()));
                super.mouseDown(e);
        String objectNames = objects.stream()
            }
                }
    private void applyToSelectedObjects(
    }
    private void addCommand(
    private boolean isLoaded;
                        return;
                        PostgreRole.class.isAssignableFrom(childType);
        );
import org.eclipse.swt.widgets.Text;
                }
    }
                                return BaseThemeSettings.instance.treeAndTableFontBold;

                    return PostgreTableReal.class.isAssignableFrom(childType) ||
                public void redoCommand(@NotNull PostgreCommandGrantPrivilege cmd) {
        addText(permEditPanel);



 * you may not use this file except in compliance with the License.
            selectedObjectNames.setText(PostgreMessages.dialog_object_description_text_no_objects);

            return new ProgressVisualizer<>() {
        Table table = new Table(composite, SWT.FULL_SELECTION | SWT.CHECK);
                addCommand(
        if (force || onSave || !isLoaded) {
import org.eclipse.ui.IWorkbenchSite;
                tableItem.setChecked((permission & PostgrePrivilege.GRANTED) != 0);
            }
        return roleOrObjectTable;
        return objectToPrivileges.get(getObjectName(object));
 *
        treeViewer.addSelectionChangedListener(event -> handleSelectionChange());
            .map(x -> (PostgrePrivilegeType) x.getData())
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
