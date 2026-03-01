    }
 * you may not use this file except in compliance with the License.
 */

    public SQLModelActivator()
        super.stop(context);
     * The constructor
/**
    public static SQLModelActivator getInstance()
 * See the License for the specific language governing permissions and
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
    // The shared instance
     */
 *

 * limitations under the License.
    public void stop(BundleContext context)
 * Unless required by applicable law or agreed to in writing, software
    {
        //context.registerService(SQLDialectMetadataRegistry.class, SQLDialectRegistry.getInstance(), null);
        throws Exception
    /**
    private BundlePreferenceStore preferences;
 * Licensed under the Apache License, Version 2.0 (the "License");
        throws Exception
    public void start(BundleContext context)
        preferences = new BundlePreferenceStore(getBundle());
        super.start(context);

        instance = null;

import org.osgi.framework.BundleContext;

import org.jkiss.dbeaver.model.impl.preferences.BundlePreferenceStore;
 */
    }
package org.jkiss.dbeaver.model.sql.internal;
        return instance;
 * The activator class controls the plug-in life cycle
}

 * DBeaver - Universal Database Manager
public class SQLModelActivator extends Plugin
import org.eclipse.core.runtime.Plugin;
{

 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2024 DBeaver Corp and others
    {

    private static SQLModelActivator instance;
    }

 *
 *

    {
    {
/*
    }
        instance = this;
 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
