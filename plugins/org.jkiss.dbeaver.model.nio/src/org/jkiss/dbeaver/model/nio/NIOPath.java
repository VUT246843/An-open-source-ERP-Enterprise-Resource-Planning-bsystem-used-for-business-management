
    @Override
        return CommonUtils.isEmpty(path)  // root project path
        IOException {
import org.jkiss.utils.CommonUtils;
        throw new UnsupportedOperationException();
import java.nio.file.*;
            path = path.substring(0, path.length() - separator.length());
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    @Override

        throw new UnsupportedOperationException();
 * You may obtain a copy of the License at

    }
}

 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
        if (getClass() != other.getClass()) {
            return false;
            return false;
        return CommonUtils.isEmpty(path) ? new String[0] : Arrays.stream(path.split(getFileSystem().getSeparator()))
        this.path = path;
    public WatchKey register(@NotNull WatchService watcher, @NotNull WatchEvent.Kind<?>[] events, WatchEvent.Modifier... modifiers) throws
        return toString().startsWith(other.toString());
    }
        if (getClass() != other.getClass()) {


 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
    protected final FileSystem fileSystem;
        return toUri().toString();
/*
    public File toFile() {
            || path.charAt(0) == '/';
    }
    public boolean isAbsolute() {

            .toArray(String[]::new);
        return toString().endsWith(other.toUri().getPath());
    protected String resolveString(String otherPath) {
    }
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
package org.jkiss.dbeaver.model.nio;
    }
    @Override
    public Path relativize(@NotNull Path other) {

    @Override
 *
 * See the License for the specific language governing permissions and

    }
        return toString().compareTo(other.toString());
 * DBeaver - Universal Database Manager
 * limitations under the License.
    @NotNull

        }
        }
import org.jkiss.code.NotNull;

import java.util.Arrays;

    }
    }
 *
    protected NIOPath(@Nullable String path, FileSystem fileSystem) {
    public boolean startsWith(@NotNull Path other) {

        if (CommonUtils.isNotEmpty(path) && path.endsWith(separator)) {
public abstract class NIOPath implements Path {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    protected final String path;
import org.jkiss.code.Nullable;
            .filter(CommonUtils::isNotEmpty)
    public boolean endsWith(@NotNull Path other) {

 *
    public String toString() {
        throw new UnsupportedOperationException();
        var separator = fileSystem.getSeparator();
    @Override
    @Nullable
import java.io.IOException;
    public int compareTo(@NotNull Path other) {
 * Unless required by applicable law or agreed to in writing, software
        this.fileSystem = fileSystem;
    @Override
        }
import java.io.File;
 * you may not use this file except in compliance with the License.
    }
    protected String[] pathParts() {
        return NIOUtils.resolve(getFileSystem().getSeparator(), path, otherPath);
