    public boolean isHiddenRowidColumn(@NotNull PostgreAttribute attribute) {
    @Override
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
        if (CommonUtils.isNotEmpty(defaultValue)) {
    }

    public boolean supportsForeignServers() {
        return false;
                }
        return false;
        return false;
 *
        String defaultValue = attribute.getDefaultValue();
        return new CockroachSequence(schema);
        return false;
    @Override

    }
        return false;
                    }
        return false;
        return aliasMap;
        } catch (Exception e) {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    @Override

    }


                        privList.add(new PostgrePrivilegeGrant(null, new PostgreRoleReference(table.getDatabase(), grantee, null),
    }

        return true;
    @Override
        } catch (Exception e) {
        return false;
 *
    }
    public boolean supportsAlterUserChangePassword() {
    public boolean supportsSuperusers() {

    }
        return true;
    }
import org.jkiss.dbeaver.DBDatabaseException;

    public boolean supportsRolesWithCreateDBAbility() {

        }
    @Override
    }

    }
    }
        aliasMap.put("dec", "numeric");
    }
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
    }
    public boolean supportsAggregates() {
                        sql.append(line);
    }
                        PostgrePrivilege permission = new PostgreObjectPrivilege(table, new PostgreRoleReference(table.getDatabase(), entry.getKey(), null), entry.getValue());
                            continue;
    @Override
                        }

/**
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
package org.jkiss.dbeaver.ext.postgresql.model.impls.cockroach;
    public boolean supportsOids() {
                    for (Map.Entry<String, List<PostgrePrivilegeGrant>> entry : privilegeMap.entrySet()) {
        return false;
            return new CockroachSequence(schema, dbResult);
    }

                        String databaseName = JDBCUtils.safeGetString(resultSet, "database_name");
        return false;

 * See the License for the specific language governing permissions and
    @Override

    public Map<String, String> getDataTypeAliases() {
                    }
    }
    public boolean supportsRules() {
    @Override
        return true;
public class PostgreServerCockroachDB extends PostgreServerExtensionBase {
        return super.createNewRelation(monitor, schema, kind, copyFrom);
import org.jkiss.dbeaver.ext.postgresql.model.impls.PostgreServerExtensionBase;
            }
    @Override
    }
    }
    @Override
                        PostgrePrivilegeType privType = CommonUtils.valueOf(PostgrePrivilegeType.class, privilege, PostgrePrivilegeType.UNKNOWN);
                    StringBuilder sql = new StringBuilder();
        return super.createRelationOfClass(schema, kind, dbResult);
    @Override
    public PostgreSequence createSequence(@NotNull PostgreSchema schema) {
    @Override
        }
    }
        return false;
        }

    @Override
        return false;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

 * DBeaver - Universal Database Manager
                    while (resultSet.next()) {
    @Override
            // Let's hope that users do not create such columns independently
            // Rowid column is hidden from DDL (we read it from Cocroach) and from the data viewer.


        aliasMap.put("string", "text");
    }
    public boolean supportsRoles() {
    }
import org.jkiss.dbeaver.ext.postgresql.model.*;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.DBUtils;
    public boolean supportsTableStatistics() {
import org.jkiss.dbeaver.DBException;
                        permissions.add(permission);

import java.util.*;
/*
    @Override
                        ));
    }
    }
    @Override
        return false;
    @Override
    }

                            line = JDBCUtils.safeGetString(resultSet, 2);

    @Override
                    Map<String, List<PostgrePrivilegeGrant>> privilegeMap = new HashMap<>();
        return false;
    }
                            databaseName, schemaName, tableName, privType, true, true
        return false;

        return false;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public boolean supportsSequences() {
            // It will added automatically after table creation without keys.
    @Override
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    public PostgreTableBase createRelationOfClass(PostgreSchema schema, PostgreClass.RelKind kind, JDBCResultSet dbResult) {
                        String tableName = JDBCUtils.safeGetString(resultSet, "table_name");
    }
        Map<String, String> aliasMap = new LinkedHashMap<>(super.getDataTypeAliases());
        try (JDBCSession session = DBUtils.openMetaSession(monitor, table, "Load CockroachDB table DDL")) {
                try (JDBCResultSet resultSet = dbStat.executeQuery()) {
            }
    @Override
    public boolean supportsExplainPlanXML() {

    public PostgreTableBase createNewRelation(DBRProgressMonitor monitor, PostgreSchema schema, PostgreClass.RelKind kind, Object copyFrom)
    public boolean supportsMaterializedViews() {
 * limitations under the License.
    }
    @Override

    }
    }

    public boolean supportsEncodings() {
    public boolean supportsExplainPlanVerbose() {

    public boolean supportsRelationSizeCalc() {
            try (JDBCPreparedStatement dbStat = session.prepareStatement("SHOW CREATE TABLE " + table.getFullyQualifiedName(DBPEvaluationContext.DDL))) {
import org.jkiss.utils.CommonUtils;
    public boolean supportsExtensions() {
    public boolean supportsRoleBypassRLS() {
    public boolean supportsTriggers() {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    @Override
                    List<PostgrePrivilege> permissions = new ArrayList<>();
        return false;
        }
            // But you can create rowid column by yourself with no restrictions, therefore, conditions below may accidentally hide the user column.
        }
            try (JDBCPreparedStatement dbStat = session.prepareStatement("SHOW GRANTS ON " + table.getFullyQualifiedName(DBPEvaluationContext.DDL))) {

    @Override
                        assert grantee != null;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
import org.jkiss.code.NotNull;
    @Override
}

 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
    public boolean supportsFunctionCreate() {
    @Override

    public boolean supportsIndexes() {
    public boolean supportsCommentsOnRole() {
 * You may obtain a copy of the License at

    }

    @Override
    @Override
    }
                    while (resultSet.next()) {
    @Override
    @Override


    public boolean supportsTablespaceLocation() {
    public boolean supportsShowingOfExtraComments() {
        aliasMap.put("bytes", "bytea");
    @Override
                        if (line == null) {
    }


        return false;
    @Override
    @Override
        return TRUNCATE_TOOL_MODE_SUPPORT_ONLY_ONE_TABLE | TRUNCATE_TOOL_MODE_SUPPORT_CASCADE;
    }
    }
    }
            throw new DBDatabaseException(e, table.getDataSource());

 */
    @Override
                try (JDBCResultSet resultSet = dbStat.executeQuery()) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return true;
        return true;
    }
        throws DBException {

        return false;
        return true;
    public boolean supportsExplainPlan() {
    public List<PostgrePrivilege> readObjectPermissions(DBRProgressMonitor monitor, PostgreTableBase table, boolean includeNestedObjects) throws DBException {
    public boolean supportsCopyFromStdIn() {
    @Override
    }
    }
        return false;
    }
    }
                }

        return false;
                        String line = JDBCUtils.safeGetString(resultSet, "CreateTable");
                        String privilege = JDBCUtils.safeGetString(resultSet, "privilege_type");

                        }
                        String schemaName = JDBCUtils.safeGetString(resultSet, "schema_name");
        return true;
    }
                        if (line == null) {
            // Rowid column is a special case in Cockroach #14557
        return false;
    public boolean supportsPartitions() {
                    return permissions;
        return true;

        return false;
    public PostgreServerCockroachDB(PostgreDataSource dataSource) {
    }
                        List<PostgrePrivilegeGrant> privList = privilegeMap.computeIfAbsent(grantee, k -> new ArrayList<>());
            return attribute.isRequired() && "unique_rowid()".equals(defaultValue) && "rowid".equals(attribute.getName());
        return false;
                    return sql.toString();
        return false;
    public boolean supportsInheritance() {
    public boolean supportsTablespaces() {
    public boolean supportsKeyAndIndexRename() {
        return false;

 * Unless required by applicable law or agreed to in writing, software

    public boolean supportsLocks() {
        super(dataSource);

 *
                        String grantee = JDBCUtils.safeGetString(resultSet, "grantee");
    public boolean supportsFunctionDefRead() {
 */
        return false;
    public String getServerTypeName() {
    @Override
    @Override
    }
            throw new DBDatabaseException(e, table.getDataSource());


    public String readTableDDL(DBRProgressMonitor monitor, PostgreTableBase table) throws DBException {

        if (kind == PostgreClass.RelKind.S) {
    @Override
        aliasMap.put("decimal", "numeric");
    public int getTruncateToolModes() {
        if (kind == PostgreClass.RelKind.S) {
        return "CockroachDB";
    @Override
            return new CockroachSequence(schema);
 * PostgreServerCockroachDB
    public boolean supportsSessionActivity() {
    public boolean supportsRoleReplication() {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, table, "Load CockroachDB table grants")) {
                    }
        aliasMap.put("float", "float8");
