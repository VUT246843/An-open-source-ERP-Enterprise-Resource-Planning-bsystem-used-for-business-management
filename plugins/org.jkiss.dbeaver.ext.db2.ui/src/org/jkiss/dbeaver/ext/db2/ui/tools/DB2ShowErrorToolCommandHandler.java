        return null;
 *
                return dialog.open();
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.ui.handlers.HandlerUtil;
        }
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.core.commands.AbstractHandler;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * @author Denis Forveille
        for (DBSObject object : NavigatorUtils.getSelectedObjects(HandlerUtil.getCurrentSelection(event))) {
 */
    public Object execute(ExecutionEvent event) {
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/**
 *
    }
import org.jkiss.dbeaver.ext.db2.model.DB2DataSource;
 */
                    HandlerUtil.getActiveWorkbenchWindow(event),
 * You may obtain a copy of the License at
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Manage the "Database/Tools" menu for DB2
import org.jkiss.dbeaver.model.struct.DBSObject;
 * limitations under the License.
 * 
                );
    @Override
import org.eclipse.core.commands.ExecutionEvent;
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.ext.db2.ui.tools;
                    (DB2DataSource) object.getDataSource()
 * you may not use this file except in compliance with the License.
public class DB2ShowErrorToolCommandHandler extends AbstractHandler {

/*

 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
}
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
                DB2ToolShowErrorDialog dialog = new DB2ToolShowErrorDialog(
            if (object.getDataSource() instanceof DB2DataSource) {
