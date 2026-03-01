
        if (!CommonUtils.isEmpty(getSchemas(monitor))) {
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
        throws DBException

            return super.getChild(monitor, childName);
    private List<GenericSchema> schemas;

                this.schemas = this.getDataSource().getMetaModel().loadSchemas(session, getDataSource(), this);
 * You may obtain a copy of the License at
        }
    @NotNull
            super.cacheStructure(monitor, scope);
        throws DBException
            if (!CommonUtils.isEmpty(catalogTerm)) {
import org.jkiss.dbeaver.model.DBUtils;
        return false;
    public DBSObject getChild(@NotNull DBRProgressMonitor monitor, @NotNull String childName)
import org.jkiss.dbeaver.model.meta.Association;
            return getSchemas(monitor);
    @Override
    {
                return catalogTerm + " " + ModelMessages.model_navigator_Name;
            getSchemas(monitor),
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public Collection<GenericSchema> getSchemaList(DBRProgressMonitor monitor)
 *
/*
            return null;
 */

import org.jkiss.dbeaver.model.DBPIdentifierCase;
            // Cache tables only if we don't have schemas
 * GenericCatalog
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
    {
        return getDataSource();
    public Collection<? extends DBSObject> getChildren(@NotNull DBRProgressMonitor monitor)
 *     http://www.apache.org/licenses/LICENSE-2.0
    public String getDescription()
            return GenericTable.class;
        if (!CommonUtils.isEmpty(getSchemas(monitor))) {
    {
    {

        if (schemas == null && !isInitialized && !monitor.isForceCacheUsage()) {

        }
    public GenericCatalog getCatalog()
 *
import org.jkiss.code.Nullable;
    }

    @Association
    public GenericSchema getSchema(DBRProgressMonitor monitor, String name)
        } else {

    }
        } else {

        throws DBException
    public DBSObject getParentObject()
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
    {
 * DBeaver - Universal Database Manager
    }
            name,

    @Override
import org.jkiss.dbeaver.model.messages.ModelMessages;
    {
public class GenericCatalog extends GenericObjectContainer implements DBSCatalog, DBPSystemObject {

    public GenericCatalog getObject()

 * Unless required by applicable law or agreed to in writing, software
        return super.refreshObject(monitor);
        return getSchemas(monitor);
        return null;
        if (!CommonUtils.isEmpty(schemas) || (monitor != null && !CommonUtils.isEmpty(getSchemas(monitor)))) {
            getDataSource().getSQLDialect().storesUnquotedCase() == DBPIdentifierCase.MIXED);

    {
    }
    @Override
    public String getName()
        throws DBException

        this.isInitialized = false;
        throws DBException
    {
 * limitations under the License.
    }
    @Nullable
import org.jkiss.dbeaver.model.DBPSystemObject;
                this.isInitialized = true;
        if (getDataSource().isMergeEntities()) {

    {
    {
 */
    @Override
        return null;
    @Override
    @NotNull

    }
    @Override
        return DBUtils.findObject(
    {

package org.jkiss.dbeaver.ext.generic.model;
        @Nullable
            return getSchema(monitor, childName);
    @Override
        super(dataSource);
    }
    @Override
            try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load catalog schemas")) {
    {
import org.jkiss.dbeaver.model.struct.DBSObject;
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
        this.catalogName = catalogName;
import org.jkiss.dbeaver.model.meta.Property;
    }
    }
import org.jkiss.utils.CommonUtils;
    @Override
        return catalogName;
    @Override
}
    public static class CatalogNameTermProvider implements IPropertyValueTransformer<DBSObject, String> {
    @NotNull
            String catalogTerm = object.getDataSource().getInfo().getCatalogTerm();
        return this;
 *
    private final String catalogName;
    public boolean isSystem() {
    private boolean isInitialized = false;
    }
        }
    public Class<? extends DBSObject> getPrimaryChildType(@Nullable DBRProgressMonitor monitor)
 * distributed under the License is distributed on an "AS IS" BASIS,
        public String transform(@NotNull DBSObject object, @Nullable String value) throws IllegalArgumentException {
            }
    public Collection<GenericSchema> getSchemas(@NotNull DBRProgressMonitor monitor)
import org.jkiss.dbeaver.DBException;
    }
    public GenericSchema getSchema()
        @Override
import java.util.Collection;
    {
    @Property(viewable = true, order = 1, labelProvider = CatalogNameTermProvider.class)
        if (CommonUtils.isEmpty(getSchemas(monitor))) {
    @Override
            return getTables(monitor);
import org.jkiss.code.NotNull;
        } else {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    }

        }
    }
        return schemas;
        }
        throws DBException
        return this;
    }

            return GenericSchema.class;
        this.schemas = null;
    public GenericCatalog(@NotNull GenericDataSource dataSource, @NotNull String catalogName)
    }
    {
import java.util.List;
    @Override
import org.jkiss.dbeaver.model.meta.IPropertyValueTransformer;
import org.jkiss.dbeaver.model.struct.rdb.DBSCatalog;

    public void cacheStructure(@NotNull DBRProgressMonitor monitor, int scope) throws DBException
    }
/**
        }
            return ModelMessages.model_navigator_Name;
