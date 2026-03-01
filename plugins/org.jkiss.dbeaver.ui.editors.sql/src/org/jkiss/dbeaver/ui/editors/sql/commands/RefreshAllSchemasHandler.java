 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            if (context instanceof DBCExecutionContextDefaults<?,?> ecd) {
/*
                    var schemaNodes = getDatabaseNode(sqlEditor, catalog);
        if (sqlEditor != null) {
        return null;
 *

    @Override
            }
                if (catalog != null) {
 * limitations under the License.
    public Object execute(ExecutionEvent event) throws ExecutionException {
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
import org.eclipse.core.commands.ExecutionException;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.exec.DBCExecutionContextDefaults;

        var sqlEditor = getEditor(event);
package org.jkiss.dbeaver.ui.editors.sql.commands;
 *
 * See the License for the specific language governing permissions and
public class RefreshAllSchemasHandler extends AbstractSchemaHandler {
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * DBeaver - Universal Database Manager
    }
                }
}

 * You may obtain a copy of the License at
import org.eclipse.core.commands.ExecutionEvent;
                var catalog = ecd.getDefaultCatalog();
                    refreshNode(schemaNodes);
            var context = getExecutionContext(sqlEditor);
 *

 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
