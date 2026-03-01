import java.util.Map;
        getTabState(tabId, true).height = height;
 */
        return tabStates.get(tabId);
public class TabbedFolderState {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (c) 2001, 2012 IBM Corporation and others.
            state = new TabState();
 * Contributors:
 *     Amit Joglekar <joglekar@us.ibm.com> - Support for dynamic images (bug 385795)
    public void setTabState(String tabId, TabState state) {
 */
        int width;

 * Copyright (C) 2010-2024 DBeaver Corp and others

 *
        boolean embedded;
    }
        if (state == null && create) {
        return state;
    static class TabState {
 *
/**
        getTabState(tabId, true).embedded = embedded;
import java.util.HashMap;
        return tabStates;
 * http://www.eclipse.org/legal/epl-v10.html
package org.jkiss.dbeaver.ui.controls.folders;
 * which accompanies this distribution, and is available at
        getTabState(tabId, true).width = width;
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
        }
 *     IBM Corporation - initial API and implementation
 *
 * All rights reserved. This program and the accompanying materials
/*******************************************************************************
        tabStates.put(tabId, state);
 *

    TabState getTabState(String tabId, boolean create) {
        TabState state = tabStates.get(tabId);
    }

 * Licensed under the Apache License, Version 2.0 (the "License");
    Map<String, TabState> getTabStates() {
    }
}

    }

 *     Mariot Chauvin <mariot.chauvin@obeo.fr> - bug 259553

 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at


    }

 * DBeaver - Universal Database Manager
    }
 *

    }
    public void setTabHeight(String tabId, int height) {
    public void setTabEmbedded(String tabId, boolean embedded) {
        int height;
 *     http://www.apache.org/licenses/LICENSE-2.0
            tabStates.put(tabId, state);
    public void setTabWidth(String tabId, int width) {
    private Map<String, TabState> tabStates = new HashMap<>();
    }
    public TabState getTabState(String tabId) {
 * Persisted state of tabbed folders
 * distributed under the License is distributed on an "AS IS" BASIS,

 * are made available under the terms of the Eclipse Public License v1.0

