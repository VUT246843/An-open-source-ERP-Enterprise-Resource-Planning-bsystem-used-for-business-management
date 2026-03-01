 * You may obtain a copy of the License at
        return super.getNativeValueFormat(type);
import java.sql.Types;
    
    public Format getNativeValueFormat(DBSTypedObject type) {
 * See the License for the specific language governing permissions and
    public AltibaseDateValueHandler(DBDFormatSettings formatSettings) {
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCDateTimeValueHandler;
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");

 * distributed under the License is distributed on an "AS IS" BASIS,

        if (type.getTypeID() == Types.TIMESTAMP) {
import java.text.Format;
            return defaultDateTimeFormat;
import java.text.SimpleDateFormat;
 *
 *
import org.jkiss.utils.time.ExtendedDateFormat;
/*
        super(formatSettings);
}
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2024 DBeaver Corp and others
public class AltibaseDateValueHandler extends JDBCDateTimeValueHandler {
        }
import org.jkiss.dbeaver.model.data.DBDFormatSettings;



        
    }
 */
package org.jkiss.dbeaver.ext.altibase.data;
    
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
    private final SimpleDateFormat defaultDateTimeFormat = new ExtendedDateFormat("''yyyy-MM-dd HH:mm:ss.ffffff''");
    @Nullable
 *
    }
 * Unless required by applicable law or agreed to in writing, software
    @Override
