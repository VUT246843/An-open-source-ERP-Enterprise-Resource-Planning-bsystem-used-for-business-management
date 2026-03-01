    }
/*
        }
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
package org.jkiss.dbeaver.ui.editors.sql.commands;
import org.jkiss.dbeaver.ui.navigator.actions.NavigatorHandlerRefresh;
    }
    }
                return navigatorModel.findNode(object);
import org.jkiss.dbeaver.model.struct.DBSObject;
    }
    @Nullable
import org.jkiss.dbeaver.ui.editors.sql.SQLEditor;

import org.jkiss.code.Nullable;
        return RuntimeUtils.getObjectAdapter(HandlerUtil.getActiveEditor(event), SQLEditor.class);
    protected DBCExecutionContext getExecutionContext(@NotNull SQLEditor editor) {
    protected DBNModel getNavigatorModel(DBPProject project) {
    protected DBPProject getProject(SQLEditor editor) {
    }

 * limitations under the License.
public abstract class AbstractSchemaHandler extends AbstractHandler {
        if (project != null) {
import org.jkiss.dbeaver.model.navigator.DBNModel;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.utils.RuntimeUtils;
        return editor.getProject();

import org.jkiss.dbeaver.model.app.DBPProject;

 *
 * You may obtain a copy of the License at


 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.ui.handlers.HandlerUtil;
        var project = getProject(editor);
    @Nullable
 * DBeaver - Universal Database Manager
}

        return null;
 * See the License for the specific language governing permissions and
    }
import java.util.List;
            if (navigatorModel != null) {
import org.jkiss.code.NotNull;
        if (node != null) {

    protected SQLEditor getEditor(@NotNull ExecutionEvent event) {
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
    protected DBNDatabaseNode getDatabaseNode(SQLEditor editor, DBSObject object) {
 */
        return project.getNavigatorModel();
            var navigatorModel = getNavigatorModel(project);
 *     http://www.apache.org/licenses/LICENSE-2.0
        return editor.getExecutionContext();
import org.eclipse.core.commands.AbstractHandler;
    protected void refreshNode(DBNDatabaseNode node) {
            NavigatorHandlerRefresh.refreshNavigator(List.of(node));
import org.eclipse.core.commands.ExecutionEvent;
 *
 * you may not use this file except in compliance with the License.

 * Unless required by applicable law or agreed to in writing, software
 *
        }
