    private final String id;

/**

        return id;
        this.id = config.getAttribute("id");
    public String getDescription() {
        return implClass.createInstance(type);
        return label;
    }

        this.icon = iconToImage(config.getAttribute("icon"));
        return description;
 * SQLTargetConverterDescriptor

/*
import org.jkiss.dbeaver.model.DBPImage;
 * You may obtain a copy of the License at

    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
    }
import org.jkiss.dbeaver.model.impl.AbstractContextDescriptor;
        this.properties.addAll(PropertyDescriptor.extractProperties(config));
    SQLTargetConverterDescriptor(IConfigurationElement config) {
        this.implClass = new ObjectType(config.getAttribute("class"));
    private final String description;
    }
import java.util.List;
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
    private final DBPImage icon;
    }
import org.eclipse.core.runtime.IConfigurationElement;
import java.util.ArrayList;
 */
        super(config);
 *
    }
    public String getId() {
    private List<DBPPropertyDescriptor> properties = new ArrayList<>();
        this.description = config.getAttribute("description");
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.impl.PropertyDescriptor;

    private final ObjectType implClass;
    }

 *

        return properties;
 *
 */
 * DBeaver - Universal Database Manager
    public String getLabel() {
        return id;

    }

package org.jkiss.dbeaver.ui.editors.sql.registry;
 * distributed under the License is distributed on an "AS IS" BASIS,
    private final String label;
    public DBPImage getIcon() {
        this.label = config.getAttribute("label");
 * See the License for the specific language governing permissions and
}
        return icon;
 *     http://www.apache.org/licenses/LICENSE-2.0


    public List<DBPPropertyDescriptor> getProperties() {
    public String toString() {
 * you may not use this file except in compliance with the License.

import org.jkiss.dbeaver.DBException;


import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
    public <T> T createInstance(Class<T> type) throws DBException {
public class SQLTargetConverterDescriptor extends AbstractContextDescriptor {
