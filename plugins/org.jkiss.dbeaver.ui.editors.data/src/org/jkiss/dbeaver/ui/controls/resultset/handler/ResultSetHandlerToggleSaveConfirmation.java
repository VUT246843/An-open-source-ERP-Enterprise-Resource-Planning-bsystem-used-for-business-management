    @Override
 * limitations under the License.
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
            }
import org.eclipse.ui.commands.IElementUpdater;
package org.jkiss.dbeaver.ui.controls.resultset.handler;
                element.setChecked(resultSet.getPreferenceStore().getBoolean(ResultSetPreferences.RESULT_SET_CONFIRM_BEFORE_SAVE));
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetPreferences;
 *
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
            IResultSetController resultSet = ResultSetHandlerMain.getActiveResultSet(workbenchPart);
 * Licensed under the Apache License, Version 2.0 (the "License");

 * See the License for the specific language governing permissions and
import java.util.Map;
        }
 * you may not use this file except in compliance with the License.
    public void updateElement(UIElement element, Map parameters) {
        if (workbenchPart != null) {
import org.eclipse.ui.menus.UIElement;
 * ResultSetHandlerToggleSaveConfirmation
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
/**
 */
 * Unless required by applicable law or agreed to in writing, software
public class ResultSetHandlerToggleSaveConfirmation extends ResultSetHandlerMain implements IElementUpdater {

import org.jkiss.dbeaver.ui.controls.resultset.IResultSetController;
} *
            if (resultSet != null) {
/*


        IWorkbenchPart workbenchPart = UIUtils.getActiveWorkbenchWindow().getActivePage().getActivePart();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ui.UIUtils;
import org.eclipse.ui.IWorkbenchPart;
 */
