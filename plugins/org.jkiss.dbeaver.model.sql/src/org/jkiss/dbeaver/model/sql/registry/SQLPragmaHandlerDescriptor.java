import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.model.sql.registry;
 *
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.NotNull;
    @NotNull
public class SQLPragmaHandlerDescriptor extends AbstractDescriptor {
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
 *
 */
    private final ObjectType type;
 * See the License for the specific language governing permissions and
    public String getId() {
}


        this.type = new ObjectType(config.getAttribute("class"));
 * Licensed under the Apache License, Version 2.0 (the "License");


        return id;
import org.jkiss.dbeaver.model.sql.SQLPragmaHandler;
    private final String id;
    @NotNull
 * You may obtain a copy of the License at

 * you may not use this file except in compliance with the License.
    public SQLPragmaHandler createHandler() throws DBException {

    protected SQLPragmaHandlerDescriptor(IConfigurationElement config) {
        return type.createInstance(SQLPragmaHandler.class);
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
 *
        this.id = config.getAttribute("id");
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        super(config);
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.core.runtime.IConfigurationElement;
