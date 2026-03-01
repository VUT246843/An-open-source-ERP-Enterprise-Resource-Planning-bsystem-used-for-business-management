        this.supportsPanel = CommonUtils.getBoolean(config.getAttribute("supportsPanel"), true);
import org.jkiss.dbeaver.DBException;
        this.taskHandlerType = null;
 * DBeaver - Universal Database Manager
    }
public class TaskConfiguratorDescriptor extends AbstractContextDescriptor {
    TaskConfiguratorDescriptor(TaskTypeDescriptor type, IConfigurationElement config) {
import org.jkiss.dbeaver.registry.task.TaskTypeDescriptor;
    }
 */
        this.config = config;
        this.implType = new ObjectType(config, "class");
    private final ObjectType taskHandlerType;

        return type;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2024 DBeaver Corp and others

import org.jkiss.code.NotNull;
    }
    @NotNull
 *
        return config.getAttribute(RegistryConstants.ATTR_ID);

    @NotNull
}
        this.type = null;
        this.type = type;
    private final TaskTypeDescriptor type;
    }
/**
    public String getId() {
        this.supportsPanel = CommonUtils.getBoolean(config.getAttribute("supportsPanel"), true);

    public TaskTypeDescriptor getType() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        super(config);
 * distributed under the License is distributed on an "AS IS" BASIS,

    public DBTTaskConfigurator createConfigurator() throws DBException {
 * TaskTypeDescriptor
    @NotNull
import org.jkiss.utils.CommonUtils;
import org.eclipse.core.runtime.IConfigurationElement;

    private final ObjectType implType;
    @NotNull

 * you may not use this file except in compliance with the License.
    }
 * See the License for the specific language governing permissions and
        super(config);
        this.taskHandlerType = new ObjectType(config, "handler");
/*
 * You may obtain a copy of the License at

 *


 *
    public boolean supportsPanel() {
import org.jkiss.dbeaver.tasks.ui.DBTTaskConfigurator;
    }
    }
    private final IConfigurationElement config;
        return config.getAttribute(RegistryConstants.ATTR_NAME);
        this.config = config;
 * Unless required by applicable law or agreed to in writing, software
        this.implType = new ObjectType(config, "class");
    public ObjectType getTaskHandlerType() {
 * limitations under the License.
    TaskConfiguratorDescriptor(IConfigurationElement config) {
package org.jkiss.dbeaver.tasks.ui.registry;
import org.jkiss.dbeaver.model.impl.AbstractContextDescriptor;
        return implType.getImplName();
 * Licensed under the Apache License, Version 2.0 (the "License");
        return implType.createInstance(DBTTaskConfigurator.class);
    private final boolean supportsPanel;
 */
    @Override
    }

    }

import org.jkiss.dbeaver.registry.RegistryConstants;
        return taskHandlerType;
    public String toString() {
        return supportsPanel;
    public String getName() {
