
    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
 *
package org.jkiss.dbeaver.model.virtual;
    public void set(String s, Object o) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at
public abstract class DBVAbstractContext implements JexlContext {
    @Override
    }
 * See the License for the specific language governing permissions and
import org.apache.commons.jexl3.JexlContext;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
    }
}



/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.

    public boolean has(String s) {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.
 */
        return get(s) != null;
