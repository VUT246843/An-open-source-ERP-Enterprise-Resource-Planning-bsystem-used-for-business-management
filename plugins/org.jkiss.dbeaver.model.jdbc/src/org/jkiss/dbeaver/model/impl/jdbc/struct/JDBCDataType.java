    @NotNull


    @NotNull
    @Override
    public DBPDataKind getDataKind()
    {

        return precision;
        return name;
import org.jkiss.dbeaver.model.exec.DBCLogicalOperator;

    private boolean isUnsigned;
    private int maxScale;
    {
        OWNER owner,
import org.jkiss.dbeaver.model.meta.Property;
    public Integer getPrecision()
/**
 * distributed under the License is distributed on an "AS IS" BASIS,
    public long getTypeModifiers() {
    @Override
    @Override
    @Override
    public long getMaxLength()
    @Override
    @Override

            return this.name;
    {
 *
    }

public class JDBCDataType<OWNER extends DBSObject> implements DBSDataType
import org.jkiss.dbeaver.model.DBPDataKind;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 */
    public void setName(@NotNull String name) {
    private int valueType;
import org.jkiss.code.Nullable;
    public String getName()
    {
    public int getMinScale()
        this.name = name;
    @Nullable
        this.valueType = valueType;

    @Nullable
        return null;
    }
        }
    {
    public Integer getScale()
    @Override
        int maxScale)
    }
    @Override
        return DBUtils.getFullTypeName(this);
    }
        this.remarks = remarks;
    }
    public String getDescription()
    }
    @Nullable
    }
    @NotNull

    public int getMaxScale()
        this.owner = owner;
    @Override
    @Override
    public JDBCDataType(
 *
    {
 * DBeaver - Universal Database Manager
        this.minScale = minScale;

        return name;
    {
    {
        this.precision = precision;
        int precision,
    }
    private int precision;
        boolean unsigned,

    private boolean isSearchable;
    }
        boolean searchable,
    }
    @Override
import org.jkiss.code.NotNull;
    }
    @Property(viewable = true, order = 1)

    @NotNull
    }
    private String name;
    {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
{


    public DBCLogicalOperator[] getSupportedOperators(@NotNull DBSTypedObject attribute) {

    }
    }
    }
    }
    @Override
        this.valueType = valueType;
 * See the License for the specific language governing permissions and

    {
package org.jkiss.dbeaver.model.impl.jdbc.struct;
        return true;
    {
        return maxScale;

        int minScale,
    public OWNER getParentObject()
        return valueType;
        return owner.getDataSource();
    @Nullable

    }
        if (owner instanceof DBPDataSource) {
 * you may not use this file except in compliance with the License.
        isSearchable = searchable;
    @Override
        this.maxScale = maxScale;
    @Nullable
        isUnsigned = unsigned;
    @Override
import org.jkiss.dbeaver.model.DBPDataSource;
    {
    public String getFullTypeName() {
        this(owner, typed.getTypeID(), typed.getTypeName(), null, false, false, typed.getPrecision(), typed.getScale(), typed.getScale());
        return precision;
    }
import org.jkiss.dbeaver.model.struct.DBSObject;
        return null;
 *
        return 0;
    public String toString()
    @NotNull
    @Override
}
        return minScale;
        return owner.getName() + "." + name;
    public DBPDataSource getDataSource()
    public String getTypeName()

    public boolean isSearchable()
    @Override
    private final OWNER owner;
import org.jkiss.dbeaver.model.struct.DBSDataType;
    private String remarks;
    @NotNull

    }
        return JDBCUtils.resolveDataKind(getDataSource(), name, valueType);
    public DBSDataType getComponentType(@NotNull DBRProgressMonitor monitor) throws DBException {
    @Override

    @NotNull
    protected void setTypeID(int valueType) {
    @Override

    }
    {
/*
    public boolean isUnsigned()
    }


    }
        return remarks;
import org.jkiss.dbeaver.DBException;
    private int minScale;
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
    {
    public boolean isPersisted()

 * Licensed under the Apache License, Version 2.0 (the "License");

        return isSearchable;
    {
        int valueType,
 * Copyright (C) 2010-2025 DBeaver Corp and others
    {
 * JDBCDataType
 * Unless required by applicable law or agreed to in writing, software
        return DBUtils.getDefaultOperators(attribute);
        this.name = name;
        @Nullable String remarks,
        return owner;
import org.jkiss.dbeaver.model.DBUtils;
    public Object geTypeExtension() {
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        return isUnsigned;
        String name,

    }
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {

        return minScale;
    public JDBCDataType(OWNER owner, DBSTypedObject typed) {
 * limitations under the License.
 * You may obtain a copy of the License at

    public int getTypeID()
 */
