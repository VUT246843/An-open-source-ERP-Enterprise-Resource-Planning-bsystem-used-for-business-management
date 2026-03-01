import org.jkiss.utils.xml.XMLUtils;
 * Unless required by applicable law or agreed to in writing, software
            }
 * DBeaver - Universal Database Manager
 */

    public PostgrePlanNodeXML(DBPDataSource dataSource, PostgrePlanNodeXML parent, Element element) {
 * See the License for the specific language governing permissions and
        setAttributes(attributes);
import java.util.LinkedHashMap;
import org.w3c.dom.Element;
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            if (child instanceof Element && !"Plans".equals(child.getNodeName())) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        for (Node child = element.getFirstChild(); child != null; child = child.getNextSibling()) {
        }
        super(dataSource, parent);
        if (nestedPlansElement != null) {
 * you may not use this file except in compliance with the License.
 *
import org.w3c.dom.Node;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.DBPDataSource;
            for (Element planElement : XMLUtils.getChildElementList(nestedPlansElement, "Plan")) {

import java.util.Map;
 * distributed under the License is distributed on an "AS IS" BASIS,
        Element nestedPlansElement = XMLUtils.getChildElement(element, "Plans");
        }

 *
    }
            }
/**
 * Postgre execution plan node

                attributes.put(child.getNodeName(), child.getTextContent());
 * limitations under the License.
public class PostgrePlanNodeXML extends PostgrePlanNodeBase<PostgrePlanNodeXML> {
 * You may obtain a copy of the License at


/*
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
}
package org.jkiss.dbeaver.ext.postgresql.model.plan;
                nested.add(new PostgrePlanNodeXML(dataSource, null, planElement));

        Map<String, String> attributes = new LinkedHashMap<>();
