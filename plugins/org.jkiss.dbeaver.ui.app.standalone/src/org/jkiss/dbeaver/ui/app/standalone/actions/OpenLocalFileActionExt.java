                .map(FileTypeHandlerDescriptor.Extension::getExtensions)
                        notFound.append('\n');
import org.eclipse.osgi.util.NLS;
        dialog.setFilterExtensions(dialogExtensions);
                String msg = NLS.bind(msgFmt, notFound.toString());
import org.jkiss.dbeaver.model.file.FileTypeHandlerDescriptor;
import org.jkiss.dbeaver.ui.editors.EditorUtils;
import org.eclipse.core.commands.ExecutionException;
        if (names != null) {
            for (String name : names) {
import org.eclipse.swt.widgets.FileDialog;
        extensions.add("*.*");

                    if (++numberOfFilesNotFound > 1)
import org.eclipse.swt.widgets.Shell;
package org.jkiss.dbeaver.ui.app.standalone.actions;
    public OpenLocalFileActionExt() {
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 */
            String[] fileNames = fileList.stream().map(p -> p.toAbsolutePath().toString()).toArray(String[]::new);
        String[] dialogExtensions = extensions.toArray(new String[0]);
        return null;
        }
import org.eclipse.core.commands.AbstractHandler;
 * Copyright (C) 2010-2026 DBeaver Corp and others
        Shell activeShell = HandlerUtil.getActiveShell(event);
 * you may not use this file except in compliance with the License.
import org.eclipse.jface.dialogs.MessageDialog;
            EditorUtils.openExternalFiles(fileNames, null);

                Path filePath = Path.of(filterPath).resolve(name);
                    notFound.append(filePath);
                .collect(Collectors.joining(";")));
        }
                MessageDialog.open(MessageDialog.ERROR, activeShell, IDEWorkbenchMessages.OpenLocalFileAction_title, msg, SWT.SHEET);
/*
                if (!Files.exists(filePath)) {
 *

 *
        dialog.setFilterPath(filterPath);
    /**
            DialogUtils.setCurDialogFolder(filterPath);
            List<Path> fileList = new ArrayList<>();
            if (numberOfFilesNotFound > 0) {
import java.util.stream.Stream;
import java.util.stream.Collectors;

        filterPath = null;
                } else {
                String msgFmt = numberOfFilesNotFound == 1 ? IDEWorkbenchMessages.OpenLocalFileAction_message_fileNotFound : IDEWorkbenchMessages.OpenLocalFileAction_message_filesNotFound;
        FileDialog dialog = new FileDialog(activeShell, SWT.OPEN | SWT.MULTI | SWT.SHEET);
import org.eclipse.core.commands.ExecutionEvent;
        if (filterExtension != null) {
            int numberOfFilesNotFound = 0;
        String[] names = dialog.getFileNames();
 * See the License for the specific language governing permissions and
                }
            filterExtension = dialog.getFilterExtensions()[dialog.getFilterIndex()];
import java.nio.file.Files;
        Set<String> extensions = new TreeSet<>();
    public Object execute(ExecutionEvent event) throws ExecutionException {
            }
public class OpenLocalFileActionExt extends AbstractHandler {
            extensions.add(Stream.of(dhd.getExtensions())
                .map(e -> "*." + e)
        }
import org.jkiss.utils.ArrayUtils;
    private String filterExtension;
            }
import org.jkiss.dbeaver.model.file.FileTypeHandlerRegistry;
     */
    }
import org.jkiss.dbeaver.ui.dialogs.DialogUtils;

     * Creates a new action for opening a local file.
    }
    public void dispose() {
            }
        setEnabled(true);
}
        for (FileTypeHandlerDescriptor dhd : FileTypeHandlerRegistry.getInstance().getHandlers()) {
        }
import java.util.*;
            StringBuilder notFound = new StringBuilder();
 * DBeaver - Universal Database Manager

        dialog.setText(IDEWorkbenchMessages.OpenLocalFileAction_title);

 * distributed under the License is distributed on an "AS IS" BASIS,
        if (dialog.open() == null) {
    @Override
                .flatMap(Arrays::stream)
            return null;
            filterPath = dialog.getFilterPath();
    private String filterPath;

        }


            int extIndex = ArrayUtils.indexOf(dialogExtensions, filterExtension);
    }
 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.ui.handlers.HandlerUtil;
        if (dialog.getFilterIndex() >= 0) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                dialog.setFilterIndex(extIndex);
import java.nio.file.Path;

 * You may obtain a copy of the License at

        this.filterPath = DialogUtils.getCurDialogFolder();
import org.eclipse.ui.internal.ide.IDEWorkbenchMessages;
 * limitations under the License.
            if (extIndex >= 0) {
 *

                    fileList.add(filePath);
import org.eclipse.swt.SWT;
