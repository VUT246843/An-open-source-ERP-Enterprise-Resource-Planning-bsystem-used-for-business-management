                varNames.toString().replaceAll("^[\\[]|[\\]]$","")

            SQLEditorMessages.action_result_tabs_delete_variables,
import org.jkiss.dbeaver.model.sql.registry.SQLQueryParameterRegistry;
 * See the License for the specific language governing permissions and
        this.varNames = varNames;
import org.jkiss.dbeaver.Log;
            editor.getSite().getShell(),
 */
                } else {
import org.eclipse.jface.action.Action;

            for (String varName : varNames) {
    }
        {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ui.UIUtils;
/*
 *


 *     http://www.apache.org/licenses/LICENSE-2.0
    static protected final Log log = Log.getLog(RemoveVariablesAction.class);
        this.editor = editor;
 * Unless required by applicable law or agreed to in writing, software
 *
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
                if (editor.getGlobalScriptContext().hasDefaultParameterValue(varName) || instance.getParameter(varName) != null){
import java.util.List;
    public RemoveVariablesAction(SQLEditor editor, List<String> varNames) {
            }
                final SQLQueryParameterRegistry instance = SQLQueryParameterRegistry.getInstance();
        }
                    editor.getGlobalScriptContext().removeDefaultParameterValue(varName);
            SQLEditorMessages.action_result_tabs_delete_variables_question +
    }
public class RemoveVariablesAction extends Action {

 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;
 * limitations under the License.
                    editor.getGlobalScriptContext().removeVariable(varName);

    public void run() {
        super(SQLEditorMessages.action_result_tabs_assign_variable);
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
}
    @Override
                }
                ' ' +
package org.jkiss.dbeaver.ui.editors.sql.variables;
 * You may obtain a copy of the License at
    private final List<String> varNames;
        if (UIUtils.confirmAction(
                + "?"))
import org.jkiss.dbeaver.ui.editors.sql.SQLEditor;
    private final SQLEditor editor;
