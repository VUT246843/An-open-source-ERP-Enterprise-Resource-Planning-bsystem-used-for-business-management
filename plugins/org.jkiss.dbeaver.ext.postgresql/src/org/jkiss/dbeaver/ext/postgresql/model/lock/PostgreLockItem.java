   	    
    private String locktype;
    private String relation;
    public String getTid() {
    @Property(viewable = true, order = 4)
		return relation;
    
	}    
	public boolean isGranted() {
    private String datname;
 * limitations under the License.
    @Property(viewable = true, order = 3)
import java.sql.ResultSet;
	}
 * You may obtain a copy of the License at
    
    }
 * See the License for the specific language governing permissions and
	}
	}
     this.datname = JDBCUtils.safeGetString(dbResult, "datname");
     sb.append(strRes == null ? "-" : strRes);
 * DBeaver - Universal Database Manager
	 
	public String getLocktype() {
		return tid;

 *
	public String getMode() {

    private String detail;
     this.locktype = JDBCUtils.safeGetString(dbResult, "locktype");
	}
    
    @Property(viewable = true, order = 1)
	}
	public String getRelation() {
		return granted;
    private boolean granted;
    
}
    public PostgreLockItem(ResultSet dbResult) {
		return datname;
 *     http://www.apache.org/licenses/LICENSE-2.0
		return detail;
    	
package org.jkiss.dbeaver.ext.postgresql.model.lock;
 *
    @Property(viewable = true, order = 6)
/*
		return pid;
 * you may not use this file except in compliance with the License.
    private String mode;
    
	}
 * Copyright (C) 2017 Andrew Khitrin (ahitrin@gmail.com) 
public class PostgreLockItem implements DBAServerLockItem{
    
	public int getPid() {
 */
    
    private String tid;
import org.jkiss.dbeaver.model.meta.Property;
    @Property(viewable = true, order = 7)
     this.granted = JDBCUtils.safeGetBoolean(dbResult, "granted");
	public String getDatname() {
		return locktype;		
    

    
    
     strRes = JDBCUtils.safeGetString(dbResult, "tuple");
     StringBuilder sb = new StringBuilder(strRes == null ? "-" : strRes);
     this.pid = JDBCUtils.safeGetInt(dbResult, "pid");
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    @Property(viewable = true, order = 2)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private int pid;
     this.relation = JDBCUtils.safeGetString(dbResult, "relation");
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
     sb.append("/");
     this.detail = sb.toString();          

 * Licensed under the Apache License, Version 2.0 (the "License");
	}
 *
    @Property(viewable = true, order = 5)
     this.tid = JDBCUtils.safeGetString(dbResult, "tid");
		return mode;
	
import org.jkiss.dbeaver.model.admin.locks.DBAServerLockItem;
     this.mode = JDBCUtils.safeGetString(dbResult, "mode");
     String strRes = JDBCUtils.safeGetString(dbResult, "page");
    public String getDetail() {
