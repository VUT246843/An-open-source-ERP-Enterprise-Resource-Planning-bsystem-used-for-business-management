
    @Override
    }
 * AbstractAttribute
    @Override

    }

        return getTypeName();
{
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.NotNull;
        return 0;
        return DBUtils.getDefaultOperators(this);
        return true;
    public long getMaxLength() {
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
        return null;
    public int getMinScale() {
    }

 */
 *
public abstract class AbstractDataType<DS extends DBPDataSource> implements DBSDataType
 * You may obtain a copy of the License at
    }
    public AbstractDataType(DS dataSource) {
    }
    public Integer getPrecision() {
    @NotNull
    }
 *
    @Override
package org.jkiss.dbeaver.model.impl.struct;
    }
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
    public DS getDataSource() {
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.dataSource = dataSource;
}

    public DBCLogicalOperator[] getSupportedOperators(@NotNull DBSTypedObject attribute) {
import org.jkiss.code.Nullable;
 */
    @Override
    }
 * limitations under the License.
    public String getDescription() {

    public String getFullTypeName() {
        return dataSource;
 * DBeaver - Universal Database Manager
    }
import org.jkiss.dbeaver.model.struct.DBSObject;
 * you may not use this file except in compliance with the License.
        return DBUtils.getFullTypeName(this);
    @Nullable
    @Nullable

    @Nullable
        return 0;
    @Override
    public String toString() {
    @Nullable
    @NotNull



import org.jkiss.dbeaver.model.DBPDataSource;
    public DBSDataType getComponentType(@NotNull DBRProgressMonitor monitor) throws DBException {
/*

 *
    private final DS dataSource;
        return 0;
    @Override
    }
        return getTypeName();

    }
/**

    @Nullable
    public long getTypeModifiers() {
    public String getName() {
        return dataSource.getContainer();
        return null;
import org.jkiss.dbeaver.model.DBUtils;

    public DBSObject getParentObject() {
    @Override
        return 0;
    @Override
    }

 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.struct.DBSDataType;
    @Override
 * Unless required by applicable law or agreed to in writing, software
    public Integer getScale() {
    public Object geTypeExtension() {
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.exec.DBCLogicalOperator;
    public int getMaxScale() {
 *     http://www.apache.org/licenses/LICENSE-2.0


    }
    @Override
    @Override
    @NotNull

    @Override
    public boolean isPersisted() {

    @Override
        return 0;
        return 0;
    @Override
    @NotNull
        return null;
    }
    }
    }
