    private String name;
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.description = cf.getAttribute(RegistryConstants.ATTR_DESCRIPTION);
            }

        this.lazyWrapper = new ObjectType(cf.getAttribute(ERDUIConstants.ATTR_ERD_NOTATION));
import org.jkiss.dbeaver.Log;
    private String id;
    }

     * @return - Notation instance
 * limitations under the License.


     */
    }
import org.jkiss.dbeaver.DBException;
    /**
 * DBeaver - Universal Database Manager
    public String getDescription() {
import org.eclipse.core.runtime.CoreException;
    public String getId() {

    public ERDNotation getNotation() {
    private String description;
}
import org.eclipse.core.runtime.IConfigurationElement;
    public String getName() {

    Log log = Log.getLog(ERDNotationDescriptor.class.getName());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


import org.jkiss.dbeaver.registry.RegistryConstants;
                notation = lazyWrapper.createInstance(ERDNotation.class);
        return notation;


 */
    private ERDNotation notation;
     * The method instantiate ERDNotation object
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.ui.editors.erd.notations;
    protected ERDNotationDescriptor(IConfigurationElement cf) throws CoreException {
 * Unless required by applicable law or agreed to in writing, software
        return id;
        }
 * you may not use this file except in compliance with the License.
 *
        this.name = cf.getAttribute(RegistryConstants.ATTR_NAME);
import org.jkiss.dbeaver.ui.editors.erd.ERDUIConstants;
 * distributed under the License is distributed on an "AS IS" BASIS,
     *
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
public class ERDNotationDescriptor extends AbstractDescriptor {
        super(cf);
                log.error(e.getMessage());
        if (notation == null) {
    }
 * You may obtain a copy of the License at
 *
            try {
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
        return description;
 *
            } catch (DBException e) {
        return name;
    }
        this.id = cf.getAttribute(RegistryConstants.ATTR_ID);
    private ObjectType lazyWrapper;
 * See the License for the specific language governing permissions and
/*
