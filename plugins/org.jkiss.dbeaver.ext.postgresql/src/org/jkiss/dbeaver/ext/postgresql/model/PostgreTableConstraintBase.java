import org.jkiss.dbeaver.Log;
    @Nullable


        return DBUtils.getFullQualifiedName(getDataSource(),
    }
        return super.getDescription();
        this.deferred = srcConstr.deferred;
        this.isLocal = srcConstr.isLocal;
            this instanceof PostgreTableInheritance ||
 *
    }
            getTable().getContainer(),
    }
    @Override
 *
                    "CONSTRAINT " + DBUtils.getQuotedIdentifier(this) + " " +
    public void setDeferred(boolean deferred) {
    }

            getTable(),
    }
        super(owner, srcConstr, false);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.deferred = deferred;
    public PostgreTableConstraintBase(PostgreTableBase table, String name, DBSEntityConstraintType constraintType, JDBCResultSet resultSet) throws DBException {
    @Property(viewable = false, order = 10)
            this);
    @Override
        } else {



        return deferrable;
    private boolean isLocal;


import org.jkiss.dbeaver.model.meta.Property;
        }
    }

}
        throw new DBException("Constraints DDL is read-only");
    @Override
        this.description = srcConstr.description;
    public void setDeferrable(boolean deferrable) {
    abstract void cacheAttributes(DBRProgressMonitor monitor, List<? extends PostgreTableConstraintColumn> children, boolean secondPass);
        return indexId == 0 ? null : getTable().getSchema().getIndex(monitor, indexId);
        this.isLocal = getDataSource().getServerType().supportsInheritance() || this instanceof PostgreTableInheritance;
 * You may obtain a copy of the License at
        return !isLocal;
    @Property(viewable = false, order = 12)
    @NotNull
        if (CommonUtils.getOption(options, DBPScriptObject.OPTION_EMBEDDED_SOURCE)) {
    }

    @Override
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

    @Override
    public void setObjectDefinitionText(String sourceText) throws DBException {
    }
        this.deferrable = srcConstr.deferrable;
    {
        return getParentObject().getDatabase();
            postfix++;

    @NotNull
import org.jkiss.dbeaver.DBDatabaseException;

 */
import org.jkiss.code.Nullable;
    {
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException
    @Override
    }
    @Property(viewable = true, editable = true, updatable = true, length = PropertyLength.MULTILINE, order = 100)

 * See the License for the specific language governing permissions and
        this.description = JDBCUtils.safeGetString(resultSet, "description");


import org.jkiss.code.NotNull;
        this.deferrable = JDBCUtils.safeGetBoolean(resultSet, "condeferrable");
 * PostgreTableConstraintBase
        super(table, constraintName, null, constraintType, false);

 */
/*
                    JDBCUtils.queryString(session, "SELECT pg_catalog.pg_get_constraintdef(?)", getObjectId());
    public String getDescription()
    public PostgreTableConstraintBase(PostgreTableBase table, String constraintName, DBSEntityConstraintType constraintType) {
/**
    }
            }
            setName(srcConstr.getName() + "_" + postfix);
 * you may not use this file except in compliance with the License.
    }
        // Make constraint name unique
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
    }
    private long indexId;
    @Override
 * DBeaver - Universal Database Manager
    public long getObjectId() {
        // conislocal is true by default for constraints which have such a parameter in metadata
        super(table, name, null, constraintType, true);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

            } catch (SQLException e) {
    public PostgreIndex getIndex(DBRProgressMonitor monitor) throws DBException {
        return deferred;
    private boolean deferrable;
 *
package org.jkiss.dbeaver.ext.postgresql.model;
        this.indexId = JDBCUtils.safeGetLong(resultSet, "conindid");
        int postfix = 1;
            return constrDDL;
    private String constrDDL;
    @Property(hidden = true, editable = true, updatable = true, order = -1)
        return oid;
    public PostgreDataSource getDataSource()
    }

            return "ALTER TABLE " + getTable().getFullyQualifiedName(DBPEvaluationContext.DDL) + " ADD " + constrDDL;
                throw new DBDatabaseException(e, getDataSource());
import org.jkiss.dbeaver.DBException;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software

    public PostgreDatabase getDatabase() {
import org.jkiss.dbeaver.model.*;
import org.jkiss.dbeaver.model.meta.PropertyLength;
    {
 * Licensed under the Apache License, Version 2.0 (the "License");
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context)
    private long oid;
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTableConstraint;
import org.jkiss.utils.CommonUtils;
    public PostgreTableConstraintBase(DBRProgressMonitor monitor, PostgreTableReal owner, PostgreTableConstraintBase srcConstr) throws DBException {
 *     http://www.apache.org/licenses/LICENSE-2.0
    private boolean deferred;
        this.deferred = JDBCUtils.safeGetBoolean(resultSet, "condeferred");
    private static final Log log = Log.getLog(PostgreTableConstraintBase.class);
 * Copyright (C) 2010-2025 DBeaver Corp and others
        return getTable().getDataSource();
        implements PostgreObject, PostgreScriptObject, DBPInheritedObject, DBPNamedObject2 {
    }
    {
    @NotNull



    public boolean isInherited() {
    @Property(viewable = false, order = 11)
        if (constrDDL == null && isPersisted()) {
        this.deferrable = deferrable;
        this.isLocal =
        this.oid = JDBCUtils.safeGetLong(resultSet, "oid");
    }
 * limitations under the License.
    @Override
    @NotNull
                constrDDL =
    public boolean isDeferred() {
        }
    }

            try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Read constraint definition")) {
import java.util.List;
    public boolean isDeferrable() {
public abstract class PostgreTableConstraintBase<COLUMN extends PostgreTableConstraintColumn> extends JDBCTableConstraint<PostgreTableBase, COLUMN>
import java.sql.SQLException;
    //@Property(viewable = true, order = 12)
        while (owner.getSchema().getConstraintCache().getObject(monitor, owner.getSchema(), getName()) != null) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        }
            !getDataSource().getServerType().supportsInheritance() ||
            JDBCUtils.safeGetBoolean(resultSet, "conislocal", true);
import java.util.Map;
