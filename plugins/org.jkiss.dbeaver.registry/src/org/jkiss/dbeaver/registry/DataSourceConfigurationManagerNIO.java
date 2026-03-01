            }
    public boolean isSecure() {
        if (Files.notExists(path)) {
import java.io.IOException;
 * you may not use this file except in compliance with the License.
 * limitations under the License.
        return storages;
            path = project.getAbsolutePath().resolve(name);
import org.jkiss.dbeaver.model.app.DBPProject;
                        modernFormat = true;

                        storages.add(new DataSourceFileStorage(res, false, fileName.equals(DataSourceRegistry.MODERN_CONFIG_FILE_NAME)));

 * Copyright (C) 2010-2024 DBeaver Corp and others
        boolean modernFormat = false;
    }

        List<DBPDataSourceConfigurationStorage> storages = new ArrayList<>();
 * Configuration files manager on FS

            }
        Path metadataFolder = project.getMetadataFolder(false);
    }
/*
                    .toList();
        }
import java.nio.file.Path;
    }
    @Override
                    List<Path> mdFiles = list
                        if (fileName.startsWith(DBPDataSourceRegistry.LEGACY_CONFIG_FILE_PREFIX) && fileName.endsWith(DBPDataSourceRegistry.LEGACY_CONFIG_FILE_EXT)) {
        if (Files.exists(metadataFolder)) {
                    // Legacy way (search config.xml in project folder)
 * DBeaver - Universal Database Manager
            } catch (IOException e) {
    }
 * You may obtain a copy of the License at
                } catch (IOException e) {
                    log.debug("Error deleting file " + configFile.toAbsolutePath(), e);
package org.jkiss.dbeaver.registry;
import java.io.InputStream;
import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;
    private static final Log log = Log.getLog(DataSourceConfigurationManagerNIO.class);
        return project.getMetadataFolder(create);
                        String fileName = res.getFileName().toString();

        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.Nullable;
public class DataSourceConfigurationManagerNIO implements DataSourceConfigurationManager {
                        .toList();
                try {
    public void writeConfiguration(@NotNull String name, @Nullable byte[] data) throws IOException {
                    if (fileName.startsWith(DataSourceRegistry.MODERN_CONFIG_FILE_PREFIX) &&
    @Override

 * Unless required by applicable law or agreed to in writing, software

    public InputStream readConfiguration(@NotNull String name, Collection<String> dataSourceIds) throws IOException {
import java.util.stream.Stream;
        }
    public List<DBPDataSourceConfigurationStorage> getConfigurationStorages() {
        if (storages.isEmpty()) {
 * See the License for the specific language governing permissions and

import org.jkiss.dbeaver.utils.ContentUtils;
import java.util.Collection;
import org.jkiss.dbeaver.Log;
                    {
                try (Stream<Path> list = Files.list(project.getAbsolutePath())) {
 *
            if (Files.exists(configFile)) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
                            storages.add(new DataSourceFileStorage(res, true, fileName.equals(DataSourceRegistry.LEGACY_CONFIG_FILE_NAME)));
        if (!modernFormat) {
                    Files.delete(configFile);
                List<Path> mdFiles = list
                log.error("Error during project files read", e);
        }
            }
import org.jkiss.dbeaver.model.DBPDataSourceConfigurationStorage;
    public DataSourceConfigurationManagerNIO(@NotNull DBPProject project) {
    }
 */
                        }
        }
    public boolean isReadOnly() {
            // maybe it's .dbeaver-data-sources*.xml in the project folder (DBeaver < 6.1.3 (Legacy))
        return Files.newInputStream(path);
import java.nio.file.Files;
        return false;
        Path configFile = getConfigurationPath(true).resolve(name);
        }

                for (Path res : mdFiles) {
                    }
        this.project = project;
    }

 *
 *
                    for (Path res : mdFiles) {
                    .filter(path -> !Files.isDirectory(path) && Files.exists(path))
 */

            if (Files.exists(project.getAbsolutePath())) {
        } else {
                    log.error("Error during legacy project files read", e);
        ContentUtils.makeFileBackup(configFile);
                    metadataFolder.resolve(DataSourceRegistry.MODERN_CONFIG_FILE_NAME), false, true));

                new DataSourceFileStorage(
    private Path getConfigurationPath(boolean create) {
                }
            Files.write(configFile, data);
import java.util.List;
    @Override
            return null;
    }
                        fileName.endsWith(DataSourceRegistry.MODERN_CONFIG_FILE_EXT))
            storages.add(
        if (Files.notExists(path)) {
                } catch (IOException e) {
                }
            try (Stream<Path> list = Files.list(metadataFolder)) {
                }
        if (data == null || data.length == 0) {
import org.jkiss.code.NotNull;
        return false;
                        .filter(path -> !Files.isDirectory(path) && Files.exists(path))
                    }
/**
}
 * distributed under the License is distributed on an "AS IS" BASIS,
        Path path = getConfigurationPath(false).resolve(name);
                    String fileName = res.getFileName().toString();

    private final DBPProject project;
import java.util.ArrayList;
    @NotNull
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
