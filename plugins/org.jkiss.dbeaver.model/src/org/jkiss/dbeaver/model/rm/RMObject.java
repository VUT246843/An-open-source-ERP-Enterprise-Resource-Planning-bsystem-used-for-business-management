public abstract class RMObject implements DBPNamedObject {
        }
 */
            for (int i = 0; i < children.length; i++) {
    }
        if (children == null || (children.length == 1 && children[0] == child)) {
    }
                    children[i] = resource;
 *
    @Nullable
        } else {
    public RMObject(@NotNull String name) {
        return getName();
    @Nullable
    /**
            children = new RMResource[] { child };

import org.jkiss.code.Nullable;
                    return child;
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.children = resources;

    public void addChild(@NotNull RMResource child) {
     * Should be used only by internal procedures

 * Unless required by applicable law or agreed to in writing, software
    public void setChildren(@NotNull RMResource[] resources) {
            }

    @Nullable
 * See the License for the specific language governing permissions and
    public void removeChild(@NotNull RMResource child) {

    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
            for (RMResource child : children) {
        return children;
            children = null;
    public RMResource[] getChildren() {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
            }
    }
 *
    }
/**


        this.name = name;
}
        if (children == null) {
     * Updates resource for child object.
 * You may obtain a copy of the License at

 */
/*
                }
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return name;
 * Abstract resource

 * Licensed under the Apache License, Version 2.0 (the "License");

    public void updateChild(@NotNull String name, @NotNull RMResource resource) {
                if (child.getName().equals(name)) {

    @NotNull

package org.jkiss.dbeaver.model.rm;
                if (child.getName().equals(name)) {
    @Override
        }
import org.jkiss.dbeaver.model.DBPNamedObject;
        this.name = name;
            children = ArrayUtils.remove(RMResource.class, children, child);

    }
        return null;
            children = ArrayUtils.add(RMResource.class, children, child);
                RMResource child = children[i];
import org.jkiss.utils.ArrayUtils;

    public void setName(@NotNull String name) {
    }

import org.jkiss.code.NotNull;
     */
    public String getName() {
    public String toString() {
                    break;
 *

     * Used to refresh RM cache.
        }
    public RMResource getChild(@NotNull String name) {
    public RMObject() {
                }
    public abstract boolean isFolder();
    }
    }
 * limitations under the License.
 * DBeaver - Universal Database Manager
    }
    private RMResource[] children;
    private String name;
        } else {
        if (children != null) {
        if (children != null) {
