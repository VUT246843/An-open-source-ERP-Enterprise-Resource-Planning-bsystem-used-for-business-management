import org.jkiss.dbeaver.model.DBPDataSourceContainer;


        return implType.createInstance(DBGConfigurationPanel.class);
    }
    }

    {
        this.description = config.getAttribute(RegistryConstants.ATTR_DESCRIPTION);
        IConfigurationElement config)

        for (IConfigurationElement dsElement : dsElements) {

import org.eclipse.core.runtime.IConfigurationElement;
 *     http://www.apache.org/licenses/LICENSE-2.0
}
        return name;
 * distributed under the License is distributed on an "AS IS" BASIS,
        return id;
    @NotNull
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.debug.ui.configurationPanels"; //$NON-NLS-1$
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.registry.RegistryConstants;
    public DebugConfigurationPanelDescriptor(
    public String getDescription()
    public DBGConfigurationPanel createPanel() throws DBException {
    private final ObjectType implType;
            String dsId = dsElement.getAttribute(RegistryConstants.ATTR_ID);
    }
        IConfigurationElement[] dsElements = config.getChildren(RegistryConstants.TAG_DATASOURCE);

        this.name = config.getAttribute(RegistryConstants.ATTR_NAME);
    private final String id;

 *
    }
    private List<String> supportedDataSources = new ArrayList<>();
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.debug.ui.DBGConfigurationPanel;
import org.jkiss.code.NotNull;
    public String toString() {
import java.util.List;

    }
            String dsClassName = dsElement.getAttribute(RegistryConstants.ATTR_CLASS);
        return !CommonUtils.isEmpty(implType.getImplName());
    }
/*
        return id;
import org.jkiss.dbeaver.DBException;
 * DBeaver - Universal Database Manager
 * limitations under the License.
/**


 * Unless required by applicable law or agreed to in writing, software
        return supportedDataSources.contains(dataSource.getDriver().getProviderId()) ||
 * DebugConfigurationPanelDescriptor
    public boolean isValid() {
 * You may obtain a copy of the License at

 * See the License for the specific language governing permissions and
        return description;
    }
import org.jkiss.dbeaver.model.impl.AbstractContextDescriptor;
            supportedDataSources.contains(dataSource.getDriver().getDriverClassName());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public String getName()
    private final String description;
 *
    private final String name;
public class DebugConfigurationPanelDescriptor extends AbstractContextDescriptor
    public boolean supportsDataSource(DBPDataSourceContainer dataSource) {
        this.implType = new ObjectType(config, RegistryConstants.ATTR_CLASS);

            supportedDataSources.add(dsId != null ? dsId : dsClassName);
    public String getId() {
    {
    @NotNull
    }

import org.jkiss.utils.CommonUtils;
 *
import java.util.ArrayList;
        }
 * you may not use this file except in compliance with the License.
 */
            if (dsId == null && dsClassName == null) {
 */
                continue;
        super(config);
    {
package org.jkiss.dbeaver.debug.ui.internal;
            }


    @Override
        this.id = config.getAttribute(RegistryConstants.ATTR_ID);
{
