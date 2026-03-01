            DBWorkbench.getPlatformUI().showError("Open console", "Can open SQL editor", e);
 * You may obtain a copy of the License at
        }

 * Copyright (C) 2010-2024 DBeaver Corp and others
                if (navContext == null) {
public class SQLEditorHandlerRunProcedureConsole extends SQLEditorHandlerOpenObjectConsole {
    public SQLEditorHandlerRunProcedureConsole()

        if (entities.size() == 1 && !CommonUtils.isEmpty(procName)) {
 *
import org.eclipse.ui.IWorkbenchWindow;
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.eclipse.core.commands.ExecutionEvent;
                entities.add(proc);
import org.eclipse.core.commands.ExecutionException;
/*
        } catch (Exception e) {
                procName = proc.getName();
 *     http://www.apache.org/licenses/LICENSE-2.0
                }
 * you may not use this file except in compliance with the License.
    }
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedure;
        ISelection currentSelection = HandlerUtil.getCurrentSelection(event);

import java.util.List;
        String procName = null;
            openConsole(workbenchWindow, generator, navContext, title, false, currentSelection);
        SQLNavigatorContext navContext = null;

    public Object execute(ExecutionEvent event) throws ExecutionException
 *
        IWorkbenchWindow workbenchWindow = HandlerUtil.getActiveWorkbenchWindow(event);

        DBRRunnableWithResult<String> generator = SQLGeneratorContributor.CALL_GENERATOR(entities);

            title = procName + " call";

import org.eclipse.ui.handlers.HandlerUtil;
        }
            return null;
    {
        List<DBSObject> selectedObjects = NavigatorUtils.getSelectedObjects(currentSelection);
            }
    {
import org.eclipse.jface.viewers.ISelection;
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithResult;
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
 */
                    navContext = new SQLNavigatorContext(object);
        try {
    }
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.ui.editors.sql.generator.SQLGeneratorContributor;
                DBSProcedure proc = (DBSProcedure) object;
        }
        for (DBSObject object : selectedObjects) {

    private static final Log log = Log.getLog(SQLEditorHandlerRunProcedureConsole.class);
 * Copyright (C) 2010-2017 Eugene Fradkin (eugene.fradkin@gmail.com)
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");

import org.jkiss.dbeaver.runtime.DBWorkbench;
        List<DBSProcedure> entities = new ArrayList<>();
            if (object instanceof DBSProcedure) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        String title = "Stored procedures call";
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
        }
        if (navContext == null || navContext.getDataSourceContainer() == null) {
        return null;
}
 * See the License for the specific language governing permissions and

package org.jkiss.dbeaver.ui.editors.sql.handlers;
import org.jkiss.dbeaver.Log;
import java.util.ArrayList;
            log.debug("No active datasource");
    @Override
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
