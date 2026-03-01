    private static GlobalEventManagerImpl instance;
    public void fireGlobalEvent(@NotNull String eventId, @NotNull Map<String, Object> properties) {
    private DBPGlobalEventListener[] getListenersCopy() {

 * limitations under the License.
import org.jkiss.code.NotNull;
        }
 *
 */
 * GlobalEventManagerImpl
import org.jkiss.dbeaver.Log;

        DBPGlobalEventListener[] listeners;
        synchronized (this.listeners) {

 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
import java.util.ArrayList;
}
    }
        return listeners;
        }
import org.jkiss.dbeaver.model.app.DBPGlobalEventListener;

        synchronized (listeners) {

            instance = new GlobalEventManagerImpl();
            listeners = this.listeners.toArray(new DBPGlobalEventListener[0]);
import org.jkiss.dbeaver.model.app.DBPGlobalEventManager;
 *
public class GlobalEventManagerImpl implements DBPGlobalEventManager {
    }
 *
    @Override
 * DBeaver - Universal Database Manager
/*
 */
            listeners.add(listener);

    private final List<DBPGlobalEventListener> listeners = new ArrayList<>();
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
        return instance;
import java.util.Map;

    public void removeEventListener(@NotNull DBPGlobalEventListener listener) {
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.List;
 * See the License for the specific language governing permissions and

        }
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.registry;
 * you may not use this file except in compliance with the License.
        synchronized (listeners) {
    private static final Log log = Log.getLog(GlobalEventManagerImpl.class);
    public static GlobalEventManagerImpl getInstance() {
        for (DBPGlobalEventListener listener : getListenersCopy()) {
 * Unless required by applicable law or agreed to in writing, software
            listeners.remove(listener);
            listener.handleGlobalEvent(eventId, properties);

    @NotNull

        }
/**
    }
    public void addEventListener(@NotNull DBPGlobalEventListener listener) {
        }

        if (instance == null) {
    }
    @Override
