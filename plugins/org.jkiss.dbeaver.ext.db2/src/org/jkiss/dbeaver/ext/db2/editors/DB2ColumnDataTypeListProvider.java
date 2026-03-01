/*
import java.util.ArrayList;
    @Override

 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.List;
    {
 *
    @Override
    }
 *
 * You may obtain a copy of the License at
 * 
 * @author Denis Forveille
import org.jkiss.dbeaver.model.meta.IPropertyValueListProvider;
            dataTypes.add(column.getDataType());

}import org.jkiss.dbeaver.ext.db2.model.DB2TableColumn;
 *
import org.jkiss.dbeaver.model.struct.DBSDataType;
    }
        List<DBSDataType> dataTypes = new ArrayList<DBSDataType>(column.getTable().getDataSource().getLocalDataTypes());
package org.jkiss.dbeaver.ext.db2.editors;

        }
    public Object[] getPossibleValues(DB2TableColumn column)

 * See the License for the specific language governing permissions and
 */
 * Copyright (C) 2010-2025 DBeaver Corp and others

 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
        return dataTypes.toArray(new DBSDataType[0]);
import org.jkiss.code.Nullable;
 * 
    {
 * you may not use this file except in compliance with the License.
public class DB2ColumnDataTypeListProvider implements IPropertyValueListProvider<DB2TableColumn> {
 * Provides a list of DB2 Table Column for DB2 Table editors
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (!dataTypes.contains(column.getDataType())) {
/**
 *     http://www.apache.org/licenses/LICENSE-2.0
        return false;
    public boolean allowCustomValue()
    @Nullable
