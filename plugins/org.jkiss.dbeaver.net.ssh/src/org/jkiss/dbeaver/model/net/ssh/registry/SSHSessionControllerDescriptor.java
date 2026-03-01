 * you may not use this file except in compliance with the License.
            synchronized (this) {

import org.jkiss.dbeaver.model.impl.AbstractContextDescriptor;
    private final AbstractDescriptor.ObjectType implClass;
                if (instance == null) {
        return instance;

        this.implClass = new AbstractDescriptor.ObjectType(config.getAttribute(RegistryConstants.ATTR_CLASS));
        super(config);
    }
        return id;
 *
        this.id = config.getAttribute(RegistryConstants.ATTR_ID);
 * You may obtain a copy of the License at
}
        return implClass;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    instance = implClass.createInstance(SSHSessionController.class);
                }
    public ObjectType getImplClass() {
    }
{

 *
 *
            }
        this.label = config.getAttribute(RegistryConstants.ATTR_LABEL);
        return label;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 * Unless required by applicable law or agreed to in writing, software
    }
    static final String EXTENSION_ID = "org.jkiss.dbeaver.net.ssh"; //$NON-NLS-1$
 */
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.DBException;
    {

    private final String label;
public class SSHSessionControllerDescriptor extends AbstractContextDescriptor
/*
        if (instance == null) {
    public String getId() {
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
import org.eclipse.core.runtime.IConfigurationElement;
import org.jkiss.code.NotNull;
    public SSHSessionController getInstance() throws DBException {
        IConfigurationElement config)
    public String getLabel() {
    @NotNull
    private volatile SSHSessionController instance;
        }
    SSHSessionControllerDescriptor(
package org.jkiss.dbeaver.model.net.ssh.registry;
 * SSHImplementationDescriptor


 */
    private final String id;
 *     http://www.apache.org/licenses/LICENSE-2.0
/**

import org.jkiss.dbeaver.registry.RegistryConstants;

 * See the License for the specific language governing permissions and

 * limitations under the License.
import org.jkiss.dbeaver.model.net.ssh.SSHSessionController;


