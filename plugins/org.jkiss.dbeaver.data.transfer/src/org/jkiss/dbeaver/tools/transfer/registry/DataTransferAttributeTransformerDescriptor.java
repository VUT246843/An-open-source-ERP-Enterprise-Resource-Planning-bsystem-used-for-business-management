        return description;
        for (IConfigurationElement prop : config.getChildren(PropertyDescriptor.TAG_PROPERTY_GROUP)) {
    public IDataTransferAttributeTransformer createTransformer() throws DBException {
    public String getName() {
    @NotNull
 * Unless required by applicable law or agreed to in writing, software
        return id;
/**
        }
    }
 * limitations under the License.
import org.eclipse.core.runtime.IConfigurationElement;
import org.jkiss.code.Nullable;
    @NotNull
package org.jkiss.dbeaver.tools.transfer.registry;
 * you may not use this file except in compliance with the License.

    private final String id;
 * DataTransferAttributeTransformerDescriptor
 * Copyright (C) 2010-2025 DBeaver Corp and others
    private final String name;
import org.jkiss.dbeaver.model.impl.PropertyDescriptor;
    private final DBPImage icon;
 * distributed under the License is distributed on an "AS IS" BASIS,
    public DBPImage getIcon() {
 */

import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
    @NotNull
    @Override

            return implType.getImplClass(IDataTransferAttributeTransformer.class)
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
public class DataTransferAttributeTransformerDescriptor extends AbstractDescriptor {
        return icon;
    }
        super(config);
import org.jkiss.dbeaver.model.DBIcon;
    @NotNull

    private final ObjectType implType;

        } catch (Throwable e) {
        }

    }
import java.util.List;
    public DataTransferAttributeTransformerDescriptor(IConfigurationElement config) {
        this.name = config.getAttribute("label");
        try {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.DBPImage;
        this.implType = new ObjectType(config.getAttribute("class"));
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return name;
    private final String description;
        return properties;
    public String getDescription() {


}
    public List<DBPPropertyDescriptor> getProperties() {
 *
        this.icon = iconToImage(config.getAttribute("icon"), DBIcon.TYPE_UNKNOWN);
        this.id = config.getAttribute("id");
        this.description = config.getAttribute("description");
    }
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
            properties.addAll(PropertyDescriptor.extractProperties(prop));
    @NotNull
    private final List<DBPPropertyDescriptor> properties = new ArrayList<>();
 * See the License for the specific language governing permissions and
    @NotNull
    @Nullable
    public String toString() {
            throw new DBException("Can't create attribute transformer instance", e);
 *

    }
        return id;
 * DBeaver - Universal Database Manager

/*



                .getDeclaredConstructor().newInstance();
    }
import org.jkiss.dbeaver.DBException;
    public String getId() {
 * You may obtain a copy of the License at
    }

 *
import java.util.ArrayList;
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.tools.transfer.IDataTransferAttributeTransformer;
 */
