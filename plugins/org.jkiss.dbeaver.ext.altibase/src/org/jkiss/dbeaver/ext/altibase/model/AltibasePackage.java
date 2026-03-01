}
    
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.DBUtils;
    @Override
                if (dbResult != null && dbResult.next()) {
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
    }
        return super.getCatalog();
        }
                        .getPackageDDL(monitor, this, AltibaseConstants.PACKAGE_TYPE_SPEC)
            refreshState(session);

import org.jkiss.code.Nullable;

        this.valid = this.valid && valid;
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
            } else {
import org.jkiss.dbeaver.model.struct.DBSObjectState;
 * Unless required by applicable law or agreed to in writing, software
    public DBSObjectState getObjectState() {
    }
 *
    public void refreshObjectState(@NotNull DBRProgressMonitor monitor) throws DBCException {

                }

        if (source == null) {
        
import org.jkiss.code.NotNull;
            if (hasBody) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
import org.jkiss.dbeaver.DBException;
                        + " WHERE p.package_type = 7 AND u.user_id = p.user_id AND u.user_name = ? AND package_name = ?")) {
public class AltibasePackage extends GenericPackage implements DBPStatefulObject {
        }
            }
import org.jkiss.dbeaver.model.DBPStatefulObject;
                "Refresh state of package '" + this.getName() + "'")) {
    }
                    valid = JDBCUtils.safeGetBoolean(dbResult, 1, "0"); // 0 is Valid, 1 is invalid
    private boolean hasBody;
    }
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
                    + AltibaseConstants.NEW_LINE;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    private String source;
import java.util.Map;
            dbStat.setString(2, getName());

        try (JDBCPreparedStatement dbStat = session.prepareStatement(
        this.hasBody = hasBody;
        super(container, packageName, true);
    }
 * DBeaver - Universal Database Manager
        

        return valid;
    

 */
/*
 *
            }
    }
    public void setStatus(boolean valid) {
    @Property(viewable = true, order = 5)
        return valid ? DBSObjectState.NORMAL : DBSObjectState.INVALID;
    @Override
package org.jkiss.dbeaver.ext.altibase.model;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                    + "-- Package body " 
                source += "-- No body definition";
    protected String schemaName;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, 
import org.jkiss.dbeaver.model.exec.DBCException;
    }
                    + ((AltibaseMetaModel) getDataSource().getMetaModel())
    
    @NotNull
                "Refresh state of package '" + this.getName() + "'")) {
                        .getPackageDDL(monitor, this, AltibaseConstants.PACKAGE_TYPE_BODY);
            dbStat.executeStatement();
            throw new DBCException(e, session.getExecutionContext());
import java.sql.SQLException;
        return source;
        }
        return this;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    private boolean valid; // 0: Valid, 1: Invalid
        // Check package body status only because package spec. cannot be invalid.


    @Property(viewable = false, hidden = true, order = 3, labelProvider = GenericCatalog.CatalogNameTermProvider.class)
    @Override
    public AltibasePackage(GenericStructContainer container, String packageName, JDBCResultSet dbResult) {
            try (JDBCResultSet dbResult = dbStat.getResultSet()) {
import org.jkiss.dbeaver.ext.altibase.AltibaseConstants;
 *
 * You may obtain a copy of the License at
    }
 * See the License for the specific language governing permissions and

import org.jkiss.dbeaver.ext.generic.model.GenericPackage;
    @Override
import org.jkiss.dbeaver.model.struct.DBSObject;
                    + AltibaseConstants.NEW_LINE 
                    + AltibaseConstants.NEW_LINE 
                source += ((AltibaseMetaModel) getDataSource().getMetaModel())
 *     http://www.apache.org/licenses/LICENSE-2.0
    }

 * Copyright (C) 2010-2025 DBeaver Corp and others
        schemaName = container.getName();

    public void setBody(boolean hasBody) {
 * you may not use this file except in compliance with the License.
    
 * limitations under the License.
import org.jkiss.dbeaver.ext.generic.model.GenericCatalog;
    public boolean isValid() {
        } catch (SQLException e) {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, 
import org.jkiss.dbeaver.model.meta.Property;

    @Nullable
        }
    public void refreshState(JDBCSession session) throws DBCException {

    @NotNull
        valid = JDBCUtils.safeGetBoolean(dbResult, "STATUS", "0");
            refreshState(session);
            dbStat.setString(1, schemaName);
            source = "-- Package specification " 
                "SELECT status FROM system_.sys_users_ u, system_.sys_packages_ p"
    public GenericCatalog getCatalog() {
