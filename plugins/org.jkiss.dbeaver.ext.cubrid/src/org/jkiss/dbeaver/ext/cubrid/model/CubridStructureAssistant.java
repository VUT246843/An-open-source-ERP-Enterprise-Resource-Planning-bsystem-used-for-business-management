                String schemaName = JDBCUtils.safeGetString(dbResult, CubridConstants.OWNER_NAME);
    public JDBCDataSource getDataSource() {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    public CubridStructureAssistant(CubridDataSource dataSource) {
        try {
                GenericSchema resolvedSchema = dataSource.getSchema(schemaName);
        GenericSchema schema,
                } else {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        }
            dbStat.setString(1, tableNameMask);
    @Override
    protected void findObjectsByMask(
 * limitations under the License.


            JDBCResultSet dbResult = dbStat.executeQuery();
        JDBCSession session,
                throw new DBException(String.format("Table '%s' not found in schema '%s'", getName(), getContainer().getName()));
    private final CubridDataSource dataSource;
            super(name, container, comment, CubridTable.class, RelationalObjectType.TYPE_TABLE);

import org.jkiss.dbeaver.model.impl.struct.RelationalObjectType;
    @Override
 *
/*
import org.jkiss.dbeaver.ext.generic.model.GenericSchema;
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.struct.DBSObject;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
public class CubridStructureAssistant extends JDBCStructureAssistant<JDBCExecutionContext> {
    }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;

                if (resolvedSchema != null) {
        List<DBSObjectReference> references
        JDBCSession session,
        List<DBSObjectReference> objects
        } catch (SQLException e) {
        ObjectsSearchParams params,
package org.jkiss.dbeaver.ext.cubrid.model;
            while (dbResult.next()) {
 *

        }

import org.jkiss.dbeaver.model.struct.DBSObjectType;
 */
    private static final class TableReference extends AbstractObjectReference<GenericSchema> {
            return table;
    ) throws DBException, SQLException {


            }
        JDBCExecutionContext executionContext,
import org.jkiss.dbeaver.model.impl.struct.AbstractObjectReference;
        DBSObjectType objectType,
            DBSObject table = getContainer().getTableCache().getObject(monitor, getContainer(), getName());
            findTablesByMask(session, parentSchema, params.getMask(), references);
        private TableReference(GenericSchema container, String name, String comment) {
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
        public DBSObject resolveObject(DBRProgressMonitor monitor) throws DBException {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
        String tableNameMask,
        GenericSchema parentSchema = params.getParentObject() instanceof GenericSchema ? (GenericSchema) params.getParentObject() : null;
                String tableName = JDBCUtils.safeGetString(dbResult, CubridConstants.CLASS_NAME);
}
    ) throws SQLException, DBException {
            }
        return dataSource;
    }
import org.jkiss.dbeaver.model.struct.DBSObjectReference;
    }
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
        }
        @Override
        if (objectType == RelationalObjectType.TYPE_TABLE) {
        String sql = "SELECT class_name, owner_name, comment FROM db_class WHERE class_name = ?";
import org.jkiss.dbeaver.ext.cubrid.CubridConstants;
import org.jkiss.dbeaver.DBException;


        }
import java.util.List;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
            throw new DBException("Failed to find tables matching: " + tableNameMask, e);

                }
            JDBCPreparedStatement dbStat = session.prepareStatement(sql);
                String comment = JDBCUtils.safeGetString(dbResult, CubridConstants.COMMENT);

    }
                    objects.add(new TableReference(resolvedSchema, tableName, comment));
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.dataSource = dataSource;
                    throw new DBException("Schema not found for name: " + schemaName);
import java.sql.SQLException;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    private void findTablesByMask(
            if (table == null) {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.impl.jdbc.JDBCStructureAssistant;
    }

 * DBeaver - Universal Database Manager
