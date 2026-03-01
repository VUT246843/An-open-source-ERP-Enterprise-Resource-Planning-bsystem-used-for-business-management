    }
public class PostgreServerEdb extends PostgreServerExtensionBase {

import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 * DBeaver - Universal Database Manager
                // To avoid packages and other non-schema objects (with parents)

 * Licensed under the Apache License, Version 2.0 (the "License");
    }


    @Override
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
        super(dataSource);
            return false;
    public boolean supportsPGConstraintExpressionColumn() {
/**
        String className = object.getClass().getName();
    }
 * You may obtain a copy of the License at
import org.jkiss.code.NotNull;
            }
    }
        @Override
    @Override
    @Override
    public PostgreServerEdb(PostgreDataSource dataSource) {
    public boolean supportsEntityMetadataInResults() {
        return dataSource.isServerVersionAtLeast(8, 0);


 *
                isNspParentColumnExists = PostgreUtils.isMetaObjectExists(session, "pg_namespace", "nspparent");

        return EDB_OBJECT_CLASS.equals(className);
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public PostgreDatabase.SchemaCache createSchemaCache(PostgreDatabase database) {

                query.append("WHERE n.nspparent = 0 ");
    public static final String EDB_OBJECT_CLASS = "com.edb.util.PGobject";

    public boolean supportsRowLevelSecurity() {
 * limitations under the License.
    @Override
            if (isNspParentColumnExists == null) {
 */

    @Override
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataSource;
    @Override
    }

        return dataSource.isServerVersionAtLeast(10, 0);
package org.jkiss.dbeaver.ext.postgresql.model.impls;
        return true;
    }
 * Unless required by applicable law or agreed to in writing, software
 * PostgreServerPostgreSQL
    private class EDBSchemaCache extends PostgreDatabase.SchemaCache {
    @Override
        return new EDBSchemaCache();
        return true;
    private Boolean isNspParentColumnExists;
    }

                return true;
    public boolean supportsCopyFromStdIn() {
        return "EnterpriseDB";



    public boolean supportsEventTriggers() {
 *     http://www.apache.org/licenses/LICENSE-2.0
            // First we need to check column existing
 */
        protected boolean addExtraCondition(@NotNull JDBCSession session, @NotNull StringBuilder query) {
    }
/*
    public static final String TYPE_ID = "edb";
        }

        return dataSource.isServerVersionAtLeast(9, 3);
    public boolean isPGObject(@NotNull Object object) {
    public String getServerTypeName() {
    }
 *
 *
}
    }
            if (isNspParentColumnExists) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
