        DBDContentStorage contents = content.getContents(monitor);
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    @NotNull
        return document.getDocumentContentType();

    public Object getDocumentProperty(String name) {
        return document.getRawValue();
    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    @Override
    @NotNull
    protected final DBDDocument document;
package org.jkiss.dbeaver.model.impl.data;
    }
import org.jkiss.code.NotNull;
import org.jkiss.code.Nullable;
public abstract class DBDDocumentContentProxy implements DBDDocument {
    public void updateDocument(@NotNull DBRProgressMonitor monitor, @NotNull Reader reader) throws IOException, DBException {
    @Override
    @Nullable
/*
        document.release();
    }
/**
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    protected abstract DBDDocument createDocumentFromContent(@NotNull DBDContent content) throws DBException;
            try (Reader reader = contents.getContentReader()) {
    }
                reader.transferTo(writer);
import java.io.IOException;

    public void serializeDocument(@NotNull DBRProgressMonitor monitor, @NotNull Writer writer) throws IOException, DBException {
    }
 * You may obtain a copy of the License at

    @Override
import java.io.StringReader;
    public void release() {

 * distributed under the License is distributed on an "AS IS" BASIS,
}

    protected DBDDocumentContentProxy(@NotNull DBDContent content) throws DBException {
import org.jkiss.utils.IOUtils;
    }
 *
 * you may not use this file except in compliance with the License.

    public boolean isNull() {
    @Override

    }
    public String getDocumentContentType() {
 */
import org.jkiss.dbeaver.model.data.DBDDocument;
    @Override


 * limitations under the License.
        content.updateContents(monitor, new StringContentStorage(data));
        return document.getDocumentProperty(name);
        document.updateDocument(monitor, new StringReader(data));

        return document.isModified();
    public Object getDocumentId() {

 * Content proxy document
 *
        }
import org.jkiss.dbeaver.model.data.storage.StringContentStorage;
import org.jkiss.dbeaver.model.data.DBDContent;
        return document.isNull();
    public Object getRawValue() {
 * Licensed under the Apache License, Version 2.0 (the "License");
    @NotNull
            }

    public Object getRootNode() {
    }
 */
import org.jkiss.dbeaver.model.data.DBDContentStorage;
    }
        if (contents != null) {
 *
    protected final DBDContent content;

 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
        return document.getDocumentId();
    @Override
 * DBeaver - Universal Database Manager
        var data = IOUtils.readToString(reader);
    }



    @Override
        this.content = content;
        this.document = createDocumentFromContent(content);
import java.io.Writer;
    @Override
    @Nullable
import java.io.Reader;
    @Override
import org.jkiss.dbeaver.DBException;
        return document.getRootNode();
    }
 * Unless required by applicable law or agreed to in writing, software
    public boolean isModified() {
