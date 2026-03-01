    }
    }
    public String getDescription() {
    @Nullable
    @NotNull
import java.util.List;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
    @NotNull
import org.jkiss.code.Nullable;
        Collections.sort(collations, DBUtils.nameComparator());
        for (CubridCollation collation : collations) {
        this.dataSource = dataSource;
 */
 * You may obtain a copy of the License at
    public CubridDataSource getDataSource() {
import java.util.Collections;
import org.jkiss.dbeaver.model.struct.DBSObject;
    private CubridDataSource dataSource;

 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    @Nullable
package org.jkiss.dbeaver.ext.cubrid.model;
        return null;
        return collations;

import java.sql.ResultSet;

    public boolean isPersisted() {

    }
    public DBSObject getParentObject() {
    @Override
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
import org.jkiss.code.NotNull;
    public String getName() {
        this.name = JDBCUtils.safeGetString(dbResult, "charset_name");

        return dataSource;
    protected CubridCharset(@NotNull CubridDataSource dataSource, @NotNull ResultSet dbResult) {
    @NotNull
        return name;
 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.



    @Nullable
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    }
 * See the License for the specific language governing permissions and
        return null;
        return true;
/*
    }
 *
    }
    }
        return collations.get(0);
    @Nullable
                return collation;

            if (collation.getName().equals(name)) {
    }
    private List<CubridCollation> collations = new ArrayList<>();

{
            }
        return dataSource;
    @NotNull
    @Override
    public CubridCollation getCollation(String name) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
import java.util.ArrayList;


 * you may not use this file except in compliance with the License.
 *
        collations.add(collation);
    public List<CubridCollation> getCollations() {
 *
}

public class CubridCharset implements DBSObject
import org.jkiss.dbeaver.model.DBUtils;
    public CubridCollation getDefaultCollation() {
 * limitations under the License.
    public void addCollation(@NotNull CubridCollation collation) {
        }
    private String name;
