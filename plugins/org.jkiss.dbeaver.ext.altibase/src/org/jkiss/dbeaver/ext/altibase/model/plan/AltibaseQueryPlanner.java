            });
        attr.add(key, new JsonPrimitive(value));
        AltibaseExecutionPlan plan = new AltibaseExecutionPlan(dataSource, (JDBCSession) session, query);
/*
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.utils.CommonUtils;
        return DBCPlanStyle.PLAN;
 * limitations under the License.
    @NotNull

    public DBCPlan planQueryExecution(
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
        });
            List<AltibasePlanNode> rootNodes = loader.loadRoot(dataSource, jo, (datasource, node, parent) -> {

 * Unless required by applicable law or agreed to in writing, software
 * Altibase execution plan node

                }

 *
                JsonArray attributes = new JsonArray();

    @Override

        return attr; 
                    attributes.add(createAttr("depth", altiNode.getDepth()));

package org.jkiss.dbeaver.ext.altibase.model.plan;
import org.jkiss.dbeaver.model.impl.plan.AbstractExecutionPlanSerializer;
        return attr; 
                AltibasePlanNode altiNode = new AltibasePlanNode(dataSource, allNodes, getNodeAttributes(node));

    }


    private final AltibaseDataSource dataSource;    
            @NotNull DBCSession session, 

 * You may obtain a copy of the License at

    @Override
 *
    public void serialize(Writer planData, DBCPlan plan) throws IOException {
            public String version() {
import com.google.gson.JsonObject;
                    attributes.add(createAttr("parent_id", altiNode.getParentId()));
import java.io.Writer;
            throw new InvocationTargetException(e);
    @Override
        JsonObject attr = new JsonObject();
        return plan;
 * you may not use this file except in compliance with the License.
        JsonObject attr = new JsonObject();
            @Override
    }
                    AltibasePlanNode altiNode = (AltibasePlanNode) node;

import com.google.gson.JsonArray;
 *
            @NotNull DBCQueryPlannerConfiguration configuration) throws DBException {

import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        this.dataSource = dataSource;
            return new AltibaseExecutionPlan(query, rootNodes);
            JsonObject jo = new JsonParser().parse(planData).getAsJsonObject();
        serializeJson(planData, plan, dataSource.getInfo().getDriverName(), new DBCQueryPlannerSerialInfo() {
            String query = getQuery(jo);
            IntKeyMap<AltibasePlanNode> allNodes = new IntKeyMap<>();
    }
        try {
    }
        plan.explain();
 * Copyright (C) 2010-2024 DBeaver Corp and others

            }
                allNodes.put(altiNode.getId(), altiNode);
            @SuppressWarnings("deprecation")
            ExecutionPlanDeserializer<AltibasePlanNode> loader = new ExecutionPlanDeserializer<>();
 */
                    attributes.add(createAttr("id", altiNode.getId()));
import org.jkiss.dbeaver.ext.altibase.model.AltibaseDataSource;
import org.jkiss.dbeaver.model.exec.plan.*;

                return altiNode;
import java.util.List;
        } catch (Throwable e) {
import org.jkiss.utils.IntKeyMap;

import org.jkiss.dbeaver.model.impl.plan.ExecutionPlanDeserializer;
    public AltibaseDataSource getDataSource() {

                if (node instanceof AltibasePlanNode) {                 
import org.jkiss.dbeaver.DBException;
    private static final String FORMAT_VERSION = "1";
        attr.add(key, new JsonPrimitive(CommonUtils.notEmpty(value)));
/**
 * DBeaver - Universal Database Manager
        return dataSource;
            @Override
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
    public AltibaseQueryPlanner(AltibaseDataSource dataSource) {
                return FORMAT_VERSION;
    }
import java.io.IOException;
    }
import com.google.gson.JsonPrimitive;
    @Override
    private JsonObject createAttr(String key, String value) {
import java.lang.reflect.InvocationTargetException;
            public void addNodeProperties(DBCPlanNode node, JsonObject nodeJson) {

    public DBCPlanStyle getPlanStyle() {
            @NotNull String query, 
import org.jkiss.dbeaver.model.exec.DBCSession;
    }
    @NotNull
import java.io.Reader;
                    attributes.add(createAttr("plan", altiNode.getPlan()));
public class AltibaseQueryPlanner extends AbstractExecutionPlanSerializer implements DBCQueryPlanner {
    private JsonObject createAttr(String key, int value) {
 *     http://www.apache.org/licenses/LICENSE-2.0


import org.jkiss.code.NotNull;
            }
 */
}
import com.google.gson.JsonParser;

                nodeJson.add(PROP_ATTRIBUTES, attributes);
    public DBCPlan deserialize(@NotNull Reader planData) throws IOException, InvocationTargetException {
    }
