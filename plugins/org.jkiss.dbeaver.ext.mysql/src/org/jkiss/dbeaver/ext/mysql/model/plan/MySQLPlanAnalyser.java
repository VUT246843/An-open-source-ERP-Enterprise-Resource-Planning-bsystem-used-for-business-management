        if (supportsExplainJSON()) {
    public MySQLPlanAbstract explain(JDBCSession session, String query) throws DBCException {
                } else if (node instanceof MySQLPlanNodeJSON) {
    }
    public DBCPlan deserialize(@NotNull Reader planData) throws IOException, InvocationTargetException {
                    attributes.add("ref", new JsonPrimitive(CommonUtils.notEmpty(plainNode.getRef())));
    @Override
                    for (Map.Entry<String, Object> e : jsNode.getNodeProps().entrySet()) {
 * Unless required by applicable law or agreed to in writing, software

        String query = getQuery(jo);
            }
        String savedVersion = getVersion(jo);
/**
import org.jkiss.dbeaver.model.impl.plan.ExecutionPlanDeserializer;



                (datasource, node, parent) -> new MySQLPlanNodeJSON(parent, getNodeAttributes(node)));
                            // Keep numbers in the original view
import org.jkiss.dbeaver.model.exec.DBCSession;
                    attributes.add("type", new JsonPrimitive(CommonUtils.notEmpty(plainNode.getNodeType())));
            return new MySQLPlanJSON(session, query);
 * See the License for the specific language governing permissions and
                    attributes.add("key_len", new JsonPrimitive(CommonUtils.notEmpty(plainNode.getKeyLength())));
    }
import org.jkiss.dbeaver.model.DBPDataSource;
import com.google.gson.JsonParser;
                    MySQLPlanNodePlain plainNode = (MySQLPlanNodePlain) node;
        }
                    }
import java.io.Writer;
import java.io.IOException;
import java.util.List;
                            attributes.add(e.getKey(), new JsonPrimitive((Double) value));


import java.util.Map;

                (datasource, node, parent) -> new MySQLPlanNodePlain(parent, getNodeAttributes(node)));
 *

 */
import org.jkiss.dbeaver.model.impl.plan.AbstractExecutionPlanSerializer;
                    attributes.add("rows", new JsonPrimitive(plainNode.getRowCount()));
    private MySQLDataSource dataSource;
            }
        } else {
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.exec.DBCException;
                    attributes.add("filtered", new JsonPrimitive(plainNode.getFiltered()));

 */
                nodeJson.add(PROP_ATTRIBUTES, attributes);
        }
 *

        if (savedVersion.equals("classic")) {
 * DBeaver - Universal Database Manager
import java.lang.reflect.InvocationTargetException;
    public DBCPlan planQueryExecution(@NotNull DBCSession session, @NotNull String query, @NotNull DBCQueryPlannerConfiguration configuration) throws DBCException {
            return dataSource.isServerVersionAtLeast(10, 1);
            @Override
            List<MySQLPlanNodePlain> rootNodes = loader.loadRoot(dataSource, jo,
    @NotNull


        });

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
        return dataSource;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        
public class MySQLPlanAnalyser extends AbstractExecutionPlanSerializer implements DBCQueryPlanner {
    }

import java.io.Reader;
        serializeJson(writer, plan, dataSource.getInfo().getDriverName(), new DBCQueryPlannerSerialInfo() {
            @Override
                    attributes.add("select_type", new JsonPrimitive(CommonUtils.notEmpty((plainNode.getSelectType()))));
    @Override
    public void serialize(@NotNull Writer writer, @NotNull DBCPlan plan) throws IOException, InvocationTargetException {
                    attributes.add("key", new JsonPrimitive(CommonUtils.notEmpty(plainNode.getKey())));
                            attributes.add(e.getKey(), new JsonPrimitive(value.toString()));
    public DBPDataSource getDataSource() {
                return plan instanceof MySQLPlanClassic ? "classic" : "json";
    }
                    attributes.add("possible_keys", new JsonPrimitive(CommonUtils.notEmpty(plainNode.getPossibleKeys())));
                JsonObject attributes = new JsonObject();
                    attributes.add("table", new JsonPrimitive(CommonUtils.notEmpty(plainNode.getTable())));
                    MySQLPlanNodeJSON jsNode = (MySQLPlanNodeJSON) node;
    public DBCPlanStyle getPlanStyle() {
    }
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * limitations under the License.
            return new MySQLPlanClassic(session, query);
            public String version() {
}
                if (node instanceof MySQLPlanNodePlain) {
            ExecutionPlanDeserializer<MySQLPlanNodePlain> loader = new ExecutionPlanDeserializer<>();
    public MySQLPlanAnalyser(MySQLDataSource dataSource) {
    private boolean supportsExplainJSON() {
import org.jkiss.dbeaver.model.exec.plan.*;

 * you may not use this file except in compliance with the License.
                    attributes.add("id", new JsonPrimitive(plainNode.getId()));
            return new MySQLPlanClassic(dataSource, query, rootNodes);

                        Object value = e.getValue();
            ExecutionPlanDeserializer<MySQLPlanNodeJSON> loader = new ExecutionPlanDeserializer<>();
            public void addNodeProperties(DBCPlanNode node, JsonObject nodeJson) {
 * distributed under the License is distributed on an "AS IS" BASIS,

    }
                    attributes.add("extra", new JsonPrimitive(CommonUtils.notEmpty(plainNode.getExtra())));
            return dataSource.isServerVersionAtLeast(5, 6);
    @Override
        }
 
                }
        this.dataSource = dataSource;
/*
    @NotNull
        if (dataSource.isMariaDB()) {
                        } else {
 * MySQL execution plan analyser
            List<MySQLPlanNodeJSON> rootNodes = loader.loadRoot(dataSource, jo,
import com.google.gson.JsonPrimitive;

import com.google.gson.JsonObject;
package org.jkiss.dbeaver.ext.mysql.model.plan;
 * You may obtain a copy of the License at

            return new MySQLPlanJSON(dataSource,query,rootNodes);
                        if (value instanceof Double) {
        } else {
                        }
    @Override
        return DBCPlanStyle.PLAN;
    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
import org.jkiss.dbeaver.ext.mysql.model.MySQLDataSource;

import org.jkiss.utils.CommonUtils;
        JsonObject jo = new JsonParser().parse(planData).getAsJsonObject();
        return explain((JDBCSession) session, query);

 *
        } else {
