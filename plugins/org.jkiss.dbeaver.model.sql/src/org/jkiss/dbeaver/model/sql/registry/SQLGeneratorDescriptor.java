 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public ObjectType getGeneratorImplClass() {
        return order;
    public String getLabel() {
    {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
        this.generatorImplClass = new ObjectType(config.getAttribute("class"));
    public <T> SQLGenerator<T> createGenerator(List<T> objects)
    public int getOrder() {
        throws DBException
        return multiObject;

        return instance;
    private final String label;
        return id;
public class SQLGeneratorDescriptor extends AbstractContextDescriptor {
        this.multiObject = CommonUtils.toBoolean(config.getAttribute("multiObject"));
    public String toString() {
        super(config);
        return id;
import org.jkiss.dbeaver.model.impl.AbstractContextDescriptor;

 * limitations under the License.

 * SQLFormatterDescriptor
/**

 */

    public String getDescription() {
import org.jkiss.dbeaver.model.sql.generator.SQLGenerator;
import org.jkiss.dbeaver.DBException;

 * DBeaver - Universal Database Manager

    public boolean isMultiObject() {
    private final String description;
    }
    }
        this.id = config.getAttribute("id");

        this.label = config.getAttribute("label");
package org.jkiss.dbeaver.model.sql.registry;

        instance.initGenerator(objects);
    }
 * Unless required by applicable law or agreed to in writing, software
}
 */

    }
        return description;
        this.description = config.getAttribute("description");
    }
import java.util.List;
 * Licensed under the Apache License, Version 2.0 (the "License");
    private final String id;
    private final boolean multiObject;
        return label;
        this.order = CommonUtils.toInt(config.getAttribute("order"));
 *
import org.eclipse.core.runtime.IConfigurationElement;
    }
    }
 *     http://www.apache.org/licenses/LICENSE-2.0

        SQLGenerator<T> instance = generatorImplClass.createInstance(SQLGenerator.class);
 * See the License for the specific language governing permissions and

import org.jkiss.utils.CommonUtils;
        @SuppressWarnings("unchecked")

/*
    @NotNull

    public static final String EXTENSION_ID = "org.jkiss.dbeaver.sqlGenerator"; //$NON-NLS-1$

import org.jkiss.code.NotNull;
    @Override
    }
        return generatorImplClass;
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
    public String getId() {
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    SQLGeneratorDescriptor(IConfigurationElement config) {
    private final ObjectType generatorImplClass;
    private final int order;
