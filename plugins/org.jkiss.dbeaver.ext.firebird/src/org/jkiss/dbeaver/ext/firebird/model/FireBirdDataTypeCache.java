                            int fieldLength = JDBCUtils.safeGetInt(dbResult, "RDB$FIELD_LENGTH");
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCBasicDataTypeCache;
                            }
 * You may obtain a copy of the License at
            try (JDBCSession session = DBUtils.openMetaSession(monitor, dataSource, "Load Firebird domain types")) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
                            String charsetName = dataSource.getMetaFieldValue(FireBirdConstants.TYPE_CHARACTER_SET_NAME, charsetId);
                                continue;
 * DBeaver - Universal Database Manager
 * FireBirdDataTypeCache

 *
                            int charsetId = JDBCUtils.safeGetInt(dbResult, "RDB$CHARACTER_SET_ID");
    }
            if (!handleCacheReadError(e)) {
import java.util.List;
                    "SELECT RDB$FIELD_NAME,RDB$FIELD_LENGTH,RDB$FIELD_SCALE,RDB$FIELD_PRECISION,RDB$FIELD_TYPE,RDB$FIELD_SUB_TYPE,RDB$CHARACTER_LENGTH,RDB$CHARACTER_SET_ID,\n" +
                    try (JDBCResultSet dbResult = dbStat.executeQuery()) {
            }

import org.jkiss.dbeaver.DBDatabaseException;
                            String computedSource = JDBCUtils.safeGetString(dbResult, "COMPUTED_SOURCE"); // ?

import java.util.ArrayList;
        } catch (DBException e) {
                            int fieldScale = Math.abs(JDBCUtils.safeGetInt(dbResult, "RDB$FIELD_SCALE")); // For some reason, FireBird returns the negative value in the scale field.
                            int charLength = JDBCUtils.safeGetInt(dbResult, "RDB$CHARACTER_LENGTH");
 */
                            boolean notNull = JDBCUtils.safeGetInt(dbResult, "RDB$NULL_FLAG") == 1;
                        "CAST(RDB$VALIDATION_SOURCE AS VARCHAR(512)) VALIDATION_SOURCE,SUBSTRING(RDB$COMPUTED_SOURCE FROM 1 FOR 512) COMPUTED_SOURCE,CAST(RDB$DEFAULT_SOURCE AS VARCHAR(512)) DEFAULT_SOURCE\n" +
                                break;
            }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                            FireBirdFieldType fieldDT = FireBirdFieldType.getById(fieldType, fieldSubType);
import java.sql.SQLException;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
 * you may not use this file except in compliance with the License.

                            FireBirdDataType dataType = new FireBirdDataType(
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 * distributed under the License is distributed on an "AS IS" BASIS,
                            String typeDescription = JDBCUtils.safeGetString(dbResult, "RDB$DESCRIPTION");
import org.jkiss.dbeaver.model.messages.ModelMessages;

        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    @Override
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
                                computedSource, validationSource, defaultSource,
                                notNull);
                        while (dbResult.next()) {
import org.jkiss.dbeaver.DBException;
                                fieldLength, charLength,
                        "FROM RDB$FIELDS F ORDER BY RDB$FIELD_NAME"))

                            int fieldPrecision = JDBCUtils.safeGetInt(dbResult, "RDB$FIELD_PRECISION");
    }
 * limitations under the License.
import org.jkiss.dbeaver.Log;
                        }
        try {
                                dataSource, fieldDT, fieldSubType, typeName.trim(), typeDescription, false, true, fieldPrecision, fieldScale, fieldScale,

public class FireBirdDataTypeCache extends JDBCBasicDataTypeCache<GenericStructContainer, FireBirdDataType>
                            if (monitor.isCanceled()) {
        super(owner);

                            String validationSource = JDBCUtils.safeGetString(dbResult, "VALIDATION_SOURCE"); // ?
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                            }
        mergeCache(tmpObjectList);
{
                            String defaultSource = JDBCUtils.safeGetString(dbResult, "DEFAULT_SOURCE");
                            tmpObjectList.add(dataType);
            FireBirdDataType dataType = new FireBirdDataType(dataSource, fieldType);
    private static final Log log = Log.getLog(FireBirdDataTypeCache.class);
                }
/*
                    monitor.subTask("Load Firebird domain types");
    protected synchronized void loadObjects(DBRProgressMonitor monitor, GenericStructContainer container) throws DBException {
                throw e;
            throw new DBException(ModelMessages.error_not_connected_to_database);
/**
        // Load domain types
                            String typeName = JDBCUtils.safeGetString(dbResult, "RDB$FIELD_NAME");
                            if (typeName == null) {

                throw new DBDatabaseException(ex, dataSource);
                // Use CAST to improve performance, binaries are too slow
                {
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
 *
            tmpObjectList.add(dataType);
}
                            int fieldSubType = JDBCUtils.safeGetInt(dbResult, "RDB$FIELD_SUB_TYPE");
package org.jkiss.dbeaver.ext.firebird.model;
                    }
        List<FireBirdDataType> tmpObjectList = new ArrayList<>();
        for (FireBirdFieldType fieldType : FireBirdFieldType.values()) {
import org.jkiss.dbeaver.model.DBUtils;
    public FireBirdDataTypeCache(GenericStructContainer owner) {
                            }
                                continue;
        if (dataSource == null) {
                                log.error("Field type '" + fieldType + "' not found");
                                charsetName,
                            if (fieldDT == null) {
                try (JDBCPreparedStatement dbStat = session.prepareStatement(
        }
 * Unless required by applicable law or agreed to in writing, software
        FireBirdDataSource dataSource = (FireBirdDataSource) container.getDataSource();
 * See the License for the specific language governing permissions and

            } catch (SQLException ex) {
                            int fieldType = JDBCUtils.safeGetInt(dbResult, "RDB$FIELD_TYPE");

        }

