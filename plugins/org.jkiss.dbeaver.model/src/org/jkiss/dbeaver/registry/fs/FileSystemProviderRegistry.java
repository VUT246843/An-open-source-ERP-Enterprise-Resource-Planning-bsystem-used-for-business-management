import org.jkiss.dbeaver.model.fs.DBFFileSystemDescriptor;
/*
    public List<FileSystemProviderDescriptor> getProviders() {
        }
    }
        }

 *     http://www.apache.org/licenses/LICENSE-2.0
public class FileSystemProviderRegistry implements DBFRegistry {

        return descriptors;
            instance = new FileSystemProviderRegistry(Platform.getExtensionRegistry());
import org.eclipse.core.runtime.IExtensionRegistry;
 */
        return instance;
            }

    public DBFFileSystemDescriptor getFileSystemProvider(@NotNull String id) {
    private static FileSystemProviderRegistry instance = null;
            }
}
import java.util.ArrayList;
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.fs.DBFRegistry;

        {
        return descriptors.stream().filter(d -> d.getId().equals(id)).findFirst().orElse(null);

        return descriptors.toArray(new DBFFileSystemDescriptor[0]);
 *
    }
    @Override
        }
 * See the License for the specific language governing permissions and
            .findFirst().orElse(null);
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.utils.CommonUtils;
 * You may obtain a copy of the License at

import java.util.List;
        if (instance == null) {

    @Override
    }

package org.jkiss.dbeaver.registry.fs;
    @Override
 * DBeaver - Universal Database Manager
    }
        return null;
            for (IConfigurationElement ext : extElements) {
                descriptors.add(new FileSystemProviderDescriptor(ext));
    }
                return descriptor;
            if (descriptor.getId().equals(id)) {
        for (FileSystemProviderDescriptor descriptor : descriptors) {
    private FileSystemProviderRegistry(IExtensionRegistry registry) {
import org.eclipse.core.runtime.Platform;
    }

 *
    public DBFFileSystemDescriptor getFileSystemProviderBySchema(@NotNull String schema) {
import org.eclipse.core.runtime.IConfigurationElement;
    public DBFFileSystemDescriptor[] getFileSystemProviders() {
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
        return descriptors.stream().filter(d -> CommonUtils.equalObjects(d.getSchema(), schema))
            IConfigurationElement[] extElements = registry.getConfigurationElementsFor(FileSystemProviderDescriptor.EXTENSION_ID);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    private final List<FileSystemProviderDescriptor> descriptors = new ArrayList<>();

        // Load data descriptors from external plugins
 * limitations under the License.

 * Copyright (C) 2010-2024 DBeaver Corp and others
    public FileSystemProviderDescriptor getProvider(String id) {
 * you may not use this file except in compliance with the License.
    public synchronized static FileSystemProviderRegistry getInstance() {
