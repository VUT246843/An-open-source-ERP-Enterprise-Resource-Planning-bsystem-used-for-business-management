    {
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
            });
 * limitations under the License.
} *

 */
        List<? extends DBPProject> allProjects = new ArrayList<>(DBWorkbench.getPlatform().getWorkspace().getProjects());
            txnItem.addSelectionListener(new SelectionAdapter()
    }
import org.eclipse.swt.events.SelectionAdapter;
import org.jkiss.dbeaver.Log;
                public void widgetSelected(SelectionEvent e)
 * you may not use this file except in compliance with the License.
public class NavigatorActiveProjectContributor extends ContributionItem
 * Copyright (C) 2010-2024 DBeaver Corp and others
            txnItem.setData(project);
 * Unless required by applicable law or agreed to in writing, software
        for (final DBPProject project : allProjects) {

            txnItem.setSelection(project == activeProject);
        final DBPProject activeProject = DBWorkbench.getPlatform().getWorkspace().getActiveProject();
    public void fill(Menu menu, int index)
            MenuItem txnItem = new MenuItem(menu, SWT.RADIO);
    private static final Log log = Log.getLog(NavigatorActiveProjectContributor.class);

/*
                    NavigatorHandlerProjectSetActive.setActiveProject(project);
import org.eclipse.swt.SWT;
        allProjects.sort((o1, o2) -> o1.getDisplayName().compareToIgnoreCase(o2.getDisplayName()));
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
    }
package org.jkiss.dbeaver.ui.navigator.actions;
import org.jkiss.dbeaver.runtime.DBWorkbench;
    {
import java.util.List;
        }
            txnItem.setText(project.getName());
 * See the License for the specific language governing permissions and
{
import org.eclipse.jface.action.ContributionItem;
                {
            {
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
import java.util.ArrayList;
 * Licensed under the Apache License, Version 2.0 (the "License");

import org.eclipse.swt.events.SelectionEvent;
    @Override
                }
    
                @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private void createMenu(final Menu menu)
        createMenu(menu);
import org.jkiss.dbeaver.model.app.DBPProject;

 *
