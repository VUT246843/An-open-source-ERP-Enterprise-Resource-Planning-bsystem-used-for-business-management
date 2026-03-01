    public boolean filterFolders() {
    @Override

public class SimpleNavigatorTreeFilter implements INavigatorFilter {
    public boolean filterObjectByPattern(Object object) {
    @Override
        return false;
        return true;
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
}
 * DBeaver - Universal Database Manager
        // Filter only leaf items
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
    }
    public boolean select(Object toTest) {
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        return object instanceof DBNNode node && !node.hasChildren(true);



 * Copyright (C) 2010-2026 DBeaver Corp and others
 * limitations under the License.
    @Override
        return isLeafObject(object);
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ui.navigator;
    }
 *
import org.jkiss.dbeaver.model.navigator.DBNNode;

    public boolean isLeafObject(Object object) {
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
 * you may not use this file except in compliance with the License.
 *
/*
