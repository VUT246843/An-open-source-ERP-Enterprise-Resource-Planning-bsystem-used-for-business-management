import org.jkiss.code.NotNull;
        @NotNull GenericStructContainer container,
        super(container, tableName, "TABLE", tableCatalogName, tableSchemaName);
import org.jkiss.dbeaver.model.DBPScriptObject;

    @Override
    }
        return false;
        @Nullable String tableType,

    @Override
import java.util.ArrayList;
 * Generic table
    public List<DBSEntityConstraintInfo> getSupportedConstraints() {
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");

        @NotNull String tableSchemaName
        @Nullable String tableName,
    @Override
    }
            result.add(DBSEntityConstraintInfo.of(DBSEntityConstraintType.UNIQUE_KEY, GenericUniqueKey.class));
    {
    @NotNull
}
        return ddl;
    ) {
import org.jkiss.dbeaver.model.meta.Property;
        @Nullable JDBCResultSet dbResult)
 * you may not use this file except in compliance with the License.

            result.add(DBSEntityConstraintInfo.of(DBSEntityConstraintType.CHECK, GenericTableConstraint.class));
            return !isPersisted() || getDataSource().getMetaModel().supportsTableDDLSplit(this);
 *

import java.util.List;
package org.jkiss.dbeaver.ext.generic.model;
    }
import org.jkiss.dbeaver.DBException;
    @Override
        return result;

    }
/**
public class GenericTable extends GenericTableBase implements DBPScriptObjectExt2, DBSEntityConstrainable {
 * See the License for the specific language governing permissions and
        boolean isSupportCheckConstraint = getDataSource().getMetaModel().supportsCheckConstraints();
        GenericStructContainer container,
    }
            ddl = null;

    public GenericTable(
            return DBStructUtils.generateTableDDL(monitor, this, options, false);
        if (CommonUtils.getOption(options, DBPScriptObject.OPTION_REFRESH)) {
    public boolean supportsObjectDefinitionOption(@NotNull String option) {
        @NotNull String tableCatalogName,
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        return ddl;
 * limitations under the License.
    public GenericTable(
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    // Constructor for tests
import org.jkiss.utils.CommonUtils;
            ddl = getDataSource().getMetaModel().getTableDDL(monitor, this, options);
 * Unless required by applicable law or agreed to in writing, software
 */
        if (isSupportCheckConstraint) {
 *
import org.jkiss.dbeaver.model.DBPScriptObjectExt2;
        @Nullable String tableName,
    }
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.struct.DBStructUtils;
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintInfo;
        super(container, tableName, tableType, dbResult);
        }
            // DDL split supported only by base meta model

    public boolean isView() {
    public String getDDL() {
        if (!isPersisted()) {

    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        }
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
    @Property(hidden = true, editable = true, updatable = true, order = -1)

/*
        if (getDataSource().getMetaModel().supportsUniqueKeys()) {
    protected boolean isCacheDDL() {
import java.util.Map;
        }
        if (OPTION_DDL_ONLY_FOREIGN_KEYS.equals(option) || OPTION_DDL_SKIP_FOREIGN_KEYS.equals(option)) {
        if (ddl == null || !isCacheDDL()) {
        List<DBSEntityConstraintInfo> result = new ArrayList<>();
        return true;
        }
 *

        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
        }

    private String ddl;

import org.jkiss.code.Nullable;
        return false;
 */
import org.jkiss.dbeaver.model.struct.DBSEntityConstrainable;
        result.add(DBSEntityConstraintInfo.of(DBSEntityConstraintType.PRIMARY_KEY, GenericUniqueKey.class));
