/**
 *
    @Override
    }


 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.data.DBDValueHandlerProvider;
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
/*
 *
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
            return new GenericTimestampValueHandler((GenericDataSource) dataSource, preferences);
 * limitations under the License.
import org.jkiss.dbeaver.model.data.DBDFormatSettings;
import org.jkiss.dbeaver.model.DBPDataSource;
    public DBDValueHandler getValueHandler(DBPDataSource dataSource, DBDFormatSettings preferences, DBSTypedObject typedObject)

 * See the License for the specific language governing permissions and
            return null;
import org.jkiss.dbeaver.model.DBPDataKind;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
 * Oracle data types provider

 */
    {
public class GenericValueHandlerProvider implements DBDValueHandlerProvider {
import org.jkiss.dbeaver.model.data.DBDValueHandler;
        }
        } else {
}        if (typedObject.getDataKind() == DBPDataKind.DATETIME) {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.ext.generic.data;
