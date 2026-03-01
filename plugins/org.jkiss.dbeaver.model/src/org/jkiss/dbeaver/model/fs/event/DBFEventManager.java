import java.util.concurrent.CopyOnWriteArrayList;
    }

    public void addListener(@NotNull DBFEventListener listener) {
        }
    public void removeListener(@NotNull DBFEventListener listener) {
    }
package org.jkiss.dbeaver.model.fs.event;
    public void fireFileSystemEvent(@NotNull DBFEvent event) {
    public synchronized static DBFEventManager getInstance() {
 *
public class DBFEventManager {
            instance = new DBFEventManager();
            listener.handleFileSystemEvent(event);
 * You may obtain a copy of the License at

        this.listeners.remove(listener);
 * Unless required by applicable law or agreed to in writing, software

        this.listeners.add(listener);


 * DBeaver - Universal Database Manager
 */
import java.util.List;
    private static DBFEventManager instance;
    }
import org.jkiss.code.NotNull;
 *
    private DBFEventManager() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        return instance;
        if (instance == null) {
    private final List<DBFEventListener> listeners = new CopyOnWriteArrayList<>();
    }
        }
    }
/*

 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
        for (DBFEventListener listener : this.listeners) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
}
 * you may not use this file except in compliance with the License.


 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and

