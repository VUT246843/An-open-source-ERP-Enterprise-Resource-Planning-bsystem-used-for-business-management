        }
            throw new DBException("Failed to get path from uri '" + uri + "': " + e.getMessage(), e);
            fileSystem = fileSystems.length == 0 ? null : fileSystems[0];
package org.jkiss.dbeaver.model.fs;
/**
                    break;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return getFileSystemByID(monitor, uri, fileSystems, fsId);
 *
            throw new DBException("Cannot find file system provider for the uri '" + uri + "'");

import java.nio.file.Path;
import java.net.URI;
        if (CommonUtils.isEmpty(fsId)) {
                }
 *
 *
                if (fs.getId().equals(fsId)) {

        try {
 * Virtual file system provider
    protected Path getFileSystemByID(@NotNull DBRProgressMonitor monitor, @NotNull URI uri, @NotNull DBFVirtualFileSystem[] fileSystems, @Nullable String fsId) throws DBException {
        DBFVirtualFileSystem fileSystem = null;
 */
        } catch (Throwable e) {

 * DBeaver - Universal Database Manager
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        String fsId = DBFUtils.getQueryParameters(uri.getRawQuery()).get(DBFFileSystemManager.QUERY_PARAM_FS_ID);
    @NotNull
    @Override
import org.jkiss.utils.CommonUtils;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * You may obtain a copy of the License at
    public Path getPathByURI(@NotNull DBRProgressMonitor monitor, @NotNull URI uri, @NotNull DBFVirtualFileSystem[] fileSystems) throws DBException {
 * you may not use this file except in compliance with the License.
        if (fileSystem == null) {
 */

import org.jkiss.code.NotNull;
 * Unless required by applicable law or agreed to in writing, software
        } else {
import org.jkiss.code.Nullable;

        }
}
                    fileSystem = fs;
 * limitations under the License.

    }
 * See the License for the specific language governing permissions and
public abstract class AbstractFileSystemProvider implements DBFFileSystemProvider {
            }

/*
import org.jkiss.dbeaver.DBException;
            for (DBFVirtualFileSystem fs : fileSystems) {
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
            return fileSystem.getPathByURI(monitor, uri);
    @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0
