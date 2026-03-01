
 * you may not use this file except in compliance with the License.

    }
        return new DatabaseNavigatorTreeFilter();
*/
        });
        }
        // Ignore
    @Override
import org.jkiss.dbeaver.model.navigator.DBNNode;
    }

    public void init(IViewSite site, IMemento memento) throws PartInitException
import org.jkiss.dbeaver.model.navigator.DBNEmptyNode;
import org.eclipse.jface.viewers.StructuredSelection;
    public DatabaseNavigatorView()

        if (preferences.getInt(NavigatorPreferences.NAVIGATOR_RESTORE_STATE_DEPTH) > 0) {
import org.eclipse.swt.widgets.Composite;
        super();

    {
    @Override

            NavigatorStatePersister.restoreFilterState(getNavigatorTree(), memento);
/*
    }
    {
package org.jkiss.dbeaver.ui.navigator.database;


import org.jkiss.code.NotNull;
            @Override
        final int maxDepth = preferences.getInt(NavigatorPreferences.NAVIGATOR_RESTORE_STATE_DEPTH);
    {
        this.memento = memento;
import org.jkiss.dbeaver.ui.navigator.NavigatorStatePersister;
 *
        return projectNode == null ? new DBNEmptyNode() : projectNode.getDatabases();
        super.init(site, memento);
            NavigatorStatePersister.restoreExpandedState(getNavigatorViewer(), getRootNode(), maxDepth, memento);

 */
 *     http://www.apache.org/licenses/LICENSE-2.0
    public void saveState(IMemento memento) {
 * DBeaver - Universal Database Manager

        final DBPPreferenceStore preferences = DBWorkbench.getPlatform().getPreferenceStore();
    protected INavigatorFilter getNavigatorFilter() {
            nameColumn.getColumn().setWidth(treeWidth * 80 / 100);
        if (memento == null) {
    private void restoreState() {

import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * Unless required by applicable law or agreed to in writing, software
    }
        UIExecutionQueue.queueExec(this::restoreState);
 *

import org.jkiss.dbeaver.model.navigator.DBNProject;
    }
import org.jkiss.dbeaver.ui.navigator.INavigatorFilter;
 *
        DBPPlatformDesktop.getInstance().getWorkspace().addProjectListener(this);
import org.jkiss.dbeaver.ui.UIExecutionQueue;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
        DBPPlatformDesktop.getInstance().getWorkspace().removeProjectListener(this);
import org.eclipse.ui.PartInitException;
    private IMemento memento;
    }
        if (maxDepth > 0) {
    }
    @Override
    }
    public DBNNode getRootNode()
        nameColumn.setLabelProvider((CellLabelProvider) tree.getViewer().getLabelProvider());

        treeControl.addListener(SWT.Resize, event -> {
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    @Override
import org.jkiss.dbeaver.ui.IHelpContextIds;
            getSite().getSelectionProvider().setSelection(new StructuredSelection());
    }
        }
            statColumn.getColumn().setWidth(treeWidth * 20 / 100);
    public void handleProjectRemove(@NotNull DBPProject project) {
    {
 * See the License for the specific language governing permissions and
    public void handleProjectAdd(@NotNull DBPProject project) {
}
        final TreeViewerColumn statColumn = new TreeViewerColumn(tree.getViewer(), SWT.RIGHT);
import org.jkiss.dbeaver.model.app.DBPProject;
    public void dispose()
public class DatabaseNavigatorView extends NavigatorViewBase implements DBPProjectListener {
    public static final String VIEW_ID = "org.jkiss.dbeaver.core.databaseNavigator";

            return;
import org.eclipse.ui.IViewSite;
    @Override
    @Override
        Tree treeControl = tree.getViewer().getTree();
    @Override
    public void handleActiveProjectChange(@NotNull DBPProject oldValue, @NotNull DBPProject newValue)
    protected void createTreeColumns(DatabaseNavigatorTree tree) {
            NavigatorStatePersister.saveFilterState(getNavigatorTree(), memento);
        });

        }
    }
/*
        final TreeViewerColumn nameColumn = new TreeViewerColumn(tree.getViewer(), SWT.LEFT);
 * limitations under the License.
            }
        final DBPPreferenceStore preferences = DBWorkbench.getPlatform().getPreferenceStore();
        });
import org.jkiss.dbeaver.model.app.DBPProjectListener;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override


    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
    {
            int treeWidth = treeControl.getSize().x - treeControl.getVerticalBar().getSize().x - treeControl.getBorderWidth() * 2;
    public void createPartControl(Composite parent)
    @Override
            getNavigatorTree().getViewer().setInput(new DatabaseNavigatorContent(getRootNode()));
 * Copyright (C) 2010-2025 DBeaver Corp and others
            public void update(ViewerCell cell) {
        // Ignore
        UIUtils.setHelp(parent, IHelpContextIds.CTX_DATABASE_NAVIGATOR);

    }
            NavigatorStatePersister.saveExpandedState(getNavigatorViewer().getExpandedElements(), memento);
        }
import org.jkiss.dbeaver.ui.navigator.NavigatorPreferences;
    {
        if (preferences.getBoolean(NavigatorPreferences.NAVIGATOR_RESTORE_FILTER)) {
        super.dispose();
        super.createPartControl(parent);
        DBNProject projectNode = getGlobalNavigatorModel().getRoot().getProjectNode(DBWorkbench.getPlatform().getWorkspace().getActiveProject());
import org.eclipse.ui.IMemento;
        }
        statColumn.setLabelProvider(new CellLabelProvider() {
        if (preferences.getBoolean(NavigatorPreferences.NAVIGATOR_RESTORE_FILTER)) {
        UIExecutionQueue.queueExec(() -> {
import org.jkiss.dbeaver.ui.UIUtils;
