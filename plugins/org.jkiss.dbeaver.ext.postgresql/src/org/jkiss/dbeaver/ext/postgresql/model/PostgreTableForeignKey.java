
        MatchType(String title) {
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    private MatchType matchType;
    public PostgreTableForeignKey(
            refSchemaId,
import org.jkiss.dbeaver.Log;
    }
    }
        @Nullable DBSEntityConstraint refConstraint,

            return new DBSForeignKeyModifyRule[] {
    }
import org.jkiss.dbeaver.DBException;
        final long refTableId = JDBCUtils.safeGetLong(resultSet, "confrelid");
    private DBSForeignKeyModifyRule deleteRule;
    @NotNull
/*
    @Property(viewable = true, specific = true, updatable = true, editable = true, listProvider = PostgreConstraintModifyRuleListProvider.class, order = 55)
        @NotNull JDBCResultSet resultSet) throws DBException
    private PostgreTableBase refTable;
 * You may obtain a copy of the License at
 *
    public MatchType getMatchType() {
import org.jkiss.dbeaver.model.meta.IPropertyValueListProvider;
        super(table, name, DBSEntityConstraintType.FOREIGN_KEY, resultSet);
        columns.clear();
        columns.addAll((Collection<? extends PostgreTableForeignKeyColumn>) children);
        this.deleteRule = getRuleFromAction(JDBCUtils.safeGetString(resultSet, "confdeltype"));
                DBSForeignKeyModifyRule.RESTRICT,
    public DBSEntityConstraint getReferencedConstraint() {
        @Override
            case "n": return DBSForeignKeyModifyRule.SET_NULL;
        } catch (DBException e) {
    @Nullable
import java.util.List;
    }
                DBSForeignKeyModifyRule.SET_DEFAULT };

import org.jkiss.dbeaver.model.struct.rdb.DBSTableForeignKey;
            return false;
    public void addColumn(PostgreTableForeignKeyColumn column) {
        }
    public void setAttributeReferences(List<PostgreTableForeignKeyColumn> columns) throws DBException {
        @NotNull PostgreTableBase table,
        refTable = table.getDatabase().findTable(
        switch (action) {
        final List<PostgreAttribute> lst = new ArrayList<>(children.size());
 */
        public String getName() {
            case "c": return DBSForeignKeyModifyRule.CASCADE;
        @Nullable
 * limitations under the License.
        try {
 * Copyright (C) 2010-2025 DBeaver Corp and others
{
    public PostgreTableForeignKey(DBRProgressMonitor monitor, PostgreTable table, PostgreTableForeignKey source) {
        {
        } catch (Throwable e) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
import org.jkiss.dbeaver.model.DBUtils;
    }
/*
    @Override
        }
    }
            case "d": return DBSForeignKeyModifyRule.SET_DEFAULT;

        this.matchType = MatchType.s;
    public PostgreTableForeignKey(
        }
    }
                log.warn("Unsupported constraint action: " + action);
        s("SIMPLE"),
            return title;
        return refConstraint;
        f("FULL"),
    @Property(viewable = true, specific = true, updatable = true, editable = true, listProvider = PostgreConstraintModifyRuleListProvider.class, order = 56)
        }


    public static class PostgreConstraintModifyRuleListProvider implements IPropertyValueListProvider<PostgreTableForeignKey> {
 */
        this.deleteRule = deleteRule;
 * Licensed under the Apache License, Version 2.0 (the "License");
        }

        }
        @NotNull PostgreTableBase table,
        {
/**
    public void setReferencedConstraint(DBSEntityConstraint refConstraint) {
        if (refTable == null) {
}

        try {
import java.util.Collection;
    public DBSForeignKeyModifyRule getDeleteRule() {
        }
        p("PARTIAL"),
        this.refConstraint = refConstraint;
    @Override
    {

        return updateRule;
 * you may not use this file except in compliance with the License.
            log.warn("Can't find reference constraint for foreign key '" + getFullyQualifiedName(DBPEvaluationContext.DDL) + "'");
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

        if (refConstraint == null) {


        if (!secondPass) {
public class PostgreTableForeignKey extends PostgreTableConstraintBase<PostgreTableForeignKeyColumn> implements DBSTableForeignKey
    public void setDeleteRule(DBSForeignKeyModifyRule deleteRule) {
    private DBSEntityConstraint refConstraint;
            this.matchType = MatchType.valueOf(JDBCUtils.safeGetString(resultSet, "confmatchtype"));
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return matchType;

        @NotNull
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.struct.DBSEntityConstraint;
    }
            refTableId);
    public enum MatchType implements DBPNamedObject {
        this.updateRule = updateRule;
        }
            refConstraint = DBUtils.findEntityConstraint(monitor, refTable, lst);
    private List<PostgreTableForeignKeyColumn> columns = new ArrayList<>();
            this.title = title;

        this.updateRule = updateRule;
*/
        super(monitor, table, source);
 *
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.meta.Property;
    public void setUpdateRule(DBSForeignKeyModifyRule updateRule) {
    @Property(id = "reference", viewable = true, specific = true, order = 51)

    public PostgreTableBase getAssociatedEntity() {
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;

    }
        final long refSchemaId = JDBCUtils.safeGetLong(resultSet, "refnamespace");
                DBSForeignKeyModifyRule.SET_NULL,
        u("UNKNOWN");
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
        super(table, null, DBSEntityConstraintType.FOREIGN_KEY);
        this.deleteRule = deleteRule;
import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyModifyRule;
    public DBSForeignKeyModifyRule getUpdateRule() {
    }
    private static final Log log = Log.getLog(PostgreTableForeignKey.class);
    }
        @Override
    void cacheAttributes(DBRProgressMonitor monitor, List<? extends PostgreTableConstraintColumn> children, boolean secondPass) {
        }


        return deleteRule;
        this.refConstraint = refConstraint;
    @Override
            log.error("Error finding reference constraint", e);
    }
    @Override
        this.columns.add(column);
    @Property(viewable = true, specific = true, order = 54)

            case "r": return DBSForeignKeyModifyRule.RESTRICT;

        this.refTable = refConstraint == null ? null : (PostgreTableBase) refConstraint.getParentObject();
            lst.add(((PostgreTableForeignKeyColumn)c).getReferencedColumn());
        public boolean allowCustomValue()
            monitor,
    @Override
        final DBRProgressMonitor monitor = resultSet.getSession().getProgressMonitor();
    private DBSForeignKeyModifyRule updateRule;
            case "a": return DBSForeignKeyModifyRule.NO_ACTION;
    }
        @NotNull DBSForeignKeyModifyRule deleteRule,
 *

    @Nullable
package org.jkiss.dbeaver.ext.postgresql.model;
        this.columns = columns;

        this.refTable = refConstraint == null ? null : (PostgreTableBase) refConstraint.getParentObject();
        return refTable;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    }
        @NotNull String name,

                return DBSForeignKeyModifyRule.NO_ACTION;
        @Override
    @Property(viewable = true, specific = true, order = 50)
    }
        }
    {
            log.debug("Error reading FK match type: " + e.getMessage());
    @Override
        this.updateRule = getRuleFromAction(JDBCUtils.safeGetString(resultSet, "confupdtype"));

                DBSForeignKeyModifyRule.NO_ACTION,
        public Object[] getPossibleValues(PostgreTableForeignKey foreignKey)
    public List<PostgreTableForeignKeyColumn> getAttributeReferences(@Nullable DBRProgressMonitor monitor) throws DBException {
import org.jkiss.code.NotNull;
    }
    }
            return;
                DBSForeignKeyModifyRule.CASCADE,
            throw new DBException("Reference table " + refTableId + " not found");
    @NotNull


        private final String title;
import java.util.ArrayList;
        @NotNull DBSForeignKeyModifyRule updateRule)
    private DBSForeignKeyModifyRule getRuleFromAction(String action) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        for (PostgreTableConstraintColumn c : children) {
    @Nullable

        return columns;


 * PostgreTableForeignKey
import org.jkiss.dbeaver.model.DBPNamedObject;
            default:
    }
        }
