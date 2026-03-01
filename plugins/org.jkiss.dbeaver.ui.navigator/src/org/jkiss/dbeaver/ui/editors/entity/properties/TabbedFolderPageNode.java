        @Override
import org.jkiss.utils.CommonUtils;
        if (mainEditor instanceof IProgressControlProvider) {

    }
        if (progressControl != null) {
import org.jkiss.code.NotNull;
    {
        public void getName(AccessibleEvent e) {
                }
            return false;
        }
                final ISelectionProvider selectionProvider = itemControl.getSelectionProvider();
        }

        @Override

        }
            }
                    if ((state & ACC.STATE_FOCUSABLE) != 0) {
        parent.layout();
        return itemControl.isSearchEnabled();
    public Viewer getNavigatorViewer() {
    private class FolderAccessibleAdapter extends AccessibleControlAdapter implements AccessibleListener {
 * limitations under the License.
                loadNewData = false;
        Object itemsInput = itemControl.getItemsViewer().getInput();
            @Override
                        multiPageEditor.setActiveEditor(mainEditor);
    public void setFocus()
    @Override
        } else {
        //itemControl.getLayout().marginHeight = 0;
import org.eclipse.ui.part.MultiPageEditorSite;
    public void createControl(Composite parent) {

                e.result = node.getNodeDescription();
        boolean loadNewData = true;

 *
            } else if (nodeChange == DBNEvent.NodeChange.UNLOAD) {
    public boolean isSearchEnabled()
import org.eclipse.jface.viewers.ISelectionProvider;
        }
    public void aboutToBeHidden()
    @Override
            } else {
        if (!(event.getSource() instanceof DBPEvent)) {

    public RefreshResult refreshPart(Object source, boolean force)
import org.jkiss.dbeaver.model.DBPEvent;
                if (itemControl.getItemsViewer().getControl().isFocusControl()) {

    private class FolderSimpleAccessibleAdapter extends AccessibleAdapter {
        public void getDescription(AccessibleEvent e) {
                e.result = CommonUtils.notNull(node.getNodeDescription(), node.getName());
    private final DBNNode node;
            return adapter.cast(itemControl);
    }
import org.eclipse.swt.widgets.Composite;

                state = ACC.STATE_NORMAL;
            e.detail = state;
                // Notify owner MultiPart editor about page change
import org.jkiss.dbeaver.ui.controls.folders.TabbedFolderPage;
        public void getName(AccessibleEvent e) {
    {
 * EntityNodeEditor
    @Override
    public boolean performSearch(SearchType searchType)
        @Override
    {
                // Update selection provider and selection
class TabbedFolderPageNode extends TabbedFolderPage implements ISearchContextProvider, IRefreshablePart, INavigatorModelView, DBPAdaptable
 * DBeaver - Universal Database Manager
            int childID = e.childID;
/**
                // Do not refresh if refreshed object is not in the list
        if (!force && source instanceof DBNEvent) {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ui.IRefreshablePart;
            DBNEvent event = (DBNEvent) source;
            }
        }
    @Override
    {
            ((Collection<?>) itemsInput).contains(dbEvent.getObject());
    }
                        state |= ACC.STATE_FOCUSED;
        // If this is DBM event then check node change type
                itemControl.activate(true);
            } else {
        this.node = node;
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
    }


        Control nodeItemsViewer = itemControl.getItemsViewer().getControl();
                if (!itemControl.getItemsViewer().getSelection().isEmpty()) {
 */
    }
    }
        }
        public void getState(AccessibleControlEvent e) {
        @Override
        return itemControl.performSearch(searchType);
        {


        if (!activated || itemControl == null || itemControl.isDisposed()) {

        }
        public void getRole(AccessibleControlEvent e) {
            e.childID = ACC.CHILDID_SELF;


            }
        if (itemControl != null) {
 *
        // (by calling getChildren() on DBNNode)
        // UNLOAD usually means that connection was closed on connection's node is not removed but

        }

    public DBNNode getRootNode() {

            @Override
import org.jkiss.dbeaver.ui.navigator.itemlist.ItemListControl;
 * you may not use this file except in compliance with the License.

    @Override

        }
    }
    @Override
            }

        return itemControl.isSearchPossible();
        }
    }
import org.eclipse.ui.IEditorInput;
        ProgressPageControl progressControl = null;
        @Override
    private boolean activated;
                    MultiPageEditorPart multiPageEditor = ((MultiPageEditorSite) mainEditor.getSite()).getMultiPageEditor();

        public void getDefaultAction(AccessibleControlEvent e) {
                    }

import org.jkiss.dbeaver.model.navigator.DBNNode;
{

    }
    {
        // Activate items control on focus
                }
            accessible.addAccessibleListener(new FolderAccessibleAdapter());
        return RefreshResult.IGNORED;
                    state |= ACC.STATE_SELECTED;
    }
                    }
        return itemControl.getNavigatorViewer();
    }
            public void focusLost(FocusEvent e) {
 * Copyright (C) 2010-2025 DBeaver Corp and others

    private final IDatabaseEditor mainEditor;
        itemControl = new ItemListControl(parent, SWT.SHEET, mainEditor.getSite(), node, metaNode);
            if (event.getAction() == DBNEvent.Action.UPDATE && nodeChange == DBNEvent.NodeChange.REFRESH) {
                role = ACC.ROLE_TABITEM;

    @Override
            DBNEvent.NodeChange nodeChange = event.getNodeChange();
            itemControl.substituteProgressPanel(progressControl);
                dbEvent.getObject() == ((DBNDatabaseNode) rootNode).getValueObject();
    @Override
            final Accessible accessible = nodeItemsViewer.getAccessible();
    @Override

            return RefreshResult.REFRESHED;
    }
                    selectionProvider.setSelection(selectionProvider.getSelection());
        }
import org.jkiss.dbeaver.model.navigator.DBNEvent;
    public void aboutToBeShown()
            itemControl.setFocus();

        }
 */
    }
import org.eclipse.swt.accessibility.*;
        this.mainEditor = mainEditor;
    }
    {
 * distributed under the License is distributed on an "AS IS" BASIS,
            e.detail = role;
 * See the License for the specific language governing permissions and
import org.eclipse.swt.widgets.Control;
        nodeItemsViewer.addFocusListener(new FocusListener() {

        // Check - do we need to load new content in editor
            public void focusGained(FocusEvent e) {
import org.jkiss.dbeaver.model.DBPAdaptable;
        DBPEvent dbEvent = (DBPEvent)event.getSource();
        }
            }
        });
            int state = 0;
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeNode;
            return RefreshResult.IGNORED;
    {

                e.result = CommonUtils.notNull(node.getNodeDescription(), node.getName());

            if (e.childID == ACC.CHILDID_SELF) {
        if (itemControl == null) {
        }
            return rootNode instanceof DBNDatabaseNode &&
        this.metaNode = metaNode;
                loadNewData = isRefreshingEvent(event);
    private boolean isRefreshingEvent(DBNEvent event) {
        if (!activated) {
                // We need it to update search actions and other contributions provided by node editor
            DBNNode rootNode = getRootNode();
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return null;
            itemControl.loadData(isLazy);
            activated = true;

        /////////////////////////////
 * You may obtain a copy of the License at

    {
        return itemsInput instanceof Collection &&
                    state |= ACC.STATE_FOCUSABLE;
        }
            itemControl.loadData(false);

import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
                state = ACC.STATE_SELECTABLE;
            boolean isLazy = !(node instanceof DBNDatabaseNode) || ((DBNDatabaseNode) node).needsInitialization();
import java.util.Collection;
        }
            }
    }
            if (e.childID == ACC.CHILDID_SELF) {
 * Unless required by applicable law or agreed to in writing, software
            if (e.childID == ACC.CHILDID_SELF) {
                if (mainEditor.getSite().getSelectionProvider() != selectionProvider) {
        }
                }
    private final DBXTreeNode metaNode;
        }
    private ItemListControl itemControl;
        public void getHelp(AccessibleEvent e) {

        if (event.getSource() == DBNEvent.UPDATE_ON_SAVE) {
import org.jkiss.dbeaver.ui.ISearchContextProvider;
                }
    }
import org.eclipse.swt.events.FocusEvent;
            int role;
        }
        if (adapter.isAssignableFrom(itemControl.getClass())) {
                if (mainEditor.getSite() instanceof MultiPageEditorSite) {
            if (childID == ACC.CHILDID_SELF) {
import org.eclipse.jface.viewers.Viewer;
        }
            int childID = e.childID;

    public IEditorInput getEditorInput()
package org.jkiss.dbeaver.ui.editors.entity.properties;
        if (loadNewData) {
            return true;


import org.jkiss.dbeaver.ui.controls.ProgressPageControl;

                role = ACC.ROLE_TABFOLDER;
    public <T> T getAdapter(@NotNull Class<T> adapter) {
            itemControl.createProgressPanel();
}            }
        return mainEditor.getEditorInput();
import org.eclipse.swt.events.FocusListener;
            if (childID == ACC.CHILDID_SELF) {
        @Override
import org.jkiss.dbeaver.ui.navigator.INavigatorModelView;
import org.eclipse.swt.SWT;
        @Override
    public boolean isSearchPossible()
        //itemControl.getLayout().marginWidth = 0;
    TabbedFolderPageNode(IDatabaseEditor mainEditor, DBNNode node, DBXTreeNode metaNode)
                    if (multiPageEditor.getSelectedPage() != mainEditor) {
        // is in "unloaded" state.
            // Reorder of child elements
        }
        public void getKeyboardShortcut(AccessibleEvent e) {
                    mainEditor.getSite().setSelectionProvider(selectionProvider);

        if (dbEvent.getData() == DBPEvent.REORDER) {
            }
import org.eclipse.ui.part.MultiPageEditorPart;
    {
        public void getFocus(AccessibleControlEvent e) {
 *
        return itemControl.getRootNode();
        // Without this check editor will try to reload it's content and thus will reopen just closed connection
import org.jkiss.dbeaver.ui.IProgressControlProvider;
            return null;
                itemControl.activate(false);

import org.jkiss.dbeaver.ui.editors.IDatabaseEditor;

/*
            progressControl = ((IProgressControlProvider) mainEditor).getProgressControl();
