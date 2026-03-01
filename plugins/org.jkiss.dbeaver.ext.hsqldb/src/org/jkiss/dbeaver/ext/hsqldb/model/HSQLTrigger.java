import org.jkiss.dbeaver.model.meta.Property;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    }
        statement = JDBCUtils.safeGetString(dbResult, "ACTION_STATEMENT");
 * distributed under the License is distributed on an "AS IS" BASIS,
        super(table, name, null);
    public String getOrientation() {
    HSQLTrigger(GenericTableBase table, String name, JDBCResultSet dbResult) {
 *

    public String getTiming() {
 */
 */
        return orientation;
/*
    }
    @Override
        if (CommonUtils.isEmpty(newReference)) {
    @Property(viewable = true, order = 10)

import org.jkiss.code.Nullable;

 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public String getStatement() {
 * limitations under the License.

    private String timing;
        String oldReference = null;
    @Nullable
        manipulation = JDBCUtils.safeGetString(dbResult, "EVENT_MANIPULATION");
            if (CommonUtils.isEmpty(oldReference)) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private String statement;
 * You may obtain a copy of the License at
        String newReference = JDBCUtils.safeGetString(dbResult, "ACTION_REFERENCE_NEW_ROW");
    @Property(viewable = true, order = 11)
    private String manipulation;
 *
import org.jkiss.dbeaver.ext.generic.model.GenericTableTrigger;

public class HSQLTrigger extends GenericTableTrigger {
    public String getDescription() {
    }
    public String getManipulation() {
        return manipulation;
import org.jkiss.dbeaver.model.sql.format.SQLFormatUtils;

        return timing;
        timing = JDBCUtils.safeGetString(dbResult, "ACTION_TIMING");
                    SQLFormatUtils.formatSQL(getDataSource(), statement);
                    (newReference != null ? "\nREFERENCING NEW AS " + newReference : oldReference != null ? "\nREFERENCING OLD AS " + oldReference : "") +

 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.ext.hsqldb.model;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        orientation = JDBCUtils.safeGetString(dbResult, "ACTION_ORIENTATION");

/**
    @Property(viewable = true, order = 12)
        return super.getDescription();
            newReference = JDBCUtils.safeGetString(dbResult, "ACTION_REFERENCE_NEW_TABLE");
                oldReference = JDBCUtils.safeGetString(dbResult, "ACTION_REFERENCE_OLD_TABLE");
            }
        }
 * DBeaver - Universal Database Manager
    }
 * HSQLTrigger
}
        }
    }
    }
 *
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
        if (statement != null) {
 * Unless required by applicable law or agreed to in writing, software
        if (CommonUtils.isEmpty(newReference)) {
        }
import org.jkiss.dbeaver.model.DBUtils;
        return statement;

    private String orientation;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 * you may not use this file except in compliance with the License.

            oldReference = JDBCUtils.safeGetString(dbResult, "ACTION_REFERENCE_OLD_ROW");
            statement = "CREATE TRIGGER " + name + " " + timing + " " + manipulation + " ON " + DBUtils.getObjectFullName(table, DBPEvaluationContext.DML) +
                    " FOR EACH " + orientation + "\n" +
