    }
public abstract class LocalizedPropertyDescriptor extends PropertyDescriptor implements DBPNamedObjectLocalized, DBPObjectWithDescriptionLocalized {
        try {

        } catch (Exception e) {
        this.config = config;

}
        try {
            return config.getAttribute(ATTR_LABEL, locale);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
import org.jkiss.dbeaver.model.DBPObjectWithDescriptionLocalized;
            return this.getDescription();
import org.jkiss.dbeaver.model.DBPNamedObjectLocalized;
    public String getLocalizedDescription(@NotNull String locale) {
package org.jkiss.dbeaver.model.impl;
        super(category, config);
 * you may not use this file except in compliance with the License.
        }
 * Unless required by applicable law or agreed to in writing, software
    }
    @Override
    public LocalizedPropertyDescriptor(String category, IConfigurationElement config) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
/*
            return config.getAttribute(ATTR_DESCRIPTION, locale);
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    private transient final IConfigurationElement config;
import org.jkiss.code.NotNull;
        } catch (Exception e) {
 */
    @Nullable
    public String getLocalizedName(@NotNull String locale) {

            return this.getName();

 * You may obtain a copy of the License at
 * limitations under the License.
 * DBeaver - Universal Database Manager
import org.eclipse.core.runtime.IConfigurationElement;
 * distributed under the License is distributed on an "AS IS" BASIS,
 *

 *
        }

import org.jkiss.code.Nullable;
 * See the License for the specific language governing permissions and
