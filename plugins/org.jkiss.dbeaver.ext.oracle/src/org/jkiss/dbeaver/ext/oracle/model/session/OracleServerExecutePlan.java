    }

public class OracleServerExecutePlan implements DBPObjectWithDescription {
        this.plan = JDBCUtils.safeGetString(dbResult, "PLAN_TABLE_OUTPUT");
 * Plan

 */
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 */
/*
    @Property(viewable = true, order = 1)

        return plan;
import org.jkiss.dbeaver.model.DBPObjectWithDescription;
 *
 * See the License for the specific language governing permissions and

package org.jkiss.dbeaver.ext.oracle.model.session;
    private String plan;

}
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
        return plan;

import org.jkiss.code.Nullable;
    public String getPlan() {
    }
    public OracleServerExecutePlan(ResultSet dbResult) {
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
 * Copyright (C) 2019 SergDzh (jurasik@bigmir.net)
/**
 * limitations under the License.

    public String getDescription() {
 *

import org.jkiss.dbeaver.model.meta.Property;
    @Override
 * you may not use this file except in compliance with the License.
    @Nullable
import java.sql.ResultSet;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
