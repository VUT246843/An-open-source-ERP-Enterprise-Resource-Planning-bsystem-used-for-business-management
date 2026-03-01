    }
    private String description;
    }
                                    description = value;
                        // This is table of metadata, where column name is in the col_name column

                        String value = JDBCUtils.safeGetString(dbResult, "data_type");
                        String key = JDBCUtils.safeGetString(dbResult, "col_name");
        }
    private static final Log log = Log.getLog(DatabricksView.class);
    }
            additionalInfoLoaded = true;

import org.jkiss.dbeaver.model.exec.DBCException;
                "DESCRIBE TABLE EXTENDED " + getFullyQualifiedName(DBPEvaluationContext.DDL))) {
                                    break;
    }
import org.jkiss.dbeaver.model.DBUtils;
 * DBeaver - Universal Database Manager
        checkExtraInfo(monitor);
 * limitations under the License.
    @NotNull
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
    public synchronized DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
    private String storageProperties;
    @Property(viewable = true, length = PropertyLength.MULTILINE, order = 99)
        return storageProperties;
    @Property(viewable = true, length = PropertyLength.MULTILINE, order = 98)
        }

                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
 * you may not use this file except in compliance with the License.

    @Property(viewable = true, order = 2)

                                    break;
                                    break;
package org.jkiss.dbeaver.ext.databricks.model;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        return owner;
 * See the License for the specific language governing permissions and
        return super.refreshObject(monitor);
        checkExtraInfo(monitor);
    private void checkExtraInfo(@NotNull DBRProgressMonitor monitor) {
                                    tableProperties = value;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        GenericStructContainer container,
                                case "Comment":
            loadAdditionalInfo(monitor);
import org.jkiss.dbeaver.Log;
            getDataSource(),
    }
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
            getCatalog(),
        }
import org.jkiss.code.Nullable;
    private String createdTime;
    }
    public String getStorageProperties(@NotNull DBRProgressMonitor monitor) {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return createdTime;
        @Nullable String tableType,
    }
    public String getTableProperties(@NotNull DBRProgressMonitor monitor) {

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    private String tableProperties;
                    }
                }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;

                                case DatabricksConstants.PROP_TABLE_PROPERTIES:

/*
            } catch (SQLException e) {
import org.jkiss.dbeaver.DBException;
    @Override
        super(container, tableName, tableType, dbResult);
                                    break;
        if (!additionalInfoLoaded) {
                                    break;
        return tableProperties;
 *
import org.jkiss.code.NotNull;

                log.error("Can't read additional table info", e);
    public String getOwner(@NotNull DBRProgressMonitor monitor) {
            return;
public class DatabricksView extends GenericView {
}
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.meta.Property;
                    while (dbResult.next()) {
    public DatabricksView(
            }
    @Override
    }
    private volatile boolean additionalInfoLoaded = false;
import org.jkiss.dbeaver.ext.databricks.DatabricksConstants;
 * You may obtain a copy of the License at
                        }
                                case DatabricksConstants.PROP_STORAGE_PROPERTIES:
        checkExtraInfo(monitor);
                                case DatabricksConstants.PROP_CREATED_TIME:
    public String getCreatedTime(@NotNull DBRProgressMonitor monitor) {
        if (!isPersisted()) {
                                case DatabricksConstants.PROP_OWNER:
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    ) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
import org.jkiss.dbeaver.model.meta.PropertyLength;
            getSchema(),
    private void loadAdditionalInfo(@NotNull DBRProgressMonitor monitor) {
 */
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
        @Nullable JDBCResultSet dbResult
                        if (CommonUtils.isNotEmpty(key)) {
            log.error("Can't read additional table info", e);
        return DBUtils.getFullQualifiedName(
    @Property(viewable = true, order = 3)
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                                    owner = value;
import org.jkiss.dbeaver.model.struct.DBSObject;
import java.sql.SQLException;
    @Property(viewable = true, length = PropertyLength.MULTILINE, order = 100)
    public String getDescription() {
        checkExtraInfo(monitor);
                                    storageProperties = value;
                            switch (key) {
 * Unless required by applicable law or agreed to in writing, software

        @Nullable String tableName,
    private String owner;

            this);
                            }
                                    createdTime = value;
    @Nullable

        additionalInfoLoaded = false;
    @Override
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.ext.generic.model.GenericView;
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load view extra info")) {

    }
 *

                    additionalInfoLoaded = true;
        } catch (DBCException e) {
        return description;
 *
