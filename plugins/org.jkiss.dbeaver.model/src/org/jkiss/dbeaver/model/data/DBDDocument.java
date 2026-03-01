     * @throws DBException on DB error
} * limitations under the License.
 * You may obtain a copy of the License at

import org.jkiss.dbeaver.DBException;

     * @throws DBException on DB error
    /**
    String PROP_TITLE = "title";
     * @return root node


    Object getRootNode();

     */
    Object getDocumentProperty(String name);
     * Root node of document
    /**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull
 * DBeaver - Universal Database Manager
import org.jkiss.code.NotNull;
    /**
     * @throws IOException on IO error
 *
 *
 * List item is a value.
    @NotNull
     * Document content type (mime type).
     */

 * Map key is always a string, value is a node.
     */
     *
 */
import java.io.Writer;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
     *

    void updateDocument(@NotNull DBRProgressMonitor monitor, @NotNull Reader reader) throws IOException, DBException;
 * Unless required by applicable law or agreed to in writing, software
     * @param reader  reader to read document from
 * Document is a set of hierarchically organized nodes - similarly to JSON.
    String PROP_ID = "id";
 *
import java.io.IOException;
    /**
public interface DBDDocument extends DBDValue {

    String PROP_CREATE_TIME = "createTime";
 * distributed under the License is distributed on an "AS IS" BASIS,
     * @throws IOException on IO error
     * Updates document from stream

 * you may not use this file except in compliance with the License.
     */
    void serializeDocument(@NotNull DBRProgressMonitor monitor, @NotNull Writer writer) throws IOException, DBException;

     * @return content type
package org.jkiss.dbeaver.model.data;
/**

     * @param monitor progress monitor
    String PROP_ID_ATTRIBUTE_NAME = "idAttributeName";
     * Document property
    @Nullable
     * @param name    property name
import org.jkiss.code.Nullable;
     */
     * @param writer  writer to serialize document into
    /**
 *     http://www.apache.org/licenses/LICENSE-2.0
    String getDocumentContentType();
import java.io.Reader;
    Object getDocumentId();
     * @return property value
 */
     * @param monitor progress monitor
/*
 * Document.
 * See the License for the specific language governing permissions and
    @Nullable
 * Each node can be a map, a list (collection) or a value (anything else).
     * Serializes document into stream
