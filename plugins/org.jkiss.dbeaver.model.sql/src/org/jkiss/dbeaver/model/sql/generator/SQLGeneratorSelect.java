
        if (object instanceof SQLQueryGeneratorSelect) {
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    }
 * See the License for the specific language governing permissions and
        sql.append("FROM ").append(getEntityName(object));
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.model.sql.SQLQueryGeneratorSelect;
            }

public class SQLGeneratorSelect extends SQLGeneratorTable {
        if (!hasAttr) {
 * Copyright (C) 2010-2024 DBeaver Corp and others

        sql.append(";\n");
    }
            return;
 *
 */
        this.columnList = columnList;
    public void setColumnList(boolean columnList) {
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
                    continue;
 *
            }
    public void generateSQL(DBRProgressMonitor monitor, StringBuilder sql, DBSEntity object) throws DBException {
 * you may not use this file except in compliance with the License.
                sql.append(getLineSeparator());
            for (DBSEntityAttribute attr : getAllAttributes(monitor, object)) {
        }
                }

            ((SQLQueryGeneratorSelect) object).createSelectStatement(monitor, sql);
    @Override
                if (DBUtils.isHiddenObject(attr)) {
        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            if (hasAttr) {
                hasAttr = true;
        sql.append("SELECT ");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                sql.append(DBUtils.getObjectFullName(attr, DBPEvaluationContext.DML));
 *
    private boolean columnList = true;
 * distributed under the License is distributed on an "AS IS" BASIS,
            // It can be non relation database, which have another SELECT statement
}
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (columnList) {
 * limitations under the License.
        }
            sql.append("* ");
 * DBeaver - Universal Database Manager
                if (hasAttr) sql.append(", ");
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.struct.DBSEntity;
        boolean hasAttr = false;
import org.jkiss.dbeaver.DBException;
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.model.sql.generator;
