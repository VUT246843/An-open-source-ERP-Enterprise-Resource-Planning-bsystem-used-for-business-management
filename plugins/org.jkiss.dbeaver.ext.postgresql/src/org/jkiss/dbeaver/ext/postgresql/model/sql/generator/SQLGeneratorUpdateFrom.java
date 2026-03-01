import java.util.Collection;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
/*
            }
import org.jkiss.dbeaver.model.DBUtils;



 * limitations under the License.
                }
    public void generateSQL(DBRProgressMonitor monitor, StringBuilder sql, DBSEntity object) throws DBException {
        Collection<? extends DBSEntityAttribute> keyAttributes = getKeyAttributes(monitor, object);
        boolean hasAttr = false;
 *
 * DBeaver - Universal Database Manager
        sql.append("UPDATE ").append(entityName).append(" AS tgt");
package org.jkiss.dbeaver.ext.postgresql.model.sql.generator;
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
                sql.append("src." + DBUtils.getObjectFullName(attr, DBPEvaluationContext.DML));
            sql.append("ON ('/* insert attributes equality here, e.g. tgt.ID = src.ID AND ... */')").append(getLineSeparator());
            sql.append("src." + DBUtils.getObjectFullName(attr, DBPEvaluationContext.DML));
import org.jkiss.dbeaver.model.sql.generator.SQLGeneratorTable;
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
        String entityName = getEntityName(object);
 *
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
        sql.append(getLineSeparator()).append("FROM SOURCE_TABLE AS src");
        sql.append(";").append(getLineSeparator());
}

 * Licensed under the Apache License, Version 2.0 (the "License");
            sql.append(DBUtils.getObjectFullName(attr, DBPEvaluationContext.DML)).append("=");
        }
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
            hasAttr = true;
                continue;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.DBException;
            hasAttr = false;
                sql.append(", ");
                if (hasAttr) {
        if (!CommonUtils.isEmpty(keyAttributes)) {
                    sql.append(" AND ");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.utils.CommonUtils;
        String separator = getLineSeparator();        
            }
            }
            if (hasAttr) {
                hasAttr = true;
                sql.append("tgt." + DBUtils.getObjectFullName(attr, DBPEvaluationContext.DML)).append("=");
 * you may not use this file except in compliance with the License.
 *
 */
 * You may obtain a copy of the License at
public class SQLGeneratorUpdateFrom extends SQLGeneratorTable {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            if (DBUtils.isPseudoAttribute(attr) || DBUtils.isHiddenObject(attr)) {
import org.jkiss.dbeaver.model.struct.DBSEntity;
        }
        } else {
        sql.append(separator).append("SET ");
            for (DBSEntityAttribute attr : keyAttributes) {
            sql.append(getLineSeparator()).append("WHERE ");
        for (DBSAttributeBase attr : getValueAttributes(monitor, object, keyAttributes)) {
