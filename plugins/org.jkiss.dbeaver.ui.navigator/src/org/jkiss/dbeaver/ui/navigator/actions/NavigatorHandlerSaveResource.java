
            UIUtils.runInProgressDialog(monitor -> {
import org.jkiss.utils.CommonUtils;
            // Single file
            }
                            }
                    return;
        } else {
                String srcFilePath = URLDecoder.decode(itemPath.path.toAbsolutePath().toString(), StandardCharsets.UTF_8);
                try {
                                    if (monitor.isCanceled()) {

 * DBeaver - Universal Database Manager
                } catch (Exception e) {
                        byte[] buffer = new byte[10000];



            nodes = nodes.stream().filter(n -> !dupList.contains(n)).collect(Collectors.toList());
    @NotNull
                totalFilesSize += itemPath.size;
        } catch (Exception e) {
            // Set of files or/and folders
                    Map<DBNPathBase, List<PathInfo>> sourceResources = collectSourceFiles(nodes, monitor);
        monitor.beginTask("Save resources", (int) (totalFilesSize / FILES_SIZE_MONITOR_DIV));
        if (targetPath == null) {
        }
 * Unless required by applicable law or agreed to in writing, software
import java.nio.file.attribute.BasicFileAttributes;
            });
/*
                                    os.write(buffer, 0, count);

import org.jkiss.dbeaver.utils.ContentUtils;
            monitor.subTask(node.getNodeDisplayName());
import org.jkiss.utils.ByteNumberFormat;
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
            DBWorkbench.getPlatformUI().showError("File save IO error", null, e);
                        sourceResources.computeIfAbsent(node, p -> new ArrayList<>()).add(makePathInfo(file, false));
    }
    }
                                    }
            Path srcParent = srcPath.getParent();
import org.eclipse.core.commands.ExecutionException;
                    }
                    if (node.isChildOf(n)) {

                    Path sourcePath = pathNode.getPath();

                    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
import java.lang.reflect.InvocationTargetException;
        FileDialog saveDialog = new FileDialog(shell, SWT.SAVE);
    }
            }


                        if (monitor.isCanceled()) {

        String targetPath = DialogUtils.openDirectoryDialog(shell, "Choose target folder", null);
            String basePath = (srcParent == null ? srcPath : srcParent).toAbsolutePath().toString();

                        }
                }
                        sourceResources.computeIfAbsent(node, p -> new ArrayList<>()).add(makePathInfo(dir, true));
                        if (!Files.exists(targetPath)) {
                        }
                                        break;
                        dupList.add(n);
    public static final int DIRECTORY_FILE_SIZE = 1000;
        saveDialog.setFileName(pathNode.getName());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        if (monitor.isCanceled()) {
    public static final int FILES_SIZE_MONITOR_DIV = 1;
                try {
    @Override
                            try (OutputStream os = Files.newOutputStream(targetPath, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)) {
                        monitor.subTask("Scan directory " + dir.toAbsolutePath());
        } catch (Exception e) {
                sourceResources.computeIfAbsent(node, p -> new ArrayList<>()).add(makePathInfo(path, false));
                            return FileVisitResult.TERMINATE;
                    try (InputStream is = Files.newInputStream(sourcePath)) {

            });
    private PathInfo makePathInfo(Path path, boolean directory) throws IOException {
                    }
import org.jkiss.dbeaver.runtime.DBWorkbench;
            saveMultipleResources(shell, pathNodes);
                        try (OutputStream os = Files.newOutputStream(targetFile, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)) {
        if (Files.exists(targetFile)) {
                }
        }
    }
                        }
        {
        monitor.beginTask("Collect statistics", nodes.size());
    @Override
                return;
import org.jkiss.dbeaver.ui.UIUtils;
import java.io.OutputStream;
                // Collect contents recursively

                srcFilePath = CommonUtils.removeLeadingSlash(srcFilePath);

        Shell shell = HandlerUtil.getActiveShell(event);
                        break;
        }

            for (PathInfo itemPath : srcPathEntry.getValue()) {
                }

import java.net.URLDecoder;
import java.io.InputStream;
            }
        }
                        monitor.worked(DIRECTORY_FILE_SIZE / FILES_SIZE_MONITOR_DIV);
            return;

            // Filter duplicates (if both parent and child nodes are in the list then parent is removed

    private static class PathInfo {
        for (Map.Entry<DBNPathBase, List<PathInfo>> srcPathEntry : sourceResources.entrySet()) {
                                    if (count <= 0) {
import java.util.LinkedHashMap;
                    srcFilePath = srcFilePath.substring(basePath.length());
        }
    private void saveMultipleResources(Shell shell, Path targetFolder, List<DBNPathBase> nodes) {
        } else if (pathNodes.size() == 1 && !pathNodes.get(0).allowsChildren()) {
        }
            } else {

                            Files.createDirectories(targetPath);
import org.eclipse.ui.handlers.HandlerUtil;
            this.path = path;
 * You may obtain a copy of the License at
import java.nio.file.*;
    }
                                for (;;) {
        for (DBNPathBase node : nodes) {
    public void updateElement(UIElement element, Map parameters) {
 *
import java.util.stream.Collectors;
            }
                if (monitor.isCanceled()) {
            return null;
            this.size = size;
 * See the License for the specific language governing permissions and
        }
        Path path;
import org.eclipse.core.commands.ExecutionEvent;
            .filter(n -> n instanceof DBNPathBase)
                                    }
            Path srcPath = srcPathEntry.getKey().getPath();
        boolean directory;
                });
import org.eclipse.swt.widgets.Shell;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import java.io.IOException;
        long totalFilesSize = 0;
        monitor.done();
import java.util.ArrayList;
        try {
                                    monitor.worked(count / FILES_SIZE_MONITOR_DIV);
                for (DBNPathBase n : nodes) {
import java.nio.charset.StandardCharsets;
import org.jkiss.code.NotNull;
            if (!UIUtils.confirmAction(shell, "File exists", "Overwrite file '" + targetFile.toAbsolutePath() + "'?")) {

    }
        for (Map.Entry<DBNPathBase, List<PathInfo>> srcPathEntry : sourceResources.entrySet()) {
                }
                    }
        }
            List<DBNPathBase> dupList = new ArrayList<>();
                Files.walkFileTree(path, new SimpleFileVisitor<>() {
package org.jkiss.dbeaver.ui.navigator.actions;
                try {
import org.eclipse.ui.commands.IElementUpdater;
                if (srcFilePath.startsWith(basePath)) {
 * Licensed under the Apache License, Version 2.0 (the "License");
            monitor.worked(1);
                    if (monitor.isCanceled()) {
        Map<DBNPathBase, List<PathInfo>> sourceResources = new LinkedHashMap<>();
                            return FileVisitResult.TERMINATE;
import java.util.Map;
        try {
        }
}                        try (InputStream is = Files.newInputStream(itemPath.path)) {
    private void saveMultipleResources(Shell shell, List<DBNPathBase> nodes) {
                    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
    private Map<DBNPathBase, List<PathInfo>> collectSourceFiles(List<DBNPathBase> nodes, DBRProgressMonitor monitor) throws IOException {
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                    @Override
                    DBWorkbench.getPlatformUI().showError("IO error", null, e);
            monitor.worked(1);

                                }
            for (DBNPathBase node : nodes) {
        return sourceResources;
    }
        public PathInfo(Path path, long size, boolean directory) {
            this.directory = directory;
 * limitations under the License.
import org.eclipse.ui.menus.UIElement;
        if (targetPath == null) {
        if (pathNodes.isEmpty()) {
import org.eclipse.core.commands.AbstractHandler;
        }
                monitor.subTask(srcFilePath + (itemPath.directory ? "" : " (" + ByteNumberFormat.getInstance().format(itemPath.size) + ")"));
import org.eclipse.swt.SWT;
        String targetPath = DialogUtils.openFileDialog(saveDialog);
                }

 */
            for (PathInfo itemPath : srcPathEntry.getValue()) {
                        return FileVisitResult.CONTINUE;
                        return FileVisitResult.CONTINUE;
                        }
import java.util.List;
                    if (itemPath.directory) {
        Path targetFile = Path.of(targetPath);
        monitor.done();
        saveMultipleResources(shell, Path.of(targetPath), nodes);
import org.eclipse.swt.widgets.FileDialog;
            DBWorkbench.getPlatformUI().showError("File save IO error", null, e);

 * distributed under the License is distributed on an "AS IS" BASIS,
        }
                } catch (Exception e) {
                Path targetPath = targetFolder.resolve(srcFilePath);

        long size;
                    throw new InvocationTargetException(e);
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
import org.jkiss.dbeaver.model.navigator.fs.DBNPathBase;
                }
            UIUtils.runInProgressDialog(monitor -> {
                        return;
            Path path = node.getPath();
                } catch (IOException e) {
                    throw new InvocationTargetException(e);
    }
 *
                    }
public class NavigatorHandlerSaveResource extends AbstractHandler implements IElementUpdater {
                    }
                    }
        return null;
                    saveSourceFiles(monitor, shell, sourceResources, targetFolder);

                                    int count = is.read(buffer);
 * you may not use this file except in compliance with the License.
            saveSingleFile(shell, pathNodes.get(0));
                        }
    public Object execute(ExecutionEvent event) throws ExecutionException {

                    } else {
        List<DBNPathBase> pathNodes = NavigatorUtils.getSelectedNodes(HandlerUtil.getCurrentSelection(event)).stream()
        return new PathInfo(path, directory ? 0 : Files.size(path), directory);
                    @Override
            .map(n -> (DBNPathBase) n).toList();
                            ContentUtils.copyStreams(is, Files.size(sourcePath), os, monitor);
            if (Files.isDirectory(path)) {
            return;
                                        break;
    private void saveSourceFiles(DBRProgressMonitor monitor, Shell shell, Map<DBNPathBase, List<PathInfo>> sourceResources, Path targetFolder) {
import org.jkiss.dbeaver.ui.dialogs.DialogUtils;
    private void saveSingleFile(Shell shell, DBNPathBase pathNode) {
