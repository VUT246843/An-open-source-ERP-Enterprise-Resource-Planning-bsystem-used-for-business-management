            throw new DBCException("Only SELECT statements could produce execution plan");
    public OceanbasePlanAnalyzer(OceanbaseMySQLDataSource dataSource) {
        });
import org.jkiss.dbeaver.ext.mysql.MySQLConstants;
 * you may not use this file except in compliance with the License.
    @Override
        final SQLDialect dialect = SQLUtils.getDialectFromObject(session.getDataSource());
        String query = getQuery(jo);

/*

            }
            public String version() {
 * DBeaver - Universal Database Manager

import org.jkiss.code.NotNull;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        final String firstKeyword = SQLUtils.getFirstKeyword(dialect, plainQuery);
    public void serialize(@NotNull Writer planData, @NotNull DBCPlan plan) throws IOException {
    @NotNull
        }
    private final OceanbaseMySQLDataSource dataSource;
        JsonObject jo = new JsonParser().parse(planData).getAsJsonObject();
    public DBCPlan planQueryExecution(@NotNull DBCSession session, @NotNull String query, @NotNull DBCQueryPlannerConfiguration configuration)
    }

        this.dataSource = dataSource;
        return explain((JDBCSession) session, query);
    @Override
        if (!"SELECT".equalsIgnoreCase(firstKeyword) && !"WITH".equalsIgnoreCase(firstKeyword)) {
            }
 * Copyright (C) 2010-2024 DBeaver Corp and others

    }
public class OceanbasePlanAnalyzer extends AbstractExecutionPlanSerializer implements DBCQueryPlanner {
import java.io.Writer;

import org.jkiss.utils.CommonUtils;
        return new OceanbasePlanJSON(dataSource, query, rootNodes);
        return DBCPlanStyle.PLAN;
package org.jkiss.dbeaver.ext.oceanbase.model.plan;
import org.jkiss.dbeaver.model.impl.plan.ExecutionPlanDeserializer;
 * limitations under the License.
 *
                for (Map.Entry<String, String> e : jsNode.getNodeProps().entrySet()) {
    }
    public DBCPlanStyle getPlanStyle() {
 * Unless required by applicable law or agreed to in writing, software
 *
import com.google.gson.JsonPrimitive;
    @Override
    }
                (datasource, node, parent) -> new OceanbasePlanNodeJSON(parent, getNodeAttributesAsStrings(node)));
                }
import com.google.gson.JsonObject;
            throws DBCException {
                OceanbasePlanNodeJSON jsNode = (OceanbasePlanNodeJSON) node;
 *     http://www.apache.org/licenses/LICENSE-2.0

import org.jkiss.dbeaver.model.exec.plan.*;
            @Override

 * distributed under the License is distributed on an "AS IS" BASIS,
import java.io.IOException;
import java.util.Map;
import org.jkiss.dbeaver.model.sql.SQLUtils;

 *
 * See the License for the specific language governing permissions and
        ExecutionPlanDeserializer<OceanbasePlanNodeJSON> loader = new ExecutionPlanDeserializer<>();
                nodeJson.add(PROP_ATTRIBUTES, attributes);

import org.jkiss.dbeaver.model.sql.SQLDialect;

    @Override

 * Licensed under the Apache License, Version 2.0 (the "License");
                    attributes.add(e.getKey(), new JsonPrimitive(CommonUtils.notEmpty(e.getValue())));

    public DBPDataSource getDataSource() {
}
    }
    }
import java.io.Reader;
import com.google.gson.JsonParser;
import org.jkiss.dbeaver.ext.oceanbase.model.OceanbaseMySQLDataSource;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            public void addNodeProperties(DBCPlanNode node, JsonObject nodeJson) {
                return MySQLConstants.TYPE_JSON;
import java.util.List;
    @NotNull
    @Override
        return new OceanbasePlanJSON(session, query);
        List<OceanbasePlanNodeJSON> rootNodes = loader.loadRoot(dataSource, jo,
        serializeJson(planData, plan, dataSource.getInfo().getDriverName(), new DBCQueryPlannerSerialInfo() {
import org.jkiss.dbeaver.model.exec.DBCException;
    private static OceanbasePlanJSON explain(JDBCSession session, String query) throws DBCException {
    public DBCPlan deserialize(@NotNull Reader planData) throws InvocationTargetException {
import java.lang.reflect.InvocationTargetException;
import org.jkiss.dbeaver.model.impl.plan.AbstractExecutionPlanSerializer;
import org.jkiss.dbeaver.model.DBPDataSource;
        return this.dataSource;

            @Override
    }
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.exec.DBCSession;
        final String plainQuery = SQLUtils.stripComments(dialect, query).toUpperCase();

                JsonObject attributes = new JsonObject();
 */
