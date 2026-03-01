    public DBDValueHandler getValueHandler(DBPDataSource dataSource, DBDFormatSettings preferences, DBSTypedObject typedObject)
 */
public class PhoenixValueHandlerProvider implements DBDValueHandlerProvider {
 */
import org.jkiss.dbeaver.model.data.DBDValueHandlerProvider;

 * PhoenixValueHandlerProvider
import org.jkiss.dbeaver.model.DBPDataSource;
/*
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
 *
            return null;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
import java.sql.Types;
    @Override
            return PhoenixArrayValueHandler.INSTANCE;
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
    @Nullable
    }
        } else {
import org.jkiss.code.Nullable;
    {
 * you may not use this file except in compliance with the License.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");

}import org.jkiss.dbeaver.model.data.DBDFormatSettings;
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (typeID == Types.ARRAY) {
 * You may obtain a copy of the License at

import org.jkiss.dbeaver.model.data.DBDValueHandler;
package org.jkiss.dbeaver.ext.phoenix.model.data;
/**
        int typeID = typedObject.getTypeID();
