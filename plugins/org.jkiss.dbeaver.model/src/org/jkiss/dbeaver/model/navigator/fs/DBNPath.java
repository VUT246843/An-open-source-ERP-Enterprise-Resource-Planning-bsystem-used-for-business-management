        return NodePathType.dbvfs.name() + (isDirectory() ? ".folder" : ".file");

    @Override
        }
 *

    @Nullable
        return super.refreshNode(monitor, source);
    }
 * See the License for the specific language governing permissions and
    protected boolean isTheSameFileSystem(DBNNode node) {
import org.jkiss.dbeaver.model.navigator.DBNStreamData;
        return null;

    @Override
 * you may not use this file except in compliance with the License.
    public DBNPath(DBNNode parentNode, Path path) {
    @Override
 * DBeaver - Universal Database Manager
        super(parentNode);
        return Files.size(path);


 * DBNPath
    public String getNodeTargetName() {
/**
 * Unless required by applicable law or agreed to in writing, software

 *

import org.jkiss.dbeaver.Log;
import java.io.InputStream;
    }
    }
    protected void dispose(boolean reflect) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 *     http://www.apache.org/licenses/LICENSE-2.0
    public String getNodeDescription() {
        return isDirectory() ? ModelMessages.fs_folder : ModelMessages.fs_file;
 * Licensed under the Apache License, Version 2.0 (the "License");
    public String getNodeType() {
import org.jkiss.code.Nullable;
    public boolean isDisposed() {
 *
import java.io.IOException;
        if (isDirectory()) {

    public boolean supportsStreamData() {
    @Nullable
public class DBNPath extends DBNPathBase implements DBNStreamData {
    @Override
    }

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override
    }
        this.path = null;
    @Override

package org.jkiss.dbeaver.model.navigator.fs;
    public synchronized Path getPath() {
    @Override

        return path;
        return path == null || super.isDisposed();
    }
 */
            return path.getFileSystem().equals(pn.path.getFileSystem());

 * Copyright (C) 2010-2025 DBeaver Corp and others
        return super.getNodeTargetName();
        this.path = path;
        return super.isTheSameFileSystem(node);
import org.jkiss.dbeaver.DBException;

import org.jkiss.dbeaver.model.navigator.DBNNode;
import org.jkiss.code.NotNull;
 * limitations under the License.
    @Override
    }

        return Files.newInputStream(path);
    @Override
        super.dispose(reflect);
    private static final Log log = Log.getLog(DBNPath.class);
import java.nio.file.Path;
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.path = path;
 * You may obtain a copy of the License at



    public long getStreamSize() throws IOException {

}
    @NotNull
    private Path path;
    @Override
    @Override
    }
    }
 */
import org.jkiss.dbeaver.model.messages.ModelMessages;
    }
    }
import java.nio.file.Files;

    }
    protected void setPath(Path path) {
    }
        return !isDirectory();
    public DBNNode refreshNode(@NotNull DBRProgressMonitor monitor, @Nullable Object source) throws DBException {
    }
    public String getNodeTypeLabel() {
    @NotNull
    @Override
    @NotNull
    public InputStream openInputStream() throws IOException {
            return null;
        if (node instanceof DBNPath pn) {
    @Override
        }
/*

