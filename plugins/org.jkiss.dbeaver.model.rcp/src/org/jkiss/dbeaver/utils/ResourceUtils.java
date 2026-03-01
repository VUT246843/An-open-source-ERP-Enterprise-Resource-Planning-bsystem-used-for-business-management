    }
        }

                try {
public class ResourceUtils {
    }
                charset = localFile.getCharset();
            IFileInfo iFileInfo = fileStore.fetchInfo();
    {
            Matcher matcher = pattern.matcher(files.getLast().getName());
            try (OutputStream outputStream = new FileOutputStream(file)) {
        return wFile == null ? null : wFile.getFullPath();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import java.util.Comparator;
        catch (CoreException e) {
            if (matcher.matches()) {
    }
        if (file != null) {
        IPath folderPath = path.removeLastSegments(1);
            }

        try {
import java.util.stream.Stream;
        catch (CoreException e) {
        if (!file.exists()) {
            log.warn("Can't synchronize file '" + localFile + "' with contents", e);
 *     http://www.apache.org/licenses/LICENSE-2.0
    public static void copyStreamToFile(DBRProgressMonitor monitor, InputStream inputStream, long contentLength, IFile localFile)
            members = folder.members();
        if (!files.isEmpty()) {
        } catch (CoreException ignored) {
        }
            try (OutputStream outputStream = new FileOutputStream(file)) {
    public static long getFileLength(IResource resource) {
                folder.create(true, true, monitor.getNestedMonitor());
    }
        try {
    }
 *
}
    private static final Log log = Log.getLog(ResourceUtils.class);
        syncFile(monitor, localFile);

    public static void copyReaderToFile(DBRProgressMonitor monitor, Reader reader, long contentLength, String charset, IFile localFile)
package org.jkiss.dbeaver.utils;
        } catch (CoreException e) {
    {
    public static IPath convertPathToWorkspacePath(IPath path)
/**

        IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
        if (!ArrayUtils.isEmpty(containers)) {
import org.eclipse.core.runtime.IPath;
    }
import org.jkiss.dbeaver.Log;
        return getUniqueFileFallback(folder, fileName, fileExt);
            return file;
import org.jkiss.code.Nullable;

        syncFile(monitor, localFile);
    {

import org.eclipse.core.filesystem.EFS;
import java.util.regex.Matcher;
        IResource[] members;
import org.jkiss.utils.ArrayUtils;
            }
    public static void syncFile(DBRProgressMonitor monitor, IResource localFile) {

                }
    private static IFile getUniqueFileFallback(@NotNull IFolder folder, @NotNull String fileName, @NotNull String fileExt) {


            }
        }
 * Eclipse resource utilities
    }
                ContentUtils.copyStreams(inputStream, contentLength, outputStream, monitor);
    @NotNull
    }
            }
            return file;

            IFileStore fileStore = EFS.getStore(resource.getLocationURI());

        try {
 */
        while (file.exists()) {
    public static long getResourceLastModified(IResource resource) {
        }
            } catch (CoreException e) {
        URI folderURI = folderPath.toFile().toURI();
        IFile file = folder.getFile(fileName + "." + fileExt);
            // Fast path
                    int index = Integer.parseInt(matcher.group(1));
                Writer writer = new OutputStreamWriter(outputStream, charset == null ? GeneralUtils.DEFAULT_ENCODING : charset);
    @Nullable
import org.eclipse.core.filesystem.IFileStore;
        }
        }
                localFile.setCharset(charset, monitor.getNestedMonitor());
 * Licensed under the Apache License, Version 2.0 (the "License");
            return iFileInfo.getLastModified();
            index++;
        var files = Stream.of(members)
import org.eclipse.core.resources.*;
            log.debug(e);
 * limitations under the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
import java.net.URI;
    }
            throws DBException
    public static void checkFolderExists(IFolder folder)
import org.jkiss.utils.AlphanumericComparator;
    public static void checkFolderExists(IFolder folder, DBRProgressMonitor monitor)
                ContentUtils.copyStreams(reader, contentLength, writer, monitor);
    public static void deleteTempFile(DBRProgressMonitor monitor, IFile file)
    public static IFile getUniqueFile(@NotNull IFolder folder, @NotNull String fileName, @NotNull String fileExt) {
        }
            .filter(r -> pattern.matcher(r.getName()).matches())
        //localFile.appendContents(inputStream, true, false, monitor.getNestedMonitor());
    {

 * distributed under the License is distributed on an "AS IS" BASIS,

            } else {
        }
            return getUniqueFileFallback(folder, fileName, fileExt);
 * Unless required by applicable law or agreed to in writing, software
        catch (CoreException e) {
        finally {
            return -1;
            log.debug(e);
            }
        }
        if (!folder.exists()) {
    {
    }


            file = folder.getFile(fileName + "-" + index + "." + fileExt);
        try {
        File file = localFile.getLocation().toFile();
 * you may not use this file except in compliance with the License.
        }
        throws IOException
 * DBeaver - Universal Database Manager

import java.io.*;
            IContainer container = containers[0];
 * See the License for the specific language governing permissions and
        } catch (CoreException e) {
    public static IFile convertPathToWorkspaceFile(IPath path)
        }
import org.eclipse.core.runtime.CoreException;
        }
        IFile wFile = convertPathToWorkspaceFile(path);
import org.eclipse.core.filesystem.IFileInfo;
 *
            localFile.refreshLocal(IFile.DEPTH_ZERO, monitor.getNestedMonitor());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Nullable
            if (charset == null) {
        IFile file = root.getFileForLocation(path);
 *
            IFileStore fileStore = EFS.getStore(resource.getLocationURI());
            reader.close();
            log.warn("Can't delete temporary file '" + file.getFullPath().toString() + "'", e);
/*

        try {
        // Sync file with contents
        }
import org.jkiss.dbeaver.DBException;
                throw new DBException("Can't create folder '" + folder.getFullPath() + "'", e);
        try {
            file = container.getFile(path.removeFirstSegments(path.segmentCount() - 1));
        }
            return iFileInfo.getLength();
        int index = 1;

            .sorted(Comparator.comparing(IResource::getName, AlphanumericComparator.getInstance()))
        }
    @NotNull
        }
            try {
        IContainer[] containers = root.findContainersForLocationURI(folderURI);


    {
        }
 */
                writer.flush();
 * You may obtain a copy of the License at
            IFileInfo iFileInfo = fileStore.fetchInfo();
                    return folder.getFile(fileName + '-' + (index + 1) + '.' + fileExt);
                } catch (NumberFormatException ignored) {
import java.util.regex.Pattern;
            return -1;
        var pattern = Pattern.compile("^%s-(\\d+).%s".formatted(Pattern.quote(fileName), Pattern.quote(fileExt)));
        finally {
        throws IOException

            file.delete(true, false, monitor.getNestedMonitor());
    {
    }
        return file;
        try {
        try {
        // Look for all matching files and grab the one that has the highest index
        return file;
        }
            .toList();
        // Probably we have a path to some linked resource

import org.jkiss.code.NotNull;
        checkFolderExists(folder, new VoidProgressMonitor());
        File file = localFile.getLocation().toFile();
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
                    // How did we get here?
        }
            throws DBException
            inputStream.close();
            log.warn("Can't set content charset", e);
        IFile file = folder.getFile(fileName + "." + fileExt);

