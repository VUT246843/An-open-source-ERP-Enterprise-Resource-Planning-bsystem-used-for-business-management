        return parent;

    @Override

            if (value instanceof JsonObject) {
        return name;

    @Override
    public OcientPlanNodeJson(OcientPlanNodeJson parent, Map<String, String> attributes) {

                    this.name = value.getAsString();
import com.google.gson.JsonElement;
    @Override
                }
                if ("type".equals(propName)) {
    }
    //////////////////////////////////////////////////////////
import java.util.*;
 * limitations under the License.

                        break;

    }
    }
    @Override
    public void resetPropertyValue(@Nullable DBRProgressMonitor monitor, @NotNull String id) {
    }
    }
import org.jkiss.code.NotNull;
    public Number getNodeRowCount() {
    private void addNested(String name, JsonObject value) {
    }
        if (nested == null) {
        return CommonUtils.toDouble(readCost);
                if (isProp) {
    public Number getNodeDuration() {

 * you may not use this file except in compliance with the License.
        return nodeProps.get(id.toString());

        Object readCost = nodeProps.get("cost");
                        isProp = true;
                    String strValue = Double.toString(cost / 1000000000) + " GB";
    @Override
            } else if (value instanceof JsonArray) {
        this.parent = parent;
    }

    @Property(order = 1, viewable = true)
                    if (item instanceof JsonObject) {
                    } else {
    @Override
                if ("totalCost".equals(propName)) {
 * You may obtain a copy of the License at
                    nodeProps.put(propName, value.toString());

    private String name;
            JsonElement value = prop.getValue();
        int index = 0;

                } else if ("indexMemUsage".equals(propName) || "queryMemUsage".equals(propName)) {

        return this;
    @Override
        for (Map.Entry<String, JsonElement> prop : object.entrySet()) {
        // don't allow setting/changing values
        this.nodeProps.putAll(attributes);
                null, null, false);
import org.jkiss.dbeaver.model.meta.Property;
                boolean isProp = false;

    }
    }
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
                    nodeProps.put(propName, value.getAsString());
                    Double cost = Double.parseDouble(value.getAsString());
                        addNested(propName + "#" + itemIndex, (JsonObject) item);
    private OcientPlanNodeJson parent;
    public boolean isPropertyResettable(@NotNull String id) {
        }

        return nodeProps;
    @Override
        return props;
    public Object getEditableValue() {
        this.name = name;
 */
        DBPPropertyDescriptor[] props = new DBPPropertyDescriptor[nodeProps.size()];
import org.jkiss.dbeaver.model.preferences.DBPPropertySource;
        return nodeProps.containsKey(id.toString());
    }
        }



    @Nullable
        this.parent = parent;
    @Override
 *
    public String toString() {
    // Properties
    }
    }
import com.google.gson.JsonObject;
    public OcientPlanNodeJson getParent() {
    private JsonObject object;
    public Collection<OcientPlanNodeJson> getNested() {
                addNested(propName, (JsonObject) value);
    public Object getProperty(String name) {
    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public void setPropertyValue(@Nullable DBRProgressMonitor monitor, @NotNull String id, @Nullable Object value) {
                for (JsonElement item : (JsonArray) value) {
    public boolean isPropertySet(@NotNull String id) {
        return null;
    }
        return null;
        return CommonUtils.toLong(rowCount);

    public OcientPlanNodeJson(OcientPlanNodeJson parent, String name, JsonObject object) {
        for (Map.Entry<String, String> attr : nodeProps.entrySet()) {
                    nodeProps.put(propName, strValue);
    @Override

    @NotNull
                    nodeProps.put(propName, strValue);
    }
                }
    @Override
        return nodeProps.get(name);
                        itemIndex++;
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
                }
 *
        return nodeProps.get("id");
        Object rowCount = nodeProps.get("outputCardinality");
            nested = new ArrayList<>();
    }
    }

import org.jkiss.utils.CommonUtils;

 *     http://www.apache.org/licenses/LICENSE-2.0
            props[index++] = new PropertyDescriptor("Details", attr.getKey(), attr.getKey(), null, String.class, false,






    public void resetPropertyValueToDefault(@NotNull String id) {
    public Number getNodePercent() {

    @Override
        return nested;
import org.jkiss.dbeaver.model.impl.PropertyDescriptor;
        return false;
                    Double cost = Double.parseDouble(value.getAsString());
    public DBPPropertyDescriptor[] getProperties() {
 * DBeaver - Universal Database Manager
            }
 * Licensed under the Apache License, Version 2.0 (the "License");


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
    private void parseObject(JsonObject object) {
    }
    }
                    }
        // don't allow setting/changing values
 * Unless required by applicable law or agreed to in writing, software
}
        parseObject(object);
    public Map<String, String> getNodeProps() {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
public class OcientPlanNodeJson extends OcientPlanNode implements DBPPropertySource {
                int itemIndex = 0;
    public Number getNodeCost() {
    @Property(order = 10, viewable = true)
    public String getNodeType() {
                } else {
package org.jkiss.dbeaver.ext.ocient.model.plan;
 *
            String propName = prop.getKey();
 */
    }
    @NotNull
    }
    private Map<String, String> nodeProps = new LinkedHashMap<>();
    public Object getPropertyValue(@Nullable DBRProgressMonitor monitor, @NotNull String id) {
                    String strValue = Double.toString(cost / 1000) + " seconds";

    }

        }
        this.object = object;
    @Override
import org.jkiss.code.Nullable;
    @Override


        nested.add(new OcientPlanNodeJson(this, name, value));
        return object == null ? nodeProps.toString() : object.toString();

    @Override
    @Property(order = 11, viewable = true)
    private List<OcientPlanNodeJson> nested = new ArrayList<>();
        // don't allow setting/changing values
    @Property(order = 0, viewable = true)
            } else {
    }
    public String getNodeName() {
/**
    }
/*
                }
 * Ocient execution plan node based on JSON format
import com.google.gson.JsonArray;
