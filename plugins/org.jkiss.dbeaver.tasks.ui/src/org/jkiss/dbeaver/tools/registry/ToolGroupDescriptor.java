        String parentId = config.getAttribute(RegistryConstants.ATTR_PARENT);
    public ToolGroupDescriptor getParent() {
import org.jkiss.dbeaver.registry.RegistryConstants;
        this.icon = iconToImage(config.getAttribute(RegistryConstants.ATTR_ICON));
        super(config);
    @Nullable
package org.jkiss.dbeaver.tools.registry;
 *
import org.jkiss.code.Nullable;
        this.parent = CommonUtils.isEmpty(parentId) ? null : ToolsRegistry.getInstance().getToolGroup(parentId);
import org.jkiss.utils.CommonUtils;
import org.eclipse.core.runtime.IConfigurationElement;
    }
    private final String description;
            return ((DBSObject) object).getDataSource();
    }
 * limitations under the License.
 * ToolDescriptor
    public DBPImage getIcon() {

    public String getDescription() {
 * See the License for the specific language governing permissions and


    {
    private final ToolGroupDescriptor parent;
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

public class ToolGroupDescriptor extends AbstractContextDescriptor {
/**
        if (object instanceof DBSObject) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    }

 * DBeaver - Universal Database Manager
    }
import org.jkiss.dbeaver.model.impl.AbstractContextDescriptor;
        return parent;
    }
 */
    private final String label;
 * Copyright (C) 2010-2025 DBeaver Corp and others
/*
 *     http://www.apache.org/licenses/LICENSE-2.0

        return icon;
 */
    @Override
    public ToolGroupDescriptor(IConfigurationElement config)
 * You may obtain a copy of the License at
    }
        this.id = config.getAttribute(RegistryConstants.ATTR_ID);
import org.jkiss.dbeaver.model.struct.DBSObject;
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
 *
 * Unless required by applicable law or agreed to in writing, software
    private final DBPImage icon;

    protected Object adaptType(@NotNull DBPObject object) {
        return id;
        return super.adaptType(object);
import org.jkiss.code.NotNull;
    public String getLabel() {
 *
        this.description = config.getAttribute(RegistryConstants.ATTR_DESCRIPTION);
import org.jkiss.dbeaver.model.DBPImage;

    public String getId() {
        return description;

    private final String id;
    }
        return label;


 * you may not use this file except in compliance with the License.
        this.label = config.getAttribute(RegistryConstants.ATTR_LABEL);
import org.jkiss.dbeaver.model.DBPObject;
