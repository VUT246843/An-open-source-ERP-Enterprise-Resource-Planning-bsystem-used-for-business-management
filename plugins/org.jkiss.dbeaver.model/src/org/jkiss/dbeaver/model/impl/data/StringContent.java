        }
import org.jkiss.dbeaver.model.data.storage.StringContentStorage;
            throw new DBCException("IO error while reading content", e);
import org.jkiss.dbeaver.model.data.DBDContentStorage;

    public boolean isNull() {
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    private StringContentStorage storage;
    @Override
public class StringContent extends AbstractContent {
    }
    public String getDisplayString(@NotNull DBDDisplayFormat format) {
    @Override
import org.jkiss.dbeaver.utils.MimeTypes;
    }
 */
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
 * StringContent
    @Override
 * @author Serge Rider
            try (Reader reader = storage.getContentReader()) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
import org.jkiss.dbeaver.model.exec.DBCException;
                ContentUtils.copyStreams(reader, storage.getContentLength(), sw, monitor);
package org.jkiss.dbeaver.model.impl.data;
import java.io.StringWriter;

    @Override
    public String getContentType() {
 *
    public long getContentLength() throws DBCException {
        super(executionContext);

/**

import org.jkiss.dbeaver.utils.ContentUtils;
    @Override
    public StringContent(DBCExecutionContext executionContext, String data) {
    public void release() {
    @Override


 *
        }
        return storage.getCachedValue() == null;
 * Unless required by applicable law or agreed to in writing, software
        return MimeTypes.TEXT_PLAIN;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        return storage.getCachedValue();

    @NotNull
    public DBDContentStorage getContents(@NotNull DBRProgressMonitor monitor) throws DBCException {
                this.storage = new StringContentStorage(sw.toString());
    }
    }
/*
        catch (IOException e) {
 *
                StringWriter sw = new StringWriter((int)storage.getContentLength());
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
    }

 * DBeaver - Universal Database Manager

        try {
        return storage.getContentLength();
 * limitations under the License.
        return storage;
    public String getRawValue() {
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
import java.io.IOException;

            }
        return storage.getCachedValue();
}
    @Override
 * You may obtain a copy of the License at
import java.io.Reader;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
    }

        this.storage = new StringContentStorage(data);
 * Copyright (C) 2010-2024 DBeaver Corp and others


    public boolean updateContents(@NotNull DBRProgressMonitor monitor, @NotNull DBDContentStorage storage) throws DBException {
import org.jkiss.code.NotNull;
    }
 */
        return true;
