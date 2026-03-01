    }
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.dataSourceView"; //$NON-NLS-1$
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
        this.icon = iconToImage(config.getAttribute(RegistryConstants.ATTR_ICON));
import org.eclipse.core.runtime.IConfigurationElement;
 * limitations under the License.

    private final DBPImage icon;
public class DataSourceViewDescriptor extends AbstractDescriptor {
        return id;

    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
    public String getId() {
 * See the License for the specific language governing permissions and

 */
    }
    private final List<String> dataSourceIds;

    public List<String> getDataSources() {
    public String getLabel() {
    private final String label;
import java.util.Arrays;
        }
        return label;
        try {
import java.util.List;
    public String getTargetID() {
package org.jkiss.dbeaver.registry;
    public DataSourceViewDescriptor(IConfigurationElement config) {
    public DBPImage getIcon() {
    private final ObjectType viewType;
            return viewType.createInstance(implementsClass);
    private final String id;
 *
/**
    private final String targetID;
        super(config.getContributor().getName());
    }
        return id;
        this.label = config.getAttribute(RegistryConstants.ATTR_LABEL);

 * Copyright (C) 2010-2024 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    }
            throw new IllegalStateException("Can't create view '" + viewType.getImplName() + "'", ex);


import org.jkiss.dbeaver.model.DBPImage;
    }
/*
        this.dataSourceIds = Arrays.asList(config.getAttribute(RegistryConstants.ATTR_DATA_SOURCE).split(","));
    }
        return targetID;
    public String toString() {

 *     http://www.apache.org/licenses/LICENSE-2.0
        this.id = config.getAttribute(RegistryConstants.ATTR_ID);

        return dataSourceIds;
        } catch (Throwable ex) {
    public <T> T createView(Class<T> implementsClass) {
 * DataSourceViewDescriptor

 *
 * Licensed under the Apache License, Version 2.0 (the "License");
        return icon;
 * you may not use this file except in compliance with the License.
 *
 * Unless required by applicable law or agreed to in writing, software

 * DBeaver - Universal Database Manager
 */

 * You may obtain a copy of the License at
}
        this.viewType = new ObjectType(config.getAttribute(RegistryConstants.ATTR_CLASS));
    }
        this.targetID = config.getAttribute(RegistryConstants.ATTR_TARGET_ID);
