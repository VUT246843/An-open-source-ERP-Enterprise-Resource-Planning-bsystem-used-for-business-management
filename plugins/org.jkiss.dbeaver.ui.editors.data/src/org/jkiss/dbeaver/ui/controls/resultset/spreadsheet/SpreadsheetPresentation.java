                }
            dataContainer.isFeatureSupported(DBSDataContainer.FEATURE_DATA_FILTER);
        } else {
        // Update value in all selected rows
                    }
                };
                }
        }
                    25
        ViewState(DBDAttributeBinding focusedAttribute, int hScrollSelection) {
            }
            }

    }
            }
                        manager.insertAfter(
import org.eclipse.swt.layout.FillLayout;
                    for (int i = sourcePosition - 1; i >= targetPosition; i--) {
                    if (hasParentArrayRow(gr)) {
                                applyEvent.keyCode = SWT.ARROW_RIGHT;

                for (GridPos pos : ssSelection) {
                int lastIndex = nestedIndexes.length;
                toggleBooleanValue(cellLocation, cellValue);
    }
        public Object getCellValue(
                    }
                for (IGridColumn row : spreadsheet.getColumnSelection()) {
            spreadsheet.cancelInlineEditor();
        public int size() {
        public DBDAttributeBinding getElementAttribute(Object element) {
                        if (col.getElement() instanceof ResultSetRow) {
        if (!selection.isEmpty() && selection instanceof IStructuredSelection ss) {

        boolean copyHTML = settings.isCopyHTML();
            recordMode ? curRow : this.curAttribute);
            {
        DBDAttributeBinding oldAttribute = this.curAttribute;
                    setBinding(attr);
        super.dispose();
            @Override

        @Nullable
        }
import org.eclipse.swt.dnd.TextTransfer;

                colOffset = colCount;
            if (selectedColumns.size() == 1) {
                        // Index may be out of bounds in case of complex attributes
        @Nullable
                Object child = getCellValue(gridColumn, gridRow, getRowNestedIndexes(gridRow), true);

        public IResultSetController getController() {
                    }
    ///////////////////////////////////////////////
            info.value = cellValue;
    }
            newRow = cell.getRow();
        boolean pin = pinnedAttrsCount > 0;
                                controller.getSite(),
                        if (DBUtils.isNullValue(cellValue) || cellValue instanceof Boolean) {

                return null;
            new ResultSetCellLocation(attr, row, getRowNestedIndexes(cell.row)));
        @Override
                        if (rowIdentifier == null) {
            value = nullable ? null : true;

        @Nullable
        public int getColumnHintsWidth(IGridColumn colElement) {
        return spreadsheet;

        @Nullable
            } else if (cellValue instanceof DBDComposite composite && controller.isRecordMode()) {
    private boolean colorizeDataTypes = true;
            if (!selectedRowIndexes.isEmpty() && selectedRowIndexes.size() < controller.getSelectedRecords().length) {
            boolean recordMode = controller.isRecordMode();
                    attr, row, cellValue, rowElement.getVisualPosition(), selected, false);
        @Override
                    // Inline editor isn't supported but panel viewer is
                    controller.getModel().getHintContext(),
    private void closeEditors() {
                        for (int i = 0 ; i < newLines.length - 1; i++) {
                for (GridPos pos : ssSelection) {
    ///////////////////////////////////////////////
            RGB cellSel = UIUtils.blend(
                return controller.getModel().getAttributeBinding(attr);


                        final Object sourceValue = spreadsheet.getContentProvider().getCellValue(sourceCell.col, sourceCell.row, false);
                editor.closeValueEditor();
                            if (colNum >= spreadsheet.getColumnCount()) {
            // get show column position configuration
        public Color getForeground(IGridItem element) {
            IValueController valueController = (IValueController) activeInlineEditor.getControl().getData(DATA_VALUE_CONTROLLER);

                    final GridPos cur = selection.get(i);
                    default -> isAttributeExpandable(null, attr);
                    // Pin/unpin
                    NLS.bind(ResultSetMessages.controls_resultset_viewer_action_open_value_editor_column_readonly,
            setConstraintPosition(allConstraints.get(i), pin, i);
            for (DBDAttributeHintProvider hintProvider : controller.getModel().getHintContext().getColumnHintProviders(attr)) {
                    }
        }
                return String.valueOf(item.getElement());
            if (element == null) {
    @Nullable
                                applyEvent.keyCode = SWT.ARROW_DOWN;
import org.jkiss.dbeaver.model.data.hints.DBDAttributeHintProvider;
                            cellValue.append(c);

            for (IGridColumn column : selectedColumns) {
    }
    ///////////////////////////////////////////////
                // Collections
                } else {
        }
                    if (cellValue instanceof Collection<?> col) {
                return null;
                // New row and no value. Let's try to show default value
                String columnText = labelProvider.getText(column);
            DBDAttributeBinding attr = colElement.getElement() instanceof DBDAttributeBinding ab ? ab : null;
        }
        }
            if (selected) {
                        if (inQuote) {
            } else if (item.getElement() instanceof DBSAttributeBase attr) {
                return null;
                                break;
                    setConstraintPosition(dropC, pin, sourcePosition);

            }
        }
        @Override
import org.eclipse.swt.dnd.Transfer;
            spreadsheet.cancelInlineEditor();
                            gridHints = new ArrayList<>();
            this.focusedAttribute = focusedAttribute;
        booleanStyles = BooleanStyleSet.getDefaultStyles(preferenceStore);
                if (lastIndex == nestedIndexes.length) {
                        controller.setCurrentRow(model.getRow(curRow.getVisualNumber() + 1));
        }
                }
                            return "Virtual key is used";
    private DBDAttributeBinding getAttributeFromGrid(IGridColumn colObject, IGridRow rowObject) {
//                    .collect(Collectors.joining(",", "[", "]"));
                        yield null;
            }
            if (controller.isRecordMode()) {
                    RGB mixRGB = UIUtils.blend(
                        curLine.add(cellValue.toString());
        final List<DBDAttributeConstraint> constraints = filter.getConstraints();
                                return "Data modification is not supported by database.";

            ResultSetRow origRow = getCurRow();
        return highlightScopeFirstLine;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    }
                headerSelectionBackground.getRGB(),
    }
                    }
        }
                case FIRST:



                        rowNum++;
        boolean altPressed = (state & SWT.ALT) == SWT.ALT;
                }
            Rectangle columnBounds = spreadsheet.getColumnBounds(focusPos.col);
            }
                    }
            }
        if (!(columnElement instanceof DBDAttributeBinding attributeBinding)) {
            if (row.isChanged(attribute)) {
            for (DBDAttributeBinding cur = binding; cur != null; cur = cur.getParentObject()) {
                (newCol != null && curAttribute != newCol.getElement());

                        RGB mixRGB = UIUtils.blend(
    public void moveColumn(Object dragColumn, Object dropColumn, DropLocation location) {
        return new ResultSetCellLocation(currentAttribute, currentRow, getRowNestedIndexes(focusRow));
                        nestedIndexes[lastIndex - 1] = gr.getRelativeIndex();
            if (!ignoreRowSelection && highlightRowsWithSelectedCells && spreadsheet.isRowSelected(rowPosition)) {
    }
                        }
                return false;
                newCol.getElement() instanceof ResultSetRow resultSetRow &&
                    return ResultSetThemeSettings.instance.backgroundSelected;
                    tdt.append(columnDelimiter);
        }
                        .allMatch(x -> x != null && x.hasOption(DBDAttributeConstraintBase.ATTR_OPTION_PINNED));
                if (!CommonUtils.isEmpty(description)) {
            }
                // Navigate hyperlink
        }
                            final ResultSetRow row = getResultRowFromGrid(colElement, gridRow);
            if (item instanceof IGridColumn && controller.isRecordMode()) {
            if (isShowAsCheckbox(attribute) && booleanStyles.getMode() == BooleanMode.TEXT) {
            spreadsheet.setCursor(

            final ResultSetRow row = getResultRowFromGrid(colElement, rowElement);
                }
            parent,
                        }
        } else {

                if (sourceCell != null) {
        }
                        continue;
        }
                }

        if (activeInlineEditor != null && activeInlineEditor.getControl() != null && !activeInlineEditor.getControl().isDisposed()) {
                return hasExpandableElements(row);
                return formatValue(gridColumn, gridRow, value);
            ResultSetPropertyTester.firePropertyChange(ResultSetPropertyTester.PROP_CAN_MOVE);
        if (cell == null) {
    public void toggleCellValue(IGridColumn columnElement, IGridRow rowElement) {
                    getValueRenderFormat(attr, value));
                // State
                curRow = resultSetRow;
                                }
        }
        @Override
                    case columnDelimiter:
        }
        boolean forceQuotes = settings.isForceQuotes();

                }
                    return pinIndex == null ? -1 : pinIndex;
                }
            if (attr != null && cellValue != DBDVoid.INSTANCE) {
    public void applyChanges() {

                        gridHints.add(new SpreadsheetHint(getController(), hint));
            if (newRow != null && newRow.getElement() instanceof DBDAttributeBinding attributeBinding) {
        @Override
                if (!binding.hasNestedBindings()) {
        @Override
 * Spreadsheet presentation.
        this.highlightScopeFirstLine = firstLine;
                            ) {
                    if (cellValue instanceof DBDCollection) {
                }

                    rowBatchSize = 1;
import org.jkiss.dbeaver.Log;
                    return new PropertySourceDelegate(props);
                            return ab;
                // Shift to new row in record mode
            IResultSetCommands.CMD_TOGGLE_PANELS,
                }
        showOddRows = preferenceStore.getBoolean(ResultSetPreferences.RESULT_SET_SHOW_ODD_ROWS);

    @Override

        }
        @Nullable
        if (attr.getDataKind() == DBPDataKind.STRUCT && controller.isRecordMode()) {
        @NotNull
                    if (copyHTML) html.append("<td>").append(rowNumber).append("</td>");
                    ) {
                case DROP_BEFORE:
                                IValueController.EditType.NONE, null).updateValue(newValue, false);

                        // No inline editors for readonly columns
        public boolean isElementSupportsSort(@Nullable IGridColumn element) {
                // rows
                controller.setCurrentRow(curRow);
        boolean columnHeaderMenu,
            spreadsheet.setCursor(cell, false, false);
            // It may occur on simple focus change so we won't do anything
                        return col.toArray();
                        )
            }
        }
                }
                {

                return attr.getValueRenderer().getValueDisplayString(
    private Color backgroundDefault;
        private Object formatValue(@NotNull IGridColumn gridColumn, @NotNull IGridRow gridRow, @Nullable Object value) {
                    selectedCellColor = UIUtils.getSharedTextColors().getColor(mixRGB);
                    if (color != null) {
                            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
                            controller.getSite(),
        }
            if (!recordMode && !selectedColumns.isEmpty()) {
            } else if (item.getElement() instanceof DBSAttributeBase attrBase) {
                return null;

package org.jkiss.dbeaver.ui.controls.resultset.spreadsheet;
                for (IGridHint hint : cellHints) {
        getPreferenceStore().setValue(ResultSetPreferences.RESULT_GRID_VALUE_FORMAT, this.gridValueFormat.name());
        } else {
        }
                Color normalColor = getCellBackground(attribute, row, cellValue, rowPosition, false, true);
        @Override
        public Object getCellValue(IGridColumn gridColumn, IGridRow gridRow, boolean formatString) {
        // fix up the positions for all the affected constraints after the order modifications 
            toolTip.append(formatValue(colElement, rowElement, cellValue));
        }
        SpreadsheetValueController valueController = new SpreadsheetValueController(
                }
        controller.toggleSortOrder((DBDAttributeBinding) columnElement,
        }
                for (IGridItem gr = gridRow; gr.getParent() != null; gr = gr.getParent()) {
                return ResultSetMessages.controls_resultset_viewer_status_row + " #" + (rsr.getVisualNumber() + 1);
                new GridCell(curRow, this.curAttribute) :
        return switch (selection.size()) {
            if (backgroundDefault == null) {
                return attr.getName();
                List<DBDAttributeBinding> attrs = new ArrayList<>();
                if (DBUtils.isNullValue(cellValue) || cellValue instanceof Boolean) {
                // No editor was created so just drop placeholder
                rowOffset = 1;
                oldRow = controller.getModel().getRow(rowCount - 1);

        public int getCellAlign(@Nullable DBDAttributeBinding attr, ResultSetRow row, Object cellValue) {
        return super.getCursorLocation();

                }
            if (activeInlineEditor != null) {
            IResultSetController.ContextMenuLocation.COLUMN_HEADER :

                        return UIUtils.getSharedTextColors().getColor(mixRGB);
                    if (recordMode && curRow != null && curRow.getVisualNumber() < model.getRowCount() - 1) {
                    tdt.append(rowNumber).append(columnDelimiter);
                    } else {

            return spreadsheet.getSelection().isEmpty();
                        return null;
            } else {
                }

        @Nullable
            if (editor.getControl() != null && !editor.getControl().isDisposed()) {
                    attr,
    private final Map<SpreadsheetValueController, IValueEditorStandalone> openEditors = new HashMap<>();
                            return switch (booleanStyles.getStyle((Boolean) cellValue).getAlignment()) {
        return activeInlineEditor != null &&
        GridCell cell = new GridCell(gridColumn, gridRow);
                    if (collection.isEmpty()) {
    }

                            }
                columnBounds.y += spreadsheet.getHeaderHeight() +
                    public String getStatusText() {
            return false;
        this.columnOrder = recordMode ? SWT.DEFAULT : SWT.NONE;
                    }
                return;
                        return getController().getReadOnlyStatus();
                    case ANY:
    implements IResultSetEditor, IResultSetDisplayFormatProvider, ISelectionProvider, IStatefulControl, DBPAdaptable, IGridController {
            final SpreadsheetFindReplaceTarget findReplaceTarget = SpreadsheetFindReplaceTarget
                                return "Table metadata not found. Data edit is not possible.";
                    break;
            Object cellValue = row == null || attr == null ? null : getCellValue(colElement, rowElement, false);
                Collections.sort(rowSelection);
                        ResultSetRow rsr = (ResultSetRow) gridRow.getElement();
                    15
        }
        if (settings.isCut()) {
                            return UIIcon.BUTTON_READ_ONLY;
                    if (row < elements.length) {
                }
                maxIndex = Math.max(maxIndex, pinIndex + 1);
                final List<DBDAttributeConstraint> constraints = getOrderedConstraints(dataFilter, pin);
            if (!controller.isRecordMode()) {
            }
                return calcColumnWidthByValue;
            return ResultSetThemeSettings.instance.backgroundReadOnly;
    private boolean highlightRowsWithSelectedCells;

                    final DBDAttributeBinding attr = getAttributeFromGrid(cell.col, cell.row);
    private ResultSetRow getResultRowFromGrid(IGridColumn colObject, IGridRow rowObject) {

            if (newRow != null && newRow.getElement() instanceof ResultSetRow resultSetRow) {
                }
    /////////////////////////////////////////////////
                        }
        final ResultSetCellLocation cellLocation = new ResultSetCellLocation(attr, row, getRowNestedIndexes(rowElement));
            int hScrollPos = spreadsheet.getHorizontalScrollBarProxy().getSelection();
                                    .map(DBDAttributeBinding::getName).collect(Collectors.joining(","));
                .filter(x -> x.hasOption(DBDAttributeConstraintBase.ATTR_OPTION_PINNED))
                            if (executionContext != null) {
                                strValue.charAt(i + 1) == rowDelimiter) {
                    if (sourcePosition > targetPosition && targetPosition < dataFilter.getConstraints().size() - 1) {
                }
import org.jkiss.dbeaver.ui.data.editors.BaseValueEditor;
            }
    private boolean isShowAsCollection(@NotNull IGridRow row, @NotNull IGridColumn column, @Nullable Object value) {
        private boolean isAttributeReadOnly(@NotNull DBDAttributeBinding attr) {
                    }
                        SpreadsheetCommandHandler.CMD_COLUMNS_FIT_VALUE));
        @NotNull
                if (newColumnIndex >= 0) {
        return gridValueFormat;
        final StringBuilder cellValue = new StringBuilder();
                    max = cur;
            }
            if (element.getElement() instanceof DBDAttributeBinding binding) {
                String strValue;
        controller.setDataFilter(dataFilter, false);

        @Override
        boolean inQuote = false;
                List<DBDAttributeBinding> attrs = new ArrayList<>();
            }
        boolean ctrlPressed = (state & SWT.CTRL) == SWT.CTRL;
                                        } else {
            }
        }
                return String.valueOf(row.getRelativeIndex() + 1);
            Set<DBDAttributeBinding> updatedAttrs = new HashSet<>();
        }
            return colObject == null ? null : (DBDAttributeBinding) colObject.getElement();
                .sorted(Comparator.comparing(DBDAttributeConstraintBase::getVisualPosition))
        }
import org.jkiss.dbeaver.ui.data.IMultiController;
    @Override
    private boolean isSimpleAttribute(DBDAttributeBinding attr) {
        // right to left while shifting right, left to right while shifting left
import org.jkiss.dbeaver.ui.controls.bool.BooleanStyleSet;
        return controller.getPreferenceStore();
            // Fix row number if needed
        isHighContrastTheme = UIStyles.isHighContrastTheme();
                return controller.getAttributeReadOnlyStatus(binding, true, false) != null;
            return;
                controller.setStatus(
            if (cellSelected) {
                return attrs;

                    default:
        @Override
import org.jkiss.dbeaver.runtime.properties.PropertyCollector;
                if (showWhitespaceCharacters) {
    private DBDDisplayFormat gridValueFormat;
            int sourcePosition = getConstraintPosition(dragC, pin);
            return NavigatorThemeSettings.instance.hintColor;
    private class GridLabelProvider implements IGridLabelProvider {
                    break;
            }
        public List<IGridHint> getColumnHints(IGridItem element, int options) {
                        new ResultSetCellLocation(attr, row, getRowNestedIndexes(gridRow)),

            }
                    for (String[] line : newLines) {

            }
                            break;

        // reorder constraints affecting the whole collection of them 
            }


                        try (DBCSession session = DBUtils.openUtilSession(new VoidProgressMonitor(), attr, "Copy from clipboard")) {
                        }
            }
        @Nullable IGridColumn colObject,
    private String[][] parseGridLines(String strValue, boolean splitRows, boolean ignoreQuotes) {
                tip.append(SpreadsheetMessages.tooltip_column).append(": ");
                if (odd) {

                }
        int length = strValue.length();
                UIStyles.isDarkTheme() ? new RGB(100, 100, 100) : new RGB(255, 255, 255),

                List<Integer> rowSelection = new ArrayList<>(spreadsheet.getRowSelection());
            return null;
                                    return ElementState.COLLAPSED;
            return false;
    public int getHighlightScopeLastLine() {
            return constraint.getOption(DBDAttributeConstraintBase.ATTR_OPTION_PINNED);
                    ShellUtils.launchProgram(strValue);
                        continue;
        }
                    tdt.append(columnDelimiter);
                }
            @Nullable Composite inlinePlaceholder)
            nestedIndexes = new int[gridRow.getLevel()];
                    return;
                // Reposition columns
            return adapter.cast(page);
        int maxIndex = 0;
                if (item.getElement() instanceof DBDComplexValue) {
                    } else {
                return;

import org.jkiss.dbeaver.ui.controls.resultset.IResultSetController.RowPlacement;
                if (isHyperlinkText(strValue)) {
                        spreadsheet.shiftCursor(0, -1, false);
            controller.getDataContainer() != null &&
                    } else if (cellValue instanceof DBDComposite) {
                        getRowNestedIndexes(item),
            spreadsheet.setRedraw(true);
                        spreadsheet.setCursor(newPos, true, true, false);
//                return Arrays.stream(composite.getAttributes())

                    DBWorkbench.getPlatformUI().showError("Error extracting editor value", null, e);
        }
        }
    }
            if (element.getElement() instanceof DBDAttributeBinding attributeBinding) {
                // Probably we can just show preview panel
    @Override
                            cellValue = number.byteValue() != 0;
                if (forceQuotes || cellText.contains(columnDelimiter) || cellText.contains(rowDelimiter)) {
        @NotNull
                if (!recordMode) {
                });
                        int colNum = rangeStart.col;

import org.eclipse.swt.graphics.*;
                            refreshData(true, false, true);
                // In record mode attributes hierarchy includes struct attributes too
            }
    @Override
     * @return true if all columns were moved, otherwise false

        }
                }
                    cellValue = number.byteValue() != 0;
                    }
                            }
        return new ResultSetCellLocation(attr, row, getRowNestedIndexes(cell.row));
            } else {
            }

            return spreadsheet.getRowSelectionSize();

                    valueController.updateValue(newValue, false);
import org.jkiss.code.Nullable;
        @Override
                if (attributeBinding.isTransformed()) {

            spreadsheet.toggleCellValue(cell.col, cell.row);
                            : NLS.bind(ResultSetMessages.controls_resultset_viewer_unpin_columns, selectedColumns.size());
                    selectedCellColor = ResultSetThemeSettings.instance.backgroundSelected;
        final ResultSetRow row = getResultRowFromGrid(columnElement, rowElement);
                    ActionUtils.makeCommandContribution(
                spreadsheet.getRow(pos.row)
                switch (binding.getAttribute().getDataKind()) {
        final ResultSetRow row = rowObject == null ? getFocusRow() : getResultRowFromGrid(colObject, rowObject);
                }
import org.jkiss.dbeaver.model.exec.DBCSession;
        return lines.toArray(new String[lines.size()][]);
                    case trashDelimiter:

        @Override
            return info;
                    selectedColumns.add(attrCol);
                    break;

                            };

            }
            if (item.getElement() instanceof DBDAttributeBinding binding) {
                    value,

import org.eclipse.jface.viewers.ISelectionProvider;
                DBDAttributeConstraint constraint = controller.getModel().getDataFilter().getConstraint(attributeBinding);
                    case rowDelimiter:
                // Determine odd/even row
            for (int i = 0; i < spreadsheet.getColumnCount(); i++) {
                    @Override
        } else {
            && (collection.isEmpty() || spreadsheet.isCellExpanded(row, column));
        public boolean isElementReadOnly(@NotNull IGridColumn element) {
import org.jkiss.dbeaver.ui.controls.resultset.handler.ResultSetPropertyTester;
                    return ResultSetThemeSettings.instance.backgroundAdded;
                    }
                curRow = controller.getCurrentRow();
            @NotNull IResultSetController controller,
                        if (newValue == null) {
    private boolean autoFetchSegments;
                    IValueEditorStandalone editor = openEditors.get(valueController);
            return constraints.stream()
                return null;

        }
                    nestedIndexes[gr.getLevel() - 1] = gr.getRelativeIndex();
    public void changeMode(boolean recordMode) {
    public Point getCursorLocation() {
                            }

                        IResultSetController.MENU_GROUP_ADDITIONS, 
            @NotNull ResultSetCellLocation cellLocation,
                return foregroundDefault;
                        if (curRow != null) {
                        if (!DBUtils.isNullValue(cellValue)) {
                }
                switch (binding.getDataKind()) {
            }

            if (!showAttributeDescription || element.getParent() != null) {
            IGridContentProvider.CellInformation cellInfo = spreadsheet.getContentProvider().getCellInfo(cell.col, cell.row, false);
            }

                        spreadsheet.refreshRowsData();
                }
            if (!getPreferenceStore().getBoolean(ResultSetPreferences.RESULT_SET_CLICK_TOGGLE_BOOLEAN)) {
        ResultSetRow row = getResultRowFromGrid(focusColumn, focusRow);
        this.dataTypesForegrounds.put(DBPDataKind.NUMERIC, ResultSetThemeSettings.instance.dtNumericColor);
        public boolean isGridReadOnly() {
        public Color getHeaderBorder(@Nullable IGridItem item) {

                settings.getFormat());
import org.jkiss.dbeaver.ui.editors.TextEditorUtils;
        public String getCellLinkText(IGridColumn colElement, IGridRow rowElement) {
            CellInformation cellInfo = getCellInfo(colElement, rowElement, false);
            log.debug("Unable to show distinct filter for columnElement" + columnElement);
     * @param columns - columns to move
        @Nullable
                        attrs.add((DBDAttributeBinding) elements[row]);
            changed = (newRow != null && curRow != newRow.getElement()) ||
        }
                return DBeaverIcons.getImage(
                final DBDAttributeConstraint attrConstraint = dataFilter.getConstraint((DBDAttributeBinding) column);

                if (kind == DBPDataKind.ARRAY) {
//                    .map(DBPNamedObject::getName)
                controller.getDataContainer().isFeatureSupported(DBSDataContainer.FEATURE_DATA_FILTER) &&
                        }

            }
            activeInlineEditor = valueController.getValueManager().createEditor(valueController);
                case CURRENT:
                        toolTip.append(hintText);
                case ResultSetRow.STATE_REMOVED:
                                        strValue.charAt(k + 1) == columnDelimiter ||
            return toolTip.toString();
            recordMode ? 0 : curRow == null ? 0 : curRow.getVisualNumber(),

            }

        }

                        }
    }
        DBSDataContainer dataContainer = controller.getDataContainer();
            return false;

                    if ((DBUtils.isNullValue(cellValue) || cellValue instanceof Boolean) &&
}
                if (value instanceof byte[] bValue) {
        }


                hintOptions |= DBDValueHintProvider.OPTION_ROW_EXPANDED;
        final char rowDelimiter = '\n';
        @Nullable
            } finally {
    }
            }
                UIUtils.dispose(this.cellHeaderSelectionBackground);
import org.eclipse.jface.action.Separator;

            }
                    public String getDisplayName() {
            super.updateValue(value, updatePresentation);

                        }
    private void updateGridCursor(GridCell cell) {
                return null;

                        log.debug("Error reading content binary value");
            ResultSetPropertyTester.firePropertyChange(ResultSetPropertyTester.PROP_EDITABLE);
            CommandContributionItem.STYLE_CHECK));
                return activeInlineEditor.getControl();
            final GridPos curPosition = spreadsheet.getCursorPosition();
            PropertyPageStandard page = new PropertyPageStandard();
        }
        @Override
        }
                                            constraint.removeOption(DBDAttributeConstraintBase.ATTR_OPTION_PINNED);
            valueController.registerEditor(editorStandalone);
        }
                if (row.colorInfo != null) {
            }
                    if (rowNum < 0 || rowNum >= spreadsheet.getItemCount()) {
            for (DBDCellHintProvider hintProvider : controller.getModel().getHintContext().getCellHintProviders(attr)) {
import org.jkiss.dbeaver.ui.controls.lightgrid.*;
        final char trashDelimiter = '\r';
                            } else {
        } finally {
    }
                }
            gd.grabExcessVerticalSpace = true;
        this.spreadsheet.setLineSelectedColor(ResultSetThemeSettings.instance.lineSelectedColor);
            //final int rowCount = spreadsheet.getItemCount();

            return hintSize;
 *     http://www.apache.org/licenses/LICENSE-2.0

                        break;
                        } else if (rowIdentifier.getUniqueKey() instanceof DBVEntityConstraint) {
                }

                if (sRow.getElement() instanceof ResultSetRow resultSetRow) {
                List<Integer> curRowIndexes = Arrays.stream(controller.getSelectedRecords())

                if (copyHTML) html.append("<th>#</th>");
                SpreadsheetValueController valueController = iterator.next();
                        .map(x -> dataFilter.getConstraint(((DBDAttributeBinding) x.getElement()).getTopParent()))
        {
                // Row mode
            final Object cellValue = controller.getModel().getCellValue(cellLocation);
                        new ResultSetCellLocation(attr, row, getRowNestedIndexes(cell.row)),
                if (e.detail != SWT.DRAG && e.detail != SWT.DROP_DOWN) {
                        }
            GridPos pos = (GridPos) element;


            case 1 -> new Pair<>(selection.get(0), null);
            } else {
                            updatedAttrs.add(attr);
    }
                                strValue.charAt(i + 1) == trashDelimiter ||
        if (value instanceof Number && useNativeNumbersFormat) {
        @Override
                final String fg = dataLabelProvider.getCellForeground(attribute, row.getVisualNumber());
    @Override
        @Override
            return;
            }
            }
        }
                        if (gridRow != null) {

                        Color color = dataTypesForegrounds.get(attribute.getDataKind());
                        cellValue = ((Number) cellValue).byteValue() != 0;
                }
                        if (ignoreQuotes) {
        }
                    return "";
        return true;
                try {

                            if (i == length - 1 ||
                switch (c) {
                return value;
            ctrlPressed ? IResultSetController.ColumnOrder.ASC :
                    }

        @Nullable
                    return model.getAllRows().toArray();
                }
                    }
                !(getPreferenceStore().getInt(ModelPreferences.RESULT_SET_MAX_ROWS) < getSpreadsheet().getMaxVisibleRows()) &&

    private void toggleBooleanValue(ResultSetCellLocation cellLocation, Object value) {
        }
            if (row == null) {

                if (cellValue instanceof Number number) {
            GridData gd = new GridData(GridData.FILL_BOTH);
        if (!controller.isRecordMode()) {
    public void createPresentation(@NotNull IResultSetController controller, @NotNull Composite parent) {
        final DBDAttributeBinding attr = getAttributeFromGrid(cell.col, cell.row);
            !DBExecUtils.isAttributeReadOnly(getCurrentAttribute()) &&
        public Object getValue() {
        return new ViewState(curAttribute, spreadsheet.getHorizontalScrollBarProxy().getSelection());
    }
    @Override
                    }

                );
            @Override
                    List<Object> rows = new ArrayList<>(selectedRecords.length);
                                spreadsheet.refreshData(true, true, false);
            int hintOptions = options;
                    int[] selectedRecords = controller.getSelectedRecords();
    private int rowBatchSize;
    // Value controller
                recordMode ? 0 : oldRow.getVisualNumber(),
            @NotNull IGridRow gridRow,
                    cellText = quoteString + cellText + quoteString;
                    try {
import org.jkiss.dbeaver.runtime.DBWorkbench;
                        DBDRowIdentifier rowIdentifier = getController().getModel().getDefaultRowIdentifier();
                    break;
        if (dragColumn instanceof DBDAttributeBinding dragBinding && dropColumn instanceof DBDAttributeBinding dropBinding) {
    public void restoreState(Object state) {

        }
                    null);
            };
    // Themes
                    PropertyCollector props = new PropertyCollector(valueController.getBinding().getAttribute(), false);
                {
        for (IGridItem gr = item.getParent(); gr != null; gr = gr.getParent()) {
                }
            gd.verticalIndent = 0;
    @Override
        @Override
                yield new Pair<>(min, max);
                    return null;
                    case STRUCT:
            {
            DBDAttributeBinding attr = getAttributeFromGrid(colElement, rowElement);
    @Override
                    return value;
            if (item.getElement() instanceof DBDAttributeBinding binding) {
        ResultSetRow currentRow = getController().getCurrentRow();
    @Override
            int[] origRowIndexes = cellLocation.getRowIndexes();
                curAttribute = attributeBinding;
        String rowDelimiter = settings.getRowDelimiter();
                    if (allUnpinned != allPinned) {
            newCol = cell.getColumn().getParent();
        //showCelIcons = preferenceStore.getBoolean(ResultSetPreferences.RESULT_SET_SHOW_CELL_ICONS);
            controller.updatePanelsContent(false);
        }
                if (value instanceof Number) {
import org.eclipse.swt.dnd.HTMLTransfer;
import org.eclipse.ui.views.properties.IPropertySheetPage;
            } else if (column == null && controller.isRecordMode()) {

    public boolean isDirty() {
        return ResultSetThemeSettings.instance.backgroundModified;
            @NotNull IGridColumn gridColumn,
        {
            constraint.setOption(DBDAttributeConstraintBase.ATTR_OPTION_PINNED, position);
            if (store.getBoolean(ResultSetPreferences.RESULT_SET_SHOW_COLUMN_POS)) {
                        DBDAttributeBinding ab = DBUtils.findObject(bt.getNestedBindings(), attr.getName());
    @Override
            }
            @Nullable int[] rowIndexes,
                return UIUtils.getSharedTextColors().getColor(mixRGB);
    private boolean showOddRows = true;
                            new SpreadsheetValueController(
            List<IGridHint> gridHints = null;
                                            constraint.setOption(DBDAttributeConstraintBase.ATTR_OPTION_PINNED, getNextPinIndex(dataFilter));
                final DBPDataKind kind = cur.getDataKind();
                            } else {

public class SpreadsheetPresentation extends AbstractPresentation
            final DBDAttributeBinding attr = getAttributeFromGrid(gridColumn, gridRow);
                recordMode ? oldAttribute : oldRow);
            } else {
            }
                    // Hide/show
                        DBDAttributeBinding columnToHide = (DBDAttributeBinding) selectedColumns.get(0).getElement();
        }
                final ResultSetRow rsr = (ResultSetRow) item.getElement();
            }
                return 0;
                                new URL(strValue);
                }
            if (copyHTML) html.append("</thead>").append(rowDelimiter);
        public GridPos getFirstElement() {
import org.jkiss.dbeaver.ui.data.managers.BaseValueManager;

    @Override
                if (controller.isRecordMode() && binding.getDataKind() == DBPDataKind.ARRAY && controller.getCurrentRow() != null) {
                    break;
            }
            if (!controller.getModel().getVisibleAttributes().isEmpty()) {
                return composite.getAttributes();
                            byte[] binaryContents = (byte[]) clipboard.getContents(SimpleByteArrayTransfer.getInstance());
            if (findReplaceTarget.isSessionActive()) {
import org.jkiss.dbeaver.model.struct.*;
            && colObject.getParent().getElement() instanceof DBDAttributeBinding binding
    private boolean showBooleanAsCheckbox;
        public CellInformation getCellInfo(@NotNull IGridColumn colElement, @NotNull IGridRow rowElement, boolean selected) {
                if (copyHTML) html.append("<th>").append(XMLUtils.escapeXml(columnText)).append("</th>");
                new IGridStatusColumn() {
                spreadsheet.getCellRenderer().executeHintAction(cell.row, cell.col, cellInfo, x, y, state);
        void unregisterEditor(IValueEditorStandalone editor) {
        if (reflect) {
                        String hintText = hint.getActionToolTip();

        }
        if (colObject == null) {
                                    if (constraint != null) {
import org.jkiss.dbeaver.model.virtual.DBVEntityConstraint;

                        gridHints.add(new SpreadsheetHint(getController(), hint));
        public Color getErrorForeground() {
    /////////////////////////////
        }


            return null;

                oldRow = controller.getModel().getRow(0);
                    DBDAttributeBinding[] columns = model.getVisibleAttributes().toArray(new DBDAttributeBinding[model.getVisibleAttributeCount()]);
                }

                colOffset = -colCount;
            return ResultSetThemeSettings.instance.resultSetFontItalic;
    @Nullable
            IGridRow row = spreadsheet.getRow(((GridPos) element).row);
                                    .getDataSource()
    }
import org.eclipse.jface.viewers.Viewer;

                    EditTextDialog dialog = new EditTextDialog(
        }
        }
                } else {
            if (newCol != null && newCol.getElement() instanceof DBDAttributeBinding attributeBinding) {
                    IResultSetController.MENU_GROUP_ADDITIONS,

        gridValueFormat = CommonUtils.valueOf(DBDDisplayFormat.class, getPreferenceStore().getString(ResultSetPreferences.RESULT_GRID_VALUE_FORMAT), DBDDisplayFormat.UI);
                                }
            if (forceQuotes || (quoteCells && !CommonUtils.isEmpty(cellText))) {
                } else {
                        if (hintLabel != null) {
            final DBDDataFilter dataFilter = new DBDDataFilter(controller.getModel().getDataFilter());
            }
        this.spreadsheet.setFont(ResultSetThemeSettings.instance.resultSetFont);
                        attr = (DBDAttributeBinding) spreadsheet.getColumnElement(pos.col);
                                case CENTER -> ALIGN_CENTER;
                            return children.toArray();
            }
                                }
        }
                return rows;
        return CommonUtils.isEmpty(attr.getReferrers()) &&
        final DBDDataFilter dataFilter = new DBDDataFilter(controller.getModel().getDataFilter());
        }

                    }
                            ? NLS.bind(ResultSetMessages.controls_resultset_viewer_unpin_column, ((DBDAttributeBinding) selectedColumns.get(0).getElement()).getName())
        @Override
                return ResultSetThemeSettings.instance.cellHeaderBackground;
                    case DOCUMENT:
        IResultSetController.ContextMenuLocation menuLocation = columnHeaderMenu ?
                return ab;

                    }
            }
        public boolean isVoidCell(IGridColumn gridColumn, IGridRow gridRow) {
                        SpreadsheetCommandHandler.CMD_COLUMNS_HIDE_EMPTY));

import org.eclipse.jface.text.IFindReplaceTarget;
            final DBDAttributeConstraint dropC = dataFilter.getConstraint(dropBinding);
        rightJustifyNumbers = preferenceStore.getBoolean(ResultSetPreferences.RESULT_SET_RIGHT_JUSTIFY_NUMBERS);
            Object cellValue = getCellValue(colElement, rowElement, false);
            {
                        info.state |= STATE_BOOLEAN;
    @Override
                    DBDAttributeConstraint co = controller.getModel().getDataFilter().getConstraint(binding);
import org.jkiss.dbeaver.utils.ContentUtils;
        public Font getFont(IGridItem element) {

        @Override

                String strValue = attr.getValueHandler().getValueDisplayString(attr, value, DBDDisplayFormat.UI);



     *     <li>{@code (GridPos, null)} if only one cell is selected</li>
            List<IGridHint> cellHints = getCellHints(colElement, rowElement, cellValue, DBDValueHintProvider.OPTION_TOOLTIP);
            final DBDAttributeDecorator dataLabelProvider = getController().getDecorator().getDataLabelProvider();
    )

                    SpreadsheetValueController valueController = new SpreadsheetValueController(
        @Override
                                if (!DBUtils.isNullValue(cellValue)) {
                        controller.getSite(),
            openEditors.put(this, editor);
        }
    }
        boolean changed;
            allConstraints.add(newIndex, constraint);
        });
                    } else {
                    Object cellValue = controller.getModel().getCellValue(
            if (horizontal) {
                            if (settings.isInsertNulls() && settings.getNullValueMark().equalsIgnoreCase(value)) {
        return value instanceof DBDCollection collection
                    }
            int hintSize = 0;
                                    final DBDAttributeConstraint constraint = dataFilter.getConstraint(attribute.getTopParent());
        if (attr instanceof DBDAttributeBinding binding) {
import org.jkiss.dbeaver.ui.data.IValueController;
            if (element.getElement() instanceof DBDAttributeBinding attributeBinding) {
                return new DBDValueError(e);

                if (rowBatchSize < 1) {
                    final DBDAttributeBinding sourceAttribute = getAttributeFromGrid(sourceCell.col, sourceCell.row);
                refreshData(true, false, true);
                    row,
    @Override
        return false;
            int[] nestedIndexes = getRowNestedIndexes(rowElement);
                return null;
import org.jkiss.dbeaver.model.data.hints.DBDValueHint;
                control.addKeyListener(KeyListener.keyPressedAdapter(e -> revealCursor()));
    // where we may have multiple levels of nested rows for a single array attribute
     * Moves specified columns to delta.
                label = label + " (" + (binding.getOrdinalPosition() + 1) + ")";
                        cellValue.setLength(0);
                    if (hints != null) {
        }
        public void closeInlineEditor() {
            }
            if (OPTION_EXCLUDE_COLUMN_NAME_FOR_WIDTH_CALC.equals(option)) {
    public DBDDisplayFormat getDefaultDisplayFormat() {
                if (!recordMode) {
        });
            return false;
                    controller,
            }
        ViewState viewState = (ViewState) state;
                    if (copyHTML) html.append("</tr>").append(rowDelimiter);
                        }
                            gridHints = new ArrayList<>();
        this.spreadsheet.setLineColor(ResultSetThemeSettings.instance.lineNormalColor);
                RGB mixRGB = UIUtils.blend(
                    }
    }
    private int[] getRowNestedIndexes(IGridItem gridRow) {

                    INLINE_HINT_TYPES,
            return getRowNestedIndexes(row);
                            }
            }
        menu.add(ActionUtils.makeCommandContribution(
                    Object newValue = null;
                .sorted(Comparator.comparing(x -> x.getOption(DBDAttributeConstraintBase.ATTR_OPTION_PINNED)))
            if (!controller.isRecordMode()) {
            }
                                    final DBDAttributeBinding attribute = (DBDAttributeBinding) column.getElement();
        
            }
            attr = getFocusAttribute();
        if (oldRow != null && oldAttribute != null) {
        @Nullable
 * Copyright (C) 2010-2025 DBeaver Corp and others
        } else if (Boolean.FALSE.equals(value)) {
        try {
                }
                        if (isSimpleAttribute(attr)) {
import org.eclipse.jface.viewers.IStructuredSelection;
                        if (gridHints == null) {
        }

            backgroundDefault = null;
            return SpreadsheetPresentation.this.getController();
                        }
import org.eclipse.swt.layout.GridData;
            } else if (controller.isRecordMode()) {
                        if (gridHints == null) {
    }
            return
            List<GridPos> cellSelection = new ArrayList<>();
import org.jkiss.dbeaver.model.data.hints.DBDCellHintProvider;
                for (IGridHint hint : cellHints) {
            return null;
        @Override
                    if (attr.getDataKind() == DBPDataKind.BINARY || attr.getDataKind() == DBPDataKind.CONTENT) {

    }

        controller.fillContextMenu(manager, attr, row, getRowNestedIndexes(rowObject), menuLocation);
                        false);
            value = number.byteValue() != 0;
            }

        } else {
    }
            IGridColumn gridColumn = spreadsheet.getColumnByElement(
                toggleBooleanValue(
        @Override
        try {
            return false;
                            }

        final List<String> curLine = new ArrayList<>();
                Color normalColor = getCellBackground(attribute, row, cellValue, rowPosition, false, true);
            return ResultSetThemeSettings.instance.cellHeaderBorder;
                        controller.getSite(),
                    value);
            return null;
                                info.state |= STATE_HYPER_LINK;
                        true);
                int newColumnIndex = curRow == null ? -1 : ArrayUtils.indexOf(controller.getSelectedRecords(), 0, curRow.getVisualNumber());
        DBDAttributeBinding focusedAttribute;
                        tdt.append(columnDelimiter);
                            ? selectedColumns.size() == 1
                        return ElementState.EXPANDED;
                controller.setCurrentRow(curRow);
    public Control getControl() {
                controller.getPreferenceStore().getBoolean(ResultSetPreferences.RESULT_SET_SHOW_ATTR_FILTERS);
                }
                            return hintText;
            return ResultSetThemeSettings.instance.foregroundError;
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
                        return row.colorInfo.rowBackground;
        public Color getHeaderBackground(@Nullable IGridItem item, boolean selected) {
    @Override
            if (e.detail == SWT.TRAVERSE_TAB_NEXT) {
            } else {
    /////////////////////////////////////////////////
                return null;
                        if (copyHTML) html.append("<td></td>");
        }
 */
    private boolean useNativeNumbersFormat;
            spreadsheet.cancelInlineEditor();
            }
                    if (i != prevColIndex) {
        calcColumnWidthByValue = getPreferenceStore().getBoolean(ResultSetPreferences.RESULT_SET_CALC_COLUMN_WIDTH_BY_VALUES);
                        continue;
        @Override
                    );
                recordMode ? oldRow : oldAttribute);
                control.setFocus();
        trackPresentationControl();
        spreadsheet.addTraverseListener(e -> {
    public ResultSetRow getFocusRow() {
                            SpreadsheetCommandHandler.CMD_HIDE_COLUMNS,


                            if (rowIdentifier == null) {
        public int getSortOrder(@Nullable IGridColumn column) {
        }
                    bve.addAdditionalTraverseActions((it) -> {
                rowNum == controller.getModel().getRowCount() - 1 &&
            placeholder.setFont(spreadsheet.getFont());
import org.jkiss.dbeaver.model.sql.SQLConstants;
            int targetPosition = getConstraintPosition(dropC, pin);
                                if (((List<?>) cellValue).size() < 3) {
            (ResultSetRow) spreadsheet.getFocusRowElement();
            && rowObject.getParent() == null;
            if (attr == null || row == null) {
                return ((List<?>) cellValue).size();
 * distributed under the License is distributed on an "AS IS" BASIS,
            return controller.isAllAttributesReadOnly();
            }
        }

        @Override
        @NotNull
        spreadsheet.getHorizontalScrollBarProxy().setSelection(viewState.hScrollSelection);
                        hasHints = true;

            return null;
    public void pasteFromClipboard(@Nullable ResultSetPasteSettings settings) {
            if (this.cellHeaderSelectionBackground != null) {
                int rowNum = rangeStart.row;
    /**
            info.state = STATE_NONE;
                        targetPosition--;

            this.hScrollSelection = hScrollSelection;
                if (booleanStyles.getMode() != BooleanMode.TEXT) {
                return attributeBinding.getDescription();
    }
                autoFetchSegments &&
        ResultSetModel model = controller.getModel();
        GridPos focusPos = spreadsheet.getFocusPos();
            return label;
        if (copyHTML) {
            Object cellValue,
    // Selection provider
                            return ALIGN_RIGHT;
    }
    // Links
                        .allMatch(x -> x != null && !x.hasOption(DBDAttributeConstraintBase.ATTR_OPTION_PINNED));


                    DBDAttributeBinding attr = getAttributeFromGrid(gridColumn, gridRow);
                        }
            }
                        spreadsheet.shiftCursor(0, 1, false);
            }
                return null;
                }
                new GridCell(this.curAttribute, curRow);
                    return columns;

    }
                        Clipboard clipboard = new Clipboard(Display.getCurrent());
                    case ARRAY:
import org.jkiss.utils.CommonUtils;
        Object value = controller.getModel().getCellValue(
                            }
    void highlightRows(int firstLine, int lastLine, Color color) {
     * @return a pair containing either:
    {
                curRow != newCol.getElement())
    }
                if (!controller.isRecordMode() && inScope) {

        @Override
        @Override
        }
                spreadsheet.getColumn(pos.col),
            if (recordMode) {
    @Override
            return getCellValue(gridColumn, gridRow, false) == DBDVoid.INSTANCE;
                tip.append(name).append(" ").append(typeName);
            controller.updateStatusMessage();
                        return co.isOrderDescending() ? SWT.DOWN : SWT.UP;
            if (controller.isRecordMode()) {
                    return ResultSetThemeSettings.instance.backgroundError;
    private boolean hasParentArrayRow(IGridItem item) {
            return false;
            }
                }
        boolean nullable = !cellLocation.getAttribute().isRequired();
    @NotNull
            if (DBUtils.isNullValue(value) && row.getState() == ResultSetRow.STATE_ADDED) {
            newRow = null;
                setCurRow(origRow, origRowIndexes);

                    // Fill empty row tail
    }
                return b.getDataKind() == DBPDataKind.ARRAY;
            DBWorkbench.getPlatformUI().showError("Cannot edit value", null, e);
        this.gridValueFormat = displayFormat;
                    @Override
            if (copyHTML) html.append("<td>").append(XMLUtils.escapeXml(cellText)).append("</td> ");
                    setConstraintPosition(dragC, pin, targetPosition);

            List<DBDValueRow> updatedRows = new ArrayList<>();
                        spreadsheet.refreshRowsData();
        }
            spreadsheet.setFocusColumn(targetPosition);
                } else if (value instanceof DBDContent content && !ContentUtils.isTextContent(content) && value instanceof DBDContentCached) {
            spreadsheet.getHorizontalScrollBarProxy().setSelection(hScrollPos);
            }
                },
        {


                spreadsheet.getColumn(pos.col),
                    // A special case when the grid is empty
import org.eclipse.swt.widgets.Composite;
        }
            return spreadsheet.getColumnSelectionSize();
    }
                placeholder.dispose();
            columnOrder = columnOrder == SWT.DEFAULT ? SWT.UP : (columnOrder == SWT.UP ? SWT.DOWN : SWT.DEFAULT);
            } else if (item instanceof IGridRow row) {
    }

        }
        for (DBDAttributeConstraint ac : dataFilter.getConstraints()) {
        }
            if (valueController != null) {
    // Checks whether there is parent row with attribute of type array
        if (isAttributeExpandable(rowElement, attr)) {
                    } catch (DBCException e) {
                case ResultSetRow.STATE_ADDED:
            }
        public Image getImage(IGridItem item) {
            formats.put(HTMLTransfer.getInstance(), html.toString());
                }
            boolean hasHints = false;
        supportsAttributeFilter =
                    }
        spreadsheet.deselectAll();
import java.net.URL;
    private static void setConstraintPosition(@NotNull DBDAttributeConstraint constraint, boolean pin, int position) {
    public void navigateLink(@NotNull GridCell cell, int x, int y, int state) {
            return gridHints;
    }
                        newValue = ResultSetUtils.getAttributeValueFromClipboard(attr);
            final boolean pin = dragC.hasOption(DBDAttributeConstraintBase.ATTR_OPTION_PINNED) && dropC.hasOption(DBDAttributeConstraintBase.ATTR_OPTION_PINNED);
                }
        @Override
        final SpreadsheetValueController valueController = new SpreadsheetValueController(
                        cellValue.append(c);
        if (spreadsheet.isDisposed()) {
                }
                // Columns order in record mode
        if (!inline) {
                        }
                // Next row
                    return UIUtils.getSharedColor(bg);
                                newValue = valueController.getValueHandler().getValueFromObject(session, attr, binaryContents, false, false);
            List<Integer> selectedRowIndexes = new ArrayList<>();
                    for (int i = 0; i < selectedRecords.length; i++) {

        @Override
        }
                        strValue,
                    return ResultSetThemeSettings.instance.backgroundOdd;
            final DBDAttributeBinding attr  = getAttributeFromGrid(colElement, rowElement);
                ResultSetRow row = getResultRowFromGrid (cell.col, cell.row);
                if (ArrayUtils.contains(supportedEditTypes, IValueController.EditType.PANEL)) {
                            DBSDataContainer dataContainer = getController().getDataContainer();

     * <p>
                            break;
    }

        public List<GridPos> toList() {
                        row = (ResultSetRow) gridRow.getElement();
        spreadsheet.refreshData(false, true, false);
                editorControl.addDisposeListener(e -> valueController.unregisterEditor((IValueEditorStandalone) activeInlineEditor));
            rowDelimiter = GeneralUtils.getDefaultLineSeparator();
                    if (curRow != null && !recordMode) {
     * @param delta determines where columns should be moved. Negative number means to the left, positive - to the right
            quoteString = "\"";
                    break;

                }/* else if (isShowAsCollection(rowElement, colElement, cellValue)) {
import org.jkiss.dbeaver.utils.GeneralUtils;
                            controller.setSelectedRecords(curRowIndexes.stream().mapToInt(i -> i).toArray());
                    String rowNumber = labelProvider.getText(cell.row);
                        if (rangeEnd != null && rowNum > rangeEnd.row) {
            }
                            cellValue = ((Number) cellValue).byteValue() != 0;
            if (attr != null && cellValue != DBDVoid.INSTANCE) {
    }
            } catch (Exception e) {
    }
        if (delta == 0) {
    protected void applyThemeSettings(ITheme currentTheme) {
            controller.updatePanelsContent(false);
        final char columnDelimiter = '\t';
        }
                    DBPMessageType.ERROR);
                    for (int i = prevColIndex; i < selectedColumns.size() - 1; i++) {


                                    return "Virtual key is used";
            }
            }
    }

                }
            }
                return formatValue(gridColumn, gridRow, child);
        public Object[] toArray() {
                    } else if (

        }
        DBDValueHint.HintType.STRING, DBDValueHint.HintType.ACTION, DBDValueHint.HintType.IMAGE);
                    public DBPImage getStatusIcon() {
        return curAttribute;
                    info.font = spreadsheet.getFont(UIElementFontStyle.ITALIC);
        }
        @NotNull
                manager.insertBefore(IResultSetController.MENU_GROUP_ADDITIONS, new Separator());

            (ResultSetRow) spreadsheet.getFocusColumnElement() :
                        pinnedAttrsCount++;
            if (cellValue == DBDVoid.INSTANCE) {
                boolean inScope = hasScope &&
                    public String getStatusText() {
            if (attr == null) {
    }
            switch (position) {
        rowBatchSize = preferenceStore.getInt(ResultSetPreferences.RESULT_SET_ROW_BATCH_SIZE);
                                SpreadsheetCommandHandler.CMD_SHOW_COLUMNS,
        if (cellValue instanceof DBDValueSurrogate) {
            html.append("</tbody>").append(rowDelimiter);

                                        }
        IGridItem gridItem = controller.isRecordMode() ?
                    }
                        if (hintText != null) {

                    if (co != null && co.getOrderPosition() > 0) {
            foregroundDefault = null;
        if (rowCount > 0) {
                    } else {
                IGridColumn attrCol = spreadsheet.getColumnByElement(attr);
                final Pair<GridPos, GridPos> targetRange;
import org.jkiss.dbeaver.ui.dialogs.EditTextDialog;
                    if (isShowAsCheckbox(attr)) {
            }
                            } catch (MalformedURLException e) {
        highlightRowsWithSelectedCells = preferenceStore.getBoolean(ResultSetPreferences.RESULT_SET_HIGHLIGHT_SELECTED_ROWS);
            return spreadsheet.getCellSelectionSize();
                if (normalColor == null || normalColor == backgroundDefault || isHighContrastTheme) {
    public ResultSetCellLocation getCellLocation(GridCell cell) {
        @Override
            for (Object cell : ss) {
            final List<IGridColumn> selectedColumns = spreadsheet.getColumnSelection();
            Control control = activeInlineEditor.getControl();
                }
        for (GridCell cell : selectedCells) {
        String quoteString = settings.getQuoteString();
            if ((value instanceof Boolean || value instanceof Number || value == null) && isShowAsCheckbox(attr)) {
        } catch (Exception e) {
import org.jkiss.dbeaver.ui.data.IValueEditor;
            openEditors.remove(this);
        }
                        }
        if (inline) {
                    }
                if (activeInlineEditor instanceof BaseValueEditor<?> bve && CommonUtils.getBoolean(
                    DBDValueHint[] hints = ahp.getAttributeHints(controller.getModel(), attributeBinding, INLINE_HINT_TYPES, DBDValueHintProvider.OPTION_TOOLTIP);
                    props.collectProperties();
                    }
            return spreadsheet.getSelection().size();
        @Override
        useNativeNumbersFormat = controller.getPreferenceStore().getBoolean(ModelPreferences.RESULT_NATIVE_NUMERIC_FORMAT);
        public int getColumnPinIndex(@NotNull IGridColumn element) {
                    return;

    }
            } else {
                return;

    public void refreshData(boolean refreshMetadata, boolean append, boolean keepState) {
            attr = getAttributeFromGrid(colObject.getParent(), rowObject);
                (altPressed ? IResultSetController.ColumnOrder.DESC : null));
                        });

                }
     *     <li>{@code (GridPos, GridPos)} if selected range is continuous</li>
        final DBDAttributeBinding attr = (DBDAttributeBinding)(recordMode ? cell.row.getElement() : cell.col.getElement());

                }
                    updateValue(value, false);
    public void setCurrentAttribute(@NotNull DBDAttributeBinding attribute) {
                }
                    attr);
                    GridPos focusPos = spreadsheet.getCursorPosition();
            if (prevCell == null || cell.row != prevCell.row) {
        }
            return null;
    private int columnOrder = SWT.DEFAULT;
        return maxIndex;
                    rowPosition >= highlightScopeFirstLine &&
        }
                            : attr.getValueHandler().getValueDisplayString(attr, cellValue, DBDDisplayFormat.UI);
            controller.redrawData(false, true);
            && !collection.isNull()
 *
                    {
            return colObject == null ? null : (ResultSetRow) colObject.getElement();
                }
        if (rowDelimiter == null) {

 * Unless required by applicable law or agreed to in writing, software
    public void setSelection(ISelection selection) {


                                ResultSetMessages.controls_resultset_viewer_show_hidden_columns,
                        revealCursor();
            for (DBDCellHintProvider hintProvider : controller.getModel().getHintContext().getCellHintProviders(attr)) {
                        IValueController.EditType.NONE, null);
        showAttributeDescription = getPreferenceStore().getBoolean(ResultSetPreferences.RESULT_SET_SHOW_DESCRIPTION);
                }
        for (IValueEditorStandalone editor : editors) {
        }
                    attr,
        public String getCellToolTip(IGridColumn colElement, IGridRow rowElement) {
                        IGridRow gridRow = spreadsheet.getRow(row);
            return controller.getModel().getCellValue(attr, row, rowIndexes, retrieveDeepestCollectionElement);
        if (copyHTML) html.append("<tbody>");
    @Override
        public Object[] getElements(boolean horizontal) {
            columnDelimiter = "\t";
                    String[][] newLines = parseGridLines(strValue, settings.isInsertMultipleRows(), settings.isIgnoreQuotes());
            if (sourcePosition == targetPosition) {
        public boolean isElementSupportsFilter(IGridColumn element) {
                            return ResultSetThemeSettings.instance.backgroundMatched;
                    strValue = (String) clipboard.getContents(TextTransfer.getInstance());
        }
            return ALIGN_LEFT;
    }
                    public String getDisplayName() {
        }
            DBDAttributeBinding column = getAttributeFromGrid(cell.col, cell.row);
        public void nextInlineEditor(boolean next) {

            } else {
                RGB mixRGB = UIUtils.blend(
                    attrs.add((DBDAttributeBinding) row.getElement());

                //boolean overNewRow = controller.getModel().getRow(rowNum).getState() == ResultSetRow.STATE_ADDED;
 *
 * DBeaver - Universal Database Manager
    @Override
                            return cellFG;
                return getAttributeText(binding);
            controller.updatePanelsContent(false);

        }
            activeInlineEditor.getControl() != null &&

        }
        }

            }
                // No inline boolean editor. Single click changes value
                    IGridRow gridRow = spreadsheet.getRow(pos.row);
        this.colorizeDataTypes = getPreferenceStore().getBoolean(ResultSetPreferences.RESULT_SET_COLORIZE_DATA_TYPES);
        IGridColumn gridColumn = spreadsheet.getColumnByElement(
                int rowNumber = row.getVisualNumber();
                if (indexesCount != nestedIndexes.length) {
                }
        }
                if (sourcePosition < targetPosition) {
                                boolean useAllColumnsAsKey = executionContext
    private boolean supportsAttributeFilter;
                if (controller.isPanelsVisible()) {
            Object cellValue = controller.getModel().getCellValue(cellLocation);
        final char quote = '"';
            return getAttributeFromGrid(

                        booleanStyles.getMode() != BooleanMode.ICON)
            if (colOffset > 0 && curPosition.col + colOffset >= colCount) {
        int normalAttrsCount = 0;
            int rowOffset = 0;
        }
                        controller,
import org.jkiss.dbeaver.model.data.*;
        this.curAttribute = null;
                        controller.setCurrentRow(model.getRow(model.getRowCount() - 1));
    private DBDDisplayFormat getValueRenderFormat(DBDAttributeBinding attr, Object value) {
                }
            if (item.getElement() instanceof DBSAttributeBase attr) {
            return false;

        }
                        ActionUtils.makeCommandContribution(
            DBDAttributeBinding attr = getAttributeFromGrid(colElement, rowElement);
            final Object value = getCellValue(gridColumn, gridRow, getRowNestedIndexes(gridRow), false);
    public void setDefaultDisplayFormat(DBDDisplayFormat displayFormat) {

        }
        }
            if (settings != null) {

                    //ResultSetRow row = (ResultSetRow) (recordMode ? colElement.getElement() : rowElement.getElement());
            if (newCol != null &&
                    final ResultSetRow row = getResultRowFromGrid(cell.col, cell.row);
        clearMetaData();
        }
            spreadsheet.redrawGrid();
        public Font getMainFontItalic() {

                }
            return DBDDisplayFormat.NATIVE;
            );

        this.spreadsheet.recalculateSizes(true);
                        editor.showValueEditor();
import org.jkiss.dbeaver.model.*;
                        continue;
        if (selection instanceof IResultSetSelection rss && rss.getController() == getController()) {
            curLine.add(cellValue.toString());
    }
    }
            UIUtils.asyncExec(() -> ((IValueEditorStandalone) activeInlineEditor).showValueEditor());
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
                    info.state |= STATE_TRANSFORMED;
                        hideTitle = NLS.bind(ResultSetMessages.controls_resultset_viewer_hide_columns_x, selectedColumns.size());
            !(activeInlineEditor instanceof IValueEditorStandalone);
                    if (recordMode) {
        GridCell prevCell = null;
                // Refresh meta if we are in record mode
                        Arrays.sort(columns, (o1, o2) -> o1.getName().compareTo(o2.getName()) * (columnOrder == SWT.UP ? 1 : -1));

            } else {
        this.highlightScopeColor = color;
            if (element != null && element.getElement() instanceof DBDAttributeBinding) {
            final ResultSetRow row = getResultRowFromGrid(gridColumn, gridRow);
                                case RIGHT -> ALIGN_RIGHT;
        if (focusPos.row >= 0) {
                        return;
 * Licensed under the Apache License, Version 2.0 (the "License");
                    String hideTitle;
                } catch (DBException e) {
            oldAttribute = controller.getModel().getVisibleAttribute(0);
                        }
    }
                );
                return showAttrOrdering;
                    }
                        getSpreadsheet().getShell(),
                    break;
                    value = ((Number) value).byteValue() != 0;
                if (settings.isCopyRowNumbers()) {
import org.eclipse.swt.dnd.Clipboard;
                if ((controller.getDecorator().getDecoratorFeatures() & IResultSetDecorator.FEATURE_LINKS) != 0) {
                // Find binding
                if (booleanStyles.getMode() != BooleanMode.TEXT) {
                    activeInlineEditor.primeEditorValue(valueController.getValue());
                            : selectedColumns.size() == 1
            DBDAttributeBinding origAttr = getBinding();
                    controller.getVisiblePanel().setFocus();
import org.jkiss.utils.ArrayUtils;
        int leftmostIndex = constraintsToMove.stream().mapToInt(c -> getConstraintPosition(c, pin)).min().getAsInt();
            boolean ignoreRowSelection)
            spreadsheet.getFocusRow() :
    public int[] getCurrentRowIndexes() {
    //private boolean showCelIcons = true;
                for (int i = prevColIndex; i < curColIndex; i++) {
                    } else {
                        @Override

            }
        //this.spreadsheet.showColumn(this.curAttribute);
                rowHeaderMenu ? IResultSetController.ContextMenuLocation.ROW_HEADER :
                Color fg = ResultSetThemeSettings.instance.foregroundSelected;
                        Color cellFG = row.colorInfo.cellFgColors[attribute.getOrdinalPosition()];
    }
            case 0 -> null;

                    } else {
                );
        }
                }

        Object cellValue = getController().getModel().getCellValue(cellLocation);
    }
                // Foreground
                    if ((rightJustifyNumbers && dataKind == DBPDataKind.NUMERIC) ||
            if (activeInlineEditor != null) {
        autoFetchSegments = controller.getPreferenceStore().getBoolean(ResultSetPreferences.RESULT_SET_AUTO_FETCH_NEXT_SEGMENT);
        IGridRow focusRow = spreadsheet.getFocusRow();
            gd.grabExcessHorizontalSpace = true;
            ResultSetRow row = getResultRowFromGrid(colElement, rowElement);
        controller.showColumnMenu(attributeBinding);
            }
            new GridLabelProvider(),
            });
                    );
                        }
        }

    private class ContentProvider implements IGridContentProvider {
        IGridRow gridRow = spreadsheet.getRowByElement(
    }
        } else if (DBUtils.isNullValue(value)) {


     * @param selection a list of positions to retrieve a continuous range from
                    if (attr.getValueHandler() != origAttr.getValueHandler()) {
                        binaryData = ContentUtils.getContentBinaryValue(new VoidProgressMonitor(), content);
        spreadsheet.layout(true, true);
        List<DBDAttributeConstraint> constraintsToMove = new ArrayList<>(columns.size());
                    }
            }
    private static final Log log = Log.getLog(SpreadsheetPresentation.class);
    public ResultSetCellLocation getCurrentCellLocation() {
                        continue;
                        }
                final String description = attributeBinding.getDescription();
                return composite.getAttributeCount();
                    }
                hintSize += hintProvider.getAttributeHintSize(
                        }
                }

import org.eclipse.ui.themes.ITheme;
        }
    public Spreadsheet getSpreadsheet() {
                                controller,
    ///////////////////////////////////////////////

                                    }
        spreadsheet.setRedraw(false);
    }
                    valueController.updateValue(BaseValueManager.makeNullValue(valueController), false);
            value = false;
                int curColIndex = selectedColumns.indexOf(cell.col);
                }

        private String getAttributeText(DBDAttributeBinding binding) {
            spreadsheet.setRedraw(true);
    }
        public int getSelectedColumnCount() {
                    normalColor.getRGB(),
                }
                if (attr.isTransformed()) {
                        }
            }
                        }
                                break;

                }
            // Set editable value
                            return ResultSetIcons.META_KEY_NA;
        @NotNull
    public DBPPreferenceStore getPreferenceStore() {
    private IValueEditor activeInlineEditor;
        return spreadsheet;

                manager.insertAfter(
                    Color color = dataTypesForegrounds.get(attribute.getDataKind());
    @Nullable

        @Override
                        50
                        }


                    }
            int colOffset = next ? 1 : -1;
            if (attr == null || row == null) {
                        }
                            )
                try {
                // columns
        }
                    //}
            spreadsheet.shiftCursor(colOffset, rowOffset, false);
                // Leave only array indexes. For each row we find it's array attribute
        if (pin) {
                        // Find corresponding grid row
    private boolean showAttributeDescription;
                    return true;
        int hScrollSelection;
                for (Integer row : rowSelection) {
                if (normalColor == null || normalColor == backgroundDefault || isHighContrastTheme) {
                    if (newPos != null) {
                    if (attr == null || row == null) {
            spreadsheet.redrawGrid();
                    return true;
            }
                spreadsheet.showCellEditor(placeholder);
            if (inQuote && c != quote) {
                    (focusPos.row - spreadsheet.getTopIndex()) * (spreadsheet.getItemHeight() + 1) + spreadsheet.getItemHeight() / 2;
        public int[] getElementRowIndexes(Object element) {
    public <T> T getAdapter(@NotNull Class<T> adapter) {
                value,
        }
                    binaryData = bValue;
            && rowObject != null
                    normalColor.getRGB(),
                    .boxed().collect(Collectors.toList());

        try {
    }
        IGridColumn focusColumn = spreadsheet.getFocusColumn();

                    return null;
        if (pin) {
                    if (colorizeDataTypes) {

                if (prevCell != null && prevCell.col != cell.col) {
                            rows.add(controller.getModel().getRow(selectedRecords[i]));
        this.spreadsheet.setLayoutData(new GridData(GridData.FILL_BOTH));

        @Nullable
                return DBeaverIcons.getImage(image);
            }
                }
                case DROP_AFTER:
                    /*if (overNewRow) {
                case NEXT:
            }
        return dataContainer != null &&
    // State
                setBinding(origAttr);
                    for (DBDValueHint hint : valueHints) {
                    IValueController.EditType.NONE,
            IGridRow gridRow = spreadsheet.getRowByElement(
                        break;
                    if (recordMode && curRow != null && curRow.getVisualNumber() > 0) {

                return row.toString();
                // This may happen in case of dynamic data types

                            return ResultSetThemeSettings.instance.backgroundMatched;
            controller.updateEditControls();

        } else {
        } else {
                Collection<GridPos> ssSelection = spreadsheet.getSelection();
                    }
                            if (inQuote) {
            info.text = formatValue(colElement, rowElement, info.value);
            if (cellHints != null) {
                !(controller.getContainer().getDataContainer() != null && controller.getContainer().getDataContainer().isFeatureSupported(DBSDataContainer.FEATURE_DATA_MODIFIED_ON_REFRESH)) &&
        public void validateDataPresence(IGridColumn gridColumn, IGridRow gridRow) {
        this.curAttribute = attribute;
    ///////////////////////////////////////////////

                            : NLS.bind(ResultSetMessages.controls_resultset_viewer_pin_columns, selectedColumns.size())
                } else {
            DBDAttributeBinding attribute,
        if (state == null) {
    @Nullable


                            toolTip.append(hintLabel).append(": ");
                }

                            break;
                        //We don't want to create another listener due to baseValueTraverseListener
            if (editorControl != null) {
            controller,
                    }
                    nestedIndexes = indexesCopy;


            }
            if (recordMode && controller.getSelectedRecords().length > 1 && curRow != null) {
    }
                control.addTraverseListener(e -> {
                final String name = attributeBinding.getName();
                        break;
                return null;
            spreadsheet.refreshData(refreshMetadata, keepState, false);
                rowOffset = -1;
        @Override
                            return cellBG;
                            for (int k = i + 1; k < length; k++) {
        super.applyChanges();
            ResultSetRow row = getResultRowFromGrid(colElement, rowElement);
                    final GridCell cell = new GridCell(colElement, rowElement);
            allConstraints.remove(constraint);
        }
        DBDAttributeBinding currentAttribute = getCurrentAttribute();
    }
            if (dataLabelProvider != null) {
            DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
                ResultSetHintContext hintContext = controller.getModel().getHintContext();
        return strValue.startsWith("http://") || strValue.startsWith("https://");
                    constraintsToMove.add(attrConstraint);
                            hideTitle,
            return backgroundDefault;
                    public DBPImage getStatusIcon() {
        // Cache preferences
        @Override
    public void dispose() {
        if (gridRow != null && gridRow.getParent() != null) {

                final GridPos rangeEnd = targetRange.getSecond();
                boolean hasScope = highlightScopeFirstLine >= 0 && highlightScopeLastLine >= 0;
            return false;
                    } else {
        if (activeInlineEditor instanceof IValueEditorStandalone editorStandalone) {
                    }
                    }
                );
            }
                        final List<DBDAttributeBinding> children = controller.getModel().getVisibleAttributes(binding);
            spreadsheet.cancelInlineEditor();

            Color headerSelectionBackground = ResultSetThemeSettings.instance.cellHeaderSelectedBackground;
            final DBDAttributeConstraint dragC = dataFilter.getConstraint(dragBinding);
            return ElementState.NONE;
        ResultSetRow curRow = controller.getCurrentRow();
 *
                                    break;
                    }
        if (pinnedAttrsCount != 0 && normalAttrsCount != 0) {
                    }
                if (CommonUtils.isEmpty(strValue)) {
        @NotNull
            ResultSetRow row = getResultRowFromGrid(colElement, rowElement);
        public IGridStatusColumn[] getStatusColumns() {
            // Check for next segment read

            if (oldRow == null) {
            } else if (item.getElement() instanceof Collection<?> col) {
        List<GridCell> selectedCells = spreadsheet.getCellSelection();
                int indexesCount = gridRow.getLevel() - lastIndex;
            );
        }
            attr = getAttributeFromGrid(colObject, rowObject);
        @Override
                                null
            if (control != null) {
                }
    private int highlightScopeLastLine;
            }
                        return null;
                    IResultSetController.ContextMenuLocation.DATA;
        if ((delta < 0 && leftmostIndex + delta < 0) || (delta > 0 && rightmostIndex + delta >= allConstraints.size())) {
    public class SpreadsheetValueController extends ResultSetValueController implements IMultiController {
        TextEditorUtils.enableHostEditorKeyBindingsSupport(controller.getSite(), spreadsheet);
        @Nullable
                if (ac != null) {
                return composite.toString();

            }
            if (binaryData == null && (column.getDataKind() == DBPDataKind.BINARY || column.getDataKind() == DBPDataKind.CONTENT)) {
        for (Object column : columns) {
import org.jkiss.utils.xml.XMLUtils;
    private BooleanStyleSet booleanStyles;
import org.eclipse.ui.menus.CommandContributionItem;
        public void updateValue(@Nullable Object value, boolean updatePresentation) {
                    if (e.keyCode == SWT.ESC || e.keyCode == SWT.CR) {
import org.eclipse.swt.widgets.Display;
                    }
        }
        }
                }
                    if (!ArrayUtils.isEmpty(origRowIndexes)) {
        StringBuilder tdt = new StringBuilder();
            }
    }
    }
        public Color getHeaderForeground(@Nullable IGridItem item, boolean selected) {
                            if (attr == null || row == null ||
 * limitations under the License.
                if (valueHints != null) {
        boolean recordMode = controller.isRecordMode();
    public void changeSorting(Object columnElement, final int state) {
            if (column instanceof DBDAttributeBinding) {
            // Record mode
                }
                        return row.colorInfo.rowForeground;
    private boolean showWhitespaceCharacters;
                                newValue = attr.getValueHandler().getValueFromObject(session, attr.getAttribute(), value, true, false);
            }
            {
            } else if (rowObject.getElement() instanceof DBSAttributeBase attr) {
        public List<IGridHint> getCellHints(IGridColumn colElement, IGridRow rowElement, Object cellValue, int options) {
        IValueController.EditType[] supportedEditTypes = valueController.getValueManager().getSupportedEditTypes();
                        (cellValue instanceof DBDComposite && controller.isRecordMode())
                control.setData(DATA_VALUE_CONTROLLER, valueController);
                            }
                cellValue.append(c);
    // We need to check this recursively because of multi-dimensional arrays

                            return color;
                        if (rowNum >= spreadsheet.getItemCount()) {
            if (element.getElement() instanceof DBDAttributeBinding attributeBinding) {
                        for (DBDValueHint hint : hints) {
                }
        private Color getCellBackground(
            }
                    return UIUtils.getSharedColor(booleanStyles.getStyle((Boolean) cellValue).getColor());
                for (DBDAttributeHintProvider ahp : hintContext.getColumnHintProviders(attributeBinding)) {
            }
        }

    @Override
                if (foregroundDefault == null) {
    private Color foregroundDefault;
            prevCell = cell;
                    if (hint.hasAction()) {
            if (column != null && column.getElement() instanceof DBDAttributeBinding binding) {
            return spreadsheet.getSelection().toArray();
                    }
                    selectedColumns.clear();
        if (isShowAsCheckbox(attr)) {
        @Override

                    }

                    if (controller.getAttributeReadOnlyStatus(attr, true, false) != null) {
            if (placeholder != null) {
                Clipboard clipboard = new Clipboard(Display.getCurrent());
    public Object saveState() {
                if (attr == valueController.getBinding() && row == valueController.getCurRow()) {
                }
        this.dataTypesForegrounds.put(DBPDataKind.STRING, ResultSetThemeSettings.instance.dtStringColor);
    }
        public void dispose() {
                        return null;
    // Misc
                        }
                return getAttributeFromGrid(colObject, rowObject.getParent());
            return "";
    @Override
                    if (editor.getControl() != null && !editor.getControl().isDisposed()) {
    }
        if (binaryData != null) {
                    foregroundDefault = controller.getDefaultForeground();
                        public void run() {
                    Object value = activeInlineEditor.extractEditorValue();
    }
        }
        IGridColumn newCol;
            if (ssSelection.isEmpty()) {
            }
                        for (String value : line) {
                        manager.insertBefore(IResultSetController.MENU_GROUP_ADDITIONS, new Action(pinnedTitle) {
        } else if (isAttributeExpandable(cell.row, attr)) {
                    targetRange = new Pair<>(new GridPos(0, 0), null);
            controller.getSite(),
                return null;
            return true;
                    }
                            controller.addNewRow(false, true, false);
                    case STRUCT:
            GridPos pos = (GridPos) element;
        IGridLabelProvider labelProvider = spreadsheet.getLabelProvider();
        }
                .collect(Collectors.toList());
                if (spreadsheet.getItemCount() == 0) {
            placeholder.addDisposeListener(e -> controller.updateStatusMessage());
        public boolean isElementExpandable(@NotNull IGridItem item) {

        }
                                rowIdentifier.getAttributes().stream()
                        controller.addNewRow(RowPlacement.AT_END, false, false);
                        if (row.getState() == ResultSetRow.STATE_ADDED) {
                        if (cellValue instanceof Boolean || cellValue == null) {
                        .map(x -> dataFilter.getConstraint(((DBDAttributeBinding) x.getElement()).getTopParent()))
    }
            }
        spreadsheet.addControlListener(new ControlAdapter() {
    private Color highlightScopeColor;
import org.jkiss.dbeaver.ui.navigator.database.NavigatorThemeSettings;
                    @Override
                            }
                    if (selectedColumns.size() == 1) {
        }
        ResultSetCellLocation cellLocation = new ResultSetCellLocation(attr, row, getRowNestedIndexes(focusRow));
                            rows.add((ResultSetRow) col.getElement());
                if (prevCell != null) {
            }

                    }

        @Override
            spreadsheet.refreshData(false, true, false);
        this.highlightScopeLastLine = lastLine;
                }
        activateTextKeyBindings(controller, spreadsheet);
                .owned(SpreadsheetPresentation.this);
            recordMode ? this.curAttribute : curRow);

                    tip.append("\n").append(SpreadsheetMessages.tooltip_description).append(": ").append(description);
                            }
 * See the License for the specific language governing permissions and
            return getRowNestedIndexes(spreadsheet.getRow(focusPos.row));
            return null;
        }
                            if (newCell != null) {
        public boolean hasChildren(@NotNull IGridItem item) {
        private boolean hasExpandableElements(@NotNull IGridRow row) {
        }
            && binding.getDataKind() == DBPDataKind.ARRAY
                if (!valueController.isReadOnly()) {
        });
                if (valueHints != null) {
        Map<Transfer, Object> formats = new LinkedHashMap<>();
        } else if (isArrayColAndFirstRow(colObject, rowObject)) {
     * <ul>

                if (object instanceof GridCell cell) {
            } else if (item.getElement() instanceof DBDComposite composite) {
    @Override
                        attr = ResultSetCellLocation.getLeafAttribute(attr, origRowIndexes);
                // Add hints
                            GridCell newCell = spreadsheet.posToCell(new GridPos(curPos.col, gridRow.getVisualPosition()));
            inline ? IValueController.EditType.INLINE : IValueController.EditType.EDITOR, placeholder);
                        if (cellValue instanceof Number) {
            valueController.updateValue(value, true);
                return attr;
                        controller.getCurrentRow(),
            }
    }
                    );
                        IGridRow gridRow = spreadsheet.getRow(rowNum);
            } else if (rowObject.getParent() != null) {
                        ResultSetRow curRow = controller.getCurrentRow();
                    }
                }*/
        }
                        ResultSetThemeSettings.instance.backgroundSelected.getRGB(),
            int rowNum = row.getVisualNumber();
                    } else {
                            if ((it.stateMask & SWT.SHIFT) == 0) {
            placeholder.setLayoutData(gd);
            } else {
                        setConstraintPosition(constraints.get(i), pin, i - 1);
                    new ResultSetCellLocation(attr, row, getRowNestedIndexes(cell.row)),
        if (value instanceof Number number) {
                            rows.add(rsr);
            if (cellValue instanceof Boolean || cellValue instanceof Number || cellValue == null) {
    private boolean showAttrOrdering;
        }
            }
            spreadsheet.cancelInlineEditor();
                        normalAttrsCount++;
        showBooleanAsCheckbox = preferenceStore.getBoolean(ResultSetPreferences.RESULT_SET_SHOW_BOOLEAN_AS_CHECKBOX);
                            @Override
            this);
import org.jkiss.code.NotNull;
                } else {
        if (changed) {
                spreadsheet.getRow(pos.row)
                    for (DBDValueHint hint : valueHints) {
        if (rowObject == null) {

    public void updateValueView() {
    // UI modifiers
                    if (isShowAsCheckbox(attr)) {
            return rowObject == null ? null : (ResultSetRow) rowObject.getElement();
                            DBCExecutionContext executionContext = getController().getExecutionContext();
                    }
    public Map<Transfer, Object> copySelection(ResultSetCopySettings settings) {


            }
        }
                if (cell instanceof GridPos gp) {
                        }
                        (cellValue instanceof DBDCollection col && !col.isEmpty()) ||
                    }
        return false;
                        }
     */
            }
            if (element == null) {
        this.dataTypesForegrounds.put(DBPDataKind.DATETIME, ResultSetThemeSettings.instance.dtDateTimeColor);
                }
        if (focusPos.col >= 0) {
        @Override
            return adapter.cast(SpreadsheetFindReplaceTarget.getInstance().owned(this));
    }
     * Retrieves a continuous range from a set of grid coordinates.
    }
        showWhitespaceCharacters = preferenceStore.getBoolean(ResultSetPreferences.RESULT_SET_SHOW_WHITESPACE_CHARACTERS);
            return selected ? cellHeaderSelectionBackground : ResultSetThemeSettings.instance.cellHeaderBackground;
            this.cellHeaderSelectionBackground = new Color(getSpreadsheet().getDisplay(), cellSel);
        final DBDAttributeBinding attr = getAttributeFromGrid(columnElement, rowElement);
        this.spreadsheet.addMouseWheelListener(e -> {
            return controller.getModel().getCellValue(cellLocation);
                }

                                }
        }
                                continue;
                    return SWT.DEFAULT;
        final ResultSetRow row = getResultRowFromGrid(cell.col, cell.row);
                    (!(cellValue instanceof Collection<?> col && col.isEmpty()))
        @Override
                        continue;
                    }

    }

            }

    @Override
            }
                        return ResultSetMessages.controls_resultset_results_edit_key;
                }
            return;
                    if (row.colorInfo.rowBackground != null) {
                    final boolean allPinned = selectedColumns.stream()
                                    (k == length - 1 ||
        if (controller.isRecordMode()) {
            }
                try (DBCSession session = DBUtils.openUtilSession(new VoidProgressMonitor(), controller.getDataContainer(), "Advanced paste")) {
    protected void performHorizontalScroll(int scrollCount) {
        boolean rowHeaderMenu
    private Pair<GridPos, GridPos> getContinuousRange(@NotNull List<GridPos> selection) {
                        IGridRow gridRow = spreadsheet.getRowByElement(curRow.getVisualNumber(), curRow);
        this.spreadsheet.setCursor(cell, false, true, true);
        public String getText(@NotNull IGridItem item) {
                        "You can't perform this operation on a multiple range selection.\n\nPlease select a single range and try again."
                int prevColIndex = selectedColumns.indexOf(prevCell.col);
            if (cellValue instanceof List<?>) {
                }
                        }
                            }
        @Override
        }
        final List<String[]> lines = new ArrayList<>();
                        if (CommonUtils.equalObjects(sourceValue, cellValue)) {
                    }
            // Show cell properties
                DBSEntityAttribute entityAttribute = attr.getEntityAttribute();
        }
        if ((value instanceof Boolean || value instanceof Number || value == null) && isShowAsCheckbox(attr)) {
                controller.readNextSegment();
    ///////////////////////////////////////////////
    @Override
                !controller.isRefreshInProgress() &&
                            }
                    String defaultValue = entityAttribute.getDefaultValue();
            }
        public Object[] getChildren(@NotNull IGridItem item) {
                backgroundDefault = controller.getDefaultBackground();
            newCol = null;
        DBPPreferenceStore preferenceStore = getPreferenceStore();

    public static final String PRESENTATION_ID = "spreadsheet";
                    final ResultSetRow sourceRow = getResultRowFromGrid(sourceCell.col, sourceCell.row);
                            ? NLS.bind(ResultSetMessages.controls_resultset_viewer_pin_column, ((DBDAttributeBinding) selectedColumns.get(0).getElement()).getName())
                toolTip.insert(0, "Value: ");
            controller,
    @Override
        try {

                    }
            return ResultSetThemeSettings.instance.cellHeaderForeground;
                spreadsheet.redrawGrid();
            if (gridItem.getElement() instanceof DBDAttributeBinding ab) {
        List<DBDAttributeConstraint> allConstraints = getOrderedConstraints(dataFilter, pin);
                    if (attr == null || row == null) {
            controller.getSite(),
                }
        spreadsheet.refreshData(false, true, false);
    }
 * You may obtain a copy of the License at
import org.eclipse.jface.action.IMenuManager;
                    java.util.regex.Pattern searchPattern = findReplaceTarget.getSearchPattern();
            }
        this.spreadsheet.showColumn(attribute);
        } else {
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
            } else {
            if (hasHints) {
     *
    private static boolean isHyperlinkText(String strValue) {
                return fg;
                    } else {
                if (constraint != null && constraint.hasCondition()) {
                        (rightJustifyDateTime && dataKind == DBPDataKind.DATETIME)) {
                    hintOptions

    }


        for (DBDAttributeConstraint constraint : constraintsToMove) {
                return value;
            StringBuilder toolTip = new StringBuilder();
/*
import org.jkiss.dbeaver.ui.properties.PropertySourceDelegate;
                return backgroundDefault;
                    } else {

            controller.setDataFilter(dataFilter, false);
    @Nullable
                return valueError.getErrorTitle();

                    selectedCellColor.getRGB(),
            } else if (oldRow.getVisualNumber() >= rowCount) {
    public static int getNextPinIndex(@NotNull DBDDataFilter dataFilter) {
        @Override
            String cellText = column.getValueRenderer().getValueDisplayString(
            constraint.setVisualPosition(position);
            boolean cellSelected,
            }
import org.eclipse.swt.widgets.Control;
                            if (cellValue instanceof List<?>) {
 * you may not use this file except in compliance with the License.
            if (columnBounds != null) {
                }
            }
                    return false;
            Control editorControl = activeInlineEditor.getControl();
            }
    }


        if (copyHTML) html.append("<table border=\"1\">");
        setSelection(selection, true);
    private static int getConstraintPosition(@NotNull DBDAttributeConstraint constraint, boolean pin) {
                }

                if (!hasScope || inScope) {
        @Override
                        lastIndex--;
            // Update controls
                    }
                if (child == value) {
                        DBUtils.getObjectFullName(attr, DBPEvaluationContext.UI), readOnlyStatus),
                    DBDDataFilter dataFilter = controller.getModel().getDataFilter();
                DBPImage image = DBValueFormatting.getObjectImage(attr.getAttribute());
                }

                if (cellValue instanceof DBDComplexValue) {
            Integer pinIndex = ac.getOption(DBDAttributeConstraintBase.ATTR_OPTION_PINNED);
                        controller.getSite(),

            boolean retrieveDeepestCollectionElement
        }
                return false;
                    rowPosition <= highlightScopeLastLine;
                        if (copyHTML) html.append("<td></td>");
                                continue;
            controller.refreshHintCache(updatedAttrs, updatedRows, null);
            if (element.getElement() instanceof DBDAttributeBinding binding) {
        return formats;
                }

            if (gridRow.getParent() != null && !spreadsheet.isCellExpanded(gridRow.getParent(), gridColumn)) {
                        return ResultSetMessages.controls_resultset_results_read_only_status;
        public List<DBDAttributeBinding> getSelectedAttributes() {
            spreadsheet.getFocusColumn();
                    for (int i = sourcePosition + 1; i <= targetPosition; i++) {
        if (!cellValue.isEmpty()) {
            ResultSetRow row = getResultRowFromGrid(gridColumn, gridRow);
            if (copyHTML) html.append("<thead>");
        if (controller.isRecordMode()) {
                        hideTitle = NLS.bind(ResultSetMessages.controls_resultset_viewer_hide_column_x, columnToHide.getName());
            }
        public void resetColors() {
                final String bg = dataLabelProvider.getCellBackground(attribute, row.getVisualNumber());
                spreadsheet.cancelInlineEditor();
import org.jkiss.dbeaver.ui.controls.resultset.panel.valueviewer.ValueViewerPanel;
                    return spreadsheet.getFont(UIElementFontStyle.BOLD);

        @Override
        spreadsheet.setColumnScrolling(!getPreferenceStore().getBoolean(ResultSetPreferences.RESULT_SET_USE_SMOOTH_SCROLLING));
                            return ResultSetIcons.META_TABLE_NA;
            page.setPropertySourceProvider(object -> {
        GridPos position = spreadsheet.getCursorPosition();

                            ? info.text.toString()
            html.append("</table>").append(rowDelimiter);
            }
                    }
                } else {
                info.background = getCellBackground(
                        String hintLabel = hint.getHintLabel();
            ResultSetRow row = getResultRowFromGrid(gridColumn, gridRow);
            }
                            openValueEditor(true);
        }

    public boolean isMaximizeSingleColumn() {
    @Nullable
    public boolean shiftColumns(@NotNull List<Object> columns, int delta) {
        if (columnDelimiter == null) {
                            info.state |= STATE_LINK;
                        DBDRowIdentifier rowIdentifier = getController().getModel().getDefaultRowIdentifier();

                    selectedRowIndexes.add(resultSetRow.getVisualNumber());
            }
        @Override
                        }
            Collection<GridPos> ssSelection = spreadsheet.getSelection();
        return null;
                            15
            newRow = cell.getRow();
                    }
                        }
                return columnOrder;
        UIUtils.dispose(this.cellHeaderSelectionBackground);
        ) {

    private boolean isHighContrastTheme = false;
        if (!curLine.isEmpty()) {
        } else {
                    case ANY:
        return gridValueFormat;
                            continue;
                            null
        public Object getGridOption(String option) {
                                newValue = null;
                                controller.getAttributeReadOnlyStatus(attr, true, false) != null
            }
                if (attributeBinding.isRequired()) {
                    });
                        if (rowIdentifier != null && !rowIdentifier.isIncomplete()) {
                        row = controller.getCurrentRow();
                if (attrCol != null) {
            activeInlineEditor.createControl();
                        attr = (DBDAttributeBinding) spreadsheet.getRowElement(pos.row);
                        getPreferenceStore().getString(ResultSetPreferences.RESULT_SET_INLINE_ENTER))) {
                    } else {
            changed = newRow != null && curAttribute != newRow.getElement();

                    DBValueFormatting.getObjectImage(attrBase));

                    ResultSetRow row;

            }
            tdt.append(cellText);
        int pinnedAttrsCount = 0;
        @Override
            // Switch boolean value
                    cellSelection.add(gp);

            activeInlineEditor = null;
                            tip.append("\n").append(hint.getHintText());
            value = true;
        int rowCount = controller.getModel().getRowCount();
        List<IGridColumn> selectedColumns = spreadsheet.getColumnSelection();

            return UIStyles.getContrastColor(background);
            spreadsheet.showSelection();
            // Get indexes for parent node
            if (pinIndex != null) {
    }
        if (supportedEditTypes.length == 0) {
    private boolean isArrayColAndFirstRow(@Nullable IGridColumn colObject, @Nullable IGridRow rowObject) {
                    }
                controller.updatePanelsContent(false);
        public int getCollectionSize(@NotNull IGridColumn colElement, @NotNull IGridRow rowElement) {
                Color selectedCellColor;
                        SpreadsheetCommandHandler.CMD_COLUMNS_FIT_SCREEN));
                        } else if (cellValue.isEmpty()) {
     */
            return null;
    }
                tdt.append(columnText);

                column.getAttribute(),
        if (activeInlineEditor != null) {
        // The control that will be the editor must be a child of the Table
        } else if (adapter == IFindReplaceTarget.class) {
                && !controller.isAllAttributesReadOnly();
                setConstraintPosition(dragC, pin, targetPosition);
                        if (!rows.contains(rsr)) {
                        toolTip.append("\n");
        if (oldAttribute == null && controller.getModel().getVisibleAttributeCount() > 0) {
import org.jkiss.dbeaver.model.impl.data.DBDValueError;
                    if (controller.isRecordMode()) {
        ResultSetRow curRow = controller.getCurrentRow();
                    valueController.getValueManager().contributeProperties(props, valueController);
            gridItem = gridItem.getParent();
        this.booleanStyles = BooleanStyleSet.getDefaultStyles(getPreferenceStore());

        private boolean isAttributeExpandable(@Nullable IGridRow row, @NotNull DBSAttributeBase attr) {
        @Override
        public int getSelectedCellCount() {
                    while (rangeEnd == null && rowNum + newLines.length > spreadsheet.getItemCount()) {
        }
                    if (cellValue instanceof Number) {

    }
        final boolean recordMode = getController().isRecordMode();
        Composite placeholder = null;
                            controller.setCurrentRow(null);
            if (spreadsheet.getCellSelectionSize() == 1 && getPreferenceStore().getBoolean(ResultSetPreferences.RESULT_SET_MARK_CELL_VALUE_OCCURRENCES)) {
                // This happens in record mode and dynamic databases

                return attrs;
import org.eclipse.osgi.util.NLS;
                return new Point(columnBounds.x + 20, columnBounds.y);
                                    .getPreferenceStore()
            if (settings.isCopyRowNumbers()) {
                StringBuilder tip = new StringBuilder();
                    if (getController().getModel().getDataFilter().hasHiddenAttributes()) {
        byte[] binaryData = null;
                    @Override
import org.eclipse.swt.SWT;

                                    .getContainer()
        }
                    final boolean allUnpinned = selectedColumns.stream()
        }
                        );
                    }

        formats.put(TextTransfer.getInstance(), tdt.toString());

        }
    }
                    tdt.append(rowDelimiter);
                                new ResultSetCellLocation(binding, curRow));
                    ResultSetRow row =  getResultRowFromGrid(gridColumn, gridRow);
        }
                }
            spreadsheet.refreshData(false, true, false);
            for (IGridColumn sRow : spreadsheet.getColumnSelection()) {
                if (booleanStyles.getMode() == BooleanMode.TEXT) {
            return gridHints;
        }
            return getResultRowFromGrid(
                        //removing any information about traverse event and setting it to TRAVERSE_NONE
            if ((IGridContentProvider.STATE_EXPANDED & cellInfo.state) != 0) {
                    }
                    return rows.toArray();
            try {
                            if (rowIdentifier.isIncomplete()) {
                    IResultSetController.MENU_GROUP_ADDITIONS,
        @Override
import org.eclipse.jface.viewers.ISelection;
        this.spreadsheet.addSelectionListener(new SelectionAdapter() {


            }
        public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
        } else {
                if (attrConstraint != null) {
            return SWT.NONE;
        this.dataTypesForegrounds.put(DBPDataKind.BOOLEAN, ResultSetThemeSettings.instance.dtBooleanColor);
                curRowIndexes.removeAll(selectedRowIndexes);
            if (cellHints != null) {
        @Override
                        targetPosition++;
                }
            }

            tdt.append(rowDelimiter);
            return spreadsheet.getSelection().iterator();
        }
                activeInlineEditor.setDirty(false);
            if (settings.isCut()) {
                if (colorizeDataTypes && !DBUtils.isNullValue(cellValue)) {
            } else if (rowObject.getElement() instanceof DBDAttributeBinding attr) {
                        if (searchPattern.matcher(cellText).find()) {
        void registerEditor(IValueEditorStandalone editor) {
                return supportsAttributeFilter;

                        if (model.getRowCount() > 0) {
                        "Advanced paste",
                            }
                boolean odd = rowRelativeNumber < rowBatchSize;
            }
            newCol = cell.getColumn();
        }
            }
                                return "No unique key was found. Data modification is not possible.";
        return nestedIndexes;
                (controller.isRecordMode() || spreadsheet.isRowVisible(rowNum))) {

                        }
        @Override
        this.dataTypesForegrounds.put(DBPDataKind.BINARY, ResultSetThemeSettings.instance.dtBinaryColor);
                    }
                for (int i = 0; i < selection.size(); i++) {
                }
        });
import org.jkiss.dbeaver.ui.controls.bool.BooleanMode;
                DBDValueHint[] valueHints = hintProvider.getCellHints(
    @Nullable
                Object[] elements = spreadsheet.getContentProvider().getElements(false);
            int oldIndex = getConstraintPosition(constraint, pin);
    @Override
            String readOnlyStatus = controller.getAttributeReadOnlyStatus(attr, true, true);

        public List<ResultSetRow> getSelectedRows() {
                        // No inline editors for readonly columns
    // Filtering
            return constraints.stream()
            }
            }
                                if (strValue.charAt(k) == quote &&
        StringBuilder html = new StringBuilder();
            Object value = spreadsheet.getContentProvider().getCellValue(cell.col, cell.row, false);
                                inQuote = false;
                curRow = resultSetRow;
                }
     *
                    tip.append(" NOT NULL");
        }
                    case quote:
            Object value = controller.getModel().getCellValue(
                            final DBDAttributeBinding attr = getAttributeFromGrid(colElement, gridRow);
                } catch (DBException e) {
                return switch (attr.getDataKind()) {

            this,
                    IGridRow gridRow = spreadsheet.getRow(pos.row);
                // Image
                GridPos min = selection.get(0);
    public void clearMetaData() {
        @NotNull
            return -1;
                    if (row.colorInfo.rowForeground != null) {
        spreadsheet.updateScrollbars();
    @Override
        return colObject != null
            if (rowObject == null) {
        applyCurrentThemeSettings();
                // Font

                if (!curRowIndexes.isEmpty()) {
                && controller.getAttributeReadOnlyStatus(attr, true, true) != null
        IGridRow focusRow = spreadsheet.getFocusRow();
                if (isShowAsCollection(gridRow, gridColumn, value)) {
                CommonUtils.isBitSet(controller.getDecorator().getDecoratorFeatures(), IResultSetDecorator.FEATURE_EDIT)
    public void setSelection(@NotNull ISelection selection, boolean reflect) {

        if (copyHTML) {
                return null;
        DBDAttributeBinding attr = getAttributeFromGrid(focusColumn, focusRow);
                        value = defaultValue;
    }
                        if (cellFG != null) {
    public static final EnumSet<DBDValueHint.HintType> INLINE_HINT_TYPES = EnumSet.of(
    @NotNull
        }
                    updateGridCursor((GridCell) e.data);

                    }
        @Override
            }
                if (attr != null) {
            final DBDAttributeDecorator dataLabelProvider = getController().getDecorator().getDataLabelProvider();
    private static class ViewState {
        } else {
                rowIdentifier.getUniqueKey().getConstraintType() != DBSEntityConstraintType.PRIMARY_KEY);
        public boolean isEmpty() {

    private int highlightScopeFirstLine;
        }
                return tip.toString();
                            color.getRGB(),
        while (gridItem != null) {
                    if (isShowAsCheckbox(attr)) {
    
import java.net.MalformedURLException;


                        } else {
        return ResultSetThemeSettings.instance.backgroundDeleted;
                if (fg != null) {
            super(controller, cellLocation, editType, inlinePlaceholder);

        public String getDescription(IGridItem element) {
        public Color getHeaderReadOnlyColor() {
                final String typeName = attributeBinding.getFullTypeName();
            if (!controller.isRecordMode() && showOddRows && !isHighContrastTheme) {
                    return booleanStyles.getStyle((Boolean) value).getText();
                }
            if (prevCell != null && prevCell.col != cell.col) {
            if (item.getElement() instanceof DBDAttributeBinding attr) {
                if (targetRange == null) {
            if (isShowAsCheckbox(attr) && getPreferenceStore().getBoolean(ResultSetPreferences.RESULT_SET_CLICK_TOGGLE_BOOLEAN)) {
            }
                    ResultSetThemeSettings.instance.backgroundSelected.getRGB(),
                new GridCell(gridColumn, gridRow), false, true, true);
                if (row != null && attr != null && isShowAsCheckbox(attr)) {
    }
    private boolean rightJustifyNumbers = true;
import java.util.*;
                        );
                        // Remove disposed editor from the list
        ResultSetRow curRow = controller.getCurrentRow();
                    if (row.colorInfo.cellFgColors != null) {
            String label = CommonUtils.isEmpty(binding.getLabel()) ? binding.getName() : binding.getLabel();
        @NotNull

                    INLINE_HINT_TYPES,
                    }
        }

                final GridPos rangeStart = targetRange.getFirst();

            UIUtils.showMessageBox(getSpreadsheet().getShell(), "Wrong link", "Can't navigate to NULL value", SWT.ICON_ERROR);
            return null;
            && colObject.getParent() != null

                // Background
                    }
        @Override
        super.createPresentation(controller, parent);
        if (colObject != null && rowObject == null) {
            }
                final GridCell sourceCell = spreadsheet.getCursorCell();
    private boolean isShowAsCheckbox(DBDAttributeBinding attr) {
                List<ResultSetRow> rows = new ArrayList<>();
            if (attr == null) {
                    info.image = cellExpanded ? UIIcon.TREE_COLLAPSE : UIIcon.TREE_EXPAND;
            placeholder = new Composite(spreadsheet, SWT.NONE);
        @NotNull
                        final String strValue = info.text != null
        List<IValueEditorStandalone> editors = new ArrayList<>(openEditors.values());
    @Override
                        } else {
        }
                        }
        if (curAttribute == null) {
    public void scrollToRow(@NotNull RowPosition position) {
            DBDAttributeBinding attr = getAttributeFromGrid(gridColumn, gridRow);
                }
                    // Enable panel
                // Switch boolean value
                            }
                    }

        }

                            // Search for end quote
                                spreadsheet.setCursor(newCell, false, true, true);
    @Override
            final int colCount = spreadsheet.getColumnCount();
        closeEditors();
    }
                if (DBUtils.isNullValue(cellValue)) {
                int rowRelativeNumber = rowNumber % (rowBatchSize * 2);
               (rowIdentifier == null || !rowIdentifier.hasAttribute(attr) ||
        if (attr == null || row == null) {
        spreadsheet.scrollHorizontally(scrollCount);
                        }
                        controller.setCurrentRow(model.getRow(curRow.getVisualNumber() - 1));
                        break;
                return col.toArray();
                        }
            }
            if (dataLabelProvider != null) {
                                continue;
                    controller.getModel(),
            }
                        } else {
            } else {
                    }
    @Override

                    if (attrConstraint.hasOption(DBDAttributeConstraintBase.ATTR_OPTION_PINNED)) {
                return null;
                    targetRange = getContinuousRange(List.copyOf(spreadsheet.getSelection()));
                DBDAttributeConstraint ac = controller.getModel().getDataFilter().getConstraint(attr);
                                }
        } finally {
                    });
    void fillContextMenu(
                                    return ElementState.EXPANDED;
        }
            int hintOptions = DBDValueHintProvider.OPTION_INLINE;
                            IGridColumn colElement = spreadsheet.getColumn(colNum);
                    int prevColIndex = selectedColumns.indexOf(prevCell.col);
        public Color getHintForeground() {
        public ElementState getDefaultState(@NotNull IGridColumn element) {
            ResultSetModel model = controller.getModel();
                        if (it.detail == SWT.TRAVERSE_RETURN) {
                    manager.insertAfter(IResultSetController.MENU_GROUP_ADDITIONS, new Action("Hide row(s)") {
                tdt.append("#");
    private boolean supportsDataFilter() {
                .getInstance()
    }
    private boolean showAttributeIcons;

        }
                    }
    @Override
                    if (i > 0 && (cur.row - max.row > 1 || cur.col - max.col > 1)) {
                        if (c == rowDelimiter && splitRows) {

                        controller,
                    log.warn("Bad selection object: " + cell);
    @Nullable
        if (curRow != null && this.curAttribute != null) {

    }
        private Color getCellForeground(DBDAttributeBinding attribute, ResultSetRow row, Object cellValue, Color background, boolean selected) {
            return new ArrayList<>(spreadsheet.getSelection());
                }
            ResultSetRow row,
            IValueController.EditType.NONE, null);
    private boolean calcColumnWidthByValue;
        };
                        if (selectedRecords[i] < controller.getModel().getRowCount()) {
            }
                GridPos max = new GridPos(min);
                } else {
                    }
            controller.redrawData(false, false);

    @Override
                .collect(Collectors.toList());
                if (copyHTML) html.append("<tr>");
                        normalColor.getRGB(),
    }
            {
    }
                        if (cellValue instanceof Number number) {

        DBDRowIdentifier rowIdentifier = attr.getRowIdentifier();
        @Override

                        }
                if (!tdt.isEmpty()) {

            public void widgetSelected(SelectionEvent e) {
            return constraint.getVisualPosition();
                        if (color != null) {
                    GridCell newPos = spreadsheet.posToCell(new GridPos(newColumnIndex, focusPos.row));
        for (ResultSetRow selRow : getSelection().getSelectedRows()) {
                // and use it only once
        if (recordMode && row != null) {
        spreadsheet.redrawGrid();
        @Nullable IGridRow rowObject,
                if (controller.isRecordMode()) {
                        } finally {
                    System.arraycopy(nestedIndexes, lastIndex, indexesCopy, 0, indexesCount);
            }
        }
                new IGridStatusColumn() {
                        if (cellBG != null) {
                        return null;
            lines.add(curLine.toArray(new String[0]));
 */
            if (item instanceof IGridRow row) {
                    setCurRow(row, spreadsheet.getPresentation().getCurrentRowIndexes());
                            getSpreadsheet().notifyListeners(SWT.KeyDown, applyEvent);

                                    .getBoolean(ResultSetPreferences.RS_EDIT_USE_ALL_COLUMNS);
                }
                        spreadsheet.shiftCursor(0, -spreadsheet.getItemCount(), false);
                                for (IGridColumn column : selectedColumns) {
        }
                    manager.insertAfter(
            }
                    }
        @NotNull IMenuManager manager,
        SpreadsheetValueController(
                            if (binaryContents != null) {
                    }
                case LAST:
                        }
            if (gr.getElement() instanceof DBSTypedObject b) {
            }
                } else {
                            clipboard.dispose();
            if (readOnlyStatus != null) {
            return null;
                return 0;
        }
                    GridColumn gridColumn = spreadsheet.getColumn(pos.col);
            formats.put(SimpleByteArrayTransfer.getInstance(), binaryData);

        this.spreadsheet = new Spreadsheet(
        GridPos focusPos = spreadsheet.getFocusPos();
                    if (row.colorInfo.cellBgColors != null) {
                                        if (allUnpinned) {

        }
    public void fillMenu(@NotNull IMenuManager menu) {
                    }
            } else {

        @Override
                    }
                    final SpreadsheetValueController valueController = new SpreadsheetValueController(
                }
            return;
        } else {
import org.jkiss.dbeaver.DBException;
            }
            this.columnOrder = SWT.DEFAULT;
                DBDValueHint[] valueHints = hintProvider.getAttributeHints(
            }
                }
        if (Boolean.TRUE.equals(value)) {
            openValueEditor(true);
                    }
            // Add tips
        for (int i = 0; i < allConstraints.size(); i++) {
                            curLine.clear();
            }
            switch (row.getState()) {
        String columnDelimiter = settings.getColumnDelimiter();
                for (IGridRow pr = rowObject.getParent(); pr != null; pr = pr.getParent()) {
        return null;
                        info.font = spreadsheet.getFont(booleanStyles.getStyle((Boolean) cellValue).getFontStyle());
            }
import org.jkiss.dbeaver.model.exec.DBExecUtils;
                case PREVIOUS:
        }
                Collection<GridPos> ssSelection = spreadsheet.getSelection();
    private boolean rightJustifyDateTime = true;
        if (columnElement == null) {

                } else {
        boolean recordMode = controller.isRecordMode();
        public Color getBackground(IGridItem element) {
                }
                }
                                // If we have the range end and it spans more than one column, then limit insertion to that range

                        }
 * Visualizes results as grid.
        spreadsheet.setDefaultFocusRow();
            try {
                        } else if (rowIdentifier.isIncomplete()) {
                                rowIdentifier.getUniqueKey().getConstraintType().getName() + " " +
            fireSelectionChanged(selection);
                            return
import org.jkiss.dbeaver.ui.*;
            if (backgroundDefault == null) {
                    e.doit = false;
        return showBooleanAsCheckbox && attr.getPresentationAttribute().getDataKind() == DBPDataKind.BOOLEAN;
                    return ResultSetThemeSettings.instance.backgroundDeleted;
                    attr.getAttribute(),
                            lines.add(curLine.toArray(new String[0]));
        return null;

        if (this.columnOrder != SWT.NONE) {
                    DBPDataKind dataKind = attr.getDataKind();
                    clipboard.dispose();
                            colNum++;

                    ActionUtils.makeCommandContribution(
        @NotNull
        @Override
                    String hintText = hint.getText();
                            controller.setCurrentRow(model.getRow(0));
        return controller.isRecordMode() ?
        }
            if (value instanceof DBDCollection collection && !collection.isNull()) {
            }
            DBDAttributeBinding attr = element instanceof IGridColumn gc ? getAttributeFromGrid(gc, null) : null;
                info.align = ALIGN_LEFT;
    private void revealCursor() {
                            return ALIGN_CENTER;
                },
            return null;
     * </ul>
                    @Override
                    }
        }*/
        }
        @Override
                                // Not a hyperlink
        return null;
                        }
                return ResultSetThemeSettings.instance.backgroundModified;
                                        strValue.charAt(k + 1) == rowDelimiter)) {
import org.eclipse.swt.widgets.Event;
            if (dragC == null || dropC == null) {
    }
                    return ResultSetThemeSettings.instance.foregroundNull;
        public ResultSetRow getElementRow(Object element) {
    private Color cellHeaderSelectionBackground;
    // Edit
                }
                    default:
                    if (hintText != null) {
        }
            }
                return DBDVoid.INSTANCE;
                        return ALIGN_LEFT;
            if (formatString) {
                    }
                        if (getController().getReadOnlyStatus() != null) {
                    Integer pinIndex = ac.getOption(DBDAttributeConstraintBase.ATTR_OPTION_PINNED);
            }

import org.eclipse.jface.action.Action;
    public void showAttribute(@NotNull DBDAttributeBinding attribute) {
        if (adapter == IPropertySheetPage.class) {
        }
                            public void run() {
        @Override
                    controller.getModel(),

        @Override
                    valueController.updateValue(value, true);
            spreadsheet.toggleRowExpand(rowElement, columnElement);
                        break;
                    for (IGridColumn col : spreadsheet.getColumnSelection()) {
                        String cellText = CommonUtils.toString(cellValue);
            return new IGridStatusColumn[] {
            }
                    } else {*/
                }
        spreadsheet.showItem(position.row);
                this.cellHeaderSelectionBackground = null;
import org.eclipse.swt.events.*;
        /*ResultSetRow curRow = controller.getCurrentRow();
                revealCursor();
import org.jkiss.dbeaver.ModelPreferences;
                    // FIXME: do not create rows twice! Probably need to delete comment after testing. #9095
                            return ResultSetIcons.META_KEY_OK;
                    }
                    }
        return highlightScopeLastLine;
                    int[] indexesCopy = new int[indexesCount];
                    new ResultSetCellLocation(column, row, getRowNestedIndexes(cell.row)),
                        if (ab != null) {
            if (updatePresentation) {
                rows.sort(Comparator.comparingInt(ResultSetRow::getVisualNumber));
                            }
            return false;
        ResultSetRow oldRow = controller.getCurrentRow();
        @Override
                info.foreground = getCellForeground(attr, row, cellValue, info.background, selected);
            if (attr == null) {
                    for (Integer row : spreadsheet.getRowSelection()) {
                            return ResultSetIcons.META_KEY_VIRTUAL;
            controller.lockActionsByControl(placeholder);
                manager.insertAfter(
                }
        }
                        // Ignore
        for (int i = 0; i < length; i++) {
            char c = strValue.charAt(i);
                            try {
                }
                return UIUtils.getSharedTextColors().getColor(mixRGB);
            DBDAttributeBinding attr = getAttributeFromGrid(colElement, rowElement);
            } else if (value instanceof DBDComposite composite && !DBUtils.isNullValue(value)) {
        int order = delta > 0 ? -1 : 1;

            default -> {
                    if (newValue == null) {
                            Object cellValue = controller.getModel().getCellValue(

                this.scrollToRow(IResultSetPresentation.RowPosition.CURRENT);
                    log.error(e);
        }
        }
            return ssSelection.iterator().next();

        boolean quoteCells = settings.isQuoteCells() && selectedCells.size() > 1;

                    boolean cellExpanded = spreadsheet.isCellExpanded(cell);
                    ActionUtils.makeCommandContribution(
        final ResultSetRow row = (ResultSetRow)(recordMode ? cell.col.getElement() : cell.row.getElement());
                            ActionUtils.makeCommandContribution(
            if (!showAttributeIcons) {
        @Override
        public String getToolTipText(IGridItem element) {
            List<IGridHint> gridHints = null;
                    cellValue,
                        if (strValue != null && isHyperlinkText(strValue)) {

                    if (defaultValue != null && !SQLConstants.NULL_VALUE.equalsIgnoreCase(defaultValue)) {
        if (inline) {
                }
                        final String pinnedTitle = allUnpinned
    private Spreadsheet spreadsheet;
    }
import org.jkiss.utils.Pair;
            if (rowNum > 0 &&
            }
            for (Iterator<SpreadsheetValueController> iterator = openEditors.keySet().iterator(); iterator.hasNext(); ) {
                    if (recordMode && model.getRowCount() > 0) {
                curAttribute = attributeBinding;
        if (settings.isCopyHeader()) {
        if ((CommonUtils.isEmpty(quoteString))) {
            } else {
    private static List<DBDAttributeConstraint> getOrderedConstraints(@NotNull DBDDataFilter filter, boolean pin) {
    private DBDAttributeBinding curAttribute;
            gd.horizontalIndent = 0;

        DBDAttributeBinding attr;
                ) {
                        iterator.remove();
                        spreadsheet.shiftCursor(0, spreadsheet.getItemCount(), false);
            } else if (gr.getElement() instanceof DBDComposite) {
        rightJustifyDateTime = preferenceStore.getBoolean(ResultSetPreferences.RESULT_SET_RIGHT_JUSTIFY_DATETIME);
            valueController.setCurRow(selRow, cellLocation.getRowIndexes());
                        }
        }
                }
                placeholder.dispose();

            }
    class SpreadsheetSelectionImpl implements IResultSetSelection, IResultSetSelectionExt {
            if (CommonUtils.isBitSet(info.state, STATE_LINK) && !CommonUtils.isBitSet(info.state, STATE_BOOLEAN)) {
    private final Map<DBPDataKind, Color> dataTypesForegrounds = new IdentityHashMap<>();


            switch (location) {

                }

            public void controlResized(ControlEvent e) {
                    }
                            if (rangeEnd != null && rangeStart.col != rangeEnd.col && colNum > rangeEnd.col) {

                    return model.getVisibleAttributes().toArray();
        boolean recordMode = controller.isRecordMode();
                        return "";
            new ContentProvider(),

                                if (useAllColumnsAsKey) {
            int rowPosition,

                if (info.image == null && cellValue instanceof DBDComplexValue cv && !cv.isNull() &&
            if (!DBExecUtils.isAttributeReadOnly(attr)) {
            }
                if (bg != null) {
        return controller.isRecordMode();
    public Control openValueEditor(final boolean inline) {
                                    inQuote = true;
    @Override
            DBWorkbench.getPlatformUI().showError("Cannot replace cell value", null, e);
                50);
    // Simple attribute is attribute which is not a part of FK or PK
                    info.state |= cellExpanded ? IGridContentProvider.STATE_EXPANDED : IGridContentProvider.STATE_COLLAPSED;
            SWT.MULTI | SWT.VIRTUAL | SWT.H_SCROLL | SWT.V_SCROLL,
                    DBWorkbench.getPlatformUI().showWarningMessageBox(
                spreadsheet.redrawGrid();
        }
                    dialog.open();
                        setConstraintPosition(constraints.get(i), pin, i + 1);
                    case DOCUMENT:
     * A continuous range is a range in which all grid coordinates are selected.
    // Ordering
                    break;
                Object cellValue = getCellValue(spreadsheet.getColumn(i), row, false);
            }
import org.jkiss.dbeaver.ui.controls.PropertyPageStandard;
                new ResultSetCellLocation(attr, row, getRowNestedIndexes(rowElement)));
        }
    public SpreadsheetSelectionImpl getSelection() {
                    }
                        binding,
            curAttribute = getFocusAttribute();
    public DBDAttributeBinding getFocusAttribute() {
        showAttrOrdering = preferenceStore.getBoolean(ResultSetPreferences.RESULT_SET_SHOW_ATTR_ORDERING);
                            if (dataContainer instanceof DBSEntity && !dataContainer.isFeatureSupported(DBSDataManipulator.FEATURE_DATA_UPDATE)) {
                backgroundDefault = controller.getDefaultBackground();
    }
                    case DOCUMENT, ANY -> !controller.isRecordMode();
                    if (pr.getElement() instanceof DBDAttributeBindingType bt) {
            final ResultSetCellLocation cellLocation = new ResultSetCellLocation(attr, row, nestedIndexes);
        IGridRow newRow;
                IValueController valueController = new SpreadsheetValueController(
                        info.state |= booleanStyles.getMode() == BooleanMode.TEXT ? STATE_TOGGLE : STATE_LINK;
                if (entityAttribute != null) {
    public Color getBackgroundDeleted() {

                    return spreadsheet.getFont(UIElementFontStyle.ITALIC);
        }
            }
                info.align = getCellAlign(attr, row, cellValue);
import java.util.stream.Collectors;
        } catch (Exception e) {
        showAttributeIcons = controller.getPreferenceStore().getBoolean(ResultSetPreferences.RESULT_SET_SHOW_ATTR_ICONS);
                        }
        public Iterator<GridPos> iterator() {
    }
                    info.state |= STATE_DECORATED;
                        IValueController.EditType.NONE, null);
    public void formatData(boolean refreshData) {
        int[] nestedIndexes = null;
        }

     *     <li>{@code null} if no selection is present or selected range is not continuous</li>
            }
import org.jkiss.dbeaver.model.data.hints.DBDValueHintProvider;
        }
                        attr.getName(),
                            IResultSetController.MENU_GROUP_ADDITIONS,
                }
        @Override
        }
                case SWAP:

                try {
                    if (controller.getAttributeReadOnlyStatus(attr, true, false) != null) {
                DBDAttributeBinding attr = (DBDAttributeBinding) element.getElement();
    public Color getBackgroundModified() {
        @Override
        }
                                strValue.charAt(i + 1) == columnDelimiter ||
                    IResultSetController.MENU_GROUP_ADDITIONS,
                            updatedRows.add(row);
                    return true;
        return new SpreadsheetSelectionImpl();
            return null;
        this.curAttribute = controller.getModel().getAttributeBinding(viewState.focusedAttribute);
    
        public void updateSelectionValue(Object value) {
                        return "[" + collection.size() + "]";
                    hintOptions
                    DBDAttributeBinding attr;
                if (cellValue != null && cellValue.getClass() == DBDValueError.class) {
                    case ARRAY:
        spreadsheet.setRedraw(false);
                    }
        } else if (isArrayColAndFirstRow(cell.getColumn(), cell.getRow())) {
            }
        }
            cellLocation,
        public int getSelectedRowCount() {
            }
/**
                        GridPos curPos = spreadsheet.getCursorPosition();

                        }
        }
            //Object value = controller.getModel().getCellValue(column, row);
            return;
            }
        openEditors.clear();
                        }
            }
            placeholder.setLayout(new FillLayout());
        @Override


            int newIndex = oldIndex + delta;
        }
                    @Override
                    return UIUtils.getSharedColor(fg);
                manager.insertAfter(
                    controller.activatePanel(ValueViewerPanel.PANEL_ID, true, true);
            }
                    if (sourcePosition < targetPosition && targetPosition > 0) {
    public int getHighlightScopeFirstLine() {
            if (location != DropLocation.SWAP) {
            spreadsheet.selectCells(cellSelection);
            if (element != null && element.getElement() instanceof DBDAttributeBinding) {
            cellLocation,
            @NotNull EditType editType,
                    if (searchPattern != null) {
                                        strValue.charAt(k + 1) == trashDelimiter ||
                }
                            fg.getRGB(),
                        Color cellBG = row.colorInfo.cellBgColors[attribute.getOrdinalPosition()];
                } finally {
        @NotNull
                if (row.colorInfo != null) {
            //spreadsheet.selectCell(cell);
                    }
                fireSelectionChanged(new SpreadsheetSelectionImpl());
    @Override
                    if (columnOrder != SWT.NONE && columnOrder != SWT.DEFAULT) {
import org.jkiss.dbeaver.ui.controls.resultset.*;
            List<IGridHint> cellHints = getCellHints(colElement, rowElement, value, DBDValueHintProvider.OPTION_ACTION_TOOLTIP);
                        if (!CommonUtils.isEmpty(children)) {
        }
        }
    }
                }
            GridCell cell = controller.isRecordMode() ?
    /**
            if (value instanceof DBDValueError valueError) {
            } else if (colOffset < 0 && curPosition.col + colOffset < 0) {
            if (item instanceof IGridRow row && !controller.isRecordMode()) {
                                case LEFT -> ALIGN_LEFT;
    public DBDAttributeBinding getCurrentAttribute() {
                            final Event applyEvent = new Event();
            !activeInlineEditor.getControl().isDisposed() &&
import org.jkiss.dbeaver.ui.data.IValueEditorStandalone;
                    return highlightScopeColor != null ? highlightScopeColor : ResultSetThemeSettings.instance.backgroundSelected;
        int rightmostIndex = constraintsToMove.stream().mapToInt(c -> getConstraintPosition(c, pin)).max().getAsInt();
                            }
                    if (sourceRow != row || sourceAttribute != attribute) {

        constraintsToMove.sort((a, b) -> Integer.compare(getConstraintPosition(a, pin), getConstraintPosition(b, pin)) * order);
        if (pin) {
                for (IGridItem gr = gridRow; gr.getParent() != null; gr = gr.getParent()) {
        }
import org.jkiss.dbeaver.model.exec.DBCException;
                                new ResultSetCellLocation(attr, row, getRowNestedIndexes(gridRow)),
                        }
                (controller.getDecorator().getDecoratorFeatures() & IResultSetDecorator.FEATURE_FILTERS) != 0 &&
                            final Object newValue;
    void handleColumnIconClick(Object columnElement) {
    }
            if ((cellInfo.state & IGridContentProvider.STATE_HYPER_LINK) != 0) {
                } else {
        @Override

            CellInformation info = new CellInformation();
                            info.image = booleanStyles.getStyle((Boolean) cellValue).getIcon();
                            }
        }
