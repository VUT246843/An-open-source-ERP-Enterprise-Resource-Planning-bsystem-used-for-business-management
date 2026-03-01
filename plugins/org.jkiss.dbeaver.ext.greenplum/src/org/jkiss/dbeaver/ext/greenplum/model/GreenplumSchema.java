 */
                    hasAccessToExttable ? "\ncase when x.fmttype is not null then true else false end as \"is_ext_table\"" :
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                                                    @Nullable String objectName) throws SQLException {
                "x.fmttype, x.fmtopts,\n" +
                "coalesce(x.rejectlimit, 0) AS rejectlimit,\n" +
            return dbStat;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2019 Gavin Shaw (gshaw@pivotal.io)
    public List<? extends PostgreTable> getTables(DBRProgressMonitor monitor) throws DBException {
            if (object != null || objectName != null)
                (dataSource.isServerSupportFmterrtblColumn(session) ?

            // Let's remove external tables from the list foreign tables. Store is the External tables folder.
    }
            boolean greenplumVersionAtLeast5 = dataSource.isGreenplumVersionAtLeast(5, 0);
                (object == null && objectName == null ? "" : " AND relname=?");
 * Copyright (C) 2019 Dmitriy Dubson (ddubson@pivotal.io)
                "INNER JOIN pg_catalog.pg_namespace ns\n\ton ns.oid = c.relnamespace\n" +
                dbStat.setString(2, object != null ? object.getName() : objectName);
    @NotNull
        @NotNull
    @Override
        }

import java.util.stream.Collectors;
        return new ArrayList<>(getTableCache().getTypedObjects(monitor, this, GreenplumExternalTable.class));
                                                    @Nullable PostgreProcedure object,
        List<? extends PostgreTable> foreignTables = super.getForeignTables(monitor);
                                                @NotNull JDBCResultSet dbResult) {
        List<? extends PostgreTable> postgreTables = super.getTables(monitor);
        GreenplumFunctionsCache() {
        public JDBCStatement prepareLookupStatement(@NotNull JDBCSession session,
                "\n,case when (ns.nspname !~ '^pg_toast' and ns.nspname like 'pg_temp%') then true else false end as \"is_temp_table\"\n" +
        @Override
                            "FROM pg_catalog.pg_proc p\n" +
import org.jkiss.dbeaver.ext.postgresql.model.*;
                                                    @NotNull PostgreTableContainer container,
                .collect(Collectors.toCollection(ArrayList::new));
    }

 * Licensed under the Apache License, Version 2.0 (the "License");

                            "\nORDER BY p.proname"
                dbStat.setLong(2, object.getObjectId());
            boolean hasAccessToExttable = dataSource.isHasAccessToExttable();
    @NotNull
                            "WHERE p.pronamespace=?" +
            return new GreenplumFunction(session.getProgressMonitor(), owner, dbResult);
}
        // Remove external tables from the list. Store them in a different folder.
            return before7version ? CommonUtils.isNotEmpty(JDBCUtils.safeGetString(dbResult, "partitiontablename")) :
    public GreenplumDataSource getDataSource() {
    }


    public class GreenplumFunctionsCache extends ProceduresCache {
    public Collection<? extends JDBCTable> getExternalTables(DBRProgressMonitor monitor) throws DBException {
                (hasAccessToExttable ? "CASE WHEN x." + uriLocationColumn + " IS NOT NULL THEN array_to_string(x." + uriLocationColumn +
            }
        }
    @Override
        public JDBCStatement prepareLookupStatement(@NotNull JDBCSession session,
    }
import java.util.ArrayList;
    public List<? extends PostgreTable> getForeignTables(DBRProgressMonitor monitor) throws DBException {
 * You may obtain a copy of the License at
                "x.writable,\n" : "") +
 * See the License for the specific language governing permissions and

                    "and ns.nspname = p.schemaname\n" : "") +
        super(owner, name, resultSet);
import java.util.Collection;
        @NotNull
        return new GreenplumFunctionsCache();

                (before7version ? "" : ", pa.amname\n") +
                "coalesce(x.rejectlimittype, '') AS rejectlimittype,\n" +
    }
        @Override
            super();
        GreenplumDataSource dataSource = getDataSource();
                                                    @Nullable String objectName) throws SQLException {
 * Copyright (C) 2019 Zach Marcin (zmarcin@pivotal.io)

            final JDBCPreparedStatement dbStat = session.prepareStatement(sqlQuery);
 * limitations under the License.
                .filter(e -> !(e instanceof GreenplumExternalTable))
        @Override
                "CASE WHEN x.command IS NOT NULL THEN x.command ELSE '' END AS command,\n" +
    @Override
        }
                (before7version ? "" : "\nLEFT JOIN pg_catalog.pg_am pa ON pa.oid = c.relam") +
            JDBCPreparedStatement dbStat = session.prepareStatement(
               super.isPartitionTableRow(dbResult);
                "array_to_string(x." + execLocationColumn + ", ',') AS execlocation,\n" +
import org.jkiss.code.NotNull;
                    ", ',') ELSE '' END AS urilocation,\n" +
        return foreignTables;

    public GreenplumSchema(PostgreDatabase owner, String name, JDBCResultSet resultSet) throws SQLException {
                            (object == null ? "" : " AND p.oid=?") +
            if (object != null) {
                                                @NotNull PostgreSchema owner,
import org.jkiss.dbeaver.DBException;
                (hasAccessToExttable ? "LEFT OUTER JOIN pg_catalog.pg_exttable x\n\ton x.reloid = c.oid\n" : "") +
import java.sql.SQLException;
        private boolean before7version;
            String execLocationColumn = greenplumVersionAtLeast5 ? "execlocation" : "location";

import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTable;
 * you may not use this file except in compliance with the License.
            String sqlQuery = "SELECT c.oid,c.*,d.description,\n" +
                    "pg_catalog.pg_get_expr(c.relpartbound, c.oid) as partition_expr, pg_catalog.pg_get_partkeydef(c.oid) as partition_key,") +
    @Override
import org.jkiss.dbeaver.model.meta.Association;
 *

    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            // Starting Greenplum version 7 external tables are marked as foreign tables.
                                                    @NotNull PostgreSchema owner,
/*
    }
                    "SELECT p.oid as poid,p.*," +
            .filter(e -> !(e instanceof GreenplumExternalTable))
            dbStat.setLong(1, owner.getObjectId());
            String uriLocationColumn = greenplumVersionAtLeast5 ? "urilocation" : "location";
            return dbStat;
            );
        }
            before7version = !dataSource.isGreenplumVersionAtLeast(7, 0);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

 *
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                            (session.getDataSource().isServerVersionAtLeast(8, 4) ? "pg_catalog.pg_get_expr(p.proargdefaults, 0)" : "NULL") + " as arg_defaults,d.description\n" +
package org.jkiss.dbeaver.ext.greenplum.model;
    }
        return postgreTables.stream()
                (supportsRelStorageColumn ? // We want to know about table external status
        return (GreenplumDataSource) super.getDataSource();
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
public class GreenplumSchema extends PostgreSchema {
    protected ProceduresCache createProceduresCache() {
                (before7version ? "p.partitiontablename,p.partitionboundary as partition_expr," :

                            "LEFT OUTER JOIN pg_catalog.pg_description d ON d.objoid=p.oid\n" +
 * DBeaver - Universal Database Manager
import org.jkiss.utils.CommonUtils;
            super();
        }
                    "case when c.relstorage = 'x' then true else false end as \"is_ext_table\"" :
                        "false as \"is_ext_table\"") +
 * distributed under the License is distributed on an "AS IS" BASIS,
                (before7version ? "LEFT OUTER JOIN pg_catalog.pg_partitions p\n\ton c.relname = p.partitiontablename " +
        protected boolean isPartitionTableRow(@NotNull JDBCResultSet dbResult) {
 * Copyright (C) 2019 Nikhil Pawar (npawar@pivotal.io)
        }
        @Override
        return new GreenplumTableCache();
    @NotNull
                "\nFROM pg_catalog.pg_class c\n" +
                    "case when x.fmterrtbl is not NULL then true else false end as \"is_logging_errors\",\n" : "") +


        }
                "LEFT OUTER JOIN pg_catalog.pg_description d\n\tON d.objoid=c.oid AND d.objsubid=0\n" +
        if (dataSource.isServerVersionAtLeast(7, 0) && dataSource.isHasAccessToExttable()) {
                "pg_encoding_to_char(x.encoding) AS encoding,\n" +
 * Unless required by applicable law or agreed to in writing, software
                                                    @Nullable PostgreTableBase object,
 * Copyright (C) 2010-2024 DBeaver Corp and others
import java.util.List;

            dbStat.setLong(1, getObjectId());
            .collect(Collectors.toCollection(ArrayList::new));
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
                "\nWHERE c.relnamespace= ? AND c.relkind not in ('i','c') " +
    @Override
            return foreignTables.stream()
            GreenplumDataSource dataSource = getDataSource();
            boolean supportsRelStorageColumn = dataSource.isServerSupportsRelstorageColumn(session);
    @Association

    public class GreenplumTableCache extends TableCache {
    }
        protected GreenplumFunction fetchObject(@NotNull JDBCSession session,
 *
        GreenplumTableCache() {
    protected TableCache createTableCache() {
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
