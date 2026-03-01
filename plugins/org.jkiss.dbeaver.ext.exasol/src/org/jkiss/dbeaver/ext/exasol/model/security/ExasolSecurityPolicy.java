			this.minLength = null;
	}
	}
		return minSpecialChars;
		this.enabled = true;
	public ExasolDataSource getDataSource() {
		return dataSource;
	public Integer getReusableAfterChanges() {
				this.maxFailedLoginAttempts = values.get(key);
	}
			case "REUSABLE_AFTER_DAYS":
	

		for (String key : values.keySet()) {
 * See the License for the specific language governing permissions and
	@NotNull
	private ExasolDataSource dataSource;
		{
		}
	{
		{
				this.minNumericChars = values.get(key);

	}
	}
	public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
		String value = JDBCUtils.safeGetString(dbResult, "SYSTEM_VALUE");
			}
	private Integer reusableAfterDays;
public class ExasolSecurityPolicy implements DBPRefreshableObject, DBPSaveableObject {
	public void setEnabled(Boolean enabled) {
		}
import java.sql.ResultSet;
		}
	}
 *     http://www.apache.org/licenses/LICENSE-2.0
	public Integer getMinUpperCase() {

	public Integer getMinSpecialChars() {
import org.jkiss.dbeaver.model.DBPSaveableObject;
		{
			
		
	public void setReusableAfterDays(Integer reusableAfterDays) {
	}
		
	private String name = ExasolMessages.exasol_security_policy_name;
	public void setMinSpecialChars(Integer specialChars) {
			String[] data = parm.split("=");
	@Override
    @Property(viewable = true,  order = 20, length = PropertyLength.MULTILINE)
	}
	public Boolean getEnabled() {
		{
import org.jkiss.utils.CommonUtils;
			case "MIN_SPECIAL_CHARS":
				break;
 *
	}
		{
		if (value.isEmpty() | value.equals("OFF"))
    @Property(viewable = true, editable = true, updatable = true, order = 70)
/*
		if (minSpecialChars != null)
    @Property(viewable = true, order = 10)
 * DBeaver - Universal Database Manager
	private void assignValues(HashMap<String,Integer> values)
			assignValues(ExasolSecurityPolicy.parseInput(value));
	public void setMinLowerCase(Integer minLowerCase) {
			switch (key) {
		this.minLowerCase = minLowerCase;
		{
			String parm = parms[i];
    @Property(viewable = true, editable = true, updatable = true, order = 75)
	}
 *
	private Integer reusableAfterChanges;
    @Property(viewable = true, editable = true, updatable = true, order = 50)
		}
			this.minSpecialChars = null;
	public Integer getMinLength() {
				this.minLength = values.get(key);
		}
 * distributed under the License is distributed on an "AS IS" BASIS,
	public static HashMap<String,Integer> parseInput(String input)
	public void setMaxLength(Integer maxLength) {
		if (maxFailedLoginAttempts != null)
import java.util.ArrayList;
	
			default:
		return CommonUtils.joinStrings(":", str);
    @Property(viewable = true, editable = true, updatable = true, order = 100)
	{
	private Integer maxFailedLoginAttempts;

 */
	}
		if (maxLength != null)

		this.reusableAfterChanges = reusableAfterChanges;
	public Integer getMinNumericChars() {
		if (minLength != null)

		return enabled;
	public void setReusableAfterChanges(Integer reusableAfterChanges) {
		}
		this.enabled = true;
		return maxFailedLoginAttempts;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
				break;
				break;
		if (values.isEmpty())
			str.add("MAX_LENGTH="+maxLength.toString());

		return minLength;
		return reusableAfterDays;
		
 * limitations under the License.

		if (minLowerCase != null)
		{
		return reusableAfterChanges;
		this.enabled = true;
		this.maxFailedLoginAttempts = maxFailedLoginAttempts;
		return this;
		this.reusableAfterDays = reusableAfterDays;
		if (! enabled) {
		this.maxLength = maxLength;
	}

				break;
	}
		this.persisted = true;
		}
			return "OFF";
	@Override
	public Integer getMaxFailedLoginAttempts() {
		return minUpperCase;
	private String description = ExasolMessages.exasol_security_policy_description; 

	@Override

		if (reusableAfterDays != null)
		return dataSource.getContainer();
	public void setPersisted(boolean persisted) {
	
    @Property(viewable = true, editable = true, updatable = true, order = 40)
			str.add("MIN_SPECIAL_CHARS="+minSpecialChars.toString());
	
	public Integer getMinLowerCase() {
		{
			this.minNumericChars = null;
 * Unless required by applicable law or agreed to in writing, software
	private Integer minUpperCase;
	public DBSObject getParentObject() {
package org.jkiss.dbeaver.ext.exasol.model.security;
 * Copyright (C) 2010-2025 DBeaver Corp and others
	
		}
import org.jkiss.dbeaver.model.meta.PropertyLength;

    @Property(viewable = true, editable = true, updatable = true, order = 60)
	public void setMinLength(Integer minLength) {
		this.minSpecialChars = specialChars;
			str.add("MIN_LOWER_CASE="+minLowerCase.toString());

	private Boolean enabled;
		this.enabled = true;
		this.persisted = persisted;
	@Override

		String[] parms = input.split(":");
	private Integer minLength;
				break;
    @Override
				this.minSpecialChars = values.get(key);
		}
		}
	public void setMaxFailedLoginAttempts(Integer maxFailedLoginAttempts) {
		
		if (maxFailedLoginAttempts != null)
			case "MIN_UPPER_CASE":
			case "MIN_NUMERIC_CHARS":
		return name;
	}
 * Licensed under the Apache License, Version 2.0 (the "License");
	private Boolean persisted;
import org.jkiss.code.NotNull;
		HashMap<String,Integer> ret = new HashMap<String,Integer>();
			enabled=false;
	@Override

			return new HashMap<String,Integer>();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	}
	}
import org.jkiss.dbeaver.ext.exasol.model.ExasolDataSource;
	public void setMinNumericChars(Integer minNumericChars) {
		
			ret.put(data[0], Integer.parseInt(data[1]));
		this.minUpperCase = minUpperCase;
			str.add("MAX_FAILED_LOGIN_ATTEMPTS="+maxFailedLoginAttempts.toString());
	}
		{
	public ExasolSecurityPolicy(ExasolDataSource dataSource, ResultSet dbResult)
	{
		{
	}
		return minLowerCase;
			str.add("MIN_LENGTH="+minLength.toString());
	}
			this.reusableAfterChanges = null;
		if (input.equals("OFF"))
}

import org.jkiss.dbeaver.model.struct.DBSObject;
			case "MIN_LENGTH":
		{
	}

	}
			str.add("REUSABLE_AFTER_CHANGES="+reusableAfterChanges.toString());
	public void setMinUpperCase(Integer minUpperCase) {
	public String getSecurityString()

			this.enabled = false;
		if (minNumericChars != null)

		}
import org.jkiss.dbeaver.model.DBPRefreshableObject;

    @Property(viewable = true, editable = true, updatable = true, order = 90)

	
				this.minUpperCase = values.get(key);

 *
 * you may not use this file except in compliance with the License.
		}
	}

		this.dataSource = dataSource;
				this.reusableAfterChanges = values.get(key);
	private Integer minLowerCase;
	public Integer getReusableAfterDays() {
		this.minNumericChars = minNumericChars;
			this.maxLength = null;
		}
			this.reusableAfterDays = null;

				break;
		this.enabled = true;
	}
			case "REUSABLE_AFTER_CHANGES":
			this.minLowerCase = null;
	public String getDescription() {
			case "MIN_LOWER_CASE":
				this.minLowerCase = values.get(key);
		return maxLength;

    @Property(viewable = true, editable = true, updatable = true, order = 30)
	}
		}
		{
    @Property(viewable = true, editable = true, updatable = true, order = 80)
		} else {

import org.jkiss.dbeaver.model.meta.Property;
				break;
				this.maxLength = values.get(key);
			case "MAX_LENGTH":

	public String getName() {
			case "MAX_FAILED_LOGIN_ATTEMPTS":
		return persisted;
	public boolean isPersisted() {
	}

			str.add("MIN_NUMERIC_CHARS="+minNumericChars.toString());
	@Override
		
				this.reusableAfterDays = values.get(key);
    @Property(viewable = true, editable = true, updatable = true, order = 110)
	}

	{
import java.util.HashMap;
	}
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
				break;
	
		this.enabled = true;
		for (int i = 0; i < parms.length; i++) {

		}
	}
		this.enabled = true;
		return description;
			this.maxFailedLoginAttempts = null;
	private Integer minSpecialChars;
			this.minUpperCase = null;
		return minNumericChars;
			str.add("REUSABLE_AFTER_DAYS="+reusableAfterDays.toString());
		}
	}
	private Integer maxLength;

		if (! enabled)
		{
		this.enabled = true;
import org.jkiss.dbeaver.ext.exasol.ExasolMessages;
import org.jkiss.dbeaver.DBException;
		this.enabled = enabled;
		ArrayList<String> str = new ArrayList<>();
	public Integer getMaxLength() {
	}
			str.add("MIN_UPPER_CASE="+minUpperCase.toString());
		return ret;
				break;
	private Integer minNumericChars;
	
 * You may obtain a copy of the License at
		if (reusableAfterChanges != null)
				break;
	}
		this.minLength = minLength;
