package org.jkiss.dbeaver.ui;
public class ContextSearchAction extends Action {
        }
    }
/*
    {
    {

 */
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");

        if (contextProvider.isSearchEnabled()) {
}

 *
 * You may obtain a copy of the License at
    public void run()

    @Override
 *

    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.ui.internal.UIMessages;
 * limitations under the License.
/**
    private final ISearchContextProvider.SearchType searchType;
 * Context search action
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
        this.searchType = searchType;
import org.eclipse.jface.action.Action;
 * Unless required by applicable law or agreed to in writing, software
        super(UIMessages.ui_actions_context_search_name, DBeaverIcons.getImageDescriptor(UIIcon.FIND));
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.contextProvider = contextProvider;
    public ContextSearchAction(ISearchContextProvider contextProvider, ISearchContextProvider.SearchType searchType)
            contextProvider.performSearch(searchType);
 *
 */
 * See the License for the specific language governing permissions and
    private final ISearchContextProvider contextProvider;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
