    P("Pseudo"),
public enum PostgreTypeCategory implements DBPNamedObject {
/**
 * Enumerates system-defined values of typcategory.
 * See the License for the specific language governing permissions and
    private final String desc;
    J("JSON"),

 *

    I("Network address"),
 * You may obtain a copy of the License at
    V("Bit-string"),
    A("Array"),
    G("Geometric"),
 */
}
 * Unless required by applicable law or agreed to in writing, software
    @Override
    PostgreTypeCategory(String desc) {
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
    D("Date/time"),
    }
    @NotNull
import org.jkiss.dbeaver.model.DBPNamedObject;
        this.desc = desc;
    N("Numeric"),

        return desc;
    C("Composite"),
    Y("Y"), //Kingbase Type
/*
    }
 *
    T("Timespan"),
    Z("Internal-use types"); //$NON-NLS-1$
    public String getName() {
    X("Unknown"),

    R("Range"), //$NON-NLS-1$

package org.jkiss.dbeaver.ext.postgresql.model;
 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.NotNull;

    U("User-defined"),
    B("Boolean"),
    S("String"),
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
 */
    E("Enum"),
 * <a href="https://www.postgresql.org/docs/current/catalog-pg-type.html#CATALOG-TYPCATEGORY-TABLE">See in docs</a>
 * Copyright (C) 2010-2024 DBeaver Corp and others
