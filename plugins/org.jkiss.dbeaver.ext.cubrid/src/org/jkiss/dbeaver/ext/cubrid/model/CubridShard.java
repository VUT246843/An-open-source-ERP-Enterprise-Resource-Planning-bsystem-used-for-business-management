import org.jkiss.dbeaver.model.struct.DBSObject;
        this.dataSource = dataSource;
    }
import org.jkiss.dbeaver.ext.cubrid.CubridConstants;
    }
    public String getType() {
        return getValue();
import org.jkiss.code.Nullable;
 * Unless required by applicable law or agreed to in writing, software
}
    }


    @Override
 *
    
 */

        public Object[] getPossibleValues(CubridShard object) {
    public void setValue(String value) {
        return null;

 * distributed under the License is distributed on an "AS IS" BASIS,

    public String getValue() {
    public String getName() {
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
    public static class ShardTypeProvider implements IPropertyValueListProvider<CubridShard> {
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
    @Property(viewable = true, updatable = true, order = 2)
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.shardVal = shardVal;
    public String getDescription() {

        return dataSource;
    public String getObjectToolTip() {

        @Override
        return dataSource;
    }
        public boolean allowCustomValue() {
    }
    public DBSObject getParentObject() {
    @Override
    @Property(viewable = true, updatable = true, listProvider = ShardTypeProvider.class, order = 1)
import org.jkiss.dbeaver.model.meta.Property;
        @Nullable
    private String shardVal;
    }
    }
        }
        return getType();
    @Override
    @Override
        this.shardType = shardType;
 *
    public boolean isPersisted() {
    @Override
    }
import org.jkiss.dbeaver.model.meta.IPropertyValueListProvider;
    @Override
import org.jkiss.dbeaver.model.DBPToolTipObject;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    public CubridDataSource getDataSource() {
    public void setType(String type) {
/*
 * limitations under the License.
    @NotNull
{
            return CubridConstants.SHARD_TYPE;
    private CubridDataSource dataSource;
    private String shardType;
    public CubridShard(CubridDataSource dataSource, String shardType, String shardVal) {

        this.shardVal = value;

 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.ext.cubrid.model;
    	return shardType;
        return shardVal;

import org.jkiss.code.NotNull;
 * DBeaver - Universal Database Manager
public class CubridShard implements DBSObject, DBPToolTipObject
 * See the License for the specific language governing permissions and
    }


        @Override

        return true;
            return true;

        this.shardType = type;
    }
        }
 *
