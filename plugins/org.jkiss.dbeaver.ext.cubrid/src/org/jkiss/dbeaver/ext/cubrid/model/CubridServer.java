        return persisted;
    }
    public void setProperties(@Nullable String properties) {
    public CubridServer(@NotNull CubridDataSource container, @NotNull JDBCResultSet dbResult) {
    private String host;
    }

    public DBSObject getParentObject() {
 */
}
    public void setUserName(@NotNull String userName) {
    }
 * you may not use this file except in compliance with the License.

    @Property(viewable = true, editable = true, updatable = true, order = 70)
 * You may obtain a copy of the License at
        this.name = JDBCUtils.safeGetString(dbResult, "link_name");

        this.dbName = JDBCUtils.safeGetString(dbResult, "db_name");

    private String userName;
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.persisted = true;

        return name;
    private CubridUser owner;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

 * See the License for the specific language governing permissions and
    }
    }
 * limitations under the License.
        this.port = port;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Property(viewable = true, editable = true, updatable = true, order = 30)

    private String properties;
    public void setPassword(@Nullable String password) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    public void setDescription(@Nullable String description) {
    @Override
    }

import org.jkiss.code.Nullable;
    @Property(viewable = true, editable = true, updatable = true, order = 40)
    public CubridServer(@NotNull CubridDataSource container, String name) {
        this.persisted = false;
    public boolean isPersisted() {
    @Property(viewable = true, order = 10)
    public String getName() {
    private CubridDataSource container;
        this.properties = JDBCUtils.safeGetString(dbResult, "properties");
        this.host = CubridConstants.DEFAULT_HOST;

    }

    @NotNull
 *
    private String description;
import org.jkiss.dbeaver.model.meta.PropertyLength;
    public String getDbName() {
    @Property(viewable = true, password = true, editable = true, updatable = true, order = 60)
        this.host = host;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import org.jkiss.dbeaver.model.meta.Property;
    @Override
    @Nullable
    @Nullable
    public String getPort() {
    @Property(viewable = true, editable = true, updatable = true, length = PropertyLength.MULTILINE, order = 80)
        return container;
    }
        this.name = name;
        this.container = container;
    @NotNull

    @NotNull
        this.port = CubridConstants.DEFAULT_PORT;
        this.name = name;
        this.description = JDBCUtils.safeGetString(dbResult, CubridConstants.COMMENT);
    }

        return owner;
 * Copyright (C) 2010-2024 DBeaver Corp and others


package org.jkiss.dbeaver.ext.cubrid.model;

    }
    @NotNull
        return container;

    @Override
    }
        this.dbName = dbName;
        this.host = JDBCUtils.safeGetString(dbResult, "host");
import org.jkiss.dbeaver.model.struct.DBSObject;
    }
    @Nullable
    @Override

        return userName;

    public void setDbName(@NotNull String dbName) {
    @NotNull
    }
        this.container = container;
        this.owner = (CubridUser) container.getSchema(JDBCUtils.safeGetString(dbResult, "owner"));

public class CubridServer implements DBSObject, DBPNamedObject2 {
    }

    public void setHost(@NotNull String host) {
    public CubridDataSource getDataSource() {
    @NotNull
 * DBeaver - Universal Database Manager
        this.description = description;
    public String getPassword() {
    }
    @NotNull
    }
    public String getDescription() {
import org.jkiss.code.NotNull;
        return password;
    public String getProperties() {


        this.password = password;
    private String dbName;
    public String getHost() {
        this.userName = userName;

    }
        this.userName = JDBCUtils.safeGetString(dbResult, "user_name");
    }
    @Property(viewable = true, editable = true, updatable = true, order = 20)
    private String port;
    }
        this.port = JDBCUtils.safeGetString(dbResult, "port");
        return description;
    private String name;
 *
    }
        this.owner = (CubridUser) container.getSchema(getDataSource().getContainer().getConnectionConfiguration().getUserName().toUpperCase());
        this.properties = properties;
    public void setPort(@NotNull String port) {
import org.jkiss.dbeaver.model.DBPNamedObject2;
        return host;
    private String password;

    public String getUserName() {
        return dbName;
 *
 * Unless required by applicable law or agreed to in writing, software
/*
    private boolean persisted;
        return port;
    public void setName(@NotNull String name) {
    }
    public CubridUser getOwner() {
        return properties;
    @Property(viewable = true, editable = true, updatable = true, order = 50)
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Property(viewable = true, editable = true, updatable = true, order = 1)
    }
import org.jkiss.dbeaver.ext.cubrid.CubridConstants;
