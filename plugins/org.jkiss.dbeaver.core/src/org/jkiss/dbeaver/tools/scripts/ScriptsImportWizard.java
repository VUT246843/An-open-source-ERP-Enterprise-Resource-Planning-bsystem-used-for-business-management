        } else {
            if (targetFile.exists()) {
        @Override
                ex.getTargetException());
        collectFiles(importData.getInputDir(), masks, filesToImport);
                boolean matched = false;
        //addPage(new ProjectImportWizardPageFinal(data));
        private final ScriptsImportData importData;

            }
        try {
import java.util.StringTokenizer;
                        matched = true;
	}
import java.io.File;
import org.jkiss.utils.CommonUtils;
import java.io.IOException;
    {
import org.eclipse.core.runtime.IProgressMonitor;

            final IFile targetFile = targetDir.getFile(targetName);
            try (FileInputStream in = new FileInputStream(file)) {

        monitor.done();
public class ScriptsImportWizard extends Wizard implements IImportWizard {
        if (filesToImport.isEmpty()) {
            UIUtils.run(getContainer(), true, true, importer);
                importedCount = importScripts(monitor, importData);
			return;
            // Get target dir
import org.eclipse.core.resources.IFolder;
            } catch (Exception e) {
import org.jkiss.dbeaver.Log;
        }
        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            DBWorkbench.getPlatformUI().showError(
            String targetName = file.getName();
 *
            // Copy file
import org.jkiss.dbeaver.ui.editors.SimpleDatabaseEditorContext;
 */
}
	@Override
    {
            UIUtils.showMessageBox(getShell(), CoreMessages.dialog_scripts_import_wizard_dialog_message_title, CoreMessages.dialog_scripts_import_wizard_dialog_message_no_scripts, SWT.ICON_WARNING);
import org.jkiss.dbeaver.core.CoreMessages;
		}
import java.util.ArrayList;
            if (!(srcResource instanceof IFolder)) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
                mask = mask.replace("*", ".*"); //$NON-NLS-1$ //$NON-NLS-2$
        return imported;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        addPage(pageMain);
        {
        catch (InterruptedException ex) {

        public void run(DBRProgressMonitor monitor) throws InvocationTargetException {
 * Unless required by applicable law or agreed to in writing, software

 * limitations under the License.
                for (Pattern mask : masks) {
            UIUtils.showMessageBox(getShell(), CoreMessages.dialog_scripts_import_wizard_dialog_message_title, importer.getImportedCount() + CoreMessages.dialog_scripts_import_wizard_dialog_message_success_imported, SWT.ICON_INFORMATION);
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
    private class ScriptsImporter implements DBRRunnableWithProgress {
    @Override
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * You may obtain a copy of the License at
	public boolean performFinish() {
            return false;
        catch (InvocationTargetException ex) {
					targetFile.delete(true, true, RuntimeUtils.getNestedMonitor(monitor));
        	//!inputDir.exists()
            final IResource srcResource = importData.getImportDir().getResource();
import java.util.List;
import org.eclipse.ui.IImportWizard;
                    CoreMessages.dialog_scripts_import_wizard_dialog_error_title,
                throw new InvocationTargetException(e);
                targetDir = targetDir.getFolder(folder.getName());
/*
            }
                }

		monitor.beginTask(CoreMessages.dialog_scripts_import_wizard_monitor_import_scripts, imported);
            } else {
	                imported--;
import org.eclipse.core.resources.IFile;
            }
        setWindowTitle(CoreMessages.dialog_scripts_import_wizard_window_title);
import java.util.regex.Pattern;
                targetName += ".sql"; //$NON-NLS-1$
        List<Pattern> masks = new ArrayList<>();
                collectFiles(file, masks, filesToImport);
 *
    }

				}
            }
            return importedCount;
        }
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.CoreException;
        super.addPages();
        final IProgressMonitor nullMonitor = new NullProgressMonitor();
    public ScriptsImportWizard() {
 *
import org.eclipse.swt.SWT;
import org.jkiss.dbeaver.ui.editors.EditorUtils;
import org.eclipse.jface.wizard.Wizard;
	                log.warn("Overwriting file '" + targetFile.getFullPath() + "'"); //$NON-NLS-1$ //$NON-NLS-2$
    }
    private int importScripts(DBRProgressMonitor monitor, ScriptsImportData importData) throws IOException, CoreException
                path.add(0, parent);
        StringTokenizer st = new StringTokenizer(importData.getFileMasks(), ",; "); //$NON-NLS-1$
import org.jkiss.dbeaver.utils.RuntimeUtils;
        }
    private static final Log log = Log.getLog(ScriptsImportWizard.class);
	}
				} else {
        while (st.hasMoreTokens()) {

        }
        int imported = filesToImport.size();
            }
        }
            return false;
import org.jkiss.dbeaver.ui.UIUtils;
            // Done
        List<File> filesToImport = new ArrayList<>();
                continue;
 * Licensed under the Apache License, Version 2.0 (the "License");
	                log.warn("File '" + targetFile.getFullPath() + "' already exists - skipped"); //$NON-NLS-1$ //$NON-NLS-2$
        pageMain = new ScriptsImportWizardPage();
            if (file.isDirectory()) {
	@Override
                }
            }
		for (File file : listFiles) {
                    }
                    filesToImport.add(file);
            
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
            List<File> path = new ArrayList<>();
            monitor.subTask(file.getName());
        int getImportedCount()
                    targetDir.create(true, true, nullMonitor);
            }
    public void init(IWorkbench workbench, IStructuredSelection selection) {
                if (matched) {
            for (File folder : path) {
        private int importedCount;
        setNeedsProgressMonitor(true);
            return false;
            monitor.worked(1);
 *     http://www.apache.org/licenses/LICENSE-2.0
            if (importData.getDataSourceContainer() != null) {

				if (importData.isOverwriteFiles()) {
            this.importData = importData;
                CoreMessages.dialog_scripts_import_wizard_dialog_error_text,
        {
 * See the License for the specific language governing permissions and
    private ScriptsImportWizardPage pageMain;
package org.jkiss.dbeaver.tools.scripts;
import org.eclipse.ui.IWorkbench;


import java.io.FileInputStream;

        if (importer.getImportedCount() <= 0) {
                log.warn("Resource '" + srcResource + "' is not a folder"); //$NON-NLS-1$ //$NON-NLS-2$
        }
                targetFile.create(in, true, nullMonitor);
            }
                        break;
            return 0;

import org.eclipse.jface.viewers.IStructuredSelection;
                if (!targetDir.exists()) {
        }
            if (!targetName.toLowerCase().endsWith(".sql")) { //$NON-NLS-1$
        if (listFiles == null) {

    }
    public void addPages() {

import org.eclipse.core.resources.IResource;
 * you may not use this file except in compliance with the License.
                EditorUtils.setFileDataSource(targetFile, new SimpleDatabaseEditorContext(importData.getDataSourceContainer()));
import java.lang.reflect.InvocationTargetException;
            if (!CommonUtils.isEmpty(mask)) {
 * DBeaver - Universal Database Manager
        // Import scripts
        }
            // Create dirs
            return true;
        File[] listFiles = inputDir.listFiles();
        final ScriptsImportData importData = pageMain.getImportData();
                }
            for (File parent = file.getParentFile(); !parent.equals(importData.getInputDir()); parent = parent.getParentFile()) {
            IFolder targetDir = (IFolder) srcResource;
        // Use null monitor for resource actions to not break our main monitor
        }
        for (File file : filesToImport) {
    }
					continue;
			}
            // Set datasource
    }
            try {

                    if (mask.matcher(file.getName()).matches()) {
        ScriptsImporter(ScriptsImportData importData)
            String mask = st.nextToken().trim();
            }

    private void collectFiles(File inputDir, List<Pattern> masks, List<File> filesToImport)
                masks.add(Pattern.compile(mask));
        final ScriptsImporter importer = new ScriptsImporter(importData);
