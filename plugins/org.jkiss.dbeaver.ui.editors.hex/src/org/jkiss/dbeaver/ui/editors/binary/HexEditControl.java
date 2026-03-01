    /**
        }



    void notifyLongSelectionListeners()
        select(0L, content.length());
        ensureWholeScreenIsVisible();

                }
        }
            linesText.setEnabled(false);
    public StyledText getHexText()

        this.previousLine = -1;
        }
            linesTextSeparator.setBackground(headerRowBackgroundColor);
                        1,
        if (mergeHighlightRanges != null && mergeHighlightRanges.size() > mergeIndexHighlight) {
                    if (event.widget == previewText) {
                case SWT.HOME:
    {
        this.colorHighlightText = UIUtils.getSharedColor(UIUtils.blend(
        redrawTextAreas(mode, newText, resultHex, resultChar, viewRanges);
        if (charset != null) {
            }

            UIUtils.asyncExec(delayedWaiting);
        StringBuilder rowChars = new StringBuilder();

                            endPosition = --startPosition;
            hexText.addVerifyKeyListener(new ControlVerifyKeyAdapter());
        } else {
            } catch (IOException e) {
    {
                    } else {  // if no modifier or control or alt
            }
            previewText = new StyledText(previewColumn, SWT.MULTI);
                //notifyListeners(SWT.Modify, null);
                    content.get(ByteBuffer.wrap(tmpRawBuffer, 0, 1), null, getCaretPos());
            HexEditControl.this.copy();
//            return;
                    if (!readOnly && e.stateMask == SWT.CONTROL)  // control mod1
import java.nio.CharBuffer;
            if (e.button == 1 && (e.stateMask & SWT.MODIFIER_MASK & ~SWT.SHIFT) == 0) {// no modif or shift
        if (position < 0) return;
        public void verifyKey(VerifyEvent e)
                    redrawTextAreas(false);
    public final char[] byteToChar = new char[256];
            int textOffset;
        return getValue(getCaretPos());
    }
     * @param isReplaceHexString consider the literal as an hex string (ie. "0fdA1"). Used for binary
            previewTextSeparator.setEnabled(false);
            e.doit = false;
                    }
                        copy();
            linesText.setEditable(false);
    {
            previewText.setCaret(nonDefaultCaret);

                            getCaretPos(),
                    if (event.widget == previewText) {
    }
                } else {
    boolean handleSelectedPreModify()
     * at the current caret offset.
                break;
            }
     * @see Composite#setFocus()
import java.nio.charset.CodingErrorAction;
        numberOfLines = height / linesText.getLineHeight();
    /**
        {
            defaultCaret = hexText.getCaret();
                            ((oldPos - 1 - content.length()) / bytesPerLine + 1) * bytesPerLine;
            }
        int linesShifted = numberOfLines;
    public void setFont(Font font)
            columnLayout.verticalSpacing = 1;
        highlightRangesInScreen.clear();
//            fontDefault = new Font(Display.getCurrent(), DEFAULT_FONT_DATA);

            gridData.horizontalIndent = 1;
import org.eclipse.swt.events.*;
    public void setContentProvider(BinaryContent aContent, boolean notify)


        textGridData.widthHint = hexText.computeTrim(0, 0, bytesPerLine * 3 * fontCharWidth, 100).width;

        if (numberOfLines > 2)
        lastLocationPosition = position;
    private BinaryClipboard myClipboard;
                    newLinesStart = textAreasStart + (numberOfLines - (int) lines) * bytesPerLine;
        }
                if (countNibbles && oldPos < content.length()) upANibble = 1;
        refreshSelections();
        return content != null && content.canUndo();
        vertical.setMaximum((int) max);
            }
    }
            previewText.getContent().setText(resultChar.toString());
                    notifyListeners(SWT.Modify, null);
        public void mouseUp(MouseEvent e)

        previewText.setFont(fontCurrent);
            previousFindEnd = getCaretPos();


                    theText.append(GeneralUtils.nibbleToHex[nibble]);
        int commonWidth = width / displayedNumberWidth;
        drawUnfocusedCaret(false);
            GridData gridDataColumn1 = new GridData(SWT.BEGINNING, SWT.FILL, false, true);
     *                           finds. Will replace full bytes only, odd number of hex characters will have a leading '0' added.
        hexHeaderText.setText(headerRow.substring(0, Math.min(bytesPerLine * 3, headerRow.length())));
     * Performs a find on the text and sets the selection accordingly.
                }


            isHexString != previousFindStringWasHex || ignoreCase != previousFindIgnoredCase) {
            if (startPosition > content.length()) startPosition = content.length();
    static final int SHIFT_BACKWARD = 2;
            GridLayout column1Layout = new GridLayout();
            GridData gridDataColumn2 = new GridData(SWT.FILL, SWT.FILL, true, true);
                result[0] = finder.getNextMatch();
     * The start point is formed by event.width as the most significant int and event.x as the least
    {
    public void replace(String replaceString, boolean isHexString)
            columnLayout.marginHeight = 0;
        List<StyleRange> viewRanges = mergeRanges(changeRanges, highlightRangesInScreen);
        try {
    static final Color COLOR_LIGHT_SHADOW = Display.getCurrent().getSystemColor(SWT.COLOR_WIDGET_LIGHT_SHADOW);
        ));
        ensureWholeScreenIsVisible();
    {
    void setCaretsSize(boolean insert)
                case SWT.PAGE_DOWN:

    {

                    break;
                unfocusedCaret = hexText.getCaret();
            if (newSize == 1 || newSize == 2)
        throws IOException
     * The find starts at the current caret position.
    private boolean stopSearching = false;
        getHighlightRangesInScreen(newLinesStart, linesShifted * bytesPerLine);

     */
                        undo();
        fontCurrent = font;
        }
    void redrawTextAreas(int mode, StringBuilder newText, StringBuilder resultHex, StringBuilder resultChar,
                break;
        if (changesNotHighlights) {
     * same position, but only if it falls within the new content's limits.

        int displayedNumberWidth = fontCharWidth * 4;  // hexText and previewText
/*
            Composite hexColumn = new Composite(this, SWT.NONE);
            event.gc.setLineWidth(lineWidth);

    }
     * Overwrite mode replaces contents at the current selection start.
        ((DisplayedContent) hexText.getContent()).setDimensions(bytesPerLine * 3, numberOfLines);
            ((DisplayedContent) linesText.getContent()).shiftLines(newText.toString(), forward);
    public void setReadOnly(boolean readOnly) {
    public boolean canUndo()
            column1Layout.horizontalSpacing = 0;
                char decoded = cb.get();
    {

        ((GridData) previewTextSeparator.getLayoutData()).heightHint =
     */
    }
            hexText.setFont(fontCurrent);
        int result = 0;

                    }
                    else
     * Get the binary content
    {
                bb.clear();
            hexHeaderText.setFont(fontCurrent);
        hexText.setTopIndex(0);
    /**
     * While in insert mode, deletes the selection
     * @see StyledText#addSelectionListener(org.eclipse.swt.events.SelectionListener)
            int line = hexText.getLineAtOffset(hexText.getCaretOffset());
                updateTextsMetrics();
     * @return whether a match was found
    private long lastLocationPosition = -1L;
public class HexEditControl extends Composite {
                textAreasStart =
            linesText.setLayoutData(gridDataAddresses);
     * Replaces all occurrences of findString with replaceString.
     * compose byte-to-char map
        }
//                    if (selection != (startPosition != endPosition))
     * Tells whether the last action can be undone
            defaultCaret = previewText.getCaret();
    {
    public void undo()
        }
                higher = e.x / charLen;
            hexText.setLayoutData(textGridData);
            previewTextSeparator.setLayoutData(gridDataTextSeparator2);
            int tmp = intStart;
                    return;
            gridDataTextSeparator.widthHint = 10;
    @Override
            GC styledTextGC = new GC(linesText);
                } else {
        drawUnfocusedCaret(false);
                caretStickToStart = false;
            if (unfocusedGC != null) {
            UIUtils.asyncExec(delayed);
        layout();
        int width = getClientArea().width - linesText.computeSize(SWT.DEFAULT, SWT.DEFAULT).x;
    private class ControlTraverseAdapter implements TraverseListener {
            column2Layout.horizontalSpacing = 0;
        this.charsForAddress = charsForAddress;
            result = new StringBuilder(length);
    /**
        }

        initialize();
     * until last range border.

                textOffset = ((StyledText) e.widget).getOffsetAtLocation(new Point(e.x, e.y));
    private int previousLine;
                if (previousLine >= 0 && previousLine < numberOfLines) {
        return previewText;
        boolean highlight = mergeRangesIsHighlight;
        {
        } else {
        } else {
        if (aChar == '\0' || aChar == '\b' || aChar == '\u007f' || event.stateMask == SWT.CTRL ||
                textAreasStart = startPosition = endPosition = 0L;
    {
        }
            }
            max >>>= 1;
            textAreasStart = 0L;
import org.eclipse.swt.custom.StyledText;
    {
 * See the License for the specific language governing permissions and
            GridLayout column1HeaderLayout = new GridLayout();
     */
            throw (IOException) result[1];
    }
                    } else {
        linesText.pack(true);
    public static final FontData DEFAULT_FONT_DATA = new FontData(DEFAULT_FONT_NAME, 10, SWT.NORMAL);
        restoreStateAfterModify();
        long caretPos = getCaretPos();
            }
    /**
                    break;
            linesTextSeparator.setLayoutData(gridDataTextSeparator);
                // 159
                if (ctrlKey) {
            }
        this.mergeChangeRanges = changeRanges;
    {
    }
        content.delete(startPosition, endPosition - startPosition);

    public boolean deleteSelected()
        updateScrollBar();
            theText.append(GeneralUtils.nibbleToHex[((int) address) & 0x0f]).append(':');
        previousRedrawStart = textAreasStart;
                        oldPos = oldPos -
    {
                    notifyLongSelectionListeners();
     * Calls copy();deleteSelected();
            textAreasStart = caretPos - posInLine - bytesPerLine * numberOfLines_1;
                        long newPos = doNavigateKeyPressed(ctrlKey, e.keyCode, getCaretPos(), false);
        this.readOnly = readOnly;
    }
            previewText.addVerifyKeyListener(new ControlVerifyKeyAdapter());
        super.setFont(fontCurrent);
        public ControlSelectionAdapter(boolean hexContent)
        }
        this.lastFocusedTextArea = 1;
            hexText.addKeyListener(keyAdapter);
    {
        }
                }
        addControlListener(new org.eclipse.swt.events.ControlAdapter() {
import org.eclipse.swt.custom.StyleRange;
                if (!deleteSelected()) {
     * @param ignoreCase    match upper case with lower case characters

                        redrawCaret(true);
    }
    public boolean setFocus()
    long incrementPosWithinLimits(long oldPos, boolean countNibbles)

 * 'dirty', 'overwrite/insert', 'selection' and 'canUndo/canRedo' status.

    }
            actuallyRead = content.get(ByteBuffer.wrap(tmpRawBuffer, 0, Math.min(tmpRawBuffer.length, linesShifted * bytesPerLine)),
                e.doit = false;
            textAreasStart = content.length() - (content.length() - 1L) % bytesPerLine - 1L -

        } catch (IOException e) {
     *
                }



    private List<Integer> highlightRangesInScreen;
                        redrawTextAreas(false);
     */
     */
                refreshCaretsPosition();
        } else {

        // Compose header row
                    hexText.replaceTextRange(offset * 3, 2, GeneralUtils.byteToHex[tmpRawBuffer[0] & 0x0ff]);
            } else {
                previewText.setStyleRange(styleRange);
    {
    /**
            hexText.setDoubleClickEnabled(false);

    /**
    private List<Integer> mergeHighlightRanges = null;
        numberOfLines_1 = numberOfLines - 1;
                    if (e.stateMask == SWT.CONTROL)  // control mod1
            highlightRangesInScreen.add((int) (lastLocationPosition - textAreasStart));
            if ((mergeIndexChange & 1) == 1) {
     * Merge ranges of changes in file with ranges of highlighted elements.
            int width = bytesPerLine * 3 * fontCharWidth;
        GridLayout gridLayout1 = new GridLayout();
            }
            previewText.setFont(fontCurrent);
                charLen = 3;
    private Text previewTextSeparator = null;
    /**
    void refreshSelections()
     * Sets the selection from start to end.
    /**
        if (highlight == result) {
            }
 * DBeaver - Universal Database Manager
                    } else if (!readOnly && e.stateMask == SWT.SHIFT) {
    private boolean isInserting = true;
    }
                unfocusedGC = new GC(previewText);
     * @param replaceString      the new string
        return true;
                upANibble = 0;
//        if (focus) notifyListeners(SWT.Modify, null);

            tmp[i] = (byte) Integer.parseInt(hexByte, 16);
                previewText.setEditable(false);
            if (textAreasStart < 0L) textAreasStart = 0L;
                         List<StyleRange> viewRanges)
    private String previousFindString = null;
    /**
        }
        return (startPosition != endPosition);
                previewText.setCaretOffset(tmp);
     * @return did delete something
            linesColumn.setLayout(columnLayout);
    {
            return false;


        if (finder == null || !findString.equals(previousFindString) ||

    }
     */
    void refreshHeader()
            charsForFileSizeAddress = Long.toHexString(content.length()).length();
        if (font != null) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(data);
    }
            highlight = mergeRangesIsHighlight;
            }

            return endPosition;
	public void setDefWidth(int defValue) {

                        content.insert((byte) aChar, getCaretPos());
            switch (e.keyCode) {
        ((GridData) linesText.getLayoutData()).widthHint = charsForAddress * fontCharWidth;
        if (content == null || hexText.isDisposed()) return;
                    updateScrollBar();
        Caret defaultCaret;
 *
            }
            finder.stopSearching();
     */
                case 'c':
    {

                    break;
     * Create a binary text editor
            content.get(ByteBuffer.wrap(tmpRawBuffer, 0, 1), null, pos);
                unfocusedGC.setForeground(visible ? COLOR_NORMAL_SHADOW : HexEditThemeSettings.instance.colorCaretLine);

            notifyListeners(SWT.Modify, null);
            public void widgetSelected(SelectionEvent e)
            select(textAreasStart + lower, textAreasStart + higher);

                if (mode == SHIFT_BACKWARD)
import org.jkiss.utils.CommonUtils;
    private int upANibble = 0;  // always 0 or 1
    }
            hexText = new StyledText(hexColumn, SWT.MULTI);
        content = aContent;
            numberOfLines = 1;
            if (line != previousLine) {
        }
        }
        position = position - position % bytesPerLine;

 * Unless required by applicable law or agreed to in writing, software
    {
    private BinaryTextFinder finder = null;

            delayedInQueue = true;

                if (oldPos >= bytesPerLine) oldPos -= bytesPerLine;
     * Sets the content to be displayed. Replacing an existing content keeps the display area in the
            startPosition = Math.min(newPos, endPosition);
        this.highlightRangesInScreen = new ArrayList<>();
        }
    private boolean delayedInQueue = false;
    {
            }
    private long previousRedrawStart = -1;
    boolean mergerInit(List<Long> changeRanges, List<Integer> highlightRanges)
    private void loadSettings() {

            column1Layout.verticalSpacing = 1;
//            ensureCaretIsVisible();
                case SWT.ARROW_LEFT:
                }
            hexString = '0' + hexString;
            // StyledText.setCaretOffset() version 3.448 bug resets the caret size if using the default one,
            linesText.setForeground(HexEditThemeSettings.instance.cellHeaderForeground);
        startPosition = selection[0];
        StringBuilder theText = new StringBuilder();
     * @return the content being edited


            hexHeaderText.computeSize(SWT.DEFAULT, SWT.DEFAULT).y;
            finder.setNewStart(getCaretPos());
                bytesPerLine * numberOfLines_1;
     *
    }
    public void redrawCaret(boolean focus)
        //hexHeaderText.setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_BLACK));
            if (e.button == 1)
        });
        if (endLocation > bytesPerLine * numberOfLines)
     *
        redrawTextAreas(true);
    List<StyleRange> mergeRanges(List<Long> changeRanges, List<Integer> highlightRanges)
        return result;
     */
            } else {
        return tmpRawBuffer[0];
        }
                            ctrlKey,
    }

        this.readOnly = (style & SWT.READ_ONLY) != 0;
        this.fontDefault = BaseThemeSettings.instance.monospaceFont;
                    result + mergeChangeRanges.get(mergeIndexChange));
            if (e.detail == SWT.TRAVERSE_TAB_NEXT)
            previewText.setContent(new DisplayedContent(bytesPerLine, numberOfLines));

            handleSelectedPreModify();
    /**
     * Insert mode replaces the selection with the replaceString or, if there is no selection, inserts
     * Adds a long selection listener. Events sent to the listener have long start and end points.
                        offset,
            withinRange = true;
     * This method initializes composite

        });
            Composite previewColumn = new Composite(this, SWT.NONE);
        notifyLongSelectionListeners();
            delayedWaiting = null;
        vertical.setSelection(0);
                lower = higher;
                setSelection(startPosition, startPosition + (Integer) vector[1]);
        return new long[]{startPosition, endPosition};

        }
            //boolean selection = startPosition != endPosition;
        if (change == result) {
     *      Font height must not be 1 or 2.

            } catch (IOException ex) {
                decoder.decode(bb, cb, true);
        for (SelectionListener aListener : longSelectionListeners) {
        if (delayedInQueue) {
        int highlight = Integer.MAX_VALUE;
import org.jkiss.dbeaver.ui.editors.binary.pref.HexPreferencesPage;
            textAreasStart = position - (numberOfLines / 2) * bytesPerLine;
                result.append(byteToChar[tmpRawBuffer[i] & 0x0ff]);
                previousLine = line;
            if (endPosition > content.length()) endPosition = content.length();
     */
        public void copy() {
                select(startPosition, startPosition + (Integer) vector[1]);
                bb.rewind();
            GridLayout columnLayout = new GridLayout();
    public HexEditControl(final Composite parent, int style, int charsForAddress, int bytesPerLine)
        char aChar = event.character;

    void shiftStartAndEnd(long newPos)
                case 'z':
    }
        }
                int nibble = ((int) (address >>> j)) & 0x0f;
            @Override
        try {
            intStart = intEnd;

        textAreasStart = position;
            previewGridData = new GridData();
            previewColumn.setLayout(column2Layout);
        deleteSelected();
            if (Math.abs(lines) < numberOfLines) {
    {
    {

            }
                    break;
                previousLine += newText.length() / charsForAddress * (forward ? 1 : -1);
    private int mergeRangesPosition = -1;
        return true;
    {
    public byte getActualValue()

        };
        if (isHexString) {
            case SWT.PAGE_DOWN:
     */
        previewText.setTopIndex(0);
     * Get long selection start and end points. Helper method for long selection listeners.
     * Get caret position in file, which can be out of view
    private long textAreasStart = -1L;
        refreshSelections();
        redrawTextAreas(true);
    {
        }

        return false;

                    --oldPos;
            previewText.setDoubleClickEnabled(false);
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15};
    public byte getValue(long pos)
    public HexEditControl(final Composite parent, int style)
        upANibble = 0;
        });
        if (fontCurrent == null) {
                    if (oldPos > content.length())
     *
            } catch (IllegalArgumentException ex) {
            previousLine = -1;
    /**
            previewGridData.grabExcessVerticalSpace = true;
//                notifyListeners(SWT.Modify, null);
    {

        if (notify) {
    private class EditableStyledText extends StyledText {
            previewText.addFocusListener(myFocusAdapter);
            Runnable delayed = () -> {
    }
    }
                        if (startPosition > 0L) {
    /**
                hexText.setStyleRange(styleRange);
    }
                previewText.setLineBackground(line, 1, HexEditThemeSettings.instance.colorCaretLine);
                }
     * @return the byte[] value of the hex string
    }
                finder = new BinaryTextFinder(findString, content);
            }
            event.gc.setForeground(HexEditThemeSettings.instance.cellHeaderBackground);

        BinaryContent binaryContent = new BinaryContent();
     * Similarly for the end point:
    }
        FocusListener myFocusAdapter = new FocusAdapter() {
                bb.put((byte) i);
            if (hexContent) charLen = 3;
                case SWT.INSERT:
    private final int charsForAddress;  // Files up to 16 Ters: 11 binary digits + ':'
            return startPosition;
    long totalNumberOfLines()
                        theText.append(' ');
    }
            column2Layout.marginHeight = 0;

     * Tells whether the input is in overwrite or insert mode
            newSelection.limit((int) Math.min(newSelection.limit(), content.length() - startPosition));
 *     http://www.apache.org/licenses/LICENSE-2.0

        caretStickToStart = endPosition != newPos;
            onUnmappableCharacter(CodingErrorAction.REPLACE).
                            boolean ignoreCase)

        else
        }
     *
    private boolean caretStickToStart = false;  // stick to end
                } else {  // shift
        if (viewRanges != null) {
     *
                if (isInserting) {
        super.setFont(fontCurrent);
    /**
                upANibble ^= 1;  // 1->0, 0->1
        if (length > tmpRawBuffer.length) length = tmpRawBuffer.length;
                            e.widget == hexText && !isInserting);
     * @throws IllegalArgumentException if font height is 1 or 2
            fontCharWidth = styledTextGC.getFontMetrics().getAverageCharWidth();

        long startLocation = startPosition - textAreasStart;
    public static long[] getLongSelection(SelectionEvent event)
                            e.keyCode,
                ensureCaretIsVisible();
                lastFocusedTextArea = 1;
        this.longSelectionListeners = new ArrayList<>();
            if (updateGui) {
        return result;
                    //boolean selection = startPosition != endPosition;

            withinRange = true;
     * Copies the selection into the clipboard. If nothing is selected leaves the clipboard with its
            if (readOnly) {
                    } else {  // e.character == SWT.DEL
                if (nibble != 0)

        //boolean selection = startPosition != endPosition;
                int xPos = (charLen * block) * fontCharWidth - rightHalfWidth;
            previewTextSeparator = new Text(previewColumn, SWT.SEPARATOR);
        addDisposeListener(e -> {
        if (!isInserting)
        ensureCaretIsVisible();
     * Stop findAndSelect() or replaceAll() calls. Long running searches can be stopped from another
    @Override
import java.nio.charset.CharsetDecoder;
        } else {
                case 'x':

            width = fontCharWidth;
                if (upANibble > 0) ++oldPos;
        }
     *                           Will search full bytes only, odd number of hex characters will have a leading '0' added.
    public boolean findAndSelect(String findString, boolean isHexString, boolean searchForward,
    private List<SelectionListener> longSelectionListeners;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
     * Undoes the last action
    }
     */
            column1Layout.marginWidth = 0;
        while (mergerNext()) {
                    if (e.character == SWT.BS) {
                // neither font metrics nor graphic context work for charset 8859-1 chars between 128 and
            if (firstContent || endPosition > content.length() || textAreasStart >= content.length()) {
            GridData gridDataTextSeparator2 = new GridData();
    private StyledText hexHeaderText = null;
        setContentProvider(binaryContent, notify);
                break;
        StringBuilder newText = cookAddresses(newLinesStart, linesShifted * bytesPerLine);
    {

                        endPosition = startPosition = doNavigateKeyPressed(
        UIUtils.addFocusTracker(UIUtils.getActiveWorkbenchWindow(), CONTROL_ID, this);

     *
        changed(new Control[]{hexHeaderText, linesText, hexText, previewText});
    }
            if (countNibbles) {

        if (caretStickToStart)
    }
                        redo();
        return !isInserting;
                case SWT.PAGE_UP:
                    oldPos = 0;
        GC unfocusedGC = null;
                textAreasStart);

        finder = null;
     *
        throws IOException
        vertical.setSelection((int) ((textAreasStart / bytesPerLine) >>> verticalBarFactor));
    }
    }
/*
                setFocus();
        if (isInserting) {
            throw new IllegalArgumentException();
    }
        if (vector != null && vector.length > 1 && vector[0] != null && vector[1] != null) {
    {
    static {
        long caretPos = getCaretPos();
    private boolean previousFindIgnoredCase = false;
            {

    StringBuilder cookAddresses(long address, int limit)
            } else {

    public void setContent(byte[] data, String charset)
        if (isHexOutput) {
        int intEnd = (int) endLocation;
            ++verticalBarFactor;
            if (content != null)

        return theText;
        }
        this.myClipboard = new BinaryClipboard(parent.getDisplay());
                    refreshCaretsPosition();

                drawUnfocusedCaret(false);
     *                      Will search full bytes only, odd number of hex characters will have a leading '0' added.
    private Font fontDefault = null;  // disposed internally
                    runnableAdd(delayed);
                caretPos != content.length()) {
        throws IOException
            if (previousLine < -1 || previousLine >= numberOfLines)
        if (mergeChangeRanges != null && mergeChangeRanges.size() > mergeIndexChange) {

                cb.clear();
                        shiftStartAndEnd(newPos);
        for (int i = 0; i < 256; ++i) {
        {
                    break;

            UIUtils.addFocusTracker(UIUtils.getActiveWorkbenchWindow(), CONTROL_ID, previewText);
                    if (!readOnly && e.stateMask == SWT.CONTROL)  // control mod1
        switch (keyCode) {
                event.gc.drawLine(xPos, event.y, xPos, event.y + event.height);
        if (start > 0L) {

        10, 11, 12, 13, 14, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            hexHeaderText.setLayoutData(gridData);

    private void ensureWholeScreenIsVisible()
            for (int block = defWidth; block <= bytesPerLine; block += defWidth) {
                case SWT.ARROW_DOWN:
    int mergerMinimumInChangesHighlights()
                case SWT.ARROW_RIGHT:
            actuallyRead = 0;
            for (int i = 0; i < length; ++i) {
    private long doNavigateKeyPressed(boolean ctrlKey, int keyCode, long oldPos, boolean countNibbles)
                result = (content.length() - 1L) / bytesPerLine + 1L;

                        oldPos = (oldPos + bytesPerLine * numberOfLines_1) % bytesPerLine;
    }
            HexEditThemeSettings.instance.cellHeaderBackground.getRGB(),
    static final int minCharSize = 5;
        try {

                    startPosition = endPosition = textAreasStart + byteOffset;
            {
            previewText.addPaintListener(new ControlPaintAdapter(false));
        if (getCaretPos() == content.length() && !isInserting) {
            int caretPos = ((StyledText) e.widget).getCaretOffset() / charLen;
    private boolean findAndSelectInternal(String findString, boolean isHexString, boolean searchForward,
            linesText.setContent(new DisplayedContent(charsForAddress, numberOfLines));
    static final Color COLOR_NORMAL_SHADOW = Display.getCurrent().getSystemColor(SWT.COLOR_WIDGET_NORMAL_SHADOW);
    public BinaryContent getContent()
            hexText.addSelectionListener(new ControlSelectionAdapter(true));
        Caret nonDefaultCaret;
     * @param findString         the literal to find
            makeFirstRowSameHeight();
    boolean mergerNext()
                decoder.reset();
            hexText.getContent().setText(resultHex.toString());
    {
        if (hexText.isDisposed()) return;
            hexText.setContent(new DisplayedContent(bytesPerLine * 3, numberOfLines));
                if (oldPos >= bytesPerLine) {
            previewText.getCaret().setVisible(false);
            column1HeaderLayout.marginWidth = 0;
                unfocusedCaret = previewText.getCaret();
        handleSelectedPreModify();

 *
        verticalBarFactor = 0;
            if (hexContent) {
        setAddressesGridDataWidthHint();
                upANibble = 0;
    private byte[] tmpRawBuffer = new byte[maxScreenResolution / minCharSize / 3 * maxScreenResolution / minCharSize];
        gc.dispose();
            } else {
        stopSearching = true;
            15
        setCaretsSize(focus ? (!isInserting) : isInserting);
    public void selectAll()
        if (!handleSelectedPreModify()) {

        long endLocation = endPosition - textAreasStart;
                if (e.widget == previewText)
            }
     * @return true: overwriting, false: inserting

            previewColumn.setLayoutData(gridDataColumn2);
                        runnableEnd();
                styleRange.start *= 3;
        vertical.setMinimum(0);
            refreshHeader();
                    if (e.stateMask == SWT.CONTROL)  // control mod1
        }
        undo(false);
                            content.delete(startPosition - 1L, 1L);
                    finder.setCaseSensitive(false);
        }
    }
            hexText.addFocusListener(myFocusAdapter);
            //hexColumn.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));
    {

            int tmp = (int) caretLocation;
                        content.insert((byte) (hexToNibble[aChar - '0'] << 4), getCaretPos());
    void restoreStateAfterModify()
            if (i < 0x20 || i == 0x7f) {
     */
            hexText.setRedraw(false);
            event.widget == hexText && ((event.stateMask & SWT.MODIFIER_MASK) != 0 ||

    /**
    public void copy()
    }
            try {
    static final byte[] hexToNibble = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1,
        bytesPerLine = commonWidth;
        StringBuilder resultHex = cookTexts(true, actuallyRead);
        @Override
    /**
        anEvent.height = (int) (endPosition >>> 32);
     */
    }
        }

        }
        previewGridData.widthHint = previewText.computeTrim(0, 0, bytesPerLine * fontCharWidth, 100).width;
        @Override

    public void setCharset(String name)

    private boolean readOnly;
        boolean withinRange = false;
        SelectionEvent anEvent = new SelectionEvent(basicEvent);

     * Shows the position on screen.

            if (mergerPosition(false) < mergeRangesPosition) {
     * @param aContent the content to be displayed
    private void refreshCaretsPosition()
            hexText.addPaintListener(new ControlPaintAdapter(true));
        {
        // to see anyway
    }

    }
                case 'v':
    private StyledText previewText = null;
        try {
            public void mouseDown(org.eclipse.swt.events.MouseEvent e)
        return tmp;

        fontCharWidth = gc.getFontMetrics().getAverageCharWidth();
            textAreasStart + bytesPerLine * numberOfLines == caretPos &&
     * The find starts at the current caret position.

    }
                if (oldPos <= content.length() - bytesPerLine) oldPos += bytesPerLine;
    private BinaryContent content = null;
        ++mergeRangesPosition;

            hexColumn.setLayout(column1Layout);
            endPosition = Math.max(newPos, startPosition);
            linesText.setBackground(HexEditThemeSettings.instance.cellHeaderBackground);
     * long end = ((long)event.height) << 32 | (event.y & 0x0ffffffffL)
    {
        while (!stopSearching &&
                case SWT.END:
                unfocusedGC = new GC(hexText);
            if (e.button == 1)
                    hexText.setStyleRange(new StyleRange(offset * 3, 2, colorHighlightText, null));
        });
        ControlPaintAdapter(boolean isHexText)
            endPosition = Math.max(newPos, endPosition);
                if ((e.stateMask & SWT.MODIFIER_MASK) == 0) {


                }

     *
        return withinRange;
     * @return true: an action ca be redone

            startPosition = (Long) vector[0];
            }
            return;
    private class ControlKeyAdapter extends KeyAdapter {
     * The new selection is made visible

        ensureWholeScreenIsVisible();
            return hexText.setFocus();
            case SWT.HOME:
            //linesColumn.setBackground(COLOR_LIGHT_SHADOW);
        return finder;
        if (startLocation < 0L) startLocation = 0L;
        this.bytesPerLine = bytesPerLine;
                    } else if (e.stateMask == SWT.CONTROL) {

     * significant int. The end point is similarly formed by event.height and event.y
    }
     */
                    oldPos = oldPos + bytesPerLine * numberOfLines_1;
        ByteBuffer newSelection = ByteBuffer.wrap(replaceData);
            } else {
        addMouseListener(new org.eclipse.swt.events.MouseAdapter() {
        }
                styleRange.length *= 3;
    void drawUnfocusedCaret(boolean visible) {
            startPosition > textAreasStart + bytesPerLine * numberOfLines ||
            startPosition = Math.min(newPos, startPosition);
    private StyledText linesText = null;
        setLayout(gridLayout1);
        if (isInserting && upANibble != 0) {
     * @param isHexString   consider the literal as an hex string (ie. "0fdA1"). Used for binary finds.
                return;
     * Sets the selection to the entire text. Caret remains either at the selection start or end
            nonDefaultCaret = new Caret(defaultCaret.getParent(), defaultCaret.getStyle());
    private void initFinder(String findString, boolean isHexString, boolean searchForward,
            }
                        }


            int width = bytesPerLine * fontCharWidth + 1;  // one pixel for caret in last linesColumn
    void runnableEnd()
        updateScrollBar();
                if (previousStart == textAreasStart) return;
                    ensureCaretIsVisible();

            column2Layout.verticalSpacing = 1;
 * you may not use this file except in compliance with the License.
            refreshCaretsPosition();
    }
        finder.setDirectionForward(searchForward);
                        runnableEnd();
        handleSelectedPreModify();
            int lower = e.x / charLen;
        if ((hexString.length() & 1) == 1)  // nibbles promote to a full byte

        public void mouseDown(MouseEvent e)
    }
    private int numberOfLines_1 = numberOfLines - 1;
 * @author Jordi
    public boolean isOverwriteMode()
    public void stopSearching()
                log.warn("Can't cleanup clipboard temporary data");
    private GridData previewGridData = null;
        if (mode == SET_TEXT) {
        public ControlMouseAdapter(boolean hexContent)
        mergeRangesPosition = -1;
    private void initialize() {

     * @param replaceString the new string
        return content;
     * A listener can obtain the long selection with this code: getLongSelection(SelectionEvent)
        loadSettings();
            setSelection(getSelection()[0], getSelection()[1]);


        @Override
                break;
                cb.rewind();
                upANibble = 0;
        } else {
            hexText.addMouseListener(new ControlMouseAdapter(true));
        }
            }
        endPosition = startPosition;
            return true;
                hexText.setLineBackground(line, 1, HexEditThemeSettings.instance.colorCaretLine);
            if (readOnly) {
        {
    }

            linesColumn.setLayoutData(gridDataColumn);
     */

        Caret unfocusedCaret;
        }
    }
     * @return true: an action ca be undone
            HexEditThemeSettings.instance.colorCaretLine.getRGB(), 50));
    }
    public StyledText getPreviewText()
                byteToChar[i] = (char) (160 + i);
            if ((e.character == SWT.DEL || e.character == SWT.BS) && isInserting) {
import org.jkiss.dbeaver.ui.UIUtils;
                }
        }
            findAndSelectInternal(findString, isFindHexString, searchForward, ignoreCase, false)) {
            result = (int) (mergeChangeRanges.get(mergeIndexChange & 0xfffffffe) -
    }
                        content.delete(startPosition, 1L);
            linesText = new StyledText(linesColumn, SWT.MULTI | SWT.READ_ONLY);

            content.overwrite(newSelection, startPosition);
     * @param ignoreCase         match upper case with lower case characters
                };
                result = (int) Math.min(bytesPerLine * numberOfLines,
    {
     * thread.

    public long getCaretPos()
     */
    private int defWidth = Integer.valueOf(HexPreferencesPage.getDefaultWidth());
                result += mergeHighlightRanges.get(mergeIndexHighlight);



            if (blue || highlight) {
                refreshSelections();
    }
    {
            public void controlResized(org.eclipse.swt.events.ControlEvent e)
            ((long) event.height) << 32 | (event.y & 0x0ffffffffL)};
        HexManager.blockUntilFinished(() -> {
 * A binary file editor, composed of two synchronized displays: an hexadecimal and a basic ascii char

            } catch (IOException e) {

    {


        endPosition = startPosition;
            gridDataTextSeparator2.horizontalAlignment = SWT.FILL;

     * significant int. The end point is similarly formed by event.height and event.y
    {
        }
    {
                                          boolean ignoreCase, boolean updateGui)
                    if (!readOnly && e.stateMask == SWT.CONTROL)  // control mod1
            upANibble = 0;
import org.eclipse.swt.layout.GridData;
            linesText.setFont(fontCurrent);
        CharBuffer cb = CharBuffer.allocate(1);
    {
import org.jkiss.dbeaver.utils.GeneralUtils;
        return findAndSelectInternal(findString, isHexString, searchForward, ignoreCase, true);
                    oldPos = content.length();
    /**
     *
import org.jkiss.dbeaver.Log;
            //hexHeaderGroup.setBackground(COLOR_LIGHT_SHADOW);
    }
        hexHeaderText.pack(true);
                    previewText.setLineBackground(previousLine, 1, null);
            if (tmp == bytesPerLine * numberOfLines) {

    {
        ((DisplayedContent) previewText.getContent()).setDimensions(bytesPerLine, numberOfLines);
            @Override
        GC gc = new GC(hexHeaderText);
                break;
                ++mergeIndexChange;
        restoreStateAfterModify();
import org.eclipse.swt.widgets.*;
        public void keyPressed(KeyEvent e)
                    if (j >= (charsForFileSizeAddress * 4))
    private int bytesPerLine;
        }

        refreshHeader();
     *
            previousFindStringWasHex = isHexString;

        if (isDisposed()) {
            caretStickToStart = caretPos < higher || caretPos < lower;
            textGridData.horizontalIndent = 1;

        if (longSelectionListeners.isEmpty()) return;
                    hexText.setLineBackground(previousLine, 1, null);
            case SWT.ARROW_LEFT:

        long posInLine = caretPos % bytesPerLine;
            mergeRangesIsHighlight = (mergeIndexHighlight & 1) == 0;
            }
        int width = 0;

        if (charset == null || previewText == null) return;
        mergeRangesIsHighlight = false;
    }
//            if (selection != (startPosition != endPosition))
        if (textAreasStart > caretPos) {
        if (end > startPosition) {
                    if ((e.stateMask & SWT.SHIFT) != 0) {  // shift mod2
                textOffset = ((StyledText) e.widget).getCharCount();

                if (ctrlKey) {

            previewText.addMouseListener(new ControlMouseAdapter(false));
    public void selectBlock(long start, long end)
                        copy();
            return;
     * Pastes the clipboard content. The result depends on which insertion mode is currently active:
        long result = 1L;
        });
    }
*/
        restoreStateAfterModify();
        notifyListeners(SWT.Modify, null);
		this.defWidth = defValue ;
                    if (oldPos < 0L)
                    refreshSelections();
                setFocus();
    }

        @Override
            fontCurrent = fontDefault;
    }

    {
        copy();
        return result;
import java.nio.ByteBuffer;
    {
            ((DisplayedContent) previewText.getContent()).shiftLines(resultChar.toString(), forward);
     */
    private int fontCharWidth = -1;
                    runnableAdd(delayed);

            GridData gridData = new GridData();
    /**
            if (focus) setFocus();
        Object[] vector = (Object[]) result[0];
    public void redo()
        if (oldPos < content.length())
                    Runnable delayed = () -> {
        }
                    unfocused.width << chars,
     * Overwrite mode replaces contents at the current caret offset, unless pasting would overflow the
    private int lastFocusedTextArea;  // 1 or 2;
            previewText.getCaret().setVisible(true);
            runnableAdd(delayed);

        }
        redrawTextAreas(false);
    private String charset = null;

        makeFirstRowSameHeight();
            hexHeaderGroup.setLayout(column1HeaderLayout);
                e.doit = true;
                    oldPos = oldPos - oldPos % bytesPerLine + bytesPerLine - 1L;
                    boolean ctrlKey = (e.stateMask & SWT.CONTROL) != 0;
     */
        select(start, end);
     * Insert mode replaces the selection with the DND.CLIPBOARD clipboard contents or, if there is no
        }
        charset = name;
            for (int i = 0; i < length; ++i) {
    }
                    ensureWholeScreenIsVisible();

    void select(long start, long end)
        int chars = 0;
                runnableAdd(delayed);

 * Copyright (C) 2010-2024 DBeaver Corp and others

        return content != null && content.canRedo();
        }
     * long start = ((long)event.width) << 32 | (event.x & 0x0ffffffffL)
            rowChars.append(GeneralUtils.byteToHex[i & 0x0ff]).append(' ');
        ScrollBar vertical = getVerticalBar();
        ByteBuffer bb = ByteBuffer.allocate(1);
            case SWT.ARROW_UP:
     * @param searchForward look for matches after current position
        if (lastLocationPosition >= start && lastLocationPosition < start + length) {

            case SWT.PAGE_UP:
        if (result > 0) {
     * @param findString    the literal to find

            case SWT.END:
        textAreasStart = (((long) getVerticalBar().getSelection()) * bytesPerLine) << verticalBarFactor;

        super(parent, style | SWT.V_SCROLL);
     * Converts a hex String to byte[]. Will convert full bytes only, odd number of hex characters will
        }

    public boolean canRedo()
        {
    {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
                ++mergeIndexHighlight;
    private void updateScrollBar()
                    oldPos = oldPos - bytesPerLine * numberOfLines_1;
        }
                    ensureCaretIsVisible();
        }

            nonDefaultCaret.setBounds(defaultCaret.getBounds());
        }
        ((GridData) linesTextSeparator.getLayoutData()).heightHint =
        previewText.getCaret().setVisible(false);
     * Finds lowest range border, finds next lowest range border. That's the first result. Keeps going

        int height = hexText.getCaret().getSize().y;
        }
            previewText.addSelectionListener(new ControlSelectionAdapter(false));
            boolean indenting = true;
                case 'y':
            //linesText.setBackground(COLOR_LIGHT_SHADOW);
import java.util.ArrayList;
        if (!firstContent) {


            }
            if (!dragging)
     * charset encoding, or font system.
            // Hex
            return;
        refreshCaretsPosition();
     * current contents. The clipboard will hold text data (for pasting into a text editor) and binary

            linesText.setRedraw(true);
    static String headerRow;
        mergeRangesIsBlue = false;
        boolean blue = mergeRangesIsBlue;
    }
    void makeFirstRowSameHeight()
     * Tells whether the last action can be redone


    /**
     */
        updateTextsMetrics();
    }
        if (numberOfLines < 1)
    }
    }
            }
            previewText.setRedraw(true);
        return oldPos;

        if (!countNibbles)
            UIUtils.asyncExec(() -> drawUnfocusedCaret(true));
    private boolean mergeRangesIsHighlight = false;
                case SWT.ARROW_UP:
     * Sets the selection. The caret may change position but stays at the same selection point (if it
        hexText.setFont(fontCurrent);
            notifyListeners(SWT.Modify, null);
import org.eclipse.swt.SWT;
        gridLayout1.verticalSpacing = 0;
        } finally {
            try {

 * and unicode find functionality. Use addListener(SWT.Modify, Listener) to listen to changes of the
        setCaretsSize(isInserting);
    }
        restoreStateAfterModify();
     * @param isHexString   consider the literal as an hex string (ie. "0fdA1"). Used for binary finds.
        @Override
        anEvent.y = (int) endPosition;

        }
 */
                    break;
        if (textAreasStart + bytesPerLine * numberOfLines > content.length())
     */
                if (countNibbles && (oldPos > 0 || oldPos == 0 && upANibble > 0)) {
        caretStickToStart = false;
            drawUnfocusedCaret(true);

                dragging = true;
        if (mergeChangeRanges != null && mergeChangeRanges.size() > mergeIndexChange) {
    }
                if (isInserting) {
    }
import java.util.List;
        myClipboard.setContents(content, startPosition, endPosition - startPosition);
            case SWT.ARROW_DOWN:
     */
            hexHeaderText.computeSize(SWT.DEFAULT, SWT.DEFAULT).y;
            previewTextSeparator.setBackground(headerRowBackgroundColor);

        if (!mergerCatchUps()) {

            int rightHalfWidth = 0;  // is 1, but better to tread on leftmost char pixel than rightmost one
            @Override
    {
                    previewText.replaceTextRange(
            }
    private class ControlVerifyKeyAdapter implements VerifyKeyListener {
//            redrawTextAreas(false);
            textGridData.widthHint = hexText.computeTrim(0, 0, width, 0).width;
        byte[] tmp = new byte[hexString.length() / 2];
        redrawTextAreas(true);
        stopSearching = false;
        }
            if (mergerPosition(true) < mergeRangesPosition) {
     * @param style  not used for the moment
     * @return whether the parameters hold any data
        ensureCaretIsVisible();
                break;
            public void focusGained(FocusEvent e) {
        anEvent.x = (int) startPosition;
    }
    public boolean isReadOnly() {
    /**

    {
                Runnable delayed = () -> {
            styledTextGC.dispose();

        previewText.pack(true);
            hexText.setRedraw(true);
            content.setActionsHistory();
        this(parent, style, 12, 16);
                hexText.setCaretOffset(tmp * 3 - 1);

            int higher = e.y / charLen;
        Event basicEvent = new Event();

     * @return the current caret position
        long caretLocation = getCaretPos() - textAreasStart;
        return true;
    /**
    {
            //previewColumn.setBackground(hexText.getBackground());
        int charLen;
            textGridData = new GridData();
                // It works too slow. Dumn with it.

            int byteOffset = textOffset / charLen;
                if (linesShifted < 1) {
     * There are differences on which chars can correctly be displayed in each operating system,
        basicEvent.widget = this;
        int height = getClientArea().height - hexHeaderText.computeSize(SWT.DEFAULT, SWT.DEFAULT, false).y;
            if (unfocusedCaret.getVisible()) {
    /**
    {
                        cut();
            // Lines
     *         (exclusive)
                notifyLongSelectionListeners();
            ++result;
    private int mergeIndexChange = -2;
    }
 *
            HexEditThemeSettings.instance.colorText.getRGB(),

            hexHeaderText = new StyledText(hexHeaderGroup, SWT.SINGLE | SWT.READ_ONLY);


            ((StyledText) e.widget).setTopIndex(0);
     */
        mergeRangesPosition = mergerMinimumInChangesHighlights();
                }
        StringBuilder result;
            gridDataTextSeparator2.grabExcessHorizontalSpace = true;
}
                previousLine = -1;
            }

        if (findString == null) return true;
        headerRow = rowChars.toString().toUpperCase();

        upANibble = 0;
     * Map of displayed chars. Chars that cannot be displayed correctly are changed for a '.' char.

            int charLen = 1;
    private boolean mergeRangesIsBlue = false;

            @Override
                        Character.toString(byteToChar[tmpRawBuffer[0] & 0x0ff]));

            fontCurrent = fontDefault;
     */
        if (!searchForward)
            result = mergeHighlightRanges.get(mergeIndexHighlight & 0xfffffffe);
                changeRanges, newLinesStart);
                } else {
    void setAddressesGridDataWidthHint()
    private long endPosition = 0L;

            }
    public BinaryTextFinder getFinder()
            startPosition = endPosition = incrementPosWithinLimits(getCaretPos(), event.widget == hexText);
                if (countNibbles && oldPos == content.length()) upANibble = 0;
        hexText.getCaret().setVisible(false);
     */
            // StyledText.setCaretOffset() version 3.448 bug resets the caret size if using the default one,
    }
        previewText.setSelection(intStart, intEnd);
        getVerticalBar().setSelection((int) ((textAreasStart / bytesPerLine) >>> verticalBarFactor));
    private class ControlPaintAdapter implements PaintListener {
            COLOR_LIGHT_SHADOW.getRGB(),
            return false;
        if (result[1] != null) {
            column1HeaderLayout.marginHeight = 0;
                        selectAll();
            Composite hexHeaderGroup = new Composite(hexColumn, SWT.NONE);
            hexText.setCaret(nonDefaultCaret);
    {
    /**
            }
     * @param hexString an hex string (ie. "0fdA1").
        vertical.setThumb(numberOfLines);
            start = mergeRangesPosition;
            GridData gridDataAddresses = new GridData(SWT.BEGINNING, SWT.FILL, false, true);
            hexHeaderText.setBackground(headerRowBackgroundColor);
    {
        hexText.getCaret().setSize(width, height);
    }
            }
    static final int SHIFT_FORWARD = 1;  // frame
        int shift = 0;
     * the workbench has called EditorActionBarContributor.setActiveEditor()
        redrawCaret(false);
                break;
        caretStickToStart = false;

            previewText.addKeyListener(keyAdapter);

                        startPosition += upANibble;
        {
    private long startPosition = 0L;
                    (((long) getVerticalBar().getSelection()) << verticalBarFactor) * (long) bytesPerLine;
            textGridData.grabExcessVerticalSpace = true;
    }
    private List<Long> mergeChangeRanges = null;
    }
        long newLinesStart = textAreasStart;
                return;
            setCharset(charset);
            isInserting = origInserting;
    private static final Log log = Log.getLog(HexEditControl.class);

        for (int i = 0; i < maxScreenResolution / minCharSize / 3; ++i)
        } else {
            UIUtils.addFocusTracker(UIUtils.getActiveWorkbenchWindow(), CONTROL_ID, hexText);
    static final int maxScreenResolution = 1920;
                    unfocused.y,
            }
 * You may obtain a copy of the License at
            setAddressesGridDataWidthHint();
                    if ((e.stateMask & SWT.MODIFIER_MASK) == 0) {
        List<StyleRange> result = new ArrayList<>();
            if (previousLine >= 0 && previousLine < numberOfLines)
                    highlight ? colorHighlightText : null));
                if (oldPos <= content.length() - bytesPerLine) {
    private void composeByteToCharMap()
        @Override
            GridLayout column2Layout = new GridLayout();

                oldPos = incrementPosWithinLimits(oldPos, countNibbles);
    void redrawTextAreas(boolean fromScratch)
                case 'a':
            {
        }
            if (bytesPerLine > 0) {
    void updateNumberOfLines()
    private Color colorHighlightText = null;
                default:
            for (StyleRange styleRange : viewRanges) {
        CharsetDecoder decoder = Charset.forName(charset).newDecoder().
            linesTextSeparator.setEnabled(false);
    public long[] getSelection()
        }

    public static final String DEFAULT_FONT_NAME = "Courier New"; //$NON-NLS-1$"
        EditableStyledText(Composite parent, int style) {
            mergeRangesIsBlue = (mergeIndexChange & 1) == 0;
        int start = mergeRangesPosition;
                if (ignoreCase)
    {

                if (!countNibbles && oldPos > 0)
        }
            if (hexContent) charLen = 3;
        }
                content.dispose();
        composeByteToCharMap();
            int newSize = UIUtils.getFontHeight(font);
     * Redoes the last undone action
    {

                                 boolean ignoreCase)
    }
            delayedInQueue = false;

            try {
                if (hexText.getCaretOffset() % 3 == 1) shift = -1;
            }
    private int charsForFileSizeAddress = 0;
     * data (internal for HexText). Text data is limited to 4Mbytes, binary data is limited by disk space.
                    caretStickToStart = false;
        }
        redrawTextAreas(true);
	}
            // Preview
import java.nio.charset.Charset;
                    setFocus();
                linesShifted = Math.abs((int) lines);
    StringBuilder cookTexts(boolean isHexOutput, int length)
            previewText.setRedraw(false);
            long lines = (textAreasStart - previousRedrawStart) / bytesPerLine;
//                        notifyListeners(SWT.Modify, null);
            linesTextSeparator = new Text(linesColumn, SWT.SEPARATOR);
        undo(true);
            redrawTextAreas(false);
            highlight = mergerPosition(false);
            if ((mergeIndexHighlight & 1) == 1) {
    }
            endPosition <= textAreasStart)
     * Replaces the selection. The result depends on which insertion mode is currently active:
        int mode = SET_TEXT;
            (highlightRanges == null || highlightRanges.size() < 2)) {
    {
     */

        if (caretLocation >= 0L && caretLocation < bytesPerLine * numberOfLines ||

    }
                    };
        }

        Color headerRowBackgroundColor = UIUtils.getSharedTextColors().getColor(UIUtils.blend(
    /**
                UIUtils.asyncExec(() -> drawUnfocusedCaret(true));
    public void paste()
        return result;
     * content length, in which case does nothing.
                }
            if (readOnly) {
            hexColumn.setLayoutData(gridDataColumn1);

            };
            String hexByte = hexString.substring(i * 2, i * 2 + 2);
    public boolean isSelected()

     * @param start inclusive start selection char
     * @param listener the listener
                    unfocused.height - 1);
//	setFocus();

                    break;
        final Object[] result = new Object[2];
                    previewText.setStyleRange(new StyleRange(offset, 1, colorHighlightText, null));
        }
        }
                        redrawTextAreas(true);
        binaryContent.insert(byteBuffer, 0);
        addDisposeListener(e -> {
                    e.doit = false;
            nonDefaultCaret.setBounds(defaultCaret.getBounds());
            } else {
            }
            nonDefaultCaret = new Caret(defaultCaret.getParent(), defaultCaret.getStyle());
    }
        caretStickToStart = false;
        previewText.getCaret().setSize(width, height);
        endPosition = startPosition + newSelection.limit() - newSelection.position();
            charLen = 1;
        long max = totalNumberOfLines();
    }
        {
    {

        }
    void updateTextsMetrics()
        }
                dragging = false;

        }
        }
            //linesText.setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_BLACK));
                lineWidth = fontCharWidth;
                        caretStickToStart = false;
     *
        vertical.setIncrement(1);
        else
                break;
    }
        } else {
     */
                chars = 1;
        }

        redrawTextAreas(true);
        if (CommonUtils.isEmpty(name)) {
        {
        });

                    runnableEnd();
            hexHeaderText.setEditable(false);
                byteToChar[i] = decoded;
    private long previousFindEnd = -1;
            notifyLongSelectionListeners();
    {
            previousFindString = findString;
            hexHeaderText.setEnabled(false);
        if (finder != null) {
        }
    {
        if (!myClipboard.hasContents() || this.isReadOnly()) {
    {
    }
    private class ControlMouseAdapter extends MouseAdapter {
        hexText.setSelection(intStart * 3, intEnd * 3);
        } else if (textAreasStart + bytesPerLine * numberOfLines < caretPos ||
     *
    void doModifyKeyPressed(KeyEvent event)
        int charLen;
            column2Layout.marginWidth = 0;
                refreshSelections();
    }
        }
                myClipboard.dispose();
    }
        endPosition = caretPos + total;
            result = new StringBuilder(length * 3);
        if (selection == null) return;

                if (indenting) {
        if (content != null) {
     *
    {
        return readOnly;
            }
    {
                runnableEnd();
     *
        initFinder(findString, isHexString, searchForward, ignoreCase);
        if (listener == null)
        if (lastFocusedTextArea == 1)

    {
        updateScrollBar();
    {
            }
    private StyledText hexText = null;
     */
                result.add(new StyleRange(start, mergeRangesPosition - start, blue ? HexEditThemeSettings.instance.colorText : null,
            return previewText.setFocus();
            gridDataAddresses.heightHint = numberOfLines * linesText.getLineHeight();
    /**
                throw new IllegalArgumentException("Font size is " + newSize + ", too small");

    {
            case SWT.ARROW_RIGHT:
            content.insert(newSelection, startPosition);
            replaceWith(".");
                finder = new BinaryTextFinder(hexStringToByte(findString), content);
                    break;
     *
                previewText.setCaretOffset(tmp);
    public void cut()
        hexText.pack(true);

                long previousStart = textAreasStart;
        upANibble = 0;
            previewGridData.verticalAlignment = SWT.FILL;
                        content.overwrite((byte) aChar, getCaretPos());
    }
            columnLayout.horizontalSpacing = 0;
        updateNumberOfLines();
    int mergerPosition(boolean changesNotHighlights)

     * The start point is formed by event.width as the most significant int and event.x as the least
     *
            }
            HexEditControl.this.paste();

            upANibble = 0;

    {

    void undo(boolean previousAction)
            Composite linesColumn = new Composite(this, SWT.NONE);


                styleRange = (StyleRange) styleRange.clone();
    /**
        
        int result = Math.min(change, highlight);
            caretStickToStart = false;
            if (caretPos == content.length() && posInLine == 0)
            previewText.addTraverseListener(new ControlTraverseAdapter());

     * @see Control#setFont(org.eclipse.swt.graphics.Font)
     *
    {

        startPosition = caretPos;
                } else {

                    }
        if ((changeRanges == null || changeRanges.size() < 2) &&
                log.warn(e);
                    notifyLongSelectionListeners();

        if (mergeHighlightRanges != null && mergeHighlightRanges.size() > mergeIndexHighlight) {
        vertical.setPageIncrement(numberOfLines_1);
        int result;
        @Override

        byte[] replaceData = replaceString.getBytes(Charset.defaultCharset());
import org.jkiss.dbeaver.ui.BaseThemeSettings;
    void runnableAdd(Runnable delayed)
    }
            boolean forward = mode == SHIFT_FORWARD;
    public void showMark(long position)
    /**
     * Causes the receiver to have the keyboard focus. Within Eclipse, never call setFocus() before
                unfocusedGC.dispose();
        return oldPos;
            hexText.getCaret().setVisible(false);
    void ensureCaretIsVisible()
        if (delayedWaiting != null) {
            try {
        for (int i = 0; i < tmp.length; ++i) {
            getCaretPos() == content.length() && caretLocation == bytesPerLine * numberOfLines) {
                    updateScrollBar();
    {

                    }

    }
                    }
            hexText.getCaret().setVisible(true);
import org.eclipse.swt.graphics.*;
        {
            }
    {
    {
    /**
     *
                        paste();
                        paste();
            caretStickToStart = true;
        mergeIndexHighlight = 0;

    }

    }
        public void keyTraversed(TraverseEvent e)
                unfocusedGC.drawRectangle(unfocused.x + shift * unfocused.width,

     * selection, inserts at the current caret offset.
        startPosition = 0L;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        gridLayout1.marginWidth = 0;
    }


        @Override
                    int offset = (int) (getCaretPos() - textAreasStart);
            previousFindIgnoredCase = ignoreCase;

    private KeyListener keyAdapter = new ControlKeyAdapter();
    }
import org.eclipse.swt.custom.VerifyKeyListener;
        } catch (IOException e) {
        }

    {
 *
                    break;
        StringBuilder resultChar = cookTexts(false, actuallyRead);
        linesText.setFont(fontCurrent);

    private class ControlSelectionAdapter extends SelectionAdapter implements SelectionListener {
                mode = lines > 0L ? SHIFT_BACKWARD : SHIFT_FORWARD;
            } else {
                    if (!readOnly && e.stateMask == SWT.CONTROL)  // control mod1
            hexHeaderGroup.setLayoutData(gridDataColumn1Header);
        {
/**
                decoder.flush(cb);

        gridLayout1.numColumns = 3;
            ((DisplayedContent) hexText.getContent()).shiftLines(resultHex.toString(), forward);
            finder.setNewStart(getCaretPos());
    }
            endPosition = end;
        int intStart = (int) startLocation;
        for (int i = 0; i < limit; i += bytesPerLine, address += bytesPerLine) {
    private int numberOfLines = 16;
            }
                ++oldPos;
            linesText.getContent().setText(newText.toString());
                }
                    } else if (upANibble == 0) {
                    } else {
     */

    private boolean previousFindStringWasHex = false;
        }
     * was at the start of the selection it will move to the new start, otherwise to the new end point).
        return new long[]{((long) event.width) << 32 | (event.x & 0x0ffffffffL),
        @Override
    private void getHighlightRangesInScreen(long start, int length)
                doModifyKeyPressed(e);
        {
    }

     * @return 2 elements long array, first one the start point (inclusive), second one the end point
import java.io.IOException;
     * @return list of StyleRanges, each with a style of type 'changed', 'highlighted', or both.
            column1Layout.marginHeight = 0;
    {

        redrawTextAreas(true);
        } else {
        }
    /**
                result[1] = e;
        this.mergeHighlightRanges = highlightRanges;
        int change = Integer.MAX_VALUE;
        hexHeaderText.setFont(fontCurrent);


     * Initialise merger variables
 * limitations under the License.


        boolean origInserting = isInserting;
        isInserting = insert;
     * @param end   exclusive end selection char
                textAreasStart = caretPos - bytesPerLine * numberOfLines;
            change = mergerPosition(true);
                redrawTextAreas(false);
    {
            startPosition = start;

import org.eclipse.swt.layout.GridLayout;
    }
                    indenting = false;
        mergerNext();
        }

        }
    {
            onMalformedInput(CodingErrorAction.REPLACE).
        ScrollBar vertical = getVerticalBar();
    public static final String CONTROL_ID = "org.jkiss.dbeaver.ui.hexEditor";
     * @param isFindHexString    consider the literal as an hex string (ie. "0fdA1"). Used for binary finds.
                Rectangle unfocused = unfocusedCaret.getBounds();
                hexText.setCaretOffset(tmp * 3 + upANibble);
    {
        long[] selection = previousAction ? content.undo() : content.redo();
        public void paste() {
        gridLayout1.horizontalSpacing = 0;
            delayedWaiting = delayed;
        return result;
            log.warn(e);
            return;
    private GridData textGridData = null;


    private boolean dragging = false;
        updateScrollBar();
        long total = myClipboard.getContents(content, caretPos, isInserting);

            intEnd = tmp;
            charLen = 1;


     * @return number of replacements
        ((DisplayedContent) linesText.getContent()).setDimensions(charsForAddress, numberOfLines);
            if (isHexString) {
    boolean mergerCatchUps()
     */
                    upANibble ^= 1;  // 1->0, 0->1
            return;
                }
                result.append(GeneralUtils.byteToHex[tmpRawBuffer[i] & 0x0ff]).append(' ');

 */
     */
                        content.overwrite(hexToNibble[aChar - '0'], 4, 4, getCaretPos());

    }
        }
            // so we use not the default one.
        }
            isInserting = true;
        List<Long> changeRanges = new ArrayList<>();
            return;
    private int mergeIndexHighlight = -2;
            if (lastFocusedTextArea == 1) {
    }
        return true;
        if (startPosition == endPosition || !isInserting) return false;
    public void setSelection(long start, long end)
        }
            content.dispose();
                    oldPos = oldPos - oldPos % bytesPerLine;
        }
    /**
        if (startPosition >= endPosition ||
            if (lower > higher) {
                    if (oldPos >= content.length()) oldPos = content.length();

        if (caretStickToStart) {
            gridDataTextSeparator2.verticalAlignment = SWT.FILL;

                        theText.append('0');
        endPosition = selection[1];
        return result;

                if (countNibbles && oldPos == content.length()) upANibble = 0;

                    shiftStartAndEnd(textAreasStart + byteOffset);
    static final int SET_TEXT = 0;


        }

        refreshSelections();
        int actuallyRead;
                    if (upANibble == 0) --oldPos;
     * redraw the caret with respect of Inserting/Overwriting mode
        boolean firstContent = content == null;
    {
        anEvent.width = (int) (startPosition >>> 32);
        }
        while (max > Integer.MAX_VALUE) {

    private Font fontCurrent = null;  // disposed externally
        if (commonWidth <= 0) {

        boolean hexContent;
        }
            highlightRangesInScreen.add(1);
        }
     * @param parent parent in the widget hierarchy
        if (content != null) {
        }
package org.jkiss.dbeaver.ui.editors.binary;

        showMark(start);
    {
            blue = mergeRangesIsBlue;

        if (!fromScratch && previousRedrawStart >= 0L) {
     */
    public void addLongSelectionListener(SelectionListener listener)

     * have a leading '0' added. Big endian.
        if (previousFindEnd != getCaretPos()) {
            GridData gridDataColumn1Header = new GridData(SWT.BEGINNING, SWT.BEGINNING, false, false);
                    Runnable delayed = () -> {
        if (startPosition >= endPosition) return;
                    redrawTextAreas(true);
                        content.overwrite(hexToNibble[aChar - '0'], upANibble * 4, 4, getCaretPos());
    }
                          boolean ignoreCase, String replaceString, boolean isReplaceHexString)
    {
        return hexText;
    {
            name = GeneralUtils.getDefaultFileEncoding();
            // so we use not the default one.
        {
    {
    /**

    private Runnable delayedWaiting = null;
            for (int j = (charsForAddress - 2) * 4; j > 0; j -= 4) {
            super(parent, style);
            GridData gridDataTextSeparator = new GridData(SWT.FILL, SWT.BEGINNING, true, false);
                    lastFocusedTextArea = 2;
    {
            int lineWidth = 1;
            linesText.setRedraw(false);
                hexText.setEditable(false);
            hexText.addTraverseListener(new ControlTraverseAdapter());
            columnLayout.marginWidth = 0;

     * @param position where relocation should go
            replace(replaceString, isReplaceHexString);
    {
 * display. The file size has no effect on the memory footprint of the editor. It has binary, ascii
        vertical.addSelectionListener(new SelectionAdapter() {
        } finally {

        gridLayout1.marginHeight = 0;
    // visual components

        }
        select(start, end);
        if (textAreasStart < 0L)
        updateScrollBar();
            previewText.setLayoutData(previewGridData);
    {

            replaceData = hexStringToByte(replaceString);

        if (!longSelectionListeners.contains(listener))
            }
    /**
        // bugfix: HexText's raw array overflows when font is very small and window very big

        public void paintControl(PaintEvent event)
     * Gets the selection start and end points as long values
            hexHeaderText.setForeground(HexEditThemeSettings.instance.cellHeaderForeground);
     *                      Will replace full bytes only, odd number of hex characters will have a leading '0' added.
            textAreasStart = caretPos - posInLine;
        // very small sizes would compromise responsiveness in large windows, and they are too small
        setContent(data, charset, true);
                rightHalfWidth = (lineWidth + 1) / 2;  // line spans to both sides of its position
        notifyLongSelectionListeners();
                aChar < '0' || aChar > '9' && aChar < 'A' || aChar > 'F' && aChar < 'a' || aChar > 'f')) {
                    };
     */

        notifyLongSelectionListeners();
    private int verticalBarFactor = 0;

            GridData gridDataColumn = new GridData(SWT.BEGINNING, SWT.FILL, false, true);
    private Text linesTextSeparator = null;
            }
    public static byte[] hexStringToByte(String hexString)

            longSelectionListeners.add(listener);
            aListener.widgetSelected(anEvent);
            textGridData.verticalAlignment = SWT.FILL;
            hexContent = isHexText;
        if (!mergerInit(changeRanges, highlightRanges)) {
            endLocation = bytesPerLine * numberOfLines;
        mergeIndexChange = 0;
    }
            setCharset(null);
    public void setContent(byte[] data, String charset, boolean notify)
        if (caretStickToStart) {
     * @param searchForward      look for matches after current position
     */
            return null;

            return false;
        } else {
            }

    public int replaceAll(String findString, boolean isFindHexString, boolean searchForward,
        public void widgetSelected(SelectionEvent e)
    /**

            previewGridData.widthHint = previewText.computeTrim(0, 0, width, 0).width;
