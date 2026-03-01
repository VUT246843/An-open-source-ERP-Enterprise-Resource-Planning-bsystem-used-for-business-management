    public Boolean hasConsumerGroups()
    public Boolean getUserHasDictionaryAccess() {
        Boolean hasPriv;
    {
    	if (userHasDictionaryAccess) {
import org.jkiss.dbeaver.ext.exasol.ExasolSysTablePrefix;

 * You may obtain a copy of the License at
    		return fallback.toString();
    	}
    {
    }

	private static final String C_QUERY_DICTIONARY = "/*snapshot execution*/ SELECT CONNECTION_NAME FROM sys.EXA_DBA_CONNECTIONS WHERE false";
 *     http://www.apache.org/licenses/LICENSE-2.0
    public Boolean hasPasswordPolicy()
        	LOG.error("Error extracting Exasol version: fallback to version 5");
        return version;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                                       JDBCSession session, ExasolDataSource exasolDataSource) {
    }
                try (ResultSet rs = dbStat.executeQuery()) {
    
    }
    private static final String C_MINOR_VERSION = "/*snapshot execution*/ select TO_NUMBER(\"VALUE\") AS VERSION from \"$ODBCJDBC\".DB_METADATA WHERE name LIKE 'databaseMinorVersion'";
    	return (getAtLeastV6() && getMinorVersion() >= 1) || getMajorVersion() >= 7;

    	return majorVersion;
    private final Boolean userHasDictionaryAccess; 
    
    }
    }
    		return ExasolSysTablePrefix.DBA.toString();
import org.jkiss.dbeaver.Log;
    }
        minorVersion = queryVersion(C_MINOR_VERSION, session);
        

        try (JDBCPreparedStatement dbStat = session.prepareStatement(sql)) {

    private static Boolean verifyPriv(String sql, JDBCSession session) {
    
 * Copyright (C) 2016-2016 Karl Griesser (fullref@gmail.com)

    public Boolean getAtLeastV5() {


    private final Integer majorVersion;
 *
    }
public class ExasolCurrentUserPrivileges {
    
    }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    

/*
        try {
 * distributed under the License is distributed on an "AS IS" BASIS,
    	
    public String getTablePrefix(ExasolSysTablePrefix fallback) {
    public ExasolCurrentUserPrivileges(DBRProgressMonitor monitor,
        majorVersion = queryVersion(C_MAJOR_VERSION, session);
    
 *
        return majorVersion >= 8;
    }
        return majorVersion >= 6;
    {
 * Unless required by applicable law or agreed to in writing, software

    	else {
    	Integer version;
        return hasPriv;
            try (JDBCPreparedStatement dbStat = session.prepareStatement(sql)) {
import java.sql.ResultSet;
    	}
        }
    }
    }
    public Boolean hasPartitionColumns()
package org.jkiss.dbeaver.ext.exasol.model;
 * DBeaver - Universal Database Manager
                return version;
        } catch(SQLException e) {
    public int getExasolVersion() {
            hasPriv = false;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Licensed under the Apache License, Version 2.0 (the "License");

    public Integer getMajorVersion() {
    
    	return userHasDictionaryAccess;
}
 * limitations under the License.
    
    {
    }
    }
        	version = 5;
            }
    }
    }
        return majorVersion >= 5;
        return majorVersion;
    	return getAtLeastV6() && getMinorVersion() >= 1  && getMajorVersion() < 7;
            hasPriv = true;
    private final Integer minorVersion;
    private static final String C_MAJOR_VERSION = "/*snapshot execution*/ select TO_NUMBER(\"VALUE\") AS VERSION from \"$ODBCJDBC\".DB_METADATA WHERE name LIKE 'databaseMajorVersion'";
    private static Integer queryVersion(String sql, JDBCSession session) {
import java.sql.SQLException;

            }
    public Boolean hasPriorityGroups()
    
                version = JDBCUtils.safeGetInt(rs, "VERSION");




    	return getMajorVersion() >= 7;
        } catch (Exception e) {
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
    	return minorVersion;
 * you may not use this file except in compliance with the License.
            try (ResultSet rs = dbStat.executeQuery()) {
    public Boolean getAtLeastV8() {
    	

    	userHasDictionaryAccess = ExasolCurrentUserPrivileges.verifyPriv(C_QUERY_DICTIONARY, session);
    public Integer getMinorVersion() {
    	return hasPasswordPolicy();
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    public Boolean getAtLeastV6() {
        }
 */
    private static final Log LOG = Log.getLog(ExasolCurrentUserPrivileges.class);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

                }
                rs.next();
