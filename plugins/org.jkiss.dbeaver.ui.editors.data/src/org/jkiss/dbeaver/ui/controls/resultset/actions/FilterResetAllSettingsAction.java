import org.jkiss.dbeaver.ui.controls.resultset.spreadsheet.SpreadsheetCommandHandler;
import org.jkiss.dbeaver.ui.ActionUtils;
        if (viewer.hasColumnTransformers()) {
        viewer.clearDataFilter(false);
/*
        if (viewer.getDataFilter().hasHiddenAttributes()) {
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
    @Override
 */
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
 * You may obtain a copy of the License at
        if (viewer.hasColorOverrides()) {
 * limitations under the License.
}
package org.jkiss.dbeaver.ui.controls.resultset.actions;
import org.jkiss.dbeaver.ui.controls.resultset.handler.ResultSetHandlerMain;
        if (viewer.getDataFilter().hasPinnedAttributes()) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    public FilterResetAllSettingsAction(ResultSetViewer resultSetViewer) {
 * See the License for the specific language governing permissions and
        ResultSetViewer viewer = getResultSetViewer();
            new ResetAllColorAction(viewer).execute(false);
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
            new FilterResetAllPinsAction(viewer).execute(false);
import org.jkiss.dbeaver.ui.controls.resultset.colors.ResetAllColorAction;
 *
        }
 * you may not use this file except in compliance with the License.
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
            ActionUtils.runCommand(SpreadsheetCommandHandler.CMD_SHOW_COLUMNS, viewer.getSite());
            new FilterResetAllTransformersAction(viewer).execute(false);
 *
    }
        super(resultSetViewer, ResultSetMessages.controls_resultset_viewer_action_reset_all_settings);
public class FilterResetAllSettingsAction extends AbstractResultSetViewerAction {

        viewer.refreshData(null);
        }

    public void run() {


import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
