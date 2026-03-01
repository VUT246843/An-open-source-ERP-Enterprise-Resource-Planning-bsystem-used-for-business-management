    }

        return info == null ? null : info.contributor;
        if (info.editors.isEmpty()) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * See the License for the specific language governing permissions and
    }
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.ui.IEditorActionBarContributor;
            this.contributor = contributor;
 * You may obtain a copy of the License at
    {
        }
    private Map<Class<? extends IEditorActionBarContributor>, ActionContributorInfo> contributorMap = new HashMap<>();

        }
        private ActionContributorInfo(IEditorActionBarContributor contributor)
 * Unless required by applicable law or agreed to in writing, software
    }
        {
        }
import java.util.List;
 *
            contributorMap.put(contributor.getClass(), info);
    {

    {
import org.jkiss.dbeaver.ui.editors.IDatabaseEditorContributorManager;
 * Global contributor manager
 * distributed under the License is distributed on an "AS IS" BASIS,
        info.editors.add(editor);
    }

/**
        if (info == null) {
            contributor.dispose();

    @Override
public class GlobalContributorManager implements IDatabaseEditorContributorManager{


 * Licensed under the Apache License, Version 2.0 (the "License");

 */
}
        final List<IEditorPart> editors = new ArrayList<>();
 * DBeaver - Universal Database Manager
        ActionContributorInfo info = contributorMap.get(contributor.getClass());
    {
import java.util.ArrayList;
        }
        return instance;
        final IEditorActionBarContributor contributor;
import org.eclipse.ui.IEditorPart;
    private static GlobalContributorManager instance = new GlobalContributorManager();
            info = new ActionContributorInfo(contributor);
 *
        ActionContributorInfo info = contributorMap.get(contributor.getClass());
    private static class ActionContributorInfo {
package org.jkiss.dbeaver.ui.editors.entity;
    public IEditorActionBarContributor getContributor(Class<? extends IEditorActionBarContributor> type)
import java.util.HashMap;
            throw new IllegalStateException("Contributor editor is not registered");
    public void removeContributor(IEditorActionBarContributor contributor, IEditorPart editor)
 *     http://www.apache.org/licenses/LICENSE-2.0
    public static GlobalContributorManager getInstance()
/*
    public void addContributor(IEditorActionBarContributor contributor, IEditorPart editor)
        if (info == null) {
    }
        ActionContributorInfo info = contributorMap.get(type);

 * you may not use this file except in compliance with the License.
import java.util.Map;
            contributorMap.remove(contributor.getClass());
 *
            throw new IllegalStateException("Contributor is not registered");

        if (!info.editors.remove(editor)) {
            contributor.init(editor.getEditorSite().getActionBars(), editor.getSite().getPage());

        }
 * limitations under the License.
