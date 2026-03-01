 * you may not use this file except in compliance with the License.

import org.eclipse.core.resources.IStorage;

    }
}            throw new CoreException(GeneralUtils.makeExceptionStatus(e));
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
 * LocalFileStorage
        } catch (IOException e) {
 * See the License for the specific language governing permissions and
    public void setContents(IProgressMonitor monitor, InputStream stream) throws CoreException {
    }
import org.eclipse.core.resources.IEncodedStorage;
    @Override
            ContentUtils.copyStreams(stream, 0, os, RuntimeUtils.makeMonitor(monitor));
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public boolean isReadOnly() {
    public LocalFileStorage(File file, String charset) {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.core.runtime.IProgressMonitor;
    public String getCharset() throws CoreException {
public class LocalFileStorage implements IStorage, IPersistentStorage, IEncodedStorage {

    private final String charset;
 * DBeaver - Universal Database Manager
        this.file = file;
    @Override
        try (OutputStream os = new FileOutputStream(file)) {
import org.jkiss.dbeaver.utils.ContentUtils;
import org.jkiss.dbeaver.utils.RuntimeUtils;
 */
        this.charset = charset;
        return file.getName();

 *
        return null;
        return new Path(file.getAbsolutePath());
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
 *
        return !file.canWrite();
 * You may obtain a copy of the License at
    }
    @Override
 */
    }
        } catch (FileNotFoundException e) {
    }
 *

    public IPath getFullPath() {

import org.jkiss.dbeaver.utils.GeneralUtils;

/**

/*
    }
    @Override
    @Override
    public <T> T getAdapter(Class<T> adapter) {

    public InputStream getContents() throws CoreException {
import org.eclipse.core.runtime.Path;
    }
        try {
 * Unless required by applicable law or agreed to in writing, software
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return charset;
package org.jkiss.dbeaver.runtime;
        }
    public String getName() {
            throw new CoreException(GeneralUtils.makeExceptionStatus(e));
        }
 * limitations under the License.


    private final File file;

    @Override

import java.io.*;
            return new FileInputStream(file);
