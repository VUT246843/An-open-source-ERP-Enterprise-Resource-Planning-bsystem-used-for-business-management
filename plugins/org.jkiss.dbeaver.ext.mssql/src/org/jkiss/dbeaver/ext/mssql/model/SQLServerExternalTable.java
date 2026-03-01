                }

 *
import java.util.Collection;
    public boolean supportsObjectDefinitionOption(@NotNull String option) {
            }
    public Collection<? extends DBSEntityAssociation> getAssociations(@NotNull DBRProgressMonitor monitor) throws DBException {
        super(catalog, dbResult, name);
                    "LEFT JOIN " + SQLServerUtils.getSystemTableName(getDatabase(), "external_data_sources") + " eds ON eds.data_source_id=et.data_source_id\n" +
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load table status")) {
import org.jkiss.dbeaver.model.exec.DBCException;
        @NotNull
    boolean supportsTriggers() {
        private String externalDataSource;
import org.jkiss.dbeaver.model.DBUtils;
    private final AdditionalInfo additionalInfo = new AdditionalInfo();
        private String externalLocation;
        // not implemented
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                throw new DBCException(e, session.getExecutionContext());
 *     http://www.apache.org/licenses/LICENSE-2.0
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
    @Nullable
        }
                "SELECT et.location,eds.name AS data_source_name, eff.name AS file_format_name\n" +
        return null;
            } catch (SQLException e) {
import org.jkiss.dbeaver.model.meta.IPropertyCacheValidator;


        private String externalFileFormat;
    }
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
        @Nullable
        private boolean loaded;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
        @Property(viewable = true, order = 8)
    }

            return object.additionalInfo.loaded;
        @Override
import org.jkiss.code.Nullable;
    @Override
                    }
        }
import org.jkiss.dbeaver.DBException;
                loadAdditionalInfo(monitor);
        }
                        additionalInfo.externalFileFormat = JDBCUtils.safeGetString(dbResult, "file_format_name");
        @NotNull
    @LazyProperty(cacheValidator = AdditionalInfoValidator.class)
 */
    public boolean isView() {
        public String getExternalFileFormat() {
 * limitations under the License.
    @Override

 * Licensed under the Apache License, Version 2.0 (the "License");
import java.sql.SQLException;

    public AdditionalInfo getAdditionalInfo(DBRProgressMonitor monitor) throws DBCException {
        public String getExternalLocation() {
import org.jkiss.dbeaver.model.struct.DBStructUtils;

import org.jkiss.dbeaver.model.struct.DBSEntityAssociation;
    public void setObjectDefinitionText(String source) {
    @Override
    }
    public SQLServerExternalTable(@NotNull SQLServerSchema schema) {
    public Collection<? extends DBSEntityAssociation> getReferences(@NotNull DBRProgressMonitor monitor) throws DBException {
public class SQLServerExternalTable extends SQLServerTableBase {
    public static class AdditionalInfo {
    public static class AdditionalInfoValidator implements IPropertyCacheValidator<SQLServerExternalTable> {
            return additionalInfo;
import org.jkiss.dbeaver.ext.mssql.SQLServerUtils;

    }
    }
    @Override
                    additionalInfo.loaded = true;
        return false;
        return null;


    @Nullable
 * You may obtain a copy of the License at
/*
    @Override
            return;
            )) {
            return externalDataSource;

                    "FROM " + SQLServerUtils.getSystemTableName(getDatabase(), "external_tables") + " et\n" +
        super(schema);
    }
        @Property(viewable = true, order = 7)
import java.sql.ResultSet;
        }

        }
    @Override
    }
package org.jkiss.dbeaver.ext.mssql.model;
            }
    public SQLServerExternalTable(@NotNull SQLServerSchema catalog, @NotNull ResultSet dbResult, @NotNull String name) {
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.meta.PropertyGroup;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        }
    private void loadAdditionalInfo(DBRProgressMonitor monitor) throws DBCException {
        public String getExternalDataSource() {
 *

}
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        }

                    "LEFT JOIN " + SQLServerUtils.getSystemTableName(getDatabase(), "external_file_formats") + " eff ON eff.file_format_id=et.file_format_id\n" +
    @NotNull
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.meta.LazyProperty;
                    if (dbResult.next()) {
        @Property(viewable = true, order = 9)
import org.jkiss.dbeaver.model.meta.Property;
        return false;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
                dbStat.setLong(1, getObjectId());
    @Override
    public Collection<? extends DBSTableConstraint> getConstraints(@NotNull DBRProgressMonitor monitor) throws DBException {
            if (!additionalInfo.loaded) {
        public boolean isPropertyCached(@NotNull SQLServerExternalTable object, @NotNull Object propertyId) {
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {


                    "WHERE et.object_id=?"
            return externalLocation;

                        additionalInfo.externalDataSource = JDBCUtils.safeGetString(dbResult, "data_source_name");
        return DBStructUtils.generateTableDDL(monitor, this, options, false);
    @Nullable
    }
        if (!isPersisted()) {
                        additionalInfo.externalLocation = JDBCUtils.safeGetString(dbResult, "location");
    @Override
import org.jkiss.dbeaver.model.struct.rdb.DBSTableConstraint;
        return null;

            return externalFileFormat;
    }
 * you may not use this file except in compliance with the License.
    @PropertyGroup()
 *
            additionalInfo.loaded = true;
        return false;

    }
        synchronized (additionalInfo) {
    }
import java.util.Map;
    }
