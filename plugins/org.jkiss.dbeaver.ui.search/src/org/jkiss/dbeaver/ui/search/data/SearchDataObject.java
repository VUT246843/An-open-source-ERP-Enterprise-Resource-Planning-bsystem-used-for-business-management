 * Copyright (C) 2010-2024 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
    private final int foundRows;
import org.jkiss.dbeaver.model.data.DBDDataFilter;
    }
    }
package org.jkiss.dbeaver.ui.search.data;
    public int getFoundRows() {
public class SearchDataObject implements DBPNamedObject {

 * limitations under the License.
    @Override
    }
 */
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
    @Property
        this.filter = filter;
    private final DBNNode node;
    public SearchDataObject(DBNNode node, int foundRows, DBDDataFilter filter) {

 * you may not use this file except in compliance with the License.
        return node.getName();
 * DBeaver - Universal Database Manager
    public DBNNode getNode() {

 *
 * Licensed under the Apache License, Version 2.0 (the "License");
        return foundRows;
        return filter;

import org.jkiss.dbeaver.model.navigator.DBNNode;
import org.jkiss.dbeaver.model.meta.Property;
    }

 * Search parameters
    @Property(viewable = true)
}


        this.node = node;
/**

/*
 *
 * Unless required by applicable law or agreed to in writing, software
    private final DBDDataFilter filter;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
        return node;
    public DBDDataFilter getFilter() {
    public String getName() {
 */
    }
import org.jkiss.code.NotNull;
        this.foundRows = foundRows;
import org.jkiss.dbeaver.model.DBPNamedObject;
 * See the License for the specific language governing permissions and
