                    fileName.append("-report.html");

        showError(null);
                );
                if (report.getNodes().size() <= 3) {
            DBWorkbench.getPlatformUI().showError(CompareUIMessages.compare_objects_wizard_error_title, error);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    DBWorkbench.getPlatform().getTempFolder(monitor, "compare-report"),


    @Override
        // Done
                }
/*
                reportRenderer.renderReport(monitor, report, getSettings(), outputStream);
    }
            );
        super.dispose();
 * Unless required by applicable law or agreed to in writing, software

        final CompareObjectsExecutor executor = new CompareObjectsExecutor(settings);

    }
            showError(e.getMessage());
    private void showError(String error) {
    private final CompareObjectsSettings settings;
        } catch (InvocationTargetException e) {
        } catch (InterruptedException e) {
            log.error(e);
    @Override
import java.lang.reflect.InvocationTargetException;
    @Override
            }
import org.jkiss.dbeaver.DBException;
                    fileName.append("-report").append("-").append(RuntimeUtils.getCurrentTimeStamp()).append(".html");
                    Files.createDirectories(parentFolder);
import org.jkiss.dbeaver.ui.DialogSettingsDelegate;

 * Copyright (C) 2010-2025 DBeaver Corp and others

import org.eclipse.jface.viewers.IStructuredSelection;
import org.jkiss.dbeaver.ui.UIUtils;
                monitor.done();
            Path reportFile;


                CompareUIMessages.compare_objects_wizard_finish_report_title,
        setNeedsProgressMonitor(true);
 * Licensed under the Apache License, Version 2.0 (the "License");
            if (Objects.requireNonNull(settings.getOutputType()) == CompareObjectsSettings.OutputType.BROWSER) {
            UIUtils.run(getContainer(), true, true, monitor -> {
                        fileName.append("-").append(CommonUtils.escapeIdentifier(node.getName()));
            } else {

            } else {

import org.eclipse.swt.SWT;
                showError(executor.getInitializeError().getMessage());
            }
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.Log;
        addPage(new CompareObjectsPageOutput());
    @Override
        }
        this.settings = new CompareObjectsSettings(nodes);
                getShell(),
                }
import org.jkiss.dbeaver.tools.compare.simple.CompareObjectsSettings;
        this.settings.setOutputFolder(DialogUtils.getCurDialogFolder());
        if (CommonUtils.isNotEmpty(error)) {
                try {

 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        } catch (IOException e) {
        // Compare
            executor.dispose();
                } catch (DBException e) {
    private void renderReport(DBRProgressMonitor monitor, CompareReport report) {
import org.eclipse.ui.IWorkbench;

 *
                    throw new InvocationTargetException(e);
import java.util.List;
 *
        monitor.beginTask("Compare objects", 1000);
 * limitations under the License.
import org.jkiss.dbeaver.runtime.DBWorkbench;
                    }
            }
        try {
    }
    }
    public CompareObjectsWizard(List<DBNDatabaseNode> nodes) {
                }
    }
            UIUtils.showMessageBox(
                StringBuilder fileName = new StringBuilder("compare"); //"compare-report.html";
        setWindowTitle(CompareUIMessages.compare_objects_wizard_title);
                SWT.ICON_INFORMATION
            if (settings.getOutputType() == CompareObjectsSettings.OutputType.BROWSER) {
        CompareReport report = executor.compareObjects(monitor, getSettings().getNodes());
        }
                monitor.beginTask("Render report", report.getReportLines().size());
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
        } finally {
 * DBeaver - Universal Database Manager
                CompareReportRenderer reportRenderer = new CompareReportRenderer();
import java.nio.file.Path;

public class CompareObjectsWizard extends Wizard implements IExportWizard {
    private CompareReport generateReport(DBRProgressMonitor monitor, CompareObjectsExecutor executor)
        setDialogSettings(section);
                CompareUIMessages.compare_objects_wizard_finish_report_info,
            try (OutputStream outputStream = Files.newOutputStream(reportFile)) {
}    public void addPages() {
import org.jkiss.dbeaver.tools.compare.simple.CompareReport;
                    "compare",
        monitor.done();
import org.jkiss.dbeaver.tools.compare.simple.CompareObjectsExecutor;
import org.jkiss.dbeaver.ui.dialogs.DialogUtils;

import java.nio.file.Files;
import org.jkiss.dbeaver.tools.compare.simple.CompareReportRenderer;
    private static final Log log = Log.getLog(CompareObjectsWizard.class);
                log.error(e.getTargetException());
                if (!Files.exists(parentFolder)) {
                    CompareReport report = generateReport(monitor, executor);
        getSettings().saveTo(new DialogSettingsDelegate(getDialogSettings()));
        IDialogSettings section = UIUtils.getDialogSettings(RS_COMPARE_WIZARD_DIALOG_SETTINGS);
            }
 *
                reportFile = parentFolder.resolve(fileName.toString());
                showError(e.getTargetException().getMessage());
                reportFile = Files.createTempFile(
    throws DBException, InterruptedException {
import java.io.IOException;

import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;

            return false;
            return false;
    public boolean performFinish() {
        // Save settings
import org.eclipse.jface.wizard.Wizard;
import org.jkiss.dbeaver.tools.compare.simple.ui.internal.CompareUIMessages;
    public CompareObjectsSettings getSettings() {
            });
import java.util.Objects;
            if (executor.getInitializeError() != null) {
        return true;


import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * you may not use this file except in compliance with the License.
            showError("Compare interrupted");
package org.jkiss.dbeaver.tools.compare.simple.ui;
        try {
import org.eclipse.jface.dialogs.IDialogSettings;
import java.io.OutputStream;
        super.addPages();
    public void init(IWorkbench workbench, IStructuredSelection currentSelection) {
import org.jkiss.dbeaver.ui.ShellUtils;
                ShellUtils.launchProgram(reportFile.toAbsolutePath().toString());
    }

import org.eclipse.ui.IExportWizard;
        addPage(new CompareObjectsPageSettings());
    private static final String RS_COMPARE_WIZARD_DIALOG_SETTINGS = "CompareWizard";//$NON-NLS-1$
    }
 */
                Path parentFolder = Path.of(settings.getOutputFolder());
        return report;
    public void dispose() {

        settings.loadFrom(new DialogSettingsDelegate(section));
        return settings;
                    renderReport(monitor, report);
    }
                    ".html"
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.utils.RuntimeUtils;
                } else {
 * You may obtain a copy of the License at
                    for (DBNDatabaseNode node : report.getNodes()) {
