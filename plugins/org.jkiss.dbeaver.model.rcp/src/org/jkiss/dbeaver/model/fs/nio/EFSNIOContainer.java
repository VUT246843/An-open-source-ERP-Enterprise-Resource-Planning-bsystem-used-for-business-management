        if (!super.visit(visitor, depth)) {
        return members.toArray(new IResource[0]);

        throw new FeatureNotSupportedException();
            throw new CoreException(GeneralUtils.makeExceptionStatus(e));
        if (depth < 1) {

    public int getType() {
        return null;
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
        }

        throw new FeatureNotSupportedException();
import java.util.List;
    public void setDefaultCharset(String charset, IProgressMonitor monitor) throws CoreException {
        try {
import org.eclipse.core.runtime.CoreException;

    }
    }
                if (!Files.isDirectory(it)) {
            return false;

    public String getDefaultCharset() {
            return false;
            ((EFSNIOResource) member).visit(visitor, depth);
    public IResource findMember(String path) {
        return new EFSNIOFile(getRoot(), childBackendFile);

 * See the License for the specific language governing permissions and
    }
            return this;
            for (Path it = member; it != getNioPath(); it = it.getParent()) {
    @Deprecated
    }
    public IResource findMember(String path, boolean includePhantoms) {
            for (Path it : backendResources) {
        return findMember(path);

import org.eclipse.core.runtime.IPath;
    protected boolean visit(IResourceVisitor visitor, int depth) throws CoreException {
                        members.add(new EFSNIOFile(getRoot(), member));

        return getDefaultCharset();
        return "UTF-8"; //$NON-NLS-1$

}
    }
 *
import java.nio.file.Path;

    }
        } catch (Exception e) {
 */


    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    }
        }

        return 0;
        throw new FeatureNotSupportedException();
        Path childBackendFolder = getNioPath().resolve(path.toString());
        return new EFSNIOFolder(getRoot(), childBackendFolder);
    @Override
            }

 */
        {
            }
        }
    public void setDefaultCharset(String charset) throws CoreException {
        return new IResourceFilterDescription[0];

 * You may obtain a copy of the License at
    }
    }
    public String getDefaultCharset(boolean checkImplicit) {
    }
    }

    public IResource[] members() throws CoreException {
import org.jkiss.dbeaver.utils.GeneralUtils;
    }
        }
        Path childBackendFile = getNioPath().resolve(path.toString());
import org.eclipse.core.runtime.IProgressMonitor;
            }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public IResource findMember(IPath path, boolean includePhantoms) {
        throws CoreException {
        return findMember(new org.eclipse.core.runtime.Path(path));
        return members();
        List<IResource> members = new ArrayList<>();
        IResource member = findMember(path);
    }
        return findMember(path);
                    }

    public IFile getFile(IPath path) {
                });
                    } else {
 * Licensed under the Apache License, Version 2.0 (the "License");
        return true;
        Path member = getNioPath().resolve(path.toString());
        return members();
        --depth;
    }


        }
    public IResource[] members(int memberFlags) throws CoreException {
    public boolean exists(IPath path) {
import org.eclipse.core.resources.*;
    }
        }
    public IResourceFilterDescription[] getFilters() {
        return member.exists();
 *

    public IFile[] findDeletedMembersWithHistory(int depth, IProgressMonitor monitor) {
 * DBeaver - Universal Database Manager
    protected EFSNIOContainer(EFSNIOFileSystemRoot root, Path path) {
/**
    }
public abstract class EFSNIOContainer extends EFSNIOResource implements IContainer {

    public IFolder getFolder(IPath path) {
    public IResourceFilterDescription createFilter(int type, FileInfoMatcherDescription matcherDescription, int updateFlags, IProgressMonitor monitor)
        return new IFile[0];

                backendResources.addFirst(it);
                }
    }
 * NIOContainer
import java.util.stream.Stream;
        if (path.isEmpty()) {


        for (IResource member : members()) {

            try (Stream<Path> files = Files.list(getNioPath())) {

    }

                    if (Files.isDirectory(member)) {


 * you may not use this file except in compliance with the License.
    public IResource findMember(IPath path) {
    public IResource[] members(boolean includePhantoms) throws CoreException {
 * distributed under the License is distributed on an "AS IS" BASIS,
                    return new EFSNIOFile(getRoot(), it);
        super(root, path);

 *
                        members.add(new EFSNIOFolder(getRoot(), member));
import java.util.LinkedList;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                files.forEach(member -> {
package org.jkiss.dbeaver.model.fs.nio;
/*
import java.nio.file.Files;
            LinkedList<Path> backendResources = new LinkedList<>();
import java.util.ArrayList;

