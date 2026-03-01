                    @Override
import org.jkiss.code.NotNull;
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Nullable
        IResultSetController resultSetController = ((IResultSetProvider) editorPart).getResultSetController();
import org.jkiss.dbeaver.ui.editors.sql.dialogs.ViewSQLDialog;
            } else {
        
                return null;
                IWorkbenchPage activePage = UIUtils.getActiveWorkbenchWindow().getActivePage();
        }
/*
import org.eclipse.ui.handlers.HandlerUtil;
    @Override
                        UIUtils.runInUI(generator);

                    () -> context,
    public Object execute(@NotNull ExecutionEvent event) throws ExecutionException {
                    protected Composite createDialogArea(Composite parent) {
        return null;
 * Licensed under the Apache License, Version 2.0 (the "License");

 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.core.commands.AbstractHandler;
import org.jkiss.dbeaver.ui.UIUtils;
            SQLGenerator<IResultSetController> generator = new SQLGeneratorDDLFromResultSet();
import org.eclipse.core.commands.ExecutionException;

 * you may not use this file except in compliance with the License.
 */
import org.eclipse.ui.IWorkbenchPage;
import org.jkiss.dbeaver.model.sql.generator.SQLGenerator;
                ViewSQLDialog dialog = new ViewSQLDialog(
            if (editorPart instanceof MultiPageAbstractEditor) {
import org.jkiss.dbeaver.ui.editors.MultiPageAbstractEditor;
}
            }
                };
                        }
            generator.initGenerator(List.of(resultSetController));
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ui.editors.sql.generator;
import org.eclipse.ui.IEditorPart;
import org.jkiss.utils.CommonUtils;
        
import org.eclipse.osgi.util.NLS;
        }
                    NLS.bind(SQLEditorMessages.sql_generator_title_text, context.getDataSource().getContainer().getName()),
                dialog.open();
 *
import org.eclipse.core.commands.ExecutionEvent;
import org.jkiss.code.Nullable;
 * DBeaver - Universal Database Manager
                            setSQLText(CommonUtils.toString(sql));
 *
                    null, ""
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                editorPart = ((MultiPageAbstractEditor) editorPart).getActiveEditor();
                    activePage.getActivePart().getSite(),
        if (resultSetController != null) {
            
 * See the License for the specific language governing permissions and
                        Object sql = generator.getResult();
import org.eclipse.swt.widgets.Composite;
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetController;
        while (!(editorPart instanceof IResultSetProvider)) {
import java.util.List;
                DBCExecutionContext context = resultSetController.getExecutionContext();
    }
 *
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetProvider;
 * limitations under the License.
public class SQLGeneratorHandlerResultSetDDL extends AbstractHandler {

        IEditorPart editorPart = HandlerUtil.getActiveEditor(event);
                    } 
 *     http://www.apache.org/licenses/LICENSE-2.0
                        return super.createDialogArea(parent);
                        if (sql != null) {
                    @NotNull
                ) {
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;
            if (generator != null) {
