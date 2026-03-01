
        JsonArray attrs =  data.getAsJsonArray(AbstractExecutionPlanSerializer.PROP_ATTRIBUTES);
    }

 */
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataSource;

import com.google.gson.JsonObject;
 */
import java.util.Map;
}
 * See the License for the specific language governing permissions and
        super(dataSource, parent);
package org.jkiss.dbeaver.ext.postgresql.model.plan;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*


 * DBeaver - Universal Database Manager
 * Copyright (C) 2019 Andrew Khitrin (ahitrin@gmail.com)

        attributes.put(PostgrePlanNodeBase.ATTR_NODE_TYPE, data.get(AbstractExecutionPlanSerializer.PROP_TYPE).getAsString());
        for(JsonElement attr : attrs) {
 * distributed under the License is distributed on an "AS IS" BASIS,
/**
            if (props.length > 0) {

 * You may obtain a copy of the License at

                attributes.put(p.getKey(), p.getValue().getAsString());
 *
        setAttributes(attributes);
 *
            Object[] props =   attr.getAsJsonObject().entrySet().toArray();
 *
 * Licensed under the Apache License, Version 2.0 (the "License");

import java.util.HashMap;
public class PostgrePlanNodeExternal extends PostgrePlanNodeBase<PostgrePlanNodeExternal> {
    }

                Entry<String, JsonElement> p = (Entry<String, JsonElement>) props[0];

import java.util.Map.Entry;
    private PostgrePlanNodeExternal(PostgreDataSource dataSource, PostgrePlanNodeExternal parent) {
        super(dataSource, parent);
            }

import com.google.gson.JsonElement;
        Map<String, String> attributes = new HashMap<String, String>(); 
import org.jkiss.dbeaver.model.impl.plan.AbstractExecutionPlanSerializer;

 * Unless required by applicable law or agreed to in writing, software

        }
    protected PostgrePlanNodeExternal(PostgreDataSource dataSource, JsonObject data, PostgrePlanNodeExternal parent) {
import com.google.gson.JsonArray;
 * Plan node loaded from external JSON file
 * you may not use this file except in compliance with the License.
 * limitations under the License.
