     */
    {
     * <p/>
        if (startIndex == -1) {
            for (CellExpandState state : columns.values()) {
                impliedFocusColumn = shiftSelectionAnchorColumn;
    /**
                    }

        GridColumn column = getColumn(col);
                    List<GridPos> newSelected = new ArrayList<>();
                {
                } else {
        if (selectionType == SWT.SINGLE && indices.length > 1) return;
        return availableHeight / itemHeight + 1;
            x2 -= getHScrollSelectionInPixels();
            selectionEvent.y = e.y;
    }
            return IGridContentProvider.ElementState.EXPANDED;
                false,
                    }
        if (focusItem > row) {
                                cellRenderer.paint(
    /**

            node.state = IGridContentProvider.ElementState.COLLAPSED;
                        }
                        }
            x += column.getWidth();

            if (selectedCells.equals(newCells)) {
    }
     * Selects all cells in the receiver.
    }
                        }
     * @return Returns the lineColor.
    private RowRange getRowRange(int startIndex, int availableHeight,
            return null;
            Event se = new Event();
     * @param gc gc from paint event
                selEvent.data = newPos;

                    selectionEvent = updateCellSelection(cells, ctrlFlag, true, false, EventSource.MOUSE);


                        newCells.add(new GridPos(col.getIndex(), row));
     * Removes all of the items from the receiver.
            y += itemHeight + 1;
        // Prepare rows


                    columnBeingSorted = null;

    {
        }
            selectionEvent.y = e.y;
     * Returns {@code true} if the receiver's row header is visible, and
 *
     * Sets the line visibility.
            case ' ':

        if (columnHeadersVisible) {

     */
        }
     * Reference to the item in focus.
            }
    /**
            }


        return hoveringOnRowHeader;
    public void setLinesVisible(boolean linesVisible)
            int width = clientArea.width;
                // Top-left cell
                        } else {
     *
        if (index >= 0 && index < getItemCount()) {
        if (CommonUtils.isEmpty(children)) {
        checkWidget();
            if (col.getElement() == element) {

                    }
                                fatColumns.add(curColumn);
    }
                                    pc,
        shiftSelectionAnchorColumn = null;
     * <p/>
//            GC gc = new GC(this);
                            elements.add(getRowElement(draggingRow));
                                columnBeingResized = column;
            boolean reverseDuplicateSelections,
    private static final Log log = Log.getLog(LightGrid.class);

     * This item anchors all further shift+click selections.
        // | SWT.NO_BACKGROUND;

     * @param indices the array of indices for the items to select
     */
                Point point = new Point(e.x, e.y);
                }
        RowLocation gridPos = new RowLocation(gridRow);
                currentItem = endItem;
            if (i > getItemCount() - 1) {
            se.widget = this;
        return null;
                        GridPos cell = new GridPos(indexOf(currentColumn), currentItem);

     * @param cell cell
        Point point = new Point(e.x, e.y);

                    if (headerColumnDragStarted && hoveringColumn != null) {
            }
            }
                    }
            }
            return false;


        return cells;
        } else {
     */

    private Object hoveringDetail = null;
        if (hoveringOnHeader && !overSorter && !overResizer && !overFilter) {
    {

    /**

        }
                // draw regular cells for each column
                if (rowHeaderVisible) {
                    Rectangle iconBounds = statusImage.getBounds();
     *
    private final IGridScrollBar vScroll;
            // FIXME: Doesn't work if the containing row has collection attributes whose values are NULL

                if (!isShown(bottomIndex)) {
        if (newTopIndex != topIndex) {
                        if (!fatColumns.isEmpty()) {
    private void createChildColumns(GridColumn parent) {
            int lastRow = row >= gridRows.length ? gridRows.length - 1 : row;
     */
     *


        super.setBackground(backgroundColor = color);
            // Repaint one cell
        //}
            return null;

    /**
                lastDragEndTime = System.currentTimeMillis();

    }
                    int row = newCells.get(0).row;
        }
    /**

    public Object getColumnElement(int col) {
    public List<IGridColumn> getColumnSelection() {
        if (newColumnFocus != null) {
                        } else {
            // draw pin divider
            // figure out first visible row and last visible row


    public void addSelectionListener(SelectionListener listener)
    private void onMouseHorizontalWheel(Event e) {
                    focusItem = -1;
                    max++;
        for (Integer columnIndex : columnIndices.keySet()) {
        return hoveringOnLink;
     * @param e event
                            intentColumn = columns.get(columns.size() - 1);

        if (startIndex < 0 || startIndex >= getItemCount()) {
                        } else {
         */
                                gc,

                se.y = e.y;
                            for (Integer row : selectedRows.keySet()) {
         * number of rows (i.e. <em>visible</em> items) in this range
     * Updates cell selection.
    public GridPos getFocusPos()
        }
    {
            } else {

    private final IGridScrollBar hScroll;
                x = 0;
            if (endIndex <= 0) return null;
                    }
     *

     */
    private static final int MAX_TOOLTIP_LENGTH = 250;
            getCells(iterItem, cells);
            setCursor(overIcon ? sortCursor : null);
                            int freeSpace = (clientWidth - normalWidth - getBorderWidth() - rowHeaderWidth - vScroll.getWidth())
                int sel = indexOf(col);

                    }



        }
    {
     * <p/>
    
            if (getColumnCount() == 1 && (fitValue || getGridController().isMaximizeSingleColumn())) {
        paintTopLeftCellCustom(gc, y);

        return headerHeight;
        return selection;
     *
    }
     *
                    newTip = getCellToolTip(hoveringColumn, hoveringItem);
     * @param e event
    private boolean followupCellSelectionEventOwed = false;
        return Collections.unmodifiableCollection(selectedRows.keySet());
                    }


                event.feedback = DND.FEEDBACK_SELECT | DND.FEEDBACK_SCROLL;
                return;
                GridColumnRenderer.SORT_WIDTH,

    public void showSelection()
     * are added and removed.
            {

     * @param cell point whose x values is a column index and y value is an item index
     * If cell selection is enabled, selects all cells at the given index.
                if (e.button == 1) {
                    totalWidth += curColumn.getWidth();

            cells.add(new GridPos(i, row));
        RowRange range = getRowRange(-1, -1);
                        draggingRow = hoveringRow;
        int childrenCount = rowState.getMaxLength();
            {
                // Lets chop it
     * Indices that are out of range and duplicate indices are ignored. If the
            //check and see if column spanning means that the range increased
     * @param cell point whose x values is a column index and y value is an item index
                    if (ctrl) newStateMask = SWT.MOD1;
            GridColumn oldHoverColumn = hoveringColumn;
     * Returns true if the table is set to horizontally scroll column-by-column
    }
            }
                                iterCol = getPreviousVisibleColumn(iterCol);
     * @param cells an array of points whose x value is a column index and y value is an item index
     * Refresh grid data
            return false;

            public void mouseHover(MouseEvent e)
    // DnD

                rightColumn = column;
        // necessary. This ensures
        @NotNull List<GridPos> newCells,
    private void collectRowsFromElements(
            return new Rectangle(-1000, -1000, 0, 0);
    }
                addToCellSelection(newCell);
        refreshHoverState();
            // Redraw header
                int bottomIndex = getBottomIndex();

    }
            }
     * @param column column
    public int getBottomIndex()
                }
                }
     * @return style to pass to the super class.
     * @param index the index of the item to select
        // https://www.eclipse.org/forums/index.php/t/146489/

    /**
                        status.append(gsc.getDisplayName())
     * @return the number of selected cells
    }
     * @see #bottomIndex
                            try {
                onMouseDoubleClick(e);
                        }
    private GridColumn getColumn(Point point)
     * Returns a {@link RowRange} ranging from
     */

            SWT.error(SWT.ERROR_INVALID_ARGUMENT);
     *
     * selection is enabled.
            int height = clientArea.height;
                        }
            int currentItem = focusItem;
                    return false;
    /**
            y += headerHeight;
                if (event.detail == DND.DROP_MOVE) {
                            cellBounds.width = width;
        if (origin.x < 0 && isRowHeaderVisible())
                int max = 0;
        int y = 0;
        int x = getColumnHeaderXPosition(col);
                event.stateMask = e.stateMask;
            hoveringOnColumnIcon = overIcon;
        if (wHint == SWT.DEFAULT) {
                x += getVerticalBar().getSize().x;
    {
            if (currentItem > endItem) {
        }
            int size = 0;
                    hScroll.setSelection(getHScrollSelectionInPixels() + (x - firstVisibleX));
                visibleRows = range.rows + (availableHeight - range.height) / itemHeight + 1;
     * @param row row number
     * width. This means this method returns true also if some cells
                            cellBounds.height++;
                isSelectedCell = selectedCells.contains(new GridPos(col.getIndex(), row));
        	if (cell != null)
                    //row header is actually painted later
    private void drawEmptyRowHeader(GC gc, int x, int y, int width, int height)

                firstTime = false;
        public int endIndex;
    }
                }
            log.warn("Child elements doesn't match calculated count: " + children.length + "<>" + childrenCount + ". Skip the tail.");
     * @param index the index of the top item
        updateSelectionCache();
                IGridController gridController = getGridController();
     * @return true if 'item' is shown
    @Nullable
                                Object cellText = getContentProvider().
     * Handles the assignment of the correct values to the hover* field

            if (point.x <= rowHeaderWidth) {
     * @return next visible item or null
                new GridPos(newColumnFocus.getIndex(), newSelection),
    {
            case SWT.ARROW_UP:

                    }
        }
        int y = 0;
                height);
                for (IGridRow r = row; r != null; r = r.getParent()) {
                // search last visible item
                }
    private static final int MAX_CELL_TEXT_LENGTH = 1000;
     * @param listener the listener which should be notified
        } else {

            selection.add(col);
            if (gridRows[i].getElement() == element) {
                // So let's add a workaround for it and use column's width in this case
            if (hScroll.getVisible()) {
     * single-select and multiple indices are specified, then all indices are
     * initially sized to this height.
import org.jkiss.dbeaver.ui.dnd.LocalObjectTransfer;
                    IGridRow gridRow = gridRows[focusItem];
        if (startIndex == -1) {
                {

    /**
     * Returns the previous visible item in the table. Passing null for the item
            int startY = 0;
     * Index of last visible item.  The value must never be read directly.  It is cached and
                        List<Object> elements = new ArrayList<>();
                    IGridRow gridRow = gridRows[row];
                                column,
            handleHoverOnColumnHeader(e.x, e.y); // resets cursor if

    }
    }
                }
                    List<GridPos> cells = new ArrayList<>();
                newPos = null;
    }
            case SWT.KEYPAD_ADD:
                }
            if (x < firstVisibleX) {


    {
        checkWidget();
            }
            @Override
     *
//        if (rowHeaderVisible && !columnScrolling) {

                    event.y = e.y;
                        List<GridColumn> columns = selectedColumns;
    {
    FontMetrics fontMetrics;
                newColumnFocus = impliedFocusColumn;

        int columnHeight = column.getHeaderHeight(false, false);
                        } else {
        public RowLocation(IGridRow row) {
        }
    @NotNull
                            if (column.isOverSortArrow(x - x2, y)) {
            int xPos = x + width - GridColumnRenderer.ARROW_MARGIN;
        }
            if (column.isPinned()) {
    @Nullable
    private int getPinnedColumnsWidth() {
     */
        if (expandedRows.isEmpty()) {
    }
    }
        hoveringOnHeader = false;
                        if (!pc.isPinned()) {
    }
        		columnBeingFiltered = null;
                        // Copy all selected columns
    }
     */
        }
        }
            int maxWidth = clientArea.width;
            }
     * out.
            return null;
     * index of the first element).
            GridCell newPos;
     */
        checkWidget();

     */
    }
    private boolean hoveringOnLink = false;
                    columnWidth = gridWidth;
                    }
    {
    public void deselectAll()
        if (selectionEvent != null) {
        if (savedVSB >= 0) {
        checkWidget();

                }

     * <p/>
            if (!columns.isEmpty()) {
        // Valid
        redraw();
    private Point getTableSize()
                                cellBounds,
            }
            }
        setScrollValuesObsolete();
        }
    /////////////////////////////////////////////////////////////////////////////////
        } else {
        final Rectangle clientArea = getClientArea();
        return hoveringOnHeader;

                List<GridPos> cells = new ArrayList<>();
    protected static final int Event_NavigateLink = 1001;
                columnElements = new Object[columns.size()];
                            if (prev != null) {
                    columnElements[i] = columns.get(i).getElement();
     *
                    int newStateMask = SWT.NONE;
        // if no items are visible on screen then abort
        checkWidget();
            }
        checkWidget();
        protected String[] getTypeNames() {
                        selectedCellsBeforeRangeSelect.clear();
     */
            }
     * @see LightGrid#setSelection(int[])

                                cellInRowSelected,
        // children can get focus instead. This only affects the grid
    {
    /**
                int maxLineNumbers = gridHeight / getItemHeight(), lineNumber = 0;
        }
            selectionEvent = selectAllCellsInternal(e.stateMask);
     */
                    int tmpItem = getPreviousVisibleItem(newSelection);
            notifyListeners(SWT.DefaultSelection, newEvent);
        if (!columns.isEmpty() && gridRows.length > 0) {
     *
                if ((impliedFocusItem >= 0 && impliedFocusItem == topIndex) || focusItem == topIndex) {
     *
    public void selectCell(@NotNull GridPos cell)

        addToCellSelection(cell);
    }
            // In multi-column grid children elements are null (e.g. array elements)
        if (overSorter != hoveringOnColumnSorter) {
                }
                }
        } else {
    /**
        if(overFilter != hoveringOnColumnFilter) {
        }


                    if (!CommonUtils.isEmpty(statusText)) {
                if (draggingColumn == null || draggingColumn.getGrid() != LightGrid.this) {
            if (column.isPinned()) {
    private int getNextVisibleItem(int index)
    @NotNull
    }
                return null;
            } finally {
        if (rowState == null) {
     *
     * Mouse double click event handler.
        // if the scrollbar is visible set its values
        do {
                if (x < clientArea.width) {
    public int getColumnSelectionSize() {
                    newTip = getContentProvider().getCellLinkText(col, gridRows[row]);
     * @return true if a new section of the table is now being hovered
            y + height - 1);
            }
                leftSpan += rowHeaderWidth;

        focusColumn = columns.get(0);
    }
    /**
        });
        return switch (style) {
        }
                            getCells(iterCol, newSelected);

     *
        if (hoveringOnColumnSorter) {
            endIndex = itemCount - 1;
            }
    }

            }
                return col;
                        addToCellSelection(cell);
            focusColumn = getColumn(0);

                    GridColumn iterCol = hoveringColumn;

                            for (GridColumn curColumn : fatColumns) {
        boolean descending = (startRow < endRow);
                            testPos.row = row;
    @NotNull
        boolean overIcon = false;
    }
            return;

                false,
                    newSelection = 0;

                            dragImage,
    }
     * Resize event handler.
     *
    {
        return topIndex;

        } else if (shift) {
     * shown in this <code>Grid</code>'s visible on-screen area.
            boolean reverse = reverseDuplicateSelections;

        }
            savedFocus.col = Math.min(savedFocus.col, getColumnCount() - 1);
 * Unless required by applicable law or agreed to in writing, software
                            .append(": ").append(statusText);
        }
 */
                    }
            }
    }
        if (index < 0 || index >= columns.size() - 1)

                        }
     * in the receiver, or -1 if no item is selected.  If cell selection is enabled,
                        }
                    int intentItem = hoveringItem;
        }
            y = paintColumnHeader(gc, x, column);

                }
        if (focusItem < 0 || focusItem >= gridRows.length) {
    /**
        for (GridColumn column : columns) {
            // skip left corner
    private String displayedToolTipText;
        }
                            cellBounds.height = itemHeight;
                    if (impliedFocusItem >= 0) {
    {
        }
                }
        x -= getHScrollSelectionInPixels();
        final Rectangle clientArea = getClientArea();

    {
    public IGridRow getFocusRow() {
    }

                return row;
        }
                hScroll.setSelection(getHScrollSelectionInPixels() - (firstVisibleX - x));
    private int getColumnHeaderXPosition(@NotNull GridColumn column)
            } else if (newTip == null && displayedToolTipText != null) {
            GridColumnRenderer.paintSort(gc, sortBounds, sortOrder, true);
     * @param column new column
        super.setFont(font);
    /**
        if (rowHeaderVisible) {
    }
        int impliedFocusItem = focusItem;
        if (getItemCount() > 0 && availableHeight > 0) {
                    hiddenArea -= col.getWidth();
            int max = getItemCount() + 1;
        if(overFilter) {
    public void setBackground(Color color)
            if (columns.get(k).isPinned()) {
    }
     */
            if (columns.size() == 0)
     *
        focusItem = -1;

                }
     */
        for (int i = 0; i < itemCount; i++) {


     *

            } else {

     *
     *
                        if (rows.isEmpty()) {

            // something is broken
    {
        int pinnedColumnsWidth = getPinnedColumnsWidth();
            backgroundColor = super.getBackground();


    @Nullable
        if (rowHeaderVisible) {

        }
        }


                    if (e.stateMask != SWT.MOD2) {

                // if selection is too large, just make it the max you can
     * Returns a point whose x and y value are the to and from column indexes of the new selection

            selectionEvent.button = e.button;
        GridColumn leftColumn = null, rightColumn = null;
        }

                        cells.add(new GridPos(i, k));
        if (index == getItemCount() - 1) {
     */
     * @param inverse                  if true, then the first item in the range will be searched, not the last
            y,
                }
     *
        }

            public void mouseEnter(MouseEvent e)
            gc,
            if (row.getParent() == null) {
    @Nullable
        gc.setBackground(getLabelProvider().getHeaderBackground(null, false));
    }
            getVerticalBar().setVisible(false);
                        if (isExpanded == isPlus) {
        //setColumnScrolling(true);
    private void showColumn(@NotNull GridColumn col)
    }
        Event selectionEvent = null;
            y += prefSize.y;


            final CellExpandState state = rowState.columns.computeIfAbsent(
    }
     * Returns the default height of the items

                            cellBounds.x = x;
    private boolean isCellSelected(GridPos cell)

        }

        if (index < 0 || index >= getItemCount()) return;
        if (!CommonUtils.isEmpty(children)) {
            setCursor(null);
            shiftSelectionAnchorColumn = getColumn(newCell.col);

        @Override
        }
            Point point = new Point(e.x, e.y);
                                    gc,
        }
                if (e.button == 1) {
                for (RedrawCell redrawCell : redrawCells) {

     */
    /**
                if (gridWidth > columnWidth) {
        }
//        // Add focus cell to selection
        if (getHorizontalBar() != null) {
    private final GridPos focusCell = new GridPos(-1, -1);
        int savedHSB = keepState ? hScroll.getSelection() : -1;


        updateSelectionCache();
        int firstVisibleIndex = getTopIndex();
            for (GridColumn parent = column.getParent(); parent != null; parent = parent.getParent()) {

        IGridContentProvider contentProvider = getContentProvider();
//        if (focusPos.isValid()) {
                            //then we must be hovering way to the bottom
     * @param show the new visibility state
                }
            cellColumnSelectedOnLastMouseDown = (getCellSelectionCount() > 0);

            range.startIndex = startIndex;
                        selectionEvent = updateCellSelection(new GridPos(col.getIndex(), row), e.stateMask, false, true, EventSource.MOUSE);
            public void dragFinished(DragSourceEvent event) {
            }

                        }
        }
     * A row in this sense exists only for visible items
        addTraverseListener(e -> e.doit = true);
        int index = indexOf(column);
                    if (currentColumn != null) {
            int deleteTo;
    private final List<GridPos> selectedCellsBeforeRangeSelect = new ArrayList<>();
            GridColumn startCol = currentColumn;
                            } else {
    public void setMaxColumnDefWidth(int maxColumnDefWidth) {
                se.stateMask = e.stateMask;
    }
                    notifyListeners(Event_ChangeSort, event);
            }
        if (getHorizontalBar() != null) {
            }
            if (hoveringOnColumnFilter) {
     * updated when appropriate.  #getTopIndex should be called for every client (even internal
            case SWT.PAGE_UP:

                                iterCol = getNextVisibleColumn(iterCol);
        if (point.x < 0 || point.x > getClientArea().width) return null;
            } else if (!isSingleCellPaint) {
                followupCellSelectionEventOwed = false;
                    e.doit = false;
import org.jkiss.utils.IntKeyMap;
        bottomIndex = -1;
            topIndex = 0;


                notifyListeners(SWT.Selection, selEvent);
        }
    }
                childX += child.getWidth();
    }
        if (newRowHeaderWidth > oldRowHeaderWidth || decreaseSize) {
            x += column.getWidth();
//                paintHeader(gc);

                int i = 0;
    /**
    private int resizingStartX = 0;
        computeHeaderSizes();

                if (state.expanded) {
     *
        if (row >= 0) {

                visibleRows = range.rows;
        int index = indexOf(column);
     * @param x mouse x coordinate
                toggleCellValue(focusColumn, gridRows[focusItem]);
     */

            hScroll.setSelection(Math.min(hScroll.getMaximum(), savedHSB));
            List<Object> result = new ArrayList<>();
     * receiver. The order of the items is unspecified. An empty array indicates
            @Override

        int newStyle = style & mask;
            if (columnHeadersVisible) {
                setRedraw(true);
        addMouseMoveListener(this::onMouseMove);
        GridColumn scrollTo = null;
        }
            case '-':
                            toggleRowExpand(gridRow, null);
            @Override
    {
    private Event selectAllCellsInternal(int stateMask)
                Point dragPoint = getDisplay().map(null, LightGrid.this, new Point(event.x, event.y));
            newTopIndex = range.startIndex;        // note: use startIndex because of inverse==true
        x += getPinnedColumnsWidth();
                        event.data = text.toString();

     * selection is not cleared before the new items are selected.

        refreshRowsData();

            bottomIndex = range.endIndex;
            //click on the top left corner means select everything
        }

     *

        return null;
                        if (e.x <= rowHeaderWidth) {
        Integer detail =
                break;
    {
        int itemHeight = getItemHeight();
            }

    }
     * true, the last item will not lie completely within
    {
    }
     * As long as no default height was set by the client through this method,
        range.height = (getItemHeight() + 1) * range.rows - 1;
            return IGridContentProvider.ElementState.COLLAPSED;
        return posToCell(getFocusPos());
             * There is no need to do anything with the selection in this case, just return.
        List<GridPos> cells = new ArrayList<>(itemCount * columnCount);

        public CellExpandState(int size) {

                if (e.button == 1 && !shift && !ctrl) {
        UIUtils.dispose(boldFont);
    {
            }

                log.debug("Row index out of range (" + row + ")");

        y = 0;
     * Returns a point whose x and y values are the to and from column indexes of the new selection
        }
     * visible, horizontal scrolling is always done by column rather than by
                    event.stateMask = e.stateMask;
        commentFont = UIUtils.modifyFontSize(italicFont, -1);
            case '=':
     *
import org.jkiss.code.Nullable;
    }
        }
                    if (hoveringColumn == null) {
                    }
        GridColumn newColumnFocus = null;
            foregroundColor = super.getForeground();
                overLink = true;
     */
        draggingRow = null;
        }
            } else {
    private int getVisibleGridHeight(Rectangle clientArea) {
                    PaintEvent pe = new PaintEvent(se);
     *
        if (oldHeaderHeight != headerHeight) {
     *
     * items are added or removed.

                    x += rowHeaderWidth;
                    x += rowHeaderWidth - 1;
    @NotNull
            gridRows = ArrayUtils.insertArea(IGridRow.class, gridRows, row + 1, result.toArray());
                GridColumn newTo = getColumn(cols.y);
            range.height = 0;
    {
            int width = rowHeaderRenderer.computeHeaderWidth(gc, row, row.getLevel());
                    }
    static class CellExpandState {
     */
        int row = getTopIndex();
    }
        focusColumn = column;
        notifyListeners(SWT.Dispose, event);
                                break;
                        cellBounds.width = rowHeaderWidth;
                                getRowState(gridRow),
                    newSelection = impliedFocusItem;
        }
                newSelection = topIndex;
    }
                state.expanded = !wasExpanded;
        Event selectionEvent = null;
            if (cell.col >= 0) {
    }
    {
        } else {
                } else {
    private boolean cellColumnSelectedOnLastMouseDown;
//            } catch (Exception e) {
        super.setForeground(foregroundColor = color);

    {
            return position;
    /**
     * <p/>
     * Sets the new width of the column being resized and fires the appropriate
        hoveringColumn = null;

            }
                }
    private Integer draggingRow;
        updateScrollbars();
        return range;
                x += column.getWidth();
            public void dragOver(DropTargetEvent event)

            {
        if (!shift) {
            if (hoveringOnColumnSorter) {
            return;
        // Restore state

    public void setSelection(int index)
    public void recalculateSizes(boolean decreaseSize) {
     * @see LightGrid#deselectAll()

                max = Math.min(visCols, max);
        checkWidget();
            }
    /**

    }
     * <p/>
            @Override
     * is greater than end. If the receiver is single-select and there is more
        if (wHint == SWT.DEFAULT || hHint == SWT.DEFAULT) {
        Object[] columnElements = null;
    private IGridContentProvider.ElementState getRowState(@NotNull IGridRow row) {
            }
    {

        refreshRowsData();
                    // the item at bottom index is not shown completely
                            //then we must be hovering way to the bottom
            case SWT.END:
        List<RedrawCell> redrawCells = new ArrayList<>();

            IGridRow row = new GridRow(element, i, index);
     * @return height of the column header row
     * @return default height of items
        }
    }
     */
                    0,
                }
    }
        }

        boolean dragging,
            selectCells(getCells(index));
    @Nullable
        }
     */
        if (isListening(SWT.DragDetect)) {
        return index;
    {

        if (!isShown(rowIndex))
            setCursor(null);
    /////////////////////////////////////////////////////////////////////////////////
    Font normalFont;
                    }

            }
            else
                if (!cellColumnDragSelectionOccurring && cellColumnSelectedOnLastMouseDown) {
    /**
    private boolean hoveringOnColumnIcon = false;
            y = hHint;
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (node.state == IGridContentProvider.ElementState.EXPANDED) {
    }

        column = column.getFirstLeaf();
     */
    public void showItem(int item) {
    {
        if (columnScrolling) {

        return vScroll;
        if (rowHeaderVisible) {
        focusItem = 0;
     */
            }


                        dragging = false;
                            columns = LightGrid.this.columns;
                            }
        for (GridPos cell : selectedCells) {

                }
                                break;
        }
     * @return previous visible item or if item==null last visible item

    private void drawTopLeftCell(GC gc, int x, int y, int width, int height) {
            int childX = x;
        int otherIndex = startIndex + ((availableRows - 1) * (!inverse ? 1 : -1));
    private int maxColumnDefWidth = 1000;
        isColumnContextMenuShouldBeShown = value;
            topIndex = -1;
        // area

     * @see LightGrid#setSelection(int,int)
    /**
            range.endIndex = 0;
            x -= hScrollSelectionInPixels;
    {
     * are selected.
            if (row != -1) {
     * @param y mouse y
    {
    }

     * returns the index of first item that contains at least one selected cell.
                        return;
                    if (lineNumber >= maxLineNumbers) {
        }
    /**
                toolTip = newToolTip.toString();
        }

        for (int i = fromIndex; i < gridRows.length; i++) {
                        }
        return hScroll;
     */

        if (pinnedColumnsWidth > 0) {
    @NotNull
            if (oldWidths != null) {

     * @param show the new visibility state
     * range inclusive of all spanned columns.
                                / fatColumns.size();
    /**
                redraw();
        if (scrollTo != null) {
    Font italicFont;
     * Sets the table scrolling method to either scroll column-by-column (true)

            if (savedFocus.col >= 0) setFocusColumn(savedFocus.col);
                            return;

     * manages the style to pass to the super class.
        updateSelectionCache();
        int visibleRows = availableHeight / itemHeight + 1;

        gc.setForeground(getLabelProvider().getHeaderBorder(null));

            return obj instanceof RowLocation &&
                                showColumn(prev);

    /**
    /**
        if (dragging) {
                                normalWidth += curColumn.getWidth();
        }
                            StringBuilder text = new StringBuilder();
                            column.setWidth(newWidth);
                    }
    {
                        focusItem = row;
        KEYBOARD,

        int x = 0;
        } while (iterItem != toItem);
     * is visible.
                } else {
     * the state of the table to change and therefore the hover effects may have
    }

        int mask = SWT.BORDER | SWT.LEFT_TO_RIGHT | SWT.RIGHT_TO_LEFT | SWT.H_SCROLL | SWT.V_SCROLL
                if (bounds.x + bounds.width >= clientArea.x) {
        Event selectionEvent = updateCellSelection(cells, stateMask, false, true, EventSource.KEYBOARD);

        // the setFocus method on Composite will not set focus to the
                    curColumn.pack(sizingGC, false);
         * height in pixels of this range (including horizontal separator between rows)
        }
    /**
                EventSource.KEYBOARD);
     * @param y mouse y coordinate
            }

    public void setRowHeaderVisible(boolean show)
import org.jkiss.code.NotNull;
    }

            if (!inverse) {
        protected int[] getTypeIds() {
        }
    private void getCells(GridColumn col, List<GridPos> cells)
    protected void setScrollValuesObsolete()

            return null;
                                    selectedCells.contains(testPos),
    {
            if (col == null) {
    {
        } else {
/*

        if (controlWasHidden) {

/**
        topColumns.clear();
            }
        }
     *
                }
        handleHovering(p.x, p.y);
//        }
        }
     * Paints.
        if (cell.col < 0 || cell.col >= columns.size())


                topColumns.sort(pinnedComparator);
import org.jkiss.dbeaver.ui.controls.CustomToolTipHandler;
            return null;
                GC gc = new GC(this);
                scrollTo = rightColumn;

            hScroll = new ScrollBarAdapter(getHorizontalBar(), false);
            }
                if (state.expanded) {
                            IGridRow gridRow = gridRows[row];

     * Selects the items at the given zero-relative indices in the receiver. The

        }
        // parameter preparation
                    cellDragSelectionOccurring = true;
                }
        if (columnHeadersVisible) {
                gc.drawLine(startX + 1, y, startX + width, y);
    {

        selectedColumns.clear();
        }
            }

    /**
    }
                    } else {
     * Updates cell selection.
    @Nullable
                int hiddenArea = preferredSize.x - clientArea.width + 1 + (vScroll.getVisible() ? vScroll.getWidth() : 0);
                                columnBeingSorted = column;
            range.height = 0;
     *
        }

        cellSelectedOnLastMouseDown = false;

            int currIndex = getTopIndex();

            if (ctrl) {
        if (y <= headerHeight) {
        lastClientArea = clientArea;
                return overColumn != null && draggingColumn != overColumn && draggingColumn.isPinned() == overColumn.isPinned();
                setCursor(sortCursor);
     * Returns true if the given cell is selected.
            startIndex = 0;
                    currIndex--;

    }
                continue;

                if (rowHeaderVisible) {
    private void computeHeaderSizes(GC gc, boolean decreaseSize)
            case SWT.HOME:
                    notifyListeners(Event_FilterColumn, event);
            final boolean wasExpanded = rowState.isAllColumnsExpanded();
            }
            }

        }
        } else {
    /**
            newRowHeaderWidth = MAX_ROW_HEADER_WIDTH;
     * Selects the items in the range specified by the given zero-relative
            if (leftColumn == null) {
                notifyListeners(SWT.Selection, se);
        }
        removeAll();
     * @return next visible column or null
    }
            if (getVerticalBar() == null)
                        newSelection = impliedFocusItem;
     */
        bottomIndex = -1;
    @NotNull
        }
            followupCellSelectionEventOwed = true;
                            }
    private GridColumn columnBeingSorted;
        gc.setForeground(getLabelProvider().getHeaderBorder(null));
    }
//            return;
        scrollValuesObsolete = true;
            public void drop(DropTargetEvent event)
     * to set it back in the renderer when its painted. The renderer sets this

    }
//        }
        checkWidget();
    {
            if (columnHeadersVisible) {
            cellColumnSelectedOnLastMouseDown = true;
     * {@code false} otherwise.
        } else {

        if (hoveringOnColumnFilter) {
     */
     */
                    for (GridColumn column : columns) {
            // Nothing to select
            resizingColumn = false;
                            testPos.col = k;
        Event e = new Event();
        int paintHeight = columnHeight;
        for (int i = 0; i < columns.size(); i++) {

                if (alt && newCells.size() == 1) {

            y + height);
     *
    @Override
                hScroll.setValues(selection, 0, max, 1, 1, 1);
        removeListener(SWT.DefaultSelection, listener);

        return new Point(x, y);
            log.warn("Bad column [" + column.getElement() + "]");
     * <p/>
            }
    }
        final GridColumn col = getColumn(point);
                    cellColumnDragSelectionOccurring = true;
                        Event newEvent = new Event();
                    gridController.moveColumn(draggingColumn.getElement(), overColumn.getElement(), location);
    /**
    /**
            // Draw child columns
                            );
            SWT.error(SWT.ERROR_INVALID_ARGUMENT);
            @NotNull GridPos newCell,

            selectedCells.clear();
            if (isSingleCellPaint && redrawRow != row) {
    {
            selectionEvent.data = new GridCell(
     * @param e event
     * @param newCells                    newly clicked, navigated to cells.
                    }
    public GridPos cellToPos(GridCell cell)

        checkWidget();
                        if (e.y > headerHeight) {
        }


            updateScrollbars();
            x,
        }
            setCursor(sortCursor);
            }
            return Arrays.toString(this.location);

    {
     * {@code true}, and marks it invisible otherwise. When row headers are
        }
            result.add(row);
    /**
        return bottomIndex;
                            toggleRowExpand(getRow(row), null);
        int columnCount = columns.size();
        List<GridColumn> children = column.getChildren();
        addListener(SWT.MouseHorizontalWheel, this::onMouseHorizontalWheel);
    private void getCells(int row, List<GridPos> cells)
        MOUSE,

        Point preferredSize = getTableSize();
        Rectangle bounds = new Rectangle(x, y, column.getWidth(), paintHeight);
     * @param startIndex index of the first item in the range or -1 to the first visible item in this grid
    {
        updateSelectionCache();
     */
        GridColumn impliedFocusColumn = focusColumn;
     * are out of range and duplicate indices are ignored. If the receiver is
            selectedColumns.add(columns.get(columnIndex));
            } else {
    private void addDragAndDropSupport()
     * than one item in the given range, then all indices are ignored.

            if (j > getItemCount() - 1) {
    }
        range.rows = range.endIndex - range.startIndex + 1;
        columnHeaderRenderer.paint(

        }
        redraw();
            if (x < x2) {
    public void refreshData(boolean refreshColumns, boolean keepState, boolean fitValue)
        GridColumn column = getColumn(columnIndex);


        }

    public Color getForeground() {
     */
//        if (newCell.row < 0 || newCell.row >= getItemCount()) {
            }

        IGridLabelProvider labelProvider = getLabelProvider();
                    return;
        }
     *
     * Shows the column. If the column is already showing in the receiver, this
                    } else {
                                focusItem == row && focusColumn == column,
                int selection = Math.min(hScroll.getSelection(), max);
            Object element = elements[i];
                    addToCellSelection(newCell);
                GridColumn column = getColumn(point);

            x += column2.getWidth();
                    HORZ_SCROLL_INCREMENT,

        int x = -1;
        sortCursor = display.getSystemCursor(SWT.CURSOR_HAND);
     * @param e event
    private static final int MAX_ROW_HEADER_WIDTH = 400;
                                ctrlFlag = SWT.MOD1;
                    // If user clicks on the same selected cell value - selection event will trigger value redraw in panels
     *
    /**
     * when the receiver's selection changes, by sending it one of the messages
     * Selects all of the items in the receiver.
     * Width of each row header.
        cellColumnSelectedOnLastMouseDown = false;
                    moveColumns(event);

            @Override
        /**
        getCells(row, cells);
                break;
            final CellExpandState state = columns.get(column);

            handleHoverOnRowHeader(x, y);
        }
    private void getCells(int startRow, int endRow, List<GridPos> cells)
        }
                getCells(col, cells);
            }
            }

                }
     *
        columnHeaderRenderer = new GridColumnRenderer(this);
    /**
            int x = startX;
        hoveringOnRowExpander = overExpander;

        return columns.get(index - 1);
     * @return the receiver's row header's visibility state
                int totalWidth = 0;
            row++;
        return new GridCell(columns.get(pos.col), gridRows[pos.row]);
    private boolean cellRowDragSelectionOccurring = false;
    {
                                break;

                            	overFilter = true;
    {
                }
            redrawColumn = redrawCell.column;
        for (int i = start; i <= end; i++) {
            node.state = IGridContentProvider.ElementState.EXPANDED;
                overThis = column;
        } else if (columnHeadersVisible && column.getParent() != null) {
            // Collapse node. Remove all elements with different parent
                // Too big tool tip - larger than entire grid
                hScroll.setVisible(false);
            SWT.error(SWT.ERROR_NULL_ARGUMENT);

        // area may have been added/removed.
            // paint left corner
    }
                }

     * Selects the items at the given zero-relative indices in the receiver. The
     */
                                    hoveringItem == row && hoveringColumn == pc,
                            	break;
    private record RedrawCell(int row, GridColumn column) {
     * @param e event
        }
        }
                savedFocus.row = -1;

    public void setSelection(int[] indices)

        } else {

        // forceFocus()
            SWT.error(SWT.ERROR_NULL_ARGUMENT);
        List<GridPos> cells = getAllCells();
        	GridCell cell = posToCell(pos);

     * @return the preferred size of the table.
            SWT.error(SWT.ERROR_INVALID_ARGUMENT);
                columnBeingResized.pack(gc, true);
     * @param e event
     *
            GridColumn endColumn = getColumn(newCell.col);
            {

                    hScroll.setSelection(getHScrollSelectionInPixels() + (x - firstVisibleX));
            return bottomIndex;

     *
                        newSelection = impliedFocusItem;
                // Order respecting pinned state
            if (!firstTime) {
     * a renderer to differentiate between hovering over different parts of the
        //based, not off the focus item/column, but rather off the implied focus (i.e. where the
     * @return the index of the selected item

                }
     * @return the number of items
        this.scrollValuesObsolete = true;
                        newEvent.data = new GridCell(col, gridRows[row]);

    private boolean isRowHeaderVisible()
        selectedCells.clear();
                        break;

                    this.location[index--] = r.getRelativeIndex();
                } else {
                            }

        showColumn(col);
                    }
     * @param column column
    {
            }
                    if (impliedFocusItem >= 0) {

    private boolean scrollValuesObsolete = false;
        } else {
                        for (GridColumn curColumn : columns) {
     *
     * in pixel of such a range and to count the number
    {
        int iterItem = endRow;
                // horizontal scrolling works pixel by pixel
            {
            @Override

            }
        } else {
                    GC gc = new GC(LightGrid.this);
            }

        Rectangle clientArea = getClientArea();
    /**
    {
     * Returns the height of the on-screen area that is available
            log.error("Row [" + row + "] state can't be toggled");
     */
                            newColumnFocus = impliedFocusColumn;
                selectedCells.clear();

        redraw();
     * @param cell cell
                newWidth = maxWidth;
    private static final int COLUMN_RESIZER_THRESHOLD = 4;
            if (dragging) {
     * @param item item to focus.
                // if possible, remember selection,


                if (ltSort != SWT.NONE 

     * current selection is first cleared, then the new item is selected.
            this.maxColumnDepth = 0;
    /**
            }
                            break;
                if (overColumn == null || draggingColumn == null || draggingColumn == overColumn) {

    /**
                return;
        //listening to the dispose has had a chance to do whatever.


        Point prefSize = null;
        GridColumn oldFocusColumn = focusColumn;
     * Note: This is not the actual structure used by the receiver to maintain

     * Are row headers visible?
            for (int i = 0; i < getItemCount(); i++) {
        }
            se.gc = new GC(this);
        computeHeaderSizes(gc, decreaseSize);
                            }
     * @param column given column
    }
        return linesVisible;
     * @return true if the cell is selected.
    public void setColumnScrolling(boolean columnScrolling)
    }

                                selectedCells.contains(testPos),
                        if (isDragSingleRow()) {

                reverse = false;
    public void refreshRowsData() {


     * @param decreaseSize
     * If the receiver is single-select, do nothing.  If cell selection is enabled,
        int stateMask,
            public void mouseUp(MouseEvent e)
                if (dragImage != null) {

                {
     * @param x mouse x
                e.doit = false;
    private int collectNestedRows(List<IGridRow> result, IGridRow parentRow, int position, int level) {
        gc.setBackground(getBackground());
                newColumnFocus = impliedFocusColumn;
        if (columnHeadersVisible) {
        } else {
                            for (GridColumn column : selectedColumns) {

            return;
                    dragImage = null;
    // In that case columns will be repacked even if keepState is true
                int visCols = columns.size();
                    }
     * bounds are changed.
                selectedRows.put(cell.row, Boolean.TRUE);
    private GridColumn getNextVisibleColumn(GridColumn column)
                currentColumn = startCol;
     * Returns the zero-relative index of the item which is currently at the top
        checkWidget();

     * back and maintains it so it can be set back when the cell is painted. The
     */
     * @param start the start of the range
                scrollTo = leftColumn;
        final RowExpandState rowState = expandedRows.get(gridPos);
        if (foregroundColor == null) {
            return null;
    private String getCellToolTip(GridColumn col, int row) {
        return rowState != null && rowState.isColumnExpanded(column);
                            toggleRowExpand(gridRows[focusItem], focusColumn);

                // Click on header
        int index = 0;
    {
                    newTip = NLS.bind(DataEditorsMessages.grid_tooltip_sort_by_column, getLabelProvider().getText(hoveringColumn));
    private boolean controlWasHidden;
        while (row < itemCount && y2 <= clientArea.height) {
     * indices in the receiver. The range of indices is inclusive. The current
                    }
        }
     */
        for (GridColumn column : columns) {
    public void selectAll()
                vScroll.setVisible(true);
                int availableWidth = clientArea.width - firstVisibleX - col.getWidth();

        if (row == -1)
     *
     * @return height of visible grid in pixels
                    //XXX: make this user definable
     * List of table columns in creation/index order.
            vScroll = new ScrollBarAdapter(getVerticalBar(), true);

        hScroll.setSelection(0);

    /**

                            }
    private final List<GridColumn> columns = new ArrayList<>();
    }
    }
            }
        int newFrom = fromColumn.getIndex();
                    for (GridColumn column : columns) {
     */
                event.y = e.y;
            return -1;
     *                                 within the availableHeight, otherwise it may lie partly outside this range

     * If the item at a given index is not selected, it is selected. If the item
                if (!state.expanded) {
        this.linesVisible = linesVisible;
     */

     * selection is cleared before the new items are selected.
                        }
        checkWidget();
    }
                toolTipHandler.updateToolTipText(newTip);
        boolean overLink = false;
            }
        }
    /**
        return cells;
        if (column == null) {

            return topIndex;
     */
                        newCells.add(new GridPos(col.getIndex(), row));
            // Expand node
            } else {
        int newRowHeaderWidth = DEFAULT_ROW_HEADER_WIDTH;
            return index + 1;
     * updated when appropriate.  #isShown() should be called for every client (even internal
                    redrawCells.add(new RedrawCell(oldHoverRow, oldHoverColumn));
        addListener(SWT.MouseWheel, this::onMouseVerticalWheel);
        RowRange range = new RowRange();
        topIndex = -1;
        }
                if (hoveringOnColumnFilter) {
                            }
     * @param item   item
    private void handleHoverOnColumnHeader(int x, int y)

        if (sortOrder != SWT.NONE) {
            int x2 = 0;
    // Just caching because native impl creates new objects and called too often
                // max should never be greater than the number of visible cols
                }
        	}
    /**
            if (i < 0) {
        //We only want to dispose of our items and such *after* anybody else who may have been
        //this.drawBackground(gc, 0, 0, getSize().x, getSize().y);
        for (int i = 0; i < elements.length; i++) {
                        selectedCellsBeforeRangeSelect.addAll(selectedCells);
                }
import org.jkiss.dbeaver.Log;
                    continue;
        @Override
                handleDragEvent(event);

                columnIndices.put(cell.col, Boolean.TRUE);
    Point getOrigin(IGridColumn column, int item)
                        List<Object> elements = new ArrayList<>();
            }
            GridColumn col = getColumn(point);
     * Marks the receiver's row header as visible if the argument is
     * This is primarily used to measure the height

        Object[] children = getContentProvider().getChildren(parent);

            return range;
                    selection,
                            event.data = text.toString();
        gc.drawLine(
     * @see #addSelectionListener(SelectionListener)

     * pointer and sets field appropriately.
        return isCellExpanded(cell.getRow(), cell.getColumn());
    private void onMouseVerticalWheel(Event e)
                            cellRenderer.paint(
     * that no items are selected.
     * the receiver. This index can change when items are scrolled or new items
     * Mouse move event handler.
    private int hoveringItem;
     * are always visible.
     * painting.

                handleDragEvent(event);
        if (hHint == SWT.DEFAULT) {
                if (column.getChildren() != null) {
        }
        if (columnScrolling) {
                    if (!firstLoop2) {
                    if (GridColumnTransfer.INSTANCE.isSupportedType(event.dataType)) {
            if (col == null && rowHeaderVisible && e.x <= rowHeaderWidth) {
        if (e.character == '\r' && focusItem >= 0 && focusItem < gridRows.length) {
    public Collection<Integer> getRowSelection()
            if (row >= 0 && row < getItemCount()) {
            if (p.y >= y2 && p.y < y2 + currItemHeight + 1) {
import org.eclipse.swt.graphics.*;
            // TODO: We also need to collapse this column in all nested rows
                //Unfortunately we have to start all over again from the top with the new range
    {
        bottomIndex = -1;
            headerHeight = GridColumn.topMargin + fontMetrics.getHeight() + GridColumn.bottomMargin;
                selectedCells.removeAll(newCells);
        Point ttSize = sizingGC.textExtent(toolTip);
                        } else {
        if (index < 0 || index >= getItemCount()) {

    private boolean cellDragCTRL = false;
     * scrollable minus the height of the column headers (if shown).
        final GC gc = e.gc;
            endColumn = getColumn(newRange.y);

            shiftSelectionAnchorItem = -1;
    {

    }
                if (draggingColumn != null) {
        return rowHeaderVisible;
            // Hover in row header
                        if (newWidth != null) {
            }
import org.eclipse.swt.dnd.*;
        @Override
    /**
            if (x < firstVisibleX || col.getWidth() > clientArea.width - firstVisibleX) {


    }
        return range;
            boolean firstLoop = true;
            parentNodes = ArrayUtils.deleteArea(GridNode.class, parentNodes, row + 1, deleteTo - 1);

                }
    private void paintColumnsHeader(GC gc, @NotNull GridColumn column, int x, int y, int columnHeight, int level) {
                    x += rowHeaderWidth;
        // Check for link
        for (int i = start; i <= end; i++) {
        }
            columnElements = contentProvider.getElements(true);
                    setCursor(getDisplay().getSystemCursor(SWT.CURSOR_CROSS));
     * If cell selection is enabled, all cells within the item at the given index
    /**
                endItem = temp;
    }
                }
        redraw();
            SWT.error(SWT.ERROR_NULL_ARGUMENT);
    @Override

    }
     * @param listener the listener which should no longer be notified
     *
     * Selects the selection to the given cell.  The existing selection is cleared before
     * In extreme cases, getBottomIndex() may return the same value as
        final Rectangle clientArea = getClientArea();
        return selectedCells.size();
                if (getHorizontalBar() == null)
     * @see #bottomIndex
     *
        //keyboard has extended focus to).
        redraw();
        return selectedColumns.size();
import org.jkiss.utils.ArrayUtils;
                handleHoverOnColumnHeader(e.x, e.y);

    }
                int ltSort = getContentProvider().getSortOrder(null);
                if (!node.isParentOf(parentNodes[deleteTo])) {
    {
                    selectionEvent = updateCellSelection(cells, newStateMask, shift, ctrl, EventSource.MOUSE);

    {
                selectionEvent = updateCellSelection(cells, e.stateMask, false, true, EventSource.MOUSE);
        if (point == null) {
            return null;
                StringBuilder status = new StringBuilder();


                if (cellColumnDragSelectionOccurring && handleCellHover(e.x, e.y)) {
        int colHeaderHeight = 0;
                // if selection is too large, just make it the max you can
        return x;
                            } else {
                		&& y > GridColumnRenderer.TOP_MARGIN)
        showItem(item, -1);
import org.jkiss.dbeaver.model.DBPImage;
    }
            int colIndex = col.getIndex();
            width + 1,
                    }
                }

            if (handleHovering(e.x, e.y)) {
            return Arrays.hashCode(this.location);
        cellRowSelectedOnLastMouseDown = false;
     * Type of selection behavior. Valid values are SWT.SINGLE and SWT.MULTI.
                    event.image = dragImage;
        if (startIndex < 0 || endIndex < 0 || startIndex >= itemCount || endIndex >= itemCount
            if (getVerticalBar() != null) {
        return text;
            hoveringDetail = detail;
     * zero, despite the fact that visually, one column of items may be visible.

                    }
                for (GridColumn column : columns) {
        return draggingRow != null && !selectedRows.containsKey(draggingRow);
            redraw();

    private boolean hoveringOnRowHeader = false;
            int endItem = newCell.row;
            }
        public boolean isColumnExpanded(@NotNull IGridColumn column) {
            return Collections.emptyList();
     * Returns the intersection of the given column and given item.
                for (GridColumn column : columns) {
    private boolean hoveringOnColumnFilter = false;
            SWT.error(SWT.ERROR_NULL_ARGUMENT);
        public int startIndex;
import java.util.*;
            case SWT.ARROW_LEFT:
        for (GridColumn column : columns) {
     * that column. If no column is found, returns -1.
                selEvent.character = e.character;
                    for (GridColumn col : selectedColumns) {
            return false;
            newRowHeaderWidth = Math.max(newRowHeaderWidth, width);

                                gridRow.getLevel(),
        }
     * will return the last visible item in the table.
     * If cell selection is enabled, all cells within the given range are selected.
        addPaintListener(this::onPaint);
     * selected.
     * variables that let the painting code now what to paint as hovered.
    }
    private void handleColumnResizerDragging(int x)
            updateScrollbars();
                        newSelection = tmpItem;
            handleHoverOnColumnHeader(e.x, e.y);
        //do normal cell specific tooltip stuff
            for (deleteTo = row + 1; deleteTo < gridRows.length; deleteTo++) {
            return;
                }
     * @return height of plain grid
    }
     */
    }
        if (item >= 0) {
     */
            focusColumn = col;
        if (isDisposed() || selectedCells.isEmpty()) {
    private void drawEmptyCell(GC gc, int x, int y, int width, int height) {
        int oldRowHeaderWidth = rowHeaderWidth;
    Collection<GridColumn> getColumns()

            }
            firstVisibleX = rowHeaderWidth;
    public GridCell getFocusCell()
            } else {
                                    gridRows[row]
import org.eclipse.jface.resource.JFaceColors;
                } else {
        range.startIndex = startIndex;
            Object element = children == null ? parentRow.getElement() : children[i];
        return new Point(newFrom, newTo);
                } else {
    }
        
                // Navigate link
            //Avoid unnecessarily resetting tooltip - this will cause the tooltip to jump around
        if (selectionType == SWT.SINGLE && indices.length > 1) return;
            GridPos cell = getCell(new Point(e.x, e.y));
        return selectionEvent;
    }
    }
     */
    }
        return columnScrolling;

        if (col == null || row < 0 || row >= gridRows.length) {
            if (i < 0) {

        int item = getRow(point);
                }
    public boolean isCellExpanded(@NotNull IGridRow row, @NotNull IGridColumn column) {
                    Point dropPoint = getDisplay().map(null, LightGrid.this, new Point(event.x, event.y));
        checkWidget();

    {
            }
                                    cellBounds,
     * String-based detail of what is being hovered over in a cell. This allows
        }

            || endIndex < startIndex)
    {
                    firstLoop2 = false;
        }
                            x2 += column.getWidth();
            if (j >= 0 && j < getItemCount()) {
                    Image statusImage = DBeaverIcons.getImage(statusIcon);
            }
     * Mouse exit event handler.
    }
                    if (getRowState(gridRow) != IGridContentProvider.ElementState.NONE) {

     */
        public int height;
        do {

            for (GridColumn child : children) {
                }
            (hoveringOnColumnSorter ? 1000000 : 0) +

        boolean reverseDuplicateSelections,

            x + width - 1,
        normalFont = getFont();
        }
                if (redrawColumn != null && redrawRow >= 0) {
            sizingGC.dispose();
                int hiddenArea = preferredSize.x - clientArea.width + 1;
    }
    public void showItem(int item, int topOffset) {
                    } else if (TextTransfer.getInstance().isSupportedType(event.dataType)) {
            selectCells(getCells(i));
        if (overResizer != hoveringOnColumnResizer) {
                scrollValuesObsolete = true;
        private static final int TYPEID = registerType(TYPE_NAME);

                    }


                        {
                iterItem++;
        } while (true);
        }
    /**
     * item at the index was already selected, it remains selected. Indices that
    /**
            }
        }
     * Shows the selection. If the selection is already showing in the receiver,

        Rectangle clientArea = getClientArea();
                    RowRange range = getRowRange(getTopIndex(), getVisibleGridHeight(), false, true);
    public boolean isLinesVisible()
    public IGridColumn getColumnByElement(Object element) {
                }
    }
    private GridColumn shiftSelectionAnchorColumn;
    @NotNull
        // Column header height

    void newColumn(GridColumn column, int index)
            y + height - 1,
        }
        expandedRows.clear();
        }
            RowRange range = getRowRange(getTopIndex(), visibleGridHeight, false, false);
    private Event updateCellSelection(
                            if (decreasing) {
                    cellRowDragSelectionOccurring = true;
     */
    {
                createChildColumns(column);
     * Item selected when a multiple selection using shift+click first occurs.
        return selectedCells.iterator().next().row;
    }
            displayedToolTipText = newTip;
            clientArea = getClientArea();
        if (otherIndex < 0) otherIndex = 0;
        checkWidget();
            {
                                if (text.length() > 0) text.append(", ");

    @Nullable
                if (x < leftSpan) {
                if (alt && newCells.size() == 1) {
                    focusItem = row;
        	handleHoverOnColumnHeader(e.x, e.y);
        checkWidget();
    {
            Event selEvent = updateCellSelection(
    private Color backgroundColor;
        }
    {
        showColumn(cell.col);
            return state != null && state.expanded;
    {
    {
    }


        }
 * You may obtain a copy of the License at
        if (getItemCount() == 0)
                y += getHorizontalBar().getSize().y;
        }
                }
            } else {
                GridColumn redrawColumn = getColumn(point);
     * Are column headers visible?

    }
        scrollValuesObsolete = true;
    /**

        if (rowState == null || !rowState.isAnyColumnExpanded()) {
    public List<GridCell> getCellSelection()
                int selection = Math.min(hScroll.getSelection(), hiddenArea - 1);
    }
                            }
        }
        if (getVerticalBar() != null) {
     * If cell selection is enabled, all cells within the given range are selected.
                newCells.get(0).equals(selectedCells.iterator().next()))
     * True if the last visible item is completely visible.  The value must never be read directly.  It is cached and
        selectAllCells();

        final Display display = getDisplay();
                        currentScrollTo = prevCol;
    public void toggleRowExpand(@NotNull IGridRow gridRow, @Nullable IGridColumn gridColumn) {
            }
                    int width = column.getWidth();

    }

                    if (totalWidth > clientWidth && clientWidth != 0) {
                firstVisibleX += pinnedColumnsWidth;
        gc.setBackground(getLabelProvider().getHeaderBackground(null, false));
                iterItem++;
//            }
                        availableWidth -= prevCol.getWidth();
     *
        scrollValuesObsolete = true;
    private int paintColumnHeader(@NotNull GC gc, int x, GridColumn column) {
        if (selectionType == SWT.SINGLE && start != end) return;
        return new Point(fromColumn.getIndex(), toColumn.getIndex());
                } else if (currIndex > item) {
     *
    {


                }
     * Mouse wheel event handler.
    /**
                // Sometimes (when new grid created and filled with data very fast our client area size is zero
    {
        if (newWidth < MIN_COLUMN_HEADER_WIDTH) {
     * @see SWT#SINGLE
        if (bottomIndex != -1)

        gc.dispose();
            if (colIter == column) {

            // Change focus column anyway
                        dragImage.dispose();
                event.x = e.x;
    private boolean isRowExpanded(IGridRow gridRow) {
            }
     */
    private final List<GridColumn> selectedColumns = new ArrayList<>();
     * and marks it invisible otherwise.
                    size = Math.max(size, state.size);
     */
                        focusColumn = getColumn(new Point(rowHeaderWidth + 1, e.y));
        if (index >= getItemCount()) {

        if (newRowHeaderWidth < MIN_ROW_HEADER_WIDTH) {
        addMouseTrackListener(new MouseTrackListener() {

            }
                if (col != null) {
    public GridColumn getColumn(int index)
                                gridRow);
    {
        return selectedCells.add(newCell);
                }
                forceFocus();
                            gc.setClipping((Rectangle)null);
            getHorizontalBar().addListener(SWT.Selection, e -> onScrollSelection());
        if (indexOf(fromColumn) > indexOf(toColumn)) {
                        boolean isExpanded = isCellExpanded(new GridCell(focusColumn, gridRow));

    /**
            if (!selectedCells.containsAll(newCells))
            focusColumn = getColumn(new Point(rowHeaderWidth + 1, 1));
     * Shows the item. If the item is already showing in the receiver, this
     */
                columns.sort(pinnedComparator);
                this.location = new int[row.getLevel() + 1];
            x += rowHeaderWidth;
        boldFont = UIUtils.makeBoldFont(normalFont);
     * @see SWT#MULTI

    {
    }

        int x = 0;
            x += rowHeaderWidth;
    @NotNull
            range.startIndex = 0;
            if (newSelection >= 0 && newSelection < gridRows.length) {
        final int operations = DND.DROP_MOVE | DND.DROP_COPY;// | DND.DROP_MOVE | DND.DROP_LINK | DND.DROP_DEFAULT;
        if (point == null) {
        }
     * <p/>
        	hoveringOnColumnFilter = overFilter;
//            selectCell(focusPos);
        }
     * that are out of range are ignored and no items will be selected if start

                    event.detail = DND.DROP_MOVE;
        return (row >= firstVisibleIndex && row < lastVisibleIndex)

     * @return the number of columns

        }
     * ignored.


            text = text.substring(0, MAX_CELL_TEXT_LENGTH) + "...";
     * Returns the next visible column in the table.
    {
    /**
        hoveringItem = -1;
                // Rebuild columns model
            x,
            boolean isSelectedCell = false;

        if (getVerticalBar() != null) {
        }
        return object != null ? object.getElement() : null;

     * about the range, especially the index of the last
        x2 += pinnedColumnsWidth;
        }
     * Mouse down event handler.
                        if (e.x > rowHeaderWidth) {
        }
                handleDragEvent(event);
        // that if a scrollbar is turned on/off, the other scrollbars
    {
            // Invalidate columns structure
                col -> new CellExpandState(provider.getCollectionSize(col, gridRow))
                e.stateMask,
     * If cell selection is enabled, all cells within the given indices are selected.
    /**
            setTopIndex(Math.max(0, item - topOffset));
                if (col.getWidth() > clientArea.width - firstVisibleX) {
        return new Rectangle(origin.x, origin.y, column.getWidth(), getItemHeight());
    /**

            x -= hScrollSelectionInPixels;
                columnBeingResized = null;
        checkWidget();
                GridColumn currentScrollTo = col;
                hScroll.setSelection(sel);
                    event.x = e.x;


    }
        if (col.getChildren() != null) {
        topIndex = -1;
     * @param dragging                   true if the user is dragging.
        }
    public abstract IGridLabelProvider getLabelProvider();
            col = getColumn(point);
    public int getMaxVisibleRows(){

     * callers).  A value of -1 indicates that the value is old and will be recomputed.
        if (topIndex != -1)
        } else {

    private int resizingColumnStartWidth = 0;
        if (selectedCells.isEmpty()) return;



    private int getHScrollSelectionInPixels()
                break;
            return;

        this.lineSelectedColor = lineSelectedColor;
                GridColumn column = getColumn(0);
                    if (hoveringItem < 0) {
        boolean overExpander = false;
                }
        int index = columns.indexOf(column);

                newPos = new GridCell(newColumnFocus, gridRows[newSelection]);
     */

        // when an editor is open
        // Recalculate indexes, sizes and update scrollbars
                            }
     * Sets the zero-relative index of the item which is currently at the top of
    }
                    iter.remove();
        }
    /**

            oldSelection = new ArrayList<>(selectedCells);

    /**
                return;

     * @see LightGrid#select(int,int)
        // First, figure out if the scrollbars should be visible and turn them


        boolean shift = (stateMask & SWT.MOD2) == SWT.MOD2;
            hScroll = new NullScrollBar();
            y += headerHeight;
        if ((!rowHeaderVisible || y > headerHeight) && x <= rowHeaderWidth) {
    }
        if (refreshColumns) {
                        }
        // on right away
        } else if (hoveringOnLink) {
    private void refreshHoverState()

     */
     * </p>

        return selection;
    @Nullable
     * <p/>
            if (!shiftPressed) {

                GridColumn overColumn = getOverColumn(event);
                break;
        private static final String TYPE_NAME = "LighGrid.GridColumn Transfer" + System.currentTimeMillis() + ":" + INSTANCE.hashCode();//$NON-NLS-1$
                        if (currentColumn != null)
                            // Narrow fat columns on decWidth
     */
            x += prefSize.x;
     * of the receiver. This index can change when items are scrolled or new
        }
            // if possible, remember selection,
        }
            vScroll.setSelection(Math.min(vScroll.getMaximum(), savedVSB));
        if (rowHeaderVisible) {

            private long lastDragEndTime;
     */
    private final GridRowRenderer rowHeaderRenderer;

                }
    @Override
                }
    private static final int SELECTION_DRAG_BORDER_THRESHOLD = 2;

        }
     */
                                    focusItem == row && focusColumn == pc,
                        }
            selectCells(getCells(i));
        return selectedCells.size();
        }
            return Collections.emptyList();

            if (newCells.size() == 1 &&
                y += itemHeight + 1;
            x += rowHeaderWidth;

            }
            shiftSelectionAnchorColumn = null;
            }
        List<GridCell> cells = new ArrayList<>(selectedCells.size());
    {
    @NotNull
    @NotNull
                if (!hoveringOnColumnSorter) {
                continue;
     */
            int leftSpan = getPinnedColumnsWidth();
        }
            if (rightColumn != null) {
    protected void paintTopLeftCellCustom(GC gc, int y) {
        }
            x + width,
    public Collection<GridPos> getSelection()
            );


    {
                y += itemHeight + 1;
    @Nullable
        		setCursor(null);
            if (getHorizontalBar() != null) {
    /**
        RowRange range = new RowRange();
                selectedCells.addAll(selectedCellsBeforeRangeSelect);
        if (columnHeadersVisible) {
                return null;
    /**

     * @see RowRange
        for (GridColumn column2 : columns) {
    private int itemHeight = 1;
        }

    public void setFocusColumn(int col)
     *

        final Rectangle clientArea = getClientArea();
     *
    }
     *

        dropTarget.addDropListener(new DropTargetListener() {
    }
    }
     * or pixel-by-pixel (false).
                iterItem--;
        int newTopIndex = item;
            selectionEvent.stateMask = e.stateMask;
    /**
        	 if (hoveringOnColumnFilter) {
                        while (iterCol != null) {
                        }
                        int index = indexOf(currentColumn) + 1;
            x = wHint;
     * {@link #getTopIndex()}.
        }
     * @param start the start index of the items to select
            }
            SWT.error(SWT.ERROR_NULL_ARGUMENT);

        gc.fillRectangle(x, y, width, height + 1);
            Rectangle bounds = column.getBounds();
            showColumn(newColumnFocus);

     *                        scroll by pixel
            shiftSelectionAnchorItem = newCell.row;
    /**
    public GridPos getCell(Point point)
            }


        //if (shiftPressed) {

        commentFont = UIUtils.modifyFontSize(italicFont, -1);
                }
                            cellBounds.height--;
        redraw(clientArea.x, clientArea.y, clientArea.width, clientArea.height, false);
     * Computes and sets the height of the header row. This method will ask for
    private boolean columnScrolling = false;
    {
            selectedCells.clear();

                pixels += columns.get(i).getWidth();
        if (newTopIndex >= getBottomIndex()) {
            // Check tooltip
            }
        addListener(SWT.Dispose, disposeListener);
                    return;
     * @param column column
     * {@code GridColumn}s were created by the programmer, this value is
     *
    private void onKeyDown(Event e)
                            //then we must be hovering way to the right
        }

                if (!hoveringOnHeaderDragArea) {
     * @param index  index to insert new column
    public Point computeSize(int wHint, int hHint, boolean changed)
    /**
        return range != null ? range.height : 0;
                    setCursor(getDisplay().getSystemCursor(SWT.CURSOR_CROSS));
        setDragDetect(false);
        int pinnedColumnsWidth = getPinnedColumnsWidth();


    {
                StringTokenizer st = new StringTokenizer(toolTip, "'\n");
        if (item >= 0 && column != null) {
        // ? do we need it? It may improve performance a bit (as drawBackground is relatively slow.

import org.eclipse.swt.widgets.*;
    }


                maxWidth -= rowHeaderWidth;

        UIUtils.dispose(commentFont);
        columnBeingResized.setWidth(newWidth, false);
            Point cols = getRowSelectionRange(fromColumn, toColumn);
                        continue;
        }

        GC sizingGC = new GC(this);
        redraw();
            height + 1);
                if (cellRowDragSelectionOccurring && handleCellHover(e.x, e.y)) {
            } else {
     * notified when the receiver's selection changes.
        String text = String.valueOf(cellValue);
     */
    int indexOf(GridColumn column)
    public void select(int[] indices)
        		cells.add(cell);
        if (newCell.col < 0 || newCell.col >= columns.size())

        //Update the list of which columns have all their cells selected
     */
                selEvent.stateMask = e.stateMask;
                savedFocus.row = Math.min(savedFocus.row, itemCount - 1);
        		
        }
        return columns.get(index);
     * Marks the scroll values obsolete so they will be recalculated.

    /**
                    showItem(row);
                        } else {
            case ITALIC -> italicFont;
                    drawEmptyCell(gc, x, y, column.getWidth(), itemHeight);
    private boolean isDragSingleRow() {
     */
            if (!forceEndCompletelyInside)
                }
                newColumnFocus = impliedFocusColumn;
                if (rowHeaderVisible) {
                if (newSelection < 0) {
            }
     *

        }
        checkWidget();

            drawEmptyColumnHeader(gc, x, 0, clientArea.width - x, headerHeight);
            if (itemCount == 0) {
    private boolean isColumnContextMenuShouldBeShown = false;
     */

    private final CustomToolTipHandler toolTipHandler;

     *
     * @see LightGrid#getRowRange(int, int, boolean, boolean)
            return;
            } else {
            if (p.y <= headerHeight) {
                height -= headerHeight;

            {

        }
                        //set focus back to the first visible column
    }
                    boolean dragging;
     * indices in the receiver. The range of indices is inclusive. The current
                y += headerHeight;
        redraw();
    private static int checkStyle(int style)
            colHeaderHeight = Math.max(column.getHeaderHeight(true, true), colHeaderHeight);

            gc.setForeground(this.getLineColor());
            getHorizontalBar().setVisible(false);
        gc.setForeground(foreground);
            }
 * initially based on Nebula grid. Refactored and mostly redone.
    }
                    int row = newCells.get(0).row;
        range.rows = range.endIndex - range.startIndex + 1;
                            GridColumn prev = prevHoveringColumn == null ? null : getPreviousVisibleColumn(prevHoveringColumn);
                startY += headerHeight - 1;
        }
            if (resizingColumn) {
    /**
            notifyListeners(SWT.Selection, selectionEvent);
            if (preferredSize.x > clientArea.width) {
        int newTo = toColumn.getIndex();
                        int index = indexOf(impliedFocusColumn) + 1;
        boolean isSingleCellPaint = redrawRow >= 0 || redrawColumn != null;
     * This does <em>not</em> include the height of the column headers.
     */

        if (text.length() > MAX_CELL_TEXT_LENGTH) {
                x += columns.get(k).getWidth();
                    if (hoveringItem < 0) {
                /*if (hoveringOnColumnSorter) {
                        cellBounds.height = itemHeight + 1;
            scrollValuesObsolete = true;
                }
            fromColumn = toColumn;
                    rowHeaderDragStarted = true;
    private int rowHeaderWidth = 0;
     * cell. For example, hovering over a checkbox in the cell or hovering over

        for (int i = 0; i < childrenCount; i++) {
                    }
    private void onMouseUp(MouseEvent e)
                Comparator<GridColumn> pinnedComparator = (o1, o2) -> o1.isPinned() == o2.isPinned() ?
public abstract class LightGrid extends Canvas {
                        prevCol = getPreviousVisibleColumn(prevCol);
            scrollHorizontally(e.count);
    private Rectangle getCurrentOrLastClientArea() {
     */
            {
            // search last visible item
                se.gc.dispose();
    }
        }
    public boolean isHoveringOnRowHeader() {
     * Sets the focused item to the given item.
                    setCursor(null);

    private boolean linesVisible = true;
    private GridColumn getPreviousVisibleColumn(GridColumn column)
                        } else {

        }

    /**
    }
     * @param index the index of the item to select
            }
             * On macOS, Ctrl + Click is a system shortcut that opens a context menu.

                boolean ctrl = false;
        // there are any children

                setCursor(sortCursor);

                }
     *
                    drawEmptyCell(gc, x, y, clientArea.width - x + 1, itemHeight);
        GridColumn col = null;
     * @return
        hoveringOnLink = overLink;
    {

            {
    /**
     *
            {
        range.endIndex = endIndex;
                        if (index > 0) {
                        int index = indexOf(impliedFocusColumn);
        // Draw lines in the end. Do not paint lines to grid cell to optimize performance

                newCells.size() == selectedCells.size() &&
                }
    {

    public void showColumn(Object element)
            }
        GC sizingGC = new GC(this);

    private int headerHeight = 0;
     *
    public void setCellSelection(@NotNull GridPos cell)
            range.rows = 0;
            List<GridNode> parents = new ArrayList<>();
     * The area to the left and right of the column boundary/resizer that is
        }
    }
        } else {
    public boolean isColumnContextMenuShouldBeShown() {
            y2 += headerHeight;
        lineColor = JFaceColors.getErrorBackground(display);
        if (overLink) {
        int x = 0;
    }


        if (!isValidCell(cell))
            if (hoveringOnColumnResizer) {

            Rectangle sortBounds = new Rectangle(
                    newSelection = getNextVisibleItem(impliedFocusItem);
                } else {
                resizingColumn = false;
            // Vertical lines

     * callers).
     *
            return null;
     * of the receiver. This index can change when items are scrolled, expanded
    }
        }

        // if the scrollbar is visible set its values
                for (IGridStatusColumn gsc : getContentProvider().getStatusColumns()) {
                        hasPinnedColumns = true;
        redraw();
 *
    {
                    focusItem = newSelection;
                int columnWidth = column.computeHeaderWidth(sizingGC);
    /**
        checkWidget();
     * Returns the line color.

        if (isRowExpanded(row)) {
        hoveringDetail = null;
            private void handleDragEvent(DropTargetEvent event)
                    GridColumn intentColumn = hoveringColumn;

        if (selectionType == SWT.SINGLE && start != end) return;
                    event.data = columnBeingFiltered == null ? null : columnBeingFiltered.getElement();
            try {
    private boolean isShown(int row)

     * Sets the focused item to the given column. Column focus is only applicable when cell

            bottomIndex = -1;
                            for (int i = 0; i < columns.size(); i++) {

        if (toolTip.length() > MAX_TOOLTIP_LENGTH) {
            if (cell == null || !cell.equalsTo(getFocusPos())) {
                return;
        }
    /**
        int currItemHeight = getItemHeight();
    /**
    }
            return null;
                                if (i > 0) text.append(", ");
                            int freeSpacePercent = (int) (((double) freeSpace / clientWidth) * 100);
     */

        if (hScroll.getVisible()) {

            boolean alt = (stateMask & SWT.MOD3) == SWT.MOD3;

     * still considered the resizer area. This prevents a user from having to be
            public void mouseDown(MouseEvent e)
    /**
                    }
        if (!column.isPinned()) {
     * @return x position
            @Override
        }
                    if ((ctrlPressed || columns.size() == 1) && getItemCount() > 0) {
                        selectedCellsBeforeRangeSelect.clear();
                    cellDragCTRL = ((e.stateMask & SWT.MOD1) != 0);
                    } else {
            if (newTip != null && !newTip.equals(displayedToolTipText)) {
                    selectionEvent = updateCellSelection(newCell, ctrlFlag | SWT.MOD2, true, false, EventSource.MOUSE);
                    Event event = new Event();
        int oldFocusItem = focusItem;
                        int normalWidth = 0;
                createChildColumns(column);
    {
                    }
            private Image dragImage;
        }
                hScroll.handleMouseWheel(e);
                return;
                        List<GridColumn> fatColumns = new ArrayList<>();
        redraw();
        int availableHeight = clientArea.height - y;
        addListener(SWT.KeyDown, this::onKeyDown);
import org.jkiss.dbeaver.ui.UIUtils;
    /**
                if (e.button == 1) {
    }
                        }
                    GridPos newCell = new GridPos(intentColumn.getIndex(), intentItem);
                // We don't want to call this event if the selected cell equals active one

     *
                        if (index < columns.size()) {
            if (j < 0) {
            }
        } else /*if (eventSource == EventSource.MOUSE)*/ {
            toColumn = temp;
                    newToolTip.append(st.nextToken()).append('\n');
            if (row >= 0) {
                if (!cellRowDragSelectionOccurring && cellRowSelectedOnLastMouseDown) {
    public void setFont(Font font)
    private int getCellSelectionCount()
                    // Alt pressed - select all cells selected in other rows (#5988)
                    if (column.isPinned()) {
                draggingColumn = null;
                newColumnFocus = columns.get(0);
        sizingGC.dispose();
     * Selects the item at the given zero-relative index in the receiver. If the
                    pe.data = redrawCell;
            } else {
        if (index < 0) {
     * Returns the zero-relative index of the item which is currently selected
        final int size;
             }
            Event newEvent = new Event();
    // Last calculated client area
        int oldHeaderHeight = headerHeight;
     * @param indices the indices of the items to select
            }
                            if (getTopIndex() > 0) {
                }
    /**
            }
            }
     * @param startIndex               index of the first (if inverse==false) or
        redraw();

                        focusItem = row;
    /**
    }
        Object[] elements)
            }
    }
                if (currIndex < item) {
     * @param forceEndCompletelyInside if true, the last item in the range will lie completely
        if (oldSelection != null && oldSelection.size() == selectedCells.size() && selectedCells.containsAll(oldSelection)) {
        // for some reason, SWT prefers the children to get focus if

     * Returns true if 'item' is currently being <em>completely</em>
    private int getPreviousVisibleItem(int index)
        rowHeaderRenderer = new GridRowRenderer(this);
                    currentItem++;
     * method simply returns. Otherwise, the items are scrolled until the item
        return isColumnContextMenuShouldBeShown;
                return getSelectionRange(fromItem, newFrom, toItem, newTo);
     */
        this.maxColumnDepth = Math.max(this.maxColumnDepth, parent.getLevel());
        return newStyle;
                    ctrl = CommonUtils.isBitSet(e.stateMask, SWT.MOD1);
     * Threshold for the selection border used for drag n drop

    private GridColumn getColumnWithOffset(Point point, int x2, boolean pinned) {
        return foregroundColor;
    {
        public boolean isAllColumnsExpanded() {
            }
    private void drawEmptyColumnHeader(GC gc, int x, int y, int width, int height)
     */

    private boolean getColumnScrolling()
        int savedVSB = keepState ? vScroll.getSelection() : -1;
                //newColumnFocus = focusColumn;
                {
            childrenCount = children.length;
    }
            {
            expandedRows.put(gridPos, rowState);

    }
            int gridHeight = getBounds().height;
                                );

    /**
                DBPImage statusIcon = gsc.getStatusIcon();
        checkWidget();
    }
    private void onMouseExit(MouseEvent e)

        GridColumn column = getColumn(point);
     */
            }
        GridColumn col = getColumn(column);

                }
    @Nullable
                    newCells = new ArrayList<>();
        for (GridColumn column : topColumns) {
        RowExpandState rowState = expandedRows.get(gridPos);
     * <p/>

                    topColumns.add(column);
                        if (columns.isEmpty()) {
                Event se = new Event();
        });
import org.eclipse.swt.events.*;
                            intentItem = Math.max(0, getTopIndex() - 1);

     * @param column the search column
            return -1;
        if (keepState && !controlWasHidden) {
     * pixel.
                    if (!shift && !altPressed) {
                break;
        addToCellSelection(cell);
            } else if (hoveringOnRowHeader && hoveringRow != null) {
    /**
     * A range of rows in a <code>Grid</code>.
                StringBuilder newToolTip = new StringBuilder();
            x2 += column.getWidth();
        if (vScroll.getVisible()) {
        final Rectangle clientArea = getClientArea();
                                text.append(cellText);
                    }
    private static final int MIN_COLUMN_HEADER_WIDTH = 32;
     * method simply returns. Otherwise, the columns are scrolled until the
                            } else {
    private Integer hoveringRow;
        DropTarget dropTarget = new DropTarget(this, operations);
     * @param style  the style of control to construct
                vScroll.setVisible(false);
        return backgroundColor;
                x += column.getWidth();
        if (columns.size() == 0)

                    if (iterCol != null) {
        if (refreshColumns) {

            addToCellSelection(cell);
            columns.add(index, column);
        if (cell == null)
     * Paints the header.
                GridColumn newFrom = getColumn(cols.x);
        //if populated will be fired at end of method.
        redraw(clientArea.x, clientArea.y, clientArea.width, clientArea.height, false);
                    Rectangle columnBounds;
                    hasChildColumns = true;
        List<IGridRow> rows = new ArrayList<>(initialElements.length);
                    } else {
    void setDefaultBackground(GC gc) {
                        } else {
     * @return the horizontal scroll selection in pixels
    {
                cells.add(new GridPos(k, i));
            scrollValuesObsolete = false;
        int x = 0;
     *
    /**
                        event.data = elements;
    /**
            return new int[] { TYPEID };
        if (hScroll.getVisible() & columnScrolling) {
        return new Point(x, y);
        redraw();

    }
                if ((impliedFocusItem >= 0 && impliedFocusItem >= bottomIndex - 1) || focusItem == bottomIndex - 1) {
            boolean altPressed = CommonUtils.isBitSet(e.stateMask, SWT.MOD3);
        addMouseListener(new MouseListener() {
        GC gc = new GC(this);
        final RowExpandState rowState = expandedRows.get(gridPos);
                        draggingColumn = hoveringColumn;
                    int clientWidth = getCurrentOrLastClientArea().width;
                        }
        redraw();
        removeListener(SWT.Selection, listener);

            }
                break;
        }
                availableRows++;
            if (overSorter) {
                    x += column.getWidth();
                        try {
                    } else {
            getContentProvider().validateDataPresence(columns.get(columns.size() - 1), gridRows[lastRow]);
        column = column.getFirstLeaf();
            showItem(newSelection);
    {
        }
     * @see #topIndex
     * Cell selection events may have <code>Event.detail = SWT.DRAG</code> when the
        final RowLocation gridPos = new RowLocation(gridRow);
        dropTarget.setTransfer(GridColumnTransfer.INSTANCE, TextTransfer.getInstance());
                column.setWidth(columnWidth);
            if (item == -1) {
    {
            }
    /**
        Point p = getDisplay().map(null, this, getDisplay().getCursorLocation());
     * Returns the current cell in focus.  If cell selection is disabled, this method returns null.
                    drawEmptyRowHeader(gc, x, y, rowHeaderWidth, itemHeight + 1);
        int x = 0;
     * Key down event handler.
            // search first visible item

import org.jkiss.dbeaver.utils.RuntimeUtils;


                if (focusItem >= 0) {
        boldFont = UIUtils.makeBoldFont(normalFont);
                draggingColumn = null;
    }

                        cellBounds.x = 0;
            GridColumn column = getColumn(point);
            ||

            }
        italicFont = UIUtils.modifyFont(normalFont, SWT.ITALIC);
     */
            prefSize.x += 2 * getBorderWidth();
    /**
                continue;
                // horizontal scrolling is column by column
        if (x + column.getWidth() >= 0) {
            if (followupCellSelectionEventOwed) {
    private int topIndex = -1;
            setTopIndex(newTopIndex);
        }
    private int shiftSelectionAnchorItem;
                    if (GridColumnTransfer.INSTANCE.isSupportedType(event.dataType)) {
            int visibleGridHeight = getVisibleGridHeight();
        }

            } else {
            if (startIndex == itemCount) return null;
            } else if (rowHeaderVisible && hoveringItem >= 0 && x <= rowHeaderWidth) {
            }
            } else {
    @NotNull
    }

                break;


        if (!vScroll.getVisible()) {
    public IGridScrollBar getHorizontalScrollBarProxy()
     */
            //column cell selection
                    newCells = new ArrayList<>();


        sizingGC.dispose();

        Rectangle clientArea = getClientArea();
                newSelection = bottomIndex;
        return itemHeight;
     */

        gc.fillRectangle(
                }
                // loosing focus on double click see #16705
            if (!col.isPinned()) {
                setCursor(getDisplay().getSystemCursor(SWT.CURSOR_SIZEWE));
     * Returns the height of the plain grid in pixels.
                        if (pinnedColumnsWidth > 0 || redrawColumn == null || redrawColumn == pc) {
import org.jkiss.dbeaver.ui.DBeaverIcons;
        }
            return null;
            if (col != null && !getContentProvider().isVoidCell(col, gridRows[row])) {
                        boolean isPlus = (e.keyCode == '+' || e.keyCode == '=' || e.keyCode == SWT.KEYPAD_ADD);
    }

    Font commentFont;
                        event.doit = false;
    private void onResize() {
    }
                return null;
        if (this.isLinesVisible() && !isSingleCellPaint) {

    private boolean cellDragSelectionOccurring = false;
                    setCursor(getDisplay().getSystemCursor(SWT.CURSOR_CROSS));
     * Note:  Even if 'forceEndCompletelyInside' is set to
        fontMetrics = sizingGC.getFontMetrics();
    }
                        break;
                        }
                }
 *

        int firstVisibleX = 0;
            y;
                }
        // parameter preparation
                        hScroll.setSelection(sel);
         * index of first item in range

                handleDragEvent(event);
     *

    }
     * <p/>
        if (getItemCount() > 0 && focusItem < 0) {
                }
                break;
                return;
            scrollValuesObsolete = true;
        itemHeight = fontMetrics.getHeight() + 3;
                gridColumn,
        }
        for (GridColumn column : columns) {
                        if (!status.isEmpty()) {
    public boolean isCellExpanded(@NotNull IGridCell cell) {
                }
            if (element == null) {
            int thumb = (getVisibleGridHeight(clientArea) + 1) / (getItemHeight() + 1);
     * <p/>
        Color background = getLabelProvider().getBackground(null);
    {
                    rowState.columns.put(column, new CellExpandState(size));

    }

    {
            columns.add(column);

    {
    {
    public void setColumnContextMenuShouldBeShown(boolean value) {
    }
            }
    private boolean isDragSingleColumn() {
    }
                e.button == 1 && cellRenderer.isOverLink(focusColumn, focusItem, e.x, e.y)
     * Returns the number of columns contained in the receiver. If no
                    newColumnFocus = columns.get(columns.size() - 1);
                                overResizer = true;
            } else {

            @Override
        gc.drawLine(
 * limitations under the License.
            fromItem = toItem;
    private boolean isValidCell(GridPos cell)

            GridColumn temp = fromColumn;
        int toIndex = toColumn.getIndex();
     * Index of first visible item.  The value must never be read directly.  It is cached and

                List<GridPos> cells = new ArrayList<>();
                if (e.button == 1 && selectedRows.containsKey(hoveringRow) && dragDetect(e)) {
        super(parent, checkStyle(style));

        // fail fast
    }
        final RowExpandState rowState = expandedRows.get(new RowLocation(parentRow));
    }
                    RowRange range = getRowRange(getBottomIndex(), getVisibleGridHeight(), true, false);
                if (gridController != null) {
        }
                            newColumnFocus = columns.get(index - 1);
                        selectedCellsBeforeRangeSelect.addAll(selectedCells);

            setFocusItem(savedFocus.row);
        }
        }
    }
        UIUtils.dispose(italicFont);
                                intentItem = getTopIndex() - 1;
        }
            refreshColumns = true;
                Event event = new Event();
    private GridColumn columnBeingResized;
                if (columns.get(i).isParent(col)) {
                } else {

package org.jkiss.dbeaver.ui.controls.lightgrid;
                        // Drag and drop started
        if (isDisposed()) {
    /**

        GridPos savedFocus = keepState ? getFocusPos() : null;

            {
    }
        } else if (columnHeadersVisible && e.y <= headerHeight) {

            } else if (columnHeadersVisible && hoveringColumn != null && y <= headerHeight) {
                if (overLink) {

                        if (x + width >= 0 && x < clientArea.width) {
        String toolTip = getContentProvider().getCellToolTip(col, gridRow);
        }
                }
                }
        }

    {
            if (point.x >= x2 && point.x < x2 + column.getWidth()) {
            selectedColumns.contains(column) || focusColumn == column,
    private void onDispose(Event event)

    }
                            }
            row++;
     * current selection is cleared before the new items are selected.
                if (rowHeaderVisible) {
                while (true) {
        }


    public void select(int index)
     * Mouse up handler.
                showColumn(column);
    private void setItemHeight(int height)
                    Point parentLoc = getOrigin(parent, -1);
                    cellSelectedOnLastMouseDown = (getCellSelectionCount() > 0);
     * element in the range (or if inverse == true, then the
        focusItem = oldFocusItem;

        return focusColumn;

     * @see SelectionListener
    /**
     * are horizontally scrolled away.
                } else if (draggingRow != null) {
            } else if (bounds.x + bounds.width >= clientArea.width) {
        //fixme delete code bellow?
            // In this case use parent row element
    private void onMouseDoubleClick(MouseEvent e)
             * [dbeaver/dbeaver/issues/10725]
                // Clicked on top-left cell or outside of grid
        if (hoveringOnColumnSorter) {
                    // If grid width more than screen - lets narrow too long columns
            range.rows = 0;
    private boolean hoveringOnColumnResizer = false;
     * @return selection event that will need to be fired or null.
    {

             *
        }
        updateScrollbars();
    }

            (hoveringOnColumnFilter ? 1000000 : 0) +
        disposeListener = this::onDispose;
        if (hoverChange) {
            }
        vScroll.setSelection(0);

            if (column == null) {
        IntKeyMap<Boolean> columnIndices = new IntKeyMap<>();
            EventSource eventSource)
        final DragSource source = new DragSource(this, operations);

        int pinnedColumnsWidth = getPinnedColumnsWidth();
    }
     */
                if (ctrlPressed || columns.size() == 1) {

     * <p>Here, "completely" only refers to the item's height, not its
            setCursor(null);


    public Rectangle getColumnBounds(int col) {
    /**
        int iterItem = fromItem;
     */





            bounds,
        if (columnHeadersVisible) {
        if (!hScroll.getVisible()) {
    /**
    }
                    event.y = e.y;
    }
     * The minimum width of a column header.
        int lastVisibleIndex = getBottomIndex();
     * It returns a {@link RowRange} that contains information
                        newSelection = impliedFocusItem;
     * operation when unnecessary.
            showColumn(scrollTo);
    private int bottomIndex = -1;
                        newSelection = getItemCount() - 1;
                            intentItem = getTopIndex() + 1;
     *
                        dragging = true;
            if (rowHeaderVisible) {
        this.scrollValuesObsolete = true;
     *
        } else {

            hoverChange = true;
                            columnBounds.y);
                }
                                break;
            x, 
                    if (column.isPinned()) continue;


                            if (text.length() > 0) text.append("\n");

        }
            if (cols.x != fromIndex || cols.y != toIndex) {
        }
     * <p/>
            && (x + col.getWidth()) <= (firstVisibleX + (clientArea.width - firstVisibleX))) {
        int x2 = 0;
                    for (int k = 0; k < columns.size(); k++) {
        public int getMaxLength() {
                redraw();
        }
     * Note that the item with this index is often only partly visible; maybe only
                hScroll.setValues(0, 0, 1, 1, 1, 1);

     */
        for (IGridRow row : gridRows) {
     * Returns an array of cells that are currently selected in the
                    drawEmptyCell(gc, x, y, column.getWidth(), itemHeight);

                            testPos.col = k;

        removeListener(SWT.Dispose, disposeListener);
            int startX = 0;

     * <p>
        }
    private int getVisibleGridHeight()
    }
        return lineColor;
        }
    public int getColumnIndex(int x, int y) {
        public int hashCode() {
            if (e.button == 1) {
            public void focusGained(FocusEvent e)
     */
            if (reverse) {
    private Event updateCellSelection(
                continue;
                        } else {
                    }
    {

                            	columnBeingFiltered = column;
            if (rowHeaderVisible)
            int row = getRow(point);
    private Color lineSelectedColor;
            @Override
        Map<Object, Integer> oldWidths = null;
                    if (getRowState(gridRow) != IGridContentProvider.ElementState.NONE) {
     * during its notify method (InternalWidget.HOVER) and the table pulls it
            @Override
     * @return selection event that will need to be fired or null.
     * when the drag is complete.
        if (availableHeight <= 0) {
        GridColumn overThis = null;
    {
                        for (Integer row : rows) {
            RowRange range = getRowRange(getTopIndex(), availableHeight, false, false);
            }
                break;
    @Override

                        focusColumn = col;
     * indices are ignored.
     *
                    clientArea.width);
        }
                        if (!GridRowRenderer.isOverExpander(e.x, gridRow.getLevel()))


     *
        }
    /**
    /**
                }


            }
            if (descending) {
    ///////////////////////////////////

            }
            if (!hoveringOnLink) {
            }
            height + 1);
 * DBeaver - Universal Database Manager
        collectRowsFromElements(rows, initialElements);
    private void handleHoverOnRowHeader(int x, int y) {
                // search first visible item

    {
            }
        if (background != null) {
            }
     */

                break;
            if (!isSingleCellPaint) {
    }
        source.setTransfer(GridColumnTransfer.INSTANCE, TextTransfer.getInstance());
            x += rowHeaderWidth;
    private void updateSelectionCache()
            private boolean isDropSupported(DropTargetEvent event)
            showColumn(col);
                    final int size = provider.getCollectionSize(column, gridRow);
    private void onFocusIn() {
            selectionEvent.stateMask = e.stateMask;
        updateSelectionCache();
                                curColumn.setWidth(newFatWidth);
            vScroll = new NullScrollBar();
            selection = pixels;

     *

                    if (cellDragCTRL) {
            int itemCount = getItemCount();
    protected void toggleCellValue(IGridColumn column, IGridRow row) {
    public int getRow(Point point)
             * More than that, the context menu will be opened even if some additional buttons are pressed.
                overExpander = GridRowRenderer.isOverExpander(x, getRow(row).getLevel());
                        columnBounds = new Rectangle(0, rowFromTop * getItemHeight(), getRowHeaderWidth(), getItemHeight());

            for (int i = 0; i < selection && i < columns.size(); i++) {
     * of visible grid items within the range.
        addListener(SWT.DefaultSelection, new TypedListener(listener));
                redraw();
        updateSelectionCache();
        // scroller

                if (col != null) {
                            }

                    }
     */
        }
        // Item height
    {
            vScroll.handleMouseWheel(e);


    /**

    }
            case SWT.ARROW_RIGHT:


        }
                }
                        getCells(row, focusItem, cells);
                focusColumn = column;


    @Nullable
        checkWidget();

                            int curColumnWidthPercent = (int)((curColumn.getWidth() / (double)  clientWidth) * 100);
                    i++;
            GridColumn currentColumn = focusColumn;

                            x2 += column.getWidth();

     * <p/>

        }
     */

            return;


                    }
            handleHoverOnColumnHeader(x, y);
        final IGridRow object = getRow(row);
    public Color getBackground()
        selectAllCellsInternal(0);
        int y = 0;
        if (cellDragSelectionOccurring || cellRowDragSelectionOccurring || cellColumnDragSelectionOccurring) {

        addListener(SWT.Resize, e -> onResize());
            x + width - 1,
        setDefaultBackground(gc);

                        boolean decreasing = (indexOf(iterCol) > indexOf(focusColumn));
                    hiddenArea + clientArea.width - 1,
                            if (indexOf(currentColumn) > indexOf(endColumn))
                    event.doit = false;
    }
                int ctrlFlag = (cellDragCTRL ? SWT.MOD1 : SWT.NONE);
                } else */
                paintColumnHeader(gc, x, column);
    }
//            try {
        // correct client
        // Show tooltip only if it's larger than column width
        }

                            if (iterCol == focusColumn) {
                    cellDragCTRL = ((e.stateMask & SWT.MOD1) != 0);
    private static final int HORZ_SCROLL_INCREMENT = 12;
            } else {
     *
    private void onPaint(@NotNull PaintEvent e) {
        } else if (!redrawCells.isEmpty()) {
                    if (cellDragCTRL) {
            focusItem = row;
     * user is drag selecting multiple cells.  A follow up selection event will be generated
            y += headerHeight;
     * item indexes respectively.
        if (focusColumn == null) {
                        return;
        if (headerHeight <= 0) {
                }
        @Override
     * @param style user specified style.
            return toolTip;
        return selectedCells.contains(cell);
     * <p/>
            bottomIndexShownCompletely = range.height <= visibleGridHeight;
    public GridCell posToCell(GridPos pos)
        topIndex = -1;
     * Tracks whether the scroll values are correct. If not they will be
        }
        }
        } else if (overIcon != hoveringOnColumnIcon) {
                }
    /**
     * selection is visible.
        checkWidget();
        return e;

     */
        if (focusColumn != null && focusItem >= 0) {
*/
        // this will allow the computations further down to accommodate the
     * @return the index of the bottom item
            {
        controlWasHidden = getClientArea().height == 0;
    /**
        vScroll.setSelection(index);
     * @param reverseDuplicateSelections true if the user is reversing selection rather than adding to.




            | SWT.SINGLE | SWT.MULTI | SWT.NO_FOCUS | SWT.CHECK | SWT.VIRTUAL;
        final Rectangle cellBounds = new Rectangle(0, 0, 0, 0);
        if (pinnedColumnsWidth > 0 && point.x <= pinnedColumnsWidth + rowHeaderWidth) {
                        selectedCellsBeforeRangeSelect.clear();
            (row == lastVisibleIndex && bottomIndexShownCompletely);
        checkWidget();
            } else if (rowHeaderVisible && x <= rowHeaderWidth && columnHeadersVisible && y <= headerHeight) {
                } else {

                        if (x >= x2 && x <= x2 + column.getWidth()) {
    }
            int rowIndex = getRow(point);
    }
    }
                handleColumnResizerDragging(e.x);
     */
                            if(column.isOverFilterButton(x - x2, y)) {
    @Nullable
                }
     * Selects the given cells.  Invalid cells are ignored.
        int row = getTopIndex();

    }
                    if (point.y >= parentLoc.y && point.y <= parentLoc.y + parent.getHeaderHeight(false, false)) {
     * Default height of items.
    private List<GridPos> getAllCells()
                    // Alt pressed - deselect all cells selected in other rows (#6613)
        for (GridColumn col : selectedColumns) {
                    // row header is actually painted later
        if (endIndex == -1) {
            {
        checkWidget();
            x + width - 1,
                                    getCellValue(column, getRow(row), true);
        final int hScrollSelectionInPixels = getHScrollSelectionInPixels();
            for (GridColumn column : columns) {
            return;
     */
     */
            hoveringOnColumnSorter = overSorter;
        if (clientArea.width == 0) {

                // Here we going to maximize single column to entire grid's width
                }


        return new GridPos(colIndex, rowIndex);
                            cellBounds.y = y;
     * in the given range was already selected, it remains selected. Indices
                }
//        }
            return new GridPos(indexOf(column), item);
    private static class RowRange {
                showItem(row);

 * See the License for the specific language governing permissions and
        return IGridContentProvider.ElementState.NONE;
    {
    }

    private Listener disposeListener;
        if (column == null || column.getGrid() != this) {
     */
            this.size = size;
     *
            ArrayUtils.reverse(statusColumns);
     * cell exists. The point is in the coordinate system of the receiver.
    }
        if (!getColumnScrolling()) {



     * Selects all cells in the receiver.
    /**
                            testPos.row = row;
        boolean hoverChange = false;
                }
        final Rectangle clientArea = getClientArea();
            notifyListeners(SWT.Selection, selectionEvent);
                }
        return cellRenderer;
     * This method can be used to build a range of grid rows
                    xPos -= iconBounds.width;
        }

    private int focusItem = -1;
                    }
                resizingColumn = true;
        for (GridColumn column : topColumns) {
                        getCells(row, cells);
        boolean ctrlPressed = CommonUtils.isBitSet(e.stateMask, SWT.MOD1);
        int row = getRow(point);
    public boolean isHoveringOnLink() {

        if (point.x < 0 || point.x > clientArea.width) return -1;
            }
    public void select(int start, int end)
                                intentItem = 0;
            SWT.error(SWT.ERROR_NULL_ARGUMENT);
            if (range.height >= availableHeight)
     *
        }
        private final Map<IGridColumn, CellExpandState> columns = new HashMap<>();

                if (CommonUtils.isEmpty(newTip)) {
        public boolean isAnyColumnExpanded() {
        italicFont = UIUtils.modifyFont(normalFont, SWT.ITALIC);
                if (!isDropSupported(event)) {

            rowHeaderWidth = newRowHeaderWidth;
     * <p/>

            for (Object columnElement : columnElements) {
                }
                draggingRow = null;
        return -1;
        if (scrollValuesObsolete)
     * <p/>
                gc.dispose();
    @Nullable
     * groups, the returned value includes the height of group headers.
     * to the specified height and items created afterwards will be
                            columnBounds.x,
    {
        if (listener == null) {
            cellDragSelectionOccurring = false;
    private GridColumn focusColumn;
            x + width - 1,
     * This occurs when the programmer uses the table like a list, adding items
                            }
        return gridRows.length;
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (((getItemHeight() + 1) * range.rows - 1) + 1 < availableHeight) {

            if (column != null && rowIndex >= 0) {
                int temp = currentItem;
            }
        redraw();
                int gridWidth = getCurrentOrLastClientArea().width - getRowHeaderWidth() - getHScrollSelectionInPixels() - getVerticalBar().getSize().x;
            return;
            }
            }
                boolean cellInRowSelected = selectedRows.containsKey(row);
        return focusColumn == null ? null : focusColumn.getElement();
    /**
        UIUtils.dispose(italicFont);
        return gridRows[focusItem];
                        Integer newWidth = oldWidths.get(column.getElement());
                            currentColumn = columns.get(index);
    public void updateScrollbars()
                x += pinnedColumnsWidth;
        }

        source.addDragListener (new DragSourceListener() {
     * Returns the x position of the given column. Takes into account scroll
            if (shiftSelectionAnchorColumn != null) {
     * Removes the listener from the collection of listeners who will be
            // necessary
                    if (isListening(SWT.DefaultSelection)) {
        /**
            column);
        updateScrollbars();
    {
     * @return previous visible column or null
                }
        Rectangle clientArea = getClientArea();
            }
                    selectionEvent = updateCellSelection(newSelected, ctrlFlag, dragging, false, EventSource.MOUSE);
                //newColumnFocus = focusColumn;

    }
            SWT.error(SWT.ERROR_INVALID_ARGUMENT);
        }
        if (count > 0) {
            gc.setBackground(background);
    private List<GridPos> getCells(int row)
            case NORMAL -> normalFont;
                    selectionEvent = new Event();
                return;
                if (!firstLoop) {
            public void dragEnter(DropTargetEvent event)
     */
                newColumnFocus = impliedFocusColumn;
        checkWidget();
        }
            }
        }
        boolean shiftPressed = CommonUtils.isBitSet(e.stateMask, SWT.MOD2);
     * Constructs a new instance of this class given its parent and a style
            return;
                boolean firstLoop2 = true;
    /**

    // Indicates that last time refreshData was called grid control was hidden (had zero size)
            }
        if (otherIndex >= getItemCount()) otherIndex = getItemCount() - 1;
            Point point = new Point(e.x, e.y);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    y += getItemHeight() + 1;
        if (focusItem < 0 || focusItem >= gridRows.length) {
                break;
            return -1;
     * OS's paint event merging to assure that we don't perform this expensive
                if (oldWidths.size() == columns.size()) {

            int stateMask,
            if (rowHeaderVisible) {

        }
            }

            if (!columnScrolling) {
                focusColumn = newColumnFocus;
        this.rowHeaderVisible = show;
    private Cursor sortCursor;
    /**
                        }
        int availableHeight = clientArea.height - y;
        }
            y2 += currItemHeight + 1;
    {
                    }

            //redraw();
    private final List<GridColumn> topColumns = new ArrayList<>();

            public void dragOperationChanged(DropTargetEvent event)
        } else if (getVisibleGridHeight() < 1) {
     * @param height default height in pixels
                            }

        columns.clear();
        if (index == -1) {
            return;
     * @param y mouse y
    public Font getFont(@NotNull UIElementFontStyle style) {
        int itemCount = getItemCount();
            topIndex = vScroll.getSelection();

            }
                        columnBounds = hoveringColumn.getBounds();
     * all cells are deselected.

    }
                    if (redrawColumn == null || redrawColumn == column) {
            }


            }
            selectionType = SWT.MULTI;
                            status.append("\n");
     */
                }
import org.jkiss.dbeaver.ui.editors.data.internal.DataEditorsMessages;
                if (!shift) {
            selectionEvent.button = e.button;
        cellSelectedOnLastMouseDown = false;
            selectionEvent.x = e.x;
                for (GridPos newCell : newCells) {
                    onPaint(pe);
     * hoverDetail by talking to the cell renderers. Triggers a redraw if
 *     http://www.apache.org/licenses/LICENSE-2.0
 * LightGrid
        redraw();
    public void setHeaderVisible(boolean show)
     * Returns the number of items contained in the receiver.
        Point dragPoint = getDisplay().map(null, LightGrid.this, new Point(x, y));
        // Special code to reflect mouse wheel events if using an external
    {
        int y;
                resizingStartX = e.x;
     * @param dragging                   true if the user is dragging.

    /**

            }
        return true;
        if (fromItem > toItem) {
            public void mouseDoubleClick(MouseEvent e)

        }
        int itemCount = getItemCount();
            }
                selectCells(getCells(j));
        if ((e.stateMask & SWT.BUTTON1) == 0) {
    }
            return true;
        if (pinnedColumnsWidth > 0) {
            }
     *
     * Inserts a new column into the table.
     *
        } else if (!overExpander && hoveringOnRowExpander) {
                                 boolean forceEndCompletelyInside, boolean inverse)
            state.expanded = !state.expanded;

        if (indices == null) {
            }
        Point p = new Point(point.x, point.y);
        }

        }
            return null;

            if (selEvent != null) {
        }
     * @return the index of the column
                    redrawCells.add(new RedrawCell(redrawRow, redrawColumn));


            newWidth = MIN_COLUMN_HEADER_WIDTH;
            for (CellExpandState state : rowState.columns.values()) {
            /*

     * this method is called, all existing items are resized
                break;
     * that is allowed to span a certain height in pixels.
                // this is related to bug with wayland handling of force focus, which led to editors
                            rows = Collections.singleton(draggingRow);
    public IGridScrollBar getVerticalScrollBarProxy()
        if (selectionEvent != null) {
                break;
     */
                // if possible, remember selection,
                // row header is actually painted later

    private boolean rowHeaderVisible = false;
                    }
                    oldWidths.put(column.getElement(), column.getWidth());
        }
        return new Point(x, y);
        }
     * Returns the previous visible column in the table.
    }
     * @return range of grid rows
     * <p/>
        List<IGridRow> result,
     */
        for (int i = 0; i < visibleRows; i++) {
     * Selects the given cell.  Invalid cells are ignored.
        for (int j : indices) {
    private Point getRowSelectionRange(GridColumn fromColumn, GridColumn toColumn)
     */
                for (GridColumn curColumn : topColumns) {
                            elements.add(draggingColumn.getElement());
        redraw();
            if (hoveringOnColumnSorter) {
        bottomIndex = -1;
    }
    private int maxColumnDepth = 0;
                x2 += rowHeaderWidth;

                            if (CommonUtils.isEmpty(curColumn.getChildren()) && curColumnWidthPercent > maxColumnDefWidth) {
     */
        bottomIndex = -1;
    {

     *
     *
//        GridPos focusPos = getFocusPos();
    private boolean resizingColumn = false;
                    String statusText = gsc.getStatusText();
     *

            gc.drawLine(rowHeaderWidth + pinnedColumnsWidth, 0, rowHeaderWidth + pinnedColumnsWidth, y);

                    if (getItemCount() > 0) {
        this.displayedToolTipText = null;
        if (getContentProvider().isElementExpandable(row)) {
                recalculateSizes(true);
                        }

        }
        headerHeight = colHeaderHeight;

        return column == null ? -1 : column.getIndex();
        return overThis;
                }
     *
                }
            boolean dragging,
    public void scrollHorizontally(int count) {
                    leftColumn = column;
        }
            if (preferredSize.y > clientArea.height) {
    private final Map<RowLocation, RowExpandState> expandedRows = new HashMap<>();
                    showColumn(intentColumn);

            } else {
            {
    }
            }
     * Deselects all selected items in the receiver.  If cell selection is enabled,
            @Override
                }
    /**
            hoveringOnRowHeader = false;
                    event.detail = DND.DROP_NONE;

                        int sel = indexOf(currentScrollTo);
                }
                if (statusIcon != null) {
    /**
            boolean hasChildColumns = false, hasPinnedColumns = false;
     */
        boolean expanded;
     *

                row++;
                clientArea.x += column.getWidth();
            col = getColumn(point);
        topIndex = -1;
                    (o1.getPinIndex() - o2.getPinIndex()) : (o1.isPinned() ? -1 : 1);
            case '+':


                    // Trigger selection event always!

        }
                toolTipHandler.updateToolTipText(null);
        return focusCell;
                    for (int k = 0; k < getItemCount(); k++) {
            // Save widths
                                cellBounds,


        int y = 0;
     * listeners.
    public void removeSelectionListener(SelectionListener listener)
            int temp = fromItem;
                        }
        }
            } else {
                    newTip = DataEditorsMessages.pref_page_database_resultsets_label_show_attr_filters;

    private final GridColumnRenderer columnHeaderRenderer;

                if (cellDragSelectionOccurring && handleCellHover(e.x, e.y)) {
                        }
            }

        final int row = getRow(point);
            return new String[] { TYPE_NAME };
                        Set<Integer> rows = selectedRows.keySet();

    }
        if (savedHSB >= 0) {
        }

                GridColumn column = new GridColumn(this, columnElement);
            if (!hoveringOnHeader && !hoveringOnRowHeader &&
        }
                            gc.setClipping(cellBounds);

     * Returns the column at the given point and a known item in the receiver or null if no such
    {

                    }

    }
     * @return the index of the top item
                        location = IGridController.DropLocation.DROP_BEFORE;
                        location = IGridController.DropLocation.DROP_AFTER;
                }
                    if (getContentProvider().hasChildren(gridRow)) {

     * Returns the zero-relative index of the item which is currently at the bottom
                x = 0;
            // scrollbars
            focusItem = 0;
        GC sizingGC = new GC(this);
            IGridRow nestedRow = new GridRowNested(parentRow, position++, i, level, element);
            }
     *
    @NotNull
                    }
            for (GridColumn column : columns) {
            if (cell.row >= 0) {
                return clientArea;
    public void removeAll()
        updateSelectionCache();
     *
            if (row >= 0) {
            int x = 0;
            }
            width - 1,

        }
                onMouseUp(e);

        if (hoveringItem != row || !CommonUtils.equalObjects(hoveringDetail, detail) || hoveringColumn != col || y <= headerHeight) {

 */
                return;
    }
     * the event.
     */
        if (RuntimeUtils.isMacOS() && (stateMask & SWT.CTRL) == SWT.CTRL) {
                    GridColumn col = columns.get(i);
                    for (GridColumn col : selectedColumns) {

    private void paintHeader(@NotNull GC gc)
    }
    }
            oldWidths = new HashMap<>();

     * Scrollbar selection event handler.
        if (newSelection < 0) {
         */
                selEvent.keyCode = e.keyCode;
        }

            @Override
                        }
    }
     * @see LightGrid#deselectAll()
                            } finally {

        redraw();
                    cellRowSelectedOnLastMouseDown = (getCellSelectionCount() > 0);
                        event.data = elements;
        }
        /**
    public Object getFocusColumnElement() {
            ctrl = false;
            // special case: empty range
    @Nullable
        if ((getStyle() & SWT.NO_FOCUS) != SWT.NO_FOCUS) {

        } else {
        if (rowHeaderVisible) {
                int topIndex = getTopIndex();
     */


        if (selectedCells.isEmpty())
            default:
        if(hoveringOnColumnFilter) {
                } while (currentColumn != endColumn && currentColumn != null);

        if (!vScroll.getVisible()) {
                        }
            setCursor(sortCursor);
            currentColumn = getColumn(newRange.x);
            }

        // if its visible just return

     * <p/>
            if (lastClientArea == null) {
     * all cells are selected.
        if (cell.row < 0 || cell.row >= getItemCount()) {
    /**
                xPos -= GridColumnRenderer.SORT_WIDTH + GridColumnRenderer.IMAGE_SPACING;
                }

        }

    @Nullable
        setDefaultFocusRow();
                            intentColumn = columns.get(0);
        return y;
        }
        this.columnScrolling = columnScrolling;
                    if (dragDetect(e)) {
                GridColumn column = new GridColumn(parent, child);
                		&& x < x2 - GridColumnRenderer.ARROW_MARGIN 
            hoveringColumn = col;
        if (!shift && !ctrl) {
     * Searches the receiver's list starting at the first column (index 0) until
            public void dragSetData (DragSourceEvent event) {
        // and therefore the grid has a child. The solution is to
        showItem(cell.row);
        int y;
            public void dragStart(DragSourceEvent event) {
            }
    }
            if (cellRenderer.isOverLink(col, row, x, y)) {
            @Override
            }
    /**
    /**
                if (column.getParent() == null) {
            }
                        column = parent;
    {
    private Color lineColor;
        Object[] initialElements = getContentProvider().getElements(false);


            for (Object child : children) {
        if (focusColumn != null)

    {
                redraw();


        focusItem = item;
                Arrays.equals(this.location, ((RowLocation)obj).location);

    }
            y + height - 1,
     * a tree node in the cell. The table does nothing with this string except
                return -1;
     * @return cell in focus or {@code null}. x represents the column and y the row the cell is in
        sizingGC.setFont(font);
        } else {
                x + width - GridColumnRenderer.ARROW_MARGIN - GridColumnRenderer.SORT_WIDTH,
            }
            if (getItemCount() > 0) {
            this.deselectAll();
     *
        lineSelectedColor = JFaceColors.getErrorBorder(display);//SWT.COLOR_WIDGET_DARK_SHADOW;

            }
        }
     * @param parent a composite control which will be the parent of the new
        cellRenderer = new GridCellRenderer(this);
        }
     * but never creating a column.
            selectionEvent.x = e.x;
        range.startIndex = !inverse ? startIndex : otherIndex;
            hoveringOnHeaderDragArea = true;
                selectedCells.clear();
            e.doit = false;
        itemHeight = height;
        gc.fillRectangle(

        // Turn the scrollbars on if necessary and do it all over again if
                selectionEvent.data = new GridCell(column, gridRows[rowIndex]);
 *
                int redrawRow = getRow(point);
            // if selection is too large, just make it the max you can
    private void onMouseDown(MouseEvent e)
        boolean overSorter = false, overResizer = false, overFilter = false;
            selectCells(getCells(j));
        if (topOffset >= 0) {
    {
        }
        };

    /**
        }
                hScroll.setVisible(true);

                    getCells(intentItem, focusItem, cells);
            return;
     * is more than one item in the given range, then all indices are ignored.

    {
                if (column != null && rowIndex >= 0) {
                                gc.setClipping((Rectangle) null);
    public abstract IGridContentProvider getContentProvider();
            // Add columns
            } else {
            }
            focusItem = getTopIndex();
        }
                cells.add(new GridPos(colIndex, i));
            GridPos newCell = newCells.get(0); //shift selection should only occur with one cell, ignoring others
                    return;
                if (x < clientArea.width && !isSingleCellPaint) {
                    clientArea.width,
            x = focusColumn.getIndex();
        x -= getHScrollSelectionInPixels();
    public GridCellRenderer getCellRenderer() {
        {
                handleDragEvent(event);

        return rowState != null && rowState.isAllColumnsExpanded();
        if (newRowHeaderWidth > MAX_ROW_HEADER_WIDTH) {
     * Height of each column header.
        focusItem = -1;
    }
            while (currIndex != item) {
                }
                    UIUtils.dispose(dragImage);
                            newColumnFocus = columns.get(index);
            @Override
        return selectedRows.size();
     * @param end   the end of the range
                    se.data = new GridCell(column, gridRows[rowIndex]);
        }
        event.type = SWT.None;
            toolTip = toolTip.substring(0, MAX_TOOLTIP_LENGTH) + "...";

    }
        Color foreground = labelProvider.getForeground(null);
import java.util.List;
        } else {
                GridColumn column = iter.next();

    /**
        }
    {

            getVerticalBar().addListener(SWT.Selection, e -> onScrollSelection());
        redraw();
    }
        recalculateSizes(false);

     * *exactly* over the resizer.

        boolean hover = hoveringOnHeader && hoveringColumn == column;
     * Returns true if the given cell's x and y values are valid column and
    {
                            if (x2 >= (x - COLUMN_RESIZER_THRESHOLD) && x2 <= (x + COLUMN_RESIZER_THRESHOLD)) {
                        if (GridRowRenderer.isOverExpander(e.x, gridRow.getLevel()))
    }
                return;
        checkWidget();
        }
            if (iterItem == startRow) break;
                            currentColumn = null;
        final GridPos testPos = new GridPos(-1, -1);
    /**
    private void onScrollSelection()
            }
            return "";
                newTip = status.toString();
            ) {
    @Nullable
import org.jkiss.dbeaver.ui.UIElementFontStyle;
                            cellBounds.y = y;
        }
            public void dropAccept(DropTargetEvent event)
            // - so add another row if it need not be completely within availableHeight
     * selecting the given cell.
            if ((focusColumn == null) || (focusItem < 0)) {
        // if its visible just return
                }

            //if (e.stateMask != SWT.MOD1) {
     * @return an array representing the cell selection
            }
        Rectangle clientArea = getClientArea();
        if (vScroll.getVisible()) {
        gc.drawLine(
            bottomIndex = getTopIndex();
    private RowRange getRowRange(int startIndex, int endIndex)
                    y -= getItemHeight() + 1;

     */
                if (impliedFocusItem >= 0) {
            }
        for (GridColumn colIter : columns) {

        if (scrollValuesObsolete) {
     * This is the tooltip text currently used.  This could be the tooltip text for the currently

    /**

            if (x > clientArea.width)
            return Collections.emptyList();
    static class RowExpandState {
                            newColumnFocus = impliedFocusColumn;
    }
            x,
            }
    }
        focusCell.row = focusItem;
        return hoverChange;


    public int getItemCount()
            if (rowHeaderVisible) {
        return hoverChanged;
    @Nullable
            if (i > getItemCount() - 1) {
     * for showing the grid's rows, i.e. the client area of the

        gridRows = new IGridRow[0];
            paintColumnsHeader(gc, column, x, y, columnHeight, 0);
        if (getVisibleGridHeight() < 1) {
                    }

            }
    public void selectAllCells()
            RowRange range = getRowRange(newTopIndex, getVisibleGridHeight(), true, true);    // note: inverse==true

                if (provider.hasChildren(gridRow) || provider.hasChildren(column)) {
        }
            }

    {
            index = collectNestedRows(result, row, index, 1);

    public void setForeground(Color color) {
        return selectedRows.containsKey(row);
                        selectedCellsBeforeRangeSelect.addAll(selectedCells);
                continue;
                        }
                    if (!altPressed) {
    private boolean handleHovering(int x, int y)
            parentNodes = ArrayUtils.insertArea(GridNode.class, parentNodes, row + 1, parents.toArray());
            // No need to redraw - it is done in showItem
            return getColumnWithOffset(point, x2, true);
                if (lastDragEndTime > 0 && System.currentTimeMillis() - lastDragEndTime < 100) {
    {
                                elements.add(getRowElement(row));
     * column exists. The point is in the coordinate system of the receiver.
            }
            }

                break;
        topIndex = -1;



        if (newWidth == columnBeingResized.getWidth()) {
    private volatile static Rectangle lastClientArea;
     * updated when appropriate.  #getBottomIndex() should be called for every client (even internal
     *

                    // It makes sense if grid content was changed but selection remains the same

     */
     * @return true if the table is scrolled horizontally by column
                        GridColumn pc = columns.get(k);
            return null;
            return new Rectangle(-1000, -1000, 0, 0);
                    if (y >= headerHeight && !isSingleCellPaint) {
        this.lineColor = lineColor;
        this.columnHeadersVisible = show;
        if (rowHeaderVisible) {
        //These two variables are used because the key navigation when the shift key is down is
                            }
                selectedCells.addAll(selectedCellsBeforeRangeSelect);
    }

            } else {
            }
            return position;
    }
                        } finally {
    private GridColumn columnBeingFiltered;

        List<GridPos> oldSelection = null;
            handleHoverOnColumnHeader(e.x, e.y);
                }
     *               instance (cannot be null)
        int newSelection = -1;
    }
        }
     * this method simply returns. Otherwise, the items are scrolled until the
        }

                    x -= clientArea.width - firstVisibleX - col.getWidth();
     * Selects the item at the given zero-relative index in the receiver. The
                    return true;
                            }
                    }
     * @param end   the end index of the items to select
        range.endIndex = !inverse ? otherIndex : startIndex;
                impliedFocusItem = shiftSelectionAnchorItem;
                columnBeingSorted = null;
     * @param e paint event

     * recomputed in onPaint. This allows us to get a free ride on top of the
            }
                paintColumnsHeader(gc, child, childX, y + columnHeight, columnHeight, level);
        }

                    }
    protected IGridRow[] gridRows = new IGridRow[0];

    /**
        int sortOrder = getContentProvider().getSortOrder(null);
            if (sortOrder != SWT.NONE) {
                                hoveringItem == row && hoveringColumn == column,
        return columns.get(col).getElement();
            } else if (e.button == 1 || (e.button == 3 && col != null && !isSelectedCell)) {

/*
            //}
    }
 * @author serge@dbeaver.com
     * Also checks if mouse if hovering on a column sorter control.

    }
     * receiver is single-select and multiple indices are specified, then all
                se.x = e.x;
        return clientArea;
        selectedCells.clear();


        if (children != null) {
     * Determines if the mouse is hovering on a column resizer and changes the
    public void showColumn(int column)
                continue;
        checkWidget();
     * the grid item at startIndex to that at endIndex.
        if (backgroundColor == null) {
            x += rowHeaderWidth;
                    if (prevCol == null || prevCol.getWidth() > availableWidth) {
        }
            }
        addListener(SWT.Selection, new TypedListener(listener));
                selectedCells.clear();
        this.maxColumnDefWidth = maxColumnDefWidth;
    /**
     */
            GC sizingGC = new GC(this);

                                gridRows[row]
                paintHeader(gc);
                        gc.setClipping(cellBounds);
            cellColumnDragSelectionOccurring = false;
        return getVisibleGridHeight(clientArea);
        if (!hoveringOnHeader && rowHeaderVisible) {
            for (CellExpandState state : columns.values()) {
            for (int i = 0; i < columns.size(); i++) {
                            rowHeaderRenderer.paint(
        if (row < 0 || row >= gridRows.length) {
        if (e.button == 1) {

                if (x > getRowHeaderWidth()) {
                vScroll.setValues(0, 0, 1, 1, 1, 1);
    }
     * are out of range are ignored.
                            cellBounds.width = width;
            }
        if (point == null) {
                break;
        }
        if (col != null && row >= 0) {

        selectedCells.clear();

     * hovered cell, or the general grid tooltip.  See handleCellHover.
                    event.stateMask = e.stateMask;
    }
                int rowIndex = getRow(point);
                notifyListeners(Event_NavigateLink, event);
    public Object getFocusRowElement() {
            if (newWidth > maxWidth)
            if (e.button == 1) {
        for (GridPos pos : selectedCells) {
                            int newFatWidth = (freeSpacePercent > maxColumnDefWidth ? freeSpace : (int) ((double) maxColumnDefWidth / 100 * clientWidth));

        List<IGridColumn> selection = new ArrayList<>();
        int y2 = 0;
        selectedCells.removeIf(pos -> pos.row > row);
            position = collectNestedRows(result, nestedRow, position, level + 1);
     * Note that the item with this index is often only partly visible; maybe only
     * Therefore, the items at 'startIndex' and 'endIndex'

        }
                                GridColumn column = columns.get(i);

            } while (currentItem != endItem);
     *
            for (CellExpandState state : columns.values()) {
     * if start is greater than end. If the receiver is single-select and there
            }
            }
    private GridColumn draggingColumn;

            drawTopLeftCell(gc, 0, 0, rowHeaderWidth, headerHeight);
    private void onMouseMove(MouseEvent e) {
            int selection = Math.min(vScroll.getSelection(), max);
        addFocusListener(new FocusListener() {
                		&& x > x2 - GridColumnRenderer.SORT_WIDTH - GridColumnRenderer.ARROW_MARGIN 
                onMouseExit(e);
                }
    private boolean hoveringOnRowExpander = false;
                    int intentItem = hoveringItem;
     * Selects the items in the range specified by the given zero-relative
                for (int k = 0, columnsSize = columns.size(); k < columnsSize; k++) {
        }
            }

    }
                SWT.error(SWT.ERROR_INVALID_ARGUMENT);
    public int getColumnCount()
            public void focusLost(FocusEvent e)
                    newSelection = range.startIndex;
            int oldHoverRow = hoveringItem;
                    break;
                        } else {
        //if populated will be fired at end of method.

                {
    public void setDefaultFocusRow() {
        getContentProvider().resetColors();

    {
            {
    }

    {


        } else if (x <= rowHeaderWidth) {
     * Returns current or last client area.
                for (GridColumn column : columns) {
     * Returns true if the lines are visible.
    /**
        focusCell.col = x;
     * @param endIndex   index of the last item in the range or -1 to use the last visible item in this grid
                if (!fitValue) {
        Point point = new Point(x, y);
    Font boldFont;
        }
    {
            }
            // get the clientArea again with the now visible/invisible
                }
     */


                    return false;
            return null;
                x += pinnedColumnsWidth;
                                getCells(prev, newSelected);
        EventSource eventSource)
                    gc.dispose();
    public boolean isRowSelected(int row) {



        }
     * renderer determines what the hover detail means and how it affects
                while (st.hasMoreTokens()) {
        return x;
                int index = this.location.length - 1;
                for (int i = 0; i < columns.size(); i++) {
    private final Set<GridPos> selectedCells = new TreeSet<>(new GridPos.PosComparator());
    public IGridColumn getFocusColumn() {
            int pixels = 0;
            }

            result.add(nestedRow);

     * @param stateMask                  state mask during preceeding mouse or key event.
        if ((style & SWT.MULTI) != 0) {
        return position;
                break;
                        {

            bottomIndex = 0;

     */
    private boolean columnHeadersVisible = false;
        if (gridColumn == null) {
        
                        cellBounds.y = y;
    public IGridRow getRow(int row) {
    public int getRowSelectionSize() {
     * Returns the hscroll selection in pixels. This method abstracts away the
                }
                    //showColumn(col);
                }
        redraw(clientArea.x, clientArea.y, clientArea.width, clientArea.height, false);
    }
        if (isShown(item)) {
         * index of last item in range
            if (savedFocus.isValid()) selectCell(savedFocus);
                GridColumn overColumn = getOverColumn(event);
     * Adds the listener to the collection of listeners who will be notified

         */
            e.detail = SWT.DRAG;
                        headerColumnDragStarted = true;
        if (pos.col >= columns.size() || pos.row >= gridRows.length) {
                    newSelection = getPreviousVisibleItem(impliedFocusItem);
            return size;
    /**
     *
    private int getRowHeaderWidth()
     * Are the grid lines visible?
    private boolean addToCellSelection(GridPos newCell)
        UIUtils.dispose(commentFont);
            {
                handleDragEvent(event);
        } else {
            {
                    lineNumber++;
        if (index <= 0)
            SWT.error(SWT.ERROR_INVALID_ARGUMENT);
        int rowIndex = ArrayUtils.indexOf(gridRows, cell.row);
                    x += width;
            y = startY;

        return updateCellSelection(Collections.singletonList(newCell), stateMask, dragging, reverseDuplicateSelections, eventSource);
     */
        deselectAll();
    public int getTopIndex()
}
            for (GridPos newCell : newCells) {

            }

        bottomIndex = -1;
            return -1;
        }
            int row = getRow(new Point(x, y));
        if (eventSource == EventSource.KEYBOARD) {
            if (column.isPinned() != pinned) {
            for (int k = 0; k < columnCount; k++) {
            case SWT.KEYPAD_SUBTRACT:
        int colIndex = columns.indexOf(cell.col);
        }
        int redrawRow = -1;
        fontMetrics = sizingGC.getFontMetrics();
        return columns;

    /**
        /**
        }
     */
        boolean hoverChanged = handleCellHover(x, y);
                        newSelection = 0;
     */
        boolean firstTime = true;
     * position.
            y, 
     * Marks the receiver's header as visible if the argument is {@code true},
                    newSelection = range.endIndex;
    public Color getLineColor() {
        } else {
                    showItem(intentItem);
        selectedRows.clear();
                        break;
        if (overExpander && !hoveringOnRowExpander) {

        return index - 1;
    }
            index++;
    {
    }
     */

        }
            String newTip = null;
            prefSize.y += 2 * getBorderWidth();
    private final GridCellRenderer cellRenderer;

     * @param item the item to be shown
 * @author chris.gross@us.ibm.com
                break;
     */
                        if (e.y > headerHeight) {
        public static final GridColumnTransfer INSTANCE = new GridColumnTransfer();
                                currentColumn = null;
                            cellBounds.height = itemHeight;
         */
     */
            x -= getHScrollSelectionInPixels();
     * Sets the hovering variables (hoverItem,hoveringColumn) as well as
        GridColumn column = getColumn(dragPoint);
    private boolean hoveringOnHeaderDragArea = false;
    public int getSelectionIndex()
import org.jkiss.utils.CommonUtils;

     * value describing its behavior and appearance.
        GridNode node = rowNodes.get(gridRows[row]);
                    } else if (rowHeaderDragStarted && hoveringRow != null) {
        public int rows;
        if (getItemCount() == 0) {
    /**

        checkWidget();
            collectRows(result, parents, node, node.rows, node.level);

//                gc.dispose();
                    return false;
        public boolean equals(Object obj) {
                    Event event = new Event();
    private boolean hoveringOnHeader = false;
                    overSorter = true;
    {
                    }
        }

                    IGridController.DropLocation location;// = IGridController.DropLocation.SWAP;
     * @param reverseDuplicateSelections true if the user is reversing selection rather than adding to.
        }
     */
     * its selection, so modifying the array will not affect the receiver.

            if (getItemCount() == 0) {
                                elements.add(col.getElement());
     */
    }
            }
                            for (GridColumn col : selectedColumns) {
     */

     * @param point the point used to locate the item
                // Restore widths

     * <p/>
                    cellDragCTRL = ((e.stateMask & SWT.MOD1) != 0);
        public String toString() {
            vScroll.setValues(selection, 0, max, thumb, 1, thumb);
    static class RowLocation {
             */
            if (overResizer) {
                boolean shift = CommonUtils.isBitSet(e.stateMask, SWT.MOD2);

            }
        hoveringRow = null;
        int itemCount = getItemCount();
     * Sets the default height for this <code>Grid</code>'s items.  When
    public void setFocusItem(int item)
     * current selection is not cleared before the new items are selected.
                startIndex = 0;
     */
            }
        }
     * @param linesVisible Te linesVisible to set.
            }
            newEvent.data = new GridCell(focusColumn, gridRows[focusItem]);
                if (oldHoverColumn != null && oldHoverRow >= 0) {
        }
    public final static class GridColumnTransfer extends LocalObjectTransfer<List<Object>> {

     * Returns the cell at the given point in the receiver or null if no such
     * a column is found that is equal to the argument, and returns the index of
            toItem = temp;
                            hoveringOnHeader = true;

        //redraw();
     * @param col column to focus.


                                overSorter = true;
     * Manages the state of the scrollbars when new items are added or the
                break;
                    event.x = e.x;
                 return;
    public void setLineColor(@NotNull Color lineColor) {
                }
     * necessary.
            hoveringOnRowHeader = true;
    {
     * Refreshes the hover* variables according to the mouse location and

        if (refreshColumns) {



            x2 += rowHeaderWidth;
     * current state of the table. This is useful is some method call, caused
            if (column.isPinned()) {
        checkWidget();

            }

                            if (column.isOverIcon(x, y)) {
        int y = 0;
        if (rowHeaderVisible) {
     */
            hover,
                return getColumn(dragPoint);
    protected static final int Event_ChangeSort = 1000;
                    Rectangle columnBounds = overColumn.getBounds();
        return cells;
    }
        checkWidget();

                    gc.drawImage(statusImage, xPos, y + (height - iconBounds.height) / 2);
                    if (dragImage != null) {
        gc.drawLine(
                firstLoop = false;
            return;
                hScroll.setValues(

                return null;
     * @return x,y of top left corner of the cell
    /**
                if (!cellDragSelectionOccurring && cellSelectedOnLastMouseDown) {
        }
                if (impliedFocusItem >= 0) {
                }
            this.removeAll();
                    return;
     * at a given index was already selected, it remains selected. Indices that
                            intentItem = Math.min(getItemCount() - 1, getBottomIndex() + 1);
            GridColumn column = getColumn(point);
             *



            if (column2 == column) {
     */
        for (int i = 0, columnsSize = topColumns.size(); i < columnsSize; i++) {
                        notifyListeners(SWT.DefaultSelection, newEvent);
        return getColumnWithOffset(point, x2, false);

        if (children != null && children.length != childrenCount) {
        checkWidget();
        }
        switch (e.keyCode) {
     * @param point the point used to locate the column
    }
            for (Iterator<GridColumn> iter = columns.iterator(); iter.hasNext(); ) {
            }
            for (int i = 0; i < visibleRows; i++) {


    public int getItemHeight()
                continue;

        // visibility may be affected (more
    }
     * @return indexes of selected rows
        normalFont = font;
    {
                    }
        });
    {
     * @param newCell                    newly clicked, navigated to cell.
        return columns.get(index + 1);
            public void dragLeave(DropTargetEvent event)

            }
        UIUtils.dispose(boldFont);
        focusColumn = null;
                        dragImage = null;
        if (selectedColumns.isEmpty()) {
 * you may not use this file except in compliance with the License.
     * become out of date.
        checkWidget();
                startIndex = getItemCount() - 1;
    @NotNull
     * Horizontal scrolling increment, in pixels.

            return -1;
    }
            do {
            }
        redraw();
        for (IGridColumn col : columns) {
            x + width - 1,
    protected static final int Event_FilterColumn = 1002;
        }
    public int getHeaderHeight()
            @Override
            // Ctrl selection works only for mouse events
     * @return the column at the given point
    public void setLineSelectedColor(Color lineSelectedColor) {
        Rectangle clientArea = getClientArea();
     */
    public void selectCells(@NotNull Collection<GridPos> cells)
    private int getGridHeight()
            hoveringOnColumnResizer = overResizer;
        int itemHeight = getItemHeight();
        this.gridRows = rows.toArray(new IGridRow[0]);
            case SWT.ARROW_DOWN:
            gc.drawLine(rowHeaderWidth + pinnedColumnsWidth - 1, 0, rowHeaderWidth + pinnedColumnsWidth - 1, y);
                    x += column.getWidth();
     * Returns the height of the column headers. If this table has column
            IGridStatusColumn[] statusColumns = getContentProvider().getStatusColumns();
     * <p/>
        GridColumn redrawColumn = null;

            y,
                    } else if (TextTransfer.getInstance().isSupportedType(event.dataType)) {


            if (!shiftPressed) {
        int[] location;
                    if (dropPoint.x > columnBounds.x + columnBounds.width / 2) {
            y + height - 1);
                    if (tmpItem >= 0)
    {
    public LightGrid(Composite parent, int style)
                y + (height - GridColumnRenderer.SORT_HEIGHT) / 2,
    private final IntKeyMap<Boolean> selectedRows = new IntKeyMap<>();
        return Collections.unmodifiableCollection(selectedCells);
                    // paint pinned columns
    /**
                        }
    /**

    {
                    IGridRow gridRow = gridRows[row];
        redraw();

        return rowHeaderWidth;
        IGridRow gridRow = gridRows[row];
        }
    private boolean handleCellHover(int x, int y)
                }
                    }
    /**
                return gridRows[i];
        newStyle |= SWT.DOUBLE_BUFFERED;


        addDragAndDropSupport();

        private GridColumnTransfer() {
                }
    public int getCellSelectionSize() {
            redrawRow = redrawCell.row;
                setRedraw(false);
        Object[] children = getContentProvider().getChildren(parentRow);
        headerColumnDragStarted = false;

                width -= rowHeaderWidth;
    }
                this.location = new int[] { row.getRelativeIndex() };
        if (hoveringOnColumnResizer) {

        int x = 0;
            if (column.getElement() == element) {
    {
     * Filters out unnecessary styles, adds mandatory styles and generally
     * Returns selected rows indexes
                    gc.copyArea(
            cellRowDragSelectionOccurring = false;
            }


     */
        redraw();
                    dragImage = new Image(Display.getCurrent(), columnBounds.width, columnBounds.height);
    {
                newTip = getLabelProvider().getToolTipText(getRow(hoveringItem));
     * callers).  A value of -1 indicates that the value is old and will be recomputed.
        recalculateSizes(true);
        }
                gc.drawLine(x, startY + 1, x, startY + height);
     */
        selectedCells.clear();
            // Draw horizontal lines

                                overIcon = true;
        if (height < 1)
        } else if (e.button == 1 && rowHeaderVisible && e.x <= rowHeaderWidth && e.y < headerHeight) {
                onMouseDown(e);
            }
        return columns.size();
            if (hoveringOnHeaderDragArea && hoveringColumn != null) {
            return;
            } else {
                        }

    /**


                    }
        // Composite if one of its
     * @param x mouse x
    public void setSelection(int start, int end)
                    xPos -= 1;
            return false;
        final IGridContentProvider provider = getContentProvider();
     *
    public abstract IGridController getGridController();
     * a single line of pixels is visible. In extreme cases, bottomIndex may be the
     * Indices that are out of range are ignored and no items will be selected

        boolean ctrl = (stateMask & SWT.MOD1) == SWT.MOD1;
     * in mode.
    {
    /**
     * @return An Event object
                            }
                        StringBuilder text = new StringBuilder();




    @NotNull
    @Override
                while (hiddenArea > 0 && i < getColumnCount()) {
    /**

     * Returns the number of selected cells contained in the receiver.
                    event.data = columnBeingSorted == null ? null : columnBeingSorted.getElement();
     * So we cache it - all stack has the same client area

    private boolean headerColumnDragStarted, rowHeaderDragStarted;
        
        rowHeaderDragStarted = false;
     * Returns the next visible item in the table.
    private static final int MIN_ROW_HEADER_WIDTH = 40;
        return gridRows[focusItem].getElement();
     * column is visible.
                startX += rowHeaderWidth - 1;
                break;
    /**
            if (ttSize.y > gridHeight) {
    }
    private Point getSelectionRange(int fromItem, GridColumn fromColumn, int toItem, GridColumn toColumn)
     */
            private void moveColumns(DropTargetEvent event)
            }
     *
    private GridColumn hoveringColumn;

        return draggingColumn != null && !selectedColumns.contains(draggingColumn);


                    }
    @Override
     */

     *
     * @param availableHeight          height in pixels



        @Override
            }
            // not all available space used yet

//            return false;
     * range inclusive of all spanned columns.
    public void resetFocus() {
    String getCellText(Object cellValue) {
        });
                        int width = pc.getWidth();
     * Initialize all listeners.
                y += parent.getHeaderHeight(false, false);
        scrollValuesObsolete = true;
        final RowLocation gridPos = new RowLocation(row);
    }
            return null;

     */
        checkWidget();
     * @return Returns the linesVisible.
                    // get cell specific tooltip
            }
        GridPos cell = selectedCells.iterator().next();
            // get the item to draw
                    if (!column.isPinned()) break;
     * @see #setItemHeight(int)
        x = 0;

        Point origin = getOrigin(column, rowIndex);
                break;
                se.detail = SWT.DROP_DOWN;
            case SWT.PAGE_DOWN:
    public enum EventSource {
                    if (column.isPinned()) {
            if (leftColumn != null) {
            @Override
        range.height = (getItemHeight() + 1) * range.rows - 1;
            return;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        }
    }
                        if (selectedColumns.size() > 1 && !isDragSingleColumn()) {
        initListeners();
        for (int j : indices) {

                        x += width;
            prefSize = getTableSize();

        int selection = hScroll.getSelection();
                final GridColumn prevHoveringColumn = hoveringColumn;
     */
        return clientArea.height - (columnHeadersVisible ? headerHeight : 0);
    {
        // Row header width
                break;
            gc.setForeground(this.getLineSelectedColor());
     * the preferred size of all the column headers and use the max.
                continue;
                                text.append(getLabelProvider().getText(column));
                    drawEmptyCell(gc, x, y, clientArea.width - x + 1, itemHeight);
                resizingColumnStartWidth = columnBeingResized.getWidth();
        recalculateSizes(true);
        for (GridPos cell : cells) {
                setCursor(null);
                        if (index < columns.size()) {
                    if (cellDragCTRL) {

     *                                 last (if inverse==true) item in the range
                col, row < 0 ? null : gridRows[row]);
    public Color getLineSelectedColor() {
     * the preferred height of the first item in this <code>Grid</code> is
    private static final int DEFAULT_ROW_HEADER_WIDTH = 30;
            gridRows = ArrayUtils.deleteArea(IGridRow.class, gridRows, row + 1, deleteTo - 1);
        });
            }
    private boolean hoveringOnColumnSorter = false;
                // get column header specific tooltip

     * <p/>
                do {
                    newTip = hoveringColumn.getHeaderTooltip();
            case BOLD -> boldFont;

        }
    {
        toolTipHandler = new CustomToolTipHandler(this);
            rowState = new RowExpandState();
    private boolean cellSelectedOnLastMouseDown;
            }
    private boolean cellColumnDragSelectionOccurring = false;
     * rather than pixel-by-pixel.
        if (x < clientArea.width) {
    private void initListeners()
            x += colIter.getWidth();
        y += getGridHeight();
    /**
    }
     * same as topIndex.
     * If cell selection is enabled, all cells within the given indices are
        if (ttSize.x > col.getWidth() || ttSize.y > getItemHeight()) {
     * @return the cell at the given point
    }
            if (hasChildColumns || hasPinnedColumns) {
    }
                if (e.button == 1/* && (hoveringColumn.isOverIcon(e.x, e.y) || selectedColumns.contains(hoveringColumn))*/) {
                } else {
    }
        }
            public void mouseExit(MouseEvent e)

                    if (shift) {
        for (int k = 0; k < columns.size(); k++) {
    /**
    public IGridRow getRowByElement(int fromIndex, Object element) {
    }
            private GridColumn getOverColumn(DropTargetEvent event) {
                        if (isDragSingleColumn()) {
        if (selectionType == SWT.SINGLE) return;
        return gridRows[row];
        selectCells(getCells(index));
     * a single line of pixels is visible. Use {@link #isShown(int)} to find
            if (hasPinnedColumns) {
            hoveringOnHeaderDragArea = false;
     */

     * @param stateMask                  state mask during preceeding mouse or key event.
                }
            }
    public Rectangle getCellBounds(int columnIndex, int rowIndex) {
     * Dispose listener.  This listener is removed during the dispose event to allow re-firing of
        focusColumn = null;
            }
            hoveringItem = row;
        if (savedFocus != null) {
        }
     */
        return lineSelectedColor;
        // Truncate too long texts (they are really bad for performance)
            if ((hoveringItem >= 0) && (hoveringColumn != null)) {
                    column.setPinIndex(contentProvider.getColumnPinIndex(column));
     * differences between column by column scrolling and pixel based scrolling.
        }

                onFocusIn();
    private int selectionType = SWT.SINGLE;
        return getColumn(col).getBounds();
     * or collapsed or new items are added or removed.
            return range;
    @Nullable
     * <p/>
     * the availableHeight, if (height of item at startIndex < availableHeight).

        gc.setBackground(getLabelProvider().getHeaderBackground(null, false));

        checkWidget();
    }
     * Returns the size of the preferred size of the inner table.

    @Nullable
        int fromIndex = fromColumn.getIndex();
        int newWidth = resizingColumnStartWidth + (x - resizingStartX);
            return index;
        } else {
import org.eclipse.swt.SWT;

        checkWidget();
    {
            y + height - 1);
    public Object getRowElement(int row) {
        if (node == null || node.state == IGridContentProvider.ElementState.NONE) {

            return lastClientArea;
                        int rowFromTop = hoveringRow - getTopIndex();

            return null;
    private boolean cellRowSelectedOnLastMouseDown;
                    showItem(intentItem);
     *
     * @param x mouse x
    private void setTopIndex(int index)
    }
    private boolean bottomIndexShownCompletely = false;
        gc.fillRectangle(x, y, width + 1, height);
        List<GridPos> cells = new ArrayList<>();
        for (int doublePass = 1; doublePass <= 2; doublePass++) {
     * @param e event
                    currIndex++;

    }
    private Color foregroundColor;
            y,

                    }
                GridColumn prevCol = getPreviousVisibleColumn(col);
            // Get cells for all leafs
        x2 -= getHScrollSelectionInPixels();

            @Override
        sizingGC.dispose();
                    x += rowHeaderWidth;
            for (IGridStatusColumn gsc : statusColumns) {
        if (index == 0) {
            Point newRange = getSelectionRange(currentItem, currentColumn, endItem, endColumn);
        	if(!overSorter) {
                            event.data = getLabelProvider().getText(draggingColumn);
                                gc,
     *
        if (resizingColumn) {
            paintHeight = columnHeight + (headerHeight - y - columnHeight);
                event.data = new GridCell(focusColumn, gridRows[focusItem]);
                        }
     * defined in the {@code SelectionListener} interface.
            } else {
        if (e.data instanceof RedrawCell redrawCell) {
                            cellBounds.x = x;
                max++;
            {
            newRowHeaderWidth = MIN_ROW_HEADER_WIDTH;

            level++;

     * used as a default for all items (and is returned by {@link #getItemHeight()}).
                Point point = new Point(e.x, e.y);
        if (pos.col < 0 || pos.row < 0) {
        selectedColumns.sort(Comparator.comparingInt(GridColumn::getIndex));
    }
        int availableRows = (availableHeight + 1) / (getItemHeight() + 1);
        focusColumn = oldFocusColumn;

            handleHoverOnColumnHeader(e.x, e.y);
     * If Grid controls are stacked then only the top is visible and has real client area.
     * @param columnScrolling true to horizontally scroll by column, false to
        }
    }

        if (x >= firstVisibleX

     * If an item in the given range is not selected, it is selected. If an item
     * @see LightGrid#select(int[])
                for (GridColumn parent = column.getParent(); parent != null; parent = parent.getParent()) {
                //return;
        }
            range.endIndex = startIndex;
                    } else {
    public boolean isHoveringOnHeader() {
                se.button = e.button;
                hoveringRow = row;
                    GridColumn column = columns.get(k);

            GridColumn column = topColumns.get(i);
