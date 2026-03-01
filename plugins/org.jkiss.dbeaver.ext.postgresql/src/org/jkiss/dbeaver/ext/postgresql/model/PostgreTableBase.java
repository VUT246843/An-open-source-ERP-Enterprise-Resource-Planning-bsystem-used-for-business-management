    @Property(viewable = true, order = 10)
    }
    }
    }
        final DBSObjectCache<PostgreTableBase, PostgreTableColumn> childrenCache = getContainer().getSchema().getTableCache().getChildrenCache(this);
    }
        this.persistence = PostgreTablePersistence.PERMANENT;

    public PostgreTableBase(DBRProgressMonitor monitor, PostgreTableContainer container, PostgreTableBase source, boolean persisted) throws DBException {
               (DBPScriptObject.OPTION_DDL_ONLY_FOREIGN_KEYS.equals(option) ||
    @Override
import java.util.Collections;
    }
    }
    }
package org.jkiss.dbeaver.ext.postgresql.model;
        isPartition = partition;
    // Copy constructor
        return new PostgreTableColumn(monitor, this, dbResult);
        }
            this.persistence = PostgreTablePersistence.PERMANENT;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    @Nullable


        PostgreSchema schema = getContainer().getSchema();
            (PostgreSchema) parentObject :
    {
 * You may obtain a copy of the License at
    {
    public String[] getRelOptions() {
                return attr;
    @Override
import java.sql.ResultSet;
            }
    }
    /**

    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context)
        return schema.getTableCache().refreshObject(monitor, schema, this);
        this.acl = JDBCUtils.safeGetObject(dbResult, "relacl");
            database.isSharedDatabase() ? database : null,
    public PostgreSchema getSchema() {
 * PostgreTableBase
import org.jkiss.dbeaver.model.meta.PropertyLength;
    private PostgreTablePersistence persistence;

import org.jkiss.dbeaver.DBException;
    @Override

    @Association

/**
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
        }
        this.ownerId = JDBCUtils.safeGetLong(dbResult, "relowner");
        return getContainer().getDatabase();
        public boolean allowCustomValue()
    @NotNull


    @Override
    }
        @Override


        this.acl = source.acl;
    public String getDescription()
    @Property(viewable = true, editable = true, updatable = true, length = PropertyLength.MULTILINE, order = 100)
    public void appendTableModifiers(DBRProgressMonitor monitor, StringBuilder ddl) {
        @Override
 */
    @NotNull
            if (DBUtils.isHiddenObject(srcColumn)) {
     * Extra table DDL modifiers
    {
	private boolean isPartition;
        return null;
            return Collections.emptyList();
    public List<PostgreDependency> getDependencies(DBRProgressMonitor monitor) throws DBCException {
        return getContainer().getSchema().getTableCache();

            PostgreTableColumn column = new PostgreTableColumn(monitor, this, srcColumn);
        public Object[] getPossibleValues(PostgreTableBase object)
    @Override
                return new Object[0];
    public synchronized Collection<? extends DBSEntityAssociation> getAssociations(@NotNull DBRProgressMonitor monitor)
        return null;
import org.jkiss.dbeaver.model.*;
		return isPartition;
    }
    }

        return PostgreDependency.readDependencies(monitor, this, true);
    public void setPartition(boolean partition) {
    public String generateChangeOwnerQuery(@NotNull String owner, @NotNull Map<String, Object> options) {
 * limitations under the License.
        return this.description;
    }
            persistence = PostgreTablePersistence.getByCode(JDBCUtils.safeGetString(dbResult, "relpersistence"));
    @Override
        throws DBException

        {
    private long oid;
        if (DBPScriptObject.OPTION_INCLUDE_PERMISSIONS.equals(option)) {
import org.jkiss.dbeaver.model.struct.DBSEntityAssociation;
    }
import java.util.Map;
    @NotNull
    public String getTableTypeName() {

        if (childrenCache != null) {
        return persistence;
 *
    {
import org.jkiss.dbeaver.model.struct.DBSObject;
    protected PostgreTableColumn getAttributeByPos(DBRProgressMonitor monitor, int position) throws DBException {
        this.description = description;
        assert parentObject != null;
    }
import org.jkiss.dbeaver.model.meta.Property;
        DBSObjectCache<PostgreTableBase, PostgreTableColumn> colCache = getSchema().getTableCache().getChildrenCache(this);
    }
    public boolean supportsObjectDefinitionOption(@NotNull String option) {
        super(container, false);
            if (!object.getDataSource().getServerType().supportsTablespaces()) {
        super(container, JDBCUtils.safeGetString(dbResult, "relname"), true);
    }
    public long getObjectId() {
    }
    }
        this.isPartition = source.isPartition;
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
            schema.getIndexCache().clearObjectCache(this);
{
    private static final Log log = Log.getLog(PostgreTableBase.class);
        return null;
    public static class TablespaceListProvider implements IPropertyValueListProvider<PostgreTableBase> {
        @Nullable
        return null;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        schema.getConstraintCache().clearObjectCache(this);
        throws DBException
        } else {
	}
    PostgreScriptObject,
    {
    public PostgreTableColumn createTableColumn(DBRProgressMonitor monitor, PostgreSchema schema, JDBCResultSet dbResult)
    implements
        }
    protected PostgreTableBase(PostgreTableContainer container)
        return parentObject instanceof PostgreSchema ?
 * you may not use this file except in compliance with the License.
            this.relOptions = PostgreUtils.safeGetStringArray(dbResult, "reloptions");


    {
    }
        return getContainer().getSchema().getTableCache().getChildren(monitor, getContainer(), this);
 * See the License for the specific language governing permissions and
        this.oid = JDBCUtils.safeGetLong(dbResult, "oid");
    @Override
        return getDataSource().getServerType().readObjectPermissions(monitor, this, includeNestedObjects);
    private String description;
            return false;
    }
            return true;
        this.persistence = source.persistence;

        //this.reloptions = PostgreUtils.parseObjectString()
        final DBSObject parentObject = super.getParentObject();
 *
    public Object getAcl() {
import org.jkiss.dbeaver.model.meta.IPropertyValueListProvider;
    DBPNamedObject2,

    public PostgreDatabase getDatabase() {
    @Property(viewable = true, length = PropertyLength.MULTILINE, order = 90)
public abstract class PostgreTableBase extends JDBCTable<PostgreDataSource, PostgreTableContainer>
        return getDatabase().getRoleById(monitor, ownerId);
    PostgreClass,
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTable;
        ResultSet dbResult)
        return "TABLE";
    }
    @Override
     */
            JDBCUtils.safeGetBoolean(dbResult, "relispartition");

     */
    @Override
               DBPScriptObject.OPTION_DDL_SKIP_FOREIGN_KEYS.equals(option));
    public void setDescription(String description) {
import java.util.Collection;
import org.jkiss.dbeaver.model.struct.DBSObjectWithType;

    @Property(viewable = true, order = 9)
import org.jkiss.dbeaver.Log;
 *     http://www.apache.org/licenses/LICENSE-2.0

                continue;
    @Nullable
        if (schema.getIndexCache() != null) {

    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException
        return null;
        }
    }

import org.jkiss.code.Nullable;
        if (DBPScriptObject.OPTION_INCLUDE_COMMENTS.equals(option) && getDataSource().getServerType().supportsShowingOfExtraComments()) {
        super(container, source, persisted);
        {
    public PostgreTablePersistence getPersistence() {
import org.jkiss.code.NotNull;
            colCache.cacheObject(column);
        if (getDataSource().isServerVersionAtLeast(8, 2)) {
    public List<? extends PostgreTableColumn> getAttributes(@NotNull DBRProgressMonitor monitor)
        return Collections.emptyList();

    @Association
    @Override
    /**
    public JDBCStructCache<PostgreTableContainer, ? extends PostgreClass, ? extends PostgreAttribute> getCache()
        if (container.getDataSource().isServerVersionAtLeast(9, 1)) {
        for (PostgreTableColumn attr : CommonUtils.safeCollection(getAttributes(monitor))) {
        }
    @Override
            getDataSource().isServerVersionAtLeast(10, 0) &&
        this.relOptions = source.relOptions;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;

        this.description = source.description;
        PostgreDatabase database = getDatabase();
    }

    private Object acl;
 *
        // Copy columns
        }
        }
        this.ownerId = source.ownerId;
    {
            }
            return object.getDatabase().getTablespaceCache().getCachedObjects().toArray(new Object[0]);
    public Collection<PostgrePrivilege> getPrivileges(@NotNull DBRProgressMonitor monitor, boolean includeNestedObjects) throws DBException {
    {
 */

}
    public Collection<? extends DBSEntityAssociation> getReferences(@NotNull DBRProgressMonitor monitor)
        return getContainer().getSchema().getTableCache().getChild(monitor, getContainer(), this, attributeName);
 * Copyright (C) 2010-2025 DBeaver Corp and others
            ((PostgreTableBase) parentObject).getSchema();
        return !this.isView() &&
        throws DBException
    DBPScriptObjectExt2,
    @Association
            }
    public boolean isPartition() {
        return DBUtils.getFullQualifiedName(getDataSource(),
    {
    }
    PostgrePrivilegeOwner,
    public PostgreTableColumn getAttribute(@NotNull DBRProgressMonitor monitor, @NotNull String attributeName)
    {


            return childrenCache.getCachedObjects();
    @Override
            getSchema(),
import org.jkiss.dbeaver.model.meta.Association;
    }
        throws DBException
        this.description = JDBCUtils.safeGetString(dbResult, "description");
    }
        return "ALTER TABLE " + DBUtils.getEntityScriptName(this, options) + " OWNER TO " + owner;
        return relOptions;
        }
    public PostgreRole getOwner(DBRProgressMonitor monitor) throws DBException {
    DBSObjectWithType
        }

        this.isPartition =
/*
    {
    private long ownerId;
        }
 * DBeaver - Universal Database Manager
            this);
            return true;

    }

    {
        PostgreTableContainer container,
    @Association

    }
        throws DBException
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
        // Nothing

        return this.oid;
     * Table columns
    public PostgreTableConstraintBase getConstraint(@NotNull DBRProgressMonitor monitor, String ukName)
     * @param monitor progress monitor

 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.utils.CommonUtils;
    }
        throws DBException
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull
        return acl;

    @Override
import org.jkiss.dbeaver.model.exec.DBCException;
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCStructCache;
    @Override
        if (!isPersisted()) {
    public Collection<PostgreTableConstraint> getConstraints(@NotNull DBRProgressMonitor monitor) throws DBException {
import java.util.List;
    }
    protected PostgreTableBase(
    public List<? extends PostgreTableColumn> getCachedAttributes()

    }
    private String[] relOptions;
 * Unless required by applicable law or agreed to in writing, software
            if (attr.getOrdinalPosition() == position) {
        for (PostgreTableColumn srcColumn : CommonUtils.safeCollection(source.getAttributes(monitor))) {

    {

    }
