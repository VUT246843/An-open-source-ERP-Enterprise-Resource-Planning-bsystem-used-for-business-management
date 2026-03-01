            }


    @Override

    @Override
/*
                newNodes.addAll(oldNodes);
        } else if (searchResult instanceof AbstractSearchResult) {
            TreeViewer itemsViewer = (TreeViewer) itemList.getItemsViewer();
    public void saveState(IMemento memento)
        return itemList.getRootNode();
    private static class ResultsNode {
        this.viewPart = part;
    @Override
        itemList = createResultControl(parent);
    }
            Collection<DBNNode> oldNodes = itemList.getListData();
    public Viewer getNavigatorViewer()
            DBNNode[] nodes = new DBNNode[children.size()];
        super.dispose();
        }
            List<DBNNode> newNodes = new ArrayList<>();
            return false;
    public void dispose() {
 * See the License for the specific language governing permissions and
    {

    @Override

 *
        {
    }
import org.eclipse.search.ui.ISearchResultPage;
    }



            List<DBNNode> nodes = new ArrayList<>(objects.size());
                final AbstractSearchResult result = (AbstractSearchResult) e.getSearchResult();
                getSite(),
            if (objects != null) {
                nodes.add(getNodeFromObject(object));
        {
        public SearchResultsControl(@NotNull Composite resultsGroup) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            List objects = null;
import org.jkiss.code.NotNull;

import org.eclipse.swt.SWT;
        }
 *
                        nodeMap.put(parent, parentResults);

                        continue;
                // Collect parent nodes
import org.jkiss.dbeaver.model.DBPNamedObject;
        }

        }
    @Override
package org.jkiss.dbeaver.ui.search;
        protected LoadingJob<Collection<DBNNode>> createLoadService(boolean forUpdate)
        return itemList.getNavigatorViewer();
            this.node = node;
    }

        itemList.clearListData();
                SWT.SHEET,
import org.eclipse.swt.widgets.Composite;
        itemList.setFitWidth(true);
                    allParents.add(0, parent);
                        curParentResults.children.add(parentResults);
public abstract class AbstractSearchResultsPage <OBJECT_TYPE> extends Page implements ISearchResultPage,INavigatorModelView {
                // Make leaf
            clearObjects();
        }
    public void setInput(ISearchResult search, Object uiState)
                nodeMap.put(node, leaf);
        @Override
    {
import org.jkiss.dbeaver.ui.navigator.INavigatorModelView;


        private ResultsNode rootResults;
        public Object getParent(Object element)
    }
    private Object uiState;
import org.eclipse.jface.viewers.Viewer;
    }
import org.jkiss.utils.CommonUtils;
                }
        return this.id;
    private SearchResultsControl itemList;
                ResultsNode leaf = new ResultsNode(node, curParentResults);
        this.id = id;
                    if (parentResults == null) {

    @Nullable

        itemList.setLayoutData(new GridData(GridData.FILL_BOTH));
    @Override
 *
    public String getLabel()
                if (results != null) {
            this.searchResult.removeListener(this.resultListener);
                });
        {
        public Object[] getElements(Object inputElement)


            if (!CommonUtils.isEmpty(oldNodes)) {
            this.parent = parent;
        private ResultsContentProvider() {
    }
            }
    }
            rootResults = new ResultsNode(getRootNode(), null);
        @Override
            for (int i = 0; i < children.size(); i++) {

        ResultsNode parent;
        if (itemList != null && !itemList.isDisposed()) {
                ResultsNode results = nodeMap.get(parentElement);
            }

            final List<DBNNode> allParents = new ArrayList<>();
    @Override
        @Override
import org.jkiss.dbeaver.ui.UIUtils;
                UIUtils.syncExec(() -> populateObjects(newObjects));
import org.jkiss.dbeaver.ui.navigator.itemlist.NodeListControl;
    public void clearObjects()
            populateObjects(((AbstractSearchResult) searchResult).getObjects());
    }
        }

        ResultsNode(DBNNode node, ResultsNode parent)
        };
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.navigator.DBNContainer;
        itemList.setInfo(search == null ? "" : "Searching for '" + search.getLabel() + "'");
    private class ResultsContentProvider extends TreeContentProvider {
        if (this.searchResult != null) {
                    curParentResults = parentResults;
                // Construct hierarchy

        @Override
    {
            ((ResultsContentProvider)itemsViewer.getContentProvider()).rebuildObjectTree(newNodes);
    }

            }
                rebuildObjectTree((Collection<DBNNode>) newInput);
        }
import org.eclipse.swt.layout.GridData;
import org.eclipse.search.ui.ISearchResultListener;
            }
    {
    }
            for (DBNNode node : nodeList) {
                    ResultsNode parentResults = nodeMap.get(parent);
    private String id;
        final List<ResultsNode> children = new ArrayList<>();
            return null;
        }
                    if (parent instanceof DBNContainer || parent instanceof DBNResource) {
            return null;
            // No load service
    @Override
        DBNNode node;
        public Object[] getChildren(Object parentElement)
 */
    {
        this.searchResult = search;
    protected class SearchResultsControl extends NodeListControl {
                nodes[i] = children.get(i).node;
    protected abstract DBNNode getNodeFromObject(OBJECT_TYPE object);
 * You may obtain a copy of the License at
        getSite().setSelectionProvider(itemList.getSelectionProvider());
    public Object getUIState()
    }
        itemList.createProgressPanel();
            } else if (e.getSearchResult() instanceof AbstractSearchResult) {
            itemList.appendListData(nodes);
import org.eclipse.ui.part.Page;
import org.eclipse.jface.action.IContributionManager;

    public DBNNode getRootNode()
import org.eclipse.ui.IMemento;
        this.uiState = uiState;
    }
            if (newInput instanceof Collection) {
                allParents.clear();
    public void populateObjects(Collection<OBJECT_TYPE> objects)
    public void createControl(Composite parent)
import org.eclipse.jface.viewers.TreeViewer;
import org.jkiss.dbeaver.ui.search.internal.UISearchMessages;
    {
                for (DBNNode parent = node.getParentNode(); parent != null && parent != getRootNode(); parent = parent.getParentNode()) {
            }
        }
    public void setViewPart(ISearchResultViewPart part)
 * you may not use this file except in compliance with the License.
        if (this.searchResult == null) {
    }
        protected Class<?>[] getListBaseTypes(Collection<DBNNode> items)
import org.eclipse.swt.widgets.Control;
    private ISearchResult searchResult;
import org.jkiss.dbeaver.ui.controls.TreeContentProvider;
                    itemList.setInfo("Found " + ((AbstractSearchResult.DatabaseSearchFinishEvent) e).getTotalObjects() + " objects");
            }
    {
        }
    public Control getControl()
    {
    @Override

    public void setID(String id)
        {
            newNodes.addAll(nodes);

                }
    public String getID()
        }


    }

 * limitations under the License.
            for (OBJECT_TYPE object : objects) {
    {
        public void fillCustomActions(IContributionManager contributionManager)
        }
        return searchResult == null ? "" : searchResult.getLabel();
        return new SearchResultsControl(parent);
        {

 * distributed under the License is distributed on an "AS IS" BASIS,
                }
        @Override
    {
    {
    }
import org.jkiss.dbeaver.ui.LoadingJob;
            this.searchResult.addListener(this.resultListener);
        }
                        parentResults = new ResultsNode(parent, curParentResults);
import org.jkiss.dbeaver.model.navigator.DBNNode;
                    return results.getChildrenNodes();
                    }
                ResultsNode results = nodeMap.get(element);
        {
        }
                UIUtils.asyncExec(() -> {
        @Override
            itemsViewer.expandAll();
        }
import org.eclipse.search.ui.ISearchResult;
                curParentResults.children.add(leaf);
        @Override
                new ResultsContentProvider());
        {
 * Licensed under the Apache License, Version 2.0 (the "License");
        itemList.setInfo(UISearchMessages.dialog_search_objects_item_list_info);
        }
            return rootResults.getChildrenNodes();
 * DBeaver - Universal Database Manager
            } else if (e instanceof AbstractSearchResult.DatabaseSearchFinishEvent) {
        {
    {
        if (this.searchResult != null) {
    @Override
    @Override
        this.resultListener = e -> {
        return itemList;
    public AbstractSearchResultsPage() {
import java.util.*;
    @Override

        public boolean supportsDataGrouping() {
                    return results.parent.node;
    }
import org.jkiss.code.Nullable;
    }
    protected SearchResultsControl createResultControl(Composite parent) {


    private ISearchResultViewPart viewPart;

                ResultsNode curParentResults = rootResults;
    public void restoreState(IMemento memento)
    {
    }
                objects = result.getObjects();
            itemList.setFocus();
            return null;
            }
        @Override
    {
    }
            return false;
        {
            nodeMap = new IdentityHashMap<>();


        DBNNode[] getChildrenNodes()
        public void inputChanged(Viewer viewer, Object oldInput, Object newInput)
            if (parentElement instanceof DBNNode) {

        }
                }

        {
import org.eclipse.search.ui.ISearchResultViewPart;
                ResultsNode results = nodeMap.get(parentElement);
import org.jkiss.dbeaver.runtime.DBWorkbench;

        return uiState;
                objects = ((AbstractSearchResult.DatabaseSearchResultEvent) e).getObjects();
                DBWorkbench.getPlatform().getNavigatorModel().getRoot(),
    @Override
    public void setFocus()
            if (parentElement instanceof DBNNode) {

        if (itemList != null && !itemList.isDisposed()) {

import org.jkiss.dbeaver.model.navigator.DBNResource;
            return new Class<?>[] {DBPNamedObject.class};
            if (element instanceof DBNNode) {
            return nodes;
        }
                for (DBNNode parent : allParents) {
 * Unless required by applicable law or agreed to in writing, software
            }
    @Override
                final List newObjects = objects;
    private ISearchResultListener resultListener;
                if (results != null && results.parent != null) {
            }
                return results != null && !results.children.isEmpty();

            if (e instanceof AbstractSearchResult.DatabaseSearchResultEvent) {



 * Copyright (C) 2010-2025 DBeaver Corp and others
        public boolean hasChildren(Object parentElement)
            super(resultsGroup,
        private void rebuildObjectTree(Collection<DBNNode> nodeList)
        @Override
        private Map<DBNNode,ResultsNode> nodeMap;
    {
                    }
        {
}
    }
        }

