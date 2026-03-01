        return dataSource.isServerVersionAtLeast(12, 0);
 * distributed under the License is distributed on an "AS IS" BASIS,
/**
    @Override
    }
    }
        return JDBCUtils.safeGetBoolean(dbResult, "is_ext_table");
    @Override
    }
        return "Greenplum";
    @Override


import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    }

import org.jkiss.code.NotNull;
    @Override
            if (CommonUtils.isNotEmpty(accessMethod)) {
        return true;

    public boolean supportsFunctionDefRead() {
    }
 *
        super(dataSource);
            return ((GreenplumExternalTable) table).generateDDL(monitor);
    @Override
 *
    @Override
 * You may obtain a copy of the License at
    @Override
    public boolean supportsAlterUserChangePassword() {
        return true;
    public String getServerTypeName() {

    public void createUsingClause(@NotNull PostgreTableRegular table, @NotNull StringBuilder ddl) {
    }

import org.jkiss.utils.CommonUtils;
    @Override
    }
    @Override
            return new GreenplumTable(schema);
        return true;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return dataSource.isServerVersionAtLeast(12, 0);
            }
        return dataSource.isServerVersionAtLeast(9, 3);
    public PostgreTableBase createRelationOfClass(PostgreSchema schema, PostgreClass.RelKind kind, JDBCResultSet dbResult) {
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    }

    @Override

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    private boolean isRelationExternal(JDBCResultSet dbResult) {

    }
        if (table instanceof GreenplumTable) {
            if (isRelationExternal(dbResult)) {
    }
            return super.readTableDDL(monitor, table);
        return dataSource.isServerVersionAtLeast(12, 0);
    public boolean supportsDatabaseSize() {
                ddl.append("\nUSING ").append(accessMethod);
    public void configureDialect(PostgreDialect dialect) {
    }
 * Copyright (C) 2019 Nikhil Pawar (npawar@pivotal.io)
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    @Override
    }
    }
        return true;
            return new GreenplumTable(schema, dbResult);
    public boolean supportsEntityMetadataInResults() {
    }
        return super.createNewRelation(monitor, schema, kind, copyFrom);
    public boolean supportsExplainPlanVerbose() {
    public boolean supportsExplainPlanXML() {
        return dataSource.isServerVersionAtLeast(12, 0);
    @Override

/*
    }

    @Override
    @Override
        } else if (kind == PostgreClass.RelKind.m) {

    @Override
    @Override
        return new GreenplumSchemaCache();
import org.jkiss.dbeaver.ext.postgresql.model.*;

        return dataSource.isServerVersionAtLeast(12, 0);
        }
        dialect.addExtraKeywords("DISTRIBUTED", "SEGMENT", "REJECT", "FORMAT", "MASTER", "WEB", "WRITABLE", "READABLE",

    @Override
    public boolean supportsDistinctForStatementsWithAcl() {
            return new GreenplumMaterializedView(schema, dbResult);
    }
 * Copyright (C) 2019 Zach Marcin (zmarcin@pivotal.io)
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ext.greenplum.model;
import org.jkiss.dbeaver.ext.postgresql.model.impls.PostgreServerExtensionBase;

    }
    public String createWithClause(PostgreTableRegular table, PostgreTableBase tableBase) {
    }

    public boolean supportsExternalTypes() {
    public boolean supportsRoleReplication() {
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0

        return dataSource.isServerVersionAtLeast(12, 0);

        } else {
    public boolean supportsRowLevelSecurity() {
        if (kind == PostgreClass.RelKind.r || kind == PostgreClass.RelKind.p) {
        return super.createRelationOfClass(schema, kind, dbResult);
import org.jkiss.dbeaver.DBException;

                "LOG", "ERRORS");
    @Override

 * See the License for the specific language governing permissions and
        if (table instanceof GreenplumExternalTable) {
    @Override
    @Override
    @Override
            return new GreenplumMaterializedView(schema);
        }
    public PostgreDatabase.SchemaCache createSchemaCache(PostgreDatabase database) {
    public boolean supportsEventTriggers() {
    public PostgreTableBase createNewRelation(DBRProgressMonitor monitor, PostgreSchema schema, PostgreClass.RelKind kind, Object copyFrom) throws DBException {
        return true;
        return dataSource.isServerVersionAtLeast(12, 0);
 */
    }
    public boolean supportsRoleBypassRLS() {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override

    public PostgreServerGreenplum(PostgreDataSource dataSource) {
    }
    public String readTableDDL(DBRProgressMonitor monitor, PostgreTableBase table) throws DBException {

    @Override

    }
    @Override
public class PostgreServerGreenplum extends PostgreServerExtensionBase {
            String accessMethod = ((GreenplumTable) table).getAccessMethod();
    public boolean supportsCopyFromStdIn() {
        return GreenplumWithClauseBuilder.generateWithClause(table, tableBase);
    @Override
        } else if (kind == PostgreClass.RelKind.m) {
 *


 */

    public boolean supportsPartitions() {
 * limitations under the License.
                return new GreenplumExternalTable(schema, dbResult);
        return true;

    }
    }
        }
 * Copyright (C) 2019 Dmitriy Dubson (ddubson@pivotal.io)
    }
 * Copyright (C) 2019 Gavin Shaw (gshaw@pivotal.io)
        if (kind == PostgreClass.RelKind.r || kind == PostgreClass.RelKind.p) {
        return true;
 * PostgreServerGreenplum
            }
        return true;
    public boolean supportsSessionActivity() {
}
 * you may not use this file except in compliance with the License.
    public boolean supportsHasOidsColumn() {


        }
        return dataSource.isServerVersionAtLeast(9, 1);
    }
    public boolean supportsDefaultPrivileges() {
