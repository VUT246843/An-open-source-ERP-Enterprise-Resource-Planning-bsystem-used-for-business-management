    private final String id;
        throws DBException {
 *
    private final String label;

        this.formatterImplClass = new AbstractDescriptor.ObjectType(config.getAttribute("class"));

        super(config);
 * limitations under the License.
    public String getLabel() {
}
    public SQLFormatterDescriptor(IConfigurationElement config) {
 */
    }
        return label;

        this.description = config.getAttribute("description");
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 * DBeaver - Universal Database Manager
/**
 * Licensed under the Apache License, Version 2.0 (the "License");
    private final AbstractDescriptor.ObjectType formatterImplClass;


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.impl.AbstractContextDescriptor;

package org.jkiss.dbeaver.model.sql.registry;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and

    public SQLFormatter createFormatter()

        this.id = config.getAttribute("id");
 *
 * Unless required by applicable law or agreed to in writing, software
 */
    @NotNull
    }
        return id;
    public String getDescription() {
    }
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
        this.label = config.getAttribute("label");
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;

 * you may not use this file except in compliance with the License.
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.sqlFormatter"; //$NON-NLS-1$
import org.jkiss.dbeaver.DBException;

 * SQLFormatterDescriptor
        return formatterImplClass.createInstance(SQLFormatter.class);
import org.jkiss.dbeaver.model.sql.format.SQLFormatter;
        return description;
    public String getId() {
 * You may obtain a copy of the License at
    private final String description;
public class SQLFormatterDescriptor extends AbstractContextDescriptor {
import org.jkiss.code.NotNull;
import org.eclipse.core.runtime.IConfigurationElement;
 *

/*
