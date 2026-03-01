        switch (typedObject.getTypeName()) {
            default:
import org.jkiss.dbeaver.model.DBPDataSource;
 *
public class HANAValueHandlerProvider implements DBDValueHandlerProvider {
import org.jkiss.dbeaver.model.data.DBDValueHandler;
    }
            case HANAConstants.DATA_TYPE_NAME_REAL_VECTOR:
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
            case HANAConstants.DATA_TYPE_NAME_ST_GEOMETRY:
import org.jkiss.code.Nullable;
 * Copyright (C) 2010-2024 DBeaver Corp and others
            case HANAConstants.DATA_TYPE_NAME_HALF_VECTOR:
    public DBDValueHandler getValueHandler(DBPDataSource dataSource, DBDFormatSettings preferences,
package org.jkiss.dbeaver.ext.hana.model.data;
 */

    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            case HANAConstants.DATA_TYPE_NAME_ST_POINT:
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.data.DBDValueHandlerProvider;

 * you may not use this file except in compliance with the License.
 * limitations under the License.
                return HANARealVectorValueHandler.INSTANCE;
                return HANAHalfVectorValueHandler.INSTANCE;
 * See the License for the specific language governing permissions and

}
 *
 *
import org.jkiss.dbeaver.ext.hana.model.HANAConstants;
            DBSTypedObject typedObject) {
                return null;
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
                return HANAGeometryValueHandler.INSTANCE;
 * Unless required by applicable law or agreed to in writing, software
/*
import org.jkiss.dbeaver.model.data.DBDFormatSettings;
    @Nullable
 *    Stefan Uhrig - initial implementation
 * You may obtain a copy of the License at
 *
 * Contributors:

 *     http://www.apache.org/licenses/LICENSE-2.0
