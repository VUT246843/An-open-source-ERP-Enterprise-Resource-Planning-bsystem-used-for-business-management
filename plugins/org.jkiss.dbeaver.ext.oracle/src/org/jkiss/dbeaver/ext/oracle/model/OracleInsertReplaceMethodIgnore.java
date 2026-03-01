 * See the License for the specific language governing permissions and
    private static final Log log = Log.getLog(OracleInsertReplaceMethodIgnore.class);

    }
import org.jkiss.dbeaver.Log;
    public String getOpeningClause(DBSTable table, DBRProgressMonitor monitor) {
 *

    @NotNull
import org.jkiss.dbeaver.model.data.DBDInsertReplaceMethod;
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
                    if (tableConstraint.isPresent()) {
 *
        }
                }
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0

import java.util.Collection;
 * distributed under the License is distributed on an "AS IS" BASIS,

 * DBeaver - Universal Database Manager
        if (table != null) {
                            .stream().filter(key -> key.getConstraintType() == DBSEntityConstraintType.PRIMARY_KEY).findFirst();
                Collection<? extends DBSTableConstraint> constraints = table.getConstraints(monitor);
import org.jkiss.utils.CommonUtils;
public class OracleInsertReplaceMethodIgnore implements DBDInsertReplaceMethod {
                if (!CommonUtils.isEmpty(constraints)) {
                        DBSTableConstraint constraint = tableConstraint.get();
            } catch (DBException e) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public String getTrailingClause(DBSTable table, DBRProgressMonitor monitor, DBSAttributeBase[] attributes) {
 */
import java.util.Optional;
    @Override
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;
import org.jkiss.dbeaver.model.struct.rdb.DBSTableConstraint;

    @Override
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    }
 * you may not use this file except in compliance with the License.
    }
                log.debug("Can't read table constraints list");
                        return "INSERT /*+ IGNORE_ROW_ON_DUPKEY_INDEX(" + table.getName() + ", " + constraint.getName() + ") */ INTO";
 * limitations under the License.
            try {
        return "INSERT INTO";
        return null;
package org.jkiss.dbeaver.ext.oracle.model;
            }
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
}
import org.jkiss.dbeaver.DBException;
                    Optional<? extends DBSTableConstraint> tableConstraint = constraints
 *
