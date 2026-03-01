
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    /**
/**
import java.util.regex.Matcher;
        formData.right = new FormAttachment(100);
    };
 * See the License for the specific language governing permissions and
        label.setLayoutData(formData);
                    else
    }
    {
        rowLayout1.marginTop = 2;
            public void widgetSelected(org.eclipse.swt.events.SelectionEvent e)
    }
    private void createDialogShell()
package org.jkiss.dbeaver.ui.editors.binary.dialogs;
            public void widgetSelected(org.eclipse.swt.events.SelectionEvent e)
                String newText = text.getText();
    private void createTextPanel()
    /**
/*
            }
        createButtonsPanel();
        rowLayout1.marginHeight = 10;
                    tempResult = Long.parseLong(newText, radix);
        });
        //rowLayout1.marginWidth = 5;

        GridLayout gridLayout = new GridLayout();
                }
        textComposite = new Composite(dialogShell, SWT.NONE);
    private Shell dialogShell = null;  //  @jve:decl-index=0:visual-constraint="100,50"
        gotoButton.addSelectionListener(defaultSelectionAdapter);
     */
        Display display = getParent().getDisplay();
        formData2.top = new FormAttachment(textComposite);
        buttonPressed = 0;
        dialogShell.setDefaultButton(showButton);
        }
        Button closeButton = new Button(composite2, SWT.NONE);
        {
    private Button decRadioButton = null;

                saveResultAndClose();
    public GoToDialog(Shell aShell)
import org.jkiss.dbeaver.ui.editors.binary.HexManager;
        if (lastHexButtonSelected) {
import org.eclipse.swt.graphics.GC;
        });
            {
                        label2.setText(""); //$NON-NLS-1$
        FormData formData = new FormData();
        closeButton.setText(BinaryEditorMessages.dialog_go_to_button_close);
                    radix = 16;
        Composite composite2 = new Composite(dialogShell, SWT.NONE);
        formData.top = new FormAttachment(label);
        // selected. In that case automatic conversion is the wrong thing to do and very annoying.
    }
    }
                } else {
        textComposite.setLayoutData(formData);

        closeButton.addSelectionListener(new org.eclipse.swt.events.SelectionAdapter() {
            @Override
            text.setFocus();
        rowLayout1.type = org.eclipse.swt.SWT.VERTICAL;
    /**
            public void widgetSelected(org.eclipse.swt.events.SelectionEvent e)
            NLS.bind(BinaryEditorMessages.dialog_go_to_label_enter_location_number, limit, Long.toHexString(limit)));
                tempResult = -1;
        composite2.setLayout(rowLayout1);
                    else if (tempResult < 0)

                text.setText(text.getText());  // generate event
 * Unless required by applicable law or agreed to in writing, software
            {
    }
            {
        @Override

        gridLayout.numColumns = 2;
}
        decRadioButton.addSelectionListener(hexTextSelectionAdapter);//decTextSelectionAdapter);
//	rowLayout1.marginHeight = 5;
        super(aShell);
        rowLayout1.marginBottom = 2;
    private boolean lastHexButtonSelected = true;
    }
    {
    public long open(long aLimit)
        createTextPanel();
        text.setFocus();
                lastHexButtonSelected = e.widget == hexRadioButton;
        text.setTextLimit(30);

 *

    public long getButtonPressed()
        lastLocationText = text.getText();
                if (tempResult >= 0L && tempResult <= limit) {
        text.setText(lastLocationText);
        composite2.setLayoutData(formData);

            decRadioButton.setSelection(true);
        text.selectAll();
    private long finalResult = -1L;
        text.addModifyListener(new ModifyListener() {
        rowLayout1.marginWidth = 10;

 * limitations under the License.
        dialogShell.setLayout(formLayout);
    }
        hexRadioButton = new Button(composite, SWT.RADIO);
import org.eclipse.swt.widgets.*;
    private Label label2 = null;
        Composite composite = new Composite(textComposite, SWT.NONE);
        showButton.addSelectionListener(new org.eclipse.swt.events.SelectionAdapter() {
        hexRadioButton.setText("Hex"); //$NON-NLS-1$
import org.eclipse.osgi.util.NLS;
    private final SelectionAdapter defaultSelectionAdapter = new SelectionAdapter() {
     */
            {
import java.util.regex.Pattern;
    private Composite textComposite = null;
        int columns = 35;
        decRadioButton = new Button(composite, SWT.RADIO);
        dialogShell.pack();
        FormLayout formLayout = new FormLayout();
        // conversion. What does sometimes happen is one enters the right number and the wrong binary or dec was
                        label2.setText(BinaryEditorMessages.dialog_go_to_label_out_of_range);
    private void createButtonsPanel()
 * distributed under the License is distributed on an "AS IS" BASIS,
            createDialogShell();

        int width = columns * fm.getAverageCharWidth();
                int radix = 10;
                    gotoButton.setEnabled(false);
        }
        dialogShell = new Shell(getParent(), SWT.APPLICATION_MODAL | SWT.DIALOG_TRIM);
                Matcher numberMatcher;
    private String lastLocationText = "";
     */
 * Copyright (C) 2010-2024 DBeaver Corp and others
        rowLayout1.fill = true;
            public void modifyText(ModifyEvent e)
    {
        RowLayout rowLayout1 = new RowLayout();
    private long buttonPressed = 0;

                    if ("".equals(newText)) //$NON-NLS-1$
 * You may obtain a copy of the License at
            @Override
        rowLayout1.type = SWT.VERTICAL;
            @Override
     * This method initializes composite2
    private long tempResult = -1L;
        label = new Label(dialogShell, SWT.NONE);

    private Button showButton = null;
    {
        formData2.left = new FormAttachment(0);
                dialogShell.close();
        HexManager.reduceDistance(getParent(), dialogShell);
    private static final Pattern patternDecDigits = Pattern.compile("[0-9]+"); //$NON-NLS-1$
                    gotoButton.setEnabled(true);
        FormData formData = new FormData();
        return finalResult;
                if (hexRadioButton.getSelection()) {
        if (dialogShell == null || dialogShell.isDisposed()) {

                }
        formLayout.marginWidth = 3;
 * Licensed under the Apache License, Version 2.0 (the "License");
        gotoButton.addSelectionListener(new org.eclipse.swt.events.SelectionAdapter() {

     */

        SelectionAdapter hexTextSelectionAdapter = new SelectionAdapter() {
                if (numberMatcher.matches())
            }
    private Text text = null;
import org.eclipse.swt.events.ModifyListener;
        text = new Text(textComposite, SWT.BORDER | SWT.SINGLE);
                    showButton.setEnabled(false);

        formData.left = new FormAttachment(textComposite);
        gotoButton.setText(BinaryEditorMessages.dialog_go_to_button_go_to_location);

                    numberMatcher = patternHexDigits.matcher(newText);
 *

                } else {
    private Label label = null;
        formData2.right = new FormAttachment(100);
     */
        hexRadioButton.addSelectionListener(hexTextSelectionAdapter);
                    label2.setText(""); //$NON-NLS-1$
    private void saveResultAndClose()
        composite.setLayout(rowLayout1);
        });
    {
import org.eclipse.swt.events.SelectionAdapter;
        label2 = new Label(dialogShell, SWT.CENTER);
        createRadixPanel();
            hexRadioButton.setSelection(true);
        showButton.addSelectionListener(defaultSelectionAdapter);
        } else {
            }
        text.setLayoutData(new GridData(width, SWT.DEFAULT));
                    numberMatcher = patternDecDigits.matcher(newText);
public class GoToDialog extends Dialog {
 *     http://www.apache.org/licenses/LICENSE-2.0
     * This method initializes dialogShell
 * Go to dialog. Remembers previous state.
        formData.right = new FormAttachment(100);
            }
        formData2.bottom = new FormAttachment(100, -10);
            if (!display.readAndDispatch())
     * This method initializes textComposite

                    showButton.setEnabled(true);
    private void createRadixPanel()
    {
        limit = aLimit;


            {
        finalResult = -1L;
        RowLayout rowLayout1 = new RowLayout();
    private long limit = -1L;
        dialogShell.setText(BinaryEditorMessages.dialog_go_to_title);

                        label2.setText(BinaryEditorMessages.dialog_go_to_label_not_number);
                display.sleep();
     * This method initializes composite
        finalResult = tempResult;
 *
        hexRadioButton.addSelectionListener(defaultSelectionAdapter);
import org.eclipse.swt.layout.*;
        };
    private Button gotoButton = null;
import org.eclipse.swt.SWT;
    private static final Pattern patternHexDigits = Pattern.compile("[0-9a-fA-F]+"); //$NON-NLS-1$
        }
        gc.dispose();
        decRadioButton.addSelectionListener(defaultSelectionAdapter);
        label2.setLayoutData(formData2);
            public void widgetSelected(org.eclipse.swt.events.SelectionEvent e)
 * you may not use this file except in compliance with the License.
 */
import org.jkiss.dbeaver.ui.editors.binary.internal.BinaryEditorMessages;
    /**
        // Besides the crashes: the user always knows which number is entering, don't need any automatic
    {
        return buttonPressed;

import org.eclipse.swt.events.ModifyEvent;


        while (!dialogShell.isDisposed()) {
                saveResultAndClose();
        dialogShell.open();
        GC gc = new GC(text);
        formLayout.marginHeight = 3;

 *

        decRadioButton.setText("Dec"); //$NON-NLS-1$
                buttonPressed = 2;
        public void widgetSelected(org.eclipse.swt.events.SelectionEvent e)
        });
        textComposite.setLayout(gridLayout);
 * @author Jordi

        showButton = new Button(composite2, SWT.NONE);
    {
        label.setText(
            @Override
        FormData formData = new FormData();

        FontMetrics fm = gc.getFontMetrics();
        dialogShell.close();
    private Button hexRadioButton = null;
        showButton.setText(BinaryEditorMessages.dialog_go_to_button_show_location);
        formData.left = new FormAttachment(0, 5);
                buttonPressed = 1;
 * DBeaver - Universal Database Manager

    /**
            @Override
import org.eclipse.swt.graphics.FontMetrics;
 */
    }
            }
        gotoButton = new Button(composite2, SWT.NONE);
        FormData formData2 = new FormData();
        }
     * Save the result and close dialog
