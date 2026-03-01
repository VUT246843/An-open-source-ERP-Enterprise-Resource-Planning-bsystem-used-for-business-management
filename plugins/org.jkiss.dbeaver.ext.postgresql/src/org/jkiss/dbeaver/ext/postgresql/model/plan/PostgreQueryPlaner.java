    @NotNull

        return dataSource.getServerType().supportsExplainPlan() ? DBCPlanStyle.PLAN : DBCPlanStyle.QUERY;

import com.google.gson.JsonParser;
 *

/**
 *
        }
    @NotNull
            configuration);
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
            }
import java.io.Writer;

    private final PostgreDataSource dataSource;
                    }
        return dataSource;
    }
        this.dataSource = dataSource;
    @Override
                        attr.add(e.getKey(), new JsonPrimitive(CommonUtils.notEmpty(e.getValue())));
            dataSource.getServerType().supportsExplainPlanVerbose(),
    public static final String PARAM_SUMMARY = "SUMMARY";
                nodeJson.add(PROP_ATTRIBUTES, attributes);
import org.jkiss.code.NotNull;

                return FORMAT_VERSION;

        PostgreExecutionPlan plan = new PostgreExecutionPlan(

    @Override
    }
import java.util.Map;
            JsonObject jo = new JsonParser().parse(planData).getAsJsonObject();
 * Licensed under the Apache License, Version 2.0 (the "License");
            query,
        serializeJson(writer, plan, dataSource.getInfo().getDriverName(), new DBCQueryPlannerSerialInfo() {
            

            !dataSource.getServerType().supportsExplainPlanXML(),

 *
                }
            @Override
    public DBCPlanStyle getPlanStyle() {
    public static final String PARAM_TIMING = "TIMING";
    public static final String PARAM_BUFFERS = "BUFFERS";
    public final static String FORMAT_VERSION = "1";
 * PostgreQueryPlaner

        } catch (Throwable e) {
import org.jkiss.dbeaver.model.impl.plan.AbstractExecutionPlanSerializer;
    @Override
                        attributes.add(attr);
 * Copyright (C) 2010-2024 DBeaver Corp and others
            }
    public DBCPlan deserialize(@NotNull Reader planData) throws IOException, InvocationTargetException {
import java.util.List;
    public static final String PARAM_ANALYSE = "ANALYZE";

import org.jkiss.dbeaver.model.exec.DBCSession;
    public DBCPlan planQueryExecution(@NotNull DBCSession session, @NotNull String query, @NotNull DBCQueryPlannerConfiguration configuration) throws DBCException {
{
            return new PostgreExecutionPlan(query, planNodes);
import org.jkiss.dbeaver.model.exec.DBCException;
            String query = getQuery(jo);
package org.jkiss.dbeaver.ext.postgresql.model.plan;
import org.jkiss.dbeaver.model.impl.plan.ExecutionPlanDeserializer;
 * Unless required by applicable law or agreed to in writing, software

/*
import java.io.IOException;
 * See the License for the specific language governing permissions and
    public static final String PARAM_SETTINGS = "SETTINGS";
            throw new InvocationTargetException(e);
        });
            @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }


import java.io.Reader;
                JsonArray attributes = new JsonArray();
}
 * DBeaver - Universal Database Manager
    public static final String PARAM_VERBOSE = "VERBOSE";

import org.jkiss.utils.CommonUtils;
        try {
    }
                (datasource, node, parent) -> new PostgrePlanNodeExternal((PostgreDataSource) datasource, node, parent));
    }

 */
    @Override
public class PostgreQueryPlaner extends AbstractExecutionPlanSerializer implements DBCQueryPlanner 
            public String version() {

 * you may not use this file except in compliance with the License.
import com.google.gson.JsonArray;
                        JsonObject attr = new JsonObject();
    public void serialize(@NotNull Writer writer, @NotNull DBCPlan plan) throws IOException {
            public void addNodeProperties(DBCPlanNode node, JsonObject nodeJson) {
    public PostgreDataSource getDataSource() {
                if (node instanceof PostgrePlanNodeBase) {


    public static final String PARAM_WAL = "WAL";
                    for(Map.Entry<String, String>  e : pgNode.attributes.entrySet()) {
import java.lang.reflect.InvocationTargetException;
import com.google.gson.JsonPrimitive;
    }
        return plan;


import org.jkiss.dbeaver.model.exec.plan.*;
            ExecutionPlanDeserializer<PostgrePlanNodeExternal> loader = new ExecutionPlanDeserializer<>();
    public static final String PARAM_COSTS = "COSTS";
    public PostgreQueryPlaner(PostgreDataSource dataSource) {
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataSource;
 * limitations under the License.
    @Override
            List<PostgrePlanNodeExternal> planNodes = loader.loadRoot(dataSource, jo,

        plan.explain(session);
 * distributed under the License is distributed on an "AS IS" BASIS,
import com.google.gson.JsonObject;
 * You may obtain a copy of the License at
                    PostgrePlanNodeBase<?> pgNode = (PostgrePlanNodeBase<?>) node;
