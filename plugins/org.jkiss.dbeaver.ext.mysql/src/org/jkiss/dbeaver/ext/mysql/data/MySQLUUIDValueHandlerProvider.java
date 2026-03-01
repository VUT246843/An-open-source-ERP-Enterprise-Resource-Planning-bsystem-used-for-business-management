    public String getValueDisplayString(@NotNull DBSTypedObject column, Object value, @NotNull DBDDisplayFormat format) {
 *
    @Override
import org.jkiss.code.NotNull;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
 *
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCUUIDValueHandler;
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
}
public class MySQLUUIDValueHandlerProvider extends JDBCUUIDValueHandler {
    @NotNull

        return DBValueFormatting.getDefaultValueDisplayString(value, format);
 *
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
/*
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    static final MySQLUUIDValueHandlerProvider INSTANCE = new MySQLUUIDValueHandlerProvider();
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ext.mysql.data;

import org.jkiss.dbeaver.model.DBValueFormatting;
 * Copyright (C) 2010-2024 DBeaver Corp and others

import org.jkiss.dbeaver.model.data.DBDDisplayFormat;

 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
