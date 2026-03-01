    public String getName() {
 *
                        instance = type.createInstance(DBPDriverSubstitution.class);
                    }
import org.jkiss.dbeaver.model.connection.DBPDriverSubstitution;
 * You may obtain a copy of the License at
    public String getProviderId() {
                if (instance == null) {
    private final String driverId;
                }
import org.jkiss.code.NotNull;
/*
        return name;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private final ObjectType type;
    }
 * Unless required by applicable law or agreed to in writing, software
        this.name = config.getAttribute(RegistryConstants.ATTR_NAME);
 *     http://www.apache.org/licenses/LICENSE-2.0

 * you may not use this file except in compliance with the License.
    public String getDriverId() {
package org.jkiss.dbeaver.registry;
    public DriverSubstitutionDescriptor(@NotNull IConfigurationElement config) {
    @Override
                    } catch (Throwable ex) {
    @NotNull
    @Override
    }

    @NotNull
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
 * limitations under the License.
    }


    public String getId() {
import org.jkiss.dbeaver.model.connection.DBPDriverSubstitutionDescriptor;
import org.eclipse.core.runtime.IConfigurationElement;
        this.providerId = config.getAttribute(RegistryConstants.ATTR_PROVIDER);

    @NotNull
        if (instance == null) {
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
                        throw new IllegalStateException("Unable to initialize driver substitution " + type.getImplName() + "'", ex);
        return id;
        return instance;
        super(config);

    private final String name;
    @Override

    @Override
        this.driverId = config.getAttribute(RegistryConstants.ATTR_DRIVER);
                    try {
    public DBPDriverSubstitution getInstance() {
 * DBeaver - Universal Database Manager
        }
 * See the License for the specific language governing permissions and
        return providerId;
    }
    private final String providerId;
        return driverId;
            synchronized (this) {
public class DriverSubstitutionDescriptor extends AbstractDescriptor implements DBPDriverSubstitutionDescriptor {
    @NotNull
 * Copyright (C) 2010-2024 DBeaver Corp and others
        this.type = new ObjectType(config.getAttribute(RegistryConstants.ATTR_CLASS));
    }
    @NotNull

}
    private final String id;
        this.id = config.getAttribute(RegistryConstants.ATTR_ID);
            }
 *

 */
    }
 * distributed under the License is distributed on an "AS IS" BASIS,

    private volatile DBPDriverSubstitution instance;

