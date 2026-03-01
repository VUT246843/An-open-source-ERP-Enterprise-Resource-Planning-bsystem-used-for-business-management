        super.dispose();
 */
import org.jkiss.dbeaver.runtime.DBWorkbench;
            return new DBNProjectDesktop(
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
import org.jkiss.dbeaver.model.rcp.RCPProject;
package org.jkiss.dbeaver.model.navigator;
}
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.app.DBPProject;
    }
 *
        DBPPlatform platform = DBWorkbench.getPlatform();

        }
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
            );
    }
    private NavigatorResourceListener resourceListener;
                platformDesktop.getWorkspace().getEclipseWorkspace().removeResourceChangeListener(
                    resourceListener
    public DesktopNavigatorModel(DBPPlatform platform, @Nullable List<? extends DBPProject> modelProjects) {

 *     http://www.apache.org/licenses/LICENSE-2.0
 *
                rcpProject

                platformDesktop.getWorkspace().getEclipseWorkspace().addResourceChangeListener(
 * Copyright (C) 2010-2025 DBeaver Corp and others
            throw new IllegalStateException("Desktop navigator model can be used only in RCP applications");
/*
import java.util.List;
            if (platform instanceof DBPPlatformDesktop platformDesktop) {

    protected DBNProject createProjectNode(DBNRoot parent, DBPProject project) {
        if (isGlobal()) {
            DBPPlatform platform = DBWorkbench.getPlatform();
                resourceListener = null;

                resourceListener = new NavigatorResourceListener(this);
 *
 * See the License for the specific language governing permissions and
                parent,
    @Override

            DBPPlatform platform = DBWorkbench.getPlatform();
            }
                    resourceListener);


                );
 * Licensed under the Apache License, Version 2.0 (the "License");
    public void dispose() {
import org.jkiss.code.Nullable;
 * DBeaver - Universal Database Manager
        }
            if (platform instanceof DBPPlatformDesktop platformDesktop) {
 * You may obtain a copy of the License at
        super.initialize();
        if (platform instanceof DBPPlatformDesktop platformDesktop && project instanceof RCPProject rcpProject) {
 * you may not use this file except in compliance with the License.
        super(platform, modelProjects);
    public void initialize() {

import org.jkiss.dbeaver.model.app.DBPPlatform;
        } else {
import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;
public class DesktopNavigatorModel extends DBNModel {
        if (isGlobal()) {
    }
        }
