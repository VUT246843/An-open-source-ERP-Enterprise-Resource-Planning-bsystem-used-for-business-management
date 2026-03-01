 * Unless required by applicable law or agreed to in writing, software
import javax.xml.transform.TransformerFactory;
    XMLFormattingStrategy() {
            spf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
 *
}
                return content;
 * See the License for the specific language governing permissions and
 */
/**
public class XMLFormattingStrategy extends ContextBasedFormattingStrategy {
            return content;
 *
import org.jkiss.dbeaver.Log;

import org.eclipse.jface.text.formatter.ContextBasedFormattingStrategy;
import javax.xml.transform.Source;
    }
        if (CommonUtils.isEmpty(content)) {
    }
            Transformer transformer = transformerFactory.newTransformer();

    @Override
 * you may not use this file except in compliance with the License.
    public void formatterStarts(String initialIndentation) {

import javax.xml.transform.sax.SAXSource;
 * You may obtain a copy of the License at


 *
            transformerFactory.setAttribute("indent-number", 2);
            if (!content.contains("<?xml")) {
            if (CommonUtils.isEmpty(resultString)) {
                transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
import org.xml.sax.InputSource;
import javax.xml.transform.stream.StreamResult;
 *     http://www.apache.org/licenses/LICENSE-2.0
import javax.xml.transform.OutputKeys;
            log.debug("Error formatting XML: " + e.getMessage());
 * DBeaver - Universal Database Manager
            transformer.transform(src, result);

            SAXParserFactory spf = SAXParserFactory.newInstance();
 * Licensed under the Apache License, Version 2.0 (the "License");
            Source src = new SAXSource(spf.newSAXParser().getXMLReader(), new InputSource(new StringReader(content)));


 * The formatting strategy that transforms SQL keywords to upper case
    public void formatterStops() {
            spf.setNamespaceAware(true);
import java.io.StringReader;
        try {


 * limitations under the License.

import java.io.StringWriter;
    private static final Log log = Log.getLog(XMLFormattingStrategy.class);

        }
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
import org.jkiss.utils.CommonUtils;
/*
            return content;
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
    @Override
            return resultString.replaceAll("(?m)^[ \\t]*\\r?\\n", ""); // Replace all empty lines
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
        } catch (Throwable e) {
import javax.xml.transform.Transformer;
package org.jkiss.dbeaver.ui.editors.xml;
import javax.xml.XMLConstants;
    @Override
            String resultString = result.getWriter().toString();
    }
    public String format(String content, boolean isLineStart, String indentation, int[] positions) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        }
    }
import javax.xml.parsers.SAXParserFactory;
            StreamResult result = new StreamResult(new StringWriter());
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
