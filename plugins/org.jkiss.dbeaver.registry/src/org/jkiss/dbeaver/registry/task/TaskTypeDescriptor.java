    public String getDescription() {
        return CommonUtils.toBoolean(config.getAttribute("supportsVariables"));
        for (AbstractDescriptor.ObjectType ot : getObjectTypes()) {
        this.properties = PropertyDescriptor.extractPropertyGroups(config);
    public boolean supportsVariables() {
        return CommonUtils.getBoolean(config.getAttribute("supportsDistributedMode"), true);
        if (matchesEntityElements == null) {
 * distributed under the License is distributed on an "AS IS" BASIS,

 *

            if (aClass != null) {
import org.jkiss.code.Nullable;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override


        return object instanceof DBPObject && appliesTo((DBPObject) object);
    }
    @NotNull
    }

    public String getId() {
        this.handlerImplType = new AbstractDescriptor.ObjectType(config, "handler");
    private final AbstractDescriptor.ObjectType handlerImplType;
    }

        return category;
    @Override
    private final DBPPropertyDescriptor[] properties;
    public DBTTaskCategory getCategory() {

import org.jkiss.dbeaver.model.task.DBTTaskCategory;


 * Licensed under the Apache License, Version 2.0 (the "License");
        return CommonUtils.nullIfEmpty(config.getAttribute(RegistryConstants.ATTR_CONFIRMATION_MESSAGE));
    TaskTypeDescriptor(TaskCategoryDescriptor category, IConfigurationElement config) {
    }
    @Override
    @Override
    }

    public synchronized boolean matchesEntityElements() {
    @Override
    @NotNull
        }
import org.jkiss.dbeaver.model.DBPObject;
                break;
    }
     * Defines if task execution is prohibited if disable export policy turned on
    }

import org.jkiss.dbeaver.model.task.DBTTaskHandler;
import org.jkiss.dbeaver.model.DBPImage;
        for (AbstractDescriptor.ObjectType objectType : getObjectTypes()) {
    @Override

package org.jkiss.dbeaver.registry.task;
    private Boolean matchesEntityElements;
    }
    public Class<?>[] getInputTypes() {
            }
        this.category.addTask(this);
            Class<?> aClass = objectType.getObjectClass();
    @NotNull
/**
        return this.properties;
    public DBPImage getIcon() {

 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
    }
import java.util.ArrayList;
    public String getLocalizedName(@NotNull String locale) {
                objClasses.add(aClass);
    public String getName() {
import java.util.List;
 */
    public boolean supportsDistributedMode() {
            }

    public boolean isObjectApplicable(Object object) {
    }
    private final IConfigurationElement config;
    /**
    public Class<? extends DBTTaskHandler> getHandlerClass() {
    }
    @NotNull
        return CommonUtils.getBoolean(config.getAttribute(RegistryConstants.ATTR_REQUIRES_MUTABILITY), false);
    @Override
                matchesEntityElements = true;
    public String confirmationMessageIfNeeded() {
    public boolean requiresMutableDatabase() {
            return matchesEntityElements;
 * You may obtain a copy of the License at
    }
        return config.getAttribute(RegistryConstants.ATTR_DESCRIPTION);
        }
        return config.getAttribute(RegistryConstants.ATTR_LABEL, locale);
    @Override

 */
 *

        return config.getAttribute(RegistryConstants.ATTR_ID);
 * DBeaver - Universal Database Manager
    public DBPPropertyDescriptor[] getConfigurationProperties() {
        return handlerImplType.getObjectClass(DBTTaskHandler.class);
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;

        return matchesEntityElements;
        return CommonUtils.getBoolean(config.getAttribute(RegistryConstants.ATTR_REQUIRES_EXPORT_PRIVILEGES), false);
        return objClasses.toArray(new Class[0]);
    @Override
        return handlerImplType.createInstance(DBTTaskHandler.class);

            if (ot.matchesType(DBSEntityElement.class)) {
     */
import org.jkiss.dbeaver.model.DBPNamedObjectLocalized;
import org.jkiss.dbeaver.registry.RegistryConstants;
    }
    public boolean requiresExportPrivileges() {
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
    }

    }
import org.jkiss.utils.CommonUtils;
        this.category = category;
     */
    }
public class TaskTypeDescriptor extends DataSourceBindingDescriptor implements DBTTaskType, DBPNamedObjectLocalized {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
import org.jkiss.dbeaver.registry.DataSourceBindingDescriptor;
 * limitations under the License.
     * Defines if task execution is prohibited for readonly connections

        if (matchesEntityElements != null) {
    @Override
    @NotNull
        return getId();
    public String toString() {
        }
        this.config = config;
    @Override
    @Override
            matchesEntityElements = false;
        super(config);

    @Override
        return config.getAttribute(RegistryConstants.ATTR_NAME);

        }
import org.jkiss.dbeaver.DBException;
    public DBTTaskHandler createHandler() throws DBException {
    private final TaskCategoryDescriptor category;
    /**


import org.eclipse.core.runtime.IConfigurationElement;
import org.jkiss.dbeaver.model.impl.PropertyDescriptor;
}
    }
 * See the License for the specific language governing permissions and
/*
    @Nullable

    @Override
        return CommonUtils.getBoolean(config.getAttribute(RegistryConstants.ATTR_STANDALONE));
    @Override
    @NotNull
 * Unless required by applicable law or agreed to in writing, software
        return iconToImage(config.getAttribute(RegistryConstants.ATTR_ICON));
    public boolean isStandalone() {
    @NotNull
    }
import org.jkiss.dbeaver.model.task.DBTTaskType;
import org.jkiss.dbeaver.model.struct.DBSEntityElement;

    }
        List<Class<?>> objClasses = new ArrayList<>();
 * TaskTypeDescriptor
 *
 * you may not use this file except in compliance with the License.

