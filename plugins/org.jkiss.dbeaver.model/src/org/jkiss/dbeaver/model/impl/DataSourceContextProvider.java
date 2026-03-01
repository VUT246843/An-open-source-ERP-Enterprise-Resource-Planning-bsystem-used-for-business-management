
    @Override
{
    private final DBSObject object;
    }
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
        this.object = object;
 *
    private static final Log log = Log.getLog(DataSourceContextProvider.class);
            return DBUtils.getOrOpenDefaultContext(object, false);
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.exec.DBCException;

import org.jkiss.code.Nullable;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
import org.jkiss.dbeaver.model.DBUtils;
        } catch (DBCException e) {

/*
 */
public class DataSourceContextProvider implements DBPContextProvider
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
    public DBCExecutionContext getExecutionContext() {
    public DataSourceContextProvider(DBSObject object) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Nullable
 * limitations under the License.
            return null;
}
 * you may not use this file except in compliance with the License.


import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
package org.jkiss.dbeaver.model.impl;
 * DataSourceContextProvider
import org.jkiss.dbeaver.Log;
        try {
 *
/**
            log.error("Error obtaining context", e);
    }
        }
import org.jkiss.dbeaver.model.struct.DBSObject;
 */
import org.jkiss.dbeaver.model.DBPContextProvider;
