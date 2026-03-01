 */
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
     * Splits URI to path segments corresponding to file hierarchy.


import java.io.IOException;

    DBPImage getIcon();

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @NotNull
    @NotNull
    /**


import java.net.URI;
 * Virtual file system
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 *
public interface DBFVirtualFileSystem extends Closeable {
/**
    default boolean isDirectory(Path path) {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    default void refreshRoots(DBRProgressMonitor monitor) throws DBException {}
import java.nio.file.Path;

import org.jkiss.dbeaver.DBException;
    String getFileSystemDisplayName();
    @NotNull

    Path getPathByURI(@NotNull DBRProgressMonitor monitor, @NotNull URI uri) throws DBException;
    String[] getURISegments(URI uri);
    @NotNull
    List<? extends DBFVirtualFileSystemRoot> getRootFolders(DBRProgressMonitor monitor) throws DBException;
import org.jkiss.code.NotNull;
    String getType();
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
import java.util.List;
 *

    @Override
    default void close() throws IOException {}
    String getDescription();
 * limitations under the License.
 * You may obtain a copy of the License at


    @NotNull
     */
        return true;

        return Files.isDirectory(path);
import java.io.Closeable;
import java.nio.file.Files;

    String getProviderId();
 * See the License for the specific language governing permissions and


 * DBeaver - Universal Database Manager

    String getId();
/*
    }
}

import org.jkiss.dbeaver.model.DBPImage;
 *
     * USed for performance. Some cloud FS (like Azure) perform remote call for each check for directory
     * Typical case: /root/folder/folder/file
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
    default boolean supportsEmptyFolders() {
package org.jkiss.dbeaver.model.fs;
    /**
     */
 */
