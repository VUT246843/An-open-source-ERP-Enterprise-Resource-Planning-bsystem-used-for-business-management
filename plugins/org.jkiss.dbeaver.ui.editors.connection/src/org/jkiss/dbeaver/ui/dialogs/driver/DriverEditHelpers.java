                if (localFile == null || !Files.exists(localFile)) {
        for (DataSourceProviderDescriptor dspd : DataSourceProviderRegistry.getInstance().getDataSourceProviders()) {
        try {
                Path depExported = null;
        if (localFile == null) {
            } else {
                    "Export driver files", e, false);
import java.util.Collection;
import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;
                UIUtils.asyncExec(() -> {
                        }
        BadDriverConfigDialog(Shell shell, String title, String message, DBException error) {
                monitor.done();
            super.buttonPressed(id);

                        walk.forEach(source -> {

 */
                    if (CommonUtils.equalObjects(library.getPath(), oldLib.getPath())) {
        }
                    }
        @Override
import org.jkiss.dbeaver.ui.ShellUtils;
            if (!CommonUtils.isEmpty(dependencies)) {
                }
            }
    private static Path exportLibrary(DBRProgressMonitor monitor, DBPDriverLibrary library, String outputFolder) throws InterruptedException {
                });

import org.eclipse.core.runtime.IStatus;
import org.jkiss.dbeaver.ui.UIUtils;
                library.downloadLibraryFile(monitor, false, "Download file");
                    for (DBPDriverLibrary dep : dependencies) {
            if (id == IDialogConstants.RETRY_ID) {
                        .sorted(Comparator.reverseOrder())
import java.util.Comparator;
            dataSource = error instanceof DBDatabaseException dbe ? dbe.getDataSource() : null;
                monitor.beginTask("Count driver files", libraries.size());

 *
                }
                }
        return error instanceof DBCConnectException
    }
            }
                Collection<? extends DBPDriverLibrary> dependencies = library.getDependencies(monitor);
                log.debug(e);


            ? cause
import org.jkiss.dbeaver.DBDatabaseException;
                } catch (IOException e) {
        Path localFile = library.getLocalFile();
import org.jkiss.dbeaver.model.exec.DBCConnectException;
 * DBeaver - Universal Database Manager
                }
    @NotNull
    static class BadDriverConfigDialog extends StandardErrorDialog {
                ShellUtils.showInSystemExplorer(localFile.toAbsolutePath().toString());
        //log.debug(message);
                monitor.worked(1);
        if (firstExported[0] != null) {
            }
                        UIUtils.getActiveWorkbenchShell(),
                    monitor.subTask("Export library file '" + driverFileName + "'");
                }
    }
            } else {
public class DriverEditHelpers {
                if (Files.isDirectory(localFile)) {
import org.jkiss.dbeaver.model.connection.DBPDriverLibrary;
    }
            : error;
import java.util.List;


                if (!CommonUtils.isEmpty(dependencies)) {
            } catch (Exception e) {
        if (monitor.isCanceled()) {
                totalFiles++;
        }
                return outFile;
            if (Files.isDirectory(localFile)) {
 *
            for (DBPDriver driver : dspd.getDrivers()) {
                    }
                        .toList().size();

                            } catch (IOException e) {
                        break;
        if (localFile != null && Files.exists(localFile)) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.Log;
    public static void showBadConfigDialog(final Shell shell, final String message, final DBException error) {
 *
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.registry.DataSourceProviderDescriptor;
    }
                                Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
                    }
            } catch (IOException e) {
                    }
                    if (monitor.isCanceled()) {
                title,
            createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, false);
            }
                    case CANCEL:
                        drivers.add(driver);
        }
 * limitations under the License.
                    totalFiles += countFiles(monitor, library);
import java.lang.reflect.InvocationTargetException;
            // ignore
                            depExported = result;
import org.eclipse.swt.widgets.Shell;
                        dataSource.getContainer().getDriver());
            Collection<? extends DBPDriverLibrary> dependencies = library.getDependencies(monitor);
        if (CommonUtils.isEmpty(outputFolder)) {
        protected void createButtonsForButtonBar(@NotNull Composite parent) {
                switch (resp) {
                    try {
                        throw new InterruptedException();
                }
                    outFile = exported[0];
        }

        String outputFolder = DialogUtils.openDirectoryDialog(
    static void exportDriverLibraries(Shell shell, List<DBPDriverLibrary> libraries) {
            DBPDataSource dataSource = error instanceof DBDatabaseException dbe ? dbe.getDataSource() : null;
                            }
            String title = NLS.bind(UIConnectionMessages.dialog_edit_driver_dialog_bad_configuration,
                dataSource == null ? "<unknown driver>" : dataSource.getContainer().getDriver().getName());
import java.nio.file.StandardCopyOption;
import org.jkiss.dbeaver.utils.GeneralUtils;
        }
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            try {
        }
                RuntimeUtils.stripStack(GeneralUtils.makeExceptionStatus(error)),
            ShellUtils.showInSystemExplorer(firstExported[0].toFile());
 */
                }
            shell,
                        if (exported == null) {
                    monitor.worked(1);
                monitor.done();
                int totalFiles = 0;
                    } catch (InterruptedException e) {
                        Path exported = exportLibrary(monitor, library, outputFolder);
        @Override
    static List<DBPDriver> getDriversByLibrary(DBPDriverLibrary oldLib) {
        };
                            monitor.subTask("Export file '" + source + "'");
import org.jkiss.dbeaver.runtime.DBWorkbench;
    }
                for (DBPDriverLibrary library : driver.getDriverLibraries()) {
                message,
                            if (exported[0] == null) exported[0] = destination;
 * Licensed under the Apache License, Version 2.0 (the "License");

                for (DBPDriverLibrary library : libraries) {
        List<DBPDriver> drivers = new ArrayList<>();
        }
                            }
            if (Files.isDirectory(localFile)) {
        private final DBPDataSource dataSource;
                    totalFiles += walk

        Runnable runnable = () -> {
                IStatus.ERROR);
        while (true) {
                    outFile = Path.of(outputFolder, driverFileName);
        }
                for (DBPDriverLibrary library : libraries) {
                                return;
            && error.getCause() instanceof DBException cause
}
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        if (monitor.isCanceled()) {
    private static final Log log = Log.getLog(DriverEditHelpers.class);
                        Path result = exportLibrary(monitor, dep, outputFolder);
                ShellUtils.launchProgram(localFile.toAbsolutePath().toString());
        if (localFile != null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
/*
            }
                    case RETRY:
                        continue;
import java.nio.file.Path;
        protected void buttonPressed(int id) {
            }
                        if (firstExported[0] == null) {
                    }
            log.debug(e.getTargetException());
        } catch (InvocationTargetException e) {
 * distributed under the License is distributed on an "AS IS" BASIS,
            UIUtils.runInProgressDialog(monitor -> {
                Path localFile = library.getLocalFile();
                        break;
            try {
        }
        } catch (IOException e) {

                    log.debug(e);
            createDetailsButton(parent);
import org.jkiss.code.NotNull;
                DBPPlatformUI.UserResponse resp = DBWorkbench.getPlatformUI().showErrorStopRetryIgnore(
            }
 * See the License for the specific language governing permissions and
            super(
                try (Stream<Path> walk = Files.walk(localFile)) {
                        }
import org.jkiss.utils.CommonUtils;
                        if (depExported == null) {
import org.jkiss.dbeaver.ui.dialogs.DialogUtils;
        }
                            firstExported[0] = exported;
    private static DBException defineException(@NotNull DBException error) {
        return totalFiles;
/**
                    Path[] exported = new Path[1];
 * DriverEditUtils

            UIConnectionMessages.controls_client_homes_panel_label_path, null);
                            if (Files.isDirectory(source)) {
import org.eclipse.jface.dialogs.IDialogConstants;
                }
                    dialog.open();
            return null;
    private static int countFiles(DBRProgressMonitor monitor, DBPDriverLibrary library) {
import org.eclipse.swt.widgets.Composite;
            });
import org.jkiss.dbeaver.registry.DataSourceProviderRegistry;
                    DriverEditDialog dialog = new DriverEditDialog(
                monitor.beginTask("Export driver files", totalFiles);
package org.jkiss.dbeaver.ui.dialogs.driver;
import org.jkiss.dbeaver.ui.dialogs.StandardErrorDialog;
                            Path destination = Path.of(outputFolder, source.getFileName().toString());
                        }
            return;
        int totalFiles = 0;
                            try {
                    try (Stream<Path> walk = Files.walk(localFile)) {
                Path outFile = null;
                for (DBPDriverLibrary dep : dependencies) {
        Path[] firstExported = new Path[1];
                }
import org.jkiss.dbeaver.runtime.ui.DBPPlatformUI;
 * you may not use this file except in compliance with the License.
import java.util.ArrayList;

                super.buttonPressed(IDialogConstants.OK_ID);
                        });
            return 0;
                    case STOP:
 * Unless required by applicable law or agreed to in writing, software
                    String driverFileName = localFile.getFileName().toString();
        }

        UIUtils.syncExec(runnable);
        }
import java.io.IOException;
import org.jkiss.dbeaver.model.DBPDataSource;
                                log.debug(e);
    static void showFileInExplorer(Path localFile) {
                    Files.copy(localFile, outFile, StandardCopyOption.REPLACE_EXISTING);
import org.jkiss.dbeaver.model.connection.DBPDriver;
import java.util.stream.Stream;
            createButton(parent, IDialogConstants.RETRY_ID, "Open Driver &Configuration", true);
                } else {
import org.jkiss.dbeaver.utils.RuntimeUtils;
        return drivers;
            new BadDriverConfigDialog(shell, title, message == null ? title : message, defineException(error)).open();
    }
    }
import java.nio.file.Files;
        }
                    totalFiles += countFiles(monitor, dep);
import org.jkiss.dbeaver.DBException;
                shell == null ? UIUtils.getActiveWorkbenchShell() : shell,

                            continue;
                    return depExported;
import org.eclipse.osgi.util.NLS;
        try {
