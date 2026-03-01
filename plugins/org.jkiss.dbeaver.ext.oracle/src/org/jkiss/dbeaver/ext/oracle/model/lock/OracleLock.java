	}
 */
     private Date ltime;

 	@Override
 	}
	
 	@Property(viewable = true, order = 7)
	public int getHold_pid()
	}
    	 this.oname = JDBCUtils.safeGetString(dbResult, "oname");

import java.util.ArrayList;

    	 this.wait_sid = JDBCUtils.safeGetInt(dbResult, "waiting_session");
	{
    	 this.ltime = JDBCUtils.safeGetDate(dbResult, "logon_time");
	}
public class OracleLock implements DBAServerLock {
    	 this.hold_user = JDBCUtils.safeGetString(dbResult, "holding_user");
		return hold_sid;
import java.sql.Date;
import org.jkiss.code.Nullable;
    	 this.wait_user = JDBCUtils.safeGetString(dbResult, "waiting_user");

/*
 	}
		return oname;
 	}
 	public int getSerial()
	 private int    hold_sid;
	}
	public String getStatus()
	{
import java.util.List;
		}
 * See the License for the specific language governing permissions and
 	public Integer getId() {
	{
		return serial;
	{
     

 	}
	}
	public String getEvent()

 	public Integer getHoldID() {
    	 this.owner = JDBCUtils.safeGetString(dbResult, "owner");
	 private int    wait_sid;
import org.jkiss.dbeaver.model.meta.IPropertyValueValidator;

 	@Property(viewable = true, order = 3)


	public String getOwner()
 		return hold_sid;
 	@Override
	public String getHold_user()
	 private OracleDataSource dataSource;
 	@Property(viewable = true, order = 8, visibleIf = OracleLockColumnsValueValidator.class)
 		return this.waiters;
 * distributed under the License is distributed on an "AS IS" BASIS,
		@Override
 * you may not use this file except in compliance with the License.
 	@Override
	public OracleDataSource getDataSource() {


	}
	{
 	}
 	@Property(viewable = true, order = 1)
 		return wait_sid;
 		
 	
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
	{
		return dataSource;
     private String status;

    	 this.dataSource = dataSource;
 	@Property(viewable = true, order = 10, visibleIf = OracleLockColumnsValueValidator.class)
	public Date getLtime()
 	}

 		return String.valueOf(wait_sid);
	}
    	 	oname = "name";

		return owner;
	}
 	@Override
 	@Override
 	@Override
 	@Property(viewable = true, order = 9)
 	public List<DBAServerLock> waitThis() {
	 private long row_lock;

import org.jkiss.dbeaver.ext.oracle.model.OracleDataSource;
 	public DBAServerLock getHoldBy() {
 	public String getTitle() {		
     private String event;
    	 this.hold_pid = JDBCUtils.safeGetInt(dbResult, "hold_pid");
	}
package org.jkiss.dbeaver.ext.oracle.model.lock;
 * Licensed under the Apache License, Version 2.0 (the "License");
	public long getRow_lock()
     private DBAServerLock hold = null;
 	@SuppressWarnings("unchecked")
	 private int    serial;
     private List<DBAServerLock> waiters = new ArrayList<>(0);
import java.sql.ResultSet;
		return hold_pid;
 	@Property(viewable = true, order = 4, visibleIf = OracleLockColumnsValueValidator.class)
    	 this.event = JDBCUtils.safeGetString(dbResult, "event");
 * DBeaver - Universal Database Manager
     private int    hold_pid;

    	 this.row_lock = JDBCUtils.safeGetLong(dbResult, "row_lock");
    	 if (oname == null) {
	}
	{


	public int getWait_pid()
		return row_lock;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 	@Override

		return wait_pid;
	public String getWait_user()
	{
	}
 * Unless required by applicable law or agreed to in writing, software


     

     private String hold_user;
	 private String wait_user;
	{

 *
		return wait_user;

		return status;
 	@Property(viewable = true, order = 12, visibleIf = OracleLockColumnsValueValidator.class)

     public OracleLock(ResultSet dbResult, OracleDataSource dataSource) {
	public String getOname()
 * limitations under the License.
	{
	}
	public int getHold_sid()

 	}
	 private String oname;
 *     http://www.apache.org/licenses/LICENSE-2.0
 		this.hold = lock;

    	 this.hold_sid  = JDBCUtils.safeGetInt(dbResult, "holding_session");
}
	{
 	@Property(viewable = true, order = 11, visibleIf = OracleLockColumnsValueValidator.class)
 		return hold;
import org.jkiss.dbeaver.model.admin.locks.DBAServerLock;

 	public String toString() {
import org.jkiss.code.NotNull;

		return hold_user;
    	 this.wait_pid = JDBCUtils.safeGetInt(dbResult, "wait_pid");
    	 this.serial = JDBCUtils.safeGetInt(dbResult, "serial");
	}
     }
 * Copyright (C) 2010-2025 DBeaver Corp and others
 	@Property(viewable = true, order = 6, visibleIf = OracleLockColumnsValueValidator.class)
     
	public int getWait_sid()
	}
 * You may obtain a copy of the License at
 	public DBAServerLock getHold() {
	 private String owner;
 	@Property(viewable = true, order = 2, visibleIf = OracleLockColumnsValueValidator.class)
			return lock.getDataSource().isAtLeastV10();
 *
	 private int    wait_pid;
	{
 	public void setHoldBy(DBAServerLock lock) {

 	@Property(viewable = true, order = 5, visibleIf = OracleLockColumnsValueValidator.class)
	public static class OracleLockColumnsValueValidator implements IPropertyValueValidator<OracleLock, Object> {
import org.jkiss.dbeaver.model.meta.Property;
 	}
	}
		return ltime;
    	 this.status = JDBCUtils.safeGetString(dbResult, "blocking_session_status");
		return event;
 		return String.format("Wait %s - %d (%s) Hold - %d (%s)",oname, wait_sid,wait_user,hold_sid,hold_user);
	{
		return wait_sid;
		 }
		public boolean isValidValue(@NotNull OracleLock lock, @Nullable Object value) throws IllegalArgumentException {
 		return hold;
