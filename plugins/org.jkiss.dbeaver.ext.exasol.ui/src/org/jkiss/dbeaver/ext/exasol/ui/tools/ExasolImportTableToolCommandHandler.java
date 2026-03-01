 *
import org.jkiss.dbeaver.ext.exasol.model.ExasolSchema;
import org.jkiss.dbeaver.ext.exasol.model.ExasolTable;
                log.error(e);
            } catch (DBException e) {
 */
import java.util.List;

public class ExasolImportTableToolCommandHandler extends AbstractHandler {

import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
        @SuppressWarnings({"unchecked", "rawtypes"})

 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
        HashSet<ExasolTableBase> tableBaseObjects = new HashSet();
}
 *
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
import java.util.HashSet;

import org.jkiss.dbeaver.Log;
            return dialog.open();
    private static final Log log = Log.getLog(ExasolImportTableToolCommandHandler.class);
    }
        //add tables
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
        return null;
                tableBaseObjects
                HandlerUtil.getActivePart(event).getSite(),
        List<ExasolTable> tables = CommonUtils.filterCollection(selectedObjects, ExasolTable.class);
import org.eclipse.core.commands.ExecutionEvent;
 * Copyright (C) 2010-2024 DBeaver Corp and others
            tableBaseObjects.add((ExasolTableBase) table);
        if (!tableBaseObjects.isEmpty()) {
import org.eclipse.ui.handlers.HandlerUtil;
        }

 * Copyright (C) 2016 Karl Griesser (fullref@gmail.com)
            ExasolImportTableToolDialog dialog = new ExasolImportTableToolDialog(
/*

import org.jkiss.dbeaver.ext.exasol.model.ExasolTableBase;


            }
        for (ExasolSchema schema : schemas) {

        // create TableBase Objects list
 * DBeaver - Universal Database Manager
        List<ExasolSchema> schemas = CommonUtils.filterCollection(selectedObjects, ExasolSchema.class);
            try {
package org.jkiss.dbeaver.ext.exasol.ui.tools;
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
    @Override
import org.jkiss.utils.CommonUtils;
        List<DBSObject> selectedObjects = NavigatorUtils.getSelectedObjects(HandlerUtil.getCurrentSelection(event));

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            );
 *
                tables.addAll(schema.getTables(new VoidProgressMonitor()));
        for (ExasolTable table : tables) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.struct.DBSObject;
 * limitations under the License.
    public Object execute(ExecutionEvent event) {
        //add tables for all Schemas but ignore views in schema
import org.eclipse.core.commands.AbstractHandler;
import org.jkiss.dbeaver.DBException;
        }
