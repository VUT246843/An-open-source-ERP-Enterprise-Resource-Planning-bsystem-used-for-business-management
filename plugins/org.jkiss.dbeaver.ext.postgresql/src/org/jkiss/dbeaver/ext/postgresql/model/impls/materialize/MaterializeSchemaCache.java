 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * You may obtain a copy of the License at
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
            @NotNull JDBCResultSet resultSet) throws SQLException {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 * you may not use this file except in compliance with the License.
            
public class MaterializeSchemaCache extends PostgreDatabase.SchemaCache {
/*
        String name = JDBCUtils.safeGetString(resultSet, "nspname");

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
            return null;

package org.jkiss.dbeaver.ext.postgresql.model.impls.materialize;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        if (name == null) {
    }
}
 * Unless required by applicable law or agreed to in writing, software
 */
        }
            return null;
 * DBeaver - Universal Database Manager
import java.sql.SQLException;
import org.jkiss.code.NotNull;
        return new MaterializeSchema(owner, name, resultSet);
        }
        if (MaterializeSchema.isUtilitySchema(name) && !owner.getDataSource().getContainer().getNavigatorSettings().isShowUtilityObjects()) {
 *
    protected MaterializeSchema fetchObject(@NotNull JDBCSession session, @NotNull PostgreDatabase owner,
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;
