        @NotNull DBDResultSetDataProvider dataProvider
                sql.append(separator).append("SET ");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
            if (dbsEntity instanceof SQLQueryGeneratorUpdate dataStatement) {
 * Copyright (C) 2010-2026 DBeaver Corp and others
            }
import java.util.Collection;
 *     http://www.apache.org/licenses/LICENSE-2.0
 */

                }
            Collection<? extends DBSAttributeBase> valueAttributes = getValueAttributes(monitor, dataProvider, keyAttributes);
import org.jkiss.dbeaver.DBException;
                if (CommonUtils.isNotEmpty(updateSet)) {
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
                appendKeyConditions(sql, keyAttributes, firstRow);
    ) throws DBException {
        @NotNull DBRProgressMonitor monitor,
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
    }
        DBSEntity dbsEntity = dataProvider.getSingleSource();
import org.jkiss.utils.CommonUtils;
        String entityName = getEntityName(dbsEntity);
            boolean hasAttr = false;
/*
    @Override
            }

            Collection<DBDAttributeBinding> keyAttributes = getKeyAttributes(monitor, dataProvider);
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.sql.SQLQueryGeneratorUpdate;
                String updateSet = dataStatement.generateTableUpdateSet();
                DBDAttributeBinding binding = DBUtils.findBinding(dataProvider.getAttributes(), attr);
                valueAttributes = keyAttributes;
                sql.append("UPDATE ").append(entityName);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * You may obtain a copy of the License at
    protected void generateSQL(

        }
public class SQLGeneratorUpdateFromData extends SQLGeneratorResultSet {
        @NotNull StringBuilder sql,
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.DBPEvaluationContext;
            }
                sql.append(separator).append("WHERE ");
                } else {
                sql.append(dataStatement.generateTableUpdateBegin(entityName));


                }
        for (DBDValueRow firstRow : dataProvider.getSelectedRows()) {
 *
            if (!CommonUtils.isEmpty(keyAttributes)) {
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.model.data.DBDValueRow;
import org.jkiss.dbeaver.model.data.DBDResultSetDataProvider;
                if (binding == null) {
                }
                sql.append(DBUtils.getObjectFullName(attr, DBPEvaluationContext.DML)).append("=");
 * limitations under the License.
                    continue;
    @Override
import org.jkiss.dbeaver.model.struct.DBSEntity;
            if (CommonUtils.isEmpty(valueAttributes)) {
                if (hasAttr) sql.append(", ");
package org.jkiss.dbeaver.model.sql.generator.resultset;
                    appendAttributeValue(dataProvider, sql, binding, firstRow, true);
        String separator = getLineSeparator();
                hasAttr = true;
    }
            for (DBSAttributeBase attr : valueAttributes) {
                    appendDefaultValue(sql, attr);
    public boolean isDMLOption() {
            } else {
                    sql.append(separator).append(updateSet);
            sql.append(";\n");
 *
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
}
        return true;
                if (DBUtils.isPseudoAttribute(attr) || DBUtils.isHiddenObject(attr)) {
 * Unless required by applicable law or agreed to in writing, software

