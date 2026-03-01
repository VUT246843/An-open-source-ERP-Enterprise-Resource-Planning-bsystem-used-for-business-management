 *     http://www.apache.org/licenses/LICENSE-2.0
    ) throws IOException, DBException {

        @NotNull DBRProgressMonitor monitor,
        this.updateScriptPrefix = updateScriptPrefix;
            List.of(
    @Override

/**
    @NotNull

        Reader reader = findScript(attemptedPaths.toArray(new String[0]));
import java.io.InputStreamReader;
        }
 * Copyright (C) 2010-2025 DBeaver Corp and others
        @Nullable String specificPrefix
/*
    private final ClassLoader classLoader;
 */
    @Nullable

import org.jkiss.code.NotNull;
import java.util.List;
    public Reader openSchemaUpdateScript(
    ) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 */
                updateScriptPrefix + versionNumber + "_" + specificPrefix + ".sql",

    }
import org.jkiss.code.Nullable;
        return reader;
                createScriptPath + "_" + specificPrefix + ".sql",
            if (resource != null) {
import org.jkiss.dbeaver.DBException;
        List<String> attemptedPaths = specificPrefix == null ?
                updateScriptPrefix + versionNumber + ".sql"

        @Nullable String specificPrefix
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.Log;
        int versionNumber,
    ) throws IOException, DBException {
            InputStream resource = classLoader.getResourceAsStream(path);
    private final String updateScriptPrefix;
        return null;
        if (reader == null) {
                log.debug("Reading script file: '" + path + "'");

 * DBeaver - Universal Database Manager
 * limitations under the License.
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
    @Nullable
    }
    }
public class ClassLoaderScriptSource implements SQLSchemaScriptSource {
    private final String createScriptPath;
 *
        @NotNull DBRProgressMonitor monitor,
        this.createScriptPath = createScriptPath;
}
    @Override

 *
package org.jkiss.dbeaver.model.sql.schema;
import java.io.InputStream;
        return findScript(attemptedPaths.toArray(new String[0]));
 * See the License for the specific language governing permissions and

 * Script source which reads scripts from class loader
            );
    public ClassLoaderScriptSource(ClassLoader classLoader, String createScriptPath, String updateScriptPrefix) {
        List<String> attemptedPaths = specificPrefix == null ?
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
            List.of(
            List.of(updateScriptPrefix + versionNumber + ".sql") :
import java.io.Reader;
 * you may not use this file except in compliance with the License.
        String... paths
            List.of(createScriptPath + ".sql") :
    }
    public Reader openSchemaCreateScript(
        this.classLoader = classLoader;
            throw new IOException("Create script not found. Searched paths: " + String.join(", ", attemptedPaths));
 *
import java.io.IOException;

    private static final Log log = Log.getLog(ClassLoaderScriptSource.class);

    public Reader findScript(
        for (String path : paths) {

            );
                createScriptPath + ".sql"
                return new InputStreamReader(resource);
