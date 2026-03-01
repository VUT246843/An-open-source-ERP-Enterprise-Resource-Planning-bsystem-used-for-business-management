 *
 *
        super(table, JDBCUtils.safeGetString(resultSet, "PRIV_NAME"), true);
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    public String getGranteeType() throws DBException {
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
    
 */
 *
    }

    
package org.jkiss.dbeaver.ext.altibase.model;

    }
    }
 * DBeaver - Universal Database Manager
    public Object getGrantee(DBRProgressMonitor monitor) throws DBException {
    private String granteeType;
import java.sql.ResultSet;
 * AltibasePrivTable
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
import org.jkiss.dbeaver.DBException;

        return granteeType;
        this.grantable = JDBCUtils.safeGetBoolean(resultSet, "WITH_GRANT_OPTION", AltibaseConstants.RESULT_1_VALUE);
    }
    
    public AltibasePrivTable(AltibaseTable table, ResultSet resultSet) {
        return super.getName();
/**
 */
            return grantee;
        }
    @Property(viewable = true, editable = false, order = 1)
        return getDataSource().getGrantee(monitor, grantor);
        if (monitor == null) {
        }
        if (monitor == null) {
    public Object getGrantor(DBRProgressMonitor monitor) throws DBException {
}
public class AltibasePrivTable extends AltibaseObject<AltibaseTable> implements DBAPrivilege {
    private String grantor;

    @NotNull
import org.jkiss.code.NotNull;
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
        return getDataSource().getGrantee(monitor, grantee);
    @Property(viewable = true, order = 13)
 * limitations under the License.
import org.jkiss.dbeaver.model.access.DBAPrivilege;
    
    @Property(viewable = true, order = 11)
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
/*
    public String getName() {
    @Property(viewable = true, order = 12)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
import org.jkiss.dbeaver.ext.altibase.AltibaseConstants;
    private boolean grantable;
 * You may obtain a copy of the License at
        this.granteeType = JDBCUtils.safeGetString(resultSet, "GRANTEE_TYPE");
        this.grantee = JDBCUtils.safeGetString(resultSet, "GRANTEE_NAME");
    
        return grantable;
    private String grantee;
            return grantor;
import org.jkiss.dbeaver.model.meta.Property;
    @Property(viewable = true, order = 10)
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        this.grantor = JDBCUtils.safeGetString(resultSet, "GRANTOR_NAME");
    public boolean isGrantable() {
