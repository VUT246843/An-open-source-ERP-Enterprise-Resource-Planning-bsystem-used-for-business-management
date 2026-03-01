	public String getLockType()
	{

     this.blocking = JDBCUtils.safeGetString(dbResult, "blocking_others");
	@Property(viewable = true, order = 5)

import org.jkiss.dbeaver.model.admin.locks.DBAServerLockItem;

	private Integer lastConvert;
		return lockType;
	public String getModeRequest()

	@Property(viewable = true, order = 1)
import org.jkiss.dbeaver.model.meta.Property;
	{
     this.lockType = JDBCUtils.safeGetString(dbResult, "lock_type");
	public String getBlocking()
import java.sql.ResultSet;

 * See the License for the specific language governing permissions and
	{
     StringBuilder sb = new StringBuilder(String.valueOf(JDBCUtils.safeGetLong(dbResult, "lock_id1")));
 *
     this.modeRequest = JDBCUtils.safeGetString(dbResult, "mode_requested");

	public String getModeHeld()

	 sb.append("/");
	
	
	private String blocking;
	@Property(viewable = true, order = 3)
		return lastConvert;
	}
 *     http://www.apache.org/licenses/LICENSE-2.0
	}
	}
public class OracleLockItem implements DBAServerLockItem{
	 sb.append(String.valueOf(JDBCUtils.safeGetLong(dbResult, "lock_id2")));
	private String lockType;
 * DBeaver - Universal Database Manager

    }

	{
	}
	private String ids;
	public Integer getLastConvert()

     this.lastConvert = JDBCUtils.safeGetInt(dbResult, "last_convert");
	
		return modeRequest;
	{
 *
	@Property(viewable = true, order = 2)
		return blocking;
	@Property(viewable = true, order = 4)
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

		return modeHeld;
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	}
 * Unless required by applicable law or agreed to in writing, software
	{
 * distributed under the License is distributed on an "AS IS" BASIS,
	private String modeHeld;
 * Copyright (C) 2017 Andrew Khitrin (ahitrin@gmail.com) 
 *
		return ids;
package org.jkiss.dbeaver.ext.oracle.model.lock;
 * Licensed under the Apache License, Version 2.0 (the "License");
	 this.ids = sb.toString();
	}
	@Property(viewable = true, order = 6)

	private String modeRequest;
 * You may obtain a copy of the License at
	public String getIds()
     this.modeHeld = JDBCUtils.safeGetString(dbResult, "mode_held");
 * limitations under the License.
	public OracleLockItem(ResultSet dbResult) {
 * you may not use this file except in compliance with the License.
 */
/*
