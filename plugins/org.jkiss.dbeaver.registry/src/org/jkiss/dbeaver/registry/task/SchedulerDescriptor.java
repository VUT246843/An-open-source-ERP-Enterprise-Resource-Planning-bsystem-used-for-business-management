import org.jkiss.dbeaver.model.impl.AbstractContextDescriptor;

public class SchedulerDescriptor extends AbstractContextDescriptor implements DBTSchedulerDescriptor {
        super(config);
        this.name = config.getAttribute(RegistryConstants.ATTR_NAME);
    @NotNull
        if (instance == null) {
        this.description = config.getAttribute(RegistryConstants.ATTR_NAME);
import java.util.List;
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.enablementExpression = getEnablementExpression(config);
 */
    private final ObjectType implType;
    public List<DBPPropertyDescriptor> getProperties() {
import org.jkiss.dbeaver.model.task.DBTSchedulerDescriptor;
    }

 * You may obtain a copy of the License at
    }
import org.jkiss.dbeaver.registry.RegistryConstants;
 * you may not use this file except in compliance with the License.
 *
    }
}
package org.jkiss.dbeaver.registry.task;
    public boolean isEnabled() {
    private final String description;

        }

 * TaskTypeDescriptor
import org.jkiss.dbeaver.model.task.DBTScheduler;
        return isExpressionTrue(enablementExpression, this);
    @Override
    private DBTScheduler instance;
import org.jkiss.dbeaver.model.impl.PropertyDescriptor;

    public String getName() {
    }
        return getName();
import org.eclipse.core.runtime.IConfigurationElement;
    }
    public synchronized DBTScheduler getInstance() throws DBException {


        return description;
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
        return instance;
            instance = implType.createInstance(DBTScheduler.class);
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
    private final String name;
 * See the License for the specific language governing permissions and
    public String toString() {
    }
        this.properties = Arrays.stream(config.getChildren(PropertyDescriptor.TAG_PROPERTY_GROUP))

        this.implType = new ObjectType(config, "class");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            .flatMap(List::stream)

import org.eclipse.core.expressions.Expression;
            .toList();

 *
/*
    @Override
    private final List<DBPPropertyDescriptor> properties;
        return properties;
import java.util.Arrays;
    @Override
 *
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
        return name;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
/**
    SchedulerDescriptor(IConfigurationElement config) {
    private final Expression enablementExpression;
    }
 */
import org.jkiss.code.NotNull;

import org.jkiss.dbeaver.DBException;

            .map(PropertyDescriptor::extractProperties)
    public String getDescription() {
