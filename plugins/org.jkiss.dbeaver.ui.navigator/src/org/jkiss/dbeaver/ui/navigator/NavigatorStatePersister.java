    public static void restoreExpandedState(final TreeViewer navigatorViewer, final DBNNode rootNode, int maxDepth, final IMemento memento) {
            DBPDataSourceContainer dsContainer = ((DBNDataSource) node).getDataSourceContainer();
        // avoid instantiation of utility class
import org.eclipse.ui.IMemento;
import org.jkiss.dbeaver.Log;
                    if (node != null && !node.isDisposed()) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                monitor.done();
import org.jkiss.dbeaver.model.runtime.AbstractJob;
import org.jkiss.dbeaver.model.navigator.DBNNode;
                } catch (InterruptedException e) {
            {
                setUser(true);
        UIUtils.asyncExec(expandJob::schedule);
                    break;
            identifier.append(currentNode.getNodeDisplayName()).append("/");
            long connectionStart = System.currentTimeMillis();
    private static void initializeNode(DBNNode node, DBRProgressMonitor monitor) throws DBException {
import org.eclipse.swt.SWT;
                tree.setFilterObjectType(type);
    }
        return identifier.toString();
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTree;
            .map(memento::getString)
                try {
import org.eclipse.core.runtime.IStatus;
                monitor.beginTask("Expand navigator nodes", nodeIdentifiers.length);
    }
/*
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
}
            initializeNode(rootNode, monitor);
            .filter(x -> x.startsWith(KEY_PREFIX))
    private static final String KEY_PREFIX = "element";
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTreeFilterObjectType;
            final String text = memento.getString(PROP_FILTER_TEXT);

import java.util.Arrays;
import org.jkiss.dbeaver.ui.ActionUtils;
    }

package org.jkiss.dbeaver.ui.navigator;
    private static final String PROP_FILTER_TYPE = "filterType";
import org.jkiss.dbeaver.utils.RuntimeUtils;
                    if (monitor.isCanceled()) {
            protected IStatus run(@NotNull DBRProgressMonitor monitor) {
                // Wait a few seconds to let in-progress connection initialize
        for (int i = 0; i < expandedElements.length; i++)


import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
            final Text filterControl = tree.getFilterControl();
            }

        for (DBNNode currentNode = node; currentNode != null; currentNode = currentNode.getParentNode()) {

                }
        if (node instanceof DBNDataSource) {
                    runnable.run(monitor);
import org.jkiss.utils.CommonUtils;
                memento.getString(PROP_FILTER_TYPE),
    private static final String PROP_FILTER_TEXT = "filterText";
 */
            .toArray(String[]::new);
        if (nodeIdentifiers.length == 0) {
        node.getChildren(monitor);
        UIUtils.syncExec(() -> {
                return Status.OK_STATUS;
                    // ignore

        final Text filterControl = tree.getFilterControl();
import java.lang.reflect.InvocationTargetException;
import org.jkiss.dbeaver.ModelPreferences;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        }
                } catch (InvocationTargetException e) {
 *
                        UIUtils.syncExec(() -> navigatorViewer.setExpandedState(node, true));
        return null;

                    }

                RuntimeUtils.pause(100);
                return rootNode;
                    for (DBNNode newRootNode : childNodes)
 *
 *

import org.jkiss.dbeaver.ui.UIUtils;
    }
            }
    private static final Log log = Log.getLog(NavigatorStatePersister.class);
                setSystem(false);
                DBNNode[] childNodes = rootNode.getChildren(monitor);

 * you may not use this file except in compliance with the License.
            }
                    tree.getViewer().refresh();
import org.jkiss.dbeaver.model.navigator.DBNDataSource;
                dsContainer.connect(monitor, true, false);
        DBRRunnableWithProgress runnable = (monitor) -> {
            }
        final String[] nodeIdentifiers = Arrays.stream(memento.getAttributeKeys())

        };
                    }
            while (!dsContainer.isConnected()) {
        AbstractJob expandJob = new AbstractJob("Expand navigator nodes") {
            }
            }
 * distributed under the License is distributed on an "AS IS" BASIS,
                        break;
        memento.putString(PROP_FILTER_TYPE, tree.getFilterObjectType().name());
import org.eclipse.core.runtime.Status;
                }
            if (CommonUtils.isNotEmpty(text) && filterControl != null && !filterControl.isDisposed()) {
    private static String createNodeIdentifier(DBNNode node) {
 * Unless required by applicable law or agreed to in writing, software
                try {
            try {
    public static void restoreFilterState(@NotNull DatabaseNavigatorTree tree, @NotNull IMemento memento) {
import org.jkiss.code.NotNull;
            if (type != null && tree.getFilterObjectType() != type) {
        if (currentDepth <= maxDepth) {
    public static void saveFilterState(@NotNull DatabaseNavigatorTree tree, @NotNull IMemento memento) {
    }
        }
import org.eclipse.swt.widgets.Event;
        }
        }
import org.eclipse.swt.widgets.Text;

            } catch (Exception e) {
            @NotNull
                filterControl.setText(text);
public class NavigatorStatePersister {
            final DatabaseNavigatorTreeFilterObjectType type = CommonUtils.valueOf(
                if (connectionTimeout > 0 && connectionStart + connectionTimeout <= System.currentTimeMillis()) {
                DatabaseNavigatorTreeFilterObjectType.connection
                    tree.getViewer().getControl().setRedraw(true);
                tree.getViewer().getControl().setRedraw(false);
            );
import org.eclipse.jface.viewers.TreeViewer;
        }
        };
    }
            memento.putString(KEY_PREFIX + i, createNodeIdentifier((DBNNode) expandedElements[i]));
    public static void saveExpandedState(Object[] expandedElements, IMemento memento) {
            @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
    private NavigatorStatePersister() {
        StringBuilder identifier = new StringBuilder();
                }
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                            return findNode(nodeIdentifier, newRootNode, currentDepth + 1, maxDepth, monitor);
import org.jkiss.dbeaver.DBException;
                }

            return;
 * DBeaver - Universal Database Manager
        if (filterControl != null && !filterControl.isDisposed() && CommonUtils.isNotEmpty(filterControl.getText())) {
                ActionUtils.fireCommandRefresh(NavigatorCommands.CMD_FILTER_OBJECT_TYPE);
    private static DBNNode findNode(String nodeIdentifier, DBNNode rootNode, int currentDepth, int maxDepth, DBRProgressMonitor monitor) throws DBException {
                    log.error(e);
                if (childNodes != null)
                for (String nodeIdentifier : nodeIdentifiers) {
        }
                    DBNNode node = findNode(nodeIdentifier, rootNode, 1, maxDepth, monitor);
            long connectionTimeout = dsContainer.getPreferenceStore().getInt(ModelPreferences.CONNECTION_VALIDATION_TIMEOUT);
                filterControl.notifyListeners(SWT.Modify, new Event());
                        if (nodeIdentifier.contains(createNodeIdentifier(newRootNode)))
 *     http://www.apache.org/licenses/LICENSE-2.0

            if (nodeIdentifier.equals(createNodeIdentifier(rootNode)))
                DatabaseNavigatorTreeFilterObjectType.class,

 * limitations under the License.
 * You may obtain a copy of the License at
                throw new InvocationTargetException(e);
        });
 * See the License for the specific language governing permissions and
        if (memento == null) {
                    monitor.subTask("Expand node " + nodeIdentifier);
                } finally {
            memento.putString(PROP_FILTER_TEXT, filterControl.getText());
            return;
            if (currentDepth < maxDepth) {
