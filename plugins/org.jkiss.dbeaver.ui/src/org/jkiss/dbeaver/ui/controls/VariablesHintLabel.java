            super(parentShell, title, null);
 */
                String varName = var[0];

            for (String[] var : variables) {
 * See the License for the specific language governing permissions and
            table.setHeaderVisible(true);
/**
 * distributed under the License is distributed on an "AS IS" BASIS,
                dialog.open();

        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
import org.eclipse.swt.widgets.*;
/*
            UIUtils.createTableColumn(table, SWT.LEFT, "Variable");

            UIUtils.createTableColumn(table, SWT.LEFT, "Description");
        infoLabel.setLayoutData(gd);
                dialog.setMonospaceFont(true);
import org.jkiss.dbeaver.ui.dialogs.EditTextDialog;
import org.jkiss.dbeaver.utils.GeneralUtils;
 *
            UIUtils.createTableColumn(table, SWT.LEFT, "Value");
            TableEditor tableEditor = new TableEditor(table);
    public void setResolver(IVariableResolver resolver) {
        protected void createButtonsForButtonBar(Composite parent) {
    }
                item.setText(2, isSecure ? "********" : CommonUtils.notEmpty(resolver.get(varName)));
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ui.UIUtils;
    public VariablesHintLabel(Composite parent, String hintLabel, String hintTitle, String[][] vars, boolean stretch) {
            UIUtils.packColumns(table);
    public VariablesHintLabel(Composite parent, String hintLabel, String hintTitle, String[][] vars) {
        }


        infoLabel = UIUtils.createInfoLabel(parent, hintLabel, () -> {

            createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            UIWidgets.setControlContextMenu(table, manager -> UIWidgets.fillDefaultTableContextMenu(manager, table));
                EditTextDialog dialog = new EditTextDialog(parent.getShell(), hintTitle, varsText, true);
                VariableListDialog dialog = new VariableListDialog(parent.getShell(), hintTitle);
        Layout layout = parent.getLayout();
            }
                item.setText(1, var[1]);
        }
import org.eclipse.jface.dialogs.IDialogConstants;
            } else {
 * VariablesHintLabel
        @Override
 * You may obtain a copy of the License at

                item.setText(0, GeneralUtils.variablePattern(varName));
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.runtime.IVariableResolver;
        this.resolver = resolver;
        this.variables = vars;


        return infoLabel;
import org.eclipse.swt.SWT;
 */
    private final String[][] variables;
    }

        if (stretch && layout instanceof GridLayout) {
        protected Composite createDialogArea(Composite parent) {
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.swt.custom.TableEditor;
        this(parent, hintLabel, hintTitle, vars, true);
        infoLabel.setToolTipText(varsText);
        @Override
        }
 *
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;


            Composite composite = super.createDialogArea(parent);
 * limitations under the License.

package org.jkiss.dbeaver.ui.controls;
import org.eclipse.swt.layout.GridData;
            if (resolver != null) {

public class VariablesHintLabel {
        String varsText = GeneralUtils.generateVariablesLegend(vars);
 * Licensed under the Apache License, Version 2.0 (the "License");
            Table table = new Table(composite, SWT.BORDER | SWT.FULL_SELECTION);
            table.setLayoutData(new GridData(GridData.FILL_BOTH));
    public Control getInfoLabel() {
                boolean isSecure = DBPConnectionConfiguration.VARIABLE_PASSWORD.equals(varName);
    }
import org.jkiss.utils.CommonUtils;
}                TableItem item = new TableItem(table, SWT.NONE);
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
    private IVariableResolver resolver;
        }

                dialog.open();
        });
 * DBeaver - Universal Database Manager
    private final Control infoLabel;
    }
        VariableListDialog(Shell parentShell, String title) {
            }
import org.eclipse.swt.layout.GridLayout;

    }
            return composite;
 * Unless required by applicable law or agreed to in writing, software
            gd.horizontalSpan = ((GridLayout) layout).numColumns;

                dialog.setAutoSize(true);
import org.jkiss.dbeaver.ui.UIWidgets;

    class VariableListDialog extends BaseDialog {

