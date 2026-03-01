
import org.jkiss.dbeaver.DBDatabaseException;
    }
            }
    private boolean isInfoLoaded;
        return body;
 *
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;

        }
            } catch (SQLException | DBCException e) {
        return DBUtils.getFullQualifiedName(getDataSource(),

    }
    public Number getCache(DBRProgressMonitor monitor) {
        // SELECT LASTVAL(name)

            loadInfo(monitor);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import org.jkiss.code.Nullable;
        } else if (body == null && !CommonUtils.isEmpty(name)) {
            if (incrementBy != null) {

        }
    public Number getMaxValue() {
        if (maxValue == null) {
            if (minValue != null && minValue.longValue() != MIN_SEQUENCE_VALUE) {
        return cacheSize;
import org.jkiss.dbeaver.model.meta.Property;
    }
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    public String getName() {
    private Number startValue;
    public MySQLSequence(@NotNull MySQLCatalog mySQLCatalog, String sequenceName) {
            }
                            startValue = CommonUtils.toLong(JDBCUtils.safeGetObject(dbResult, "start_value"));
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
    public Number getIncrementBy() {
    private Number incrementBy;
        return sequenceCatalog;

    @NotNull

                            if (cycleOption == 1) {
    }
            loadInfo(monitor);
            }
        return sequenceCatalog;

    public MySQLSequence(@NotNull MySQLCatalog mySQLCatalog, String sequenceName, boolean persisted) {
 * DBeaver - Universal Database Manager
        minValue = 1;
        return maxValue;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.DBPQualifiedObject;
import org.jkiss.dbeaver.model.DBPDataSource;
            loadInfo(monitor);
    @Property(hidden = true, editable = true, updatable = true)
                    }
    private String body;
                            body = "-- Sequence definition not found in catalog";
                throw new DBDatabaseException(e, getDataSource());
                }
    @Override
import org.jkiss.dbeaver.DBException;
            if (maxValue != null && maxValue.longValue() != MAX_SEQUENCE_VALUE) {
        this.name = sequenceName;
    public Number getIncrementBy(DBRProgressMonitor monitor) {
        }
                sequenceCatalog,
    public Number getMinValue() {
import java.util.Map;
    @Property(viewable = true, order = 3)
                log.debug("Error reading sequence info", e);

                        if (dbResult != null && dbResult.nextRow()) {
                sb.append("MAXVALUE ").append(getMaxValue()).append(" ");
        if (startValue == null) {
    }
        }
    public DBSObject getParentObject() {
            } else {
                    try (JDBCResultSet dbResult = dbStat.executeQuery()) {
        this.name = name;
public class MySQLSequence implements DBSSequence, MySQLSourceObject, DBPQualifiedObject {
        }
        body = sourceText;
                            if (!CommonUtils.isEmpty(sequenceDDL)) {
 * limitations under the License.
    private Number maxValue;

    public void setName(String name) {
        this.name = sequenceName;
                    try (JDBCResultSet dbResult = dbStat.executeQuery("SELECT * FROM " + getFullyQualifiedName(DBPEvaluationContext.DDL))) {
        isCycle = false;
    private Number cacheSize;
        maxValue = MAX_SEQUENCE_VALUE;
    private boolean isCycle;
                        if (dbResult.next()) {
    private static final Log log = Log.getLog(MySQLSequence.class);
    public boolean isPersisted() {
    private final long MIN_SEQUENCE_VALUE = -9223372036854775807L;
    @Override
    @Nullable
    private boolean isPersisted;
                body = "-- " + e.getMessage();
        this.sequenceCatalog = mySQLCatalog;
                            }
            if (isCycle) {

    }


    @NotNull
        if (body == null && isPersisted) {

        incrementBy = 1;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
                try (JDBCStatement dbStat = session.createStatement()) {
            loadInfo(monitor);
            }
        return incrementBy;
            return sb.toString();
        }
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
    @Override
        return isCycle;
    }

        return null;
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
package org.jkiss.dbeaver.ext.mysql.model;

    public Number getLastValue() {
    @Override
                sb.append("MINVALUE ").append(getMinValue()).append(" ");
                            int cycleOption = JDBCUtils.safeGetInt(dbResult, "cycle_option");
    public MySQLCatalog getCatalog() {
        return maxValue;
        return startValue;
    @Override
        if (cacheSize == null) {
 *
    private void loadInfo(DBRProgressMonitor monitor) {
            }

    }
            loadInfo(monitor);
    }

    }
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
    private final long MAX_SEQUENCE_VALUE = 9223372036854775806L;
    @Property(viewable = true, order = 1)

    public String getDescription() {
                        }

                this);

    }
    public Number getMaxValue(DBRProgressMonitor monitor) {
 * Unless required by applicable law or agreed to in writing, software

        this.isPersisted = true;
                            cacheSize = CommonUtils.toLong(JDBCUtils.safeGetObject(dbResult, "cache_size"));
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.struct.DBSObject;

    @Override
                            minValue = CommonUtils.toLong(JDBCUtils.safeGetObject(dbResult, "minimum_value"));
import org.jkiss.dbeaver.model.struct.rdb.DBSSequence;
        return incrementBy;
 * you may not use this file except in compliance with the License.
        return minValue;
        return isPersisted;
        return name;
    public DBPDataSource getDataSource() {
    @Nullable
        this.isPersisted = persisted;
    }
                sb.append("CYCLE ");
    @Property(viewable = true, order = 4)
 *
    private MySQLCatalog sequenceCatalog;


    public Number getStartValue(DBRProgressMonitor monitor) {
        if (incrementBy == null) {
        return sequenceCatalog.getDataSource();
    }
        if (minValue == null) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    }
                            }
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.Log;
                            maxValue = CommonUtils.toLong(JDBCUtils.safeGetObject(dbResult, "maximum_value"));
        if (!isInfoLoaded && !CommonUtils.isEmpty(name)) {
    }
                            isInfoLoaded = true;
        this.sequenceCatalog = mySQLCatalog;
                            incrementBy = CommonUtils.toLong(JDBCUtils.safeGetObject(dbResult, "increment"));
                            String sequenceDDL = JDBCUtils.safeGetString(dbResult, "Create Table");
            } catch (SQLException e) {
    @Property(viewable = true, order = 2)
            sb.append("CREATE OR REPLACE SEQUENCE ").append(getFullyQualifiedName(DBPEvaluationContext.DDL)).append(" ");
    @Property(viewable = true, order = 5)
    public void setObjectDefinitionText(String sourceText) throws DBException {
import org.jkiss.code.NotNull;
    @Override
    @NotNull
        }
 */
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override

    @Property(viewable = true, order = 6)
    }
 * You may obtain a copy of the License at
            try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load sequence info")) {
    }
            }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

/*
    @Override
            try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Read sequence declaration")) {
                    }
                                isCycle = true;
import java.sql.SQLException;
    @NotNull
    @Override
                try (JDBCPreparedStatement dbStat = session.prepareStatement("SHOW CREATE SEQUENCE " + getFullyQualifiedName(DBPEvaluationContext.DDL))) {
    @Override
    }
                sb.append("CACHE ").append(cacheSize).append(" ");
        return null;

            if (cacheSize != null && cacheSize.longValue() != 1000) {
 * See the License for the specific language governing permissions and
    }
                sb.append("INCREMENT BY ").append(getIncrementBy()).append(" ");
        cacheSize = 1000;
import org.jkiss.dbeaver.model.exec.DBCException;
    private String name;
    @Property(viewable = true, order = 7)
    public boolean isCycle(DBRProgressMonitor monitor) {
        return minValue;
                        } else {
                                body = sequenceDDL.replaceAll("CREATE SEQUENCE", "CREATE OR REPLACE SEQUENCE");
    }
    private Number minValue;

            StringBuilder sb = new StringBuilder();
            }
                }
import org.jkiss.dbeaver.model.DBUtils;

}
                sb.append("NOCYCLE ");
    }
    public Number getMinValue(DBRProgressMonitor monitor) {
    @Override
                        }
