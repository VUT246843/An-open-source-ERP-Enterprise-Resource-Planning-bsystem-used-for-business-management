/**
                log.error(e.getMessage(), e);
 */
package org.jkiss.dbeaver.model.rm;
        }
                listener.handleRMEvent(event);
/*
            }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
    }
 */
 *
import org.jkiss.dbeaver.Log;
 *
    public static synchronized void removeEventListener(@NotNull RMEventListener listener) {
import java.util.List;
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
import java.util.concurrent.CopyOnWriteArrayList;
 * Licensed under the Apache License, Version 2.0 (the "License");
            } catch (Exception e) {

}


 *     http://www.apache.org/licenses/LICENSE-2.0
 * Resource event manager.
    }
        for (var listener : listeners) {
 * Unless required by applicable law or agreed to in writing, software
    public static void fireEvent(@NotNull RMEvent event) {
    private static final List<RMEventListener> listeners = new CopyOnWriteArrayList<>();
        listeners.add(listener);
    }
import org.jkiss.code.NotNull;

 *
 * limitations under the License.

        listeners.remove(listener);
    public static synchronized void addEventListener(@NotNull RMEventListener listener) {

 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and

 * Copyright (C) 2010-2025 DBeaver Corp and others
            try {
public class RMEventManager {
    private static final Log log = Log.getLog(RMEventManager.class);
