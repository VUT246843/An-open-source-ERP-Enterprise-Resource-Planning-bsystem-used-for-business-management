        gc.dispose();
        updateValueText(val);
 * You may obtain a copy of the License at
     */
 * See the License for the specific language governing permissions and
     * Update the insert mode status. Can be "Insert" or "Overwrite"
        //value.pack(true);



        // From Eclipse 3.1's GridData javadoc:
     * @param parent            parent in the widget hierarchy
    public void updateInsertModeText(boolean insert)

     */
    }
    private void initialize(boolean withSeparator)
                                          (11 + 10 + 12 + 3 + 10 + 12) * fontMetrics.getAverageCharWidth(),

    private static final String TEXT_INSERT = BinaryEditorMessages.editor_binary_hex_status_line_text_insert;
 * Status line component of the editor. Displays the current position and the insert/overwrite status.
        //position.pack(true);
 * DBeaver - Universal Database Manager
    /**
     * Update the position status and value.

    {

 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
    }
        position.setText(posText);
     */
    {
    }

    /**
    public void updateSelectionText(long[] sel)
     * @param val value to display
     * @param withLeftSeparator so it can be put besides other status items (for plugin)
import org.eclipse.swt.graphics.GC;
        String valText = BinaryEditorMessages.editor_binary_hex_status_line_value + val + " (dec) = " + Integer.toHexString(0x0ff & val) + " (binary) = " +  //$NON-NLS-2$ //$NON-NLS-3$

import org.jkiss.dbeaver.ui.editors.binary.internal.BinaryEditorMessages;
    public void updateSelectionValueText(long[] sel, byte val)


        setLayout(statusLayout);
        insertMode.setText(insert ? TEXT_INSERT : TEXT_OVERWRITE);


        separator3GridData.grabExcessVerticalSpace = true;
        GC gc = new GC(this);
     * Create a status line part
    /**
        value = new Label(this, SWT.SHADOW_NONE);
    public void updateValueText(byte val)
        //position.pack(true);
        insertMode = new Label(this, SWT.SHADOW_NONE);
//	String selText = String.format("Selection: %1$d (0x%1$X) - %2$d (0x%2$X)", sel[0], sel[1]);
        updateValueText(val);
        position.setLayoutData(gridData1);
    /**
public class HexStatusLine extends Composite {

        value.setText(valText);
        if (isDisposed() || position.isDisposed()) return;
import org.eclipse.swt.SWT;
     */
        if (isDisposed() || position.isDisposed()) return;

//	String valText = String.format("Value: %1$d (dec) = %1$X (binary) = %2$s (bin)", val, valBinText.substring(valBinText.length()-8));
import org.eclipse.swt.layout.GridLayout;
    }
            GridData separator1GridData = new GridData();
        separator23GridData.grabExcessVerticalSpace = true;
     * @param sel selection array to display: [0] = start, [1] = end

    {
    {
 * limitations under the License.

     * Update the selection status. Displays its decimal and hex values for start and end selection
}
     */


    {
        statusLayout.marginHeight = 0;
        if (withSeparator) {
        Label separator3 = new Label(this, SWT.SEPARATOR);
        value.setLayoutData(gridData2);
        String posText = BinaryEditorMessages.editor_binary_hex_status_line_offset + pos + " (dec) = " + Long.toHexString(pos) + " (binary)";  //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
    private Label insertMode = null;
            separator1GridData.verticalAlignment = SWT.FILL;
package org.jkiss.dbeaver.ui.editors.binary;
        separator2.setLayoutData(separator23GridData);
    private static final String TEXT_OVERWRITE = BinaryEditorMessages.editor_binary_hex_status_line_text_ovewrite;
import org.eclipse.swt.graphics.FontMetrics;
        statusLayout.numColumns = withSeparator ? 6 : 5;
        separator3.setLayoutData(separator3GridData);
import org.eclipse.swt.widgets.Label;
        // GridLayout must have a unique GridData
        String selText = BinaryEditorMessages.editor_binary_hex_status_line_selection + sel[0] + " (0x" + Long.toHexString(sel[0]) + ") - " + sel[1] +  //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
            separator1GridData.grabExcessVerticalSpace = true;
    private Label value = null;
        insertMode.setLayoutData(gridData3);
        initialize(withLeftSeparator);
        }
     * @param insert true will display "Insert"

        position = new Label(this, SWT.SHADOW_NONE);
        if (isDisposed() || position.isDisposed()) return;
        GridData separator23GridData = new GridData();
    }
    /**

        GridData gridData2 = new GridData(/*SWT.DEFAULT*/
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {
        // NOTE: Do not reuse GridData objects. Every control in a Composite that is managed by a

 * Copyright (C) 2010-2024 DBeaver Corp and others

        super(parent, style);
            " (0x" + Long.toHexString(sel[1]) + ")"; //$NON-NLS-1$ //$NON-NLS-2$
 *     http://www.apache.org/licenses/LICENSE-2.0
    }

 * distributed under the License is distributed on an "AS IS" BASIS,
 */
        updatePositionText(pos);
            separator1.setLayoutData(separator1GridData);
/*
    public HexStatusLine(Composite parent, int style, boolean withLeftSeparator)
     * Update the position status. Displays its decimal and hex value.


            valBinText.substring(valBinText.length() - 8) + " (bin)"; //$NON-NLS-1$
     *
     */
    /**
    private Label position = null;

 *
            Label separator1 = new Label(this, SWT.SEPARATOR);
import org.eclipse.swt.layout.GridData;

 */
 *
        separator3GridData.verticalAlignment = SWT.FILL;
     * Update the value. Displays its decimal, hex and binary value
 *
        String valBinText = "0000000" + Long.toBinaryString(val); //$NON-NLS-1$
    }
        GridData separator3GridData = new GridData();
import org.eclipse.swt.widgets.Composite;
     *
 * you may not use this file except in compliance with the License.
        GridData gridData1 = new GridData(/*SWT.DEFAULT*/
//	String posText = String.format("Offset: %1$d (dec) = %1$X (binary)", pos);
        GridData gridData3 = new GridData(/*SWT.DEFAULT*/
        position.setText(selText);
     */
    }
    public void updatePositionValueText(long pos, byte val)
/**
    public void updatePositionText(long pos)
        updateSelectionText(sel);
        separator23GridData.verticalAlignment = SWT.FILL;
                                          (7 + 3 + 9 + 2 + 9 + 8 + 6) * fontMetrics.getAverageCharWidth(), SWT.DEFAULT);
        GridLayout statusLayout = new GridLayout();
        if (isDisposed() || insertMode.isDisposed()) return;
                                          (TEXT_OVERWRITE.length() + 2) * fontMetrics.getAverageCharWidth(),
     *

    {
    /**
    {
                                          SWT.DEFAULT);
                                          SWT.DEFAULT);
        FontMetrics fontMetrics = gc.getFontMetrics();
     * Update the selection status and value.
        Label separator2 = new Label(this, SWT.SEPARATOR);
     * @param style             not used
     *
