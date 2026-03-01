        protected void setListData(Collection<DBNNode> items, boolean append, boolean forUpdate) {
            setPartName(node.getNodeDisplayName());
 * limitations under the License.


            log.error(e);
            itemControl.getSelectionProvider().setDefaultSelection(new StructuredSelection(navigatorNode));
}

    }
import org.jkiss.code.NotNull;
            // Update editor input
    public void init(IEditorSite site, IEditorInput input) {
import org.eclipse.jface.viewers.StructuredSelection;

    @Override

    }
    public boolean isSearchEnabled() {
        }
import org.eclipse.jface.action.Separator;
                itemControl.changeCurrentNode(node);
    private class FolderListControl extends ItemListControl {
import org.eclipse.ui.IWorkbenchCommandConstants;
    public boolean performSearch(SearchType searchType) {
    public Viewer getNavigatorViewer() {

    }
import org.jkiss.dbeaver.ui.editors.NodeEditorInput;
import org.jkiss.dbeaver.model.navigator.*;
/**
                        history.remove(historyPosition + 1);
    }


        String nodePath = history.get(position);
                items.removeIf(DBUtils::isHiddenObject);

        return history.size();

    public DBNNode getRootNode() {
        }
        setSite(site);
                if (node instanceof DBNRoot) {
public class FolderEditor extends EditorPart implements INavigatorModelView, IRefreshablePart, ISearchContextProvider {
            itemControl.setRootNode(navigatorNode);
import org.eclipse.swt.widgets.Composite;
            }
            final INavigatorEditorInput editorInput = getEditorInput();
            super(parent, SWT.SHEET, FolderEditor.this.getSite(), DBWorkbench.getPlatform().getNavigatorModel().getRoot(), null);

                    }
                    if (rootNode instanceof DBNLocalFolder) {

                }
        return itemControl == null ? null : itemControl.getNavigatorViewer();
        }
    public RefreshResult refreshPart(Object source, boolean force) {
            }
    public void doSave(IProgressMonitor monitor) {
package org.jkiss.dbeaver.ui.editors.entity;
    }
import org.jkiss.dbeaver.DBException;
                clearListData();

 *     http://www.apache.org/licenses/LICENSE-2.0
        public void fillCustomActions(IContributionManager contributionManager) {
        @Override
    private boolean canOpenNode(DBNNode node) {
                changeCurrentNode(node);
    }
            final DBNNode rootNode = getRootNode();
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.resources.IResource;
import org.jkiss.dbeaver.ui.*;

import org.eclipse.ui.IEditorInput;

 * Unless required by applicable law or agreed to in writing, software
        }
    public void createPartControl(Composite parent) {
            } else {
import java.util.List;
                if (parentNode instanceof DBNProjectDatabases || parentNode instanceof DBNLocalFolder) {
 */
            itemControl.setFocus();
        protected void openNodeEditor(DBNNode node) {
        } else if (position < 0) {
    @Override

            position = history.size() - 1;


        }

import org.eclipse.jface.viewers.Viewer;
    }
import org.eclipse.ui.IEditorSite;
            setTitleImage(DBeaverIcons.getImage(navigatorNode.getNodeIconDefault()));
            DBNNode node = DBWorkbench.getPlatform().getNavigatorModel().getNodeByPath(monitor, nodePath);
                getEditorSite().getPage().closeEditor(this, false);
    @Nullable
                    } else {
import org.eclipse.jface.action.IContributionManager;
        private void changeCurrentNode(DBNNode node) {
                ((NodeEditorInput) editorInput).setNavigatorNode(node);
            return;
        @Override
            super.fillCustomActions(contributionManager);
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.ui.part.EditorPart;
        return RefreshResult.REFRESHED;
        getSite().setSelectionProvider(itemControl.getSelectionProvider());
 * See the License for the specific language governing permissions and
    private static final Log log = Log.getLog(FolderEditor.class);

    @Override
                return objectColumn.isNameColumn(getObjectValue((DBNRoot) element)) ? ".." : "";
        setInput(input);
        return false;
        }
                    }
            loadData();

 * Licensed under the Apache License, Version 2.0 (the "License");
 */
import org.jkiss.code.Nullable;
            if (items != null) {
        } catch (DBException e) {
    @Override
    }
    }
    }
        return itemControl.performSearch(searchType);

import org.jkiss.dbeaver.runtime.DBWorkbench;

        });
    }
                super.openNodeEditor(node);
        });

            if (getRootNode() != null && node.getClass() != getRootNode().getClass()) {

            DBWorkbench.getPlatformUI().showError("Can't obtain navigator to node", "Error reading navigator node", e);
                        node = ((DBNLocalFolder) rootNode).getLogicalParent();
    public void setFocus() {
            } else {
    private int historyPosition = 0;
            if (navigatorNode == null) {
            if (editorInput instanceof NodeEditorInput) {
        UIExecutionQueue.queueExec(() -> {
    }

                    items = nodesWithParent;
    @Override
    @Override
            }

            final DBNNode navigatorNode = getEditorInput().getNavigatorNode();
            }

                if (historyPosition >= 0) {
            contributionManager.add(ActionUtils.makeCommandContribution(getSite(), IWorkbenchCommandConstants.NAVIGATE_FORWARD_HISTORY, CommandContributionItem.STYLE_PUSH, UIIcon.RS_FORWARD));
        @Override

        itemControl = new FolderListControl(parent);

                DBWorkbench.getPlatformUI().showMessageBox("Can't navigator to node", "Node '" + nodePath + "' not found", true);
    }
                // We don't have a node - can't do much.
        return (INavigatorEditorInput) super.getEditorInput();
    public void doSaveAs() {
        return false;
import java.util.ArrayList;
 *
    public boolean isSearchPossible() {

        if (position >= history.size()) {

            super.setListData(items, append, forUpdate);
            position = -1;
    @Override
        @Override
import org.jkiss.dbeaver.ui.navigator.INavigatorModelView;
            contributionManager.add(ActionUtils.makeCommandContribution(getSite(), IWorkbenchCommandConstants.NAVIGATE_BACKWARD_HISTORY, CommandContributionItem.STYLE_PUSH, UIIcon.RS_BACK));

            }
            DBNNode rootNode = getRootNode();
                historyPosition++;
    @Nullable
            itemControl.loadData();
        return node instanceof DBNDatabaseNode || node.getAdapter(IResource.class) instanceof IFile;
            if (!append) {
        return historyPosition;
import org.jkiss.dbeaver.ui.navigator.itemlist.ItemListControl;
    }
    @Override
            history.add(rootNode.getNodeUri());
                itemControl.loadData(false);
        @Nullable
 * you may not use this file except in compliance with the License.

        }
import org.eclipse.swt.SWT;
    public void navigateHistory(int position) {
        return itemControl != null && itemControl.isSearchPossible();
                // Different node type - cleanup
            if (!canOpenNode(node)) {
        }
            if (!itemControl.isDisposed()) {

            parent.layout(true, true);
    public INavigatorEditorInput getEditorInput() {
            if (node != null) {

                // Add parent node reference (we actually add DBNRoot to avoid unneeded parent properties columns loading)
    public int getHistoryPosition() {
            contributionManager.add(new Separator());
                final DBNNode parentNode = rootNode.getParentNode();
            }
            setRootNode(node);
        if (itemControl != null) {
        public FolderListControl(Composite parent) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
            setTitleImage(DBeaverIcons.getImage(node.getNodeIconDefault()));
import org.jkiss.dbeaver.model.DBUtils;
        return itemControl != null && itemControl.isSearchEnabled();
    @Override
            return super.getCellValue(element, objectColumn, formatValue);

                }
        VoidProgressMonitor monitor = new VoidProgressMonitor();
                    List<DBNNode> nodesWithParent = new ArrayList<>(items);
        UIUtils.asyncExec(() -> {
            if (element instanceof DBNRoot) {
    public boolean isDirty() {
    private FolderListControl itemControl;
    @Override
    private final List<String> history = new ArrayList<>();
                return;
                    while (historyPosition < history.size() - 1) {
    @Override
    }
                final DBNNode rootNode = getRootNode();
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
import java.util.Collection;
    @Override
import org.jkiss.dbeaver.Log;
            }
    }
                historyPosition = position;
            }
            updateActions();
    @Override

    @Override
        if (position < 0 || position >= history.size()) {
                history.add(node.getNodeUri());
    }
        itemControl.createProgressPanel();
/*
 * DBeaver - Universal Database Manager
            setPartName(navigatorNode.getNodeDisplayName());
import org.eclipse.core.resources.IFile;
 * FolderEditor
 * You may obtain a copy of the License at
    }

    public int getHistorySize() {

 *
    }
        }
                }
import org.jkiss.dbeaver.ui.editors.INavigatorEditorInput;
import org.eclipse.ui.menus.CommandContributionItem;
                        node = rootNode.getParentNode();
        try {
        protected Object getCellValue(@NotNull Object element, @NotNull ObjectColumn objectColumn, boolean formatValue) {
 *
    public boolean isSaveAsAllowed() {
        }
            }
        return getEditorInput().getNavigatorNode();
                    nodesWithParent.add(0, DBWorkbench.getPlatform().getNavigatorModel().getRoot());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
