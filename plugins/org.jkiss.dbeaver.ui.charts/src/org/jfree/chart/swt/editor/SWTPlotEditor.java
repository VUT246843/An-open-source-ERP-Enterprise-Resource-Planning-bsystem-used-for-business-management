                this.domainAxisPropertyPanel.setAxisProperties(domainAxis);
        TabFolder tabs = new TabFolder(plotType, SWT.NONE);
        }
package org.jfree.chart.swt.editor;
                CategoryPlot p = (CategoryPlot) plot;
        if (this.plotAppearance.getPlotOrientation() != null) {
import org.jfree.chart.plot.Plot;
            if (plot instanceof CategoryPlot) {
            domainAxis = ((CategoryPlot) plot).getDomainAxis();
import org.jfree.chart.plot.XYPlot;
 *
    /**
    /**
            domainAxis = ((XYPlot) plot).getDomainAxis();
                rangeAxis = p.getRangeAxis();
    /** The resourceBundle for the localization. */
        item1.setText(localizationResources.getString("Domain_Axis"));
import org.jfree.swt.SWTUtils;

     * Updates the plot properties to match the properties

    }
        //deal with domain axis
import org.eclipse.swt.widgets.Composite;
    public void updatePlotProperties(Plot plot) {
    }
 * You may obtain a copy of the License at
        item2.setText(localizationResources.getString("Range_Axis"));
                rangeAxis);

                XYPlot p = (XYPlot) plot;
        }
     *
            }
            }

     * A panel used to display/edit the properties of the domain axis (if any).
        TabItem item1 = new TabItem(tabs, SWT.NONE);

        // set the axis properties
     */
                this.rangeAxisPropertyPanel.setAxisProperties(rangeAxis);
class SWTPlotEditor extends Composite {
        }
                XYPlot p = (XYPlot) plot;
        // set the plot properties...
        plotType.setLayout(plotTypeLayout);
        item3.setText(localizationResources.getString("Appearance"));
        plot.setBackgroundPaint(SWTUtils.toAwtColor(getBackgroundPaint()));
    /**
        return this.plotAppearance.getOutlinePaint();
 *
import org.jfree.chart.util.ResourceBundleWrapper;
     * Returns the current outline stroke.
     *
    /**

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        item1.setControl(this.domainAxisPropertyPanel);

        plotTypeLayout.marginHeight = plotTypeLayout.marginWidth = 4;
import org.eclipse.swt.layout.FillLayout;
        this.domainAxisPropertyPanel = SWTAxisEditor.getInstance(tabs,
 * Unless required by applicable law or agreed to in writing, software
            rangeAxis = ((XYPlot) plot).getRangeAxis();
        plot.setOutlinePaint(SWTUtils.toAwtColor(getOutlinePaint()));
    }
                domainAxis = p.getDomainAxis();
     *
                domainAxis = p.getDomainAxis();
    /**
    private SWTAxisEditor domainAxisPropertyPanel;
        if (this.domainAxisPropertyPanel != null) {
/*
        TabItem item2 = new TabItem(tabs, SWT.NONE);
        this.plotAppearance = new SWTPlotAppearanceEditor(tabs, SWT.NONE, plot);
        }
     * Returns the current outline stroke.

    protected static ResourceBundle localizationResources
        Group plotType = new Group(this, SWT.NONE);
                CategoryPlot p = (CategoryPlot) plot;
 * limitations under the License.
        plotType.setText(plot.getPlotType() + localizationResources.getString(
    private SWTAxisEditor rangeAxisPropertyPanel;

 * DBeaver - Universal Database Manager
import java.awt.*;
            Axis rangeAxis = null;
     */
        layout.marginHeight = layout.marginWidth = 4;
import org.eclipse.swt.widgets.TabFolder;
        }
 */
                p.setOrientation(this.plotAppearance.getPlotOrientation());
import org.jfree.chart.axis.Axis;
 */
 *
     *
            }

     */
    /**
     * A panel used to display/edit the properties of the range axis (if any).
     * Creates a new editor for the specified plot.
            }
import org.eclipse.swt.graphics.Color;
        FillLayout layout = new FillLayout();
     * @return The current outline stroke.
import org.eclipse.swt.SWT;
            else if (plot instanceof XYPlot) {
     * @param plot  the plot.
     */
    public Stroke getOutlineStroke() {
                SWT.NONE, domainAxis);
            else if (plot instanceof XYPlot) {
        else if (plot instanceof XYPlot) {
        Axis domainAxis = null;
        if (this.rangeAxisPropertyPanel != null) {
     * @return The current outline stroke.
import org.eclipse.swt.widgets.TabItem;
    }
     * @param style  the style.
     * Returns the current outline stroke.
                rangeAxis = p.getRangeAxis();

    public Color getBackgroundPaint() {
            if (rangeAxis != null)
}
import org.jfree.chart.plot.CategoryPlot;
                p.setOrientation(this.plotAppearance.getPlotOrientation());
     */
            if (plot instanceof CategoryPlot) {
        super(parent, style);
        setLayout(layout);
    }
            if (plot instanceof CategoryPlot) {
            }
    public Color getOutlinePaint() {

/**
                CategoryPlot p = (CategoryPlot) plot;
    public SWTPlotEditor(Composite parent, int style, Plot plot) {
     *
            }
            = ResourceBundleWrapper.getBundle(
        FillLayout plotTypeLayout = new FillLayout();
            rangeAxis = ((CategoryPlot) plot).getRangeAxis();
     */
            Axis domainAxis = null;

        if (plot instanceof CategoryPlot) {
        item2.setControl(this.rangeAxisPropertyPanel);
 * See the License for the specific language governing permissions and
                XYPlot p = (XYPlot) plot;
import java.util.ResourceBundle;
        if (plot instanceof CategoryPlot) {
        item3.setControl(this.plotAppearance);
        return this.plotAppearance.getBackGroundPaint();
        TabItem item3 = new TabItem(tabs, SWT.NONE);

        }
        //deal with range axis
        //deal with plot appearance
        else if (plot instanceof XYPlot) {
                    "org.jfree.chart.editor.LocalizationBundle");

     * @param parent  the parent.
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
     */


     * @param plot  The plot.
            else if (plot instanceof XYPlot) {
            if (domainAxis != null)

                ":"));
    private SWTPlotAppearanceEditor plotAppearance;
 * distributed under the License is distributed on an "AS IS" BASIS,
        Axis rangeAxis = null;
 * An editor for plot properties.
     * @return The current outline stroke.
        plot.setOutlineStroke(getOutlineStroke());

import org.eclipse.swt.widgets.Group;
     * defined on the panel.
 * you may not use this file except in compliance with the License.
        return this.plotAppearance.getStroke();
        this.rangeAxisPropertyPanel = SWTAxisEditor.getInstance(tabs, SWT.NONE,
    /**
 * Copyright (C) 2010-2025 DBeaver Corp and others
        }
