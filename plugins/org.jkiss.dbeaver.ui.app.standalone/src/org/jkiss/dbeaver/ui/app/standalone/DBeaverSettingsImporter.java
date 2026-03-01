                        driversText = driversText.replace("${workspace}\\.metadata\\.plugins\\org.jkiss.dbeaver.core", "${drivers_home}");
        long totalFiles = countWorkspaceFiles(oldDir);
import org.eclipse.swt.widgets.*;
            switch (fileName) {
                        dirType = DIR_TYPE.CORE;
        windowShell.setImage(dbeaverIcon);
        progressBar.setLayoutData(gd);
        // Just copy the file
        }
    private File driversFolder;
                    }
 */
        "org.eclipse.help.ui",
        PLUGINS,
                copyWorkspaceFiles(monitor, DIR_TYPE.WORKSPACE, oldDir, newDir);

 *
                    } catch (IOException e) {

 * See the License for the specific language governing permissions and
 */
        progressBar.setMinimum(0);
                    if (response == SWT.YES) {

                        showMessageBox("Import completed", "Configuration was imported to '" + newDir.getAbsolutePath() + "'", SWT.ICON_INFORMATION | SWT.OK);
                        skippedFiles += countWorkspaceFiles(file);
        WorkbenchPlugin.unsetSplashShell(display);
                        driversText = IOUtils.readToString(r);
        progressBar.setMaximum((int) (totalFiles / 1000));
        }
            windowShell.setDefaultButton(migrateButton);
                        }

        progressBar.setVisible(false);
    };

        "org.eclipse.ui.workbench.texteditor",
                    break;
                    }
        for (File file : files) {
 * DBeaver - Universal Database Manager
            public void subTask(@NotNull final String name) {
            }
                    if (parentDirType == DIR_TYPE.METADATA) {

            //confirmLabel.setImage(JFaceResources.getImage(org.eclipse.jface.dialogs.Dialog.DLG_IMG_MESSAGE_INFO));
        progressLabel.setText("Counting workspace files...");
                    skipButton.setEnabled(false);
            skipButton.addSelectionListener(new SelectionAdapter() {
                    windowShell.pack();
        "org.eclipse.ui.ide",
    enum DIR_TYPE {
                    continue;
                    MessageBox messageBox = new MessageBox(windowShell, SWT.ICON_WARNING | SWT.YES | SWT.NO);
        "org.eclipse.equinox.security.ui",
                if (!newDir.exists()) {
                copyFolderFiles(monitor, oldDriversFolder, driversFolder);
    private long countWorkspaceFiles(File dir) {
    private int showMessageBox(String title, String message, int style) {
                // Error
            buttonsPanel.setLayout(new GridLayout(2, true));
    private File oldDriversFolder;
            confirmLabel.setText(
                    migrateWorkspace(oldDir, newDir);
                    }
 *
        NORMAL,
                    if (!newDir.mkdirs()) {
        }
                                    continue;
                if (parentDirType == DIR_TYPE.PLUGINS) {
        "org.eclipse.equinox.p2.ui",
        driversFolder = new File(
                        dirType = DIR_TYPE.METADATA;
        messageBox.setMessage(message);
        }
                    if (!fileName.contains("dbeaver") && !ArrayUtils.contains(COPY_PLUGINS, fileName)) {
                monitor.worked((int) file.length());
                            e.printStackTrace(System.err);
                } else if (parentDirType == DIR_TYPE.CORE && fileName.equals("drivers.xml")) {
                    // Skip ALL hidden files in .metadata
                    }
    }
    private void copyFileContents(File file, File newFile) {

                display.syncExec(() -> progressLabel.setText(name));
                }
                        System.err.println("Can't create target workspace directory '" + newDir.getAbsolutePath() + "'");
import java.util.Properties;
                count += countWorkspaceFiles(file);
            monitor.subTask(relPath);
import org.eclipse.ui.internal.WorkbenchPlugin;
        windowShell.setLayout(new GridLayout(1, false));
        progressLabel.setLayoutData(new GridData(GridData.FILL_BOTH));
        final DBRProgressMonitor monitor = new BaseProgressMonitor() {
        // Make new shell
                    if (parentDirType == DIR_TYPE.PLUGINS) {
            if (file.isDirectory()) {

                        dirType = DIR_TYPE.PLUGINS;
 * distributed under the License is distributed on an "AS IS" BASIS,
            public void worked(final int work) {
        }
    }
        gd.exclude = true;
            }

            iconLabel.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
                    public void run() {
                public void widgetSelected(SelectionEvent e) {
import org.jkiss.dbeaver.model.runtime.BaseProgressMonitor;
                    progressBar.setSelection((int) (bytesProcessed / 1000));

                    copyWorkspaceFiles(monitor, dirType, file, newDir);
                        File oldDriversPath = new File(driversHomeProp);

 * you may not use this file except in compliance with the License.
    private final Display display;
                                    System.err.println("Can't create drivers folder " + targetDir.getAbsolutePath());
        }
        for (File file : files) {
    boolean migrateFromPreviousVersion(final File oldDir, final File newDir) {
    private final DBeaverApplication application;
                        shellResult = SWT.OK;
        return (shellResult != SWT.NONE);
                    skippedFiles += countWorkspaceFiles(file);
                    messageBox.setText("Skip workspace migration");
                        e.printStackTrace(System.err);
                    }
            DBConstants.DEFAULT_DRIVERS_FOLDER);

        final GridData gd = new GridData(GridData.FILL_BOTH);
        windowShell = new Shell(display);
                if (parentDirType == DIR_TYPE.METADATA && !(fileName.equals(".plugins") || fileName.equals("qmdb") || fileName.startsWith("dbeaver"))) {
            } else {
                }
                    @Override
            String relPath = file.getAbsolutePath().substring(oldWorkspacePath.getAbsolutePath().length());

        totalFiles += countWorkspaceFiles(oldDriversFolder);
                copyFileContents(file, new File(toDir, file.getName()));
        progressBar = new ProgressBar(windowShell, SWT.SMOOTH);
                }

                            w.write(driversText);

                    try (FileInputStream is = new FileInputStream(file)) {
        DesktopApplicationImpl.CORE_RESOURCES_PLUGIN_ID,
        messageBox.setText(title);
                File newDir = new File(toDir, fileName);
//                "Previous version (" + GeneralUtils.getProductName() + " " + oldVersion + ") settings were found.\n" +
            @Override
                }
                    }
            //System.getProperty(StandardConstants.ENV_USER_HOME),
    private void copyFolderFiles(DBRProgressMonitor monitor, File fromDir, File toDir) {
 * You may obtain a copy of the License at
        gd.heightHint = 30;
                    }
            infoGroup.setLayout(gl);
            }
                if (newDir.exists() || newDir.mkdir()) {
                        case "drivers":
        windowShell.setLocation((screenSize.width - windowShell.getBounds().width) / 2, (screenSize.height - windowShell.getBounds().height) / 2);
import org.eclipse.swt.graphics.Image;
        if (oldVersion == null) {
                    int response = messageBox.open();
            return count;
            // It is already there
            }
    private void copyWorkspaceFiles(DBRProgressMonitor monitor, DIR_TYPE parentDirType, File fromDir, File toDir) {
            buttonsPanel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            gl.horizontalSpacing = 10;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.events.SelectionEvent;
                });
        };
        }).start();
                    try (Reader r = new InputStreamReader(new FileInputStream(file), GeneralUtils.UTF8_CHARSET)) {
            } finally {
                        return;
                File newFile = new File(toDir, fileName);
    private Shell windowShell;
    public DBeaverSettingsImporter(DBeaverApplication application, Display display) {

        // Can't lock specified path
                case ".metadata":
                    System.err.println("Can't create folder " + newDir.getAbsolutePath());
                            copyWorkspaceFiles(monitor, DIR_TYPE.NORMAL, file, targetDir);

            long bytesProcessed = 0;
                            // Set new drivers path
import org.jkiss.utils.IOUtils;
                    try (FileOutputStream os = new FileOutputStream(newFile)) {

 *     http://www.apache.org/licenses/LICENSE-2.0
                        windowShell.dispose();
                "Do you want to migrate existing settings (version " + oldVersion + ")?\n\n"
import org.jkiss.utils.ArrayUtils;
            });
                }
                if (parentDirType == DIR_TYPE.METADATA && fileName.startsWith(".")) {
import org.jkiss.dbeaver.model.rcp.DesktopApplicationImpl;
                    // Copy drivers in the separate location
        "org.eclipse.ui.views.log",
                        } catch (IOException e) {

            Label confirmLabel = new Label(infoGroup, SWT.NONE);
                    } catch (IOException e) {
        "org.eclipse.ui.workbench",
 * limitations under the License.
                @Override
                File newDir = new File(toDir, file.getName());
        windowShell.setText("Import " + GeneralUtils.getProductName() + " configuration");
        } else {
        MessageBox messageBox = new MessageBox(windowShell, style);
            String fileName = file.getName();
            Label iconLabel = new Label(infoGroup, SWT.NONE);
        this.display = display;
                    if (parentDirType == DIR_TYPE.WORKSPACE) {
                    progressBar.setVisible(true);

                e.printStackTrace(System.err);
            });
                    skippedFiles++;
            }
                    // Skip all dirs but plugins
                }
            }
                "\n" +
            monitor.worked((int) (file.length() + skippedFiles));
        return messageBox.open();
//                "Make sure previous version of " + GeneralUtils.getProductName() + " isn't running"
            iconLabel.setImage(dbeaverLogo);

                    }
                                }
                    messageBox.setMessage("You will lose all previous configurations and scripts.\n\nAre you sure?");
                    }
import org.jkiss.dbeaver.model.DBConstants;
                                if (!targetDir.mkdirs()) {

        "org.eclipse.compare",
                            if (!targetDir.exists()) {
                    } catch (IOException e) {
        windowShell.pack();
        } else {

import org.eclipse.swt.events.SelectionAdapter;
        if (newFile.exists() && newFile.length() == file.length()) {
                    }
                        coreProps.store(os, null);
package org.jkiss.dbeaver.ui.app.standalone;
            infoGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
    private static final String[] COPY_PLUGINS = {
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.swt.layout.GridLayout;
        "org.eclipse.e4.ui.workbench.swt",
class DBeaverSettingsImporter {
                                    skippedFiles += countWorkspaceFiles(file);
            final Button migrateButton = new Button(buttonsPanel, SWT.PUSH);
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        }
                e.printStackTrace(System.err);
        }

                    break;
                if (newDir.exists() || newDir.mkdirs()) {
    }
            DBConstants.LEGACY_DRIVERS_FOLDER);
        windowShell.open();
            migrateButton.setText("Migrate (Recommended)");
            Composite buttonsPanel = new Composite(windowShell, SWT.NONE);
 * Copyright (C) 2010-2025 DBeaver Corp and others
            return;
                if (parentDirType == DIR_TYPE.CORE) {
        for (File file : files) {
            System.getProperty(StandardConstants.ENV_USER_HOME),
        String oldVersion = workspaceProps.getProperty(DBeaverApplication.VERSION_PROP_PRODUCT_VERSION);
            } catch (Exception e) {
import org.eclipse.swt.SWT;
                workspaceProps.load(is);

                try (FileOutputStream os = new FileOutputStream(newFile)) {
        while (!windowShell.isDisposed ()) {
import org.jkiss.dbeaver.utils.GeneralUtils;
import org.eclipse.swt.layout.GridData;
                    migrateButton.setEnabled(false);
                    Properties coreProps = new Properties();
                    break;

                    if (driversHomeProp != null && !driversHomeProp.isEmpty()) {
                    bytesProcessed += work;
                }
        Image dbeaverIcon = AbstractUIPlugin.imageDescriptorFromPlugin(DBeaverApplication.APPLICATION_PLUGIN_ID, "icons/dbeaver32.png").createImage();
    private void migrateWorkspace(final File oldDir, final File newDir) {
                case ".plugins":
        final File[] files = dir.listFiles();
        gd.widthHint = 300;

            migrateButton.addSelectionListener(new SelectionAdapter() {
                }
 * This class controls all aspects of the application's execution
        if (files == null) {
                count += file.length();
                @Override
            migrateButton.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        if (files == null) {
        METADATA,
            } catch (IOException e) {
        // Hide splash if any
        {
    }
                }
            newDir.getParent(),
                } else {
                    copyFolderFiles(monitor, file, newDir);
                        driversText = driversText.replace("${workspace}/.metadata/.plugins/org.jkiss.dbeaver.core", "${drivers_home}");
                        try (Writer w = new OutputStreamWriter(new FileOutputStream(newFile), GeneralUtils.UTF8_CHARSET)) {
import org.jkiss.utils.StandardConstants;
            }
        }
            try (FileInputStream is = new FileInputStream(file)) {

                    switch (fileName) {
            try (InputStream is = new FileInputStream(versionFile)) {

        return count;
    }
                            continue;
                    IOUtils.fastCopy(is, os, 100000);
        Rectangle screenSize = display.getPrimaryMonitor().getBounds();
        Properties workspaceProps = new Properties();
//                oldDir.getAbsolutePath() + "\n" +
    private ProgressBar progressBar;
}
                } else {
        oldDriversFolder = new File(
                    }
                DBeaverApplication.WORKSPACE_MIGRATED = true;
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
        File versionFile = GeneralUtils.getMetadataFolder(oldDir.toPath()).resolve(DBConstants.WORKSPACE_PROPS_FILE).toFile();
    private File oldWorkspacePath;

            oldVersion = "3.x";
        oldWorkspacePath = oldDir;
import java.io.*;
        "org.eclipse.search",
                    // Patch configuration
        new Thread(() -> {
            skipButton.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            final Button skipButton = new Button(buttonsPanel, SWT.PUSH);
        WORKSPACE,
                    }
    private Label progressLabel;
            }
            if (file.isDirectory()) {

                } else {
                    ((GridData)progressBar.getLayoutData()).exclude = false;
import org.jkiss.code.NotNull;
                        coreProps.load(is);
        CORE
                    copyFileContents(file, newFile);
            oldVersion = GeneralUtils.getPlainVersion(oldVersion);
                display.syncExec(new Runnable() {
            } else {
 *
            }
    }
        }
            Group infoGroup = new Group(windowShell, SWT.NONE);
                        if (oldDriversPath.equals(new File(oldWorkspacePath, ".metadata/.plugins/org.jkiss.dbeaver.core"))) {
            DIR_TYPE dirType = DIR_TYPE.NORMAL;
import org.eclipse.ui.plugin.AbstractUIPlugin;
                        continue;
                        windowShell.dispose();
            confirmLabel.setLayoutData(new GridData(GridData.FILL_BOTH));
                    continue;
                    // Patch drivers cache path
        {
/**
        this.application = application;
        DesktopApplicationImpl.CORE_RUNTIME_PLUGIN_ID,
        final File[] files = fromDir.listFiles();
                    if (driversText != null) {
                        case "remote":
    private int shellResult = SWT.NONE;
                            File targetDir = new File(driversFolder, fileName);
                });
        long skippedFiles = 0;

                if (fileName.equals("org.jkiss.dbeaver.core.prefs")) {
                            coreProps.setProperty("ui.drivers.home", driversFolder.getAbsolutePath());
        }
                case "org.jkiss.dbeaver.core":
        long count = 1;
        }

        }

            monitor.subTask(file.getName());
            if (!display.readAndDispatch ()) display.sleep ();
    }
            skipButton.setText("Do not migrate");
            if (file.isDirectory()) {
        progressLabel = new Label(windowShell, SWT.NONE);
        if (files == null) {
                }
        Image dbeaverLogo = AbstractUIPlugin.imageDescriptorFromPlugin(DBeaverApplication.APPLICATION_PLUGIN_ID, "icons/dbeaver64.png").createImage();
        final File[] files = fromDir.listFiles();
                display.syncExec(() -> {
                    String driversText = null;
            infoGroup.setText("Import workspace");
                    System.err.println("Can't create folder " + newDir.getAbsolutePath());
            try {

        if (versionFile.exists()) {
            @Override
                GeneralUtils.getProductTitle() + " uses a new configuration format.\n\n" +
    }
                        e.printStackTrace(System.err);
            );
                public void widgetSelected(SelectionEvent e) {
                            }
                    }
                }

                        e.printStackTrace(System.err);
                    final String driversHomeProp = coreProps.getProperty("ui.drivers.home");
            } else {
            GridLayout gl = new GridLayout(2, false);
            return;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                        case "maven":
                        shellResult = SWT.IGNORE;
