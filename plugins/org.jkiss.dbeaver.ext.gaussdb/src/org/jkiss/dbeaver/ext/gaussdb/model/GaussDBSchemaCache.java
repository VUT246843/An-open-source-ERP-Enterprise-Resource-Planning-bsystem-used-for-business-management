 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
        @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
 */
        if (name == null) {
 *
public class GaussDBSchemaCache extends PostgreDatabase.SchemaCache {
        }
 * limitations under the License.
 *
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
            return null;

        return new GaussDBSchema(owner, name, resultSet);
    @Override
}
import org.jkiss.dbeaver.DBException;
import java.sql.SQLException;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    }
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;
/*
            return null;


import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;

 * DBeaver - Universal Database Manager
        }
    protected GaussDBSchema fetchObject(@NotNull JDBCSession session, @NotNull PostgreDatabase owner,
            && !owner.getDataSource().getContainer().getNavigatorSettings().isShowUtilityObjects()) {
        if (GaussDBSchema.isUtilitySchema(name)
 * distributed under the License is distributed on an "AS IS" BASIS,
        String name = JDBCUtils.safeGetString(resultSet, "nspname");
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.ext.gaussdb.model;
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software


