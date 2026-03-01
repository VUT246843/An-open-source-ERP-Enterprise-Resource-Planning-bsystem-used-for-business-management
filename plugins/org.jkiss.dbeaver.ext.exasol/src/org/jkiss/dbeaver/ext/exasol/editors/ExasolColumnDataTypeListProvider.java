        return false;
public class ExasolColumnDataTypeListProvider implements IPropertyValueListProvider<ExasolTableColumn> {
 */
import org.jkiss.code.Nullable;

            dataTypes.add(column.getDataType());

    public boolean allowCustomValue() {
package org.jkiss.dbeaver.ext.exasol.editors;
 * See the License for the specific language governing permissions and
 *
import org.jkiss.dbeaver.model.meta.IPropertyValueListProvider;
    public Object[] getPossibleValues(ExasolTableColumn column) {
 * You may obtain a copy of the License at
/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Provides a list of Exasol Table Column for Exasol Table editors
    @Override
} * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
import org.jkiss.dbeaver.model.struct.DBSDataType;
 * you may not use this file except in compliance with the License.
import java.util.List;
 * limitations under the License.
 */
        List<DBSDataType> dataTypes = new ArrayList<DBSDataType>(column.getTable().getDataSource().getLocalDataTypes());
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
    @Override
 *
        if (!dataTypes.contains(column.getDataType())) {
import org.jkiss.dbeaver.ext.exasol.model.ExasolTableColumn;
    @Nullable
        return dataTypes.toArray(new DBSDataType[0]);

    }

        }
import java.util.ArrayList;
 * @author Karl Griesser
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
 *

