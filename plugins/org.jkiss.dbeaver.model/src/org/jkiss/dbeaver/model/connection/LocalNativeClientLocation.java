    }
    public File getPath() {

/**
package org.jkiss.dbeaver.model.connection;
    public String getName() {

    @Override
    }
        return true;
 * LocalNativeClientLocation
    }
    @Override

    }
    public String toString() {
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
    private final String displayName;
        }
    }
        this.id = id;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public int hashCode() {


    @NotNull


        return "Local: " + path.getAbsolutePath();
 * See the License for the specific language governing permissions and
    }
    private final String id;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 */
    @NotNull
public class LocalNativeClientLocation implements DBPNativeClientLocation {
    private LocalNativeClientLocation(String id, @NotNull File path) {

        if (obj instanceof DBPNativeClientLocation otherNativeClientLocation) {
 *
    @Override
        File path = getPath();
    }
import org.jkiss.code.NotNull;

    private final File path;
 * limitations under the License.
    @Override
        this.path = path;
        this(id, path, path.getAbsolutePath());
    @Override
        return false;
    public String getDisplayName() {
import java.io.File;
 * you may not use this file except in compliance with the License.
 *
 */
    public boolean equals(Object obj) {

        return path;

    public LocalNativeClientLocation(String id, String path) {
/*
    }
    public boolean validateFilesPresence(@NotNull DBRProgressMonitor progressMonitor) {
 *

    public LocalNativeClientLocation(String id, File path, String displayName) {
}

        return displayName;
        return id;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        return path.hashCode();
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
        this(id, new File(path != null ? path : id));
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
        this(id, new File(path != null ? path : id), displayName);
    }
    }
    @Override
    @NotNull
    public LocalNativeClientLocation(String id, String path, String displayName) {
 * You may obtain a copy of the License at
        this.displayName = displayName;
            return this.path.equals(otherNativeClientLocation.getPath());
