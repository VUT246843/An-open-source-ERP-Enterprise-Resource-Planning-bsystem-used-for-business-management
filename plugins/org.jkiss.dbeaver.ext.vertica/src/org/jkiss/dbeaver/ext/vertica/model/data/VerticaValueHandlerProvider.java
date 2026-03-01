import java.util.Locale;

 *
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.data.DBDValueHandlerProvider;
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
 * distributed under the License is distributed on an "AS IS" BASIS,
        return null;
package org.jkiss.dbeaver.ext.vertica.model.data;
import org.jkiss.dbeaver.model.data.DBDFormatSettings;
    public DBDValueHandler getValueHandler(DBPDataSource dataSource, DBDFormatSettings preferences, DBSTypedObject type) {
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 * Unless required by applicable law or agreed to in writing, software
        String lowerTypeName = type.getTypeName().toLowerCase(Locale.ENGLISH);
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
 * You may obtain a copy of the License at
        if ("uuid".equals(lowerTypeName)) {
 * DBeaver - Universal Database Manager
            return JDBCUUIDValueHandler.INSTANCE;
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCUUIDValueHandler;
 * you may not use this file except in compliance with the License.
 * limitations under the License.
    @Override
        }
 */
}
public class VerticaValueHandlerProvider implements DBDValueHandlerProvider {

import org.jkiss.dbeaver.model.data.DBDValueHandler;
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others

import org.jkiss.dbeaver.model.DBPDataSource;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
