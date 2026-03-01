
/**
    public String getName() {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        super(dataSource);
    }
        return GenericTable.class;
    @NotNull

        return this;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at
 * GenericSchema
            return ModelMessages.model_navigator_Name;
    public Class<? extends DBSEntity> getPrimaryChildType(@Nullable DBRProgressMonitor monitor)
    }
    public GenericSchema(@NotNull GenericDataSource dataSource, @Nullable GenericCatalog catalog, @NotNull String schemaName) {
import org.jkiss.dbeaver.model.DBPVirtualObject;
    }
package org.jkiss.dbeaver.ext.generic.model;
    public void setVirtual(boolean nullSchema) {

    public GenericCatalog getCatalog() {
import org.jkiss.dbeaver.model.messages.ModelMessages;
    //@Property(viewable = true, multiline = true, order = 100)


import org.jkiss.dbeaver.model.struct.DBSObject;
    @Property(viewable = true, order = 1, labelProvider = SchemaNameTermProvider.class)
                return schemaTerm + " " + ModelMessages.model_navigator_Name;
    @NotNull
    @Property(optional = true, order = 2, labelProvider = GenericCatalog.CatalogNameTermProvider.class)
    }
    @Nullable
    @NotNull

 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.NotNull;
    }
        return getDataSource().getMetaModel().isSystemSchema(this);
    }
        public String transform(@NotNull DBSObject object, @Nullable String value) throws IllegalArgumentException {
            }
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public String getDescription() {
    @Override
    }
    public DBSObject getParentObject() {
import org.jkiss.dbeaver.model.meta.IPropertyValueTransformer;
        return schemaName;
    }
 * you may not use this file except in compliance with the License.
    }
    @Override
        @Nullable
    public GenericSchema getSchema() {
        this.schemaName = schemaName;

    @Override
    public boolean isSystem() {
 */
 * See the License for the specific language governing permissions and
        @Override
    public static class SchemaNameTermProvider implements IPropertyValueTransformer<DBSObject, String> {
    }
        return virtualSchema;
    }
            String schemaTerm = object.getDataSource().getInfo().getSchemaTerm();
    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
        return this;
public class GenericSchema extends GenericObjectContainer implements DBSSchema, DBPSystemObject, DBPVirtualObject {
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Nullable
    @NotNull

        return null;
        this.virtualSchema = nullSchema;
import org.jkiss.utils.CommonUtils;
    private boolean virtualSchema;
    @Override
import org.jkiss.code.Nullable;
    @Override
    private final String schemaName;


 *

    @Override

    public GenericSchema getObject() {
    public boolean isVirtual() {
}
    @Nullable
 */

        }
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
    @Override
        return catalog != null ? catalog : getDataSource().getContainer();
/*
    private final GenericCatalog catalog;
import org.jkiss.dbeaver.model.struct.DBSEntity;
 * limitations under the License.
            if (!CommonUtils.isEmpty(schemaTerm)) {
        this.catalog = catalog;
import org.jkiss.dbeaver.model.meta.Property;
    throws DBException {

import org.jkiss.dbeaver.model.DBPSystemObject;
import org.jkiss.dbeaver.model.struct.rdb.DBSSchema;
 * DBeaver - Universal Database Manager

    @Override
    }
import org.jkiss.dbeaver.DBException;
        return catalog;
