

    public static final String ATTR_REF_NAME = "ref-name";
                        if (dataSourceContainer != null) {

 * Licensed under the Apache License, Version 2.0 (the "License");
    public static final String TAG_COLUMN = "column";
        {
 * See the License for the specific language governing permissions and
    public static final String TAG_DATA_SOURCE = "data-source";
 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public static final String ATTR_H = "h";
    public static final String ATTR_TRANSPARENT = "transparent";
                    if (!CommonUtils.isEmpty(dsId)) {
    public static final String TAG_BEND = "bend";
    public static final String ATTR_W = "w";
    public static List<DBPDataSourceContainer> extractContainers(DBPProject project, InputStream is)
 */
                    }
                        }
    public static final String ATTR_VERSION = "version";
                        final DBPDataSourceContainer dataSourceContainer = project.getDataSourceRegistry().getDataSource(dsId);
/*
                    String dsId = dsElem.getAttribute(ATTR_ID);
    public static final String ATTR_COLOR_FG = "color-fg";

    public static final String ATTR_TYPE = "type";
import org.w3c.dom.Document;
                // Parse data source
import java.util.ArrayList;
    {
    public static final String ATTR_ID = "id";
    public static final String ATTR_FK_REF = "fk-ref";
import java.util.List;
import org.jkiss.utils.xml.XMLUtils;
    public static final String ATTR_ORDER = "order";
    public static final String ATTR_TIME = "time";
    public static final int ERD_VERSION_1 = 1;
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.io.InputStream;
    public static final String TAG_NOTE = "note";
    public static final String ATTR_BORDER_WIDTH = "border-width";

    public static final String ATTR_NAME = "name";
/**
    public static final String ATTR_FQ_NAME = "fq-name";
    public static final String TAG_RELATIONS = "relations";
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public static final String ATTR_X = "x";
    public static final String ATTR_ATTRIBUTE_VISIBILITY = "showAttrs";
                for (Element dsElem : XMLUtils.getChildElementList(entitiesElem, TAG_DATA_SOURCE)) {
public class ERDPersistedState {
    public static final String ATTR_ALIAS = "alias";
        }
    public static final String TAG_ENTITY = "entity";
/*
 *
    }
 *
            }
package org.jkiss.dbeaver.model.erd;
import org.jkiss.dbeaver.DBException;
 * you may not use this file except in compliance with the License.
    public static final String ATTR_PK_REF = "pk-ref";
 * Created on Jul 13, 2004
 */
 */
    public static final String ATTR_COLOR_BG = "color-bg";
        List<DBPDataSourceContainer> containers = new ArrayList<>();
            final Document document = XMLUtils.parseDocument(is);
 *     http://www.apache.org/licenses/LICENSE-2.0
                        // Get connected datasource
    public static final String ATTR_Y = "y";
                            containers.add(dataSourceContainer);
}
import org.jkiss.utils.xml.XMLException;
import java.io.IOException;
import org.jkiss.dbeaver.model.app.DBPProject;
    public static final String ATTR_FONT = "font";
 * Unless required by applicable law or agreed to in writing, software

        return containers;
    public static final String TAG_RELATION = "relation";

 * Entity diagram loader/saver
    public static final String BEND_ABSOLUTE = "abs";
 * limitations under the License.
    public static final String TAG_PATH = "path";

                }
        throws IOException, XMLException, DBException

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 *
    public static final String TAG_NOTES = "notes";
 * DBeaver - Universal Database Manager
    public static final String BEND_RELATIVE = "rel";
    public static final String TAG_DIAGRAM = "diagram";
            final Element diagramElem = document.getDocumentElement();
import org.w3c.dom.Element;
import org.jkiss.utils.CommonUtils;

            if (entitiesElem != null) {
    public static final String TAG_ENTITIES = "entities";
            final Element entitiesElem = XMLUtils.getChildElement(diagramElem, TAG_ENTITIES);

