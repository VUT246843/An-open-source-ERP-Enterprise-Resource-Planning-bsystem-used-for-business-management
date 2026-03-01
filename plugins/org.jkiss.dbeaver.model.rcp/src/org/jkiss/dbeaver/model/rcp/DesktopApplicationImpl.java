    public DBPWorkspaceDesktop createWorkspace(@NotNull DBPPlatform platform) {
    @NotNull
 *
 * See the License for the specific language governing permissions and

    public boolean isEnvironmentVariablesAccessible() {
 */
        return ResourcesPlugin.getWorkspace();
    public static final String WORKSPACE_PLUGINS_FOLDER = ".plugins";

    // Dirty fix of pro#6833
    }
public abstract class DesktopApplicationImpl extends BaseApplicationImpl implements DBPApplicationDesktop {
 */
    protected IWorkspace loadEclipseWorkspace() {
 * you may not use this file except in compliance with the License.
        return isForcedRestart;
import org.jkiss.dbeaver.model.app.DBPPlatform;
 * DesktopApplicationImpl
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public static final String CORE_FILESYSTEM_PLUGIN_ID = "org.eclipse.core.filesystem";

 *
import org.jkiss.dbeaver.model.impl.app.BaseApplicationImpl;
 * Licensed under the Apache License, Version 2.0 (the "License");
        return new DesktopWorkspaceImpl(platform, loadEclipseWorkspace());
}
    }
    // We should keep this flag somewhere in basic UI plugin
/*
    }

 * You may obtain a copy of the License at


import org.jkiss.dbeaver.model.app.DBPWorkspaceDesktop;
package org.jkiss.dbeaver.model.rcp;
        return true;
    @NotNull
    @Override


    public boolean isForcedRestart() {

import org.jkiss.code.NotNull;
    private boolean isForcedRestart = false;
import org.eclipse.core.resources.ResourcesPlugin;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
    public static final String CORE_RESOURCES_PLUGIN_ID = "org.eclipse.core.resources";
    }

 *
    @Override
import org.jkiss.dbeaver.model.app.DBPApplicationDesktop;

 * limitations under the License.
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.core.resources.IWorkspace;
    public static final String CORE_RUNTIME_PLUGIN_ID = "org.eclipse.core.runtime";
 * DBeaver - Universal Database Manager
        this.isForcedRestart = isForcedRestart;
    public void setIsForcedRestart(boolean isForcedRestart) {
 * Unless required by applicable law or agreed to in writing, software
/**
