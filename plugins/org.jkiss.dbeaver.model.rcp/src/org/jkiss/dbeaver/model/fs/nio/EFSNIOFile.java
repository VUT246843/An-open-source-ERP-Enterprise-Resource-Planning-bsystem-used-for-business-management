        int updateFlags = force ? IResource.FORCE : IResource.NONE;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.resources.IFileState;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.model.fs.nio;
        }
    public String getCharset(boolean checkImplicit) throws CoreException {
            EFSNIOMonitor.notifyResourceChange(this, EFSNIOListener.Action.CHANGE);
    }

import org.eclipse.core.resources.IFile;
            return Files.newInputStream(getNioPath());
    public void setContents(InputStream source, boolean force, boolean keepHistory, IProgressMonitor monitor) throws CoreException {
 */
        create(source, (force ? IResource.FORCE : IResource.NONE), monitor);

        try {
        throw new FeatureNotSupportedException();
        } catch (Exception ex) {
    public void move(IPath destination, boolean force, boolean keepHistory, IProgressMonitor monitor) throws CoreException {
 * Unless required by applicable law or agreed to in writing, software
    public void setCharset(String newCharset, IProgressMonitor monitor) throws CoreException {
        return getContents();
        try {
        throw new FeatureNotSupportedException();
    }

}
    }
        int updateFlags = force ? IResource.FORCE : IResource.NONE;
 * limitations under the License.

        }
    public void setContents(IFileState source, int updateFlags, IProgressMonitor monitor) throws CoreException {
        delete(updateFlags, monitor);
    public IContentDescription getContentDescription() throws CoreException {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import org.eclipse.core.runtime.CoreException;

        setContents(source.getContents(), updateFlags, monitor);
 */
import org.eclipse.core.resources.IResource;
        return new IFileState[0];

            throw new CoreException(GeneralUtils.makeExceptionStatus(ex)); //$NON-NLS-1$
    }
    }
public final class EFSNIOFile extends EFSNIOResource implements IFile {

        int updateFlags = force ? IResource.FORCE : IResource.NONE;
    public void delete(boolean force, boolean keepHistory, IProgressMonitor monitor) throws CoreException {
    public void create(InputStream source, int updateFlags, IProgressMonitor monitor) throws CoreException {
            Files.copy(source, getNioPath(), StandardCopyOption.REPLACE_EXISTING);
import java.io.InputStream;

        return getCharset();
        } catch (Exception e) {

 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    }
    }
    public void setCharset(String newCharset) throws CoreException {

    }
    public void setContents(InputStream source, int updateFlags, IProgressMonitor monitor) throws CoreException {
    }
    }
    }
        return null;


            throw new CoreException(GeneralUtils.makeExceptionStatus(e));
import org.eclipse.core.runtime.IPath;
 * See the License for the specific language governing permissions and
        super(root, backendFile);

/**
import java.nio.file.Files;
    }
    }
    }

    public void appendContents(InputStream source, int updateFlags, IProgressMonitor monitor) throws CoreException {
    public int getEncoding() throws CoreException {

        try {
 *     http://www.apache.org/licenses/LICENSE-2.0
        updateFlags |= keepHistory ? IResource.KEEP_HISTORY : IResource.NONE;
    @Deprecated
        } catch (Exception e) {
        // funnel all operations to central method
/*
    public InputStream getContents(boolean force) throws CoreException {
        throw new FeatureNotSupportedException();

    public IFileState[] getHistory(IProgressMonitor monitor) throws CoreException {
    }
    }
    }
        setContents(source, updateFlags, monitor);
    }
    public String getCharsetFor(Reader reader) throws CoreException {
    public void createLink(URI location, int updateFlags, IProgressMonitor monitor) throws CoreException {
    public String getCharset() throws CoreException {
import java.nio.file.Path;

 *
        // funnel all operations to central method
    }

 * NIOFile
 * Licensed under the Apache License, Version 2.0 (the "License");
            throw new CoreException(GeneralUtils.makeExceptionStatus(e));

        updateFlags |= keepHistory ? IResource.KEEP_HISTORY : IResource.NONE;
    }

    public InputStream getContents() throws CoreException {

            Files.copy(source, getNioPath(), StandardCopyOption.REPLACE_EXISTING);
        return getCharset();

        throw new FeatureNotSupportedException();
        throw new FeatureNotSupportedException();
        }
    }
            EFSNIOMonitor.notifyResourceChange(this, EFSNIOListener.Action.CREATE);
 *
import java.net.URI;
import java.io.Reader;
        return "UTF-8"; //$NON-NLS-1$
        updateFlags |= keepHistory ? IResource.KEEP_HISTORY : IResource.NONE;
        throw new FeatureNotSupportedException();
 *

 * DBeaver - Universal Database Manager

    public int getType() {
import org.eclipse.core.runtime.content.IContentDescription;
    public void appendContents(InputStream source, boolean force, boolean keepHistory, IProgressMonitor monitor) throws CoreException {

import java.nio.file.StandardCopyOption;
    public void setContents(IFileState source, boolean force, boolean keepHistory, IProgressMonitor monitor) throws CoreException {
        // TODO
 * you may not use this file except in compliance with the License.
        setContents(source, updateFlags, monitor);
    @Deprecated
        throw new FeatureNotSupportedException();
import org.jkiss.dbeaver.utils.GeneralUtils;
    public EFSNIOFile(EFSNIOFileSystemRoot root, Path backendFile) {
    public void createLink(IPath localLocation, int updateFlags, IProgressMonitor monitor) throws CoreException {

    }
        return FILE;
    }
    public void create(InputStream source, boolean force, IProgressMonitor monitor) throws CoreException {

        throw new UnsupportedOperationException();
