}
    }
 */
 * you may not use this file except in compliance with the License.
    }
import java.util.ArrayList;
    }

        }
        }
            instance = new DataSourceViewRegistry(Platform.getExtensionRegistry());
                this.views.add(
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
                if (view.getDataSources().contains(pd.getId()) && targetID.equals(view.getTargetID())) {
                if (view.getDataSources().contains(pd.getId()) && targetID.equals(view.getTargetID())) {
            } else {
    public List<DataSourcePageDescriptor> getRootDataSourcePages(DataSourceDescriptor dataSource) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
                this.configurators.add(

 * See the License for the specific language governing permissions and
        return sortPages(children);
        for (IConfigurationElement viewElement : registry.getConfigurationElementsFor(DataSourceViewDescriptor.EXTENSION_ID)) {
                }
        }
                    return view;
        if (instance == null) {
    }

                return -1;
                return 0;
    public List<DataSourceViewDescriptor> getViews(DBPDataSourceProviderDescriptor provider, String targetID) {
    public DataSourceViewDescriptor findView(DBPDataSourceProviderDescriptor provider, String targetID) {
        List<DataSourceConfiguratorDescriptor> result = new ArrayList<>();
import org.jkiss.dbeaver.model.connection.DBPDataSourceProviderDescriptor;

 * distributed under the License is distributed on an "AS IS" BASIS,
public class DataSourceViewRegistry {
    public synchronized static DataSourceViewRegistry getInstance() {
        return pages;
        }
    }
            if (configuratorDesc.appliesTo(dataSourceContainer)) {
            for (DataSourceViewDescriptor view : views) {
        return sortPages(roots);
 *

            }
    }
        for (DataSourceConfiguratorDescriptor configurator : getConfigurators(dataSource)) {
    public List<DataSourcePageDescriptor> getChildDataSourcePages(DBPDataSourceContainer dataSource, String parentId) {
import java.util.List;
    private static DataSourceViewRegistry instance = null;
            roots.addAll(configurator.getRootPages(dataSource));

 *     http://www.apache.org/licenses/LICENSE-2.0
    private final List<DataSourceConfiguratorDescriptor> configurators = new ArrayList<>();
            if (cfgElement.getName().equals("dataSourceConfigurator")) {
                result.add(configuratorDesc);
        return result;
import org.eclipse.core.runtime.IExtensionRegistry;
        }
        for (DBPDataSourceProviderDescriptor pd = provider; pd != null; pd = pd.getParentProvider()) {
    private List<DataSourcePageDescriptor> sortPages(List<DataSourcePageDescriptor> pages) {
 * limitations under the License.
        return instance;


        return result;

                    result.add(view);
import org.eclipse.core.runtime.Platform;
package org.jkiss.dbeaver.registry;
            if (viewElement.getName().equals(RegistryConstants.TAG_VIEW)) {

                }
/*
            }
 * You may obtain a copy of the License at
        for (IConfigurationElement cfgElement : registry.getConfigurationElementsFor(DataSourceConfiguratorDescriptor.EXTENSION_ID)) {


        }
    public List<DataSourceConfiguratorDescriptor> getConfigurators(DBPDataSourceContainer dataSourceContainer) {
            } else if (o2.getId().equals(o1.getAfterPageId())) {
            }

            }
    }
        for (DataSourceConfiguratorDescriptor configurator : getConfigurators(dataSource)) {
            children.addAll(configurator.getChildPages(dataSource, parentId));

        return null;
    private DataSourceViewRegistry(IExtensionRegistry registry) {
                return 1;
        for (DBPDataSourceProviderDescriptor pd = provider; pd != null; pd = pd.getParentProvider()) {
    private final List<DataSourceViewDescriptor> views = new ArrayList<>();
                    new DataSourceViewDescriptor(viewElement));
            }
 * DBeaver - Universal Database Manager
        for (DataSourceConfiguratorDescriptor configuratorDesc : configurators) {
        List<DataSourceViewDescriptor> result = new ArrayList<>();

import org.eclipse.core.runtime.IConfigurationElement;
        List<DataSourcePageDescriptor> children = new ArrayList<>();
        pages.sort((o1, o2) -> {
            }
            if (o1.getId().equals(o2.getAfterPageId())) {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        }
        });
            for (DataSourceViewDescriptor view : views) {
        List<DataSourcePageDescriptor> roots = new ArrayList<>();
 *
        }
                    new DataSourceConfiguratorDescriptor(cfgElement));
 * Licensed under the Apache License, Version 2.0 (the "License");
