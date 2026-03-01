 */
    {
                .map(GeneralUtils::variablePattern)
            outputFileText,

        if (idxOfExtStart > -1 && idxOfExtStart <= text.length()) {


    @Override
            outputGroup,
        connInfo.setImage(DBeaverIcons.getImage(icon));
            setErrorMessage(TaskNativeUIMessages.tools_wizard_message_no_client_home);

    }
        UIUtils.setContentProposalToolTip(
import org.eclipse.swt.widgets.TableItem;
                .toArray(String[]::new)));
                .toArray(String[]::new)));
    public void saveState() {

        this.wizard = wizard;
        if (extraCommandArgsText != null) {

import org.jkiss.dbeaver.tasks.nativetool.AbstractNativeToolSettings;
        if (settings instanceof AbstractImportExportSettings
 *
            updateState();
    protected CLabel connInfo;
            new StringContentProposalProvider(new String[]{}));
        AbstractNativeToolSettings settings = wizard.getSettings();
        public CheckListener(Table table, boolean check) {
            setErrorMessage(TaskNativeUIMessages.tools_wizard_message_no_output_folder);
import org.jkiss.code.NotNull;
    }

import org.eclipse.swt.events.SelectionEvent;
    }

    protected void createCheckButtons(Composite buttonsPanel, final Table table) {
    }
            this.check = check;
        int idxOfExtStart = text.lastIndexOf('.');
            && ((AbstractImportExportSettings) settings).getOutputFolderPattern() == null)

        ContentAssistUtils.installContentProposal(
        private final Table table;
            new StringContentProposalProvider(Arrays.stream(NativeToolUtils.LIMITED_VARIABLES)
import org.jkiss.code.Nullable;
        super(pageName);
        private final boolean check;
            settings.getOutputFilePattern());
/*
}
        setPageComplete(false);
    protected Text extraCommandArgsText;
        @Override
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.tasks.ui.nativetool.internal.TaskNativeUIMessages;
        }
        }
            settings.getOutputFolderPattern(),
            NativeToolUtils.LIMITED_VARIABLES);
            new SmartTextContentAdapter(),
        outputFileText.setText(text);
            ext = text.substring(idxOfExtStart + 1);
            name = text.substring(0, idxOfExtStart);
            true,
        } else {
            TaskNativeUIMessages.tools_wizard_page_dialog_folder_pattern_tip,
        outputFileText.addModifyListener(e -> settings.setOutputFilePattern(outputFileText.getText()));
    }
 *
import org.jkiss.dbeaver.model.DBPImage;



import org.jkiss.dbeaver.ui.contentassist.StringContentProposalProvider;
        extraCommandArgsText.setToolTipText(TaskNativeUIMessages.tools_wizard_page_dialog_tooltip_extra_command_args);
    protected Text outputFileText;
        ContentAssistUtils.installContentProposal(

        DBPImage icon = container.getDriver().getIcon();
import org.eclipse.swt.widgets.Text;
    }
            wizard.getProject(),
import org.eclipse.swt.events.SelectionAdapter;
import org.jkiss.dbeaver.model.task.DBTaskUtils;
    protected void createOutputFolderInput(@NotNull Composite outputGroup, @NotNull AbstractImportExportSettings settings) {
    protected String getExtension() {
import java.util.Arrays;
        saveState();
 * you may not use this file except in compliance with the License.
        ContentAssistUtils.installContentProposal(
        String text = outputFileText.getText();
            ext = "";
    }

import org.eclipse.swt.custom.CLabel;
            null,
        }
        String name;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        connInfo.setText(container.getName());
    }


        outputFileText = UIUtils.createLabelText(
            }
import org.eclipse.swt.widgets.Table;
            outputGroup,
        return super.determinePageCompletion();
        connInfo.setToolTipText(DBTaskUtils.buildConnectionDescription(container, dbName));
            this.table = table;
        String ext;
            new SmartTextContentAdapter(),
            for (TableItem item : table.getItems()) {

    protected void fixOutputFileExtension() {

    protected void updateState() {
        if (settings.getClientHome() == null) {
        setPageComplete(true);
    {
import org.jkiss.dbeaver.utils.GeneralUtils;

        if (!isDotWithEmptyExt && ext.equalsIgnoreCase(newExt)) {

        }
                .map(GeneralUtils::variablePattern)
        extraCommandArgsText.addModifyListener(e -> wizard.getSettings().setExtraCommandArgs(extraCommandArgsText.getText()));
 * limitations under the License.
 * See the License for the specific language governing permissions and
    protected AbstractNativeToolWizardPage(WIZARD wizard, String pageName)
        outputFolderText = DialogUtils.createOutputFolderChooser(
            outputFolderText,
import org.eclipse.swt.widgets.Composite;
            outputFileText,
    }
        @NotNull DBPDataSourceContainer container,

package org.jkiss.dbeaver.tasks.ui.nativetool;
            return;
        }
        }

        UIUtils.setContentProposalToolTip(
            NativeToolUtils.ALL_VARIABLES);
    }
            outputFolderText,

            e -> updateState());
        // Handling "All" and "None" buttons
import org.jkiss.dbeaver.ui.DBeaverIcons;
    protected Text outputFolderText;
            updateTableCheckedStatus(table, check);
        }

import org.jkiss.dbeaver.ui.contentassist.SmartTextContentAdapter;
            TaskNativeUIMessages.tools_wizard_page_dialog_file_pattern_tip,
            return false;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager

            name = text;
 *
    protected void updateTableCheckedStatus(@NotNull Table table, boolean check) {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
            extraCommandArgsText,
import org.jkiss.dbeaver.tasks.nativetool.AbstractImportExportSettings;
 * Unless required by applicable law or agreed to in writing, software
    }
    protected final WIZARD wizard;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            newExt = "." + newExt;
public abstract class AbstractNativeToolWizardPage<WIZARD extends AbstractNativeToolWizard> extends ActiveWizardPage<WIZARD> {
            return false;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        UIUtils.createDialogButton(buttonsPanel, TaskNativeUIMessages.tools_wizard_page_dialog_button_all, new CheckListener(table, true));

            TaskNativeUIMessages.tools_wizard_page_dialog_folder_pattern,
        UIUtils.createDialogButton(buttonsPanel, TaskNativeUIMessages.tools_wizard_page_dialog_button_none, new CheckListener(table, false));
        extraCommandArgsText = UIUtils.createLabelText(outputGroup, TaskNativeUIMessages.tools_wizard_page_dialog_label_extra_command_args, wizard.getSettings().getExtraCommandArgs());
        }
        @Nullable String dbName)
import org.jkiss.dbeaver.ui.dialogs.ActiveWizardPage;

        if (!newExt.isEmpty()) {
    private class CheckListener extends SelectionAdapter {
            new SmartTextContentAdapter(),
import org.jkiss.dbeaver.ui.contentassist.ContentAssistUtils;

        String newExt = getExtension();
        boolean isDotWithEmptyExt = ext.isEmpty() && idxOfExtStart > -1; // {file_name}.
            TaskNativeUIMessages.tools_wizard_page_dialog_file_pattern,
        {
        return "sql";
import org.jkiss.dbeaver.tasks.nativetool.NativeToolUtils;
import org.jkiss.dbeaver.ui.dialogs.DialogUtils;
    protected boolean determinePageCompletion() {
                item.setChecked(check);
    }
            new StringContentProposalProvider(Arrays.stream(NativeToolUtils.ALL_VARIABLES)
    protected void setConnectionInfo(
        text = name + newExt;
            wizard.getSettings().setExtraCommandArgs(extraCommandArgsText.getText());
 *     http://www.apache.org/licenses/LICENSE-2.0
    protected void createExtraArgsInput(Composite outputGroup) {
        public void widgetSelected(SelectionEvent e) {
