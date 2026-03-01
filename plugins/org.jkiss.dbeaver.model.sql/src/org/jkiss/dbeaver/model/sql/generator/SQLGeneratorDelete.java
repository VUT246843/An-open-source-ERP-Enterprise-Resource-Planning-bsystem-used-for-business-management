import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
 * Unless required by applicable law or agreed to in writing, software
    public void generateSQL(DBRProgressMonitor monitor, StringBuilder sql, DBSEntity object) throws DBException {
 * See the License for the specific language governing permissions and
            sql.append(DBUtils.getObjectFullName(attr, DBPEvaluationContext.DML)).append("=");
/*
 *
import org.jkiss.dbeaver.model.DBUtils;

 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.model.sql.generator;
}
 * You may obtain a copy of the License at
        if (CommonUtils.isEmpty(keyAttributes)) {
 * you may not use this file except in compliance with the License.
    @Override
import org.jkiss.dbeaver.model.struct.DBSEntity;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
public class SQLGeneratorDelete extends SQLGeneratorTable {
        }
            sql.append("DELETE FROM ").append(entityName);
 * limitations under the License.
        for (DBSEntityAttribute attr : keyAttributes) {
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        if (object instanceof SQLQueryGeneratorUpdate) {
 * distributed under the License is distributed on an "AS IS" BASIS,
            appendDefaultValue(sql, attr);
    }
            sql.append(((SQLQueryGeneratorUpdate) object).generateTableDeleteFrom(entityName));
import org.jkiss.utils.CommonUtils;
import java.util.Collection;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        }
        } else {
 *     http://www.apache.org/licenses/LICENSE-2.0

            keyAttributes = getAllAttributes(monitor, object);
        sql.append(";\n");
            hasAttr = true;
import org.jkiss.dbeaver.model.sql.SQLQueryGeneratorUpdate;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.DBException;
 */
        String entityName = getEntityName(object);
 *
 * DBeaver - Universal Database Manager
        Collection<? extends DBSEntityAttribute> keyAttributes = getKeyAttributes(monitor, object);
            if (hasAttr) sql.append(" AND ");
        boolean hasAttr = false;
        }
        sql.append(getLineSeparator()).append("WHERE ");

