 * You may obtain a copy of the License at
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
                try (JDBCResultSet result = dbStat.executeQuery()) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    @Override

            String sql = "select t.groups.name from db_user join table(groups) as t(groups) where name = ?";
    @Override
                    while (result.next()) {
import org.jkiss.code.NotNull;
    public String getGroups() {
    public void setDescription(String description) {
public class CubridPrivilage implements DBSObject
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    public String getName() {
            } catch (SQLException e) {
    public void setName(String name) {
        return persisted;
 * Unless required by applicable law or agreed to in writing, software
/*
        return name;
    @Override
    }
        this.name = name;

                        groups.add(JDBCUtils.safeGetString(result, "groups.name"));

import java.util.ArrayList;
 * DBeaver - Universal Database Manager
    }
        return description;

    @Nullable
    public CubridDataSource getParentObject() {
    @NotNull
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }

    public CubridDataSource getDataSource() {

 *
                    }

    private String name;
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Property(viewable = true, order = 3)
        this.name = name;
    public List<String> getRoles() {
}    @Nullable
    @Property(viewable = true, order = 1)
        return this.container;
        this.description = description;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import java.sql.SQLException;
            sql = container.wrapShardQuery(sql);



            persisted = true;
                new DBException("Load group name failed", e);
import java.util.List;
                }
        }
    @Nullable
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.meta.Property;
    @Property(viewable = true, order = 2)
    @Override
import org.jkiss.dbeaver.DBException;
    }
    public String getDescription() {
        return groups;
    }
    }

    private String description;

        return this.getDataSource();
    private List<String> groups = new ArrayList<>();
    }
        return String.join(", ", groups);

            try (JDBCPreparedStatement dbStat = dbResult.getSession().prepareStatement(sql)) {
    private CubridDataSource container;
    }
        this.container = container;
{
    }
        if (dbResult != null) {
 *
    private boolean persisted = false;

            description = JDBCUtils.safeGetString(dbResult, "comment");
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    public boolean isPersisted() {
 * distributed under the License is distributed on an "AS IS" BASIS,

    public CubridPrivilage(@NotNull CubridDataSource container, @NotNull String name, @Nullable JDBCResultSet dbResult) {
 *
 * you may not use this file except in compliance with the License.

 * limitations under the License.
            }
package org.jkiss.dbeaver.ext.cubrid.model;

                dbStat.setString(1, name);
