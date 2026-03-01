    @Override
 * NIOFileStore
        return path.getFileName().toString();
            throw new CoreException(GeneralUtils.makeExceptionStatus(e));
    public IFileStore getChild(String name) {
        return null;
import org.eclipse.core.runtime.IProgressMonitor;
 *
    }
    public IFileInfo fetchInfo(int options, IProgressMonitor monitor) throws CoreException {
    @Override
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software

    private final Path path;
import java.net.URI;
        return dbvfsURI;
    }
}
        return new EFSNIOFileInfo(path);
 * you may not use this file except in compliance with the License.

    private final URI dbvfsURI;
import java.io.OutputStream;
import org.eclipse.core.runtime.CoreException;
import java.nio.file.Files;

        } catch (Exception e) {
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override

    public IFileStore getParent() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public Path getPath() {
            throw new CoreException(GeneralUtils.makeExceptionStatus(e));
        try {

import java.nio.file.Path;
import org.eclipse.core.filesystem.IFileInfo;
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.dbvfsURI = dbvfsURI;
        try {
import org.eclipse.core.filesystem.provider.FileStore;

        this.path = path;

        } catch (Exception e) {
            return Files.newInputStream(path);
    }
 */
    public String[] childNames(int options, IProgressMonitor monitor) throws CoreException {

    public OutputStream openOutputStream(int options, IProgressMonitor monitor) throws CoreException {
        return null;
    public URI toURI() {

    @Override
    }
        return new String[0];
    public EFSNIOFileStore(URI dbvfsURI, Path path) {
    public InputStream openInputStream(int options, IProgressMonitor monitor) throws CoreException {
    }
 *
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
import org.jkiss.dbeaver.utils.GeneralUtils;
import org.eclipse.core.filesystem.IFileStore;
public class EFSNIOFileStore extends FileStore {
 * You may obtain a copy of the License at
    }
    }
import java.io.InputStream;
/**
    public String getName() {
 * distributed under the License is distributed on an "AS IS" BASIS,
        }

package org.jkiss.dbeaver.model.fs.nio;
 * DBeaver - Universal Database Manager
    }

 */


    @Override
 *

        return path;

            return Files.newOutputStream(path);
        }
    @Override
    }
    @Override
 * See the License for the specific language governing permissions and
