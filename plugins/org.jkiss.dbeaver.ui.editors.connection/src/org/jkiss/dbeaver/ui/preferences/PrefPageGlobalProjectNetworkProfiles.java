
 * DBeaver - Universal Database Manager
        return composite;

import org.eclipse.swt.widgets.Event;
 *     http://www.apache.org/licenses/LICENSE-2.0
            UIConnectionMessages.pref_page_network_profiles_global_project_label,
        );
    private boolean refreshActiveProject(@NotNull DBPProject project) {
    @Override
 * limitations under the License.

                }
            networkProfilesPage.dispose();
            UIConnectionMessages.pref_page_network_profiles_global_project_hint,
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
        }
        composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        Composite composite = new Composite(parent, SWT.NONE);
    }
import org.eclipse.ui.IWorkbench;
    @Override
 * you may not use this file except in compliance with the License.
        // It's easier to recreate the whole page... not ideal
public final class PrefPageGlobalProjectNetworkProfiles extends AbstractPrefPage implements IWorkbenchPreferencePage {
            composite,
 * distributed under the License is distributed on an "AS IS" BASIS,
/**
import org.jkiss.code.NotNull;
            () -> {
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
        projectCombo.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
        networkProfilesPage.loadSettings();
import org.eclipse.swt.SWT;
        networkProfilesPageHolder.setLayout(new FillLayout());
        networkProfilesPageHolder.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).span(3, 1).create());
        for (DBPProject project : projects) {
        networkProfilesPageHolder = new Composite(composite, SWT.NONE);
 * A preference page that shows network profiles for all projects.
    private PrefPageProjectNetworkProfiles networkProfilesPage;
        networkProfilesPage.setProjectMeta(project);
                // Failed to load another project, let's fall back to the old one...
 * See the License for the specific language governing permissions and
    @Override
        DBPProject activeProject = workspace.getActiveProject();

    public void dispose() {
}
                )
    protected Control createPreferenceContent(@NotNull Composite parent) {
            networkProfilesPage = null;
        DBPWorkspace workspace = DBWorkbench.getPlatform().getWorkspace();
            }

            }
import org.eclipse.jface.layout.GridDataFactory;
            networkProfilesPage.performOk();
            return false;
import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;



        return true;
            return false;
import org.jkiss.dbeaver.model.app.DBPWorkspace;
 *
        projectCombo.addSelectionListener(SelectionListener.widgetSelectedAdapter(e -> {
            composite,
 */
                    "Can''t show network profiles for project ''{0}'' because it can''t be loaded",

import org.jkiss.dbeaver.model.rcp.RCPProject;
            projectCombo.select(0);
                "Error opening project",
        }
 *
/*
        List<? extends DBPProject> projects = workspace.getProjects();
        // Populate and select active project
        }));

        }
                projectCombo.select(projectCombo.getItemCount() - 1);
        if (networkProfilesPage != null) {
import org.eclipse.swt.widgets.Composite;
 * You may obtain a copy of the License at
    private Composite networkProfilesPageHolder;
            if (project == activeProject) {
        projectCombo.notifyListeners(SWT.Selection, new Event());
import org.eclipse.swt.widgets.Combo;
 */
        );
            networkProfilesPage.getControl().dispose();
    @NotNull
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.widgets.Control;
        }
                    project.getDisplayName()
            networkProfilesPage.dispose();
    }
import org.jkiss.dbeaver.ui.UIUtils;
        UIUtils.createInfoLink(
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
                NLS.bind(
        if (networkProfilesPage != null) {
 *
                return;
        }
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.globalNetworkProfiles";
        composite.setLayout(GridLayoutFactory.fillDefaults().numColumns(3).create());
import java.util.List;
            );
import org.eclipse.osgi.util.NLS;
        networkProfilesPage.createControl(networkProfilesPageHolder);
        if (projectCombo.getSelectionIndex() < 0) {
        }
        Combo projectCombo = UIUtils.createLabelCombo(
            DBWorkbench.getPlatformUI().showError(
            DBPProject project = projects.get(projectCombo.getSelectionIndex());
            projectCombo.add(project.getDisplayName());
import org.eclipse.ui.IWorkbenchPreferencePage;
        if (!super.performOk()) {
import org.eclipse.swt.layout.FillLayout;
            SWT.DROP_DOWN | SWT.READ_ONLY

        return true;
            if (!refreshActiveProject(project)) {

        }
            lastProjectIndex = projectCombo.getSelectionIndex();
        networkProfilesPage = new PrefPageProjectNetworkProfiles();

                    PrefPageProjectNetworkProfiles.open(getShell(), project, null);
        if (project.getDataSourceRegistry().hasError()) {
    private int lastProjectIndex = -1;
import org.jkiss.dbeaver.model.app.DBPProject;
            }
    public void init(@NotNull IWorkbench workbench) {


 * Unless required by applicable law or agreed to in writing, software
        // do nothing
package org.jkiss.dbeaver.ui.preferences;

    }
    public boolean performOk() {
                if (projects.get(projectCombo.getSelectionIndex()) instanceof RCPProject project) {
    }

 * Copyright (C) 2010-2026 DBeaver Corp and others

import org.jkiss.dbeaver.runtime.DBWorkbench;
        if (networkProfilesPage != null) {
                    refreshActiveProject(project);
                projectCombo.select(lastProjectIndex);
