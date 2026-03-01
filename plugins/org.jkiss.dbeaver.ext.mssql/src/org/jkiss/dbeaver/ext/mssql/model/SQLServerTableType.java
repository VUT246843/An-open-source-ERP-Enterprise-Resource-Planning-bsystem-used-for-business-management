                            SQLServerUtils.getSystemTableName(getDatabase(), "all_objects") + " tr\n" +
        return false;
                            "FROM " +
}
 * Unless required by applicable law or agreed to in writing, software
 *
package org.jkiss.dbeaver.ext.mssql.model;
 * See the License for the specific language governing permissions and
    @NotNull
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
                                }
import java.sql.SQLException;
    }
                    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        return getContainer().getUniqueConstraintCache().getObjects(monitor, getSchema(), this);
    public Collection<? extends DBSEntityAssociation> getReferences(@NotNull DBRProgressMonitor monitor) throws DBException {
import java.util.ArrayList;
                    List<SQLServerTableForeignKey> result = new ArrayList<>();
                            "ORDER BY 1,2,3")) {
            return references;
                    this.references = result;
                            SQLServerUtils.getSystemTableName(getDatabase(), "all_objects") + " t, " +
                                DBSEntityAssociation object = DBUtils.findObject(table.getAssociations(monitor), fkName);

            try (JDBCPreparedStatement dbStat = session.prepareStatement(

import org.jkiss.dbeaver.model.exec.DBCException;
 *
import java.sql.ResultSet;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                            if (table != null) {
    }
    private transient volatile List<SQLServerTableForeignKey> references;


    public boolean supportsObjectDefinitionOption(@NotNull String option) {
                        if (schema != null) {
    @Override
    @Nullable
    @Override
import org.jkiss.dbeaver.DBException;
                        String fkName = JDBCUtils.safeGetString(dbResult, "key_name");
                                    result.add((SQLServerTableForeignKey) object);

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import java.util.List;

                        SQLServerSchema schema = getDatabase().getSchema(monitor, schemaId);
        return false;
 * you may not use this file except in compliance with the License.
        return getSchema().getForeignKeyCache().getObjects(monitor, getSchema(), this);
    @Override
import java.util.Collection;
        super(catalog, dbResult, name);
 * DBeaver - Universal Database Manager
    }
 * limitations under the License.
    @Override
                    while (dbResult.next()) {
public class SQLServerTableType extends SQLServerTableBase {
                }
    @Override
    }
    public boolean isView() {
 * distributed under the License is distributed on an "AS IS" BASIS,
        return DBStructUtils.generateTableDDL(monitor, this, options, false);
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                            }
                        long schemaId = JDBCUtils.safeGetLong(dbResult, "schema_id");

                            SQLServerUtils.getSystemTableName(getDatabase(), "foreign_keys") + " fk, " +
            } catch (SQLException e) {
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {

                throw new DBCException(e, session.getExecutionContext());
                            SQLServerTableBase table = schema.getTable(monitor, tableName);
    }
    boolean supportsTriggers() {

    @Override
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
    public Collection<SQLServerTableUniqueKey> getConstraints(@NotNull DBRProgressMonitor monitor) throws DBException {
    @Nullable
import java.util.Map;
                dbStat.setLong(1, getObjectId());
 * You may obtain a copy of the License at
import org.jkiss.code.NotNull;
        if (references != null || monitor == null) {
            }
                    "SELECT t.schema_id as schema_id,t.name as table_name,fk.name as key_name\n" +
import org.jkiss.dbeaver.model.DBUtils;
    public Collection<SQLServerTableForeignKey> getAssociations(@NotNull DBRProgressMonitor monitor) throws DBException {
import org.jkiss.code.Nullable;
    @Nullable
 */
                                if (object instanceof SQLServerTableForeignKey) {

    public SQLServerTableType(@NotNull SQLServerSchema catalog, @NotNull ResultSet dbResult, @NotNull String name) {
/*
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
    @Override
                    return result;
    }
    public void setObjectDefinitionText(String source) {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this,  "Read table references")) {
import org.jkiss.dbeaver.model.struct.DBStructUtils;
import org.jkiss.dbeaver.ext.mssql.SQLServerUtils;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

import org.jkiss.dbeaver.model.struct.DBSEntityAssociation;
        }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        return false;
    }
                        }
                        String tableName = JDBCUtils.safeGetString(dbResult, "table_name");
                            "WHERE t.object_id = fk.parent_object_id AND tr.object_id=fk.referenced_object_id AND fk.referenced_object_id=?\n" +

    @Override

