		return name;
	@Override
        @Override
        this.value = value;

 * Unless required by applicable law or agreed to in writing, software
	}


	public int hashCode() {
        }
		return Arrays.hashCode(value);
import org.eclipse.ui.IEditorInput;
import org.jkiss.dbeaver.utils.GeneralUtils;
        public boolean isReadOnly()

public class BinaryEditorInput implements IEditorInput, IStorageEditorInput {
    public String toString() {
            return readOnly;
	public boolean equals(Object obj) {

 * limitations under the License.
/*
            return null;
        if (storage == null) {
        this.name = name;
		return null;
            return new ByteArrayInputStream(value);

import org.eclipse.ui.IStorageEditorInput;
        @Override

		return null;

        @Override
        @Override
        }
        }
	@Override
    public String getToolTipText() {
	}
        this.encoding = encoding;
		return true;
 * DBeaver - Universal Database Manager
import org.eclipse.jface.resource.ImageDescriptor;
		}
    public BinaryEditorInput(String name, byte[] value, boolean readOnly, String encoding) {
		BinaryEditorInput other = (BinaryEditorInput) obj;
            return name;

 */
        {
 *     http://www.apache.org/licenses/LICENSE-2.0
                throw new CoreException(GeneralUtils.makeExceptionStatus(e));
                IOUtils.copyStream(stream, baos);

	}
	@Override
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.runtime.IPersistentStorage;
import org.eclipse.core.runtime.CoreException;
    public ImageDescriptor getImageDescriptor() {
    public IPersistableElement getPersistable() {
	public IStorage getStorage() {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
			return false;
        }
 *
    private boolean readOnly;
	}
            try {
 *
    @Override
 * you may not use this file except in compliance with the License.
    public boolean exists() {

import org.eclipse.core.resources.IStorage;
		if (!(obj instanceof BinaryEditorInput)) {
import java.io.IOException;

package org.jkiss.dbeaver.ui.editors;
*/
}
	}
	}

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
import org.eclipse.core.resources.IEncodedStorage;
		return new String(value);
    private IStorage storage;
        }
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.core.runtime.IProgressMonitor;
import org.jkiss.dbeaver.model.DBIcon;
import java.io.InputStream;
            value = baos.toByteArray();
/*

            return adapter.cast(getStorage());
        {
	}
import org.eclipse.ui.IPersistableElement;
        @Override
		return storage;
            storage = new ByteStorage();
 *

        public String getCharset() throws CoreException {

	}
 * See the License for the specific language governing permissions and
import java.io.ByteArrayInputStream;
    public byte[] getValue() {
		return name;
import org.jkiss.utils.IOUtils;
    }
			return true;
	}
import org.jkiss.dbeaver.ui.DBeaverIcons;
	@Override

 * distributed under the License is distributed on an "AS IS" BASIS,
    public <T> T getAdapter(Class<T> adapter) {
        public void setContents(IProgressMonitor monitor, InputStream stream) throws CoreException {
    private String encoding;
        @Override
        @Override
		return DBeaverIcons.getImageDescriptor(DBIcon.TREE_INFO);
    private byte[] value;
        {
        return value;
		return Arrays.equals(value, other.value);
        public <T> T getAdapter(Class<T> adapter)
        this.readOnly = readOnly;
 * BinaryEditorInput

	}
	@Override
import java.io.ByteArrayOutputStream;
        }
	}
            }
		if (this == obj) {
        public IPath getFullPath()
    private String name;
        {
        if (adapter == IStorage.class) {

        public String getName()
    public String getName() {
    }
		}
/**

import org.eclipse.core.runtime.IPath;
        public InputStream getContents() throws CoreException
        {
 */


    @Override
            return null;
    private class ByteStorage implements IPersistentStorage,IEncodedStorage {
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
            } catch (IOException e) {
        }
            return encoding;

