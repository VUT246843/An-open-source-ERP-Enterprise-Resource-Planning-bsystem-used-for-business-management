import org.jkiss.dbeaver.utils.GeneralUtils;

                valueEditor.reloadSyntaxRules();
            public String getResult() {

                }
        EnterNameDialog dialog = new EnterNameDialog(
                super.updateButtonsState();

                if (checkDuplicates && editor.getGlobalScriptContext().hasVariable(preparedVarName)) {
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;

    public void setCheckDuplicates(boolean checkDuplicates) {
                super.okPressed();
        {
    public void setQuery(boolean query) {
                        SQLEditorMessages.action_assign_variables_error_invalid_title,
import org.jkiss.dbeaver.ui.editors.sql.SQLEditor;
                    varName = null;
                valueEditor.createPartControl(editorPH);
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.editor = editor;
                            SQLEditorMessages.action_assign_variables_error_duplicated_title,
                            NLS.bind(SQLEditorMessages.action_assign_variables_error_duplicated_info, preparedVarName),
                varName = preparedVarName;
                };
            @Override
        super(SQLEditorMessages.action_result_tabs_assign_variable);
                valueEditor.getEditorControlWrapper().setLayoutData(new GridData(GridData.FILL_BOTH));
 *
import org.jkiss.dbeaver.model.sql.parser.rules.ScriptParameterRule;
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.ui.editors.StringEditorInput;
 *
}
 * DBeaver - Universal Database Manager
                varValue);
                    UIUtils.showMessageBox(getShell(),
                } 
import org.eclipse.swt.layout.GridData;
                return UIUtils.getDialogSettings("DBeaver.SQLEditor.AssignVariableDialog"); //$NON-NLS-1$

import org.jkiss.dbeaver.model.sql.commands.SQLCommandSet;
    }
                    return;

    private final SQLEditor editor;
                    return;
                Button button = getButton(IDialogConstants.OK_ID);

import org.eclipse.swt.widgets.Button;
import org.jkiss.dbeaver.ui.UIUtils;
    }

                        return editor.getExecutionContext();
                        NLS.bind(SQLEditorMessages.action_assign_variables_error_invalid_info, rawVarName),
import org.eclipse.jface.action.Action;
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
    private final String queryText;
            }
                        SWT.ICON_ERROR);

        isQuery = query;
import org.eclipse.swt.widgets.Composite;
                return area;
    public AssignVariableAction(SQLEditor editor, String varValue) {
    static protected final Log log = Log.getLog(AssignVariableAction.class);


                valueEditor.setWordWrap(true);
            editor.getGlobalScriptContext().setVariable(
        isEditable = editable;
                    UIUtils.showMessageBox(getShell(),
package org.jkiss.dbeaver.ui.editors.sql.variables;
    }
        this.checkDuplicates = checkDuplicates;
                    String rawVarName = propNameText.getText().trim();
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorBase;
    private boolean isEditable = true;
                SQLDialect sqlDialect = editor.getSQLDialect();
public class AssignVariableAction extends Action {
                        new StringEditorInput("Variable value", queryText, !isEditable, GeneralUtils.getDefaultFileEncoding()));
                return varName;
    private String varValue;
    private boolean checkDuplicates = true;

import org.jkiss.dbeaver.ui.dialogs.EnterNameDialog;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    }
                UIUtils.createControlLabel(editorPH, isQuery ? "Query" : "Value");
                String preparedVarName = SQLCommandSet.prepareVarName(sqlDialect, rawVarName);
            }
            editor.getEditorControlWrapper().getShell(),
                if (button != null && propNameText != null && button.getEnabled()) {
                    log.error(e);
    private boolean isQuery = false;
    public void setEditable(boolean editable) {
        if (dialog.open() == IDialogConstants.OK_ID) {
            @Override
                    valueEditor.init(new SubEditorSite(editor.getSite()),
                    public DBCExecutionContext getExecutionContext() {
            }
 * limitations under the License.
        this.queryText = varValue;
import org.eclipse.swt.SWT;
import org.eclipse.jface.dialogs.IDialogSettings;
            @Override
            @Override
import org.jkiss.dbeaver.model.sql.SQLDialect;
        };
            @Nullable
 *
                    varName = null;
            protected IDialogSettings getDialogBoundsSettings() {
                }
                editorPH.setLayoutData(new GridData(GridData.FILL_BOTH));

 * See the License for the specific language governing permissions and
            
                varValue = valueEditor.getEditorControl().getText();
                UIUtils.asyncExec(() -> propNameText.setFocus());
            protected Composite createDialogArea(Composite parent) {
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;

    public void run() {
import org.jkiss.dbeaver.ui.editors.SubEditorSite;
 * you may not use this file except in compliance with the License.
                } catch (PartInitException e) {

 * You may obtain a copy of the License at
        }
                    button.setEnabled(consumedNameLength == rawVarName.length());
import org.eclipse.ui.PartInitException;
                valueEditor = new SQLEditorBase() {
            protected void okPressed() {
 *     http://www.apache.org/licenses/LICENSE-2.0
                    int consumedNameLength = ScriptParameterRule.tryConsumeParameterName(editor.getSQLDialect(), rawVarName, 0);
import org.eclipse.osgi.util.NLS;
                Composite editorPH = UIUtils.createComposite(area, 1);
/*
                try {
                dialog.getResult(),

            protected void updateButtonsState() {
import org.eclipse.jface.dialogs.IDialogConstants;
    }
            @Override

            "")
import org.jkiss.dbeaver.Log;
                    @Nullable
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
                String rawVarName = propNameText.getText().trim();
            }
            }
                    @Override
                } 
                final Composite area = super.createDialogArea(parent);
            private String varName = null;
                            SWT.ICON_ERROR);
 * Unless required by applicable law or agreed to in writing, software
            isQuery ? SQLEditorMessages.action_result_tabs_assign_variable_sql : SQLEditorMessages.action_result_tabs_assign_variable,
                if (ScriptParameterRule.tryConsumeParameterName(sqlDialect, rawVarName, 0) != rawVarName.length()) {
    private SQLEditorBase valueEditor;
