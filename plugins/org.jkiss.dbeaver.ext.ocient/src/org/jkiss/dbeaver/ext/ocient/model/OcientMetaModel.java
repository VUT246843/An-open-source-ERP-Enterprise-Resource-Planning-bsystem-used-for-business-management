                    "Read Ocient view create text");
                    while (resultSet.nextRow()) {
    public String getTableDDL(
        DBRProgressMonitor monitor,

    public String getViewDDL(
    {
                }
                    }
                tableOrViewType,
    @Override

                DBUtils.getFullQualifiedName(sourceObject.getDataSource(), sourceObject.getContainer(), sourceObject);
        Map<String, Object> options,
                tableOrViewType,
    ) throws DBException {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            return new OcientView(
/*
        @NotNull Map<String, Object> options
import java.sql.SQLException;
import org.jkiss.code.NotNull;
            return getObjectDDL(monitor, sourceObject, options, viewDDLSQL,
        try {
 * Copyright (C) 2010-2026 DBeaver Corp and others
    protected String getObjectDDL(

    @NotNull
    ) throws DBException {
    public GenericTableBase createTableOrViewImpl(
                container,
        @NotNull GenericStructContainer container,
                            createText.append(creationDDL);
import org.jkiss.code.Nullable;
        String sql,
        if (tableOrViewType != null && isView(tableOrViewType))
import java.util.Map;
import org.jkiss.dbeaver.DBException;
        @NotNull GenericTableBase sourceObject,
                        return createText.toString();

        @Nullable String tableOrViewType,
                        return "-- Create text not found";

    }

        } catch (DBException e) {
        @NotNull Map<String, Object> options
 *
        @NotNull GenericView sourceObject,

    }
        try {
    
                container,
                tableOrViewName,
                    else {
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.DBDatabaseException;

import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 * Licensed under the Apache License, Version 2.0 (the "License");
                try (JDBCResultSet resultSet = stmt.executeQuery()) {
                    if (createText.isEmpty()) {
        }

import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 *
        @NotNull DBRProgressMonitor monitor,
        String fullQualifiedName =
        }
        @NotNull DBRProgressMonitor monitor,
        } catch (DBException e) {
    }
                tableOrViewName,
 *
            return getObjectDDL(monitor, sourceObject, options, tableDDLSQL,
    }
            return super.getTableDDL(monitor, sourceObject, options);
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
    public OcientMetaModel() {
        GenericTableBase sourceObject,
        }
                DBUtils.getFullQualifiedName(sourceObject.getDataSource(), sourceObject.getContainer(), sourceObject);
    }
package org.jkiss.dbeaver.ext.ocient.model;
public class OcientMetaModel extends GenericMetaModel {
 * DBeaver - Universal Database Manager
                    }
        {
        String fullQualifiedName =
        String tableDDLSQL = String.format("export table %s", fullQualifiedName);
}
        catch (SQLException e) {
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                dbResult);
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
        String description
        GenericDataSource dataSource = sourceObject.getDataSource();
        } else {
 * limitations under the License.
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
        @Nullable String tableOrViewName,
                dbResult);
import org.jkiss.dbeaver.ext.generic.model.GenericView;
            throw new DBDatabaseException(e, dataSource);
 */
                    }
            try (JDBCPreparedStatement stmt = session.prepareStatement(sql)) {
 * Unless required by applicable law or agreed to in writing, software
            return super.getViewDDL(monitor, sourceObject, options);
 * you may not use this file except in compliance with the License.
    ) throws DBException {


                        String creationDDL = resultSet.getString(1);
        String viewDDLSQL = String.format("export view %s", fullQualifiedName);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        @Nullable JDBCResultSet dbResult)
                        if (creationDDL != null)
 * distributed under the License is distributed on an "AS IS" BASIS,
            return new OcientTable(
        try (JDBCSession session = DBUtils.openMetaSession(monitor, sourceObject, description)) {
            }
        }
import org.jkiss.dbeaver.model.DBUtils;
                    "Read Ocient base table create text");
        super();
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
                    StringBuilder createText = new StringBuilder();
