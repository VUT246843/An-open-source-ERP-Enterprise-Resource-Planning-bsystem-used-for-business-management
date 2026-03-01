 *
 *
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
        Types.DOUBLE,
        Types.REAL,
        Types.NUMERIC,
import org.jkiss.dbeaver.model.struct.DBSTypedObject;

import java.sql.Types;
public class DB2ValueHandlerProvider implements DBDValueHandlerProvider {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.DBPDataKind;
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
        Types.FLOAT,
    public DBDValueHandler getValueHandler(DBPDataSource dataSource, DBDFormatSettings preferences, DBSTypedObject typedObject)
        } else if (typeName.contains("TIMESTAMP") || typedObject.getDataKind() == DBPDataKind.DATETIME) {
import org.jkiss.dbeaver.model.data.DBDFormatSettings;
 * @author Denis Forveille
import org.jkiss.dbeaver.model.DBPDataSource;
        Types.DECIMAL,
import org.jkiss.dbeaver.model.data.DBDValueHandler;
/*
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
}        final String typeName = typedObject.getTypeName();
 * Unless required by applicable law or agreed to in writing, software

    {
import org.jkiss.dbeaver.ext.db2.DB2Constants;
 * DBeaver - Universal Database Manager
    }

        if (DB2Constants.TYPE_NAME_DECFLOAT.equals(typeName)) {
        return null;
 *
    @Override
 */
 * See the License for the specific language governing permissions and
 */
 * you may not use this file except in compliance with the License.

            return new DB2TimestampValueHandler(preferences);
 * 
package org.jkiss.dbeaver.ext.db2.data;
        }
import org.jkiss.dbeaver.model.data.DBDValueHandlerProvider;
/**
import org.jkiss.utils.ArrayUtils;
 * DB2 Data Types provider
            //return new DB2NumericValueHandler(typedObject, preferences.getDataFormatterProfile());
    private static final int[] NUMERIC_TYPES = {
        } else if (ArrayUtils.contains(NUMERIC_TYPES, typedObject.getTypeID())) {
 * distributed under the License is distributed on an "AS IS" BASIS,
            return new DB2DecFloatValueHandler(typedObject, preferences);
    };
