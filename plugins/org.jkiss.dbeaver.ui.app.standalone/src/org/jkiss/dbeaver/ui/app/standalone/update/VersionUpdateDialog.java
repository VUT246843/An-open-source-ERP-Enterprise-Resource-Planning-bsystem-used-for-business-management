            }
        );
        String[] rnLines = releaseNotes.split("\n");
            });
package org.jkiss.dbeaver.ui.app.standalone.update;
        titleLabel.setText(

        }
import org.jkiss.dbeaver.utils.GeneralUtils;
                                    return true;
    private Button dontShowAgainCheck;
        @NotNull
            }
            }

            hintLabel.setLayoutData(gd);
                CoreMessages.dialog_version_update_press_more_info,

    }
import org.eclipse.core.runtime.IStatus;
                    protected IStatus run(@NotNull DBRProgressMonitor monitor) {
import org.jkiss.dbeaver.ui.ShellUtils;
    public VersionUpdateDialog(Shell parentShell, @NotNull Version currentVersion, @NotNull VersionDescriptor newVersion, boolean showConfig)
    }
            }
                    CoreMessages.dialog_version_update_button_early_access,
import org.jkiss.dbeaver.utils.RuntimeUtils;
        @Override
        }
        if (CommonUtils.isEmpty(dist) && RuntimeUtils.isLinux()) {
        };
import org.eclipse.swt.graphics.Font;
        } else {
        @Override
            Runtime.getRuntime().exec(new String[]{
                    false);
                job.setUser(true);
import org.eclipse.swt.SWT;
            2,
 *
            os = OS_LINUX;
                createButton(
        composite.setLayoutData(new GridData(GridData.FILL_BOTH));
            case Platform.OS_WIN32 -> new WindowsInstaller();
        if (buttonId == INFO_ID) {
    protected void createBottomArea(Composite composite) {
            } catch (DBException e) {
                    CHECK_EA_ID,
                        final Path folder;

        public void run(@NotNull Path executable, @NotNull Log log) throws Exception {
                newVersion.getPlainVersion()));
            final String path = executable.toString();
            if ("zip".equals(System.getProperty(PROP_DISTRIBUTION_TYPE))) {


                job.schedule();
            gd = new GridData(GridData.FILL_HORIZONTAL);
                            });

        } else if (buttonId == CHECK_EA_ID) {
    }
    private static final String DISTRIBUTION_DEB = "deb";
                ShellUtils.launchProgram(earlyAccessURL);
            } else {
        for (String rnLine : rnLines) {
        return super.close();
            INFO_ID,

        return newVersion.getProgramVersion().compareTo(currentVersion) > 0;
            } else {
                result.append(rnLine.substring(leadSpacesNum));
    private static final int UPGRADE_ID = 1001;
                dist = DISTRIBUTION_DEB;
            IDialogConstants.CLOSE_LABEL,
        }
                                }

                            log.debug("Downloading installation file to " + file);
        gd.horizontalSpan = 2;
import org.jkiss.dbeaver.runtime.WebUtils;
                                    ShellUtils.launchProgram(folder.toString());
        return CommonUtils.removeTrailingSlash(version.getBaseURL()) + "?start" +
import org.jkiss.dbeaver.model.runtime.AbstractJob;
                parent,


                                ActionUtils.runCommand(IWorkbenchCommandConstants.FILE_EXIT, workbenchWindow);
            .setText(currentVersion.toString());
    private String getDownloadURL(@NotNull ApplicationDescriptor application, @NotNull PlatformInstaller installer, @NotNull VersionDescriptor version) {
            .setText(newVersion.getProgramVersion().toString() + "    (" + newVersion.getUpdateTime() + ")"); //$NON-NLS-2$ //$NON-NLS-3$
            String releaseNotes = CommonUtils.notEmpty(newVersion.getReleaseNotes());
                        return Status.OK_STATUS;
        if (dontShowAgainCheck != null && dontShowAgainCheck.getSelection()) {
import org.jkiss.dbeaver.model.impl.app.ApplicationDescriptor;
    private static final String DISTRIBUTION_RPM = "rpm";


    {

        this.showConfig = showConfig;
                RuntimeUtils.executeProcess("/usr/bin/apt-get", "--version");
        boldFont = UIUtils.makeBoldFont(composite.getFont());
    }
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
    }
import org.jkiss.dbeaver.ui.ActionUtils;
                            folder = Files.createTempDirectory(executable);
                                }
    private final VersionDescriptor newVersion;
            "&os=" + os +
        return newVersion;
            try {

        StringBuilder result = new StringBuilder();
    private static final String OS_LINUX = "linux";
    @Override

        createBottomArea(composite);
        } else if (buttonId == IDialogConstants.PROCEED_ID) {
    private static final int INFO_ID = 1000;
        if (RuntimeUtils.isWindows()) {
    @NotNull
                leadSpacesNum++;
import org.eclipse.core.runtime.Platform;
                                        log.error("Failed to run the installer script", e);
        public void run(@NotNull Path executable, @NotNull Log log) throws Exception {
    private static String formatReleaseNotes(String releaseNotes) {
        if (showConfig && isNewVersionAvailable()) {
            parent,
                    @Override
                                        installer.run(file, log);
                "/bin/sh", "-c",
        this.currentVersion = currentVersion;
        } else if (RuntimeUtils.isMacOS()) {
            ((GridLayout) parent.getLayout()).numColumns++;
        @NotNull
        createButton(
        close();

                CoreMessages.dialog_version_update_button_more_info,
    @Override
        }
    public boolean close()
    }


 * You may obtain a copy of the License at

                CheckForUpdateAction.deactivateStandardHandler(window);

    }
                        } catch (IOException e) {
        composite.setLayout(new GridLayout(1, false));
                    @NotNull
        }
                                    workbench.removeWorkbenchListener(listener);
        new Label(propGroup, SWT.NONE)
                                    workbench.addWorkbenchListener(this);
        UIUtils.createControlLabel(propGroup, CoreMessages.dialog_version_update_current_version);
 * limitations under the License.
    }
import org.eclipse.jface.dialogs.Dialog;
        for (int i = 0; i < rnLines[0].length(); i++) {
import org.osgi.framework.Version;
            releaseNotes = formatReleaseNotes(releaseNotes);
import java.nio.file.Files;
 *
 * you may not use this file except in compliance with the License.
    private static final String OS_WINDOWS = "win";
            }
        }
    }
                                    try {
        }
        } else if (buttonId == UPGRADE_ID) {
                            UIUtils.asyncExec(() -> {
                        final Path file;
 * Copyright (C) 2010-2026 DBeaver Corp and others
                ActionUtils.runCommand(CheckForUpdateAction.P2_UPDATE_COMMAND, PlatformUI.getWorkbench().getActiveWorkbenchWindow());

    {
                            final String executable = installer.getExecutableName(app);
    private static final Log log = Log.getLog(VersionUpdateDialog.class);
            Runtime.getRuntime().exec(new String[]{
                        final ApplicationDescriptor app = ApplicationRegistry.getInstance().getApplication();
    }
    protected void buttonPressed(int buttonId)
    @NotNull
        public String getExecutableName(@NotNull ApplicationDescriptor application) {
    private interface PlatformInstaller {
            case Platform.OS_MACOSX -> new MacintoshInstaller();
import java.nio.file.Path;

            GridData.FILL_BOTH

import java.io.IOException;

        }
    {
        final Label titleLabel = new Label(propGroup, SWT.NONE);
    private final String earlyAccessURL;
 * Unless required by applicable law or agreed to in writing, software

                            file = Files.createFile(folder.resolve(executable));
    public boolean isShowConfig() {
    }
            CheckForUpdateAction.activateStandardHandler(window);
            ShellUtils.launchProgram(newVersion.getBaseURL());
                return application.getId() + "-latest-" + Platform.getOSArch() + "-setup.exe";
        final String executable = installer.getExecutableName(application);
        super(parentShell);
                break;
                true);
            hintLabel.setText(NLS.bind(
            false);
        while (releaseNotes.startsWith("\n")) {
    private static final class WindowsInstaller implements PlatformInstaller {
            CoreMessages.dialog_version_update_button_more_info,
            final Label notesLabel = UIUtils.createControlLabel(propGroup, CoreMessages.dialog_version_update_notes);
                            log.debug("Canceled by user", e);
        @NotNull
    @Nullable
    private boolean isNewVersionAvailable() {

                            ShellUtils.showInSystemExplorer(file.toAbsolutePath().toString());
        String getExecutableName(@NotNull ApplicationDescriptor application);
        } else {
            dontShowAgainCheck = UIUtils.createCheckbox(parent, NLS.bind(CoreMessages.dialog_version_update_ignore_version, newVersion.getPlainVersion()), false);
            final Text notesText = new Text(propGroup, SWT.READ_ONLY | SWT.WRAP | SWT.V_SCROLL);
                "open -F -W " + path + " && rm " + path
        }
            if (rnLines[0].charAt(i) == ' ') {
    {
    protected void createTopArea(Composite composite) {

    protected void createButtonsForButtonBar(Composite parent)

                            return Status.OK_STATUS;
                CoreMessages.dialog_version_update_button_upgrade,
    private boolean showConfig;
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (isNewVersionAvailable()) {
                return application.getId() + "-latest-win32.win32." + Platform.getOSArch() + ".zip";

        if (isNewVersionAvailable()) {
 * DBeaver - Universal Database Manager
            (dist == null ? "" : "&dist=" + dist);
    @NotNull
                                public boolean preShutdown(IWorkbench workbench, boolean forced) {
        return showConfig;
            parent,
                                    } catch (Exception e) {
                UPGRADE_ID,
        Composite propGroup = UIUtils.createTitledComposite(
            }
                            // Arm shutdown listener now because later will be too late
 * See the License for the specific language governing permissions and
                "cmd.exe", "/C",

    }
/*
        @Override
import org.jkiss.dbeaver.Log;
            if (!CommonUtils.isEmpty(earlyAccessURL)) {
        int leadSpacesNum = 0;
                            return GeneralUtils.makeErrorStatus(CoreMessages.dialog_version_update_downloader_error_cannot_download, e);

            gd.horizontalSpan = 2;
    private PlatformInstaller getPlatformInstaller() {

    {
    @Override
                final AbstractJob job = new AbstractJob("Downloading installation file") {

        public String getExecutableName(@NotNull ApplicationDescriptor application) {
 *
        return parent;

            notesLabel.setLayoutData(gd);
import org.jkiss.dbeaver.ui.app.standalone.internal.CoreApplicationActivator;
            }

        }
                                }
            try {
        new Label(propGroup, SWT.NONE)
import org.eclipse.swt.layout.GridLayout;
                !isNewVersionAvailable());
    private Font boldFont;
    private static final int CHECK_EA_ID = 1002;
                    }
                            WebUtils.downloadRemoteFile(monitor, "Obtaining installer", getDownloadURL(app, installer, newVersion), file, null);

        return result.toString();
    protected Control createDialogArea(Composite parent)
                    parent,
            gd.horizontalSpan = 2;
import org.eclipse.ui.*;
import org.eclipse.core.runtime.Status;
    }
        }

        void run(@NotNull Path executable, @NotNull Log log) throws Exception;
                                @Override
            os = OS_WINDOWS;
            }
            os = OS_MACOS;
        createTopArea(composite);
import org.eclipse.osgi.util.NLS;
            });
    private static final String OS_MACOS = "mac";
                dist = DISTRIBUTION_RPM;

import org.jkiss.dbeaver.DBException;
            if (installer != null) {

                        try {
        }
                                if (!workbench.isClosing()) {

 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
        getShell().setText(CoreMessages.dialog_version_update_title);
            final IWorkbenchWindow window = UIUtils.getActiveWorkbenchWindow();
                ShellUtils.launchProgram(getDownloadPageURL(newVersion));
            notesText.setLayoutData(gd);
                        if (UIUtils.confirmAction(CoreMessages.dialog_version_update_downloader_title, NLS.bind(CoreMessages.dialog_version_update_downloader_confirm_install, app.getName()))) {
        titleLabel.setFont(boldFont);
                        }
            final Label hintLabel = new Label(propGroup, SWT.NONE);
                };
                releaseNotes = CoreMessages.dialog_version_update_no_notes;

        }
    }
        return switch (Platform.getOS()) {
                                @Override
            NLS.bind(!isNewVersionAvailable() ? CoreMessages.dialog_version_update_no_new_version : CoreMessages.dialog_version_update_available_new_version, GeneralUtils.getProductName()));

                                public void postShutdown(IWorkbench workbench) {
            hintLabel.setFont(boldFont);
                        } else {
        earlyAccessURL = GeneralUtils.getProductEarlyAccessURL();
            CoreApplicationActivator.getDefault().getPreferenceStore().setValue("suppressUpdateCheck." + newVersion.getPlainVersion(), true);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

        UIUtils.createControlLabel(propGroup, CoreMessages.dialog_version_update_new_version);
            } finally {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        createButton(
import org.eclipse.jface.dialogs.IDialogConstants;
import org.jkiss.utils.CommonUtils;
        titleLabel.setLayoutData(gd);
        return boldFont;


import org.eclipse.swt.widgets.*;
            gd = new GridData(GridData.FILL_BOTH);

    public VersionDescriptor getNewVersion() {

            gd.horizontalSpan = 2;
    private static final String PROP_DISTRIBUTION_TYPE = "dbeaver.distribution.type";
    }

public class VersionUpdateDialog extends Dialog {
        return CommonUtils.removeTrailingSlash(version.getDownloadURL()) + '/' + executable;

                                {

            final PlatformInstaller installer = getPlatformInstaller();
import org.jkiss.dbeaver.model.impl.app.ApplicationRegistry;
            CoreMessages.dialog_version_update_title,
 */
                "start", "/W", path, "&&", "del", path,
        Composite composite = new Composite(parent, SWT.NONE);
            } else {
            }
    }
                            final IWorkbench workbench = PlatformUI.getWorkbench();
            gd = new GridData(GridData.FILL_HORIZONTAL);
    protected boolean isResizable() {
    }
 *     http://www.apache.org/licenses/LICENSE-2.0

        @Override
        String dist = System.getProperty(PROP_DISTRIBUTION_TYPE);
import org.jkiss.dbeaver.registry.updater.VersionDescriptor;

        return true;
        boldFont.dispose();
    public Font getBoldFont() {
            createButton(
        String os;
            if (releaseNotes.isEmpty()) {
            if (!CommonUtils.isEmpty(earlyAccessURL)) {
            composite,
        }
                            };
            gd.heightHint = CommonUtils.clamp(notesText.getLineCount(), 5, 20) * notesText.getLineHeight();
    private final Version currentVersion;
            // If distribution type was not set explicitly, then let's attempt a dumb guess.
                                }
            default -> null;
            return application.getId() + "-latest-macos-" + Platform.getOSArch() + ".dmg";
import org.eclipse.swt.layout.GridData;

}

                                    }
    private String getDownloadPageURL(@NotNull VersionDescriptor version) {
    }
import org.jkiss.dbeaver.ui.UIUtils;

import org.jkiss.code.NotNull;
            releaseNotes = releaseNotes.substring(1);

    @Override
import org.jkiss.code.Nullable;
            final String path = CommonUtils.escapeBourneShellString(executable.toString());
                if (result.length() > 0) result.append("\n");
                        }
                            final IWorkbenchListener listener = new IWorkbenchListener() {
            if (rnLine.length() > leadSpacesNum) {
            "&arch=" + Platform.getOSArch() +
    }
            IDialogConstants.CLOSE_ID,
    private static final class MacintoshInstaller implements PlatformInstaller {
                            final IWorkbenchWindow workbenchWindow = UIUtils.getActiveWorkbenchWindow();
import org.jkiss.dbeaver.core.CoreMessages;
            notesText.setText(releaseNotes);
        this.newVersion = newVersion;
                        } catch (InterruptedException e) {
