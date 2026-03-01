
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.impl.data.DefaultValueHandler;
 * WMI data types provider
        return DefaultValueHandler.INSTANCE;
    public DBDValueHandler getValueHandler(DBPDataSource dataSource, DBDFormatSettings preferences, DBSTypedObject typedObject)
 *
package org.jkiss.dbeaver.ext.wmi.model;
 *
/*
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
 * See the License for the specific language governing permissions and
} *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
import org.jkiss.dbeaver.model.DBPDataSource;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
    @Override

 */
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.data.DBDValueHandlerProvider;
    {
import org.jkiss.dbeaver.model.data.DBDFormatSettings;
import org.jkiss.dbeaver.model.data.DBDValueHandler;


/**
public class WMIValueHandlerProvider implements DBDValueHandlerProvider {
