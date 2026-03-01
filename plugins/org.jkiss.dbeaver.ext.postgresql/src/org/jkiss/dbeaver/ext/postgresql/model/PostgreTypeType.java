/*
    b("Base"),
 * PostgreTypeType
	
    @Override

 * limitations under the License.
    n("nested-table-type"), //Kingbase type
    a("Abstract"), // This is non-standard extension (PG Enterprise?)

    PostgreTypeType(String desc) {
import org.jkiss.dbeaver.model.DBPNamedObject;
}
/**
import org.jkiss.code.NotNull;
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
    r("Range");
 *
 */
    }
 *
    @NotNull
    c("Composite"),
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
 *
        this.desc = desc;
    private final String desc;
    }
public enum PostgreTypeType implements DBPNamedObject {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    e("Enum type"),
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */


    p("Pseudo-type"),
    d("Domain"),
    public String getName() {
        return desc;

    m("Multirange"), // Starting with the 14 PG version
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.ext.postgresql.model;
 *     http://www.apache.org/licenses/LICENSE-2.0
