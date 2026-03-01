
    }
    }
                JsonObject attributes = new JsonObject();

                for (Map.Entry<String, String> e : jsNode.getNodeProps().entrySet()) {
    private final DBPDataSource dataSource;
import org.jkiss.dbeaver.model.DBPDataSource;
 * Unless required by applicable law or agreed to in writing, software
        {

import java.io.IOException;

 * You may obtain a copy of the License at
package org.jkiss.dbeaver.ext.ocient.model.plan;
import java.io.Reader;
 */

            }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and

                return "json";
        plan.explain(session);
        OcientExecutionPlan plan = new OcientExecutionPlan(query);
    @Override
    @NotNull
import org.jkiss.dbeaver.model.exec.DBCSession;
            @Override
            public void addNodeProperties(DBCPlanNode node, JsonObject nodeJson) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * PostgreQueryPlaner
    public void serialize(@NotNull Writer writer, @NotNull DBCPlan plan) throws IOException, InvocationTargetException {
            List<OcientPlanNodeJson> rootNodes = loader.loadRoot(dataSource, jo,


import java.util.List;
        });

    @Override
    }
                nodeJson.add(PROP_ATTRIBUTES, attributes);
    public DBCPlan deserialize(@NotNull Reader planData) throws IOException, InvocationTargetException {
    public DBCPlanStyle getPlanStyle() {
/**
                OcientPlanNodeJson jsNode = (OcientPlanNodeJson) node;
                    attributes.add(e.getKey(), new JsonPrimitive(CommonUtils.notEmpty(e.getValue())));
        }
    @Override
}
        String query = getQuery(jo);

 * DBeaver - Universal Database Manager
    }
    public OcientQueryPlaner(DBPDataSource dataSource) {
 *
        JsonObject jo = new JsonParser().parse(planData).getAsJsonObject();
 *
    }
/*

            return new OcientExecutionPlan(query, rootNodes);
 * limitations under the License.
import org.jkiss.dbeaver.model.exec.plan.*;
import com.google.gson.JsonObject;
    public DBCPlan planQueryExecution(@NotNull DBCSession session, @NotNull String query, @NotNull DBCQueryPlannerConfiguration configuration) throws DBCException {
    @NotNull
 * you may not use this file except in compliance with the License.
        return dataSource;
    public DBPDataSource getDataSource() {

import org.jkiss.dbeaver.model.impl.plan.AbstractExecutionPlanSerializer;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import com.google.gson.JsonParser;
import org.jkiss.dbeaver.model.exec.DBCException;
public class OcientQueryPlaner extends AbstractExecutionPlanSerializer implements DBCQueryPlanner {
import org.jkiss.code.NotNull;
            @Override
        return DBCPlanStyle.PLAN;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return plan;
import com.google.gson.JsonPrimitive;
            ExecutionPlanDeserializer<OcientPlanNodeJson> loader = new ExecutionPlanDeserializer<>();
    }
            public String version() {
        this.dataSource = dataSource;
    @Override
 */
import org.jkiss.dbeaver.model.impl.plan.ExecutionPlanDeserializer;
                }

 * Licensed under the Apache License, Version 2.0 (the "License");
 *
import java.io.Writer;
    @Override
import org.jkiss.utils.CommonUtils;

import java.lang.reflect.InvocationTargetException;
                (datasource, node, parent) -> new OcientPlanNodeJson(parent, getNodeAttributesAsStrings(node)));
import java.util.Map;
            }

        serializeJson(writer, plan, dataSource.getInfo().getDriverName(), new DBCQueryPlannerSerialInfo() {

