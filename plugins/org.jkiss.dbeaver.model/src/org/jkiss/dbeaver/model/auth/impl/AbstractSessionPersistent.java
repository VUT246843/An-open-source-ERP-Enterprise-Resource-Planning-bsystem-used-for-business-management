    public Map<String, Object> getAttributes() {
    private record PersistentAttribute(Object value) {
    }
                value = creator.apply(null);
        }
            return attributes.remove(name);
 * you may not use this file except in compliance with the License.
            }
    private static final Log log = Log.getLog(AbstractSessionPersistent.class);
        @Nullable ThrowableConsumer<T, E> disposer
import org.jkiss.code.NotNull;
        }
                Object attrValue = attributes.get(attrDisposer.getKey());
            attributeDisposers.clear();
    public Object removeAttribute(@NotNull String name) {
import org.jkiss.dbeaver.Log;
            return (T) value;
                try {
        synchronized (attributes) {
    }
            }
                } catch (Exception e) {
    public void setAttribute(@NotNull String name, @Nullable Object value, boolean persistent) {
 *
    public <T> T getAttribute(@NotNull String name) {
            if (value instanceof PersistentAttribute persistentAttribute) {
            for (Map.Entry<String, ThrowableConsumer<Object, Exception>> attrDisposer : attributeDisposers.entrySet()) {


    ) throws E {


 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.utils.function.ThrowableFunction;
 * See the License for the specific language governing permissions and
 */
    }
import java.util.HashMap;
import org.jkiss.utils.function.ThrowableConsumer;
    public <T, E extends Exception> T getAttribute(
        @NotNull ThrowableFunction<String, T, E> creator,
import org.jkiss.code.Nullable;

            attributes.entrySet().removeIf(
    @Override
            }
    }
                    if (disposer != null) {
    @Nullable
        synchronized (attributes) {

    }
 *
        }
        }
                    attributes.put(name, value);

            return (T) value;

import java.util.Map;
    @NotNull
    }
        }
            attributes.put(name, persistent ? new PersistentAttribute(value) : value);

 *
    }
            if (value == null) {
        synchronized (attributes) {
        synchronized (attributes) {
                    attrDisposer.getValue().accept(attrValue);

                if (value != null) {

 * DBeaver - Universal Database Manager

        synchronized (attributes) {
/*
        @NotNull String name,
            if (value instanceof PersistentAttribute persistentAttribute) {
                value = persistentAttribute.value();

 * distributed under the License is distributed on an "AS IS" BASIS,
}
                entry -> !(entry.getValue() instanceof PersistentAttribute));
                }

                    }
                    log.error("Error disposing attribute '" + attrDisposer.getKey() + "'", e);
    }
    public void setAttribute(@NotNull String name, @Nullable Object value) {
 * Copyright (C) 2010-2026 DBeaver Corp and others
                value = persistentAttribute.value();
        synchronized (attributes) {
            }
    @Override
                        attributeDisposers.put(name, (ThrowableConsumer<Object, Exception>) disposer);
            Object value = attributes.get(name);
    }
public abstract class AbstractSessionPersistent implements SMSessionPersistent {
    protected void resetSessionCache() throws DBCException {
    protected final Map<String, Object> attributes = new HashMap<>();
    public void close() {
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
        }
            Object value = attributes.get(name);
 * limitations under the License.
            attributes.put(name, value);
    @Override
                }
    private final Map<String, ThrowableConsumer<Object, Exception>> attributeDisposers = new HashMap<>();
        // Clear attributes
 * Unless required by applicable law or agreed to in writing, software
    @Override
import org.jkiss.dbeaver.model.exec.DBCException;

        synchronized (attributes) {
 * You may obtain a copy of the License at
            // Remove all non-persistent attributes
            return new HashMap<>(attributes);
import org.jkiss.dbeaver.model.auth.SMSessionPersistent;

package org.jkiss.dbeaver.model.auth.impl;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    @Override
