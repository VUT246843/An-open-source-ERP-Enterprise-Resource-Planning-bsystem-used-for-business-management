 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    String getLoaderId();
    ClassLoader getClassLoader();

     * Indicates whether the driver library files are installed.

}

 */
    @NotNull
     * Flag that shows if a driver needs external dependencies (f.e. not all files are present).
import org.jkiss.dbeaver.DBException;
    List<Path> validateFilesPresence(@NotNull DBRProgressMonitor monitor);
 * Each driver may have several loaders.
    @NotNull
import org.jkiss.code.Nullable;
 * distributed under the License is distributed on an "AS IS" BASIS,

 */
 * Unless required by applicable law or agreed to in writing, software
    /**

/**
    boolean isDriverInstalled();
 * Copyright (C) 2010-2025 DBeaver Corp and others


    @Nullable
    void loadDriver(@NotNull DBRProgressMonitor monitor) throws DBException;
 * See the License for the specific language governing permissions and
/*


public interface DBPDriverLoader {
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.nio.file.Path;
     */
import org.jkiss.code.NotNull;
     * Validates driver library files presence and download them if needed without creating a driver instance

    boolean needsExternalDependencies();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *
    boolean downloadDriverLibraries(@NotNull DBRProgressMonitor monitor, boolean resetVersions);

 *
import java.util.List;
     */
 * DBeaver - Universal Database Manager
 * Additional loaders may be created for specific auth model or connection configuration.
 * Driver loader. Contains class loader which loads all necessary dependencies.
 *     http://www.apache.org/licenses/LICENSE-2.0
     */
    List<DBPDriverLibraryProvider> getLibraryProviders();
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.

    @NotNull
    @NotNull
package org.jkiss.dbeaver.model.connection;

 * limitations under the License.
     */
 * Primary loader is a singleton and the default.

    /**
 *
    /**
    <T> T getDriverInstance(@NotNull DBRProgressMonitor monitor) throws DBException;
    boolean resolveDriverFiles(@NotNull Path targetFileLocation);

     * Downloads driver library files from external resources if it is possible.
    /**
