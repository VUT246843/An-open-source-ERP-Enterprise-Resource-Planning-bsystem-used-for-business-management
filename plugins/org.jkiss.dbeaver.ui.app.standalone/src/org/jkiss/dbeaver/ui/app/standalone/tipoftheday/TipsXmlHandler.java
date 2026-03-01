
            }
import org.xml.sax.helpers.DefaultHandler;
import org.jkiss.utils.CommonUtils;
    }
        }
            tipTagContent.append(TAG_BRACKET_END);
            this.tipTagStarted = false;
            String description = ActionUtils.findCommandDescription(commandId, PlatformUI.getWorkbench(), false);
import org.jkiss.utils.ArrayUtils;

}
package org.jkiss.dbeaver.ui.app.standalone.tipoftheday;
            }
 * You may obtain a copy of the License at
import java.util.Arrays;
    private final List<String> tips = new ArrayList<>();
            this.tipApplicable = true;
        if (qName.equalsIgnoreCase(TIP)) {
    private static final Log log = Log.getLog(TipsXmlHandler.class);
    public TipsXmlHandler() {
                log.error("No command found by id: " + commandId + ". Consider removing obsolete tip or fixing command id.");
import org.xml.sax.SAXException;
    @Override
            tipTagContent = new StringBuilder();
    public List<String> getTips() {
    public void endElement(String uri, String localName, String qName) throws SAXException {
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (qName.equalsIgnoreCase(TIP)) {
        if (HTML_TAGS.contains(qName) && tipTagStarted) {
    private static final String TAG_BRACKET_END = ">";
                this.tipApplicable = ArrayUtils.contains(tipProducts.split(","), productEdition);
            }
            tipTagContent.append(new String(ch, start, length));
            } else {
 * limitations under the License.
    private static final List<String> HTML_TAGS = Arrays.asList("br", "b", "i", "u", "q", "a", "p", "div");
            String commandId = attributes.getValue(COMMAND_ID);
import org.eclipse.ui.PlatformUI;
import java.util.List;

    }

    private boolean tipTagStarted;
/*
                tipTagContent.append("<b>").append(description).append("</b>");

public class TipsXmlHandler extends DefaultHandler {
    @Override

import org.jkiss.utils.xml.XMLUtils;
    private static final String SLASH = "/";
    private final String productEdition;

import org.jkiss.dbeaver.ui.ActionUtils;
    private static final String COMMAND_ID = "commandId";
    private static final String COMMAND_REF = "commandRef";

    }
            }
            if (tipApplicable) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (HTML_TAGS.contains(qName) && tipTagStarted) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    private StringBuilder tipTagContent = new StringBuilder();
import org.eclipse.core.runtime.Platform;
            if (!CommonUtils.isEmpty(tipProducts) && !CommonUtils.isEmpty(productEdition)) {
    @Override
import org.jkiss.dbeaver.Log;
            tipTagContent.append(TAG_BRACKET_BEGIN).append(SLASH).append(qName).append(TAG_BRACKET_END);
            tipTagContent.append(TAG_BRACKET_BEGIN).append(qName);
        productEdition = Platform.getProduct().getProperty("appEdition");
    private boolean tipApplicable;
                tipTagContent.append(" ").append(attributes.getQName(i)).append("=\"").append(XMLUtils.escapeXml(attributes.getValue(i))).append("\"");
        }
        if (tipTagStarted) {
import org.xml.sax.Attributes;

            if (!CommonUtils.isEmpty(description)) {
            this.tipApplicable = true;
        } else if (qName.equalsIgnoreCase(COMMAND_REF)) {
                this.tips.add(tipTagContent.toString());
    }
 * DBeaver - Universal Database Manager
import java.util.ArrayList;
            String tipProducts = attributes.getValue("product");
 * See the License for the specific language governing permissions and
    private static final String TIP = "tip";
    public void characters(char[] ch, int start, int length) throws SAXException {
 * Unless required by applicable law or agreed to in writing, software

 *
    private static final String TAG_BRACKET_BEGIN = "<";
 *
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2025 DBeaver Corp and others

        }
 */
    }
            for (int i = 0; i < attributes.getLength(); i++) {
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            this.tipTagStarted = true;
        return tips;

 * you may not use this file except in compliance with the License.
        }
