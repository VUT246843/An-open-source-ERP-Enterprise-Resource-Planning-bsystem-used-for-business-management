            names.add(attrName + "=VALUES(" + attrName + ")");
import java.util.StringJoiner;
 * limitations under the License.
 *
}
package org.jkiss.dbeaver.ext.mysql.model;
    @NotNull
public class MySQLInsertReplaceMethodUpdate implements DBDInsertReplaceMethod {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return DBUtils.isPseudoAttribute(attribute) ? attribute.getName() : DBUtils.getObjectFullName(table.getDataSource(), attribute, DBPEvaluationContext.DML);
    @Override
            String attrName = getAttributeName(table, attribute);
 *
    @Override
    }
/*
    private void appendUpdateCase(@NotNull StringBuilder query, @NotNull DBSTable table, DBSAttributeBase[] attributes) {
        final StringJoiner names = new StringJoiner(",");
import org.jkiss.dbeaver.model.DBPEvaluationContext;

 *   INSERT INTO insert_duplicate_values(id, name, another_name) VALUES (5,'Ben','Solo')
import org.jkiss.dbeaver.model.data.DBDInsertReplaceMethod;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
    public String getOpeningClause(@NotNull DBSTable table, @NotNull DBRProgressMonitor monitor) {

 *     http://www.apache.org/licenses/LICENSE-2.0
    }
            if (DBUtils.isPseudoAttribute(attribute)) {
 * Example:
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;
 *   If you specify an ON DUPLICATE KEY UPDATE clause and a row to be inserted would cause a duplicate value in a UNIQUE index or PRIMARY KEY, an UPDATE of the old row occurs.


 *
 * See the License for the specific language governing permissions and
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        query.append(" ON DUPLICATE KEY UPDATE ");
 */
 */
        // Do not quote pseudo attribute name
        appendUpdateCase(query, table, attributes);
/**
            }
 * you may not use this file except in compliance with the License.

    }

 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
 * You may obtain a copy of the License at
        for (DBSAttributeBase attribute : attributes) {
 * Licensed under the Apache License, Version 2.0 (the "License");
 *   It can be better then MySQLInsertReplaceMethod class with REPLACE INTO, because REPLACE INTO first deletes a row, and then insert a new one.
        return query.toString();
 *     ON DUPLICATE KEY UPDATE id=VALUES(id), name=VALUES(name), another_name=VALUES(another_name);
        return "INSERT INTO";
import org.jkiss.dbeaver.model.DBUtils;
                continue;
        StringBuilder query = new StringBuilder();
 * Unless required by applicable law or agreed to in writing, software
    public String getTrailingClause(@NotNull DBSTable table, @NotNull DBRProgressMonitor monitor, DBSAttributeBase[] attributes) {
        query.append(names);
    private String getAttributeName(@NotNull DBSTable table, @NotNull DBSAttributeBase attribute) {
