    public boolean supportsTableStatistics() {
    }

    }
        return true;
    }
                return new PostgreTableRegular(monitor, schema, (PostgreTableRegular) copyFrom);
    }
            extraOptions.add("OIDS=TRUE");
                        ddl.append(")");
    public boolean supportsLanguages() {
        return true;
        // Everything is in UTC.
    @Override
            try {
    @Override

    }
        return withClauseBuilder.toString();

    public boolean supportsExtensions() {
    @Override
            try {
import java.util.List;
    }
            if (!alter) {
        return false;

    }
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
}

import org.jkiss.dbeaver.model.DBPEvaluationContext;
                try {
            }
    public boolean supportsRules() {
        return dataSource.isServerVersionAtLeast(10, 0);
    @Override
        return true;
        return true;
        }
        }
            withClauseBuilder.append("\nWITH (");
    public boolean supportsNativeClient() {
    }
    public boolean supportsCustomDataTypes() {
                }

    }
        StringBuilder ddl = new StringBuilder();
    }

            extraOptions.addAll(Arrays.asList(table.getRelOptions()));

        return dataSource.isServerVersionAtLeast(9, 4);
                    }
    public boolean supportsClientInfo() {

    public String readTableDDL(DBRProgressMonitor monitor, PostgreTableBase table) throws DBException {
                        foreignServerName = DBUtils.getQuotedIdentifier(foreignServer);
    @Override
    }
    @Override
                        if (!alter) {
            } catch (DBException e) {
    @Override

        return true;
    public Map<String, String> getDataTypeAliases() {
    @Override
                if (foreignServerName != null) {
        return true;
            tablePermissions.addAll(column.getPrivileges(monitor, true));
    }
        List<PostgrePrivilege> tablePermissions = PostgreUtils.extractPermissionsFromACL(monitor, object, object.getAcl(), false);
    public boolean supportsExternalTypes() {
    public static final int TRUNCATE_TOOL_MODE_SUPPORT_IDENTITIES = 1 << 1;
    @Override
                }

    public List<PostgrePrivilege> readObjectPermissions(DBRProgressMonitor monitor, PostgreTableBase object, boolean includeNestedObjects) throws DBException {
    public boolean supportsAlterStorageStrategy() {
    }
    }
    }

        return dataSource.isServerVersionAtLeast(9, 3);
    @Override
            PostgreTable table = (PostgreTable) tableBase;
    }

    @Override
    @Override
        return supportsRoles();

        return false;
            if (column.getAcl() == null || column.isHidden()) {
        } else {
        return dataSource.isServerVersionAtLeast(9, 5);
    @Override
    }
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
    public boolean supportsResultSetLimits() {
                            ddl.append(delimiter).append("TABLESPACE ").append(tablespace.getName());
    }
        if (tableBase instanceof PostgreTable) {

        return false;
                    ddl.append(createWithClause(table, tableBase));

import java.util.Arrays;

    }
    }
import java.util.ArrayList;
    }
    }
    }
    public boolean supportsRoleBypassRLS() {
    }
    }
            // We need to disable SSL explicitly (see #4928)
    @Override
            return tablePermissions;
    private static final Log log = Log.getLog(PostgreServerExtensionBase.class);
    public boolean supportsDistinctForStatementsWithAcl() {
    public String getProceduresOidColumn() {

        return true;
    @Override

    public boolean supportsExplainPlanXML() {
    }
    public boolean supportsForeignServers() {
                if (!CommonUtils.isEmpty(table.getPartitionKey())) {
    }
    public boolean isPGObject(@NotNull Object object) {
        return true;
    public boolean supportsMaterializedViews() {
    public boolean supportsTemporalAccessor() {
        return dataSource.isServerVersionAtLeast(9, 1);
    }
    }
                String foreignServerName = table.getForeignServerName();


 * DBeaver - Universal Database Manager
    @Override
    }
        return dataSource.isServerVersionAtLeast(9, 0);

    public boolean supportsPartitions() {
    }
    }
                        }
        return false;

        return true;
    @Override

                if (CommonUtils.isNotEmpty(expression)) {
    public boolean supportsSessionActivity() {
        return dataSource.isServerVersionAtLeast(9, 0);
    @Override
    @Override
    @Override
                String expression = ((PostgreTablePartition) tableBase).getPartitionExpression();
                    }
        }
        return false;
            }

    }
    @Override



    public boolean supportsDatabaseDescription() {

        return true;
    @Override
    @Override

            if (tableBase instanceof PostgreTablePartition && !alter) {
                if (!ArrayUtils.isEmpty(foreignOptions)) {
        // Disable temporal accessor (which stands for java.util.Date).
        } else if (kind == PostgreClass.RelKind.f) {
        return true;



            return new PostgreTableRegular(schema, dbResult);
        return true;

    public int getTruncateToolModes() {
        if (kind == PostgreClass.RelKind.r) {

                }
                return new PostgreTablePartition(schema, dbResult);    
    }

        return true;
    @Override
        return PostgreConstants.PG_OBJECT_CLASS.equals(className);
    public boolean supportSerialTypes() {

        return false;
    }

        return true;
    @Override
    public boolean supportsOids() {
    @Override
public abstract class PostgreServerExtensionBase implements PostgreServerExtension {
    public boolean supportsOpFamily() {
    public boolean supportsCollations() {
    public boolean supportsCopyFromStdIn() {

            return new PostgreTableForeign(schema, dbResult);
            } catch (DBException e) {
    }
        return false;
    @Override
    }
package org.jkiss.dbeaver.ext.postgresql.model.impls;
    }
    @Override
 * PostgreServerExtensionBase
        return true;
    public static final int TRUNCATE_TOOL_MODE_SUPPORT_CASCADE = 1 << 2;
 * limitations under the License.
                        hasOtherSpecs = true;
        } else if (kind == PostgreClass.RelKind.f) {
        } else if (kind == PostgreClass.RelKind.p) {
            return new PostgreSequence(schema);
        return dataSource.isServerVersionAtLeast(11, 0);
    public boolean supportsEncodings() {
import org.jkiss.utils.CommonUtils;

    @Override
    public boolean supportsInheritance() {
    public boolean supportsKeyAndIndexRename() {
    @Override
    public boolean supportsColumnsRequiring() {
                }
import java.sql.Types;
    @Override

    @Override

 *
        return true;
                }
        } else if (kind == PostgreClass.RelKind.m) {
 *
    public void initDefaultSSLConfig(DBPConnectionConfiguration connectionInfo, Map<String, String> props) {

    public boolean supportsStorageModifier() {
                    }
    @Override
                    final List<PostgreTableInheritance> superTables = table.getSuperInheritance(monitor);
    @Override
 * You may obtain a copy of the License at
    }

    @Override

 *     http://www.apache.org/licenses/LICENSE-2.0
        return false;
    }
        return false;
            return new PostgreView(schema, dbResult);
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
            }
 */
    @Override

    }

    @Override
        return false;
    }
import org.jkiss.code.NotNull;

        StringBuilder withClauseBuilder = new StringBuilder();
    }

    @Override
        if (tableBase instanceof PostgreTableRegular table) {
        return dataSource.isServerVersionAtLeast(8, 1);

        return true;
    @Override
    public boolean supportsTemplates() {
        return true;
    }
        return ddl.toString();
        return false;
    public boolean supportsDisablingAllTriggers() {
        if (tableSupportOids) {
        return true;
    }
    }
        return new PostgreDatabase.SchemaCache();
    }

                    log.error(e);
    public boolean supportsAlterTableColumnWithUSING() {
                }

        tableBase.appendTableModifiers(monitor, ddl);
        this.dataSource = dataSource;
    public boolean supportsIndexes() {
    }
        return TRUNCATE_TOOL_MODE_SUPPORT_ONLY_ONE_TABLE | TRUNCATE_TOOL_MODE_SUPPORT_IDENTITIES | TRUNCATE_TOOL_MODE_SUPPORT_CASCADE;
    public boolean supportsTablespaces() {
            return new PostgreTableRegular(schema);
    public boolean supportsForeignKeys() {

        } else if (tableBase instanceof PostgreTableForeign table) {

    public boolean supportsRolesWithCreateDBAbility() {
/**
    public String readViewDDL(DBRProgressMonitor monitor, PostgreViewBase view) throws DBException {
        } else if (kind == PostgreClass.RelKind.v) {
    @Override
        }
    @Override

    public boolean supportsFunctionDefRead() {
    }
import org.jkiss.dbeaver.DBException;
    }
    @Override
                            if (i > 0) ddl.append(",");
    public void configureDialect(PostgreDialect dialect) {
import org.jkiss.utils.ArrayUtils;

 * Licensed under the Apache License, Version 2.0 (the "License");
                log.error(e);
    }
    public void createUsingClause(@NotNull PostgreTableRegular table, @NotNull StringBuilder ddl) {
    public boolean supportsAggregates() {
        return false;
        return true;
        if (hasExtraOptions) {
        String className = object.getClass().getName();
        }
    public boolean supportsTablespaceLocation() {
    }
        return supportsRoles();
        return true;

    }



                    PostgreTablespace tablespace = table.getTablespace(monitor);
    @Override
    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    }
        return false;
import org.jkiss.dbeaver.Log;
    }
    public boolean supportsJobs() {

            return null;
    @Override
    @Override
    @Override
        }
            return new PostgreTableRegular(schema, dbResult);
import org.jkiss.dbeaver.ext.postgresql.model.*;
            if (copyFrom instanceof PostgreTableRegular) {
        if (!includeNestedObjects) {
    @Override
    public boolean supportsAlterUserChangePassword() {
    @Override
    }
        return dataSource.isServerVersionAtLeast(8, 0);

                    ddl.append(" ").append(expression);
        }
    public boolean supportsEventTriggers() {
    @Override
                if (CommonUtils.isEmpty(foreignServerName)) {
        return PostgreConstants.DATA_TYPE_ALIASES;
    public boolean supportsRoles() {
        return dataSource.isServerVersionAtLeast(8, 4);
    public String getTableModifiers(DBRProgressMonitor monitor, PostgreTableBase tableBase, boolean alter, String delimiter) {
    }
    protected PostgreServerExtensionBase(PostgreDataSource dataSource) {
            props.put(PostgreConstants.PROP_SSL, "false");
                }
        return false;
        } else if (kind == PostgreClass.RelKind.S) {
    @Override
    @Override

                    ddl.append(delimiter).append("OPTIONS ").append(PostgreUtils.getOptionsString(foreignOptions));
    }


            return new PostgreTableRegular(schema, dbResult);
                withClauseBuilder.append("\n\t");
            log.debug("Unsupported PG class: '" + kind + "'");
    @Override
    }
        } else if (kind == PostgreClass.RelKind.S) {
        return null;
                if (i > 0) {

    }
        } else if (kind == PostgreClass.RelKind.t) {
        // Do nothing
        return true;
        return dataSource.isServerVersionAtLeast(9, 3);
    @Override
        return dataSource.isServerVersionAtLeast(9, 1);
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;

 * you may not use this file except in compliance with the License.

    }

        return true;
        return "oid";
        return true;//dataSource.isServerVersionAtLeast(10, 0);
    }

    }

        tablePermissions = new ArrayList<>(tablePermissions);


 * See the License for the specific language governing permissions and
    }
                }
        return false;
        return null;
                    if (tablespace != null) {


        if (tableBase instanceof PostgreTableRegular) {
        }
    @Override
        boolean hasExtraOptions = dataSource.isServerVersionAtLeast(8, 2) && table.getRelOptions() != null;
            return new PostgreTableForeign(schema);
                log.error(e);
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
    public boolean supportsAlterTableForViewRename() {
                } catch (DBException e) {

        return dataSource.isServerVersionAtLeast(8, 4);
import org.jkiss.dbeaver.model.DBUtils;
    }
        return true;
    @Override


    }
    @Override
    }
    public String createWithClause(PostgreTableRegular table, PostgreTableBase tableBase) {
        for (PostgreTableColumn column : CommonUtils.safeCollection(object.getAttributes(monitor))) {

        return new PostgreSequence(schema);
        return tablePermissions;
        if (connectionInfo.getProperty(PostgreConstants.PROP_SSL) == null) {
    }
    public PostgreTableBase createNewRelation(DBRProgressMonitor monitor, PostgreSchema schema, PostgreClass.RelKind kind, Object copyFrom) throws DBException {
    @Override
    public boolean supportsGeneratedColumns() {
        return dataSource.isServerVersionAtLeast(9, 1);
                if (!alter) {
    }

    @Override
                        }

    }

    }
        return "pg_proc";
 */
    public boolean supportsStoredProcedures() {

            }
    }
                    ddl.append(delimiter).append("PARTITION BY ").append(table.getPartitionKey());
                withClauseBuilder.append(extraOptions.get(i));
    @Override

                    ddl.append(delimiter).append("SERVER ").append(foreignServerName);
                if (!alter && hasOtherSpecs) {
    }
    public boolean supportsDependencies() {
                String[] foreignOptions = table.getForeignOptions(monitor);
        return true;
    public boolean supportsRowLevelSecurity() {

        if (!CommonUtils.isEmpty(extraOptions)) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    public boolean supportsExplainPlanVerbose() {
    @Override
    public boolean supportsDatabaseSize() {
    public boolean supportsAcl() {
    }
    }
        return dataSource.isServerVersionAtLeast(9, 3);
            if (!alter) {
                    if (!CommonUtils.isEmpty(superTables) && ! tableBase.isPartition()) {
            for (int i = 0; i < extraOptions.size(); i++) {
    }
        return Types.OTHER;
        return true;


    public boolean supportsPGConstraintExpressionColumn() {
    }
                }

        boolean tableSupportOids = table.getDataSource().getServerType().supportsOids() && table.isHasOids() && table.getDataSource().getServerType().supportsHasOidsColumn();
    public String getProceduresSystemTable() {
    @Override
    @Override
        if (kind == PostgreClass.RelKind.v) {
        List<String> extraOptions = new ArrayList<>();
    @Override
    }
/*
            withClauseBuilder.append("\n)");
    }
    protected final PostgreDataSource dataSource;
    }
            }
    public boolean isHiddenRowidColumn(@NotNull PostgreAttribute attribute) {
        // It doesn't make sense as PG server doesn't support timezones.


    @Override
    }
    @Override

    public boolean supportsCommentsOnRole() {
    public PostgreTableBase createRelationOfClass(PostgreSchema schema, PostgreClass.RelKind kind, JDBCResultSet dbResult) {

    }
        }
        return dataSource.isServerVersionAtLeast(9, 2);
    @Override
            return new PostgreMaterializedView(schema);
    public static final int TRUNCATE_TOOL_MODE_SUPPORT_ONLY_ONE_TABLE = 1;
                boolean hasOtherSpecs = false;
                    if (foreignServer != null) {
 *
    public boolean supportsDefaultPrivileges() {
    }
    @Override
                if (table.isTablespaceSpecified()) {
    public int getParameterBindType(DBSTypedObject type, Object value) {

        return false;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override
        return false;
    @Override
                }
    public PostgreDatabase.SchemaCache createSchemaCache(PostgreDatabase database) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    PostgreForeignServer foreignServer = table.getForeignServer(monitor);

    public boolean supportsSuperusers() {

    public boolean supportsShowingOfExtraComments() {
    @Override
    @Override
    @Override
        } else {
        return  dataSource.isServerVersionAtLeast(8, 3);
    @Override

        return false;
        } else if (kind == PostgreClass.RelKind.m) {
    public boolean supportsHasOidsColumn() {
                            ddl.append(superTables.get(i).getAssociatedEntity().getFullyQualifiedName(DBPEvaluationContext.DDL));
            }


    public boolean supportsRoleReplication() {
    public boolean supportsTransactions() {
    public boolean supportsFunctionCreate() {
            return new PostgreSequence(schema, dbResult);

    @Override
    public boolean isAlterTableAtomic() {
        return true;
    }
                createUsingClause((PostgreTableRegular) tableBase, ddl);
    @Override

        return true;
    @Override
                    withClauseBuilder.append(",");
            }
            return new PostgreMaterializedView(schema, dbResult);
    public PostgreSequence createSequence(@NotNull PostgreSchema schema) {
                    ddl.append(delimiter);
    public boolean supportsBackslashStringEscape() {
import java.util.Map;

    @Override
    @Override
        }
    }
    @Override
    public boolean supportsSequences() {
    public boolean supportsEntityMetadataInResults() {
    @Override
    @Override

    @Override

                        ddl.append(delimiter).append("INHERITS (");
        } else if (kind == PostgreClass.RelKind.R) {
    @Override
        return true;
        }
    public boolean supportsLocks() {
    @Override
    public boolean supportsTriggers() {
    public boolean supportsExplainPlan() {
        return true;
    public boolean supportsRelationSizeCalc() {
                continue;

            }
    }
                        for (int i = 0; i < superTables.size(); i++) {
    }
            return new PostgreView(schema);
