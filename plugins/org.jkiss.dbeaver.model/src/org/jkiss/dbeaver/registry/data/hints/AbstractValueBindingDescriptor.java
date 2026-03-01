            } else if (checkType) {
            if (dataSource != null) str.append("dataSource=").append(dataSource).append(";");
    private TYPE instance;
            } catch (Exception e) {
            ) {
                if (!CommonUtils.isEmpty(ext)) {
    private static final Log log = Log.getLog(AbstractValueBindingDescriptor.class);
    }
 */
        return id;
        return false;
            }
            if (info.valueType != null && valueType != null) {
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
                    this.extension = ext;
                return true;
        return true;
                return true;
    public String getDescription() {
    private static final String ATTR_DATA_SOURCE = "dataSource";
        public SupportInfo(IConfigurationElement cfg) {
 *
                if (!CommonUtils.isEmpty(dspId)) {
        if (!isEnabled(typedObject, context, false)) {
                }
                if (info.valueType.matchesType(valueType) && info.dataKind == null || info.dataKind == dataKind) {
        return instance;
    private static final String ATTR_TYPE = "type";
    public String toString() {
        ObjectType valueType;
                !CommonUtils.isEmpty(className) || !CommonUtils.isEmpty(dspId) || !CommonUtils.isEmpty(ext)
 * AbstractValueBindingDescriptor
                if (dataType != null && CommonUtils.equalObjects(
                    return true;
    private boolean supportsAnyProvider(@NotNull DBPDataSource dataSource, SupportInfo info) {
    public TYPE getInstance() {
    ) {
 *

                if (typeName.endsWith("*") && actualTypeName.startsWith(typeName.substring(0, typeName.length() - 1))) {
                    info.extension,
        }
            return false;

                continue;
                }
    }
            if (!checkType && info.valueType == null && info.dataKind == null && info.typeName == null && info.extension == null) {
        Class<?> valueType,
/*
            }
            if (info.typeName != null && info.typeName.equalsIgnoreCase(typedObject.getTypeName())) {
        return id;
            if (dataKind != null) str.append("dataKind=").append(dataKind).append(";");
        return false;
                }
import org.jkiss.dbeaver.model.DBUtils;
            if (dataSource != null && info.dataSource != null) {
             provider = provider.getParentProvider()) {
            if (dataSource != null && info.dataSource != null) {
                }
                }
                }
                throw new IllegalStateException("Can't instantiate value manager '" + this.getId() + "'", e); //$NON-NLS-1$
             provider != null;
                    }
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
                    return false;
                DBSDataType dataType = DBUtils.getDataType(typedObject);
            }
    protected final List<SupportInfo> supportInfos = new ArrayList<>();
import org.jkiss.utils.CommonUtils;
            if (info.extension != null) {
            }
                    continue;
            }
import java.util.List;
     */
import java.util.ArrayList;
        DBSTypedObject typedObject,
                continue;
        @NotNull CONTEXT context,
            if (info.valueType != null && valueType != null &&

    }
 * Unless required by applicable law or agreed to in writing, software
                if (!supportsAnyProvider(dataSource, info)) {
 */
        @Nullable DBPDataSource dataSource,
        @Nullable DBPDataSource dataSource,
        }

import org.jkiss.dbeaver.model.connection.DBPDataSourceProviderDescriptor;
                info.valueType.matchesType(valueType) && (info.dataKind == null || info.dataKind == dataKind)) {
        if (supportInfos.isEmpty()) {
            if (info.extension != null) {
    @Override
                }
            String className = cfg.getAttribute(ATTR_TYPE);
                if (dataType != null && CommonUtils.equalObjects(info.extension, CommonUtils.toString(dataType.geTypeExtension()))) {
    }
            String dspId = cfg.getAttribute(ATTR_DATA_SOURCE);

                    this.valueType = new ObjectType(cfg, ATTR_TYPE);
            String typeName = cfg.getAttribute(ATTR_TYPE_NAME);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}    }

        String extension;
        return description;
            String kindName = cfg.getAttribute(ATTR_KIND);
        final DBPDataKind dataKind = typedObject.getDataKind();
            if (info.dataSource.equals(provider.getId()) || info.dataSource.equals(dataSource.getClass().getName())) {
    }
                if (!CommonUtils.isEmpty(className)) {
        if (instance == null) {
                if (typeName.equalsIgnoreCase(actualTypeName)) {

        this.implType = new ObjectType(config.getAttribute("class"));
            }
                    this.dataSource = dspId;
                return true;
            }
            }

                return true;

        String typeName;

            } else if (checkDataSource) {
                    } catch (IllegalArgumentException e) {
        }
            if (!CommonUtils.isEmpty(kindName) || !CommonUtils.isEmpty(typeName) ||
            return str.toString();
    /**
                return true;
                String actualTypeName = typedObject.getTypeName().toLowerCase(Locale.ROOT);
                }
                return true;
        final DBPDataKind dataKind = typedObject.getDataKind();
        }
public abstract class AbstractValueBindingDescriptor<TYPE, CONTEXT> extends AbstractDescriptor {
import org.jkiss.dbeaver.model.struct.DBSDataType;
        this.description = config.getAttribute("description");
 * You may obtain a copy of the License at
                }
    public boolean supportsAnyType(
        boolean checkDataSource,
        return false;
    protected ObjectType implType;
                    return true;
 * See the License for the specific language governing permissions and
    private static final String ATTR_TYPE_NAME = "typeName";
        String dataSource;
 * distributed under the License is distributed on an "AS IS" BASIS,
        for (SupportInfo info : supportInfos) {
    }
                    return true;
        }
import org.eclipse.core.runtime.IConfigurationElement;
    public AbstractValueBindingDescriptor(IConfigurationElement config) {
            supportInfos.add(new SupportInfo(typeElement));
            String ext = cfg.getAttribute(ATTR_EXTENSION);
        Class<?> valueType
                this.instance = implType.createInstance(getImplClass());

    private final String id;
 * you may not use this file except in compliance with the License.
/**
        }

    ) {
            StringBuilder str = new StringBuilder();
                String typeName = info.typeName.toLowerCase(Locale.ROOT);
        }
                    this.typeName = typeName;
                }
    }
        @Override
                        this.dataKind = DBPDataKind.valueOf(kindName);
package org.jkiss.dbeaver.registry.data.hints;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    protected class SupportInfo {
            }
 * limitations under the License.

            }
import org.jkiss.code.Nullable;
                if (!CommonUtils.isEmpty(typeName)) {

        public String toString() {
 * DBeaver - Universal Database Manager
            if (info.typeName != null) {
    public String getId() {
import org.jkiss.dbeaver.Log;
        }
                if (!supportsAnyProvider(dataSource, info)) {
    public static final String TAG_SUPPORTS = "supports"; //$NON-NLS-1$
        boolean checkType
    }
    }
import org.jkiss.code.NotNull;
            if (info.dataKind != null && info.dataKind == dataKind) {
        IConfigurationElement[] typeElements = config.getChildren(TAG_SUPPORTS);
                    CommonUtils.toString(dataType.geTypeExtension()))
        DBSTypedObject typedObject,
    private static final String ATTR_KIND = "kind";



                if (!CommonUtils.isEmpty(kindName)) {
                    return true;
                ) {
        if (!isEnabled(typedObject, context, true)) {
                    return true;

        super(config);
        for (DBPDataSourceProviderDescriptor provider = dataSource.getContainer().getDriver().getProviderDescriptor();
                        log.warn("Bad data kind: " + kindName);
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
            }
            try {
                return true;
    protected abstract Class<TYPE> getImplClass();
    public boolean supportsType(
    private final String description;

            if (extension != null) str.append("extension=").append(extension).append(";");
            }
            if (info.dataKind != null && info.dataKind == dataKind) {
            return false;
        for (SupportInfo info : supportInfos) {
        }
    public boolean isEnabled(DBSTypedObject typedObject, CONTEXT context, boolean checkConfigDisable) {
import org.jkiss.dbeaver.model.DBPDataKind;
import org.jkiss.dbeaver.model.DBPDataSource;
            }

import java.util.Locale;
     * @param typedObject        optional attribute. If null then verify potential enablement

    @NotNull
        for (IConfigurationElement typeElement : typeElements) {
    private static final String ATTR_EXTENSION = "extension";
                    try {
            }
     * @param checkConfigDisable if true then also verify that this binding wasn't disabled by user configuration
            return true;
        DBPDataKind dataKind;
                DBSDataType dataType = DBUtils.getDataType(typedObject);
 *
            if (typeName != null) str.append("typeName=").append(typeName).append(";");
        this.id = config.getAttribute("id");
        @NotNull CONTEXT context,
                }
            if (valueType != null) str.append("valueType=").append(valueType.getImplName()).append("; ");
            if (info.valueType == null && info.dataKind == null && info.typeName == null && info.extension == null) {
                }
            }
