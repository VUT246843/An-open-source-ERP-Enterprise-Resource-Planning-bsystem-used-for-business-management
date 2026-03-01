        if (rowIdentifier == null) {
                }
        }
        @NotNull DBDResultSetDataProvider dataProvider

            }
 * Copyright (C) 2010-2026 DBeaver Corp and others
    }
    ) throws DBException;
        return rowIdentifier.getAttributes();

        Object[] values = firstRow.getValues();
    }
    protected void appendAttributeValue(
            sql.append(
                sql.append(" AND ");

import org.jkiss.dbeaver.model.DBUtils;
        @NotNull DBDValueRow firstRow
        }
    protected abstract void generateSQL(
import org.jkiss.code.NotNull;
            }
    ) throws DBException {
            return Collections.emptyList();
            ));
        @NotNull Collection<DBDAttributeBinding> keyAttributes,
    void appendKeyConditions(
 * limitations under the License.
            appendAttributeValue(dataProvider, sql, binding, firstRow, true);
import org.jkiss.dbeaver.model.DBPDataKind;
 *
    @NotNull
    }
                Object documentId = document.getDocumentId();
                    isInCondition
        @NotNull DBDValueRow firstRow
        Object value = dataProvider.getCellValue(binding, row);
    @NotNull
        return dataProvider.getVisibleAttributes();
            sql.append(" IS NULL");
                    DBUtils.findValueHandler(dataSource, attribute),
import org.jkiss.dbeaver.model.DBPDataSource;
        @NotNull DBRProgressMonitor monitor,
import java.util.Collections;
}
        @NotNull DBDResultSetDataProvider dataProvider
        @NotNull DBDResultSetDataProvider dataProvider
        }
 *
                SQLUtils.convertValueToSQL(
    private void appendValueCondition(

        DBSAttributeBase attribute = binding.getAttribute();
        @NotNull StringBuilder sql,
                SQLUtils.convertValueToSQL(dataSource, attribute, value));
    }
                if (idName != null && documentId != null) {
 * DBeaver - Universal Database Manager
    }
            hasAttr = true;
        } else {
        DBPDataSource dataSource = binding.getDataSource();
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    ) throws DBException {
        @NotNull DBRProgressMonitor monitor,
                Object idName = document.getDocumentProperty(DBDDocument.PROP_ID_ATTRIBUTE_NAME);
import java.util.Collection;

        if (attribute.getDataKind() == DBPDataKind.DATETIME && isUseCustomDataFormat()) {
                    DBDDisplayFormat.UI,
            appendValueCondition(getDataProvider(), sql, attr, firstRow);
        @NotNull DBDAttributeBinding binding,
                    value,
        if (!ArrayUtils.isEmpty(values)) {
import org.jkiss.dbeaver.model.sql.SQLUtils;
        @NotNull StringBuilder sql,
                    );
public abstract class SQLGeneratorResultSet extends SQLGeneratorBase<DBDResultSetDataProvider> {
            if (hasAttr) {
    public DBDResultSetDataProvider getDataProvider() {
    ) throws DBException {
                        SQLUtils.quoteString(getDataProvider().getSingleSource(), documentId.toString())
    protected List<DBDAttributeBinding> getKeyAttributes(
    protected Collection<? extends DBSAttributeBase> getAllAttributes(
 * you may not use this file except in compliance with the License.
        @NotNull DBDValueRow row,
        return objects.getFirst();
            sql.append("=");

        Object value = dataProvider.getCellValue(binding, firstRow);

        if (DBUtils.isNullValue(value)) {
        sql.append(DBUtils.getObjectFullName(binding.getAttribute(), DBPEvaluationContext.DML));
                dataSource,
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;

    }
                    sql.append(idName).append(" = ").append(
 * Licensed under the Apache License, Version 2.0 (the "License");
                )
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import java.util.List;
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.utils.ArrayUtils;
            if (firstCellValue instanceof DBDDocument document) {
        final DBDRowIdentifier rowIdentifier = dataProvider.getDefaultRowIdentifier();
        }
        @NotNull DBDResultSetDataProvider dataProvider,
    ) throws DBException {
            sql.append(SQLUtils.quoteString(
import org.jkiss.dbeaver.model.sql.generator.SQLGeneratorBase;
        } else {
        for (DBDAttributeBinding attr : keyAttributes) {
                    return;
import org.jkiss.dbeaver.model.data.*;
/*
        @NotNull StringBuilder sql,
        boolean isInCondition
package org.jkiss.dbeaver.model.sql.generator.resultset;
 * Unless required by applicable law or agreed to in writing, software
        @NotNull StringBuilder sql,
    ) throws DBException {
        @NotNull DBDResultSetDataProvider dataProvider,
            Object firstCellValue = values[0];
                    dataSource,
 * distributed under the License is distributed on an "AS IS" BASIS,
 */

        }
 *

import org.jkiss.dbeaver.DBException;
        @NotNull DBDAttributeBinding binding,
                    attribute,
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
        @NotNull DBRProgressMonitor monitor,
        boolean hasAttr = false;
