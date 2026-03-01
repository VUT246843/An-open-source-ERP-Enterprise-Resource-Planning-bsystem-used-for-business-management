        return new SQLServerExtendedProperty(session.getProgressMonitor(), owner, resultSet);
            return !sqlServerDataSource.isDataWarehouseServer(session.getProgressMonitor());
import org.jkiss.code.Nullable;
 * Copyright (C) 2010-2025 DBeaver Corp and others
            sql.append("NULL AS value_type ");
        dbStat.setLong(1, owner.getMajorObjectId());
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.DBException;
        return !SQLServerUtils.isDriverBabelfish(dataSource.getContainer().getDriver());
}
        sql.append("SELECT ep.*, ");
            sql.append("TYPE_ID(CAST(SQL_VARIANT_PROPERTY(value, 'BaseType') as nvarchar)) AS value_type ");
        sql.append("FROM ");

    }
    }
    public JDBCStatement prepareLookupStatement(@NotNull JDBCSession session, @NotNull SQLServerExtendedPropertyOwner owner, @Nullable SQLServerExtendedProperty object, @Nullable String objectName) throws SQLException {
    private boolean isSupportVariantProperty(@NotNull JDBCSession session) {
        dbStat.setLong(2, owner.getMinorObjectId());
 */
        dbStat.setLong(3, owner.getExtendedPropertyObjectClass().getClassId());

        StringBuilder sql = new StringBuilder();
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    }
        if (dataSource instanceof SQLServerDataSource sqlServerDataSource) {
    @Nullable
        sql.append(SQLServerUtils.getExtendedPropsTableName(owner.getDatabase()));
        }

package org.jkiss.dbeaver.ext.mssql.model;
import org.jkiss.dbeaver.ext.mssql.SQLServerUtils;
        if (isSupportVariantProperty(session)) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
 * Unless required by applicable law or agreed to in writing, software
 *

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectLookupCache;
    @Override
        sql.append(" ep WHERE ep.major_id=? AND ep.minor_id=? AND ep.class=? ORDER BY ep.minor_id");
        JDBCPreparedStatement dbStat = session.prepareStatement(sql.toString());
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.NotNull;

 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.
    @Override
/*
 *
 *
        } else {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    protected SQLServerExtendedProperty fetchObject(@NotNull JDBCSession session, @NotNull SQLServerExtendedPropertyOwner owner, @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
        JDBCDataSource dataSource = session.getDataSource();
import java.sql.SQLException;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        return dbStat;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;

public class SQLServerExtendedPropertyCache extends JDBCObjectLookupCache<SQLServerExtendedPropertyOwner, SQLServerExtendedProperty> {
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
