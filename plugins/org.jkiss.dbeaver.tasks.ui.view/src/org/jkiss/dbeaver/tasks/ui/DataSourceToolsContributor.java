                    menuItems.add(new Separator());
 *     http://www.apache.org/licenses/LICENSE-2.0
                    continue;
                }
 * DBeaver - Universal Database Manager
                    editor.getEditorId());
        private final DBPEditorContribution editor;
                IMenuManager parentMenu = getGroupMenu(rootItems, groupsMap, group.getParent());
            } else {
        @Override
 *
import org.eclipse.jface.viewers.IStructuredSelection;
        return item;

        if (children != null) {
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeNode;
import org.jkiss.dbeaver.runtime.DBWorkbench;
    private void findObjectNodes(DBXTreeNode meta, List<DBXTreeObject> editors, Set<DBXTreeNode> processedNodes) {
    @Override
                        menuItems.add(new ActionContributionItem(new OpenToolsEditorAction(activePage, dataSource, ec)));
            if (editorInput instanceof IDatabaseEditorInput) {
            return editor.getDescription();
import org.eclipse.jface.action.*;
                            menuItems.add(new ActionContributionItem(action));
        public IPersistableElement getPersistable() {
                if (selection instanceof IStructuredSelection && !selection.isEmpty()) {
        IWorkbenchPage activePage = UIUtils.getActiveWorkbenchWindow().getActivePage();
                    ((DataSourceEditorInput) obj).editor == editor);
            DBPDataSource dataSource = selectedObject.getDataSource();

        }
 * distributed under the License is distributed on an "AS IS" BASIS,
        @Override

    }
        public OpenToolsEditorAction(IWorkbenchPage workbenchPage, DBPDataSource dataSource, DBPEditorContribution editor) {
        if (!CommonUtils.isEmpty(tools)) {
            return;
        }

        {
                    if (!descriptor.appliesTo(object)) {
                            } else {


            this.workbenchPage = workbenchPage;
                            tool.getDescription());
}        }
    private class OpenToolsEditorAction extends Action {
    }
                DBPDataSourceContainer dataSourceContainer = dataSource.getContainer();
        boolean hasTools = false;
                        if (tool.getGroup() != null) {
        DBSObject selectedObject = null;
        @Override
            }
                    result.add(descriptor);

        IMenuManager item = groupsMap.get(group);
            }
    }
                                    groupSet.add(tool.getGroup());
            }

                workbenchPage.openEditor(
                    fillToolsMenu(menuItems, tools, selection);
            }
            if (workbenchWindow.getActivePage() != null) {
            return editor.getLabel();
public class DataSourceToolsContributor extends DataSourceMenuContributor
            } else if (activePart instanceof DBPDataSourceContainerProvider) {
import org.eclipse.jface.resource.ImageDescriptor;

            }
        // Tasks management
                    Map<ToolGroupDescriptor, IMenuManager> groupsMap = new HashMap<>();
                        IAction action = ActionUtils.makeAction(
    private List<ToolDescriptor> getAvailableTools(IStructuredSelection selection) {
import org.jkiss.dbeaver.model.struct.DBSObject;
 * You may obtain a copy of the License at
        public void run() {
                    selectedObject = RuntimeUtils.getObjectAdapter(((IStructuredSelection) selection).getFirstElement(), DBSObject.class);

 * Copyright (C) 2010-2025 DBeaver Corp and others
        }
                            selection,
        }
                        IMenuManager parentMenu = null;
            menuItems.add(new Separator());
                    }
                if (applies) {
                    List<ToolDescriptor> tools = getAvailableTools((IStructuredSelection) selection);
                        hasTools = true;
        {
import org.eclipse.jface.viewers.ISelectionProvider;
package org.jkiss.dbeaver.tasks.ui;

                    for (ToolDescriptor tool : tools) {
import org.jkiss.dbeaver.ui.UIUtils;
            return DBUtils.getDefaultContext(dataSource, false);
        List<ToolDescriptor> result = new ArrayList<>();
            menuItems.add(new ActionContributionItem(new EmptyListAction()));
    public static class DataSourceEditorInput implements IEditorInput, DBPDataSourceContainerProvider, DBPContextProvider {
        List<DBXTreeNode> children = meta.getChildren(null);
        @Override
import org.jkiss.dbeaver.utils.RuntimeUtils;

            return obj == this ||

        @Override
                            activePart.getSite(),
        if (activePart instanceof IEditorPart) {

        }
        groupsMap.put(group, item);

                            tool.getIcon() == null ? null : DBeaverIcons.getImageDescriptor(tool.getIcon()),
import org.jkiss.dbeaver.tools.registry.ToolsRegistry;
        }
                boolean applies = true;
            }
                                parentMenu = getGroupMenu(menuItems, groupsMap, tool.getGroup());
                ISelection selection = selectionProvider.getSelection();
                IWorkbenchPart activePart = workbenchWindow.getActivePage().getActivePart();
                (obj instanceof DataSourceEditorInput &&
        }


                if (descriptor.isSingleton() && objects.size() > 1) {
        }

import org.jkiss.utils.CommonUtils;
        @Nullable
        public <T> T getAdapter(Class<T> adapter) {
 * See the License for the specific language governing permissions and
            }
        private final DBPDataSource dataSource;
            for (ToolDescriptor descriptor : ToolsRegistry.getInstance().getTools()) {
        List<DBSObject> objects = NavigatorUtils.getSelectedObjects(selection);
                    new DataSourceEditorInput(dataSource, editor),
    private static IMenuManager getGroupMenu(List<IContributionItem> rootItems, Map<ToolGroupDescriptor, IMenuManager> groupsMap, ToolGroupDescriptor group) {
        public ImageDescriptor getImageDescriptor() {
                        }
            this.dataSource = dataSource;
    }
                        if (parentMenu == null) {
                }
            try {
                                    menuItems.add(new Separator(tool.getGroup().getId()));
            } catch (PartInitException e) {
        @Override

                            new ExecuteToolHandler(workbenchWindow, tool),
import org.jkiss.dbeaver.model.*;
import org.jkiss.dbeaver.tasks.ui.view.DatabaseTasksView;
        public DataSourceEditorInput(DBPDataSource dataSource, DBPEditorContribution editor) {
{
    private static void fillToolsMenu(List<IContributionItem> menuItems, List<ToolDescriptor> tools, ISelection selection)
                parentMenu.add(item);
    protected void fillContributionItems(List<IContributionItem> menuItems)
                }
        }
    {

        }
    }
import org.jkiss.dbeaver.tools.registry.ToolDescriptor;
                selectedObject = ((DBPDataSourceContainerProvider) activePart).getDataSourceContainer();
            this.editor = editor;
 * limitations under the License.
                            }

            return;
        }
import org.jkiss.dbeaver.ui.actions.datasource.DataSourceMenuContributor;
        public boolean exists() {
                }
            IWorkbenchWindow workbenchWindow = UIUtils.getActiveWorkbenchWindow();
        public DBCExecutionContext getExecutionContext() {
                }

        @Override
        }
        }
    }

            return false;
        }
            return null;
import java.util.*;
        public String getToolTipText() {
        }
        }
        }
                if (activePart != null) {
        if (activePart == null) {
            this.editor = editor;
        private final IWorkbenchPage workbenchPage;
                }
import org.jkiss.code.Nullable;
        if (!hasTools) {
        }
        }
        if (processedNodes.contains(meta)) {
import org.jkiss.dbeaver.ui.ActionUtils;
                        } else {
            if (group.getParent() != null) {


        return result;
                selectedObject = ((IDatabaseEditorInput) editorInput).getDatabaseObject();
        public boolean equals(Object obj) {
            }
import org.jkiss.dbeaver.tools.registry.ToolGroupDescriptor;
        }
    {
        @Override
            editors.add((DBXTreeObject) meta);
                    }
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeObject;
        private final DBPDataSource dataSource;
            return dataSource.getContainer();
        @Override
 */

            return;

                DBPEditorContribution[] contributedEditors = DBWorkbench.getPlatform().getDataSourceProviderRegistry().getContributedEditors(DBPEditorContribution.MB_CONNECTION_EDITOR, dataSourceContainer);
                if (contributedEditors.length > 0) {
        }
        if (item == null) {

        public DBPDataSourceContainer getDataSourceContainer() {
            for (DBXTreeNode child : children) {
        if (selectedObject != null) {
                    }
                            "execute-tool",
        }
                    for (DBPEditorContribution ec : contributedEditors) {
        }
 * you may not use this file except in compliance with the License.
            super(editor.getLabel(), DBeaverIcons.getImageDescriptor(editor.getIcon()));
            return null;
            IEditorInput editorInput = ((IEditorPart) activePart).getEditorInput();
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        public String getName() {
        IWorkbenchPart activePart = activePage.getActivePart();
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.jkiss.dbeaver.ui.editors.IDatabaseEditorInput;
import org.jkiss.dbeaver.ui.DBeaverIcons;
            if (selectionProvider != null) {
 *
            item = new MenuManager(group.getLabel(), null, group.getId());
                                if (!groupSet.contains(tool.getGroup())) {
            // Contribute standard tools like session manager
                            tool.getLabel(),
                        applies = false;
            menuItems.add(ActionUtils.makeCommandContribution(activePart.getSite(), DatabaseTasksView.CREATE_TASK_CMD_ID));
                DBWorkbench.getPlatformUI().showError("Editor open", "Error opening tool editor '" + editor.getEditorId() + "'", e.getStatus());
                            if (SHOW_GROUPS_AS_SUBMENU) {
                            parentMenu.add(new ActionContributionItem(action));
import org.eclipse.ui.*;
                        }
        if (meta instanceof DBXTreeObject) {
                    Set<ToolGroupDescriptor> groupSet = new HashSet<>();
        @Override
 * Unless required by applicable law or agreed to in writing, software

        }
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
    private static final boolean SHOW_GROUPS_AS_SUBMENU = false;
            if (dataSource != null) {
        private final DBPEditorContribution editor;
    }


        if (!objects.isEmpty()) {
            return DBeaverIcons.getImageDescriptor(editor.getIcon());
import org.eclipse.jface.viewers.ISelection;

        processedNodes.add(meta);
        if (meta.getRecursiveLink() != null) {
            final ISelectionProvider selectionProvider = activePart.getSite().getSelectionProvider();
 *
                        break;
                                }
import org.jkiss.dbeaver.ui.actions.EmptyListAction;
                for (DBSObject object : objects) {
                findObjectNodes(child, editors, processedNodes);
                rootItems.add(item);
import org.jkiss.dbeaver.model.connection.DBPEditorContribution;
            this.dataSource = dataSource;
                    ((DataSourceEditorInput) obj).dataSource == dataSource &&
