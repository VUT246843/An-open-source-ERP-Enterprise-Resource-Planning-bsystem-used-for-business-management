                            }
                        }.schedule();
    }
                        try {
 *     http://www.apache.org/licenses/LICENSE-2.0
                                ds.moveToFolder(rootNode.getOwnerProject(), null);
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.runtime.DBWorkbench;
    }
                IResource curResource = ((IAdaptable) curObject).getAdapter(IResource.class);
        event.detail = isDropSupported(event) ? DND.DROP_MOVE : DND.DROP_NONE;
                    } else if (node instanceof DBNLocalFolder lf) {
            org.eclipse.core.runtime.Path ePath = new org.eclipse.core.runtime.Path(extFile.getFileName().toString());
                Collection<DBNNode> nodesToDrop = TreeNodeTransfer.getInstance().getObject();
                    UIUtils.runInProgressService(monitor -> {
                    }
                    }
                        // Drop datasource on a view
    }
                            @NotNull
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
                            }
                    Widget widget = event.widget;
            }
                            return;
                        if (!((DBNNode) curObject).supportsDrop(node)) {
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorContent;

            if (curObject instanceof DBNNode) {
}
                                } catch (Exception e) {

        this.viewer = viewer;
    private static void dropFileIntoContainer(DBRProgressMonitor monitor, IContainer toFolder, Path extFile) throws CoreException, IOException {
 * DBeaver - Universal Database Manager
                                    return GeneralUtils.makeExceptionStatus(e);
            if (Files.isDirectory(extFile)) {
        for (String extFileName : data) {
/*
    public void dropAccept(DropTargetEvent event) {

                } else {
                IResource curResource = adaptable.getAdapter(IResource.class);
                if (!CommonUtils.isEmpty(nodesToDrop)) {
                    return list.get(0);
public class NavigatorDropTargetListener implements DropTargetListener {

                                setUser(true);
                    if (widget instanceof DropTarget) {
                    if (node instanceof DBNDataSource ds) {
                for (Path folderFile : sourceFolderContents) {
 * you may not use this file except in compliance with the License.
                    if (toFolder instanceof IFolder && !toFolder.exists()) {
                }
                        // We need target project
                    } else {
import java.util.Collection;
                    monitor.worked(1);
        if (Files.exists(extFile)) {
    @Override
import org.jkiss.dbeaver.ui.dnd.TreeNodeTransfer;
                            targetFile.setContents(is, true, false, monitor.getNestedMonitor());
                        new AbstractJob("Copy files to workspace") {
import org.jkiss.dbeaver.model.navigator.DBNNode;
                        widget = ((DropTarget) widget).getControl();
        // Drop file - over resources
    @Override
    }
import org.eclipse.core.runtime.CoreException;
                        }
 * Copyright (C) 2010-2025 DBeaver Corp and others
        handleDragEvent(event);
    }
            }
    }
                    subFolder.create(true, true, monitor.getNestedMonitor());
                            }
                List<Path> sourceFolderContents;
                    return true;
                }
import org.jkiss.dbeaver.ui.navigator.INavigatorNodeContainer;
        if (TreeNodeTransfer.getInstance().isSupportedType(event.currentDataType)) {
                        if (targetFile.exists()) {
    @Override
import org.eclipse.core.runtime.Status;
                        }
                }
                    }
            if (curObject instanceof IAdaptable) {
                    if (curResource instanceof IFile) {
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                            return false;
import org.eclipse.core.resources.IResource;
                    }
    private void moveNodes(DropTargetEvent event) {
import org.jkiss.dbeaver.model.runtime.AbstractJob;

        handleDragEvent(event);
 * limitations under the License.
                    return widget == viewer.getControl();
                }
    @Override
    private static Object getDropTarget(@NotNull DropTargetEvent event, @NotNull Viewer viewer) {
                        }

    public void drop(DropTargetEvent event) {
            @SuppressWarnings("unchecked")
 *
            return event.item.getData();
    private static void dropFilesIntoFolder(DBRProgressMonitor monitor, IContainer toFolder, String[] data) throws Exception {

        if (TreeNodeTransfer.getInstance().isSupportedType(event.currentDataType)) {

            } else if (input instanceof List list) {
                        } catch (Exception e) {
                } finally {
                        if (!UIUtils.confirmAction("File exists", "File '" + targetFile.getName() + "' exists. Do you want to overwrite it?")) {
    public void dragOperationChanged(DropTargetEvent event) {
            dropFileIntoContainer(monitor, toFolder, extFile);
                // Drop to empty area
            } else if (curObject == null) {
                    if (curResource instanceof IContainer toFolder) {
import java.util.stream.Stream;
                            protected IStatus run(@NotNull DBRProgressMonitor monitor) {
        }
                }
                }
    public void dragOver(DropTargetEvent event) {
                                String[] fileNames = (String[]) event.data;
                    }
                    IFile targetFile = toFolder.getFile(ePath);
                try {
                            DBNNode rootNode = ((DatabaseNavigatorContent) viewer.getInput()).getRootNode();
                    return;
        final Object curObject = getDropTarget(event, viewer);
                    for (DBNNode node : nodesToDrop) {
                        DBWorkbench.getPlatformUI().showError("Drop error", "Can't drop file into '" + curResource.getName() + "'. Files can be dropped only into folders.");
                                return Status.OK_STATUS;
                        }
                            @Override
 *
                    return true;
                    try (InputStream is = Files.newInputStream(extFile)) {
import java.nio.file.Path;

import org.jkiss.dbeaver.ui.UIUtils;
                return dnc.getRootNode();
                        continue;
                    dropFileIntoContainer(monitor, subFolder, folderFile);
import java.lang.reflect.InvocationTargetException;
import java.io.InputStream;
    @Nullable
import org.jkiss.dbeaver.utils.GeneralUtils;
                    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        }
import org.eclipse.swt.widgets.Item;
        }
 * You may obtain a copy of the License at
                return curResource != null;
                                } finally {
import org.eclipse.swt.dnd.*;
            }
                for (DBNNode node : TreeNodeTransfer.getInstance().getObject()) {
        if (FileTransfer.getInstance().isSupportedType(event.currentDataType)) {
                        }
                    }

            } else if (curObject == null) {
                        } else {
                } catch (Exception e) {
                    if (targetFile.exists()) {
                    }
                if (!subFolder.exists()) {
                            targetFile.create(is, true, monitor.getNestedMonitor());
    }
        if (FileTransfer.getInstance().isSupportedType(event.currentDataType)) {
                    } else {
                            if (rootNode != null && rootNode.getOwnerProject() != null) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                    sourceFolderContents = list.toList();
                try {
import org.jkiss.code.NotNull;
                                    monitor.done();

                    }
                } else {
        }
            } else {
            if (input instanceof INavigatorNodeContainer dnc) {
    public void dragLeave(DropTargetEvent event) {
import org.eclipse.swt.widgets.Widget;
    }
    public NavigatorDropTargetListener(Viewer viewer) {
    @Override
 *
        } else {

        }
            }
                    DBWorkbench.getPlatformUI().showError("Drop error", "Can't drop node", e);
                        curResource = curResource.getParent();
        return null;
        final Object curObject = getDropTarget(event, viewer);
        }
    @Override
        }
import org.jkiss.code.Nullable;
import org.eclipse.core.resources.IFolder;

 */
    private void handleDragEvent(DropTargetEvent event) {


            moveNodes(event);
            Object input = viewer.getInput();
                            return false;
        if (event.detail == DND.DROP_MOVE) {

    }
import org.eclipse.jface.viewers.Viewer;
                            {
    }
import org.eclipse.core.resources.IFile;
                if (!CommonUtils.isEmpty(nodesToDrop)) {
package org.jkiss.dbeaver.ui.navigator.dnd;
                            ((DBNNode) curObject).dropNodes(monitor, nodesToDrop);
                                monitor.beginTask("Copy files", fileNames.length);
 * Unless required by applicable law or agreed to in writing, software
            Collection<DBNNode> nodesToDrop = (Collection<DBNNode>) event.data;
import org.eclipse.core.resources.IContainer;
                        ((IFolder) toFolder).create(true, true, monitor.getNestedMonitor());
import java.io.IOException;
                monitor.subTask("Copy file " + extFile);
    }
                        }
                        lf.getFolder().setParent(null);
                                }
                try (Stream<Path> list = Files.list(extFile)) {
        if (event.item instanceof Item) {
                    });
                                    dropFilesIntoFolder(monitor, toFolder, fileNames);
                    return ((DBNNode) curObject).supportsDrop(null);

import org.eclipse.core.runtime.IStatus;
    private boolean isDropSupported(DropTargetEvent event) {
import java.util.List;
        handleDragEvent(event);
            if (curObject instanceof IAdaptable adaptable) {
                }

    private final Viewer viewer;
        handleDragEvent(event);
            }
                        if (viewer.getInput() instanceof DatabaseNavigatorContent) {
        event.feedback = DND.FEEDBACK_SELECT | DND.FEEDBACK_SCROLL;
                if (curResource != null) {
                if (!list.isEmpty())
    }

                    DBNModel.updateConfigAndRefreshDatabases(node);
            Path extFile = Path.of(extFileName);
                                try {
                    for (DBNNode node : nodesToDrop) {
                }

import org.jkiss.dbeaver.model.navigator.DBNDataSource;
import org.eclipse.core.runtime.IAdaptable;
import org.jkiss.dbeaver.model.navigator.DBNLocalFolder;
                IFolder subFolder = toFolder.getFolder(ePath);
        return false;
import java.nio.file.Files;
    }
                        if (!(node instanceof DBNDataSource)) {
        handleDragEvent(event);
            if (curObject instanceof DBNNode) {
 * See the License for the specific language governing permissions and
                }
        handleDragEvent(event);

import org.jkiss.dbeaver.model.navigator.DBNModel;
                            throw new InvocationTargetException(e);
    public void dragEnter(DropTargetEvent event) {
