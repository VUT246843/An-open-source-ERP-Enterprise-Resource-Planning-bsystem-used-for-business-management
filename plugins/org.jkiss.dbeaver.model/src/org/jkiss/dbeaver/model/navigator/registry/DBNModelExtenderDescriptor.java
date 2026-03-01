        return id;
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.implType = new ObjectType(config, "class");
    }

    private final boolean isRoot;
        this.isRoot = CommonUtils.toBoolean(config.getAttribute("root"));
 *     http://www.apache.org/licenses/LICENSE-2.0

    public boolean isRoot() {
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
import org.jkiss.dbeaver.DBException;
        return isRoot;
package org.jkiss.dbeaver.model.navigator.registry;
import org.jkiss.dbeaver.model.navigator.DBNModelExtender;
        return instance;
import org.jkiss.utils.CommonUtils;
        this.id = config.getAttribute("id");
 */

    DBNModelExtenderDescriptor(IConfigurationElement config) {
 * Model extender descriptor

    }
    private DBNModelExtender instance;
 * limitations under the License.
    public String toString() {
 * distributed under the License is distributed on an "AS IS" BASIS,
/**

 *
        return implType;
 * You may obtain a copy of the License at
        if (instance == null) {
}

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * DBeaver - Universal Database Manager
        super(config);
    public DBNModelExtender getInstance() throws DBException {
    }
    }
    }

    }

 * Unless required by applicable law or agreed to in writing, software
 *
import org.eclipse.core.runtime.IConfigurationElement;
/*
 */
 * See the License for the specific language governing permissions and
            instance = implType.createInstance(DBNModelExtender.class);
 * you may not use this file except in compliance with the License.
    public String getId() {
    private String id;
        }
    private ObjectType implType;
public class DBNModelExtenderDescriptor extends AbstractDescriptor {
    @Override

 * Copyright (C) 2010-2024 DBeaver Corp and others
        return id;
    public ObjectType getImplType() {
