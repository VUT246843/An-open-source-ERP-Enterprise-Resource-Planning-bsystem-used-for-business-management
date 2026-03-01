        if (isCheckedTable)


                            item.setChecked(false);
 * you may not use this file except in compliance with the License.
        if (!queryDatabase) {
                    if (e.detail == SWT.CHECK) {
                    // We use here same format as date types have in values list
    @NotNull
                    return Status.OK_STATUS;
        toggleButton.setData(!hasCheckedItems);
package org.jkiss.dbeaver.ui.controls.resultset.valuefilter;

        KeyLoadJob curLoadJob = this.loadJob;
    GenericFilterValueEdit(@NotNull ResultSetViewer viewer, @NotNull DBDAttributeBinding attribute, @NotNull ResultSetRow[] rows, @NotNull DBCLogicalOperator operator) {
                        firstVisibleItem = row;
        valueFilterText.addModifyListener(e -> {
    public IValueEditor getEditor() {
        loadValuesJob.setUser(false);
                @Override
        this.showDistinctValuesCount = showDistinctValuesCount;
            for (Map.Entry<Object, DBDLabelValuePair> pair : rowData.entrySet()) {
        } else if (editor != null) {
        }

        if (firstVisibleItem != null) {
    @NotNull

                        // Format exception maybe
    public DBCLogicalOperator getOperator() {
                    //String itemString = attribute.getValueHandler().getValueDisplayString(attribute, cellValue, DBDDisplayFormat.UI);
                if (tableColumn == null) {
            final DBCExecutionContext executionContext = viewer.getExecutionContext();

        if (pattern != null) {
                            savedValues.remove(value.getValue());

                }
 * See the License for the specific language governing permissions and
    }
        @Override
    @NotNull
                            session,
                filterPattern = null;
                DBExecUtils.tryExecuteRecover(monitor, attributeEnumerable.getDataSource(), param -> {
        };
                return Status.OK_STATUS;
            List<DBDLabelValuePair> readEnumeration(DBRProgressMonitor monitor) throws DBException {
                if (DBUtils.isNullValue(val.getValue())) {
        DBDLabelValuePair firstVisibleItem = null;
            return Status.OK_STATUS;
        this.filterPattern = filterPattern;
 * Copyright (C) 2010-2025 DBeaver Corp and others
                final Table table = tableViewer.getTable();
            } else if (attribute.getEntityAttribute() instanceof DBSAttributeEnumerable) {
        public Long getTotalDistinctCount() {
            // Filter numeric values
                    continue;
    void setShowRowCount(boolean showRowCount) {
    private void loadAttributeEnum(final DBSAttributeEnumerable attributeEnumerable, @Nullable Consumer<Result> onFinish) {
        } else {
                if (table != null && !table.isDisposed()) {
            for (DBDLabelValuePair row : sortedList) {
                    table.setEnabled(true);
    }
        @Nullable
                        }
                            return pair.getValue();
        }
                            MAX_MULTI_VALUES,
        // Create job which will load values after specified delay
import java.util.function.Consumer;

import org.jkiss.dbeaver.model.data.*;
import org.eclipse.core.runtime.IStatus;
                Object cellValue = row.getValue();
    }
 * Licensed under the Apache License, Version 2.0 (the "License");

            @NotNull
        private Long totalDistinctCount;
            return CommonUtils.isEmpty(filterPattern);
                        true,

import org.eclipse.core.runtime.Status;
            try {
        return rows;
    private static final String MULTI_KEY_LABEL = "...";
                        MAX_MULTI_VALUES);
                            filterPattern,
            try {
        public void setTotalDistinctCount(@Nullable Long totalDistinctCount) {
    private Composite buttonsPanel;
            if (enumerableConstraint != null) {
            if (!loadValuesJob.isCanceled()) {
        this.operator = operator;
                public void widgetSelected(SelectionEvent e)
 * limitations under the License.
        UIWidgets.createTableContextMenu(tableViewer.getTable(), menu -> {
        return rowData.get(cellValue.toString());
                    }
            onFinish.accept(result);
                DBDLabelValuePair dictValue = findValue(rowData, cellValue);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

                    return null;
            protected IStatus run(@NotNull DBRProgressMonitor monitor) {

        if (cellValue instanceof String) {
                if (itemValue < minValue) {
 * Unless required by applicable law or agreed to in writing, software
    }
            UIUtils.createEmptyLabel(buttonsPanel, 1, 1).setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                if (fkColumn == null) {
    private static final Log log = Log.getLog(GenericFilterValueEdit.class);
import java.util.List;
    }

                    populateValues(Collections.emptyList());
            buttonsPanel = UIUtils.createComposite(composite, 2);
            for (Map.Entry<Object, DBDLabelValuePair> pair : rowData.entrySet()) {


import org.jkiss.utils.CommonUtils;
            if (executionContext == null) {
    Text addFilterText(Composite composite) {
    private boolean hasCheckedItems() {
                        }
    private void updateToggleButton(Button toggleButton) {

                if (fkAttribute != null && enumConstraint != null) {
        }
        boolean hasCheckedItems = hasCheckedItems();
            @Override
                if (onFinish != null) {
            }
                    dictValue = findValue(rowData, displayString);
        return buttonsPanel;
    public void setShowDistinctValuesCount(boolean showDistinctValuesCount) {
    @NotNull
            if (showDistinctValuesCount) {
                loadMultiValueList(Collections.emptyList(), true, onFinish);
            filterPattern = valueFilterText.getText();
                        filterPattern,
                if (table != null && !table.isDisposed()) {
import org.jkiss.dbeaver.model.DBValueFormatting;
                        caseInsensitiveSearch,
                }

    }

            private List<DBDLabelValuePair> result;

class GenericFilterValueEdit {
                    curLoadJob.cancel();
        tableViewer = new TableViewer(composite, style);
    @Nullable
    private boolean queryDatabase = true;
                }
        Table table = this.tableViewer.getTable();
import org.eclipse.jface.action.Separator;


            }
                } else {
    public void setFilterPattern(String filterPattern) {
            this.totalDistinctCount = totalDistinctCount;
                final DBSEntityConstraint refConstraint = association.getReferencedConstraint();
                }
import org.jkiss.dbeaver.model.exec.DBCLogicalOperator;
        loadJob = new KeyLoadJob("Load constraint '" + refConstraint.getName() + "' values", onFinish) {
            });

 *     http://www.apache.org/licenses/LICENSE-2.0
                try {
    private transient final Set<Object> savedValues = new HashSet<>();
    private void loadDictionaryEnum(@NotNull DBSDocumentAttributeEnumerable dictionaryEnumerable, @Nullable Consumer<Result> onFinish) {
                final DBSDictionary enumConstraint = refConstraint == null ? null : (DBSDictionary) refConstraint.getParentObject();
                Collections.addAll(checkedValues, (Object[]) constraint.getValue());
                return editor.extractEditorValue();
    private TableViewer tableViewer;
    }
            }
    private IValueEditor editor;
        }
                        if (timestamp.compareTo((Timestamp) cellValue) == 0) {

        if (isCheckedTable) {
            Object value = viewer.getModel().getCellValue(attribute, row);
                }


                DBExecUtils.tryExecuteRecover(monitor, dictionaryEnumerable.getDataSource(), param -> {

    private abstract class KeyLoadJob extends AbstractJob {
        }
                    }
                        ));
        if (tableViewer != null) {
import org.jkiss.dbeaver.ui.data.IValueEditor;
        }
        this.tableViewer.setContentProvider(new ListContentProvider());
            }
                }
                final DBDLabelValuePair valuePair = iter.next();
                    }

            // Load values
            });
        }
                        updateToggleButton(toggleButton);
            this.onFinish = onFinish;
    private static final int MAX_MULTI_VALUES = 1000;
                tableViewer.getTable().setSelection((TableItem) item);
                if (dictValue == null) {
    }
    boolean isDictionarySelector() {
            @Override
    }
    public DBDAttributeBinding getAttribute() {
        for (ResultSetRow row : rows) {
            UIUtils.packColumns(tableViewer.getTable(), true);
                            filterPattern,
                }
        };

                }
            }
            }
                if (valueEnumeration == null) {
                    rowData.put(cellValue, new DBDLabelValuePairExt(null, cellValue, 1));

                log.error("Can't get editor value", e);
                        for (TableItem item : items) {
                    hasNulls = true;
        }
            if (!curLoadJob.isCanceled()) {
        this.viewer = viewer;
                loadValuesJob.cancel();
    public ResultSetViewer getViewer() {
        private final Consumer<Result> onFinish;


            if (oldLabel != null) {
                }
            // FIXME: This may happen in some crazy cases -
            final Result result = new Result();
import org.jkiss.dbeaver.model.runtime.AbstractJob;
        updateToggleButton(toggleButton);
    }
        @NotNull
        for (DBDLabelValuePair pair : values) {
import org.jkiss.dbeaver.model.exec.DBExecUtils;

import org.jkiss.dbeaver.ui.UIUtils;

        if (tableViewer == null || tableViewer.getControl() == null || tableViewer.getControl().isDisposed()) {
        table.setLinesVisible(false);
                if (checkedValues.contains(cellValue)) {
                            item.setChecked(true);

                        // Clear all checked
        return valueFilterText;
        loadJob = new KeyLoadJob("Load '" + attribute.getName() + "' values", onFinish) {
        isCheckedTable = (style & SWT.CHECK) == SWT.CHECK;
                    return null;
                UIUtils.asyncExec(() -> loadValues(null));
            ((GridLayout) buttonsPanel.getLayout()).numColumns++;
            for (ResultSetRow row : viewer.getModel().getAllRows()) {
                    return pair.getValue();

            tableViewer.getTable().addSelectionListener(new SelectionAdapter() {
                log.error("Can't get editor value", e);

                    TableItem[] items = tableViewer.getTable().getItems();
        return (Collection<DBDLabelValuePair>) tableViewer.getInput();
    public Composite getButtonsPanel() {
import org.eclipse.swt.layout.GridData;
                }
    }
    private Button toggleButton;
        }
                        0,
            } else {
        final AbstractJob loadValuesJob = new AbstractJob("Load values timeout") {
    }
        } catch (Exception e) {
                        for (TableItem item : items) {
            final Object selection = tableViewer.getStructuredSelection().getFirstElement();
        this.attribute = attribute;
            }


}
                menu.add(act);
            }
            }
    public void setCaseInsensitiveSearch(boolean caseInsensitiveSearch) {
                    } else {

            return button;

            log.error("Error sorting value collection", e);
                    Object key = pair.getKey();
    }
                    monitor.subTask("Read distinct values count");
        } else {
    public Object getFilterValue() {
                log.error(e);
    }
                        }
                    return null;
        return tableViewer;
    }
        }
                    iter.remove();
            @Override
        valueFilterText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        List<DBDLabelValuePair> sortedList = new ArrayList<>(rowData.values());
            toggleButton.setLayoutData(gd);
                    table.setEnabled(false);
        }
            boolean nullPresents = false;
                if (DBUtils.isNullValue(cellValue)) {
    }
        });
        };
            }
            vcc.repackColumns();
                        DBDLabelValuePair value = (DBDLabelValuePair) e.item.getData();
                return null;
            if (filterPattern.isEmpty()) {
                return result[0];
            } catch (DBException e) {
import org.jkiss.dbeaver.ui.controls.ViewerColumnController;
            }
        return null;
                    }
    public ResultSetRow[] getRows() {
                    } catch (Exception e) {
                loadDictionaryEnum((DBSDocumentAttributeEnumerable) attribute.getDataContainer(), onFinish);

                    DBDValueHandler valueHandler = DBUtils.findValueHandler(attribute.getDataSource(), attribute);
            }
        });
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
                    nullPresents = true;
            super(name);
            }
            }
            } else {
                final DBSEntityAttributeRef fkColumn = DBUtils.getConstraintAttribute(monitor, refConstraint, tableColumn);
    private boolean showRowCount;
            List<DBDLabelValuePair> readEnumeration(DBRProgressMonitor monitor) throws DBException {
        // Otherwise try to match values manually
        final DBDLabelValuePair value = rowData.get(cellValue);
                    return null;
        boolean mergeResultsWithData() {
        return viewer;
            for (Iterator<DBDLabelValuePair> iter = sortedList.iterator(); iter.hasNext(); ) {
    Collection<DBDLabelValuePair> getMultiValues() {
                    break;
            if (item != null) {
        }
            if (items.getChecked()) return true;
        }
    @NotNull
            }
import java.util.regex.Pattern;
    static class Result {
                }
                } else {
            }


                return new Object[]{((DBDLabelValuePair) selection).getValue()};
                if (!DBUtils.isNullValue(pair.getKey())) {
                final DBSEntityAttribute tableColumn = attribute.getEntityAttribute();
    }
        if (hasNulls) {
            // Add values from fetched rows
            return values.toArray();
                monitor.done();
    }
            return null;
        }
import org.eclipse.swt.events.SelectionEvent;
    @NotNull
    }
        Map<Object, DBDLabelValuePair> rowData = new HashMap<>();
        // Get all values from actual RSV data
                String multiLabel = oldLabel.getLabel() + "," + pair.getLabel();
import org.jkiss.dbeaver.Log;
            for (DBDLabelValuePair item : getMultiValues()) {
                }
            }
                return editor.extractEditorValue();

                    // And we can change it with the help of valueHandler
        }
                        // Continue
                }
            }
            // FIXME: error "Comparison method violates its general contract!" happens in case of long strings sorting
    private final ResultSetRow[] rows;
        if (cellValue instanceof Timestamp) {
        }
import org.jkiss.dbeaver.model.exec.DBCSession;
import org.jkiss.dbeaver.model.struct.*;
import org.eclipse.swt.events.SelectionAdapter;
        if (isCheckedTable) {

    }
            }
            // If we managed to found something at this point - return right away

                            showRowCount,
        // Create filter text

    void loadValues(@Nullable Consumer<Result> onFinish) {
import org.jkiss.dbeaver.ui.controls.ListContentProvider;
            });
        return false;
                if (!pattern.matcher(itemString).matches() && (valuePair.getLabel() == null || !pattern.matcher(valuePair.getLabel()).matches())) {
        }
    }
            buttonsPanel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        @Nullable
            return;
    private final DBCLogicalOperator operator;
        loadJob.schedule();
        }
                loadConstraintEnum(enumerableConstraint, onFinish);
                }

                rowData.put(pair.getValue(), pair);
            loadJob = null;
        }

        boolean hasNulls = false;
            } else if (attribute.getDataContainer() instanceof DBSDocumentAttributeEnumerable) {
        this.queryDatabase = queryDatabase;
                String itemString = attribute.getValueHandler().getValueDisplayString(attribute, valuePair.getValue(), DBDDisplayFormat.EDIT);
                String itemString = attribute.getValueHandler().getValueDisplayString(attribute, valuePair.getValue(), DBDDisplayFormat.UI);

                        null,
            }
    public String getFilterPattern() {
                result.setTotalDistinctCount((long) sortedList.size());
                final DBSEntityAttribute fkAttribute = fkColumn.getAttribute();
            curLoadJob.schedule(200);
        }
        this.editor = editor;
    @NotNull
        loadValuesJob.setSystem(true);
    }
            loadMultiValueList(Collections.emptyList(), true, onFinish);
        return operator;
            double minValue = CommonUtils.toDouble(filterPattern);


        if (curLoadJob != null) {
                    onFinish.accept(result);
                    if (Boolean.FALSE.equals(toggleButton.getData())) {
            return value;
                            attribute,
                });
        if (tableViewer != null) {
            final DBSEntityReferrer enumerableConstraint = ResultSetUtils.getEnumerableConstraint(attribute);
        if (mergeResultsWithData) {
/*

import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
            if (showDistinctValuesCount) {
        Set<Object> checkedValues = new HashSet<>();
                        } else {
                    try (DBCSession session = DBUtils.openUtilSession(monitor, dictionaryEnumerable, "Read value enumeration")) {
            UIUtils.syncExec(() -> {
                        result = attributeEnumerable.getValueEnumeration(
                            true,
                    }
    Button createFilterButton(String label, SelectionAdapter selectionAdapter) {
                            savedValues.add(value.getValue());

                if (!curLoadJob.isCanceled()) {
                        result[0] = attributeEnumerable.getDistinctValuesCount(session);
            } catch (Throwable e) {
        valueFilterText.addDisposeListener(e -> {
            loadValuesJob.schedule(INPUT_DELAY_BEFORE_LOAD);
        } else {
            for (Iterator<DBDLabelValuePair> iter = sortedList.iterator(); iter.hasNext(); ) {
                            caseInsensitiveSearch);
import org.jkiss.dbeaver.DBException;
                    values.add(item.getValue());
        @Nullable
 */
            final Widget item = tableViewer.testFindItem(firstVisibleItem);
    @Nullable
                        null,

    }
                    return pair.getValue();
 * You may obtain a copy of the License at
            monitor.beginTask("Read filter values", 1);
                }
                if (dictValue == null && cellValue instanceof Date) {
                            savedValues.add((((DBDLabelValuePair) item.getData())).getValue());
            @Override
                }
        DBDAttributeConstraint constraint = viewer.getModel().getDataFilter().getConstraint(attribute);
        }
                }
 *
            GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
        tableViewer.setInput(sortedList);
                if (pair.getKey() instanceof Number && CommonUtils.compareNumbers((Number) pair.getKey(), (Number) cellValue) == 0) {
            }
                        if (((TableItem)e.item).getChecked()) {
                    ((DBDLabelValuePairExt)dictValue).incCount();
                        result.addAll(dictionaryEnumerable.getValueEnumeration(
        }
    void setQueryDatabase(boolean queryDatabase) {
        }
import org.jkiss.dbeaver.model.DBPDataKind;
        checkedValues.addAll(savedValues);
            List<DBDLabelValuePair> readEnumeration(DBRProgressMonitor monitor) throws DBException {
                loadAttributeEnum((DBSAttributeEnumerable) attribute.getEntityAttribute(), onFinish);
import org.eclipse.swt.SWT;
                curLoadJob.cancel();

    public Object getSelectedFilterValue() {
    @NotNull
    }
import org.jkiss.dbeaver.ui.UIWidgets;
            }
                    }

                        refColumn,
            try {
                } else if (values.isEmpty() && dictValue instanceof DBDLabelValuePairExt) {
            @NotNull
        if (value != null) {
            });
            if (!loadValuesJob.isCanceled()) {
                    log.error("Can't read count of distinct values", e);
            return;
                        toggleButton.setData(true);
                    }
        table.setLayoutData(layoutData);
                final DBDLabelValuePair valuePair = iter.next();
                if (multiLabel.length() > 200) {
        };
                    // Inc local items count (only if we didn't read count from server, i.e. values are empty)
                if (refConstraint instanceof DBSEntityAssociation) {
import org.eclipse.swt.layout.GridLayout;
    }
                final DBSEntityAttribute refColumn = DBUtils.getReferenceAttribute(monitor, association, tableColumn, false);
            }
        abstract List<DBDLabelValuePair> readEnumeration(DBRProgressMonitor monitor) throws DBException;
        if (vcc != null) {
        return null;
        }

                            MAX_MULTI_VALUES
                }
        this.caseInsensitiveSearch = caseInsensitiveSearch;
                        toggleButton.setData(false);

import org.jkiss.code.Nullable;
                @Override
    }
                    return enumConstraint.getDictionaryEnumeration(
    private String filterPattern;
            final DBDLabelValuePair oldLabel = rowData.get(pair.getValue());
    }
            final Result result = new Result();
                tableViewer.getTable().showItem((TableItem) item);
                }
import java.util.*;

                    populateValues(valueEnumeration);
    private void loadMultiValueList(@NotNull Collection<DBDLabelValuePair> values, boolean mergeResultsWithData, @Nullable Consumer<Result> onFinish) {
                rowData.put(pair.getValue(), new DBDLabelValuePair(multiLabel, pair.getValue()));
        try {
            gd.widthHint = 120;
    void addContextMenu(Action[] actions) {
        }
        ViewerColumnController vcc = ViewerColumnController.getFromControl(tableViewer.getTable());
                monitor.subTask("Read enumeration");
    private static final int INPUT_DELAY_BEFORE_LOAD = 300;
import org.eclipse.swt.widgets.*;
    private transient volatile KeyLoadJob loadJob;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                final Long[] result = new Long[1];
                });
                {
            Set<Object> values = new LinkedHashSet<>();

        Pattern pattern = null;
            @Nullable
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetRow;
            @Override
            return true;
                        }
    private void loadConstraintEnum(final DBSEntityReferrer refConstraint, @Nullable Consumer<Result> onFinish) {
            KeyLoadJob curLoadJob = this.loadJob;
        } else if (editor != null) {

        return attribute;
        if (constraint != null && constraint.getOperator() == DBCLogicalOperator.IN) {
        loadJob = new KeyLoadJob("Load '" + attribute.getName() + "' values", onFinish) {
            UIUtils.asyncExec(() -> {
    }
            }
                if (!DBUtils.isNullValue(pair.getKey()) && CommonUtils.toString(pair.getKey()).equals(cellValue)) {
                        savedValues.clear();
                DBSEntityAssociation association;
import org.jkiss.dbeaver.model.DBUtils;
            for (DBDLabelValuePair val : rowData.values()) {
        protected Long readDistinctValuesCount(@NotNull DBRProgressMonitor monitor) throws DBException {
                    if (firstVisibleItem == null) {
                }
        this.rows = rows;
            menu.add(new Separator());
            pattern = Pattern.compile(SQLUtils.makeLikePattern("%" + filterPattern + "%"), Pattern.CASE_INSENSITIVE);
                            showRowCount,
                    String displayString = valueHandler.getValueDisplayString(attribute, cellValue, DBDDisplayFormat.UI);
    void setupTable(Composite composite, int style, boolean visibleLines, boolean visibleHeader, Object layoutData) {
            return totalDistinctCount;
                DBExecUtils.tryExecuteRecover(monitor, attributeEnumerable.getDataSource(), param -> {
                        Timestamp timestamp = Timestamp.valueOf(key.toString());
            if (curLoadJob != null) {
                loadValuesJob.cancel();
            checkedValues.add(value);
            protected Long readDistinctValuesCount(@NotNull DBRProgressMonitor monitor) throws DBException {
                    t.setChecked(true);
                        true,

        void populateValues(@NotNull final Collection<DBDLabelValuePair> values) {
            } finally {
                public void widgetSelected(SelectionEvent e) {
                }
            }
                sortedList.add(0, new DBDLabelValuePair(DBValueFormatting.getDefaultValueDisplayString(null, DBDDisplayFormat.UI), null));
                }
        });
    private boolean showDistinctValuesCount;
        return filterPattern;
                    iter.remove();
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.sql.SQLUtils;

                });
            values.addAll(savedValues);
                        monitor,
            //checkedValues.add(constraint.getValue());
                    try {
                    TableItem t = (TableItem) tableViewer.testFindItem(row);

            }
                List<DBDLabelValuePair> valueEnumeration = readEnumeration(monitor);
                return result;
                    loadMultiValueList(values, mergeResultsWithData(), null);
        }
            }
        if (cellValue instanceof Number) {
            sortedList.sort(DBDLabelValuePair::compareTo);
                populateValues(Collections.emptyList());
                }
            // FIXME: Test on sakila.film.description
    }
                Object cellValue = viewer.getModel().getCellValue(attribute, row);
            toggleButton = UIUtils.createDialogButton(buttonsPanel, "&Select All", new SelectionAdapter() {
                if (refColumn == null) {
    private boolean caseInsensitiveSearch;
        toggleButton.setText(hasCheckedItems ? "&Clear All" : "&Select All");
            for (Map.Entry<Object, DBDLabelValuePair> pair : rowData.entrySet()) {
                } catch (Throwable e) {
    private DBDLabelValuePair findValue(Map<Object, DBDLabelValuePair> rowData, Object cellValue) {
import org.eclipse.jface.viewers.TableViewer;

                }
        protected IStatus run(@NotNull DBRProgressMonitor monitor) {
                            caseInsensitiveSearch,
                double itemValue = CommonUtils.toDouble(itemString);

            }
                return Status.OK_STATUS;
        }
    }

    }
        for (TableItem items : tableViewer.getTable().getItems()) {
            updateToggleButton(toggleButton);

                final List<DBDLabelValuePair> result = new ArrayList<>();
                            session,
                final Table table = tableViewer.getTable();
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.jkiss.code.NotNull;
    private boolean isCheckedTable;
                return result;
    public TableViewer getTableViewer() {
            }
            Button button = UIUtils.createDialogButton(buttonsPanel, label, selectionAdapter);
                    try (DBCSession session = DBUtils.openUtilSession(monitor, attributeEnumerable, "Read value enumeration")) {
        KeyLoadJob(String name, @Nullable Consumer<Result> onFinish) {
        if (!CommonUtils.isEmpty(filterPattern) && attribute.getDataKind() == DBPDataKind.STRING) {
import org.eclipse.jface.action.Action;
            }
                    try (DBCSession session = DBUtils.openUtilSession(monitor, attributeEnumerable, "Read count of distinct values")) {
    private final DBDAttributeBinding attribute;

        return editor;

    }

                    // Date/time/timestamp types can have other string representation.
            } catch (DBException e) {
        loadJob.schedule();
 *
        }
                    //((CheckboxTableViewer) tableViewer).setChecked(row, true);
            if (constraint.getValue() instanceof Object[]) {
        this.showRowCount = showRowCount;
            }
                    result.setTotalDistinctCount(readDistinctValuesCount(monitor));
        table.setHeaderVisible(visibleHeader);
        loadJob.schedule();
                if (((TableItem)tableViewer.testFindItem(item)).getChecked()) {
                }
        }
            return null;
                    multiLabel = multiLabel.substring(0, 200) + MULTI_KEY_LABEL;
        if (onFinish != null) {
            if (selection instanceof DBDLabelValuePair) {

        } else if (filterPattern != null && attribute.getDataKind() == DBPDataKind.NUMERIC) {
            for (Action act : actions) {
            setSkipErrorOnCanceling(true);
    private final ResultSetViewer viewer;
    }
                    updateToggleButton(toggleButton);
        return ResultSetUtils.getEnumerableConstraint(attribute) != null;
            if (!nullPresents) {
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetUtils;
import java.sql.Timestamp;
        }
                    association = (DBSEntityAssociation) refConstraint;
    public void setEditor(IValueEditor editor) {
        final Text valueFilterText = new Text(composite, SWT.BORDER);
 *
                // Duplicate label for single key - may happen in case of composite foreign keys

