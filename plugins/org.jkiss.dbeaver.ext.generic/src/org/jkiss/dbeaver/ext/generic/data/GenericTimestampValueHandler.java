        this.dataSource = dataSource;
 * you may not use this file except in compliance with the License.
            case Types.TIME:
 * Unless required by applicable law or agreed to in writing, software
                break;
    @Nullable
        if (nativeFormat != null) {

 *     http://www.apache.org/licenses/LICENSE-2.0
            case Types.TIME_WITH_TIMEZONE:
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2024 DBeaver Corp and others
public class GenericTimestampValueHandler extends JDBCDateTimeValueHandler {
import org.jkiss.code.Nullable;
                break;
    public Format getNativeValueFormat(DBSTypedObject type) {
 * You may obtain a copy of the License at
        return super.getNativeValueFormat(type);

 * DBeaver - Universal Database Manager
            case Types.DATE:

                nativeFormat = dataSource.getNativeFormatTime();
            case Types.TIMESTAMP:
            return nativeFormat;
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
import java.sql.Types;
/**
                nativeFormat = dataSource.getNativeFormatDate();
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
}
        }
 */

 * Object type support
import java.text.Format;

    private final GenericDataSource dataSource;

 *
 *
    @Override
            case Types.TIMESTAMP_WITH_TIMEZONE:
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
 *
                nativeFormat = dataSource.getNativeFormatTimestamp();
        switch (type.getTypeID()) {
 */
import org.jkiss.dbeaver.model.data.DBDFormatSettings;
    {
        super(formatSettings);
/*

        }
        Format nativeFormat = null;
package org.jkiss.dbeaver.ext.generic.data;

    public GenericTimestampValueHandler(GenericDataSource dataSource, DBDFormatSettings formatSettings)
                break;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCDateTimeValueHandler;
