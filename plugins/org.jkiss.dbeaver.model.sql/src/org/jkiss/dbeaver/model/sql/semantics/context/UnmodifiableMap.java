
            return new UnmodifiableMap<>(result);

 * distributed under the License is distributed on an "AS IS" BASIS,
            for (Map.Entry<? extends K, ? extends V> entry : entries) {
    public UnmodifiableMap<K, V> put(Collection<Map.Entry<K, V>> entries) {
    }
/*
        return this.map.get(key);

 * You may obtain a copy of the License at
    public UnmodifiableMap<K, V> remove(Collection<Map.Entry<K, V>> entries) {
        return this.map.values();


    }
        } else {
}
import java.util.HashMap;
            @SuppressWarnings("unchecked")
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    }
        if (entries.isEmpty()) {
        }
        return (UnmodifiableMap<K, V>) EMPTY;
        }
                result.put(entry.getKey(), entry.getValue());
        } else {
    public UnmodifiableMap<K, V> combine(UnmodifiableMap<K, V> other) {
import java.util.Collection;
 *     http://www.apache.org/licenses/LICENSE-2.0


            result.putAll(other.map);
                result.remove(entry.getKey(), entry.getValue());
        this.map = map;
    public static <K, V> UnmodifiableMap<K, V> emptyMap() {
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.model.sql.semantics.context;
            return other;
    @SuppressWarnings("unchecked")
 * limitations under the License.
            return this;
 * See the License for the specific language governing permissions and
    private UnmodifiableMap(Map<K, V> map) {
            result.putAll(this.map);
        if (this.map.isEmpty()) {

            }
            HashMap<K, V> result = new HashMap<>(this.map);


    }
 * DBeaver - Universal Database Manager

        return this.map.entrySet();

        return new UnmodifiableMap<>(result);

            return new UnmodifiableMap<>(result);
    public Collection<V> values() {
        if (entries.isEmpty()) {
            HashMap<K, V> result = new HashMap<>(this.map);
            return this;
 * Unless required by applicable law or agreed to in writing, software
    }
        }
    }
 *
    public UnmodifiableMap<K, V> put(K key, V value) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
    private static final UnmodifiableMap<?, ?> EMPTY = new UnmodifiableMap<>(Collections.emptyMap());
        result.put(key, value);
 */
import java.util.Collections;
 *
 *
import java.util.Map;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private final Map<K, V> map;
    }
    public V get(K key) {
            for (Map.Entry<? extends K, ? extends V> entry : entries) {
        HashMap<K, V> result = new HashMap<>(this.map);
    public Collection<Map.Entry<K, V>> entrySet() {
            }
        } else if (other.map.isEmpty()) {
        } else {
            return new UnmodifiableMap<>(result);
            HashMap<K, V> result = new HashMap<>(this.map.size() + other.map.size());
            return this;
final class UnmodifiableMap<K, V> {
