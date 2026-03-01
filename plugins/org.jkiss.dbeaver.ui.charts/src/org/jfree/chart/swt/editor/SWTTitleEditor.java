     * Returns the title text entered in the panel.
import java.util.ResourceBundle;
                "Color"));
     * @return The font selected in the panel.
        label.setLayoutData(gridData);
    private Text fontField;
    public Color getTitleColor() {
     * Returns the font selected in the panel.
                    public void widgetSelected(SelectionEvent event) {
}
                    public void widgetSelected(SelectionEvent event) {
            = ResourceBundleWrapper.getBundle(
                title = new TextTitle();
        TextTitle t = (title != null ? (TextTitle) title
    /** The button to use to select a new paint (color) to draw the title. */
     * Sets the properties of the specified title to match the properties
        // heightHint.
    /** Font object used to handle a change of font. */
        return this.titleFont;
     * @param chart  the chart whose title is to be modified.
 *     http://www.apache.org/licenses/LICENSE-2.0
    private Text titleField;
                            // SwtPaintCanvas
        // row 3
                    }
    /** A field for displaying a description of the title font. */
     */
    }
        }
                "Select..."));
        this.showTitle = (title != null);
        return this.titleField.getText();
                            SWTTitleEditor.this.fontField.setText(
import org.eclipse.swt.graphics.FontData;
                "Font"));
                "Text"));
     * defined on this panel.
        this.titleField.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
                new SelectionAdapter() {
     * @param style  the style.

                    }
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
        FillLayout layout = new FillLayout();
                            // label
import org.eclipse.swt.SWT;
        this.selectColorButton = new Button(general, SWT.PUSH);
 * Unless required by applicable law or agreed to in writing, software
     * Standard constructor: builds a panel for displaying/editing the
 * Copyright (C) 2010-2025 DBeaver Corp and others
            title.setFont(SWTUtils.toAwtFont(getDisplay(), getTitleFont(),
    private FontData titleFont;
                            colorCanvas.setColor(
                        if (dlg.open() != null) {
     * Returns the font selected in the panel.
                            SWTTitleEditor.this.titleFont
import org.jfree.chart.util.ResourceBundleWrapper;
                                SWTTitleEditor.this.font.dispose();
    /** The checkbox to indicate whether or not to display the title. */
        else {

                            //titleField.setFont(font);
import org.eclipse.swt.events.SelectionAdapter;

        );
        this.selectFontButton = new Button(general, SWT.PUSH);

            TextTitle title = chart.getTitle();
import org.eclipse.swt.layout.FillLayout;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        setLayout(layout);
     *
                        }

                        dlg.setRGB(SWTTitleEditor.this.titleColor.getRGB());
    private Color titleColor;
        layout.marginHeight = layout.marginWidth = 4;
                false));
        this.selectColorButton.addSelectionListener(
 */
        }

import org.eclipse.swt.graphics.RGB;
    }
            if (title == null) {
        this.fontField = new Text(general, SWT.BORDER);
    private Button showTitleCheckBox;
                false));
import org.eclipse.swt.layout.GridData;
                                "Title_Color"));
                SWT.CENTER, false, false));
     *
                        // Create the font-change dialog
                    true));
     * @param parent  the parent.
    private Button selectColorButton;
        this.titleField = new Text(general, SWT.BORDER);
    private boolean showTitle;
        this.titleFont = SWTUtils.toSwtFontData(getDisplay(), t.getFont(),
        this.selectFontButton.setText(localizationResources.getString(
import org.jfree.chart.title.TextTitle;
                SWT.NONE, this.titleColor);
                            // create the new color and set it to the
                : new TextTitle(localizationResources.getString("Title")));
                });
                            }
        colorCanvas.setLayoutData(canvasGridData);
                        RGB rgb = dlg.open();
                    }
package org.jfree.chart.swt.editor;
/*
     *
        new Label(general, SWT.NONE).setText(localizationResources.getString(
     */
        general.setLayout(new GridLayout(3, false));

                                    getDisplay(), rgb);
        );

 *
                        }
            }
                "Select..."));

                                    getShell().getDisplay(), dlg.getFontList());

        this.showTitleCheckBox.setSelection(this.showTitle);
                            SWTTitleEditor.this.font = new Font(
 *
    }
import org.jfree.chart.JFreeChart;
        canvasGridData.heightHint = 20;

        label.setText(localizationResources.getString("Show_Title"));
     *
     *
     *

        this.titleColor = SWTUtils.toSwtColor(getDisplay(), t.getPaint());
 * An editor for chart title properties.
     * @param title  the title, which should be changed.

 *
        this.showTitleCheckBox.setLayoutData(new GridData(SWT.CENTER,
    private Font font;
import org.jfree.swt.SWTUtils;
 * See the License for the specific language governing permissions and
                    public void widgetSelected(SelectionEvent event) {
     */
        Group general = new Group(this, SWT.NONE);
    public String getTitleText() {
        if (this.showTitle) {
    public void setTitleProperties(JFreeChart chart) {
    /**
     * @return The font selected in the panel.
                                    .toString());
        super(parent, style);
        // row 2
    private Button selectFontButton;

        this.titleField.setText(t.getText());
        final SWTPaintCanvas colorCanvas = new SWTPaintCanvas(general,
import org.jfree.chart.title.Title;
import org.eclipse.swt.events.SelectionEvent;
        general.setText(localizationResources.getString("General"));
    protected static ResourceBundle localizationResources
                new SelectionAdapter() {
                        dlg.setText(localizationResources.getString(

    /** The font used to draw the title. */
    /**
                }
import org.eclipse.swt.layout.GridLayout;
                }
import org.eclipse.swt.graphics.Font;
                            // Dispose of any fonts we have created
                                    = SWTTitleEditor.this.font.getFontData()[0];
        return this.titleColor;
                        ColorDialog dlg = new ColorDialog(getShell());

        this.fontField.setText(this.titleFont.toString());
 * Licensed under the Apache License, Version 2.0 (the "License");
    /** Whether or not to display the title on the chart. */
                        FontDialog dlg = new FontDialog(getShell());
        this.selectColorButton.setText(localizationResources.getString(
            title.setText(getTitleText());
                        dlg.setText(localizationResources.getString(
 */
 * you may not use this file except in compliance with the License.
import org.eclipse.swt.widgets.*;

import org.eclipse.swt.graphics.Color;
                                .showTitleCheckBox.getSelection();
            title.setPaint(SWTUtils.toAwtColor(getTitleColor()));
     */
                                    SWTTitleEditor.this.titleColor);
                true);

 * distributed under the License is distributed on an "AS IS" BASIS,
                                SWTTitleEditor.this.titleFont });
        // row 4
        new Label(general, SWT.NONE).setText("");
class SWTTitleEditor extends Composite {
                            SWTTitleEditor.this.titleColor = new Color(
                                "Font_Selection"));
                    "org.jfree.chart.editor.LocalizationBundle");
    }
        gridData.horizontalSpan = 2;
                        dlg.setFontList(new FontData[] {

                                    SWTTitleEditor.this.font.getFontData()[0]
    /** The paint (color) used to draw the title. */
                            if (SWTTitleEditor.this.font != null) {
                            // Create the new font and set it into the title
    SWTTitleEditor(Composite parent, int style, Title title) {
        GridData gridData = new GridData();
    }
        // row 1
    /** The resourceBundle for the localization. */
    public FontData getTitleFont() {
                        SWTTitleEditor.this.showTitle = SWTTitleEditor.this
        new Label(general, SWT.NONE).setText(localizationResources.getString(
     * properties of the specified title.
                false);
    /**
                chart.setTitle(title);
     */

    /**
        new Label(general, SWT.NONE).setText(localizationResources.getString(
        Label label = new Label(general, SWT.NONE);
                new SelectionAdapter() {
    /**
        // Use a SwtPaintCanvas to show the color, note that we must set the
                        // Create the color-change dialog
        this.showTitleCheckBox = new Button(general, SWT.CHECK);
        this.fontField.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
    /** A field for displaying/editing the title text. */
/**
        this.showTitleCheckBox.addSelectionListener(
        this.selectFontButton.addSelectionListener(
        GridData canvasGridData = new GridData(SWT.FILL, SWT.CENTER, true,
    /** The button to use to select a new title font. */

                        if (rgb != null) {
 * limitations under the License.
     * @return The title text entered in the panel.
            chart.setTitle((TextTitle) null);
