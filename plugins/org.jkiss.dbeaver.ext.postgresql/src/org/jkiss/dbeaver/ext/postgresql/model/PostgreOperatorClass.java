public class PostgreOperatorClass extends PostgreInformation {
    private long keyTypeId;
        this.ownerId = JDBCUtils.safeGetLong(dbResult, "opcowner");
    private void loadInfo(ResultSet dbResult)
import java.sql.SQLException;
package org.jkiss.dbeaver.ext.postgresql.model;
    @Property(viewable = true, order = 2)
    {
 * Unless required by applicable law or agreed to in writing, software
        return isDefault;
        this.oid = JDBCUtils.safeGetLong(dbResult, "oid");

    }
    }
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * You may obtain a copy of the License at
        super(accessMethod.getDatabase());
    {
    }
import org.jkiss.dbeaver.DBException;
    @Property(viewable = true, order = 4)
    private long ownerId;
import java.sql.ResultSet;
    @NotNull
        @Override
        return accessMethod.getDatabase().getDataType(monitor, keyTypeId);
    @Property(viewable = true, order = 7)
    private final PostgreAccessMethod accessMethod;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    private long oid;
        this.loadInfo(dbResult);

    @Property(viewable = true, order = 8)
        this.typeId = JDBCUtils.safeGetLong(dbResult, "opcintype");
        public boolean isValidValue(@NotNull PostgreOperatorClass object, @Nullable Object value) throws IllegalArgumentException {
}
            return getType(monitor);
        return accessMethod.getOperatorFamily(monitor, familyId);
    public String getName()
    {
    public long getObjectId() {
        return accessMethod.getDatabase().getSchema(monitor, namespaceId);
    public PostgreDataType getKeyType(DBRProgressMonitor monitor) {
    }
    public boolean isDefault() {

    @Property(viewable = true, order = 5, visibleIf = PostgreSupportsOpFamily.class)
        return name;
 *
    public PostgreOperatorClass(PostgreAccessMethod accessMethod, ResultSet dbResult)
    @Override
        this.isDefault = JDBCUtils.safeGetBoolean(dbResult, "opcdefault");
    private long namespaceId;

import org.jkiss.code.Nullable;
        throws SQLException
    }
        this.keyTypeId = JDBCUtils.safeGetLong(dbResult, "opckeytype");
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.familyId = JDBCUtils.safeGetLong(dbResult, "opcfamily");
    @Property(viewable = true, order = 3)
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    }
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    }

        this.namespaceId = JDBCUtils.safeGetLong(dbResult, "opcnamespace");
import org.jkiss.dbeaver.model.meta.IPropertyValueValidator;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    private String name;
 */
 * limitations under the License.
        throws SQLException
    public static class PostgreSupportsOpFamily implements IPropertyValueValidator<PostgreOperatorClass, Object> {
    @Override

        return oid;

/*

import org.jkiss.code.NotNull;
 * DBeaver - Universal Database Manager

    }
 * PostgreOperatorClass

    private boolean isDefault;
 * See the License for the specific language governing permissions and
    @Property(viewable = true, order = 1)
            return object.getDataSource().getServerType().supportsOpFamily();
    }

    public PostgreRole getOwner(DBRProgressMonitor monitor) throws DBException {

    public PostgreOperatorFamily getFamily(DBRProgressMonitor monitor) throws DBException {
/**
 * Licensed under the Apache License, Version 2.0 (the "License");
    private long typeId;
    public PostgreSchema getNamespace(DBRProgressMonitor monitor) throws DBException {
        this.accessMethod = accessMethod;


    public PostgreDataType getType(DBRProgressMonitor monitor) {
import org.jkiss.dbeaver.model.meta.Property;
        return accessMethod.getDatabase().getRoleById(monitor, ownerId);
 *
    @Property(viewable = true, order = 6)
    }

        }
 */
        this.name = JDBCUtils.safeGetString(dbResult, "opcname");
        return accessMethod.getDatabase().getDataType(monitor, typeId);
        }
    private long familyId;
        if (keyTypeId == 0) {
