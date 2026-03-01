        sb.append(" WHERE 'Y' IN (D_USER,D_GROUP,D_PUBLIC,ROLE_USER,ROLE_GROUP,ROLE_PUBLIC,D_ROLE)");
    private static final String SYSCTRL = "SYSCTRL";
        // Must have one of SYSMON, SYSMAINT, SYSADM or SYSCTRL
        if ((listAuthorities.contains(SYSMON)) || (listAuthorities.contains(SYSMAINT)) || (listAuthorities.contains(SYSADM))

 *
        return false;
        }
    private static final String AUTH_APP = "T:SYSIBMADM.APPLICATIONS";
        // Must have one of DATAACCESS, DBADM, SQLADM or or SELECT on SYSIBMADM.APPLICATIONS or CONTROL on SYSIBMADM.APPLICATIONS
 *
 * you may not use this file except in compliance with the License.


    private Boolean computeUserIsAuthorisedForContainers()

    // -------
        try (JDBCPreparedStatement dbStat = session.prepareStatement(SEL_OBJECTS)) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    {
        sb.append("  FROM TABLE (SYSPROC.AUTH_LIST_AUTHORITIES_FOR_AUTHID (?, 'U')) AS T ");
    }
    private static final String SEL_OBJECTS;
    }


        }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Holds and cache current user privileges and authorities
    private final Boolean userIsAuthorisedForAdminister;
/*


        }
    {

        }
                }
    }
            }
        return false;
        // DF: There is no easy way to get this information from DB2 v9.1
    {
        // Cache Authorities
        sb.append(" WHERE ((GRANTEETYPE = 'G' AND GRANTEE = 'PUBLIC') OR (GRANTEETYPE = 'U' AND GRANTEE = ?)) ");
    // ------------------------
    private static final String AUTH_CONTAINER = "R:SYSPROC.SNAP_GET_CONTAINER";
            // Plus one of DATAACCESS or EXECUTE on SYSPROC.SNAP_GET_CONTAINER
    // ------------------------
        return userIsAuthorisedForAdminister;
        }
 * Unless required by applicable law or agreed to in writing, software
    public Boolean userIsAuthorisedForContainers()
import java.sql.SQLException;
            || (listAuthorities.contains(SYSCTRL))) {
        DB2DataSource db2DataSource) throws SQLException

        userIsAuthorisedForApplications = computeUserIsAuthorisedForApplications();
            try (JDBCPreparedStatement dbStat = session.prepareStatement(SEL_AUTHORITIES)) {
 * limitations under the License.
    private static final String SYSMON = "SYSMON";
    private static final String SYSADM = "SYSADM";
        if (listObjectPrivileges.contains(AUTH_DBCFG)) {
        sb.append(" WITH UR");
        sb.append("        (TABSCHEMA = 'SYSIBMADM' AND TABNAME = 'APPLICATIONS' AND 'Y' IN (CONTROLAUTH,SELECTAUTH))");
        return userIsAuthorisedForApplications;
    private final Boolean userIsAuthorisedForContainers;
        if ((listAuthorities.contains(DATAACCESS)) || (listAuthorities.contains(DBADM)) || (listAuthorities.contains(SQLADM))) {
        if ((listAuthorities.contains(SYSMON)) || (listAuthorities.contains(SYSMAINT)) || (listAuthorities.contains(SYSADM))
    private final Boolean userIsAuthorisedForApplications;
    public DB2CurrentUserPrivileges(DBRProgressMonitor monitor, JDBCSession session, String currentAuthId,
    private static final Log LOG = Log.getLog(DB2CurrentUserPrivileges.class);
 * Copyright (C) 2010-2024 DBeaver Corp and others
    // ------------------------
        sb.append("   AND (SCHEMA = 'SYSPROC' AND SPECIFICNAME = 'SNAP_GET_CONTAINER' AND EXECUTEAUTH IN ('Y','G'))");
import java.util.ArrayList;
        }

 * See the License for the specific language governing permissions and
    // Standard Getters
 */
        sb.append("SELECT AUTHORITY");

    private static final String DBADM = "DBADM";
        sb.append(" WHERE ((GRANTEETYPE = 'G' AND GRANTEE = 'PUBLIC') OR (GRANTEETYPE = 'U' AND GRANTEE = ?))");
    }

        LOG.debug("Current User is not authorized to see Tablespaces Containers");
    private static final String AUTH_DBCFG = "T:SYSIBMADM.DBCFG";
            if (listObjectPrivileges.contains(AUTH_CONTAINER)) {
                return true;
    }


            }
        sb.append("  FROM SYSCAT.ROUTINEAUTH");
            if (listObjectPrivileges.contains(AUTH_APP)) {

        return false;
            }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            // Plus one of DATAACCESS or DBADM or SQLADM or SELECT on SYSIBMADM.APPLICATIONS or CONTROL on SYSIBMADM.APPLICATIONS
        sb.append("       )");
    private Boolean computeUserIsAuthorisedForApplications()
    private static final String SEL_AUTHORITIES;


    }
    // Constructors

 *
    public Boolean userIsAuthorisedForAdminister()
    private final Boolean userIsAuthorisedForDBCFG;
        // Must have one of SYSMON, SYSMAINT, SYSADM or SYSCTRL
        SEL_AUTHORITIES = sb.toString();
        sb.append("     OR (TABSCHEMA = 'SYSIBMADM' AND TABNAME = 'DBCFG' AND 'Y' IN (CONTROLAUTH,SELECTAUTH))");
    // ------------------------
        sb.append("SELECT DISTINCT 'T:' || TRIM(TABSCHEMA) || '.' ||TABNAME");
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
            dbStat.setString(1, currentAuthId);
        LOG.debug("Current User is not authorized to see DB/DBM Configuration Parameters");
    static {
    }
    private static final String SQLADM = "SQLADM";
                    listObjectPrivileges.add(dbResult.getString(1));
        StringBuilder sb = new StringBuilder(512);
                }
    private final List<String> listObjectPrivileges;
                return true;
    {
package org.jkiss.dbeaver.ext.db2.model;
        sb.append("SELECT 'R:' || TRIM(SCHEMA) || '.' || SPECIFICNAME");
    {
/**
            }
    private static final String DATAACCESS = "DATAACCESS";
        return userIsAuthorisedForContainers;

    private final List<String> listAuthorities;
                return true;
                while (dbResult.next()) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            if ((listAuthorities.contains(DATAACCESS)) || (listAuthorities.contains(DBADM)) || (listAuthorities.contains(SQLADM))) {
        return userIsAuthorisedForDBCFG;

    {
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.List;
import org.jkiss.dbeaver.Log;
    // Helpers
            if (listAuthorities.contains(DATAACCESS)) {
        listObjectPrivileges = new ArrayList<>();

    private Boolean computeUserIsAuthorisedForDBCFG()
    public Boolean userIsAuthorisedForDBCFG()



            return true;
            }
        SEL_OBJECTS = sb.toString();
 * @author Denis Forveille
        // WE consider the user has no system authorities
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        userIsAuthorisedForAdminister = userIsAuthorisedForApplications || userIsAuthorisedForDBCFG;
 * You may obtain a copy of the License at
        LOG.debug("Current User is not authorized to see Applications");
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 *     http://www.apache.org/licenses/LICENSE-2.0
    {
}
            dbStat.setString(2, currentAuthId);
        sb.append("  FROM SYSCAT.TABAUTH");

        userIsAuthorisedForDBCFG = computeUserIsAuthorisedForDBCFG();
    }

        sb.append(" WITH UR");
            || (listAuthorities.contains(SYSCTRL))) {
                return true;

 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
                    }

        listAuthorities = new ArrayList<>();
    // -------
                        listAuthorities.add(dbResult.getString(1));
    {
        if (db2DataSource.isAtLeastV9_5()) {
        sb.append("   AND (");

        userIsAuthorisedForContainers = computeUserIsAuthorisedForContainers();

 * 
    }
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {
    private static final String SYSMAINT = "SYSMAINT";

 */
                dbStat.setString(1, currentAuthId);
        StringBuilder sb = new StringBuilder(256);
    }
            }
 * DBeaver - Universal Database Manager
    static {
        sb.append(" UNION ALL ");

            return true;
                    while (dbResult.next()) {
public class DB2CurrentUserPrivileges {
    public Boolean userIsAuthorisedForApplications()
