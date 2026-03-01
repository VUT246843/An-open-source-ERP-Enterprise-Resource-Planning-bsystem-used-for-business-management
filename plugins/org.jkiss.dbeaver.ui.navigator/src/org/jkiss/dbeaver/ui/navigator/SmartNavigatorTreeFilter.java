 * Licensed under the Apache License, Version 2.0 (the "License");
        if (object instanceof DBNDatabaseNode) {
    @Override
    public boolean filterObjectByPattern(Object object) {
 *

            return dbFilter.filterObjectByPattern(object);
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTreeFilter;
    public SmartNavigatorTreeFilter() {

    @Override
/**
 * See the License for the specific language governing permissions and
    }

    @Override
public class SmartNavigatorTreeFilter extends SimpleNavigatorTreeFilter {
        return super.filterObjectByPattern(object);
/*

}
    private final DatabaseNavigatorTreeFilter dbFilter;
    }
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
 * Unless required by applicable law or agreed to in writing, software
        return super.select(toTest);
package org.jkiss.dbeaver.ui.navigator;

        }
    public boolean select(Object toTest) {
 */
    }
    public boolean filterFolders() {
 * limitations under the License.
 *
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
        return super.isLeafObject(object);
        dbFilter = new DatabaseNavigatorTreeFilter();
 * Filter which works differently depending on node type
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
            return dbFilter.isLeafObject(object);
        if (object instanceof DBNDatabaseNode) {
            return dbFilter.select(toTest);
    public SmartNavigatorTreeFilter(DatabaseNavigatorTreeFilter dbFilter) {
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
        if (toTest instanceof DBNDatabaseNode) {
    public boolean isLeafObject(Object object) {
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.dbFilter = dbFilter;
        return false;
        }


        }


 */
 *
    @Override
