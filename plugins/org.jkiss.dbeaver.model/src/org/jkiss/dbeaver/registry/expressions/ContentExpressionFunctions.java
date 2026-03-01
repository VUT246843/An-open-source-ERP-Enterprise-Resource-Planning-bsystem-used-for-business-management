                return ((Node) result).getNodeValue();
        XMLExpressionResultType(String name, QName constant) {
            resultType = XMLExpressionResultType.STRING;
 * limitations under the License.
import java.util.ArrayList;
 *
        return null;
 *

                List<String> valuesList = new ArrayList<>();
            if (result instanceof NodeList) {
import java.sql.SQLException;
        }


            }
import org.jkiss.dbeaver.model.data.DBDContent;
import com.google.gson.Strictness;
    public static Object json(Object object) {
    private static final Log log = Log.getLog(ContentExpressionFunctions.class);

    public static Object xml(Object object, String returnType, String expression) {
import org.w3c.dom.Node;
import org.jkiss.dbeaver.Log;
            }
            }
        }
package org.jkiss.dbeaver.registry.expressions;
import java.util.List;
        BOOLEAN("boolean", XPathConstants.BOOLEAN),
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
            } else {

        String name;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        public static XMLExpressionResultType fromValue(String value) {

                xmlValue = rawValue.toString();
    private enum XMLExpressionResultType {
 * Unless required by applicable law or agreed to in writing, software
            log.error("Can't parse XML value", e);
import javax.xml.xpath.XPathExpressionException;
            return null;
import javax.xml.xpath.XPathFactory;
    public static Object xml(Object object, String expression) {
            throw new IllegalArgumentException(value);
 *     http://www.apache.org/licenses/LICENSE-2.0
            XPath xPath = XPathFactory.newInstance().newXPath();
                for (int i = 0; i < nodeList.getLength(); i++) {
                NodeList nodeList = (NodeList) result;
import com.google.gson.Gson;
                if (type.name.equalsIgnoreCase(value)) {
        NUMBER("number", XPathConstants.NUMBER),
    }
            return constant;
import com.google.gson.GsonBuilder;
import java.io.StringReader;
        if (object == null || CommonUtils.isEmpty(expression) ||
            }
            if (result instanceof Node) {
        public QName getConstant() {
 * you may not use this file except in compliance with the License.
 *
            String xmlValue;
    }
            Document document = XMLUtils.parseDocument(new StringReader(xmlValue));
        return xml(object, "string", expression);
                }
import org.jkiss.utils.xml.XMLUtils;
        }
}
            return result;
        .setPrettyPrinting()
import javax.xml.xpath.XPath;
import org.w3c.dom.NodeList;
 * DBeaver - Universal Database Manager
            if (rawValue instanceof SQLXML) {
            Object result = xPath.evaluate(expression, document, resultType.getConstant());

                }
        .create();
 * See the License for the specific language governing permissions and
        .setStrictness(Strictness.LENIENT)
        }
    private static final Gson GSON = new GsonBuilder()
        }
import org.jkiss.dbeaver.model.data.json.JSONUtils;

            for (XMLExpressionResultType type : XMLExpressionResultType.values()) {
        if (resultType == null) {
            Object rawValue = ((DBDContent) object).getRawValue();

            return null;
import org.jkiss.dbeaver.utils.MimeTypes;
/*
        XMLExpressionResultType resultType = XMLExpressionResultType.fromValue(returnType);

        NODESET("nodeset", XPathConstants.NODESET);
 * You may obtain a copy of the License at

        QName constant;

            this.constant = constant;
            this.name = name;
        try {
import org.jkiss.utils.xml.XMLException;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import javax.xml.namespace.QName;
        } catch (XMLException | XPathExpressionException | SQLException e) {
                    return type;
    }
        NODE("node", XPathConstants.NODE),
                xmlValue = ((SQLXML) rawValue).getString();
                    valuesList.add(nodeList.item(i).getNodeValue());
import org.w3c.dom.Document;
    }
        if (object == null) {
            !(object instanceof DBDContent) || !((DBDContent) object).getContentType().equals(MimeTypes.TEXT_XML)
        STRING("string", XPathConstants.STRING),
import org.jkiss.utils.CommonUtils;
 */
import java.sql.SQLXML;
import javax.xml.xpath.XPathConstants;
        ) {
        }
        return JSONUtils.parseMap(GSON, new StringReader(object.toString()));
        .serializeNulls()
        }
public class ContentExpressionFunctions {
                return valuesList;
