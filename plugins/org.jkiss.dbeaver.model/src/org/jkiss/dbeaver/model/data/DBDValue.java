
     * check this value is NULL
 * DBeaver - Universal Database Manager
public interface DBDValue extends DBDObject {


    boolean isNull();

 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
    Object getRawValue();
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
     * Releases allocated resources. Resets to original value
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}
 */
     * Checks if this value was modified on client-side.
 * See the License for the specific language governing permissions and
 */
 *
    boolean isModified();
    /**
package org.jkiss.dbeaver.model.data;

    /**
     */
 * limitations under the License.
 * you may not use this file except in compliance with the License.
     */
/**

/*
 * Licensed under the Apache License, Version 2.0 (the "License");
    /**

 *
     * @return true for NULL values
 * DBDValue
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
    void release();
     */
