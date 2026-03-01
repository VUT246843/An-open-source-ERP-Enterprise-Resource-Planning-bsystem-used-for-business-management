            });
import org.jkiss.dbeaver.model.exec.plan.DBCQueryPlannerDeSerialInfo;
        JsonArray childs = nodeObject.getAsJsonArray(AbstractExecutionPlanSerializer.PROP_CHILD);
        final String signature = plan.get(AbstractExecutionPlanSerializer.PROP_SIGNATURE).getAsString();
        
        return node;
 *
 */
 * DBeaver - Universal Database Manager
    public List<NODE> loadRoot(DBPDataSource datasource, JsonObject plan, DBCQueryPlannerDeSerialInfo<NODE> info) throws InvocationTargetException {
            DBCQueryPlannerDeSerialInfo<NODE> info) {
        
            childs.forEach((e) -> {
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
        final List<NODE> nodes = new ArrayList<>(1);

import java.lang.reflect.InvocationTargetException;
        }
/*
            nodes.add(loadNode(datasource, e.getAsJsonObject(), null, info));
 * you may not use this file except in compliance with the License.

        

 *
        });
import com.google.gson.JsonObject;
import org.jkiss.dbeaver.model.DBPDataSource;
import java.util.List;
        }
        final String currSignature = datasource.getInfo().getDriverName();
        plan.getAsJsonArray(AbstractExecutionPlanSerializer.PROP_NODES).forEach((e) -> {
            throw new InvocationTargetException(new Throwable(String.format("Incorrect plan signature found - %s, expected - %s", signature,currSignature)));
        if (childs != null) {


        return nodes;
 * limitations under the License.
}
        
 * Copyright (C) 2010-2024 DBeaver Corp and others
        if (!signature.equals(currSignature)) {
 * You may obtain a copy of the License at
        
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
                ((Collection<NODE>) node.getNested()).add(loadNode(dataSource, e.getAsJsonObject(), node, info));
import com.google.gson.JsonArray;

 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    private NODE loadNode(DBPDataSource dataSource, JsonObject nodeObject, NODE parent,
import java.util.ArrayList;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.exec.plan.DBCPlanNode;
        NODE node = info.createNode(dataSource, nodeObject, parent);
 *
        
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.Collection;
package org.jkiss.dbeaver.model.impl.plan;
public class ExecutionPlanDeserializer<NODE extends DBCPlanNode> {
