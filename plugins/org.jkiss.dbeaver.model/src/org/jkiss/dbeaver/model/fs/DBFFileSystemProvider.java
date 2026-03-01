    DBFVirtualFileSystem[] getAvailableFileSystems(
 * Virtual file system provider
package org.jkiss.dbeaver.model.fs;
 */

        @NotNull DBRProgressMonitor monitor,

}
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.DBPObject;
import java.nio.file.Path;

import org.jkiss.code.NotNull;
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
    Path getPathByURI(@NotNull DBRProgressMonitor monitor, @NotNull URI uri, @NotNull DBFVirtualFileSystem[] fileSystems) throws DBException;
    }
public interface DBFFileSystemProvider extends DBPObject {
    ) throws DBException;
    @NotNull
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.Map;
/**


 * DBeaver - Universal Database Manager
 *
import org.jkiss.dbeaver.DBException;
 *
/*
 * Copyright (C) 2010-2025 DBeaver Corp and others
 */
 * You may obtain a copy of the License at
        return env;
import org.jkiss.dbeaver.model.app.DBPProject;


        @NotNull DBPProject project
    default Map<String, ?> prepareEnv(@NotNull Map<String, ?> env) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
import java.net.URI;
 *
