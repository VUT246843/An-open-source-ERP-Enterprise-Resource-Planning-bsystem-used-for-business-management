        super(dbmNode);
 * you may not use this file except in compliance with the License.
    public DBXTreeObject getEditorMeta() {
public class ObjectEditorInput extends DatabaseEditorInput<DBNDatabaseNode>
import org.jkiss.code.Nullable;
    @Override
 * See the License for the specific language governing permissions and
    }
 *
    public boolean equals(Object obj) {

    @Override

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public ObjectEditorInput(@NotNull DBNDatabaseNode dbmNode, @NotNull  DBXTreeObject meta)
        this.editorMeta = meta;
            return meta;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return null;
        return obj instanceof ObjectEditorInput && super.equals(obj) && getEditorMeta() == ((ObjectEditorInput) obj).getEditorMeta();
    public ObjectEditorInput(@NotNull DBNDatabaseObject dbmNode)
            return editorMeta;

    {
 */
    @Override
/**
package org.jkiss.dbeaver.ui.editors;
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
    }

        if (editorMeta != null) {
import org.jkiss.dbeaver.model.navigator.DBNDatabaseObject;
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
import org.jkiss.dbeaver.ui.DBeaverIcons;
 * Unless required by applicable law or agreed to in writing, software
 *

        return meta == null ? "" : meta.getDescription();

 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.

        }
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
 * ObjectEditorInput
}        super(dbmNode);

    public String getToolTipText() {
        DBNDatabaseNode node = getNavigatorNode();
        return meta == null ? null : DBeaverIcons.getImageDescriptor(meta.getDefaultIcon());
{
    }
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeObject;
import org.eclipse.jface.resource.ImageDescriptor;
 *
        }
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
        DBXTreeObject meta = getEditorMeta();

    {
    }
    @Nullable
    private DBXTreeObject editorMeta;
import org.jkiss.code.NotNull;
        if (node != null && node.getMeta() instanceof DBXTreeObject meta) {
        DBXTreeObject meta = getEditorMeta();
    }
    public ImageDescriptor getImageDescriptor() {
    }
