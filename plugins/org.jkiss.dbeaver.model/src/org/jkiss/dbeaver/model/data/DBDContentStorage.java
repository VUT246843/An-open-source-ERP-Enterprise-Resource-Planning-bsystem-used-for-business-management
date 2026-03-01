 *     http://www.apache.org/licenses/LICENSE-2.0


}

    String getCharset();
/**
package org.jkiss.dbeaver.model.data;
 * you may not use this file except in compliance with the License.
    InputStream getContentStream() throws IOException;

 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
 *
    long getContentLength() throws IOException;

import java.io.InputStream;
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software

    DBDContentStorage cloneStorage(DBRProgressMonitor monitor) throws IOException;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.io.IOException;
 * You may obtain a copy of the License at
 * Content storage

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import java.io.Reader;
 * @author Serge Rider
    Reader getContentReader() throws IOException;

    void release();
public interface DBDContentStorage {
 *
 */

 * distributed under the License is distributed on an "AS IS" BASIS,
/*

 * See the License for the specific language governing permissions and
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
