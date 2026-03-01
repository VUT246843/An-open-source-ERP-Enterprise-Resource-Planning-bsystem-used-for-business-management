                        return "-- Generated generic DDL \n" +
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
public class TrinoMetaModel extends GenericMetaModel {
import org.jkiss.dbeaver.model.DBUtils;
    }	
    public String getTableDDL(@NotNull DBRProgressMonitor monitor, @NotNull GenericTableBase sourceObject, @NotNull Map<String, Object> options) throws DBException {
/*
                    }
                    if (dbResult.next()) {
    public JDBCBasicDataTypeCache<GenericStructContainer, ? extends JDBCDataType> createDataTypeCache(
                    	return dbResult.getString(1);
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCDataType;
        @NotNull GenericStructContainer container
            throw new DBDatabaseException(e, dataSource);
        }
 * limitations under the License.
import org.jkiss.dbeaver.DBException;
        return new TrinoDataSource(monitor, container, this);
        } catch (SQLException e) {
                "SHOW CREATE VIEW " + sourceObject.getFullyQualifiedName(DBPEvaluationContext.DDL))) 
 * distributed under the License is distributed on an "AS IS" BASIS,
                    "SHOW CREATE TABLE " + sourceObject.getFullyQualifiedName(DBPEvaluationContext.DDL))) 
    @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                    } else {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
import java.sql.SQLException;
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
 * See the License for the specific language governing permissions and
 *
    }     
        } catch (SQLException e) {
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
 */
                    }

    }
                    if (dbResult.next()) {

                {
    @NotNull
        return new TrinoDataTypeCache(container);
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            }
 *
                        return dbResult.getString(1);
                    } else {
    }
        try (JDBCSession session = DBUtils.openMetaSession(monitor, sourceObject, "Read Trino view source")) {
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
import org.jkiss.dbeaver.model.struct.DBStructUtils;
    public GenericDataSource createDataSourceImpl(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container) throws DBException {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCBasicDataTypeCache;
package org.jkiss.dbeaver.ext.trino.model;

    @Override

                }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
import org.jkiss.dbeaver.ext.generic.model.GenericView;
    }
        }
        try (JDBCSession session = DBUtils.openMetaSession(monitor, sourceObject, "Read Trino table DDL")) {
                        return "-- View definition not found in system catalog";

 * Copyright (C) 2010-2025 DBeaver Corp and others
    public String getViewDDL(@NotNull DBRProgressMonitor monitor, @NotNull GenericView sourceObject, @NotNull Map<String, Object> options) throws DBException {
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
    @Override
 * You may obtain a copy of the License at
 *
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    public TrinoMetaModel() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import org.jkiss.dbeaver.DBDatabaseException;
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
            {
    ) {
            }
                                DBStructUtils.generateTableDDL(monitor, sourceObject, options, false);
        GenericDataSource dataSource = sourceObject.getDataSource();
            throw new DBDatabaseException(e, dataSource);
import java.util.Map;
        GenericDataSource dataSource = sourceObject.getDataSource();
    
import org.jkiss.dbeaver.model.DBPEvaluationContext;
                        // Trino uses multiple sources, just in case there is one that does not provide a result
}   
import org.jkiss.code.NotNull;
                }
