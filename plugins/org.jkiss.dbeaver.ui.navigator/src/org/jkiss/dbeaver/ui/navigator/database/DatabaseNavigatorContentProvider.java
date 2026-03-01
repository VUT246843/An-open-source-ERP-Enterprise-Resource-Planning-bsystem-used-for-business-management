                    return false;
                    return EMPTY_CHILDREN;
 * limitations under the License.
            if (navigatorTree.getNavigatorFilter() != null && navigatorTree.getNavigatorFilter().isLeafObject(parent)) {
            }
            if (rootNode == null) {
            boolean isMatchingNeeded = children.length > 0 && navigatorTree.isMatchingNeeded(children[0]);
        this.navigatorTree = navigatorTree;
            final List<Object> nodes = new ArrayList<>(maxFetchSize);
import org.jkiss.dbeaver.runtime.DBWorkbench;
            return null;
        if (parent.isFiltered() || maxFetchSize < children.length) {
            return navigatorTree.isFilterActive() && isMatchingNeeded;
        } else {
        } else {

                    //navigatorTree.getViewer().refresh(parent);
    private final DatabaseNavigatorTree navigatorTree;
        } else if (children.length == 0) {
            }
            return EMPTY_CHILDREN;
    }
                // and no blocking process will occur
 * You may obtain a copy of the License at
        } else if (searchBarIsActive) {
        if (parent instanceof TreeNodeSpecial) {
                nodes.addAll(List.of(children).subList(0, maxFetchSize));
        } else {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                });
                            "Error during node load",

                    parentNode));
                    if (lastLoadError != null) {
    public Object[] getElements(Object parent) {
    @Override
        }
public class DatabaseNavigatorContentProvider implements IStructuredContentProvider, ITreeContentProvider {
                nodeName = parentNode.getParentNode().getNodeDisplayName() + " " + nodeName;
                    new VoidProgressMonitor(), parentNode, true);
 * DatabaseNavigatorContentProvider
                return false;
            if (maxFetchSize < children.length) {
            String nodeName = parentNode.getNodeDisplayName();

                return getFinalNodes(parentNode, children);
            return EMPTY_CHILDREN;
        } else if (child instanceof TreeNodeSpecial node) {
import org.jkiss.dbeaver.model.struct.DBSEntity;

            return node.getLogicalParent();
    public Object getParent(Object child) {
                return getChildren(rootNode);
            final List<Object> nodes = new ArrayList<>();

            nodes.addAll(List.of(children));
 * Copyright (C) 2010-2025 DBeaver Corp and others
/*
    @Override
    @NotNull
import org.jkiss.dbeaver.ui.UIUtils;
                            lastLoadError));
    public boolean hasChildren(Object parent) {
import org.jkiss.dbeaver.Log;
            if (parent.isFiltered()) {

            } catch (Throwable ex) {
import org.jkiss.dbeaver.ui.navigator.NavigatorPreferences;
            return children;
                    navigatorTree.getViewer().collapseToLevel(parent, 1);
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
                if (searchBarIsActive) {
            return TreeLoadVisualizer.expandChildren(
        } else {
        }
                // Collapse this item
        } else if (child instanceof DBNNode node) {
    private final boolean showRoot;
            return node.getParentNode();
                } else {
                    DBWorkbench.getPlatformUI().showError(
                if (dbNode.getObject() instanceof DBSEntity) {
    private static final Object[] EMPTY_CHILDREN = new Object[0];
        final int maxFetchSize = Math.max(
                nodes.addAll(List.of(children));
                    UINavigatorMessages.ui_navigator_loading_text_loading.trim() + ": " + nodeName,
                navigatorTree.getViewer(),
 */
 * Unless required by applicable law or agreed to in writing, software
        return parent instanceof DBNNode node && node.hasChildren(true);
        if (child instanceof DBNLocalFolder node) {
            if (showRoot) {
            } else {

            }

        this.showRoot = showRoot;
import org.jkiss.dbeaver.model.navigator.*;
        boolean searchBarIsActive = isSearchBarActive(children);
        if (parent instanceof DBNDatabaseNode dbNode) {
 * Licensed under the Apache License, Version 2.0 (the "License");
            DBNNode rootNode = content.getRootNode();
            return nodes.toArray();
            }
    @Override
                }
        if (navigatorTree == null) {
                if (children == null) {
                            CommonUtils.notEmpty(lastLoadError.getMessage()),
                    }
            return nodes.toArray();
            DBWorkbench.getPlatform().getPreferenceStore().getInt(NavigatorPreferences.NAVIGATOR_LONG_LIST_FETCH_SIZE)
    }
                new TreeLoadService(
                UIUtils.asyncExec(() -> {
                return EMPTY_CHILDREN;
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
import java.util.List;

                return EMPTY_CHILDREN;
import org.jkiss.code.NotNull;

    }
 *
    public DatabaseNavigatorContentProvider(DatabaseNavigatorTree navigatorTree, boolean showRoot) {
        }

import org.eclipse.jface.viewers.ITreeContentProvider;
                        UIUtils.asyncExec(() -> DBWorkbench.getPlatformUI().showError(

                return new Object[]{rootNode};
 */
                        ex);
            }
        }
                        ex.getMessage(),
            return false;
import org.jkiss.dbeaver.ui.navigator.database.load.*;
 * DBeaver - Universal Database Manager
 *
            NavigatorPreferences.MIN_LONG_LIST_FETCH_SIZE,
        if (!parentNode.hasChildren(true)) {
                    nodes.add(new TreeNodeFilterSearch(parent));
package org.jkiss.dbeaver.ui.navigator.database;
    public Object[] getChildren(final Object parent) {
            if (parentNode instanceof DBNDatabaseFolder) {
                    nodes.add(new TreeNodeFilter(parent));
import java.util.ArrayList;
            return node.getParent();
import org.jkiss.utils.CommonUtils;
    }

            }
        if (parentNode instanceof DBNLazyNode lazyNode && lazyNode.needsInitialization()) {
        }
 * See the License for the specific language governing permissions and
                }
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
 * you may not use this file except in compliance with the License.
    }
            try {
        } else {
            } else {
    }

            return EMPTY_CHILDREN;
                    Throwable lastLoadError = parentNode.getLastLoadError();
}
            nodes.add(new TreeNodeSearch(parent));

                DBNNode[] children = DBNUtils.getNodeChildrenFiltered(
        );
                // Read children with null monitor cos' it's not a lazy node
                nodes.add(new TreeNodeLazyExpander(parent, children, maxFetchSize));

    private static final Log log = Log.getLog(DatabaseNavigatorContentProvider.class);
import org.eclipse.jface.viewers.IStructuredContentProvider;
        }

    }
    @Override
    private Object[] getFinalNodes(@NotNull DBNNode parent, @NotNull DBNNode[] children) {
                        "Navigator error",
        }
            if (dbNode.getDataSourceContainer().getNavigatorSettings().isShowOnlyEntities()) {
/**
            }
            return EMPTY_CHILDREN;
        if (!(parent instanceof DBNNode parentNode)) {
            }
 *
            return getChildren(parent);
    private boolean isSearchBarActive(@NotNull DBNNode[] children) {
                }
        }
        if (parent instanceof DatabaseNavigatorContent content) {

        }
