
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.struct.DBSEntityConstraint;

        super(table, constraintSource, persisted);
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
    }
        return DBStructUtils.generateObjectDDL(monitor, this, options, false);
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;

    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    @NotNull
/*
package org.jkiss.dbeaver.ext.mysql.model;
 *
 * DBeaver - Universal Database Manager
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 *
import org.jkiss.dbeaver.model.struct.DBStructUtils;
    }
        throw new DBException("Constraints DDL is read-only");
import org.jkiss.code.NotNull;
        super(table, name, description, constraintType, persisted);

public abstract class MySQLTableConstraintBase extends JDBCTableConstraint<MySQLTable, MySQLTableConstraintColumn> implements MySQLSourceObject {
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTableConstraint;
        super(table, name, description, constraintType, persisted);
    @Override

import org.jkiss.dbeaver.DBException;

        return getTable().getDataSource();

 * See the License for the specific language governing permissions and
    @NotNull
    public MySQLTableConstraintBase(MySQLTable table, DBSEntityConstraint constraintSource, boolean persisted) {
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    public MySQLTableConstraintBase(MySQLTable table, String name, String description, DBSEntityConstraintType constraintType, boolean persisted, JDBCResultSet resultSet) {
import org.jkiss.dbeaver.model.DBUtils;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    @Override
    public MySQLTableConstraintBase(MySQLTable table, String name, String description, DBSEntityConstraintType constraintType, boolean persisted) {
    }
    }
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.DBPDataSource;

 * You may obtain a copy of the License at
                this);
 */
}
 * limitations under the License.
 *
    public void setObjectDefinitionText(String sourceText) throws DBException {
    public DBPDataSource getDataSource() {
                getTable().getContainer(),
    }

import java.util.Map;
        return DBUtils.getFullQualifiedName(getDataSource(),
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override
                getTable(),

