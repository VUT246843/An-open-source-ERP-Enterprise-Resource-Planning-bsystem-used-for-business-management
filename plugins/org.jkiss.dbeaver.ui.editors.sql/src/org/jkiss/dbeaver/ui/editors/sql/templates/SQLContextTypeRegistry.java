                    }
            if (!provider.isDriversManageable()) {
import org.eclipse.jface.text.templates.ContextTypeRegistry;
import org.jkiss.dbeaver.model.connection.DBPDriver;
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
/**
        }

	public SQLContextTypeRegistry() {
import org.jkiss.utils.CommonUtils;

/*
                }

import java.util.Set;
 * limitations under the License.
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 *

                            continue;
                SQLContextTypeProvider contextType = new SQLContextTypeProvider(provider);
 * See the License for the specific language governing permissions and
                    if (!CommonUtils.isEmpty(driver.getCategory())) {
                for (DBPDriver driver : provider.getDrivers()) {
 * SQLContextTypeRegistry
 *
 *
 * Unless required by applicable law or agreed to in writing, software

 */

                Set<String> categoriesAdded = new HashSet<>();
 */
                        continue;
        addContextType(new SQLContextTypeBase());
                    if (driver.getReplacedBy() != null) {
    private void loadContextTypes()
                //provider.loadTemplateVariableResolvers(contextType);
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
    }
    {
}
        for (DBPDataSourceProviderDescriptor provider : DBWorkbench.getPlatform().getDataSourceProviderRegistry().getDataSourceProviders()) {
        loadContextTypes();
                    SQLContextTypeDriver contextType = new SQLContextTypeDriver(driver);

            }
                addContextType(contextType);
package org.jkiss.dbeaver.ui.editors.sql.templates;
                        categoriesAdded.add(driver.getCategory());

 * You may obtain a copy of the License at
            } else {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        if (categoriesAdded.contains(driver.getCategory())) {
import java.util.HashSet;
                        }
                    //provider.loadTemplateVariableResolvers(contextType);
import org.jkiss.dbeaver.model.connection.DBPDataSourceProviderDescriptor;
                    }
                    addContextType(contextType);
import org.jkiss.dbeaver.runtime.DBWorkbench;
public class SQLContextTypeRegistry extends ContextTypeRegistry {
