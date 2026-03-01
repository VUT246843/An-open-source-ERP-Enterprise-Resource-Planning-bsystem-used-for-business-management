        );
import org.jfree.swt.SWTUtils;
     * Updates the chart.
 * you may not use this file except in compliance with the License.
        general.setText(localizationResources.getString("General"));
        this.antialias.setText(localizationResources.getString(
 *
                "Background_paint"));
 * limitations under the License.
                                    new Color(getDisplay(), rgb));
     * @param style  the style.
     */
        selectBgPaint.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false,
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.layout.GridData;
    /** The chart background color. */
        this.backgroundPaintCanvas = new SWTPaintCanvas(general, SWT.NONE,
            = ResourceBundleWrapper.getBundle(
import org.eclipse.swt.events.SelectionEvent;
 *
 * DBeaver - Universal Database Manager
    }
                        RGB rgb = dlg.open();



                        }
                    public void widgetSelected(SelectionEvent event) {

 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jfree.chart.swt.editor;
    /** The resourceBundle for the localization. */
     * Creates a new instance.
    /**
                            SWTOtherEditor.this.backgroundPaintCanvas.setColor(
                this.backgroundPaintCanvas.getColor()));
 * Unless required by applicable law or agreed to in writing, software
     * the chart is drawn with anti-aliasing. */
import java.util.ResourceBundle;
        bgGridData.heightHint = 20;
        this.antialias = new Button(general, SWT.CHECK);

import org.jfree.chart.util.ResourceBundleWrapper;
        FillLayout layout = new FillLayout();
                        if (rgb != null) {
        general.setLayout(new GridLayout(3, false));
    private SWTPaintCanvas backgroundPaintCanvas;
 *
                        dlg.setText(localizationResources.getString(
        setLayout(layout);
/**
    private Button antialias;
     * @param chart  the chart.
     * @param parent  the parent.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    protected static ResourceBundle localizationResources
                                "Background_paint"));
 */
        this.antialias.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true,
        chart.setBackgroundPaint(SWTUtils.toAwtColor(
import org.eclipse.swt.graphics.RGB;
    }
                "Draw_anti-aliased"));
                    "org.jfree.chart.editor.LocalizationBundle");
        this.antialias.setSelection(chart.getAntiAlias());
class SWTOtherEditor extends Composite {

        new Label(general, SWT.NONE).setText(localizationResources.getString(
    /** A checkbox indicating whether or not
                        ColorDialog dlg = new ColorDialog(getShell());
        GridData bgGridData = new GridData(SWT.FILL, SWT.CENTER, true, false);
        Group general = new Group(this, SWT.NONE);
        this.backgroundPaintCanvas.setLayoutData(bgGridData);
        // row 1: antialiasing
        selectBgPaint.setText(localizationResources.getString("Select..."));
                        dlg.setRGB(SWTOtherEditor.this.backgroundPaintCanvas
}
     * @param chart  the chart.

    public void updateChartProperties(JFreeChart chart) {

import org.jfree.chart.JFreeChart;
     *
        chart.setAntiAlias(this.antialias.getSelection());
    /**
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
    public SWTOtherEditor(Composite parent, int style, JFreeChart chart) {
        Button selectBgPaint = new Button(general, SWT.PUSH);

 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
                new SelectionAdapter() {
        //row 2: background paint for the chart
        super(parent, style);
                false, 3, 1));
import org.eclipse.swt.SWT;
     *
                false));
                                .getColor().getRGB());
/*


import org.eclipse.swt.layout.FillLayout;
     */
import org.eclipse.swt.layout.GridLayout;
 */
        layout.marginHeight = layout.marginWidth = 4;

import org.eclipse.swt.events.SelectionAdapter;
 * See the License for the specific language governing permissions and
import org.eclipse.swt.graphics.Color;
        selectBgPaint.addSelectionListener(

 * An editor for miscellaneous chart properties.
                }
                SWTUtils.toSwtColor(getDisplay(), chart.getBackgroundPaint()));
                    }
