    }
    @NotNull
    private final String description;
 */

    private final int order;
            throw new DBException("Can't create event processor", e);
}
    public String getDescription() {
import java.util.Set;
        return description;

import org.jkiss.dbeaver.DBException;
        return order;
    public <T extends IDataTransferConsumer<?, ?>> IDataTransferEventProcessor<T> create() throws DBException {

 * See the License for the specific language governing permissions and
import org.eclipse.core.runtime.IConfigurationElement;

 * You may obtain a copy of the License at
        this.label = config.getAttribute("label");
    }
 *

    }
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
        return id;
        return label;
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
/*
import org.jkiss.dbeaver.tools.transfer.IDataTransferConsumer;
    @NotNull

                .getImplClass(IDataTransferEventProcessor.class)
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public String getId() {
public class DataTransferEventProcessorDescriptor extends AbstractDescriptor {
                .getDeclaredConstructor()
    @NotNull
        type.checkObjectClass(IDataTransferEventProcessor.class);
import java.util.HashSet;
    }
 *
        this.description = config.getAttribute("description");
 * you may not use this file except in compliance with the License.
        this.id = config.getAttribute("id");
    }
            return type
    public String getLabel() {
 *

        this.type = new ObjectType(config.getAttribute("class"));
package org.jkiss.dbeaver.tools.transfer.registry;

        try {
    @SuppressWarnings("unchecked")
        return applicableNodeIds.contains(nodeId);
import org.jkiss.dbeaver.tools.transfer.IDataTransferEventProcessor;
    public boolean isApplicable(@NotNull String nodeId) {
    @NotNull
import org.jkiss.code.NotNull;
    protected DataTransferEventProcessorDescriptor(@NotNull IConfigurationElement config) {
    }

        } catch (Throwable e) {
        this.applicableNodeIds = new HashSet<>(Arrays.asList(config.getAttribute("nodes").split(",")));
    private final String label;
    }
        return type;
import java.util.Arrays;

 * limitations under the License.
import org.jkiss.utils.CommonUtils;
        super(config);

    private final ObjectType type;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
        this.order = CommonUtils.toInt(config.getAttribute("order"));
 *     http://www.apache.org/licenses/LICENSE-2.0
    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private final Set<String> applicableNodeIds;
        }
    private final String id;

                .newInstance();
    }
    public int getOrder() {
    public ObjectType getType() {
