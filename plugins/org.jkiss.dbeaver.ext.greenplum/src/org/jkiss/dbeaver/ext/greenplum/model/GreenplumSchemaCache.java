 * Licensed under the Apache License, Version 2.0 (the "License");
    protected GreenplumSchema fetchObject(@NotNull JDBCSession session,
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
package org.jkiss.dbeaver.ext.greenplum.model;
 * Copyright (C) 2019 Zach Marcin (zmarcin@pivotal.io)
 * You may obtain a copy of the License at
        String name = JDBCUtils.safeGetString(resultSet, "nspname");
public class GreenplumSchemaCache extends PostgreDatabase.SchemaCache {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


        return new GreenplumSchema(owner, name, resultSet);
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
            return null;
 * Unless required by applicable law or agreed to in writing, software
 *
import org.jkiss.code.NotNull;
        }
        }
        if (name == null) {
                                          @NotNull PostgreDatabase owner,
 * Copyright (C) 2019 Nikhil Pawar (npawar@pivotal.io)
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                                          @NotNull JDBCResultSet resultSet) throws SQLException {
 * Copyright (C) 2019 Dmitriy Dubson (ddubson@pivotal.io)
/*
 * DBeaver - Universal Database Manager
            return null;
}
    @Override

        if (GreenplumSchema.isUtilitySchema(name) && !owner.getDataSource().getContainer().getNavigatorSettings().isShowUtilityObjects()) {
 * you may not use this file except in compliance with the License.
 *
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.sql.SQLException;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 * Copyright (C) 2019 Gavin Shaw (gshaw@pivotal.io)

 *
 */
