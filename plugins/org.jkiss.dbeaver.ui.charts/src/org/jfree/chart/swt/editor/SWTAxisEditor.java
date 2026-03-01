        new Label(general, SWT.NONE).setText(localizationResources.getString(
                        dlg.setRGB(SWTAxisEditor.this.labelPaintColor.getRGB());
    }
     * Returns the current label font.
                            // label
                            //tickLabelFontField.setFont(font);
        this.showTickLabelsCheckBox = new Button(ticks, SWT.CHECK);

                            SWTAxisEditor.this.font = new Font(
        item1.setControl(ticks);
    /** The paint (color) used to draw the axis tick labels. */
                axis.getTickLabelFont(), true);
     *
     *

/*
import org.eclipse.swt.widgets.Button;
    private Button showTickLabelsCheckBox;

        Composite ticks = new Composite(this.otherTabs, SWT.NONE);
                                    getShell().getDisplay(), dlg.getFontList());

     * @return The current label font.
        selectTickLabelFontButton.setText(localizationResources.getString(
    public static SWTAxisEditor getInstance(Composite parent, int style,
    }
    private Color labelPaintColor;
        Group general = new Group(this, SWT.NONE);
        this.labelFontField.setText(this.labelFont.toString());
     * the properties of the specified axis.
                            }
    private Text tickLabelFontField;
     * @param axis  the axis.
        // Use a colored text field to show the color
        return this.otherTabs;
 * You may obtain a copy of the License at
    private TabFolder otherTabs;
        this.tickLabelFont = SWTUtils.toSwtFontData(getDisplay(),
                            colorCanvas.setColor(
    public SWTAxisEditor(Composite parent, int style, Axis axis) {
                                    getDisplay(), rgb);
/**
     *
                                SWTAxisEditor.this.labelFont });
                        (NumberAxis) axis);

    /** A field showing a description of the label font. */
     *
                        if (dlg.open() != null) {
    }
        tabLayout.marginHeight = tabLayout.marginWidth = 4;
 * Licensed under the Apache License, Version 2.0 (the "License");
        return SWTUtils.toAwtColor(this.labelPaintColor);
    private Text label;
    }

import org.eclipse.swt.graphics.FontData;
                                "Title_Color"));
    }
    public java.awt.Font getLabelFont() {
     * Standard constructor: builds a composite for displaying/editing
    protected static ResourceBundle localizationResources
        this.otherTabs = new TabFolder(other, SWT.NONE);

        return this.label.getText();
                        }
     * @param axis  the axis whose properties are to be displayed/edited
        Group other = new Group(this, SWT.NONE);
                new SelectionAdapter() {
     * Returns a reference to the tabbed composite.

        new Label(ticks, SWT.NONE).setText(localizationResources.getString(
                }

        this.tickLabelPaintColor = SWTUtils.toSwtColor(getDisplay(),
            =  ResourceBundleWrapper.getBundle(
                        dlg.setText(localizationResources.getString(
                                    = SWTAxisEditor.this.font.getFontData()[0];
                        RGB rgb = dlg.open();
     * @param axis  the axis whose properties are to be displayed/edited
        new Label(general, SWT.NONE).setText(localizationResources.getString(
    }
        this.tickLabelFontField.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
        colorCanvas.setLayoutData(canvasGridData);
        new Label(general, SWT.NONE).setText(localizationResources.getString(
     * @return The current label paint.

     *

import java.awt.*;
        return SWTUtils.toAwtFont(getDisplay(), this.tickLabelFont, true);
        canvasGridData.heightHint = 20;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
 * DBeaver - Universal Database Manager
        FillLayout layout = new FillLayout(SWT.VERTICAL);
                "Tick_label_font"));

    /**
     */
     * @return A composite or <code>null</code< if axis is {@code null}.
                            // Dispose of any fonts we have created
                            SWTAxisEditor.this.labelPaintColor = new Color(

    public TabFolder getOtherTabs() {
                        dlg.setText(localizationResources.getString(
     * @param parent  the parent.
            this.label.setText(axis.getLabel());
    /**
        GridData canvasGridData = new GridData(SWT.FILL, SWT.CENTER, true,
}
    private Text labelFontField;
                    }

    /**
                            SWTAxisEditor.this.labelFontField.setText(
import org.eclipse.swt.widgets.*;
        this.labelFontField = new Text(general, SWT.BORDER);
                        }
                            // Dispose of any fonts we have created

        }
                new SelectionAdapter() {
            if (axis instanceof NumberAxis)
                "Show_tick_labels"));
     */
     * @param style The SWT style of the SwtAxisEditor.
import org.eclipse.swt.graphics.RGB;
        general.setText(localizationResources.getString("General"));
                "Paint"));
 *
     * Returns the current axis label.
    }
                        FontDialog dlg = new FontDialog(getShell());
     * @param style  the style.
                        dlg.setFontList(new FontData[] {
                                    SWTAxisEditor.this.font.getFontData()[0]

    /**
    /** The font used to draw the axis labels. */
        return SWTUtils.toAwtFont(getDisplay(), this.labelFont, true);
    private Color tickLabelPaintColor;
     * for the axis type.
        general.setLayout(new GridLayout(3, false));
    private FontData tickLabelFont;
 * Copyright (C) 2010-2025 DBeaver Corp and others
            // return the appropriate axis editor
     * @return The current label font.
                                    .toString());
        else return null;
    private Button showTickMarksCheckBox;
        }
                }
        this.tickLabelFontField = new Text(ticks, SWT.BORDER);
                false);
        Button selectFontButton = new Button(general, SWT.PUSH);
        this.labelPaintColor = SWTUtils.toSwtColor(getDisplay(),
                                    SWTAxisEditor.this.font.getFontData()[0]
    }
        axis.setLabel(getLabel());
 */
                SWT.CENTER, true, false, 3, 1));
                        if (dlg.open() != null) {
    /** The paint (color) used to draw the axis labels. */
        item1.setText(" " + localizationResources.getString("Ticks") + " ");
 * limitations under the License.
                        dlg.setFontList(new FontData[] {
     *
        return SWTUtils.toAwtColor(this.tickLabelPaintColor);

        this.showTickMarksCheckBox.setSelection(axis.isTickMarksVisible());
    /**
        if (axis.getLabel() != null) {
     */
import org.eclipse.swt.events.SelectionAdapter;
    public String getLabel() {

    }
import org.jfree.chart.axis.Axis;
        this.showTickMarksCheckBox.setLayoutData(new GridData(SWT.FILL,
        FillLayout tabLayout = new FillLayout();
import org.eclipse.swt.widgets.Composite;
                                SWTAxisEditor.this.tickLabelFont});

        );
    public void setAxisProperties(Axis axis) {
                                SWTAxisEditor.this.font.dispose();
                                    .toString());
        this.label = new Text(general, SWT.BORDER);
                SWT.NONE, this.labelPaintColor);
        this.showTickLabelsCheckBox.setText(localizationResources.getString(
import org.eclipse.swt.graphics.Color;
        );
        this.showTickLabelsCheckBox.setSelection(axis.isTickLabelsVisible());
        new Label(general, SWT.NONE).setText(""); //empty cell
import org.eclipse.swt.layout.FillLayout;
        Button selectTickLabelFontButton = new Button(ticks, SWT.PUSH);
     * for displaying tick labels on the axis.
    /** The axis label. */
     * @return The current axis label.
                        FontDialog dlg = new FontDialog(getShell());
import org.jfree.swt.SWTUtils;
import org.eclipse.swt.events.SelectionEvent;
        other.setLayout(tabLayout);
        TabItem item1 = new TabItem(this.otherTabs, SWT.NONE);
        axis.setTickLabelPaint(getTickLabelPaint());
            Axis axis) {
                false));
        //tickLabelFontField.setFont(SwtUtils.toSwtFontData(getDisplay(),
                axis.getTickLabelPaint());
                SWT.CENTER, true, false, 3, 1));
                                    SWTAxisEditor.this.labelPaintColor);
    /** A tabbed pane for... */
    /**
                        if (rgb != null) {
                    "org.jfree.chart.editor.LocalizationBundle");
     */
                          // create the new color and set it to the
        Button selectColorButton = new Button(general, SWT.PUSH);
        // axis.getTickLabelFont()));
                "Font"));

     * @return The current label paint.
    private FontData labelFont;
    /**
                        dlg.setText(localizationResources.getString(
                          // SwtPaintCanvas
        selectColorButton.addSelectionListener(
import org.eclipse.swt.SWT;
        other.setText(localizationResources.getString("Other"));
                    }
 *
        selectColorButton.setText(localizationResources.getString("Select..."));
        this.tickLabelFontField.setText(this.tickLabelFont.toString());
    /** A flag that indicates whether or not the tick marks are visible. */
     * Returns the current label paint.
import org.eclipse.swt.widgets.Label;
        axis.setTickLabelFont(getTickLabelFont());
 * Unless required by applicable law or agreed to in writing, software
 *
        // row 3
        this.showTickMarksCheckBox.setText(localizationResources.getString(
        axis.setTickLabelsVisible(this.showTickLabelsCheckBox.getSelection());
                            //label.setFont(font);
        ticks.setLayout(new GridLayout(3, false));

                        // Create the font-change dialog
        selectFontButton.addSelectionListener(
        this.label.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
                                "Font_Selection"));
        final SWTPaintCanvas colorCanvas = new SWTPaintCanvas(general,
     */
                        }
        super(parent, style);
            else return new SWTAxisEditor(parent, style, axis);
     * @param parent The parent composite.
    /** A flag that indicates whether or not the tick labels are visible. */
import org.eclipse.swt.graphics.Font;
                    public void widgetSelected(SelectionEvent event) {
    public java.awt.Font getTickLabelFont() {
                            if (SWTAxisEditor.this.font != null) {
                            SWTAxisEditor.this.tickLabelFont
     * A static method that returns a panel that is appropriate
                                SWTAxisEditor.this.font.dispose();
                true, false));

    public Paint getTickLabelPaint() {
     */
     * A field containing a description of the font
                    public void widgetSelected(SelectionEvent event) {
                            SWTAxisEditor.this.font = new Font(
        axis.setTickMarksVisible(this.showTickMarksCheckBox.getSelection());
                true, false));
        selectFontButton.setText(localizationResources.getString("Select..."));
     */
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.labelFont = SWTUtils.toSwtFontData(getDisplay(),
        axis.setLabelPaint(getLabelPaint());
     *              in the composite.
        this.showTickMarksCheckBox = new Button(ticks, SWT.CHECK);
        // row 1
    /** Font object used to handle a change of font. */
                            // Create the new font and set it into the title

                new SelectionAdapter() {
     */
    private Font font;
    /**
                            SWTAxisEditor.this.labelFont
 * See the License for the specific language governing permissions and
import org.eclipse.swt.layout.GridData;
    /**
                            }
                return new SWTNumberAxisEditor(parent, style,
 * you may not use this file except in compliance with the License.
                axis.getLabelPaint());
                "Label"));
    public Paint getLabelPaint() {
     *
     * @return A reference to the tabbed composite.
     * Sets the properties of the specified axis to match
class SWTAxisEditor extends Composite {

                "Show_tick_marks"));
     *              in the composite.
        layout.marginHeight = layout.marginWidth = 4;
        this.showTickLabelsCheckBox.setLayoutData(new GridData(SWT.FILL,
     */
                                    getShell().getDisplay(), dlg.getFontList());
    /** The resourceBundle for the localization. */
import org.jfree.chart.axis.NumberAxis;

     * Returns the current label paint.
                            if (SWTAxisEditor.this.font != null) {
    /** The font used to draw the axis tick labels. */
                }
                        // Create the color-change dialog
import org.jfree.chart.util.ResourceBundleWrapper;
        setLayout(layout);
                        // Create the color-change dialog
 *     http://www.apache.org/licenses/LICENSE-2.0


     *
                            SWTAxisEditor.this.tickLabelFontField.setText(
        );

        if (axis != null) {
        axis.setLabelFont(getLabelFont());
                    }
     * Returns the current label font.
                                "Font_Selection"));
     */
                        ColorDialog dlg = new ColorDialog(getShell());
import java.util.ResourceBundle;
                axis.getLabelFont(), true);
                    public void widgetSelected(SelectionEvent event) {
                            // label
                "Select..."));
 * An editor for axis properties.
        // row 2
import org.eclipse.swt.layout.GridLayout;
        this.labelFontField.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
                                    = SWTAxisEditor.this.font.getFontData()[0];
        selectTickLabelFontButton.addSelectionListener(
     *
    /**
package org.jfree.chart.swt.editor;
     * the properties defined on this panel.
                            // Create the new font and set it into the title
