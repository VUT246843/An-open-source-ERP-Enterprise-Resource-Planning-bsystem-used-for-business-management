public class GreenplumTable extends PostgreTableRegular {
        }
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableColumn;
                ddl,
            return null;
        }
 */
            GreenplumUtils.addObjectModifiersToDDL(
        }
 *
            } else {
                distributionColumns,
            if (dataSource instanceof GreenplumDataSource) {
    private static final Log log = Log.getLog(GreenplumTable.class);
/**
                distributionColumns = GreenplumUtils.readDistributedColumns(monitor, this);
        PostgreDataSource dataSource = getDataSource();
                supportsReplicatedDistribution,
 * See the License for the specific language governing permissions and

 * Copyright (C) 2019 Zach Marcin (zmarcin@pivotal.io)
        } catch (DBException e) {
 * Copyright (C) 2019 Gavin Shaw (gshaw@pivotal.io)
        List<PostgreTableColumn> columns = new ArrayList<>(distributionColumns.length);

                log.debug("Bad policy attribute position: " + distributionColumns[i]);
            }
        return accessMethod;
        return columns;
 *

 * distributed under the License is distributed on an "AS IS" BASIS,
    private boolean supportsReplicatedDistribution = false;
            if (attr == null) {
            } catch (Throwable e) {
 * GreenplumTable
            PostgreDataSource dataSource = getDataSource();
 * Copyright (C) 2019 Nikhil Pawar (npawar@pivotal.io)
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    public void appendTableModifiers(DBRProgressMonitor monitor, StringBuilder ddl) {


                this,
    }
    private String accessMethod;
/*
import java.sql.ResultSet;
    private List<PostgreTableColumn> getDistributionPolicy(DBRProgressMonitor monitor) throws DBException {
}
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * DBeaver - Universal Database Manager
                readPartitionInfo = !((GreenplumDataSource) dataSource).isGreenplumVersionAtLeast(7, 0);
 * Copyright (C) 2019 Dmitriy Dubson (ddubson@pivotal.io)
            PostgreTableColumn attr = getAttributeByPos(monitor, distributionColumns[i]);
            }
            if (CommonUtils.isEmpty(distributionColumns)) {
        if (dataSource instanceof GreenplumDataSource) {
                // Read partitions DDLs separately starting Greenplum 7

            log.error("Error reading Greenplum table properties", e);
            supportsReplicatedDistribution = true;
        if (catalog.getDataSource().isServerVersionAtLeast(9, 1)) {
                readPartitionInfo);
                log.error("Error reading distribution policy", e);



import java.util.ArrayList;
    public GreenplumTable(PostgreSchema catalog, ResultSet dbResult) {
 *     http://www.apache.org/licenses/LICENSE-2.0
                distributionColumns = new int[0];

    @Override
                columns.add(attr);

            }
        if (distributionColumns.length == 0) {
    }
            if (distributionColumns == null) {

        super(catalog);
    public GreenplumTable(PostgreSchema catalog) {
            List<PostgreTableColumn> distributionColumns = getDistributionPolicy(monitor);
        }
 */
    @Nullable
import java.util.List;

 * Licensed under the Apache License, Version 2.0 (the "License");
        if (distributionColumns == null) {
 * you may not use this file except in compliance with the License.
                distributionColumns = GreenplumUtils.getDistributionTableColumns(monitor, distributionColumns, this);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableRegular;
            }

        }
            if (((GreenplumDataSource) dataSource).isGreenplumVersionAtLeast(7, 0)) {
import org.jkiss.utils.CommonUtils;
 *
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataSource;
import org.jkiss.dbeaver.Log;
                monitor,
    }
        }

            }
            }
 * You may obtain a copy of the License at
    }
    public String getAccessMethod() {
        try {
        for (int i = 0; i < distributionColumns.length; i++) {
package org.jkiss.dbeaver.ext.greenplum.model;
    private int[] distributionColumns;
 * limitations under the License.
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSchema;
                accessMethod = JDBCUtils.safeGetString(dbResult, "amname");

        super(catalog, dbResult);
            try {
            boolean readPartitionInfo = true;
    }
import org.jkiss.dbeaver.DBException;
