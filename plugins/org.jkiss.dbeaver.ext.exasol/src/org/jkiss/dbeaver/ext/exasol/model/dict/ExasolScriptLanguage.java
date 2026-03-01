    @Override
 * limitations under the License.
    public String getName() {


import org.jkiss.code.NotNull;
public enum ExasolScriptLanguage implements DBPNamedObject {
 *
    }
        return name;
    @Override
 * DBeaver - Universal Database Manager
 */
    @NotNull
import org.jkiss.dbeaver.model.DBPNamedObject;
    }
 * Unless required by applicable law or agreed to in writing, software
    private String name;
    private ExasolScriptLanguage(String name) {
    JAVA("Java"),


    PYTHON("Python");

 *

 * Copyright (C) 2010-2024 DBeaver Corp and others
/*
 * you may not use this file except in compliance with the License.
    LUA("LUA"),
}
 * Copyright (C) 2016-2016 Karl Griesser (fullref@gmail.com)
        return name;
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.ext.exasol.model.dict;
    }

 * distributed under the License is distributed on an "AS IS" BASIS,
    R("R"),
    public String toString() {

 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
        this.name = name;

