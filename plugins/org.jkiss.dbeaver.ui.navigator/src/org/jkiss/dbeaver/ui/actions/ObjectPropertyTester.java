 *
 * DBeaver - Universal Database Manager
                            if (property.equals(PROP_CAN_MOVE_UP)) {
            Collection<DBNNode> cbNodes = TreeNodeTransfer.getFromClipboard();
/*
                        return true;
            case PROP_CAN_MOVE_UP:
import org.jkiss.dbeaver.model.app.DBPProject;
import org.jkiss.dbeaver.ui.navigator.actions.NavigatorHandlerObjectCreateNew;
            return createItems.size() == 1;
 * You may obtain a copy of the License at
}
                }
import org.eclipse.core.resources.IResource;
            }
                        DBEObjectRenamer objectRenamer = getObjectManager(object.getClass(), DBEObjectRenamer.class);
            }
        return false;
        return ObjectManagerRegistry.getInstance().getObjectManager(objectType, managerType);
                    } else {
                }
                    return true;

                }
                    if (DBNUtils.isReadOnly(node)) {
                    ) {
                break;
                }
        DBSEntity entityObject = entityAttribute.getParentObject();

        return node.getAdapter(IResource.class) != null;
        if (node instanceof DBNProject && DBWorkbench.isDistributed()) {
            DBNContainer container;
                if (node instanceof DBNResource || node instanceof DBNPath) {
        }
        if (!(node instanceof DBNDatabaseItem databaseItem)) {
        // Check whether only single object type can be created or multiple ones
                    }
                    return false;
import org.jkiss.dbeaver.model.navigator.*;
        if (onlySingle == null) {
            }
    public static final String PROP_PROJECT_RESOURCE_VIEWABLE = "projectResourceViewable";
            } else {
    public static final String PROP_CAN_DELETE = "canDelete";
            case PROP_SUPPORTS_NATIVE_EXECUTION:
                        return false;
            return false;
                        return false;
                if (node instanceof DBNDatabaseNode dbNode && dbNode.getItemsMeta() != null) {
                break;
import org.jkiss.dbeaver.model.navigator.fs.DBNPath;
                return false;
                return false;
                    return false;
import org.jkiss.dbeaver.model.DBUtils;
            if (cbNodes == null) {
            return false;
                if (node instanceof DBNDatabaseNode) {
        for (Class<?> childType: structEditor.getChildTypes()) {
                                object.isPersisted() &&
                            }
        if (!DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_METADATA_EDITOR)) {
            }
                if (node instanceof DBSWrapper wrapper) {
                    } catch (DBException e) {
    private static <T extends DBEObjectManager> T getObjectManager(Class<?> objectType, Class<T> managerType)
            }
                // which means UI interaction which can break menu popup [RedHat]
                    clipboard.dispose();
import org.eclipse.swt.widgets.Display;
 * limitations under the License.
                // We cannot interact with clipboard in property testers (#6489).
    public static final String PROP_CAN_RENAME = "canRename";
        if (dataSource == null || dataSource.getInfo().isReadOnlyMetaData()) {
                if (DBNUtils.isReadOnly(node)) {
    public static final String PROP_HAS_FILTER = "hasFilter";
                }
                if (node instanceof DBNDataSource ds && ds.getDataSource() == null) {
        if (display == null) {
        DBPDataSource dataSource = entityAttribute.getDataSource();
                    return nodeProjectHasPermission(node, RMConstants.PERMISSION_PROJECT_DATASOURCES_EDIT);
                }
 * you may not use this file except in compliance with the License.
                return canCreateObject(node, true);
                        return false;
                }
    public static boolean canCreateObject(DBNNode node, Boolean onlySingle) {
            // Check objects in clipboard
    public static final String PROP_CAN_MOVE_UP = "canMoveUp";
                        return false;
                    }
import org.eclipse.core.expressions.PropertyTester;
                try {
                    DBSObject object = wrapper.getObject();
                // It breaks context menu (and maybe something else) omn some OSes.
            return false;
                    if (clipboard.getContents(TreeNodeTransfer.getInstance()) == null) {
            Class<?> objectType;
                }
    public static final String PROP_SUPPORTS_CREATING_INDEX = "supportsIndexCreate";
    /**
//System.out.println("TEST " + property + " ON " + node.getName());
                    return nodeProjectHasPermission(node, RMConstants.PERMISSION_PROJECT_DATASOURCES_EDIT);
 *
                    }
            }
        }
    public static final String PROP_CAN_MOVE_DOWN = "canMoveDown";
                    DBSObject object = ((DBNDatabaseNode) node).getObject();
                return canCreateObject(node, false);
            DBEObjectMaker<?, ?> maker = DBWorkbench.getPlatform().getEditorsRegistry().getObjectManager(childType, DBEObjectMaker.class);
import org.jkiss.dbeaver.model.struct.rdb.DBSTableIndex;
    public ObjectPropertyTester() {
                } else if (isResourceNode(node)) {
        }
    public static boolean isMetadataChangeDisabled(DBNDatabaseNode node) {
        if (onlySingle) {
            return createItems.size() > 1;
     */

                    DBSObject pasteObject = ((DBSWrapper)nodeObject).getObject();
    }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        } else {
            case PROP_HAS_FILTER: {
            case PROP_CAN_DELETE: {
                        }
                            final int position = ((DBPOrderedObject) object).getOrdinalPosition();
                if (node instanceof DBNDatabaseNode dbNode && dbNode.getItemsMeta() != null) {
            }
                }
 */
                if (node instanceof DBNDatabaseItem) {
            }
            }
            return false;
                        DBEObjectReorderer objectReorderer = getObjectManager(object.getClass(), DBEObjectReorderer.class);
                }
    }
        return ownerProject != null && ownerProject.hasRealmPermission(permissionName);
import org.eclipse.jface.action.IContributionItem;
                if (receiver instanceof DBNResource dbnResource) {
                    return false;
            case PROP_CAN_OPEN:
    @SuppressWarnings("unchecked")
    @Override
            if (objectType == null) {
                return false;
                    if ("defined".equals(expectedValue)) {
    {
                if (isResourceNode(node) && !nodeProjectHasPermission(node, RMConstants.PERMISSION_PROJECT_RESOURCE_EDIT)) {
            if (dataSource != null && dataSource.getInfo().isReadOnlyMetaData()) {
                    }
        DBSObject attributeObject = databaseItem.getObject();
 */
import org.jkiss.dbeaver.model.struct.*;
    }
                    SQLNativeExecutorDescriptor executorDescriptor = SQLNativeExecutorRegistry.getInstance()
 * Unless required by applicable law or agreed to in writing, software
                // We always can create datasource
    public static boolean nodeProjectHasPermission(@NotNull DBNNode node, @NotNull String permissionName) {
                    return true;
    }
    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
                // Do not check PASTE command state. It requires clipboard contents check
                    node = node.getParentNode();
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.app.DBPResourceHandler;
    public static final String PROP_CAN_PASTE = "canPaste";
                        return executorDescriptor != null && executorDescriptor.getNativeExecutor() != null;

                    }
            // Just try to find first create handler
                // and also is a slow operation. So let paste be always enabled.

            case PROP_SUPPORTS_CREATING_INDEX:
import org.jkiss.dbeaver.ui.actions.exec.SQLNativeExecutorRegistry;
        }
            case PROP_CAN_FILTER_OBJECT: {
            }
                return false;
import org.jkiss.dbeaver.runtime.DBWorkbench;
                }
                break;
                return false;
    {
                    return false;
            for (DBNNode nodeObject : cbNodes) {
    public static final String NAMESPACE = "org.jkiss.dbeaver.core.object";
 * ObjectPropertyTester
            case PROP_CAN_MOVE_DOWN: {
                }
                    if (DBNUtils.isReadOnly(node) || !DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_METADATA_EDITOR)) {
            }
import org.jkiss.dbeaver.ui.ActionUtils;
        }
    public static final String PROP_CAN_CREATE_SINGLE = "canCreateSingle";
 * See the License for the specific language governing permissions and
                    }
            }
                    try {
            DBPDataSource dataSource = dbNode.getDataSource();
                if (node instanceof DBNDataSource || node instanceof DBNLocalFolder) {
            }
    }

                        return false;
                } else if (node instanceof DBNProject projectNode) {
            return false;
                    DBPDataSourceContainer dbpDataSourceContainer = associatedDataSources.get(0);

            if (objectMaker == null) {
                    List<DBPDataSourceContainer> associatedDataSources
                        if (objectReorderer != null) {
                        .getExecutorDescriptor(dbpDataSourceContainer);
        }
    public static final String PROP_CAN_CREATE_MULTI = "canCreateMulti";
import org.jkiss.dbeaver.model.rm.RMConstants;

                Clipboard clipboard = new Clipboard(display);
                    DBEObjectMaker objectMaker = getObjectManager(object.getClass(), DBEObjectMaker.class);
 *
        }

*/
                } else {

 *     http://www.apache.org/licenses/LICENSE-2.0
    private static boolean supportsCreatingColumnObject(@Nullable DBNNode node, @NotNull Class<?> supertype) {
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.DBException;
        return navSettings.isHideFolders() || navSettings.isShowOnlyEntities();
                }
        }
            return false;
        }
            }
                    }
        }
            }
                                return position > objectReorderer.getMinimumOrdinalPosition(object);
                }
import org.jkiss.dbeaver.ui.actions.exec.SQLNativeExecutorDescriptor;
        if (node instanceof DBNDatabaseNode dbNode){
                        = (List<DBPDataSourceContainer>) dbnResource.getAssociatedDataSources();
                    if (object == null || DBUtils.isReadOnly(object) || !(node.getParentNode() instanceof DBNContainer) ||
                return false;
            return false;
            case PROP_PROJECT_RESOURCE_EDITABLE:
    }
     * Check whether the owner project of the specified node has required permissions
                return canCreateObject(node, null);
            case PROP_CAN_PASTE: {

    public static void firePropertyChange(String propName)
        DBNNode node = RuntimeUtils.getObjectAdapter(receiver, DBNNode.class);
public class ObjectPropertyTester extends PropertyTester {
                return supportsCreatingColumnObject(node, DBSTableIndex.class);
import org.jkiss.dbeaver.model.app.DBPWorkspace;
                }

import org.jkiss.dbeaver.registry.ObjectManagerRegistry;
            case PROP_CAN_RENAME: {
                    }
    private static boolean isResourceNode(DBNNode node) {
    public static final String PROP_CAN_OPEN = "canOpen";
                    if (object instanceof DBPOrderedObject) {
                                node.getParentNode() instanceof DBNContainer &&
            return objectMaker.canCreateObject(container.getValueObject());
                container = (DBNContainer) node;
                    }
                    DBSObject object = dbNode.getObject();
                        return !DBUtils.isReadOnly(object) &&
                return nodeProjectHasPermission(node, RMConstants.PERMISSION_PROJECT_RESOURCE_VIEW);
        List<IContributionItem> createItems = NavigatorHandlerObjectCreateNew.fillCreateMenuItems(null, node);
                }

                return node.getOwnerProject().hasRealmPermission(RMConstants.PERMISSION_PROJECT_DATASOURCES_EDIT);
        DBPWorkspace workspace = DBWorkbench.getPlatform().getWorkspace();
                    }
            case PROP_PROJECT_RESOURCE_VIEWABLE:
            DBEObjectMaker<?,?> objectMaker = getObjectManager(objectType, DBEObjectMaker.class);
        super();
        DBPProject ownerProject = node.getOwnerProjectOrNull();
        if (node == null) {
                    return true;
        if (DBNUtils.isReadOnly(node)) {
    }
                return node.isPersisted();
        if (!(attributeObject instanceof DBSEntityAttribute entityAttribute)) {
                    if (CommonUtils.isEmpty(associatedDataSources)) {
                return false;
                } else if (node instanceof DBNResource dbnResource) {
            }
                if (node instanceof DBNDatabaseNode dbNode) {
import org.jkiss.dbeaver.model.DBPOrderedObject;
            if (!(node instanceof DBNDataSource) && isMetadataChangeDisabled(dbNode)) {
                return supportsCreatingColumnObject(node, DBSEntityConstraint.class);
/*
                if (node.getParentNode() instanceof DBNContainer) {
        DBEStructEditor<?> structEditor = DBWorkbench.getPlatform().getEditorsRegistry().getObjectManager(entityObject.getClass(), DBEStructEditor.class);
                    node = node.getParentNode();
                            return position < objectReorderer.getMaximumOrdinalPosition(object);
                if (node.getParentNode() instanceof DBNDatabaseNode dbNode && dbNode.getItemsMeta() != null) {
                        return false;
/*
            return false;
    }
                return false;
            if (node instanceof DBNDataSource || node instanceof DBNLocalFolder) {
import org.jkiss.dbeaver.utils.RuntimeUtils;
            if (DBNUtils.isReadOnly(node) || !workspace.hasRealmPermission(RMConstants.PERMISSION_METADATA_EDITOR)) {
                return nodeProjectHasPermission(node, RMConstants.PERMISSION_PROJECT_RESOURCE_EDIT);
    //static final Log log = Log.getLog(ObjectPropertyTester.class);
import org.jkiss.utils.CommonUtils;

            }

                objectType = ((DBNContainer) node).getChildrenClass();
import org.jkiss.dbeaver.model.DBPDataSource;
                        !DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_METADATA_EDITOR)
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                break;
                    return project != project.getWorkspace().getActiveProject();
        }
                break;
                    node = node.getParentNode();

        ActionUtils.evaluatePropertyState(NAMESPACE + "." + propName);
    public static final String PROP_SUPPORTS_CREATING_CONSTRAINT = "supportsConstraintCreate";
                    return objectMaker != null && objectMaker.canDeleteObject(object);
            }
            if (node instanceof DBNContainer) {
package org.jkiss.dbeaver.ui.actions;
                    }
            if (!(node instanceof DBNContainer)) {
                return true;
        if (structEditor == null) {
    public static final String PROP_CAN_FILTER = "canFilter";
            case PROP_CAN_FILTER: {
                return false;
            }
                    if (object != null) {
            }
        }
                }
 * distributed under the License is distributed on an "AS IS" BASIS,
    public static final String PROP_HAS_TOOLS = "hasTools";
import org.jkiss.code.Nullable;
    public static final String PROP_SUPPORTS_NATIVE_EXECUTION = "supportsNativeExecution";
                if (node instanceof DBNDatabaseItem) {
    public static final String PROP_CAN_FILTER_OBJECT = "canFilterObject";

                }
                }
    }
            case PROP_CAN_CREATE_SINGLE: {
                break;
import org.jkiss.code.NotNull;
                if (node.supportsRename()) {
                                objectRenamer != null && objectRenamer.canRenameObject(object);
        }
                return false;
                    return true;
                    return property.equals(PROP_CAN_PASTE);
        Display display = Display.getCurrent();
            if (node instanceof DBSWrapper && DBUtils.isReadOnly(((DBSWrapper) node).getObject())) {
                // Try to detect child type
                if (nodeObject.isManagable() && nodeObject instanceof DBSWrapper) {
        DBNBrowseSettings navSettings = node.getDataSourceContainer().getNavigatorSettings();

                } finally {
                }
                if (node instanceof DBNDataSource || node instanceof DBNLocalFolder) {
import java.util.List;
                // Can't create virtual objects
                    return false;
            if (maker != null && maker.canCreateObject(entityObject) && supertype.isAssignableFrom(childType)) {
            if (dbNode.isVirtual() || !workspace.hasRealmPermission(RMConstants.PERMISSION_METADATA_EDITOR)) {
        return false;
            case PROP_SUPPORTS_CREATING_CONSTRAINT:
        switch (property) {
/**
            }
*/
                    DBPProject project = projectNode.getProject();
                    if (pasteObject == null || objectType != pasteObject.getClass()) {
                    if ((dbnResource.getFeatures() & DBPResourceHandler.FEATURE_DELETE) != 0) {
                        return filter != null && !filter.isEmpty();
            return false;
                        return false;
import org.jkiss.dbeaver.model.edit.*;
    public static final String PROP_PROJECT_RESOURCE_EDITABLE = "projectResourceEditable";
                    DBSObjectFilter filter = dbNode.getNodeFilter(dbNode.getItemsMeta(), true);
                        return filter != null && !filter.isNotApplicable();
        }
            case PROP_CAN_CREATE_MULTI: {

                if (isResourceNode(node) && !nodeProjectHasPermission(node, RMConstants.PERMISSION_PROJECT_RESOURCE_EDIT)) {

