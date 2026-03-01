
                                ddl.append(", encoding=").append(rs.getString("Encoding")).append(";\n");
                                ddl.append(rs.getString("DataType")).append(" ");
 * See the License for the specific language governing permissions and
                              @NotNull GenericTableBase sourceObject,

     * Check if object names should be trimmed.
 * limitations under the License.
                        if (isAligned) {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, (DBSObject) sourceObject, "Execute SQL for IoTDB-tree")) {
        return true;
/*
            }
            try (JDBCStatement stmt = session.createStatement()) {
     */

    private static final Log log = Log.getLog(IoTDBMetaModel.class);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                    if (rs != null) {
        }
     */

     * @param sourceObject source object with required name and parents info
public class IoTDBMetaModel extends GenericMetaModel {
     *
     *
        } catch (Exception e) {
 * You may obtain a copy of the License at
            try (JDBCStatement stmt = session.createStatement()) {
import org.jkiss.code.NotNull;
        } catch (Exception e) {

package org.jkiss.dbeaver.ext.iotdb.model.meta;
 *
 *

 * DBeaver - Universal Database Manager
                        } else {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                            }
        return ddl.toString();
                    if (rs != null) {
                        }
 */

     * @return "test" for temporary
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public boolean isTrimObjectNames() {
 * you may not use this file except in compliance with the License.
                            ddl.append("create aligned timeseries ").append(device).append("(");
                    }

 * Unless required by applicable law or agreed to in writing, software
                    }
                            String prefix = device + ".";
                        }
            }
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
        } catch (Exception e) {
    /**
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
     * @param monitor to create session or to read metadata
        try (JDBCSession session = DBUtils.openMetaSession(monitor, (DBSObject) sourceObject, "Execute SQL for IoTDB-tree")) {
}
        String device2 = ((DBSEntity) sourceObject).getName();
        }
                    }
     * @return true to trim extra spaces around columns, tables, objects names
                                ddl.append(timeseries).append(" ");

                            ddl.append(");\n");
                                ddl.append("compressor=").append(rs.getString("Compression")).append(", ");
 * distributed under the License is distributed on an "AS IS" BASIS,
                            ddl.append("delete timeseries ").append(rs.getString("Timeseries")).append(";\n");
        String device1 = ((DBSEntity) sourceObject).getParentObject().getName();
            try (JDBCStatement stmt = session.createStatement()) {
     * Get DDL for table.
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
                        isAligned = "true".equals(rs.getString("IsAligned"));
                            while (rs.next()) {
import org.jkiss.dbeaver.model.struct.DBSObject;

            String sql = String.format("show timeseries %s.**", device);
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
                }
    }
     * @param options for generated DDL
            String sql = String.format("show timeseries %s.**", device);
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
        String device = device1 + "." + device2;
            String sql = String.format("show devices %s", device);
                                ddl.append(" with datatype=").append(rs.getString("DataType"));


                try (JDBCResultSet rs = stmt.executeQuery(sql)) {
     *
    public String getTableDDL(@NotNull DBRProgressMonitor monitor,
import org.jkiss.dbeaver.model.DBUtils;
                            ddl.setLength(ddl.length() - 2);
            log.error("Error executing sql", e);
                    if (rs != null && rs.next()) {
        boolean isAligned = false;

                            }
            log.error("Error executing sql", e);
import org.jkiss.dbeaver.model.struct.DBSEntity;
                                ddl.append("encoding=").append(rs.getString("Encoding")).append(" ");
                try (JDBCResultSet rs = stmt.executeQuery(sql)) {
                                ddl.append("create timeseries ").append(rs.getString("Timeseries"));
        ddl.append("\n");
                try (JDBCResultSet rs = stmt.executeQuery(sql)) {
                            while (rs.next()) {
    /**
import java.util.Map;
                        while (rs.next()) {
                }
    @Override
                              @NotNull Map<String, Object> options)  {
            }
        StringBuilder ddl = new StringBuilder(200);
import org.jkiss.dbeaver.DBException;
        }
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
                }
                                String timeseries = rs.getString("Timeseries").replaceFirst("^" + prefix, "");
        try (JDBCSession session = DBUtils.openMetaSession(monitor, (DBSObject) sourceObject, "Execute SQL for IoTDB-tree")) {
import org.jkiss.dbeaver.Log;
            log.error("Error executing sql", e);
