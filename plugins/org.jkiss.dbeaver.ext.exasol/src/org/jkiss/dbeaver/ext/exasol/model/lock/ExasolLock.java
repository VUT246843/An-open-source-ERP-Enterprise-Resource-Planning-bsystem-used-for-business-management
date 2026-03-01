import org.jkiss.dbeaver.model.meta.Property;
	public long getHold_sid()
	 private String waitOsUser;
	{
 	@Property(viewable = true, order = 3)
		return status;
	}
	{
 *

 * Unless required by applicable law or agreed to in writing, software
	
 		return String.valueOf(waitSessionId);
 	{
 	@Property(viewable = true, order = 7)
 	}

import java.util.ArrayList;

	{
 * See the License for the specific language governing permissions and
 	public String getTitle() {		

/*
   	 this.waitUserName = JDBCUtils.safeGetString(dbResult, "W_USER_NAME");
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	{
    public ExasolLock(ResultSet dbResult) {
 	@Override

	 private long    holdSessionId;
 	{


}
 	@Property(viewable = true, order = 9)
   	 this.holdClient = JDBCUtils.safeGetString(dbResult, "H_CLIENT");
 		return BigInteger.valueOf(waitSessionId);
 		return BigInteger.valueOf(holdSessionId);
import java.sql.Timestamp;
	 private String oname;
 */
	 private String waitCommandName;
 		return this.waiters;

import java.sql.ResultSet;
 	@Property(viewable = true, order = 4)
	}
 	}

 	}

 	
 	@Property(viewable = true, order = 10)
 	}
 	
 	@Property(viewable = true, order = 1)
   	 this.waitSessionId = JDBCUtils.safeGetLong(dbResult, "W_SESSION_ID");
   	 this.holdSessionId  = JDBCUtils.safeGetLong(dbResult, "H_SESSION_ID");
 	public String getWait_command()
 	@Override


 		return waitCommandName;
	public BigInteger getWait_sid()
	{
 * distributed under the License is distributed on an "AS IS" BASIS,
	 private String status;
import org.jkiss.dbeaver.model.admin.locks.DBAServerLock;
 	}
 	}
 * Copyright (C) 2016-2016 Karl Griesser (fullref@gmail.com)
 	}
		return waitLoginTime;
 * limitations under the License.
 		return hold;
    private List<DBAServerLock> waiters = new ArrayList<>(0);
		return holdSessionId;
	public String getStatus()
	 private String holdClient;
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.math.BigInteger;
 * DBeaver - Universal Database Manager
	}
	public String getWait_user()
 	@Override
 	public String toString() {
		return oname;
 		return waitClient;
 		this.hold = lock;
   	 this.status = JDBCUtils.safeGetString(dbResult, "H_STATUS");

 * Licensed under the Apache License, Version 2.0 (the "License");
 	@Property(viewable = true, order = 5)
	}
    
	 private Timestamp waitLoginTime;
 	@Property(viewable = true, order = 12)
 	{
	{
public class ExasolLock implements DBAServerLock {
 	public String getWait_client()
 	@Override
		return waitOsUser;
	public String getOname()
	
		return BigInteger.valueOf(waitSessionId);

   	 this.waitOsUser = JDBCUtils.safeGetString(dbResult, "W_OS_USER");
 	public String getHold_client()
 	public BigInteger getId() {
 		return hold;

 	}
 	public void setHoldBy(DBAServerLock lock) {
 	public DBAServerLock getHoldBy() {
 		return this.holdClient;
 	}
package org.jkiss.dbeaver.ext.exasol.model.lock;
 	}
	 private long    waitSessionId;

	public Timestamp getLtime()
   	 this.holdUserName = JDBCUtils.safeGetString(dbResult, "H_USER_NAME");
 		return String.format("Wait %s - %d (%s) Hold - %d (%s)",oname, waitSessionId,waitUserName,holdSessionId,holdUserName);
 	@Property(viewable = true, order = 6)
	{
   	 
 	@Override
 * you may not use this file except in compliance with the License.
 	}
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    
	 private String waitClient;
 *

	public String getHold_user()

	 private String waitUserName;
	public String getWait_osuser()
	}
   	 this.waitClient = JDBCUtils.safeGetString(dbResult, "W_CLIENT");
import java.util.List;
 	@Override

	}
 * You may obtain a copy of the License at
	}
   	 this.waitCommandName = JDBCUtils.safeGetString(dbResult, "W_COMMAND_NAME");
 	public List<DBAServerLock> waitThis() {

   	 this.waitLoginTime = JDBCUtils.safeGetTimestamp(dbResult, "W_LOGIN_TIME");

	 private String holdUserName;

 	@Property(viewable = true, order = 2)
   	 this.oname = JDBCUtils.safeGetString(dbResult, "ONAME");
 	public DBAServerLock getHold() {
 	@Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
    private DBAServerLock hold = null;
		return holdUserName;
		return waitUserName;
    }
 	@Property(viewable = true, order = 11)

	}

 	public BigInteger getHoldID() {

	{
