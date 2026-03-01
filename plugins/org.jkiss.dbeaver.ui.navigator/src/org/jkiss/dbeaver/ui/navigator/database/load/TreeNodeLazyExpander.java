        }
    }
 *
        return visibleChildren;
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.dbeaver.model.navigator.DBNNode;
        System.arraycopy(allChildren, visibleChildren, nodes, 0, nextSegmentSize);
    public int getVisibleChildren() {
        return true;
    private DBNNode[] allChildren;
import org.jkiss.dbeaver.ui.DBeaverIcons;

    private int visibleChildren;
        boolean lastSegment = visibleChildren + longListFetchSize > allChildren.length;
}    }
    public boolean handleDefaultAction(@NotNull DatabaseNavigatorTree tree) {
        if (!lastSegment) {
package org.jkiss.dbeaver.ui.navigator.database.load;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        this.visibleChildren = visibleChildren;
        treeControl.setRedraw(false);
    }
        super(parent);
    public Image getImage(Object element) {

        } finally {
        }
 * See the License for the specific language governing permissions and
    @Override

 *
 * limitations under the License.
            tree.getViewer().add(getParent(), nodes);
        try {
    @Override
        return "More ... (" + visibleChildren + "/" + allChildren.length + ")";
            treeControl.setRedraw(true);
 *     http://www.apache.org/licenses/LICENSE-2.0

 * You may obtain a copy of the License at
            tree.getViewer().remove(this);
public class TreeNodeLazyExpander extends TreeNodeSpecial {

        return IMG_MORE;
 *
        int nextSegmentSize = lastSegment ? allChildren.length - visibleChildren : longListFetchSize;
import org.jkiss.dbeaver.ui.UIIcon;
 * DBeaver - Universal Database Manager
import org.eclipse.swt.widgets.Tree;
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTree;
    private static Image IMG_MORE = DBeaverIcons.getImage(UIIcon.REFRESH);
 * Unless required by applicable law or agreed to in writing, software

 * you may not use this file except in compliance with the License.
 */


            nodes[nextSegmentSize] = new TreeNodeLazyExpander(getParent(), allChildren, visibleChildren + nextSegmentSize);
    @Override
import org.jkiss.dbeaver.ui.navigator.NavigatorPreferences;
        int longListFetchSize = Math.max(NavigatorPreferences.MIN_LONG_LIST_FETCH_SIZE, DBWorkbench.getPlatform().getPreferenceStore().getInt(NavigatorPreferences.NAVIGATOR_LONG_LIST_FETCH_SIZE));
    public TreeNodeLazyExpander(DBNNode parent, DBNNode[] allChildren, int visibleChildren) {
/*
import org.jkiss.code.NotNull;
import org.eclipse.swt.graphics.Image;
 * distributed under the License is distributed on an "AS IS" BASIS,
        Tree treeControl = tree.getViewer().getTree();
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.allChildren = allChildren;

        Object[] nodes = new Object[lastSegment ? nextSegmentSize : nextSegmentSize + 1];
    public String getText(Object element) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }


