        this.id = config.getAttribute(RegistryConstants.ATTR_ID);
    private final String description;
import org.eclipse.jface.preference.IPreferencePage;
/**

    }
    }
    public DataSourcePageDescriptor(IConfigurationElement config) {
        return isExpressionTrue(enablementExpression, dataSource);
    }
    @Override
    public String getParentId() {
    }
        try {
            return pageClass.createInstance(IPreferencePage.class);
        return pageClass;
    public String getAfterPageId() {
    }
    public IPreferencePage createPage() {
    private final String afterPageId;
import org.eclipse.core.runtime.IConfigurationElement;
 * You may obtain a copy of the License at
public class DataSourcePageDescriptor extends AbstractDescriptor {
import org.jkiss.dbeaver.Log;
    public String toString() {
/*

 * you may not use this file except in compliance with the License.
        this.title = config.getAttribute("title");
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
 */
 * See the License for the specific language governing permissions and
        return parentId;
 *
    private final String id;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;

            throw new IllegalStateException("Can't create preferences page '" + id + "'", ex);
 *

    public String getId() {
    private Expression enablementExpression;

        this.afterPageId = config.getAttribute("after");
package org.jkiss.dbeaver.registry;
    }
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
    private final ObjectType pageClass;
import org.eclipse.core.expressions.Expression;
    public ObjectType getPageClass() {
        return description;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2024 DBeaver Corp and others
        this.enablementExpression = getEnablementExpression(config);


    public String getTitle() {
 *
}
 * limitations under the License.
        this.pageClass = new ObjectType(config.getAttribute(RegistryConstants.ATTR_CLASS));
        return id;

    }
    }
    public boolean appliesTo(DBPDataSourceContainer dataSource) {
        super(config.getContributor().getName());

 * distributed under the License is distributed on an "AS IS" BASIS,
        return id;

        this.parentId = config.getAttribute(RegistryConstants.ATTR_PARENT);
        return afterPageId;

    }
    }
    private final String parentId;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private final String title;
 * Licensed under the Apache License, Version 2.0 (the "License");
    public String getDescription() {
        return title == null ? id : title;
 */

 * DataSourcePageDescriptor
        } catch (Throwable ex) {
        this.description = config.getAttribute("description");


    private static final Log log = Log.getLog(DataSourcePageDescriptor.class);
        }
