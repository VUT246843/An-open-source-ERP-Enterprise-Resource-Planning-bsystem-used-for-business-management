    private static class ElementSaveInfo {
public class ERDContext {
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
        int iconIndex = icons.indexOf(icon);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.DBPImage;
        final int objectId;
        final ERDElement<?> element;
        return dataSourceContainer;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    public int getElementInfo(ERDElement<?> element) {
            icons.add(icon);
import java.util.List;

import java.util.IdentityHashMap;
 *
        elementInfoMap.put(element, info);
        return navigatorModel;
import org.jkiss.dbeaver.model.navigator.DBNModel;
        }
 */
    private final Map<ERDElement<?>, ElementSaveInfo> elementInfoMap = new IdentityHashMap<>();
    public DBNModel getNavigatorModel() {

        }
 *

 *
    public int getIconIndex(DBPImage image) {
        this.dataSourceContainer = dataSourceContainer;
    }
    private final DBRProgressMonitor monitor;
 * you may not use this file except in compliance with the License.
        this.navigatorModel = navigatorModel;
        this.monitor = monitor;

    public ERDContext(DBRProgressMonitor monitor, DBPDataSourceContainer dataSourceContainer, DBNModel navigatorModel) {


            this.element = element;
            this.objectId = objectId;
import java.util.ArrayList;
    }
package org.jkiss.dbeaver.model.erd;
        return icons;

    }

/*
        return info.objectId;
        ElementSaveInfo info = new ElementSaveInfo(element, elementInfoMap.size());

 * Licensed under the Apache License, Version 2.0 (the "License");
        String icon = image.getLocation();
        return monitor;
            iconIndex = icons.size();
/*

    public int addElementInfo(ERDElement<?> element) {
    }
    private final DBPDataSourceContainer dataSourceContainer;
        if (iconIndex == -1) {
 * Created on Jul 13, 2004
 * distributed under the License is distributed on an "AS IS" BASIS,
}
    }
        ElementSaveInfo info = elementInfoMap.get(element);
    private final List<String> icons = new ArrayList<>();
    }
    }
        {

 * limitations under the License.

 * See the License for the specific language governing permissions and
    }
 * Unless required by applicable law or agreed to in writing, software
import java.util.Map;
    public List<String> getIcons() {
        return iconIndex;
 * DBeaver - Universal Database Manager


    public DBPDataSourceContainer getDataSourceContainer() {
    private final DBNModel navigatorModel;
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
    public DBRProgressMonitor getMonitor() {

        private ElementSaveInfo(ERDElement<?> element, int objectId)
        return info == null ? -1 : info.objectId;
