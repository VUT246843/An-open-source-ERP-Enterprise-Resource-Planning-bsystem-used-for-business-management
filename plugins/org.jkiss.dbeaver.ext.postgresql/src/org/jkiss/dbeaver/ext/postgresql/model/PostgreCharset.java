
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
        this.loadInfo(dbResult);
    public PostgreCharset(PostgreDatabase database, ResultSet dbResult)
 * You may obtain a copy of the License at
        this.name = JDBCUtils.safeGetString(dbResult, "encname");
import java.sql.SQLException;
 * you may not use this file except in compliance with the License.
    @Override
    @NotNull
    public String getName()
 * Licensed under the Apache License, Version 2.0 (the "License");
    public long getObjectId() {
    }
        super(database);
 * PostgreCharset
import org.jkiss.code.NotNull;
package org.jkiss.dbeaver.ext.postgresql.model;
 *
/**
 * See the License for the specific language governing permissions and

        throws SQLException
 * Unless required by applicable law or agreed to in writing, software
    private String name;
        return encodingId;


 */
 *

 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
    {
    {
 * limitations under the License.

import org.jkiss.dbeaver.model.meta.Property;
import java.sql.ResultSet;
    private long encodingId;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        return name;
/*
public class PostgreCharset extends PostgreInformation {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Property(viewable = true, order = 1)
        throws SQLException
        this.encodingId = JDBCUtils.safeGetLong(dbResult, "encid");
    }
    }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    }

}
 * DBeaver - Universal Database Manager

    {
    private void loadInfo(ResultSet dbResult)
 */
