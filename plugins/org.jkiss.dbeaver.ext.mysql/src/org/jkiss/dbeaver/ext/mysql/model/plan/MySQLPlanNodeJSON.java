                }
    @Override

 * MySQL execution plan node based on JSON format
            new MySQLPlanNodeJSON(this, name, value)
    public MySQLPlanNodeJSON getParent() {
                    if (item instanceof JsonObject) {
 * Licensed under the Apache License, Version 2.0 (the "License");

                nodeProps.put(propName, value.getAsString());
    }

}
        return this;
import org.jkiss.dbeaver.model.meta.Property;
                    }
 * you may not use this file except in compliance with the License.
    private JsonObject object;
    @Override
    }
    @Override
        this.nodeProps.putAll(attributes);
    }


    public Map<String, Object> getNodeProps() {
                attr.getKey(),
                }
    }

    // Properties
        return object == null ? nodeProps.toString() : object.toString();
    @Override
    }
            if (rowCount == null) {
    public MySQLPlanNodeJSON(MySQLPlanNodeJSON parent, String name, JsonObject object) {

            String propName = prop.getKey();

    public String toString() {
                    this.name = "table";
                    Number childCost = child.getNodeCost();
    }
    public void resetPropertyValueToDefault(@NotNull String id) {
    private void parseObject(String objName, JsonObject object) {
    public Number getNodeRowCount() {
            props[index++] = new PropertyDescriptor(
                long totalCost = 0;
        }
                null,
    @Override
                    }
        Object rowCount = nodeProps.get("rows_examined_per_scan");
                    } else {
        Object readCost = nodeProps.get("read_cost");
    public Object getEditableValue() {
            rowCount = nodeProps.get("rows"); // MariaDB-specific plan
                false,
        );
        this.parent = parent;
    public String getNodeType() {

        }
    }
        if (nested == null) {
                }
import com.google.gson.JsonArray;
            if (accessType != null) {
    @Property(order = 10, viewable = true)
            nested = new ArrayList<>();
    @NotNull
    public Number getNodeCost() {
    }
            if (nested != null) {
                null,
                attr.getKey(),
        if (readCost == null) {
        return nodeProps;
    @Override
        if (rowCount == null) {
    @Override
                    parseObject(propName, (JsonObject) value);
    @Property(order = 11, viewable = true)
        parseObject(name, object);
import com.google.gson.JsonElement;
                    nodeProps.put(propName, value.toString());
            readCost = nodeProps.get("query_cost");


                boolean isProp = false;

        return nodeProps.get(name);
                        Number childRC = child.getNodeRowCount();
                "Details",
import org.jkiss.code.Nullable;
    }

    private void addNested(String name, JsonObject value) {
/*
                    addNested(propName, (JsonObject) value);
        }
                        itemIndex++;
    public void resetPropertyValue(@Nullable DBRProgressMonitor monitor, @NotNull String id) {
    }
import org.jkiss.dbeaver.model.impl.PropertyDescriptor;
        this.object = object;
    }
        }
        for (Map.Entry<String, Object> attr : nodeProps.entrySet()) {
                if (isProp) {
    }


    @Override
                }
 * distributed under the License is distributed on an "AS IS" BASIS,

            } else {
public class MySQLPlanNodeJSON extends MySQLPlanNode implements DBPPropertySource {
 * DBeaver - Universal Database Manager
 */
                    return totalRC;
                }
    public boolean isPropertyResettable(@NotNull String id) {
        if (nodeName == null) {
 *
    public MySQLPlanNodeJSON(MySQLPlanNodeJSON parent,  Map<String, Object> attributes) {
                        totalCost += childCost.longValue();
        return parent;

 * See the License for the specific language governing permissions and
        return nested;
    @Override
        for (Map.Entry<String, JsonElement> prop : object.entrySet()) {

                } else if ("query_block".equals(propName)) {
    @Property(order = 0, viewable = true)
    @Override
                if (nested != null) {
        return CommonUtils.toDouble(readCost);
    }
package org.jkiss.dbeaver.ext.mysql.model.plan;
        int index = 0;
    public Number getNodePercent() {
        return null;
                int itemIndex = 0;

 * limitations under the License.
import com.google.gson.JsonObject;
            Object accessType = nodeProps.get("access_type");
    //////////////////////////////////////////////////////////
    private String name;

        if (readCost == null) {
        } else {
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
 * You may obtain a copy of the License at
    }
        DBPPropertyDescriptor[] props = new DBPPropertyDescriptor[nodeProps.size()];
import java.util.*;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
    @Nullable
    }
                    parseObject(propName, (JsonObject) value);
    }
                return nodeName + " (" + accessType + ")";

        Object nodeName = nodeProps.get("table_name");
        if (readCost == null) {
        }
                    for (MySQLPlanNodeJSON child : nested) {

                null,
                            totalRC += childRC.longValue();

 * Unless required by applicable law or agreed to in writing, software

            }
            }
import org.jkiss.code.NotNull;
    public Number getNodeDuration() {
                    parseObject(propName, (JsonObject) value);
                        addNested(propName + "#" + itemIndex, (JsonObject) item);
        nested.add(
import org.jkiss.utils.CommonUtils;
    @NotNull
    }
    }
 */
        return null;
    private List<MySQLPlanNodeJSON> nested = new ArrayList<>();
        return nodeProps.get(id);
                    long totalRC = 0;
    @Property(order = 1, viewable = true)
    @Override
    }
        return false;//attributes.containsKey(id.toString());
    public void setPropertyValue(@Nullable DBRProgressMonitor monitor, @NotNull String id, @Nullable Object value) {

                        isProp = true;
import org.jkiss.dbeaver.model.preferences.DBPPropertySource;
                    if (childCost != null) {
                        if (childRC != null) {
                for (MySQLPlanNodeJSON child : nested) {


                } else if ("table".equals(propName) && "query_block".equals(objName)) {
 *
        return false;

        this.parent = parent;
    }
                        }
                false);
    @Override
            if (value instanceof JsonObject) {
    }
 *
                return totalCost;
            } else if (value instanceof JsonArray) {
/**
                for (JsonElement item : (JsonArray) value) {


        return rowCount == null ? null : CommonUtils.toLong(rowCount);
    }
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
        return name;
                } else {
    }
                if ("cost_info".equals(propName)) {
    private Map<String, Object> nodeProps = new LinkedHashMap<>();


            readCost = nodeProps.get("cost");
                String.class,

        return nodeName == null ? null : String.valueOf(nodeName);
    private MySQLPlanNodeJSON parent;
    public Collection<MySQLPlanNodeJSON> getNested() {
            }
    public boolean isPropertySet(@NotNull String id) {
    public Object getProperty(String name) {
                    }
        }
    public DBPPropertyDescriptor[] getProperties() {
        this.name = name;
    public Object getPropertyValue(@Nullable DBRProgressMonitor monitor, @NotNull String id) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        }

        }
    public String getNodeName() {
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return props;
                        break;
            return null;
    @Override
                    this.name = "query_block";
    @Override
            }
            JsonElement value = prop.getValue();
