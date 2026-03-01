package org.jkiss.dbeaver.registry;
 *
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
    public String getName()
public class ExternalResourceDescriptor extends AbstractDescriptor
    {
/**
    }
import org.jkiss.dbeaver.Log;
    {
 * limitations under the License.
    }
 *
 *
    public ExternalResourceDescriptor(IConfigurationElement config)
        return alias;
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
 * distributed under the License is distributed on an "AS IS" BASIS,
    public URL getURL()

    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.alias = config.getAttribute(RegistryConstants.ATTR_ALIAS);

{

import org.eclipse.core.runtime.IConfigurationElement;
 * ExternalResourceDescriptor
}        this.name = config.getAttribute(RegistryConstants.ATTR_NAME);

    private final String name;

        return getContributorBundle().getEntry(name);
    private static final Log log = Log.getLog(ExternalResourceDescriptor.class);

 */

 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.resources"; //$NON-NLS-1$
    public String getAlias() {
 * Unless required by applicable law or agreed to in writing, software

 */
        return name;
    }
import java.net.URL;
    {

 * Licensed under the Apache License, Version 2.0 (the "License");
    private final String alias;

        super(config);
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * See the License for the specific language governing permissions and
