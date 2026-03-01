 * DBeaver - Universal Database Manager
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
        List<DB2Table> tables = CommonUtils.filterCollection(selectedObjects, DB2Table.class);
import org.jkiss.dbeaver.model.struct.DBSObject;
 * You may obtain a copy of the License at
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.core.commands.ExecutionEvent;
import org.jkiss.utils.CommonUtils;
package org.jkiss.dbeaver.ext.db2.ui.tools.maintenance;
    }
        }
    @Override
import org.eclipse.core.commands.AbstractHandler;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            DB2ReorgTableDialog dialog = new DB2ReorgTableDialog(HandlerUtil.getActivePart(event).getSite(), tables);
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
        List<DBSObject> selectedObjects = NavigatorUtils.getSelectedObjects(HandlerUtil.getCurrentSelection(event));
public class DB2ReorgTableToolCommandHandler extends AbstractHandler {
 *

 *
 */
/**
 * you may not use this file except in compliance with the License.
        if (!tables.isEmpty()) {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
/*
 * Unless required by applicable law or agreed to in writing, software
import java.util.List;

}
        return null;
    public Object execute(ExecutionEvent event) {
            return dialog.open();
 * DB2 table reorg action
 * limitations under the License.

import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
import org.jkiss.dbeaver.ext.db2.model.DB2Table;
 * Copyright (C) 2010-2024 DBeaver Corp and others
