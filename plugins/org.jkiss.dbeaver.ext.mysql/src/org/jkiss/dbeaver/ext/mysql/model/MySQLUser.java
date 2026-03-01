    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
 * See the License for the specific language governing permissions and
        return maxUserConnections;
                                continue;
    public String getFullName() {
                            if (privName.equalsIgnoreCase(MySQLPrivilege.ALL_PRIVILEGES)) {
                                log.warn("Can't parse GRANT string: " + grantString);

    }
/**
    public void setMaxUpdates(int maxUpdates) {
    public String getHost() {
    public boolean isPersisted()
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException
            return this.grants;
            throw new DBDatabaseException(e, getDataSource());
 */

 * Licensed under the Apache License, Version 2.0 (the "License");
        throws DBException
            try (JDBCPreparedStatement dbStat = session.prepareStatement("SHOW GRANTS FOR " + getFullName())) {


import org.jkiss.dbeaver.DBDatabaseException;
    }
    public void setMaxUserConnections(int maxUserConnections) {
 * MySQLUser
                        boolean allPrivilegesFlag = false;
    private static final Log log = Log.getLog(MySQLUser.class);
                    }
    }
 *

package org.jkiss.dbeaver.ext.mysql.model;
    @Override
        return persisted;
            this.maxQuestions = JDBCUtils.safeGetInt(resultSet, "max_questions");
        this.maxUpdates = maxUpdates;
    public String getUserName() {
            this.userName = JDBCUtils.safeGetString(resultSet, "user");
        return "'" + userName + "'@'" + host + "'";
        this.grants = null;

    public String getSslType() {
    }
    }
 *
        if (!isPersisted()) {
    }
                                grantOption));
    private final MySQLDataSource dataSource;


            this.host = JDBCUtils.safeGetString(resultSet, "host");
                            table = matcher.group(3);
        return sslCipher;
                        if (grantString.endsWith(" WITH GRANT OPTION")) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
                        }
    @Override

    }
        this.x509Issuer = x509Issuer;
                                log.warn("Can't find privilege '" + privName + "'");
                        grants.add(
    {
                            if (matcher.find()) {
                        } else {
    }
    public void setHost(String host) {
    }
        if (this.grants != null) {
        return maxUpdates;
            this.grants = new ArrayList<>();
 *
    void setSslType(String sslType) {

    }
    void setX509Subject(byte[] x509Subject) {
 * You may obtain a copy of the License at
import java.util.regex.Matcher;

    @Override
                    while (dbResult.next()) {
        return maxQuestions;
    public int getMaxUserConnections() {
import org.jkiss.utils.CommonUtils;
    public void setMaxConnections(int maxConnections) {
                                catalog,
        return DBUtils.getQuotedIdentifier(dataSource, userName, false, true) + "@"
    private byte[] sslCipher;
    public int getMaxUpdates() {
    public String getPasswordHash() {
    }
            + DBUtils.getQuotedIdentifier(dataSource, host, false, true);
        return sslType;

                            }
    public MySQLUser(MySQLDataSource dataSource, ResultSet resultSet) {
}
import org.jkiss.dbeaver.model.*;
                            catalog = matcher.group(2);
    @NotNull
    @Override
                                continue;


    private List<MySQLGrant> grants;
    @Property(viewable = true, order = 1)


    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {
                                privileges.add(priv);
                            grantOption = true;//privileges.add(getDataSource().getPrivilege(monitor, MySQLPrivilege.GRANT_PRIVILEGE));
import java.util.List;
    public byte[] getX509Issuer() {
 * you may not use this file except in compliance with the License.
        this.dataSource = dataSource;

                            }

{
    private int maxUpdates;
    public byte[] getX509Subject() {
        this.sslType = sslType;
    {
    @Override
    @Nullable
                }
import org.jkiss.dbeaver.model.meta.Property;
        return this;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        }
    private String sslType;
            this.x509Subject = JDBCUtils.safeGetBytes(resultSet, "x509_subject");
    private String userName;

    public String getDescription() {
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    public int getMaxConnections() {
                            matcher = MySQLGrant.GLOBAL_GRANT_PATTERN.matcher(grantString);
            this.maxConnections = JDBCUtils.safeGetInt(resultSet, "max_connections");
                    return this.grants;
    @NotNull
import org.jkiss.dbeaver.model.struct.DBSObject;
                        String table = null;
    public MySQLDataSource getDataSource() {
    private int maxUserConnections;


import java.util.StringTokenizer;
        if (resultSet != null) {
        this.maxQuestions = maxQuestions;
            this.maxUpdates = JDBCUtils.safeGetInt(resultSet, "max_updates");

import org.jkiss.dbeaver.model.access.DBAUser;
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    private int maxQuestions;
    }

    }
    @Property(viewable = true, order = 24)
                        String catalog = null;
        } catch (SQLException e) {
    public DBSObject getParentObject() {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Read catalog privileges")) {
    {
            this.userName = "";
public class MySQLUser implements DBAUser, DBARole, DBPRefreshableObject, DBPSaveableObject, DBPQualifiedObject
        return dataSource;
        return userName;
        return x509Issuer;

                        List<MySQLPrivilege> privileges = new ArrayList<>();
    private String host;
    @NotNull
            this.host = "%";

    }


        }
        return userName + "@" + host;
        this.persisted = persisted;
    }
        grants = null;
        this.x509Subject = x509Subject;
    @Property(viewable = true, order = 2)
import java.sql.SQLException;
    public void setPersisted(boolean persisted)
                        }
                    List<MySQLGrant> grants = new ArrayList<>();
    }
import java.sql.ResultSet;
            this.maxUserConnections = JDBCUtils.safeGetInt(resultSet, "max_user_connections");
    public String getName() {
            this.sslType = JDBCUtils.safeGetString(resultSet, "ssl_type");

    }

    @Property(viewable = true, order = 21)
                                privString = matcher.group(1);
                        if (matcher.find()) {
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.Log;
 * limitations under the License.
    public byte[] getSslCipher() {
    }
                                this,
                        }
                                privileges,
        this.maxUserConnections = maxUserConnections;
    public List<MySQLGrant> getGrants(DBRProgressMonitor monitor)
                            } else {
    }
    @Override
                            if (priv == null) {
 * DBeaver - Universal Database Manager
                        String grantString = CommonUtils.notEmpty(JDBCUtils.safeGetString(dbResult, 1)).trim().toUpperCase(Locale.ENGLISH);
                            MySQLPrivilege priv = getDataSource().getPrivilege(monitor, privName);

            }
    {
    void setX509Issuer(byte[] x509Issuer) {
    }
    }
                        boolean grantOption = false;
        this.host = host;
    private byte[] x509Subject;
                            new MySQLGrant(
            this.persisted = false;
    }
            return this.grants;
    public void setUserName(String userName)
    @Property(viewable = true, order = 20)

    @Property(viewable = true, order = 22)
/*
                            }
 *     http://www.apache.org/licenses/LICENSE-2.0
                                allPrivilegesFlag,
import java.util.Locale;

                            privString = matcher.group(1);
    public void setMaxQuestions(int maxQuestions) {
        this.maxConnections = maxConnections;
        return maxConnections;
    private boolean persisted;
    public void clearGrantsCache()
    }
    }
        return x509Subject;
import org.jkiss.code.Nullable;

    @Override


    private byte[] x509Issuer;
                            } else {
    @Property(viewable = true, order = 23)

    public int getMaxQuestions() {
    }
 */
            this.x509Issuer = JDBCUtils.safeGetBytes(resultSet, "x509_issuer");

import org.jkiss.dbeaver.model.access.DBARole;
    {

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        return passwordHash;
                        while (st.hasMoreTokens()) {
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        return host;
    }
            this.persisted = true;
        DBUtils.fireObjectUpdate(this);
    private int maxConnections;

                        Matcher matcher = MySQLGrant.TABLE_GRANT_PATTERN.matcher(grantString);
        this.userName = userName;
                        String privString;
        } else {
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
        return null;
 * Unless required by applicable law or agreed to in writing, software
            this.sslCipher = JDBCUtils.safeGetBytes(resultSet, "ssl_cipher");
    @Property(viewable = true, order = 25)
    }

import java.util.ArrayList;

    }

                        StringTokenizer st = new StringTokenizer(privString, ",");

    }
    }
    private String passwordHash;
                    this.grants = grants;
            this.passwordHash = JDBCUtils.safeGetString(resultSet, "password");
        return dataSource.getContainer();


    void setSslCipher(byte[] sslCipher) {
                            String privName = st.nextToken().trim();
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.sslCipher = sslCipher;
                                allPrivilegesFlag = true;
        }
        }
    }
                                table,
