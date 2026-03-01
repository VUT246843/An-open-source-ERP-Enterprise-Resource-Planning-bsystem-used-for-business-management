                    }
                        return;
    private ControlEnableState permissionsEnable;
        treeViewer.addSelectionChangedListener(event -> handleSelectionChange());
        if (roleOrObjectTable != null) {
 * limitations under the License.

            });

        }
                    }
import org.jkiss.dbeaver.runtime.DBWorkbench;
            new DatabaseLoadService<>("Load permissions", getExecutionContext()) {
                    }
        }
            isLoaded = false;
            }
import org.jkiss.dbeaver.ui.LoadingJob;

import org.jkiss.dbeaver.model.DBUtils;
                    if (rootNode == null) {
                }

    private ObjectListControl<DBAPrivilege> permissionTable;
/*
 * Copyright (C) 2010-2025 DBeaver Corp and others
        public boolean isLeafObject(Object object) {
    @Override
import org.eclipse.swt.widgets.Text;
            return privilegeMap.get(DBUtils.getObjectFullName(object, DBPEvaluationContext.DDL));
    private DBAPrivilege[] currentPrivileges;
        treeViewer.addFilter(new ViewerFilter() {
        roleOrObjectTable = new DatabaseNavigatorTree(
                    // Load navigator tree

                        parentContainer = DBUtils.getParentOfType(DBSSchema.class, getDatabaseObject());
            objectDescriptionText.setText("<no objects>");
                    dbObject instanceof DBSPackage ||
                    getDatabaseObject(),
    public void createPartControl(Composite parent) {
    {
            if (permissionsEnable != null) {
    }
            composite,

        return getDatabaseObject() instanceof DBARole;
                        throw new InvocationTargetException(e);
    }
            this.pageControl.activate(true);
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
        roleOrObjectTable.setLayoutData(new GridData(GridData.FILL_BOTH));
import org.eclipse.swt.graphics.Font;
        if (force ||
                        parentContainer = getDatabaseObject().getParentObject();
                    if (!pt.isValid() || !pt.supportsType(objectType)) {
            return false;
    private void updateCurrentPrivileges(boolean grant, @Nullable DBAPrivilegeType privilegeType) {
        composite.setLayoutData(new GridData(GridData.FILL_BOTH));
import org.jkiss.dbeaver.ui.editors.AbstractDatabaseObjectEditor;
import org.jkiss.dbeaver.model.access.*;

            UIUtils.createTableColumn(permissionTable, SWT.CENTER, "With Hierarchy");
import org.eclipse.swt.custom.SashForm;
                    dbObject instanceof DBSEntity ||
            super.fillCustomActions(contributionManager);
                protected String getListConfigId(List<Class<?>> classList) {
                privilegeMap.put(privilege.getName(), privilege);
            if (privilege == null) {
                        item.setChecked(false);
                    privilegeMap.clear();
                for (PRIVILEGE_TYPE pt : getACLManager().getPrivilegeTypes()) {
            }
    protected abstract ObjectACLManager<PRIVILEGE, PRIVILEGE_TYPE> getACLManager();
                }
            }
        }
        });
import org.jkiss.code.Nullable;
    private Map<String, DBAPrivilege> privilegeMap = new HashMap<>();
import org.eclipse.jface.viewers.ViewerFilter;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.pageControl = new PageControl(parent);
                    dbObject instanceof DBSSequence ||

*/
                if (!grant) {
                    }
                }
                            if (tableName.startsWith(schemaPrefix)) {
                    boolean hadChecked = false;
        public void fillCustomActions(IContributionManager contributionManager) {
                    if (privs == null) {
            return false;
/**
import org.eclipse.swt.layout.RowLayout;
            updateObjectPermissions(null);
                @Override
            }
    }
import org.jkiss.dbeaver.ui.editors.DatabaseEditorUtils;
        SashForm composite = UIUtils.createPartDivider(getSite().getPart(), this.pageControl, SWT.HORIZONTAL);
            if (workbenchSite != null) {
            };

                // Check for privilege was already granted for this object
            UIUtils.createPushButton(buttonPanel, "Revoke All", null, new SelectionAdapter() {
                protected LoadingJob<Collection<DBAPrivilege>> createLoadService(boolean forUpdate) {
import org.jkiss.dbeaver.ui.BaseThemeSettings;
                return
                public void widgetSelected(SelectionEvent e) {
            }
    private class PageControl extends ProgressPageControl {
                @Override
                    TableItem privItem = new TableItem(permissionTable, SWT.LEFT);
    private Composite permEditPanel;
            @Override

        }
                    DBSObject object = ((DBNDatabaseNode) element).getObject();


            buttonPanel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));


                    dbObject instanceof DBAUser;
                if (element instanceof DBNDatabaseFolder) {
            return;

        }
                boolean hasPriv = ArrayUtils.contains(privilege.getTypes(), privilegeType);
        LoadingJob.createService(
}
            DBAPrivilege privilege = currentPrivileges[i];
        updateObjectPermissions(null);
                    privItem.setData(pt);
            // Add command
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTreeFilter;


                    grant,
            buttonPanel.setLayout(new RowLayout());
            pageControl.createLoadVisualizer()).schedule();
                    }
            activatePart();
                    getACLManager(),
        {
            return RefreshResult.REFRESHED;
        PageControl(Composite parent) {
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        if (!hasBadObjects) {
 * distributed under the License is distributed on an "AS IS" BASIS,
                if (grant == hasPriv) {
*/
 *
        boolean hasBadObjects = CommonUtils.isEmpty(objects);

                    if (parentContainer == null) {
                    }
        }
import org.jkiss.dbeaver.DBException;
                        rootNode = DBNUtils.getChildFolder(monitor, dbNode, DBARole.class);
import org.jkiss.dbeaver.model.struct.DBSEntity;
                if (element instanceof DBNDatabaseNode) {
        }
                }
                        DBWorkbench.getPlatformUI().showError("Object tree", "Can't detect root node for objects tree");
                        item.setChecked(true);

                    } catch (ClassNotFoundException e) {
import java.util.Map;
                    public void undoCommand(@NotNull ACLCommandChangePrivilege cmd)
                    }
                permissionTable.getParent().layout(true);
                            return false;
import org.eclipse.jface.dialogs.ControlEnableState;
        treeViewer.setLabelProvider(new DatabaseNavigatorLabelProvider(roleOrObjectTable) {
        return RefreshResult.IGNORED;
                }
import java.lang.reflect.InvocationTargetException;
import org.eclipse.swt.events.SelectionAdapter;
import org.jkiss.dbeaver.ui.UIUtils;
        if (this.pageControl != null) {
                }
    private boolean isRoleEditor() {

    private Text objectDescriptionText;
            public boolean select(Viewer viewer, Object parentElement, Object element) {

/*
                        return BaseThemeSettings.instance.treeAndTableFont;
        if (object instanceof PostgreProcedure) {
            if (object instanceof DBNDatabaseItem) {
                        roleOrObjectTable.reloadTree(rootNode);
        if (editEnabled) {
                    }
                for (PRIVILEGE_TYPE pt : getACLManager().getPrivilegeTypes()) {
            (source instanceof DBNEvent && ((DBNEvent) source).getSource() == DBNEvent.UPDATE_ON_SAVE) ||
        if (CommonUtils.isEmpty(selectedObjects)) {
                    }
                        if (elementTypeName == null) {
import org.eclipse.jface.viewers.Viewer;
import org.jkiss.dbeaver.model.edit.DBECommandReflector;
                    DBNDatabaseNode dbNode = DBNUtils.getNodeByObject(parentContainer);
                return null;
    private static class DatabaseObjectFilter extends DatabaseNavigatorTreeFilter {
import org.eclipse.jface.action.IContributionManager;
 * PostgresRolePrivilegesEditor
            }
        } else {
    }
        pageControl.createOrSubstituteProgressPanel(getSite());
    private DBSObject[] currentObjects;
    public RefreshResult refreshPart(Object source, boolean force)
    }
                }
                    privilegeType == null ? null : new DBAPrivilegeType[] { privilegeType }),
        ProgressVisualizer<Collection<? extends DBAPrivilege>> createLoadVisualizer() {

                    monitor.beginTask("Load privileges from database..", 1);
import org.jkiss.dbeaver.ui.navigator.itemlist.ObjectListControl;
                    DBSObject parentContainer = DBUtils.getParentOfType(DBSCatalog.class, getDatabaseObject());
                        updateCurrentPrivileges(((TableItem) e.item).getChecked(), (DBAPrivilegeType) e.item.getData());
                        }
                        String schemaPrefix = DBUtils.getQuotedIdentifier(object) + ".";
            SWT.MULTI | SWT.FULL_SELECTION,
                    continue;
                // Add to map

            for (DBSObject object : objects) {
        if (isLoaded) {
    private PageControl pageControl;
        }
        final TreeViewer treeViewer = roleOrObjectTable.getViewer();
            // Important! activation of page control fills action toolbar
                    if (object instanceof DBSSchema) {
        }
                    break;
                    }
                permissionsEnable = ControlEnableState.disable(permEditPanel);
        UIUtils.asyncExec(() -> UIUtils.packColumns(permissionTable, false));
                    dbObject instanceof DBSProcedure ||
            }
                        continue;
                @NotNull
 */
                if (!objectNames.isEmpty()) objectNames.append(", ");
        }
        }
        } else {

            String fqProcName = DBUtils.getQuotedIdentifier(((PostgreProcedure) object).getSchema()) + "." + ((PostgreProcedure) object).getSpecificName();
                    return false;
                    if (e.detail == SWT.CHECK) {
            objectDescriptionText = new Text(permEditPanel, SWT.READ_ONLY | SWT.MULTI | SWT.WRAP | SWT.V_SCROLL);
            if (!CommonUtils.isEmpty(objects)) {
                if (element instanceof DBNNode && !(element instanceof DBNDatabaseNode)) {
            addChangeCommand(
            }
    }
                    boolean hadNonChecked = false;
        {
                    handleSelectionChange();
            };
                public Collection<? extends DBAPrivilege> evaluate(@NotNull DBRProgressMonitor monitor) throws InvocationTargetException {

        }
                        Class<?> childType = Class.forName(elementTypeName);
                permissionsEnable.restore();
*/
/*

                privilege = getACLManager().createNewPrivilege(getDatabaseObject(), currentObject, null);
                this.currentPrivileges[i] = getObjectPermissions(currentObjects[i]);
                }
    private void updateObjectPermissions(List<DBSObject> objects) {
            editEnabled = !CommonUtils.isEmpty(objects);
            updateObjectPermissions(selectedObjects);
/*
            IWorkbenchSite workbenchSite = getSite();
import org.eclipse.ui.IWorkbenchSite;

        if (isRoleEditor()) {
                    privilege,

            if (permissionsEnable == null) {
        @Override
        return privilegeMap.get(getACLManager().getObjectUniqueName(object));
                    if (hadNonChecked) updateCurrentPrivileges(true, null);
*/
    private boolean isLoaded;
    public synchronized void activatePart()
                        String elementTypeName = ((DBNDatabaseFolder) element).getMeta().getType();
            @Override

            objectDescriptionText.setText(objectNames.toString());
    {
            objectDescriptionText.setLayoutData(new GridData(GridData.FILL_BOTH));
                        return DBAPrivilegeOwner.class.isAssignableFrom(childType);
        if (ArrayUtils.isEmpty(currentObjects)) {
import org.jkiss.dbeaver.model.runtime.load.DatabaseLoadService;
import java.util.List;
import org.jkiss.dbeaver.model.struct.rdb.*;
                item.setText(1, "");
            UIUtils.createTableColumn(permissionTable, SWT.LEFT, "Permission");
                    }

        if (hasBadObjects) {
            permissionTable = new ObjectListControl<>(permEditPanel, SWT.FULL_SELECTION | SWT.CHECK, new ListContentProvider()) {
        @Override
            super(parent, SWT.SHEET);
                    @Override
        }
*/
import java.util.Collection;
import org.jkiss.utils.ArrayUtils;
                    }
                        if (item.getChecked()) hadChecked = true;

                }
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;

            // In role editor each object may have different privilege set
 *
import org.jkiss.dbeaver.ui.controls.ProgressPageControl;
import org.eclipse.swt.layout.GridLayout;
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorLabelProvider;
                    for (TableItem item : permissionTable.getItems()) {
                }
import org.eclipse.swt.layout.GridData;

                        }
                        continue;


                    for (DBAPrivilege perm : privs) {
                        rootNode = DBNUtils.getChildFolder(monitor, dbNode, DBSSchema.class);
        public boolean filterFolders() {
            permissionTable.addSelectionListener(new SelectionAdapter() {
                    return null;
import org.jkiss.dbeaver.model.navigator.*;
            }
                }
            editEnabled = false;
public abstract class ObjectACLEditor<PRIVILEGE extends DBAPrivilege, PRIVILEGE_TYPE extends DBAPrivilegeType> extends AbstractDatabaseObjectEditor<DBAPrivilegeOwner>
                DBSObject dbObject = ((DBNDatabaseItem) object).getObject();
                            }
                    // No permission - nothing to revoke
            DBWorkbench.getPlatformUI().showError("Update privilege", "Can't update privilege - no current object");
*/
                    DBNDatabaseNode rootNode;
import org.eclipse.swt.SWT;
                    } else {
import java.util.HashMap;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                    try {
            UIUtils.syncExec(() -> updateObjectPermissions(null));
        }
/*
                }
 * You may obtain a copy of the License at
    private void handleSelectionChange() {
    private DBAPrivilege getObjectPermissions(DBSObject object) {
                    hasBadObjects = true;
            });
    }
            return privilegeMap.get(fqProcName);
                @Override
                                return BaseThemeSettings.instance.treeAndTableFontBold;

    }
 * you may not use this file except in compliance with the License.
                return true;
 */
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
 * See the License for the specific language governing permissions and
            }/* else if (privilegeType != null) {
            false,
                        updateCurrentPrivileges(false, null);
            permissionTable.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                DBAPrivilegeType privType = (DBAPrivilegeType) item.getData();
    }
                    DBRProgressMonitor monitor = new VoidProgressMonitor();
            }
                    if (parentContainer == null) {
        @Override

            for (TableItem item : permissionTable.getItems()) {
    @Override
        List<DBSObject> selectedObjects = NavigatorUtils.getSelectedObjects(roleOrObjectTable.getViewer().getSelection());

            this.currentPrivileges = new DBAPrivilege[this.currentObjects.length];
/*
            permEditPanel.setLayout(new GridLayout(1, true));
                    @Override
            isRoleEditor() ? new DatabaseObjectFilter() : null);
            public Font getFont(Object element) {
            for (TableItem item : permissionTable.getItems()) {
import org.jkiss.dbeaver.model.struct.DBSObject;
/*
            }
                    return ObjectACLEditor.this.getClass().getName();
    private DatabaseNavigatorTree roleOrObjectTable;
                        monitor.done();
                new ACLCommandChangePrivilege(
                item.setText(2, "");
            UIUtils.createPushButton(buttonPanel, "Grant All", null, new SelectionAdapter() {
import org.eclipse.swt.events.SelectionEvent;
        } else {
                    }
package org.jkiss.dbeaver.ui.editors.acl;
                    }
                if (!(object instanceof DBAPrivilegeOwner)) {
import org.eclipse.jface.viewers.TreeViewer;
                public void widgetSelected(SelectionEvent e) {
        boolean editEnabled;
        }
            return new ProgressVisualizer<>() {
        }
                        privilegeMap.put(perm.getName(), perm);

            contributionManager.add(new Separator());
                }
    @Override

import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTree;
            DBWorkbench.getPlatform().getNavigatorModel().getRoot(),
                    }
                    } else if (getObjectPermissions(object) != null) {
        });
            });
    }
        }
                @Override
            return;
            permissionTable.removeAll();
                    super.completeLoading(privs);
            }*/


                    dbObject instanceof DBSTableIndex ||
                public void completeLoading(Collection<? extends DBAPrivilege> privs) {
                    public void redoCommand(@NotNull ACLCommandChangePrivilege cmd)
import org.jkiss.utils.CommonUtils;
            DBSObject currentObject = currentObjects[i];
                    {
                @Override
            this.currentObjects = null;
                    privItem.setData(pt);
 * DBeaver - Universal Database Manager

                    for (TableItem item : permissionTable.getItems()) {
        isLoaded = true;
                    privItem.setText(0, pt.getName());
 * Unless required by applicable law or agreed to in writing, software
                    } catch (DBException e) {

                        for (String tableName : privilegeMap.keySet()) {
    public void setFocus() {
        }
                    privItem.setText(0, pt.getName());
                    if (!pt.isValid() || !pt.supportsType(getDatabaseObject().getClass())) {

                    }
            if (!(element instanceof DBNDatabaseItem)) {
                    if (isRoleEditor()) {
        public boolean select(Object element) {
                @Override
        } else {
                }
            for (int i = 0; i < currentObjects.length; i++) {
                    } else {
            // We have object(s) but no permissions for them
            this.currentObjects = objects.toArray(new DBSObject[0]);
                    if (hadChecked) {
                        return false;
            !isLoaded)
                    TableItem privItem = new TableItem(permissionTable, SWT.LEFT);
import org.eclipse.jface.action.Separator;

                        return getDatabaseObject().getPrivileges(monitor, false);
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
                public void widgetSelected(SelectionEvent e) {
            if (!isRoleEditor()) {
        @Override
            Composite buttonPanel = new Composite(permEditPanel, SWT.NONE);
                    }
            return isLeafObject(element);
                Class<?> objectType = objects.get(0).getClass();
                UIUtils.packColumns(permissionTable, false);
        for (int i = 0; i < currentObjects.length; i++) {
 *
                }
        if (ArrayUtils.isEmpty(currentPrivileges)) {
                    {
        StringBuilder objectNames = new StringBuilder();
            permEditPanel = new Composite(composite, SWT.NONE);
                    continue;
            UIUtils.createTableColumn(permissionTable, SWT.CENTER, "With GRANT");
                new DBECommandReflector<DBAPrivilegeOwner, ACLCommandChangePrivilege>() {
        } else {
                    //roleOrObjectTable.getViewer().getControl().setFocus();
*/
                objectNames.append(DBUtils.getObjectFullName(object.getDataSource(), object, DBPEvaluationContext.DML));
import org.eclipse.swt.widgets.Composite;

            },
                    } finally {

{
                DatabaseEditorUtils.contributeStandardEditorActions(workbenchSite, contributionManager);
                return true;
    }
                    try {
                @Override
            roleOrObjectTable.getViewer().getControl().setFocus();
                        monitor.subTask("Load " + getDatabaseObject().getName() + " privileges");
import org.jkiss.dbeaver.ui.controls.ListContentProvider;
                });
            }

                item.setChecked(false);

                permissionsEnable = null;

            this.currentPrivileges = null;
            }
                        if (!item.getChecked()) hadNonChecked = true;
        }
