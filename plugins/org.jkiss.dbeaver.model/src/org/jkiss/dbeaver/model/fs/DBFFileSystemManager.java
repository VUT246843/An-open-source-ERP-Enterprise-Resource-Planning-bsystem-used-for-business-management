
        return dbfFileSystems.values();
        if (dbfFileSystems != null) {
    @Override
            throw new DBException("File system type not present in the file uri: " + uri);
                    fs.close();
 *
import org.jkiss.code.NotNull;
        }
        DBFFileSystemDescriptor fsProvider = DBWorkbench.getPlatform().getFileSystemRegistry()
        }
 *
        return true;
        var fsRegistry = DBWorkbench.getPlatform().getFileSystemRegistry();
        }
 * Copyright (C) 2010-2025 DBeaver Corp and others

 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.utils.CommonUtils;

        }
    public void close() {
    public Path getPathFromURI(DBRProgressMonitor monitor, URI uri) throws DBException {
 * DBeaver - Universal Database Manager
            reloadFileSystems(monitor);
            var fsProvider = fileSystemProviderDescriptor.getInstance();
    public static final String QUERY_PARAM_FS_ID = "fs";
import org.jkiss.utils.IOUtils;
        this.project = project;
        DBFEventManager.getInstance().removeListener(this);
    @NotNull
    public synchronized Collection<DBFVirtualFileSystem> getVirtualFileSystems(DBRProgressMonitor monitor) throws DBException {

            reloadFileSystems(monitor);
 */
    }
 * you may not use this file except in compliance with the License.
import java.net.URI;

                try {
            log.error(e);
    public Path getPathFromString(DBRProgressMonitor monitor, String pathOrUri) throws DBException {
import org.jkiss.dbeaver.model.fs.event.DBFEvent;
    @NotNull
 * See the License for the specific language governing permissions and
    }
    }
        }
import org.jkiss.dbeaver.runtime.DBWorkbench;
        if (URI_SCHEME_PREFIX.matcher(pathOrUri).matches()) {
 *     http://www.apache.org/licenses/LICENSE-2.0

import java.nio.file.Path;
    public void handleFileSystemEvent(@NotNull DBFEvent event) {
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (IOUtils.isLocalURI(uri)) {
import java.io.IOException;
public class DBFFileSystemManager implements DBFEventListener {
 *
        DBFEventManager.getInstance().addListener(this);
import org.jkiss.dbeaver.DBException;
            .filter(fs -> fs.getProviderId().equals(fsProvider.getId())).toArray(DBFVirtualFileSystem[]::new);
    public DBFFileSystemManager(@NotNull DBPProject project) {

import org.jkiss.dbeaver.model.app.DBPProject;
/*
        }
 * Unless required by applicable law or agreed to in writing, software
            }
        try {
        Map<String, DBFVirtualFileSystem> fsList = new LinkedHashMap<>();
        if (dbfFileSystems == null) {

            DBWorkbench.getPlatformUI().runWithMonitor(this::reloadFileSystems);

        } else {
            return Path.of(pathOrUri);
            .getFileSystemProviderBySchema(fsType);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

        return fsProvider.getInstance().getPathByURI(monitor, uri, fsCandidates);
        if (dbfFileSystems == null) {
import org.jkiss.dbeaver.Log;
 * Licensed under the Apache License, Version 2.0 (the "License");

        dbfFileSystems = fsList;
}
    }
import org.jkiss.dbeaver.model.fs.event.DBFEventListener;
        if (CommonUtils.isEmpty(fsType)) {
            }

    }
    private static final Log log = Log.getLog(DBFFileSystemManager.class);
        }
    @NotNull
        }
                }

                } catch (IOException e) {

    @NotNull
import org.jkiss.dbeaver.model.fs.event.DBFEventManager;
        } catch (DBException e) {
import java.util.Map;
import java.util.Collection;
        DBFVirtualFileSystem[] fsCandidates = dbfFileSystems.values().stream()
            return getPathFromURI(monitor, URI.create(pathOrUri));
import java.util.regex.Pattern;
import java.util.LinkedHashMap;
    }
 * You may obtain a copy of the License at
    public synchronized boolean reloadFileSystems(@NotNull DBRProgressMonitor monitor) throws DBException {
            for (DBFVirtualFileSystem dbfFileSystem : fsProvider.getAvailableFileSystems(monitor, project)) {
                fsList.put(dbfFileSystem.getId(), dbfFileSystem);
    public static final Pattern URI_SCHEME_PREFIX = Pattern.compile("[a-z\\d]+:/.+", Pattern.CASE_INSENSITIVE);
    private final DBPProject project;
 * limitations under the License.
    private volatile Map<String, DBFVirtualFileSystem> dbfFileSystems;
        if (fsProvider == null) {
                    log.debug("Error closing virtual FS", e);
        for (DBFFileSystemDescriptor fileSystemProviderDescriptor : fsRegistry.getFileSystemProviders()) {
package org.jkiss.dbeaver.model.fs;
        }
            return Path.of(uri);
            for (DBFVirtualFileSystem fs : dbfFileSystems.values()) {
            throw new DBException("File system schema '" + fsType + "' not recognized");
        String fsType = uri.getScheme();

