        public boolean allowCustomValue() {
            }
    public void setSchema(@NotNull CubridUser owner) {
import org.jkiss.dbeaver.ext.generic.model.GenericSchema;
    }
        return (CubridDataSource) super.getDataSource();
 * See the License for the specific language governing permissions and
        if (getDataSource().getSupportMultiSchema()) {
    @NotNull
    @Override
    public String getDescription() {

            return false;
}
    @Override
    public void setName(@NotNull String name) {
    public String getTableType() {
    @Override

    public static class OwnerListProvider implements IPropertyValueListProvider<CubridView>
    @Property(viewable = true, order = 2)
import org.jkiss.dbeaver.model.meta.Property;
        @Override
    public String getUniqueName() {

    }
import org.jkiss.dbeaver.model.DBPEvaluationContext;
            return object.getDataSource().getSchemas().toArray();
    public GenericSchema getSchema() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return owner;
import org.jkiss.dbeaver.model.meta.PropertyLength;
    @Override
/*
            @Nullable String tableName,
            @Nullable String tableType,
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
    @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0

 *
import org.jkiss.dbeaver.model.meta.IPropertyValueListProvider;
 * You may obtain a copy of the License at
        return super.getName();
            String type = JDBCUtils.safeGetString(dbResult, CubridConstants.IS_SYSTEM_CLASS);
    }
    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.ext.cubrid.CubridConstants;
            return this.getContainer() + "." + this.getName();
        } else {

    {
    @NotNull
    public CubridView(
    }
    }
        super(container, tableName != null ? tableName.toLowerCase() : null, tableType, dbResult);
        this.owner = (CubridUser) container;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    public String getName() {
{
 * DBeaver - Universal Database Manager

    private CubridUser owner;
import org.jkiss.dbeaver.ext.generic.model.GenericView;
    @Property(viewable = true, editable = true, updatable = true, length = PropertyLength.MULTILINE, order = 100)
import org.jkiss.code.NotNull;
    }
        @Nullable
 *
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        if (this.isSystem() || !getDataSource().getSupportMultiSchema()) {
                this.setSystem(type.equals("YES"));

import org.jkiss.code.Nullable;
 *
        return super.getTableType();
    @NotNull
        @Override
        if (dbResult != null) {
 * you may not use this file except in compliance with the License.
            @NotNull GenericStructContainer container,



    @Override
            return this.getName();
        }
        } else {
package org.jkiss.dbeaver.ext.cubrid.model;


    @Property(viewable = true, editable = true, order = 1)

    @Override
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
            @Nullable JDBCResultSet dbResult) {
        public Object[] getPossibleValues(@NotNull CubridView object) {
    public CubridDataSource getDataSource() {
            if (type != null) {
        super.setName(name != null ? name.toLowerCase() : null);
    }
    }
    public boolean isEnableSchema() {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
            return DBUtils.getFullQualifiedName(getDataSource(), this);
        }
 */
 * Unless required by applicable law or agreed to in writing, software
        this.owner = owner;
 * limitations under the License.
        @NotNull
    }
public class CubridView extends GenericView
        }
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
    }
            return DBUtils.getQuotedIdentifier(this.getSchema()) + "." + DBUtils.getFullQualifiedName(getDataSource(), this);
    }
    @NotNull
import org.jkiss.dbeaver.model.DBUtils;

        return getDataSource().getSupportMultiSchema() || getDataSource().isDBAGroup();
        }
    @Property(viewable = true, editableExpr = "object.enableSchema", updatableExpr = "object.enableSchema", listProvider = OwnerListProvider.class, labelProvider = GenericSchema.SchemaNameTermProvider.class, order = 2)
        return super.getDescription();
