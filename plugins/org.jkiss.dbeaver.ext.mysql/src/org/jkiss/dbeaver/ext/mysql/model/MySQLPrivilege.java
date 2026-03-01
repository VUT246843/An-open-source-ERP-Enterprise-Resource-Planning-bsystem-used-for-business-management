        } else if (context.contains("Databases")) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return name;
    {
 * DBeaver - Universal Database Manager
    private final Kind kind;

    }
        }
    public MySQLPrivilege(MySQLDataSource dataSource, String name, String context, String comment, Kind kind) {
        this.name = name;
        this.dataSource = dataSource;
import org.jkiss.dbeaver.Log;
    }
 *
        this.dataSource = dataSource;
            kind = Kind.ADMIN;
//    @Property(name = "Description", viewable = true, order = 100)
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
    private final String context;
 *
    }
{

        this.comment = comment;
    private static final Log log = Log.getLog(MySQLPrivilege.class);

        }
    }

    public String toString() {

import org.jkiss.code.Nullable;
    }

        return context;
    }
    public enum Kind {

    public static final String ALL_PRIVILEGES = "All Privileges";
    private final String comment;
            kind = Kind.DDL;
    }

import org.jkiss.dbeaver.model.meta.Property;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 * distributed under the License is distributed on an "AS IS" BASIS,
        return dataSource;

        return comment;
    @Override

 *
    public static final String GRANT_PRIVILEGE = "Grant Option";
    @Override
        BAD_PRIV_NAME_MAP.put("Delete versioning rows", "Delete history");
    @Property(viewable = true, order = 1)
package org.jkiss.dbeaver.ext.mysql.model;
    @Property(viewable = true, order = 2)
    @Override
    private final String name;
        this.comment = JDBCUtils.safeGetString(resultSet, "comment");

    public String getDescription() {

import org.jkiss.dbeaver.model.access.DBAPrivilege;
import java.util.Map;
    public String getContext()


 */
        OBJECTS,
 * limitations under the License.
        DDL,
    static {

import java.sql.ResultSet;
 *     http://www.apache.org/licenses/LICENSE-2.0
        ADMIN,
public class MySQLPrivilege implements DBAPrivilege
 * You may obtain a copy of the License at
    private final MySQLDataSource dataSource;
 * See the License for the specific language governing permissions and
    {
    public boolean isPersisted()

        return name;
    @Override
 */
            kind = Kind.MISC;
    @NotNull
    public DBSObject getParentObject() {
    }
        return kind;
        this.context = context;
/**
    public static final Map<String, String> BAD_PRIV_NAME_MAP = new HashMap<>();
            return fixedName;
    }
    {
    public MySQLPrivilege(@NotNull MySQLDataSource dataSource, @NotNull String context, @NotNull ResultSet resultSet) {
        return name.equalsIgnoreCase(GRANT_PRIVILEGE);
 * you may not use this file except in compliance with the License.

    

import java.util.HashMap;
 * Unless required by applicable law or agreed to in writing, software
    }
/*
    {

    }
        this.kind = kind;
    public String getFixedPrivilegeName() {
        } else {
import org.jkiss.code.NotNull;
    }
    @Override
}
        return true;
        if (fixedName != null) {

        this.context = context;
    }
        if (context.contains("Admin") || context.contains("server") || context.contains("Server")) {
    @NotNull
        } else if (context.contains("Tables")) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.struct.DBSObject;
    }
    public String getName() {
    @Override
    public JDBCDataSource getDataSource() {
        String fixedName = BAD_PRIV_NAME_MAP.get(name);
    @Nullable
        this.name = JDBCUtils.safeGetString(resultSet, "privilege");
 * Licensed under the Apache License, Version 2.0 (the "License");
        return dataSource;
            kind = Kind.OBJECTS;
    public Kind getKind()
 * MySQLPrivilege
        return name;
        MISC
    public boolean isGrantOption()
