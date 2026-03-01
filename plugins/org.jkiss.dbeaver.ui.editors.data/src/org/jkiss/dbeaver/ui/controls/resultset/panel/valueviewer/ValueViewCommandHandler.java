import org.eclipse.ui.handlers.HandlerUtil;
                case ITextEditorActionDefinitionIds.SMART_ENTER:

    public Object execute(ExecutionEvent event) throws ExecutionException {

import org.eclipse.ui.texteditor.ITextEditorActionDefinitionIds;
        String actionId = event.getCommand().getId();
        }
    }
public class ValueViewCommandHandler extends AbstractHandler {
import org.eclipse.core.commands.AbstractHandler;
                    break;
/**
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
 * ValueViewCommandHandler
import org.jkiss.code.Nullable;
        }
import org.eclipse.core.commands.ExecutionEvent;
 *
            return null;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
package org.jkiss.dbeaver.ui.controls.resultset.panel.valueviewer;
 * See the License for the specific language governing permissions and
        return null;
 *
    @Nullable
 * You may obtain a copy of the License at

 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
        final ResultSetViewer rsv = (ResultSetViewer) ResultSetHandlerMain.getActiveResultSet(HandlerUtil.getActivePart(event));
                case CMD_SAVE_VALUE:
                //case CoreCommands.CMD_EXECUTE_STATEMENT:
        IResultSetPanel visiblePanel = rsv.getVisiblePanel();
        if (visiblePanel instanceof ValueViewerPanel) {
 * DBeaver - Universal Database Manager
import org.eclipse.core.commands.ExecutionException;
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetPanel;
 *
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
 * Unless required by applicable law or agreed to in writing, software

        if (rsv == null) {
/*
import org.jkiss.dbeaver.ui.controls.resultset.handler.ResultSetHandlerMain;
            }
            switch (actionId) {

}    public static final String CMD_SAVE_VALUE = "org.jkiss.dbeaver.core.resultset.cell.save";


 */
                    ((ValueViewerPanel) visiblePanel).saveValue();
