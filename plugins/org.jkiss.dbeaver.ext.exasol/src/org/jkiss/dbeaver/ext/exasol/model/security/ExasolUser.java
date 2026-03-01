			if (CommonUtils.isEmpty(kerberosPrincipal) & CommonUtils.isEmpty(dn))
			this.failedLoginAttempts = JDBCUtils.safeGetBigDecimal(resultSet, "FAILED_LOGIN_ATTEMPTS");
	private BigDecimal passwordExpiryGrace;
		return type;
			this.userName = "user";
	
				this.type = ExasolUserType.LDAP;

	private Timestamp passwordExpiry; 

	}
	}
	
 * distributed under the License is distributed on an "AS IS" BASIS,
		return "User " + getName();
	}
			this.created = JDBCUtils.safeGetTimestamp(resultSet, "CREATED");
		this.dn = null;
	@Property(viewable = true, order = 50)
	public void setPasswordState(String passwordState) {
	public void setKerberosPrincipal(String kerberosPrincipal) {
		this.password = newPassword;
			this.passwordExpiryGrace = JDBCUtils.safeGetBigDecimal(resultSet, "PASSWORD_GRACE_DAYS");
	@Property(viewable = true, editable=true, updatable=true, order = 30)
		return this.userName;
	public void setPassword(String newPassword)
		return locked;
	private BigDecimal failedLoginAttempts;
	public String getPasswordState() {
			{
		this.dn = dn;
	@Override
		this.dn = null;
	@Property(viewable = true, updatable=true, editable=true, order = 35)
	@Property(viewable = true, editable=true, updatable=true, order = 20)
}
		return passwordExpiry;

	public void setDN(String dn)
					
	private String dn;
	{
			this.password = JDBCUtils.safeGetString(resultSet, "PASSWORD");
import java.sql.Timestamp;
	@Property(viewable = true, order = 60)
		return failedLoginAttempts;
			this.description = "";
	{
	@Override
	public String getUserName() {
	
			this.type = ExasolUserType.LOCAL;
	private Timestamp created;
			this.passwordState = JDBCUtils.safeGetString(resultSet, "PASSWORD_STATE");
			this.passwordStateChanged = JDBCUtils.safeGetString(resultSet, "PASSWORD_STATE_CHANGED");
 *
	}
	}
		this.kerberosPrincipal = null;
	private String passwordExpiryPolicy;
		}
	

	public void setPasswordExpiryPolicy(String passwordExpiryPolicy) {
			
			this.dn = "";
	}

		return passwordExpiryDays;
/*

	{
		return passwordStateChanged;
		this.kerberosPrincipal = kerberosPrincipal;
			} else {
	}
	public Timestamp getCreated()
	}
		this.password = password;
				this.locked = true;
 * Licensed under the Apache License, Version 2.0 (the "License");
	{
	
	public Timestamp getPasswordExpiry() {
		implements DBAUser,  DBPSaveableObject, DBPNamedObject2, DBPRefreshableObject {
 * Copyright (C) 2010-2025 DBeaver Corp and others
	}
			} else {
		return passwordExpiryPolicy;
	private String passwordStateChanged;
	@Property(viewable = true, order = 1)
	}
	{
		this.type =  type;
			this.description = JDBCUtils.safeGetString(resultSet,
		this.type = ExasolUserType.LDAP;
	@Property(viewable = true, updatable=true, editable=true, length = PropertyLength.MULTILINE, order = 150)
 *     http://www.apache.org/licenses/LICENSE-2.0
		if (resultSet != null) {
	public String getPasswordStateChanged() {

	public void setDescription(String description)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	public String getDn()
		this.description = description;
	
	@Override
			
 * Unless required by applicable law or agreed to in writing, software
	{
	@Property(viewable = true, order = 50)
		this.type = ExasolUserType.LOCAL;
import org.jkiss.dbeaver.ext.exasol.model.ExasolDataSource;
		return this.password;
package org.jkiss.dbeaver.ext.exasol.model.security;
	@Property(viewable = true, order = 70)
			this.userName = JDBCUtils.safeGetString(resultSet, "USER_NAME");
 *
	private String description;
	@Property(viewable = true, order = 100)
		super(dataSource, resultSet);
	public String getKerberosPrincipal() {

 * You may obtain a copy of the License at
	private BigDecimal passwordExpiryDays;
			this.created = null;
	@Property(viewable = true, order = 110)
	public ExasolUserType getType()
		} else {
		this.dn = dn;
import org.jkiss.dbeaver.model.DBPNamedObject2;
	public Boolean getLocked() {
	private String userName;
	private String kerberosPrincipal;
		return passwordState;
 * DBeaver - Universal Database Manager
 *
	public void setName(@NotNull String newName)
			if (this.passwordState != null && this.passwordState.equals("EXPIRED"))
	@Property(viewable = true, order = 90)
	private String password;
public class ExasolUser extends ExasolGrantee
	public String getPassword()

	{
	{
import org.jkiss.dbeaver.model.DBPRefreshableObject;
	}
	}
	}

			this.password = "";
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
	
import org.jkiss.code.NotNull;
		super(datasource, false);
	public String getDescription()
	{
	private String passwordState;
	}
		return this.created;
				this.type = ExasolUserType.LOCAL;

			this.dn = JDBCUtils.safeGetString(resultSet, "DISTINGUISHED_NAME");

	}
			}


	public void setLocked(Boolean locked) {
	{
 * See the License for the specific language governing permissions and
	public String toString()
		this.userName = newName;
		this.kerberosPrincipal = null;
		return this.description;
import org.jkiss.dbeaver.model.meta.Property;
			this.passwordExpiryPolicy = JDBCUtils.safeGetString(resultSet, "PASSWORD_EXPIRY_POLICY");
import org.jkiss.dbeaver.ext.exasol.ExasolUserType;
		this.password = null;
		this.description = description;
					"USER_COMMENT");
		this.passwordState = passwordState;

	}
			this.kerberosPrincipal = "";

	{
	}
	
	}
	public ExasolUser(ExasolDataSource datasource, String name, String description, String dn, String password, String kerberosPrincipal, ExasolUserType type)
		return kerberosPrincipal;
import java.sql.ResultSet;
		this.kerberosPrincipal = kerberosPrincipal;
		this.userName = name;
	public BigDecimal getPasswordExpiryGrace() {
			
	}

	
			} else if (CommonUtils.isEmpty(kerberosPrincipal))

	}

	@Property(viewable = true, order = 80)

	public ExasolUser(ExasolDataSource dataSource, ResultSet resultSet)
import org.jkiss.utils.CommonUtils;
		return this.dn;
 * you may not use this file except in compliance with the License.
		this.passwordExpiryPolicy = passwordExpiryPolicy;
			this.kerberosPrincipal = JDBCUtils.safeGetString(resultSet, "KERBEROS_PRINCIPAL");
	public String getName()
			this.passwordExpiry = JDBCUtils.safeGetTimestamp(resultSet, "PASSWORD_EXPIRY");
 */
	}
	{
	@Override
	{
 * limitations under the License.
	private Boolean locked;
			}

			{
	public BigDecimal getPasswordExpiryDays() {
		
import java.math.BigDecimal;
import org.jkiss.dbeaver.model.DBPSaveableObject;

	}
	public String getPasswordExpiryPolicy() {

	@NotNull
	}
		this.password = null;
		return userName;
	private ExasolUserType type;
	}

			this.passwordExpiryDays = JDBCUtils.safeGetBigDecimal(resultSet, "PASSWORD_EXPIRY_DAYS");
	
	}
		this.type = ExasolUserType.KERBEROS;
import org.jkiss.dbeaver.model.meta.PropertyLength;
import org.jkiss.dbeaver.model.access.DBAUser;
				this.type = ExasolUserType.KERBEROS;


				this.locked = false;
	}
	public BigDecimal getFailedLoginAttempts() {
	@Property(viewable = true, updatable=true, editable=true, order = 120)
	}
		this.locked = locked;
		return passwordExpiryGrace;
			{
