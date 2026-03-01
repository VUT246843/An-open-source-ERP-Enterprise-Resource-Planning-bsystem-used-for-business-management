            return null;
import java.util.Collection;
            instance = new SQLGeneratorConfigurationRegistry();
 *
package org.jkiss.dbeaver.model.sql.registry;
    private SQLGeneratorConfigurationRegistry()
                if (object instanceof DBPObject && gen.appliesTo((DBPObject) object, context)) {
            }

    {
            return null;
            if (TAG_GENERATOR.equals(ext.getName())) {
 *
import org.jkiss.dbeaver.Log;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        result.sort(Comparator.comparingInt(SQLGeneratorDescriptor::getOrder));
    }
        SQLGeneratorDescriptor formatterDesc = getGenerator(formatterId);
 * you may not use this file except in compliance with the License.
            instance.loadExtensions(Platform.getExtensionRegistry());
        }
import org.jkiss.dbeaver.model.DBPObject;
        for (SQLGeneratorDescriptor gen : generators) {
    public List<SQLGeneratorDescriptor> getAllGenerators() {
    }
    }
                        continue;
    {
                    }
        IConfigurationElement[] extConfigs = registry.getConfigurationElementsFor(SQLGeneratorDescriptor.EXTENSION_ID);
        }
            }
                return desc;
 * Unless required by applicable law or agreed to in writing, software
import java.util.ArrayList;

 * distributed under the License is distributed on an "AS IS" BASIS,
                }
    {
 */
    }
    public <T> SQLGenerator<T> createGenerator(DBPDataSource dataSource, List<T> objectsd) {
    public synchronized static SQLGeneratorConfigurationRegistry getInstance()



import org.jkiss.dbeaver.model.DBPDataSource;
                    result.add(gen);
        return null;
        return new ArrayList<>(generators);
            for (Object object : objects) {
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
        if (formatterDesc == null) {
        }
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public SQLGeneratorDescriptor getGeneratorDescriptor(SQLGenerator<?> generator) {
        generators.clear();
    }
        if (instance == null) {


    }
                    if (gen.isMultiObject() && objects.size() < 2) {
        }
        } catch (DBException e) {
        return null;
        }
import org.jkiss.code.Nullable;
    public void dispose()
    public SQLGeneratorDescriptor getGenerator(String id) {
 *
    }
            }

        return result;
 *     http://www.apache.org/licenses/LICENSE-2.0
            return formatterDesc.createFormatter();
 * limitations under the License.
            log.error("Formatter '" + formatterId + "' not found");
import java.util.Comparator;
        return instance;

import org.eclipse.core.runtime.IConfigurationElement;
        return null;
        for (SQLGeneratorDescriptor generator : generators) {
/*
import org.eclipse.core.runtime.IExtensionRegistry;
/*

import org.jkiss.dbeaver.model.sql.generator.SQLGenerator;
            if (desc.getGeneratorImplClass().getObjectClass() == generator.getClass()) {
{
 * See the License for the specific language governing permissions and

public class SQLGeneratorConfigurationRegistry
            log.error("Error creating formatter", e);
import org.eclipse.core.runtime.Platform;
    private void loadExtensions(IExtensionRegistry registry)
                    break;
    }
        for (IConfigurationElement ext : extConfigs) {

        }
                return generator;
*/
        }
 * DBeaver - Universal Database Manager
        List<SQLGeneratorDescriptor> result = new ArrayList<>();
            // Load generators
                    new SQLGeneratorDescriptor(ext));
        try {
            if (generator.getId().equalsIgnoreCase(id)) {
    }


    @Nullable
import java.util.List;
    private static SQLGeneratorConfigurationRegistry instance = null;
        for (SQLGeneratorDescriptor desc : generators) {
}
    private static final Log log = Log.getLog(SQLGeneratorConfigurationRegistry.class);
    private final List<SQLGeneratorDescriptor> generators = new ArrayList<>();
    {
                this.generators.add(
    public List<SQLGeneratorDescriptor> getApplicableGenerators(Collection<?> objects, Object context) {
    private static final String TAG_GENERATOR = "generator"; //$NON-NLS-1$
