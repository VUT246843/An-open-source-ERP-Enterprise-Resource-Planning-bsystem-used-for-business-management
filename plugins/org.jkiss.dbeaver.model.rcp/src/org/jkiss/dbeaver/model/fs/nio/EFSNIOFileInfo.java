
            return Files.getLastModifiedTime(path).toMillis();
/*
        }
        } catch (Exception e) {
/**
        super(EFSNIOResource.getPathFileNameOrHost(path));
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
        try {

import java.nio.file.Path;

    public EFSNIOFileInfo(Path path) {
        } catch (Exception e) {
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.nio.file.Files;
import org.eclipse.core.filesystem.provider.FileInfo;
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others

    }
    @Override
 * DBeaver - Universal Database Manager
    }
 * You may obtain a copy of the License at
        this.path = path;

    public long getLength() {
    }
    @Override
            return Files.size(path);
    }
    public boolean exists() {

    @Override
 *
    }
            return 0;
    public boolean isDirectory() {
 *
 * limitations under the License.
public class EFSNIOFileInfo extends FileInfo {
 * See the License for the specific language governing permissions and
    @Override
    public long getLastModified() {
        return Files.isDirectory(path);
package org.jkiss.dbeaver.model.fs.nio;
}

            return 0;
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        try {
 * NIOFileInfo
        return true;

    private final Path path;
 * Unless required by applicable law or agreed to in writing, software
 */
