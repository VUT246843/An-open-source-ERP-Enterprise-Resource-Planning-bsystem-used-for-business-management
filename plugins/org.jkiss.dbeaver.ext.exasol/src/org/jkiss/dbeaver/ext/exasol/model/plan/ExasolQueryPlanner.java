 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.exec.plan.*;

import com.google.gson.JsonObject;
import org.jkiss.dbeaver.model.DBPDataSource;

 * You may obtain a copy of the License at
import java.lang.reflect.InvocationTargetException;
import org.jkiss.dbeaver.model.exec.DBCSession;
                        Object value = element.getValue();
import com.google.gson.JsonParser;
        }
                return "json";
import org.jkiss.dbeaver.ext.exasol.model.ExasolDataSource;
        try {
                if (node instanceof ExasolPlanNode) {
 */
/*
            }
import java.util.Map;
 * Licensed under the Apache License, Version 2.0 (the "License");
            JsonObject jo = new JsonParser().parse(planData).getAsJsonObject();
            public void addNodeProperties(DBCPlanNode node, JsonObject nodeJson) {
import java.io.IOException;
    @Override
            List<ExasolPlanNode> rootNodes = loader.loadRoot(dataSource, jo, (datasource, node, parent) -> new ExasolPlanNode(parent, getNodeAttributes(node)));
                            attr.add(element.getKey(), new JsonPrimitive(value.toString()));
                        attributes.add(attr);

import com.google.gson.JsonPrimitive;
import java.util.List;

import org.jkiss.code.NotNull;

            @Override
    public DBCPlan planQueryExecution(@NotNull DBCSession session, @NotNull String query, @NotNull DBCQueryPlannerConfiguration configuration) throws DBException {
    }
            }
 * DBeaver - Universal Database Manager
public class ExasolQueryPlanner extends AbstractExecutionPlanSerializer implements DBCQueryPlanner {
    @Override
    @Override
            return new ExasolPlanAnalyser(dataSource, query, rootNodes);
                        JsonObject attr = new JsonObject();
        return DBCPlanStyle.PLAN;
    public DBPDataSource getDataSource() {
 * limitations under the License.
                        if (value instanceof Double) {
 * Unless required by applicable law or agreed to in writing, software
                }
                nodeJson.add(PROP_ATTRIBUTES, attributes);
                    }

                            // Keep numbers in the original view
 * See the License for the specific language governing permissions and
    public DBCPlan deserialize(@NotNull Reader planData) throws InvocationTargetException {
    public ExasolQueryPlanner(ExasolDataSource dataSource) {
    @Override
        return plan;
package org.jkiss.dbeaver.ext.exasol.model.plan;
        return dataSource;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *

                        }
    @NotNull
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                            attr.add(element.getKey(), new JsonPrimitive((Double) value));
                    ExasolPlanNode planNode = (ExasolPlanNode) node;
            public String version() {
                    for(Map.Entry<String, Object> element : planNode.getAttributes().entrySet()) {
    }

}

        ExasolPlanAnalyser plan = new ExasolPlanAnalyser(dataSource, query);
import java.io.Reader;
    @Override
    }
    public DBCPlanStyle getPlanStyle() {


 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.DBException;
                        } else {
            @Override


            String query = getQuery(jo);
    }

    }
import org.jkiss.dbeaver.model.impl.plan.ExecutionPlanDeserializer;
        this.dataSource = dataSource;
        serializeJson(planData, plan, dataSource.getInfo().getDriverName(), new DBCQueryPlannerSerialInfo() {
        plan.explain(session);

        });
        } catch (Throwable e) {
import org.jkiss.dbeaver.model.impl.plan.AbstractExecutionPlanSerializer;

    private final ExasolDataSource dataSource;
                JsonArray attributes = new JsonArray();
            throw new InvocationTargetException(e);
 *
            ExecutionPlanDeserializer<ExasolPlanNode> loader = new ExecutionPlanDeserializer<>();

    public void serialize(@NotNull Writer planData, @NotNull DBCPlan plan) throws IOException {
 *
    @NotNull

import java.io.Writer;
import com.google.gson.JsonArray;
