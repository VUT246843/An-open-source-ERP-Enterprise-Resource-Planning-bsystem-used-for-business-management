			throws DBException
    
					return null;
	protected JDBCExecutionContext createExecutionContext(JDBCRemoteInstance instance, String type) {
				+ "	PASSWORD_STATE,\n"
			);
import org.jkiss.dbeaver.model.exec.DBCException;
							"	OBJECT_TYPE," + 
    private static final Log LOG = Log.getLog(ExasolDataSource.class);
		return this.exasolCurrentUserPrivileges
		return getSchemas(monitor);
	{
			throws DBException

	public DBSObjectCache<ExasolDataSource, ExasolSchema> getSchemaCache()
    	return exasolCurrentUserPrivileges.getTablePrefix(fallback);
				grants.add(new ExasolViewGrant(grant));
	
					}


					+ typeName, e);
	{
		return getSchema(monitor, childName);
	public void cacheStructure(@NotNull DBRProgressMonitor monitor, int scope)
				@Override
					"	" + (this.exasolCurrentUserPrivileges.getAtLeastV8() ? vsAdapterExpressionV8 : "ADAPTER_SCRIPT") + "," +
	@Override
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
					return groups;
	}
		}
					"CONSUMER_GROUP_NAME,\n" + 
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
	
		{
		}
	}
	public DBSObjectCache<ExasolDataSource, ExasolRole> getRoleCache()
    @Override
	public Collection<ExasolScriptGrant> getScriptGrants(DBRProgressMonitor monitor) throws DBException
		}
	public ExasolSchema getChild(@NotNull DBRProgressMonitor monitor,
							"	GRANTEE," + 
    public ExasolCurrentUserPrivileges getUserPriviliges()

				@Override
		}
				
	
    }
		}
            url.append(",").append(backupHostList).append(port);
				@Override
		} else if (adapter == DBCQueryPlanner.class) {
		return this.exasolCurrentUserPrivileges.getUserHasDictionaryAccess();
		} catch (DBException e) {
	public boolean isatLeastV6()

	public ExasolSchema getSchema(DBRProgressMonitor monitor, String name)
			throws DBException
		
	}
import org.jkiss.utils.CommonUtils;
		grantees.addAll(this.getRoles(monitor));
import org.jkiss.dbeaver.ext.exasol.ExasolConstants;

					"/*snapshot execution*/ select r.*,p.ADMIN_OPTION,p.GRANTEE from EXA_DBA_ROLES r "
    DBSObjectCache<ExasolDataSource, ExasolDataType> getDataTypeCache()
import org.jkiss.dbeaver.ext.exasol.model.security.*;
 * You may obtain a copy of the License at
            	url.append(";").append(entry.getKey()).append("=").append(entry.getValue());

	
			this.consumerGroupCache = new JDBCObjectSimpleCache<>(ExasolConsumerGroup.class,
        if (!CommonUtils.isEmpty(message)) {
					"GROUP_TEMP_DB_RAM_LIMIT,\n" + 
					"	s.SCHEMA_OWNER AS OWNER," + 
	public boolean isatLeastV5()
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
		String priorityColUser = " USER_PRIORITY,\n";
import org.jkiss.dbeaver.model.exec.DBCQueryTransformType;


	   	List<ExasolGrantee> grantees = new ArrayList<>();
        // append properties if exists -> meta connection using different type
	@Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
	{
    	
		}
	
	}
		
				
					"	SCHEMA_COMMENT AS OBJECT_COMMENT, s.SCHEMA_OBJECT_ID" + 
		return priorityGroupCache;
import org.jkiss.dbeaver.model.admin.sessions.DBAServerSessionManager;
	}

					return groups;
	{
	{
					"	ADAPTER_NOTES," + 
		}
	}
	{
			throws DBException
			props.put(ExasolConstants.DRV_LEGACY_ENCRYPTION, "1");
		if (this.roleCache != null) {

	{

		
	@Association
	}

		{
				+ "	PASSWORD_EXPIRY_POLICY,\n"
	{
			
	}
	
		Collection<ExasolScriptGrant> grants = new ArrayList<>();
import java.sql.SQLException;

   public DBSObjectCache<ExasolDataSource, ExasolConnection> getConnectionCache()
	}
import org.jkiss.dbeaver.model.DBPErrorAssistant;
	// --------------------------
        Object querytimeout = properties.get(ExasolConstants.DRV_QUERYTIMEOUT);
	{
        //Default Port
		return schemaCache.getAllObjects(monitor, this);
			return adapter.cast(new ExasolStructureAssistant(this));
					"CPU_WEIGHT,\n" + 
		return userCache.getAllObjects(monitor, this);
	{
		
	
    protected Properties getAllConnectionProperties(@NotNull DBRProgressMonitor monitor, JDBCExecutionContext context, String purpose,
				@Override
	
			
					"	INNER JOIN" + 
    	
							"	GROUP_CONCAT(" + 
		addMetaProps.clear();
				}
				errorMessage.contains("Process does not exist") | 
	}
	// Manage Children: ExasolSchema
	}
	
				errorMessage.contains("Connection was lost and could not be reestablished")
 * Copyright (C) 2010-2025 DBeaver Corp and others
	
		for (ExasolBaseObjectGrant grant: this.getBaseTableGrants(monitor))

			
		}
					" from" + 
import org.jkiss.code.Nullable;
		return this.exasolCurrentUserPrivileges.getAtLeastV5();
	}
					ExasolSystemGrant.class,
	
            // Client info can only be provided in the url with the exasol driver

		super.refreshObject(monitor);
            return new QueryTransformerLimit(false);
	{
					"	s.SCHEMA_NAME as OBJECT_NAME," + 
    @Override
		return roleCache;
   
 * DBeaver - Universal Database Manager

							"		OBJECT_SCHEMA," + 
                return null;
	
					"CREATED,\n" + 
			this.driverMajorVersion = session.getMetaData().getDriverMajorVersion();

				+ "	PASSWORD_EXPIRY,\n"
	public boolean isAuthorizedForObjectPrivs()
import org.jkiss.dbeaver.model.connection.DBPDriver;
		return dataTypeCache.getDataTypeId(id);
    @NotNull
			if (grant.getType() == ExasolTableObjectType.VIEW)
		if (this.connectionGrantCache != null) {
							"	ORDER BY" + 
		this.connectionCache.clearCache();
				ExasolConnection.class, "/*snapshot execution*/ SELECT * FROM SYS."+ this.exasolCurrentUserPrivileges.getTablePrefix(ExasolSysTablePrefix.SESSION)  +"_CONNECTIONS ORDER BY CONNECTION_NAME");
	{
	private DBSObjectCache<ExasolDataSource, ExasolSystemGrant> systemGrantCache = null;
	{
    
	}
		}
            return new QueryTransformerFetchAll();
 *
				}
	@Nullable
			return ErrorType.FEATURE_UNSUPPORTED;
	}
		if (exasolCurrentUserPrivileges.getUserHasDictionaryAccess())
			if (grant.getType() == ExasolTableObjectType.TABLE)
			DBPDataSourceContainer container) throws DBException
	@Override
        }

					"SELECT\n" + 

			this.dataTypeCache
	
	public boolean isAuthorizedForConnections()
		grantees.addAll(this.getUsers(monitor));
import org.eclipse.core.runtime.IAdaptable;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
					groups = new ArrayList<>();
	public ExasolSecurityPolicy getSecurityPolicy(DBRProgressMonitor monitor, String name) throws DBException
			this.roleGrantCache = new JDBCObjectSimpleCache<>(
				errorMessage.contains("Successfully reconnected") | 
	public ExasolVirtualSchema getVirtualSchema(DBRProgressMonitor monitor, String name)
	public ExasolPriority getConsumGroup(DBRProgressMonitor monitor, String name) throws DBException {
		{
				+ (this.exasolCurrentUserPrivileges.getUserHasDictionaryAccess() ? "	KERBEROS_PRINCIPAL,\n" : "")
}
import org.jkiss.dbeaver.model.struct.DBSObject;
        while (error instanceof DBException) {

	
					"/*snapshot execution*/ select" + 
					ExasolConnectionGrant.class,"/*snapshot execution*/ SELECT c.*,P.ADMIN_OPTION,P.GRANTEE FROM SYS.EXA_DBA_CONNECTION_PRIVS P "
			this.baseTableGrantCache.clearCache();
			String vsAdapterExpressionV8 = "'\"' || ADAPTER_SCRIPT_SCHEMA || '\".\"' || ADAPTER_SCRIPT_NAME || '\"' AS ADAPTER_SCRIPT";
	{
				errorMessage.contains("No operations allowed on this connection because it was already closed") |
							+ "INNER JOIN SYS.EXA_DBA_CONNECTIONS C on P.GRANTED_CONNECTION = C.CONNECTION_NAME ORDER BY P.GRANTEE,C.CONNECTION_NAME ");
    }
		for (ExasolBaseObjectGrant grant: this.getBaseTableGrants(monitor))
	public boolean isAuthorizedForUsers()
	}
    private Pattern ERROR_POSITION_PATTERN = Pattern.compile("(.+)\\[line ([0-9]+), column ([0-9]+)\\]");
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
							"	OBJECT_SCHEMA," + 
	}

	public boolean ishasPartitionColumns()
            if (propClientName != null)
                                          @NotNull JDBCExecutionContext context, JDBCExecutionContext initFrom)
/*
	public ExasolDataType getDataType(DBRProgressMonitor monitor, String name)
    	Properties props =  super.getAllConnectionProperties(monitor, context, purpose, connectionInfo);
		this.userCache = new JDBCObjectSimpleCache<>(ExasolUser.class,
 * See the License for the specific language governing permissions and
	@Override
	{
				public void renameObject(@NotNull ExasolPriorityGroup object, @NotNull String oldName, @NotNull String newName) {
			return getDataTypes(new VoidProgressMonitor());
	public Collection<ExasolRoleGrant> getRoleGrants(DBRProgressMonitor monitor) throws DBException
        throws DBException
	// -----------------------
	}
				public void setCache(@NotNull List<ExasolPriorityGroup> objects) {
            	clientVersion = propClientName.toString();
	public boolean ishasConsumerGroups()
	}
	{
				@NotNull
	
	
            url.append(";").append(ExasolConstants.DRV_QUERYTIMEOUT).append("=").append(querytimeout);
		}
	public Boolean hasAlterUserPrivilege()
            List<ErrorPosition> positions = new ArrayList<>();
        String backupHostList = connectionInfo.getProviderProperty(ExasolConstants.DRV_BACKUP_HOST_LIST);
import org.eclipse.core.runtime.Platform;

import org.jkiss.dbeaver.model.meta.Association;
		return userCache.getObject(monitor, this, name);
				+ "	PASSWORD_STATE_CHANGED,\n"
	// Associations
	protected void initializeContextState(@NotNull DBRProgressMonitor monitor,
							"	GRANTEE," + 
	
				}
    @Override
			this.exasolCurrentUserPrivileges = new ExasolCurrentUserPrivileges(monitor, session, this);
		return this.exasolCurrentUserPrivileges.getUserHasDictionaryAccess();
    
		return this.exasolCurrentUserPrivileges.getUserHasDictionaryAccess();
	{
	public DBSObjectCache<ExasolDataSource, ExasolPriorityGroup> getPriorityGroupCache()
    }
    {
    	

				errorMessage.contains("Statement handle not found") | 
        if (!url.toString().toUpperCase().contains("CLIENTVERSION"))
	public Collection<ExasolUser> getUsers(DBRProgressMonitor monitor)
			this.securityPolicyCache = new JDBCObjectSimpleCache<>(ExasolSecurityPolicy.class,
			//additional where clause to filter virtual schemas
				}
	public Collection<ExasolSchema> getChildren(@NotNull DBRProgressMonitor monitor) throws DBException
				+ "order by object_name";
	@Override
		{
		
		return this.systemGrantCache.getAllObjects(monitor, this);
	{
    	
				
	public Class<? extends ExasolSchema> getPrimaryChildType(@Nullable DBRProgressMonitor monitor) throws DBException
		return baseTableGrantCache.getAllObjects(monitor, this);
	{
	{
							" FROM" + 
		if (exasolCurrentUserPrivileges.getUserHasDictionaryAccess())
		if (exasolCurrentUserPrivileges.getAtLeastV6())
		return this.exasolCurrentUserPrivileges.hasPartitionColumns();
import java.util.Map.Entry;
import org.jkiss.dbeaver.model.access.DBAUserPasswordManager;
    @Override
			if (grant.getType() == ExasolTableObjectType.SCHEMA)
				
	{

 * limitations under the License.
	public Collection<ExasolSchemaGrant> getSchemaGrants(DBRProgressMonitor monitor) throws DBException
				public void cacheObject(@NotNull ExasolPriorityGroup object) {
	}
	
    @Override
				@Override
    public DBCQueryTransformer createQueryTransformer(@NotNull DBCQueryTransformType type) {
					ExasolRoleGrant.class,

        	Set<Entry<Object, Object>> entries = addMetaProps.entrySet();
    }
		Collection<ExasolTableGrant> grants = new ArrayList<>();

	private DBSObjectCache<ExasolDataSource, ExasolConnectionGrant> connectionGrantCache = null;

		return consumerGroupCache.getAllObjects(monitor, this);
	{
		} else if (
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
	{
	}
		}
    	return this.driverMajorVersion;
				public void removeObject(@NotNull ExasolPriorityGroup object, boolean resetFullCache) {
							return p;
			DBRProgressMonitor monitor) throws DBException
	{
			
		super.initialize(monitor);
		return grants;
	}

					"/*snapshot execution*/ SELECT SYSTEM_VALUE FROM sys.EXA_PARAMETERS WHERE PARAMETER_NAME = 'PASSWORD_SECURITY_POLICY'"
	}
			return getSchema(monitor, childName) != null ? getSchema(monitor,childName) : getVirtualSchema(monitor, childName);
	{
	
			LOG.warn("Error reading types info", e);
				public ExasolPriorityGroup getCachedObject(@NotNull String name) {
		Map<String, String> props = new HashMap<>(ExasolDataSourceProvider.getConnectionsProps());
			schemaSQL += " where not  schema_is_virtual ";
import java.util.*;
					groups.add(new ExasolPriorityGroup(owner, "LOW", "Default LOW Group", 900));
		} catch (SQLException e) {
		}

	public Collection<ExasolSystemGrant> getSystemGrants(DBRProgressMonitor monitor) throws DBException
		return roleCache.getAllObjects(monitor, this);
					"	LAST_REFRESH_BY," + 
			//only add tables
	}
 * you may not use this file except in compliance with the License.
	public ExasolRole getRole(DBRProgressMonitor monitor, String name)
	@Association
	}
import org.jkiss.dbeaver.ext.exasol.model.app.ExasolServerSessionManager;
	public Collection<ExasolVirtualSchema> getVirtualSchemas(DBRProgressMonitor monitor) 
            Object propClientName = properties.get(ExasolConstants.DRV_CLIENT_NAME);
import org.jkiss.dbeaver.ext.exasol.model.cache.ExasolDataTypeCache;
		return dataTypeCache.getObject(monitor, this, name);
        if (type == DBCQueryTransformType.RESULT_SET_LIMIT) {
        }
 * Unless required by applicable law or agreed to in writing, software
        }
					ExasolBaseObjectGrant.class,"/*snapshot execution*/ SELECT " + 
							"		SEPARATOR '|'" + 
                                                    DBPConnectionConfiguration connectionInfo) throws DBCException {
        return super.createQueryTransformer(type);
        if (!CommonUtils.isEmpty(backupHostList))

		@NotNull String purpose,
		if (exasolCurrentUserPrivileges.getUserHasDictionaryAccess())
        //check if we got an backup host list
		if (errorMessage.contains("Feature not supported")) {
import java.util.regex.Pattern;
    
		schemaCache = new JDBCObjectSimpleCache<>(
	
				+ "	PASSWORD_GRACE_DAYS,\n"
				grants.add(new ExasolSchemaGrant(grant));
		}
	{

	private DBSObjectCache<ExasolDataSource, ExasolConnection> connectionCache = null;
import org.jkiss.dbeaver.DBException;
				}
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;

	private DBSObjectCache<ExasolDataSource, ExasolConsumerGroup> consumerGroupCache = null;
		return userCache;
		return this.exasolCurrentUserPrivileges.getUserHasDictionaryAccess();
import org.jkiss.dbeaver.model.exec.DBCQueryTransformer;
					"		o.schema_name = s.SCHEMA_NAME" +
		this.schemaCache.clearCache();
    public String getTablePrefix(ExasolSysTablePrefix fallback) {
		}
    	return exasolCurrentUserPrivileges;
		return virtualSchemaCache.getObject(monitor, this, name);
	}
				);
		if (CommonUtils.getBoolean(connectionInfo.getProviderProperty(ExasolConstants.DRV_USE_LEGACY_ENCRYPTION), false)) {
	
		@NotNull DBRProgressMonitor monitor,
			((ExasolExecutionContext)context).refreshDefaults(monitor, true);
			this.roleCache.clearCache();
		try {
	public ExasolDataSource(DBRProgressMonitor monitor,
	{
				+ "	USER_NAME,\n"
		return connectionCache.getObject(monitor, this, name);
 */
	}
                positions.add(pos);
    	String errorMessage = error.getMessage();

            port = ":" + connectionInfo.getHostPort();
    @Association
		if (this.systemGrantCache != null) {
		return consumerGroupCache;
		return connectionCache.getAllObjects(monitor, this);
	}
	}
		schemaSQL += " union all select distinct SCHEMA_NAME as \"OBJECT_NAME\", 'SYS' as owner, cast(null as timestamp) as created, '' as \"OBJECT_COMMENT\", null as SCHEMA_OBJECT_ID from SYS.EXA_SYSCAT "
		if (exasolCurrentUserPrivileges.getAtLeastV6()) {
	}
	public boolean isAuthorizedForRolePrivs()
	
	{
        String message = error.getMessage();
	public Collection<ExasolTableGrant> getTableGrants(DBRProgressMonitor monitor) throws DBException
				@Override
	}
 * distributed under the License is distributed on an "AS IS" BASIS,
				List<ExasolPriorityGroup> groups;
		return priorityGroupCache.getObject(monitor, this, name);
package org.jkiss.dbeaver.ext.exasol.model;
 *     http://www.apache.org/licenses/LICENSE-2.0
				+ "FROM SYS."+ this.exasolCurrentUserPrivileges.getTablePrefix(ExasolSysTablePrefix.USER)  +"_USERS ORDER BY USER_NAME");
		
				errorMessage.contains("Connection lost") | 
		return connectionGrantCache.getAllObjects(monitor, this);
		@NotNull JDBCExecutionContext context,
			
	
        return url.toString();
            }		
	{
			if (grant.getType() == ExasolTableObjectType.SCRIPT)
			throws DBException
	
					);
	{
	private DBSObjectCache<ExasolDataSource, ExasolRoleGrant> roleGrantCache = null;
            }
			//only add tables
    @NotNull
	public boolean isAuthorizedForConnectionPrivs()
			LOG.warn("Error reading active schema", e);

	
				.getUserHasDictionaryAccess();
		
		return info;
						throws DBException {
					"SESSION_TEMP_DB_RAM_LIMIT,\n" + 
					"	LAST_REFRESH," + 
		for (ExasolBaseObjectGrant grant: this.getBaseTableGrants(monitor))
	{
	public Collection<ExasolViewGrant> getViewGrants(DBRProgressMonitor monitor) throws DBException
		
	public Collection<ExasolBaseObjectGrant> getBaseTableGrants(DBRProgressMonitor monitor) throws DBException
    {
		String priorityColRole = " ROLE_PRIORITY AS USER_PRIORITY,\n";
		} catch (DBException e) {
				+ "	CREATED,\n"
		}
			return null;
		} else if (adapter == DBAServerSessionManager.class) {



        StringBuilder url = new StringBuilder(128);
				
	}
		
	{
    
		return grants;
    @Nullable
import org.jkiss.dbeaver.model.exec.plan.DBCQueryPlanner;
	@Association
	@NotNull
						if (p.getName().equals(name))
					"CONSUMER_GROUP_COMMENT\n" + 
			this.priorityGroupCache = new DBSObjectCache<ExasolDataSource, ExasolPriorityGroup>() {
				}
					for(ExasolPriorityGroup p: groups)
    public ErrorType discoverErrorType(@NotNull Throwable error) {
	}
	{
			String name) throws DBException
					"CONSUMER_GROUP_ID,\n" + 
	{
		this.connectionCache = new JDBCObjectSimpleCache<>(
	

import org.jkiss.dbeaver.Log;
		if (exasolCurrentUserPrivileges.hasConsumerGroups()) {
			priorityColUser = " USER_CONSUMER_GROUP as USER_PRIORITY,\n";
	private DBSObjectCache<ExasolDataSource, ExasolBaseObjectGrant> baseTableGrantCache = null;
			throws DBException
					);
		return this.exasolCurrentUserPrivileges.hasPriorityGroups();
	public ExasolUser getUser(DBRProgressMonitor monitor, String name)
	{



		// TODO DF: No idea what to do with this method, what it is used for...
							"		DISTINCT PRIVILEGE" + 
            for (Entry<Object, Object> entry : entries) {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCRemoteInstance;
	{
		}
				}
	public DBSObjectCache<ExasolDataSource, ExasolSecurityPolicy> getSecurityPolicyCache()
		} else if (adapter == DBAUserPasswordManager.class) {
	public Collection<ExasolSecurityPolicy> getSecurityPolicies(DBRProgressMonitor monitor) throws DBException
	// -----------------------
    @Association
			this.priorityGroupCache.getAllObjects(monitor, this);
		@NotNull DBPConnectionConfiguration connectionInfo
        	
                return positions.toArray(new ErrorPosition[0]);
		final ExasolDataSourceInfo info = new ExasolDataSourceInfo(metaData);
	
	// --------------
							"	SYS.EXA_DBA_OBJ_PRIVS P" + 
		try {
					return getCachedObject(name);
	{

				
			((ExasolExecutionContext)context).setCurrentSchema(monitor, ((ExasolExecutionContext)initFrom).getDefaultSchema());
	}
    {
				}
		return this.exasolCurrentUserPrivileges.getUserHasDictionaryAccess();
    int getDriverMajorVersion()
            if (!positions.isEmpty()) {
        String port = ":8563";
	protected Map<String, String> getInternalConnectionProperties(
	}
		info.setSupportsResultSetScroll(false);
import org.jkiss.dbeaver.ext.exasol.ExasolDataSourceProvider;
	}
	{
        }
		} else {
	
	{
	{
	}
	// -----------------------
    @Association
					"		sys.EXA_SCHEMAS o" + 
	// --------------
		} else if (errorMessage.contains("insufficient privileges")) {
	

					);
					.setCache(Collections.emptyList());
		}
	@Override
            String clientName = Platform.getProduct().getName();
			return null;

					"/*snapshot execution*/ SELECT GRANTEE,PRIVILEGE,ADMIN_OPTION FROM SYS.EXA_DBA_SYS_PRIVS ORDER BY GRANTEE,PRIVILEGE");
            Matcher matcher = ERROR_POSITION_PATTERN.matcher(message);
	public Collection<? extends DBSDataType> getLocalDataTypes()
				public ExasolPriorityGroup getObject(@NotNull DBRProgressMonitor monitor, @NotNull ExasolDataSource owner, @NotNull String name) {
    public ErrorPosition[] getErrorPosition(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext context, @NotNull String query, @NotNull Throwable error) {
				@Override
		try {
					+ "INNER JOIN  EXA_DBA_ROLE_PRIVS p ON p.GRANTED_ROLE = r.ROLE_NAME ORDER BY P.GRANTEE,R.ROLE_NAME"
    }
		return securityPolicyCache;
		for (ExasolBaseObjectGrant grant: this.getBaseTableGrants(monitor))
					"/*snapshot execution*/ " +
            if (! addMetaProps.isEmpty())
			this.dataTypeCache.getAllObjects(monitor, this);
			throws DBException
		return schemaCache;
	// -----------------------
	{
	private DBSObjectCache<ExasolDataSource, ExasolSecurityPolicy> securityPolicyCache = null;
	}
					groups = new ArrayList<>();
    	return props;
    	}
		this.roleCache = new JDBCObjectSimpleCache<>(ExasolRole.class, "SELECT ROLE_NAME,CREATED,"+ priorityColRole + " ROLE_COMMENT FROM SYS." + this.exasolCurrentUserPrivileges.getTablePrefix(ExasolSysTablePrefix.SESSION)  +"_ROLES ORDER BY ROLE_NAME");
		return schemaCache.getObject(monitor, this, name);
	}
		super(monitor, container, new ExasolSQLDialect());
import java.util.regex.Matcher;
		return priorityGroupCache.getAllObjects(monitor, this);
	public ExasolDataType getDataTypeId(long id)
	public boolean ishasPriorityGroups()
		}
		return super.getAdapter(adapter);
		return this.exasolCurrentUserPrivileges.hasPasswordPolicy();
	public Collection<ExasolConsumerGroup> getConsumerGroups(DBRProgressMonitor monitor) throws DBException
        }
	public void initialize(@NotNull DBRProgressMonitor monitor)
    		return ErrorType.CONNECTION_LOST;
            }

		if (exasolCurrentUserPrivileges.hasPasswordPolicy())
		
		return roleCache.getObject(monitor, this, name);
				+ (this.exasolCurrentUserPrivileges.getUserHasDictionaryAccess() ? "	DISTINGUISHED_NAME,\n" : "")
	}
	public Collection<ExasolPriorityGroup> getPriorityGroups(DBRProgressMonitor monitor) throws DBException
	// -----------------------
	// Authorities
				public List<ExasolPriorityGroup> getCachedObjects() {
				+ "	FAILED_LOGIN_ATTEMPTS,\n"
					ExasolVirtualSchema.class,
	
	public Collection<ExasolSchema> getSchemas(@NotNull DBRProgressMonitor monitor)
		
                @Override
	@NotNull
		{
	public boolean isUserAuthorizedForSessions()
		if (exasolCurrentUserPrivileges.hasConsumerGroups())  {
		}
			return getDataType(new VoidProgressMonitor(), typeName);
	private DBSObjectCache<ExasolDataSource, ExasolUser> userCache = null;
			throws DBException
    @Association
							"	) as PRIVS " + 
		return this;
	public boolean ishasPasswordPolicy()
	}


        DBRProgressMonitor monitor, @NotNull JDBCDatabaseMetaData metaData)

	}
                pos.position = Integer.parseInt(matcher.group(3)) - 1;
		return this.exasolCurrentUserPrivileges.hasConsumerGroups();
		{
	@Association
			LOG.error("DBException occured when reading system dataTypes: ", e);
        Map<String, String> properties = connectionInfo.getProperties();
				"/*snapshot execution*/ SELECT\n"
				@Override
		} catch (DBException e) {
            }
	public boolean isAuthorizedForRoles()
import org.jkiss.dbeaver.ext.exasol.model.plan.ExasolQueryPlanner;
				public boolean isFullyCached() {
	{
	private ExasolCurrentUserPrivileges exasolCurrentUserPrivileges;
				}
	}
	public Collection<ExasolRole> getRoles(DBRProgressMonitor monitor)
                clientName = propClientName.toString();
					"CAST(NULL AS TIMESTAMP) AS created, " +
					
			this.connectionGrantCache.clearCache();
		
				@Override
	@Override
		if (adapter == DBSStructureAssistant.class) {
					"PRECEDENCE,\n" + 
            url.append(";clientname=").append(clientName);
				public Collection<ExasolPriorityGroup> getAllObjects(@NotNull DBRProgressMonitor monitor, ExasolDataSource owner)
            Object propClientName = properties.get(ExasolConstants.DRV_CLIENT_VERSION);
		return props;
				grants.add(new ExasolTableGrant(grant));
	@Override
        {
					"USER_TEMP_DB_RAM_LIMIT,\n" + 
    public String getConnectionURL(DBPConnectionConfiguration connectionInfo) {
	public DBSObjectCache<ExasolDataSource, ExasolUser> getUserCache()
	{
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
        	String clientVersion=Platform.getProduct().getDefiningBundle().getVersion().toString();
import org.jkiss.code.NotNull;
	
import org.jkiss.dbeaver.ext.exasol.ExasolSQLDialect;
public class ExasolDataSource extends JDBCDataSource implements IAdaptable {
	{
					groups.add(new ExasolPriorityGroup(owner, "HIGH", "Default High Group", 900));
		return ExasolSchema.class;
        return null;
            while (matcher.find()) {
				}
					"sys.EXA_CONSUMER_GROUPS ecg\n"
					groups.add(new ExasolPriorityGroup(owner, "MEDIUM", "Default Medium Group", 900));
	{

	}
	// Connection related Info
	
	}
    }
		}
	
	
	private ExasolDataTypeCache dataTypeCache = new ExasolDataTypeCache();
	{
	public DBSDataType getLocalDataType(String typeName)
        if (! addMetaProps.isEmpty()) {

					return true;
	// Initialization/Structure
		return grants;
	public Collection<ExasolConnection> getConnections(
        return connectionCache;
							"		OBJECT_NAME" + 
	}
		String schemaSQL = "/*snapshot execution*/ select schema_name as object_name,schema_owner as OWNER,CAST(NULL AS TIMESTAMP) AS created, schema_comment as OBJECT_COMMENT, SCHEMA_OBJECT_ID from SYS.EXA_SCHEMAS s  ";
	// -----------------------
	
	// -----------------------
		@NotNull DBPDriver driver,
				+ (this.exasolCurrentUserPrivileges.getUserHasDictionaryAccess() ? "	PASSWORD,\n" : "")
	{
    }
	}
 *
	
				+ "	PASSWORD_EXPIRY_DAYS,\n"
							"	OBJECT_NAME ORDER BY GRANTEE,OBJECT_SCHEMA,OBJECT_TYPE,OBJECT_NAME");

		if (exasolCurrentUserPrivileges.getUserHasDictionaryAccess())
	private DBSObjectCache<ExasolDataSource, ExasolVirtualSchema> virtualSchemaCache;
	}
	}
	private DBSObjectCache<ExasolDataSource, ExasolRole> roleCache = null;
	}
			throws DBException
				+ "	USER_COMMENT\n"
    @Override
				
	// Standards Getters
		//caches for security
		return securityPolicyCache.getCachedObject(name);
	{
	public ExasolPriorityGroup getPriorityGroup(DBRProgressMonitor monitor, String name) throws DBException
					"		EXA_VIRTUAL_SCHEMAS s" + 
	public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor)
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        if (!CommonUtils.isEmpty(connectionInfo.getHostPort())) {
	// --------------------------
		} else {

							"	OBJECT_SCHEMA," + 
							" GROUP BY" + 
		
	private Properties addMetaProps = new Properties();

			//only add tables
							"	OBJECT_NAME," + 
	
			
				ExasolPriorityGroup.class, "/*snapshot execution*/ SELECT * FROM SYS.EXA_PRIORITY_GROUPS ORDER BY PRIORITY_GROUP_NAME"
							"	OBJECT_TYPE," + 
		return virtualSchemaCache.getAllObjects(monitor, this);

	}
				@NotNull
	// -----------------------
	}
			
				errorMessage.contains("Connection was killed") | 
	{
	{
	
					"	ON" + 
        }
	public Collection<ExasolGrantee> getAllGrantees(DBRProgressMonitor monitor) throws DBException
				)
								 @NotNull String childName) throws DBException
	// -------------------------
			this.systemGrantCache = new JDBCObjectSimpleCache<>(
	
    	// exasol has no sqlstates 
    	if (addMetaProps == null)
	


                pos.line = Integer.parseInt(matcher.group(2)) - 1;
			throws DBException
        
                DBPErrorAssistant.ErrorPosition pos = new DBPErrorAssistant.ErrorPosition();
					{
	) throws DBCException {
	}
        if (!url.toString().toUpperCase().contains("CLIENTNAME")) {
		}
		return dataTypeCache;
	public DBSObjectCache<ExasolDataSource, ExasolConsumerGroup> getConsumerGroupCache()
	@Override
			throws DBException
			priorityColRole = " ROLE_CONSUMER_GROUP AS USER_PRIORITY,\n";
 * Licensed under the Apache License, Version 2.0 (the "License");
	{
				ExasolSchema.class, schemaSQL);

	
	
	}
	@Association
				
	   	return grantees;
import org.jkiss.dbeaver.model.struct.DBSStructureAssistant;
		if (exasolCurrentUserPrivileges.hasPriorityGroups()) {
			this.priorityGroupCache = new JDBCObjectSimpleCache<>(
		return this.exasolCurrentUserPrivileges.getUserHasDictionaryAccess();
    @Override
            error = error.getCause();
	{
		Collection<ExasolViewGrant> grants = new ArrayList<>();
		try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load data source meta info")) {

			//build virtual schema cache for >V6 databases
		return dataTypeCache.getAllObjects(monitor, this);

import org.jkiss.dbeaver.model.impl.sql.QueryTransformerLimit;
	{
        }

        if (querytimeout != null)
	public ExasolConnection getConnection(DBRProgressMonitor monitor,
		}
		{
			return adapter.cast(new ExasolServerSessionManager(this));
		}
    
			virtualSchemaCache = new JDBCObjectSimpleCache<>(
		if (initFrom != null) {
	public <T> T getAdapter(@NotNull Class<T> adapter)
	}
		return consumerGroupCache.getObject(monitor, this, name);
		return securityPolicyCache.getAllObjects(monitor, this);
			return adapter.cast(new ExasolQueryPlanner(this));
	}
	@Association
	private DBSObjectCache<ExasolDataSource, ExasolSchema> schemaCache;
	}
	@Override
	{
	
				public void clearCache() {
				+ priorityColUser

			return adapter.cast(new ExasolChangeUserPasswordManager(this));
	{
	
    
import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;

        url.append("jdbc:exa:").append(connectionInfo.getHostName()).append(port);
 *
		
		return this.roleGrantCache.getAllObjects(monitor, this);
		{
			};
    }
	public Collection<ExasolDataType> getDataTypes(DBRProgressMonitor monitor)
		
	
		
		if (this.baseTableGrantCache != null) {
    	return super.discoverErrorType(error);
	{

	private int driverMajorVersion = 5;
	// Constructors

	{
            if (propClientName != null)
	}
            url.append(";clientversion=").append(clientVersion);
		return new ExasolExecutionContext(instance, type);
	public Collection<ExasolConnectionGrant> getConnectionGrants(DBRProgressMonitor monitor) throws DBException
    }
	{
    		addMetaProps = new Properties();

				
			return ErrorType.PERMISSION_DENIED;
                pos.info = matcher.group(1);
		}
	}
		{
	}
					"FROM\n" + 
		return grants;
	protected DBPDataSourceInfo createDataSourceInfo(
		return this.exasolCurrentUserPrivileges.getAtLeastV6();
    	
	
	}
		this.userCache.clearCache();

					" ORDER BY S.SCHEMA_NAME"
	}
			throws DBException
			this.connectionGrantCache =  new JDBCObjectSimpleCache<>(
			this.baseTableGrantCache = new JDBCObjectSimpleCache<>(
		Collection<ExasolSchemaGrant> grants = new ArrayList<>();
			this.systemGrantCache.clearCache();
				grants.add(new ExasolScriptGrant(grant));
    
		return this.exasolCurrentUserPrivileges.getUserHasDictionaryAccess();
    	{
			//only add tables
	
	
	}
            if (error.getCause() == null) {
	{
				
	// -------------------------
			LOG.error("DBException occured when reading system dataType: "
import org.jkiss.dbeaver.ext.exasol.ExasolSysTablePrefix;
	private DBSObjectCache<ExasolDataSource, ExasolPriorityGroup> priorityGroupCache = null;
	{
            	clientName = clientName + "-Meta";
        } else if (type == DBCQueryTransformType.FETCH_ALL_TABLE) {
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectSimpleCache;
import org.jkiss.dbeaver.model.DBPDataSourceInfo;
	}
			throws DBException
	
            
import org.jkiss.dbeaver.model.struct.DBSDataType;
