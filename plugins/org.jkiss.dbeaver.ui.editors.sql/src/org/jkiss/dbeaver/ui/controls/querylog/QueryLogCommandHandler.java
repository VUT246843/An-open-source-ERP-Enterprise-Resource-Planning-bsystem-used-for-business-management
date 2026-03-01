}
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
 *

                return null;

            Object controlData = control.getData();
                logViewer.refresh();
 *
 */
        Control control = (Control)HandlerUtil.getVariable(event, ISources.ACTIVE_FOCUS_CONTROL_NAME);
            return null;
import org.eclipse.ui.ISources;
    }
import org.jkiss.dbeaver.ui.IActionConstants;
 * you may not use this file except in compliance with the License.
        if (logViewer == null) {
import org.eclipse.swt.widgets.Control;
    public Object execute(ExecutionEvent event) throws ExecutionException
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others
        if (control != null) {
        }
import org.eclipse.ui.handlers.HandlerUtil;
        switch (actionId) {
    {
 * Licensed under the Apache License, Version 2.0 (the "License");
                logViewer.copySelectionToClipboard(false);
package org.jkiss.dbeaver.ui.controls.querylog;
import org.eclipse.ui.IWorkbenchCommandConstants;
            case IWorkbenchCommandConstants.FILE_REFRESH:
        return null;
    }
            if (controlData instanceof QueryLogViewer) {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
                return null;
        }
 * limitations under the License.
                return null;

 *
    {
    @Override
public class QueryLogCommandHandler extends AbstractHandler {
                logViewer.selectAll();
        return null;
        String actionId = event.getCommand().getId();
import org.eclipse.core.commands.ExecutionException;
            case IActionConstants.CMD_COPY_SPECIAL:
        }
            case IWorkbenchCommandConstants.EDIT_SELECT_ALL:
/**
                return null;
/*
import org.eclipse.core.commands.ExecutionEvent;
            case IWorkbenchCommandConstants.EDIT_DELETE:
            case IWorkbenchCommandConstants.EDIT_COPY:

 * DBeaver - Universal Database Manager
 * QueryLogViewer command handler
import org.eclipse.core.commands.AbstractHandler;
    public static QueryLogViewer getActiveQueryLog(ExecutionEvent event)
                return (QueryLogViewer) controlData;
 */
                logViewer.copySelectionToClipboard(true);
                return null;

            }
 * Unless required by applicable law or agreed to in writing, software
                logViewer.deleteSelectedItems();
        QueryLogViewer logViewer = getActiveQueryLog(event);
