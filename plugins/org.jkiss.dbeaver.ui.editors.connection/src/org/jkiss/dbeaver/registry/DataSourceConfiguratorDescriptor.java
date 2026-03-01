            if (parentId.equals(page.getParentId()) && page.appliesTo(dataSource)) {
        return pages;
import java.util.List;
    private final String id;
 * Licensed under the Apache License, Version 2.0 (the "License");
        return id;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.ui.dataSourceConfigurator"; //$NON-NLS-1$
            pages.add(new DataSourcePageDescriptor(pageCfg));
    public List<DataSourcePageDescriptor> getChildPages(DBPDataSourceContainer dataSource, String parentId) {
 * DBeaver - Universal Database Manager
            }

    public DataSourceConfiguratorDescriptor(IConfigurationElement config) {
        List<DataSourcePageDescriptor> children = new ArrayList<>();
        return children;
        }
        return id;
 *
 *     http://www.apache.org/licenses/LICENSE-2.0

 * See the License for the specific language governing permissions and

 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
        List<DataSourcePageDescriptor> roots = new ArrayList<>();
        }
}
    public String getId() {
import java.util.ArrayList;
        for (DataSourcePageDescriptor page : pages) {
        }
    }
                children.add(page);
    }

package org.jkiss.dbeaver.registry;
public class DataSourceConfiguratorDescriptor extends AbstractDescriptor {
 */
        return true;


import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        return roots;
    public String toString() {

/*
 * Copyright (C) 2010-2024 DBeaver Corp and others

    }
    public List<DataSourcePageDescriptor> getAllPages() {
    @Override
    private final List<DataSourcePageDescriptor> pages = new ArrayList<>();
/**
        this.id = config.getAttribute(RegistryConstants.ATTR_ID);
import org.jkiss.utils.CommonUtils;
 * DataSourceViewDescriptor
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
 *
    public List<DataSourcePageDescriptor> getRootPages(DBPDataSourceContainer dataSource) {


    }
    }
        super(config.getContributor().getName());

        for (IConfigurationElement pageCfg : config.getChildren("dataSourcePage")) {
import org.eclipse.core.runtime.IConfigurationElement;
        for (DataSourcePageDescriptor page : pages) {
 */

            if (CommonUtils.isEmpty(page.getParentId()) && page.appliesTo(dataSource)) {
    public boolean appliesTo(DBPDataSourceContainer dataSourceContainer) {
    }
 *
                roots.add(page);
 * limitations under the License.
