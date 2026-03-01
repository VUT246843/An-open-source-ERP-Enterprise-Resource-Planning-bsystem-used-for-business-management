
    @NotNull
    public String toString() {
        return config.getAttribute(RegistryConstants.ATTR_LABEL);
    }
    public String getCode() {
    public String getDescription() {
 * See the License for the specific language governing permissions and

    }
    @Override
    @Override

 */
    }
 *
    @Override

package org.jkiss.dbeaver.registry.language;

 * Unless required by applicable law or agreed to in writing, software
    public String getLabel() {
/*

    @NotNull
public class PlatformLanguageDescriptor extends AbstractContextDescriptor implements DBPPlatformLanguage, DBPNamedObjectLocalized {
        return getCode();
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.app.DBPPlatformLanguage;
import org.jkiss.dbeaver.registry.RegistryConstants;
    }

    @NotNull
/**
        return config.getAttribute(RegistryConstants.ATTR_LABEL, locale);
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2025 DBeaver Corp and others

}
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.DBPNamedObjectLocalized;
        this.config = config;
    }
 *
        return config.getAttribute(RegistryConstants.ATTR_DESCRIPTION);
 * You may obtain a copy of the License at

    public String getLocalizedName(@NotNull String locale) {
    private final IConfigurationElement config;
    }
        super(config);
 * PlatformLanguageDescriptor
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
 * you may not use this file except in compliance with the License.
 */
        return getLabel();
import org.jkiss.dbeaver.model.impl.AbstractContextDescriptor;

    public PlatformLanguageDescriptor(IConfigurationElement config) {
    public String getName() {
 * limitations under the License.

    }
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.core.runtime.IConfigurationElement;
    @NotNull
    @Override
        return config.getAttribute(RegistryConstants.ATTR_CODE);

import org.jkiss.code.NotNull;
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.language"; //$NON-NLS-1$
