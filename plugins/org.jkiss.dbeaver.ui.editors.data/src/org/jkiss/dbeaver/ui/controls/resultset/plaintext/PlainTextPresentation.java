            int pageIncrement = UIUtils.getFontHeight(text.getFont()) * 10;
import org.jkiss.dbeaver.ui.controls.StyledTextFindReplaceTarget;

    }
    @Override
        }
    @Override
                    lineNum--;
        int lineCount = text.getLineCount();
        text.setFont(UIUtils.getMonospaceFont());
            super.scrollToRow(position);

import org.eclipse.swt.custom.StyledTextPrintOptions;
        if (data != null) {
        }
        @Override
    }
            if (delimLeading) horOffsetEnd++;
        }
    @Nullable
        }
    }

            return Collections.singletonList(curAttribute);
            return curSelection == null ?
        }
    }

 *
            if (rowNum < 0) {
import org.eclipse.jface.action.IMenuManager;
        } else {
        colWidths = null;

    @Override
    private static PrinterData fgPrinterData= null;

        @NotNull

    private Color curLineColor;

                    colNum = i;
                }
            } else {
 */
        public List<DBDAttributeBinding> getSelectedAttributes() {
			/*
			 *	but this is currently not possible, see http://bugs.eclipse.org/297957
            int curPosition = text.getHorizontalPixel();
        final PrinterData data = dialog.open();
        StyledTextPrintOptions options = new StyledTextPrintOptions();
    public void createPresentation(@NotNull final IResultSetController controller, @NotNull Composite parent) {
            return Collections.singletonList(currentRow);
    }
        int lineOffset = text.getOffsetAtLine(lineNum);
    @Override
                new Object[] { curSelection };
            printGrid(append);
        } else {
        text.addCaretListener(event -> onCursorChange(event.caretOffset));
        @Override
        {
        final int horizontalIndex = text.getHorizontalIndex();
            }
        boolean delimLeading = getController().getPreferenceStore().getBoolean(ResultSetPreferences.RESULT_TEXT_DELIMITER_LEADING);
        text.setMargins(4, 4, 4, 4);
        public ResultSetRow getElementRow(Object element) {
            TextTransfer.getInstance(),
            if (lineNum == lineCount - 1 &&
            if (rowNum >= 0 && rowNum < model.getVisibleAttributeCount()) {
        if (UIStyles.isDarkHighContrastTheme()) {
            return curSelection;
            return;
    public void setDefaultDisplayFormat(DBDDisplayFormat displayFormat) {
 */
                }
        } else {
    @Override
            curLineColor = COLOR_GREEN_CONTRAST;
    public void updateValueView() {
            public void widgetSelected(SelectionEvent e) {
            fgPrinterData.startPage = 1;
    public static final int FIRST_ROW_LINE = 2;
    public void clearMetaData() {
                lineNum = FIRST_ROW_LINE;

    }
        @Override
                if (curLineRange == null || curLineRange.start != lineOffset + horOffsetBegin) {
        dialog.setPrinterData(fgPrinterData);
        totalRows = formatter.printGrid(grid, model);
    }
    @Override
    public static final Color COLOR_GREEN_CONTRAST = new Color(null, 23, 135, 58);
    }
    private StyledTextFindReplaceTarget findReplaceTarget;

            new Thread("Printing") { //$NON-NLS-1$
            text.setHorizontalIndex(horizontalIndex);
                controller.getPreferenceStore().getBoolean(ResultSetPreferences.RESULT_SET_AUTO_FETCH_NEXT_SEGMENT)) {
import org.jkiss.dbeaver.ui.editors.TextEditorUtils;
        public IResultSetController getController()
import org.jkiss.dbeaver.model.DBPAdaptable;
        public boolean isEmpty()
        }
                new Object[0] :


    @Override
    @Override
}
import org.eclipse.swt.printing.Printer;
                        controller.readNextSegment();
    public void fillMenu(@NotNull IMenuManager menu) {
    public void changeMode(boolean recordMode) {
    public ISelection getSelection() {
    private String curSelection;

    public void printResultSet() {
            final Runnable styledTextPrinter = text.print(printer, options);

            if (rowNum < 0 && model.getRowCount() > 0) {
    @Override
    @Override
        ScrollBar hsb = text.getHorizontalBar();

            }
import org.jkiss.dbeaver.ui.css.CSSUtils;
                case CURRENT:
        DBPPreferenceStore prefs = controller.getPreferenceStore();
    @Override
                case FIRST:
            text.showSelection();
        registerContextMenu();

import org.eclipse.swt.SWT;
        @NotNull


                        controller.isHasMoreData()) {
            int caretOffset = text.getCaretOffset();
            if (curAttribute == null) {
        if (controller.isRecordMode()) {
        }
        text.setTabStops(null);
                    lineNum = controller.getCurrentRow().getVisualNumber() + FIRST_ROW_LINE;

        text = new StyledText(parent, SWT.READ_ONLY | SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
        if (controller.isRecordMode()) {
        {
        if (hsb != null && hsb.isVisible()) {
                curPosition += pageIncrement;
    private int[] colWidths;

import org.eclipse.jface.viewers.ISelection;
        text.setSelection(0);
                if (horizontalOffset < horOffsetEnd) {
        }
 * Empty presentation.
    private void printGrid(boolean append) {
package org.jkiss.dbeaver.ui.controls.resultset.plaintext;
        text.setBlockSelectionBounds(new Rectangle(0, 0, 0, 0));
            curLineColor = ResultSetThemeSettings.instance.backgroundOdd;
                Collections.singletonList(curSelection);
    public Control getControl() {
                // Highlight row
                controller.isHasMoreData() &&
 * DBeaver - Universal Database Manager
            fgPrinterData = data;
                    styledTextPrinter.run();
import org.eclipse.swt.dnd.Transfer;
            if (curPosition < 0) curPosition = 0;
            switch (position) {


    }
            }
        {
                curAttribute = model.getVisibleAttribute(rowNum);
                }

            }
                    break;
        public Object[] toArray()
            final Printer printer = new Printer(data);

    @Override
        });

        @Nullable
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
import org.eclipse.jface.text.IFindReplaceTarget;

            UIUtils.showMessageBox(shell, "No printers", "Printers not found", SWT.ICON_ERROR);
        public DBDAttributeBinding getElementAttribute(Object element) {


            int lineOffset = text.getOffsetAtLine(lineNum);

 * Licensed under the Apache License, Version 2.0 (the "License");
            }
        return new PlainTextSelectionImpl();
        {
            }.start();
        public List<String> toList()

                curSelection = text.getSelectionText();


        }
                fireSelectionChanged(new PlainTextSelectionImpl());
        text.setFont(BaseThemeSettings.instance.monospaceFont);
        return curAttribute;
    public DBDDisplayFormat getDefaultDisplayFormat() {
            int totalLines = text.getLineCount();
        @Override
                controller.setCurrentRow(model.getRow(rowNum));

        return Collections.singletonMap(
    protected void applyThemeSettings(ITheme currentTheme) {
            }
            }
        text.setBackground(UIStyles.getDefaultTextBackground());
            // Restore scroll and caret position
        text.setText(grid.toString());
import org.eclipse.swt.events.SelectionEvent;

            text.setForeground(UIStyles.COLOR_WHITE);
                }
        @Override
                    break;

    private int totalRows = 0;
        PlainTextFormatter formatter = new PlainTextFormatter(getController().getPreferenceStore());
        curSelection = null;
    }
            {
    private void onCursorChange(int offset) {
        } else {
    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
        public Object getFirstElement()
        //controller.refreshData(null);
        boolean delimTop = prefs.getBoolean(ResultSetPreferences.RESULT_TEXT_DELIMITER_TOP);
    public void scrollToRow(@NotNull RowPosition position) {
        text.addSelectionListener(new SelectionAdapter() {
    @Override
        text.setLayoutData(new GridData(GridData.FILL_BOTH));
        int lineNum = text.getLineAtOffset(offset);
import org.eclipse.swt.widgets.Shell;
        totalRows = 0;
    }
                        !controller.isRecordMode() &&
            printRecord();

        }
            return false;
        return UIFonts.DBeaver.MONOSPACE_FONT;
    public String getFontId() {
    }

        }
    private DBDAttributeBinding curAttribute;
        }

                    text.redraw();
    public Map<Transfer, Object> copySelection(ResultSetCopySettings settings) {
        int horizontalOffset = offset - lineOffset;
        @Override
        fireSelectionChanged(new PlainTextSelectionImpl());

import org.eclipse.swt.widgets.ScrollBar;
            fgPrinterData.scope = PrinterData.ALL_PAGES;
                    lineNum++;
        return text;
    }
import org.jkiss.code.Nullable;
                curAttribute = model.getVisibleAttribute(colNum);
                    break;

                    curPosition -= pageIncrement;
import org.eclipse.swt.graphics.Rectangle;
            if (scrollCount > 0) {
                    curLineRange = new StyleRange(
                    break;
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
        formatter.printRecord(grid, controller.getModel(), controller.getCurrentRow());
            }
            int lineNum = text.getLineAtOffset(caretOffset);
        }
        StringBuilder grid = new StringBuilder(512);
                case PREVIOUS:
			 */
                case NEXT:
    private int startOffset;
            if (lineNum < FIRST_ROW_LINE || lineNum >= totalLines) {
 * Used when RSV has no results (initially).
    }
			 * 	Should copy the printer data to avoid threading issues,
        if (Printer.getPrinterList().length == 0) {
        public List<ResultSetRow> getSelectedRows()
            int newOffset = text.getOffsetAtLine(lineNum);

import java.util.Collections;

            newOffset += xOffset;
             * FIXME:
    }
        @Override

import org.eclipse.swt.printing.PrintDialog;

        final int caretOffset = text.getCaretOffset();
import org.eclipse.ui.themes.ITheme;
        colWidths = formatter.getColWidths();
    private void printRecord() {

import org.jkiss.dbeaver.ui.controls.resultset.*;
        }
            }
import org.jkiss.dbeaver.ui.UIFonts;
import org.jkiss.code.NotNull;
            if (lineNum < FIRST_ROW_LINE) {
            return controller;
    private StyleRange curLineRange;
 * Unless required by applicable law or agreed to in writing, software
                public void run() {
            return adapter.cast(findReplaceTarget);
            fgPrinterData.copyCount = 1;
                }

    }
        UIUtils.createHorizontalLine(parent);

 * See the License for the specific language governing permissions and
    }

public class PlainTextPresentation extends AbstractPresentation implements IResultSetDisplayFormatProvider, DBPAdaptable {
        @NotNull
        if (controller.isRecordMode()) {
    public <T> T getAdapter(@NotNull Class<T> adapter) {

    @Override
    private class PlainTextSelectionImpl implements IResultSetSelection {
                return Collections.emptyList();
            if (currentRow == null) {

        TextEditorUtils.enableHostEditorKeyBindingsSupport(controller.getSite(), text);
        super.createPresentation(controller, parent);
                    lineNum = totalLines - 1;
            }
                    break;
        startOffset = formatter.getStartOffset();
                if (curPosition > 0) {
import org.eclipse.swt.widgets.Control;
            }
            fgPrinterData.endPage = 1;
    @Override
        findReplaceTarget = new StyledTextFindReplaceTarget(text);
/*
            public void widgetSelected(SelectionEvent e) {
    }

        @Override
    }
            for (int i = 0; i < colWidths.length; i++) {
import org.jkiss.dbeaver.ui.UIUtils;
    }
                    text.setStyleRanges(new StyleRange[]{curLineRange});
                        lineOffset + horOffsetBegin,
        public int size()
        StringBuilder grid = new StringBuilder(512);
            int horOffsetBegin = 0, horOffsetEnd = startOffset;
        final Shell shell = getControl().getShell();
            text.setCaretOffset(caretOffset);
 * distributed under the License is distributed on an "AS IS" BASIS,

        public Iterator<String> iterator()
        activateTextKeyBindings(controller, text);
                horOffsetBegin = horOffsetEnd;
            return curSelection == null ? 0 : 1;
import org.eclipse.swt.dnd.TextTransfer;
            if (caretOffset < 0) caretOffset = 0;
        {
import java.util.Iterator;
import org.eclipse.swt.printing.PrinterData;
import org.eclipse.swt.events.SelectionAdapter;
                        null,
                rowNum = 0;
import org.eclipse.swt.graphics.Color;
        applyCurrentThemeSettings();
        }
    @Override
                return Collections.emptyList();
        return DBDDisplayFormat.safeValueOf(controller.getPreferenceStore().getString(ResultSetPreferences.RESULT_TEXT_VALUE_FORMAT));
            int xOffset = caretOffset - lineOffset;
        text.setCursor(parent.getDisplay().getSystemCursor(SWT.CURSOR_IBEAM));
    }
        ResultSetModel model = controller.getModel();
        text.setBlockSelection(true);

        }
            //text.setHorizontalIndex();
                    break;
import java.util.List;
        options.printTextForeground = true;
    }
                controller.readNextSegment();
        if (adapter == IFindReplaceTarget.class) {
    }
        @Override

            text.setTopIndex(topIndex);
                    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        @Override
        final PrintDialog dialog = new PrintDialog(shell, SWT.PRIMARY_MODAL);

            return curAttribute;
    public void formatData(boolean refreshData) {
            return toList().iterator();
        curLineRange = null;
    public void refreshData(boolean refreshMetadata, boolean append, boolean keepState) {
        options.printTextFontStyle = true;
    public boolean activated;
            @Override
                        horOffsetEnd - horOffsetBegin - 1,
        }
import org.eclipse.swt.custom.StyleRange;
import java.util.Map;
        {
            }
        @NotNull
 * you may not use this file except in compliance with the License.

            }
        ResultSetModel model = controller.getModel();
        text.setForeground(UIStyles.getDefaultTextForeground());
        PlainTextFormatter formatter = new PlainTextFormatter(getController().getPreferenceStore());
                horOffsetEnd += colWidths[i] + 1;

 *

            controller.updateEditControls();
            }
                case LAST:
            int colNum = 0;
        verticalBar.addSelectionListener(new SelectionAdapter() {
        text.setText(grid.toString());
        trackPresentationControl();
        controller.getPreferenceStore().setValue(ResultSetPreferences.RESULT_TEXT_VALUE_FORMAT, displayFormat.name());
            text.setBackground(UIStyles.getDefaultWidgetBackground());
                    printer.dispose();

                Collections.emptyList() :
import org.eclipse.swt.custom.StyledText;
        }
 *
                if (verticalBar.getSelection() + verticalBar.getPageIncrement() >= verticalBar.getMaximum()) {
 * You may obtain a copy of the License at
            return getController().getCurrentRow();
            text.setHorizontalPixel(curPosition);
            }
                    if (controller.getPreferenceStore().getBoolean(ResultSetPreferences.RESULT_SET_AUTO_FETCH_NEXT_SEGMENT) &&
        @Override
    private StyledText text;
/**
            @Override
        {

                    lineNum = FIRST_ROW_LINE;
    @NotNull
        }
    protected void performHorizontalScroll(int scrollCount) {
                rowNum = 0;
        final ScrollBar verticalBar = text.getVerticalBar();
            ResultSetRow currentRow = controller.getCurrentRow();
    @NotNull
        text.setTabs(controller.getPreferenceStore().getInt(ResultSetPreferences.RESULT_TEXT_TAB_SIZE));


import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        CSSUtils.setExcludeFromStyling(text);
import org.eclipse.swt.layout.GridData;
        final int topIndex = text.getTopIndex();
            text.getSelectionText());
                return;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public DBDAttributeBinding getCurrentAttribute() {
        return null;
import org.jkiss.dbeaver.ui.BaseThemeSettings;
        {
        }
            return curSelection == null ?
            //text.setSelection(newOffset, 0);
                        curLineColor);
        int rowNum = lineNum - FIRST_ROW_LINE - (delimTop ? 1 : 0) ; //First 2 lines is header + 1 if top delimiter turned on
        if (append) {
    @Override
import org.eclipse.swt.widgets.Composite;
            text.setCaretOffset(newOffset);

    @Override
import org.jkiss.dbeaver.ui.UIStyles;
            if (rowNum >= 0 && rowNum < model.getRowCount() && colNum >= 0 && colNum < model.getVisibleAttributeCount()) {

 * limitations under the License.
        });
