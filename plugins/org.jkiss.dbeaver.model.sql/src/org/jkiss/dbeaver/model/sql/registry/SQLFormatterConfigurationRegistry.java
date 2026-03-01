            return null;
        for (SQLFormatterDescriptor formatter : formatters) {
import org.jkiss.code.Nullable;
    private final List<SQLFormatterDescriptor> formatters = new ArrayList<>();

    {
                return formatter;
    {
import org.jkiss.dbeaver.DBException;

            instance = new SQLFormatterConfigurationRegistry();
            if (TAG_FORMATTER.equals(ext.getName())) {
import org.eclipse.core.runtime.Platform;

            // Load formatters
            }

import org.eclipse.core.runtime.IConfigurationElement;
    }
    private static final String TAG_FORMATTER = "formatter"; //$NON-NLS-1$
    private SQLFormatterConfigurationRegistry()
    }
            return null;
    {
    public List<SQLFormatterDescriptor> getFormatters() {

 * you may not use this file except in compliance with the License.
            log.error("Error creating formatter", e);
    public void dispose()
        return null;
    public synchronized static SQLFormatterConfigurationRegistry getInstance()
 */

public class SQLFormatterConfigurationRegistry implements SQLFormatterRegistry
{
 *     http://www.apache.org/licenses/LICENSE-2.0
            log.error("Formatter '" + formatterId + "' not found");
    }
        return instance;
    private void loadExtensions(IExtensionRegistry registry)
                    new SQLFormatterDescriptor(ext));
    private static SQLFormatterConfigurationRegistry instance = null;
    {
 * Licensed under the Apache License, Version 2.0 (the "License");

    }
import java.util.ArrayList;
    @Override
        return new ArrayList<>(formatters);
import org.jkiss.dbeaver.model.sql.format.SQLFormatterConfiguration;
        formatters.clear();
            instance.loadExtensions(Platform.getExtensionRegistry());
    }

import org.jkiss.dbeaver.model.sql.format.SQLFormatter;
        if (formatterDesc == null) {

 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.model.sql.format.SQLFormatterRegistry;
import java.util.List;
        }
        } catch (DBException e) {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.Log;
 * You may obtain a copy of the License at

        }
    }
import org.eclipse.core.runtime.IExtensionRegistry;
            if (formatter.getId().equalsIgnoreCase(id)) {
 *
}
        try {
            return formatterDesc.createFormatter();
package org.jkiss.dbeaver.model.sql.registry;
        IConfigurationElement[] extConfigs = registry.getConfigurationElementsFor(SQLFormatterDescriptor.EXTENSION_ID);
 * Copyright (C) 2010-2024 DBeaver Corp and others
        if (instance == null) {
 * Unless required by applicable law or agreed to in writing, software
    @Nullable
                this.formatters.add(
            }
    public SQLFormatterDescriptor getFormatter(String id) {
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
    private static final Log log = Log.getLog(SQLFormatterConfigurationRegistry.class);
        final String formatterId = configuration.getFormatterId();

        SQLFormatterDescriptor formatterDesc = getFormatter(formatterId);
    public SQLFormatter createFormatter(SQLFormatterConfiguration configuration) {
/*
 *

        }
    }
        for (IConfigurationElement ext : extConfigs) {
        }
 * limitations under the License.
 *
 * See the License for the specific language governing permissions and
