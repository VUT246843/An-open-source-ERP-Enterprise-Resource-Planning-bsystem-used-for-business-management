                SWTUtils.toSwtColor(getDisplay(), plot.getBackgroundPaint()));
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
        GridData outlineGridData = new GridData(SWT.FILL, SWT.CENTER, true,
     */
import org.eclipse.swt.widgets.Label;
                new SelectionAdapter() {
        selectOutlineColor.addSelectionListener(
                    }
        selectBgPaint.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false,
        Button selectBgPaint = new Button(general, SWT.PUSH);
import org.eclipse.swt.layout.GridLayout;
                            SWTPlotAppearanceEditor.this.outlinePaintCanvas
    protected static ResourceBundle localizationResources
        }
                        dlg.setText(localizationResources.getString(
                    true, false, 2, 1));
 * See the License for the specific language governing permissions and
        GridData bgGridData = new GridData(SWT.FILL, SWT.CENTER, true, false);
                false);
                            SWTPlotAppearanceEditor.this.strokeCanvas.setStroke(
        if (plot instanceof CategoryPlot) {
                            }
                                "Background_paint"));

    /** The paint (color) used to fill the background of the plot. */
    }
     */
    private final static String[] orientationNames = {"Vertical", "Horizontal"};
 *
                    }
                new SelectionAdapter() {
     */
     *
 */
        this.selectStroke.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
import org.eclipse.swt.widgets.Button;
        if (this.plotOrientation != null) {
                    "org.jfree.chart.editor.LocalizationBundle");
import java.util.ResourceBundle;
    private SWTStrokeCanvas strokeCanvas;
import org.eclipse.swt.graphics.Color;
        new Label(general, SWT.NONE).setText(localizationResources.getString(
        this.outlinePaintCanvas.setLayoutData(outlineGridData);
    /**
                        if (w > 0) {
                                .getSelection();

                            switch (SWTPlotAppearanceEditor.this.orientation
                    localizationResources.getString("Orientation"));
                                    SWTPlotAppearanceEditor.this.plotOrientation

        outlineGridData.heightHint = 20;
 * distributed under the License is distributed on an "AS IS" BASIS,
    public Color getOutlinePaint() {
import org.eclipse.swt.events.SelectionAdapter;
        this.selectStroke = new Spinner(general, SWT.BORDER);
        this.outlinePaintCanvas = new SWTPaintCanvas(general, SWT.NONE,
    /** Orientation constants. */
        selectBgPaint.addSelectionListener(
        return this.strokeCanvas.getStroke();
        this.backgroundPaintCanvas.setLayoutData(bgGridData);
            this.orientation.addSelectionListener(
import org.jfree.chart.plot.XYPlot;
        this.selectStroke.addSelectionListener(
                        public void widgetSelected(SelectionEvent event) {
                    public void widgetSelected(SelectionEvent event) {
                                    SWTPlotAppearanceEditor.this.plotOrientation

                                case ORIENTATION_HORIZONTAL:

            this.orientation = new Combo(general, SWT.DROP_DOWN);
     * Returns the outline paint.
    /**
                        }
    /** The resourceBundle for the localization. */
            this.orientation.select(index);
        strokeGridData.heightHint = 20;
import java.awt.*;
        groupLayout.marginHeight = groupLayout.marginWidth = 4;
        );
        this.strokeCanvas.setStroke(plot.getOutlineStroke());
        Button selectOutlineColor = new Button(general, SWT.PUSH);
                        if (rgb != null) {
            new Label(general, SWT.NONE).setText(
                    public void widgetSelected(SelectionEvent event) {
        general.setLayout(groupLayout);
import org.jfree.chart.plot.PlotOrientation;
                                    .setColor(new Color(getDisplay(), rgb));
    }
                    = this.plotOrientation.equals(PlotOrientation.VERTICAL);
 * limitations under the License.
     * @return The plot orientation.
                        RGB rgb = dlg.open();
        this.selectStroke.setMaximum(3);
                                .backgroundPaintCanvas.getColor().getRGB());

                        }

 * Copyright (C) 2010-2025 DBeaver Corp and others
                        dlg.setRGB(SWTPlotAppearanceEditor.this
                        ColorDialog dlg = new ColorDialog(getShell());
    /**
    private Combo orientation;
                                    .getSelectionIndex()) {

import org.eclipse.swt.widgets.*;
    /** The orientation for the plot. */
        return this.backgroundPaintCanvas.getColor();
                    new SelectionAdapter() {
import org.eclipse.swt.layout.FillLayout;
                            SWTPlotAppearanceEditor.this.backgroundPaintCanvas
                SWTUtils.toSwtColor(getDisplay(), plot.getOutlinePaint()));
                false, false));
 * you may not use this file except in compliance with the License.
                    public void widgetSelected(SelectionEvent event) {
    public Color getBackGroundPaint() {
        // row 1: stroke
        new Label(general, SWT.NONE).setText(localizationResources.getString(
     * Returns the plot orientation.
     *
                                            = PlotOrientation.VERTICAL;
        FillLayout layout = new FillLayout();
                }
                                case ORIENTATION_VERTICAL:
import org.eclipse.swt.layout.GridData;
        );
import org.eclipse.swt.events.SelectionEvent;
                }

                                    break;


            this.plotOrientation = ((CategoryPlot) plot).getOrientation();
                                            = PlotOrientation.HORIZONTAL;
        // row 4: orientation
        GridData strokeGridData = new GridData(SWT.FILL, SWT.CENTER, true,
                                            = PlotOrientation.VERTICAL;
    }
        setLayout(layout);
import org.eclipse.swt.widgets.Composite;
        this.backgroundPaintCanvas = new SWTPaintCanvas(general, SWT.NONE,
        this.selectStroke.setMinimum(1);
    public PlotOrientation getPlotOrientation() {
        general.setText(localizationResources.getString("General"));
        super(parent, style);
                "Background_paint"));
        return this.outlinePaintCanvas.getColor();
                        if (rgb != null) {
                }
                    }
        this.strokeCanvas = new SWTStrokeCanvas(general, SWT.NONE);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        // row 3: background paint
            this.orientation.setItems(orientationNames);
import org.eclipse.swt.graphics.RGB;
        selectOutlineColor.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER,
    /** The paint (color) used to draw the outline of the plot. */
                            SWTPlotAppearanceEditor.this.strokeCanvas.redraw();
        Group general = new Group(this, SWT.NONE);
                "Select..."));

                                    new BasicStroke(w));
        // row 2: outline color
    }
     * Returns the background paint.
                        dlg.setText(localizationResources.getString(

 * DBeaver - Universal Database Manager
                    : ORIENTATION_HORIZONTAL;
import org.jfree.chart.util.ResourceBundleWrapper;
     * @return The background paint.

    SWTPlotAppearanceEditor(Composite parent, int style, Plot plot) {
                false, false));
                        dlg.setRGB(SWTPlotAppearanceEditor.this
                false));
                                "Outline_Paint"));
        bgGridData.heightHint = 20;
import org.jfree.swt.SWTUtils;
    }
     */
 * An editor for plot properties.
                        int w = SWTPlotAppearanceEditor.this.selectStroke
    /** The stroke (pen) used to draw the outline of the plot. */
        GridLayout groupLayout = new GridLayout(3, false);
/**
                                default:
 * Unless required by applicable law or agreed to in writing, software

     *
                                    .setColor(new Color(getDisplay(), rgb));
    private SWTPaintCanvas backgroundPaintCanvas;
            );
                    }
}
    private Spinner selectStroke;
        selectBgPaint.setText(localizationResources.getString("Select..."));
                        ColorDialog dlg = new ColorDialog(getShell());

        this.strokeCanvas.setLayoutData(strokeGridData);
                        RGB rgb = dlg.open();
            int index = isVertical ? ORIENTATION_VERTICAL
     * @return The outline paint.
        );
import org.jfree.chart.plot.Plot;
                new SelectionAdapter() {
    public Stroke getStroke() {
        else if (plot instanceof XYPlot) {
                false);
            = ResourceBundleWrapper.getBundle(
                                    SWTPlotAppearanceEditor.this.plotOrientation
     *

        selectOutlineColor.setText(localizationResources.getString(
        layout.marginHeight = layout.marginWidth = 4;
 * You may obtain a copy of the License at
            boolean isVertical
 * Licensed under the Apache License, Version 2.0 (the "License");
    private final static int ORIENTATION_VERTICAL = 0;
 */
 *
class SWTPlotAppearanceEditor extends Composite {
                        }
                "Outline_Paint"));
    private PlotOrientation plotOrientation;
            this.plotOrientation = ((XYPlot) plot).getOrientation();

import org.eclipse.swt.SWT;
    /**
     * @return The stroke.
            this.orientation.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER,
                        }
                "Outline_stroke"));
/*
                                .outlinePaintCanvas.getColor().getRGB());
 *
    private SWTPaintCanvas outlinePaintCanvas;
        return this.plotOrientation;
    private final static int ORIENTATION_HORIZONTAL = 1;
        new Label(general, SWT.NONE).setText(localizationResources.getString(
        }
import org.jfree.chart.plot.CategoryPlot;
     * Returns the stroke.
package org.jfree.chart.swt.editor;

                                    break;
