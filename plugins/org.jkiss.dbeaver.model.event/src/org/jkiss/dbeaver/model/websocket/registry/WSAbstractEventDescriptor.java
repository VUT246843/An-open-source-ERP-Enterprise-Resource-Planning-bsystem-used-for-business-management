
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.model.websocket.registry;
 *
 * Unless required by applicable law or agreed to in writing, software

    @NotNull
    }
 */
 *
    @NotNull
    public String getId() {
        this.id = cfg.getAttribute("id");
 * DBeaver - Universal Database Manager
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    ) {
 * limitations under the License.
        this.implType = new ObjectType(cfg, "class");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}

    @NotNull
import org.jkiss.code.NotNull;
 *
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
abstract class WSAbstractEventDescriptor extends AbstractDescriptor {
    protected WSAbstractEventDescriptor(
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at
    private final String id;
 * you may not use this file except in compliance with the License.
        @NotNull IConfigurationElement cfg
        return id;
import org.eclipse.core.runtime.IConfigurationElement;

 * See the License for the specific language governing permissions and
    protected final ObjectType implType;
        super(cfg);
