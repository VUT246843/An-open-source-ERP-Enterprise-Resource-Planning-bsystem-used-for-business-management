    }
    public void focusLost(FocusEvent e) {
    private double minimumValue;
        this.maximumValue = axis.getUpperBound();
    /**
    private Text maximumRangeValue;
class SWTNumberAxisEditor extends SWTAxisEditor implements FocusListener {
        numberAxis.setAutoRange(this.autoRange);
    public boolean validateMinimum(String candidate)
        // don't need to do anything
    /**
 * limitations under the License.

        item2.setControl(range);
    public void focusGained(FocusEvent e) {
     * 
            this.minimumRangeValue.setEnabled(false);
        this.autoRangeCheckBox.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, 
     * org.eclipse.swt.events.FocusEvent)
                    toggleAutoRange();
     * @return A boolean.

        if (!this.autoRange) {


                public void widgetSelected(SelectionEvent e) { 
                this.minimumRangeValue.setText(String.valueOf(
                        this.maximumRangeValue.getText());
        NumberAxis numberAxis = (NumberAxis) axis;
     *  automatically.
                valid = false;
        }

        }
     *  automatically.

        item2.setText(" " + localizationResources.getString("Range") + " ");

 *
    private boolean autoRange;
        this.maximumRangeValue.addFocusListener(this);
     * @param parent  the parent.
        this.maximumRangeValue.setText(String.valueOf(this.maximumValue));
        }
        }
        new Label(range, SWT.NONE).setText(localizationResources.getString(
     * Revalidate the range minimum:
 * DBeaver - Universal Database Manager
        super(parent, style, axis);
     * 
        
                this.maximumRangeValue.setText(String.valueOf(
                        this.maximumValue));
 *
                        this.minimumRangeValue.getText());
        //this.minimumRangeValue.addVerifyListener(this);
    /** A text field for entering the maximum value in the axis range. */
            if (Double.parseDouble(candidate) <= this.minimumValue) {
            this.minimumRangeValue.setEnabled(true);
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.autoRangeCheckBox.setText(localizationResources.getString(
        range.setLayout(new GridLayout(2, true));
     * Revalidate the range maximum:
     * @param axis  the axis.
    /**
 * An editor for {@link NumberAxis} properties.
            }
     */
 * you may not use this file except in compliance with the License.
            this.maximumRangeValue.setEnabled(false);
     */
     *  Toggle the auto range setting.
    private Text minimumRangeValue;
        }
     *
import org.eclipse.swt.events.FocusEvent;
/*
import org.eclipse.swt.layout.GridData;
     */
     */
        this.minimumRangeValue.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
    }
    /** A checkbox that indicates whether or not the axis range is determined
            else
    private Button autoRangeCheckBox;

     * it should be greater than the current minimum
            else
        try {
            if (!validateMinimum(this.minimumRangeValue.getText()))
    /* (non-Javadoc)
     * org.eclipse.swt.events.FocusEvent)
    /**
        catch (NumberFormatException e) {
import org.eclipse.swt.events.SelectionEvent;
        this.autoRange = axis.isAutoRange();
        this.minimumRangeValue = new Text(range, SWT.BORDER);
    /**
     * Creates a new editor.
 * You may obtain a copy of the License at
    /** A text field for entering the minimum value in the axis range. */
        this.autoRangeCheckBox.setSelection(this.autoRange);
import org.eclipse.swt.events.SelectionAdapter;
            valid = false;
     * @see org.eclipse.swt.events.FocusListener#focusGained(
        //this.minimumRangeValue.addModifyListener(this);

 *     http://www.apache.org/licenses/LICENSE-2.0
        super.setAxisProperties(axis);
     * @param axis  the axis.
                this.minimumValue = Double.parseDouble(
            // verify min value
                true, false));
        this.minimumValue = axis.getLowerBound();
        TabItem item2 = new TabItem(getOtherTabs(), SWT.NONE);
        //this.maximumRangeValue.addModifyListener(this);
        this.autoRangeCheckBox.addSelectionListener(new SelectionAdapter() {
        }
    {

import org.eclipse.swt.layout.GridLayout;
    public SWTNumberAxisEditor(Composite parent, int style, NumberAxis axis) {
    /** The lowest value in the axis range. */

/**
            this.minimumRangeValue.setText(Double.toString(this.minimumValue));
    }
                "Minimum_range_value"));
        return valid;
 * distributed under the License is distributed on an "AS IS" BASIS,
                        this.minimumValue));
    public void setAxisProperties(Axis axis) {
     * 
        Composite range = new Composite(getOtherTabs(), SWT.NONE);
import org.eclipse.swt.events.FocusListener;
     */
     */
        this.autoRange = this.autoRangeCheckBox.getSelection();

        boolean valid = true;

     * @param candidate  the minimum value
        }
        this.minimumRangeValue.setText(String.valueOf(this.minimumValue));
    }
                "Auto-adjust_range"));

            }
        try {
                }
     */
        catch (NumberFormatException e) {
        this.maximumRangeValue.setEnabled(!this.autoRange);

        }
import org.jfree.chart.axis.NumberAxis;
     * it should be less than the current maximum.
 */
        else if (e.getSource() == this.maximumRangeValue) {
    public boolean validateMaximum(String candidate)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * Sets the properties of the specified axis to match 
        boolean valid = true;
 * Unless required by applicable law or agreed to in writing, software
            });
    {
                true, false, 2, 1));
import org.eclipse.swt.widgets.*;
            numberAxis.setRange(this.minimumValue, this.maximumValue);
    /* (non-Javadoc)
        new Label(range, SWT.NONE).setText(localizationResources.getString(
            if (Double.parseDouble(candidate) >= this.maximumValue) {
     * @param candidate  the maximum value
        else {
     * 
import org.eclipse.swt.SWT;
        if (this.autoRange) {
    /** A flag that indicates whether or not the axis range is determined
        if (e.getSource() == this.minimumRangeValue) {
        this.maximumRangeValue.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
}
        this.minimumRangeValue.setEnabled(!this.autoRange);
                this.maximumValue = Double.parseDouble(
    
            this.maximumRangeValue.setText(Double.toString(this.maximumValue));
            valid = false;
 * Copyright (C) 2010-2025 DBeaver Corp and others
                "Maximum_range_value"));
            if (!validateMaximum(this.maximumRangeValue.getText()))
                true, false));
            this.maximumRangeValue.setEnabled(true);
     * @see org.eclipse.swt.events.FocusListener#focusLost(
     * the properties defined on this panel.
     */
        this.maximumRangeValue = new Text(range, SWT.BORDER);
 * See the License for the specific language governing permissions and
    /** The highest value in the axis range. */
package org.jfree.chart.swt.editor;
 */
     */
    }
     * @param style  the style.
    public void toggleAutoRange() {
        //this.maximumRangeValue.addVerifyListener(this);
import org.jfree.chart.axis.Axis;
    }
        this.minimumRangeValue.addFocusListener(this);
    private double maximumValue;
    }
     * @return A boolean.
                valid = false;
     * 
 *
        }
        this.autoRangeCheckBox = new Button(range, SWT.CHECK);

        return valid;
            // verify max value
