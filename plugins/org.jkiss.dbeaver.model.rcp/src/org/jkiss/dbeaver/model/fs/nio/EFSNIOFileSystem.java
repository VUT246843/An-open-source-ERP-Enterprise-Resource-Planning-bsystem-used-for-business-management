                                    }

    }
            if (project != null) {
    @Override

        String[] vfsPath = CommonUtils.removeTrailingSlash(CommonUtils.removeLeadingSlash(uri.getPath()))
import org.jkiss.dbeaver.model.navigator.fs.DBNFileSystem;
 *
    }
    @Override
        }
                                        throw new IllegalArgumentException("Error resolving path '" + relPath + "'", e);
                        try {
 * NIOFileSystem
                                    try {
                                log.debug("File system '" + fsType + ":" + fsId + "' not found");
                                fsNode.getChildren(monitor);
 * you may not use this file except in compliance with the License.
        String projectName = CommonUtils.toString(uri.getHost(), uri.getAuthority());
                            }
}

                            DBNFileSystem fsNode = fileSystemsNode.getFileSystem(fsType, fsId);
 *
        return EFS.ATTRIBUTE_OWNER_READ
 * Unless required by applicable law or agreed to in writing, software
            if (e instanceof RuntimeException re) {
                String fsRootPath = vfsPath[2];
               | EFS.ATTRIBUTE_OWNER_WRITE | EFS.ATTRIBUTE_OWNER_EXECUTE
            // throw new IllegalArgumentException("Invalid " + DBVFS_FS_ID + " URI: " + uri);
                                        path = fsNodeRoot.getPath().resolve(relPath);
 */
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @NotNull
            }
                            }
import org.jkiss.code.NotNull;
            .split("/");
package org.jkiss.dbeaver.model.fs.nio;
                                throw re;
                                }
    public static final String DBVFS_FS_ID = "dbvfs";
               | EFS.ATTRIBUTE_GROUP_READ | EFS.ATTRIBUTE_GROUP_WRITE
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.Log;
    }
 * See the License for the specific language governing permissions and
                DBNProject projectNode = DBWorkbench.getPlatform().getNavigatorModel().getRoot().getProjectNode(project);
        return new EFSNIOFileStore(uri, path);
                                    } catch (Exception e) {
                            if (e instanceof RuntimeException re) {
 *
public class EFSNIOFileSystem extends FileSystem {
import org.jkiss.dbeaver.model.navigator.DBNProject;

                            if (fsNode != null) {
               | EFS.ATTRIBUTE_OTHER_WRITE | EFS.ATTRIBUTE_OTHER_EXECUTE;
import java.net.URI;
                String fsType = vfsPath[0];
    @Override
                monitor -> getFileStoreFromUri(monitor, uri));
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
        Path path = null;
import org.jkiss.dbeaver.model.navigator.fs.DBNFileSystemRoot;

import org.jkiss.utils.CommonUtils;


        return true;
            throw new IllegalArgumentException("Error while getting file store", e);
                    DBNFileSystems fileSystemsNode = projectNode.getExtraNode(DBNFileSystems.class);
    public boolean canWrite() {
    public int attributes() {
 *

                                if (fsNodeRoot != null) {
            log.debug("Invalid " + DBVFS_FS_ID + " URI: " + uri);
                throw re;
                            fileSystemsNode.getChildren(monitor);
        }
 * URI format:  dbvfs://project-name/fs-type/fs-id/root-id
            DBPProject project = DBWorkbench.getPlatform().getWorkspace().getProject(projectName);
                            throw new IllegalArgumentException("Error reading file systems", e);
import org.jkiss.dbeaver.model.app.DBPProject;
    public EFSNIOFileSystem() {
import org.jkiss.dbeaver.runtime.DBWorkbench;
    public boolean canDelete() {
import org.eclipse.core.filesystem.IFileStore;
                    if (fileSystemsNode != null) {
        if (!CommonUtils.isEmpty(projectName) && vfsPath.length == 3 && !CommonUtils.isEmpty(relPath)) {
            return EFS.getNullFileSystem().getStore(uri);

        return true;
 * limitations under the License.
    }
                                        relPath = CommonUtils.removeLeadingSlash(relPath);
import java.nio.charset.StandardCharsets;
        try {
import org.jkiss.dbeaver.model.navigator.fs.DBNFileSystems;
import java.net.URLDecoder;
 */
    private static final Log log = Log.getLog(EFSNIOFileSystem.class);
 * Licensed under the Apache License, Version 2.0 (the "License");
                                DBNFileSystemRoot fsNodeRoot = fsNode.getRoot(fsRootPath);

                }
                    }
                            } else {


/**
                                        relPath = URLDecoder.decode(relPath, StandardCharsets.UTF_8);
            return DBWorkbench.getPlatformUI().runWithMonitor(
    @Override

    private static IFileStore getFileStoreFromUri(@NotNull DBRProgressMonitor monitor, @NotNull URI uri) {
/*
                        } catch (Exception e) {

                if (projectNode != null) {
                String fsId = vfsPath[1];
        String relPath = uri.getQuery();
        if (path == null) {
 *
import org.eclipse.core.filesystem.provider.FileSystem;
import java.nio.file.Path;
        } catch (Exception e) {
               | EFS.ATTRIBUTE_GROUP_EXECUTE | EFS.ATTRIBUTE_OTHER_READ
                        }
    public IFileStore getStore(URI uri) {
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
        }
import org.eclipse.core.filesystem.EFS;
