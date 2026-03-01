/*
 * Licensed under the Apache License, Version 2.0 (the "License");
        return privilegeType;
    public Kind getKind() {
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ext.postgresql.model;
        return withHierarchy;
    public PostgrePrivilegeType getPrivilegeType() {
    }

 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        return grantor;
        return grantee;
    public boolean isGrantable() {
 * you may not use this file except in compliance with the License.
    }
                break;
        FUNCTION,
 * You may obtain a copy of the License at
    public PostgreRoleReference getGrantee() {

import java.sql.SQLException;
    public String getObjectSchema() {
    public String getObjectName() {
            case PROCEDURE:
                this.objectSchema = JDBCUtils.safeGetString(dbResult, "specific_schema");

    public String getObjectCatalog() {
                this.objectCatalog = JDBCUtils.safeGetString(dbResult, "specific_catalog");
    private String objectCatalog;
        SEQUENCE,
    private PostgreRoleReference grantor;

    }
 *

    }
 * DBeaver - Universal Database Manager
                this.objectName = JDBCUtils.safeGetString(dbResult, "specific_name");
        this.objectName = objectName;
        this.grantor = obtainRoleReference(database, dbResult, "grantor");
import java.sql.ResultSet;
        this.objectName = objectName;
        return privilegeType.toString();
    }
    @Override

        this.kind = kind;
    private boolean isGrantable;
                this.objectSchema = JDBCUtils.safeGetString(dbResult, "object_schema");
    }
        return objectCatalog;
    }
    public PostgrePrivilegeGrant(PostgreRoleReference grantor, PostgreRoleReference grantee, String objectCatalog, String objectSchema, String objectName, PostgrePrivilegeType privilegeType, boolean isGrantable, boolean withHierarchy) {
 */
        return isGrantable;

        }

    public String toString() {
 * distributed under the License is distributed on an "AS IS" BASIS,

                this.withHierarchy = JDBCUtils.safeGetBoolean(dbResult, "with_hierarchy");
        @NotNull PostgreDatabase database,
    public void setObjectName(String objectName) {

        @NotNull Kind kind,
/**
        this.objectSchema = objectSchema;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        this.isGrantable = isGrantable;
    public void setKind(Kind kind) {
        return objectName;
            default:
        this.grantee = grantee;
    private String objectName;
 * PostgrePrivilegeGrant
                break;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

        String roleName = JDBCUtils.safeGetString(dbResult, columnName);
    private String objectSchema;
    }
        TYPE
    public boolean isWithHierarchy() {

    private static PostgreRoleReference obtainRoleReference(PostgreDatabase database, ResultSet dbResult, String columnName) {
        return roleName == null ? null : new PostgreRoleReference(database, roleName, null);
    ) throws SQLException {
        this.isGrantable = JDBCUtils.safeGetBoolean(dbResult, "is_grantable");
        COLUMN,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            case FUNCTION:
        TABLE,
    private PostgrePrivilegeType privilegeType;


        SCHEMA,
    public PostgrePrivilegeGrant(
    }
 * limitations under the License.
import org.jkiss.code.NotNull;
        return kind;
    }

        this.grantor = grantor;

            case SEQUENCE:
                this.objectSchema = JDBCUtils.safeGetString(dbResult, "table_schema");
        switch (kind) {
 */
                this.objectName = JDBCUtils.safeGetString(dbResult, "table_name");
                this.objectName = JDBCUtils.safeGetString(dbResult, "object_name");

 * See the License for the specific language governing permissions and
    private PostgreRoleReference grantee;
        this.privilegeType = privilegeType;

public class PostgrePrivilegeGrant {
        @NotNull ResultSet dbResult
    private Kind kind;

    public PostgreRoleReference getGrantor() {
    }

        this.privilegeType = PostgrePrivilegeType.fromString(JDBCUtils.safeGetString(dbResult, "privilege_type"));
        PROCEDURE,
                this.objectCatalog = JDBCUtils.safeGetString(dbResult, "table_catalog");
 *
        this.kind = kind;

                break;
    }

    }
        this.objectCatalog = objectCatalog;
    }
 *
}
    }
                this.objectCatalog = JDBCUtils.safeGetString(dbResult, "object_catalog");
    private boolean withHierarchy;
        this.withHierarchy = withHierarchy;
    public enum Kind {
        return objectSchema;
        this.grantee = obtainRoleReference(database, dbResult, "grantee");
