 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
 *
import java.util.ArrayList;
            if (dsId != null) {
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.model.websocket.registry;
    protected WSEventHandlerDescriptor(IConfigurationElement contributorConfig) {
    private final List<String> supportedTopics = new ArrayList<>();
        } catch (DBException e) {
 */
            }
    private final ObjectType implType;
    @NotNull
    public WSEventHandler getInstance() {
    }
    public List<String> getSupportedTopics() {
 * You may obtain a copy of the License at


            return implType.createInstance(WSEventHandler.class);
 * you may not use this file except in compliance with the License.
                supportedTopics.add(dsId);
import org.jkiss.code.NotNull;

 * Licensed under the Apache License, Version 2.0 (the "License");
 */
/*
        try {
}
 * CB event handler descriptor
            String dsId = dsElement.getAttribute("id");
        return supportedTopics;
    }
 *

        }
import java.util.List;
/**
        super(contributorConfig);

        for (IConfigurationElement dsElement : contributorConfig.getChildren("topic")) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.websocket.WSEventHandler;
        this.implType = new ObjectType(contributorConfig, "class");
 * limitations under the License.
        }
    @NotNull
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            throw new IllegalStateException("Can not instantiate event handler '" + implType.getImplName() + "'", e);
    }
    @NotNull
import org.eclipse.core.runtime.IConfigurationElement;

 *     http://www.apache.org/licenses/LICENSE-2.0
public class WSEventHandlerDescriptor extends AbstractDescriptor {
