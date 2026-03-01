    }
import java.util.Map;
 */
 * Unless required by applicable law or agreed to in writing, software
    @Nullable
 *     http://www.apache.org/licenses/LICENSE-2.0
public class IoTDBUserManager extends AbstractObjectManager<IoTDBRelationalUser>
 * Licensed under the Apache License, Version 2.0 (the "License");

        return false;
        return null;
import org.jkiss.dbeaver.model.impl.edit.AbstractObjectManager;
                             Map<String, Object> options) throws DBException {
import org.jkiss.dbeaver.model.edit.DBECommandContext;
        return FEATURE_EDITOR_ON_CREATE;
    public long getMakerOptions(DBPDataSource dataSource) {
    @Override

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public boolean canCreateObject(Object container) {
    @Override
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
    }
package org.jkiss.dbeaver.ext.iotdb.ui.config;
                                               DBECommandContext commandContext,

    @Override
 * You may obtain a copy of the License at
}
 *
                                               Map<String, Object> options) throws DBException {


import org.jkiss.dbeaver.ext.iotdb.model.IoTDBDataSource;
    }
 * See the License for the specific language governing permissions and
    public boolean canDeleteObject(IoTDBRelationalUser object) {
    public DBSObjectCache<? extends DBSObject, IoTDBRelationalUser> getObjectsCache(IoTDBRelationalUser object) {
                                               Object container, Object copyFrom,
import org.jkiss.dbeaver.ext.iotdb.model.IoTDBRelationalUser;
        // no-op
        implements DBEObjectMaker<IoTDBRelationalUser, IoTDBDataSource> {
                             IoTDBRelationalUser object,
import org.jkiss.dbeaver.model.DBPDataSource;


 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.edit.DBEObjectMaker;
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.code.Nullable;
    @Override
    public void deleteObject(DBECommandContext commandContext,
 * DBeaver - Universal Database Manager
 * limitations under the License.

    }
/*
    }
 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return null;
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    public IoTDBRelationalUser createNewObject(DBRProgressMonitor monitor,

        return false;

 *
import org.jkiss.dbeaver.DBException;
    @Override
    }
