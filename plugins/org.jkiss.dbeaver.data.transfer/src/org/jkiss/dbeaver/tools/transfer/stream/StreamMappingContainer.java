        boolean valid = false;
        }
import java.util.List;

        this.attributes = new ArrayList<>();
        }
    }
            if (attribute.getMappingType() == StreamMappingType.unspecified) {
    @Override

 * You may obtain a copy of the License at
                for (DBSAttributeBase attribute : DTUtils.getAttributes(monitor, source, this)) {
                    e
            if (attributeSettings != null) {
            .map(StreamMappingAttribute::getMappingType)
                monitor.done();
    }
import org.jkiss.dbeaver.DBException;
import org.jkiss.code.Nullable;
        containerSettings.put("attributes", attributesSettings);
            } finally {
            }
        } else {
        }
        return DBIcon.TREE_TABLE;
 * you may not use this file except in compliance with the License.

            this.attributes.add(new StreamMappingAttribute(this, attribute));
    private final DBSDataContainer source;
    @Nullable
            if (attribute.getMappingType() == StreamMappingType.export) {
package org.jkiss.dbeaver.tools.transfer.stream;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                return false;
            if (mappingAttribute.getAttribute().getName().equals(sourceAttribute.getName())) {
        return valid;
            }
                    DTMessages.stream_transfer_consumer_title_attributes_read_failed,
            .toArray(StreamMappingType[]::new);
            return types[0];
            final Map<String, Object> attributeSettings = new LinkedHashMap<>();
        this.attributes = new ArrayList<>();
 * Unless required by applicable law or agreed to in writing, software
        for (StreamMappingAttribute attribute : attributes) {
            } catch (DBException e) {

        this.source = other.source;
    @Nullable
import org.jkiss.dbeaver.tools.transfer.internal.DTMessages;
                    attributes.add(new StreamMappingAttribute(this, attribute, StreamMappingType.unspecified));
 *
    }
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
 *
    }
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
            attribute.saveSettings(attributeSettings);

import java.util.ArrayList;
 * See the License for the specific language governing permissions and
    }
/*
        return DBUtils.getObjectFullName(source, DBPEvaluationContext.UI);
        final Map<String, Object> attributes = JSONUtils.getObject(containerSettings, "attributes");
        final StreamMappingType[] types = attributes.stream()
            }
                valid = true;
import java.util.LinkedHashMap;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        for (StreamMappingAttribute attribute : attributes) {
            final Map<String, Object> attributeSettings = JSONUtils.getObjectOrNull(attributes, attribute.getName());
    }
        for (StreamMappingAttribute mappingAttribute : attributes) {

    private final List<StreamMappingAttribute> attributes;
            }

        }
        final Map<String, Object> attributesSettings = new LinkedHashMap<>();
                attribute.loadSettings(monitor, attributeSettings);
        return source;
import org.jkiss.dbeaver.model.data.json.JSONUtils;
    public String getName() {
            attributesSettings.put(attribute.getName(), attributeSettings);
        if (types.length == 1) {
        for (StreamMappingAttribute attribute : other.attributes) {
    public StreamMappingContainer(@NotNull DBSDataContainer source) {

        }
import java.util.Map;
 * limitations under the License.
import org.jkiss.dbeaver.model.*;
    @NotNull
    @NotNull
        return null;
public class StreamMappingContainer implements DBPNamedObject, DBPImageProvider {
        }

    @Override
                monitor.beginTask("Load attributes from '" + getName() + "'", 1);

    public DBSDataContainer getSource() {
                );

 *

import org.jkiss.dbeaver.runtime.DBWorkbench;
    public boolean isComplete() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    public StreamMappingType getMappingType() {




                DBWorkbench.getPlatformUI().showError(
    public DBPImage getObjectImage() {
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
 *     http://www.apache.org/licenses/LICENSE-2.0

    public void setMappingType(@NotNull StreamMappingType type) {
            try {
        for (StreamMappingAttribute attribute : getAttributes(monitor)) {
    public StreamMappingAttribute getAttribute(@NotNull DBSAttributeBase sourceAttribute) {
    public StreamMappingContainer(@NotNull StreamMappingContainer other) {
import org.jkiss.dbeaver.tools.transfer.DTUtils;
                    NLS.bind(DTMessages.stream_transfer_consumer_message_cannot_get_attributes_from, getName()),
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    public void loadSettings(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> containerSettings) {
        for (StreamMappingAttribute attribute : attributes) {
    public List<StreamMappingAttribute> getAttributes(@NotNull DBRProgressMonitor monitor) {
        }
    }


 */
}
                return mappingAttribute;
    @NotNull
    public void saveSettings(@NotNull Map<String, Object> containerSettings) {
        this.source = source;
            .distinct()
                }
    }
            return null;
        }

            }
import org.eclipse.osgi.util.NLS;
    @NotNull
    }
    }
import org.jkiss.code.NotNull;
            attribute.setMappingType(type);
        return attributes;
        if (attributes.isEmpty()) {
