
import org.jkiss.utils.CommonUtils;

    public static final String PROP_ATTRIBUTES = "attributes";
        
package org.jkiss.dbeaver.model.impl.plan;


        nodeJson.add(PROP_COND, new JsonPrimitive(CommonUtils.notEmpty(node.getNodeCondition())));
    /**


    public static final String PROP_CHILD = "child";

    public static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.exec.plan.DBCQueryPlannerSerialInfo;
        return queryElement.getAsString();

    public static final String PROP_SIGNATURE = "signature";
                attributes.put(p.getKey(), p.getValue());
        
            nodeJson.add(PROP_CHILD, nodes);
            for (JsonElement attr : (JsonArray)attrs) {
    public static final String PROP_DESC = "desc";

    public static final String PROP_DATE = "date";
    public static final String PROP_NAME = "name";
        Map<String, String> attributes = new HashMap<>();


            }

    }
    public static final String PROP_VERSION = "version";
import org.jkiss.dbeaver.model.exec.plan.DBCQueryPlannerSerializable;
            }
        JsonElement queryElement = o.get(AbstractExecutionPlanSerializer.PROP_SQL);

        JsonObject nodeJson = new JsonObject();
        root.add(PROP_NODES, nodes);
        return queryElement.getAsString();

        }
                    attributes.put(p.getKey(), p.getValue().getAsString());
        return attributes;
            for (Map.Entry<String, JsonElement> p : ((JsonObject)attrs).entrySet()) {
        info.addNodeProperties(node,nodeJson);
        } else if (attrs instanceof JsonObject) {
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others
     */
 * you may not use this file except in compliance with the License.
            
    
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
 *

                nodes.add(serializeNode(childNode,info));
        

import org.jkiss.code.NotNull;
 * Copyright (C) 2019 Andrew Khitrin (ahitrin@gmail.com)
    public static final String PROP_KIND = "kind";
    /**


     * @param nodeObject json node object
        JsonElement queryElement = o.get(AbstractExecutionPlanSerializer.PROP_VERSION);
    protected void serializeJson(Writer writer, DBCPlan plan, String signature, DBCQueryPlannerSerialInfo info) throws IOException {
    }

        root.add(PROP_DATE, new JsonPrimitive(LocalDateTime.now().toString()));
import org.jkiss.dbeaver.model.exec.plan.DBCPlan;
import java.util.HashMap;
            throw new InvocationTargetException(new Exception("Incorrect file format"));
            
        return nodeJson;
    protected Map<String, Object> getNodeAttributes(@NotNull JsonObject nodeObject) {
        if (!CommonUtils.isEmpty(node.getNested())) {

    
 * limitations under the License.

            for(DBCPlanNode childNode : node.getNested()) {
     * Returns map of node objects from the json object for deserializer as strings
            throw new InvocationTargetException(new Exception("Incorrect file format"));
            JsonArray nodes = new JsonArray();
 *
        }
        }
 * You may obtain a copy of the License at

        writer.write(gson.toJson(root));


     */
     * @param nodeObject json node object
        }
            }
import java.time.LocalDateTime;
                    attributes.put(p.getKey(), p.getValue());
    public static final String PROP_COND = "cond";
    protected Map<String, String> getNodeAttributesAsStrings(@NotNull JsonObject nodeObject) {
public abstract class AbstractExecutionPlanSerializer  implements DBCQueryPlannerSerializable{
            }
        if (attrs instanceof JsonArray) {
        JsonArray nodes = new JsonArray();
    protected String getQuery(@NotNull JsonObject o)  throws InvocationTargetException {
        return attributes;
import com.google.gson.*;
        nodeJson.add(PROP_KIND, node.getNodeKind() == null ? new JsonPrimitive("") : new JsonPrimitive(CommonUtils.notEmpty(node.getNodeKind().getTitle())));
        nodeJson.add(PROP_DESC, new JsonPrimitive(CommonUtils.notEmpty(node.getNodeDescription())));


        
        nodeJson.add(PROP_NAME, new JsonPrimitive(CommonUtils.notEmpty(node.getNodeName())));
     *
import java.util.Map;
            for (Map.Entry<String, JsonElement> p : ((JsonObject)attrs).entrySet()) {
import org.jkiss.dbeaver.model.exec.plan.DBCPlanNode;
    private JsonElement serializeNode(DBCPlanNode node,DBCQueryPlannerSerialInfo info) {
        JsonElement attrs = nodeObject.get(AbstractExecutionPlanSerializer.PROP_ATTRIBUTES);
     *
        root.add(PROP_SIGNATURE,  new JsonPrimitive(signature));
            
        nodeJson.add(PROP_TYPE, new JsonPrimitive(CommonUtils.notEmpty(node.getNodeType())));
        if (queryElement == null) {
        }

        JsonElement attrs = nodeObject.get(AbstractExecutionPlanSerializer.PROP_ATTRIBUTES);
        JsonObject root = new JsonObject();

     * @return map of attributes from the json object
        if (queryElement == null) {
        root.add(PROP_VERSION, new JsonPrimitive(info.version()));
        }
    }
            }
                attributes.put(p.getKey(), p.getValue().getAsString());
        if (attrs instanceof JsonArray) {


        } else if (attrs instanceof JsonObject) {
                }
            for (JsonElement attr : (JsonArray)attrs) {

            nodes.add(serializeNode(node,info));
}

 */
     protected String getVersion(@NotNull JsonObject o)  throws InvocationTargetException {
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
     * Returns map of node objects from the json object for deserializer
        root.add(PROP_SQL, new JsonPrimitive(plan.getQueryString()));
    }
import java.io.IOException;
                for (Map.Entry<String, JsonElement> p : attr.getAsJsonObject().entrySet()) {
        for(DBCPlanNode node : plan.getPlanNodes(null)) {
    public static final String PROP_NODES = "root";
 *
    public static final String PROP_SQL = "sql";
 * See the License for the specific language governing permissions and
        Map<String, Object> attributes = new HashMap<>();
     * @return map of attributes from the json object
    }
 * Unless required by applicable law or agreed to in writing, software
                }
                for (Map.Entry<String, JsonElement> p : attr.getAsJsonObject().entrySet()) {
    public static final String PROP_TYPE = "type";
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            



