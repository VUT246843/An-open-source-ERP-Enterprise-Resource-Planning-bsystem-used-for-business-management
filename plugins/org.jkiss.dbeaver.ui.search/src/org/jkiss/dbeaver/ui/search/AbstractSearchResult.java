import org.eclipse.search.ui.ISearchResult;
            this.totalObjects = totalObjects;
        ISearchResultListener[] copiedListeners;
        listeners.add(l);


        this.searchQuery = searchQuery;
    }
import org.eclipse.search.ui.ISearchQuery;
}
    @Override
        public List<OBJECT_TYPE> getObjects() {
    }
 * you may not use this file except in compliance with the License.
        }
import org.eclipse.search.ui.SearchResultEvent;
public abstract class AbstractSearchResult<OBJECT_TYPE> implements ISearchResult {

        {
        return objects;
 * See the License for the specific language governing permissions and

            super(AbstractSearchResult.this);
            return totalObjects;
            copiedListeners = listeners.toArray(new ISearchResultListener[listeners.size()]);
    @Override

 *     http://www.apache.org/licenses/LICENSE-2.0
    public void addObjects(List<OBJECT_TYPE> objects) {
 *
        listeners.remove(l);

    }
 * Unless required by applicable law or agreed to in writing, software

    private List<OBJECT_TYPE> objects = new ArrayList<>();
        return searchQuery.getLabel();
    @Override
        }
    }
        public int getTotalObjects() {
import java.util.ArrayList;
        private final List<OBJECT_TYPE> objects;
    }
        }
    public List<OBJECT_TYPE> getObjects() {

 * DBeaver - Universal Database Manager

        for (ISearchResultListener listener : copiedListeners) {
    }
        return searchQuery.getLabel();
    @Override
 *



    @Override

    @Override

            super(searchResult);
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.jface.resource.ImageDescriptor;
    }

        }
        public DatabaseSearchFinishEvent(ISearchResult searchResult, int totalObjects) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public String getLabel() {
    public String getTooltip() {
    }

    public void removeListener(ISearchResultListener l) {
 *

    public AbstractSearchResult(ISearchQuery searchQuery) {
    private ISearchQuery searchQuery;
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.search.ui.ISearchResultListener;
 * limitations under the License.
    public void fireChange(SearchResultEvent e) {
        fireChange(new DatabaseSearchResultEvent(objects));

    }
            listener.searchResultChanged(e);
            return objects;
        }
    }
/*
        return searchQuery;
        synchronized (listeners) {
    public class DatabaseSearchResultEvent extends SearchResultEvent {
 * Licensed under the Apache License, Version 2.0 (the "License");
        return null;
            this.objects = objects;
    }
    public ISearchQuery getQuery() {

    public ImageDescriptor getImageDescriptor() {
    public static class DatabaseSearchFinishEvent extends SearchResultEvent {
import java.util.List;
 * You may obtain a copy of the License at
 */

    public void addListener(ISearchResultListener l) {
    private final List<ISearchResultListener> listeners = new ArrayList<>();

        }
        public DatabaseSearchResultEvent(List<OBJECT_TYPE> objects)
        this.objects.addAll(objects);
package org.jkiss.dbeaver.ui.search;
        private final int totalObjects;
