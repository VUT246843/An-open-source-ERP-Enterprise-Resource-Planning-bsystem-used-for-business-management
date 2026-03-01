import org.jkiss.dbeaver.ui.editors.sql.SQLEditorParametersProvider;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

                null,
        return null;
        }
import org.jkiss.dbeaver.ui.internal.UIMessages;
import org.eclipse.swt.SWT;
 *
                new DataSourceContextProvider(editor.getDataSource()),
            }
    }
                new SQLEditorParametersProvider(editor.getSite()));
import org.jkiss.dbeaver.ui.UIUtils;
        }
                UIMessages.dialog_policy_data_export_title,
        SQLEditor editor = RuntimeUtils.getObjectAdapter(HandlerUtil.getActiveEditor(event), SQLEditor.class);
        if (ApplicationPolicyProvider.getInstance().isPolicyEnabled(ApplicationPolicyProvider.POLICY_DATA_EXPORT)) {
        @Override
 *
                SWT.ICON_WARNING);
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.eclipse.core.commands.AbstractHandler;
    public Object execute(ExecutionEvent event) throws ExecutionException {
import org.jkiss.dbeaver.model.sql.SQLScriptContext;
import org.jkiss.dbeaver.ui.editors.sql.SQLEditor;
/*
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.ui.handlers.HandlerUtil;
 * you may not use this file except in compliance with the License.
        public boolean hasVariable(String name) {
 * distributed under the License is distributed on an "AS IS" BASIS,

            if (super.hasVariable(name)) {
        @Override
 * DBeaver - Universal Database Manager
                new StringWriter(),
    }


                EditorUtils.getPathFromInput(editor.getEditorInput()),
    private static class ExportDataSQLScriptContext extends SQLScriptContext {
                UIMessages.dialog_policy_data_export_msg,

}        if (editor != null) {
        public Object getVariable(String name) {
            return super.getParameterDefaultValue(name);
package org.jkiss.dbeaver.ui.editors.sql.handlers;
import org.jkiss.dbeaver.ui.editors.EditorUtils;
        }
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
import org.jkiss.dbeaver.registry.ApplicationPolicyProvider;
 */
import org.eclipse.core.commands.ExecutionEvent;
 * Licensed under the Apache License, Version 2.0 (the "License");
            UIUtils.showMessageBox(HandlerUtil.getActiveShell(event),
import org.jkiss.dbeaver.model.impl.DataSourceContextProvider;
            return null;

        public ExportDataSQLScriptContext(SQLEditor editor) {
import org.jkiss.dbeaver.utils.RuntimeUtils;
 *
 * See the License for the specific language governing permissions and
import org.eclipse.core.commands.ExecutionException;
            return super.hasVariable(name) || super.getParameterDefaultValue(name) != null;
 * You may obtain a copy of the License at
            super(
import java.io.StringWriter;
            editor.exportDataFromQuery(new ExportDataSQLScriptContext(editor));

public class SQLEditorHandlerExportData extends AbstractHandler {
                return super.getVariable(name);
 * limitations under the License.
        }
