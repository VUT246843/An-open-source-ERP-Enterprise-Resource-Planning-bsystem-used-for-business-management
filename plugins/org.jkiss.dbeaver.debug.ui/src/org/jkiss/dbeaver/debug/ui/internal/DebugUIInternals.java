        return result;
                    accelerator++;
 * You may obtain a copy of the License at
                    String contextLabel = ext.getContextLabel(supported);
@SuppressWarnings("restriction")
 * you may not use this file except in compliance with the License.
 * limitations under the License.
                        // add the numerical accelerator
                    String helpContextId = ext.getHelpContextId();

                        label.append('&');
        if (selected == null) {
                Expression expr = ext.getContextualLaunchEnablementExpression();
                        PlatformUI.getWorkbench().getHelpSystem().setHelp(action, helpContextId);
        return null;

/*
        }

                iter.remove();
            try {
            }
 *     http://www.apache.org/licenses/LICENSE-2.0

        }
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
                    result.put(action, category);
            LaunchShortcutExtension ext = iter.next();
                .getLaunchShortcuts();
    }
                    if (helpContextId != null) {
package org.jkiss.dbeaver.debug.ui.internal;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

                    // replace default action label with context label if
                    action.setActionDefinitionId(ext.getId() + "." + supported); //$NON-NLS-1$
import org.eclipse.debug.internal.ui.actions.LaunchShortcutAction;
import org.eclipse.core.expressions.Expression;
                    String category = ext.getCategory();
                IStatus status = new Status(IStatus.ERROR, DebugUIPlugin.getUniqueIdentifier(), "Launch shortcut '" //$NON-NLS-1$

        Iterator<LaunchShortcutExtension> iter = allShortCuts.iterator();
        return launchConfigurationManager.isSharedConfig(receiver);

            for (String supported : ext.getModes()) {
}
import org.eclipse.ui.activities.WorkbenchActivityHelper;
                    // specified.
        List<LaunchShortcutExtension> filteredShortCuts = new ArrayList<LaunchShortcutExtension>();
                    }
 *
                }
                        label.append(' ');
    public static IAction createConfigurationAction(ILaunchConfiguration config, String mode, int accelerator) {
            } catch (CoreException e) {
        List<Object> selection = Arrays.asList(selected);
        for (LaunchShortcutExtension ext : filteredShortCuts) {
                        + ext.getId() + "' enablement expression caused exception. Shortcut was removed.", e); //$NON-NLS-1$
            IAction action = new LaunchConfigurationAction(config, mode, configName, imageDescriptor, accelerator);
            if (WorkbenchActivityHelper.filterItem(ext)) {
            return result;
import java.util.*;
            }
import org.eclipse.core.runtime.IStatus;
                    label.append((contextLabel != null) ? contextLabel : action.getText());
 * See the License for the specific language governing permissions and
public class DebugUIInternals {
import org.eclipse.debug.ui.DebugUITools;
                    action.setText(label.toString());
            String configName = config.getName();

        context.addVariable("selection", selection); //$NON-NLS-1$
import org.eclipse.core.runtime.CoreException;
        }
        }
import org.eclipse.jface.resource.ImageDescriptor;
 * Unless required by applicable law or agreed to in writing, software
        if (DebugUtils.canLaunch(config, mode)) {
                    }
                .getLaunchConfigurationManager();
import org.eclipse.jface.action.IAction;
        context.setAllowPluginActivation(true);
import org.jkiss.dbeaver.debug.core.DebugUtils;
import org.eclipse.debug.internal.ui.DebugUIPlugin;
                    StringBuffer label = new StringBuffer();
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
            ImageDescriptor imageDescriptor = DebugUITools.getDefaultImageDescriptor(config);
                    LaunchShortcutAction action = new LaunchShortcutAction(supported, ext);
 *
                    if (accelerator >= 0 && accelerator < 10) {
        Map<IAction, String> result = new LinkedHashMap<IAction, String>();
        LaunchConfigurationManager launchConfigurationManager = DebugUIPlugin.getDefault()
 */
import org.eclipse.core.expressions.IEvaluationContext;
                        label.append(accelerator);
                continue;
    public static ILaunchConfiguration isSharedConfig(Object receiver) {
            }
import org.eclipse.debug.internal.ui.actions.LaunchConfigurationAction;
                    filteredShortCuts.add(ext);
import org.eclipse.ui.PlatformUI;
        IEvaluationContext context = DebugUIPlugin.createEvaluationContext(selection);
            return action;
 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)
 *

 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.debug.core.ILaunchConfiguration;
    public static Map<IAction, String> createShortcutActions(Object[] selected, String mode, int accelerator) {
                if (supported.equals(mode)) {
                DebugUIPlugin.log(status);
        while (iter.hasNext()) {
import org.eclipse.core.runtime.Status;
 * DBeaver - Universal Database Manager
import org.eclipse.debug.internal.ui.launchConfigurations.LaunchShortcutExtension;
                if (ext.evalEnablementExpression(context, expr)) {
import org.eclipse.debug.internal.ui.launchConfigurations.LaunchConfigurationManager;

                }
        List<LaunchShortcutExtension> allShortCuts = DebugUIPlugin.getDefault().getLaunchConfigurationManager()
