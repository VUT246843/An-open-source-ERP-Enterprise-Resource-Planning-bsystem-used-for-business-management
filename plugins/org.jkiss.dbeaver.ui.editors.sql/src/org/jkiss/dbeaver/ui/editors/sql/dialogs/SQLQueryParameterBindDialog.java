                    editOnEnter = false;
                 */
                    final GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true, 0, 0);
                @Override

                    });
import org.jkiss.dbeaver.model.sql.SQLScriptContext;
                            if (result != null) {

                    buttonLayoutData.heightHint = editor.getSize().y;
                    savedParamValues.put(
            SQLEditorMessages.dialog_sql_param_hide_checkbox_tip,
    private final Map<String, List<SQLQueryParameter>> dupParameters = new HashMap<>();

                            }
import org.jkiss.dbeaver.model.sql.SQLQueryParameter;
    private static final Log log = Log.getLog(SQLQueryParameterBindDialog.class);

import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;
        skipButton.setToolTipText("Ignore parameters and execute query/script as is");
 * you may not use this file except in compliance with the License.
            fillParameterList(isHideIfSet());
                if (paramInfo != null) {
        });
/*
            1);
import org.jkiss.utils.CommonUtils;
import org.eclipse.swt.events.SelectionAdapter;
 */
    }
        ((GridLayout) parent.getLayout()).numColumns++;
 * See the License for the specific language governing permissions and
                    }
                    param.setVariableSet(!CommonUtils.isEmpty(paramInfo.value));
                }
            queryPreviewPanel,
                    We don't use Control in saveEditorValue due to complications of getting Text from it, due to it being a composite without getText() method
import org.jkiss.dbeaver.runtime.ui.UIServiceSQL;

                        }
            indexColumn.setWidth(40);
 * Licensed under the Apache License, Version 2.0 (the "License");
                    new DataSourceContextProvider(query.getDataSource()),
                    queryContext.setVariable(paramInfo.name, paramInfo.value);
                        if (e.detail == SWT.TRAVERSE_TAB_NEXT || e.detail == SWT.TRAVERSE_TAB_PREVIOUS) {

            getQueryWithFilledParameters()
        getShell().setText(SQLEditorMessages.dialog_sql_param_title);
        });
                continue;

                    if (item.isDisposed()) {
            final Composite paramsComposite = UIUtils.createComposite(sash, 1);
        }
import org.eclipse.swt.custom.SashForm;
    private void fillParameterList(boolean hideVariables) {
            if (param.isNamed() && param.getValue() == null) {
                    Button button = UIUtils.createPushButton(composite, null, DBeaverIcons.getImage(UIIcon.DOTS_BUTTON));
import org.eclipse.swt.layout.GridData;
                setReturnCode(IDialogConstants.IGNORE_ID);
    private Object queryPreviewPanel;
import org.jkiss.dbeaver.ui.controls.TableColumnSortListener;
        if (!UIUtils.isInDialog()) {
            }
        final Composite queryComposite = new Composite(sash, SWT.BORDER);
    private final SQLScriptContext queryContext;
import org.jkiss.dbeaver.ui.DBeaverIcons;

                                editor.getText() == null ? "" : editor.getText());
            final TableColumn valueColumn =

                protected void saveEditorValue(Control control, int index, TableItem item) {
    public static boolean isHideIfSet() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            registry.setParameter(param.name, param.value);

    private String getQueryWithFilledParameters() {
        paramTable.removeAll();
        if (hideIfSetCheck != null) {
        super.createButtonsForButtonBar(parent);
        SQLQuery queryCopy = new SQLQuery(query.getDataSource(), query.getText(), query);
                log.error(e);
                }
                    if (index != 2) {
    @Override

                    GridData buttonLayoutData = new GridData(SWT.FILL, SWT.FILL, false, false, 0, 0);
        for (SQLQueryParameterRegistry.ParameterInfo param : savedParamValues.values()) {
                fillParameterList(hideIfSetCheck.getSelection());
                                dup.setVariableSet(!CommonUtils.isEmpty(newValue));
                    SQLQueryParameter param = (SQLQueryParameter) item.getData();

        sash.setWeights(600, 400);
                        tableEditor.showEditor(paramTable.getItem(0), 2);
 *
    private Table paramTable;
        super(site.getShell());
import org.eclipse.jface.dialogs.TrayDialog;
import org.jkiss.dbeaver.model.sql.registry.SQLQueryParameterRegistry;
    protected Control createDialogArea(Composite parent) {
                            this.keyTraversed(e);
                            this.keyTraversed(e);

            final TableColumn indexColumn = UIUtils.createTableColumn(paramTable, SWT.LEFT, "#");
    private void updateQueryPreview() {
                    return composite;
import org.eclipse.ui.IWorkbenchPartSite;
                                editor.setText(result);
                            for (SQLQueryParameter dup : dups) {
                        return null;
        UIUtils.applyMonospaceFont(queryComposite);
                private Text editor;
                protected Control createEditor(Table table, int index, TableItem item) {
    protected void okPressed() {
            paramTable.setLinesVisible(true);
                    site,
            item.setImage(DBeaverIcons.getImage(DBIcon.TREE_ATTRIBUTE));
}
import org.jkiss.dbeaver.model.impl.DataSourceContextProvider;
        // Restore saved values from registry
            if (param.getPrevious() != null) {
                        new SQLQueryParameterRegistry.ParameterInfo(param.getName(), newValue));
                            final String result = EditTextDialog.editText(parent.getShell(), UIMessages.edit_text_dialog_title_edit_value,
        ));
    private static final String PARAM_HIDE_IF_SET = "PARAM_HIDE_IF_SET";//$NON-NLS-1$
        this.queryContext = new SQLScriptContext(null, new DataSourceContextProvider(query.getDataSource()), null, dummyWriter, null);
                    editor.addTraverseListener(e -> {


                    if (param.isNamed()) {
import org.jkiss.dbeaver.ui.controls.CustomTableEditor;
                );
        }
        return composite;
        SQLQueryParameterRegistry registry = SQLQueryParameterRegistry.getInstance();
            isHideIfSet(),


                    SQLQueryParameter param = (SQLQueryParameter) item.getData();
            item.setText(0, String.valueOf(param.getOrdinalPosition() + 1));

        hideIfSetCheck.addSelectionListener(new SelectionAdapter() {
                    }

                }
                @Override
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        final Composite composite = (Composite) super.createDialogArea(parent);

                    param.setVariableSet(!CommonUtils.isEmpty(newValue));
                /*
            SQLEditorMessages.dialog_sql_param_hide_checkbox,
            }
import org.eclipse.jface.dialogs.IDialogConstants;
        });

                        paramTable.select(0);
                        }
import org.jkiss.dbeaver.runtime.DBWorkbench;
                        if (e.detail == SWT.TRAVERSE_TAB_NEXT || e.detail == SWT.TRAVERSE_TAB_PREVIOUS) {
import java.util.HashMap;
        }
            item.setData(param);
import org.jkiss.dbeaver.model.sql.SQLUtils;
                        public void widgetSelected(SelectionEvent e) {
                        queryContext.setVariable(param.getName(), param.getValue());
                        final List<SQLQueryParameter> dups = dupParameters.get(param.getName());
        }
    }
    }
import org.eclipse.swt.widgets.*;
                UIUtils.asyncExec(() -> {
            final CustomTableEditor tableEditor = new CustomTableEditor(paramTable) {
import org.jkiss.dbeaver.ui.UIUtils;

import java.util.Map;
        this.parameters = parameters;

 * limitations under the License.
                    button.addTraverseListener(e -> {
        Button skipButton = UIUtils.createDialogButton(parent, IDialogConstants.IGNORE_LABEL, new SelectionAdapter() {
                UIUtils.createTableColumn(paramTable, SWT.LEFT, SQLEditorMessages.dialog_sql_param_column_value);
    @Override
            setShellStyle(SWT.CLOSE | SWT.TITLE | SWT.BORDER | SWT.RESIZE | getDefaultOrientation());

    private final IWorkbenchPartSite site;
import org.eclipse.swt.layout.GridLayout;
            getDialogBoundsSettings().put(PARAM_HIDE_IF_SET, hideIfSetCheck.getSelection());
 */
                    lastTraverseIndex = 2;


import org.jkiss.dbeaver.ui.dialogs.EditTextDialog;
    @Override
    private Button hideIfSetCheck;

                    }
        }
            gd.widthHint = 400;

            if (hideVariables && param.isVariableSet()) {
                    });
                    gridData.horizontalSpan = 0;
                continue;
                SQLQueryParameterRegistry.ParameterInfo paramInfo = registry.getParameter(param.getName());
                        if (e.detail == SWT.TRAVERSE_RETURN && (e.stateMask & SWT.CTRL) == SWT.CTRL) {
            @Override
                    gridData.verticalSpan = 0;
    public SQLQueryParameterBindDialog(IWorkbenchPartSite site, SQLQuery query, List<SQLQueryParameter> parameters) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
                        param.getName(),
        for (SQLQueryParameter param : this.parameters) {

import org.jkiss.dbeaver.model.sql.SQLQuery;
package org.jkiss.dbeaver.ui.editors.sql.dialogs;
        SQLQueryParameterRegistry registry = SQLQueryParameterRegistry.getInstance();
                    button.addSelectionListener(new SelectionAdapter() {
            }
        sash.setLayoutData(new GridData(GridData.FILL_BOTH));
 *
    private final List<SQLQueryParameter> parameters;
                        }
        UIUtils.createInfoLabel(composite, SQLEditorMessages.dialog_sql_param_hint);

                                dup.setValue(newValue);
                    param.setValue(paramInfo.value);
                    param.setValue(newValue);
                // Skip duplicates
            indexColumn.addListener(SWT.Selection, new TableColumnSortListener(paramTable, 0));
                    false,
                List<SQLQueryParameter> dups = dupParameters.computeIfAbsent(param.getName(), k -> new ArrayList<>());
            gd.heightHint = 200;
    @Override
    }
                    editor.addModifyListener(e -> saveEditorValue(editor, index, item));
                queryPreviewPanel = DBWorkbench.getService(UIServiceSQL.class).createSQLPanel(
        return UIUtils.getDialogSettings(DIALOG_ID).getBoolean(PARAM_HIDE_IF_SET);

                        @Override
                        if (dups != null) {
            paramTable = new Table(paramsComposite, SWT.SINGLE | SWT.FULL_SELECTION | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
            paramTable.setLayoutData(gd);
import org.jkiss.dbeaver.ui.internal.UIMessages;
            final GridData gd = new GridData(GridData.FILL_BOTH);
                dups.add(param);
 * DBeaver - Universal Database Manager
            try {
            }
                    "Query preview",
                    if (!paramTable.isDisposed() && paramTable.getItemCount() > 0) {
                    queryComposite,
                {
/**
        hideIfSetCheck = UIUtils.createCheckbox(composite,
                    editor = new Text(composite, SWT.NONE);
            item.setText(2, CommonUtils.notEmpty(param.getValue()));
                    getQueryWithFilledParameters()
        this.site = site;
            }
            };
import java.io.StringWriter;
        return queryCopy.getText();
                    updateQueryPreview();
                    composite.setLayoutData(gridData);
public class SQLQueryParameterBindDialog extends TrayDialog {

        queryComposite.setLayout(new FillLayout());
            valueColumn.setWidth(200);
            if (!parameters.isEmpty()) {
            item.setText(1, param.getOriginalName());
                        }
                    editor.setText(CommonUtils.notEmpty(param.getValue()));
                    button.setLayoutData(buttonLayoutData);
                    });
    protected boolean isResizable() {
        SashForm sash = new SashForm(composite, SWT.VERTICAL);
 *
            @Override
                            UIUtils.asyncExec(SQLQueryParameterBindDialog.this::okPressed);
            }
    }
    @Override
        UIUtils.asyncExec(() -> DBWorkbench.getService(UIServiceSQL.class).setSQLPanelText(
                    editor.setLayoutData(gridData);
    }

        return true;
            final TableColumn nameColumn = UIUtils.createTableColumn(paramTable, SWT.LEFT, SQLEditorMessages.dialog_sql_param_column_name);
import java.util.List;
            nameColumn.addListener(SWT.Selection, new TableColumnSortListener(paramTable, 1));

import java.util.ArrayList;
        super.okPressed();
        {
                    Composite composite = UIUtils.createPlaceholder(table, 2, 0);
        return false;

import org.eclipse.swt.SWT;
            public void widgetSelected(SelectionEvent e) {
    }
                    editor.selectAll();
        return UIUtils.getDialogSettings(DIALOG_ID);
                });
            paramTable.setHeaderVisible(true);
import org.eclipse.swt.events.SelectionEvent;
            nameColumn.setWidth(100);
    }

        this.query = query;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.jface.dialogs.IDialogSettings;
                }
    private final Map<String, SQLQueryParameterRegistry.ParameterInfo> savedParamValues = new HashMap<>();
        StringWriter dummyWriter = new StringWriter();

        List<SQLQueryParameter> setParams = new ArrayList<>(this.parameters);
 * Parameter binding
                        }
import org.jkiss.dbeaver.model.DBIcon;
                close();
            public void widgetSelected(SelectionEvent e) {
 * You may obtain a copy of the License at
        setParams.removeIf(parameter -> !parameter.isVariableSet());
                        return;
    @Override
        UIUtils.asyncExec(() -> {
        registry.save();
 * Unless required by applicable law or agreed to in writing, software
        for (SQLQueryParameter param : parameters) {
    }

                    item.setText(2, newValue);
            } catch (Exception e) {
    private static final String DIALOG_ID = "DBeaver.SQLQueryParameterBindDialog";//$NON-NLS-1$

import org.jkiss.dbeaver.ui.UIIcon;
    protected IDialogSettings getDialogBoundsSettings() {
    }
                            }

                    }
        }
        SQLUtils.fillQueryParameters(queryCopy, setParams);
    protected void createButtonsForButtonBar(Composite parent) {

                    String newValue = editor.getText();
                    firstTraverseIndex = 2;
            TableItem item = new TableItem(paramTable, SWT.NONE);
        UIUtils.applyMainFont(composite);
            }
    public boolean isHelpAvailable() {
import org.jkiss.dbeaver.Log;
    private final SQLQuery query;
