        return true;
            return resultString;
import javax.xml.transform.stream.StreamResult;
            if (!value.contains("<?xml")) {


            }
    protected XMLEditor createEditorParty(IValueController valueController) {
            if (child.getNodeType() == Node.TEXT_NODE) {

    }
            }
    @Override
import org.eclipse.ui.PartInitException;
        } catch (Throwable e) {
 * DBeaver - Universal Database Manager
        return new XMLEditor() {
    }
                }
                try {
 * Unless required by applicable law or agreed to in writing, software
import org.w3c.dom.Node;
    public boolean supportMinify() {
import java.io.StringReader;
 * See the License for the specific language governing permissions and
            return value;
import org.w3c.dom.Document;
            Node child = childNodes.item(i);
                removeWhitespaceNodes(child);
 * You may obtain a copy of the License at
            Document document = builder.parse(new org.xml.sax.InputSource(new StringReader(value)));
                } catch (CoreException e) {

import org.w3c.dom.NodeList;
    }
        return ".xml";
            Transformer transformer = transformerFactory.newTransformer();
import javax.xml.transform.OutputKeys;
 * you may not use this file except in compliance with the License.
    private static void removeWhitespaceNodes(Node node) {


            String resultString = writer.toString();
                setSite(site);
                    throw new PartInitException("Error initializing panel XML editor", e);
    protected String getFileExtension() {
    @Override
import javax.xml.transform.Transformer;
            StringWriter writer = new StringWriter();

import java.io.StringWriter;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import org.eclipse.core.runtime.CoreException;
*/
 *
            DocumentBuilder builder = factory.newDocumentBuilder();
            transformer.transform(new DOMSource(document), new StreamResult(writer));
import org.w3c.dom.CDATASection;
            factory.setIgnoringElementContentWhitespace(true);
 * Licensed under the Apache License, Version 2.0 (the "License");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        NodeList childNodes = node.getChildNodes();
        }
        };
    public String minify(String value) {
* XMLPanelEditor
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
import org.jkiss.utils.CommonUtils;
                if (child.getNodeValue().isBlank()) {
                return value;
/**
 */
            @Override
import org.jkiss.dbeaver.ui.editors.xml.XMLEditor;
import org.jkiss.dbeaver.ui.data.managers.AbstractTextPanelEditor;
            } else if (child.getNodeType() == Node.ELEMENT_NODE) {
 *     http://www.apache.org/licenses/LICENSE-2.0
import javax.xml.parsers.DocumentBuilderFactory;
                }

            }
    protected String getFileFolderName() {
                    node.removeChild(child);
    }
/*
        }
                transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
import org.eclipse.ui.IEditorInput;




import org.jkiss.dbeaver.ui.data.IValueController;
            if (CommonUtils.isEmpty(resultString)) {
}
            removeWhitespaceNodes(document.getDocumentElement());
            }
 *
            TransformerFactory transformerFactory = TransformerFactory.newInstance();

        for (int i = childNodes.getLength() - 1; i >= 0; i--) {
 *
import org.eclipse.ui.IEditorSite;
import javax.xml.transform.TransformerFactory;
 * limitations under the License.
    }
        try {
import javax.xml.parsers.DocumentBuilder;
    @Override
    }

            public void init(IEditorSite site, IEditorInput input) throws PartInitException {
public class XMLPanelEditor extends AbstractTextPanelEditor<XMLEditor> {
        // Override init function because standard is VEEERY slow
package org.jkiss.dbeaver.ui.data.managers.stream;
        return "dbeaver-xml";
 * Copyright (C) 2010-2024 DBeaver Corp and others
import javax.xml.transform.dom.DOMSource;
            transformer.setOutputProperty(OutputKeys.INDENT, "no");
    @Override
                    doSetInput(input);
