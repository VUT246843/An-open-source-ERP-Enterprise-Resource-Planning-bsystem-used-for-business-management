        this.description = object.description;
    public int hashCode() {
import java.util.Objects;

    public boolean equals(Object o) {

        return label;
    }
    public String getNodeTypeLabel(@Nullable DBPDataSource dataSource, @Nullable String locale)
        return "Object " + label;
        this.editorId = object.editorId;
        super(source, parent, config, true, false, false, false, visibleIf, null);
import org.jkiss.code.Nullable;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
    public DBXTreeObject(AbstractDescriptor source, DBXTreeNode parent, IConfigurationElement config, String visibleIf, String label, String description, String editorId)

}        return Objects.hash(editorId);
    }
    {
        DBXTreeObject that = (DBXTreeObject) o;
        return label;
 * DBeaver - Universal Database Manager
/*
    }
        this.editorId = editorId;
    {
import org.eclipse.core.runtime.IConfigurationElement;
        if (o == null || getClass() != o.getClass()) return false;
 *     http://www.apache.org/licenses/LICENSE-2.0
    {
package org.jkiss.dbeaver.model.navigator.meta;
    @Override
        this.label = label;
    }
    {
 * you may not use this file except in compliance with the License.
        return label;
    }
    @Override
 */
    @Override
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
    }
 * limitations under the License.

    private String editorId;
    public String getEditorId()

        return editorId;
 *
    {
    {
    DBXTreeObject(AbstractDescriptor source, DBXTreeNode parent, DBXTreeObject object)


 * Unless required by applicable law or agreed to in writing, software
    public String getLabel() {
    public String getChildrenTypeLabel(@Nullable DBPDataSource dataSource, String locale)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private String description;
/**
{
    private String label;
    @Override
        return description;
public class DBXTreeObject extends DBXTreeNode

 *

    public String toString() {
    }
        this.description = description;



 */
        if (this == o) return true;
        super(source, parent, object);
    }
    public String getDescription()
 * You may obtain a copy of the License at
        return Objects.equals(editorId, that.editorId) && Objects.equals(getId(), that.getId());
 *
 * See the License for the specific language governing permissions and
    }
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.label = object.label;
 * DBXTreeObject

