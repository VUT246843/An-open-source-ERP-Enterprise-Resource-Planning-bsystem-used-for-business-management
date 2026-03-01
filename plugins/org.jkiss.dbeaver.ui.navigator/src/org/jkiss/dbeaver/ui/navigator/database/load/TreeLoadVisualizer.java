                    // Some error occurred. In good case children must be at least an empty array
        this.parent = parent;

        return placeHolder.isDisposed() || viewer.testFindItem(parent) == null;
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
/*
        final Control viewerControl = viewer.getControl();
 * limitations under the License.
        return EMPTY_ELEMENT_ARRAY;
            TreeLoadVisualizer visualizer = new TreeLoadVisualizer(viewer, placeHolder, parent);
    }
            return new Object[]{placeHolder};
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.viewer = viewer;
/**
    private final TreeNodeSpecial placeHolder;
                    if (viewerControl instanceof Tree) {
                    if ((item.getParentItem() == null || !item.getParentItem().isDisposed()) || this.parent instanceof IWorkspaceRoot) {
                if (!ArrayUtils.isEmpty(children)) {
        this.placeHolder = placeHolder;
                if (item != null && !item.isDisposed()) {
                }
            return;
                viewerControl.setRedraw(true);
 */
import org.eclipse.swt.widgets.Table;
 */

 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
 * TreeLoadVisualizer
import org.jkiss.dbeaver.model.runtime.load.ILoadVisualizer;

import org.eclipse.jface.viewers.AbstractTreeViewer;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                    }
                        viewer.refresh(parent);
 *
        } finally {
import org.eclipse.swt.widgets.Tree;
                    }
                        viewer.setInput(viewer.getInput());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
    private final DBNNode parent;
import org.jkiss.dbeaver.model.navigator.DBNNode;
        DBNNode parent = service.getParentNode();
    public void visualizeLoading() {
                        isEmpty = ((Tree) viewerControl).getItemCount() == 0;

import org.eclipse.swt.widgets.TreeItem;
        }
import org.jkiss.dbeaver.ui.LoadingJob;
        viewer.refresh(placeHolder, true);
        }
        if (viewerControl.isDisposed()) {
    public DBRProgressMonitor overwriteMonitor(DBRProgressMonitor monitor) {

 * See the License for the specific language governing permissions and
                }
    @Override
                TreeItem item = (TreeItem) viewer.testFindItem(placeHolder);
                    }
    @Override
                    } else if (viewerControl instanceof Table) {
    @Override
    }
package org.jkiss.dbeaver.ui.navigator.database.load;
                    } else {
    public static Object[] expandChildren(AbstractTreeViewer viewer, TreeLoadService service) {

 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.swt.widgets.Control;
    private final AbstractTreeViewer viewer;
 * You may obtain a copy of the License at
public class TreeLoadVisualizer implements ILoadVisualizer<Object[]> {
                if (children == null) {
        if (TreeNodeChildrenLoading.canBeginLoading(parent)) {
    }
                    viewer.collapseToLevel(parent, AbstractTreeViewer.ALL_LEVELS);
    }
            LoadingJob.createService(service, visualizer).schedule();

        return monitor;
    }
            {
            placeHolder.dispose(parent);
            if (!viewerControl.isDisposed()) {


                        viewer.remove(placeHolder);
    @Override
    }
 *
import org.jkiss.utils.ArrayUtils;

        TreeNodeSpecial placeHolder = TreeNodeChildrenLoading.createLoadingPlaceHolder(parent);
                    boolean isEmpty = false;
import org.eclipse.core.resources.IWorkspaceRoot;

                        isEmpty = ((Table) viewerControl).getItemCount() == 0;
        }
    public boolean isCompleted() {
                    if (isEmpty) {
    public static final Object[] EMPTY_ELEMENT_ARRAY = new Object[0];
}
            }
 * Copyright (C) 2010-2024 DBeaver Corp and others
            viewerControl.setRedraw(false);
        try {



    public void completeLoading(Object[] children) {
    public TreeLoadVisualizer(AbstractTreeViewer viewer, TreeNodeSpecial placeHolder, DBNNode parent) {
                }
