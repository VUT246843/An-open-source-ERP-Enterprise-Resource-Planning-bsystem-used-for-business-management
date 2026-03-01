
        }
        this.nodePath = dbnDatabaseNode.getNodeUri();
            toolTip.append(": ");
    {
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
            getDefaultFolderId(),
    @NotNull

            container,
 * See the License for the specific language governing permissions and
 */
        final DBCExecutionContext context = Objects.requireNonNull(getExecutionContext());
    public DatabaseNodeEditorInput(@NotNull DBNDatabaseNode dbnDatabaseNode, @Nullable DBECommandContext commandContext)
            nodeName,
            container.getId(),

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.navigator.DBNNode;
    public <T> T getAdapter(Class<T> adapter) {
        return obj instanceof DatabaseNodeEditorInput && super.equals(obj);
package org.jkiss.dbeaver.ui.editors;
import org.jkiss.code.Nullable;
        return new DatabaseLazyEditorInput(

import org.jkiss.dbeaver.model.edit.DBECommandContext;
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
            getDefaultPageId(),
import java.util.Objects;
                break;
import org.jkiss.dbeaver.model.struct.DBSObject;
    @Override
    }
    @Override
    }
        if (getNavigatorNode() == null) {
    public String getNodePath() {
}        );
            return adapter.cast(databaseObject);
        return nodePath;
import org.jkiss.code.NotNull;
 * Licensed under the Apache License, Version 2.0 (the "License");
            nodePath,
            if (node instanceof DBNDataSource) {
 *
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
 *

        super(dbnDatabaseNode, commandContext);
            DBSObject databaseObject = getDatabaseObject();
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            container.getProject(),
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
                continue;

import org.jkiss.dbeaver.model.navigator.DBNDataSource;

    @Override
 * You may obtain a copy of the License at
        EditorUtils.appendProjectToolTip(toolTip, getNavigatorNode().getOwnerProject());
 * Unless required by applicable law or agreed to in writing, software
    @Override
            false
            }
 * limitations under the License.
            toolTip.append(" \n");
            getConnectionColor(),
            getClass().getName(),
{
        return super.getAdapter(adapter);
    }

    public String getToolTipText() {
    
        final DBPDataSourceContainer container = context.getDataSource().getContainer();
    @Nullable

            toolTip.append(node.getNodeTypeLabel());
        if (adapter == DBSObject.class) {
            toolTip.append(node.getNodeDisplayName());
    }

        }
    {

    private final String nodeName;
 */

        this.nodeName = dbnDatabaseNode.getNodeDisplayName();
    public ILazyEditorInput unloadInput() {
    @Override
 *
        for (DBNNode node = getNavigatorNode(); node != null; node = node.getParentNode()) {
            return "";
            if (node instanceof DBSFolder) {
    }
        return toolTip.toString();
    public boolean equals(Object obj) {

    }
    private final String nodePath;
            }
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.struct.DBSFolder;
 * DatabaseNodeEditorInput
/*
/**
 *     http://www.apache.org/licenses/LICENSE-2.0

    public DatabaseNodeEditorInput(@NotNull DBNDatabaseNode dbmNode)
        StringBuilder toolTip = new StringBuilder();
public class DatabaseNodeEditorInput extends DatabaseEditorInput<DBNDatabaseNode> implements IUnloadableEditorInput
        this(dbmNode, null);
        }
