import org.eclipse.core.commands.AbstractHandler;
        }
import org.jkiss.dbeaver.debug.ui.DebugUI;
            } else {
                    DebugUI.DEBUG_LAUNCH_GROUP_ID),
import org.eclipse.debug.core.ILaunchConfiguration;
 * See the License for the specific language governing permissions and
import org.eclipse.jface.viewers.StructuredSelection;
 * Unless required by applicable law or agreed to in writing, software

import org.eclipse.debug.internal.ui.contextlaunching.ContextRunner;
import org.eclipse.core.commands.IHandler;
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.debug.ui.actions;
    @Override
        else {
        }
import org.eclipse.debug.ui.DebugUITools;
            }
import org.eclipse.core.commands.ExecutionEvent;

 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
                DebugUITools.launch(configuration, "debug", false);
public class OpenDebugConfigurationHandler extends AbstractHandler implements IHandler {

 * DBeaver - Universal Database Manager

        return null;
import org.eclipse.debug.internal.ui.contextlaunching.LaunchingResourceManager;
 * limitations under the License.
import org.eclipse.debug.internal.ui.DebugUIPlugin;
 */
 *

/*
 * distributed under the License is distributed on an "AS IS" BASIS,
                DebugUITools.openLaunchConfigurationDialogOnGroup(DebugUIPlugin.getShell(), new StructuredSelection(), DebugUI.DEBUG_LAUNCH_GROUP_ID);
import org.eclipse.core.commands.ExecutionException;
 * you may not use this file except in compliance with the License.
            if (configuration == null) {
            ContextRunner.getDefault().launch(
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
        if (LaunchingResourceManager.isContextLaunchEnabled(DebugUI.DEBUG_LAUNCH_GROUP_ID)) {
    protected ILaunchConfiguration getLastLaunch() {
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                DebugUIPlugin.getDefault().getLaunchConfigurationManager().getLaunchGroup(
        return DebugUIPlugin.getDefault().getLaunchConfigurationManager().getFilteredLastLaunch(DebugUI.DEBUG_LAUNCH_GROUP_ID);
            ILaunchConfiguration configuration = getLastLaunch();
}
                false);

    public Object execute(ExecutionEvent event) throws ExecutionException {

    }
