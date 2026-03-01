    @Override



            if (nested != null) {
                for (JsonElement item : (JsonArray) value) {
                if (childRC != null) {
                return totalCost;
                nodeProps.put(propName, value.getAsString());
 *

    }
            }
    @Property(order = 11, viewable = true)
    }
        }
                    totalRC += childRC.longValue();
        // noting to do
import java.util.*;
                }
        return CommonUtils.toDouble(readCost);
    @Override
package org.jkiss.dbeaver.ext.oceanbase.model.plan;
        return this;
    }
    public void resetPropertyValue(@Nullable DBRProgressMonitor monitor, @NotNull String id) {
        return nodeProps.get(id);
                    if (childCost != null) {
        return Collections.unmodifiableMap(nodeProps);
            if (value instanceof JsonObject) {
    }
    public String getNodeName() {
    public Number getNodeRowCount() {
    }
        if (readCost == null) {
            String propName = prop.getKey();
        return name;
 *
import com.google.gson.JsonElement;
        this.parent = parent;
        }
    }
                if ("cost_info".equals(propName)) {
    public Collection<OceanbasePlanNodeJSON> getNested() {
                int itemIndex = 0;
    private JsonObject object;
 * DBeaver - Universal Database Manager
                }

    }
 * Unless required by applicable law or agreed to in writing, software
    public void setPropertyValue(@Nullable DBRProgressMonitor monitor, @NotNull String id, @Nullable Object value) {
                        totalCost += childCost.longValue();
    @Override
                } else if ("table".equals(propName) && "query_block".equals(objName)) {


 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
                        break;

    @Override
    private final Map<String, String> nodeProps = new LinkedHashMap<>();
    private final List<OceanbasePlanNodeJSON> nested = new ArrayList<>();
 *
    }
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others
                    parseObject(propName, (JsonObject) value);

    private final OceanbasePlanNodeJSON parent;
                        addNested(propName + "#" + itemIndex, (JsonObject) item);
import org.jkiss.dbeaver.model.impl.plan.AbstractExecutionPlanNode;

                    this.name = "table";
        parseObject(name, object);


    }
        this.nodeProps.putAll(attributes);
 * See the License for the specific language governing permissions and
    
        return null;
                    }
    @Override
        }
        }
    }
import com.google.gson.JsonArray;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            }
    public DBPPropertyDescriptor[] getProperties() {
        int index = 0;
        nested.add(new OceanbasePlanNodeJSON(this, name, value));
        Object nodeName = nodeProps.get("table_name");
 */
    @Override
            if (accessType != null) {

            } else {
        return object == null ? nodeProps.toString() : object.toString();
    public String getNodeType() {
        this.name = name;
        for (Map.Entry<String, String> attr : nodeProps.entrySet()) {
import org.jkiss.dbeaver.model.meta.Property;
                Number childRC = child.getNodeRowCount();
                boolean isProp = false;

                    if (item instanceof JsonObject) {
import org.jkiss.code.Nullable;
            } else if (value instanceof JsonArray) {

    @Override
    @NotNull
    @Override
        return nodeName == null ? null : String.valueOf(nodeName);
/*
    @Override
    @Property(order = 0, viewable = true)
                } else if ("query_block".equals(propName)) {
        Object readCost = nodeProps.get("COST");
                }
        return false;
    }
    @Nullable
        this.parent = parent;

    @Property(order = 1, viewable = true)
            return totalRC;
                return nodeName + " (" + accessType + ")";
    }
    public Object getEditableValue() {
    }
    }
                    parseObject(propName, (JsonObject) value);
        return null;

            long totalRC = 0;

    private void addNested(String name, JsonObject value) {
    Object getProperty(String name) {
                    addNested(propName, (JsonObject) value);
    @Override
    }
            }
                    null, null, false);
import org.jkiss.dbeaver.model.exec.plan.DBCPlanCostNode;
        return parent;
    private String name;

    public String toString() {
        // noting to do


    @Override

            }
import org.jkiss.dbeaver.model.impl.PropertyDescriptor;
        for (Map.Entry<String, JsonElement> prop : object.entrySet()) {
    private void parseObject(String objName, JsonObject object) {
        }
    OceanbasePlanNodeJSON(OceanbasePlanNodeJSON parent, String name, JsonObject object) {

            return null;

                    Number childCost = child.getNodeCost();
import org.jkiss.code.NotNull;
                        itemIndex++;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public boolean isPropertySet(@NotNull String id) {
                    nodeProps.put(propName, value.toString());
    }

    OceanbasePlanNodeJSON(OceanbasePlanNodeJSON parent, Map<String, String> attributes) {
                    }
    @Property(order = 10, viewable = true)
    public void resetPropertyValueToDefault(@NotNull String id) {
    @Override
    @Override

    public boolean isPropertyResettable(@NotNull String id) {
        return false;// attributes.containsKey(id.toString());
import com.google.gson.JsonObject;
    @NotNull
        DBPPropertyDescriptor[] props = new DBPPropertyDescriptor[nodeProps.size()];
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
    public Number getNodeDuration() {
                    this.name = "query_block";
 * You may obtain a copy of the License at
                    } else {
            props[index++] = new PropertyDescriptor("Details", attr.getKey(), attr.getKey(), null, String.class, false,
    @Override

    }
import org.jkiss.utils.CommonUtils;

    }
                }
                }
    }

class OceanbasePlanNodeJSON extends AbstractExecutionPlanNode implements DBCPlanCostNode, DBPPropertySource {
                    parseObject(propName, (JsonObject) value);
    @Override
    public Object getPropertyValue(@Nullable DBRProgressMonitor monitor, @NotNull String id) {
        if (rowCount == null && nested != null) {
            Object accessType = nodeProps.get("access_type");
                long totalCost = 0;
                } else {
        this.object = object;
        return props;
            JsonElement value = prop.getValue();
}
                for (OceanbasePlanNodeJSON child : nested) {
    public OceanbasePlanNodeJSON getParent() {
    @Override
    public Number getNodePercent() {
    }
                        isProp = true;
                if (isProp) {
        // noting to do
import org.jkiss.dbeaver.model.preferences.DBPPropertySource;
    public Number getNodeCost() {
        return nested;
            for (OceanbasePlanNodeJSON child : nested) {
    }
        Object rowCount = nodeProps.get("EST.ROWS");
        if (nodeName != null) {
    }

    }
        return rowCount == null ? null : CommonUtils.toLong(rowCount);
    @Override

 * limitations under the License.
        return nodeProps.get(name);
 * distributed under the License is distributed on an "AS IS" BASIS,
    Map<String, String> getNodeProps() {
