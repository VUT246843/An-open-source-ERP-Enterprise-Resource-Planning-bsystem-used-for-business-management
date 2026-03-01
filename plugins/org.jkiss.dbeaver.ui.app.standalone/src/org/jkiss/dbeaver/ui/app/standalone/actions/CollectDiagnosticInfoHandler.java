    private static final Log log = Log.getLog(CollectDiagnosticInfoHandler.class);
import java.io.FileInputStream;
    private static final class CollectDiagnosticInfoDialog extends BaseDialog {
            UIUtils.createWarningLabel(
            logFileNameExtension = "";
        int returnCode = dialog.open();
        }
        // Copy-paste from DBeaverApplication.initDebugWriter
import org.eclipse.swt.layout.GridData;
            logFileNameExtension = fileName.substring(fnameExtStart);
        }
            super(HandlerUtil.getActiveShell(event), CoreApplicationMessages.collect_diagnostic_info_pick_path_title, null);
    private static void createDocumentationLink(@NotNull Composite parent, @NotNull String text) {
        String fileName = debugLogFile.getName();
                }
            return null;
        return new File(logLocation);
        UIUtils.asyncExec(() -> ShellUtils.showInSystemExplorer(archive));
            dialogArea = UIUtils.createComposite(dialogArea, 1);
import org.eclipse.core.commands.AbstractHandler;
            showError();
        String logFileNameRegexStr = "^" + Pattern.quote(logFileName) + "\\-[0-9]+" + Pattern.quote(logFileNameExtension) + "$";
        }
    // TODO: There is no unified approach to display links to documentation in our app.
        String logFileName;
            return null;
import java.util.Collection;
            log.trace("User cancelled %s".formatted(CollectDiagnosticInfoDialog.class.getName()));
    private static File getCurrentDebugLogFile() {
        String href = "<a href=\"" + linkToDocs + "\">" + text + "</a>";
 */
            );
 *
import org.jkiss.dbeaver.utils.SystemVariablesResolver;
import org.jkiss.dbeaver.runtime.DBWorkbench;
        Collection<File> logs = new ArrayList<>();
        private void enableOk(boolean enable) {
        if (debugLogFiles != null) {
        try (var out = new ZipOutputStream(new FileOutputStream(archive))) {
    }
    // TODO: We need to create a universal method in UIUtils and replace all occurrences of creating doc links with the method.
        logs.add(Platform.getLogFileLocation().toFile());
import org.jkiss.code.NotNull;
        File archive = new File(dialog.getOutputFolder(), "dbeaver-diagnostic-info-%d.zip".formatted(System.currentTimeMillis()));
                    in.transferTo(out);
            out.write(ConfigurationInfo.getSystemSummary().getBytes(StandardCharsets.UTF_8));
                textWithOpen.setText(userHome);
        }

import java.util.ArrayList;
            logFileName = fileName.substring(0, fnameExtStart);

        File logFileLocation = debugLogFile.getParentFile();
        File debugLogFile = getCurrentDebugLogFile();
        private CollectDiagnosticInfoDialog(ExecutionEvent event) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
public class CollectDiagnosticInfoHandler extends AbstractHandler {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    outputFolder = new File(outputFolderPathString);
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Text;
                GridData.FILL_HORIZONTAL,
            super.okPressed();
 * limitations under the License.
            UIUtils.createControlLabel(outputFolderPickerComposite, CoreApplicationMessages.collect_diagnostic_info_pick_path_label);
}
    @NotNull
        return logs;
import java.util.zip.ZipOutputStream;
import org.jkiss.dbeaver.model.DBConstants;
            out.closeEntry();
            textControl.addModifyListener(event -> {
            if (userHome != null) {
import org.eclipse.ui.internal.ConfigurationInfo;
    private static Iterable<File> getLogFiles() {
            .setReplies(Reply.CLOSE)
            String userHome = System.getProperty(StandardConstants.ENV_USER_HOME);

        UIUtils.createInfoLink(parent, href, () -> ShellUtils.launchProgram(linkToDocs));
            showError();
 * Unless required by applicable law or agreed to in writing, software
 * A handler that collects diagnostic info, packs it into a zip archive and saves on a disk location specified by the user.
import java.util.Collections;

                enableOk(false);
        String linkToDocs = HelpUtils.getHelpExternalReference("Log-files");
 * DBeaver - Universal Database Manager
import java.nio.charset.StandardCharsets;
import org.jkiss.dbeaver.utils.GeneralUtils;
                out.putNextEntry(new ZipEntry(file.getName()));
package org.jkiss.dbeaver.ui.app.standalone.actions;
                enableOk(file.isDirectory());

import org.jkiss.dbeaver.utils.HelpUtils;
        @Nullable
    @Nullable
        }
        if (CommonUtils.isEmpty(logLocation)) {
        } catch (IOException e) {
        @Nullable
                }

            return logs;
        return null;
import java.io.FileOutputStream;
        if (logFileLocation == null || !logFileLocation.isDirectory()) {
        if (fnameExtStart >= 0) {
                String outputFolderPathString = textWithOpen.getText();
                dialogArea,
 *     http://www.apache.org/licenses/LICENSE-2.0
                CoreApplicationMessages.collect_diagnostic_info_pick_path_warning,
    }
import java.util.function.Predicate;
        String logLocation = DBWorkbench.getPlatform().getPreferenceStore().getString(DBeaverPreferences.LOGS_DEBUG_LOCATION);
            .setMessage(CoreApplicationMessages.collect_diagnostic_info_error_message_text)
            textWithOpen.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            }

    }

 * you may not use this file except in compliance with the License.
import java.util.regex.Pattern;
            .showMessageBox()
            logs.add(debugLogFile);
import org.jkiss.dbeaver.ui.app.standalone.internal.CoreApplicationMessages;
import org.eclipse.core.commands.ExecutionException;
    }
            Text textControl = textWithOpen.getTextControl();
import java.util.zip.ZipEntry;
        private File getOutputFolder() {
import org.eclipse.core.commands.ExecutionEvent;
                try (var in = new FileInputStream(file)) {
        }
import org.jkiss.utils.StandardConstants;
import org.jkiss.dbeaver.ui.dialogs.MessageBoxBuilder;
            Collections.addAll(logs, debugLogFiles);
        // Copy-paste from the LogOutputStream constructor and LogOutputStream.rotateCurrentLogFile
    }
        private TextWithOpen textWithOpen;
/*
                1
        protected Composite createDialogArea(Composite parent) {
        }

            .setDefaultReply(Reply.CLOSE)
    @NotNull
            }
        @Override
            Button okButton = getButton(OK);
import org.eclipse.swt.widgets.Button;

import java.io.File;
            Composite dialogArea = super.createDialogArea(parent);
            } else {
        UIUtils.syncExec(() -> MessageBoxBuilder.builder(UIUtils.getActiveWorkbenchShell())
            dialogArea.setLayoutData(new GridData(GridData.FILL_BOTH));
 * See the License for the specific language governing permissions and

 */

import org.jkiss.dbeaver.ui.controls.TextWithOpenFolder;
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.ui.dialogs.Reply;
        logLocation = GeneralUtils.replaceVariables(logLocation, new SystemVariablesResolver());
            }
            if (textWithOpen != null) {
        }
        }
 *
import org.eclipse.core.runtime.Platform;
        int fnameExtStart = fileName.lastIndexOf('.');
            return outputFolder;
    }
        File[] debugLogFiles = logFileLocation.listFiles((File dir, String name) -> logFileNamePattern.test(name));
                CoreApplicationMessages.collect_diagnostic_info_pick_path_title
                File file = new File(textControl.getText());
            textWithOpen = new TextWithOpenFolder(
                outputFolderPickerComposite,
        private File outputFolder;
            outputFolderPickerComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
            // Happens once in a blue moon
        protected void okPressed() {
import org.jkiss.dbeaver.ui.controls.TextWithOpen;
        CollectDiagnosticInfoDialog dialog = new CollectDiagnosticInfoDialog(event);
    private static void showError() {
            .setPrimaryImage(DBIcon.STATUS_ERROR)
import org.jkiss.dbeaver.ui.UIUtils;
import org.eclipse.swt.widgets.Composite;

            Composite outputFolderPickerComposite = UIUtils.createComposite(dialogArea, 2);
        if (debugLogFile.exists() && debugLogFile.isFile()) {
            log.warn("File %s already exists".formatted(archive));
import java.io.IOException;
            }
/**
            );

            for (File file : getLogFiles()) {
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
        }

import org.eclipse.ui.handlers.HandlerUtil;
        if (archive.exists()) {
            });
        }
            logLocation = GeneralUtils.getMetadataFolder().resolve(DBConstants.DEBUG_LOG_FILE_NAME).toAbsolutePath().toString();
import org.jkiss.dbeaver.model.DBIcon;
        }
import org.jkiss.dbeaver.Log;
            .setCustomArea(parent -> createDocumentationLink(parent, CoreApplicationMessages.collect_diagnostic_info_error_message_hint))
        @Nullable

        } else {

        }
 * You may obtain a copy of the License at
        @Override
            log.warn("Cannot collect diagnostic data into archive '%s': caught exception".formatted(archive), e);
        if (returnCode != Window.OK) {
            .setTitle(CoreApplicationMessages.collect_diagnostic_info_error_message_title)
        );
import org.jkiss.dbeaver.ui.ShellUtils;
            if (okButton != null) {
            // Warning about potentially sensitive data
    public Object execute(ExecutionEvent event) throws ExecutionException {
            return dialogArea;
        String logFileNameExtension;

import org.jkiss.dbeaver.DBeaverPreferences;
                okButton.setEnabled(enable);

 *
 * distributed under the License is distributed on an "AS IS" BASIS,

            logFileName = fileName;
import org.jkiss.utils.CommonUtils;
        Predicate<String> logFileNamePattern = Pattern.compile(logFileNameRegexStr).asMatchPredicate();
                if (!CommonUtils.isEmpty(outputFolderPathString)) {
        log.trace("Writing diagnostic info archive");
            out.putNextEntry(new ZipEntry("configuration.txt"));
                out.closeEntry();
