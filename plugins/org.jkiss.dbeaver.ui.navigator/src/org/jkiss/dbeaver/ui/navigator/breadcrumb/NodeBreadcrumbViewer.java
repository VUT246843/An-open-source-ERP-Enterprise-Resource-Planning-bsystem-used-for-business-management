            return parent;
                return children;
import org.jkiss.dbeaver.ui.DBeaverIcons;
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
        @Override
                return null; // don't show anything below data sources
        @Override

        setContentProvider(new BreadcrumbNodeContentProvider(false));
        public Object[] getElements(Object inputElement) {
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
        }
        @Nullable
 * you may not use this file except in compliance with the License.

                log.error("Error getting children", e); // should not happen
        public Object getParent(Object element) {
                parent = parent.getParentNode(); // skip folder nodes
            if (parent != null) {
            while (parent instanceof DBNDatabaseFolder) {
            } catch (DBException e) {
    }
 *
import org.jkiss.code.NotNull;
        }
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @Override
            return new Object[0];
        }
import org.jkiss.code.Nullable;
                return null;
package org.jkiss.dbeaver.ui.navigator.breadcrumb;
            return new Object[0];
                return getChildren(parent);
import org.jkiss.utils.ArrayUtils;
                return !ArrayUtils.isEmpty(getCachedChildren((DBNNode) element));
        }
 * Copyright (C) 2010-2025 DBeaver Corp and others
        }
import org.jkiss.dbeaver.model.navigator.DBNNode;

            return ((DBNNode) element).getNodeDisplayName();
    private record BreadcrumbNodeContentProvider(boolean allowFoldersOnly) implements ITreeContentProvider {
            } else {
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
        addDoubleClickListener(e -> openEditor(e.getSelection()));
        @Override
            DBNNode child = (DBNNode) inputElement;
            return DBeaverIcons.getImage(((DBNNode) element).getNodeIconDefault());
 */
        public boolean hasChildren(Object element) {
        setLabelProvider(new BreadcrumbNodeLabelProvider());
import org.jkiss.dbeaver.ui.controls.breadcrumb.BreadcrumbViewer;

import org.eclipse.jface.viewers.LabelProvider;
import org.jkiss.dbeaver.model.navigator.DBNDatabaseFolder;
import org.jkiss.dbeaver.model.runtime.LocalCacheProgressMonitor;
            if (!allowFoldersOnly || element instanceof DBNLocalFolder) {
            }
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * Unless required by applicable law or agreed to in writing, software
            DBWorkbench.getPlatformUI().openEntityEditor(node, null);
            DBNNode child = (DBNNode) element;
        addOpenListener(e -> openEditor(e.getSelection()));
            }
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
        }
        public Object[] getChildren(Object parentElement) {
        if (selection instanceof IStructuredSelection ss && ss.getFirstElement() instanceof DBNNode node) {
    private static final Log log = Log.getLog(NodeBreadcrumbViewer.class);
}
            }

            if (child instanceof DBNDataSource) {
        }
        public String getText(Object element) {
        @Override

            try {
import org.eclipse.swt.graphics.Image;
        }
import org.jkiss.dbeaver.model.navigator.DBNDataSource;

            }



    }



 * See the License for the specific language governing permissions and
        @Override
            }
import org.jkiss.dbeaver.DBException;
 * distributed under the License is distributed on an "AS IS" BASIS,
    public NodeBreadcrumbViewer(@NotNull Composite parent, int style) {
        public Image getImage(Object element) {
 * DBeaver - Universal Database Manager
            DBNNode parent = child.getParentNode();
import org.jkiss.dbeaver.Log;
        private static DBNNode[] getCachedChildren(@NotNull DBNNode parent) {
    }
 *
    private static void openEditor(@NotNull ISelection selection) {
 * A {@link DBNNode}-oriented specialization of {@link BreadcrumbViewer}.
 * You may obtain a copy of the License at
 * limitations under the License.
import org.eclipse.jface.viewers.ISelection;
    private static class BreadcrumbNodeLabelProvider extends LabelProvider {
 *
            DBNNode parent = child.getParentNode();
        super(parent, style);

                return parent.getChildren(new LocalCacheProgressMonitor(new VoidProgressMonitor()));
            var children = getCachedChildren((DBNNode) parentElement);
import org.eclipse.swt.widgets.Composite;
import org.jkiss.dbeaver.model.navigator.DBNLocalFolder;
            if (children != null) {

/**
        setDropDownContentProvider(new BreadcrumbNodeContentProvider(true));
                return false;
public class NodeBreadcrumbViewer extends BreadcrumbViewer {
    }
