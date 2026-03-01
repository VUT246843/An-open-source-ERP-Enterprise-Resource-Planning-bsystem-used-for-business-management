    }
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
}
        for (EFSNIOListener listener : lc) {
        }

            listeners.add(listener);
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
            listener.resourceChanged(resource, action);
    }
    public static boolean removeListener(EFSNIOListener listener) {
public abstract class EFSNIOMonitor {
    public static void notifyResourceChange(EFSNIOResource resource, EFSNIOListener.Action action) {
    public static void addListener(EFSNIOListener listener) {
 * limitations under the License.
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.

 * Unless required by applicable law or agreed to in writing, software


 * DBeaver - Universal Database Manager
 *
/*
        synchronized (listeners) {
        synchronized (listeners) {

        EFSNIOListener[] lc;
            lc = listeners.toArray(new EFSNIOListener[0]);
 */
/**

        }
package org.jkiss.dbeaver.model.fs.nio;
        synchronized (listeners) {
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.ArrayList;
            return listeners.remove(listener);
import java.util.List;
    private final static List<EFSNIOListener> listeners = new ArrayList<>();
 * NIOContainer
