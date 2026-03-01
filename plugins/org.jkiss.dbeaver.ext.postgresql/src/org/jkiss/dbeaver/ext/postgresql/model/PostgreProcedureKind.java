import org.jkiss.code.NotNull;
    @NotNull
    PostgreProcedureKind(String title) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 */

        this.title = title;
 * Copyright (C) 2010-2025 DBeaver Corp and others

 * Licensed under the Apache License, Version 2.0 (the "License");
    private final String title;
    }
 *
 */
/*
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.DBPNamedObject;
    }
 * limitations under the License.
 * you may not use this file except in compliance with the License.
    f("Function"),
 * distributed under the License is distributed on an "AS IS" BASIS,
public enum PostgreProcedureKind implements DBPNamedObject {
    p("Procedure"),
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    a("Aggregate"),
    @Override
 * DBeaver - Universal Database Manager
        return title;

 * PostgreProcedureKind
 *
    public String getName() {
 *

    w("Window");

 * Unless required by applicable law or agreed to in writing, software
}
package org.jkiss.dbeaver.ext.postgresql.model;
/**
 * You may obtain a copy of the License at
