
                JsonArray attributes = new JsonArray();
 *     http://www.apache.org/licenses/LICENSE-2.0
            @Override
 * Unless required by applicable law or agreed to in writing, software
                    attributes.add(createAttr("other_xml", oraNode.getOtherXml()));
        return attr; 
    public DBCPlanStyle getPlanStyle() {
import com.google.gson.JsonArray;
                    attributes.add(createAttr("bytes", oraNode.getBytes()));
                    attributes.add(createAttr("operation", oraNode.getOperation()));
                nodeJson.add(PROP_ATTRIBUTES, attributes);
                    attributes.add(createAttr("statement_id", oraNode.getStatementId()));
import com.google.gson.JsonObject;
        JsonObject attr = new JsonObject();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    attributes.add(createAttr("cpu_cost", oraNode.getCpuCost()));
                    attributes.add(createAttr("object_instance", oraNode.getObjectInstance()));
                    attributes.add(createAttr("optimizer", oraNode.getOptimizer()));
                    attributes.add(createAttr("projection", oraNode.getProjection()));
    @Override
import org.jkiss.code.NotNull;
 * Licensed under the Apache License, Version 2.0 (the "License");
/**
    }
            ExecutionPlanDeserializer<OraclePlanNode> loader = new ExecutionPlanDeserializer<>();
import java.util.List;

        JsonObject attr = new JsonObject();
import java.io.IOException;

        OracleExecutionPlan plan = new OracleExecutionPlan(dataSource, (JDBCSession) session, query);
                return FORMAT_VERSION;
 * distributed under the License is distributed on an "AS IS" BASIS,
    private JsonObject createAttr(String key,Timestamp value) {
import org.jkiss.dbeaver.model.exec.plan.*;
                    attributes.add(createAttr("search_columns", oraNode.getSearchColumns()));


    private JsonObject createAttr(String key,long value) {
        plan.explain();
        OracleExecutionPlan plan = new OracleExecutionPlan(dataSource, (JDBCSession) session, savedQueryId);

import java.io.Reader;
import org.jkiss.dbeaver.model.exec.DBCSession;
    @Override
    }
    public void serialize(Writer planData, DBCPlan plan) throws IOException {


import java.sql.Timestamp;
                    attributes.add(createAttr("partition_stop", oraNode.getPartitionStop()));
 * limitations under the License.
                    attributes.add(createAttr("timestamp", oraNode.getTimestamp()));
    @Override
            throw new InvocationTargetException(e);

                    attributes.add(createAttr("qblock_name", oraNode.getQblockName()));


                    attributes.add(createAttr("object_node", oraNode.getObjectNode()));

                    attributes.add(createAttr("filter_predicates", oraNode.getFilterPredicates()));
        serializeJson(planData, plan,dataSource.getInfo().getDriverName(), new DBCQueryPlannerSerialInfo() {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

import org.jkiss.utils.IntKeyMap;
            public void addNodeProperties(DBCPlanNode node, JsonObject nodeJson) {
import java.io.Writer;
 *
            }
    @Override

                    attributes.add(createAttr("io_cost", oraNode.getIoCost()));
                    attributes.add(createAttr("position", oraNode.getPosition()));
    @NotNull
            public String version() {
 * See the License for the specific language governing permissions and
    public DBCPlan readSavedQueryExecutionPlan(DBCSession session, Object savedQueryId) throws DBException {

    }
                    attributes.add(createAttr("cardinality", oraNode.getCardinality()));
} */
    private JsonObject createAttr(String key,String value) {
                    attributes.add(createAttr("access_predicates", oraNode.getAccessPredicates()));
                    OraclePlanNode oraNode = (OraclePlanNode) node;
                    attributes.add(createAttr("temp_space", oraNode.getTempSpace()));
                    attributes.add(createAttr("cost", oraNode.getCost()));
                OraclePlanNode nodeOra = new OraclePlanNode(dataSource, allNodes, getNodeAttributes(node));
            return new OracleExecutionPlan(query, rootNodes);
import org.jkiss.utils.CommonUtils;
 *
        return dataSource;
import com.google.gson.JsonPrimitive;
    /*
        this.dataSource = dataSource;
            @Override
            });
                    attributes.add(createAttr("distribution", oraNode.getDistribution()));
                    attributes.add(createAttr("time", oraNode.getTime()));
        attr.add(key,new JsonPrimitive(value.toInstant().toEpochMilli()));



    }
 *
                    attributes.add(createAttr("remarks", oraNode.getRemarks()));

        return plan;
        }
     */
        return plan;
    public OracleDataSource getDataSource() {
    }
                    attributes.add(createAttr("other", oraNode.getOther()));

                allNodes.put(nodeOra.getId(), nodeOra);
                    attributes.add(createAttr("object_owner", oraNode.getObjectOwner()));
                    attributes.add(createAttr("object_type", oraNode.getObjectType()));
                    attributes.add(createAttr("other_tag", oraNode.getOtherTag()));
    private final OracleDataSource dataSource;    
 * Copyright (C) 2010-2024 DBeaver Corp and others
                return nodeOra;

import org.jkiss.dbeaver.DBException;
        plan.readHistoric();
            JsonObject jo = new JsonParser().parse(planData).getAsJsonObject();
 * DBeaver - Universal Database Manager
        attr.add(key,new JsonPrimitive(value));
public class OracleQueryPlanner  extends AbstractExecutionPlanSerializer implements DBCQueryPlanner/*, DBCSavedQueryPlanner*/ {
import org.jkiss.dbeaver.model.impl.plan.ExecutionPlanDeserializer;
import java.lang.reflect.InvocationTargetException;
                    attributes.add(createAttr("id", oraNode.getId()));
    @NotNull
    @Override

        } catch (Throwable e) {
    }
            IntKeyMap<OraclePlanNode> allNodes = new IntKeyMap<>();
/*
    @Override
package org.jkiss.dbeaver.ext.oracle.model.plan;
    }
                    attributes.add(createAttr("partition_id", oraNode.getPartitionId()));
                    attributes.add(createAttr("plan_id", oraNode.getPlanId()));

        return attr; 
    }
    public OracleQueryPlanner(OracleDataSource dataSource) {
            }
                    attributes.add(createAttr("partition_start", oraNode.getPartitionStart()));
 */
            List<OraclePlanNode> rootNodes = loader.loadRoot(dataSource, jo, (datasource, node, parent) -> {

        attr.add(key,new JsonPrimitive(CommonUtils.notEmpty(value)));
 * You may obtain a copy of the License at
        JsonObject attr = new JsonObject();
import org.jkiss.dbeaver.model.impl.plan.AbstractExecutionPlanSerializer;

    public DBCPlan deserialize(@NotNull Reader planData) throws IOException,InvocationTargetException {

    public DBCPlan planQueryExecution(@NotNull DBCSession session, @NotNull String query, @NotNull DBCQueryPlannerConfiguration configuration) throws DBException {
    }

                    attributes.add(createAttr("parent_id", oraNode.getParentId()));				   
import org.jkiss.dbeaver.ext.oracle.model.OracleDataSource;
        return DBCPlanStyle.PLAN;
                }
        });
 * Oracle execution plan node
            String query = getQuery(jo);
 * you may not use this file except in compliance with the License.
                    attributes.add(createAttr("options", oraNode.getOptions()));
                    attributes.add(createAttr("object_alias", oraNode.getObjectAlias()));
import com.google.gson.JsonParser;
    private final static String FORMAT_VERSION = "1";
        return attr; 
                    attributes.add(createAttr("object_name", oraNode.getObjectName()));
                if (node instanceof OraclePlanNode) {					
                    attributes.add(createAttr("depth", oraNode.getDepth()));
    }
        try {
