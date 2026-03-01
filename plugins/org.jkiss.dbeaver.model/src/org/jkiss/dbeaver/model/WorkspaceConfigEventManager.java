                listenersList = List.copyOf(listeners);
            listenersByConfigFile.computeIfAbsent(configFileName, x -> new LinkedHashSet<>()).add(listener);
     */
        if (listenersList != null) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
 * Copyright (C) 2010-2024 DBeaver Corp and others
                listeners.remove(listener);
            Set<Consumer<Object>> listeners = listenersByConfigFile.get(configFileName);
            if (listeners != null) {
 *
 * limitations under the License.
import java.util.*;
 *
     */
    /**

            for (Consumer<Object> listener : listenersList) {
/*
     * Raise workspace configuration file changed event.
    /**
    public static void fireConfigChangedEvent(String configFileName) {
 * Unless required by applicable law or agreed to in writing, software
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
public class WorkspaceConfigEventManager {
    }
                listenersList = null;

        synchronized (syncRoot) {
    /**
    private static final Map<String, Set<Consumer<Object>>> listenersByConfigFile = new HashMap<>();
    private static final Object syncRoot = new Object();
     * Remove the listener of the workspace configuration file changed event.
    public static void removeConfigChangedListener(String configFileName, Consumer<Object> listener) {
        synchronized (syncRoot) {
 * you may not use this file except in compliance with the License.
            }
 * See the License for the specific language governing permissions and


            } else {
            // using LinkedHashSet to guarantee listeners invocation order
        }
 * DBeaver - Universal Database Manager
        synchronized (syncRoot) {
            if (listeners != null) {
 *
                listener.accept(null);
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        List<Consumer<Object>> listenersList;
        }
 * You may obtain a copy of the License at
            }
}
            Set<Consumer<Object>> listeners = listenersByConfigFile.get(configFileName);
     * Subscribe for the event of the workspace configuration file being changed.
import java.util.function.Consumer;
        }
package org.jkiss.dbeaver.model;
    public static void addConfigChangedListener(String configFileName, Consumer<Object> listener) {

            }
     */
