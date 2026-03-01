    public String getName() {
    @NotNull

 * See the License for the specific language governing permissions and
    @NotNull
    private CubridCharset charset;
/*
import org.jkiss.dbeaver.ext.cubrid.CubridConstants;
    }
        this.name = name;
    public String getDescription() {
 *     http://www.apache.org/licenses/LICENSE-2.0

 *


    protected CubridCollation(@NotNull String name) {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    public DBSObject getParentObject() {
    private CubridDataSource dataSource;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");

    }
import java.sql.SQLException;
public class CubridCollation implements DBSObject
    @NotNull
 * Unless required by applicable law or agreed to in writing, software


    public CubridCharset getCharset() {
    @NotNull

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.NotNull;
import java.sql.ResultSet;
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Nullable
 * you may not use this file except in compliance with the License.
{

    }
}
 * You may obtain a copy of the License at

        return dataSource;
 * distributed under the License is distributed on an "AS IS" BASIS,
        return true;
    }
        this.dataSource = charset.getDataSource();
 * DBeaver - Universal Database Manager
        return charset;
    @Override
    }
    public CubridDataSource getDataSource() {
        return name;
    public boolean isPersisted() {

 *
        this.name = JDBCUtils.safeGetString(dbResult, CubridConstants.COLLATION);
package org.jkiss.dbeaver.ext.cubrid.model;
    }
    protected CubridCollation(@NotNull CubridCharset charset, @NotNull ResultSet dbResult) throws SQLException {
    @NotNull
 * limitations under the License.
    @Override
        return null;
import org.jkiss.code.Nullable;
 */
    private String name;
    }
 *
import org.jkiss.dbeaver.model.struct.DBSObject;
        this.charset = charset;
        return dataSource;
