        if (monitor.isCanceled()) {
            if (!filter.select(viewer, element.getParentNode(), element)) {
                    monitor.done();
 */
                    }
            for (DBNNode container : change ? collectInfo.targetContainers : Collections.singletonList(element)) {
        this.autoCheckNested = autoCheckNested;
                    for (Object element : elements) {

import org.jkiss.dbeaver.DBException;
 *
        if (onlyChecked && !collectInfo.wasChecked && !isChecked) {
                parentList.add(node);

                        for (DBNNode node : directChildren) {

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            false);
        if (!ArrayUtils.isEmpty(children)) {
import java.util.*;
    public boolean isAutoCheckNested() {
    private final ViewerFilter[] filters;
                    try {
                            if (change) {
    private final IdentityHashMap<Object, Boolean> checkedElements = new IdentityHashMap<>();
    }
        } catch (InterruptedException e) {
        this.filters = viewer.getFilters();
                            } else {
    public void setAutoCheckNested(boolean autoCheckNested) {
            }
                    }
            // Uncheck event - this element never was checked so just skip it with all ts children
                return true;
import org.jkiss.dbeaver.ui.UIUtils;
                } else {
        }
                }
            for (DBNNode child : children) {
    public void checkStateChanged(final CheckStateChangedEvent event) {
                        continue;
            boolean foundChild = false;
        return false;
                                        break;
    private boolean collectChildren(DBRProgressMonitor monitor, DBNNode element, final CollectInfo collectInfo, boolean onlyChecked) throws DBException {
        }
import org.jkiss.dbeaver.model.navigator.DBNNode;
            return false;
    private boolean autoCheckNested = true;
            if (foundChild) {
                }
    }
        });
                return false;
                    if (!type.isInstance(element)) {
                try {
    public void updateCheckStates() {

        DBNNode[] children = element.getChildren(monitor);
        Set<DBNNode> parentList = new LinkedHashSet<>();
                                for (DBNNode parent = ((DBNNode) element).getParentNode(); parent != null; parent = parent.getParentNode()) {
                        if (collectChildren(monitor, child, collectInfo, false)) {
                    collectInfo.targetContainers.add(element);

            new Object[] {event.getElement()},
    private static class CollectInfo {
                }
        for (Object ce : viewer.getCheckedElements()) {
                        }
 * you may not use this file except in compliance with the License.
                    }
                        continue;
                if (onlyChecked) {
import org.eclipse.jface.viewers.ICheckStateListener;
/*
                    if (directChildren != null) {
                for (DBNNode child : collectInfo.targetChildren) {
                                    updateElementHierarchy(monitor, parent, collectInfo, false);
                    }
                                }

                    DBNNode[] directChildren = container.getChildren(monitor);
            // ignore
                viewer.setChecked(node, true);
                collectInfo.targetChildren.add(element);
                    }
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void updateElementsCheck(Object[] elements, boolean checked, boolean change, boolean forceNestedCheck) {
 * See the License for the specific language governing permissions and
                        break;
                monitor.beginTask("Load sources tree", 100 * elements.length);
        }
 * Unless required by applicable law or agreed to in writing, software
        try {
    private final DBRRunnableContext runnableContext;
                    if (onlyChecked) {
            if (change) {
                } catch (DBException e) {
                    viewer.setChecked(child, collectInfo.wasChecked);


public class DatabaseObjectsTreeManager implements ICheckStateListener {
        if (!autoCheckNested) {
    }
                        }
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.lang.reflect.InvocationTargetException;
                            }
    }
                                // Update parent state
import org.jkiss.utils.ArrayUtils;
        }
                        monitor.subTask("Search in '" + node.getName() + "'");
            for (DBNNode node = ((DBNNode)element).getParentNode(); node != null; node = node.getParentNode()) {
            return;
                                    if (parent instanceof DBNDataSource) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        boolean wasChecked;
                        collectInfo.rootElement = node;
 *

import org.jkiss.dbeaver.Log;
        }
                        viewer.setGrayed(container, missingOne);

import org.eclipse.jface.viewers.CheckboxTreeViewer;
        }

    }
    private void updateElementHierarchy(final DBRProgressMonitor monitor, final DBNNode element, final CollectInfo collectInfo, final boolean change) throws DBException {
        updateElementsCheck(
        }

                        collectInfo.wasChecked = checked;
                if (filterObjects) {
        for (ViewerFilter filter : filters) {
                    }
    }
                    if (checkedElements.containsKey(child)) {
            }
            //UIUtils.showErrorDialog(viewer.getControl().getShell(), "Error", "Can't collect child nodes", e.getTargetException());
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.runnableContext = runnableContext;
                } finally {
                                    }
import org.eclipse.jface.viewers.CheckStateChangedEvent;
                boolean filterObjects = !(DBNNode.class.isAssignableFrom(type));
                }
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
                                missingAll = false;
            checkedElements.put(ce, Boolean.TRUE);
                        if (autoCheckNested || forceNestedCheck) {
        viewer.addCheckStateListener(this);
 * You may obtain a copy of the License at
                    if (!(element instanceof DBNDatabaseNode) || !type.isInstance(((DBNDatabaseNode) element).getObject())) {
        } catch (DBException e) {
            event.getChecked(),
            }
                            updateElementHierarchy(monitor, node, collectInfo, change);
package org.jkiss.dbeaver.ui.navigator.database;
            }));
    private final Class<?>[] targetTypes;
        boolean inWizard = UIUtils.isInWizard(viewer.getControl());
 *
        final List<DBNNode> targetContainers = new ArrayList<>();
        // Run ui
            }
                        if (!(element instanceof DBNNode)) {
                        foundChild = true;
                            if (!viewer.getChecked(node)) {
    public DatabaseObjectsTreeManager(DBRRunnableContext runnableContext, CheckboxTreeViewer viewer, Class<?>[] targetTypes) {
            ((DBNDatabaseNode)element).initializeNode(monitor, null);
    private final CheckboxTreeViewer viewer;

                        CollectInfo collectInfo = new CollectInfo();
            }

 * DBeaver - Universal Database Manager

                        boolean missingOne = false, missingAll = true;
                    } catch (DBException e) {
            }
    }
                        checkedElements.put(element, Boolean.TRUE);
                            }
        for (Object element : viewer.getCheckedElements()) {
        if (element instanceof DBNDatabaseNode) {
        if (!onlyChecked || isChecked) {
                } else {
            return false;
        }
        } catch (InvocationTargetException e) {

        DBNNode rootElement;
            return foundChild;
            for (Class<?> type : targetTypes) {
        checkedElements.clear();

                    }
            log.debug("Error collecting child elements", e);
                        }
                        log.debug("Error reading child nodes of '" + child.getName() + "'", e);
        return autoCheckNested;

                if (!collectInfo.targetContainers.contains(element)) {
import org.eclipse.jface.viewers.ViewerFilter;
}
        final List<DBNNode> targetChildren = new ArrayList<>();
                    // shouldn't be here
    private static final Log log = Log.getLog(DatabaseObjectsTreeManager.class);
            }
        this.targetTypes = targetTypes;
            collectChildren(monitor, element, collectInfo, !change);

                }
            runnableContext.run(!inWizard, true, (monitor -> {
                try {
        this.viewer = viewer;
                }
                    throw new InvocationTargetException(e);
 * limitations under the License.
            log.error("Error updating checkbox state", e.getTargetException());
        boolean isChecked = checkedElements.containsKey(element) || element == collectInfo.rootElement;

    }
                            continue;
                            foundChild = true;
        UIUtils.syncExec(() -> {
        updateElementsCheck(parentList.toArray(), true, false, false);
                                missingOne = true;
import org.jkiss.dbeaver.model.navigator.DBNDataSource;
                        DBNNode node = (DBNNode)element;
            true,
        }

                        }
        }
    @Override
                        viewer.setChecked(container, change ? collectInfo.wasChecked : !missingAll);
                } catch (DBException e) {
                        monitor.worked(1);
    }
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
        try {
