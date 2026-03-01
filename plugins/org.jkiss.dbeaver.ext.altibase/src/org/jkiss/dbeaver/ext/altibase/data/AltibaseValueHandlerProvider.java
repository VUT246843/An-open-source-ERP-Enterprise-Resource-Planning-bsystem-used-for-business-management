 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.ext.altibase.data;
 * you may not use this file except in compliance with the License.
 */
            default:
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
                return AltibaseBitSetValueHandler.INSTANCE;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ext.altibase.model.AltibaseDataTypeDomain;

    @Nullable
import org.jkiss.dbeaver.model.data.DBDValueHandler;
            case BIT:
 * You may obtain a copy of the License at
        AltibaseDataTypeDomain dataTypeDomain = AltibaseDataTypeDomain.getByTypeName(typeName);
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
                return AltibaseGeometryValueHandler.INSTANCE;
public class AltibaseValueHandlerProvider implements DBDValueHandlerProvider {
 * See the License for the specific language governing permissions and
 *
    public DBDValueHandler getValueHandler(DBPDataSource dataSource, DBDFormatSettings preferences,
 * DBeaver - Universal Database Manager
 * limitations under the License.

import org.jkiss.dbeaver.model.data.DBDFormatSettings;
                return new AltibaseDateValueHandler(preferences);
 * Unless required by applicable law or agreed to in writing, software
                return AltibaseNibbleValueHandler.INSTANCE;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.data.DBDValueHandlerProvider;
        switch (dataTypeDomain) {
                ;
            case DATE:
        return null;

            case GEOMETRY:
        
                // Do nothing
import org.jkiss.dbeaver.model.DBPDataSource;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.Nullable;
        }
/*
            DBSTypedObject typedObject) {

            case VARBIT:
    }
    @Override
        String typeName = typedObject.getTypeName();
            case NIBBLE:
 *
}
