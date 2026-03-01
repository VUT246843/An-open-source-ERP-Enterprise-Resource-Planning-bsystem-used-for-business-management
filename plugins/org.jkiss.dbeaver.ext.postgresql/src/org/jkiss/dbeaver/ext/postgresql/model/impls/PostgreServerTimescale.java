 * You may obtain a copy of the License at
    public boolean supportsEntityMetadataInResults() {
    public String getServerTypeName() {
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 *
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

 * Unless required by applicable law or agreed to in writing, software

public class PostgreServerTimescale extends PostgreServerExtensionBase {
    }
        return true;
 *
 *
            return new TimescaleTable(schema, dbResult);
import org.jkiss.dbeaver.ext.postgresql.model.impls.timescale.TimescaleSchema;

 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
    }

    @Override
package org.jkiss.dbeaver.ext.postgresql.model.impls;
    }
import org.jkiss.dbeaver.ext.postgresql.model.*;
        protected PostgreSchema fetchObject(@NotNull JDBCSession session, @NotNull PostgreDatabase owner, @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
import org.jkiss.dbeaver.DBException;
        return new TimescaleSchemaCache();
    @Override
/*
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
}

 * Licensed under the Apache License, Version 2.0 (the "License");


            kind == PostgreClass.RelKind.p
    }
        return "Timescale";

        ) {

/**
    public boolean supportsCopyFromStdIn() {
 * PostgreServerTimescale
    public PostgreTableBase createRelationOfClass(@NotNull PostgreSchema schema, @NotNull PostgreClass.RelKind kind, @NotNull JDBCResultSet dbResult) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        @Override
    private static class TimescaleSchemaCache extends PostgreDatabase.SchemaCache {
        if (kind == PostgreClass.RelKind.r ||
            String name = JDBCUtils.safeGetString(resultSet, "nspname");
 */
    public PostgreServerTimescale(PostgreDataSource dataSource) {
    }

            return new TimescaleSchema(owner, name, resultSet);
        }
    }
            kind == PostgreClass.RelKind.t ||
        return super.createRelationOfClass(schema, kind, dbResult);
    public PostgreDatabase.SchemaCache createSchemaCache(PostgreDatabase database) {
import org.jkiss.dbeaver.ext.postgresql.model.impls.timescale.TimescaleTable;
 * limitations under the License.
    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        }
 */
import java.sql.SQLException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
        super(dataSource);
    @Override
        return true;
 * you may not use this file except in compliance with the License.
