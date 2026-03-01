        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load sequence last value")) {
    }
 * DBeaver - Universal Database Manager
            try (JDBCPreparedStatement dbSeqStat = session.prepareStatement(
                "SELECT * from information_schema.\"sequences\" WHERE sequence_schema=? AND sequence_name=?")) {
    public boolean supportsCacheAndCycle() {

                "SELECT * from " + getFullyQualifiedName(DBPEvaluationContext.DML))) {
        // Cache and cycle options not supported correctly yet (Cockroach 22.1.2)
                try (JDBCResultSet seqResults = dbSeqStat.executeQuery()) {
                        additionalInfo.setMaxValue(JDBCUtils.safeGetLong(seqResults, "maximum_value"));
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSchema;
 *
                }
        } catch (Exception e) {

    public String getDescription() {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    public void loadAdditionalInfo(DBRProgressMonitor monitor) {
                        additionalInfo.setLastValue(JDBCUtils.safeGetLong(seqResults, "last_value"));
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    @Override
}
        super(schema, dbResult);
            log.warn("Error reading sequence las value", e);
 * Unless required by applicable law or agreed to in writing, software
            }
 */
        }
        AdditionalInfo additionalInfo = getAdditionalInfo();
            log.warn("Error reading sequence values", e);

 *
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSequence;
            try (JDBCPreparedStatement dbSeqStat = session.prepareStatement(
import org.jkiss.dbeaver.model.DBUtils;

 * You may obtain a copy of the License at
 *
        additionalInfo.setLoaded(true);
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    @Nullable
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
                dbSeqStat.setString(1, getSchema().getName());
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                try (JDBCResultSet seqResults = dbSeqStat.executeQuery()) {
package org.jkiss.dbeaver.ext.postgresql.model.impls.cockroach;
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load sequence additional info")) {
    private static final Log log = Log.getLog(CockroachSequence.class);
public class CockroachSequence extends PostgreSequence {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                        additionalInfo.setStartValue(JDBCUtils.safeGetLong(seqResults, "start_value"));
                    if (seqResults.next()) {
    }

        } catch (Exception e) {

    public CockroachSequence(PostgreSchema catalog) {
        return super.getDescription();
import org.jkiss.code.Nullable;
    public CockroachSequence(PostgreSchema schema, JDBCResultSet dbResult) {
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
                    }
            }
                }
/*

                    }
    @Override
                dbSeqStat.setString(2, getName());
 * limitations under the License.
                        additionalInfo.setIncrementBy(JDBCUtils.safeGetLong(seqResults, "increment"));
                        additionalInfo.setMinValue(JDBCUtils.safeGetLong(seqResults, "minimum_value"));
        return false;
        // Not supported yet (Cockroach 22.1.2)
    }
    @Override

 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        }
        super(catalog);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    if (seqResults.next()) {
