    }

        return fastSearch;
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.dbeaver.model.struct.DBSDataContainer;
import java.util.ArrayList;
 * See the License for the specific language governing permissions and

    int maxResults;
    public void setFastSearch(boolean fastSearch) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Search parameters
        this.searchForeignObjects = searchForeignObjects;
        this.maxResults = maxResults;
package org.jkiss.dbeaver.ui.search.data;


    }
        this.fastSearch = fastSearch;
    public List<DBSDataContainer> getSources() {
    String searchString;

        this.searchLOBs = searchLOBs;
        this.searchNumbers = searchNumbers;
    }
    boolean caseSensitive;
    public boolean isSearchLOBs() {
        return sources;
 * you may not use this file except in compliance with the License.

    public boolean isFastSearch() {
}
    {
    public void setCaseSensitive(boolean caseSensitive) {
 * limitations under the License.

    }
    }
    public List<DBNNode> getSelectedNodes() {
    public SearchDataParams()
    }
 *
        return maxResults;
        return searchNumbers;
import java.util.List;
    public boolean isCaseSensitive() {
    }
    }
    }

        return searchForeignObjects;
    List<DBNNode> selectedNodes = new ArrayList<>();

 *     http://www.apache.org/licenses/LICENSE-2.0
 *
    public void setSearchForeignObjects(boolean searchForeignObjects) {

 *


    }
        return selectedNodes;
    public void setSearchString(String searchString) {
    public void setMaxResults(int maxResults) {
    }

        this.sources = sources;
import org.jkiss.dbeaver.model.navigator.DBNNode;
    }
 */
    }
        return searchString;
        return searchLOBs;

 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    boolean searchForeignObjects;

    }
        this.caseSensitive = caseSensitive;

    }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public boolean isSearchNumbers() {

 * DBeaver - Universal Database Manager
    public void setSearchLOBs(boolean searchLOBs) {

    boolean fastSearch; // Indexed

    public int getMaxResults() {
    public String getSearchString() {
 * Licensed under the Apache License, Version 2.0 (the "License");
    boolean searchLOBs;
    List<DBSDataContainer> sources = new ArrayList<>();

    public void setSearchNumbers(boolean searchNumbers) {
 * You may obtain a copy of the License at
 */
    }
    boolean searchNumbers;
public class SearchDataParams {
    public void setSources(List<DBSDataContainer> sources) {
    }
        return caseSensitive;
        this.searchString = searchString;
/**
/*
    public boolean isSearchForeignObjects() {
