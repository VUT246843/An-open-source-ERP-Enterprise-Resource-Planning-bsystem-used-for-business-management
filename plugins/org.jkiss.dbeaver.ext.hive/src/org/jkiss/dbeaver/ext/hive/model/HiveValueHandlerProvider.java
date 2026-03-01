import org.jkiss.dbeaver.model.data.DBDValueHandler;
 *
import org.jkiss.dbeaver.model.data.DBDValueHandlerProvider;
    @Nullable
 * Copyright (C) 2010-2026 DBeaver Corp and others
    public DBDValueHandler getValueHandler(DBPDataSource dataSource, DBDFormatSettings preferences, DBSTypedObject typedObject) {
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.DBPDataSource;
 * limitations under the License.
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
 * Licensed under the Apache License, Version 2.0 (the "License");
public class HiveValueHandlerProvider implements DBDValueHandlerProvider {
import org.jkiss.dbeaver.ext.hive.model.handlers.HiveBinaryDataValueHandler;
package org.jkiss.dbeaver.ext.hive.model;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.DBPDataKind;
 * distributed under the License is distributed on an "AS IS" BASIS,
            : null;
/*
}

import org.jkiss.dbeaver.model.data.DBDFormatSettings;
 *
 * you may not use this file except in compliance with the License.
    @Override
    }
 * DBeaver - Universal Database Manager
        return typedObject.getDataKind() == DBPDataKind.BINARY
 *


 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
import org.jkiss.code.Nullable;
            ? new HiveBinaryDataValueHandler()
