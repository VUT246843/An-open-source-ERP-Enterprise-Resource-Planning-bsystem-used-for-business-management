
    @Property(viewable = true, order = 1)

        this.type = JDBCUtils.safeGetString(dbResult, "TYPE");
    private final String license;
package org.jkiss.dbeaver.ext.mysql.model;
    @NotNull
            return DBSObjectState.ACTIVE;

    public Status getStatus() {
    }
    }
    }
 */
    }
    public void refreshObjectState(@NotNull DBRProgressMonitor monitor) {

 * Copyright (C) 2010-2024 DBeaver Corp and others
        DELETING,
        return status;
        DELETED,
        return license;
    @Property(viewable = true, order = 4)
 *
        return null;
    public enum Status {
 * DBeaver - Universal Database Manager
import java.sql.ResultSet;
    @NotNull


        return DBSObjectState.NORMAL;
        this.license = JDBCUtils.safeGetString(dbResult, "LICENSE");
 * you may not use this file except in compliance with the License.
    public String getLicense() {
    private final String library;
 * Unless required by applicable law or agreed to in writing, software

    @NotNull
        if (status == Status.ACTIVE) {
    @Override
        if (status == Status.UNKNOWN) {
 * See the License for the specific language governing permissions and
/*
import org.jkiss.dbeaver.model.DBPStatefulObject;

        INSTALLED // StarRocks
    public String getLibrary() {
    }
    public String getDescription() {

 * Licensed under the Apache License, Version 2.0 (the "License");
        super(dataSource);
        ACTIVE,
        INACTIVE,
        this.library = JDBCUtils.safeGetString(dbResult, "LIBRARY");
        this.name = JDBCUtils.safeGetString(dbResult, "NAME");
    @Override
 * You may obtain a copy of the License at
            return DBSObjectState.UNKNOWN;
    private final Status status;
import org.jkiss.code.NotNull;
    @NotNull
 * limitations under the License.
 *
    }
    }
        }
 *

    @Property(viewable = true, order = 4)
    }
        // do nothing
        return library;
    public String getName() {
    public String getType() {

import org.jkiss.dbeaver.model.struct.DBSObjectState;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    private final String type;
 *     http://www.apache.org/licenses/LICENSE-2.0
    private final String name;
        DISABLED,

import org.jkiss.dbeaver.model.meta.Property;
        return name;
    }

        UNKNOWN,
    @Nullable
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Nullable
    @NotNull
import org.jkiss.code.Nullable;
    @Override
public class MySQLPlugin extends MySQLInformation implements DBPStatefulObject {
    @Override
        }
    }
    public DBSObjectState getObjectState() {
    @Property(viewable = true, order = 3)
import org.jkiss.utils.CommonUtils;
}
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        this.status = CommonUtils.valueOf(Status.class, JDBCUtils.safeGetStringTrimmed(dbResult, "STATUS"), Status.UNKNOWN);
    @Property(viewable = true, order = 2)
    public MySQLPlugin(@NotNull MySQLDataSource dataSource, @NotNull ResultSet dbResult) {
        return type;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
