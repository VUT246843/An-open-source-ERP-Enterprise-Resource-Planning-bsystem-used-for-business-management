        try {
     * Get flag of supported attribute association

    private final String description;
        return isEnableAttributeAssociation;
 * Licensed under the Apache License, Version 2.0 (the "License");
    /**
import org.eclipse.core.runtime.CoreException;

public class ERDConnectionRouterDescriptor extends AbstractDescriptor {
    public String getName() {
    }

import org.jkiss.dbeaver.registry.RegistryConstants;
        super(cf);
     */
        }
 */
     * Create contributed router type

        } catch (DBException e) {
    private final ObjectType lazyRouter;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
        this.isDefault = CommonUtils.toBoolean(cf.getAttribute(RegistryConstants.ATTR_DEFAULT));
    private final String name;
     * Description
import org.jkiss.dbeaver.Log;
     *
 *
     * @return - true if support attributes enabled
    }
     */

     */
import org.jkiss.utils.CommonUtils;
import org.eclipse.core.runtime.IConfigurationElement;
 * You may obtain a copy of the License at
     */
        this.id = cf.getAttribute(RegistryConstants.ATTR_ID);
        this.isEnableAttributeAssociation = CommonUtils.toBoolean(cf.getAttribute(ERDUIConstants.ATTR_ERD_SUPPORT_ATTRIBUTES_ASSOCIATION));
    private final String id;
        return isDefault;
    /**
    /**

    public boolean isDefaultRouter() {
import org.jkiss.dbeaver.DBException;
        this.lazyRouter = new ObjectType(cf.getAttribute(ERDUIConstants.ATTR_ERD_ROUTER));

 * The class descriptor of representing visual connection between figures

        this.description = cf.getAttribute(RegistryConstants.ATTR_DESCRIPTION);
    }
 * DBeaver - Universal Database Manager
/**
        return null;
 * you may not use this file except in compliance with the License.
     * Id
    public boolean supportedAttributeAssociation() {
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
 * limitations under the License.

     */
 *
    private final boolean isEnableAttributeAssociation;
        return id;
    private final static Log log = Log.getLog(ERDConnectionRouterDescriptor.class.getName());

    }
            log.error(e.getMessage());
 *     http://www.apache.org/licenses/LICENSE-2.0
        return description;
        this.name = cf.getAttribute(RegistryConstants.ATTR_NAME);
 * distributed under the License is distributed on an "AS IS" BASIS,

 * See the License for the specific language governing permissions and
    }
    protected ERDConnectionRouterDescriptor(IConfigurationElement cf) throws CoreException {
    public String getDescription() {
    }
            return lazyRouter.createInstance(ERDConnectionRouter.class);
    public ERDConnectionRouter createRouter() {
 */
}
     * Name
        return name;
    }
 *
package org.jkiss.dbeaver.ui.editors.erd.router;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.ui.editors.erd.ERDUIConstants;
 * Unless required by applicable law or agreed to in writing, software
    /**
    public String getId() {
    private final boolean isDefault;
    /**
