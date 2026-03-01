                editor.getActivePreferenceStore().save();
    @Override
 * You may obtain a copy of the License at
import java.io.IOException;

import org.jkiss.dbeaver.utils.RuntimeUtils;
 * limitations under the License.
            DBWorkbench.getPlatform().getPreferenceStore().setValue(SQLPreferenceConstants.RESULT_SET_ORIENTATION, curOrientation.name());


import org.eclipse.core.commands.ExecutionException;
        SQLEditor editor = RuntimeUtils.getObjectAdapter(HandlerUtil.getActiveEditor(event), SQLEditor.class);
import org.jkiss.dbeaver.Log;
            String curPresentationName = DBWorkbench.getPlatform().getPreferenceStore().getString(SQLPreferenceConstants.RESULT_SET_ORIENTATION);
                curOrientation = SQLEditor.ResultSetOrientation.HORIZONTAL;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
                log.error("Error saving editor preferences", e);
 * See the License for the specific language governing permissions and
 *
public class SQLEditorHandlerToggleEditorLayout extends AbstractHandler {
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.ui.handlers.HandlerUtil;
            }

 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.core.commands.AbstractHandler;
}        if (editor != null) {
            } else {
import org.jkiss.dbeaver.ui.editors.sql.SQLPreferenceConstants;
 */
import org.jkiss.dbeaver.ui.editors.sql.SQLEditor;
 * Unless required by applicable law or agreed to in writing, software
            } catch (IOException e) {
                curOrientation = SQLEditor.ResultSetOrientation.VERTICAL;
            SQLEditor.ResultSetOrientation curOrientation = CommonUtils.valueOf(SQLEditor.ResultSetOrientation.class, curPresentationName, SQLEditor.ResultSetOrientation.HORIZONTAL);
import org.eclipse.core.commands.ExecutionEvent;
    public Object execute(ExecutionEvent event) throws ExecutionException {
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.runtime.DBWorkbench;
package org.jkiss.dbeaver.ui.editors.sql.handlers;
 * distributed under the License is distributed on an "AS IS" BASIS,
        return null;
 *     http://www.apache.org/licenses/LICENSE-2.0
            if (curOrientation == SQLEditor.ResultSetOrientation.HORIZONTAL) {
 *
            try {
            }

    static protected final Log log = Log.getLog(SQLEditorHandlerToggleEditorLayout.class);
    }
import org.jkiss.utils.CommonUtils;
        }
 *
