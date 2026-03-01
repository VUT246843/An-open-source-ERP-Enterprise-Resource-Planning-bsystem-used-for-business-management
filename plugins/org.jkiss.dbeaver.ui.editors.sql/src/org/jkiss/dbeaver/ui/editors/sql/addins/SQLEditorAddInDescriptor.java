 * limitations under the License.
    
     */
import org.jkiss.dbeaver.DBException;

    private final ObjectType implClass;
     * Create a new instance of an editor add-in
 */
        return implClass.createInstance(SQLEditorAddIn.class);
/**
    private final String id;
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
 *
     * Initialization priority of the add-in. Affects the order in which add-ins would be instantiated and initialized for each editor. 
        this.implClass = new ObjectType(config.getAttribute("class"));
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    /**
 * Configuration descriptor of the SQL Editor add-in
    }
        return priority;
/*
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
    private final int priority;
    /**
 * distributed under the License is distributed on an "AS IS" BASIS,
    public SQLEditorAddIn createInstance() throws DBException {
        this.priority = CommonUtils.toInt(config.getAttribute("priority"));
     */
        this.id = config.getAttribute("id");
        super(config);
    }
    }
 *
 * you may not use this file except in compliance with the License.
import org.eclipse.core.runtime.IConfigurationElement;
package org.jkiss.dbeaver.ui.editors.sql.addins;
public class SQLEditorAddInDescriptor extends AbstractDescriptor {
     * Symbolic identifier of the add-in
        return "SQLEditorAddInDescriptor[id: " + id + ", class: " + implClass.getImplName() + ", priority: " + priority + "]"; //$NON-NLS-1$
import org.jkiss.utils.CommonUtils;
 *
 * DBeaver - Universal Database Manager

 */
    }
}
    SQLEditorAddInDescriptor(IConfigurationElement config) {
    
    public int getPriority() {

    public String getId() {
    @Override
    public String toString() {
     */
    /**
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;

        return id;
