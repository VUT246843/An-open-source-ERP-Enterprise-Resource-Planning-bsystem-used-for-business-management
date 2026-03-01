
            return null;
        if (!CommonUtils.isEmpty(fileSystemId)) {
        if (dataSourceContainerBox.isPresent()) {
import java.net.URISyntaxException;

import org.jkiss.dbeaver.model.connection.DBPDriver;
            ClassLoader fsClassloader = fileSystemProvider.getClass().getClassLoader();
                Path[] result = new Path[1];
    public static void mapFileSystem(FileSystem fs, String id) {
        }
        return dsContainer;
    public static DBFPath getDBFPathFromURI(@NotNull String fileUriString) throws DBException {
            return Collections.emptyMap();
            log.error(e);
        } else {
import org.jkiss.code.Nullable;
        URI uri = path.toUri();
                    } catch (DBException e) {

    }
            } catch (InterruptedException e) {
        DBFPath dbfPath = getDBFPathFromURI(fileUriString);

        try {
        @NotNull DBRRunnableContext runnableContext,
    public static Path resolvePathFromString(
        @NotNull DBRProgressMonitor monitor,
                FileSystem externalFileSystem = FileSystems.newFileSystem(
    }
            return DBFPath.create(path);

        final Map<String, String> result = new LinkedHashMap<>();
        @NotNull URI uri
                        uri.getPath(),
            return project.getFileSystemManager().getPathFromString(monitor, pathOrUri);
    @Nullable
        }
import org.jkiss.code.NotNull;
     */
        }
                runnableContext.run(true, true, monitor -> {

     * @deprecated Use {@link #getDBFPathFromURI(String)} instead.
                    );
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        } else {
public class DBFUtils {
            conNameSuffix++;
import java.net.URI;
                    uri = new URI(
            } catch (Exception e) {
            registry.addDataSource(dsContainer);
            Path path = Path.of(fileUriString).toAbsolutePath();
            // default filesystem
import org.jkiss.dbeaver.model.DBPDataSourceContainer;

    }
            // Use provider's classloader because filesystem registered there as service
        if (SUPPORT_MULTI_FS == null) {
        connectionName = "File - " + CommonUtils.truncateString(connectionName, 64);
        dsContainer.setExtension(DBConstants.PROP_ORIGINAL_FILE_PATH, configuration.getDatabaseName());
        } else {
 * See the License for the specific language governing permissions and
                try {
            }
        return null;
import java.lang.reflect.InvocationTargetException;
                }
    public static final String PRODUCT_FEATURE_MULTI_FS = "multi-fs";
            .findAny();
        }
            try {
            }
        FileSystem defaultFs = FileSystems.getDefault();
            }
            Path path = Path.of(fileUriString).toAbsolutePath();
import org.jkiss.dbeaver.registry.fs.FileSystemProviderRegistry;
    }
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
        }
 * Copyright (C) 2010-2026 DBeaver Corp and others
        String connectionId = "file_database_" + CommonUtils.truncateString(CommonUtils.escapeIdentifier(configuration.getDatabaseName()),
        dsContainer.setFolder(folder);

                    try {

 * Unless required by applicable law or agreed to in writing, software
                        uri.getHost(),
 *     http://www.apache.org/licenses/LICENSE-2.0

package org.jkiss.dbeaver.model.fs;
    @NotNull
            }
    }
        return IOUtils.isLocalPath(path) ? path.toString() : DBFUtils.getUriFromPath(path).toString();
            var externalFsProvider =
            result.put(key, value);

 * Virtual file system utils
                        null
    ) {
        return result;
    }


        return uri;
        return dbfPath.path();
                        uri.getScheme(),
            Files.delete(from);
        int conNameSuffix = 1;
        dsContainer.setTemporary(true);
 * Licensed under the Apache License, Version 2.0 (the "License");
        @NotNull String pathOrUri
            return DBFPath.create(path);
        }
                        result[0] = project.getFileSystemManager().getPathFromString(monitor, pathOrUri);
            if (SUPPORT_MULTI_FS == null) {
        }
            try {
                }

     * Create temporary connection. Useful in case of flat files.
            try {

        @Nullable DBPProject project,
            return DBFPath.create(path);

    @Nullable
import java.net.URLDecoder;
        dsContainer.setDescription("Temporary file datasource for " + configuration.getDatabaseName());
                        uri.getScheme(),
import org.jkiss.dbeaver.model.DBConstants;
        }

import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;
    public static DBPDataSourceContainer createTemporaryDataSourceContainer(
    ) throws DBException {
                    fileUri,
            DBFFileSystemProvider fileSystemProvider = externalFsProvider.getInstance();
        if (!fileUri.isAbsolute() || fileUri.getScheme() == null) {
                log.debug("Error generating FS URI", e);
                } catch (URISyntaxException e) {
                throw new DBException("Canceled");
    public static Map<String, String> getQueryParameters(@Nullable String query) {
                    fsClassloader
            if (pathOrUri.startsWith("file:")) {
            return dataSourceContainerBox.get();
 *
        if (project != null) {
    ) throws DBException {
                Path path = externalFileSystem.provider().getPath(fileUri);
        DBPConnectionConfiguration configuration
                        DBFFileSystemManager.QUERY_PARAM_FS_ID + "=" + fileSystemId,
import java.util.*;
                return DBFPath.createExclusive(path);
        return fileSystemIdCache.get(fs);
        if (id == null) {
                    }
            fileSystemIdCache.remove(fs);
            }
        }
        if (query == null || query.isEmpty()) {
        }
            return Path.of(pathOrUri);

                dbpDataSourceContainer.getExtension(DBConstants.PROP_ORIGINAL_FILE_PATH)
        @NotNull DBRProgressMonitor monitor,
 *
    public static URI getUriFromPath(Path path) {
            .filter(dbpDataSourceContainer -> Objects.equals(
                if (!CommonUtils.isEmpty(uri.getAuthority())) {
        if (dbfPath == null) {
                        uri.getAuthority(),
    ) throws DBException {
        String connectionName,
    private static final Log log = Log.getLog(DBFUtils.class);
        } catch (DBException e) {

import java.nio.file.*;

        DBPProject project,
            } catch (InvocationTargetException e) {
        String finalConnectionName = connectionName;
                FileSystemProviderRegistry.getInstance().getFileSystemProviderBySchema(fileUri.getScheme());
                configuration.getDatabaseName(),
            return project.getFileSystemManager().getPathFromURI(monitor, uri);
    private static volatile Boolean SUPPORT_MULTI_FS = null;
        // IMPORTANT:
    /**
            Files.move(from, to, StandardCopyOption.REPLACE_EXISTING);

            return Path.of(pathOrUri);
    }
            Path path = defaultFs.provider().getPath(fileUri);
        DBPDataSourceContainer dsContainer = registry.createDataSource(connectionId, driver, configuration);
    @NotNull
            return null;
            SUPPORT_MULTI_FS = DBWorkbench.getPlatform().getApplication().hasProductFeature(PRODUCT_FEATURE_MULTI_FS);

                SUPPORT_MULTI_FS = false;
    private static final Map<FileSystem, String> fileSystemIdCache = new IdentityHashMap<>();
/*
}
 */
import java.nio.charset.StandardCharsets;
        if (project != null) {
            return Path.of(uri);
    @NotNull
        }
            Map<String, ?> env = fileSystemProvider.prepareEnv(System.getenv());
                log.error("Failed to initialize path: " + fileUri, e);
        } else {
                log.error("File system not found for scheme: " + fileUri.getScheme());
    private static final String FILE_DATABASES_FOLDER = "File databases";
        } else {
        // Its lifecycle is bound to the application runtime.
            finalConnectionName = connectionName + " " + conNameSuffix;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    public static boolean supportsMultiFileSystems(@NotNull DBPProject project) {
            final String value = idx > 0 && pair.length() > idx + 1 ? URLDecoder.decode(pair.substring(idx + 1), StandardCharsets.UTF_8) : null;
        final String[] pairs = query.split("&");
                        throw new InvocationTargetException(e);
            48) + "_" + UUID.randomUUID();
    public static String convertPathToString(@NotNull Path path) {
        if (IOUtils.isLocalFile(fileUriString)) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
        DBPDriver driver,
        Optional<? extends DBPDataSourceContainer> dataSourceContainerBox = registry.getDataSources().stream()
    }
 *
import org.jkiss.utils.IOUtils;
 * you may not use this file except in compliance with the License.
                return null;
        }
                throw new DBException("Error getting path", e.getTargetException());
            final String key = idx > 0 ? URLDecoder.decode(pair.substring(0, idx), StandardCharsets.UTF_8) : pair;
            log.debug("Datasource to :" + configuration.getDatabaseName() + " already exists");
        DBPDataSourceFolder folder = registry.getFolder(FILE_DATABASES_FOLDER);
import org.jkiss.dbeaver.DBException;
     */
    }
            if (externalFsProvider == null) {
        if (!IOUtils.isLocalFile(pathOrUri) && project != null && DBFUtils.supportsMultiFileSystems(project)) {
import org.jkiss.dbeaver.model.DBPDataSourceFolder;
        DBPDataSourceRegistry registry = project.getDataSourceRegistry();
    public static Path getPathFromURI(@NotNull String fileUriString) throws DBException {
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
            final int idx = pair.indexOf("=");
                        uri.getPath(),
    @Deprecated
        }
    public static void move(@NotNull Path from, @NotNull Path to) throws IOException {
 * limitations under the License.

    @NotNull
 * DBeaver - Universal Database Manager
        @Nullable DBPProject project,
            // external fs may not support move
    public static Path resolvePathFromURI(
                    uri = new URI(
        }
 * You may obtain a copy of the License at
 */
import java.io.IOException;
                    );
        if (defaultFs.provider().getScheme().equals(fileUri.getScheme())) {
                        DBFFileSystemManager.QUERY_PARAM_FS_ID + "=" + fileSystemId,
                } else {
            ))
        @NotNull String pathOrUri
import org.jkiss.dbeaver.Log;

    }
                return result[0];
    }

    }
/**
                    log.debug(e);
        // The underlying FileSystem is intentionally NOT closed here.
        if (IOUtils.isFileFromDefaultFS(to)) {
import org.jkiss.dbeaver.model.app.DBPProject;
    /**
                });
        }
    public static Path resolvePathFromString(
            fileSystemIdCache.put(fs, id);
            } catch (URISyntaxException e) {
                    return Path.of(new URI(pathOrUri));
    @Nullable

        }
        for (String pair : pairs) {
    public static String getFileSystemId(FileSystem fs) {
        return SUPPORT_MULTI_FS;
    }
        String fileSystemId = getFileSystemId(path.getFileSystem());
                );

        } else {
        @Nullable DBPProject project,
                        null
        URI fileUri = URI.create(fileUriString);
        dsContainer.setName(finalConnectionName);
        while (registry.findDataSourceByName(finalConnectionName) != null) {
                    env,
            }
