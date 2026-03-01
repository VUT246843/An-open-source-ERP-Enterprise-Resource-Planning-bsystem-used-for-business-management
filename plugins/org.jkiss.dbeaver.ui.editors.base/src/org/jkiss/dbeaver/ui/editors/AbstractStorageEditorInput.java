 * distributed under the License is distributed on an "AS IS" BASIS,

            return buffer.toString();
            buffer.setLength(0);
    public void setText(String text) {

    private StringStorage storage;
        return properties.get(name);
import org.eclipse.jface.resource.ImageDescriptor;
import org.jkiss.dbeaver.ui.DBeaverIcons;
        @Override
    @Override
 */
        } else {
    @Override
    }
        }
                buffer.setLength(0);
    public StringStorage getStorage() {
            properties.put(name, value);
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
        }

            try {
        @Override
                IOUtils.copyStream(stream, baos);
import java.io.InputStream;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.CoreException;
    }
    }


 * AbstractStorageEditorInput
        public String getString() {
    }
        }

package org.jkiss.dbeaver.ui.editors;


import org.eclipse.ui.IPersistableElement;
     */
    }
    /* (non-Javadoc)
import org.eclipse.core.resources.IEncodedStorage;
        this.readOnly = readOnly;
import org.jkiss.utils.IOUtils;
        public String getCharset() {

    public String toString() {
            return name;
import java.nio.charset.Charset;
            return adapter.cast(getStorage());
        this.charset = Charset.forName(charset);
        if (storage == null) {
import java.util.HashMap;
    public StringBuilder getBuffer() {

        @Override
        }
            return null;

    }
    public <T> T getAdapter(Class<T> adapter) {
        return buffer;
    public String getToolTipText() {
import org.eclipse.core.runtime.IPath;
    public boolean exists() {
 * You may obtain a copy of the License at

            storage = new StringStorage();
import org.jkiss.dbeaver.model.DBIcon;
    }
                buffer.append(str);
 * Unless required by applicable law or agreed to in writing, software

    }
    public ImageDescriptor getImageDescriptor() {
 *
        }
    private final StringBuilder buffer;


    public String getName() {
        @Override

    public boolean isReadOnly() {
            return charset.name();

            if (str != null) {

    @Override
        }
    @Override
        @Override
import org.jkiss.code.Nullable;
            return null;
            }

}        }
    }
        return readOnly;
        this.buffer = new StringBuilder(value);
        public void setContents(IProgressMonitor monitor, InputStream stream) throws CoreException {
        if (adapter == IStorage.class) {
import org.eclipse.ui.IStorageEditorInput;

        return DBeaverIcons.getImageDescriptor(DBIcon.TREE_INFO);
 * limitations under the License.
        buffer.append(text);
    @Override

        public <T> T getAdapter(Class<T> adapter) {
            }
        @Override
        this.readOnly = readOnly;
    @Nullable
            return new ByteArrayInputStream(buffer.toString().getBytes(charset));
 * Copyright (C) 2010-2024 DBeaver Corp and others
    protected void handleContentSave(IProgressMonitor monitor) throws CoreException {
        public IPath getFullPath() {
    public IPersistableElement getPersistable() {
    @Override
        return true;

/**
        public String getName() {
    private final String name;
            properties.remove(name);
    }

import java.io.IOException;
import java.io.ByteArrayOutputStream;


 *
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
 */

    public AbstractStorageEditorInput(String name, CharSequence value, boolean readOnly, String charset) {
        return null;

 * you may not use this file except in compliance with the License.
        buffer.setLength(0);
import java.util.Map;
    }

        return storage;
    }
    }
        public boolean isReadOnly() {
    }
    @Override
        return name;
 *
    private final Charset charset;
                buffer.append(baos.toString(charset));
import org.eclipse.core.resources.IStorage;
/*
     * Method declared on IEditorInput.
        }
    private final Map<String, Object> properties = new HashMap<>();
 * Licensed under the Apache License, Version 2.0 (the "License");

                handleContentSave(monitor);
        @Override
        }
 * DBeaver - Universal Database Manager
        if (value == null) {
    private boolean readOnly;
            return buffer.length();
 *     http://www.apache.org/licenses/LICENSE-2.0

        return null;
    public void setProperty(@NotNull String name, @Nullable Object value) {
import java.io.ByteArrayInputStream;
    }
    @Override
    public Object getProperty(String name) {
    public class StringStorage implements IPersistentStorage, IEncodedStorage {
    public void setReadOnly(boolean readOnly) {
            } catch (IOException e) {
        }
import org.jkiss.code.NotNull;
        return name;
            return readOnly;
        }

        }

        public InputStream getContents() {
        public void setString(String str) {
        return buffer.toString(); //$NON-NLS-1$ //$NON-NLS-2$
    }
import org.jkiss.dbeaver.utils.GeneralUtils;
        this.name = name;
        public int getLength() {
    }
                throw new CoreException(GeneralUtils.makeExceptionStatus(e));


    @Override
import org.jkiss.dbeaver.runtime.IPersistentStorage;
public abstract class AbstractStorageEditorInput implements IStorageEditorInput, IInMemoryEditorInput {
