 * You may obtain a copy of the License at
 *

/**
public class EditProjectWizard extends ActiveWizard {
    public EditProjectWizard(RCPProject project) {

import org.jkiss.dbeaver.model.DBIcon;
        return DBeaverIcons.getImage(DBIcon.PROJECT);
        createPreferencePages(preferenceNodes);
    @Override
        super.savePrefPageSettings();
 * See the License for the specific language governing permissions and
    protected IAdaptable getActiveElement() {
    }
    }

 */
import org.jkiss.dbeaver.ui.dialogs.ActiveWizard;
    public String getWindowTitle() {

 * Unless required by applicable law or agreed to in writing, software
}
    @Override
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.ui.dialogs.PreferencesUtil;
import org.jkiss.dbeaver.Log;

    }
    }
 *
    @Override
    private static final Log log = Log.getLog(EditProjectWizard.class);
        IPreferenceNode[] preferenceNodes = PreferencesUtil.propertiesContributorsFor(project.getEclipseProject());
import org.eclipse.jface.preference.IPreferenceNode;

    public boolean performFinish() {
 * you may not use this file except in compliance with the License.
/*
 * Copyright (C) 2010-2025 DBeaver Corp and others
        this.project = project;

    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        //addPreferencePage(new PrefPageProjectResourceSettings(), "Resource settings", "Project resource folders/locations");
 *
import org.jkiss.dbeaver.model.rcp.RCPProject;

    @Override
    }

        project.getDataSourceRegistry().flushConfig();
import org.eclipse.core.runtime.IAdaptable;
package org.jkiss.dbeaver.ui.project;
    @Override
 * DBeaver - Universal Database Manager
        //addPreferencePage(new PrefPageProjectNetworkProfiles(), "Network profiles", "Connections' network profiles");

        return project.getEclipseProject();
import org.jkiss.dbeaver.ui.DBeaverIcons;
import org.eclipse.swt.graphics.Image;
        return "Project " + project.getName() + " settings";
 */
    public void addPages() {
    public Image getDefaultPageImage() {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * EditProjectWizard
    private final RCPProject project;
        return true;
