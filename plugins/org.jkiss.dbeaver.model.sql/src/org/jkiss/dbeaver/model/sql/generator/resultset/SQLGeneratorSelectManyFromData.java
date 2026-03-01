        for (int i = 0; i < selectedRows.size(); i++) {
            if (i < selectedRows.size() - 1) sql.append(",");
 * Copyright (C) 2010-2026 DBeaver Corp and others
            }
 */
            hasAttr = true;
        @NotNull StringBuilder sql,
            if (hasAttr) sql.append(", ");
        sql.append("SELECT ");
public class SQLGeneratorSelectManyFromData extends SQLGeneratorResultSet {
        if (multiKey) sql.append(")");
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        @NotNull DBRProgressMonitor monitor,
        Collection<DBDAttributeBinding> keyAttributes = getKeyAttributes(monitor, dataProvider);
            sql.append(DBUtils.getObjectFullName(binding.getAttribute(), DBPEvaluationContext.DML));
        List<? extends DBDValueRow> selectedRows = dataProvider.getSelectedRows();
 * distributed under the License is distributed on an "AS IS" BASIS,
        boolean hasAttr = false;
package org.jkiss.dbeaver.model.sql.generator.resultset;
import java.util.Collection;
            hasAttr = true;
import org.jkiss.dbeaver.DBException;
        for (DBDAttributeBinding binding : keyAttributes) {
            if (multiKey) sql.append("\n");
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
            DBDValueRow firstRow = selectedRows.get(i);
}
/*
                if (hasAttr) sql.append(",");
            for (DBDAttributeBinding binding : keyAttributes) {
        if (multiKey) sql.append("\n");
 * limitations under the License.
import java.util.List;

 * See the License for the specific language governing permissions and
            sql.append(DBUtils.getObjectFullName(attr, DBPEvaluationContext.DML));
 *
import org.jkiss.code.NotNull;
        }
    @Override
 *
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
            if (multiKey) sql.append("(");
            hasAttr = false;
        if (multiKey) sql.append("(");
        hasAttr = false;
    ) throws DBException {
                appendAttributeValue(dataProvider, sql, binding, firstRow, true);
        for (DBSAttributeBase attr : getAllAttributes(monitor, dataProvider)) {
import org.jkiss.dbeaver.model.DBUtils;
                hasAttr = true;
 * You may obtain a copy of the License at

 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.data.DBDResultSetDataProvider;
        boolean multiKey = keyAttributes.size() > 1;
        sql.append(" IN (");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        sql.append(");\n");
 * you may not use this file except in compliance with the License.
    }


        }
 *
    public void generateSQL(
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        sql.append(getLineSeparator()).append("WHERE ");
import org.jkiss.dbeaver.model.data.DBDValueRow;
            if (hasAttr) sql.append(",");
            if (multiKey) sql.append(")");
        @NotNull DBDResultSetDataProvider dataProvider
        sql.append(getLineSeparator()).append("FROM ").append(getEntityName(dataProvider.getSingleSource()));
