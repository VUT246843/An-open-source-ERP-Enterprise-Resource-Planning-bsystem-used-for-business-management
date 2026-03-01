import org.jkiss.dbeaver.model.DBPEvaluationContext;
    private static final String DISABLE_REFERENTIAL_INTEGRITY_STATEMENT = "ALTER TABLE ? DISABLE TRIGGER ALL";
import org.jkiss.dbeaver.DBException;
public class PostgreTableRegular extends PostgreTable implements DBPReferentialIntegrityController {
    }
        } catch (SQLException e) {
    private static final String ENABLE_REFERENTIAL_INTEGRITY_STATEMENT = "ALTER TABLE ? ENABLE TRIGGER ALL";
            JDBCUtils.executeInMetaSession(monitor, this, "Changing referential integrity", sql);
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 */
    }
    @Override
        }
        }
        sql = sql.replace("?", getFullyQualifiedName(DBPEvaluationContext.DDL));
        if (sql == null) {
 *
/*
 * See the License for the specific language governing permissions and
        if (!supportsChangingReferentialIntegrity(monitor)) {
        return RelationalObjectType.TYPE_TABLE;
/**
    }
package org.jkiss.dbeaver.ext.postgresql.model;
    @Override
 *
    public PostgreTableRegular(PostgreSchema catalog) {
        try {
    public PostgreTableRegular(PostgreSchema catalog, ResultSet dbResult) {
}

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *
import org.jkiss.code.Nullable;
        super(catalog);
    public DBSObjectType getObjectType() {
 * Unless required by applicable law or agreed to in writing, software

        }
    @Override
    }
import org.jkiss.code.NotNull;

        String sql = getChangeReferentialIntegrityStatement(monitor, enable);
        super(catalog, dbResult);
    }
    public boolean supportsChangingReferentialIntegrity(@NotNull DBRProgressMonitor monitor) {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
            return;

 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at

    }
    public String getChangeReferentialIntegrityStatement(@NotNull DBRProgressMonitor monitor, boolean enable) {
    @NotNull
        }

            return null;

            return ENABLE_REFERENTIAL_INTEGRITY_STATEMENT;
    public PostgreTableRegular(DBRProgressMonitor monitor, PostgreSchema catalog, PostgreTableRegular source) throws DBException {
    @Override
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.DBPReferentialIntegrityController;
    @Nullable
import org.jkiss.dbeaver.model.struct.DBSObjectType;

import org.jkiss.dbeaver.model.impl.struct.RelationalObjectType;
        super(monitor, catalog, source, false);
 * Copyright (C) 2010-2024 DBeaver Corp and others
            throw new DBException("Unable to change referential integrity", e);
        if (enable) {
        return DISABLE_REFERENTIAL_INTEGRITY_STATEMENT;
        return getDataSource().getServerType().supportsDisablingAllTriggers();
 * DBeaver - Universal Database Manager
 * PostgreTableRegular
import java.sql.ResultSet;
 */
    public void enableReferentialIntegrity(@NotNull DBRProgressMonitor monitor, boolean enable) throws DBException {
import java.sql.SQLException;

    }
