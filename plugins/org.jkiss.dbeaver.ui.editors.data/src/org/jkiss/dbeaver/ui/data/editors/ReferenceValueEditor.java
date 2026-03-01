                    result[0] = readEnum(monitor);
            this.halfPageSize = pageSize / 2;
        public void reload(boolean refreshMainData) {
            return !(lastPageFound && currPageNumber >= maxKnownPage);
        }
                    "<a>" + refTable.getName() + "</a>",
                for (int i = 0; i < items.length; i++) {
                actionGoBackward.setEnabled(controller.isPrevPageAvailable());

 * limitations under the License.
                    } else {

                TableItem[] items = editorSelector.getItems();
    {
        @Nullable
            }
            }
        public void run() {
    private void selectCurrentValue() {
                hintLabel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.HORIZONTAL_ALIGN_END));
    }
            this.editorSelector.addDisposeListener(e -> menuMgr.dispose());
            if (curTextValue.equalsIgnoreCase(item.getText(0)) || curTextValue.equalsIgnoreCase(item.getText(1))) {
                    sortAsc,
            actionGoBackward.setEnabled(false);
                }
    private static volatile boolean sortAsc = true;
        return true;
        //gd.grabExcessHorizontalSpace = true;
                    null,
            this.keyValue = valueToShow;
                    monitor,
                    }

import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
                editorSelector.setSelection(item);
            SelectorLoaderService loadingService = new SelectorLoaderService(accessor -> {
        @Nullable
                    !sortByValue
        @Override
        public EnumValuesData evaluate(@NotNull DBRProgressMonitor monitor) {


                    return Collections.emptyList();
        }
    private void updateDictionarySelector(EnumValuesData valuesData) {
                    manager.add(new Action(ResultSetMessages.reference_value_editor_value_label) {
                }
            }
                return Collections.emptyList();
                !dataContainer.getDataSource().getContainer().isExtraMetadataReadEnabled()) {

            this.keyHandler = keyHandler;
        public void run() {
            this.minKnownPage = 0;
                    });
                data = accessor.getValueEntry(keyValue);
                int curItemIndex = -1;
            return !(firstPageFound && currPageNumber <= minKnownPage);
        TableItem[] selection = editorSelector.getSelection();
import org.jkiss.dbeaver.ui.editors.data.DatabaseDataEditor;
                        @Override
                            EditDictionaryPage editDictionaryPage = new EditDictionaryPage(refTable);
import org.eclipse.swt.layout.GridData;
    private static volatile boolean sortByValue = true; // It is static to save its value between editors


        }
                data.sort(comparator);
    }
                rsController.refreshData(null);
    }
            if (prevSortColumn == column) {
    public ContributionItem[] getContributionItems() {
                discItem.setText(1, entry.getLabel());
        }
            } else {
        }
        descColumn.addListener(SWT.Selection, sortListener);
        public SelectorLoaderVisualizer(SelectorLoaderService loadingService) {
                try (DBSDictionaryAccessor accessor = enumConstraint.getDictionaryAccessor(
                Comparator<DBDLabelValuePair> comparator = sortByValue 
        private EnumValuesData getEnumValuesData(
            }

        if (refConstraint == null) {
            return data;

import org.eclipse.jface.action.Action;
            }
     */
            super.completeLoading(result);
}
import org.eclipse.ui.IWorkbenchWindow;
                minKnownPage = Math.min(minKnownPage, currPageNumber);
            DBSEntityAssociation association,
                    // Show cur item on top
                false);
        }
        if (control instanceof Text) {
                    new SelectionAdapter() {
                    estimateTail(data.size(), pageSize);
                }

                        return null;
            if (searchText == null && keyValue != null) { 
import org.eclipse.jface.action.MenuManager;
        }
                // just ignore
        public boolean isForceCancel() {
            }
        private SelectorLoaderService(ExceptableFunction<DBSDictionaryAccessor, List<DBDLabelValuePair>, DBException> action) {
        valueColumn.addListener(SWT.Selection, sortListener);
                } else {
            this.currPageNumber = 0;
        }
        editorSelector.setHeaderVisible(true);
            ((StyledText)control).addModifyListener(modifyListener);
                            UIUtils.runInUI(window, monitor -> {
            DBDDisplayFormat.EDIT);
            DBRProgressMonitor monitor = accessor.getProgressMonitor();
            return;
            } else {
                                    true
        }
    private Text valueFilterText;
            }
            this.firstPageFound = false;
            lastPageFound = noNextPage;
            }
                discItem.setData(entry.getValue());
            return false;
        private final ExceptableFunction<DBSDictionaryAccessor, List<DBDLabelValuePair>, DBException> action;

                    }
    private static final Log log = Log.getLog(ReferenceValueEditor.class);
        
                        curItem = item;
        final Object curValue = valueController.getValue();
                if (!valueEditor.isReadOnly()) {
        private EnumValuesData readEnum(DBRProgressMonitor monitor) throws DBException {
                this.applyFilter(valueToShow, pattern);
    private static class EnumValuesData {
                if (monitor.isCanceled()) {
            StringBuilder result = new StringBuilder();
import org.jkiss.dbeaver.ui.editors.object.struct.EditDictionaryPage;
                association = (DBSEntityAssociation)refConstraint;
                    }
                estimateTail(data.size(), pageSize);
                if (searchText == null) {
            nextPageAvailable = dataObtained >= dataExpected;
            public void widgetDefaultSelected(SelectionEvent e) {
                currPageNumber = Math.max(currPageNumber, minKnownPage);
            curEditorValue = valueEditor.extractEditorValue();

            if (dataObtained > 0) {
            this.firstPageFound = true;
                }

import org.jkiss.dbeaver.ui.controls.ProgressLoaderVisualizer;
                long offset = currPageNumber * pageSize;
                    if (monitor.isCanceled()) {
        editorSelector = new Table(parent, SWT.BORDER | SWT.SINGLE | SWT.FULL_SELECTION | SWT.H_SCROLL | SWT.V_SCROLL);
        }
        gd.heightHint = 150;
                valueEditor.primeEditorValue(value);

            editorSelector.removeAll();
            return null;
        }
        if (refConstraint instanceof DBSEntityAssociation association) {
            super.visualizeLoading();
                    throw new DBException("Failed to load values", e);
                        // Ignore the current column
                newValueFound = true;
    }
    public boolean createEditorSelector(final Composite parent)
            editorSelector);
                });
            sortByValue = (Boolean)column.getData();
        if (editorSelector == null || editorSelector.isDisposed()) {
        public void filter(@Nullable Object valueToShow, @Nullable String pattern) {
                final String curTextValue = valueController.getValueHandler().getValueDisplayString(
                Button hintLabel = UIUtils.createPushButton(
                        continue;
            prevPageAvailable = dataObtained >= dataExpected;

            List<DBDLabelValuePair> data;
                editorSelector.deselectAll();
 * Unless required by applicable law or agreed to in writing, software
            List<? extends DBSEntityAttributeRef> allColumns = CommonUtils.safeList(refConstraint.getAttributeReferences(monitor));

                        curValue,
                )) {
        }
            }
                            if (editDictionaryPage.edit(parent.getShell())) {
            }
            prevPageAvailable = false;
 * Copyright (C) 2010-2026 DBeaver Corp and others
            controller.goToNextPage();
                editorSelector.setEnabled(dataObtained || controller.searchText == null);
        private long maxKnownPage = 0;
        private int sortDirection = sortAsc ? SWT.DOWN : SWT.UP;
        }
                    editorSelector.setTopIndex(curItemIndex);
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetUtils;
            this.action = action;
        }
            currPageNumber = 0;
            sortAsc = sortDirection == SWT.DOWN;
                }
                updateDictionarySelector(result);
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        valueColumn.setData(Boolean.TRUE);
            TableColumn column = (TableColumn) event.widget;
                result.append(item.getText(0));
import org.jkiss.dbeaver.model.data.*;

        }
    private class SortListener implements Listener {
            final DBSEntityAttribute fkAttribute = fkColumn.getAttribute();
                            final IWorkbenchWindow window = valueController.getValueSite().getWorkbenchWindow();
                    editorSelector.setSelection(curItem);
            if (refConstraint instanceof DBSEntityAssociation) {
                        }
                currPageNumber++;
                    return new EnumValuesData(enumValues, fkColumn, colHandler);
import org.eclipse.jface.action.Separator;
    }
        private void estimateTail(int dataObtained, int dataExpected) {
            final DBSEntityAttributeRef fkColumn = DBUtils.getConstraintAttribute(monitor, refConstraint, tableColumn);
import org.eclipse.swt.events.ModifyListener;
        Control control = valueEditor.getControl();
            }
                manager.add(new Separator());

            }
    private IValueEditor valueEditor;
        @Override
        
                this.reset(this.keyValue);
                    data = searchText == null ? accessor.getValuesNear(keyValue, false, offset, pageSize)
                selectCurrentValue();
        @Override
        Control editorControl = valueEditor.getControl();

            } else {

        TableColumn descColumn = UIUtils.createTableColumn(editorSelector, SWT.LEFT, ResultSetMessages.dialog_value_view_column_description);
            }
            for (TableItem item : editorSelector.getSelection()) {
        controller.reset(curValue);
            ThemeConstants.FONT_SQL_RESULT_SET,
                maxKnownPage = Math.max(maxKnownPage, currPageNumber);
                    estimateHead(data.size(), pageSize);
import org.jkiss.dbeaver.ui.data.IAttributeController;
 *
            this.searchText = pattern;
                currPageNumber--;
import org.jkiss.code.NotNull;
            controller.reset(curEditorValue);
            }
                }
                currPageNumber = Math.min(currPageNumber, maxKnownPage);
                        if (rowAttr != null) {
            return false;
        if (valueEditor.isReadOnly()) {
            }
                                DBNDatabaseNode tableNode = DBNUtils.getNodeByObject(

        }
                }
        }
                            // Open
                        @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
            return result[0];
            ActionUtils.makeActionContribution(actionGoForward, false)
    }
        if (valueController instanceof IAttributeController) {
            prevSortColumn = descColumn;
    }
            this.pageSize = pageSize;
                String filterPattern = valueFilterText.getText();
                        : accessor.getSimilarValuesNear(searchText, true, true, keyValue, true, offset, pageSize);
                estimateOnePage(true);
        descColumn.setData(Boolean.FALSE);
                            primeValueToSelection();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        }
    private final ViewController controller;

 */
        

        DBCExecutionContext executionContext = valueController.getExecutionContext();
            minKnownPage = 0;
            }
            }
        ResultSetThemeSettings.instance.addPropertyListener(
            } else {
                    : (a, b) -> CommonUtils.compare(a.getLabel(), b.getLabel());
            this.maxKnownPage = 0;
        private final int pageSize;
        public void goToPrevPage() {
            this.keyValues = new ArrayList<>(keyValues);
            if (searchText == null) {
        private Object keyValue = null;
            if (fkColumn == null) {
        return null;
 *
            }
        this.valueController = valueController;
    private class CopyAction extends Action {
        int pageSize = executionContext == null ? 200
            controller.reload(false);

import org.jkiss.dbeaver.model.navigator.DBNUtils;
            maxKnownPage = 0;
import org.jkiss.code.Nullable;
            } catch (DBException e1) {
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetController;

            IAttributeController attributeController = (IAttributeController) valueController;
            selectCurrentValue();
    private void showCurrentValue() {
            editorSelector.setRedraw(true);
                    estimateOnePage(false);
 *
                        DBDAttributeBinding rowAttr = DBUtils.findBinding(rowAttributes, precAttribute);
import org.jkiss.dbeaver.model.exec.DBExecUtils;

        @Override
                            restColumns.add(new DBDAttributeValue(precAttribute, precValue));
            @NotNull DBRProgressMonitor monitor,

        this.valueEditor = valueEditor;
        private boolean prevPageAvailable = false;
import org.jkiss.dbeaver.Log;
            if (!editorSelector.isDisposed()) {
            editorSelector.setSortDirection(sortAsc ? SWT.DOWN : SWT.UP);
        public void reset(@Nullable Object valueToShow) {
        // Try to select current value in the table


                    data = searchText == null ? accessor.getValuesNear(keyValue, true, offset, pageSize)
                labelGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                        ((IAttributeController) valueController).getBinding(),
            });
        }
            });
                } else {
            DBSEntityAttribute refColumn
                prevPageAvailable = true;
                                if (tableNode != null) {

            menuMgr.setRemoveAllWhenShown(true);
                long offset = (Math.abs(currPageNumber)  - 1) * pageSize + halfPageSize;
                                controller.reload(true);
        private List<DBDLabelValuePair> loadNonComparableKeyValues(DBSDictionaryAccessor accessor) throws DBException {
            }
                    valuesData.keyHandler.getValueDisplayString(
            valueFilterText.addModifyListener(e -> {
            if (result != null) {
        for (TableItem item : items) {
            }
import org.jkiss.dbeaver.ui.data.IValueEditor;
        @Override
        List<DBDLabelValuePair> keyValues;
        editorSelector.setRedraw(false);
                estimateHead(prefix.size(), halfPageSize);
                        public void widgetSelected(SelectionEvent e) {
        }
        }
    private class SelectorLoaderVisualizer extends ProgressLoaderVisualizer<EnumValuesData> {
    private final IValueController valueController;
    class SelectorLoaderService extends AbstractLoadService<EnumValuesData> {
        DBSEntityAttributeRef keyColumn;
                manager.add(new CopyAction());
        
    }

        public boolean isPrevPageAvailable() {
        if (refConstraint instanceof DBSEntityAssociation) {
                } catch (Exception e) {
        }
        }
        editorSelector.setLayoutData(gd);
package org.jkiss.dbeaver.ui.data.editors;
                List<DBDLabelValuePair> suffix = searchText == null ? accessor.getValuesNear(keyValue, false, 0, halfPageSize)
     * Returns action to allow editor paging
                Object curValue = valueEditor.extractEditorValue();
                        }
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
 */

        private boolean firstPageFound = false;


            });
                );
            super(loadingService, editorSelector);
            } catch (DBException e) {
            valueFilterText.setMessage(ResultSetMessages.reference_value_editor_search_hint_value);

            super("Copy Value");
            editorSelector.setSortColumn(column);
            if (dictFilterJob != null) {
        public void visualizeLoading() {
                        @Override
        if (!(valueController instanceof IAttributeController)) {

        this.valueEditor = valueEditor;
        if (selection != null && selection.length > 0) {

        }
                    ? (a, b) -> CommonUtils.compare(a.getValue(), b.getValue())
 * ReferenceValueEditor

import org.eclipse.swt.SWT;
            DBSDataContainer dataContainer = valueController.getDataController().getDataContainer();
            super.visualizeLoading();
                reloadData();
                primeValueToSelection();
                log.warn(e.getMessage());
        public void completeLoading(EnumValuesData result) {

                data.addAll(suffix);
    private TableColumn prevSortColumn = null;
            }
        this.rsController = rsController;

import org.eclipse.swt.custom.StyledText;
        }
            return;
                    DBSEntityAttribute precAttribute = precColumn.getAttribute();
        }
                restColumns = new ArrayList<>();
        private boolean nextPageAvailable = false;
public class ReferenceValueEditor {

                    });
                log.error(e);
        }
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetThemeSettings;
            }
            List<DBDAttributeValue> restColumns = null;
            if (currPageNumber == 0) {
        private void applyFilter(@Nullable Object valueToShow, @NotNull String pattern) {
        private void estimateHead(int dataObtained, int dataExpected) {
            firstPageFound |= !prevPageAvailable;
            actionGoForward.setEnabled(false);
            if (refreshMainData && rsController != null) {
                List<DBDLabelValuePair> prefix = searchText == null ? accessor.getValuesNear(keyValue, true, 0, halfPageSize)
            }
        } finally {
            for (DBDLabelValuePair entry : valuesData.keyValues) {
            prevSortColumn = column;
            }
    {
        public void run() {
                // Set reverse order
        editorSelector.setFont(ResultSetThemeSettings.instance.resultSetFont);
                return null;
            DBSEntityAttribute activeRefColumn = DBUtils.getReferenceAttribute(monitor, association, tableColumn,
            }
    }
                    final DBDValueHandler colHandler = DBUtils.findValueHandler(fkAttribute.getDataSource(), fkAttribute);
                if (accessor.isKeyComparable() && keyValue != null) {

            return ResultSetUtils.getEnumerableConstraint(((IAttributeController) valueController).getBinding());
            this.reloadData();
        final String curTextValue = valueController.getValueHandler().getValueDisplayString(
            Object value = selection[0].getData();
                        valuesData.keyColumn.getAttribute(),
                    : accessor.getSimilarValuesNear(searchText, true, true, keyValue, false, 0, halfPageSize);
        //gd.widthHint = 300;
        
        @Override
    {
    public void setValueEditor(IValueEditor valueEditor) {
        private List<DBDLabelValuePair> loadComparableKeyValues(DBSDictionaryAccessor accessor) throws DBException {
    }
        @Override
                return null;
            }
            if (prevPageAvailable) {
import org.jkiss.utils.CommonUtils;
        SortListener sortListener = new SortListener();
                if (curItem != null) {
    private DBSEntityReferrer getEnumerableConstraint()
                estimateTail(suffix.size(), halfPageSize);
                }
            EnumValuesData[] result = new EnumValuesData[1];
                }
        }
        }
    }
                    return loadNonComparableKeyValues(accessor);
            this.resetPages();

            UIUtils.setClipboardContents(editorSelector.getDisplay(), TextTransfer.getInstance(), result.toString());
            this.keyColumn = keyColumn;
        private long currPageNumber = 0;
import org.jkiss.utils.ReaderWriterLock.ExceptableFunction;
        }
                // error
            } else if (CommonUtils.equalObjects(String.valueOf(searchText), String.valueOf(pattern))) {
        TableColumn valueColumn = UIUtils.createTableColumn(editorSelector, SWT.LEFT, ResultSetMessages.dialog_value_view_column_value);
            MenuManager menuMgr = new MenuManager();
            if (association.getReferencedConstraint() != null) {
    }; 
import org.jkiss.dbeaver.ui.data.IValueController;
                                    refTable,
                );
                if (currPageNumber < 0) {
        }
                        DBDDisplayFormat.EDIT
                            Object precValue = attributeController.getRowController().getAttributeValue(rowAttr);
            }
    private final IResultSetController rsController;
 * distributed under the License is distributed on an "AS IS" BASIS,
                item.setFont(ResultSetThemeSettings.instance.resultSetFontBold);

        });
                return null;
    private final Action actionGoForward = new Action("Move Forward", DBeaverIcons.getImageDescriptor(UIIcon.ARROW_RIGHT)) {
    }
                    UIIcon.CONFIGURATION,
        }
                        DBDDisplayFormat.EDIT));
 *
            }
                TableItem discItem = new TableItem(editorSelector, SWT.NONE);
            IAttributeController attributeController,
            try {
                    new SelectionAdapter() {
            try {
    private void primeValueToSelection() {
                    refColumn,
        try {

            final DBSEntityAttribute tableColumn = attributeController.getBinding().getEntityAttribute();
        }
                DBExecUtils.tryExecuteRecover(monitor, valueController.getExecutionContext().getDataSource(), param -> {
            if (allColumns.size() > 1) {
        }
                }
                    if (item.getText(0).equals(curTextValue)) {
    /**
    private DBSEntityReferrer refConstraint;
            if (dataObtained > 0) {
            : executionContext.getDataSource().getContainer().getPreferenceStore().getInt(ModelPreferences.DICTIONARY_MAX_ROWS);
            return getEnumValuesData(monitor, attributeController, fkColumn, association, activeRefColumn);
            editorSelector.setSortColumn(descColumn);
import org.jkiss.dbeaver.model.struct.*;
        EnumValuesData(Collection<DBDLabelValuePair> keyValues, DBSEntityAttributeRef keyColumn, DBDValueHandler keyHandler) {
            if (nextPageAvailable) {
import org.eclipse.swt.widgets.*;
            }
            {
        public ViewController(int pageSize) {
            lastPageFound |= !nextPageAvailable;
        @Override
            firstPageFound = true;
                    data = accessor.getValues(offset, pageSize);
    private Table editorSelector;
                        curItemIndex = i;
            return data;
        }
        

    private class ViewController {
                actionGoForward.setEnabled(controller.isNextPageAvailable());
                item.setFont(ResultSetThemeSettings.instance.resultSetFont);
                final DBSEntity refTable = association.getReferencedConstraint().getParentObject();
                                }
            try {
                Link dictLabel = UIUtils.createLink(
            if (fkAttribute != null && enumConstraint != null) {
            if (activeRefColumn == null) {
 * you may not use this file except in compliance with the License.
        editorSelector.setLinesVisible(false);
        }

        GridData gd = new GridData(GridData.FILL_BOTH);
import org.jkiss.dbeaver.ui.navigator.actions.NavigatorHandlerObjectOpen;
            this.searchText = null;
        TableItem[] items = editorSelector.getItems();
        }
/**
 * DBeaver - Universal Database Manager
        }
                            });
 * See the License for the specific language governing permissions and
            editorSelector.setSortDirection(sortDirection);

        editorSelector.addSelectionListener(new SelectionAdapter() {
        ModifyListener modifyListener = e -> showCurrentValue();
            } else {
            log.error(e1);
                    : accessor.getSimilarValuesNear(searchText, true, true, keyValue, true, 0, halfPageSize);
            }
                return null;
import org.eclipse.swt.events.SelectionAdapter;
            curEditorValue,
            UIUtils.packColumns(editorSelector, false);
            return false;
                        : accessor.getSimilarValuesNear(searchText, true, true, keyValue, false, offset, pageSize);
                discItem.setText(0,
            this.resetPages();
                        entry.getValue(),
            
                    curItem.setFont(ResultSetThemeSettings.instance.resultSetFontBold);
        DBDValueHandler keyHandler;
                controller.filter(valueController.getValue(), filterPattern);
                List<DBDAttributeBinding> rowAttributes = attributeController.getRowController().getRowAttributes();
        public Object getFamily() {
            }
                editorSelector.showItem(item);
                                );
            if (CommonUtils.isEmpty(CommonUtils.toString(pattern))) {
                return null;
            } catch (DBException e) {
        }
        }
        private boolean lastPageFound = false;
                    }
                this.applyFilter(this.keyValue, this.searchText);
                    editorSelector.showItem(curItem);
        
                        }
                dictLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
import org.jkiss.dbeaver.model.runtime.load.AbstractLoadService;
                                    NavigatorHandlerObjectOpen.openEntityEditor(tableNode, DatabaseDataEditor.class.getName(), window);
import org.jkiss.dbeaver.ui.*;
        editorSelector.setFont(ResultSetThemeSettings.instance.resultSetFont);
                    if (enumValues.isEmpty()) {

    public ReferenceValueEditor(@Nullable IResultSetController rsController, IValueController valueController, IValueEditor valueEditor) {
                        return null;
    private final Action actionGoBackward = new Action("Move Backward", DBeaverIcons.getImageDescriptor(UIIcon.ARROW_LEFT)) {
        };

    };
            final DBSEntityConstraint refConstraint = association.getReferencedConstraint();
            if (tableColumn == null) {
            }
            } else {
        private void estimateOnePage(boolean noNextPage) {

                            }
        } catch (DBException e1) {
            dictFilterJob = LoadingJob.createService(loadingService, new SelectorLoaderVisualizer(loadingService));
                    data = accessor.getSimilarValues(searchText, true, true, offset, pageSize);
                editorSelector.deselectAll();
                sortDirection = (sortDirection == SWT.UP ? SWT.DOWN : SWT.UP);
import org.eclipse.jface.action.ContributionItem;
                    restColumns,

                } else {
            ((Text)control).addModifyListener(modifyListener);
                TableItem curItem = null;

        } else if (control instanceof StyledText) {
 * You may obtain a copy of the License at
                Composite labelGroup = UIUtils.createPlaceholder(parent, 2);
 * @author Serge Rider
            List<DBDLabelValuePair> data;
            valueFilterText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    
        @Override
import org.jkiss.dbeaver.model.DBUtils;
                        public void run() {
        return new ContributionItem[]{
        }
            nextPageAvailable = !noNextPage;

                if (!result.isEmpty()) result.append("\n");
                    labelGroup,
        private void resetPages() {
                    if (precAttribute != null) {

import org.jkiss.dbeaver.ModelPreferences;
            menuMgr.addMenuListener(manager -> {
        try {
                    labelGroup,
                if (currPageNumber == 0) {
        public void goToNextPage() {
 *     http://www.apache.org/licenses/LICENSE-2.0
                    comparator = comparator.reversed();
                    e.printStackTrace(System.out);
        private String searchText = null;
                    }
            if (dataContainer == null || dataContainer.getDataSource() == null ||
            @Override
        private final int halfPageSize;
            this.reloadData();
                    }
                    ResultSetMessages.reference_value_editor_define_description_value,
            s -> showCurrentValue(),
import org.jkiss.dbeaver.ui.controls.resultset.ThemeConstants;
        ) throws DBException {
                        }

            ((IAttributeController) valueController).getBinding(),
            this.lastPageFound = false;
                data = prefix;
            boolean dataObtained = result != null && !result.keyValues.isEmpty();

        {
        boolean newValueFound = false;
        }
    private LoadingJob<EnumValuesData> dictFilterJob;
        this.controller = new ViewController(pageSize);
                if (!sortAsc) {
                        public void widgetSelected(SelectionEvent e) {
            super(ResultSetMessages.dialog_value_view_job_selector_name + valueController.getValueName() + " possible values");
                return null;
            ActionUtils.makeActionContribution(actionGoBackward, false),
            dictFilterJob.schedule(250);
                    List<DBDLabelValuePair> enumValues = action.apply(accessor);
        //gd.grabExcessVerticalSpace = true;
                dictFilterJob.cancel();
        public boolean isNextPageAvailable() {
        if (!sortByValue) {
        public SortListener() {
            valueFilterText = new Text(parent, SWT.BORDER | SWT.SEARCH | SWT.ICON_CANCEL);
            return;
        }
        public void handleEvent(Event event) {
        }
        }
import java.util.List;
/*
                for (DBSEntityAttributeRef precColumn : allColumns) {
     * @return actions for paging
        return getEnumerableConstraint() != null;
                    return loadComparableKeyValues(accessor);

                    TableItem item = items[i];

            final DBSDictionary enumConstraint = refConstraint == null ? null : (DBSDictionary) refConstraint.getParentObject();
import java.util.*;
                reloadData();
            //editorControl.setText(selection[0].getText());

                nextPageAvailable = true;
     *

import org.eclipse.swt.events.SelectionEvent;
        public CopyAction() {
            if (firstPageFound) {
        private void reloadData() {
            return valueController.getExecutionContext();
        private long minKnownPage = 0;
        }
            if (editorSelector.isDisposed() || valueController.getExecutionContext() == null) {
    @Nullable
        Object curEditorValue;
    }
    public boolean isReferenceValue()
            if (lastPageFound) {
        if (editorControl != null && !editorControl.isDisposed()) {
            this.editorSelector.setMenu(menuMgr.createContextMenu(this.editorSelector));
                }
    }
                        item.setFont(ResultSetThemeSettings.instance.resultSetFont);
            this.keyValue = valueToShow;
        }
                    if (precColumn == fkColumn) {
                log.error(e1);
                this.reset(valueToShow);
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
        if (!newValueFound) {
        refConstraint = getEnumerableConstraint();
            DBSEntityAssociation association;
    }
                                    monitor,
import org.eclipse.swt.dnd.TextTransfer;
            if (monitor.isCanceled()) {
            controller.goToPrevPage();
import org.jkiss.dbeaver.DBException;
            }
            DBSEntityAttributeRef fkColumn,
