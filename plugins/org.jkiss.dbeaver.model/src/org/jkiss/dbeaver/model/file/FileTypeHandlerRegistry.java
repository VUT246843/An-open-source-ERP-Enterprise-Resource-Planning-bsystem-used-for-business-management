 * See the License for the specific language governing permissions and
        if (instance == null) {


import java.util.Comparator;
    }
            IConfigurationElement[] extElements = registry.getConfigurationElementsFor(FileTypeHandlerDescriptor.EXTENSION_ID);
import java.util.List;


        return null;
            for (IConfigurationElement ext : extElements) {
                handlers.add(formatterDescriptor);
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.NotNull;
        return null;
 * Unless required by applicable law or agreed to in writing, software
public class FileTypeHandlerRegistry {
                .flatMap(Arrays::stream)
        return handlers;
    @NotNull

            handlers.sort(Comparator.comparingInt(FileTypeHandlerDescriptor::getOrder));
            }
                if (fileExtension.equals(extName) || extName.equals("*")) {
    public List<FileTypeHandlerDescriptor> getHandlers() {
import org.jkiss.code.Nullable;
                .map(FileTypeHandlerDescriptor::getExtensions)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
                }
            instance = new FileTypeHandlerRegistry(Platform.getExtensionRegistry());
import org.eclipse.core.runtime.IExtensionRegistry;
    private final List<FileTypeHandlerDescriptor> handlers = new ArrayList<>();
}
import java.util.Arrays;
        }
            for (String extName : ext.getExtensions()) {
import org.eclipse.core.runtime.IConfigurationElement;
        FileTypeHandlerDescriptor.Extension extension = findExtension(fileExtension);
    private static FileTypeHandlerRegistry instance = null;
 * limitations under the License.
    }
    }

 * DBeaver - Universal Database Manager
    @Nullable
        }

 * distributed under the License is distributed on an "AS IS" BASIS,
    public synchronized static FileTypeHandlerRegistry getInstance() {
            handlers.stream()
                    return ext;
    @Nullable
 */
 *
        }
 *
    public FileTypeHandlerDescriptor findHandler(String fileExtension) {
 *     http://www.apache.org/licenses/LICENSE-2.0
                .forEach(extensions::add);
    private final List<FileTypeHandlerDescriptor.Extension> extensions = new ArrayList<>();
    private FileTypeHandlerRegistry(IExtensionRegistry registry) {
 *

 * You may obtain a copy of the License at

        {
 * you may not use this file except in compliance with the License.
        return instance;
    }
            return extension.getDescriptor();

        for (FileTypeHandlerDescriptor.Extension ext : extensions) {
        if (extension != null) {
            }
        }
                FileTypeHandlerDescriptor formatterDescriptor = new FileTypeHandlerDescriptor(ext);
import java.util.ArrayList;
package org.jkiss.dbeaver.model.file;
import org.eclipse.core.runtime.Platform;
 * Copyright (C) 2010-2026 DBeaver Corp and others
    public FileTypeHandlerDescriptor.Extension findExtension(String fileExtension) {
