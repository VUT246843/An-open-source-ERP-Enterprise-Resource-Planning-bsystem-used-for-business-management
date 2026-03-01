        if (!additionalInfoLoaded) {
            } catch (SQLException e) {
                        // This is table of metadata, where column name is in the col_name column
import org.jkiss.dbeaver.model.meta.Property;
    @Override
    @Property(viewable = true, order = 4)
                                    tableProperties = value;
                                    location = value;
    }
        checkExtraInfo(monitor);
 *
    }
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
                            switch (key) {

    @Override
        if (!isPersisted()) {
import org.jkiss.dbeaver.DBException;
package org.jkiss.dbeaver.ext.databricks.model;
    }
                    while (dbResult.next()) {
                "DESCRIBE TABLE EXTENDED " + getFullyQualifiedName(DBPEvaluationContext.DDL))) {
            }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
                                    break;
    public DatabricksTable(
    @Override
                                    break;
/*
 *
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
import org.jkiss.dbeaver.model.meta.PropertyLength;
    private String owner;

        @Nullable String tableType,
                                    break;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            this);
    public String getTableProperties(@NotNull DBRProgressMonitor monitor) {
import org.jkiss.code.NotNull;
                }
                        if (CommonUtils.isNotEmpty(key)) {
            log.error("Can't read additional table info", e);
    private static final Log log = Log.getLog(DatabricksTable.class);
    private String tableProperties;
    public String getOwner(@NotNull DBRProgressMonitor monitor) {
        }
    private String location;
    }
 * You may obtain a copy of the License at
            return;
        }
                                    storageProperties = value;
import org.jkiss.dbeaver.Log;

        checkExtraInfo(monitor);

        }
    @Property(viewable = true, updatable = true, length = PropertyLength.MULTILINE, order = 100)

    public void setDescription(String description) {
    }

        additionalInfoLoaded = false;
                                case DatabricksConstants.PROP_CREATED_TIME:
    private String createdTime;
    private String storageProperties;
    private void loadAdditionalInfo(@NotNull DBRProgressMonitor monitor) {
            getCatalog(),
 * DBeaver - Universal Database Manager
                                    break;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    public synchronized DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
import org.jkiss.utils.CommonUtils;
    private String description;
public class DatabricksTable extends GenericTable {
    @Property(viewable = true, length = PropertyLength.MULTILINE, order = 98)
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;

            loadAdditionalInfo(monitor);
                                    createdTime = value;
        checkExtraInfo(monitor);
    public String getCreatedTime(@NotNull DBRProgressMonitor monitor) {
                                    break;
                                case DatabricksConstants.PROP_STORAGE_PROPERTIES:
    private volatile boolean additionalInfoLoaded = false;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

 */
                        String key = JDBCUtils.safeGetString(dbResult, "col_name");

    public String getStorageProperties(@NotNull DBRProgressMonitor monitor) {
 * Copyright (C) 2010-2025 DBeaver Corp and others

                                case "Comment":
                log.error("Can't read additional table info", e);
import org.jkiss.code.Nullable;
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
    @NotNull
}
            getDataSource(),
    @Property(viewable = true, order = 2)
import org.jkiss.dbeaver.model.struct.DBSObject;
        GenericStructContainer container,
        @Nullable JDBCResultSet dbResult
        checkExtraInfo(monitor);
    @Nullable
        this.description = description;
import org.jkiss.dbeaver.ext.generic.model.GenericTable;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.exec.DBCException;
    ) {
import java.sql.SQLException;
    }
        return owner;
 * Unless required by applicable law or agreed to in writing, software
                                case DatabricksConstants.PROP_OWNER:
                                    break;
        checkExtraInfo(monitor);
    @Property(viewable = true, order = 3)
    private void checkExtraInfo(@NotNull DBRProgressMonitor monitor) {
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
                                    owner = value;

                            }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    }

        } catch (DBCException e) {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
 *
        return tableProperties;
        return super.refreshObject(monitor);
        return createdTime;

                    additionalInfoLoaded = true;
    }
                        String value = JDBCUtils.safeGetString(dbResult, "data_type");
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load table extra info")) {
        return description;
                                case DatabricksConstants.PROP_TABLE_PROPERTIES:
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.DBUtils;
            getSchema(),
    public String getDescription() {
        return location;
                                    description = value;
    @Override
        return DBUtils.getFullQualifiedName(
        return storageProperties;
    public String getLocation(@NotNull DBRProgressMonitor monitor) {
import org.jkiss.dbeaver.ext.databricks.DatabricksConstants;
                        }
    }
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
    }
                                case DatabricksConstants.PROP_LOCATION:

    }
        @Nullable String tableName,
            additionalInfoLoaded = true;
 * you may not use this file except in compliance with the License.


                    }
    @Property(viewable = true, length = PropertyLength.MULTILINE, order = 99)
        super(container, tableName, tableType, dbResult);
