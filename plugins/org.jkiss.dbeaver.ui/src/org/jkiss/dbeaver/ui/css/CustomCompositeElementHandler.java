            }
}
        if (widget instanceof Control ctrl && !UIUtils.isInDialog(ctrl)) {
import org.eclipse.e4.ui.css.core.engine.CSSEngine;
        super.applyCSSPropertyBackgroundColor(element, value, pseudo, engine);
        }

        return CSSUtils.isDatabaseColored(widget);
        CSSEngine engine
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
 */
 *
import org.w3c.dom.css.CSSValue;

 * distributed under the License is distributed on an "AS IS" BASIS,

        Object element,
 * Copyright (C) 2010-2025 DBeaver Corp and others
    ) throws Exception {
        Widget widget = SWTElementHelpers.getWidget(element);
import org.eclipse.swt.widgets.Widget;
    }
 * you may not use this file except in compliance with the License.
                }
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.e4.ui.css.swt.helpers.SWTElementHelpers;
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.ui.css;
                if (newColor != null) {
/**
import org.eclipse.swt.widgets.Control;
        String pseudo,
    protected boolean isBackgroundByConnectionType(Control ctrl, Widget widget) {
    }
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
    @Override
import org.eclipse.swt.graphics.Color;
public abstract class CustomCompositeElementHandler extends CSSPropertyBackgroundSWTHandler {
 *


 * Needed to override theme styles.
                Color newColor = CSSUtils.getCurrentEditorConnectionColor(widget);
            if (isBackgroundByConnectionType(ctrl, widget)) {
/*
 */
 *
        CSSValue value,

                    ctrl.setBackground(newColor);
                    return;
 * For now it's used only for coloring widgets regarding the connection type color.
import org.eclipse.e4.ui.css.swt.properties.css2.CSSPropertyBackgroundSWTHandler;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void applyCSSPropertyBackgroundColor(
import org.jkiss.dbeaver.ui.UIUtils;
