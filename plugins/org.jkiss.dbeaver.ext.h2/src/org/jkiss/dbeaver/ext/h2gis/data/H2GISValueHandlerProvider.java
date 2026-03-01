import org.jkiss.dbeaver.model.data.DBDFormatSettings;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.data.DBDValueHandlerProvider;
            return H2GISGeometryValueHandler.INSTANCE;

import org.jkiss.dbeaver.model.DBPDataSource;
package org.jkiss.dbeaver.ext.h2gis.data;

}    {
 * Unless required by applicable law or agreed to in writing, software
        }
    }
 *     http://www.apache.org/licenses/LICENSE-2.0

    @Nullable
    @Override
 * limitations under the License.
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
 */

 * Copyright (C) 2010-2025 DBeaver Corp and others
        } else {
 * See the License for the specific language governing permissions and
    public DBDValueHandler getValueHandler(DBPDataSource dataSource, DBDFormatSettings preferences, DBSTypedObject typedObject)
 * you may not use this file except in compliance with the License.
/**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
import org.jkiss.dbeaver.model.data.DBDValueHandler;
            return null;
 */
 * DBeaver - Universal Database Manager
import org.jkiss.code.Nullable;
 * H2GIS data types provider
        if (typedObject.getTypeName().toUpperCase().startsWith("GEOMETRY")) {
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
 *
public class H2GISValueHandlerProvider implements DBDValueHandlerProvider {
 *
