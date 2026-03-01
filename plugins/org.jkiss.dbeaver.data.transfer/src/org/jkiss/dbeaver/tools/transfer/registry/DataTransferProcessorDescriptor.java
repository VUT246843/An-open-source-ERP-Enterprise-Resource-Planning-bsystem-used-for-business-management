    }
    }
            return true;
import org.eclipse.core.runtime.IAdaptable;
    }
        Class<?> cls = processorType.getObjectClass();
    private final String appName;
                return prop;
 * You may obtain a copy of the License at
    }
        return null;
    }
import org.jkiss.code.NotNull;
    }
    private final DataTransferNodeDescriptor node;
        } catch (Exception e) {
        return getFullId();

    @NotNull
        return node.getId() + ":" + getId();
        return false;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    }

    @NotNull
    }
    public boolean isHTMLFormat() {
 * Copyright (C) 2010-2025 DBeaver Corp and others

    @Nullable

    }
        return description;
        }

        if (sourceTypes.isEmpty()) {
        return CommonUtils.isEmpty(ext) ? "data" : ext;
            if (prop.getId().equals(name)) {
    @Nullable
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
}
        this.description = config.getAttribute("description");
 * distributed under the License is distributed on an "AS IS" BASIS,

 */

        return false;
        super(config);
        return isBinary;
import java.util.ArrayList;
    public String getAppName() {
 */
        return properties;
        Class<?> cls = processorType.getObjectClass();
        this.icon = iconToImage(config.getAttribute("icon"), DBIcon.TYPE_UNKNOWN);
import org.jkiss.dbeaver.model.impl.PropertyDescriptor;
    @Nullable
 *
import org.eclipse.core.runtime.IConfigurationElement;
        for (IConfigurationElement typeCfg : ArrayUtils.safeArray(config.getChildren("sourceType"))) {
        }
    @NotNull
        }
    public int getOrder() {
        this.isBinary = CommonUtils.getBoolean(config.getAttribute("binary"), false);
    public String getProcessorFileExtension() {
    }

import org.jkiss.dbeaver.tools.transfer.stream.IAppendableDataExporter;
    }
        this.properties = PropertyDescriptor.extractPropertyGroups(config);
    public boolean isAppendable() {
        return node;
 *
    private final ObjectType processorType;
    @Nullable
public class DataTransferProcessorDescriptor extends AbstractDescriptor implements DBPRegistryDescriptor<IDataTransferProcessor> {
                return true;
            return clazz.getConstructor().newInstance();
    public DBPPropertyDescriptor[] getProperties() {
    private final DBPImage icon;



        this.processorType = new ObjectType(config.getAttribute("class"));
import org.jkiss.dbeaver.utils.MimeTypes;
    }
    private final List<ObjectType> sourceTypes = new ArrayList<>();
    }
    private final String appFileExtension;
 *

/**
        if (sourceTypes.isEmpty()) {

    public String getId() {
    private final boolean isHTML;
    private final String name;
        return contentType;
    }
    @NotNull
    public String toString() {
    private final String contentType;
                return true;
    private final String description;
            }
    }
            return true;
        for (DBPPropertyDescriptor prop : properties) {
            throw new IllegalStateException("Can't instantiate data exporter", e);
        DBPPropertyDescriptor extProperty = getProperty("extension");
 * Licensed under the Apache License, Version 2.0 (the "License");

            if (adaptable.getAdapter(sourceType.getObjectClass()) != null) {
 * DataTransferProcessorDescriptor
    public String getContentType() {
        return order;
            Class<? extends IDataTransferProcessor> clazz = processorType.getImplClass(IDataTransferProcessor.class);
 * Unless required by applicable law or agreed to in writing, software

        return cls != null && IMultiStreamDataImporter.class.isAssignableFrom(cls);
import org.jkiss.utils.CommonUtils;
        for (ObjectType sourceType : sourceTypes) {
    DataTransferProcessorDescriptor(@NotNull DataTransferNodeDescriptor node, @NotNull IConfigurationElement config) {
import org.jkiss.dbeaver.model.app.DBPRegistryDescriptor;
    public boolean adaptsToType(@NotNull IAdaptable adaptable) {
            }
        return id;

        return isHTML;
        this.order = CommonUtils.toInt(config.getAttribute("order"));
        }
    @Override
    public DataTransferNodeDescriptor getNode() {
        }
    public DBPPropertyDescriptor getProperty(@NotNull String name) {
        this.node = node;
        return appName;
    }
    private final boolean isBinary;
    @NotNull
        this.appFileExtension = config.getAttribute("appFileExtension");
import org.jkiss.dbeaver.tools.transfer.stream.IMultiStreamDataImporter;
    private final String id;
 * you may not use this file except in compliance with the License.
        return name;
        return icon;
 * DBeaver - Universal Database Manager

        this.contentType = CommonUtils.toString(config.getAttribute("contentType"), MimeTypes.OCTET_STREAM);
import org.jkiss.dbeaver.model.DBPImage;
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
import org.jkiss.utils.ArrayUtils;
    }
    public IDataTransferProcessor getInstance() {
    public String getDescription() {
        this.isHTML = CommonUtils.getBoolean(config.getAttribute("html"), false);
        this.id = config.getAttribute("id");
    public boolean isBinaryFormat() {
    public boolean isMulti() {
    public String getAppFileExtension() {
            processorType.checkObjectClass(IDataTransferProcessor.class);
    private final DBPPropertyDescriptor[] properties;

        this.appName = config.getAttribute("appName");
        return appFileExtension;
import org.jkiss.code.Nullable;
        return cls != null && IAppendableDataExporter.class.isAssignableFrom(cls);
import java.util.List;


    public DBPImage getIcon() {
            sourceTypes.add(new ObjectType(typeCfg.getAttribute("type")));
    boolean appliesToType(@NotNull Class<?> objectType) {
        try {
            if (sourceType.matchesType(objectType)) {
import org.jkiss.dbeaver.model.DBIcon;

        String ext = extProperty == null ? getAppFileExtension() : CommonUtils.toString(extProperty.getDefaultValue(), null);

    @Nullable
    }
        }
import org.jkiss.dbeaver.tools.transfer.IDataTransferProcessor;

 *     http://www.apache.org/licenses/LICENSE-2.0
            }
    }

 * See the License for the specific language governing permissions and
    @NotNull
        this.name = config.getAttribute("label");

/*
    @NotNull
    private final int order;
    @NotNull
package org.jkiss.dbeaver.tools.transfer.registry;
        }
    public String getFullId() {
 * limitations under the License.
        for (ObjectType sourceType : sourceTypes) {
    }


    }
    public String getName() {

