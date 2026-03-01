            sql.append(getLineSeparator()).append("WHERE ");

/*
 * Copyright (C) 2010-2026 DBeaver Corp and others
}
import org.jkiss.dbeaver.model.DBPEvaluationContext;
package org.jkiss.dbeaver.model.sql.generator.resultset;
                // No unique key - use all columns
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager

import java.util.Collection;
 *
import org.jkiss.dbeaver.model.data.DBDValueRow;
            sql.append(getLineSeparator()).append("FROM ").append(getEntityName(dataProvider.getSingleSource()));
            if (keyAttributes.isEmpty()) {
    protected void generateSQL(
            }
        }

 *
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;

        @NotNull DBDResultSetDataProvider dataProvider
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
            sql.append(";\n");
        for (DBDValueRow firstRow : dataProvider.getSelectedRows()) {
            boolean hasAttr = false;
                hasAttr = true;
                keyAttributes = List.of(dataProvider.getAttributes());
import java.util.List;
import org.jkiss.dbeaver.model.data.DBDResultSetDataProvider;
        @NotNull DBRProgressMonitor monitor,
import org.jkiss.dbeaver.model.DBUtils;
    }
 * Unless required by applicable law or agreed to in writing, software

            for (DBSAttributeBase attr : getAllAttributes(monitor, dataProvider)) {
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                if (hasAttr) sql.append(", ");
import org.jkiss.dbeaver.DBException;
            }
    ) throws DBException {
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
            Collection<DBDAttributeBinding> keyAttributes = getKeyAttributes(monitor, dataProvider);
            appendKeyConditions(sql, keyAttributes, firstRow);
public class SQLGeneratorSelectFromData extends SQLGeneratorResultSet {
 * See the License for the specific language governing permissions and
            sql.append("SELECT ");
    @Override
        @NotNull StringBuilder sql,
 *
                sql.append(DBUtils.getObjectFullName(attr, DBPEvaluationContext.DML));
 * limitations under the License.
