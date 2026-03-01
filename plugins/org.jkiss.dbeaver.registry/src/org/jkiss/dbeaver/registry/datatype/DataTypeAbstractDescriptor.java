            return true;
    public boolean supportsDataSource(DBPDataSource dataSource) {
                        .map(Object::toString)
    @NotNull
                throw new IllegalStateException("Data type implementation not specified");
                            supportedTypes.add(typeNumber);
                    } else {
            String typeName = typedObject.getTypeName();
                            continue;
        return supportedDataSources;
        catch (Exception e) {
                    }
                            log.warn("Type ID must be an integer while '" + typeName + "' was specified"); //$NON-NLS-1$
                return true;
    }
        for (DBPDataSourceProviderDescriptor provider = dataSource.getContainer().getDriver().getProviderDescriptor(); provider != null; provider = provider.getParentProvider()) {
            this.instance = createInstance();
    public static final String ALL_TYPES_PATTERN = "*";
                } else {
            }
                        .map(t -> t.substring(0, t.length() - 1))
    protected DESCRIPTOR instance;


                        try {
import org.jkiss.dbeaver.model.DBPDataKind;
}import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
                            hasTypeIds = true;
                    hasAll = true;
                    boolean matchesTypeWithTypesParams = supportedTypes.stream()
 * Unless required by applicable law or agreed to in writing, software

    }
            String dsClassName = dsElement.getAttribute(RegistryConstants.ATTR_CLASS);
                            log.warn("Type element without name or standard type reference"); //$NON-NLS-1$
                            int typeNumber = typeField.getInt(null);

                typeName = typeElement.getAttribute("kind");
    }


                            supportedTypes.add(typeNumber);
    private final String id;
                    } catch (IllegalArgumentException e) {
            if (typeName != null) {
/**
    public DataTypeAbstractDescriptor(@NotNull IConfigurationElement config, @NotNull Class<DESCRIPTOR> instanceType) {
                            log.warn("Standard type '" + typeName + "' cannot be accessed", e); //$NON-NLS-1$

    private final Class<DESCRIPTOR> instanceType;
                    hasTypeNames = true;
 * You may obtain a copy of the License at
 *
            if (typeName != null) {
        IConfigurationElement[] typeElements = config.getChildren(RegistryConstants.TAG_TYPE);
 *
            supportedDataSources.add(dsId != null ? dsId : dsClassName);
 * See the License for the specific language governing permissions and
                        .filter(t -> t.endsWith(ALL_TYPES_PATTERN))
    {
 * you may not use this file except in compliance with the License.
    @Override
                    if (typeName.endsWith(ALL_TYPES_PATTERN)) {
 */
                        }
        return supportedDataSources.isEmpty();

                        .anyMatch(lowerCaseTypeName::startsWith);
                        typeName = typeElement.getAttribute(RegistryConstants.ATTR_ID);


        this.instanceType = instanceType;
                    hasDataKinds = true;
    private boolean hasAll, hasTypeIds, hasDataKinds, hasTypeNames, hasTypesWithTypedParams;
                continue;
    public boolean supportsType(@NotNull DBSTypedObject typedObject) {
                    }
    protected DESCRIPTOR createInstance() {
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
            }

        if (hasTypeNames) {
    {

        this.id = config.getAttribute(RegistryConstants.ATTR_ID);
                        supportedTypes.add(DBPDataKind.valueOf(typeName));
        if (instance == null) {

                    if (typeName == null) {
        IConfigurationElement[] dsElements = config.getChildren(RegistryConstants.TAG_DATASOURCE);
                } else {
        for (IConfigurationElement dsElement : dsElements) {
                        try {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return getId();
            } else {
import org.jkiss.dbeaver.registry.RegistryConstants;
        this.implType = new ObjectType(config.getAttribute(RegistryConstants.ATTR_CLASS));
 * Copyright (C) 2010-2025 DBeaver Corp and others

                    supportedTypes.add(typeName.toLowerCase(Locale.ENGLISH));
        }
                }
        }
{
                }

                        hasTypesWithTypedParams = true;
                if (typeName != null) {
        return id;
                        }
        if (hasAll || (hasTypeIds && supportedTypes.contains(typedObject.getTypeID()))) {
        }
            }
        for (IConfigurationElement typeElement : typeElements) {
            throw new IllegalStateException("Can't instantiate data type provider '" + this.getId() + "'", e); //$NON-NLS-1$
            if (supportedDataSources.contains(provider.getId())) {
        }
import org.eclipse.core.runtime.IConfigurationElement;
        try {
    private final Set<Object> supportedTypes = new HashSet<>();
    List<String> getSupportedDataSources() {
    }
    public Set<Object> getSupportedTypes()
    public String getId()
import org.jkiss.dbeaver.model.app.DBPRegistryDescriptor;
    private static final Log log = Log.getLog(ValueHandlerDescriptor.class);
import java.util.*;
            if (dsId == null && dsClassName == null) {
    @NotNull
 * limitations under the License.
import org.jkiss.dbeaver.Log;
    public boolean isGlobal()
import org.jkiss.code.NotNull;
                            int typeNumber = Integer.parseInt(typeName);
import org.jkiss.dbeaver.model.connection.DBPDataSourceProviderDescriptor;
                    }
                            hasTypeIds = true;
        return supportedTypes;
    }
                            Field typeField = java.sql.Types.class.getField(typeName);
        }
                        }
        return instance;
            return implType.createInstance(instanceType);
                final String lowerCaseTypeName = typeName.toLowerCase(Locale.ENGLISH);

                    try {
                        if (typeName == null) {
            if (implType == null) {
/*
    }
        super(config);
            String dsId = dsElement.getAttribute(RegistryConstants.ATTR_ID);

            }
    public String toString() {
import org.jkiss.dbeaver.model.DBPDataSource;
    private final List<String> supportedDataSources = new ArrayList<>();
                        } catch (Exception e) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                        log.warn(e);
                if (typeName.equals(ALL_TYPES_PATTERN)) {
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
                    return true;
    }
 */

                if (hasTypesWithTypedParams) {
                }
        return hasDataKinds && supportedTypes.contains(typedObject.getDataKind());
            String typeName = typeElement.getAttribute(RegistryConstants.ATTR_NAME);
    }
                    typeName = typeElement.getAttribute(RegistryConstants.ATTR_STANDARD);
 * DataTypeAbstractDescriptor

                        } catch (NumberFormatException e) {
 *
    public DESCRIPTOR getInstance() {
        }
                        return true;
            }

package org.jkiss.dbeaver.registry.datatype;
        }
    }
                }
public abstract class DataTypeAbstractDescriptor<DESCRIPTOR> extends AbstractDescriptor implements DBPRegistryDescriptor<DESCRIPTOR>
    @NotNull
                if (supportedTypes.contains(lowerCaseTypeName)) {
    {
    @Override
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
        return supportedDataSources.contains(dataSource.getClass().getName());
                log.warn("Datasource reference with null ID/Class"); //$NON-NLS-1$
                    if (matchesTypeWithTypesParams) {
                    }
import java.lang.reflect.Field;
    private final ObjectType implType;
    @Override
