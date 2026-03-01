                    }


import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableBase;
 */
                            if (line.startsWith("CREATE ")) {
                        if (sql.length() > 0) sql.append("\n");
import org.jkiss.dbeaver.model.DBUtils;
            return null;
                            continue;
        } catch (Exception e) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                }
                        }
 * Unless required by applicable law or agreed to in writing, software
/**
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.DBPEvaluationContext;
                        }
            }
        try (JDBCSession session = DBUtils.openMetaSession(monitor, tableBase, "Load Yellowbrick DDL")) {
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Copyright (C) 2010-2024 DBeaver Corp and others

    }
    private static final Log log = Log.getLog(YellowBrickUtils.class);
    public static String extractTableDDL(DBRProgressMonitor monitor, PostgreTableBase tableBase)
}
package org.jkiss.dbeaver.ext.postgresql.model.impls.yellowbrick;
                    String ddl = sql.toString();
                        if (!ddlStarted) {

    {
 *
    
            try (JDBCPreparedStatement dbStat = session.prepareStatement("describe " + tableBase.getFullyQualifiedName(DBPEvaluationContext.DDL) + " only ddl")) {
                    return ddl;
 * See the License for the specific language governing permissions and
                    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
 * YellowBrickUtils
 * DBeaver - Universal Database Manager
        }
                                continue;
                    boolean ddlStarted = false;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
                        ddl = ddl.substring(0, ddl.length() - 1);
            log.debug("Error generating Yellowbrick DDL", e);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                            } else {
 *
                        sql.append(line);
                    if (ddl.endsWith(";")) {
                        String line = resultSet.getString(1);
 *
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    private static final int UNKNOWN_LENGTH = -1;
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
                    while (resultSet.next()) {
                try (JDBCResultSet resultSet = dbStat.executeQuery()) {
                            }
                        if (line == null) {
 * you may not use this file except in compliance with the License.

                                ddlStarted = true;
public class YellowBrickUtils {
 */
                    StringBuilder sql = new StringBuilder();

 * You may obtain a copy of the License at
