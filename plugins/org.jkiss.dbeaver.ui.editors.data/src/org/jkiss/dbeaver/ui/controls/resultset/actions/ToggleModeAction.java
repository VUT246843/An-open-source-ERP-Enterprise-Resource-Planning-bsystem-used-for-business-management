        setImageDescriptor(DBeaverIcons.getImageDescriptor(UIIcon.RS_DETAILS));
 *
import org.jkiss.utils.CommonUtils;
        return getResultSetViewer().isRecordMode();
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
    }

public class ToggleModeAction extends AbstractResultSetViewerAction {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 */
 * Unless required by applicable law or agreed to in writing, software
        String toolTip = ActionUtils.findCommandDescription(IResultSetCommands.CMD_TOGGLE_MODE, getResultSetViewer().getSite(), false);
 * you may not use this file except in compliance with the License.
}
import org.eclipse.jface.action.Action;
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
import org.jkiss.dbeaver.ui.UIIcon;
        if (!CommonUtils.isEmpty(toolTip)) {
        super(resultSetViewer, ResultSetMessages.dialog_text_check_box_record, Action.AS_CHECK_BOX);
    @Override
package org.jkiss.dbeaver.ui.controls.resultset.actions;

 * limitations under the License.

    @Override

 * DBeaver - Universal Database Manager
        setActionDefinitionId(IResultSetCommands.CMD_TOGGLE_MODE);

import org.jkiss.dbeaver.ui.DBeaverIcons;
/*
 *
        getResultSetViewer().toggleMode();
        }
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.ui.ActionUtils;
            setToolTipText(toolTip);
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    public boolean isChecked() {
    {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
    public void run() {
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetCommands;
 *
    public ToggleModeAction(ResultSetViewer resultSetViewer) {
