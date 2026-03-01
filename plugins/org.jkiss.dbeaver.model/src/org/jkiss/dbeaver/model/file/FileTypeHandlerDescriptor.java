        this.id = config.getAttribute("id");
        public String[] getExtensions() {
        List<Extension> params = new ArrayList<>();
        private final FileTypeHandlerDescriptor descriptor;
        return isDatabaseHandler;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            this.descriptor = descriptor;
            throw new DBException("Can't instantiate file handler '" + clazz.getName() + "'", e);
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
    private final String id;
            return supportsImport;
        for (IConfigurationElement ex : config.getChildren("extension")) {
        }
        }
    private final boolean supportsRemote;






 *
    }
        @NotNull
 * limitations under the License.

import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.model.DBPImage;
 * Unless required by applicable law or agreed to in writing, software
        this.handlerType = new ObjectType(config.getAttribute("class"));
import org.eclipse.core.runtime.IConfigurationElement;


 *
        private final DBPImage icon;

            this.icon = iconToImage(config.getAttribute("icon"));
/*
    public FileTypeHandlerDescriptor(IConfigurationElement config) {
}
import org.jkiss.dbeaver.DBException;

        }
 * Licensed under the Apache License, Version 2.0 (the "License");
            this.id = config.getAttribute("id");
            return clazz.getConstructor().newInstance();
            params.add(new Extension(ex, this));

            this.supportsImport = CommonUtils.toBoolean(config.getAttribute("supportsImport"), false);
        return extensions;
 */
        public String getId() {
 * DBeaver - Universal Database Manager
        public DBPImage getIcon() {
            this.extensions = CommonUtils.notEmpty(config.getAttribute("extensions")).split(",");
import java.util.ArrayList;
package org.jkiss.dbeaver.model.file;
    }
 * DataFormatterDescriptor
        this.supportsRemote = CommonUtils.toBoolean(config.getAttribute("remote"), true);
            return descriptor;

        this.order = CommonUtils.toInt(config.getAttribute("order"));
        private final String[] extensions;
        return order;
    @NotNull

 */
    private final int order;
    private static final Log log = Log.getLog(FileTypeHandlerDescriptor.class);
        public FileTypeHandlerDescriptor getDescriptor() {
    }
    public Extension[] getExtensions() {
        return id;
        this.isDatabaseHandler = CommonUtils.toBoolean(config.getAttribute("databaseHandler"), true);
        Class<? extends FileOpenHandler> clazz = handlerType.getImplClass(FileOpenHandler.class);
    private final boolean isDatabaseHandler;
 * See the License for the specific language governing permissions and
import org.jkiss.utils.CommonUtils;

    public boolean supportsRemoteFiles() {
            return extensions;


import java.util.List;
import org.jkiss.code.NotNull;
    }
        @NotNull
import org.jkiss.code.Nullable;
        super(config);

        } catch (ReflectiveOperationException e) {

        @Nullable
        private final boolean supportsImport;
        @Nullable
        }

        }
            return id;
    }
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
 * Copyright (C) 2010-2026 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
    public boolean isDatabaseHandler() {
        public boolean isSupportsImport() {
        return supportsRemote;
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.fileTypeHandler"; //$NON-NLS-1$
    }
public class FileTypeHandlerDescriptor extends AbstractDescriptor {
/**
    private final Extension[] extensions;

        try {
    }
    public int getOrder() {
 *
    private final ObjectType handlerType;
        private final String id;
 * You may obtain a copy of the License at
            return icon;
        }
    public class Extension {

        this.extensions = params.toArray(new Extension[0]);
        Extension(@NotNull IConfigurationElement config, @NotNull FileTypeHandlerDescriptor descriptor) {
        }
        }
    public FileOpenHandler createHandler() throws DBException {
    }
    public String getId() {
