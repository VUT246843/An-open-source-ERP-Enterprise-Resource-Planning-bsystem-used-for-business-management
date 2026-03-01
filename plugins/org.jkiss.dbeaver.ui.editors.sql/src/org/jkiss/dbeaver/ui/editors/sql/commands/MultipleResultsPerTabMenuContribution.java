            try {
    private static final ImageDescriptor multipleResultsPerTabImageTrue =
            } catch (CommandException e) {

 * Unless required by applicable law or agreed to in writing, software


        public CommandAction(@NotNull IServiceLocator serviceLocator, String commandId) {
        DBeaverIcons.getImageDescriptor(UIIcon.SQL_MULTIPLE_RESULTS_PER_TAB_FALSE);
            ICommandImageService service = serviceLocator.getService(ICommandImageService.class);
import org.eclipse.jface.resource.ImageDescriptor;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and

public class MultipleResultsPerTabMenuContribution extends ActionContributionItem {
    @NotNull
                label = command.getName();
    // this thing instantiated once for the main menu and then each time on editor context menu preparation 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.core.commands.*;

package org.jkiss.dbeaver.ui.editors.sql.commands;
                tooltip = command.getDescription();
import org.jkiss.dbeaver.ui.DBeaverIcons;
            String tooltip;
                throw new IllegalArgumentException("Failed to resolve command by id '" + commandId + "'");
import org.eclipse.jface.action.ActionContributionItem;
import org.jkiss.dbeaver.ui.ActionUtils;
    }
        public void run() {
            this.setText(label);
 * DBeaver - Universal Database Manager
import org.eclipse.swt.graphics.Image;
            }
                throw new IllegalArgumentException(errorMessage, e);

            this.setHoverImageDescriptor(service.getImageDescriptor(
            String label;

 * Copyright (C) 2010-2026 DBeaver Corp and others
import org.eclipse.jface.action.Action;
            this.setToolTipText(tooltip);
        }
import org.eclipse.ui.ISources;

 *
    }
                    command.getId(), ICommandImageService.TYPE_HOVER, ICommandImageService.IMAGE_STYLE_DEFAULT));
        boolean multipleResultsPerTab = editor.isMultipleResultsPerTabEnabled();
            ExecutionEvent event = new ExecutionEvent(command, Collections.EMPTY_MAP, null, context);
 */
import org.jkiss.dbeaver.ui.editors.sql.SQLEditor;

            EvaluationContext context = new EvaluationContext(null, selection);
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorCommands;
            ISelection selection = new StructuredSelection();
import java.util.Collections;
import org.eclipse.ui.PlatformUI;
            }
        action.setImageDescriptor(multipleResultsPerTab ? multipleResultsPerTabImageTrue : multipleResultsPerTabImageFalse);
            super(PlatformUI.getWorkbench(), SQLEditorCommands.CMD_MULTIPLE_RESULTS_PER_TAB);
        protected void executeCommand() throws ExecutionException, NotDefinedException, NotEnabledException, NotHandledException {
    private static final ImageDescriptor multipleResultsPerTabImageFalse =
        protected final Command command;
            } catch (Throwable e) {
                    command.getId(), ICommandImageService.TYPE_DISABLED, ICommandImageService.IMAGE_STYLE_DEFAULT));

/*
                    command.getId(), ICommandImageService.TYPE_DEFAULT, ICommandImageService.IMAGE_STYLE_DEFAULT));
 * limitations under the License.
                DBWorkbench.getPlatformUI().showError("Command action error", "An error occurred during command action execution", e);
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.runtime.DBWorkbench;
    }
                final String errorMessage = "Failed to resolve command parameters for unknown command '" + commandId + "'";
                executeCommand();
import org.eclipse.ui.commands.ICommandImageService;
import org.eclipse.core.commands.common.CommandException;
 * You may obtain a copy of the License at
        Action action = getContributedAction();
    private static Action getContributedAction() {

            this.setDisabledImageDescriptor(service.getImageDescriptor(
            command.executeWithChecks(event);
            }

        }
import org.eclipse.core.expressions.EvaluationContext;
            this.command = command;
            try {
            Command command = ActionUtils.findCommand(commandId);
    }
            if (command == null) {
        DBeaverIcons.getImageDescriptor(UIIcon.SQL_MULTIPLE_RESULTS_PER_TAB_TRUE);
import org.eclipse.core.commands.common.NotDefinedException;
    
        }
            this.setImageDescriptor(service.getImageDescriptor(
    public static void syncWithEditor(@NotNull SQLEditor editor) {

 *
    public static Image TRUE_IMAGE = multipleResultsPerTabImageFalse.createImage();
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.services.IServiceLocator;
        public MultipleResultsPerTabAction() {
        return action != null ? action : (action = new MultipleResultsPerTabAction());
import org.jkiss.dbeaver.ui.UIIcon;
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
}
        action.setChecked(multipleResultsPerTab);
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        super(getContributedAction());
        @Override
    public MultipleResultsPerTabMenuContribution() {

    private static class MultipleResultsPerTabAction extends CommandAction {
    private abstract static class CommandAction extends Action {
    
            this.setDescription(tooltip);
import org.eclipse.jface.viewers.ISelection;
    


    public static Image FALSE_IMAGE = multipleResultsPerTabImageTrue.createImage();


import org.jkiss.code.NotNull;
    private static Action action = null;
            context.addVariable(ISources.ACTIVE_CURRENT_SELECTION_NAME, selection);
