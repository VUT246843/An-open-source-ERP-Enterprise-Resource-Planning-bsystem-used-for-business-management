    @Override
import org.eclipse.swt.custom.CCombo;
            return;
        CSSValue value,
 *     http://www.apache.org/licenses/LICENSE-2.0
            if (bgColor != null) {
            toolBar.setForeground(defForeground);
            }
import org.eclipse.swt.graphics.Color;
            if (newColor != null) {
        return false;
        ) {

 * you may not use this file except in compliance with the License.
        return false;
            return true;
            // FIXME: it is a hack to set toolbar foreground explicitly.
        }
    private static boolean isExcludedFromStyling(Control ctrl) {
            return CommonUtils.isBitSet(ctrl.getStyle(), SWT.BORDER);
        }
            control = control.getParent();
//            if (CompositeElement.hasBackgroundOverriddenByCSS(control)) {
import org.jkiss.dbeaver.ui.UIUtils;
            return;
public class ConControlElementHandler extends CSSPropertyBackgroundSWTHandler {
            isOverridesBackground(ctrl)


                return;
import org.eclipse.swt.custom.StyledText;
            if (control instanceof ConComposite || CSSUtils.isDatabaseColored(control)) {
                return false;
    private boolean isOverridesBackground(@NotNull Control control) {
 *
        while (control != null) {
        String pseudo,
import org.jkiss.dbeaver.ui.UIStyles;
        }
}
            // Should we use def Eclipse approach? Generally it is all canvases and composites
package org.jkiss.dbeaver.ui.css;

        if (ctrl instanceof Text || ctrl instanceof StyledText) {
            return !CommonUtils.isBitSet(ctrl.getStyle(), SWT.CHECK) && !CommonUtils.isBitSet(ctrl.getStyle(), SWT.RADIO);
            Color background = textWidget.getOriginWidget().getBackground();
 *

import org.jkiss.code.NotNull;
                // Do not set white background in dark theme
//                return false;
            return true;
 * See the License for the specific language governing permissions and
            }
                toolBar.setBackground(bgColor);
        }
            }
//            }
                return false;
 * Unless required by applicable law or agreed to in writing, software
            Color newColor = CSSUtils.getCurrentEditorConnectionColor(widget);
            !isExcludedFromStyling(ctrl) &&

                // FIXME: hack of bug in Eclipse. By default StyledText background in white.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.swt.SWT;
import org.eclipse.e4.ui.css.swt.helpers.SWTElementHelpers;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * DBeaver - Universal Database Manager
        Object element,
        if (widget instanceof Control ctrl &&
 * You may obtain a copy of the License at
    }
import org.eclipse.e4.ui.css.core.engine.CSSEngine;
            if (background.getRed() == 255 && background.getGreen() == 255 && background.getBlue() == 255) {
    }

    private static final Class<?>[] EXCLUDE_CLASSES = { Tree.class, Table.class };
            textWidget.setBackground(background);

import org.jkiss.dbeaver.ui.ConComposite;
import org.w3c.dom.css.CSSValue;
                if (UIStyles.isDarkTheme()) {
        }
        if (ctrl instanceof Combo || ctrl instanceof CCombo) {
            }
 */

    ) throws Exception {
import org.eclipse.e4.ui.css.swt.properties.css2.CSSPropertyBackgroundSWTHandler;

    }
            if (control.getClass().getName().contains("FindReplaceOverlay")) {
        if (widget instanceof ToolBar toolBar) {
        }
import org.jkiss.utils.ArrayUtils;
        }
            }
        if (ctrl instanceof Button) {
import org.eclipse.swt.widgets.*;
            !UIUtils.isInDialog(ctrl) &&
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
                    return;
        if (ArrayUtils.contains(EXCLUDE_CLASSES, ctrl.getClass()) || CSSUtils.isExcludeFromStyling(ctrl)) {

                }
                // FIXME: dirty hack to exclude Find/Replace floating panel

                return true;
            }
        CSSEngine engine
/*
        super.applyCSSPropertyBackgroundColor(element, value, pseudo, engine);
    public void applyCSSPropertyBackgroundColor(
            Color defForeground = UIStyles.getDefaultTextForeground();
import org.jkiss.utils.CommonUtils;
 *
            Color bgColor = CSSUtils.getCurrentEditorConnectionColor(widget);
        Widget widget = SWTElementHelpers.getWidget(element);
                ctrl.setBackground(newColor);
            // FIXME: For some reason it remains default for dark theme (black on black)
            if (CSSUtils.isExcludeFromStyling(control)) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (widget instanceof ICSSBackgroundMimicControl textWidget) {
        }
