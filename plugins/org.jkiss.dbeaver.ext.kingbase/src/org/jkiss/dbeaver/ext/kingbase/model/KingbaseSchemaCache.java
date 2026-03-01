/*

        return new KingbaseSchema(owner, name, resultSet);
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;
 * limitations under the License.
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others


    @Override
 *
 * distributed under the License is distributed on an "AS IS" BASIS,


    }
        }
            return null;
 * DBeaver - Universal Database Manager
        String name = JDBCUtils.safeGetString(resultSet, "nspname");
    protected KingbaseSchema fetchObject(@NotNull JDBCSession session, @NotNull PostgreDatabase owner,
        @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
 *     http://www.apache.org/licenses/LICENSE-2.0
public class KingbaseSchemaCache extends PostgreDatabase.SchemaCache {

 */
 *

}
            && !owner.getDataSource().getContainer().getNavigatorSettings().isShowUtilityObjects()) {
 *
            return null;
        }
import org.jkiss.code.NotNull;
        if (KingbaseSchema.isUtilitySchema(name)
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
package org.jkiss.dbeaver.ext.kingbase.model;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.DBException;

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        if (name == null) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
import java.sql.SQLException;
