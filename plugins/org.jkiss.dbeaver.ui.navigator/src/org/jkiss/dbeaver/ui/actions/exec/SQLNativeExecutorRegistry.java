            instance = new SQLNativeExecutorRegistry();
    private static final String TAG_EXECUTOR = "executor"; //$NON-NLS-1$

    public SQLNativeExecutorDescriptor getExecutorDescriptor(@NotNull DBPDataSourceContainer container) {
}
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * See the License for the specific language governing permissions and
        return instance;
        }

        return new ArrayList<>(executors);
    private final List<SQLNativeExecutorDescriptor> executors = new ArrayList<>();

    /**
    /**
    @NotNull
            instance.loadExtensions(Platform.getExtensionRegistry());
import java.util.List;
    private void loadExtensions(@NotNull IExtensionRegistry registry) {
        for (DBPDataSourceProviderDescriptor pd = provider; pd != null; pd = pd.getParentProvider()) {
            }
package org.jkiss.dbeaver.ui.actions.exec;

import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IConfigurationElement;
            }
    }
                if (executor.getDataSourceId().equals(pd.getId())) {
    private SQLNativeExecutorRegistry() {
import org.jkiss.code.Nullable;

    public static final String EXTENSION_ID = "org.jkiss.dbeaver.sql.executors"; //NON-NLS-1
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.ArrayList;
    @Nullable
    }
import org.jkiss.code.NotNull;
 * limitations under the License.
    }
                }


 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.connection.DBPDataSourceProviderDescriptor;
        IConfigurationElement[] extElements = registry.getConfigurationElementsFor(EXTENSION_ID);
                    return executor;
public class SQLNativeExecutorRegistry {
    public List<SQLNativeExecutorDescriptor> getExecutors() {
    public static synchronized SQLNativeExecutorRegistry getInstance() {

                this.executors.add(new SQLNativeExecutorDescriptor(viewElement));
 * DBeaver - Universal Database Manager
            for (SQLNativeExecutorDescriptor executor : executors) {
/*
 */
    private static SQLNativeExecutorRegistry instance;
     * Returns the first possible supported executor for datasource
import org.eclipse.core.runtime.Platform;
 * You may obtain a copy of the License at
        DBPDataSourceProviderDescriptor provider = container.getDriver().getProviderDescriptor();
 *
        }
            if (viewElement.getName().equals(TAG_EXECUTOR)) {

    }
 *
        }

     * Get registry instance
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (instance == null) {
 * you may not use this file except in compliance with the License.
     */
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        return null;
 *
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
        for (IConfigurationElement viewElement : extElements) {
     */

        // prevents instantiation
