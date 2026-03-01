import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
    }
                editOnEnter = false;
        paramTable.setLayoutData(gd);
        paramTable.setLinesVisible(true);
import org.jkiss.utils.CommonUtils;

        final TableColumn nameColumn = UIUtils.createTableColumn(paramTable, SWT.LEFT, "Name");
        getShell().setText(procedure.getProcedureType().name() + " " + procedure.getName() + " parameter(s)");
                paramTable.select(0);
            item.setImage(DBeaverIcons.getImage(DBIcon.TREE_ATTRIBUTE));
 * distributed under the License is distributed on an "AS IS" BASIS,
            Object value = values.get(param);
                DBSProcedureParameter param = (DBSProcedureParameter) item.getData();

            item.setText(0, param.getName());

                }
import java.util.List;
            }
        gd.widthHint = 400;
        return values;
/**
 * Licensed under the Apache License, Version 2.0 (the "License");

            UIUtils.asyncExec(() -> {
    }
        nameColumn.setWidth(100);
        }
    {
        final Composite composite = (Composite)super.createDialogArea(parent);
    {
import java.util.HashMap;
    protected Control createDialogArea(Composite parent)
        updateStatus(GeneralUtils.makeInfoStatus("Use Tab to switch."));
        }
import org.jkiss.dbeaver.model.DBIcon;
                String newValue = ((Text) control).getText();
        final TableColumn typeColumn = UIUtils.createTableColumn(paramTable, SWT.LEFT, "Type");
        } catch (DBException e) {
        final CustomTableEditor tableEditor = new CustomTableEditor(paramTable) {
    private List<DBSProcedureParameter> parameters;
        gd.heightHint = 200;
    protected boolean isResizable()
        return UIUtils.getDialogSettings(DIALOG_ID);
 * Parameter binding
                values.put(param, newValue);

    }

    {
                lastTraverseIndex = 1;
            @Override
            this.parameters.addAll(procedure.getParameters(new VoidProgressMonitor()));
    {
            item.setData(param);
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.eclipse.jface.dialogs.IDialogSettings;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private static final String DIALOG_ID = "DBeaver.ProcedureParameterBindDialog";//$NON-NLS-1$
import org.jkiss.dbeaver.ui.DBeaverIcons;
            }
            item.setText(2, param.getParameterType().getFullTypeName());

            }
        valueColumn.setWidth(200);
 * See the License for the specific language governing permissions and
import org.eclipse.swt.widgets.*;
            DBWorkbench.getPlatformUI().showError("Can't get parameters", "Error getting procedure papameters", e);
            {

    public List<DBSProcedureParameter> getParameters() {
    @Override
    protected IDialogSettings getDialogBoundsSettings()
                tableEditor.showEditor(paramTable.getItem(0), 1);
 * Copyright (C) 2010-2024 DBeaver Corp and others
            });
        return composite;
 *
    private Map<DBSProcedureParameter, Object> values = new HashMap<>();
package org.jkiss.dbeaver.ui.editors.sql.dialogs;
                DBSProcedureParameter param = (DBSProcedureParameter) item.getData();
                    return null;
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureParameter;
        this.values = new HashMap<>(values);
        final GridData gd = new GridData(GridData.FILL_BOTH);
import java.util.Map;
        super(shell);
        final TableColumn kindColumn = UIUtils.createTableColumn(paramTable, SWT.LEFT, "Kind");
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedure;
            item.setText(1, CommonUtils.toString(value, ""));

        return parameters;
import org.jkiss.dbeaver.ui.controls.CustomTableEditor;
    @Override
 */
                item.setText(1, newValue);

import org.eclipse.jface.dialogs.StatusDialog;

    }


    private DBSProcedure procedure;
 * you may not use this file except in compliance with the License.
    }


    }
        paramTable.setHeaderVisible(true);
 * You may obtain a copy of the License at
                editor.setText(CommonUtils.toString(values.get(param), ""));
                firstTraverseIndex = 1;
            @Override
                Text editor = new Text(table, SWT.BORDER);

 * Unless required by applicable law or agreed to in writing, software
    @Override
            item.setText(3, param.getParameterKind().getTitle());
 * limitations under the License.
import org.jkiss.dbeaver.DBException;
        return true;
}
import java.util.ArrayList;
public class ProcedureParameterBindDialog extends StatusDialog {

 * DBeaver - Universal Database Manager
    protected void okPressed()
        kindColumn.setWidth(40);
            TableItem item = new TableItem(paramTable, SWT.NONE);
        try {
import org.jkiss.dbeaver.utils.GeneralUtils;
 */
        };
            protected Control createEditor(Table table, int index, TableItem item) {

            protected void saveEditorValue(Control control, int index, TableItem item) {
        super.okPressed();
        typeColumn.setWidth(60);
import org.eclipse.swt.layout.GridData;


        this.parameters = new ArrayList<>();
        final TableColumn valueColumn = UIUtils.createTableColumn(paramTable, SWT.LEFT, "Value");
                if (index != 1) {
        }

import org.eclipse.swt.SWT;
        for (DBSProcedureParameter param : parameters) {
 *     http://www.apache.org/licenses/LICENSE-2.0

 *
 *
    }
                editor.selectAll();
    public ProcedureParameterBindDialog(Shell shell, DBSProcedure procedure, Map<DBSProcedureParameter, Object> values)
/*
    @Override
        this.procedure = procedure;
                return editor;
import org.jkiss.dbeaver.ui.UIUtils;
    {
        final Table paramTable = new Table(composite, SWT.SINGLE | SWT.FULL_SELECTION | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
        if (!parameters.isEmpty()) {
    public Map<DBSProcedureParameter, Object> getValues() {
