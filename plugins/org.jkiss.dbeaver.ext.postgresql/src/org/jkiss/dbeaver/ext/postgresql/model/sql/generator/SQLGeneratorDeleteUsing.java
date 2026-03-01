 * Copyright (C) 2010-2024 DBeaver Corp and others
        if (CommonUtils.isEmpty(keyAttributes)) {
 * See the License for the specific language governing permissions and
public class SQLGeneratorDeleteUsing extends SQLGeneratorTable {
 * limitations under the License.
            }
/*

    @Override
        sql.append("DELETE FROM ").append(entityName).append(" AS tgt");
import org.jkiss.dbeaver.model.DBUtils;
            sql.append("src." + DBUtils.getObjectFullName(attr, DBPEvaluationContext.DML));
import java.util.Collection;
 *
    }

            keyAttributes = getAllAttributes(monitor, object);
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.struct.DBSEntity;
        sql.append(";").append(getLineSeparator());
import org.jkiss.dbeaver.DBException;
        sql.append(getLineSeparator()).append("WHERE ");
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        String entityName = getEntityName(object);
        }
                sql.append(" AND ");
            sql.append("tgt." + DBUtils.getObjectFullName(attr, DBPEvaluationContext.DML)).append("=");
 * you may not use this file except in compliance with the License.
    public void generateSQL(DBRProgressMonitor monitor, StringBuilder sql, DBSEntity object) throws DBException {
 *
        for (DBSEntityAttribute attr : keyAttributes) {
}
            hasAttr = true;
 * You may obtain a copy of the License at
        }
        Collection<? extends DBSEntityAttribute> keyAttributes = getKeyAttributes(monitor, object);
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.sql.generator.SQLGeneratorTable;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        boolean hasAttr = false;

            if (hasAttr) {
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.ext.postgresql.model.sql.generator;
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;

        sql.append(getLineSeparator()).append("USING SOURCE_TABLE AS src");
