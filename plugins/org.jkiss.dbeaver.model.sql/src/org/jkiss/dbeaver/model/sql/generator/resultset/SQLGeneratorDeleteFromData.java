            if (dbsEntity instanceof SQLQueryGeneratorUpdate) {
 * You may obtain a copy of the License at
                    }
    }
 * See the License for the specific language governing permissions and
            sql.append(getLineSeparator()).append("WHERE ");

                        keyAttributes.add(binding);
                    if (DBUtils.isPseudoAttribute(attr) || DBUtils.isHiddenObject(attr)) {

                sql.append("DELETE FROM ").append(entityName);
/*
            }
    ) throws DBException {
    @Override
            sql.append(";\n");

        @NotNull DBDResultSetDataProvider dataProvider
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
import org.jkiss.dbeaver.model.data.DBDValueRow;
                sql.append(((SQLQueryGeneratorUpdate) dbsEntity).generateTableDeleteFrom(entityName));
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;

import org.jkiss.utils.CommonUtils;
                    if (binding != null) {
 */
            appendKeyConditions(sql, keyAttributes, firstRow);
                        continue;
 * Unless required by applicable law or agreed to in writing, software
}
 *
 * you may not use this file except in compliance with the License.
                Collection<? extends DBSAttributeBase> allAttributes = getAllAttributes(monitor, dataProvider);
        for (DBDValueRow firstRow : dataProvider.getSelectedRows()) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.DBUtils;
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
        @NotNull StringBuilder sql,
 * limitations under the License.
                    DBDAttributeBinding binding = DBUtils.findBinding(dataProvider.getAttributes(), attr);
                for (DBSAttributeBase attr : allAttributes) {
 * Copyright (C) 2010-2026 DBeaver Corp and others
public class SQLGeneratorDeleteFromData extends SQLGeneratorResultSet {
        @NotNull DBRProgressMonitor monitor,
            } else {
                    }
                }
 *
            if (CommonUtils.isEmpty(keyAttributes)) {
import org.jkiss.code.NotNull;
            Collection<DBDAttributeBinding> keyAttributes = getKeyAttributes(monitor, dataProvider);
    protected void generateSQL(
import org.jkiss.dbeaver.model.sql.SQLQueryGeneratorUpdate;
        String entityName = getEntityName(dbsEntity);
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        DBSEntity dbsEntity = dataProvider.getSingleSource();
            }
import org.jkiss.dbeaver.DBException;
                // For tables without keys including virtual
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
import org.jkiss.dbeaver.model.data.DBDResultSetDataProvider;
package org.jkiss.dbeaver.model.sql.generator.resultset;
import java.util.Collection;
import org.jkiss.dbeaver.model.struct.DBSEntity;
