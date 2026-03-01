import org.jkiss.code.NotNull;
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.model.struct.cache;
    }
        return getCachedObjects();

    public List<OBJECT> getAllObjects(@NotNull DBRProgressMonitor monitor, @Nullable OWNER owner) {
 * Simple objects cache.
 * you may not use this file except in compliance with the License.
    public OBJECT getObject(@NotNull DBRProgressMonitor monitor, @NotNull OWNER owner, @NotNull String name) {
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 *
        return getCachedObject(name);

    }
 */
 */
import org.jkiss.dbeaver.model.struct.DBSObject;
 *
}
    @Nullable
/**
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Doesn't provide any reading facilities, just stores objects
 * You may obtain a copy of the License at
    @NotNull
 * Unless required by applicable law or agreed to in writing, software

/*
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.List;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.code.Nullable;
public class SimpleObjectCache<OWNER extends DBSObject, OBJECT extends DBSObject> extends AbstractObjectCache<OWNER, OBJECT> {
    @Override

 * DBeaver - Universal Database Manager
