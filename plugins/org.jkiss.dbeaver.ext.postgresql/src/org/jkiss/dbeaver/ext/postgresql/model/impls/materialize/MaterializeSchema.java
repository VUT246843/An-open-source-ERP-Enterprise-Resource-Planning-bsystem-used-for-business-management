import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;

public class MaterializeSchema extends PostgreSchema {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
            || name.startsWith(PostgreConstants.SYSTEM_SCHEMA_PREFIX)
    }
import org.jkiss.dbeaver.ext.postgresql.model.PostgreRole;
 * Unless required by applicable law or agreed to in writing, software
        super(database, name, owner);
        return isCatalogSchema()

 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
/*
 *     http://www.apache.org/licenses/LICENSE-2.0

 *
    }
            || PostgreConstants.INFO_SCHEMA_NAME.equalsIgnoreCase(name)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.ext.postgresql.model.impls.materialize;
 * distributed under the License is distributed on an "AS IS" BASIS,
            || name.startsWith("mz_");
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSchema;
 * limitations under the License.
    @Override
 * You may obtain a copy of the License at
}
    public MaterializeSchema(PostgreDatabase database, String name, PostgreRole owner) {

import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;

 * Licensed under the Apache License, Version 2.0 (the "License");

    public MaterializeSchema(PostgreDatabase owner, String name, JDBCResultSet resultSet) throws SQLException {
 *
    }
        super(owner, name, resultSet);
 * you may not use this file except in compliance with the License.
    public boolean isSystem() {
import java.sql.SQLException;
 * DBeaver - Universal Database Manager
 */
