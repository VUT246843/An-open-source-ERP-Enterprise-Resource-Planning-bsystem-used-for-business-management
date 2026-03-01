import org.jkiss.dbeaver.model.struct.DBSEntity;
                appendDefaultValue(sql, attr);
        }
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;

import org.jkiss.dbeaver.model.sql.SQLQueryGeneratorUpdate;
            sql.append("UPDATE ").append(entityName);
                hasAttr = true;
public class SQLGeneratorUpdate extends SQLGeneratorTable {
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
        for (DBSAttributeBase attr : getValueAttributes(monitor, object, keyAttributes)) {
 * limitations under the License.
            }
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * You may obtain a copy of the License at
 *
            hasAttr = false;
    }
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
            sql.append(tableDataStatement.generateTableUpdateBegin(entityName));
import org.jkiss.dbeaver.model.DBPEvaluationContext;

 * Unless required by applicable law or agreed to in writing, software
    public void generateSQL(DBRProgressMonitor monitor, StringBuilder sql, DBSEntity object) throws DBException {
        sql.append(";\n");
            for (DBSEntityAttribute attr : keyAttributes) {
import org.jkiss.utils.CommonUtils;
import java.util.Collection;
            if (DBUtils.isPseudoAttribute(attr) || DBUtils.isHiddenObject(attr)) {
 *
            hasAttr = true;
        boolean hasAttr = false;
        if (object instanceof SQLQueryGeneratorUpdate tableDataStatement) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            sql.append(separator).append("SET ");
/*

 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
        }
import org.jkiss.dbeaver.DBException;
                if (hasAttr) sql.append(" AND ");
import org.jkiss.dbeaver.model.DBUtils;
            }
            sql.append(getLineSeparator()).append("WHERE ");
package org.jkiss.dbeaver.model.sql.generator;
}
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
        } else {

        if (!CommonUtils.isEmpty(keyAttributes)) {
        Collection<? extends DBSEntityAttribute> keyAttributes = getKeyAttributes(monitor, object);
            sql.append(DBUtils.getObjectFullName(attr, DBPEvaluationContext.DML)).append("=");
 * distributed under the License is distributed on an "AS IS" BASIS,
            if (hasAttr) sql.append(", ");
        }
            String updateSet = tableDataStatement.generateTableUpdateSet();
                sql.append(separator).append(updateSet);
    @Override
        String separator = getLineSeparator();
                continue;
                sql.append(DBUtils.getObjectFullName(attr, DBPEvaluationContext.DML)).append("=");
            if (CommonUtils.isNotEmpty(updateSet)) {
        String entityName = getEntityName(object);
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
            appendDefaultValue(sql, attr);
