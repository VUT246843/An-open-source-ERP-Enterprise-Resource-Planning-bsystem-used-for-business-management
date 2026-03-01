 * distributed under the License is distributed on an "AS IS" BASIS,

            return;
 *
        updateColors(vEntity);
    public void run() {
import org.eclipse.jface.dialogs.IDialogConstants;
    @Override
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
        this.resultSetViewer = resultSetViewer;

        final DBVEntity vEntity = getColorsVirtualEntity();
    public CustomizeColorsAction(ResultSetViewer resultSetViewer, DBDAttributeBinding curAttribute, ResultSetRow row) {

    }
        super(resultSetViewer, ResultSetMessages.actions_name_row_colors); //$NON-NLS-1$
public class CustomizeColorsAction extends ColorAction {
        }
        this.curAttribute = curAttribute;

    @Override
 * limitations under the License.
    private ResultSetViewer resultSetViewer;
import org.jkiss.dbeaver.model.virtual.DBVEntity;
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.ui.controls.resultset.colors;
    }
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetRow;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
/*
    }

}
        if (dialog.open() != IDialogConstants.OK_ID) {
        this.row = row;
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
        return true;
    private final ResultSetRow row;
 */
        ColorSettingsDialog dialog = new ColorSettingsDialog(resultSetViewer, vEntity, curAttribute, row);
 *
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
    public boolean isEnabled() {
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
    private final DBDAttributeBinding curAttribute;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
