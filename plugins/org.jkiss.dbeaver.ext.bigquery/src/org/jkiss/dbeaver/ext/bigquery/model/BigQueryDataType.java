 * Copyright (C) 2010-2024 DBeaver Corp and others
/*
public class BigQueryDataType extends GenericDataType {
import org.jkiss.code.NotNull;
 * Unless required by applicable law or agreed to in writing, software
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
        if (getDataSource().getContainer().getPreferenceStore().getBoolean(ModelPreferences.RESULT_TRANSFORM_COMPLEX_TYPES)) {
    public DBPDataKind getDataKind() {
 *
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    }
 * Licensed under the Apache License, Version 2.0 (the "License");
                return DBPDataKind.ARRAY;
import org.jkiss.dbeaver.ext.generic.model.GenericDataType;
 * DBeaver - Universal Database Manager
    public BigQueryDataType(GenericStructContainer owner, int valueType, String name, String remarks, boolean unsigned, boolean searchable, int precision, int minScale, int maxScale) {
 * limitations under the License.
    @NotNull
 *
        super(owner, valueType, name, remarks, unsigned, searchable, precision, minScale, maxScale);
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
            } else if (getName().equals(BigQueryConstants.DATA_TYPE_GEOGRAPHY)) {
    @Override
            } else if (getName().equals(BigQueryConstants.DATA_TYPE_ARRAY)) {
}
import org.jkiss.dbeaver.model.DBPDataKind;
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
        return super.getDataKind();

 * See the License for the specific language governing permissions and
                return DBPDataKind.STRUCT;
                return DBPDataKind.OBJECT;
package org.jkiss.dbeaver.ext.bigquery.model;
import org.jkiss.dbeaver.ModelPreferences;
 *     http://www.apache.org/licenses/LICENSE-2.0
            if (getName().equals(BigQueryConstants.DATA_TYPE_STRUCT)) {

 */

 *
