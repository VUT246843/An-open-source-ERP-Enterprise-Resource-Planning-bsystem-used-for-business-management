 *
                dbStat.setString(1, getSchema().getName());
    private List<PostgreTableColumn> lateBindingColumns = null;
        }
 */

        if (lateBindingColumns != null) {
 * RedshiftView
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
        return viewDefinition.toLowerCase().contains("with no schema binding");
        String viewDefinition = getObjectDefinitionText(monitor, Collections.emptyMap());
 * See the License for the specific language governing permissions and

                    List<PostgreTableColumn> columns = new ArrayList<>();
    public List<? extends PostgreTableColumn> getAttributes(@NotNull DBRProgressMonitor monitor) throws DBException {
        }

    public RedshiftView(PostgreSchema catalog, ResultSet dbResult) {
                        String resolvedColTypeName = PostgreConstants.DATA_TYPE_ALIASES.get(colTypeName);
 * Unless required by applicable law or agreed to in writing, software
                    return columns;
 */
    }
import java.util.ArrayList;
        }
                "cols(view_schema name, view_name name, col_name name, col_type varchar, col_num int)\n" +
        if (lateBindingColumns != null) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 * You may obtain a copy of the License at

                        PostgreTableColumn viewColumn = new PostgreTableColumn(this);
import org.jkiss.dbeaver.DBException;
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Read redshift view late binding columns")) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                "WHERE view_schema=? AND view_name=?")) {
import org.jkiss.dbeaver.ext.postgresql.model.PostgreView;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return lateBindingColumns;
            }
import java.sql.SQLException;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;
import org.jkiss.code.Nullable;
public class RedshiftView extends PostgreView
                        String colName = JDBCUtils.safeGetString(dbResult, "col_name");
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                        int colNum = JDBCUtils.safeGetInt(dbResult, "col_num");
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataType;
        return attrs;
                            log.error("Column type name '" + colType + "' not found");

        super(catalog);
        return super.getAttribute(monitor, attributeName);
{
                        columns.add(viewColumn);
import java.util.Collections;
import java.sql.ResultSet;
}
package org.jkiss.dbeaver.ext.postgresql.model.impls.redshift;
                        String colType = JDBCUtils.safeGetString(dbResult, "col_type");
import org.jkiss.dbeaver.model.DBUtils;
import java.util.List;

            lateBindingColumns = readLateBindingColumns(monitor);
 *
        if (isPersisted() && CommonUtils.isEmpty(attrs) && monitor != null && isViewVwithNoSchemaBinding(monitor)) {
                        if (dataType == null) {
    @Override
                        viewColumn.setName(colName);
                        colTypeName = resolvedColTypeName == null ? colTypeName : resolvedColTypeName;
                        viewColumn.setOrdinalPosition(colNum);
            throw new DBException("Error reading view definition: " + e.getMessage(), e);

 * limitations under the License.
                    while (dbResult.next()) {
                return lateBindingColumns;

import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
            }
            return DBUtils.findObject(lateBindingColumns, attributeName);
/**
    public RedshiftView(PostgreSchema catalog) {
 * you may not use this file except in compliance with the License.
                        String colTypeName = DBUtils.getTypeModifiers(colType).getFirst();
    private List<PostgreTableColumn> readLateBindingColumns(DBRProgressMonitor monitor) throws DBException {
    }
import org.jkiss.code.NotNull;
        super(catalog, dbResult);
        }
import org.jkiss.dbeaver.Log;
                        }
 *     http://www.apache.org/licenses/LICENSE-2.0
    }


    }
    }
 *
            if (!CommonUtils.isEmpty(lateBindingColumns)) {

import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableColumn;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSchema;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
                            continue;
                        viewColumn.setFullTypeName(colType);

        } catch (SQLException e) {
    private boolean isViewVwithNoSchemaBinding(DBRProgressMonitor monitor) throws DBException {
                    }

            try (JDBCPreparedStatement dbStat = session.prepareStatement("select * from pg_get_late_binding_view_cols() \n" +
                dbStat.setString(2, getName());
 * distributed under the License is distributed on an "AS IS" BASIS,
/*
                        PostgreDataType dataType = (PostgreDataType) getDataSource().resolveDataType(monitor, colTypeName);
        List<? extends PostgreTableColumn> attrs = super.getAttributes(monitor);
                        viewColumn.setPersisted(true);
    public PostgreTableColumn getAttribute(@NotNull DBRProgressMonitor monitor, @NotNull String attributeName) throws DBException {
    @Override
                        viewColumn.setDataType(dataType);


import org.jkiss.utils.CommonUtils;
                }
    private static final Log log = Log.getLog(RedshiftView.class);
