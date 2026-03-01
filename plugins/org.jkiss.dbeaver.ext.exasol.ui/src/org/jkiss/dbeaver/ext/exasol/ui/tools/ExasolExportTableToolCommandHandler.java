 * Unless required by applicable law or agreed to in writing, software
                HandlerUtil.getActivePart(event).getSite(),
            }
import org.eclipse.core.commands.ExecutionEvent;
            try {
 * You may obtain a copy of the License at
import org.jkiss.utils.CommonUtils;
import java.util.List;
        }
        List<ExasolView> views = CommonUtils.filterCollection(selectedObjects, ExasolView.class);
            } catch (DBException e) {
        return null;

        for (ExasolTable table : tables) {
 *
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
 *
import org.jkiss.dbeaver.ext.exasol.model.ExasolTable;
/*

        // create TableBase Objects list
 * Copyright (C) 2016 Karl Griesser (fullref@gmail.com)

        List<ExasolTable> tables = CommonUtils.filterCollection(selectedObjects, ExasolTable.class);
        List<ExasolSchema> schemas = CommonUtils.filterCollection(selectedObjects, ExasolSchema.class);

            );
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
                tableBaseObjects

        for (ExasolView view : views) {
        HashSet<ExasolTableBase> tableBaseObjects = new HashSet();
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
            return dialog.open();
import org.eclipse.ui.handlers.HandlerUtil;
import org.jkiss.dbeaver.ext.exasol.model.ExasolTableBase;
public class ExasolExportTableToolCommandHandler extends AbstractHandler {
        if (!tableBaseObjects.isEmpty()) {
}
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ext.exasol.model.ExasolSchema;
 *     http://www.apache.org/licenses/LICENSE-2.0

import org.jkiss.dbeaver.DBException;
        //add tables for all Schemas but ignore views in schema
                tables.addAll(schema.getTables(new VoidProgressMonitor()));
            ExasolExportTableToolDialog dialog = new ExasolExportTableToolDialog(
 */
        }
import org.jkiss.dbeaver.model.struct.DBSObject;
            tableBaseObjects.add((ExasolTableBase) table);
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ext.exasol.model.ExasolView;
    public Object execute(ExecutionEvent event) {
import java.util.HashSet;

        for (ExasolSchema schema : schemas) {
        }
 * limitations under the License.
        //add tables
        List<DBSObject> selectedObjects = NavigatorUtils.getSelectedObjects(HandlerUtil.getCurrentSelection(event));
import org.jkiss.dbeaver.Log;

        }
 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *

    private static final Log log = Log.getLog(ExasolExportTableToolCommandHandler.class);
package org.jkiss.dbeaver.ext.exasol.ui.tools;
            tableBaseObjects.add((ExasolTableBase) view);
        //add views
    @Override
        @SuppressWarnings({"unchecked", "rawtypes"})


                log.error(e);
import org.eclipse.core.commands.AbstractHandler;
