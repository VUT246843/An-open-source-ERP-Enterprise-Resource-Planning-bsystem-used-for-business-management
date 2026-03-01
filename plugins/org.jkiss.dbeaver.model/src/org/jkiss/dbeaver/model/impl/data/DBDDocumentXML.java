        document = null;
 * distributed under the License is distributed on an "AS IS" BASIS,
        } catch (Exception e) {
        this.document = document;
/**
    }
 */
 * limitations under the License.

            document = (Document) output.getNode();
        } catch (Exception e) {
}
    @Override

        return document.getDocumentElement();
    @NotNull
    public void release() {
public class DBDDocumentXML implements DBDDocument {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return modified;
import javax.xml.transform.stream.StreamSource;
        if (PROP_ID.equals(name)) {
import javax.xml.transform.stream.StreamResult;
 * See the License for the specific language governing permissions and
/*

package org.jkiss.dbeaver.model.impl.data;
import java.io.Reader;
            Result output = new StreamResult(writer);
    @Override
import javax.xml.transform.dom.DOMResult;
    public Object getRawValue() {

import javax.xml.transform.Transformer;
 *
    }
            transformer.transform(
    @Override
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    public String getDocumentContentType() {
    }
import org.jkiss.dbeaver.DBException;
import java.io.Writer;

    public Object getRootNode() {

        return document == null;
import java.io.IOException;
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
    public Object getDocumentId() {
import org.jkiss.dbeaver.model.data.DBDDocument;
        }

                new StreamSource(reader),
import org.jkiss.code.Nullable;
        }
 *
    }
 * XML document
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
 * Licensed under the Apache License, Version 2.0 (the "License");

    @Override
    @Nullable

        try {
    private Document document;
 * you may not use this file except in compliance with the License.
                output);
    public void updateDocument(@NotNull DBRProgressMonitor monitor, @NotNull Reader reader) throws IOException, DBException {
import javax.xml.transform.Result;
    @Override
    @Override
 *

        }
        return document.getDocumentURI();
                new DOMSource(document),

    public boolean isModified() {
            return getDocumentId();
    @Override
import org.jkiss.code.NotNull;
    }

    }
 * DBeaver - Universal Database Manager

import org.w3c.dom.Document;
    @NotNull
            modified = true;
 * You may obtain a copy of the License at
    public DBDDocumentXML(Document document) {
    @Override
 */
    @Override



    }
    }
    }
    public Object getDocumentProperty(String name) {
        return document;
        try {
 * Unless required by applicable law or agreed to in writing, software

    @Override
                output);
    public void serializeDocument(@NotNull DBRProgressMonitor monitor, @NotNull Writer writer) throws IOException, DBException {
    }
    public boolean isNull() {
            throw new DBException("Error serializing XML document", e);
            DOMResult output = new DOMResult();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

    @Nullable
import javax.xml.transform.dom.DOMSource;
import org.jkiss.dbeaver.utils.MimeTypes;
    private boolean modified;
            throw new DBException("Error transforming XML document", e);
 * Copyright (C) 2010-2025 DBeaver Corp and others
        return null;
import javax.xml.transform.TransformerFactory;
            transformer.transform(
        return MimeTypes.TEXT_XML;
