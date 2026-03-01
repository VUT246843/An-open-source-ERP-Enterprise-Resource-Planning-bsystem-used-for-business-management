import org.eclipse.core.commands.ExecutionEvent;
            } else {
            try (InputStream is = new FileInputStream(file)) {
        }
import java.util.List;
import org.eclipse.swt.custom.StyledText;

            ((StyledText) focusControl).paste();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            final Map<QualifiedName, String> props = resource.getPersistentProperties();
    }
                throw new IOException("Target file '" + targetFile.getFullPath() + "' already exists");
                        final File file = new File(fileName);
import org.eclipse.core.resources.IContainer;
                        UINavigatorMessages.failed_to_paste_due_to_permissions_message,
                if (targetFolder.findMember(testName) == null) {
        } else {
            }
        }
import java.lang.reflect.InvocationTargetException;
            return null;
            });
        if (curNode == null) {
            return;
                                }
        DBPProject toProject = curNode.getOwnerProject();
 * DBeaver - Universal Database Manager
                } else {
                            failedToPasteResources.add(nodeObject.getName());
    }
                            } else if (curNode instanceof DBNResource currentResource) {
    throws DBException {
import org.eclipse.swt.dnd.Clipboard;
    }
        } catch (InvocationTargetException e) {
    }

                }
                String testName =  plainName + "-" + i;
    private void pastNodeToResource(@NotNull DBRProgressMonitor monitor, @NotNull DBNResource currentNode, @NotNull DBNNode nodeToPaste)
            // Copy folder with all files and subfolders
 * limitations under the License.
import org.eclipse.ui.handlers.HandlerUtil;

        if (focusControl instanceof Text) {
            }
        } else if (focusControl instanceof StyledText) {
                for (Map.Entry<QualifiedName, String> prop : props.entrySet()) {
import org.eclipse.core.resources.IResource;
import java.util.Collection;
            if (folderFile != null) {
                                        pastNodeToResource(monitor, currentResource, nodeObject);

                targetName.substring(0, targetName.length() - extension.length() - 1) : targetName;

            for (int i = 1; ; i++) {
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
                                log.error("Paste is not supported for " + curNode);
        } else {
                                return null;
        }
 * Unless required by applicable law or agreed to in writing, software
        final IContainer targetFolder = targetResource instanceof IContainer ? (IContainer) targetResource : targetResource.getParent();
        final IResource targetResource = toFolder.getResource();
        IContainer targetFolder = targetResource instanceof IContainer container ? container : targetResource.getParent();
            throw new IOException("Target resource '" + targetName + "' already exists");
                        for (DBNNode nodeObject : cbNodes) {
import org.eclipse.core.commands.ExecutionException;
        String targetName = resource.getName();
        if (currentNode.supportsPaste(nodeToPaste)) {
            });
                                        return null;
import org.eclipse.core.runtime.Path;
import java.util.LinkedList;
            }
                            final File file = new File(fileName);
        try {
                try {
            // Copy single file
import org.jkiss.dbeaver.model.navigator.DBNResource;
            if (targetFolder instanceof IFolder && !targetFolder.exists()) {
                if (failedToPasteResources.isEmpty()) {
            } else if (curNode instanceof DBNResource) {
import org.jkiss.dbeaver.Log;
        } catch (InvocationTargetException e) {

            }
                                pathTarget.dropNodes(monitor, cbNodes);
 *
        if (monitor.isCanceled()) {

                            if (file.exists()) {
    ) throws CoreException, IOException {
                if (!CommonUtils.isEmpty(extension)) {
                        }
                    if (curNode instanceof DBNPathBase pathTarget) {
                        }
import org.eclipse.osgi.util.NLS;
import org.jkiss.dbeaver.ui.dnd.TreeNodeTransfer;
    private void pasteResource(final File file, DBNResource toFolder) {
        if (resource instanceof IFile) {
    }
        }
        final IResource resource = resourceNode.getResource();
                            });
                }
            }
                    copyFileInFolder(monitor, targetFolder, file);
                                    DBWorkbench.getPlatformUI().showError("Paste error", "Can't paste node '" + nodeObject.getName() + "'", e);
                        if (!toProject.hasRealmPermission(RMConstants.PERMISSION_PROJECT_RESOURCE_EDIT)) {
                                } catch (DBException e) {
                                pasteResource(file, (DBNResource) curNode);
import org.eclipse.core.runtime.CoreException;
        return null;
                                failedToPasteResources.add(fileName);
                        }
        DBNNode curNode = NavigatorUtils.getSelectedNode(selection);

                            failedToPasteResources.addAll(cbNodes.stream().map(DBNNode::getNodeDisplayName).toList());
                );
            if (!targetFile.exists()) {
                            }
            clipboard.dispose();
        }
        IResource targetResource = toFolder.getResource();
        Control focusControl = activeShell.getDisplay().getFocusControl();
                    }
                        String.join(",\n", failedToPasteResources)
            log.error("Paste or drop is not supported for " + currentNode);
            if (!subFolder.exists()) {

        } else if (currentNode.supportsDrop(nodeToPaste)) {
                    } else {
 * Licensed under the Apache License, Version 2.0 (the "License");
                String[] files = (String[]) clipboard.getContents(FileTransfer.getInstance());
package org.jkiss.dbeaver.ui.navigator.actions;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        } catch (DBException e) {
        final IProgressMonitor nestedMonitor = RuntimeUtils.getNestedMonitor(monitor);
import org.jkiss.code.NotNull;

                } catch (Exception e) {
import org.eclipse.core.runtime.IProgressMonitor;
import org.jkiss.dbeaver.model.rm.RMConstants;
                }
                            }
import org.eclipse.swt.widgets.*;
        }
import org.jkiss.dbeaver.model.app.DBPProject;
 *
                    throw new InvocationTargetException(e);
                        for (String fileName : files) {
                                    UIUtils.runWithMonitor(monitor -> {
            }
import org.eclipse.core.resources.IFile;
        }
        Clipboard clipboard = new Clipboard(Display.getDefault());
import org.jkiss.dbeaver.model.navigator.DBNNode;
 * you may not use this file except in compliance with the License.
        Shell activeShell = HandlerUtil.getActiveShell(event);
 * See the License for the specific language governing permissions and
                    if (nodeObject instanceof DBNResource && curNode instanceof DBNResource) {
                    Display.getCurrent().beep();

            if (targetFile.exists()) {
import org.jkiss.dbeaver.utils.RuntimeUtils;
                    log.debug("Paste error: unsupported clipboard format. File or folder were expected.");
                DBWorkbench.getPlatformUI().showError(
                }
    public Object execute(ExecutionEvent event) throws ExecutionException {
        @NotNull IContainer targetFolder
            if (cbNodes != null) {
            return null;
                                    });
                ((IFolder) targetFolder).create(true, true, nestedMonitor);
                try {
            }
        }
        } else if (targetFolder.findMember(targetName) != null) {
            pasteResource(fromResource, currentNode);
                }
import org.jkiss.dbeaver.model.navigator.fs.DBNPathBase;
            Collection<DBNNode> cbNodes = (Collection<DBNNode>) clipboard.getContents(TreeNodeTransfer.getInstance());
                targetFile.create(is, true, monitor.getNestedMonitor());
            currentNode.dropNodes(monitor, List.of(nodeToPaste));
    }
                for (File subFile : folderFile) {
 * You may obtain a copy of the License at
                        if (file.exists()) {
            if (!failedToPasteResources.isEmpty()) {
        @NotNull IResource resource,
        }
 */
                                createNewObject(HandlerUtil.getActiveWorkbenchWindow(event), curNode, otherNode);
                            if (!toProject.hasRealmPermission(RMConstants.PERMISSION_PROJECT_RESOURCE_EDIT)) {
                    if (failedToPasteResources.isEmpty()) {
            }
                targetFile.setContents(is, true, true, nestedMonitor);
                    }
            }
            return null;
 * Copyright (C) 2010-2026 DBeaver Corp and others
        if (file.isDirectory()) {
                    copyFileInFolder(monitor, subFolder, subFile);
            final IFile targetFile = targetFolder.getFile(new Path(file.getName()));
            }
            // ignore
            IFolder subFolder = targetFolder.getFolder(new Path(file.getName()));
        } catch (InterruptedException e) {
            @SuppressWarnings("unchecked")
                        }
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
                targetFile.create(new ByteArrayInputStream(new byte[0]), true, nestedMonitor);
        } else if (nodeToPaste instanceof DBNResource fromResource) {
                    }
            final IFile targetFile = targetFolder.getFile(new Path(targetName));
                    throw new InvocationTargetException(e);
                    copyResource(monitor, resource, targetFolder);
            UIUtils.runInProgressService(monitor -> {
            ((Text) focusControl).paste();
                if (files != null) {
import org.eclipse.core.resources.IFolder;
                    targetName = testName;
    private void pasteResource(DBNResource resourceNode, DBNResource toFolder) {
            DBWorkbench.getPlatformUI().showError("Copy error", "Error copying resource", e.getTargetException());
            ((Combo) focusControl).paste();

public class NavigatorHandlerObjectCreateCopy extends NavigatorHandlerObjectCreateBase {
                    for (String fileName : files) {
                        try {
        if (resource.getParent().equals(targetFolder)) {
        } catch (InterruptedException e) {
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
import java.util.Map;
        @NotNull DBRProgressMonitor monitor,
import org.eclipse.swt.dnd.FileTransfer;
        final ISelection selection = HandlerUtil.getCurrentSelection(event);
    @Override
            try (InputStream is = ((IFile) resource).getContents()) {
            DBWorkbench.getPlatformUI().showError("Copy error", "Error copying resource", e.getTargetException());
                    }
        } finally {
        List<String> failedToPasteResources = new LinkedList<>();
import org.eclipse.jface.viewers.ISelection;
        try {
                }
import org.jkiss.dbeaver.DBException;
                    break;
                            } else {
            // ignore
            return null;
 * distributed under the License is distributed on an "AS IS" BASIS,
                            DBWorkbench.getPlatformUI().showError("Paste error", "Can't paste nodes", e);
                }
                Display.getCurrent().beep();
                            }
        } else if (focusControl instanceof Combo) {
                                    failedToPasteResources.add(nodeObject.getName());

        } else if (resource instanceof IFolder) {
                    targetFile.setPersistentProperty(prop.getKey(), prop.getValue());
                subFolder.create(true, true, monitor.getNestedMonitor());
                }
                    UINavigatorMessages.failed_to_paste_due_to_permissions_title,
                    )
                        toProject.getDisplayName(),
}            currentNode.pasteNodes(List.of(nodeToPaste));
        }
import org.jkiss.dbeaver.runtime.DBWorkbench;
        try {
    static final Log log = Log.getLog(NavigatorHandlerObjectCreateCopy.class);
            String plainName = extension != null && !extension.isEmpty() && targetName.endsWith(extension) ?
 *
                } catch (Exception e) {
                }
import java.io.*;
            if (props != null && !props.isEmpty()) {
                            UIUtils.runWithMonitor(monitor -> {
                log.debug("Paste error: clipboard contains data in unsupported format");
                for (DBNNode nodeObject : cbNodes) {
 *     http://www.apache.org/licenses/LICENSE-2.0
            File[] folderFile = file.listFiles();
/*
    private void copyFileInFolder(DBRProgressMonitor monitor, IContainer targetFolder, File file) throws IOException, CoreException {
            UIUtils.runInProgressService(monitor -> {
        final String extension = resource.getFileExtension();
            }

import org.jkiss.dbeaver.ui.UIUtils;
                            if (nodeObject instanceof DBNDatabaseNode otherNode) {
                                try {
                    NLS.bind(
    private void copyResource(
                    testName += "." + extension;

import org.jkiss.utils.CommonUtils;
import org.eclipse.core.runtime.QualifiedName;
                        }
