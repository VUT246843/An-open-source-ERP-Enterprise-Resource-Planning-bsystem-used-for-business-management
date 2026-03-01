
}
import org.jkiss.dbeaver.model.DBIcon;
        public static FileType getFileTypeByFileName(String fileName) {
import java.util.Collection;
    @NotNull
        license;
    boolean isDisabled();
    boolean isSecureDownload(@NotNull DBRProgressMonitor monitor);
    void downloadLibraryFile(@NotNull DBRProgressMonitor monitor, boolean forceUpdate, String taskName)
     */



    @NotNull
 * Unless required by applicable law or agreed to in writing, software
    boolean matchesCurrentPlatform();
 * See the License for the specific language governing permissions and
    String getVersion();
    Collection<String> getAvailableVersions(@NotNull DBRProgressMonitor monitor) throws IOException;
    boolean isInvalidLibrary();
    @NotNull

     * Library native id.
 * Driver library
    /**
     * Driver file type

 * DBeaver - Universal Database Manager

 *
/*
    enum FileType {
     * Flag that show if library is provided with an application.
    @Nullable
 *     http://www.apache.org/licenses/LICENSE-2.0
    @NotNull
        jar,
 */
public interface DBPDriverLibrary {
        }
    @Nullable
    /**
     * Returns CRC of library file.
     */

    boolean isDownloadable();


     * Id doesn't include version information so the same libraries with different versions have the same id.
 *
    /**
import org.jkiss.code.Nullable;
        executable,
import java.io.IOException;
    String getId();
    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


/**

 */
        lib,


     */
    DBIcon getIcon();
    String getExternalURL(DBRProgressMonitor monitor);

    @Nullable

    boolean isEmbedded();
    @Nullable
    String getDescription();
    @Nullable
    Path getLocalFile();


 * Copyright (C) 2010-2025 DBeaver Corp and others
 * limitations under the License.
    /**


 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    boolean isCustom();
 * distributed under the License is distributed on an "AS IS" BASIS,
     */
    String getPreferredVersion();
    void setDisabled(boolean disabled);
    /**
     */

    Collection<? extends DBPDriverLibrary> getDependencies(@NotNull DBRProgressMonitor monitor) throws IOException;
    FileType getType();
    long getFileCRC();

     * Native library URI.

import org.jkiss.code.NotNull;
    boolean isOptional();
    @NotNull

    String getDisplayName();
            return fileName.endsWith(".jar") || fileName.endsWith(".zip") ? DBPDriverLibrary.FileType.jar : DBPDriverLibrary.FileType.lib;
     * Could be a file path or maven artifact references or anything else.
     * Library version. If library doesn't support versions returns null.

package org.jkiss.dbeaver.model.connection;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");


    }
     */
    String getPath();
import java.nio.file.Path;
    /**
 * you may not use this file except in compliance with the License.
        throws IOException, InterruptedException;

