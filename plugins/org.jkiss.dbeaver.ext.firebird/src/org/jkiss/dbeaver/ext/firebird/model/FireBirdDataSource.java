 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
                        fieldName = fieldName.trim();
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.exec.DBCSession;
                        String typeName = JDBCUtils.safeGetString(dbResult, "RDB$TYPE_NAME");
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
public class FireBirdDataSource extends GenericDataSource
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;


                        if (monitor.isCanceled()) {
    @Override
    public FireBirdDataSource(DBRProgressMonitor monitor, DBPDataSourceContainer container, GenericMetaModel metaModel)
                        int fieldType = JDBCUtils.safeGetInt(dbResult, "RDB$TYPE");
 * DBeaver - Universal Database Manager

        String name;
import org.jkiss.dbeaver.ext.firebird.model.plan.FireBirdPlanAnalyser;
        MetaFieldInfo(int type, String name, String description) {
    }
    }
                        }
                        IntKeyMap<MetaFieldInfo> metaFields = this.metaFields.get(fieldName);
        super(monitor, container, metaModel, new FireBirdSQLDialect());
import org.jkiss.dbeaver.model.exec.plan.DBCPlan;
 * limitations under the License.
        if (fieldMap != null) {
        int type;
        return (List<FireBirdTable>) super.getPhysicalTables(monitor);
import java.util.HashMap;
import org.jkiss.dbeaver.Log;
    {
package org.jkiss.dbeaver.ext.firebird.model;
        return plan;

 *

    private static class MetaFieldInfo {
import java.util.Map;
		return DBCPlanStyle.PLAN;
            // Read metadata
            try (JDBCPreparedStatement dbStat = session.prepareStatement("SELECT * FROM RDB$TYPES")) {
    private static final Log log = Log.getLog(FireBirdDataSource.class);
 *     http://www.apache.org/licenses/LICENSE-2.0
        return (List<FireBirdProcedure>) super.getProcedures(monitor);
                        if (typeName == null) {
import org.jkiss.dbeaver.DBException;
import java.sql.SQLException;
                            metaFields = new IntKeyMap<>();
import org.jkiss.utils.IntKeyMap;
        }
    @Override
            }
    public List<FireBirdTable> getTables(@NotNull DBRProgressMonitor monitor) throws DBException {
    @Override

        }
            if (info != null) {
 * Unless required by applicable law or agreed to in writing, software
                        }
                            continue;
        return (List<FireBirdTable>) super.getTables(monitor);
        return null;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            MetaFieldInfo info = fieldMap.get(type);
	implements DBCQueryPlanner {
                }
 */
        // Init
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                    while (dbResult.next()) {
                        String fieldName = JDBCUtils.safeGetString(dbResult, "RDB$FIELD_NAME");

 * distributed under the License is distributed on an "AS IS" BASIS,


            this.type = type;
        // Read metadata
    public String getMetaFieldValue(String name, int type) {
    }
 *
    }
import java.util.List;
            return name + ":" + type;
    private Map<String, IntKeyMap<MetaFieldInfo>> metaFields = new HashMap<>();
	}
	}

    public Class<? extends DBSObject> getPrimaryChildType(@Nullable DBRProgressMonitor monitor) throws DBException {
    }
import org.jkiss.code.Nullable;
                monitor.subTask("Load Firebird types");


                        }
        super.initialize(monitor);
    @NotNull
 * you may not use this file except in compliance with the License.
            this.description = description;
        throws DBException
                return info.name;

        public String toString() {
    @Override
        plan.explain();
        } catch (SQLException ex) {

        return FireBirdTable.class;
        }
 * See the License for the specific language governing permissions and

 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
import org.jkiss.dbeaver.model.exec.plan.DBCPlanStyle;
    public void initialize(@NotNull DBRProgressMonitor monitor) throws DBException {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Read generic metadata")) {
                            this.metaFields.put(fieldName, metaFields);
import org.jkiss.dbeaver.model.exec.plan.DBCQueryPlannerConfiguration;
        @Override
    }
                        if (metaFields == null) {
	@NotNull
                    }
    }
/*
                        metaFields.put(fieldType, new MetaFieldInfo(fieldType, typeName, fieldDescription));
            }
    @Override
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
                        if (fieldName == null) {
 *
        IntKeyMap<MetaFieldInfo> fieldMap = metaFields.get(name);
                            continue;

	public DBCPlanStyle getPlanStyle() {
	public DBCPlan planQueryExecution(@NotNull DBCSession session, @NotNull String query, @NotNull DBCQueryPlannerConfiguration configuration) throws DBException {

import org.jkiss.dbeaver.model.struct.DBSObject;
    public List<FireBirdProcedure> getProcedures(@NotNull DBRProgressMonitor monitor) throws DBException {
import org.jkiss.dbeaver.model.exec.plan.DBCQueryPlanner;
    public List<FireBirdTable> getPhysicalTables(@NotNull DBRProgressMonitor monitor) throws DBException {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    @Override
            log.error("Error reading FB metadata", ex);
        }
	@NotNull
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
                        typeName = typeName.trim();
		FireBirdPlanAnalyser plan = new FireBirdPlanAnalyser(this, (JDBCSession) session, query);


        String description;
            this.name = name;
                        String fieldDescription = JDBCUtils.safeGetString(dbResult, "RDB$SYSTEM_FLAG");
}
                        }
                            break;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    }
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.DBUtils;
