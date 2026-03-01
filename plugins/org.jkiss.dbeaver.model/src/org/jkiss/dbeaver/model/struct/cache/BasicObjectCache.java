 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.DBException;
/*
    }
    public OBJECT getObject(@NotNull DBRProgressMonitor monitor, @NotNull OWNER owner, @NotNull String name) throws DBException {
 *
    @Override
    @Nullable
 */
import org.jkiss.dbeaver.model.struct.DBSObject;

 *
public abstract class BasicObjectCache<OWNER extends DBSObject, OBJECT extends DBSObject> extends AbstractObjectCache<OWNER, OBJECT> {
import org.jkiss.code.Nullable;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.model.struct.cache;

 * limitations under the License.
 *
 */
        return getCachedObject(name);
 * Basic objects cache.

 * Licensed under the Apache License, Version 2.0 (the "License");
        if (!isFullyCached() && !monitor.isForceCacheUsage()) {
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * you may not use this file except in compliance with the License.
}
/**
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            getAllObjects(monitor, owner);
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.code.NotNull;
