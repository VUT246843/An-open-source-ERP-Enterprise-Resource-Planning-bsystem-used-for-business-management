 * distributed under the License is distributed on an "AS IS" BASIS,
    SerializerDescriptor(IConfigurationElement config) {
        this.distributed = CommonUtils.getBoolean(config.getAttribute("supportsDistributedMode"), true);
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
 * Licensed under the Apache License, Version 2.0 (the "License");
 *

{
public class SerializerDescriptor extends AbstractDescriptor
    public DTObjectSerializer createSerializer() throws DBException {
    private boolean distributed;

 */
        this.serializerType = new ObjectType(config.getAttribute("class"));
 * See the License for the specific language governing permissions and

    private String id;

    public String getId() {

    }
 * Unless required by applicable law or agreed to in writing, software
    }
import org.jkiss.dbeaver.Log;
 * SerializerDescriptor
    }
 * limitations under the License.
import org.eclipse.core.runtime.IConfigurationElement;
        super(config);
 */
        this.id = config.getAttribute("id");
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    private ObjectType serializerType;

}

import org.jkiss.utils.CommonUtils;
    private static final Log log = Log.getLog(SerializerDescriptor.class);
        return distributed;
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.serialize"; //$NON-NLS-1$
    public boolean isDistributed() {
/*
import org.jkiss.dbeaver.DBException;
package org.jkiss.dbeaver.tools.transfer.serialize;


        return serializerType.createInstance(DTObjectSerializer.class);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
        return id;
 * Copyright (C) 2010-2024 DBeaver Corp and others
/**
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
    }

