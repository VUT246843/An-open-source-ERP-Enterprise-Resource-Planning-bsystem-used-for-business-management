
    }
    @NotNull

import org.jkiss.code.NotNull;
}
    private final DBSAttributeBase attribute;

    public void loadSettings(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> attributeSettings) {
        if (CommonUtils.isNotEmpty(type)) {
        return DBValueFormatting.getObjectImage(attribute);
public class StreamMappingAttribute implements DBPNamedObject, DBPImageProvider {
        return mappingType;
import org.jkiss.dbeaver.model.data.json.JSONUtils;
        this.attribute = other.attribute;
        this.container = container;
 * you may not use this file except in compliance with the License.

    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    public String getName() {

    @NotNull
    public StreamMappingAttribute(@NotNull StreamMappingContainer container, @NotNull DBSAttributeBase attribute, @NotNull StreamMappingType mappingType) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public DBPImage getObjectImage() {
 *
        final String type = JSONUtils.getString(attributeSettings, "mappingType");

 * Unless required by applicable law or agreed to in writing, software
    public void saveSettings(@NotNull Map<String, Object> attributeSettings) {
    @Override
import org.jkiss.utils.CommonUtils;
        }
 */
import java.util.Map;
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
    public StreamMappingAttribute(@NotNull StreamMappingContainer container, @NotNull StreamMappingAttribute other) {
 * See the License for the specific language governing permissions and
    }
    }
 * limitations under the License.

    }
package org.jkiss.dbeaver.tools.transfer.stream;
 *

/*
    public void setMappingType(@NotNull StreamMappingType mappingType) {
    }
    }
        attributeSettings.put("mappingType", mappingType.name());
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
    private final StreamMappingContainer container;
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.container = container;
        return container;
    }
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override

    public DBSAttributeBase getAttribute() {
    @NotNull
        return attribute;
    @NotNull


    }
    public StreamMappingType getMappingType() {
import org.jkiss.dbeaver.model.*;
 * DBeaver - Universal Database Manager
        this.mappingType = mappingType;
        this.mappingType = mappingType;
    private StreamMappingType mappingType;
        this.mappingType = other.mappingType;
        return DBUtils.getObjectFullName(attribute, DBPEvaluationContext.UI);
 *
    }
    public StreamMappingContainer getContainer() {

 *     http://www.apache.org/licenses/LICENSE-2.0
        this.attribute = attribute;
            this.mappingType = CommonUtils.valueOf(StreamMappingType.class, type, StreamMappingType.unspecified);
