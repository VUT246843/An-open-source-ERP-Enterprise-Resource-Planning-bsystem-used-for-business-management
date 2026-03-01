                }
    static void addObjectModifiersToDDL(
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (supportsReplicatedDistribution && table.isPersisted() && GreenplumUtils.isDistributedByReplicated(monitor, table)) {
    ) throws DBCException {
            }
import java.util.ArrayList;
        @NotNull StringBuilder ddl,
 * You may obtain a copy of the License at
            }
    private static String getPartitionData(@NotNull DBRProgressMonitor monitor, @NotNull PostgreTableReal table) throws DBCException {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            }
            try (JDBCStatement dbStat = session.createStatement()) {
 *
                        return CommonUtils.equalObjects(JDBCUtils.safeGetString(dbResult, 1), "r");
    }
                        }
            ddl.append("RANDOMLY");
                            return result;
        return distributionColumns;
                try (JDBCResultSet dbResult = dbStat.executeQuery("SELECT pg_get_partition_def('" +
                }
        } else {
        boolean addPartitionInfo
                throw new DBCException(e, session.getExecutionContext());
        if (constraint.isPresent()) {
import java.util.Optional;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.exec.DBCException;
            ddl.append("BY (");
    }
public class GreenplumUtils {
        Optional<PostgreTableConstraint> constraint = tableConstraints.stream().filter(key -> key.getConstraintType() == DBSEntityConstraintType.PRIMARY_KEY).findFirst();

    static List<PostgreTableColumn> getDistributionTableColumns(@NotNull DBRProgressMonitor monitor, List<PostgreTableColumn> distributionColumns, @NotNull PostgreTableReal table) throws DBException {
                            return PostgreUtils.getIntVector(JDBCUtils.safeGetObject(dbResult, 1), table.getDataSource());
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
                    } else {
    }
                pk = tableConstraint.get();
    }
                    } else {
        } else if (!CommonUtils.isEmpty(distributionColumns)) {
                        return null;
 * Copyright (C) 2010-2025 DBeaver Corp and others
                    try (JDBCResultSet dbResult = dbStat.executeQuery("SELECT attrnums FROM pg_catalog.gp_distribution_policy WHERE localoid=" + table.getObjectId())) {

            if (tableConstraint.isPresent()) {
        // Get primary key
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
                    }
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
    }
 *
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ext.greenplum.model;
                }
            }

        } else {
        List<PostgreTableColumn> distributionColumns,
                        if (result != null && result.startsWith("PARTITION ")) {
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
                ddl.append(partitionData);
            Optional<PostgreTableConstraint> tableConstraint = tableConstraints.stream().filter(key -> key.getConstraintType() == DBSEntityConstraintType.UNIQUE_KEY).findFirst();
 */
                        if (dbResult.next()) {
import org.jkiss.dbeaver.model.DBUtils;

import java.util.Collection;
                        } else {
import java.sql.SQLException;
                } else {
            if (partitionData != null) {
                    table.getFullyQualifiedName(DBPEvaluationContext.DDL) + "'::regclass, true, false);")
        if (addPartitionInfo) {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, table, "Read Greenplum table distributed columns")) {
                distributionColumns = new ArrayList<>(pkAttrs.size());
                        return null;
        PostgreTableConstraint pk = null;
                        if (dbResult.next()) {
                    distributionColumns.add((PostgreTableColumn) attr);

            String partitionData = table.isPersisted() ? GreenplumUtils.getPartitionData(monitor, table) : null;
            ddl.append("REPLICATED");
                ddl.append(DBUtils.getQuotedIdentifier(distributionColumns.get(i)));
                if (i > 0) ddl.append(", ");
                ddl.append("\n");
        }
 * DBeaver - Universal Database Manager
        // First - search PK in table
        }
        }
                            return PostgreUtils.getIntVector(JDBCUtils.safeGetObject(dbResult, 1), table.getDataSource());
                    }
            // If no PK in the table - then search first UK for distribution
/*
            if (!CommonUtils.isEmpty(pkAttrs)) {
                }

            ddl.append(")");
    static int[] readDistributedColumns(@NotNull DBRProgressMonitor monitor, @NotNull PostgreTableReal table) throws DBCException {
                try (JDBCResultSet dbResult = dbStat.executeQuery("SELECT policytype FROM pg_catalog.gp_distribution_policy WHERE localoid=" + table.getObjectId())) {
            }
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
import org.jkiss.dbeaver.DBException;
            for (int i = 0; i < distributionColumns.size(); i++) {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, table, "Read Greenplum table distributed columns")) {
                            return null;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableConstraint;

import java.util.List;
        }
                throw new DBCException(e, session.getExecutionContext());
        ddl.append("\nDISTRIBUTED ");
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    @Nullable
        Collection<PostgreTableConstraint> tableConstraints = CommonUtils.safeCollection(table.getConstraints(monitor));
                for (DBSEntityAttribute attr : pkAttrs) {
                if (((GreenplumDataSource) table.getDataSource()).isGreenplumVersionAtLeast(6, 0)) {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, table, "Read Greenplum table partition data")) {
import org.jkiss.code.Nullable;
        @NotNull PostgreTableReal table,
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableColumn;
                        } else {
 *
                    if (dbResult.next()) {

        }
    private static boolean isDistributedByReplicated(DBRProgressMonitor monitor, @NotNull PostgreTableReal table) throws DBCException {
 * Licensed under the Apache License, Version 2.0 (the "License");

                        }
        boolean supportsReplicatedDistribution,
                    }
                ) {
            } catch (SQLException e) {
                    if (dbResult != null && dbResult.next()) {
            pk = constraint.get();
                        String result = dbResult.getString(1);
                        return false;
                    }
 * limitations under the License.
            } catch (SQLException e) {
import org.jkiss.code.NotNull;
            List<DBSEntityAttribute> pkAttrs = DBUtils.getEntityAttributes(monitor, pk);
            try (JDBCStatement dbStat = session.createStatement()) {
                        }
                throw new DBCException(e, session.getExecutionContext());
        if (pk != null) {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
            }
                            return null;
        }
        @NotNull DBRProgressMonitor monitor,
}
            try (JDBCStatement dbStat = session.createStatement()) {
            } catch (SQLException e) {
        }
                    try (JDBCResultSet dbResult = dbStat.executeQuery("SELECT distkey FROM pg_catalog.gp_distribution_policy WHERE localoid=" + table.getObjectId())) {
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableReal;
