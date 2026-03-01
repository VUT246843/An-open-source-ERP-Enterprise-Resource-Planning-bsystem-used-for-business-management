import org.jkiss.dbeaver.utils.GeneralUtils;
        int missingFiles = 0;
        }
            }
        try {
        } catch (InvocationTargetException e) {
                    setLibraryVersion(mavenLib, newVersion);
import org.eclipse.swt.custom.TreeEditor;
                    message = UIConnectionMessages.dialog_driver_download_network_unavailable_cert_msg_advanced;
    private void disposeOldEditor()
        int itemHeight = filesTree.getItemHeight();
        if (dependencyNode == null || dependencyNode.library == null || !dependencyNode.library.isDownloadable()) {
                            showVersionEditor(item);
        }
        }
class DriverDependenciesTree {
        editor.setItem(currentVersionIndex, NLS.bind(UIConnectionMessages.dialog_driver_download_current_version_label, currentVersion));
            grayOutInstalledArtifact(node, item);
                String newVersion = allVersions.get(editor.getSelectionIndex());
                List<Throwable> exceptions = exceptionWithHistory.getExceptions();
        Collection<DBPDriverDependencies.DependencyNode> dependencies = node.dependencies;
                    String.format("Network error: %s", dbException.getMessage()),
        editor.addSelectionListener(new SelectionAdapter() {

    private final Tree filesTree;
import org.jkiss.dbeaver.runtime.DBWorkbench;
            shell.computeSize(SWT.DEFAULT, SWT.DEFAULT).y) + itemHeight * 2);
            }
                }

            totalItems++;
import java.lang.reflect.InvocationTargetException;
        final DBPDriverDependencies.DependencyNode dependencyNode = (DBPDriverDependencies.DependencyNode) item.getData();
 * You may obtain a copy of the License at
    private void grayOutInstalledArtifact(DBPDriverDependencies.DependencyNode node, TreeItem item) {
        int currentVersionIndex = allVersions.indexOf(currentVersion);
    private final DBPDriver driver;
    private final DBRRunnableContext runnableContext;
                try {
                }
        final List<String> allVersions = new ArrayList<>();
                    throw new InvocationTargetException(e);
//            UIUtils.showMessageBox(getShell(), "Driver Download", "All driver files are present", SWT.ICON_INFORMATION);
        disposeOldEditor();
        for (DBPDriverDependencies.DependencyNode node : dependencies.getLibraryMap()) {
        final GridData gd = new GridData(GridData.FILL_BOTH);
    public void resizeTree() {
                item.setExpanded(true);
            return;
                    GeneralUtils.transformExceptionsToStatus(exceptions));

    {
                    disposeOldEditor();

            throw new DBException(exceptionMessage);
import java.util.List;
import org.jkiss.dbeaver.registry.driver.DriverLibraryMavenArtifact;
            String exceptionMessage = message + "\n" + e.getClass().getName() + ":" + e.getMessage();
import java.io.IOException;
            item.setText(2, CommonUtils.notEmpty(library.getDescription()));
}
            }
                ProgressMonitorWithExceptionContext monitorWithExceptions = new ProgressMonitorWithExceptionContext(monitor);
    }

        this.libraries = libraries;
            treeEditor.grabHorizontal = true;
            allVersions.add(currentVersion);

                    monitorWithExceptions.done();

            if (editable) {
        // Check missing files
        editor.setVisibleItemCount(15);
            // User just canceled download
                } catch (IOException e) {
 * Unless required by applicable law or agreed to in writing, software
                    message = UIConnectionMessages.dialog_driver_download_network_unavailable_cert_msg;
    }

 */

                public void mouseUp(MouseEvent e)
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
    private static final Log log = Log.getLog(DriverDependenciesTree.class);
            DBWorkbench.getPlatformUI().showError("Versions", "Error reading versions", e.getTargetException());
            checkNetworkAccessible();
import org.eclipse.swt.layout.GridData;

        editor.setListVisible(true);
        if (editable) {
    private final DBPDriverDependencies dependencies;
            log.error("Error reading " + node.library.getDisplayName() + " local file", ex);


        return driver;

            for (DBPDriverDependencies.DependencyNode dep : dependencies) {
                    exceptions.addAll(monitorWithExceptions.getExceptions());
import java.nio.file.Files;

                } else {
        final CCombo editor = new CCombo(filesTree, SWT.DROP_DOWN | SWT.READ_ONLY);
                item.setFont(1, BaseThemeSettings.instance.treeAndTableFontBold);
                try {
import org.eclipse.osgi.util.NLS;
                } catch (Exception e) {
            throw new DBExceptionWithHistory("Error resolving dependencies", cause, exceptions);
                }

            treeEditor.minimumWidth = 50;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0

            exceptions.add(cause);
import org.jkiss.dbeaver.ui.BaseThemeSettings;
                exceptions.add(dbException);

        int totalItems = 1;
                        }
import org.jkiss.dbeaver.model.runtime.ProgressMonitorWithExceptionContext;
            return true;
        try {
 * DBeaver - Universal Database Manager
        UIUtils.packColumns(filesTree);
            }
                @Override
import org.jkiss.dbeaver.model.exec.DBExceptionWithHistory;

            return;

        filesTree = new Tree(parent, SWT.BORDER | SWT.FULL_SELECTION);
    }
    private boolean addDependencies(TreeItem parent, DBPDriverDependencies.DependencyNode node) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (filesTree.isDisposed()) {
        Shell shell = filesTree.getShell();
            } else {
            }
        try {
                            return;
import java.util.Collection;

            item.setText(0, library.getDisplayName());
 * See the License for the specific language governing permissions and
                DBWorkbench.getPlatformUI().showError("Download error",
        }
        this.dependencies = dependencies;
        if (missingFiles == 0) {
    }
/*
            if (editable && node.library.getType().equals(DBPDriverLibrary.FileType.license)) {
import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;
    private final boolean editable;
    }
                grayOutInstalledArtifact(dep, item);
            treeEditor = new TreeEditor(filesTree);
    public Tree getTree() {
                DBWorkbench.getPlatformUI().showError("Download error",
        } catch (InterruptedException e) {
        }
import org.eclipse.swt.events.MouseAdapter;
        UIUtils.createTreeColumn(filesTree, SWT.LEFT, "File");
        shell.layout();
            Throwable cause = e.getTargetException();
                    throw new InvocationTargetException(e);
import org.jkiss.dbeaver.DBException;
            } else if (editable && localFile != null && Files.exists(localFile) && Files.size(localFile) > 0) {
package org.jkiss.dbeaver.ui.dialogs.driver;

        try {
                        dependencyNode.library.getAvailableVersions(monitor));
import org.eclipse.swt.events.MouseEvent;
 *
        return libraries;
            TreeItem item = new TreeItem(filesTree, SWT.NONE);
    public DBPDriver getDriver() {
    protected void setLibraryVersion(DriverLibraryMavenArtifact library, String version) {
    }
            (int)(UIUtils.getActiveWorkbenchWindow().getShell().getSize().y * 0.66),
            if (RuntimeUtils.isWindows() && CommonUtils.hasCause(e, SSLHandshakeException.class)) {
            resolved = true;
        }
            });
                item.setText(1, CommonUtils.notEmpty(dep.library.getVersion()));
        return resolved;
import org.jkiss.dbeaver.registry.DBConnectionConstants;
import java.nio.file.Path;
        filesTree.setHeaderVisible(true);
        this.runnableContext = runnableContext;
            String message;
import org.jkiss.dbeaver.ui.UIUtils;
            editor.add(version);
    }
        for (String version : allVersions) {
                    .getApplication().hasProductFeature(DBConnectionConstants.PRODUCT_FEATURE_SIMPLE_TRUSTSTORE)) {
            if (localFile == null || !Files.exists(localFile)) {

    }
    public DriverDependenciesTree(Composite parent, DBRRunnableContext runnableContext, DBPDriverDependencies dependencies, DBPDriver driver, Collection<? extends DBPDriverLibrary> libraries, boolean editable) {
                continue;
            Path localFile = node.library.getLocalFile();
 * distributed under the License is distributed on an "AS IS" BASIS,
        } catch (IOException ex) {
            if (node.library.isInvalidLibrary()) {
                if (dep.duplicate) {
    // This may be overridden
    private void showVersionEditor(final TreeItem item) {
import org.eclipse.swt.events.SelectionAdapter;
    }
                totalItems += item.getItemCount();
        }
        shell.setSize(curSize.x, Math.min(
                message = UIConnectionMessages.dialog_driver_download_network_unavailable_msg;
    public Collection<? extends DBPDriverLibrary> getLibraries() {
        }

                item.setBackground(BaseThemeSettings.instance.colorError);
import org.eclipse.swt.graphics.Point;
        }
        this.driver = driver;
    public boolean loadLibDependencies() throws DBException {
        gd.minimumHeight = filesTree.getHeaderHeight() + filesTree.getItemHeight() * 3;
                    if (item != null && item.getData() instanceof DBPDriverDependencies.DependencyNode) {
                item.setText(1, NLS.bind(UIConnectionMessages.dialog_driver_download_version_change_label, item.getText(1)));
        try {
        }
        UIUtils.createTreeColumn(filesTree, SWT.LEFT, "Description");
            treeEditor.getEditor().dispose();
        filesTree.removeAll();
                return false;
            treeEditor.horizontalAlignment = SWT.RIGHT;
import javax.net.ssl.SSLHandshakeException;
//            ((DriverDownloadDialog)getWizard().getContainer()).closeWizard();
import org.jkiss.dbeaver.ui.DBeaverIcons;
        final String currentVersion = CommonUtils.notEmpty(dependencyNode.library.getVersion());
import org.jkiss.dbeaver.model.connection.DBPDriverLibrary;
            runnableContext.run(true, true, monitor -> {
                    allVersions.addAll(
                item.setText(0, dep.library.getDisplayName());
                item.setImage(DBeaverIcons.getImage(dep.library.getIcon()));
            return;
            }
            runnableContext.run(true, true, monitor -> {
                        if (UIUtils.getColumnAtPos(item, e.x, e.y) == 1) {
                    String.format("Network error: %s", dbException.getMessage()),

import org.eclipse.swt.SWT;

        } catch (InterruptedException e) {
import org.eclipse.swt.widgets.*;
            }
        return true;
                } finally {

            item.setText(1, CommonUtils.notEmpty(library.getVersion()));
            item.setData(node);
            if (causeException instanceof DBExceptionWithHistory exceptionWithHistory) {

        for (DBPDriverDependencies.DependencyNode node : dependencies.getLibraryList()) {
                if (DBWorkbench.getPlatform()
                item.setText(2, CommonUtils.notEmpty(dep.library.getDescription()));
                {
                    TreeItem item = filesTree.getItem(new Point(e.x, e.y));
                disposeOldEditor();
import org.jkiss.dbeaver.model.connection.DBPDriver;
    private void checkNetworkAccessible() throws DBException {
        return filesTree;
import org.jkiss.dbeaver.model.connection.DBPDriverDependencies;
                TreeItem item = new TreeItem(parent, SWT.NONE);
        } catch (DBException dbException) {
import org.eclipse.swt.custom.CCombo;
            if (addDependencies(item, node)) {
import org.jkiss.dbeaver.utils.RuntimeUtils;
            }
        } catch (IOException e) {
            item.setImage(DBeaverIcons.getImage(library.getIcon()));
                if (dependencyNode.library instanceof DriverLibraryMavenArtifact mavenLib) {
        treeEditor.setEditor(editor, item, 1);

        boolean resolved = false;
    public static final String NETWORK_TEST_URL = "https://repo1.maven.org";
 * Copyright (C) 2010-2025 DBeaver Corp and others
        if (!allVersions.contains(currentVersion)) {
        }
        editor.select(currentVersionIndex);
                    addDependencies(item, dep);
                monitorWithExceptions.beginTask("Resolve dependencies", 100);
        }
import org.jkiss.utils.CommonUtils;
                }
import org.jkiss.dbeaver.runtime.WebUtils;
    }
            @Override
            });
                }
                missingFiles++;
import org.eclipse.swt.events.SelectionEvent;
                    dbException);
        filesTree.setLayoutData(gd);
        UIUtils.createTreeColumn(filesTree, SWT.LEFT, "Version");
                }
        Path localFile = node.library.getLocalFile();
            } else {
        }
            DBPDriverLibrary library = node.library;
        }
                item.setBackground(BaseThemeSettings.instance.colorSuccess);
                    item.setBackground(BaseThemeSettings.instance.colorWarning);
        }
            });
            filesTree.addMouseListener(new MouseAdapter() {
                //item.setData(dep);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (oldEditor != null) oldEditor.dispose();
        });
    private TreeEditor treeEditor;
        List<Throwable> exceptions = new ArrayList<>();
        Control oldEditor = treeEditor.getEditor();
                    }
 * you may not use this file except in compliance with the License.
            WebUtils.openConnection(NETWORK_TEST_URL, GeneralUtils.getProductTitle());
        this.editable = editable;
    public boolean handleDownloadError(DBException causeException) {
import java.util.ArrayList;
            }
            return;
    }
                } else {
        } catch (InvocationTargetException e) {
        Point curSize = shell.getSize();
        if (dependencies != null && !dependencies.isEmpty()) {
 *
        return false;
 *
 * limitations under the License.
        if (treeEditor.getEditor() != null) {
            public void widgetSelected(SelectionEvent e) {
            treeEditor.verticalAlignment = SWT.CENTER;
                    dependencies.resolveDependencies(monitorWithExceptions);
    private final Collection<? extends DBPDriverLibrary> libraries;
import org.jkiss.dbeaver.Log;


    }
