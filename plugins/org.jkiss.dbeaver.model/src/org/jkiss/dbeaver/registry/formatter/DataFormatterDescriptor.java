        } catch (Exception e) {
        }

    public String getId()

    private final String name;

 */
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
            return null;
public class DataFormatterDescriptor extends AbstractDescriptor

    @NotNull

 *
    @NotNull
    }
    public String getDescription()
}

package org.jkiss.dbeaver.registry.formatter;
    private final String id;
 */
    }
    public DBPPropertyDescriptor[] getProperties() {
    private static final Log log = Log.getLog(DataFormatterDescriptor.class);
 * DBeaver - Universal Database Manager
        Class<? extends DBDDataFormatter> clazz = formatterType.getObjectClass(DBDDataFormatter.class);
 *
        if (clazz == null) {
    public String getName()

 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
        return id;
 *
    @NotNull
        this.id = config.getAttribute("id");
            Class<?> objectClass = getImplClass(config.getAttribute("sampleClass"));
    @Nullable
 * limitations under the License.
        try {
        return properties;
    public DataFormatterDescriptor(@NotNull IConfigurationElement config) {
import org.jkiss.dbeaver.model.impl.PropertyDescriptor;

    private final String description;
    @NotNull

        this.name = config.getAttribute("label");

            sample = (DBDDataFormatterSample) objectClass.getDeclaredConstructor().newInstance();
    public DBDDataFormatterSample getSample()
    private final ObjectType formatterType;
        return clazz.getConstructor().newInstance();
    }
    }
        return sample;
    private DBDDataFormatterSample sample;
/**
        }
    {
        this.formatterType = new ObjectType(config.getAttribute("class"));
import org.jkiss.dbeaver.Log;
    public DBDDataFormatter createFormatter() throws ReflectiveOperationException
        super(config);
        this.properties = PropertyDescriptor.extractPropertyGroups(config);
import org.eclipse.core.runtime.IConfigurationElement;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.data.DBDDataFormatter;

        return name;
    }

 * You may obtain a copy of the License at
            log.error("Can't instantiate data formatter '" + getId() + "' sample");
{


    {
/*
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.data.DBDDataFormatterSample;
        return description;
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        this.description = config.getAttribute("description");
    {
    {
import org.jkiss.code.Nullable;
 * distributed under the License is distributed on an "AS IS" BASIS,
    {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DataFormatterDescriptor
 * Unless required by applicable law or agreed to in writing, software
    }

    private final DBPPropertyDescriptor[] properties;
import org.jkiss.code.NotNull;
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.dataFormatter"; //$NON-NLS-1$
