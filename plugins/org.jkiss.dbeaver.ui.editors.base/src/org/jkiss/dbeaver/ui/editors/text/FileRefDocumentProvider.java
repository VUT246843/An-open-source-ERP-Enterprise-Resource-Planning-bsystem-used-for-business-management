
                buffer.append(readBuffer, 0, n);
            return false;
        {
    protected void refreshFile(IFile file, IProgressMonitor monitor) throws CoreException {
                case IResourceDelta.REMOVED:
                    fireElementStateChanging(element);
            }

import org.eclipse.core.resources.*;
        } catch (Exception e) {
        }
    protected long computeModificationStamp(IResource resource)
                            protected void execute(IEditorInput input) throws Exception
    private static final int DEFAULT_BUFFER_SIZE = 10000;
                    }
                info.fCanBeSaved = false;
        if (element instanceof IEditorInput) {

            int n = in.read(readBuffer);
        {
     * Sends out the notification that the file serving as document input has been moved.
                }
                monitor.beginTask("Save document", 1);
            IStatus status = null;
            encoder.onUnmappableCharacter(CodingErrorAction.REPORT);

            IWorkbenchWindow[] windows = workbench.getWorkbenchWindows();
                throw (CoreException) e;
                    }
                ContentUtils.close(contentStream);
            this.fileEditorInput = fileEditorInput;
        fireElementMoved(fileEditorInput, createNewEditorInput(newFile));
                return document;
                f.install();
    @Override

                try {
    }


            IWorkbench workbench = PlatformUI.getWorkbench();
    @Override
     */
            if (delta == null) {

    protected ElementInfo createElementInfo(Object element) throws CoreException
            }
            StringBuilder buffer = new StringBuilder(DEFAULT_BUFFER_SIZE);
    {
        }
                IStatus s = null;
         * Installs the synchronizer on the input's file.
            while (n > 0) {

package org.jkiss.dbeaver.ui.editors.text;
    @Override


 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        if (path == null) {

                fireElementContentReplaced(fileEditorInput);
         */
                        file.setContents(stream, true, true, monitor);
import java.nio.charset.Charset;
            editorInput = input;
            try {
import org.jkiss.dbeaver.runtime.IPersistentStorage;
        }

                    }
        IStorage storage = EditorUtils.getStorageFromInput(fileEditorInput);
            Charset charset = Charset.forName(encoding);
            String newContent = document.get();

import org.jkiss.dbeaver.utils.GeneralUtils;
                fireElementStateChangeFailed(editorInput);
                    refreshFile(file);

                        if (info != null && canRefreshFromFile(info)) {

    }
    public boolean isModifiable(Object element)
            return storage.isReadOnly();
     */
                return;
         *
                    // inform about the upcoming content change
            } else if (storage instanceof IPersistentStorage) {
    {

        fireElementDeleted(fileEditorInput);
     * @param path            the path of the new location of the file
                byteBuffer.get(bytes);
        /**
                }
            if (setDocumentContent(document, storage)) {

                } catch (CoreException x) {
    {
        {
            if (encoding == null) {
                setDocumentContent(document, stream, null);
        }


            } else {
                // Set the initial line delimiter
                ContentUtils.close(in);
        if (file != null) {


 * Licensed under the Apache License, Version 2.0 (the "License");
                if (delta != null && isInstalled) {
    {
        }
                ((IPersistentStorage) storage).setContents(monitor, stream);
                            }
                bytes = new byte[byteBuffer.limit()];
                setDocumentContent(document, file);
                log.warn("Error handling resourceChanged", x);
                    refreshFile(file);
    }
                info.modificationStamp = computeModificationStamp(file);
                        };

                IFile file = (IFile)storage;
            }

                bytes = byteBuffer.array();
    {
     */
    protected class FileSynchronizer implements IResourceChangeListener, IResourceDeltaVisitor {
import org.eclipse.jface.text.Document;
     *
        return modificationStamp;
         * @return the file wrapped by the editor input associated with that synchronizer
        public void install()
         *
            }
        IStorage storage = EditorUtils.getStorageFromInput(element);
    {

     */
import java.nio.charset.CodingErrorAction;
    /**
        {

            delta = delta.findMember(file.getFullPath());
    {

                    delta.accept(this);

            String encoding = (storage instanceof IEncodedStorage ? ((IEncodedStorage)storage).getCharset() : GeneralUtils.UTF8_ENCODING);

    protected void refreshFile(IFile file) throws CoreException {
                    if ((IResourceDelta.MOVED_TO & delta.getFlags()) != 0) {
        IStorage storage = EditorUtils.getStorageFromInput(element);
    protected void doSaveDocument(IProgressMonitor monitor, Object element, IDocument document, boolean overwrite) throws CoreException


    }
            } catch (Exception e) {
                FileInfo info = new FileInfo(d, m, f);
                try (OutputStream os = new FileOutputStream(localFile)) {
            throw new CoreException(GeneralUtils.makeExceptionStatus(e));
        public void run()
        if (storage instanceof IFile) {

                info.fDocument.set(newContent);
        {
                        monitor.done();
                return info;
import org.jkiss.dbeaver.utils.ContentUtils;
         *
    protected class FileInfo extends ElementInfo {
        if (storage  != null) {
import java.nio.CharBuffer;
        @Override
}
    public FileRefDocumentProvider()
                    FileInfo info = (FileInfo) getElementInfo(fileEditorInput);
import org.jkiss.utils.IOUtils;

                        fireElementStateChangeFailed(element);
                info.fStatus = status;
            } else {
    protected Document createDocument(Object element) throws CoreException
    protected void setDocumentContent(IDocument document, InputStream contentStream, String encoding) throws IOException
        long modificationStamp = resource.getModificationStamp();
     * @param fileEditorInput the input of an text editor

            try {
        }
            }
        }
 */


         * The file synchronizer.
                            {
                runnable.run();
                    log.warn("Can't create document", x);
        {
        /**


         */
                    break;
                return false;
                execute(editorInput);
        return super.isDeleted(element);
                IDocument d;
    protected void setupDocument(IDocument document)
                } catch (CoreException x) {


    }
        /**
                fireElementContentAboutToBeReplaced(fileEditorInput);

 * you may not use this file except in compliance with the License.
                n = in.read(readBuffer);
        }

import org.eclipse.ui.IWorkbench;
                }

    }
         */
    }
         * Posts the update code "behind" the running operation.
                    }
import java.nio.ByteBuffer;
 *
    {
import org.eclipse.jface.text.source.IAnnotationModel;
    private static final Log log = Log.getLog(FileRefDocumentProvider.class);
         */
                            @Override
            } catch (CoreException x) {
        {

        }
     * Synchronizes the document with external resource changes.
            }
                FileSynchronizer f = new FileSynchronizer(input);
                            @Override
import org.eclipse.core.runtime.*;
    protected boolean setDocumentContent(IDocument document, IStorage storage) throws CoreException
        }
            } else {
            if (byteBuffer.hasArray()) {
        {
        public long modificationStamp = IResource.NULL_STAMP;
                    s = x.getStatus();
                String initialLineDelimiter = GeneralUtils.getDefaultLineSeparator();
                update(runnable);

            }
            if (!newContent.equals(info.fDocument.get())) {
            return modificationStamp;

        }
    public boolean isReadOnly(Object element)
        super.disposeElementInfo(element, info);
            }
import org.jkiss.dbeaver.ui.UIUtils;
        }
         * Creates a new file synchronizer. Is not yet installed on a resource.
            IFile file = (IFile)storage;
                            protected void execute(IEditorInput input) throws Exception
            try {
         */
 *
        if (info == null) {
                if (initialLineDelimiter != null) {
import org.jkiss.dbeaver.DBException;
            return !file.exists();
                encoding = GeneralUtils.UTF8_ENCODING;
                } else {
        }
            }
        }
            char[] readBuffer = new char[2048];
                    try {
     */
            }
    }
                        }
         */
        } catch (IOException e) {
                // do nothing
    protected abstract class SafeChange implements Runnable {

            if (getElementInfo(editorInput) == null) {
import org.eclipse.ui.PlatformUI;

                status = x.getStatus();
 * DBeaver - Universal Database Manager
    protected void handleElementDeleted(IEditorInput fileEditorInput)
        }
            InputStream stream = new ByteArrayInputStream(bytes, 0, byteBuffer.limit());
                        runnable = new SafeChange(fileEditorInput) {
import java.io.*;
            } catch (IOException e) {

            this.fileSynchronizer = fileSynchronizer;

        }
                // set the new content and fire content related events
            CharsetEncoder encoder = charset.newEncoder();
        modificationStamp = path.toFile().lastModified();
            return;
import org.jkiss.dbeaver.ui.editors.EditorUtils;
            } else {
                                {
                        // inform about failure
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
                localFile = EditorUtils.getLocalFileFromInput(element);
                setupDocument(document);


                info.fCanBeSaved = false;

                    IOUtils.copyStream(stream, os);
                    ((IDocumentExtension4) d).setInitialLineDelimiter(initialLineDelimiter);
            }
            isInstalled = false;
                info.fStatus = s;
    public boolean isDeleted(Object element)
            }
                                handleElementMoved(input, path);
            }
    {

                if (file.exists()) {

         * Returns the file wrapped by the file editor input.
                                    handleElementDeleted(input);
    }
    {
        try (InputStream contentStream = storage.getContents()) {
    /**
    {
 * limitations under the License.

                if (localFile == null) {

            if (windows != null && windows.length > 0) {
        protected boolean isInstalled = false;
            IStorage storage = EditorUtils.getStorageFromInput(fileEditorInput);
                throw new CoreException(GeneralUtils.makeExceptionStatus(e));

        private boolean canRefreshFromFile(FileInfo info)
        public void uninstall()
                fileInfo.fileSynchronizer.uninstall();
                    d = createEmptyDocument();
    @Override
            super(document, model);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return storage instanceof IFile ? (IFile)storage : null;
            in = new BufferedReader(new InputStreamReader(contentStream, encoding), DEFAULT_BUFFER_SIZE);
                    log.error("handleElementContentChanged", x);
        if (storage instanceof IResource) {
        public FileSynchronizer(IEditorInput fileEditorInput)
                        info = (FileInfo) getElementInfo(fileEditorInput);
     *
            } else {

 * FileRefDocumentProvider
         * @param fileEditorInput the editor input to be synchronized
    {
            return !((IResource)storage).exists();
        if (info instanceof FileInfo) {
                }
            return true;
        protected IFile getFile()
    protected void disposeElementInfo(Object element, ElementInfo info)
            document.set(buffer.toString());
/**
                throw new DBException("Storage [" + storage + "] doesn't support save");
        IStorage storage = EditorUtils.getStorageFromInput(element);
                                @Override
            String encoding = (storage instanceof IEncodedStorage ? ((IEncodedStorage)storage).getCharset() : GeneralUtils.getDefaultFileEncoding());
                                handleElementContentChanged(input);
                        monitor.beginTask("Save file '" + file.getName() + "'", 2000);
            IResourceDelta delta = e.getDelta();
                        // inform about failure
                        };

                removeUnchangedElementListeners(fileEditorInput, info);
     *
        public void resourceChanged(IResourceChangeEvent e)
                            }
        {
        File file = EditorUtils.getLocalFileFromInput(element);
        try {

            IStorage storage = EditorUtils.getStorageFromInput(element);

        {
                    d = createDocument(element);
        }
         */
                            };
    }
            encoder.onMalformedInput(CodingErrorAction.REPLACE);
                fireElementStateChanging(fileEditorInput);
                        final IPath path = delta.getMovedToPath();
    }
            Runnable runnable = null;

 * Copyright (C) 2010-2024 DBeaver Corp and others
            IDocument document = createEmptyDocument();

     * @param fileEditorInput the input of an text editor
        protected IEditorInput fileEditorInput;
    }
        protected void update(Runnable runnable)
                            {
            if (runnable instanceof SafeChange) {
        IPath path = resource.getLocation();
            }
            if (storage == null) {
        }
        @Override
                // fires only the dirty state related event
                info.modificationStamp = computeModificationStamp(file);
            if (delta == null) {

                }
                            protected void execute(IEditorInput input) throws Exception

            }
        }
                        break;
    {

                        throw x;
                                handleElementContentChanged(input);
        } finally {
                    try {
            }
                    if ((IResourceDelta.ENCODING & delta.getFlags()) != 0 && isSynchronized) {
 *     http://www.apache.org/licenses/LICENSE-2.0
            } catch (CoreException x) {
                info.fDocument.removeDocumentListener(info);


                                }
            }
        }
                file.refreshLocal(IResource.DEPTH_INFINITE, monitor);
                info.modificationStamp = computeModificationStamp(file);

                    }
    @Override
        IFile newFile = workspace.getRoot().getFile(path);

            }

                addUnchangedElementListeners(fileEditorInput, info);
    }
        return super.createElementInfo(element);
    }
        throw new IllegalArgumentException("Project document provider supports only editor inputs which provides IStorage facility");
                try {
            }
    /**
 * You may obtain a copy of the License at
    }
        /**
                setupDocument(document);
        return new ProjectFileEditorInput(newFile);
            byte[] bytes;
import org.eclipse.jface.text.IDocument;
                        file.create(stream, false, monitor);

        FileInfo info = (FileInfo) getElementInfo(fileEditorInput);
    protected IEditorInput createNewEditorInput(IFile newFile)
            File localFile = null;
 *
                            }


            ByteBuffer byteBuffer = encoder.encode(CharBuffer.wrap(document.get()));
        if (storage != null) {
                    boolean isSynchronized = computeModificationStamp(file) == info.modificationStamp;
            getFile().getWorkspace().addResourceChangeListener(this);
     * Sends out the notification that the file serving as document input has been deleted.

        if (file != null) {
        }
                fireElementDirtyStateChanged(fileEditorInput, false);

        if (file != null) {
            IFile file = getFile();
                    if (runnable == null && (IResourceDelta.CONTENT & delta.getFlags()) != 0 && !isSynchronized) {
            if (file == null) {
            if (runnable != null) {
        if (file != null) {

    {
    @Override
 * See the License for the specific language governing permissions and
                return document;

         * The time stamp at which this provider changed the file.
    /**
     * @param fileEditorInput the input of an text editor
            IStorage storage = EditorUtils.getStorageFromInput(input);

                } catch (CoreException x) {
            if (storage instanceof IFile) {
    @Override
import org.eclipse.jface.text.IDocumentExtension4;
                        };
/*
                        runnable = new SafeChange(fileEditorInput) {
    }
        private IEditorInput editorInput;
public class FileRefDocumentProvider extends BaseTextDocumentProvider {
        }
        @Override
        try {
                    }
            FileInfo fileInfo = (FileInfo) info;
        }
            //return !info.fCanBeSaved;
                        runnable = new SafeChange(fileEditorInput) {
        return !isReadOnly(element);

            }
        /**
                }
    {
                throw new CoreException(GeneralUtils.makeExceptionStatus(e));
                }

            }
                fireElementStateChangeFailed(editorInput);

    /**

                addUnchangedElementListeners(fileEditorInput, info);


            if (in != null) {

    }
            getFile().getWorkspace().removeResourceChangeListener(this);
                case IResourceDelta.CHANGED:
                        //ContainerCreator creator = new ContainerCreator(file.getWorkspace(), file.getParent().getFullPath());
            if (fileInfo.fileSynchronizer != null) {
                    if (info == null || !canRefreshFromFile(info)) {
                try {
        {
                    } catch (RuntimeException x) {
                    break;
    }
        refreshFile(file, getProgressMonitor());
                removeUnchangedElementListeners(fileEditorInput, info);
import org.eclipse.ui.IWorkbenchWindow;

                    } catch (CoreException x) {
            if (e instanceof CoreException) {

            switch (delta.getKind()) {
        Reader in = null;
                            @Override
        File file = EditorUtils.getLocalFileFromInput(element);
        /**
        }
    }

    }
                }
        File file = EditorUtils.getLocalFileFromInput(element);
        protected abstract void execute(IEditorInput input) throws Exception;

            try {
            }
import org.jkiss.dbeaver.ui.editors.ProjectFileEditorInput;
                IAnnotationModel m = createAnnotationModel(element);
                        throw x;
                UIUtils.asyncExec(runnable);
import org.eclipse.ui.IEditorInput;
                                protected void execute(IEditorInput input) throws Exception
                info.fStatus = status;
                    } else {
                            runnable = new SafeChange(fileEditorInput) {
    protected void handleElementMoved(IEditorInput fileEditorInput, IPath path)

     * Bundle of all required information to allow files as underlying document resources.
            if (storage instanceof IFile) {
                IFile file = (IFile)storage;

            IEditorInput input = (IEditorInput) element;
        Document document = createEmptyDocument();
            } else if (localFile != null) {
     * appropriate notifications.

                        fireElementStateChangeFailed(element);
            } catch (OperationCanceledException x) {
                    finally {

            isInstalled = true;

                            {
         * @param runnable the update code
import java.nio.charset.CharsetEncoder;
                return false;
                return false;
        public FileInfo(IDocument document, IAnnotationModel model, FileSynchronizer fileSynchronizer)
            }
            return !file.isFile();
                    }
        public SafeChange(IEditorInput input)
        public FileSynchronizer fileSynchronizer;
        }
        /**
        }
import org.jkiss.dbeaver.Log;
     * Updates the element info to a change of the file content and sends out
         * Uninstalls the synchronizer from the input's file.
            setDocumentContent(document, contentStream, encoding);
        return true;
            try (InputStream stream = new FileInputStream(file)) {
                    log.warn("Can't refresh file", x);
 * Unless required by applicable law or agreed to in writing, software
        return super.isReadOnly(element);
                        //creator.createContainer(new SubProgressMonitor(monitor, 1000));
            } else {
 */
        public boolean visit(IResourceDelta delta) throws CoreException
    {
                    throw new DBException("Can't obtain file from editor input");


    protected void handleElementContentChanged(IEditorInput fileEditorInput)
            }
