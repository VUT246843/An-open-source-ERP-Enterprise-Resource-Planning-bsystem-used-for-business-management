    @Nullable
            path = path == null ? folder.getName() : folder.getName() + "/" + path;
        return path;
            this.parent.children.add(this);

        for (DBPDataSourceFolder p = folder; p != null; p = p.getParent()) {
    }
 */
 * DataSourceFolder

import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;
        setParent(parent);
 */
import java.util.List;

        this.description = description;
        }
            if (child.getName().equals(name)) {
    }
    }
        this.parent = (DataSourceFolder) parent;

    }
    public String getDescription() {
public class DataSourceFolder implements DBPDataSourceFolder {

        if (this.parent != null) {

    }
import org.jkiss.utils.ArrayUtils;
        return name;
    }
 * You may obtain a copy of the License at
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
    @Override
    @Override
    }
    public void setParent(@Nullable DBPDataSourceFolder parent) {
        return getFolderPath();
    public String getFolderPath() {
        return description;
    private boolean isParentOf(DBPDataSourceFolder folder) {
        return registry;
        }
    @NotNull
        }
        for (DataSourceFolder folder = this; folder != null; folder = folder.getParent()) {
        return parent;
 * Unless required by applicable law or agreed to in writing, software
    }
        return null;
            if (p == this) {
            }
            }
    @Override
        for (DataSourceFolder child : children) {
}

    }
import org.jkiss.dbeaver.model.DBPDataSourceFolder;

    public DataSourceFolder getParent() {
    private String description;
    @NotNull
        }

 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.registry;
 *
    public DBPDataSourceRegistry getDataSourceRegistry() {
        return folder != this && !this.isParentOf(folder);

    @Override
    }
 * See the License for the specific language governing permissions and
 * limitations under the License.
                return true;
    private DataSourceFolder parent;
 *
                return child;
        if (this.parent != null) {

        return ArrayUtils.toArray(DataSourceFolder.class, children);
    private String name;
    public void setDescription(String description) {
    private final List<DataSourceFolder> children = new ArrayList<>();
        return false;
    public String getName() {
    }
        this.name = newName;
    public DataSourceFolder getChild(String name) {
        String path = null;
        this.name = name;
    @NotNull
    }
    @Override
import org.jkiss.code.NotNull;

    private final DataSourceRegistry<?> registry;
        this.registry = registry;
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override

/*
 *     http://www.apache.org/licenses/LICENSE-2.0
    public DataSourceFolder(DataSourceRegistry<?> registry, DataSourceFolder parent, String name, String description) {
    public boolean canMoveTo(@NotNull DBPDataSourceFolder folder) {
/**


    @NotNull
    public void setName(@NotNull String newName) {
    @Override

            this.parent.children.remove(this);

 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        this.description = description;
import org.jkiss.code.Nullable;
    @Override
    }
    public DataSourceFolder[] getChildren() {
 *
    @Nullable
    public String toString() {
import java.util.ArrayList;
