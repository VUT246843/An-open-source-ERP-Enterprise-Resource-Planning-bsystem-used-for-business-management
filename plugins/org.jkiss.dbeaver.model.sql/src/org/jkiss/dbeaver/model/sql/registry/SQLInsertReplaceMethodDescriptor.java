    }
/*
        this.implClass = new AbstractDescriptor.ObjectType(config.getAttribute("class"));
        this.label = config.getAttribute("label");
        super(config);

    }
        this.description = config.getAttribute("description");
 *


import org.jkiss.dbeaver.DBException;
 * distributed under the License is distributed on an "AS IS" BASIS,
}


import org.eclipse.core.runtime.IConfigurationElement;
    private final String id;
 *
    public SQLInsertReplaceMethodDescriptor(IConfigurationElement config) {
        return id;
public class SQLInsertReplaceMethodDescriptor extends AbstractContextDescriptor implements SQLDialectInsertReplaceMethod {

 * You may obtain a copy of the License at
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.sqlInsertMethod"; //$NON-NLS-1$
 * limitations under the License.


    private final AbstractDescriptor.ObjectType implClass;
        return implClass.createInstance(DBDInsertReplaceMethod.class);
import org.jkiss.dbeaver.model.data.DBDInsertReplaceMethod;
import org.jkiss.dbeaver.model.sql.SQLDialectInsertReplaceMethod;
    public DBDInsertReplaceMethod createInsertMethod() throws DBException {
 * you may not use this file except in compliance with the License.
        return label;
package org.jkiss.dbeaver.model.sql.registry;
 *
    public String getLabel() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
    private final String description;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software

    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.impl.AbstractContextDescriptor;
    }
        return description;
 * DBeaver - Universal Database Manager
    private final String label;
    public String getDescription() {
    }
 * See the License for the specific language governing permissions and
    public String getId() {
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.id = config.getAttribute("id");
