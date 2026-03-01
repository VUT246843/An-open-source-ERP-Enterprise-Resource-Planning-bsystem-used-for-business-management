 * DBeaver - Universal Database Manager
import org.jkiss.code.Nullable;
            plan = CubridStatementProxy.getQueryplan(
import org.jkiss.dbeaver.model.impl.plan.AbstractExecutionPlan;
    private String query;
            long totalCost = 0;
    @Override
        this.query = query;
            List<CubridPlanNode> tempNode = new ArrayList<>();
            parent.setAllNestedNode(tempNode);
    }
            rootNodes.add(parent);
    @NotNull
public class CubridPlanAnalyser extends AbstractExecutionPlan {
                }
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
import java.util.ArrayList;
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
import java.util.Map;
import java.util.List;
import org.jkiss.dbeaver.model.exec.plan.DBCPlanNode;
    public CubridPlanAnalyser(@NotNull JDBCSession session, @NotNull String query)
    public String getPlanQueryString() {

import org.jkiss.utils.CommonUtils;
        return plan;
    }
            parent.setCost(totalCost);
    public String getQueryString() {
 * See the License for the specific language governing permissions and
                    CubridPlanNode node = new CubridPlanNode(fullText);

    private String plan;
    @Override
    @NotNull
            throw new DBCException(e, session.getExecutionContext());
import org.jkiss.code.NotNull;
                if (CommonUtils.isNotEmpty(fullText)) {
/*
} * Unless required by applicable law or agreed to in writing, software
        return rootNodes;
    }
    @NotNull
    @Override


 * you may not use this file except in compliance with the License.
                    tempNode.add(node);
        try {
    public List<? extends DBCPlanNode> getPlanNodes(@Nullable Map<String, Object> options) {
 * limitations under the License.
        } catch (SQLException e) {
import org.jkiss.dbeaver.model.exec.DBCException;

 * You may obtain a copy of the License at


 *


package org.jkiss.dbeaver.ext.cubrid.model.plan;
        }

import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 * distributed under the License is distributed on an "AS IS" BASIS,
    private List<CubridPlanNode> rootNodes = new ArrayList<>();
                    totalCost = totalCost + node.getCost();
 *
            }
    }
                            session.getOriginal().createStatement(), query);
        return query;
            for (String fullText : plan.split("(?=Join graph segments)")) {
            throws DBCException {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2024 DBeaver Corp and others
import java.sql.SQLException;

            CubridPlanNode parent = new CubridPlanNode();
