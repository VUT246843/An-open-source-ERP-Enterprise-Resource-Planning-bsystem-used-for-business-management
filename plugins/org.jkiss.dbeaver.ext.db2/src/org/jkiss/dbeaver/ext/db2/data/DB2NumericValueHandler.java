}
 * See the License for the specific language governing permissions and

 * you may not use this file except in compliance with the License.
 * limitations under the License.
    DB2NumericValueHandler(DBSTypedObject type, DBDFormatSettings formatSettings) {
 * DBeaver - Universal Database Manager
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
        super(type, formatSettings);
 * DECFLOAT type support
    protected boolean isReadDecimalsAsDouble() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
package org.jkiss.dbeaver.ext.db2.data;
 * distributed under the License is distributed on an "AS IS" BASIS,
        return true;
public class DB2NumericValueHandler extends JDBCNumberValueHandler {
 */

 *     http://www.apache.org/licenses/LICENSE-2.0
/*
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.data.DBDFormatSettings;

/**
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCNumberValueHandler;
 */

    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
    }
 *
 *
