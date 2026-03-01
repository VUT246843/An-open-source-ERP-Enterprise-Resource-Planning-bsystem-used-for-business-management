        return new org.eclipse.core.runtime.Path(getLocationURI().toString());
 * Unless required by applicable law or agreed to in writing, software
            } else {
        }

        }
    }
        move(destination, IResource.FORCE, monitor);
    public Map<QualifiedName, Object> getSessionProperties() {
            return getProject();
 * See the License for the specific language governing permissions and
        throw new FeatureNotSupportedException();
        return root;

        } catch (Exception e) {
        return URI.create(
    public long getLocalTimeStamp() {
    public IPath getLocation() {
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    protected EFSNIOResource(EFSNIOFileSystemRoot root, Path nioPath) {
    }
    public void copy(IProjectDescription description, int updateFlags, IProgressMonitor monitor) throws CoreException {

    }
    }

        return null;
    public void setTeamPrivateMember(boolean isTeamPrivate) throws CoreException {
    }
    }
            if (targetFile != null) {

 * limitations under the License.

        if (CommonUtils.equalObjects(nioPath.toUri(), parentPath.toUri())) {

import java.io.IOException;




    }
    public void refreshLocal(int depth, IProgressMonitor monitor) throws CoreException {
                    virtName = uriPath;
    public void setHidden(boolean isHidden) throws CoreException {
    public void setResourceAttributes(ResourceAttributes attributes) throws CoreException {
        return Collections.emptyMap();
    public IPath getFullPath() {


        return root.getProject();
        throw new FeatureNotSupportedException();
        return new org.eclipse.core.runtime.Path(nioPath.toUri().getSchemeSpecificPart());
        this.root = root;


        String fileNameStr = fileName.toString();
    }

        return visitor.visit(this);
    }
        return true;
    public boolean equals(Object obj) {
    }

                return visitor.visit((EFSNIOResource) resource);

 * DBeaver - Universal Database Manager
    }
        if (fileName == null) {
        return getLocalTimeStamp();
                    Files.newInputStream(nioPath),


        // Similar to o.e.c.i.Resource.equals(Object)
        throw new FeatureNotSupportedException();
        try {
                virtName = path.toString();
    }
 *
                try (InputStream is = Files.newInputStream(nioPath)) {
    public String getFileExtension() {
        if (parentPath == null) {
    }


        return IMarker.SEVERITY_INFO;
    }
    public IMarker findMarker(long id) throws CoreException {
        int divPos = fileNameStr.lastIndexOf('.');

            DBNNode.NodePathType.dbvfs.getPrefix() + root.getProject().getName() + "/" + root.getPrefix() +
import java.nio.file.Files;
    public static String getPathFileNameOrHost(Path path) {
    }
        return nioPath.hashCode();
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public EFSNIOFileStore getFileStore() {
    public void accept(IResourceProxyVisitor visitor, int memberFlags) throws CoreException {

    public IResource requestResource() {
            throw new CoreException(GeneralUtils.makeExceptionStatus(e));
    }
        return false;
    public Object getSessionProperty(QualifiedName key) {
    public static final QualifiedName NIO_RESOURCE_PROPERTY_NAME = new QualifiedName("org.jkiss.dbeaver.resources", "nioPath"); //$NON-NLS-1$ //$NON-NLS-2$
import org.jkiss.dbeaver.model.fs.DBFFileStoreProvider;
}
import java.net.URI;

            }
    public void move(IProjectDescription description, boolean force, boolean keepHistory, IProgressMonitor monitor) throws CoreException {
                if (!CommonUtils.isEmpty(uriPath)) {
    }
        return new IMarker[0];

    }
import java.nio.file.Path;
        return null;
    }
    public void deleteMarkers(String type, boolean includeSubtypes, int depth) throws CoreException {
    }
    private final EFSNIOFileSystemRoot root;
 *
        return false;
    }
                        targetFile.toPath(),
import java.io.InputStream;
    }
    @Override


    }
    }
    public IPath getProjectRelativePath() {
        return this;
    public boolean isHidden(int options) {
    }

 */

        throw new FeatureNotSupportedException();
    }
    public void copy(IPath destination, boolean force, IProgressMonitor monitor) throws CoreException {
    public IMarker[] findMarkers(String type, boolean includeSubtypes, int depth) throws CoreException {
    @Deprecated
    }
    @Deprecated
        return fileName.toString();
            return getProject();
    }

        throw new FeatureNotSupportedException();
    public void clearHistory(IProgressMonitor monitor) throws CoreException {
 */
        if (fileName == null) {
    public boolean exists() {
            File targetFile = destination.toFile();
    }

    public boolean isLinked() {
    public void delete(boolean force, IProgressMonitor monitor) throws CoreException {
        public FeatureNotSupportedException() {
    @Override
        return nioPath;
    public IPathVariableManager getPathVariableManager() {

    }
        accept(new IResourceVisitor() {
        } catch (Exception e) {
    public Map<QualifiedName, String> getPersistentProperties() throws CoreException {

        Path fileName = path.getFileName();
    public void move(IProjectDescription description, int updateFlags, IProgressMonitor monitor) throws CoreException {
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
    public String toString() {
            }
            }
    }
            String virtName = null;
                "/?" + URLEncoder.encode(nioPath.toUri().getPath(), StandardCharsets.UTF_8));
    public boolean isAccessible() {

    public void revertModificationStamp(long value) throws CoreException {
            }
        throw new FeatureNotSupportedException();
    public boolean contains(ISchedulingRule rule) {
        throw new FeatureNotSupportedException();
    public void setLocal(boolean flag, int depth, IProgressMonitor monitor) throws CoreException {
        return false;
    }
        return fileName == null ? nioPath.toUri().getPath() : fileName.toString();


public abstract class EFSNIOResource extends PlatformObject implements DBFFileStoreProvider, IResource, IResourceProxy {
    }
        return false;
    }
            super(Status.info("Feature not supported"));
    public String getPersistentProperty(QualifiedName key) throws CoreException {
        } catch (Exception e) {
    public void copy(IProjectDescription description, boolean force, IProgressMonitor monitor) throws CoreException {
        throw new FeatureNotSupportedException();
    private final Path nioPath;
    }

            EFSNIOMonitor.notifyResourceChange(this, EFSNIOListener.Action.DELETE);
        return Collections.singletonMap(NIO_RESOURCE_PROPERTY_NAME, nioPath);

    }
        throw new FeatureNotSupportedException();

            return true;

    }

    }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    public void delete(int updateFlags, IProgressMonitor monitor) throws CoreException {
        return getLocation();
import java.io.File;
        visit(visitor, depth);
    public IWorkspace getWorkspace() {
    }
        return new EFSNIOFolder(root, parentPath);

    public void setPersistentProperty(QualifiedName key, String value) throws CoreException {

    }
    }
                }

        return false;
    public URI getLocationURI() {
    }
            //
        return nioPath.equals(other.nioPath);
        if (this == obj) {
        return null;
    }
        return getProject().getWorkspace();
    public String getName() {
        throw new FeatureNotSupportedException();
import java.nio.charset.StandardCharsets;
 *
        }
    }
        // Same as o.e.c.i.Resource.hashCode()

                        StandardCopyOption.REPLACE_EXISTING);
    }
        try {
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        return null;
    }


    public boolean isDerived(int options) {
    public void touch(IProgressMonitor monitor) throws CoreException {
        return divPos == -1 ? null : fileNameStr.substring(divPos + 1);
        if (NIO_RESOURCE_PROPERTY_NAME.equals(key)) {
            throw new CoreException(GeneralUtils.makeExceptionStatus(e));
    public ResourceAttributes getResourceAttributes() {
    }
            return false;
        throw new FeatureNotSupportedException();
        return getLocation().makeRelativeTo(getProject().getLocation());
    public IMarker getMarker(long id) {
    public void move(IPath destination, int updateFlags, IProgressMonitor monitor) throws CoreException {

    public int findMaxProblemSeverity(String type, boolean includeSubtypes, int depth) throws CoreException {
    public boolean isTeamPrivateMember() {


    public void copy(IPath destination, int updateFlags, IProgressMonitor monitor) throws CoreException {
/**


            throw new CoreException(GeneralUtils.makeExceptionStatus(e));
        return true;
        }
    }
            return Files.getLastModifiedTime(nioPath).toMillis();
        // Do nothing
    }
    }
        return false;
    public boolean isReadOnly() {


        EFSNIOResource other = (EFSNIOResource) obj;



import org.jkiss.dbeaver.utils.GeneralUtils;
        return false;
    public void setDerived(boolean isDerived, IProgressMonitor monitor) throws CoreException {

    public void setSessionProperty(QualifiedName key, Object value) throws CoreException {
        throw new FeatureNotSupportedException();
        throw new FeatureNotSupportedException();
 * you may not use this file except in compliance with the License.
        } catch (Exception e) {
    public boolean isLinked(int options) {
package org.jkiss.dbeaver.model.fs.nio;
        }

 * You may obtain a copy of the License at
    public IMarker createMarker(String type, Map<String, ? extends Object> attributes) throws CoreException {
    public void accept(IResourceVisitor visitor, int depth, int memberFlags) throws CoreException {
import java.util.Map;

            return CommonUtils.removeTrailingSlash(
        return true;
    @Deprecated
    }
    }
                    monitor);
        Path fileName = nioPath.getFileName();
import java.net.URLEncoder;

        return getLocationURI();


    public boolean isVirtual() {
        throw new FeatureNotSupportedException();


    }
        return false;
    }
    }
    @Deprecated

        return true;
    }
                        is,
            if (destination instanceof IFile) {
    }
    }
    public boolean isLocal(int depth) {
    public IProject getProject() {
    }

    public boolean isHidden() {
        return getProject().getPathVariableManager();
        return null;
    public long setLocalTimeStamp(long value) throws CoreException {
    public Path getNioPath() {
        } catch (Exception e) {
    }
        delete(force ? IResource.FORCE : IResource.NONE, monitor);

    public IPath requestFullPath() {
    }
        return false;
        accept(visitor, depth, 0);
            EFSNIOMonitor.notifyResourceChange(new EFSNIOFile(root, targetPath), EFSNIOListener.Action.CREATE);
    }
        return Files.exists(nioPath);
        }

            return nioPath;
        throw new FeatureNotSupportedException();

    protected boolean visit(IResourceVisitor visitor, int depth) throws CoreException {

            return null;
        throw new FeatureNotSupportedException();
            return 0;
        return this;
    public void setDerived(boolean isDerived) throws CoreException {
    }
            Files.delete(getNioPath());
            public boolean visit(IResource resource) throws CoreException {
            if (virtName == null) {
        return getFullPath();
        this.nioPath = nioPath;
        try {
        return new EFSNIOFileStore(getLocationURI(), getNioPath());
                String uriPath = uri.getHost();
import java.nio.file.StandardCopyOption;
    }
import org.eclipse.core.runtime.*;
        return false;


    }
    public void accept(IResourceVisitor visitor) throws CoreException {


    }
    }
    }
            }
    public long getModificationStamp() {
import org.jkiss.dbeaver.model.navigator.DBNNode;
import java.util.Collections;

        return false;
                ((IFile) destination).setContents(
    }
        return getLocationURI().toString();
            throw new CoreException(GeneralUtils.makeExceptionStatus(e));
                    Files.copy(
    }
    public boolean isConflicting(ISchedulingRule rule) {
        try {
    public IResourceProxy createProxy() {
    public int hashCode() {
    public void setReadOnly(boolean readOnly) {

        }

        accept(visitor, DEPTH_INFINITE, 0);
            Files.move(nioPath, targetPath);
import org.eclipse.core.runtime.jobs.ISchedulingRule;
        }
        throw new FeatureNotSupportedException();
        return false;
    }
    }

                }
/*
        }
    }
    public void accept(IResourceVisitor visitor, int depth, boolean includePhantoms) throws CoreException {

                    updateFlags,
            // Use host name (the first part)
            URI uri = path.toUri();
    public IMarker createMarker(String type) throws CoreException {
    public void move(IPath destination, boolean force, IProgressMonitor monitor) throws CoreException {
            EFSNIOMonitor.notifyResourceChange(this, EFSNIOListener.Action.DELETE);

    }
    @Override
    public boolean isDerived() {

    }
    public URI getRawLocationURI() {
                CommonUtils.removeLeadingSlash(virtName));
    public boolean isTeamPrivateMember(int options) {
    public EFSNIOFileSystemRoot getRoot() {
    public void accept(final IResourceProxyVisitor visitor, int depth, int memberFlags) throws CoreException {
        }, depth, 0);
    public IContainer getParent() {
        }
        try {
        throw new FeatureNotSupportedException();
    }
    public static class FeatureNotSupportedException extends CoreException {
import org.eclipse.core.resources.*;
    @Deprecated
            } else {
    public boolean isPhantom() {
    }
        accept(visitor, DEPTH_INFINITE, 0);
        throw new FeatureNotSupportedException();

    }

            Path targetPath = destination.toPath();
        private static final long serialVersionUID = 1L;

            if (uri != null) {




    }
    }
    public boolean isSynchronized(int depth) {
        }
        Path fileName = getNioPath().getFileName();
                throw new IOException("Can't copy to " + destination);
        if (!(obj instanceof EFSNIOResource)) {

        }
    }
 * NIOResource
        Path parentPath = nioPath.getParent();
    }
import org.jkiss.utils.CommonUtils;
        }
                throw new IOException("Can't find file for location " + destination);
    public IPath getRawLocation() {
