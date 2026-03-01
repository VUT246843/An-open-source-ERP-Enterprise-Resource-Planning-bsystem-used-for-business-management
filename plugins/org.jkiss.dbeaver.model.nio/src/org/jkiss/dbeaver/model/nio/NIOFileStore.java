    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
    @Override
    @Override
        throw new UnsupportedEncodingException();
import java.nio.file.FileStore;

}
 * See the License for the specific language governing permissions and
public abstract class NIOFileStore extends FileStore {
    public long getUsableSpace() throws IOException {
/*

 *
    public boolean supportsFileAttributeView(Class<? extends FileAttributeView> type) {
import java.io.UnsupportedEncodingException;
import java.nio.file.attribute.FileAttributeView;

    public boolean supportsFileAttributeView(String name) {
        return false;
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
import java.io.IOException;
    public <V extends FileStoreAttributeView> V getFileStoreAttributeView(Class<V> type) {
        return false;
 */
 *
    }
    @Override
    }
 * you may not use this file except in compliance with the License.
    }
        return null;


    }
    }

    public Object getAttribute(String attribute) throws IOException {
 *
package org.jkiss.dbeaver.model.nio;
        throw new UnsupportedOperationException("Does not support the given attribute: " + attribute);
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public long getUnallocatedSpace() throws IOException {
    }
        throw new UnsupportedEncodingException();
    @Override

 * limitations under the License.
import java.nio.file.attribute.FileStoreAttributeView;
