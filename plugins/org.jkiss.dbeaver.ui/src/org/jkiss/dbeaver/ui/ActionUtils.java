                log.error("Can't execute command '" + commandId + "'", e);
    }
                    location = display.map(focusControl, null, tree.getLocation());
                for (String commandID : commandIDs) {
                    } else {
            case Table table -> {
            name,
                                }
import org.eclipse.swt.graphics.Rectangle;
 * You may obtain a copy of the License at
        @Nullable DBPImage image,
                    }
        if (commandService != null) {
        return item;
        boolean showText,
    public static CommandContributionItem makeCommandContribution(@NotNull IServiceLocator serviceLocator, @NotNull String commandId, int style) {
        ICommandImageService commandService = PlatformUI.getWorkbench().getService(ICommandImageService.class);
            });
        return commandName + " (" + shortcut + ")";
        @NotNull IServiceLocator serviceLocator,
                        ParameterizedCommand pc = new ParameterizedCommand(command, parametrization);
        @Nullable DBPImage image,
            toolTip,


                ICommandService commandService = site.getService(ICommandService.class);
        }
        };
        @NotNull String commandId,
            serviceLocator,
            action.setImageDescriptor(DBeaverIcons.getImageDescriptor(image));
                log.warn("Error evaluating property [" + propertyName + "]", e);
import org.eclipse.jface.action.Action;
        Action actionImpl = new Action() {

    }
                    Command command = commandService.getCommand(commandId);
            return label;
                        }
        ActionContributionItem item = new ActionContributionItem(action);
        contributionParameters.parameters = parameters;

        boolean showText) {

    public static Point getLocationFromControl(@NotNull Shell activeShell, @NotNull Control focusControl) {
                        sequence = b.getTriggerSequence();
    }
import org.eclipse.core.commands.ParameterizedCommand;
        @Nullable String toolTip,
            }
                final TreeItem[] selection = tree.getSelection();
            actionImpl.setId(id);
                    location = new Point(absBounds.x, absBounds.y + tree.getItemHeight());
            }
                try {
                            } else {
            @Override
                sequence = bindingService.getBestActiveBindingFor(commandId);
        if (commandService != null) {
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
        int style,
                            if (curSelection instanceof IStructuredSelection && selection instanceof IStructuredSelection) {
            if (command != null && command.isDefined()) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Nullable
    public static void addPropertyEvaluationRequestListener(@NotNull IPropertyChangeListener listener) {
import org.eclipse.core.expressions.EvaluationContext;
    @Nullable
import org.eclipse.swt.custom.StyledText;
        return item;

        if (site != null) {
        @NotNull String commandId,


    }

                location.y += styledText.getLineHeight();
    public static CommandContributionItem makeCommandContribution(
            image == null ? null : DBeaverIcons.getImageDescriptor(image),

        }
import org.eclipse.core.commands.Parameterization;
 */
        runCommand(commandId, selection, null, serviceLocator);
        actionDelegate.selectionChanged(actionImpl, selection);
            } catch (Exception e) {
    public static boolean isCommandChecked(String commandId, IWorkbenchPartSite site) {
            } else if (actionDelegate instanceof IWorkbenchWindowActionDelegate) {
                }
        if (toolTip != null) {
    @Nullable
                    log.debug(e);
 * See the License for the specific language governing permissions and
/*
        @NotNull final IActionDelegate actionDelegate,
        CommandContributionItemParameter contributionParameters = new CommandContributionItemParameter(
        }
                                continue;
import org.eclipse.ui.*;
        String commandName = null;

 * Action utils
        if (showText) {
            actionImpl.setToolTipText(toolTip);
                                if (((IStructuredSelection) curSelection).size() == ((IStructuredSelection) selection).size() &&
                listener.propertyChange(ev);
            Binding[] bindings = bindingService.getBindings();

        if (commandName == null) {
        int style,
/**
        }
        }
import org.eclipse.jface.bindings.Binding;
    }
                if (commandService != null) {
 *
    }
            if (bindings != null) {
        @Nullable String id,
    }
                ICommandService commandService = serviceLocator.getService(ICommandService.class);
            } catch (Exception e) {
            }
        if (commandId != null && site != null) {
        }
import org.eclipse.ui.menus.CommandContributionItemParameter;
            try {
                        }
            } catch (Exception e) {
                    boolean needContextPatch = false;
                    if (selection != null) {
    public static void runCommand(String commandId, IServiceLocator serviceLocator) {
                    Command command = commandService.getCommand(commandId);
    @Nullable
                        }
                actionDelegate.run(this);
                            final ISelection curSelection = ((IWorkbenchSite) serviceLocator).getSelectionProvider().getSelection();
    public static void evaluatePropertyState(String propertyName) {
        final ICommandService commandService = PlatformUI.getWorkbench().getService(ICommandService.class);
package org.jkiss.dbeaver.ui;
                                log.debug("Parameter '" + param.getKey() + "' not found in command '" + commandId + "'");
    }
        return makeCommandContribution(serviceLocator, commandId, name, image, null, false);
import org.eclipse.core.commands.common.NotDefinedException;
        }
        @Nullable Map<String, Object> parameters) {
        if (shortcut == null) {
            commandId,
        }
                    }

                }

    }
                }
                    location = new Point(absBounds.x, absBounds.y + table.getItemHeight());


    }
                    Rectangle absBounds = display.map(focusControl, null, table.getItem(selectionIndex).getBounds());
                try {
    private static final Set<IPropertyChangeListener> propertyEvaluationRequestListeners = Collections.synchronizedSet(new HashSet<>());
import org.eclipse.ui.handlers.IHandlerService;
    public static CommandContributionItem makeCommandContribution(
                    Parameterization[] parametrization = null;
            if (command != null && command.isDefined()) {

import org.eclipse.jface.bindings.TriggerSequence;
 * Copyright (C) 2010-2025 DBeaver Corp and others
            }
import org.jkiss.utils.CommonUtils;
            }
                        IEvaluationContext context = new EvaluationContext(
                DBWorkbench.getPlatformUI().showError("Error running command", "Can't execute command '" + commandId + "'", e);
    @NotNull
            for (IPropertyChangeListener listener : List.copyOf(propertyEvaluationRequestListeners)) {
            serviceLocator,
        return new CommandContributionItem(contributionParameters);
        if (image != null) {
            }
        CommandContributionItemParameter parameters = new CommandContributionItemParameter(
        @NotNull String commandId,

import org.jkiss.code.Nullable;

import org.eclipse.ui.commands.ICommandService;
    public static CommandContributionItem makeCommandContribution(IServiceLocator serviceLocator, String commandId, String name, DBPImage image) {
        @NotNull String commandId,
 *
        @NotNull IServiceLocator serviceLocator,
                final int caretOffset = styledText.getCaretOffset();
        if (commandId != null) {
        }
import org.eclipse.jface.util.PropertyChangeEvent;
            null,

        switch (focusControl) {
                            Object cmdParamValue = parameterizedCommand.getParameterMap().get(paramName);
import org.eclipse.ui.menus.CommandContributionItem;
    public static String findCommandName(String commandId) {

                log.error("Can't execute command '" + commandId + "'", e);
            case Tree tree -> {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    Rectangle absBounds = display.map(focusControl, null, selection[0].getBounds());
            null,
    public static CommandContributionItem makeCommandContribution(
            actionImpl.setImageDescriptor(image);
            return shortcut;
            null,
                location = styledText.getLocationAtOffset(caretOffset);
        boolean showText) {
        return false;
                        if (paramName != null) {

        }
import org.eclipse.swt.graphics.Point;
        return new CommandContributionItem(contributionParameters);
    }
    public static CommandContributionItem makeCommandContribution(@NotNull IServiceLocator serviceLocator, @NotNull String commandId) {
                        } else {
            contributionParameters.mode = CommandContributionItem.MODE_FORCE_TEXT;
            public void run() {
                    if (selection != null && needContextPatch) {
        return "???";
    }
        } else {
            false);
    public static void runCommand(String commandId, ISelection selection, IServiceLocator serviceLocator) {
        ICommandService commandService = serviceLocator.getService(ICommandService.class);

        if (image != null) {

            null,
        return location;
            }
        Point location = null;
        @NotNull IServiceLocator serviceLocator,
                }
                        if (serviceLocator instanceof IWorkbenchPartSite) {
        ActionContributionItem item = new ActionContributionItem(action);

        }
        @Nullable ISelection selection,
        if (commandService != null) {
    public static IAction makeAction(
            commandId,
}

import org.eclipse.core.commands.IParameter;
            case StyledText styledText -> {
            }
import org.eclipse.jface.action.IAction;
    public static void fireCommandRefresh(final String... commandIDs) {
    }
    }
                }
        }
        } else if (index < 36) {
            return String.format("&%d. %s", index < 9 ? index + 1 : 0, label);

                if (ArrayUtils.isEmpty(selection)) {
                IHandlerService handlerService = serviceLocator.getService(IHandlerService.class);
    }
                            }
        return findCommandDescription(commandId, serviceLocator, shortcutOnly, null, null);
    public static Command findCommand(@NotNull String commandId) {
    public static String findCommandDescription(String commandId, IServiceLocator serviceLocator, boolean shortcutOnly) {
                    }
                } catch (NotDefinedException e) {
                            }
        if (id != null) {
import org.jkiss.dbeaver.Log;
                }
    }
                            IParameter parameter = command.getParameter(param.getKey());
                        if (b.getType() == Binding.USER) {

            commandId,
            }
        @Nullable Map<String, Object> parameters
                            ParameterizedCommand pc = new ParameterizedCommand(command, parametrization);
                shortcut = sequence.format();
    public static String getLabelWithIndexMnemonic(@NotNull String label, int index) {
        propertyEvaluationRequestListeners.remove(listener);
import org.eclipse.jface.action.ContributionItem;
            }
                        for (Map.Entry<String, Object> param : parameters.entrySet()) {
            try {
            Command command = commandService.getCommand(commandId);
public class ActionUtils {
                                    ((IStructuredSelection) curSelection).getFirstElement() == ((IStructuredSelection) selection).getFirstElement()) {
        @Nullable String name,
 * Licensed under the Apache License, Version 2.0 (the "License");
    public static ContributionItem makeActionContribution(
                                    needContextPatch = false;
                        needContextPatch = true;
            CommandContributionItem.STYLE_PUSH);
            try {
                        parametrization = new Parameterization[parameters.size()];
 *     http://www.apache.org/licenses/LICENSE-2.0
        final ICommandService commandService = PlatformUI.getWorkbench().getService(ICommandService.class);
    }
                final int selectionIndex = table.getSelectionIndex();
        }
    }
            } catch (Exception e) {
        return null;
                    return command != null && command.getState(ToggleState.class.getName()) != null;
            }
    public static void removePropertyEvaluationRequestListener(@NotNull IPropertyChangeListener listener) {
        if (service != null) {
    }
import java.util.*;
import org.eclipse.jface.commands.ToggleState;
                for (Binding b : bindings) {
    }
    public static boolean isCommandEnabled(String commandId, IServiceLocator site) {
        final Display display = activeShell.getDisplay();
                if (commandService != null) {
                            break;
        IEvaluationService service = PlatformUI.getWorkbench().getService(IEvaluationService.class);
        return actionImpl;
                        handlerService.executeCommandInContext(pc, null, context);
                        }
        return false;
import org.eclipse.jface.viewers.ISelection;
                location = display.map(styledText, null, location);
                            log.warn("Command '" + commandId + "' is disabled");
                    if (!CommonUtils.isEmpty(parameters)) {

                    return command != null && command.isEnabled();
            style);
                            handlerService.createContextSnapshot(false), selection);
            }
            item.setMode(ActionContributionItem.MODE_FORCE_TEXT);
        parameters.icon = icon == null ? null : DBeaverIcons.getImageDescriptor(icon);
        if (text != null) {
        if (showText) {
                service.requestEvaluation(propertyName);
        @NotNull IAction action,
        }
        return makeCommandContribution(serviceLocator, commandId, CommandContributionItem.STYLE_PUSH);
    @Nullable
        @Nullable DBPImage icon
                        if (serviceLocator instanceof IWorkbenchPartSite) {
 * limitations under the License.
        if (commandId != null && site != null) {
                            // Prefer user-defined binding over default (system)
            if (sequence == null) {
        }
import org.eclipse.ui.services.IServiceLocator;
        if (bindingService != null) {
            PropertyChangeEvent ev = new PropertyChangeEvent(service, propertyName, null, null);
import org.eclipse.jface.util.IPropertyChangeListener;
    private static final Log log = Log.getLog(ActionUtils.class);
        return new CommandContributionItem(new CommandContributionItemParameter(
        if (shortcutOnly) {
        @Nullable String toolTip,
                            if (!CommonUtils.equalObjects(cmdParamValue, paramValue)) {
                            paramIndex++;
            return commandService.getImageDescriptor(commandId);
                        context.addVariable(ISources.ACTIVE_CURRENT_SELECTION_NAME, selection);
                                parametrization[paramIndex] = null;
    public static String findCommandDescription(String commandId, IServiceLocator serviceLocator, boolean shortcutOnly, String paramName, String paramValue) {
            commandId,
                } catch (NotDefinedException e) {
            }
        }
import org.eclipse.jface.resource.ImageDescriptor;
    public static CommandContributionItem makeCommandContribution(
            }
            actionImpl.setText(text);
    }
        if (index < 0) {
                    }
    public static ContributionItem makeActionContribution(
                                parametrization[paramIndex] = new Parameterization(parameter, CommonUtils.toString(param.getValue()));
        @NotNull IAction action,
    }
                    if (parameterizedCommand != null && commandId.equals(parameterizedCommand.getId())) {
            }
        runCommand(commandId, null, serviceLocator);
            serviceLocator,
                //Command cmd = new Command();
import org.jkiss.dbeaver.runtime.DBWorkbench;
            style,
        @Nullable String name,

        }
                    ParameterizedCommand parameterizedCommand = b.getParameterizedCommand();
        }
        }
    }
                    Command command = commandService.getCommand(commandId);
            UIUtils.asyncExec(() -> {
                }
        if (commandService != null) {
            TriggerSequence sequence = null;
        String shortcut = null;
                if (commandService != null) {
import org.jkiss.code.NotNull;
        IBindingService bindingService = serviceLocator.getService(IBindingService.class);
                //Command cmd = new Command();
import org.eclipse.ui.keys.IBindingService;
        @NotNull IServiceLocator serviceLocator,
    public static ImageDescriptor findCommandImage(String commandId) {
        }
                }
                        log.warn("Command '" + commandId + "' not found");
                if (selectionIndex < 0) {
        ICommandService commandService = PlatformUI.getWorkbench().getService(ICommandService.class);
    @Nullable
            Command command = commandService.getCommand(commandId);
        }
                        }
                        // Create new eval context
                }
            return String.format("&%c. %s", index - 10 + 'A', label);
        // Update commands
            null,
import org.eclipse.ui.commands.ICommandImageService;
import org.eclipse.core.commands.Command;

            }

            }
        @Nullable String text,
            if (sequence != null) {
                    } else if (command != null) {
                return command;
                } else {
                        if (command.isEnabled()) {
                } else {
import org.jkiss.utils.ArrayUtils;
 * Unless required by applicable law or agreed to in writing, software
            null,
        @Nullable String toolTip) {

            throw new IllegalArgumentException("negative index: " + index);
                            }
        CommandContributionItemParameter contributionParameters = new CommandContributionItemParameter(
import java.util.List;
        contributionParameters.parameters = parameters;
            return shortcut == null ? "" : shortcut;
 */
        return makeCommandContribution(serviceLocator, commandId, CommandContributionItem.STYLE_PUSH, name, image, toolTip, showText, null);
        if (commandService != null) {
        DBPImage image) {
    }
            null,
            null,
                ICommandService commandService = site.getService(ICommandService.class);
            try {
        return new CommandContributionItem(parameters);
                    commandService.refreshElements(commandID, null);
        @Nullable ImageDescriptor image,
            if (command != null && command.isDefined()) {
    }
                            context.addVariable(ISources.ACTIVE_PART_NAME, ((IWorkbenchPartSite) serviceLocator).getPart());
        }
import org.eclipse.jface.action.ActionContributionItem;
                    log.debug(e);
                        }
 *


            final Command command = commandService.getCommand(commandId);
                ((IWorkbenchWindowActionDelegate) actionDelegate).init(site.getWorkbenchWindow());
import org.eclipse.ui.services.IEvaluationService;
                    location = display.map(focusControl, null, table.getLocation());

import org.jkiss.dbeaver.model.DBPImage;
                                    // The same selection
            if (actionDelegate instanceof IObjectActionDelegate && site instanceof IWorkbenchPartSite) {

        return null;
            null,
                        int paramIndex = 0;
            serviceLocator,
                    commandName = command.getName();
import org.eclipse.core.expressions.IEvaluationContext;
            default -> {
            return commandName;
                ((IObjectActionDelegate) actionDelegate).setActivePart(actionImpl, ((IWorkbenchPartSite) site).getPart());
import org.eclipse.swt.widgets.*;
        }
                            if (parameter != null) {
                    return command.getName();

        propertyEvaluationRequestListeners.add(listener);
    public static void runCommand(String commandId, ISelection selection, Map<String, Object> parameters, IServiceLocator serviceLocator) {
                            handlerService.executeCommand(pc, null);
import org.eclipse.jface.viewers.IStructuredSelection;
        } else if (index < 10) {

    ) {
        @Nullable IWorkbenchSite site,
            style));
    }
    ) {
