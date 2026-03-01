public final class DBFPath implements AutoCloseable {
        return new DBFPath(path, true);
import org.jkiss.code.NotNull;
    @Override
    }
 *
    public static DBFPath create(@NotNull Path path) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    public void close() throws IOException {
} * Copyright (C) 2010-2026 DBeaver Corp and others
        this.ownsFileSystem = ownsFileSystem;

 *

    }
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
    public static DBFPath createExclusive(@NotNull Path path) {
    private final boolean ownsFileSystem;
        return path;
import java.nio.file.Path;
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (ownsFileSystem) {
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
    public Path path() {
    public String toString() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            path.getFileSystem().close();

 */

import java.io.IOException;
    }
        this.path = path;
 *

 * limitations under the License.



        return path.toString();
    }
    private final Path path;
        return new DBFPath(path, false);


package org.jkiss.dbeaver.model.fs;
 * You may obtain a copy of the License at
/*
    @Override
    }
    private DBFPath(Path path, boolean ownsFileSystem) {
    }
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software

