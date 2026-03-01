
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (isSupportCheckConstraint) {
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
    }
import org.jkiss.dbeaver.model.DBPScriptObject;
 * @author Chao Tian

    public GBase8sTable(GenericStructContainer container, @Nullable String tableName, @Nullable String tableType,
        boolean isSupportCheckConstraint = getDataSource().getMetaModel().supportsCheckConstraints();
    public GBase8sTable(GenericStructContainer container, String tableName, String tableCatalogName,
 * DBeaver - Universal Database Manager
import java.util.List;
 * See the License for the specific language governing permissions and
            String tableSchemaName) {
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintInfo;
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
import org.jkiss.code.NotNull;
        return result;
 */
    protected boolean isCacheDDL() {
 * you may not use this file except in compliance with the License.
    }
    }
}
 *
    @Override
    @NotNull
        }
        if (getDataSource().getMetaModel().supportsUniqueKeys()) {
public class GBase8sTable extends GenericTable {
    @Override
 */
package org.jkiss.dbeaver.ext.gbase8s.model;

 * limitations under the License.
    public boolean supportsObjectDefinitionOption(@NotNull String option) {
        result.add(DBSEntityConstraintInfo.of(DBSEntityConstraintType.PRIMARY_KEY, GBase8sUniqueKey.class));
            @Nullable JDBCResultSet dbResult) {

        super(container, tableName, tableCatalogName, tableSchemaName);
 *
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        List<DBSEntityConstraintInfo> result = new ArrayList<>();

    public List<DBSEntityConstraintInfo> getSupportedConstraints() {
import org.jkiss.code.Nullable;
        return false;
/**
    }
            result.add(DBSEntityConstraintInfo.of(DBSEntityConstraintType.CHECK, GBase8sUniqueKey.class));

 *
/*
        return DBPScriptObject.OPTION_INCLUDE_COMMENTS.equals(option);

 * Copyright (C) 2010-2025 DBeaver Corp and others
    }

import org.jkiss.dbeaver.ext.generic.model.GenericTable;

            result.add(DBSEntityConstraintInfo.of(DBSEntityConstraintType.UNIQUE_KEY, GBase8sUniqueKey.class));
        super(container, tableName, tableType, dbResult);
import java.util.ArrayList;
 * Licensed under the Apache License, Version 2.0 (the "License");
