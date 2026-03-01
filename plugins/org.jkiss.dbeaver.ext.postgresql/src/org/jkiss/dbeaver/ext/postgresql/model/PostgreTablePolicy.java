    }
    @Override
        @Override
        @NotNull
import java.util.stream.Collectors;
    public void setPersisted(boolean persisted) {
/**
    public PolicyType getType() {
            sql.append("\n WITH CHECK (").append(check).append(")");
            .append(table.getFullyQualifiedName(DBPEvaluationContext.DDL))
    public void setName(@NotNull String name) {
    public static class RoleListProvider implements IPropertyValueListProvider<PostgreTablePolicy> {
        INSERT(SQLConstants.KEYWORD_INSERT),
 *
        PolicyEvent(@NotNull String name) {
    }

        StringBuilder sql = new StringBuilder();
    public PostgreTable getParentObject() {
    }
 * Unless required by applicable law or agreed to in writing, software

        return type;
        if (!ArrayUtils.isEmpty(roleNames)) {
        return using;
                roles.addAll(object.table.getDatabase().getUsers(new VoidProgressMonitor()));
        }
        UPDATE(SQLConstants.KEYWORD_UPDATE),
                final List<PostgreRole> roles = new ArrayList<>();
    private PolicyEvent event;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override
    private final List<PostgreRole> roles = new ArrayList<>();
}
    public DBPDataSource getDataSource() {
    public void setUsing(@NotNull String using) {
        this.check = JDBCUtils.safeGetString(results, "with_check");
            this.roles.addAll(roles);
        }
        public boolean allowCustomValue() {
        DELETE(SQLConstants.KEYWORD_DELETE);
    public void setCheck(@NotNull String check) {
 *
    @Override
        return persisted;
 */
        PolicyType(@NotNull String name) {
    @Override

    }
    @Override
import org.jkiss.dbeaver.model.*;
import org.jkiss.utils.CommonUtils;
    private final PostgreTable table;
        this.name = JDBCUtils.safeGetString(results, "policyname");
    @Nullable
            this.name = name;
        }

    @NotNull
import org.jkiss.code.NotNull;
public class PostgreTablePolicy implements DBSObject, DBPNamedObject2, DBPSaveableObject, DBPScriptObject {
    }
        if (!roles.isEmpty()) {
    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *

        }
    }
        String[] roleNames = JDBCUtils.<String[]> safeGetArray(results, "roles");

    }
package org.jkiss.dbeaver.ext.postgresql.model;
                    continue;
 * You may obtain a copy of the License at
                return roles.toArray();
    private static final Log log = Log.getLog(PostgreTablePolicy.class);
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
 * limitations under the License.
        }

    public PolicyEvent getEvent() {
            return name;
import org.jkiss.dbeaver.model.meta.Property;
        private final String name;
    public String getUsing() {
    }

            try {
        RESTRICTIVE("Restrictive");
    private String using;
        ALL("All"),
    }
            }
        this.event = PolicyEvent.ALL;
        this.persisted = true;
    public String getName() {
        this.type = CommonUtils.valueOf(PolicyType.class, JDBCUtils.safeGetString(results, "permissive"));
        @NotNull ResultSet results
        this.persisted = false;
                return new Object[0];
            } catch (DBException e) {
/*
    public void setType(@NotNull PolicyType type) {

    private boolean persisted;
            this.name = name;


        if (CommonUtils.isNotEmpty(check)) {

    }
            return name;

        this.name = name;
        this.event = CommonUtils.valueOf(PolicyEvent.class, JDBCUtils.safeGetString(results, "cmd"));
    @Property(order = 6, viewable = true, editable = true, updatable = true)
        this.roles.clear();

    }
        this.table = table;
    @Property(order = 2, viewable = true, editable = true, listProvider = RoleListProvider.class)
import org.jkiss.utils.ArrayUtils;
        @Override
 * Copyright (C) 2010-2026 DBeaver Corp and others
    public enum PolicyEvent implements DBPNamedObject {
import org.jkiss.dbeaver.DBException;
        }
 * Licensed under the Apache License, Version 2.0 (the "License");

    @Override
    @Override
            sql.append(roles.stream().map(DBUtils::getQuotedIdentifier).collect(Collectors.joining(",")));

 * @see <a href="5.8. Row Security Policies">https://www.postgresql.org/docs/current/ddl-rowsecurity.html</a>
        this.persisted = persisted;
    @Property(order = 3, viewable = true, editable = true)
        SELECT(SQLConstants.KEYWORD_SELECT),
    @Property(order = 1, viewable = true, editable = true)
    @NotNull
    @Property(order = 5, viewable = true, editable = true, updatable = true)
        @NotNull
    @NotNull
        this.event = event;
        return table;
            sql.append("\n TO ");
        sql.append("CREATE POLICY ")
                    log.debug("Role '" + roleName + "' not found");
            }

 */
        @NotNull DBRProgressMonitor monitor,

    }
import java.sql.ResultSet;
import org.jkiss.dbeaver.model.meta.IPropertyValueListProvider;
        }
            sql.append("\n USING (").append(using).append(")");
    public PostgreTablePolicy(@NotNull PostgreTable table, @NotNull String name) {
        if (roles != null) {
    @NotNull
 * DBeaver - Universal Database Manager
    }
import org.jkiss.code.Nullable;
    @NotNull
import java.util.Map;
            return false;
        public String getName() {
    public void setRoles(@Nullable List<PostgreRole> roles) {
    ) throws DBException {
    public boolean isPersisted() {
        }
            .append(" ON ")
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        }
                roles.add(role);
            .append(DBUtils.getQuotedIdentifier(this))
 *



            .append("\n AS ").append(type)
            for (String roleName : roleNames) {
    @NotNull

                if (role == null) {
    }
        @Override
        final PostgreDatabase database = table.getDatabase();
 * See the License for the specific language governing permissions and

 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.sql.SQLConstants;
    }
        this.check = "";

    public enum PolicyType implements DBPNamedObject {

import org.jkiss.dbeaver.Log;
    private String check;
        @Nullable
    @Override
        return event;
    }
    @NotNull

 * you may not use this file except in compliance with the License.
        public Object[] getPossibleValues(PostgreTablePolicy object) {
    @NotNull
    public List<PostgreRole> getRoles() {
    private PolicyType type;

    }
    }

 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    public PostgreTablePolicy(
    public void setEvent(@NotNull PolicyEvent event) {
        if (CommonUtils.isNotEmpty(using)) {


        }
    @Property(order = 4, viewable = true, editable = true)
        return sql.toString();
        private final String name;
        this.type = type;
        return roles;


        @NotNull PostgreTable table,
 * An object describing row-level security policy.
        this.name = name;


        this.check = check;
                roles.add(null); // PUBLIC
    }
        @Override
                log.error("Error reading roles", e);
        return table.getDataSource();
        PERMISSIVE("Permissive"),

        return check;

        return null;
                PostgreRole role = database.getRoleByReference(monitor, new PostgreRoleReference(database, roleName, null));
            .append("\n FOR ").append(event);
        this.using = JDBCUtils.safeGetString(results, "qual");

        }
        this.using = using;

                }

import java.util.ArrayList;
    }
    public String getDescription() {

        public String getName() {

import org.jkiss.dbeaver.model.struct.DBSObject;

        return name;
    }
    public String getCheck() {
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
        this.using = "";
import java.util.List;
    private String name;
        this.type = PolicyType.PERMISSIVE;
        this.table = table;
    }
