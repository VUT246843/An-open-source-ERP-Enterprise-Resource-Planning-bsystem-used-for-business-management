                    loadLocalFiles(monitor, srcFiles, targetPath);
    }
                            os.write(buffer, 0, count);
import java.nio.file.StandardOpenOption;
                            }
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
                            monitor.worked(count);
                                break;
import java.nio.file.Path;

 * Copyright (C) 2010-2024 DBeaver Corp and others
 * See the License for the specific language governing permissions and
            DBWorkbench.getPlatformUI().showError("File save IO error", null, e);
 */
 * limitations under the License.
import org.jkiss.dbeaver.ui.dialogs.DialogUtils;
import java.util.Map;

 * Licensed under the Apache License, Version 2.0 (the "License");
        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                byte[] buffer = new byte[10000];
        monitor.done();
import org.jkiss.dbeaver.model.navigator.fs.DBNPathBase;
                DBWorkbench.getPlatformUI().showError("IO error", null, e);
                }
                } catch (Exception e) {

            return null;
                            int count = is.read(buffer);
                    try (OutputStream os = Files.newOutputStream(targetFilePath, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)) {
import org.eclipse.core.commands.ExecutionEvent;
import org.jkiss.utils.ByteNumberFormat;
    @Override
 * DBeaver - Universal Database Manager
                        }
package org.jkiss.dbeaver.ui.navigator.actions;
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
                    throw new InvocationTargetException(e);


            } catch (IOException e) {
    }
import org.eclipse.core.commands.AbstractHandler;
                        for (;;) {
        return null;
        if (!(pathNodes instanceof DBNPathBase pathNode)) {

                            if (monitor.isCanceled()) {
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.menus.UIElement;
 * You may obtain a copy of the License at
                    Path targetPath = pathNode.getPath();

                        targetPath = targetPath.getParent();
        try {
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.commands.IElementUpdater;
            return null;
        Shell shell = HandlerUtil.getActiveShell(event);
        }
import java.io.InputStream;

                try {
public class NavigatorHandlerLoadResource extends AbstractHandler implements IElementUpdater {
                    }
 * Unless required by applicable law or agreed to in writing, software
            }
import org.jkiss.dbeaver.model.navigator.DBNNode;

            totalFilesSize += srcFile.length();
        } catch (Exception e) {
import org.jkiss.dbeaver.model.navigator.fs.DBNFileSystemRoot;
/*
            try {
    private void loadLocalFiles(DBRProgressMonitor monitor, File[] srcFiles, Path targetPath) {
        long totalFilesSize = 0;
import org.jkiss.dbeaver.runtime.DBWorkbench;
                }
    }
                            if (count <= 0) {
}            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        DBNNode pathNodes = NavigatorUtils.getSelectedNode(HandlerUtil.getCurrentSelection(event));
    @Override

 * you may not use this file except in compliance with the License.
 *


import java.lang.reflect.InvocationTargetException;
 * distributed under the License is distributed on an "AS IS" BASIS,

                    if (!(pathNode instanceof DBNFileSystemRoot) && !Files.isDirectory(targetPath)) {
import java.io.File;

                try (InputStream is = Files.newInputStream(srcFile.toPath())) {
                                break;
            Path targetFilePath = targetPath.resolve(srcFile.getName());
        }
        }
                    }

        monitor.beginTask("Load resources", (int) totalFilesSize);
        for (File srcFile : srcFiles) {
    public Object execute(ExecutionEvent event) throws ExecutionException {
            if (monitor.isCanceled()) {
                    pathNodes.refreshNode(monitor, this);
        File[] srcFiles = DialogUtils.openFileList(shell, "Open file(s)", null);
import org.jkiss.dbeaver.ui.UIUtils;
        for (File srcFile : srcFiles) {
        }
            });
                return;
            UIUtils.runInProgressDialog(monitor -> {
                            }
import java.nio.file.Files;

import java.io.IOException;
            monitor.subTask(srcFile.getName() + " (" + ByteNumberFormat.getInstance().format(srcFile.length()) + ")");
import org.eclipse.swt.widgets.Shell;
        if (srcFiles == null) {
 *
    public void updateElement(UIElement element, Map parameters) {
import java.io.OutputStream;
