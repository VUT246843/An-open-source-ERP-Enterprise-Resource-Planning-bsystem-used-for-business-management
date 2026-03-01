    // for tables and views in both the DEFAULT schema, as well as the INFORMATION_SCHEMA
    
        return super.isSystemSchema(schema);
    // and SPANNER_SYS schemas.
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.utils.CommonUtils;
        return true;
 * You may obtain a copy of the License at
        }
/**
 * Copyright (C) 2010-2024 DBeaver Corp and others
        if (schema != null && CommonUtils.isNotEmpty(schema.getName())) {
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
    // default schema will be shown as 'DEFAULT' in DBeaver, and enables auto complete
public class SpannerMetaModel extends GenericMetaModel {
 * See the License for the specific language governing permissions and
    public boolean isSystemSchema(GenericSchema schema) {
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;

    public SpannerMetaModel() {
    }
 * Unless required by applicable law or agreed to in writing, software
            return "INFORMATION_SCHEMA".equals(schema.getName()) || "SPANNER_SYS".equals(schema.getName());

 * DBeaver - Universal Database Manager

/*
    }
}
 *
 *
package org.jkiss.dbeaver.ext.spanner.model;
 */
    public boolean supportsNullSchemas() {
import org.jkiss.dbeaver.ext.generic.model.GenericSchema;
 * distributed under the License is distributed on an "AS IS" BASIS,
    // The default schema in Cloud Spanner is an empty string. This ensures that this
 * limitations under the License.
 * Spanner meta model
 *
 * you may not use this file except in compliance with the License.
    }

