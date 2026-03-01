 * you may not use this file except in compliance with the License.
    private static final String TABBED_FOLDER_STYLE = "TabbedFolderList { background-color: inherit; }";
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
            //engine.reapply();
        if (engine == null) {

        CSSEngine engine = WidgetElement.getEngine(display);
        try {
            return;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.w3c.dom.stylesheets.StyleSheet;
 *
            Reader reader = new StringReader(TABBED_FOLDER_STYLE);
import org.jkiss.dbeaver.Log;



 * limitations under the License.
        List<StyleSheet> sheets = new ArrayList<>();
 */
import org.eclipse.e4.ui.css.core.dom.ExtendedDocumentCSS;
    static void updateApplicationCSS(Display display) {
        }
/*
        }


        StyleSheetList list = doc.getStyleSheets();
    private static final Log log = Log.getLog(ApplicationCSSManager.class);

import org.w3c.dom.stylesheets.StyleSheetList;
            log.error(e);
class ApplicationCSSManager {
import org.eclipse.swt.widgets.Display;
import java.io.StringReader;
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            doc.removeAllStyleSheets();
 *
        } catch (Exception e) {
            }
            log.error("No CSSEngine");
 * Unless required by applicable law or agreed to in writing, software
            sheets.add(list.item(i));
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
            for (StyleSheet sheet : sheets) {
import org.eclipse.e4.ui.css.core.engine.CSSEngine;
 *     http://www.apache.org/licenses/LICENSE-2.0


 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
import java.io.Reader;
        ExtendedDocumentCSS doc = (ExtendedDocumentCSS) engine.getDocumentCSS();
import java.util.List;
        for (int i = 0; i < list.getLength(); i++) {
import java.util.ArrayList;
 * DBeaver - Universal Database Manager
            sheets.add(engine.parseStyleSheet(reader));
package org.jkiss.dbeaver.ui.app.standalone;
        }
                doc.addStyleSheet(sheet);
import org.eclipse.e4.ui.css.swt.dom.WidgetElement;

