        final int finalFactor = factor;
        findReplaceButtonsComposite.setLayoutData(formData);
        if (lastForward)
        if (sShell == null || sShell.isDisposed()) {
                public void modifyText(ModifyEvent e)

            }
        Composite ignoreCaseComposite = new Composite(sShell, SWT.NONE);
        replaceAllButton.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
        formData.left = new FormAttachment(directionGroup);
        FormData formData5 = new FormData();
/*
import org.jkiss.dbeaver.ui.editors.binary.internal.BinaryEditorMessages;
    {
        private Button textRadioButton = null;

        Display.getCurrent().timerExec(500, new Runnable() {
            GridLayout gridLayout = new GridLayout();

            selectionLength = editControl.getSelection()[1] - editControl.getSelection()[0];
                @Override
                message = textError + e;

        findButton = new Button(findReplaceButtonsComposite, SWT.NONE);
import java.util.regex.Matcher;
 * DBeaver - Universal Database Manager
        private void selectText()
                if (!searching || progressBar.isDisposed()) return;
    private static final String textIgnoreCase = BinaryEditorMessages.dialog_find_replace_ignore_case;
        lastFocused = findGroup;



        if (findGroup == null) {
                {

 *
                textCombo.remove(0, textCombo.getItemCount() - 1);
import java.util.Iterator;
            textCombo.addSelectionListener(new SelectionAdapter() {
    private void doReplaceFind()
            textRadioButton.setEnabled(enabled);
        progressBar.setMaximum((int) max);
        formLayout.marginHeight = 5;

                        Matcher numberMatcher = patternHexDigits.matcher(e.text);
     * This method initializes group1
        private List<Object[]> items = null;  // list of tuples {String, Boolean}
    }
            public void widgetSelected(SelectionEvent e)

                        selection = progressBar.getMaximum() - selection;
            try {
            {
        forwardRadioButton.addSelectionListener(defaultSelectionAdapter);
    private static final String textFoundLiteral = BinaryEditorMessages.dialog_find_replace_found_literal;
    }
import java.io.IOException;
    private TextHexInputGroup lastFocused = null;
        progressComposite = new Composite(feedbackComposite, SWT.NONE);
        formData5.left = new FormAttachment(0);
        }
                public void widgetSelected(SelectionEvent e)
        FormLayout formLayout2 = new FormLayout();
        private void createComposite()
        } else {
                    if (e.keyCode == 0) return;  // a list selection
            }
            public void run()

        formData4.top = new FormAttachment(feedbackLabel);
            textCombo.setEnabled(enabled);
                        textCombo.setText(""); //$NON-NLS-1$
            }
        lastReplaceHexButtonSelected = replaceGroup.hexRadioButton.getSelection();
 * @author Jordi
                editControl.getContent().get(ByteBuffer.wrap(selection), editControl.getSelection()[0]);
                }
 * state, in case it has been closed by the user and reopened again.
    private boolean searching = false;
        replaceFindButton.setEnabled(selectionLength > 0L && somethingToFind);

        findGroup.textRadioButton.addSelectionListener(hexTextSelectionAdapter);
            return;
            rowLayout1.type = SWT.VERTICAL;
    }
        searching = false;
        feedbackLabel.setText(message);
                Display.getCurrent().timerExec(1000, this);
            textRadioButton.setText(textText);
        String literal = findGroup.textCombo.getText();
        backwardRadioButton.addSelectionListener(defaultSelectionAdapter);
            public void widgetSelected(SelectionEvent e)
            @Override

        });
        {
        }
        findGroup.group.setText(textFindLiteral);
                @Override

            textCombo.setLayoutData(new GridData(width, SWT.DEFAULT));
        findButton.addSelectionListener(defaultSelectionAdapter);
            {
        progressBar = new ProgressBar(progressComposite, SWT.NONE);
            @Override
    }
        });
     * Group with text/hex selector and text input
/**
        }
        formData6.right = new FormAttachment(100);
        replaceGroup.refreshHexOrText(lastReplaceHexButtonSelected);
        findReplaceButtonsComposite.setLayout(gridLayout);
        closeButton.setEnabled(!searching);
            textRadioButton.setSelection(!hex);

        private void refreshHexOrText(boolean hex)
    }
        {
            hexRadioButton.setText(textHex);
 * Find/Replace dialog with hex/text, forward/backward, and ignore case options. Remembers previous
        findButton.setEnabled(!searching);
     */

    private static final List<Object[]> findReplaceReplaceList = new ArrayList<>();

        formData1.bottom = new FormAttachment(100);
     * This method initializes sShell
        checkBox.addSelectionListener(defaultSelectionAdapter);
        replaceAllButton.setEnabled(!searching);
            if (items == null) return;
     */
                int replacements = editControl.replaceAll(literal, findGroup.hexRadioButton.getSelection(),
        private Combo textCombo = null;
 * distributed under the License is distributed on an "AS IS" BASIS,
            for (int i = 0; i < selectionLength; ++i) {

            hexRadioButton.setSelection(hex);
        lastFindHexButtonSelected = findGroup.hexRadioButton.getSelection();
    private static final String textReplaceAll = BinaryEditorMessages.dialog_find_replace_replace_all;
     */
        ignoreCaseComposite.setLayoutData(formData);
            findGroup.refreshHexOrText(true);
    private Button checkBox = null;
    {
 *
        FillLayout fillLayout = new FillLayout();
        progressComposite.setVisible(false);
                }
import org.jkiss.dbeaver.ui.editors.binary.HexEditControl;
                doReplaceFind();
        FormData formData2 = new FormData();
    private static final String textClose = BinaryEditorMessages.dialog_find_replace_close;
import org.eclipse.swt.graphics.FontMetrics;


                }
        feedbackLabel.setLayoutData(formData3);
        }
            items = oldItems;

                    if (hexRadioButton.getSelection()) {
        while (max > Integer.MAX_VALUE) {
     */
    {
        sShell.setLayout(formLayout);
    /**
        activateProgressBar();
                    if (backwardRadioButton.getSelection()) {
        findGroup.initialise();
        gridLayout.marginHeight = 5;
            textRadioButton.addSelectionListener(defaultSelectionAdapter);
        });
            @Override
            {
import org.jkiss.dbeaver.ui.editors.binary.HexManager;
        fillLayout.marginHeight = 10;
    };
     * @param aShell where it is displayed
    private boolean lastForward = true;
        formData2.bottom = new FormAttachment(100);
    private void createIgnoreCaseComposite()
            replaceGroup = new TextHexInputGroup(findReplaceReplaceList);
        editControl.replace(replaceGroup.textCombo.getText(), replaceGroup.hexRadioButton.getSelection());
                String itemString = (String)iterator.next()[0];
    {
        findGroup.setEnabled(!searching);
    private static final String textHex = "Hex"; //$NON-NLS-1$
                {
 */
                doReplace();
        progressCancelButton.setText(textStop);
 * See the License for the specific language governing permissions and
    private void prepareToRun()
    }
            if (textCombo.getItemCount() > 0) {
    private static final String textFind = BinaryEditorMessages.dialog_find_replace_find;
    private static final String textReplacements = BinaryEditorMessages.dialog_find_replace_replacements;
        });
                    if (TextHexInputGroup.this == findGroup) {
            }
        sShell.setDefaultButton(findButton);
            selectText();
        progressCancelButton.setText(textCancel);
        private Button hexRadioButton = null;
            group.setLayout(gridLayout);
                    if (selection != null) {
    private static final String textReplaceFind = BinaryEditorMessages.dialog_find_replace_replace_find;
        replaceGroup.group.setText(textReplaceWith);
        };
        gridLayout.numColumns = 2;
            hexRadioButton.addSelectionListener(defaultSelectionAdapter);
        formLayout.spacing = 5;

        progressComposite.setLayoutData(formData4);
            composite = new Composite(group, SWT.NONE);
    private ProgressBar progressBar = null;
    private Button backwardRadioButton = null;
        if (editControl != null) {
        feedbackLabel.setText(""); //$NON-NLS-1$
            }
                throw new IllegalStateException(e);
    private void replace()
    private Button replaceButton = null;
        checkBox.setEnabled(!searching);
        checkBox.setText(textIgnoreCase);

            {
            });
        });
            @Override
        editControl = aTarget;
    {

            findGroup = new TextHexInputGroup(findReplaceFindList);
                @Override
        });
        progressBar.setMinimum((int) min);
        formData2.top = new FormAttachment(findReplaceButtonsComposite);

        formData.left = new FormAttachment(0);
        replaceButton.setEnabled(selectionLength > 0L);
        replace();

                    }
        long max = editControl.getContent().length();
            }
                message = textError + e;
    {


            @Override
        replaceButton.addSelectionListener(new org.eclipse.swt.events.SelectionAdapter() {
    {
    private Composite findReplaceButtonsComposite = null;
    private static final String textLiteralNotFound = BinaryEditorMessages.dialog_find_replace_literal_not_found;
        rowLayout.type = org.eclipse.swt.SWT.VERTICAL;
                if (replacements == 1) {
                lastReplaceHexButtonSelected != replaceGroup.hexRadioButton.getSelection()) {
            catch (IOException e) {
            FontMetrics fm = gc.getFontMetrics();
 *     http://www.apache.org/licenses/LICENSE-2.0
            gridLayout.numColumns = 2;
        findButton.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));

        replaceFindButton.setText(textReplaceFind);
                    Matcher numberMatcher = patternHexDigits.matcher(textCombo.getText());
            @Override

        String literal = findGroup.textCombo.getText();


    private static final String textReplace = BinaryEditorMessages.dialog_find_replace_replace;
    }
        Display.getCurrent().timerExec(1000, new Runnable() {
        closeButton.setText(textClose);
        }
        replace();
                    }
            try {
                    message = textFoundLiteral;
    private Button closeButton = null;
            gc.dispose();
        directionGroup = new Group(sShell, SWT.NONE);

                int selection = 0;
        formData5.height = progressBar.computeSize(SWT.DEFAULT, SWT.DEFAULT, false).y;
        if (editControl != null && literal.length() > 0) {
            }

            public void widgetSelected(org.eclipse.swt.events.SelectionEvent e)
                feedbackLabel.setText(""); //$NON-NLS-1$
        });
     * @param aTarget with data to search
            catch (IOException e) {

        replaceGroup.initialise();
    private static final String textBackward = BinaryEditorMessages.dialog_find_replace_backward;
        }
        formData2.right = new FormAttachment(closeButton);
        if (replaceGroup == null) {
        {
    private Group directionGroup = null;

            {
        backwardRadioButton.setText(textBackward);
 *
        progressComposite.setVisible(false);
     *
        {
        formData2.left = new FormAttachment(0);

            for (Object[] item : items) {
        super(aShell);


                progressBar.setSelection(selection);
    private static final String textNewFind = BinaryEditorMessages.dialog_find_replace_new_find;


        {

    /**
     */
import org.eclipse.swt.events.*;
            {
                    }
        checkBox.setSelection(lastIgnoreCase);
                doReplaceAll();
                lastFindHexButtonSelected != findGroup.hexRadioButton.getSelection() ||
            StringBuilder selectedText = new StringBuilder();
        directionGroup.setEnabled(!searching);
        FormData formData1 = new FormData();

            group = new Group(sShell, SWT.NONE);
                @Override
     */
    private static final String textFindReplace = BinaryEditorMessages.dialog_find_replace_find_replace;
    /**
                    feedbackLabel.setText(""); //$NON-NLS-1$
        replaceButton.setEnabled(!searching);
            public void widgetSelected(org.eclipse.swt.events.SelectionEvent e)
            findGroup.textCombo.setText(selectedText.toString());
        replaceAllButton.addSelectionListener(defaultSelectionAdapter);
        progressCancelButton = new Button(progressComposite, SWT.NONE);

        lastIgnoreCase = checkBox.getSelection();
    private void activateProgressBar()
        private void initialise()
                    if (index < 0) return;

        ignoreCaseComposite.setLayout(fillLayout);
    private static final String textText = BinaryEditorMessages.dialog_find_replace_text;
                }
        long selectionLength = editControl.getSelection()[1] - editControl.getSelection()[0];
                checkBox.setEnabled(e.widget == findGroup.textRadioButton);
        findGroup.hexRadioButton.addSelectionListener(hexTextSelectionAdapter);
        }
                                                       replaceGroup.hexRadioButton.getSelection());
 * Unless required by applicable law or agreed to in writing, software
        }
 * Copyright (C) 2010-2024 DBeaver Corp and others
        formLayout.marginWidth = 5;
    private TextHexInputGroup replaceGroup = null;
        directionGroup.setText(textDirection);
                textCombo.add(itemString);
    private static final String textForward = BinaryEditorMessages.dialog_find_replace_forward;
import org.eclipse.swt.SWT;
        String message = textLiteralNotFound;
        createFindReplaceButtonsComposite();
    private void createDirectionGroup()
    private Label feedbackLabel = null;
                    }
            }
            public void shellActivated(ShellEvent e)
        formData4.left = new FormAttachment(0);
            backwardRadioButton.setSelection(true);
        RowLayout rowLayout = new RowLayout();
                editControl.stopSearching();
        formData.top = new FormAttachment(replaceGroup.group);
            findGroup.selectText();
                if (editControl.getFinder() != null) {
        feedbackComposite.setLayout(formLayout2);
                {
            }
    private TextHexInputGroup findGroup = null;
            {
        progressCancelButton.addSelectionListener(new SelectionAdapter() {
        // visual components
//		getParent().setEnabled(enableButtons);
                }
import java.util.ArrayList;
        FormLayout formLayout3 = new FormLayout();
                public void widgetSelected(org.eclipse.swt.events.SelectionEvent e)
        searching = true;
    private void doReplaceAll()
        replaceButton.addSelectionListener(defaultSelectionAdapter);
     * Open and display the dialog.
 * you may not use this file except in compliance with the License.
        public void widgetSelected(SelectionEvent e)
        @Override
        lastFocused.textCombo.setFocus();
        doFind();
        if (progressComposite.isDisposed()) return;
            public void widgetSelected(SelectionEvent e)
    // visual components
import java.nio.ByteBuffer;
            @Override
    private static final String textStop = BinaryEditorMessages.dialog_find_replace_stop;
    /**
            }
                    message = text1Replacement;
                doFind();
        }
    private void doReplace()
     * Create find/replace dialog always on top of shell
                    selection = (int) (editControl.getFinder().getSearchPosition() >>> finalFactor);

            if (lastIgnoreCase != checkBox.getSelection() ||
    private boolean lastFindHexButtonSelected = true;
        progressCancelButton.setLayoutData(formData6);
     * This method initializes find/replace buttons composite
        public TextHexInputGroup(List<Object[]> oldItems)
import org.eclipse.swt.widgets.*;
     */

            int columns = 35;

        replaceButton = new Button(findReplaceButtonsComposite, SWT.NONE);
        replaceAllButton.addSelectionListener(new org.eclipse.swt.events.SelectionAdapter() {
        createDirectionGroup();
            });
    /**
            textCombo.setSelection(new Point(0, textCombo.getText().length()));
        forwardRadioButton = new Button(directionGroup, SWT.RADIO);
            textCombo = new Combo(group, SWT.BORDER);
        replaceAllButton.setText(textReplaceAll);
        replaceGroup.setEnabled(!searching);
            @Override
        }
    {
        GridLayout gridLayout = new GridLayout();
            }
            }
        directionGroup.setLayoutData(formData);
        }
        }
        closeButton.addSelectionListener(new SelectionAdapter() {
        backwardRadioButton = new Button(directionGroup, SWT.RADIO);
        replaceAllButton = new Button(findReplaceButtonsComposite, SWT.NONE);
        FormData formData = new FormData();
        private void setEnabled(boolean enabled)
                enableDisableControls();
            min = min >>> 1;
    {
            }
            findGroup.refreshHexOrText(lastFindHexButtonSelected);
        findButton.setEnabled(somethingToFind);
        enableDisableControls();
        replaceFindButton.setEnabled(!searching);
        closeButton = new Button(sShell, SWT.NONE);
        FormData formData = new FormData();
    SelectionAdapter defaultSelectionAdapter = new SelectionAdapter() {
        long min = editControl.getCaretPos();
        }
        sShell = new Shell(getParent(), SWT.MODELESS | SWT.DIALOG_TRIM);
        findGroup.refreshCombo();
        formData4.bottom = new FormAttachment(100);
public class FindReplaceDialog extends Dialog {
    {
        {
            public void widgetSelected(org.eclipse.swt.events.SelectionEvent e)
            if ("".equals(lastText) || items == null) return; //$NON-NLS-1$

    private static final List<Object[]> findReplaceFindList = new ArrayList<>();
    private Button replaceFindButton = null;
            for (Iterator<Object[]> iterator = items.iterator(); iterator.hasNext();) {
    class TextHexInputGroup {
                lastForward != forwardRadioButton.getSelection() ||
        FormData formData = new FormData();
        });

    private void enableDisableControls()
        FormData formData = new FormData();
    private void createSShell()
        sShell.pack();
        feedbackComposite.setLayoutData(formData2);
     */
            max = min;
 *
    private Button forwardRadioButton = null;
        findButton.addSelectionListener(new SelectionAdapter() {

    }
    /**
            }
            GC gc = new GC(textCombo);
            }
 * Licensed under the Apache License, Version 2.0 (the "License");

        findGroup.rememberText();
                String itemString = (String) item[0];

        {
        fillLayout.marginWidth = 10;
        formData.top = new FormAttachment(directionGroup);
//progressComposite.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_CYAN));
        sShell.addListener(SWT.Close, new Listener() {
        directionGroup.setLayout(rowLayout);

            int width = columns * fm.getAverageCharWidth();
                sShell.close();
        replaceFindButton.addSelectionListener(defaultSelectionAdapter);
    }
                                                       forwardRadioButton.getSelection(), checkBox.getSelection(),
        forwardRadioButton.setText(textForward);
            });
            composite.setLayout(rowLayout1);

                if (editControl.findAndSelect(literal, findGroup.hexRadioButton.getSelection(),
    private static final Pattern patternHexDigits = Pattern.compile("[0-9a-fA-F]*"); //$NON-NLS-1$
            forwardRadioButton.setSelection(true);
    }
package org.jkiss.dbeaver.ui.editors.binary.dialogs;

    private void endOfRun(String message)
                }
        FormData formData3 = new FormData();
import org.eclipse.swt.graphics.Point;
        if (selectionLength > 0L && selectionLength <= BinaryTextFinder.MAX_SEQUENCE_SIZE) {
    private Shell sShell = null;
    }
     *
        replaceFindButton = new Button(findReplaceButtonsComposite, SWT.NONE);
    {

                        refreshHexOrText(selection);
        replaceGroup.rememberText();
            {
        rowLayout.fill = true;
        FormData formData4 = new FormData();
    public void setTarget(HexEditControl aTarget)
        progressBar.setLayoutData(formData5);

            checkBox.setEnabled(!lastFindHexButtonSelected);
                }

        progressComposite.setLayout(formLayout3);
                    Boolean selection = (Boolean) (items == null ? null : (items.get(index))[1]);
            textCombo.addVerifyListener(new VerifyListener() {
            hexRadioButton = new Button(composite, SWT.RADIO);
        if (backwardRadioButton.getSelection()) {
        findReplaceButtonsComposite = new Composite(sShell, SWT.NONE);
            {
        findButton.setText(textFind);
    private boolean lastReplaceHexButtonSelected = true;

    private void createFindReplaceButtonsComposite()
            createSShell();
        if (editControl != null && literal.length() > 0) {
         */
    private HexEditControl editControl = null;
    }
        checkBox = new Button(ignoreCaseComposite, SWT.CHECK);
        boolean somethingToFind = findGroup.textCombo.getText().length() > 0;
                selectedText.append(GeneralUtils.byteToHex[selection[i] & 0x0ff]);
                    if (!numberMatcher.matches())
        int factor = 0;

        }
            {
        replaceFindButton.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
import org.eclipse.swt.layout.*;
        feedbackLabel.setText(textNewFind);
    private static final String textFindLiteral = BinaryEditorMessages.dialog_find_replace_find_literal;
        endOfRun(message);
        lastForward = forwardRadioButton.getSelection();
        sShell.open();
        formData4.right = new FormAttachment(100);
        FormLayout formLayout = new FormLayout();

        replaceButton.setText(textReplace);
        private Composite composite = null;
        gridLayout.makeColumnsEqualWidth = true;
            textRadioButton = new Button(composite, SWT.RADIO);
            refreshCombo();
            @Override
                        enableDisableControls();

        formData.right = new FormAttachment(100);
            catch (IOException e) {
            }
            public void handleEvent(Event event)
            });

        else
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            byte[] selection = new byte[(int) selectionLength];
            min = 0L;
                                                       replaceGroup.textCombo.getText(),
        }
    public FindReplaceDialog(Shell aShell)
    private static final String text1Replacement = BinaryEditorMessages.dialog_find_replace_1_replacement;
        forwardRadioButton.setEnabled(!searching);
            public void widgetSelected(SelectionEvent e)
        replaceFindButton.addSelectionListener(new org.eclipse.swt.events.SelectionAdapter() {
        formData5.bottom = new FormAttachment(100);
        feedbackLabel.setText(textSearching);
            {
            }
        prepareToRun();
import org.jkiss.dbeaver.utils.GeneralUtils;
        /**
        createIgnoreCaseComposite();
     * This method initializes composite3
        private void refreshCombo()
        backwardRadioButton.setEnabled(!searching);
            public void run()
        gridLayout.marginWidth = 0;
                public void verifyText(org.eclipse.swt.events.VerifyEvent e)
        HexManager.reduceDistance(getParent(), sShell);
            checkBox.setEnabled(false);
        endOfRun(message);
            }
            items.add(0, new Object[]{lastText, hexRadioButton.getSelection()});
     * Set the target editor to search
        formLayout3.spacing = 5;

        replaceGroup.refreshCombo();
                                           forwardRadioButton.getSelection(), checkBox.getSelection()))
            RowLayout rowLayout1 = new RowLayout();
            }
        formData5.right = new FormAttachment(progressCancelButton);
        String message = textLiteralNotFound;
        sShell.setText(textFindReplace);
                message = replacements + textReplacements;
        formData1.right = new FormAttachment(100);
    private Button replaceAllButton = null;
        }
                        e.doit = numberMatcher.matches();

            try {
        sShell.addShellListener(new ShellAdapter() {
            createComposite();
        formData3.top = new FormAttachment(0);
import org.jkiss.dbeaver.ui.editors.binary.BinaryTextFinder;
import java.util.List;
            }
        enableDisableControls();
        }
            rowLayout1.marginBottom = 2;
    }
        if (searching) {
import java.util.regex.Pattern;

        }
        SelectionAdapter hexTextSelectionAdapter = new SelectionAdapter() {
        FormData formData6 = new FormData();
    }
            }
        long selectionLength = 0L;
        enableDisableControls();
                    int index = textCombo.getSelectionIndex();
}
        {
        }

            String lastText = textCombo.getText();
        closeButton.setLayoutData(formData1);
    private Button progressCancelButton = null;
        enableDisableControls();
                    iterator.remove();
            ++factor;
        private Group group = null;
            }
        {

        progressCancelButton.setText(textCancel);
    private Composite progressComposite = null;
    /**
    {
            hexRadioButton.addSelectionListener(new SelectionAdapter() {
    private static final String textReplaceWith = BinaryEditorMessages.dialog_find_replace_replace_with;
            lastFocused.textCombo.setFocus();
    {
                    progressComposite.setVisible(true);


            @Override
        replaceGroup.group.setLayoutData(formData);

        feedbackLabel.setText(textNewFind);
        Composite feedbackComposite = new Composite(sShell, SWT.NONE);
        formData.top = new FormAttachment(replaceGroup.group);

        formData3.right = new FormAttachment(100);

    public void open()
    }
    private static final String textError = BinaryEditorMessages.dialog_find_replace_error_;
    {
 * limitations under the License.
            }
        });
 * You may obtain a copy of the License at
    private boolean lastIgnoreCase = false;
            hexRadioButton.setEnabled(enabled);
        });
                if (lastText.equals(itemString)) {
    private static final String textDirection = BinaryEditorMessages.dialog_find_replace_direction;
                textCombo.setText((String) items.get(0)[0]);
    {

                if (searching && !progressComposite.isDisposed()) {
        replaceAllButton.setEnabled(somethingToFind);
         * This method initializes composite
    private static final String textCancel = BinaryEditorMessages.dialog_find_replace_cancel;
            if (!items.isEmpty()) {
        prepareToRun();
        replaceButton.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
    {
    }
    private static final String textSearching = BinaryEditorMessages.dialog_find_replace_searching;
    /**
        private void rememberText()
                {
    }
        formData3.left = new FormAttachment(0);

    private Button findButton = null;
                }
            textCombo.addModifyListener(new ModifyListener() {
        progressBar.setSelection(0);
import org.eclipse.swt.graphics.GC;
            rowLayout1.marginTop = 2;
        feedbackLabel = new Label(feedbackComposite, SWT.CENTER);
    private void doFind()
                editControl.stopSearching();
            max = max >>> 1;
            @Override
//	formLayout2.spacing = 5;

        formData.top = new FormAttachment(findGroup.group);
 */
            group.setEnabled(enabled);
