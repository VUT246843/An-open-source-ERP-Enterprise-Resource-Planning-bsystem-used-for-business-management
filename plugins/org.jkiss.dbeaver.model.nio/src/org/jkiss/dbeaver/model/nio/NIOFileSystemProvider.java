import java.util.Map;
        return null;
    protected void validateUri(URI uri) {
    }
 *
import java.nio.file.spi.FileSystemProvider;
    }
 * See the License for the specific language governing permissions and
 *

 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
}
            throw new IllegalArgumentException("Unsupported uri schema");
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.nio.file.Path;
    }
 * you may not use this file except in compliance with the License.
    @Override

import java.io.IOException;
package org.jkiss.dbeaver.model.nio;

 * Copyright (C) 2010-2024 DBeaver Corp and others

import java.nio.file.LinkOption;

    public Map<String, Object> readAttributes(Path path, String attributes, LinkOption... options) throws IOException {
 * limitations under the License.
import org.jkiss.utils.CommonUtils;
 */
 *
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
    public void setAttribute(Path path, String attribute, Object value, LinkOption... options) throws IOException {
        if (CommonUtils.isEmpty(uri.getScheme()) || !getScheme().equalsIgnoreCase(uri.getScheme())) {
public abstract class NIOFileSystemProvider extends FileSystemProvider {

 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
import java.net.URI;
