import org.jkiss.dbeaver.model.DBPEvaluationContext;
    @NotNull

 * Copyright (C) 2010-2025 DBeaver Corp and others
                                    break;

    private void loadAdditionalInfo(@NotNull DBRProgressMonitor monitor) {
                            switch (key) {
            loadAdditionalInfo(monitor);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
import org.jkiss.dbeaver.Log;
        }
            this);
 */
                "DESCRIBE SCHEMA EXTENDED " + getFullyQualifiedName(DBPEvaluationContext.DDL))) {

        return location;
 * distributed under the License is distributed on an "AS IS" BASIS,
    public synchronized DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
            getCatalog(),
    @Property(viewable = true, order = 2)
    }
        checkExtraInfo(monitor);
                    }
            getDataSource(),
    public DatabricksSchema(@NotNull GenericDataSource dataSource, @Nullable GenericCatalog catalog, @NotNull String schemaName) {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
                                    properties = value;
public class DatabricksSchema extends GenericSchema implements DBPQualifiedObject {
    public String getLocation(@NotNull DBRProgressMonitor monitor) {
import org.jkiss.code.NotNull;
                                    owner = value;
    @Override
                }
                            }
                        // This is table of metadata, where column name is in the database_description_item column
            log.error("Can't read additional schema info", e);
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
    private static final Log log = Log.getLog(DatabricksSchema.class);

        } catch (DBCException e) {

    public String getOwner(@NotNull DBRProgressMonitor monitor) {
    private String owner;
    }
    private String location;
        additionalInfoLoaded = false;
import org.jkiss.dbeaver.model.meta.PropertyLength;
                        }
                                    break;
    }
    public String getProperties(@NotNull DBRProgressMonitor monitor) {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load schema extra info")) {
        if (!additionalInfoLoaded) {

 * You may obtain a copy of the License at
                                    break;
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
                log.error("Can't read additional schema info", e);
        return DBUtils.getFullQualifiedName(
import org.jkiss.dbeaver.ext.generic.model.GenericCatalog;
    }
                    additionalInfoLoaded = true;
                                    location = value;
    private volatile boolean additionalInfoLoaded = false;
            return;
import org.jkiss.dbeaver.ext.generic.model.GenericSchema;
package org.jkiss.dbeaver.ext.databricks.model;
    }
                                case "Properties":
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Property(viewable = true, length = PropertyLength.MULTILINE, order = 7)
import org.jkiss.dbeaver.model.meta.Property;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
}
 *
                                case DatabricksConstants.PROP_OWNER:
    @Override
    private String properties;
import org.jkiss.dbeaver.model.struct.DBSObject;
        }
import org.jkiss.utils.CommonUtils;
        super(dataSource, catalog, schemaName);
        return super.refreshObject(monitor);

 * limitations under the License.
            additionalInfoLoaded = true;
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    }
        }
 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.model.exec.DBCException;

    private void checkExtraInfo(@NotNull DBRProgressMonitor monitor) {
                    while (dbResult.next()) {
 * Unless required by applicable law or agreed to in writing, software
 *


import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            }
import java.sql.SQLException;
                        String value = JDBCUtils.safeGetString(dbResult, "database_description_value");
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
import org.jkiss.dbeaver.DBException;
            } catch (SQLException e) {
                        if (CommonUtils.isNotEmpty(key)) {
    }

import org.jkiss.dbeaver.ext.databricks.DatabricksConstants;
import org.jkiss.code.Nullable;
 *
        return properties;
        checkExtraInfo(monitor);
        checkExtraInfo(monitor);
/*
        return owner;
        if (!isPersisted()) {
                        String key = JDBCUtils.safeGetString(dbResult, "database_description_item");
import org.jkiss.dbeaver.model.DBPQualifiedObject;
    @Property(viewable = true, order = 3)
                                case DatabricksConstants.PROP_LOCATION:
