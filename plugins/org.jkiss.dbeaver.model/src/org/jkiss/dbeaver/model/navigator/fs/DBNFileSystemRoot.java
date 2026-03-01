
 *     http://www.apache.org/licenses/LICENSE-2.0
        return DBIcon.TREE_FOLDER_CONSTRAINT;
    }
public class DBNFileSystemRoot extends DBNPathBase implements DBNLazyNode

    }
    }
    @Override
        super.dispose(reflect);
    }
    public String getNodeType() {
    public String getNodeDisplayName() {
import org.jkiss.dbeaver.model.DBPImage;
        return path;
    @Override
    }

 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
    @Override
{
        return root;
                path = root.getRootPath(new VoidProgressMonitor());
    @NotNull
    public boolean isDirectory() {
    }
import org.jkiss.dbeaver.model.meta.Property;

import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
import org.jkiss.dbeaver.Log;
    @NotNull
    @NotNull
import org.jkiss.code.Nullable;
            return adapter.cast(root);

    }
    @Override
        if (path == null) {
    @Override
/**
}
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override
 * Unless required by applicable law or agreed to in writing, software

    public String getNodeTypeLabel() {

    public String toString() {
    @Property(id = DBConstants.PROP_ID_NAME, viewable = true, order = 1)
    @NotNull
 * you may not use this file except in compliance with the License.
        this.path = path;
package org.jkiss.dbeaver.model.navigator.fs;
import org.jkiss.dbeaver.DBException;
    public boolean isDisposed() {
    @Override
    protected void dispose(boolean reflect) {
        super(parentNode);

    @Override
        this.root = root;
    @Override
        return NodePathType.dbvfs.name() + ".folder";
    public DBFVirtualFileSystemRoot getRoot() {

import org.jkiss.dbeaver.model.fs.DBFVirtualFileSystemRoot;
 *

                log.error("Error resolving file system root", e);
    @NotNull
import org.jkiss.dbeaver.model.navigator.DBNNode;

        return root == null || super.isDisposed();
/*
        return super.getAdapter(adapter);
    private DBFVirtualFileSystemRoot root;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


import org.jkiss.dbeaver.model.navigator.DBNLazyNode;
        this.path = null;
        return root.getName();
    private Path path;

        if (adapter.isInstance(root)) {
 * DBNFileSystemRoot
    }
    @Override
    public DBNFileSystemRoot(DBNFileSystem parentNode, DBFVirtualFileSystemRoot root) {
    public boolean supportsRename() {
    private static final Log log = Log.getLog(DBNFileSystemRoot.class);
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
 *

    }
    }
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
    public DBPImage getNodeIcon() {
    @Override
        }
    public DBNNode refreshNode(@NotNull DBRProgressMonitor monitor, @Nullable Object source) throws DBException {
        return ModelMessages.fs_folder;
    @Nullable
    }
        return false;
 * DBeaver - Universal Database Manager
            }
import java.nio.file.Path;
    }
import org.jkiss.code.NotNull;
        }
    public <T> T getAdapter(@NotNull Class<T> adapter) {
 */
            try {
            } catch (DBException e) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
        return super.refreshNode(monitor, source);
import org.jkiss.dbeaver.model.DBIcon;
    public synchronized Path getPath() {
        this.root = null;
    }

 * limitations under the License.
    @Nullable

                path = Path.of(".nonexistentfolder");
import org.jkiss.dbeaver.model.DBConstants;

        return true;
 */
    protected synchronized void setPath(Path path) {
import org.jkiss.dbeaver.model.messages.ModelMessages;
    }

 *
    }
        return root.getRootId() + "@" + root.getFileSystem().getId() + "->" + super.toString();
