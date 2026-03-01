                UIUtils.drawMessageOverControl(placeholder, e, emptyDataMessage, -emSize.y);
    }

import org.jkiss.dbeaver.ui.controls.resultset.AbstractPresentation;
 *

            String emptyDataDescription = controller.getDecorator().getEmptyDataDescription();
        CSSUtils.setExcludeFromStyling(placeholder);
    public DBDAttributeBinding getCurrentAttribute() {
    public void updateValueView() {
    @Override
import org.jkiss.utils.CommonUtils;

        FontData[] fontData = normalFont.getFontData();
import java.util.Map;
        return Collections.emptyMap();
    public void setCurrentAttribute(@NotNull DBDAttributeBinding attribute) {

 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.jface.action.IMenuManager;
    private Composite placeholder;
 * Empty presentation.
import org.jkiss.code.Nullable;

    @NotNull
    }
import org.eclipse.swt.SWT;
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;

    }
    @Override
    }
import org.jkiss.dbeaver.ui.UIUtils;

 * Used when RSV has no results (initially).
    }
import org.jkiss.dbeaver.ui.BaseThemeSettings;

    @Override
    public void formatData(boolean refreshData) {
import org.eclipse.swt.widgets.Composite;
            if (!CommonUtils.isEmpty(emptyDataDescription)) {
        fontData[0].setStyle(fontData[0].getStyle() | SWT.BOLD);
    @Override
    public void changeMode(boolean recordMode) {

 *
public class EmptyPresentation extends AbstractPresentation {
 * distributed under the License is distributed on an "AS IS" BASIS,
        //UIUtils.createHorizontalLine(parent);
import org.jkiss.dbeaver.ui.css.CSSUtils;
 */
import org.eclipse.swt.widgets.Canvas;

        placeholder.addPaintListener(e -> {
import java.util.Collections;
 * DBeaver - Universal Database Manager

import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.graphics.FontData;
 * limitations under the License.
    }
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetController;
    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override

    public void scrollToRow(@NotNull RowPosition position) {
                descriptionSize = UIUtils.drawMessageOverControl(placeholder, e, emptyDataDescription, 10);
    public void printResultSet() {
        placeholder.addDisposeListener(e -> UIUtils.dispose(largeFont));
import org.eclipse.swt.layout.GridData;
            }
 * See the License for the specific language governing permissions and
    }


    public void refreshData(boolean refreshMetadata, boolean append, boolean keepState) {
                e.gc.setForeground(UIStyles.getDefaultTextForeground());
    @Override


import org.eclipse.swt.widgets.Control;

package org.jkiss.dbeaver.ui.controls.resultset.view;
    @Override
import org.eclipse.swt.graphics.Font;
            String emptyDataMessage = controller.getDecorator().getEmptyDataMessage();
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetCopySettings;

    @Override

                Point emSize = descriptionSize == null ? new Point(0, 0) : descriptionSize;
        });
            }
        return null;
 * You may obtain a copy of the License at

    @Override

    public void fillMenu(@NotNull IMenuManager menu) {
    public Map<Transfer, Object> copySelection(ResultSetCopySettings settings) {

        trackPresentationControl();
        placeholder.setLayoutData(new GridData(GridData.FILL_BOTH));
 */

    }
    @Override
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.ui.UIStyles;
/**
 * Unless required by applicable law or agreed to in writing, software

    @Override

            if (!CommonUtils.isEmpty(emptyDataMessage)) {
                return;
}

 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0

        return placeholder;
    }

    }
    public Control getControl() {
            Point descriptionSize = null;
import org.eclipse.swt.graphics.Point;
        final Font normalFont = BaseThemeSettings.instance.baseFont;
        return null;
    }


        placeholder.setBackground(controller.getDefaultBackground());
            }
    @Override

        super.createPresentation(controller, parent);
                e.gc.setFont(normalFont);
                e.gc.setFont(largeFont);

                //e.gc.setFont(normalFont);
    }
    public void clearMetaData() {
    }
    @Nullable

    public void createPresentation(@NotNull final IResultSetController controller, @NotNull Composite parent) {
        placeholder = new Canvas(parent, SWT.NONE);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        final Font largeFont = new Font(normalFont.getDevice(), fontData[0]);
    public Point getCursorLocation() {


        fontData[0].setHeight((int) (fontData[0].height * 1.5));
    @Override
/*
    }
 *
            if (controller.isRefreshInProgress()) {
