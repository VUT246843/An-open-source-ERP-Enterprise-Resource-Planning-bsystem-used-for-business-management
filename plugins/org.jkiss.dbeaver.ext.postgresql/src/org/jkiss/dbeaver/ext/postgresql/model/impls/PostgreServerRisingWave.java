        return false;

        return false;
            ) {
                    } else {
    }



 *
        return false;
                    } else {
    }
    }
        return false;
    }
        return false;
public class PostgreServerRisingWave extends PostgreServerExtensionBase {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;

        }
                    }
    public String getServerTypeName() {
 *     http://www.apache.org/licenses/LICENSE-2.0
                    }
        return false;
                        return null;
    @Override
    public boolean supportsForeignKeys() {
                        return null;
    @Override
        return false;
        return true;
    }
    private static final Log log = Log.getLog(PostgreServerRisingWave.class);
    }
        try (JDBCSession session = DBUtils.openMetaSession(monitor, view, "Load view DDL")) {
    }
    @Override
    @Override
            try (JDBCPreparedStatement dbStat = session.prepareStatement("SHOW CREATE " + view.getTableTypeName() + " " +
    @Override
                }
    @Override
            return null;
 */


    }
        return false;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public boolean supportsExtensions() {
            log.warn("Can't get native DDL. Use generated one.", e);
        } catch (Exception e) {
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataSource;
package org.jkiss.dbeaver.ext.postgresql.model.impls;
    @Override
            try (JDBCPreparedStatement dbStat = session.prepareStatement("SHOW CREATE TABLE " +
        return false;
 * Unless required by applicable law or agreed to in writing, software
    @Override

        return false;
    }


        try (JDBCSession session = DBUtils.openMetaSession(monitor, table, "Load table DDL")) {
                try (JDBCResultSet resultSet = dbStat.executeQuery()) {

    public boolean supportsStoredProcedures() {
    }

    @Override
                        return JDBCUtils.safeGetString(resultSet, 2);
        }

    }

    }
    public String readViewDDL(DBRProgressMonitor monitor, PostgreViewBase view) {
    public boolean supportsExplainPlan() {
    }
    }
        return true;
 * limitations under the License.
            }
    }
import org.jkiss.dbeaver.ext.postgresql.model.PostgreViewBase;
            }
        return false;
        } catch (Exception e) {
    @Override
    @Override
    @Override
    public boolean supportsSessionActivity() {
    public boolean supportsFunctionCreate() {
    public boolean supportsPartitions() {
    }
    }
                view.getFullyQualifiedName(DBPEvaluationContext.DDL))

    public boolean supportsRelationSizeCalc() {
    }
        return false;
    }

    public boolean supportsSequences() {
    @Override
                    if (resultSet.next()) {
    @Override
        return false;
    @Override
    @Override
    public boolean supportsTemplates() {
    public boolean supportsForeignServers() {
 * you may not use this file except in compliance with the License.
    public boolean supportsTablespaceLocation() {

        return false;
    @Override
        super(dataSource);
        return "RisingWave";
    public boolean supportsLanguages() {
    public boolean supportsNativeClient() {
            return null;

 *
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableBase;
    }
    @Override
        return false;

    public boolean supportsLocks() {
    @Override
                    if (resultSet.next()) {

    @Override
    @Override
        return false;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }

    @Override
    @Override
    public boolean supportsInheritance() {
    }
    public boolean supportsDependencies() {
        return true;
    @Override
    public boolean supportsTriggers() {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return false;

        return false;

    @Override
/*
}
    public boolean supportsRoles() {
    public boolean supportsEncodings() {
        return false;
                table.getFullyQualifiedName(DBPEvaluationContext.DDL))
    public boolean supportsAggregates() {
    public boolean supportsExplainPlanVerbose() {


    }
    public boolean supportsRules() {
    @Override

    @Override
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    }
    public boolean supportsFunctionDefRead() {
    public String readTableDDL(DBRProgressMonitor monitor, PostgreTableBase table) {
                        return JDBCUtils.safeGetString(resultSet, 2);
        return false;
    @Override

    }
        return true;
    }
    @Override
    public PostgreServerRisingWave(PostgreDataSource dataSource) {
    }
    public boolean supportsExplainPlanXML() {
 * distributed under the License is distributed on an "AS IS" BASIS,
    public boolean supportsPGConstraintExpressionColumn() {
                try (JDBCResultSet resultSet = dbStat.executeQuery()) {
    }
            log.warn("Can't get native DDL. Use generated one.", e);
    @Override
    }
        return false;


        return false;
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;


    }
        return false;

    public boolean supportsTableStatistics() {
    }

    }
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.DBUtils;
 * See the License for the specific language governing permissions and
            ) {
    @Override
    public boolean supportsTablespaces() {
import org.jkiss.dbeaver.Log;
        return false;
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 * You may obtain a copy of the License at

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
                }

 *
        return false;
    public boolean supportsMaterializedViews() {
        return false;

    @Override

    public boolean supportsColumnsRequiring() {
    @Override
