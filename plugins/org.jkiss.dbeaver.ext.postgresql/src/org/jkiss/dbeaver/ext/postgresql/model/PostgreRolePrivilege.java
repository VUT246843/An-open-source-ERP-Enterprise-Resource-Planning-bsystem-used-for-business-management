    }

        List<PostgrePrivilegeGrant> privileges

        }
        String objectName,
 * Copyright (C) 2010-2024 DBeaver Corp and others
        if (schema != null) {
    }
    }
import java.util.List;
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");

 * limitations under the License.
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTable;
    public PostgreRolePrivilege(
        this.schemaName = schemaName;
            (kind == PostgrePrivilegeGrant.Kind.SCHEMA ? "" :
 */
    @Override
 */

import org.jkiss.dbeaver.model.DBUtils;
/**
    public String getName() {
        return objectName;
        if (o instanceof PostgreRolePrivilege) {
    }
 * Unless required by applicable law or agreed to in writing, software
        }
    public String getObjectName() {
                        DBUtils.getQuotedIdentifier(getDataSource(), objectName))));
            JDBCTable childTable = schema.getChild(monitor, objectName);
public class PostgreRolePrivilege extends PostgrePrivilege {
    private final String objectName;

        return getFullObjectName();
        PostgrePrivilegeGrant.Kind kind,
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.ext.postgresql.model;
            return res != 0 ? res : CommonUtils.compare(objectName, ((PostgreRolePrivilege)o).objectName);
        PostgrePrivilegeOwner owner,
 * PostgreRolePrivilege
        return getFullObjectName();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

    }
import org.jkiss.dbeaver.Log;
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


    public String getFullObjectName() {
        return null;
    public void setKind(PostgrePrivilegeGrant.Kind kind) {
    public PostgreObject getTargetObject(DBRProgressMonitor monitor) throws DBException {
 *

        return schemaName;
}
                ("." + (kind == PostgrePrivilegeGrant.Kind.FUNCTION || kind == PostgrePrivilegeGrant.Kind.PROCEDURE ? objectName :
            return childTable instanceof PostgreObject ? (PostgreObject) childTable : null;
    ) {
import org.jkiss.dbeaver.model.meta.Property;
    private final String schemaName;
    public String toString() {
 *
        super(owner, privileges);
import org.jkiss.code.NotNull;
        return kind;
    @NotNull
        String schemaName,
 * distributed under the License is distributed on an "AS IS" BASIS,
    public int compareTo(@NotNull PostgrePrivilege o) {
/*
 * DBeaver - Universal Database Manager
    public String getSchemaName() {
        return 0;
    }
        this.objectName = objectName;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        this.kind = kind;
import org.jkiss.dbeaver.DBException;
 *
    @Property(viewable = true, order = 1)
        final PostgreSchema schema = owner.getDatabase().getSchema(monitor, schemaName);
    }
    }


    }


        return DBUtils.getQuotedIdentifier(getDataSource(), schemaName) +

    private PostgrePrivilegeGrant.Kind kind;

            final int res = schemaName.compareTo(((PostgreRolePrivilege)o).schemaName);
    @Override
        this.kind = kind;
    public PostgrePrivilegeGrant.Kind getKind() {

 * You may obtain a copy of the License at
