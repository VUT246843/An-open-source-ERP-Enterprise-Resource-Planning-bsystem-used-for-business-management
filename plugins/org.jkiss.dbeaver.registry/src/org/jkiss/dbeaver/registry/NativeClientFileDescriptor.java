
/*

 *     http://www.apache.org/licenses/LICENSE-2.0
        this.type = config.getAttribute(RegistryConstants.ATTR_TYPE);
 *
 * limitations under the License.
 * NativeClientDistributionDescriptor

        return name;
 * See the License for the specific language governing permissions and
        return name;
 * Licensed under the Apache License, Version 2.0 (the "License");

package org.jkiss.dbeaver.registry;
    private String name;
        }
 * Unless required by applicable law or agreed to in writing, software
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class NativeClientFileDescriptor {
 *
    }
 *
    public String toString() {
    public String getType() {
        return type;
        while (name.startsWith("/")) {

/**
    }
    public String getName() {
        this.name = config.getAttribute(RegistryConstants.ATTR_NAME);
 */
    }

 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
 * You may obtain a copy of the License at

            name = name.substring(1);

 * you may not use this file except in compliance with the License.
    private String type;
import org.eclipse.core.runtime.IConfigurationElement;
    }
}
 * DBeaver - Universal Database Manager
    public NativeClientFileDescriptor(IConfigurationElement config) {
