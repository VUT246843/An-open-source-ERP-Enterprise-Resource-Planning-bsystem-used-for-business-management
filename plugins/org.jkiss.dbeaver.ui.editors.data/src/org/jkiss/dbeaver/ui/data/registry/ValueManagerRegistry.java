 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        result.put(contentManager, IStreamValueManager.MatchType.DEFAULT);
        return result;
        return Collections.unmodifiableCollection(streamManagers.values());

    private ValueManagerRegistry(IExtensionRegistry registry) {
 *
    public Map<StreamValueManagerDescriptor, IStreamValueManager.MatchType> getApplicableStreamManagers(@NotNull DBRProgressMonitor monitor, @NotNull DBSTypedObject attribute, @Nullable DBDContent value) {
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
                        result.put(contentManager, IStreamValueManager.MatchType.PRIMARY);
        return streamManagers.get(id);
 * limitations under the License.
                case EXCLUSIVE:
            }
                    return result;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.DBPDataSource;
                    if (!CommonUtils.isEmpty(contentManager.getPrimaryMime()) && primaryMime != null && primaryMime.match(contentManager.getPrimaryMime())) {
            switch (matchType) {
import org.jkiss.dbeaver.ui.data.managers.DefaultValueManager;
                }
    @Nullable
    @Override
            instance = new ValueManagerRegistry(Platform.getExtensionRegistry());
 * DBeaver - Universal Database Manager
import org.eclipse.core.runtime.IConfigurationElement;
import org.jkiss.code.Nullable;
    @NotNull
        Map<StreamValueManagerDescriptor, IStreamValueManager.MatchType> result = new LinkedHashMap<>();
            IStreamValueManager.MatchType matchType = contentManager.getInstance().matchesTo(monitor, attribute, value);
/*
                streamManagers.put(descriptor.getId(), descriptor);

            } else if (StreamValueManagerDescriptor.TAG_STREAM_MANAGER.equals(ext.getName())) {
    public Collection<StreamValueManagerDescriptor> getAllStreamManagers() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
                    }
                    break;
        for (IConfigurationElement ext : extElements) {
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
                    result.put(contentManager, matchType);
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

import org.eclipse.core.runtime.IExtensionRegistry;
    public synchronized static ValueManagerRegistry getInstance() {
        if (instance == null) {
                    result.clear();
public class ValueManagerRegistry extends AbstractValueBindingRegistry<IValueManager, Object, ValueManagerDescriptor> {
        MimeType primaryMime = primaryType == null ? null : new MimeType(primaryType);
                final StreamValueManagerDescriptor descriptor = new StreamValueManagerDescriptor(ext);
    }
                continue;
            }


        boolean isTextContent = ContentUtils.isTextContent(value);
/**
    protected List<ValueManagerDescriptor> getDescriptors() {
            }
    }
import org.jkiss.dbeaver.ui.data.IValueManager;
}
    }
        return getInstance().getValueBinding(typedObject, dataSource, typedObject, valueType);
        for (StreamValueManagerDescriptor contentManager : streamManagers.values()) {
        return instance;

        return result;
        MimeType mime = new MimeType(mimeType);
    private static ValueManagerRegistry instance = null;

import org.jkiss.utils.CommonUtils;
    private final List<ValueManagerDescriptor> managers = new ArrayList<>();

            for (String sm : contentManager.getSupportedMime()) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                managers.add(new ValueManagerDescriptor(ext));
        }
        return managers;
    public Map<StreamValueManagerDescriptor, IStreamValueManager.MatchType> getStreamManagersByMimeType(@NotNull String mimeType, String primaryType) {
                default:
        for (StreamValueManagerDescriptor contentManager : streamManagers.values()) {
 *
        }
 */
 * ValueManagerRegistry
import org.eclipse.core.runtime.Platform;
            }
                    break;
    private final Map<String, StreamValueManagerDescriptor> streamManagers = new HashMap<>();



        }
                    continue;
                    } else {
    }
import org.jkiss.dbeaver.ui.data.IStreamValueManager;
 *
    }
        return DefaultValueManager.INSTANCE;
package org.jkiss.dbeaver.ui.data.registry;
                if (!CommonUtils.isEmpty(sm) && mime.match(sm)) {
    @NotNull
 */
        IConfigurationElement[] extElements = registry.getConfigurationElementsFor(ValueManagerDescriptor.EXTENSION_ID);
import org.jkiss.utils.MimeType;
                case NONE:
    public static IValueManager findValueManager(@Nullable DBPDataSource dataSource, @NotNull DBSTypedObject typedObject, @NotNull Class<?> valueType) {
                // Skip different kind of manager
 * you may not use this file except in compliance with the License.
                    result.put(contentManager, matchType);
            if (ValueManagerDescriptor.TAG_MANAGER.equals(ext.getName())) {

        }
    }
        // Load datasource providers from external plugins
 * Unless required by applicable law or agreed to in writing, software
    @NotNull
    }
import org.jkiss.dbeaver.utils.ContentUtils;


import org.jkiss.dbeaver.registry.data.hints.AbstractValueBindingRegistry;
    }

        Map<StreamValueManagerDescriptor, IStreamValueManager.MatchType> result = new LinkedHashMap<>();

    public StreamValueManagerDescriptor getStreamManager(@NotNull String id) {
            if (isTextContent && !contentManager.supportsText()) {
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.data.DBDContent;
import java.util.*;

    @NotNull
    @Override
    protected IValueManager getDefaultValueBinding() {
