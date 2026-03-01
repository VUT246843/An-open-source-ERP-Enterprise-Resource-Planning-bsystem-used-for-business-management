 * Generally all objects have unique name (in context of their parent objects) but sometimes the name isn't unique.
public interface DBPUniqueObject extends DBPObject {

 * Copyright (C) 2010-2025 DBeaver Corp and others
 */
 * Such objects may implements this interface to provide really unique name.
 * DBeaver - Universal Database Manager
 * Object with unique name.
    /**
 * For example stored procedures can be overridden, as a result multiple procedures have the same name.
/*
}
/**
     */
 * you may not use this file except in compliance with the License.

 * Licensed under the Apache License, Version 2.0 (the "License");
     * Object's unique name
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
    @NotNull
 * Unique name used in some operations like object tree refresh.
package org.jkiss.dbeaver.model;


 * You may obtain a copy of the License at

 *     http://www.apache.org/licenses/LICENSE-2.0
 *
     * @return object unique name
import org.jkiss.code.NotNull;
 * See the License for the specific language governing permissions and
 */
 * Unless required by applicable law or agreed to in writing, software
    String getUniqueName();
     *
 *
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
