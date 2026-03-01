        SQLNavigatorContext navContext = null;
    public static SQLGenerator<DBSProcedure> checkGenerator(final List<DBSProcedure> entities) {

        }
    }

import org.jkiss.dbeaver.ext.postgresql.PostgreMessages;
                    navContext = new SQLNavigatorContext(object);
import org.jkiss.dbeaver.ext.postgresql.model.sql.generator.SQLGeneratorProcedureCheck;
                entities.add(proc);
                DBSProcedure proc = (DBSProcedure) object;

            title = NLS.bind(PostgreMessages.procedure_check_label2, procName); 
        }
 *
        return null;
    void openConsoleCheck(IWorkbenchWindow workbenchWindow, DBRRunnableWithResult<String> generator,
import org.jkiss.dbeaver.ui.editors.sql.handlers.SQLEditorHandlerOpenObjectConsole;
        IWorkbenchWindow workbenchWindow = HandlerUtil.getActiveWorkbenchWindow(event);
import org.jkiss.dbeaver.model.struct.DBSObject;
    @Override
        try {
        return procedureCheck;
                }
 * Unless required by applicable law or agreed to in writing, software
            String sql = CommonUtils.notEmpty(generator.getResult());
/*
import org.jkiss.dbeaver.Log;
            }
        String procName = null;
import org.jkiss.dbeaver.runtime.DBWorkbench;
        } catch (Exception e) {


    
        for (DBSObject object : selectedObjects) {
import org.eclipse.jface.viewers.ISelection;
        String sql = CommonUtils.notEmpty(generator.getResult());
            DBWorkbench.getPlatformUI().showError(PostgreMessages.message_open_console, 


        }
import org.eclipse.osgi.util.NLS;
public class SQLEditorHandlerCheckProcedureConsole extends SQLEditorHandlerOpenObjectConsole {
 * distributed under the License is distributed on an "AS IS" BASIS,
        ISelection currentSelection = HandlerUtil.getCurrentSelection(event);
import org.eclipse.ui.handlers.HandlerUtil;


import java.util.ArrayList;
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedure;
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithResult;
 * limitations under the License.
import org.jkiss.utils.CommonUtils;
            SQLNavigatorContext navigatorContext, String title, boolean doRun, ISelection currentSelection) throws Exception {
                if (navContext == null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at
import java.util.List;
    /**
            if (object instanceof DBSProcedure) {

 *
    }
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.UIUtils;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
        String title = PostgreMessages.procedure_check_label_ext;
        List<DBSProcedure> entities = new ArrayList<>();
 */
     */        
            openAndExecuteSQLScript(workbenchWindow, navContext, title, true, currentSelection, sql, true);
        procedureCheck.initGenerator(entities);
}
                PostgreMessages.error_cant_open_sql_editor, e);
            log.debug("No active datasource");
        DBRRunnableWithResult<String> generator = checkGenerator(entities);
package org.jkiss.dbeaver.ext.postgresql.ui.editors.sql.handlers;
 * Licensed under the Apache License, Version 2.0 (the "License");
            UIUtils.runInUI(workbenchWindow, generator);
import org.jkiss.dbeaver.ui.editors.sql.handlers.SQLNavigatorContext;
 * DBeaver - Universal Database Manager

import org.eclipse.core.commands.ExecutionException;
     * Generate PostgreSQL procedure check SQL - via https://github.com/okbob/plpgsql_check
 * Copyright (C) 2010-2024 DBeaver Corp and others
        UIUtils.runInUI(workbenchWindow, generator);
    private static final Log log = Log.getLog(SQLEditorHandlerCheckProcedureConsole.class);
    public Object execute(ExecutionEvent event) throws ExecutionException {
        List<DBSObject> selectedObjects = NavigatorUtils.getSelectedObjects(currentSelection);
        SQLGeneratorProcedureCheck procedureCheck = new SQLGeneratorProcedureCheck();
import org.jkiss.dbeaver.model.sql.generator.SQLGenerator;
        openAndExecuteSQLScript(workbenchWindow, navigatorContext, title, true, currentSelection, sql, true);
    }
            return null;
                procName = proc.getName();
import org.eclipse.ui.IWorkbenchWindow;
 * you may not use this file except in compliance with the License.
    @NotNull
        }
import org.jkiss.code.NotNull;
        if (navContext == null || navContext.getDataSourceContainer() == null) {
        if (entities.size() == 1 && !CommonUtils.isEmpty(procName)) {
 *
import org.eclipse.core.commands.ExecutionEvent;
