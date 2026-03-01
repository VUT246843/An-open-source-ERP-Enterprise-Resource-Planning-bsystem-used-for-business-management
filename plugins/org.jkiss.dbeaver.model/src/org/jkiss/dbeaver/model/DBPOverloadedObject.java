 *     http://www.apache.org/licenses/LICENSE-2.0
public interface DBPOverloadedObject extends DBPObject {
}
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.model;
    @NotNull
    /**
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 *
 */
import org.jkiss.code.NotNull;
 * Licensed under the Apache License, Version 2.0 (the "License");

     * Returns overloaded name (with parameters).
 *
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2025 DBeaver Corp and others
/*

 * limitations under the License.
 * Overloaded object.
/**

 *
     */
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
 */
    String getOverloadedName();
