
    }
            if (value instanceof DBDContent) {
        this.valueController = valueController;
        return DBValueFormatting.getDefaultBinaryFileEncoding(valueController.getExecutionContext().getDataSource());

                    }
            }
 */
        this.valueController = valueController;
        DBDContentStorage storage = content.getContents(monitor);
    {
import org.jkiss.dbeaver.runtime.LocalFileStorage;
            } else if (storage instanceof DBDContentCached) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

                    new DefaultProgressMonitor(monitor),
package org.jkiss.dbeaver.ui.editors.content;
                    if (ContentUtils.isTextContent(content)) {
            valueController.updateValue(str, false);
                } catch (IOException e) {
        return defaultPart;
                    if (valueController instanceof IAttributeController) {
    {


        } else if (contentFile != null) {
        this.defaultPart = defaultPart;
    {

            throw new DBException("Can't set content read-only");
 * Licensed under the Apache License, Version 2.0 (the "License");

            stringStorage = new StringEditorInput(getName(), CommonUtils.toString(value[0]), isReadOnly(), fileCharset).getStorage();
        return contentFile == null ?

    }
        DBDContentStorage storage = contents.getContents(monitor);

public class ContentEditorInput implements IPathEditorInput, IStatefulEditorInput, DBPContextProvider, IEncodingSupport
            new Path(contentFile.getAbsolutePath());
                if (part instanceof IReusableEditor) {
        @Nullable IEditorPart defaultPart,
    }
    }
        }
import org.jkiss.code.NotNull;
    @Override
            // No need to do init


    public IPath getPath()
    private static final Log log = Log.getLog(ContentEditorInput.class);
            return contentFile.length();
        @Nullable IEditorPart[] editorParts,
                try (FileInputStream is = new FileInputStream(contentFile)) {
            stringStorage.setString(str);
        }
    {
    {
        this.prepareContent(monitor);
                    } else {
                storage = new TemporaryContentStorage(DBWorkbench.getPlatform(), contentFile.toPath(), fileCharset, false);
        if (valueController.isReadOnly()) {
                }
 * distributed under the License is distributed on an "AS IS" BASIS,
            inputName = valueController.getValueName();
            } catch (PartInitException e) {
            Object value = getValue();
        return inputName;
        try (InputStream is = openContents()) {
import org.jkiss.dbeaver.model.data.storage.BytesContentStorage;
            if (contents.isNull()) {
            return 0;
                ((DBDContent)value).updateContents(
    }
                RuntimeUtils.makeMonitor(monitor));
                    new ExternalContentStorage(DBWorkbench.getPlatform(), extFile.toPath()));
            new Path("fake_path") : // To avoid NPE from the Eclipse
        @NotNull DBRProgressMonitor monitor)

import org.jkiss.dbeaver.model.data.DBDContentStorageLocal;
                log.error("Error refreshing content editor part " + part, e);
 * See the License for the specific language governing permissions and
        // Refresh editor parts
        this.prepareContent(monitor);
        }
    }
        if (value[0] instanceof DBDContent) {
import org.eclipse.ui.editors.text.IEncodingSupport;
            refreshContentParts(extFile);
    }
        }
import org.jkiss.dbeaver.model.data.DBDContent;
            release();
            throw new DBCException("Can't update read-only value");
        }
        this.editorParts = editorParts;
            if (cePart instanceof IRefreshablePart) {
    }
            throw new CoreException(GeneralUtils.makeExceptionStatus(e));
    }

    public void release()

                }
                contentDetached = content.updateContents(monitor, storage);
import org.jkiss.dbeaver.ui.editors.IStatefulEditorInput;

    {
        if (valueController.getExecutionContext() == null) {
                ((IRefreshablePart) cePart).refreshPart(source, false);
    private void updateStringValueFromFile(File extFile) throws DBException {
    }
    private File contentFile;
 *

import org.jkiss.dbeaver.utils.RuntimeUtils;
 *

    public IPersistableElement getPersistable()
        stringStorage = null;
import org.jkiss.dbeaver.ui.editors.StringEditorInput;
 * ContentEditorInput
    void saveToExternalFile(File file, IProgressMonitor monitor)
/**
            catch (IOException e) {

        return null;
        }
    }
import org.jkiss.dbeaver.model.data.storage.TemporaryContentStorage;
            } else {
            return;
        }
        }
    }
        } else {
        throws DBException
    }
        }
import java.io.*;
    {
            }
import org.jkiss.utils.CommonUtils;
                // Create new storage and pass it to content
        if (storage instanceof DBDContentStorageLocal) {
        }
        return getName();
import org.jkiss.dbeaver.model.data.DBDContentCached;
import org.jkiss.utils.IOUtils;
            release();
    private void markReadOnly(boolean readOnly) throws DBException
        if (isReadOnly()) {
        return valueController.getValue();
                // Write value to file
import org.jkiss.dbeaver.DBException;
            contentFile = ((DBDContentStorageLocal)storage).getDataFile().toFile();
        return DBeaverIcons.getImageDescriptor(DBIcon.TYPE_LOB);

        catch (Exception e) {
        }
            String str = IOUtils.readToString(is);
                    }
            contentDetached = true;
        }
                }
            throw new CoreException(GeneralUtils.makeExceptionStatus(e));
                }
 * You may obtain a copy of the License at
    @Override

    private IEditorPart defaultPart;
    public String getName()
    }
 *
                is,
    @Override
    {
                return adapter.cast(stringStorage);
 * limitations under the License.
import org.jkiss.dbeaver.ui.IRefreshablePart;
        return editorParts;
    {
    public boolean isReadOnly() {
    @Override
import org.eclipse.core.runtime.IProgressMonitor;
        this.defaultPart = defaultPart;
            }
    void refreshContentParts(Object source) {
{
                contentDetached = true;
                    log.warn("Can't get data from null storage");
    @Override
        throws DBException
                // Create new storage and pass it to content
            }
import org.jkiss.dbeaver.Log;

            contentDetached = true;
import org.eclipse.core.runtime.CoreException;
        throws DBException
                        log.warn("Can't delete temporary content file '" + contentFile.getAbsolutePath() + "'");
        } else if (stringStorage != null) {
                    ContentUtils.copyStreams(is, storage.getContentLength(), os, monitor);
            }
        try (OutputStream os = new FileOutputStream(contentFile)) {
        throws DBException, IOException
    public String getEncoding() {


import org.jkiss.dbeaver.ui.UIUtils;
        try {
    @Override
            contentDetached = true;
 *     http://www.apache.org/licenses/LICENSE-2.0
        @Nullable IEditorPart defaultPart,
 * Unless required by applicable law or agreed to in writing, software

    public boolean exists()
                        try (Reader reader = new InputStreamReader(is, fileCharset)) {
    private String fileCharset;
    public IEditorPart getDefaultEditor() {
        return valueController.getExecutionContext();
    }
                    contentFile = ContentUtils.createTempContentFile(monitor, DBWorkbench.getPlatform(), valueId).toFile();
            DBDContentStorage storage = content.getContents(monitor);
import org.jkiss.dbeaver.ui.data.IAttributeController;
                }
            contentDetached = false;
    }
                    if (!contentFile.delete()) {

    public ImageDescriptor getImageDescriptor()

    {
        }
        DBDContent content;
    {
    public <T> T getAdapter(Class<T> adapter)
        if (valueController.isReadOnly()) {
            // User content's storage directly
import org.jkiss.dbeaver.model.data.DBDContentStorage;
        this.fileCharset = CommonUtils.isEmpty(charset) ? getDefaultEncoding() : charset;
import org.eclipse.jface.resource.ImageDescriptor;

    }
        @NotNull DBRProgressMonitor monitor)
        if (valueController instanceof IAttributeController) {
    }
import org.jkiss.code.Nullable;
    {
            if (storage instanceof DBDContentStorageLocal) {
                return adapter.cast(new LocalFileStorage(contentFile, fileCharset));
    }
        if (!contentFile.setWritable(!readOnly)) {
            // Copy content to local file
    {
                ContentUtils.copyStreams(new ByteArrayInputStream(new byte[0]), 0, os, monitor);

    {
    private IValueController valueController;
                // Nothing to update - we use content's storage
        if (adapter == IStorage.class) {
        }
    IEditorPart[] getEditors()
        for (IEditorPart cePart : editorParts) {
            contentDetached = true;

    private void prepareContent(DBRProgressMonitor monitor)
        }
    public Object getValue() {
    public void setEncoding(String fileCharset) {
        @Nullable IEditorPart[] editorParts,
        this.editorParts = editorParts;
    private IEditorPart[] editorParts;
                        }
            }
                if (storage == null) {

                            storage = StringContentStorage.createFromReader(reader);
import org.eclipse.core.runtime.IPath;
    }

import org.jkiss.dbeaver.model.DBValueFormatting;
    @Override
        this.valueController = valueController;
                } else {
        this.fileCharset = getDefaultEncoding();
                try (InputStream is = storage.getContentStream()) {
    private StringEditorInput.StringStorage stringStorage;
    private void copyContentToFile(DBDContent contents, DBRProgressMonitor monitor)
        this.fileCharset = fileCharset;
    {
    private InputStream openContents() throws Exception {
    public void updateContentFromFile(DBRProgressMonitor monitor, Object value)
            } else {
    private boolean contentDetached = false;

import org.jkiss.dbeaver.model.DBPContextProvider;
                log.warn("Can't delete temp file '" + contentFile.getAbsolutePath() + "'");
}                updateStringValueFromFile(extFile);
    }
        for (IEditorPart part : editorParts) {
    }
    }
    }
 */
            content = (DBDContent) value[0];
            }
            try {
    @Nullable
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public IValueController getValueController()
                    ((IReusableEditor) part).setInput(this);
        } else {

    public long getContentLength() {
    }
        throws CoreException
        if (stringStorage != null) {
                copyContentToFile(content, monitor);
                    }
import org.eclipse.core.runtime.Path;
            } else {
                    contentDetached = content.updateContents(monitor, storage);
import org.jkiss.dbeaver.utils.ContentUtils;
        }
    {
            inputName = ((IAttributeController) valueController).getColumnId();
                if (contentFile != null && contentFile.exists()) {
import org.jkiss.dbeaver.model.data.storage.ExternalContentStorage;
        final Object[] value = new Object[1];
                    //StringContentStorage.
    @Nullable
                        valueId = valueController.getValueName();
        markReadOnly(false);
    public String getToolTipText()

    }
            DBDContent content = (DBDContent) value;
        return valueController;
    public void refreshContent(DBRProgressMonitor monitor, IValueController valueController) throws DBException
    {
            inputName += " [Read Only]";
                    throw new DBException("Error reading content from file", e);

            throw new DBException("Error reading content from file", e);
        String inputName;
        return stringStorage == null ? new FileInputStream(contentFile) : stringStorage.getContents();
    {
        return null;
                    } else {
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
                        storage = BytesContentStorage.createFromStream(is, contentFile.length(), fileCharset);
                content.updateContents(monitor, storage);


            return stringStorage.getLength();
                        valueId = ((IAttributeController) valueController).getColumnId();
        if (contentDetached) {
        @Nullable String charset,
    public DBCExecutionContext getExecutionContext() {
        return fileCharset;
        }
        }
            }
        return false;
            // Just read as string
    public ContentEditorInput(
            contentFile = extFile;
import org.jkiss.dbeaver.model.DBIcon;

        catch (Throwable e) {
import org.jkiss.dbeaver.model.exec.DBCException;
    }
            valueController.updateValue(stringStorage.getString(), false);
            markReadOnly(true);
import org.eclipse.ui.*;

                    String valueId;
    @Override
        throws CoreException
import org.jkiss.dbeaver.model.data.storage.StringContentStorage;
    @Override
        this.prepareContent(monitor);

            if (!contentFile.delete()) {
    }
import org.jkiss.dbeaver.utils.GeneralUtils;
    }
        try (FileReader is = new FileReader(extFile)) {
import org.jkiss.dbeaver.ui.data.IValueController;
    void loadFromExternalFile(File extFile, IProgressMonitor monitor)
        if (contentFile != null && !contentDetached) {
 * you may not use this file except in compliance with the License.
    public ContentEditorInput(
        markReadOnly(valueController.isReadOnly());
import org.jkiss.dbeaver.model.runtime.DefaultProgressMonitor;
        }
import org.jkiss.dbeaver.runtime.DBWorkbench;
        @NotNull IValueController valueController,

        } catch (IOException e) {
/*
import org.eclipse.core.resources.IStorage;
    @Nullable

    @Nullable
        // Mark file as readonly
            } else {
    {
        return valueController.isReadOnly();
            return GeneralUtils.getDefaultFileEncoding();
        @NotNull IValueController valueController,
                // Delete temp file
        }
            try {
                file,
                // Create file
 * DBeaver - Universal Database Manager
            if (stringStorage != null) {
import org.jkiss.dbeaver.ui.DBeaverIcons;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        } else {
    }
    public String getDefaultEncoding() {
                if (contentFile == null) {
        if (value instanceof DBDContent) {
            }
        UIUtils.syncExec(() -> value[0] = getValue());
                    return;
        }
                throw new DBException("Can't delete content file", e);
        } else {
            ContentUtils.saveContentToFile(
                }
                    part.init(part.getEditorSite(), this);
        throws DBException

