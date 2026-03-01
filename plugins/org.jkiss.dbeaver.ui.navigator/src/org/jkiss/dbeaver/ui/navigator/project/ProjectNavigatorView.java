    public void createPartControl(Composite parent)

 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ui.navigator.project;

 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0

public class ProjectNavigatorView extends DecoratedProjectView
/**
    private static final Log log = Log.getLog(ProjectNavigatorView.class);
/*
    {

    private IMemento memento;
    }
        UIUtils.setHelp(parent, IHelpContextIds.CTX_PROJECT_NAVIGATOR);
import org.jkiss.dbeaver.Log;
    public DBNNode getRootNode()
 *
import org.jkiss.dbeaver.ui.UIExecutionQueue;
import org.eclipse.ui.IViewSite;
    public static final String VIEW_ID = "org.jkiss.dbeaver.core.projectNavigator";
        getNavigatorTree().setLabelDecorator(labelDecorator);
 *


 * you may not use this file except in compliance with the License.
            NavigatorStatePersister.restoreExpandedState(getNavigatorViewer(), getRootNode(), maxDepth, memento);
    private void restoreState() {
 * Unless required by applicable law or agreed to in writing, software
        this.memento = memento;
    @Override
 * You may obtain a copy of the License at
 */
    }
import org.eclipse.swt.widgets.Composite;

            NavigatorStatePersister.saveExpandedState(getNavigatorViewer().getExpandedElements(), memento);


    }

    @Override
 * limitations under the License.
import org.jkiss.dbeaver.runtime.DBWorkbench;
 */
import org.jkiss.dbeaver.ui.UIUtils;
import org.eclipse.ui.PartInitException;
        if (DBWorkbench.getPlatform().getPreferenceStore().getInt(NavigatorPreferences.NAVIGATOR_RESTORE_STATE_DEPTH) > 0)
        if (maxDepth > 0)
        return getGlobalNavigatorModel().getRoot();

    }
    {
        super.createPartControl(parent);
 * ProjectNavigatorView
 * DBeaver - Universal Database Manager
        super.init(site, memento);
import org.eclipse.ui.IMemento;
 *
    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.ui.IHelpContextIds;

{
        UIExecutionQueue.queueExec(this::restoreState);
    public void init(IViewSite site, IMemento memento) throws PartInitException
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
    public ProjectNavigatorView() {
    }
    public void saveState(IMemento memento) {
import org.jkiss.dbeaver.ui.navigator.NavigatorStatePersister;

import org.jkiss.dbeaver.ui.navigator.NavigatorPreferences;
        int maxDepth = DBWorkbench.getPlatform().getPreferenceStore().getInt(NavigatorPreferences.NAVIGATOR_RESTORE_STATE_DEPTH);
    @Override
    }

import org.jkiss.dbeaver.model.navigator.DBNNode;
    {
