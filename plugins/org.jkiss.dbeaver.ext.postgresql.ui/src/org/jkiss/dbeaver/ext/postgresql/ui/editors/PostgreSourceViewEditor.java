    {
            getDatabaseEditorInput().getAttribute(DBPScriptObject.OPTION_DEBUGGER_SOURCE), false);
                    }
public class PostgreSourceViewEditor extends SQLSourceViewer<PostgreScriptObject> {
 *

                    @Override
/*
                new Action(PostgreMessages.procedure_check_label, Action.AS_PUSH_BUTTON) {
    }
        Map<String, Object> options = super.getSourceOptions();
                        }
import org.jkiss.dbeaver.ui.editors.sql.SQLSourceViewer;
        return CommonUtils.getBoolean(
                            SQLEditorHandlerOpenObjectConsole.openAndExecuteSQLScript(workbenchWindow, navContext, 
                    @Override
            return false;
        PostgreScriptObject sourceObject = getSourceObject();
package org.jkiss.dbeaver.ext.postgresql.ui.editors;

    private boolean isInDebugMode() {
    }

    {
                        refreshPart(PostgreSourceViewEditor.this, true);
                        IWorkbenchWindow workbenchWindow = UIUtils.getActiveWorkbenchWindow();
 * distributed under the License is distributed on an "AS IS" BASIS,

                }, true));
    protected boolean isAnnotationRulerVisible() {
                        setToolTipText(PostgreMessages.procedure_check_description);
                        UIUtils.runInUI(workbenchWindow, generator);
                        String sql = CommonUtils.notEmpty(generator.getResult());
 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at

import org.jkiss.dbeaver.ext.postgresql.ui.editors.sql.handlers.SQLEditorHandlerCheckProcedureConsole;
    @Override
            contributionManager.add(ActionUtils.makeActionContribution(
                        try {

                    public void run() {
                        List<DBSProcedure> entities = new ArrayList<>();
}
                    }
    }
                        SQLNavigatorContext navContext = new SQLNavigatorContext(sourceObject);
import java.util.List;


            contributionManager.add(new Separator());
    @Override
        }
import org.eclipse.ui.IWorkbenchWindow;
            contributionManager.add(ActionUtils.makeActionContribution(
                        setImageDescriptor(DBeaverIcons.getImageDescriptor(DBIcon.TREE_PROCEDURE));
    }
 */
        getInputPropertySource().setPropertyValue(monitor, "objectDefinitionText", sourceText);
    public PostgreSourceViewEditor() {
        PostgreScriptObject sourceObject = getSourceObject();
 *
                        String title = NLS.bind(PostgreMessages.procedure_check_label2, procName); 
    protected void setSourceText(DBRProgressMonitor monitor, String sourceText)
    protected Map<String, Object> getSourceOptions() {
import org.jkiss.dbeaver.ui.DBeaverIcons;
    @Override
import org.jkiss.dbeaver.ext.postgresql.model.*;
                        String procName = ((DBSProcedure) sourceObject).getName();
 *
 * limitations under the License.
                        entities.add((DBSProcedure) sourceObject);
import org.eclipse.jface.action.Separator;
import org.jkiss.dbeaver.runtime.DBWorkbench;
/**
    }
 */

        super.contributeEditorCommands(contributionManager);
import org.jkiss.dbeaver.ext.postgresql.PostgreMessages;
                        
        return true;
                        getDatabaseEditorInput().setAttribute(DBPScriptObject.OPTION_DEBUGGER_SOURCE, !isChecked());
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.Action;

import org.eclipse.osgi.util.NLS;
import org.jkiss.dbeaver.ui.UIUtils;


        if (sourceObject instanceof PostgreProcedure || sourceObject instanceof PostgreTriggerBase || sourceObject instanceof PostgreViewBase || sourceObject instanceof PostgreJobStep) {

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                    }
                new Action(PostgreMessages.source_view_show_header_label, Action.AS_CHECK_BOX) {
 * PostgreSourceViewEditor
import org.jkiss.dbeaver.ui.ActionUtils;
import org.jkiss.dbeaver.ui.editors.sql.handlers.SQLEditorHandlerOpenObjectConsole;

                                PostgreMessages.error_cant_open_sql_editor, e);
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedure;
    protected boolean isReadOnly()
    }
    @Override
                        DBRRunnableWithResult<String> generator = SQLEditorHandlerCheckProcedureConsole.checkGenerator(entities);
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithResult;
        options.put(DBPScriptObject.OPTION_DEBUGGER_SOURCE, isInDebugMode());
 * you may not use this file except in compliance with the License.
                    }
import org.eclipse.jface.action.IContributionManager;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2024 DBeaver Corp and others
                        setToolTipText(PostgreMessages.source_view_show_header_description);
                }, true));
                            DBWorkbench.getPlatformUI().showError(PostgreMessages.message_open_console, 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.DBPScriptObject;
import org.jkiss.dbeaver.ui.editors.sql.handlers.SQLNavigatorContext;
        return getSourceObject() instanceof PostgreProcedure;
                        } catch (CoreException e) {
import java.util.Map;
 * See the License for the specific language governing permissions and
import org.jkiss.utils.CommonUtils;
                    {
                    {
 * DBeaver - Universal Database Manager
                                title, true, null, sql, true);
    protected void contributeEditorCommands(IContributionManager contributionManager)
                    public void run() {
                        setChecked(!isInDebugMode());
        if (sourceObject instanceof PostgreProcedure) {
        return options;
    {
import org.jkiss.dbeaver.model.DBIcon;
    @Override
        }
import java.util.ArrayList;
