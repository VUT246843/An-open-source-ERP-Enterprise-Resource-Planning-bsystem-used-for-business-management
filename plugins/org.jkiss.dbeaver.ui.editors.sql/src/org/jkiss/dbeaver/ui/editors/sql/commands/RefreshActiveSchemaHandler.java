 * Licensed under the Apache License, Version 2.0 (the "License");
                var schema = ecd.getDefaultSchema();
            }
        }
import org.eclipse.core.commands.ExecutionException;
 * See the License for the specific language governing permissions and
    }
        return null;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2025 DBeaver Corp and others

 * limitations under the License.
}
        if (sqlEditor != null) {
                if (schema != null) {
        var sqlEditor = getEditor(event);

 */
/*
                    var node = getDatabaseNode(sqlEditor, schema);
                }
 * DBeaver - Universal Database Manager
            var context = getExecutionContext(sqlEditor);
public class RefreshActiveSchemaHandler extends AbstractSchemaHandler {
import org.jkiss.dbeaver.model.exec.DBCExecutionContextDefaults;
import org.eclipse.core.commands.ExecutionEvent;
 *
 *
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.ui.editors.sql.commands;
 * Unless required by applicable law or agreed to in writing, software
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    public Object execute(ExecutionEvent event) throws ExecutionException {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        refreshNode(node);
                    }
    @Override
                    if (node != null) {
            if (context instanceof DBCExecutionContextDefaults<?,?> ecd) {

 * You may obtain a copy of the License at
