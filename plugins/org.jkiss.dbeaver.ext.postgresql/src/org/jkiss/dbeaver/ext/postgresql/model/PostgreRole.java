        }
    }
            } catch (Throwable e) {
            return !object.isPersisted();
        return bypassRls;
    }
import java.sql.Timestamp;
                .append(" IS ")
    protected long oid;
        public boolean isValidValue(@NotNull PostgreRole object, @Nullable Object value) throws IllegalArgumentException {
        if (getValidUntil() != null) {

    public Collection<PostgreRoleMember> getBelongs(DBRProgressMonitor monitor) throws DBException {
        visibleIf = CommentsOnRolesSupportedValidator.class)
            return object.getDataSource().getServerType().supportsRoleReplication();

                    "WHERE nspname NOT LIKE 'pg_%' AND nspname != 'information_schema')\n" +
            try {
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull PostgreRole owner)

        if (extension.supportsSuperusers()) {

                }
 * Unless required by applicable law or agreed to in writing, software
                                                grants));
        }
        if (!getDataSource().isServerVersionAtLeast(9, 0)) {
                        String objectName = null;
            boolean supportsOnlySchemasPermissions = !getDataSource().isServerVersionAtLeast(9,0); // So we can't use aclexplode in old PG versions. Let's read only schemas permissions then


    }
    @Nullable
    public boolean isCreateDatabase() {
    public PostgreRole(PostgreDatabase database, ResultSet dbResult)
                        FROM pg_default_acl a WHERE a.defaclnamespace <> 0) as g
            }

    }
            addOptionToDDL(ddl, isReplication(), "REPLICATION");
 *
            this.configurationParameter = configurationParameter;
            }
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
        this.canLogin = isUser;
    @NotNull
                        (aclexplode(defaclacl)).grantee as grantee
    protected String description;
        try (JDBCResultSet dbResult = dbStat.executeQuery()) {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    public void setInherit(boolean inherit) {
                otherObjectsSQL = "SELECT n.oid, n.nspacl FROM pg_catalog.pg_namespace n WHERE n.nspacl IS NOT NULL";
    @Property(editable = true, updatable = true, order = 12)

        return superUser;
                dbStat.setLong(1, getObjectId());
    }
                }

import org.jkiss.dbeaver.model.exec.DBCException;

                .append(SQLUtils.quoteString(this, description))
    @Override
    public void setBypassRls(boolean bypassRls) {
import org.jkiss.dbeaver.model.meta.IPropertyValueValidator;
            addOptionToDDL(ddl, isBypassRls(), "BYPASSRLS");
    /**
        final String lineBreak = System.lineSeparator();
                // We can try to use public schema in this case
        ddl.append(lineBreak).append("\t");
                                pKind = PostgrePrivilegeGrant.Kind.TABLE;
    public void setReplication(boolean replication) {
        this.bypassRls = bypassRls;
 *
        this.connLimit = connLimit;
    public void setDescription(String description) {

        @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Property(editable = true, updatable = true, order = 10, visibleIf = PostgreRoleCanBeSuperUserValidator.class)
                                                objectName,
    public void setObjectDefinitionText(String sourceText) throws DBException {

    @Override
            ddl.append("\tCONNECTION LIMIT ").append(getConnLimit());
            ddl.append(lineBreak);
        public boolean isValidValue(@NotNull PostgreRole object, @Nullable Object value) throws IllegalArgumentException {
                    try (JDBCResultSet dbResult = dbStat.executeQuery()) {
                {
            return result;
                            List<PostgrePrivilege> privileges = null;
                                        continue;
                    " AND tr.relkind IN('S', 'm', 'C')";
                }
        addOptionToDDL(ddl, isCreateRole(), "CREATEROLE");
        return description;
        return getName();
            // Start searching routine in schema to get it full name and change it for PostgrePrivilegeGrant object
        throws SQLException
            for (PostgreRoleSetting setting : extraSettings) {
    static class MembersCache extends JDBCObjectCache<PostgreRole, PostgreRoleMember> {
                                    defaultPrivilege.setUnderKind(objectType);
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
                    }
{
        }
            }
 */
                        PostgreSchema schema = getDatabase().getSchema(monitor, schemaId);
    protected boolean canLogin;
    DBPPersistedObject,
                            }
            ddl.append(option);
    public void setSuperUser(boolean superUser) {


        return null;
    {
                            } else if (objectType != null && objectName != null) {
                                continue;
    }
    protected boolean bypassRls;
        int valueStartingIndex = parameter.indexOf("=");
    @Property(viewable = true, password = true, editable = true, order = 2, visibleIf = PersistenceUserValidator.class)
        final PostgreServerExtension extension = dataSource.getServerType();

     * Specific tole type name for SQL statement correct generation.
            ddl.append("\n").append(SQLUtils.generateScript(dataSource, actions.toArray(new DBEPersistAction[0]), false));
                            long schemaId = JDBCUtils.safeGetLong(dbResult, "defaclnamespace");
        this.replication = JDBCUtils.safeGetBoolean(dbResult, "rolreplication");
    }

                            PostgreSchema schema = getDatabase().getSchema(monitor, schemaId);
                            PostgrePrivilegeGrant.Kind pKind = null;
import org.jkiss.utils.ArrayUtils;
    protected boolean createRole;
    @Override
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
    }
                                                pKind,
import java.util.*;
import org.jkiss.dbeaver.model.sql.SQLUtils;
                    left join pg_catalog.pg_database pd on s.setdatabase = pd.oid
    }
                    select s.setconfig, pd.datname from pg_catalog.pg_db_role_setting s
    }
    public static final String CAT_FLAGS = "Flags";
                                privileges = PostgreUtils.extractPermissionsFromACL(monitor, schema, acl, false);
    }
        @Nullable PostgreDatabase database;
                    "\tpg_catalog.pg_namespace n\n" +
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
                        where pg_get_userbyid(g.grantee) = ?""")) {
            ddl.append("\tCONNECTION LIMIT -1");
    @Override
        }
    protected void loadInfo(ResultSet dbResult) {
        @Override
    public static class PostgreRoleCanBeSuperUserValidator implements IPropertyValueValidator<PostgreRole, Object> {
            PostgreUtils.getObjectGrantPermissionActions(monitor, this, actions, options);
    @Property(editable = true, updatable = true, order = 14)
        updatable = true,
        return true;

 * Copyright (C) 2010-2025 DBeaver Corp and others
            if (schema != null) {

    DBPRefreshableObject,
    public boolean isSuperUser() {
                dbStat.setString(1, getDatabase().getName());
                    && !privilegeObjectName.endsWith("_") && CommonUtils.isNotEmpty(objectSchema))
    @Override
            }
        valueStartingIndex = valueStartingIndex + 1;
                    "\trelacl,\n" +

    public boolean supportsObjectDefinitionOption(@NotNull String option) {

        // Specific name = usual name + underscore + object id
            this.members = members;
        @NotNull String configurationParameter;
                                                schema.getName(),
                                    PostgreMaterializedView materializedView = schema.getMaterializedView(monitor, objectName);
        }

    }
                    "WHERE pg_get_userbyid(tr.granteeI)= ?" +
        if (CommonUtils.isNotEmpty(description)) {
            return object.getDataSource().getServerType().supportsRoleBypassRLS();


        }
        @NotNull DBRProgressMonitor monitor,
                                continue;
    @Property(viewable = true, order = 3)
    PostgrePrivilegeOwner,
                            continue;
    @Override
    @Nullable
        PostgreRoleSetting(@Nullable PostgreDatabase database, @NotNull String configurationParameter) {
                    "SELECT * FROM information_schema.table_privileges WHERE table_catalog=? AND grantee=?")) {
        }
        public boolean isValidValue(@NotNull PostgreRole object, @Nullable Object value) throws IllegalArgumentException {
        }
    }


                                    pKind = PostgrePrivilegeGrant.Kind.SEQUENCE;
            return object.getDataSource().getServerType().supportsSuperusers();
        this.inherit = JDBCUtils.safeGetBoolean(dbResult, "rolinherit");
/*
    @Override
                log.error("Can't read extra role configuration parameters.");
        @NotNull PostgrePrivilegeGrant.Kind kind,
    protected LocalDateTime validUntil;
        this.createDatabase = createDatabase;

    }
    protected boolean replication;
                                }
        }
    }
    public static class PostgreRoleCanCreateDBValidator implements IPropertyValueValidator<PostgreRole, Object> {
                        while (dbResult.nextRow()) {

    public void setPersisted(boolean persisted) {
    private List<PostgreRoleSetting> extraSettings;
            return parameter;
                            objectType = JDBCUtils.safeGetString(dbResult, "relkind");
                permissions.addAll(getRolePermissions(monitor, this, PostgrePrivilegeGrant.Kind.FUNCTION, dbStat));
                    "UNION ALL\n" +
    }
    public long getObjectId() {
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
                    privilegeGrant.getObjectName(),
                        SELECT DISTINCT g.* FROM (
        protected PostgreRoleMember fetchObject(@NotNull JDBCSession session, @NotNull PostgreRole owner, @NotNull JDBCResultSet dbResult)
    }
        return database;
                    "\tpg_class\n" +
                                    privileges = PostgreUtils.extractPermissionsFromACL(monitor, materializedView, acl, false);
                }


    DBAUser,
        if (extension.supportsRoleReplication()) {
                                                objectName, perm.getPrivilegeType(),
                    where s.setrole = ?""")) {
        @Override
    DBPSaveableObject,
                                } else {
                        // They all are FUNCTIONS by default
                PostgrePrivilegeGrant privilege = new PostgrePrivilegeGrant(role.database, kind, dbResult);
        @NotNull PostgreRole role,
    @NotNull
                            }
    }
        List<PostgrePrivilege> permissions = new ArrayList<>();
            throws SQLException, DBException
    }

import org.jkiss.dbeaver.model.meta.PropertyLength;
    }
                                        List<PostgrePrivilegeGrant> grants = new ArrayList<>();
    private void addOptionToDDL(StringBuilder ddl, boolean isOptionOn, String option) {
import org.jkiss.dbeaver.model.*;
    public String getSpecificRoleType() {
    public static class PostgreRoleInheritValidator implements IPropertyValueValidator<PostgreRole, Object> {
                    "\n\tn.oid AS relnamespace,\n" +
        extraSettings = new ArrayList<>();
    @NotNull
                    ddl.append("IN DATABASE ").append(DBUtils.getQuotedIdentifier(setting.database)).append(" ");
    PostgreScriptObject,
                    procedure = schema.getProcedure(monitor, routineId);
        // To get it correct full name with parameters
    }
        MembersCache(boolean members) {
    }
            ddl.append("\n");
    public PostgreRoleReference getRoleReference() {

                "SELECT * FROM pg_catalog.pg_auth_members WHERE " + (members ? "roleid" : "member")+ "=?");
            addOptionToDDL(ddl, isCreateDatabase(), "CREATEDB");
                            Object acl = JDBCUtils.safeGetObject(dbResult, "defaclacl");
                    while (dbResult.next()) {
                            for (PostgrePrivilege p : CommonUtils.safeCollection(privileges)) {
                if (procedure != null && CommonUtils.isNotEmpty(procedure.getOverloadedName())) {
    }
                                pKind = PostgrePrivilegeGrant.Kind.SCHEMA;
                privList.add(privilege);
                dbStat.setString(2, getName());
        this.connLimit = JDBCUtils.safeGetInt(dbResult, "rolconnlimit");
    }
    @Property(category = CAT_SETTINGS, editable = true, updatable = true, order = 22)
    public boolean isCreateRole() {
                                            new PostgreRolePrivilege(
    }
        @NotNull
        this.persisted = persisted;
            try (JDBCPreparedStatement dbStat = session.prepareStatement(

            return object.getDataSource().getServerType().supportsRolesWithCreateDBAbility();
    @Association
    public String toString() {
                        String objectType = null;
            return object.getDataSource().getServerType().supportsCommentsOnRole();
            }
                                                schema.getName(),
    public boolean isPersisted() {
                                continue;
        return createRole;
                    "\tnspacl AS relacl,\n" +
            }
                                    PostgreRoleReference grantee = ((PostgreObjectPrivilege) p).getGrantee();
    {
                            database = getDataSource().getDatabase(databaseName);
                    role,
        return connLimit;
        return database.getDataSource();
            }
    @Override
                                                grantee,
        this.name = name;

                                        }
                                            ));
                if ((kind == PostgrePrivilegeGrant.Kind.FUNCTION || kind == PostgrePrivilegeGrant.Kind.PROCEDURE)
                    "SELECT " + (supportsDistinct ? "DISTINCT" : "") +
import java.sql.SQLException;
                ddl.append("SET ").append(setting.configurationParameter).append(";");
    }
            this.database = database;
                        }
        this.database = database;
                    privilegeGrant.getKind(),
                    .append(DBUtils.getQuotedIdentifier(this))
    {
                }
                                                false,
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        this.description = JDBCUtils.safeGetString(dbResult, "description");
    }
                    "SELECT oid\n" +

    }
                            }
    @Property(viewable = true,
        }

        if (extension.supportsRolesWithCreateDBAbility()) {
        return membersCache.getAllObjects(monitor, this);
    public int getConnLimit() {
                                                this,
                                log.debug("Can't read default permissions object type for " + schema.getName());

            PostgreDatabase database = role.getDatabase();
                        privilege.setKind(PostgrePrivilegeGrant.Kind.PROCEDURE);
            throws SQLException
                    "FROM\n" +
                    "\tcast('C' as \"char\") AS relkind,\n" +

            ddl.append("\n");

        public boolean isValidValue(@NotNull PostgreRole object, @Nullable Object value) throws IllegalArgumentException {
    }
                            extraSettings.add(new PostgreRoleSetting(database, parameter));
            List<PostgrePrivilege> result = new ArrayList<>(privs.size());
public class PostgreRole implements
            // Pack to permission list
    }
            addOptionToDDL(ddl, isSuperUser(), "SUPERUSER");
            return new PostgreRoleMember(owner, dbResult);
                    "FROM pg_namespace\n" +
    }
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) {
            PostgreSchema schema;
        return this;

        this.replication = replication;
            if (supportsOnlySchemasPermissions) {
    private static void changeRoutineFullName(
     */
     * Returns true if role/user/group can't see and change routines (procedures and functions) privileges.
    public static class RoleCanBeReplicationValidator implements IPropertyValueValidator<PostgreRole, Object> {
        }
                log.error("Error reading routine privileges", e);
            && Objects.equals(this.getSpecificRoleType(), reference.getRoleType());
        if (extension.supportsInheritance()) {
            }
            // Not supported
            Collections.sort(permissions);
                        }
    @Override
            ddl.append(lineBreak);
        if (valueStartingIndex < 0 || valueStartingIndex + 1 >= parameter.length()) {
import org.jkiss.dbeaver.model.access.DBAUser;
                        }
                ddl.append(beginning);
                PostgrePrivilegeGrant privilegeGrant = priv.get(0);
                                } else if (PostgreClass.RelKind.S.getCode().equals(objectType)) {
        }
                    && CommonUtils.isNotEmpty(privilegeObjectName) && privilegeObjectName.contains("_")
                            }
                            parameter = quoteParamIfNeed(parameter);
                    "\trelkind,\n" +
                    priv));
    DBPScriptObjectExt2
                PostgreProcedure procedure = null;
            .map(Timestamp::toLocalDateTime)
                                                perm.getGrantor(),
        this.validUntil = Optional.ofNullable(JDBCUtils.safeGetTimestamp(dbResult, "rolvaliduntil"))
        public boolean isValidValue(@NotNull PostgreRole object, @Nullable Object value) throws IllegalArgumentException {
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
                log.debug("Can't find routine schema '" + objectSchema + "'", e);
                .append(";");
        this.loadInfo(dbResult);

                            permissions.addAll(resultPrivileges);
        }
                            }
        }
        this.superUser = JDBCUtils.safeGetBoolean(dbResult, "rolsuper");
                    "\tSELECT " + (supportsDistinct ? "DISTINCT" : "") + " relnamespace,\n" +
        if (routineId != -1) {
    public String generateChangeOwnerQuery(@NotNull String owner, @NotNull Map<String, Object> options) {
        @Override

                                    privileges = PostgreUtils.extractPermissionsFromACL(monitor, schema, acl, false);
    }
    @Override
                    .append(DBUtils.getQuotedIdentifier(member.getOwner(monitor)))
                    if (procedure.getKind() == PostgreProcedureKind.p) {
                        if (CommonUtils.isNotEmpty(databaseName)) {
        private final boolean members;
        String value = parameter.substring(valueStartingIndex);
            return parameter;
                schema = database.getPublicSchema();
                        String databaseName = JDBCUtils.safeGetString(dbResult, "datname");
    @Override
                    changeRoutineFullName(monitor, role, privilege, privilegeObjectName, objectSchema);
            ddl.append(lineBreak);
    public void setName(@NotNull String newName) {
            .orElse(null);
        this.persisted = false;
        this.oid = JDBCUtils.safeGetLong(dbResult, "oid");
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Read role privileges")) {
        }

            String beginning = "\nALTER ROLE " + roleName + " ";
    private final MembersCache belongsCache = new MembersCache(false);
        }
     */
            return;
                            if (supportsOnlySchemasPermissions) {

    @Property(editable = true, updatable = true, order = 13, visibleIf = PostgreRoleCanCreateDBValidator.class)
    @Property(editable = true, updatable = true, order = 11, visibleIf = PostgreRoleInheritValidator.class)
    @Override
        this.password = JDBCUtils.safeGetString(dbResult, "rolpassword");
    @Property(category = CAT_SETTINGS, editable = true, updatable = true, order = 20)
                    "\tn.nspacl IS NOT NULL \n" +

        return name;
                permissions.addAll(getRolePermissions(monitor, this, PostgrePrivilegeGrant.Kind.TABLE, dbStat));

        PostgreDataSource dataSource = getDataSource();
                        for (String parameter : setconfig) {
                    .append(" TO ")
                    "FROM\n" +
    }
        ddl.append("CREATE ROLE ").append(roleName).append(" WITH ");

                }
                            }
                                if (p instanceof PostgreObjectPrivilege) {
        @NotNull PostgreRole role,
        StringBuilder ddl = new StringBuilder();
            // Select acl for all schemas, sequences and materialized views
 * DBeaver - Universal Database Manager
    private static final Log log = Log.getLog(PostgreRole.class);
                        String[] setconfig = PostgreUtils.safeGetStringArray(dbResult, "setconfig");
    public void setCreateDatabase(boolean createDatabase) {
            }
                List<PostgrePrivilegeGrant> privList = privs.computeIfAbsent(tableId, k -> new ArrayList<>());

import org.jkiss.dbeaver.model.meta.Property;
                                    }

    }
    @Override
    }

    private static class PostgreRoleSetting {
    }
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load configuration parameters")) {
    protected String password;
        this.createRole = createRole;
    @NotNull
        if (isInherit()) {
                            objectName = JDBCUtils.safeGetString(dbResult, "relname");
        return null;
        long routineId = CommonUtils.toLong(privId, -1);
import org.jkiss.dbeaver.DBException;
            } catch (SQLException e) {


                    "SELECT * FROM information_schema.routine_privileges WHERE specific_catalog=? AND grantee=?")) {
        return parameter.substring(0, valueStartingIndex) + SQLUtils.quoteString(this, value);
    }
    private String quoteParamIfNeed(String parameter) {
                        if (!supportsOnlySchemasPermissions) {
        String privilegeObjectName,
        @Override
            }
    }

        this.createDatabase = JDBCUtils.safeGetBoolean(dbResult, "rolcreatedb");
        String privId = privilegeObjectName.substring(privilegeObjectName.lastIndexOf("_") + 1);
            while (dbResult.next()) {
        }
                            for (PostgrePrivilege privilege : privileges) {
        @Override
 * limitations under the License.
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    private void loadExtraConfigParameters(@NotNull DBRProgressMonitor monitor) throws DBCException {

    }
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.canLogin = canLogin;
                    "(aclexplode(relacl)).grantee as granteeI\n" +
    public PostgreDataSource getDataSource() {
                        long schemaId = JDBCUtils.safeGetLong(dbResult, 1);
        if (CommonUtils.getOption(options, DBPScriptObject.OPTION_INCLUDE_PERMISSIONS)) {
                    "\tn.nspname AS relname,\n" +
                    "\trelname,\n" +

            loadExtraConfigParameters(monitor);
    }
        @NotNull DBRProgressMonitor monitor,
                log.error("Error reading table privileges", e);
 * distributed under the License is distributed on an "AS IS" BASIS,
        return belongsCache.getAllObjects(monitor, this);
        this.validUntil = validUntil;
                String tableId = objectSchema + "." + privilege.getObjectName();
                ddl.append("\n")
            List<DBEPersistAction> actions = new ArrayList<>();

            return object.getDataSource().getServerType().supportsInheritance();
                String objectSchema = privilege.getObjectSchema();
                                if (objectType.equals("C")) {
    @Association
    protected boolean persisted;
 * See the License for the specific language governing permissions and
                    "(aclexplode(nspacl)).grantee as granteeI\n" +
    }
            String otherObjectsSQL;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
                dbStat.setString(2, getName());
        ddl.append(";");
                } catch (DBException e) {
    @Property(editable = true, updatable = true, order = 16, visibleIf = RoleCanBypassRLSValidator.class)
            dbStat.setLong(1, owner.getObjectId());
    }

                if (setting.database != null) {

    }
    }
    public boolean supportsRoutinesPermissions() {
                    }
 */
        }
    }
    public boolean isReferencedWith(PostgreRoleReference reference) {
        this.superUser = superUser;
                                                getDatabase().getName(),

    @Nullable
        addOptionToDDL(ddl, isCanLogin(), "LOGIN");
    public PostgreRole getOwner(DBRProgressMonitor monitor) throws DBException {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override

        return password;
    public void setCanLogin(boolean canLogin) {
                dbStat.setString(1, getDatabase().getName());
        this.description = description;
        return inherit;

    @Property(editable = true, updatable = true, order = 15, visibleIf = RoleCanBeReplicationValidator.class)
    DBPNamedObject2,
        public boolean isValidValue(@NotNull PostgreRole object, @Nullable Object value) throws IllegalArgumentException {
        @NotNull JDBCPreparedStatement dbStat) throws SQLException
                            if (CommonUtils.isEmpty(objectType)) {

    private final MembersCache membersCache = new MembersCache(true);
        membersCache.clearCache();
            }
    public void setConnLimit(int connLimit) {
    }
    public static final String CAT_SETTINGS = "Settings";
        this.createRole = JDBCUtils.safeGetBoolean(dbResult, "rolcreaterole");
            } catch (Throwable e) {
                            schema.addDefaultPrivileges(resultPrivileges);
                try (JDBCPreparedStatement dbStat = session.prepareStatement(
        if (getConnLimit() > 0) {
        } else {
        return database;
    public void setPassword(String password) {
                            if (acl == null) {
        @NotNull PostgrePrivilegeGrant privilege,
        {
        } catch (Exception e) {
import org.jkiss.dbeaver.model.struct.DBSObject;
        @Override
    @Override
    /**
        return this;
    protected String name;
                    "\tAND relnamespace IN (\n" +
                                    if (!defaultPrivilege.getGrantee().getRoleName().equals(getName())) {

        // Functions and procedures stores their names as specific name
                                                false
                    """
            && Objects.equals(this.getDatabase(), reference.getDatabase())
    }
        return permissions;
                        }
    public String getDescription() {
        }
    protected boolean inherit;
        if (extraSettings == null) {
        }
    public LocalDateTime getValidUntil() {

        }
            } catch (DBException e) {
import org.jkiss.dbeaver.model.access.DBARole;
import org.jkiss.code.NotNull;
    public boolean isBypassRls() {
    public DBSObject getParentObject() {
                    while (dbResult.nextRow()) {
        this.bypassRls = JDBCUtils.safeGetBoolean(dbResult, "rolbypassrls");
    public static class CommentsOnRolesSupportedValidator implements IPropertyValueValidator<PostgreRole, Object> {
                    "WHERE\n" +
    protected boolean createDatabase;
        return new PostgreRoleReference(this.database, this.getName(), this.getSpecificRoleType());
    }
            return parameter;
                        Object acl = JDBCUtils.safeGetObject(dbResult, 2);
        this.database = database;
                    .append("GRANT ")
            try (JDBCPreparedStatement dbStat = session.prepareStatement(otherObjectsSQL)) {
            return dbStat;
    PostgreObject,
        this.persisted = true;
                                if (privilege instanceof PostgreDefaultPrivilege defaultPrivilege) {
        public boolean isValidValue(@NotNull PostgreRole object, @Nullable Object value) throws IllegalArgumentException {

        }
    }
                                    }
import org.jkiss.code.Nullable;
                                            grants.add(new PostgrePrivilegeGrant(
        {
                    dbStat.setString(1, getName());
            for (PostgreRoleMember member : belongsCache.getAllObjects(monitor, this)) {
                                    PostgreSequence sequence = schema.getSequence(monitor, objectName);
        String roleName = DBUtils.getQuotedIdentifier(this);
                try {
                    privilege.setObjectName(procedure.getOverloadedName());
                """
                if (!supportsOnlySchemasPermissions) {

    }
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        ddl.append("-- DROP ROLE ").append(roleName).append(";\n\n"); //$NON-NLS-1$ //$NON-NLS-2$
        @Override
                                        permissions.add(
                .append(roleName)
    @Override
        }
        this.name = JDBCUtils.safeGetString(dbResult, "rolname");
        length = PropertyLength.MULTILINE, order = 50,
    public PostgreDatabase getDatabase() {
        // Dummy implementation
import org.jkiss.dbeaver.Log;
                    }
            ddl.append("\tVALID UNTIL '").append(getValidUntil()).append("'");
import org.jkiss.utils.CommonUtils;
        return this.persisted;
        }
                    "\trelacl IS NOT NULL\n" +
package org.jkiss.dbeaver.ext.postgresql.model;
        return replication;
    public static class RoleCanBypassRLSValidator implements IPropertyValueValidator<PostgreRole, Object> {
                String privilegeObjectName = privilege.getObjectName();
 * PostgreRole
                            List<PostgrePrivilege> resultPrivileges = new ArrayList<>();


    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
        this.name = newName;

import java.time.LocalDateTime;
            && Objects.equals(this.getName(), reference.getRoleName())


}
                                    privileges = PostgreUtils.extractPermissionsFromACL(monitor, sequence, acl, false);
                            // something went wrong
                                    if (grantee != null && this.isReferencedWith(grantee)) {
                    }
    }
                }
    }
        editable = true,

    }
    @Override
 * You may obtain a copy of the License at

                                    pKind = PostgrePrivilegeGrant.Kind.SCHEMA;
        if (CommonUtils.isNumber(value) || (value.charAt(0) == '"' && value.charAt(value.length() - 1) == '"')) {

    public boolean isReplication() {
                        if (ArrayUtils.isEmpty(setconfig)) {
                } catch (Throwable e) {
        }
    }
        return oid;
        return createDatabase;
                                }
                    "\t) AS tr\n" +
                .append("COMMENT ON ROLE ")
                            String objectType = JDBCUtils.safeGetString(dbResult, "defaclobjtype");
    protected int connLimit;
        return DBPScriptObject.OPTION_INCLUDE_PERMISSIONS.equals(option);
                                    resultPrivileges.add(defaultPrivilege);
            JDBCPreparedStatement dbStat = session.prepareStatement(
        // We need to get this id and search this routine in schema
                    log.error("Error reading default privileges", e);
    public PostgreRole(PostgreDatabase database, String name, String password, boolean isUser) {
        return reference != null
                otherObjectsSQL = "SELECT * FROM (\n" +
                    dbStat.setString(1, getName());
    }
    }
            for (List<PostgrePrivilegeGrant> priv : privs.values()) {
    public boolean isCanLogin() {
 *
    public boolean isInherit() {
    public PostgreSchema getSchema() {
        return canLogin;
            ddl.append("\n\n")
        return canLogin;
                        if (schema != null) {
                        PostgreDatabase database = null;
    }
            Map<String, List<PostgrePrivilegeGrant>> privs = new LinkedHashMap<>();
    protected final PostgreDatabase database;
            } else {
            }
    public String getName() {
/**
                                }
    public String getPassword() {
        extraSettings = null;
    }
import org.jkiss.dbeaver.model.meta.Association;
    public void setCreateRole(boolean createRole) {
            if (getDataSource().getServerType().supportsDefaultPrivileges()) {
        if (extension.supportsRoleBypassRLS()) {
        }
    }
                result.add(new PostgreRolePrivilege(

        } else {

            throw new DBCException("Error reading role privileges", e);
        belongsCache.clearCache();
        }
 * you may not use this file except in compliance with the License.

        }
import java.sql.ResultSet;
        this.password = password;
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
    public static class PersistenceUserValidator implements IPropertyValueValidator<PostgreRole, Object> {
        return null;
                    log.debug("Can't find routine in schema '" + privilegeObjectName + "'", e);
    }
                    "WHERE\n" +
        if (!CommonUtils.isEmpty(extraSettings)) {
        @Override
    private final String lineBreak = System.lineSeparator();
                        SELECT *,
            boolean supportsDistinct = getDataSource().getServerType().supportsDistinctForStatementsWithAcl(); // Greenplum do not support DISTINCT keyword with the acl data type in the query
                    privilegeGrant.getObjectSchema(),
                                        for (PostgrePrivilege.ObjectPermission perm : p.getPermissions()) {
    public boolean isUser() {
            addOptionToDDL(ddl, isInherit(), "INHERIT");
        }

        }
                            if (schema == null) {

        String objectSchema)
 * Licensed under the Apache License, Version 2.0 (the "License");
            ddl.append("NO").append(option);

    public void setValidUntil(LocalDateTime validUntil) {
    public Collection<PostgreRoleMember> getMembers(DBRProgressMonitor monitor) throws DBException {
    DBARole,
                        }
        return ddl.toString();

                }
        if (isOptionOn) {
    }
    protected static Collection<PostgrePrivilege> getRolePermissions(
        }
        this.inherit = inherit;
        if (parameter == null || parameter.isEmpty()) {
                    .append(";");

    @Override
    protected boolean superUser;
        }
                            List<PostgrePrivilege> privileges = PostgreUtils.extractPermissionsFromACL(monitor, schema, acl, true);
                        }
    public List<PostgrePrivilege> getPrivileges(@NotNull DBRProgressMonitor monitor, boolean includeNestedObjects) throws DBCException {
    @Property(viewable = true, editable = true, order = 1)
        return validUntil;
        this.canLogin = JDBCUtils.safeGetBoolean(dbResult, "rolcanlogin");
        this.password = password;
                schema = database.getSchema(monitor, objectSchema);
