 * Copyright (C) 2010-2024 DBeaver Corp and others
        return null;
                database = ((PostgreObject) object).getDatabase();
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
}
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
                new PostgreFDWConfigWizard(database));
 * you may not use this file except in compliance with the License.
            dialog.open();
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.ui.dialogs.ActiveWizardDialog;
 */
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            PostgreDatabase database;
 *
 * You may obtain a copy of the License at
        }

            }
                HandlerUtil.getActiveWorkbenchWindow(event),
import org.jkiss.dbeaver.ext.postgresql.model.PostgreObject;
            ActiveWizardDialog dialog = new ActiveWizardDialog(
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.ui.handlers.HandlerUtil;
 * DBeaver - Universal Database Manager
                continue;
            dialog.setFinishButtonLabel("Install");
            } else {
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
 *
        for (DBSObject object : NavigatorUtils.getSelectedObjects(HandlerUtil.getCurrentSelection(event))) {
            if (object instanceof PostgreObject) {

    }
 * Unless required by applicable law or agreed to in writing, software
public class PostgreFDWConfigToolCommandHandler extends AbstractHandler {
import org.eclipse.core.commands.ExecutionEvent;
    public Object execute(ExecutionEvent event) {
/*
package org.jkiss.dbeaver.ext.postgresql.tools.fdw;

 * limitations under the License.
