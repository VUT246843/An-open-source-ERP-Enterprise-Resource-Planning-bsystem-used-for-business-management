                container.setWarningMessage(null);
            configuration.remove(PostgreDebugConstants.ATTR_SCHEMA_NAME);
                editor.selectAll();
                if (parameters.size() == paramValues.size()) {
 *
                if (drop) {
                    parametersTable.setEnabled(kindLocal.getSelection());
import org.jkiss.dbeaver.ext.postgresql.debug.PostgreDebugConstants;
    public boolean isValid() {
            }

    public void createPanel(@NotNull Composite parent, DBGConfigurationPanelContainer container) {
import org.jkiss.dbeaver.ext.postgresql.model.PostgreProcedureParameter;
    private Button kindLocal;
            kindLocal.setText("Local");
            List<String> paramValues = new ArrayList<>();
    }
                }
        gd.widthHint = UIUtils.getFontHeight(functionCombo) * 40 + 10;
import org.jkiss.dbeaver.ui.controls.CustomTableEditor;
    @Override
                            curNode,
                @Override
        parametersTable.addListener(SWT.Resize, new Listener() {
            kindGlobal.getSelection() ? PostgreDebugConstants.ATTACH_KIND_GLOBAL : PostgreDebugConstants.ATTACH_KIND_LOCAL);
        Object kind = configuration.get(PostgreDebugConstants.ATTR_ATTACH_KIND);
    }
            {
            protected void saveEditorValue(Control control, int index, TableItem item) {
        Composite composite = UIUtils.createTitledComposite(parent, "Function parameters", 2, GridData.FILL_BOTH);
 * Licensed under the Apache License, Version 2.0 (the "License");
            item.setText(2, param.getParameterType().getFullTypeName());
            for (PostgreProcedureParameter param : selectedFunction.getInputParameters()) {
                            functionCombo.removeAll();
        new CustomTableEditor(parametersTable) {
            item.setData(param);
        functionCombo = new CSmartSelector<>(functionGroup, SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY, new LabelProvider() {
                    }
                    if (dsNode != null) {
                return editor;
        if (functionId != 0 && dataSource != null) {
import org.jkiss.dbeaver.ext.postgresql.debug.core.PostgreSqlDebugCore;

 */
                            functionCombo.select(selectedFunction);
                            dsNode,
 *     http://www.apache.org/licenses/LICENSE-2.0
        final GridData gd = new GridData(SWT.FILL, SWT.FILL, true, true);
        }
        }

    private void createFunctionGroup(Composite parent) {
    @Override

import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureParameter;
import org.jkiss.dbeaver.runtime.DBWorkbench;
        GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
        };
        createFunctionGroup(parent);
        processIdText.setEnabled(isGlobal);
            };
        parametersTable.setEnabled(selectedFunction != null && !isGlobal);
                if (element == null) {

                String newValue = ((Text) control).getText();
            }
        final TableColumn valueColumn = UIUtils.createTableColumn(parametersTable, SWT.LEFT, "Value");
 * you may not use this file except in compliance with the License.
        final TableColumn typeColumn = UIUtils.createTableColumn(parametersTable, SWT.LEFT, "Type");
    private Table parametersTable;
    
        UIUtils.createControlLabel(functionGroup, "Function");

                }
            SelectionListener listener = new SelectionAdapter() {
        } else {

import java.util.ArrayList;
            @Override
                2,
            } catch (InterruptedException e) {
                        if (node instanceof DBNDatabaseNode && ((DBNDatabaseNode) node).getObject() instanceof PostgreProcedure) {
                DBSProcedureParameter param = (DBSProcedureParameter) item.getData();
        processIdText = UIUtils.createLabelText(functionGroup, "Process ID", "", SWT.BORDER, new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));

import org.jkiss.dbeaver.ui.DBeaverIcons;
            public void handleEvent(Event arg0) {
            item.setImage(DBeaverIcons.getImage(DBIcon.TREE_ATTRIBUTE));
                firstTraverseIndex = 1;

        if (selectedFunction != null) {
        parametersTable.select(0);
    public void loadConfiguration(DBPDataSourceContainer dataSource, Map<String, Object> configuration) {
import org.jkiss.dbeaver.model.DBIcon;
                Text editor = new Text(table, SWT.BORDER);

            functionCombo.addItem(selectedFunction);
            @Override
/*
                container.getRunnableContext().run(true, true, monitor -> {
        Composite functionGroup = UIUtils.createTitledComposite(parent, "Function", 2, GridData.VERTICAL_ALIGN_BEGINNING);
                parameterValues.put(param, newValue);
            item.setText(1, CommonUtils.toString(value, ""));
            @Override
                            selectedFunction = (PostgreProcedure) ((DBNDatabaseNode) node).getObject();
 * See the License for the specific language governing permissions and
            }
            configuration.put(PostgreDebugConstants.ATTR_FUNCTION_PARAMETERS, paramValues);
        }
import org.jkiss.dbeaver.model.navigator.DBNModel;
                        selectedFunction = PostgreSqlDebugCore.resolveFunction(monitor, dataSource, configuration);
                // ignore
        this.container = container;
                editOnEnter = false;
import org.jkiss.dbeaver.DBException;
                            new Class[] {PostgreProcedure.class}, null
                        );
import org.eclipse.swt.graphics.Image;
                Object value = parameterValues.get(param);
            }
                editor.setText(CommonUtils.toString(parameterValues.get(param), ""));
            configuration.put(PostgreDebugConstants.ATTR_SCHEMA_NAME, selectedFunction.getSchema().getName());
        return selectedFunction != null;
            kindGlobal.addSelectionListener(listener);
import org.jkiss.dbeaver.ui.controls.CSmartSelector;
        configuration.put(PostgreDebugConstants.ATTR_ATTACH_PROCESS, processIdText.getText());
        kindColumn.setWidth(40);
    private DBGConfigurationPanelContainer container;
                }
        processIdText.setLayoutData(gd);
                    processIdText.setEnabled(kindGlobal.getSelection());
            protected Control createEditor(Table table, int index, TableItem item) {

                            parent.getShell(),
        boolean isGlobal = PostgreDebugConstants.ATTACH_KIND_GLOBAL.equals(kind);
            @Override
                public void widgetSelected(SelectionEvent e) {
                        DBNNode curNode = selectedFunction == null ? null : navigatorModel.getNodeByObject(selectedFunction);
 *
                GridData.HORIZONTAL_ALIGN_BEGINNING);
import org.jkiss.dbeaver.debug.ui.DBGConfigurationPanel;
            } catch (InvocationTargetException e) {
        }
}
            configuration.remove(PostgreDebugConstants.ATTR_FUNCTION_PARAMETERS);
                            functionCombo.addItem(selectedFunction);
                    try {
    @Override
            kindLocal = new Button(kindGroup, SWT.RADIO);
                            container.updateDialogState();

            public Image getImage(Object element) {
            }
        }
            try {
                }
import java.util.List;
        functionCombo.addItem(null);
                return DBeaverIcons.getImage(DBIcon.TREE_PROCEDURE);
                    container.updateDialogState();
            kindLocal.addSelectionListener(listener);
    public void saveConfiguration(DBPDataSourceContainer dataSource, Map<String, Object> configuration) {
            }
            List<String> paramValues = (List<String>) configuration.get(PostgreDebugConstants.ATTR_FUNCTION_PARAMETERS);
        if (selectedFunction != null) {
                item.setText(1, newValue);

            configuration.remove(PostgreDebugConstants.ATTR_FUNCTION_OID);
import org.eclipse.swt.events.SelectionEvent;
            kindGlobal.setEnabled(false);
                lastTraverseIndex = 1;
import org.eclipse.swt.events.SelectionListener;
                    }
import org.eclipse.swt.SWT;

        parametersTable.setLayoutData(gd);
        valueColumn.setWidth(200);
                        parameterValues.put(param, paramValues.get(i));
                });
            }
import java.lang.reflect.InvocationTargetException;
                            "Select function to debug",
                    return null;
    }
                        throw new InvocationTargetException(e);
import org.eclipse.swt.events.SelectionAdapter;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }

            }
                if (index != 1) {
        for (DBSProcedureParameter param : selectedFunction.getInputParameters()) {

import org.eclipse.swt.layout.GridData;
            }


import org.eclipse.swt.graphics.Point;

import org.jkiss.utils.CommonUtils;
    private static final int PARAMETERS_TABLE_MAX_HEIGHT = 150;
            item.setText(0, param.getName());
                        parametersTable.setEnabled(selectedFunction != null);
 * Copyright (C) 2010-2026 DBeaver Corp and others
                    parametersTable.setSize(size.x, PARAMETERS_TABLE_MAX_HEIGHT);
        gd.widthHint = UIUtils.getFontHeight(processIdText) * 10 + 10;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            if (paramValues != null) {
            @Override
    private Button kindGlobal;
            configuration.put(PostgreDebugConstants.ATTR_FUNCTION_OID, selectedFunction.getObjectId());
import org.jkiss.code.NotNull;
            @Override
        configuration.put(PostgreDebugConstants.ATTR_ATTACH_KIND,
        parametersTable = new Table(composite, SWT.SINGLE | SWT.FULL_SELECTION | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
            @SuppressWarnings("unchecked")
    private Map<DBSProcedureParameter, Object> parameterValues = new HashMap<>();
                }
        gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
            configuration.put(PostgreDebugConstants.ATTR_DATABASE_NAME, selectedFunction.getDatabase().getName());
            public String getText(Object element) {
            TableItem item = new TableItem(parametersTable, SWT.NONE);
        nameColumn.setWidth(100);
 * DBeaver - Universal Database Manager
    }
            protected void dropDown(boolean drop) {
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
    private Text processIdText;

        long functionId = CommonUtils.toLong(configuration.get(PostgreDebugConstants.ATTR_FUNCTION_OID));
    
                        }
import org.eclipse.swt.widgets.*;
    }
    private void createParametersGroup(Composite parent) {
                "Attach type",
                }
                        PostgreProcedureParameter param = parameters.get(i);
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;


        {
 *
 * You may obtain a copy of the License at
                container.updateDialogState();
    private PostgreProcedure selectedFunction;
        kindLocal.setSelection(!isGlobal);

import java.util.HashMap;
        createParametersGroup(parent);

                    DBNDatabaseNode dsNode = navigatorModel.getNodeByObject(container.getDataSource());
        functionCombo.setLayoutData(gd);
        }) {
                paramValues.add(value == null ? null : value.toString());
        final TableColumn nameColumn = UIUtils.createTableColumn(parametersTable, SWT.LEFT, "Name");
            kindGlobal = new Button(kindGroup, SWT.RADIO);
                DBSProcedureParameter param = (DBSProcedureParameter) item.getData();
    private CSmartCombo<PostgreProcedure> functionCombo;
import org.eclipse.jface.viewers.LabelProvider;
                    return "N/A";
            item.setText(3, param.getParameterKind().getTitle());
                container.setWarningMessage(e.getTargetException().getMessage());
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.dbeaver.ext.postgresql.model.PostgreProcedure;
        kindGlobal.setSelection(isGlobal);
                    } catch (DBException e) {

        if (selectedFunction != null) {

package org.jkiss.dbeaver.ext.postgresql.debug.ui.internal;

public class PostgreDebugPanelFunction implements DBGConfigurationPanel {
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        };
            updateParametersTable();
                List<PostgreProcedureParameter> parameters = selectedFunction.getInputParameters();
                            new Class[] {DBSInstance.class, DBSObjectContainer.class, PostgreProcedure.class},
            functionCombo.select(selectedFunction);
        });
        gd.minimumHeight = PARAMETERS_TABLE_MAX_HEIGHT;
import java.util.Map;
import org.jkiss.dbeaver.ui.UIUtils;
        parametersTable.removeAll();
                    for (int i = 0; i < parameters.size(); i++) {
        parametersTable.setHeaderVisible(true);
            }
                    DBNModel navigatorModel = DBWorkbench.getPlatform().getNavigatorModel();
            configuration.remove(PostgreDebugConstants.ATTR_DATABASE_NAME);
            kindGlobal.setText("Global");
import org.jkiss.dbeaver.debug.ui.DBGConfigurationPanelContainer;
        processIdText.setText(processId == null ? "" : processId.toString());
                parent,
import org.jkiss.dbeaver.ui.controls.CSmartCombo;
                    }
        parametersTable.setLinesVisible(true);
import org.jkiss.dbeaver.model.struct.DBSInstance;
                return ((PostgreProcedure) element).getFullQualifiedSignature();
                        DBNNode node = DBWorkbench.getPlatformUI().selectObject(
        Object processId = configuration.get(PostgreDebugConstants.ATTR_ATTACH_PROCESS);
            Composite kindGroup = UIUtils.createTitledComposite(
    private void updateParametersTable() {

                if(size.y > PARAMETERS_TABLE_MAX_HEIGHT) {
                            updateParametersTable();
import org.jkiss.dbeaver.model.navigator.DBNNode;
 * limitations under the License.
        final TableColumn kindColumn = UIUtils.createTableColumn(parametersTable, SWT.LEFT, "Kind");
        typeColumn.setWidth(60);
            Object value = parameterValues.get(param);
        }
                Point size = parametersTable.getSize();
    }
