    public void setLabel(String text) {
import java.util.List;
            if (selectedProject == null) {
import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;
        @Nullable DBPProject activeProject,
        if (showOnlyEditable) {

import org.eclipse.swt.widgets.Combo;

                }
    }
    @Nullable
        int style
            }
        final List<? extends DBPProject> projects = new ArrayList<>(
 * Licensed under the Apache License, Version 2.0 (the "License");
            projectCombo.addSelectionListener(new SelectionAdapter() {
import org.eclipse.swt.widgets.Composite;
/**
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
        this(parent, activeProject, style, showOnlyEditable, true);
import org.eclipse.swt.SWT;
    public ProjectSelectorPanel(

                if (!projects.contains(selectedProject)) {

import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
                @Override
        @Nullable DBPProject activeProject,

import org.jkiss.dbeaver.model.rm.RMConstants;
import org.jkiss.dbeaver.ui.UIUtils;
    ) {
    }


        @NotNull Composite parent,
import org.jkiss.code.NotNull;
        boolean showOnlyEditable
            o1.getDisplayName().compareToIgnoreCase(o2.getDisplayName()));
    ) {
            if (showIcon) {
import org.eclipse.swt.widgets.Label;
                public void widgetSelected(SelectionEvent e) {
            projectCombo.setText(selectedProject.getName());
    protected void onProjectChange() {
    public ProjectSelectorPanel(


        return selectedProject;
        @Nullable DBPProject activeProject,

 * DBeaver - Universal Database Manager

        this.headerLabel.setText(text);
import org.eclipse.swt.events.SelectionEvent;
package org.jkiss.dbeaver.ui.dialogs.connection;
            }
 * distributed under the License is distributed on an "AS IS" BASIS,
    public ProjectSelectorPanel(

            }

}                projectCombo.add(project.getName());
            DBWorkbench.getPlatform().getWorkspace().getProjects());
            for (DBPProject project : projects) {
        if (projects.size() == 1) {
        int style,
 *
                if (selectedProject == null) {
        @NotNull Composite parent,
        int style,
        projects.sort((o1, o2) ->
import org.jkiss.dbeaver.model.DBIcon;
        } else if (projects.size() > 1) {
            selectedProject = projects.getFirst();
    public DBPProject getSelectedProject() {
import org.jkiss.code.Nullable;
                selectedProject = activeProject;
        boolean alignRight
        boolean showOnlyEditable,
    private Label headerLabel;
                    selectedProject = projects.getFirst();
    ) {
import org.eclipse.swt.layout.GridData;
    }

 * you may not use this file except in compliance with the License.
            boolean showIcon = (style & SWT.ICON) != 0;
    }
            projects.removeIf(p -> !p.hasRealmPermission(RMConstants.PERMISSION_PROJECT_DATASOURCES_EDIT));
 */
import org.jkiss.dbeaver.ui.DBeaverIcons;
import java.util.ArrayList;
                }

    }
        }
                    onProjectChange();

            final Combo projectCombo = new Combo(projectGroup, SWT.DROP_DOWN | SWT.READ_ONLY);
 *     http://www.apache.org/licenses/LICENSE-2.0
                    selectedProject = NavigatorUtils.getSelectedProject();
 *
 * You may obtain a copy of the License at
public class ProjectSelectorPanel {
 * See the License for the specific language governing permissions and
import org.eclipse.swt.events.SelectionAdapter;
import org.jkiss.dbeaver.runtime.DBWorkbench;
                new Label(projectGroup, SWT.NONE).setImage(DBeaverIcons.getImage(DBIcon.PROJECT));
 *
            Composite projectGroup = UIUtils.createComposite(parent, showIcon ? 3 : 2);
                    selectedProject = projects.get(projectCombo.getSelectionIndex());
 */
    private DBPProject selectedProject;
        }
                }
            });
            projectCombo.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
import org.jkiss.dbeaver.model.app.DBPProject;
            projectGroup.setLayoutData(new GridData(alignRight ? GridData.HORIZONTAL_ALIGN_END : GridData.HORIZONTAL_ALIGN_BEGINNING));
            this.headerLabel = UIUtils.createControlLabel(projectGroup, UIConnectionMessages.dialog_connection_driver_project);

/*

        @NotNull Composite parent,
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * ProjectSelectorPanel
 * Unless required by applicable law or agreed to in writing, software
        this(parent, activeProject, style, false, true);
