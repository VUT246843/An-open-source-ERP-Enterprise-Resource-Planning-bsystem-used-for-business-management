        setShellStyle(SWT.CLOSE | SWT.TITLE | SWT.MAX | SWT.RESIZE);
    }
    private boolean isRowCountEnabled() {
        Composite optionsGroup = UIUtils.createTitledComposite(
    {
            showRowCountCheck.setEnabled(isQueryDatabaseEnabled());
            new ColumnLabelProvider() {
                    optionsGroup,
        return CommonUtils.getBoolean(getDialogBoundsSettings().getBoolean(PROP_CASE_INSENSITIVE_SEARCH), true);
        okPressed();

            controlLabel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        value = filter.getFilterValue();
                });
                    final Long count = result.getTotalDistinctCount();
    }
        return tableComposite;
        Composite group = super.createDialogArea(parent);
import org.eclipse.osgi.util.NLS;
            GridData.FILL_HORIZONTAL,
    @Override
            true,
        return value;
                    public void widgetSelected(SelectionEvent e) {
    protected boolean isResizable()
    public Object getValue() {
                    ResultSetMessages.dialog_filter_value_edit_table_options_checkbox_case_insensitive_label,

    {


                ResultSetMessages.dialog_filter_value_edit_table_options_checkbox_read_from_server_label,
            tableComposite,
                    getDialogBoundsSettings().put(PROP_SHOW_ROW_COUNT, showRowCountCheck.getSelection());
                @Override
 * See the License for the specific language governing permissions and

    }
    @Override
            && SQLUtils.getDialectFromObject(attribute).getCaseInsensitiveExpressionFormatter(DBCLogicalOperator.LIKE) != null;
        filter.createFilterButton(ResultSetMessages.sql_editor_resultset_filter_panel_btn_apply, new SelectionAdapter() {

}

public class FilterValueEditPopup extends AbstractPopupPanel {
            close();
                UIUtils.createEmptyLabel(labelComposite, 1, 1);
        final DBDAttributeBinding attribute = filter.getAttribute();
        optionsGroup.moveAbove(filter.getButtonsPanel());


                1);
            value = filter.getSelectedFilterValue();
                    }
 * Copyright (C) 2010-2026 DBeaver Corp and others
                public void widgetSelected(SelectionEvent e) {
    }
        {
        filter.setQueryDatabase(isQueryDatabaseEnabled());
            }
            }, null);
            }
                caseInsensitiveSearchCheck.setEnabled(isQueryDatabaseEnabled());
            Composite labelComposite = UIUtils.createComposite(group, 2);
        {
            Table table = filter.getTableViewer().getTable();
            UIUtils.asyncExec(() -> {
            if (descReferrer instanceof DBSEntityAssociation) {
    private static final String PROP_SHOW_DISTINCT_VALUES_COUNT = "showDistinctValuesCount";
                        table.getColumn(0).setText(ResultSetMessages.dialog_filter_value_edit_table_value_label);
            ResultSetMessages.dialog_filter_value_edit_table_value_label,
    private boolean isCaseInsensitiveSearchEnabled() {

            showDistinctValuesCountCheck.addSelectionListener(new SelectionAdapter() {
                        ((DBDLabelValuePair) element).getValue(),
                        if (editDictionaryPage.edit(parent.getShell())) {
        return ArrayUtils.contains(DBUtils.getAttributeOperators(attribute), DBCLogicalOperator.LIKE)
                    @Override
    }
                    if (showRowCountCheck != null) {

import org.jkiss.dbeaver.model.DBPDataKind;
                }
import org.eclipse.swt.layout.RowLayout;
                        filter.getAttribute(),
import org.eclipse.swt.widgets.*;
                ResultSetMessages.dialog_filter_value_edit_table_options_checkbox_show_row_count_description,
                    isCaseInsensitiveSearchEnabled(),
        }
    private boolean isDistinctValuesCountEnabled() {
        filter.setupTable(
        }
import org.eclipse.jface.dialogs.IDialogSettings;
/*
    }
                }
            if (e.detail == SWT.TRAVERSE_ARROW_PREVIOUS || e.detail == SWT.TRAVERSE_ARROW_NEXT) {
                    reloadFilterValues();
import org.eclipse.swt.SWT;
                isRowCountEnabled(),
        filter.setShowRowCount(isRowCountEnabled());
                    }
                if (table.getSelectionIndex() < 0 && table.getItemCount() > 0) {
        if (descReferrer == null) {
            Button queryDatabaseCheck = UIUtils.createCheckbox(
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.jkiss.dbeaver.ui.controls.ViewerColumnController;
            closeOnFocusLost(showDistinctValuesCountCheck);
        Composite tableComposite = UIUtils.createComposite(group, 1);
    }
 *
            },
    private static final String PROP_SHOW_ROW_COUNT = "showRowCount";
                table.setFocus();
import org.jkiss.dbeaver.ui.UIUtils;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
                caseInsensitiveSearchCheck.addSelectionListener(new SelectionAdapter() {

                            NUMBER_FORMAT.format(count)
import org.eclipse.swt.graphics.Point;

                            NUMBER_FORMAT.format(count),

        }
        return UIUtils.getDialogSettings(DIALOG_ID);
 * Unless required by applicable law or agreed to in writing, software
            true,
        );
import org.jkiss.code.NotNull;
                    getDialogBoundsSettings().put(PROP_QUERY_DATABASE, isEnabled);
    protected Point getInitialLocation(Point initialSize) {
        return true;
                            ResultSetMessages.dialog_filter_value_edit_table_value_total_label,
 *
            });
        filter.getTableViewer().addDoubleClickListener(event -> {
        DBSEntityReferrer descReferrer = ResultSetUtils.getEnumerableConstraint(filter.getAttribute());
            @Override
                public void widgetSelected(SelectionEvent e) {
            columnController.addColumn(ResultSetMessages.dialog_filter_value_edit_table_description_label, ResultSetMessages.dialog_filter_value_edit_table_description_description, SWT.LEFT, true, true, new ColumnLabelProvider() {
        filter.setShowDistinctValuesCount(isDistinctValuesCountEnabled());
            closeOnFocusLost(queryDatabaseCheck);
                        reloadFilterValues();
    private Point location;
                    if (count == null) {
                        table.getColumn(0).setText(NLS.bind(

            return location;
                    if (element instanceof DBDLabelValuePairExt && isRowCountEnabled()) {
import org.eclipse.swt.events.SelectionAdapter;
        }
            });
                optionsGroup,

    protected Composite createDialogArea(Composite parent)
    public FilterValueEditPopup(Shell parentShell, @NotNull ResultSetViewer viewer, @NotNull DBDAttributeBinding attr, @NotNull ResultSetRow[] rows) {
    private Button showDistinctValuesCountCheck;
                }
            });
            showRowCountCheck.addSelectionListener(new SelectionAdapter() {
                Table table = filter.getTableViewer().getTable();
                            ResultSetMessages.dialog_filter_value_edit_table_value_total_shown_label,
        Table table = filter.getTableViewer().getTable();
            } else {
            0,
        columnController.addColumn(
            filter.getAttribute().getDataKind() == DBPDataKind.NUMERIC,
 * you may not use this file except in compliance with the License.
                isQueryDatabaseEnabled(),
                    @Override
            } else if (e.detail == SWT.TRAVERSE_RETURN) {
                public void widgetSelected(SelectionEvent e) {


            closeOnFocusLost(showRowCountCheck);
        tableComposite.setLayoutData(gd);
                optionsGroup,
                Link hintLabel = UIUtils.createLink(labelComposite, ResultSetMessages.dialog_filter_value_edit_label_define_description, new SelectionAdapter() {
    }
            labelComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
import java.text.NumberFormat;
            0

                        table.getColumn(0).setText(NLS.bind(
            SWT.BORDER | SWT.SINGLE | SWT.FULL_SELECTION | SWT.V_SCROLL | SWT.H_SCROLL |
 * You may obtain a copy of the License at

                    }
        filter.setFilterPattern(null);
        gd.heightHint = 300;
                caseInsensitiveSearchCheck = UIUtils.createCheckbox(
    }
            }
    }
        gd.widthHint = 400;
    private void reloadFilterValues() {
import org.jkiss.dbeaver.model.data.DBDLabelValuePair;
    }
        columnController.createColumns(true);
            queryDatabaseCheck.addSelectionListener(new SelectionAdapter() {
                @Override

                @Override
    protected IDialogSettings getDialogBoundsSettings()
        });
 * limitations under the License.
    @Override
import org.jkiss.dbeaver.model.struct.DBSEntityReferrer;
    private Object value;
            true,
            });

                (filter.getOperator() == DBCLogicalOperator.IN ? SWT.CHECK : SWT.NONE),
 * DBeaver - Universal Database Manager
    private static final String PROP_QUERY_DATABASE = "queryDatabase";
                }
        }
                        showRowCountCheck.setEnabled(isEnabled);
import org.jkiss.utils.ArrayUtils;
                    }
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetUtils;
        return getDialogBoundsSettings().getBoolean(PROP_SHOW_ROW_COUNT);
        if (!filter.isDictionarySelector()) {
    private static final NumberFormat NUMBER_FORMAT = NumberFormat.getInstance();
                    }
        });
                closeOnFocusLost(caseInsensitiveSearchCheck);
                    );
                }
            }));
            if (isAttributeSupportsLike()) {
            SWT.LEFT,

            tableComposite,
                    return filter.getAttribute().getValueHandler().getValueDisplayString(
        super(parentShell, NLS.bind(ResultSetMessages.dialog_filter_value_edit_title, attr.getFullyQualifiedName(DBPEvaluationContext.UI)));
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
import org.jkiss.dbeaver.model.exec.DBCLogicalOperator;
import org.jkiss.dbeaver.model.struct.DBSEntityAssociation;
            true,

                    public void widgetSelected(SelectionEvent e) {
        reloadFilterValues();
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetRow;
        return super.getInitialLocation(initialSize);
                    return ((DBDLabelValuePair) element).getLabel();
    private void applyFilterValue() {
                });
                        ));
    }
                    reloadFilterValues();
        filter.setCaseInsensitiveSearch(isCaseInsensitiveSearchEnabled());
    @Override
        return getDialogBoundsSettings().getBoolean(PROP_SHOW_DISTINCT_VALUES_COUNT);

import org.jkiss.dbeaver.model.data.DBDLabelValuePairExt;
                        return null;

    private boolean isAttributeSupportsLike() {
                        DBDDisplayFormat.UI

                    reloadFilterValues();
        closeOnFocusLost(filterTextbox, table);
                }
 * distributed under the License is distributed on an "AS IS" BASIS,
                        caseInsensitiveSearchCheck.setEnabled(isEnabled);
                        EditDictionaryPage editDictionaryPage = new EditDictionaryPage(((DBSEntityAssociation) descReferrer).getAssociatedEntity());
                @Override
import org.jkiss.utils.CommonUtils;
import org.eclipse.swt.layout.GridData;
                        }
 * Licensed under the Apache License, Version 2.0 (the "License");
                );
import org.jkiss.dbeaver.ui.dialogs.AbstractPopupPanel;
    private static final String PROP_CASE_INSENSITIVE_SEARCH = "caseInsensitiveSearch";
    private GenericFilterValueEdit filter;
                        return NUMBER_FORMAT.format(((DBDLabelValuePairExt) element).getCount());
        filterTextbox.addTraverseListener(e -> {
import org.jkiss.dbeaver.model.DBUtils;
                ResultSetMessages.dialog_filter_value_edit_table_options_checkbox_show_row_count_label,
                    1
                    UIUtils.packColumns(table, false);

                public String getText(Object element) {

import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
    public void setLocation(Point location) {
    private boolean isQueryDatabaseEnabled() {
import org.jkiss.dbeaver.model.sql.SQLUtils;
            null,
        Text filterTextbox = filter.addFilterText(group);
                    getDialogBoundsSettings().put(PROP_SHOW_DISTINCT_VALUES_COUNT, showDistinctValuesCountCheck.getSelection());

            new GridData(GridData.FILL_BOTH));
        ViewerColumnController<?, ?> columnController = new ViewerColumnController<>("sqlFilterValueEditPopup", filter.getTableViewer());
            showRowCountCheck = UIUtils.createCheckbox(
                    boolean isEnabled = queryDatabaseCheck.getSelection();
            }
                            reloadFilterValues();
                    } else if (count == table.getItemCount()) {
        return CommonUtils.getBoolean(getDialogBoundsSettings().get(PROP_QUERY_DATABASE), true);
            columnController.addColumn(ResultSetMessages.dialog_filter_value_edit_table_count_label, ResultSetMessages.dialog_filter_value_edit_table_count_description, SWT.LEFT, true, true, true, null, new ColumnLabelProvider() {
        return UIUtils.createPlaceholder(parent, 1);
                if (table != null && !table.isDisposed()) {
            null
                public String getText(Object element) {
    private Button caseInsensitiveSearchCheck;
import org.jkiss.dbeaver.ui.editors.object.struct.EditDictionaryPage;

                            NUMBER_FORMAT.format(table.getItemCount())
                applyFilterValue();
 *
                }
            ResultSetMessages.dialog_filter_value_edit_table_value_description,
        this.location = location;
    {
            ResultSetMessages.dialog_filter_value_edit_table_group_options,
                @Override
        );

        filter.loadValues(result ->
                    if (caseInsensitiveSearchCheck != null) {
        UIUtils.addEmptyTextHint(filterTextbox, text -> ResultSetMessages.dialog_filter_value_edit_text_hint);
        if (descReferrer != null) {
                public String getText(Object element) {
                    }
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
                    table.setSelection(0);
        optionsGroup.setLayout(new RowLayout());
                        ));
        filterTextbox.setFocus();
                    } else {
    @Override
                @Override
                        getDialogBoundsSettings().put(PROP_CASE_INSENSITIVE_SEARCH, caseInsensitiveSearchCheck.getSelection());
                applyFilterValue();

                hintLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
        filter = new GenericFilterValueEdit(viewer, attr, rows, DBCLogicalOperator.IN);
            showDistinctValuesCountCheck = UIUtils.createCheckbox(optionsGroup, ResultSetMessages.dialog_filter_value_edit_table_options_checkbox_show_distinct_values_count_label, ResultSetMessages.dialog_filter_value_edit_table_options_checkbox_show_distinct_values_count_description, isDistinctValuesCountEnabled(), 1);
            Label controlLabel = UIUtils.createControlLabel(labelComposite, ResultSetMessages.dialog_filter_value_edit_label_choose_values);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        });
    private static final String DIALOG_ID = "DBeaver.FilterValueEditMenu";//$NON-NLS-1$
        if (location != null) {
                    ResultSetMessages.dialog_filter_value_edit_table_options_checkbox_case_insensitive_description,
        GridData gd = new GridData(GridData.FILL_BOTH);
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
package org.jkiss.dbeaver.ui.controls.resultset.valuefilter;


                ResultSetMessages.dialog_filter_value_edit_table_options_checkbox_read_from_server_description,
 */
                1);

        }
    protected Control createButtonBar(@NotNull Composite parent) {
import org.eclipse.swt.events.SelectionEvent;
                    } else {
    }

            public void widgetSelected(SelectionEvent e) {
    private Button showRowCountCheck;
    }

                }
