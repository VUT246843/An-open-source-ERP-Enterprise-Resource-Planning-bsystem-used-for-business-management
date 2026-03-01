 */
        protected Class<?>[] getListBaseTypes(Collection<DBNNode> items) {
        @Override
            return item;

                DBNNode node = NavigatorUtils.getSelectedNode(getItemsViewer());
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;

        DataSearchResultsControl(Composite resultsGroup)
                if (!(objectValue instanceof SearchDataObject)) {
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
        return object.getNode();
import java.util.ArrayList;

import org.jkiss.dbeaver.model.DBPNamedObject;
            }
        return new DataSearchResultsControl(parent);
        @NotNull

        @Override
            });
import java.util.List;
    public void setInput(ISearchResult search, Object uiState) {

 * limitations under the License.
    @Override
import org.jkiss.code.NotNull;
        super.populateObjects(objects);
    private List<SearchDataObject> foundObjects = new ArrayList<>();
package org.jkiss.dbeaver.ui.search.data;
    public void populateObjects(Collection<SearchDataObject> objects) {
    }
    }
        protected Object getObjectValue(@NotNull DBNNode item) {
                // Run default node action

    protected DBNNode getNodeFromObject(SearchDataObject object) {
                AbstractDataEditor.openNewDataEditor((DBNDatabaseNode) node, object.getFilter());
    }
        }
        foundObjects.addAll(objects);
            return new Class<?>[] {DBPNamedObject.class, SearchDataObject.class};

    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");

        foundObjects.clear();
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
                if (!(node instanceof DBNDatabaseNode) || !node.allowsOpen()) {
                    return;

                }
/*
            setDoubleClickHandler(event -> {
    }
 * DBeaver - Universal Database Manager
            super(resultsGroup);
    }
 * You may obtain a copy of the License at
                    return obj;
                }
import org.eclipse.search.ui.ISearchResult;
import org.jkiss.dbeaver.ui.search.AbstractSearchResultsPage;
        super.setInput(search, uiState);
            for (SearchDataObject obj : foundObjects) {
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
 *     http://www.apache.org/licenses/LICENSE-2.0
                    return;
 *
        }

                }
 * you may not use this file except in compliance with the License.
        {
        }
                SearchDataObject object = (SearchDataObject) objectValue;
import org.jkiss.dbeaver.model.navigator.DBNNode;
    protected AbstractSearchResultsPage<SearchDataObject>.SearchResultsControl createResultControl(Composite parent) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ui.editors.data.AbstractDataEditor;
    @Override
                if (obj.getNode() == item) {
    private class DataSearchResultsControl extends SearchResultsControl {
                Object objectValue = getObjectValue(node);
import org.eclipse.swt.widgets.Composite;

public class SearchDataResultsPage extends AbstractSearchResultsPage<SearchDataObject> {
import java.util.Collection;
 * See the License for the specific language governing permissions and
    @Override


}
