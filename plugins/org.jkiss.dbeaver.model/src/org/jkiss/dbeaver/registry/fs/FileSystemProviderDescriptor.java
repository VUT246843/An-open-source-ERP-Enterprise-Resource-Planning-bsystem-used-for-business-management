import org.jkiss.utils.CommonUtils;

    }
 */
    private final String description;
        return id;
    @Override
    private final ObjectType implClass;
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.fileSystem"; //$NON-NLS-1$
    public String getRequiredAuth() {


    @Override

        this.icon = iconToImage(config.getAttribute("icon"));

    @Override
    }
import org.jkiss.code.NotNull;
    @NotNull
            }
        return label;

public class FileSystemProviderDescriptor extends AbstractDescriptor implements DBFFileSystemDescriptor {
        return getLabel();
        }
 * You may obtain a copy of the License at
        this.requiredAuth = CommonUtils.nullIfEmpty(config.getAttribute("requiredAuth"));
            } catch (DBException e) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    private final String id;
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
                throw new IllegalStateException("Error instantiating file system provider " + id, e);
/**
import org.jkiss.dbeaver.model.DBPImage;
import org.eclipse.core.runtime.IConfigurationElement;
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
 *
 * See the License for the specific language governing permissions and
    public synchronized DBFFileSystemProvider getInstance() {
        this.implClass = new ObjectType(config.getAttribute("class"));
 *     http://www.apache.org/licenses/LICENSE-2.0
}

 * DBeaver - Universal Database Manager
    }
        this.schema = config.getAttribute("schema");
    private final String label;
    }
 * limitations under the License.

        this.id = config.getAttribute("id");
import org.jkiss.code.Nullable;

    public String toString() {
            try {
 * you may not use this file except in compliance with the License.
    private DBFFileSystemProvider instance;
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public String getId() {
        if (instance == null) {
        return schema;
    private final DBPImage icon;
        this.label = config.getAttribute("label");
 */
    }
        return icon;
    public DBPImage getIcon() {
    @Override
 *
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }


    @Nullable
    public String getDescription() {
 * PlatformLanguageDescriptor
    private final String schema;
    @Override
    public FileSystemProviderDescriptor(IConfigurationElement config) {
                instance = implClass.createInstance(DBFFileSystemProvider.class);
        this.description = config.getAttribute("description");
    @Override
        return requiredAuth;
package org.jkiss.dbeaver.registry.fs;

    }
        return description;

 *

    public String getLabel() {
        return instance;
    private final String requiredAuth;
        super(config);
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.fs.DBFFileSystemProvider;
import org.jkiss.dbeaver.model.fs.DBFFileSystemDescriptor;

 * Unless required by applicable law or agreed to in writing, software
    public String getSchema() {
