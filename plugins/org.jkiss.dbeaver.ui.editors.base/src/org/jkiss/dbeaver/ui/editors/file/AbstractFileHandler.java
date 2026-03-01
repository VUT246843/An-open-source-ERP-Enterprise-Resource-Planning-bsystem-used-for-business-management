        @Nullable DBPDataSourceContainer dataSource,

    protected boolean tryOpenViaResourceAdapter(@NotNull Path path, @NotNull DBNPathBase sourceNode) {

    ) throws DBException {
 * Subclasses may override {@link #openFiles(List, DBPDataSourceContainer, FileTypeAction)}
            }
 * limitations under the License.
 * By default, this handler supports {@link FileTypeAction#EXTERNAL_EDITOR} and
 * Base implementation of {@link FileOpenHandler} that provides default handling
    }
 *
 *     <li>For {@link FileTypeAction#EXTERNAL_EDITOR}, files are opened in the
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                    handler.openResource(file);
import org.jkiss.dbeaver.ui.ShellUtils;
        @NotNull FileTypeAction action
/**
                    if (!IOUtils.isLocalPath(path)) {
    protected DBNPathBase sourceNode;
 *     <li>For {@link FileTypeAction#INTERNAL_EDITOR}, files are opened in
 * DBeaver - Universal Database Manager
import org.jkiss.code.NotNull;
            case INTERNAL_EDITOR -> {
                DBPResourceHandler handler = DBPPlatformDesktop.getInstance().getWorkspace().getResourceHandler(file);
 * See the License for the specific language governing permissions and
                    return true;
                    if (!IOUtils.isLocalPath(path)) {
    }
                for (Path path : fileList) {
import org.eclipse.core.resources.IFile;
 * to advertise a different set of supported {@link FileTypeAction} values.
                if (handler != null) {
        try {
                        path = EditorUtils.copyRemoteFileToTempDir(path);
                        path = EditorUtils.copyRemoteFileToTempDir(path);
    }
import org.jkiss.dbeaver.model.file.FileOpenHandler;
import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;
            }
public class AbstractFileHandler implements FileOpenHandler {
import java.util.Set;
 * Copyright (C) 2010-2026 DBeaver Corp and others
                    ShellUtils.openExternalFile(path);
        this.sourceNode = sourceNode;
 * You may obtain a copy of the License at
import java.util.List;

import java.nio.file.Path;
    public void setSourceNode(@Nullable DBNPathBase sourceNode) {
 * you may not use this file except in compliance with the License.
                    }
        switch (action) {
 * or integrate with different editors), and/or override {@link #supportedActions()}
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
    @Override
            case EXTERNAL_EDITOR -> {
            IResource resource = sourceNode.getAdapter(IResource.class);
import org.jkiss.code.Nullable;
 * to customize how files are opened (for example, to support additional actions
 *     DBeaver's internal editor.</li>
import org.jkiss.dbeaver.DBException;
 * {@link FileTypeAction#INTERNAL_EDITOR} actions:
            log.debug("Failed to open file via resource adapter: " + path, e);
 */
 *

 * <p>
        return Set.of(FileTypeAction.EXTERNAL_EDITOR, FileTypeAction.INTERNAL_EDITOR);
        return false;
                for (Path path : fileList) {
import org.jkiss.dbeaver.Log;
            case DATABASE -> {
 * <p>

    public void openFiles(
    @NotNull
/*
                }
import org.jkiss.dbeaver.model.file.FileTypeAction;
import org.jkiss.utils.IOUtils;
 * This class does not handle {@link FileTypeAction#DATABASE} by default and
        }
                }
                    }
 * will throw a {@link DBException} if that action is requested.
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
                    EditorUtils.openExternalFileEditor(path, UIUtils.getActiveWorkbenchWindow());
 *     non-local file system, it is first copied to a temporary local directory.</li>
        }
import org.jkiss.dbeaver.ui.UIUtils;
        } catch (Exception e) {
 *
import org.jkiss.dbeaver.model.navigator.fs.DBNPathBase;
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
 * <ul>
    private static final Log log = Log.getLog(AbstractFileHandler.class);
 *     http://www.apache.org/licenses/LICENSE-2.0

        @NotNull List<Path> fileList,
 * </ul>
            if (resource instanceof IFile file) {
    @Override
    }
 * Unless required by applicable law or agreed to in writing, software

 * for opening files in DBeaver.
    public Set<FileTypeAction> supportedActions() {
                }
 *     operating system's default external editor. If a file is located on a

                throw new DBException("Unsupported file action: " + action);
import org.jkiss.dbeaver.model.app.DBPResourceHandler;
package org.jkiss.dbeaver.ui.editors.file;
import org.jkiss.dbeaver.ui.editors.EditorUtils;
import org.eclipse.core.resources.IResource;
}
