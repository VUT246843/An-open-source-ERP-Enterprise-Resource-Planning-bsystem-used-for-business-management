	}
		return String.format("Wait - %d (%s) Hold - %d (%s)", wait_pid,wait_user,hold_pid,hold_user);

	public void setHoldBy(DBAServerLock lock) {
		return wait_user;
     public PostgreLock(ResultSet dbResult) {
     private String wait_statement;
    	 this.wait_user = JDBCUtils.safeGetString(dbResult, "blocked_user");
    	 this.statement_in  = JDBCUtils.safeGetString(dbResult, "statement_in");
		return hold;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.ArrayList;
		return hold_pid;
	}
    @Property(viewable = true, order = 4)
 * distributed under the License is distributed on an "AS IS" BASIS,
	}
 *
 *
	public String getWait_statement() {
	@Override
 * DBeaver - Universal Database Manager

 * Licensed under the Apache License, Version 2.0 (the "License");
	public Integer getId() {


	@Override
import org.jkiss.dbeaver.model.meta.Property;
    @Property(viewable = true, order = 6)
	public Integer getHoldID() {
    	 this.hold_pid  = JDBCUtils.safeGetInt(dbResult, "blocking_pid");
import org.jkiss.dbeaver.model.admin.locks.DBAServerLock;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
	public int getWait_pid() {

/*

	@Override
	}
     
    	 this.wait_pid = JDBCUtils.safeGetInt(dbResult, "blocked_pid");
		return hold_user;
	public DBAServerLock getHold() {
    @Property(viewable = true, order = 1)
    
 * See the License for the specific language governing permissions and
		return hold;

}
     private int    wait_pid;
	}
	public String getTitle() {		

import java.sql.ResultSet;
		this.hold = lock;
	public List<DBAServerLock> waitThis() {
	}
	}

		return String.valueOf(wait_pid);
 * Unless required by applicable law or agreed to in writing, software
		return this.waiters;
	}
		return wait_pid;
		return statement_in;
public class PostgreLock implements DBAServerLock {
	}
 * Copyright (C) 2017 Andrew Khitrin (ahitrin@gmail.com) 
	@Override

	public String getStatement_in() {
	public String getHold_user() {

	}
import java.util.List;
		
    	 this.wait_statement = JDBCUtils.safeGetString(dbResult, "blocked_statement");

    	 
     private String hold_user;
    	 this.hold_user = JDBCUtils.safeGetString(dbResult, "blocking_user");

 *
	}
		return hold_pid;
	}

 */
	@Override
     private int    hold_pid;
     private List<DBAServerLock> waiters = new ArrayList<>(0);
     private String statement_in;

	@SuppressWarnings("unchecked")

	}

		return wait_pid;
    @Property(viewable = true, order = 2)
		return wait_statement;
     private DBAServerLock hold = null;
	}
     private String wait_user;
	@Override
 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at

	public DBAServerLock getHoldBy() {
    
     
    @Property(viewable = true, order = 5)
	public String toString() {
 * limitations under the License.
 * you may not use this file except in compliance with the License.


	public int getHold_pid() {
package org.jkiss.dbeaver.ext.postgresql.model.lock;
    @Property(viewable = true, order = 3)
     }
	@Override
	public String getWait_user() {
