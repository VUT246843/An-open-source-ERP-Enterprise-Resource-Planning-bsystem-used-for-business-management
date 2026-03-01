 * Copyright (C) 2010-2024 DBeaver Corp and others
public class TransformerSettingsAction extends AbstractResultSetViewerAction {
    @Override
import org.jkiss.dbeaver.model.DBPDataSource;
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
            return;
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (dataSource == null) {
    }
    }
    public TransformerSettingsAction(ResultSetViewer resultSetViewer) {
 * You may obtain a copy of the License at
 */
        if (settingsDialog.open() == IDialogConstants.OK_ID) {
            getResultSetViewer().refreshData(null);
import org.jkiss.dbeaver.ui.controls.resultset.TransformerSettingsDialog;
import org.eclipse.jface.dialogs.IDialogConstants;
 * limitations under the License.
            dataSource.getContainer().persistConfiguration();

        }
        }
/*
 *
        TransformerSettingsDialog settingsDialog = new TransformerSettingsDialog(getResultSetViewer(), null, true);


        DBPDataSource dataSource = getResultSetViewer().getDataSource();
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
 * Unless required by applicable law or agreed to in writing, software
}
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
package org.jkiss.dbeaver.ui.controls.resultset.actions;
        super(resultSetViewer, ResultSetMessages.controls_resultset_viewer_action_view_column_types);
    public void run() {
