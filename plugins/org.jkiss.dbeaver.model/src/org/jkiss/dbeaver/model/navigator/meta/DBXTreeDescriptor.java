        super(source, parent, config, path, propertyName, optional, navigable, inline, virtual, standalone, visibleIf, recursiveLink);
        this.supportsEntityMerge = item.supportsEntityMerge;
 *
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.utils.CommonUtils;
 * distributed under the License is distributed on an "AS IS" BASIS,

    private final boolean supportsEntityMerge;
    public boolean supportsEntityMerge() {
    public DBXTreeDescriptor(AbstractDescriptor source, DBXTreeNode parent, IConfigurationElement config, String path, String propertyName, boolean optional, boolean navigable, boolean inline, boolean virtual, boolean standalone, String visibleIf, String recursiveLink) {
 */
        this.supportsEntityMerge = config != null && CommonUtils.toBoolean(config.getAttribute("supportsEntityMerge"));
 * Licensed under the Apache License, Version 2.0 (the "License");
/**
        return supportsEntityMerge;
/*
    }
 *

package org.jkiss.dbeaver.model.navigator.meta;
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
 * See the License for the specific language governing permissions and
    }
    }
        super(source, null, item);
 * You may obtain a copy of the License at
import org.jkiss.code.NotNull;
import org.eclipse.core.runtime.IConfigurationElement;
    public DBXTreeDescriptor(@NotNull AbstractDescriptor source, @NotNull DBXTreeDescriptor item) {

 * DBXTreeDescriptor


 */
 *
 * limitations under the License.
}
 * you may not use this file except in compliance with the License.

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2024 DBeaver Corp and others


 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
public class DBXTreeDescriptor extends DBXTreeItem {
