        }
    private static byte[] serialize(Serializable object) throws IOException {
 */
            }
            @Override
            return value;
import com.google.gson.GsonBuilder;
        } catch (Exception e) {
        ByteArrayInputStream buffer = new ByteArrayInputStream(data);
        return new ObjectInputStream(buffer) {
 * limitations under the License.
}

 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * You may obtain a copy of the License at
     * Transfer object to another classloader
                Class<?> delegateClass = targetClassloader.loadClass(
        new ObjectOutputStream(buffer).writeObject(object);
        }
 *
                return Class.forName(desc.getName(), false, classLoader);

 * distributed under the License is distributed on an "AS IS" BASIS,

/*
 * you may not use this file except in compliance with the License.
            throw new RuntimeException("Error transferring class", e);
import org.junit.runner.notification.RunListener;
                    "org.jkiss.junit.osgi.delegate.RunListenerDelegate");
            protected Class<?> resolveClass(ObjectStreamClass desc) throws ClassNotFoundException {
    }
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
                    .newInstance(value);
    private static Object deserialize(byte[] data, ClassLoader classLoader) throws IOException, ClassNotFoundException {
            } else if (value instanceof RunListener) {
            }
    /**
        return null;

                return delegateClass
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.io.*;
                    .getConstructor(Object.class)
    }
     * @return transferred object or delegated object or null if transfer is not possible or failed

     */

 *
     * @param targetClassloader target classloader
     * @param value object to transfer
        try {
            if (value instanceof Serializable serializable) {
package org.jkiss.junit.osgi.delegate;
    }
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others
public class ClassTransferHandler {
        return buffer.toByteArray();
 * DBeaver - Universal Database Manager
                return deserialize(serialize(serializable), targetClassloader);
        }.readObject();

    public static Object transfer(Object value, ClassLoader targetClassloader) {
import com.google.gson.Gson;
        if (value.getClass().getClassLoader().equals(targetClassloader)) {
