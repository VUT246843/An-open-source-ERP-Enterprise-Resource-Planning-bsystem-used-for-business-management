 * Copyright (C) 2010-2024 DBeaver Corp and others
                        }
 *
        } else {
    private final Class<?>[] resultTypes;
        @NotNull DBNNode rootNode,
        @NotNull String title,
        @NotNull String title,
    ) {
                    }
        return new ViewerFilter() {
    ) {
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
    }

            title,
 *
            resultTypes,

        @Nullable Class<?>[] leafTypes
            allowedTypes,
                    element instanceof DBNPathBase
import org.jkiss.dbeaver.model.navigator.fs.DBNFileSystem;
            rootNode,
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeNode;
    @Override

                        return true;
    }
            public boolean isLeafObject(Object object) {
                    if (element instanceof DBNLocalFolder) {
                            }
        @Nullable Class<?>[] resultTypes,
 * Licensed under the Apache License, Version 2.0 (the "License");
                }
        ObjectBrowserDialog scDialog = new ObjectBrowserDialog(
        return selectObject(parentShell, title, rootNode, selectedNode, allowedTypes, resultTypes, leafTypes, null);
                        if (dbObject != null) {
import org.eclipse.jface.viewers.Viewer;
            return null;
    @Nullable
        );
        for (Class<?> ot : result ? resultTypes : allowedTypes) {
 *
    @Override
            List<DBNNode> result = scDialog.getSelectedObjects();
        } else {
        this.resultTypes = resultTypes == null ? allowedTypes : resultTypes;
import org.eclipse.swt.widgets.Shell;
import java.util.function.Predicate;
    {
            return null;
import java.util.List;
            }
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
        return false;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @NotNull Class<?>[] allowedTypes,
                if (leafTypes != null && leafTypes.length > 0) {
                        return ((DBNDataSource) element).getDataSource() != null;
            @Override
        @NotNull Shell parentShell,
                if (element instanceof DBNNode) {
                    if (!(element instanceof DBNDatabaseNode) && !((DBNNode) element).isPersisted()) {
    @Override
                        // Show non-database nodes
    }
    }
 * ObjectBrowserDialog
                ) {
            @Override
import org.jkiss.dbeaver.ui.navigator.database.load.TreeNodeSpecial;
    }
import org.jkiss.utils.CommonUtils;
        @Nullable Predicate<String> nameFilter
            return scDialog.getSelectedObjects();
        }
                    if (element instanceof DBNProject || element instanceof DBNProjectDatabases ||
    public static DBNNode selectObject(
        @Nullable Class<?>[] leafTypes,
    }
                    if (element instanceof DBNDatabaseFolder folder) {
                    }
        @Nullable DBNNode selectedNode,
                        return folderItemsClass != null && matchesType(folderItemsClass, false);
    @Nullable
            CommonUtils.singletonOrEmpty(selectedNode),
    }

                    }
        };
import org.eclipse.jface.dialogs.IDialogConstants;
    )
        }
                return false;

            }
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTreeFilter;
import org.jkiss.dbeaver.model.navigator.fs.DBNPathBase;
                                if (leafType.isAssignableFrom(dbObject.getClass())) {
            title,
        ObjectBrowserDialog scDialog = new ObjectBrowserDialog(

        if (nameFilter != null) {
                    element instanceof DBNFileSystem ||
 * DBeaver - Universal Database Manager
                        DBNDatabaseNode node = (DBNDatabaseNode) object;
            return result.isEmpty() ? null : result.get(0);
    private boolean matchesType(Class<?> nodeType, boolean result)
        @NotNull Shell parentShell,
        @Nullable Class<?>[] resultTypes,

        @NotNull List<? extends DBNNode> selectedNodes,
}
        @Nullable Class<?>[] resultTypes,
    }
    }
            }

        super(parentShell, title, rootNode, selectedNodes, singleSelection);
                return true;
                    if (element instanceof DBNDataSource) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        for (Class<?> ot : result ? resultTypes : allowedTypes) {
    private ObjectBrowserDialog(
                    }
            leafTypes
 * you may not use this file except in compliance with the License.
        @NotNull Class<?>[] allowedTypes,
        @NotNull DBNNode rootNode,

    public static DBNNode selectObject(
public class ObjectBrowserDialog extends ObjectBrowserDialogBase {
 * limitations under the License.
        if (scDialog.open() == IDialogConstants.OK_ID) {
            false,
 */
        this.allowedTypes = allowedTypes;
 * Unless required by applicable law or agreed to in writing, software
    public static List<DBNNode> selectObjects(
    private final Class<?>[] leafTypes;
/**
        @NotNull DBNNode rootNode,
                                        return !DBNNode.nodeHasStructureContainers(node, meta); // Special case. Node has structure container inside if true (can be recursion)
                if (nameFilter != null && element instanceof DBNNode node && !node.hasChildren(false) && !nameFilter.test(node.getName())) {
                }
        };
        }
    private Predicate<String> nameFilter;
                                    if (DBSObjectContainer.class.isAssignableFrom(leafType)) {
                if (element instanceof TreeNodeSpecial ||
                        Class<? extends DBSObject> folderItemsClass = folder.getChildrenClass();
    protected DatabaseNavigatorTreeFilter createNavigatorFilter() {
                        return ((DBNLocalFolder) element).hasConnected();
                                    return true;
                        return true;
                                }
        @NotNull Class<?>[] allowedTypes,
import org.jkiss.code.Nullable;
                            for (Class<?> leafType : leafTypes) {
        @NotNull Shell parentShell,
import org.jkiss.dbeaver.model.navigator.*;
                return super.isLeafObject(object);
            rootNode,
                                    }
    protected ViewerFilter createViewerFilter() {
        return new DatabaseNavigatorTreeFilter() {
    private final Class<?>[] allowedTypes;
            scDialog.setNameFilter(nameFilter);
 * See the License for the specific language governing permissions and

        @NotNull String title,
        this.nameFilter = nameFilter;
                return true;
 * @author Serge Rider
import org.jkiss.dbeaver.model.struct.DBSObject;
        @Nullable Class<?>[] leafTypes
            if (ot.isAssignableFrom(nodeType)) {
                        element instanceof DBNDataSource ||
        }
                    }
package org.jkiss.dbeaver.ui.navigator.dialogs;
                    return false;
        @NotNull DBNNode rootNode,
        @NotNull Shell parentShell,
            if (ot.isAssignableFrom(object.getClass())) {
            public boolean select(Viewer viewer, Object parentElement, Object element) {
import org.jkiss.code.NotNull;
        @NotNull String title,
                    ) {

        @NotNull List<? extends DBNNode> selectedNodes,
                        DBSObject dbObject = node.getObject();
                if (isShowConnected()) {
        }
                }
                    if (object instanceof DBNDatabaseNode) {
        @Nullable Class<?>[] leafTypes
        return false;
        if (scDialog.open() == IDialogConstants.OK_ID) {
 */

import org.jkiss.dbeaver.model.struct.DBSWrapper;
        this.leafTypes = leafTypes;
import org.eclipse.jface.viewers.ViewerFilter;
            allowedTypes,
        @Nullable DBNNode selectedNode,
            parentShell,
    {
        );
            resultTypes,
                    return true;
                    element instanceof DBNLocalFolder ||
            true,
                }
                        (element instanceof DBSWrapper wrapper && matchesType(wrapper.getObject().getClass(), false))
    ) {
    @Nullable
    public void setNameFilter(Predicate<String> nameFilter) {
 *
                }
        @NotNull Class<?>[] allowedTypes,
            selectedNodes,
/*
            leafTypes
    protected boolean matchesType(Object object, boolean result) {
        @Nullable Class<?>[] resultTypes,
            parentShell,
 * You may obtain a copy of the License at
                        DBXTreeNode meta = node.getMeta();
        boolean singleSelection,
                    }

