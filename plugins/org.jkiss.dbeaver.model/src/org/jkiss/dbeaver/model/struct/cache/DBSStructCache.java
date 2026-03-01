        throws DBException;
 * Structure objects cache
 */
public interface DBSStructCache<OWNER extends DBSObject, OBJECT extends DBSObject, CHILD extends DBSObject>
    Collection<CHILD> getChildren(@Nullable DBRProgressMonitor monitor, @NotNull OWNER owner, OBJECT forObject)
}
 * DBeaver - Universal Database Manager
        throws DBException;

import org.jkiss.dbeaver.model.struct.DBSObject;
/*


    extends DBSObjectCache<OWNER, OBJECT> {
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.model.struct.cache;
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.DBException;
 */
    void clearChildrenCache(OBJECT forParent);
    @Nullable
import java.util.Collection;
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    DBSObjectCache<OBJECT, CHILD> getChildrenCache(@NotNull OBJECT forObject);
 * Licensed under the Apache License, Version 2.0 (the "License");

import org.jkiss.code.Nullable;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
    @Nullable
 * See the License for the specific language governing permissions and

/**

    CHILD getChild(@NotNull DBRProgressMonitor monitor, @NotNull OWNER owner, OBJECT forObject, @NotNull String objectName)
 * Unless required by applicable law or agreed to in writing, software

 * You may obtain a copy of the License at
 *

 * distributed under the License is distributed on an "AS IS" BASIS,
 *
 * you may not use this file except in compliance with the License.
