    /** Necessary for the "Truncate table" tool */
    /** True if supports operator families as access methods (System Info) */


    boolean supportsSessionActivity();

    /** COPY FROM STDIN is special command for the better table insert performance */


    boolean isHiddenRowidColumn(@NotNull PostgreAttribute attribute);
    /** True if supports special column with check constraint expression */
    boolean supportsTransactions();
    boolean supportsEventTriggers();


    boolean supportsMaterializedViews();
    boolean supportsJobs();
    boolean supportsDefaultPrivileges();
    boolean supportsRoles();
    boolean supportsRoleBypassRLS();
    /**
    boolean supportsPartitions();


    boolean supportsTriggers();


     * Determines whether the database supports syntax
 */
    Map<String, String> getDataTypeAliases();





    boolean supportsFunctionDefRead();

     * like {@code ALTER TABLE schema.view RENAME TO schema.view_new}
    boolean supportsNativeClient();
    PostgreTableBase createRelationOfClass(PostgreSchema schema, PostgreClass.RelKind kind, JDBCResultSet dbResult);

     * like {@code ALTER TABLE tableName ALTER COLUMN columnName USING columnName::dataTypeName} or not
    /** True if supports altered storage strategies (TOAST) */
    /** Makes it possible to change the name of the user of the current user via UI */


    // Roles


    List<PostgrePrivilege> readObjectPermissions(DBRProgressMonitor monitor, PostgreTableBase object, boolean includeNestedObjects) throws DBException;
    /** The ability to disable triggers need for the data transfer */

    boolean supportsExplainPlanXML();


     * */

    boolean supportsRoleReplication();
/**
 * See the License for the specific language governing permissions and

    boolean supportsDatabaseDescription();
    boolean supportsStorageModifier();
     */


    boolean supportsInheritance();
     * or use standard {@code ALTER VIEW schema.view RENAME TO schema.view_new}.
     */
    /**
    boolean supportsOpFamily();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

    boolean supportsFunctionCreate();
     */


    boolean supportsBackslashStringEscape();
    boolean supportsRolesWithCreateDBAbility();
    boolean supportsLanguages();
    int getTruncateToolModes();

    void initDefaultSSLConfig(DBPConnectionConfiguration connectionInfo, Map<String, String> props);
    // Table DDL extraction


    boolean supportsAggregates();
    /** True if supports foreign/imported keys */
 * Unless required by applicable law or agreed to in writing, software
public interface PostgreServerExtension {
    boolean supportsRules();
    /** True if supports external types - types from another databases (like Athena). These types in this case will be turned into fake types */

 *
    boolean supportsPGConstraintExpressionColumn();
     */


    boolean supportsIndexes();



     * Determines whether the database supports syntax like {@code COMMENT ON ROLE roleName IS 'comment'} or not

import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectLookupCache;

    boolean supportsClientInfo();
    boolean supportsDisablingAllTriggers();


 *
    boolean supportsCustomDataTypes();
    boolean supportsCopyFromStdIn();



    boolean supportsColumnsRequiring();
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
 * Licensed under the Apache License, Version 2.0 (the "License");
     * Determines whether the database supports syntax like {@code ALTER DEFAULT PRIVILEGES FOR roleName...} or not
    void configureDialect(PostgreDialect dialect);
import java.util.Map;
     */
    boolean supportsCommentsOnRole();
    /**
    boolean supportsDependencies();
    // Initializes SSL config if SSL wasn't enabled explicitly. By default disables SSL explicitly.
/*






    boolean supportsCollations();
    // Custom schema cache.
    /** True if supports table generated columns */
    boolean supportsSuperusers();

import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;

    JDBCObjectLookupCache<PostgreDatabase, PostgreSchema> createSchemaCache(PostgreDatabase database);
    String getTableModifiers(DBRProgressMonitor monitor, PostgreTableBase tableBase, boolean alter, String delimiter);
    boolean supportsExtensions();
    boolean supportsHasOidsColumn();
 * PostgreServerExtension
    boolean supportsAlterTableColumnWithUSING();

 * You may obtain a copy of the License at
    boolean supportsDistinctForStatementsWithAcl();
    String getProceduresSystemTable();
 *     http://www.apache.org/licenses/LICENSE-2.0
    boolean supportsEntityMetadataInResults();
     * True if database can use pg_dump and pg_restore clients without errors.

 * Copyright (C) 2010-2025 DBeaver Corp and others

    /** Nor all databases support all types of columns. Also, some databases return comments with table DDL from the server-side */
    int getParameterBindType(DBSTypedObject type, Object value);

    /** True if supports serials - serial types are auto-incrementing integer data types */
    /** True if supports objects dependencies metadata reading */
    /** True if supports table rowid columns. Rowid columns usually replace primary key in the table */
    // It works for original PG driver but doesn't work for many forks (e.g. Redshift).
    PostgreSequence createSequence(@NotNull PostgreSchema schema);


     * "These clauses determine whether a role bypasses every row-level security (RLS) policy."
    String readTableDDL(DBRProgressMonitor monitor, PostgreTableBase table) throws DBException;
    boolean supportsTemporalAccessor();
    boolean supportsAcl();
    boolean supportsStoredProcedures();
    boolean supportsShowingOfExtraComments();

     * True if database can read data from the pg_catalog.pg_language system view.
    boolean supportsExplainPlan();
    boolean supportsForeignServers();
import java.util.List;
    /** True if supports role replication parameter.
 * DBeaver - Universal Database Manager
    boolean supportsTableStatistics();
    boolean supportsOids();
    /**

 * limitations under the License.

    boolean isPGObject(@NotNull Object object);
    PostgreTableBase createNewRelation(DBRProgressMonitor monitor, PostgreSchema schema, PostgreClass.RelKind kind, Object copyFrom) throws DBException;

    boolean supportsResultSetLimits();
    boolean supportsAlterStorageStrategy();
    boolean supportsSequences();
     * "A role must have this attribute (or be a superuser) in order to be able to connect to the server in replication mode (physical or logical replication)

    boolean supportsLocks();
    /** True if supports NULL/NOT NULL column data types modifiers */

    boolean supportsTablespaces();
    boolean supportsExternalTypes();



    /** True if supports special "Has OIDs" metadata column*/

    boolean supportsForeignKeys();
     * */
     * and in order to be able to create or drop replication slots."
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    boolean supportsRelationSizeCalc();
}

    boolean supportsTablespaceLocation();
    boolean isAlterTableAtomic();
    String getServerTypeName();
     */
    String getProceduresOidColumn();


    String readViewDDL(DBRProgressMonitor monitor, PostgreViewBase view) throws DBException;
    /**

    boolean supportsTemplates();
    boolean supportSerialTypes();
    // Stored procedures support (workarounds for Redshift mostly)
 * you may not use this file except in compliance with the License.

 */

    /**

    boolean supportsEncodings();
 * distributed under the License is distributed on an "AS IS" BASIS,

package org.jkiss.dbeaver.ext.postgresql.model;
import org.jkiss.code.NotNull;


    boolean supportsDatabaseSize();
     * Determines if the provided object is a PostgreSQL-specific object (PGObject) like {@code com.amazon.redshift.util.RedshiftObject}.
    boolean supportsAlterTableForViewRename();
import org.jkiss.dbeaver.DBException;

    boolean supportsRowLevelSecurity();
    boolean supportsGeneratedColumns();


 *
     * Determines whether the database supports syntax
    /** True if supports role BYPASSRLS parameter.
    boolean supportsKeyAndIndexRename();
     */
    /**
import org.jkiss.dbeaver.model.struct.DBSTypedObject;

    boolean supportsExplainPlanVerbose();
    // True if driver returns source table name in ResultSetMetaData.
    // Data types
    /** View/Materialized view DDL extraction */
    boolean supportsAlterUserChangePassword();
