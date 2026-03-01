


import java.nio.file.Path;
    @Override
                    "Cannot delete directory '" + getNioPath() + "': it is not empty", e));
                Path fileForEmulation = Files.createFile(getNioPath().resolve(FOLDER_EMULATION_FILE_NAME));
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.resources.IFile;
            }
    public void createLink(URI location, int updateFlags, IProgressMonitor monitor) throws CoreException {
            } else {
/**
    public void move(IPath destination, boolean force, boolean keepHistory, IProgressMonitor monitor) throws CoreException {
    public IFolder getFolder(String name) {
import org.eclipse.core.runtime.IPath;
        }
                throw new CoreException(GeneralUtils.makeExceptionStatus(
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public IFile getFile(String name) {
 * NIOFolder
        throw new FeatureNotSupportedException();
                // This is the workaround for file systems where folders are emulated,
    }
import org.eclipse.core.resources.IResource;
        try {

import org.eclipse.core.resources.IFolder;
                // and it's not possible to delete a folder or create an empty folder
            EFSNIOMonitor.notifyResourceChange(this, EFSNIOListener.Action.CREATE);
            if (e instanceof DirectoryNotEmptyException) {

package org.jkiss.dbeaver.model.fs.nio;
            if (getRoot().getRoot().getFileSystem().supportsEmptyFolders()) {
import java.net.URI;
 */
    }

                Files.write(fileForEmulation, FOLDER_EMULATION_FILE_CONTENT);
 *
import org.eclipse.core.runtime.CoreException;
 * Copyright (C) 2010-2024 DBeaver Corp and others
            }

    public void create(boolean force, boolean local, IProgressMonitor monitor) throws CoreException {
                for (IResource resource : members()) {
        create(force ? IResource.FORCE : IResource.NONE, local, monitor);

        }
import java.nio.file.DirectoryNotEmptyException;
        throw new FeatureNotSupportedException();
        try {
    }
    private final String FOLDER_EMULATION_FILE_NAME = ".dbeaver-placeholder";
import java.nio.charset.StandardCharsets;
 */
import java.nio.file.Files;
 * You may obtain a copy of the License at
        .getBytes(StandardCharsets.UTF_8);

import org.jkiss.dbeaver.utils.GeneralUtils;
    public void createLink(IPath localLocation, int updateFlags, IProgressMonitor monitor) throws CoreException {
    public void delete(boolean force, boolean keepHistory, IProgressMonitor monitor) throws CoreException {
                Files.createDirectory(getNioPath());
        super(root, backendFolder);
            throw new CoreException(GeneralUtils.makeExceptionStatus(e));
            throw new CoreException(GeneralUtils.makeExceptionStatus(e));
 * distributed under the License is distributed on an "AS IS" BASIS,
    public int getType() {
import java.io.IOException;
        throw new FeatureNotSupportedException();
    private final byte[] FOLDER_EMULATION_FILE_CONTENT =
    public void create(int updateFlags, boolean local, IProgressMonitor monitor) throws CoreException {
 * you may not use this file except in compliance with the License.
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
        } catch (IOException e) {
public final class EFSNIOFolder extends EFSNIOContainer implements IFolder {
        return getFolder(new org.eclipse.core.runtime.Path(name));
                Files.delete(getNioPath());
        "This file is created by DBeaver to guarantee support of folders instantiation and deletion."
            if (getRoot().getRoot().getFileSystem().supportsEmptyFolders()) {
                }
                    resource.delete(force, monitor);
/*
    }
            } else {
 *
 *
            EFSNIOMonitor.notifyResourceChange(this, EFSNIOListener.Action.DELETE);
 * DBeaver - Universal Database Manager
    }
    }
    }
 * Licensed under the Apache License, Version 2.0 (the "License");


}
        return FOLDER;


            }
    }
 * Unless required by applicable law or agreed to in writing, software
    }
        return getFile(new org.eclipse.core.runtime.Path(name));
        } catch (Exception e) {
 * limitations under the License.
                // We can't delete pseudo-folder, so this is a workaround

    public EFSNIOFolder(EFSNIOFileSystemRoot root, Path backendFolder) {
