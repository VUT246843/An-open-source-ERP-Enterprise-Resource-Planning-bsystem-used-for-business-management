    }
    }

    }
    public OraclePrivTable(OracleTableBase table, ResultSet resultSet) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
/*
        this.grantee = JDBCUtils.safeGetString(resultSet, "GRANTEE");
import org.jkiss.dbeaver.model.access.DBAPrivilege;
import org.jkiss.code.NotNull;
    @Property(viewable = true, order = 11)
    {
import org.jkiss.dbeaver.model.meta.Property;
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Property(viewable = true, order = 10)
package org.jkiss.dbeaver.ext.oracle.model;
    }
            return grantee;
    public Object getGrantee(DBRProgressMonitor monitor) throws DBException
    {

}
    public boolean isHierarchy()
 * Licensed under the Apache License, Version 2.0 (the "License");

        this.grantor = JDBCUtils.safeGetString(resultSet, "GRANTOR");
        }
/**
    private String grantor;
        this.grantable = JDBCUtils.safeGetBoolean(resultSet, "GRANTABLE", OracleConstants.RESULT_YES_VALUE);
        return super.getName();
    }
 * limitations under the License.
        if (monitor == null) {
    public String getName() {
    @Property(viewable = true, order = 1)
        }
    @Property(viewable = true, order = 5, supportsPreview = true)
        this.hierarchy = JDBCUtils.safeGetBoolean(resultSet, "HIERARCHY", OracleConstants.RESULT_YES_VALUE);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
    public boolean isGrantable()
 * See the License for the specific language governing permissions and
public class OraclePrivTable extends OracleObject<OracleTableBase> implements DBAPrivilege {

 *
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
    private String grantee;
 * DBeaver - Universal Database Manager

        if (monitor == null) {
    private boolean grantable;
 */
    private boolean hierarchy;
        return getDataSource().getGrantee(monitor, grantor);

 * You may obtain a copy of the License at
        return hierarchy;
    {
 *

        super(table, JDBCUtils.safeGetString(resultSet, "PRIVILEGE"), true);

    {
 * Unless required by applicable law or agreed to in writing, software
import java.sql.ResultSet;
    @Override
import org.jkiss.dbeaver.DBException;
    @Property(viewable = true, order = 6, supportsPreview = true)
 * OraclePrivTable
        return grantable;

 */
            return grantor;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 *
    public Object getGrantor(DBRProgressMonitor monitor) throws DBException
    @NotNull
        return getDataSource().getGrantee(monitor, grantee);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
