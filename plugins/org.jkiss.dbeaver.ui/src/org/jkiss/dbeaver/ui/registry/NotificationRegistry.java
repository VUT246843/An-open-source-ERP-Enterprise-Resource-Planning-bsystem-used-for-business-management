public class NotificationRegistry {
    public NotificationDescriptor getNotification(@NotNull String id) {
/*
 * You may obtain a copy of the License at
    private static NotificationRegistry instance;



        if (instance == null) {
        return instance;
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Nullable
import org.jkiss.code.Nullable;
import java.util.Collection;
        }
    }
    private static final String EXTENSION_ID = "org.jkiss.dbeaver.notifications";
    public Collection<NotificationDescriptor> getNotifications() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                final NotificationDescriptor descriptor = new NotificationDescriptor(element);
 *
    private final Map<String, NotificationDescriptor> notifications = new HashMap<>();
    private NotificationRegistry(@NotNull IExtensionRegistry registry) {

    }
import org.eclipse.core.runtime.IExtensionRegistry;
        return notifications.get(id);
    @NotNull
            instance = new NotificationRegistry(Platform.getExtensionRegistry());
    }
            if (NotificationDescriptor.ELEMENT_ID.equals(element.getName())) {
 *
    public static synchronized NotificationRegistry getInstance() {
import java.util.Map;

 * Unless required by applicable law or agreed to in writing, software

    @NotNull
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
import org.eclipse.core.runtime.IConfigurationElement;
            }
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.HashMap;
                notifications.put(descriptor.getId(), descriptor);
package org.jkiss.dbeaver.ui.registry;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
}


 */
 * See the License for the specific language governing permissions and
        for (IConfigurationElement element : registry.getConfigurationElementsFor(EXTENSION_ID)) {
        }
import org.jkiss.code.NotNull;
import org.eclipse.core.runtime.Platform;
    }
        return notifications.values();

