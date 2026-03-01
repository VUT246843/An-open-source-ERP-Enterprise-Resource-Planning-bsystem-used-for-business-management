
        this.database = database;

    }
    }
    public PostgreDatabase getDatabase() {
}
    private PostgreDatabase database;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 *
        this.enumSortOrder = JDBCUtils.safeGetLong(dbResult, "enumsortorder");


    private PostgreDataSource dataSource;
        this.dataSource = dataSource;
        return enumSortOrder;
        return dataSource;
    }
        this.enumTypId = JDBCUtils.safeGetLong(dbResult, "enumtypid");
    }
    @Override
public class PostgreEnumValue implements PostgreObject {
 * Copyright (C) 2010-2024 DBeaver Corp and others

    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    private long enumSortOrder;
        this.enumLabel = JDBCUtils.safeGetString(dbResult, "enumlabel");
    public String getName() {
    }
    @NotNull
    @Override
        return enumLabel;
/*
 * You may obtain a copy of the License at
    }

 * Licensed under the Apache License, Version 2.0 (the "License");
    public long getEnumSortOrder() {
        return enumTypId;
    }
    public long getObjectId() {

import org.jkiss.dbeaver.model.struct.DBSObject;
package org.jkiss.dbeaver.ext.postgresql.model;

 * See the License for the specific language governing permissions and
    @Nullable
    }
    private long enumTypId;
    }
 * DBeaver - Universal Database Manager
    public PostgreDataSource getDataSource() {
    @Override
 */
    @Override
    @Nullable
 * you may not use this file except in compliance with the License.
    @NotNull
    }

 * Unless required by applicable law or agreed to in writing, software

        return null;
    @NotNull
 * distributed under the License is distributed on an "AS IS" BASIS,
    private String enumLabel;
        return CommonUtils.toString(enumTypId);

    public String getDescription() {

import org.jkiss.code.Nullable;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public String getEnumLabel() {
        return database;
    public PostgreEnumValue(@NotNull PostgreDataSource dataSource, @NotNull PostgreDatabase database, @NotNull JDBCResultSet dbResult) {
    @Override
        return database;

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

 * limitations under the License.
    public long getEnumTypId() {
    @Override
        return true;
        this.oid = JDBCUtils.safeGetLong(dbResult, "oid");
    private long oid;
 *
import org.jkiss.utils.CommonUtils;
        return oid;
    public boolean isPersisted() {
    public long getOid() {
    }

    @Override
    public DBSObject getParentObject() {
        return oid;
import org.jkiss.code.NotNull;
 *
