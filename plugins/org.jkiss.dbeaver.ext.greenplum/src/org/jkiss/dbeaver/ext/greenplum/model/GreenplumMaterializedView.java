        List<PostgreTableColumn> columns = new ArrayList<>(distributionColumns.length);

    public GreenplumMaterializedView(PostgreSchema catalog, ResultSet dbResult) {

        }
            }

        if (catalog.getDataSource().isServerVersionAtLeast(9, 1)) {
 * Copyright (C) 2010-2024 DBeaver Corp and others

    }
    private int[] distributionColumns;
        try {

        } catch (DBException e) {
import java.util.List;
            GreenplumUtils.addObjectModifiersToDDL(monitor, ddl, this, distributionColumns, supportsReplicatedDistribution, false);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public void appendTableModifiers(DBRProgressMonitor monitor, StringBuilder ddl) {
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");


        return columns;
import org.jkiss.dbeaver.Log;
            supportsReplicatedDistribution = true;
            try {
            if (distributionColumns == null) {
 *
                distributionColumns = GreenplumUtils.readDistributedColumns(monitor, this);
        super(catalog);

import org.jkiss.dbeaver.ext.postgresql.model.PostgreMaterializedView;
        for (int i = 0; i < distributionColumns.length; i++) {
            }
import java.sql.ResultSet;
        }
import java.util.ArrayList;
    }
 * You may obtain a copy of the License at

        if (distributionColumns == null) {
 */
 *
    private static final Log log = Log.getLog(GreenplumMaterializedView.class);
            if (CommonUtils.isEmpty(distributionColumns)) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            } catch (Throwable e) {
            } else {
 * DBeaver - Universal Database Manager
import org.jkiss.utils.CommonUtils;
            if (attr == null) {

import org.jkiss.dbeaver.ext.postgresql.model.PostgreSchema;
    @Override
/*
    }
                columns.add(attr);
 *
            log.error("Error reading Greenplum table properties", e);
            }
        super(catalog, dbResult);
            PostgreTableColumn attr = getAttributeByPos(monitor, distributionColumns[i]);
        }
 * See the License for the specific language governing permissions and
}
            List<PostgreTableColumn> distributionColumns = getDistributionPolicy(monitor);
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableColumn;

            }
 * distributed under the License is distributed on an "AS IS" BASIS,

        }
    private List<PostgreTableColumn> getDistributionPolicy(DBRProgressMonitor monitor) throws DBException {
    }
public class GreenplumMaterializedView extends PostgreMaterializedView {
                log.debug("Bad policy attribute position: " + distributionColumns[i]);
                distributionColumns = new int[0];

    private boolean supportsReplicatedDistribution;
package org.jkiss.dbeaver.ext.greenplum.model;
        if (distributionColumns.length == 0) {
                distributionColumns = GreenplumUtils.getDistributionTableColumns(monitor, distributionColumns, this);
                log.error("Error reading distribution policy", e);
            return null;
 * you may not use this file except in compliance with the License.
    public GreenplumMaterializedView(PostgreSchema catalog) {
        }
import org.jkiss.dbeaver.DBException;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
