    @Override
}
package org.jkiss.dbeaver.ext.db2.data;
import java.text.Format;
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
/*

 *

 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.Nullable;
    public DB2TimestampValueHandler(DBDFormatSettings formatSettings)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return super.getNativeValueFormat(type);
        }
 * Unless required by applicable law or agreed to in writing, software
import java.text.SimpleDateFormat;

 *
        super(formatSettings);
    {
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCDateTimeValueHandler;
                return DEFAULT_DATETIME_FORMAT;
public class DB2TimestampValueHandler extends JDBCDateTimeValueHandler {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
import java.sql.Types;
 * limitations under the License.
 * See the License for the specific language governing permissions and

    public Format getNativeValueFormat(DBSTypedObject type) {
            case Types.TIMESTAMP:
 * you may not use this file except in compliance with the License.
    @Nullable

    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
    }

import org.jkiss.utils.time.ExtendedDateFormat;
 * Object type support
 *
    private final SimpleDateFormat DEFAULT_DATETIME_FORMAT = new ExtendedDateFormat("''yyyy-MM-dd HH:mm:ss.ffffff''");
 * Copyright (C) 2010-2024 DBeaver Corp and others
/**
 */
        switch (type.getTypeID()) {
 */
import org.jkiss.dbeaver.model.data.DBDFormatSettings;

