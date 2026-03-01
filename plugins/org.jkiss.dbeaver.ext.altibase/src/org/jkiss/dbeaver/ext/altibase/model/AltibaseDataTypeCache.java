                            if (fieldType == null) {
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
import org.jkiss.dbeaver.DBDatabaseException;
import java.util.List;
                            }
        AltibaseDataSource dataSource = (AltibaseDataSource) container.getDataSource();
                    }
            }
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
 * DBeaver - Universal Database Manager
        List<AltibaseDataType> tmpObjectList = new ArrayList<>();

    @Override
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCBasicDataTypeCache;
 */
 *

                    try (JDBCResultSet dbResult = dbStat.executeQuery()) {
                            if (monitor.isCanceled()) {
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

                            tmpObjectList.add(dataType);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
                    monitor.subTask("Load Altibase domain types");
 * AltibaseDataTypeCache
/**
import org.jkiss.dbeaver.DBException;
 *     http://www.apache.org/licenses/LICENSE-2.0
            try (JDBCSession session = DBUtils.openMetaSession(monitor, dataSource, "Load Altibase data types")) {
                }
                throw e;
 */
                            }
 * you may not use this file except in compliance with the License.
                                    dataSource, fieldType, typeName, remarks, unsinged, searchabel, precision, minScale, maxScale);
                            boolean unsinged = (JDBCUtils.safeGetInt(dbResult, "UNSIGNED_ATTRIBUTE") == 1);
}
import java.util.ArrayList;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    public AltibaseDataTypeCache(GenericStructContainer owner) {
                        }
                            String typeName = JDBCUtils.safeGetString(dbResult, "TYPE_NAME");

        try {
            } catch (SQLException ex) {
        // Load domain types

        }
        mergeCache(tmpObjectList);
                                continue;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                try (JDBCPreparedStatement dbStat = session.prepareStatement(
            throw new DBException(ModelMessages.error_not_connected_to_database);
                        "SELECT * FROM V$DATATYPE ORDER BY TYPE_NAME")) {
            if (!handleCacheReadError(e)) {
                            int minScale = JDBCUtils.safeGetInt(dbResult, "MINIMUM_SCALE");
        super(owner);

        if (dataSource == null) {
                            boolean searchabel = (JDBCUtils.safeGetInt(dbResult, "SEARCHABLE") > 0);
/*
                            AltibaseDataType dataType = new AltibaseDataType(
        } catch (DBException e) {
                            String remarks = JDBCUtils.safeGetString(dbResult, "LOCAL_TYPE_NAME");
                        while (dbResult.next()) {
 * See the License for the specific language governing permissions and

 * distributed under the License is distributed on an "AS IS" BASIS,
public class AltibaseDataTypeCache extends JDBCBasicDataTypeCache<GenericStructContainer, AltibaseDataType> {
        }

                                continue;
            }


 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
package org.jkiss.dbeaver.ext.altibase.model;
                throw new DBDatabaseException(ex, dataSource);
                            AltibaseDataTypeDomain fieldType = AltibaseDataTypeDomain.getByTypeName(typeName);
                            int maxScale = JDBCUtils.safeGetInt(dbResult, "MAXIMUM_SCALE");
                                break;
    protected synchronized void loadObjects(DBRProgressMonitor monitor, GenericStructContainer container) throws DBException {
 * limitations under the License.
    }
 *
import org.jkiss.dbeaver.model.DBUtils;
                            }
                            int precision = JDBCUtils.safeGetInt(dbResult, "COLUMN_SIZE");

import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
import org.jkiss.dbeaver.model.messages.ModelMessages;
                            if (typeName == null) {
                                // Internal type
import java.sql.SQLException;
