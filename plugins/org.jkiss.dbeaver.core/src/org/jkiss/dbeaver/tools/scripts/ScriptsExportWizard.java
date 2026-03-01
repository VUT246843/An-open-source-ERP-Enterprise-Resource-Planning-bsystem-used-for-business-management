            if (!fileDir.mkdirs()) {

            } else {
        int totalFiles = 0;
                throw new IOException("Target file '" + fsFile.getAbsolutePath() + "' is a directory");
        for (IResource res : scripts) {
import java.util.Collection;
import java.io.IOException;
            } else if (res instanceof IContainer) {
    public ScriptsExportWizard() {
import org.jkiss.dbeaver.core.CoreMessages;
                    "Export error",
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
        if (monitor.isCanceled()) {
        }
                } else if (res instanceof IFolder) {

        }
 */
import org.jkiss.dbeaver.runtime.DBWorkbench;
                continue;
    private void exportScript(DBRProgressMonitor monitor, IFile file, final ScriptsExportData exportData)
        Collection<IResource> scripts = exportData.getScripts();
                        exportScripts(monitor, exportData);
        File fsDir = makeExternalFile(folder, exportData.getOutputFolder());
import org.eclipse.core.resources.IFile;
        if (!fileDir.exists()) {
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.ArrayList;
        setWindowTitle(CoreMessages.dialog_scripts_export_wizard_window_title); //NON-NLS-1
    }
            if (res.isLinked() || res.isHidden() || res.isPhantom()) {
    }
        setDefaultPageImageDescriptor(DBeaverIcons.getImageDescriptor(DBIcon.TREE_SCRIPT));
import java.lang.reflect.InvocationTargetException;
            if (!fsDir.mkdirs()) {
                log.warn("Overwriting file '" + fsFile.getAbsolutePath() + "'"); //$NON-NLS-1$ //$NON-NLS-2$
package org.jkiss.dbeaver.tools.scripts;

        throws IOException, CoreException
                ex.getTargetException());
 * You may obtain a copy of the License at
    }
            }
    private int countFiles(IFolder folder)
    private ScriptsExportWizardPage mainPage;
            int count = 0;
                exportFolder(monitor, (IContainer)res, exportData);
 * distributed under the License is distributed on an "AS IS" BASIS,
            fsDir = new File(fsDir, pathItem.getName());
                public void run(DBRProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
            }
    public void exportScripts(DBRProgressMonitor monitor, final ScriptsExportData exportData)
        for (IResource pathItem : path) {
import org.eclipse.core.runtime.CoreException;
        catch (InterruptedException ex) {
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and

                    }
 * Licensed under the Apache License, Version 2.0 (the "License");
                totalFiles++;
            }
            }
    }
        for (IResource f = folder; f.getParent() instanceof IContainer; f = f.getParent()) {
}
import java.util.List;
import org.eclipse.ui.IWorkbench;

import java.io.FileOutputStream;
                    try {
        monitor.beginTask("Export scripts", totalFiles);

                return;
                    count++;
import org.eclipse.core.resources.IFolder;
                }
        monitor.worked(1);
            return false;
 * you may not use this file except in compliance with the License.

    public void init(IWorkbench workbench, IStructuredSelection selection) {
        throws IOException, CoreException, InterruptedException
    }
            return count;
        for (IResource res : folder.members()) {
    {
                "Cannot export scripts",
        File fsDir = outputFolder;

        try (final InputStream scriptContents = file.getContents(true)) {
                return;
        catch (InvocationTargetException ex) {
            DBWorkbench.getPlatformUI().showError(
    {
        }
                log.warn("File '" + fsFile.getAbsolutePath() + "' already exists - skipped"); //$NON-NLS-1$ //$NON-NLS-2$
    public void addPages() {
            if (monitor.isCanceled()) {
                if (res instanceof IFile) {
 * DBeaver - Universal Database Manager
        mainPage = new ScriptsExportWizardPage(CoreMessages.dialog_scripts_export_wizard_page_name); //NON-NLS-1
	}
            return 0;
            return;
        try {
            }
import org.eclipse.jface.viewers.IStructuredSelection;
                        throw new InvocationTargetException(e);
                exportScript(monitor, (IFile) res, exportData);
            if (res instanceof IFolder) {

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *
 * Unless required by applicable law or agreed to in writing, software
            if (fsFile.isDirectory()) {
            }
import java.io.InputStream;
                IOUtils.copyStream(scriptContents, out);
import org.jkiss.dbeaver.ui.DBeaverIcons;
        }
        addPage(mainPage);
        }
                throw new IOException("Can't create directory '" + fileDir.getAbsolutePath() + "'");
	@Override
        try {
            }
                totalFiles += countFiles((IFolder) res);
import org.jkiss.dbeaver.ui.UIUtils;
    private File makeExternalFile(IResource folder, File outputFolder)
        }
import org.eclipse.jface.wizard.Wizard;
        final ScriptsExportData exportData = mainPage.getExportData();
        }
import org.eclipse.ui.IExportWizard;
            } else {
            });
                }
                throw new IOException("Can't create directory '" + fsDir.getAbsolutePath() + "'");
        super.addPages();


        if (!fsDir.exists()) {
            if (res instanceof IContainer) {
            }
    private void exportFolder(DBRProgressMonitor monitor, IContainer folder, final ScriptsExportData exportData) throws CoreException, IOException
	public boolean performFinish() {
    {
 * limitations under the License.
            }

        monitor.done();
        }
/*
	@Override

        } catch (CoreException e) {
    private static final Log log = Log.getLog(ScriptsExportWizard.class);
                    count += countFiles((IFolder) res);
        File fsFile = makeExternalFile(file, exportData.getOutputFolder());
        final File fileDir = fsFile.getParentFile();
    {
    }
import java.io.File;
            } else if (!exportData.isOverwriteFiles()) {
            path.add(0, f);
        if (fsFile.exists()) {
        }
	}
            for (IResource res : folder.members()) {
import org.eclipse.core.resources.IContainer;
            }
                    } catch (Exception e) {
            if (res instanceof IFile) {
 *
            return false;
    {
import org.jkiss.utils.IOUtils;
public class ScriptsExportWizard extends Wizard implements IExportWizard {
                exportScript(monitor, (IFile)res, exportData);
        setNeedsProgressMonitor(true);
        }
        }

 * Copyright (C) 2010-2024 DBeaver Corp and others
            UIUtils.run(getContainer(), true, true, new DBRRunnableWithProgress() {
import org.eclipse.core.resources.IResource;
            } else {
        return true;
            try (FileOutputStream out = new FileOutputStream(fsFile)) {
    @Override
        List<IResource> path = new ArrayList<>();
import org.jkiss.dbeaver.model.DBIcon;

        }
        }
 *
    }
        for (IResource res : scripts) {
import org.jkiss.dbeaver.Log;
                @Override
                exportFolder(monitor, (IContainer)res, exportData);
        return fsDir;
