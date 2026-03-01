    }
                    return UIUtils.getConnectionColor(dsc.getConnectionConfiguration());
 */


 *

        }
        }
     */
        boolean colorByConnectionType = COLORED_BY_CONNECTION_TYPE.equals(getCSSClass(widget));
        return null;
                }

 *
        return colorByConnectionType;
        widget.setData(CSSSWTConstants.CSS_CLASS_NAME_KEY, value);
import org.eclipse.swt.widgets.Composite;
package org.jkiss.dbeaver.ui.css;
 * you may not use this file except in compliance with the License.
    public static String getCSSClass(Widget widget){
 * Licensed under the Apache License, Version 2.0 (the "License");

    public static boolean isDatabaseColored(Widget widget) {
 * DBeaver - Universal Database Manager
            colorByConnectionType = COLORED_BY_CONNECTION_TYPE.equals(getCSSClass(tb));
            for (Control c = control; c != null; c = c.getParent()) {
    public static final String EXCLUDED_FROM_STYLING = "excludedFromStyling";
        if (widget != null && !widget.isDisposed()) {
 * See the License for the specific language governing permissions and
            // Some UI issues. Probably workbench window or page wasn't yet created
    }
        return (widget.getData(EXCLUDED_FROM_STYLING) == Boolean.TRUE);
    public static Color getCurrentEditorConnectionColor(Widget widget) {
    /**
        // sometimes eclipse overrides css class of the controls, so let's check for the toolbar's css class too
     * Set value to a widget as a CSSSWTConstants.CSS_CLASS_NAME_KEY value.
import org.jkiss.dbeaver.ui.UIUtils;
/*
    }
}
import org.eclipse.swt.widgets.ToolBar;
        }
    public static final String DATABASE_EDITOR_COMPOSITE_DATASOURCE = "databaseEditorCompositeBackground";
        if (!colorByConnectionType && widget instanceof Composite c && c.getParent() instanceof ToolBar tb) {
            }
    }

    public static void setCSSClass(Widget widget, String value){
    public static void markConnectionTypeColor(Widget widget) {
        if (!(widget instanceof Control control)) {
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                Object data = c.getData(DATABASE_EDITOR_COMPOSITE_DATASOURCE);

 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.e4.ui.css.swt.CSSSWTConstants;
    public static void setExcludeFromStyling(Widget widget) {
    }
    }
public class CSSUtils {
import org.eclipse.swt.widgets.Control;

 * distributed under the License is distributed on an "AS IS" BASIS,
        try {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0


 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
            widget.setData(CSSSWTConstants.CSS_CLASS_NAME_KEY, COLORED_BY_CONNECTION_TYPE);
import org.eclipse.swt.widgets.Widget;
        }
import org.eclipse.swt.graphics.Color;
        widget.setData(EXCLUDED_FROM_STYLING, Boolean.TRUE);
        return (String) widget.getData(CSSSWTConstants.CSS_CLASS_NAME_KEY);
        } catch (Exception e) {
                if (data instanceof DBPDataSourceContainer dsc) {
    public static boolean isExcludeFromStyling(Widget widget){
    }
 * limitations under the License.
    public static final String COLORED_BY_CONNECTION_TYPE = "coloredByConnectionType";
            return null;
