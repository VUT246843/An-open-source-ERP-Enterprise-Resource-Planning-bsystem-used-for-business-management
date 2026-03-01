            try {
    }
                        DBFUtils.getUriFromPath(target),
import org.eclipse.core.runtime.IPath;
            try {
    public static final DefaultResourceHandlerImpl INSTANCE = new DefaultResourceHandlerImpl();
                    }
import org.eclipse.core.filesystem.EFS;


    @Override
        final ProgramInfo program = ProgramInfo.getProgram(resource);
                            DBWorkbench.getPlatform().getTempFolder(monitor, "external-files"),
import org.eclipse.core.resources.IFolder;
            } catch (OperationCanceledException ex) {

import java.util.Collections;
                if (IEditorRegistry.SYSTEM_EXTERNAL_EDITOR_ID.equals(editorDesc.getId())) {
import org.jkiss.dbeaver.model.file.FileTypeHandlerRegistry;
package org.jkiss.dbeaver.ui.resources;
import org.jkiss.dbeaver.model.fs.DBFUtils;
            IEditorDescriptor editorDesc;
 *
    @Override
        } else if (resource instanceof IFile) {
                } else {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
            if (Files.exists(path)) {
                    // and wait for it to finish, this will allow us to:
import org.jkiss.dbeaver.ui.ProgramInfo;
}

        }
                    );
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * You may obtain a copy of the License at
                                final IFileInfo info = fileStore.fetchInfo(EFS.NONE, null);
            return program.getProgram().getName();
                editorDesc = IDE.getEditorDescriptor((IFile)resource, true, true);

 * limitations under the License.
                        );
 * Unless required by applicable law or agreed to in writing, software
                    } catch (IOException | CoreException e) {
                if (!CommonUtils.isEmpty(fileExtension)) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2026 DBeaver Corp and others
            }
    @Override
import org.eclipse.core.filesystem.IFileStore;
                        Path tempFile = Files.createTempFile(
    public void openResource(@NotNull IResource resource) throws CoreException, DBException {
import org.jkiss.dbeaver.model.file.FileOpenHandler;
                            fileStore.getName()
/**


    public String getResourceDescription(@NotNull IResource resource) {
                }
            DBWorkbench.getPlatformUI().showError("Error opening resource", "Do not know how to open resource '" + resource + "'");
        return super.getFeatures(resource);
        if (resource instanceof IFile) {
                        }
import org.eclipse.swt.program.Program;
                        true
    }
 * DBeaver - Universal Database Manager
            IFileStore fileStore = ((DBFFileStoreProvider) resource).getFileStore();
            // open the editor on the file
            Path path = location.toPath();
                            }
                    //  1. Delete the temporary file right away
                        handler.openFiles(Collections.singletonList(path), null, FileTypeAction.INTERNAL_EDITOR);
                    try {
import org.eclipse.ui.IEditorRegistry;
            IDE.openEditor(UIUtils.getActiveWorkbenchWindow().getActivePage(), (IFile) resource);
                    Program.launch(target.toString());
            }
            // Try to open using file handler
            long length = fileStore.fetchInfo().getLength();
                    IDE.openEditor(
                        UIUtils.getActiveWorkbenchWindow().getActivePage(),
        return "";
import org.eclipse.core.filesystem.IFileInfo;
                                ContentUtils.copyStreams(is, info.getLength(), os, monitor);
        IPath location = resource instanceof EFSNIOResource ? null : resource.getLocation();
    @NotNull
                return;
 * See the License for the specific language governing permissions and
import java.nio.file.Path;
                }
import org.jkiss.code.NotNull;
/*


import org.eclipse.core.resources.IFile;
 *
                        return tempFile;
        if (location != null) {
        }

                        try (InputStream is = fileStore.openInputStream(EFS.NONE, null)) {
import org.eclipse.ui.IEditorDescriptor;
import org.jkiss.dbeaver.ui.UIUtils;
import org.eclipse.ui.ide.IDE;
                        FileOpenHandler handler = fthd.createHandler();
    public int getFeatures(IResource resource) {
        }
import org.jkiss.code.Nullable;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.file.FileTypeHandlerDescriptor;
            return FEATURE_DELETE | FEATURE_RENAME | FEATURE_CREATE_FOLDER | FEATURE_MOVE_INTO;
            DBWorkbench.getPlatformUI().executeShellProgram(location.toOSString());
        if (program != null) {
    }
import java.nio.file.Files;
                DBWorkbench.getPlatformUI().showError("Error opening resource", "Can't open resource using external editor", e);
                            try (OutputStream os = Files.newOutputStream(tempFile)) {
                final Path target = UIUtils.runWithMonitor(monitor -> {
import java.io.OutputStream;
        return "resource"; //$NON-NLS-1$
                    //  2. Detect changes made by an external editor
        } else {
        } else if (resource instanceof IFolder && location != null) {
                "'?\nSize = " + ByteNumberFormat.getInstance().format(length) + " bytes")) {

            if (!UIUtils.confirmAction(resource.getFullPath().toString(), "Open remote resource '" + resource.getFullPath() +
    @Nullable
        if (resource instanceof DBFFileStoreProvider) {
import org.eclipse.core.runtime.OperationCanceledException;
    }
import java.io.IOException;
import org.jkiss.dbeaver.model.fs.DBFFileStoreProvider;
                String fileExtension = IOUtils.getFileExtension(path);
 * Default resource handler
                    // Here we could potentially start a new process
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.fs.nio.EFSNIOResource;
 */
            }
                            null,
                        throw new DBException("Error copying file", e);
 * you may not use this file except in compliance with the License.
    public String getTypeName(@NotNull IResource resource) {
                });
import java.io.InputStream;
import org.jkiss.utils.IOUtils;

        } else if (resource instanceof IFolder) {
import org.jkiss.dbeaver.utils.ContentUtils;
    @Override
                    if (fthd != null) {
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
        }
                    }

import org.jkiss.dbeaver.model.file.FileTypeAction;
 */

public class DefaultResourceHandlerImpl extends AbstractResourceHandler {
                        editorDesc.getId(),
            } catch (DBException e) {
                        return;
import org.jkiss.utils.ByteNumberFormat;
import org.jkiss.utils.CommonUtils;
 * Licensed under the Apache License, Version 2.0 (the "License");
                    FileTypeHandlerDescriptor fthd = FileTypeHandlerRegistry.getInstance().findHandler(fileExtension);
                return;
 *
            return FEATURE_OPEN | FEATURE_DELETE | FEATURE_RENAME;
                    // But for now it's okay, I assume.
